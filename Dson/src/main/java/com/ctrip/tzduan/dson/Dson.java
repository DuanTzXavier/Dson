package com.ctrip.tzduan.dson;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by tzduan on 17/1/5.
 */

public class Dson {
    static JSONStringer stringer = new JSONStringer();

    public static String toJson(Object obj){
        try {
            stringer.object();

            if (obj == null)
                return null;
            Field[] fields = obj.getClass().getDeclaredFields();
            for (int j = 0; j < fields.length - 1; j++) {
                fields[j].setAccessible(true);
                if (!(fields[j].get(obj) == null || fields[j].get(obj) == "")){
                    if (fields[j].get(obj) instanceof List){
                        fromList(fields[j].get(obj));
                    }else if (fields[j].get(obj) instanceof List){
                        stringer.key(fields[j].getName()).value(fields[j].get(obj));
                    }else {

                    }
                }
            }
            stringer.endObject();
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return stringer.toString();
    }

    private static void fromObject(Object obj){


    }

    private static void fromList(Object obj){

    }

    private static String sortJSONObject(JSONObject object){



        return null;
    }

}
