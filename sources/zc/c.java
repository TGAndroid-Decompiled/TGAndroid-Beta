package zc;

import com.google.android.gms.internal.vision.e2;
import ed.h;
import java.util.regex.Pattern;
import kf.p;
public final class c extends h {
    public static final Pattern f61938e = Pattern.compile("(\\${2})([\\s\\S]+?)\\1");

    @Override
    public final p b() {
        String a10 = a(f61938e);
        if (a10 == null) {
            return null;
        }
        ?? pVar = new p();
        pVar.f61939g = e2.k(a10, 2, 2);
        return pVar;
    }

    @Override
    public final char d() {
        return '$';
    }
}
