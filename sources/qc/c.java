package qc;

import java.util.regex.Pattern;
import k7.u;
import ne.p;
public final class c extends h {
    public static final Pattern e = Pattern.compile("`+");
    public static final Pattern f43025f = Pattern.compile("^`+");

    @Override
    public final p b() {
        String a2;
        String a10 = a(f43025f);
        if (a10 == null) {
            return null;
        }
        int i10 = this.d;
        do {
            a2 = a(e);
            if (a2 == null) {
                this.d = i10;
                return f(a10);
            }
        } while (!a2.equals(a10));
        ne.d dVar = new ne.d(0);
        String replace = this.f43028c.substring(i10, this.d - a10.length()).replace('\n', ' ');
        if (replace.length() >= 3 && replace.charAt(0) == ' ' && replace.charAt(replace.length() - 1) == ' ') {
            int length = replace.length();
            if (u.b(' ', replace, 0, length) != length) {
                replace = e2.c.j(replace, 1, 1);
            }
        }
        dVar.h = replace;
        return dVar;
    }

    @Override
    public final char d() {
        return '`';
    }
}
