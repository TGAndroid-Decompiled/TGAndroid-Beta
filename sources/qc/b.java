package qc;

import java.util.regex.Pattern;
import ne.p;
import ne.s;
public final class b extends h {
    public static final Pattern f44762e = i.f44775m;

    @Override
    public final p b() {
        this.d++;
        if (c() == '\n') {
            ne.g gVar = new ne.g(1);
            this.d++;
            return gVar;
        }
        if (this.d < this.f44771c.length()) {
            String str = this.f44771c;
            int i10 = this.d;
            if (f44762e.matcher(str.substring(i10, i10 + 1)).matches()) {
                String str2 = this.f44771c;
                int i11 = this.d;
                this.f44769a.getClass();
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
