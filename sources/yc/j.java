package yc;

import c3.i0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ve.r;
public final class j extends h {
    public static final Pattern e = Pattern.compile(" *$");

    @Override
    public final df.c b() {
        int i10;
        this.d++;
        df.c cVar = (df.c) this.f54375b.d;
        if (cVar instanceof r) {
            r rVar = (r) cVar;
            if (rVar.f50811g.endsWith(" ")) {
                String str = rVar.f50811g;
                Matcher matcher = e.matcher(str);
                if (matcher.find()) {
                    i10 = matcher.end() - matcher.start();
                } else {
                    i10 = 0;
                }
                if (i10 > 0) {
                    rVar.f50811g = i0.m(i10, 0, str);
                }
                if (i10 >= 2) {
                    return new ve.g(1);
                }
                return new ve.g(2);
            }
        }
        return new ve.g(2);
    }

    @Override
    public final char d() {
        return '\n';
    }
}
