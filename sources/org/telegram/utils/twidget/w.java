package org.telegram.utils.twidget;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class w extends LinkedHashMap {
    public final int f55019a;

    public w(float f10, int i7, int i10, boolean z10) {
        super(i7, f10, z10);
        this.f55019a = i10;
    }

    public static Matcher b(String str, Pattern pattern, w wVar) {
        Matcher matcher = (Matcher) wVar.get(pattern);
        if (matcher == null) {
            Matcher matcher2 = pattern.matcher(str);
            wVar.put(pattern, matcher2);
            return matcher2;
        }
        matcher.reset(str);
        return matcher;
    }

    @Override
    public final boolean removeEldestEntry(Map.Entry entry) {
        switch (this.f55019a) {
            case 0:
                if (size() > 8192) {
                    return true;
                }
                return false;
            case 1:
                if (size() > 4) {
                    return true;
                }
                return false;
            default:
                if (size() > 32) {
                    return true;
                }
                return false;
        }
    }
}
