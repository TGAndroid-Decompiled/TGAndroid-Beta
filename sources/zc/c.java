package zc;

import com.google.android.gms.internal.vision.e2;
import ed.h;
import java.util.regex.Pattern;
import kf.p;
public final class c extends h {
    public static final Pattern f61819e = Pattern.compile("(\\${2})([\\s\\S]+?)\\1");

    @Override
    public final p b() {
        String a10 = a(f61819e);
        if (a10 == null) {
            return null;
        }
        ?? pVar = new p();
        pVar.f61820g = e2.k(a10, 2, 2);
        return pVar;
    }

    @Override
    public final char d() {
        return '$';
    }
}
