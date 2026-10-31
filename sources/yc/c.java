package yc;

import c3.i0;
import java.util.regex.Pattern;
import w7.e8;
public final class c extends h {
    public static final Pattern e = Pattern.compile("`+");
    public static final Pattern f54373f = Pattern.compile("^`+");

    @Override
    public final df.c b() {
        String a2;
        String a10 = a(f54373f);
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
        ve.d dVar = new ve.d(0);
        String replace = this.f54376c.substring(i10, this.d - a10.length()).replace('\n', ' ');
        if (replace.length() >= 3 && replace.charAt(0) == ' ' && replace.charAt(replace.length() - 1) == ' ') {
            int length = replace.length();
            if (e8.b(' ', replace, 0, length) != length) {
                replace = i0.m(1, 1, replace);
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
