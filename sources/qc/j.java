package qc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ne.p;
import ne.s;
public final class j extends h {
    public static final Pattern f44815e = Pattern.compile(" *$");

    @Override
    public final p b() {
        int i10;
        this.d++;
        p pVar = (p) this.f44801b.d;
        if (pVar instanceof s) {
            s sVar = (s) pVar;
            if (sVar.f15981g.endsWith(" ")) {
                String str = sVar.f15981g;
                Matcher matcher = f44815e.matcher(str);
                if (matcher.find()) {
                    i10 = matcher.end() - matcher.start();
                } else {
                    i10 = 0;
                }
                if (i10 > 0) {
                    sVar.f15981g = e2.c.j(str, i10, 0);
                }
                if (i10 >= 2) {
                    return new ne.g(1);
                }
                return new ne.g(2);
            }
        }
        return new ne.g(2);
    }

    @Override
    public final char d() {
        return '\n';
    }
}
