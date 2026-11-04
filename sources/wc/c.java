package wc;

import bd.h;
import gf.p;
import java.util.regex.Pattern;
public final class c extends h {
    public static final Pattern f57455e = Pattern.compile("(\\${2})([\\s\\S]+?)\\1");

    @Override
    public final p b() {
        String a10 = a(f57455e);
        if (a10 == null) {
            return null;
        }
        ?? pVar = new p();
        pVar.f57456g = com.google.android.recaptcha.internal.a.j(a10, 2, 2);
        return pVar;
    }

    @Override
    public final char d() {
        return '$';
    }
}
