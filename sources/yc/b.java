package yc;

import java.util.regex.Pattern;
import ve.r;
public final class b extends h {
    public static final Pattern e = i.f54380m;

    @Override
    public final df.c b() {
        this.d++;
        if (c() == '\n') {
            ve.g gVar = new ve.g(1);
            this.d++;
            return gVar;
        }
        if (this.d < this.f54376c.length()) {
            String str = this.f54376c;
            int i10 = this.d;
            if (e.matcher(str.substring(i10, i10 + 1)).matches()) {
                String str2 = this.f54376c;
                int i11 = this.d;
                this.f54374a.getClass();
                r rVar = new r(str2.substring(i11, i11 + 1));
                this.d++;
                return rVar;
            }
        }
        return f("\\");
    }

    @Override
    public final char d() {
        return '\\';
    }
}
