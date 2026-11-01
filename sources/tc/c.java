package tc;

import c3.i0;
import java.util.regex.Pattern;
import yc.h;
public final class c extends h {
    public static final Pattern e = Pattern.compile("(\\${2})([\\s\\S]+?)\\1");

    @Override
    public final df.c b() {
        String a2 = a(e);
        if (a2 == null) {
            return null;
        }
        ?? cVar = new df.c();
        cVar.f48607g = i0.m(2, 2, a2);
        return cVar;
    }

    @Override
    public final char d() {
        return '$';
    }
}
