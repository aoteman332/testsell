package com.xmcc.sell.utils;

import com.xmcc.sell.vopo.ResultVo;

public class ResultVoUtil {
    public static ResultVo success(Object o){
        ResultVo resultVo = new ResultVo();
        resultVo.setCode(0);
        resultVo.setMsg("success");
        resultVo.setData(o);
        return resultVo;
    }
}
