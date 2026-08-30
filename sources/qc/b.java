package qc;

import java.util.regex.Pattern;
import ne.p;
import ne.s;
public final class b extends h {
    public static final Pattern e = i.f43002m;

    @Override
    public final p b() {
        this.d++;
        if (c() == '\n') {
            ne.g gVar = new ne.g(1);
            this.d++;
            return gVar;
        }
        if (this.d < this.f42998c.length()) {
            String str = this.f42998c;
            int i10 = this.d;
            if (e.matcher(str.substring(i10, i10 + 1)).matches()) {
                String str2 = this.f42998c;
                int i11 = this.d;
                this.f42996a.getClass();
                s sVar = new s(str2.substring(i11, i11 + 1));
                this.d++;
                return sVar;
            }
        }
        return f("\\");
    }

    @Override
    public final char d() {
        return '\\';
    }
}
