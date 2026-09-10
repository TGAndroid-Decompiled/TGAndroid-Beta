package zc;

import bf.p;
import com.google.android.gms.internal.vision.e2;
import ed.h;
import java.util.regex.Pattern;
public final class c extends h {
    public static final Pattern e = Pattern.compile("(\\${2})([\\s\\S]+?)\\1");

    @Override
    public final p b() {
        String a2 = a(e);
        if (a2 == null) {
            return null;
        }
        ?? pVar = new p();
        pVar.f47983g = e2.h(2, 2, a2);
        return pVar;
    }

    @Override
    public final char d() {
        return '$';
    }
}
