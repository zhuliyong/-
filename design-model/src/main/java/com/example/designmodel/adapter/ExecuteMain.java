package com.example.designmodel.adapter;

import java.util.ArrayList;
import java.util.List;

public class ExecuteMain {

    private List<DC5Adapter> list = new ArrayList<>();

    public ExecuteMain (){
        list.add(new ChinaAdapter());
        list.add(new JapanAdapter());
    }

    private DC5Adapter getRigth(Ac ac)  {
        DC5Adapter ada = null;
        try{
            for(DC5Adapter dc : list){
                if(dc.support(ac)){
                    ada = dc;
                    break;
                }
            }
            if(ada == null){
                throw new Exception("无法使用该电压");
            }
        }catch (Exception e){
          e.printStackTrace();
        }finally {
            return ada;
        }

    }



    public static void main(String[] arg){
        ExecuteMain exe = new ExecuteMain();
        Ac china = new JapanAc();
        DC5Adapter dc  = exe.getRigth(china);
        dc.outputDC5V(china);
    }

}
