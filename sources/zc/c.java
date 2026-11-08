package zc;

import ed.h;
import java.util.regex.Pattern;
import kf.p;
public final class c extends h {
    public static final Pattern f60036e = Pattern.compile("(\\${2})([\\s\\S]+?)\\1");

    @Override
    public final p b() {
        String a10 = a(f60036e);
        if (a10 == null) {
            return null;
        }
        ?? pVar = new p();
        pVar.f60037g = com.google.android.recaptcha.internal.a.k(a10, 2, 2);
        return pVar;
    }

    @Override
    public final char d() {
        return '$';
    }
}
