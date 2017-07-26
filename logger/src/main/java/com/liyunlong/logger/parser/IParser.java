package com.liyunlong.logger.parser;

import com.liyunlong.logger.utils.Constants;

import java.util.Locale;

/**
 * 解析器接口
 *
 * @author liyunlong
 * @date 2017/7/21 16:59
 */
public interface IParser<T> {

    String LINE_SEPARATOR = Constants.LINE_SEPARATOR;
    Locale LOCALE = Locale.getDefault();

    Class<T> parseClassType();

    String parseString(T t);
}
