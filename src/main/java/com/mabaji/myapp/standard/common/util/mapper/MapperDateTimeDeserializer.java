package com.mabaji.myapp.standard.common.util.mapper;

import com.mabaji.myapp.standard.common.util.MyDateUtils;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import org.joda.time.DateTime;

import java.lang.reflect.Type;

public class MapperDateTimeDeserializer implements JsonDeserializer<DateTime> {
    @Override
    public DateTime deserialize(final JsonElement json, final Type typeOfT, final JsonDeserializationContext context) {
        return MyDateUtils.getDateTime(json.getAsLong());
    }
}
