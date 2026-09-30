package z7;

import java.util.Arrays;
public final class ve {
    public final Boolean f49033a;
    public final Boolean f49034b;
    public final Boolean f49035c;
    public final Boolean d;
    public final Boolean e;

    public ve(cf.c cVar) {
        this.f49033a = (Boolean) cVar.f4259a;
        this.f49034b = (Boolean) cVar.f4260b;
        this.f49035c = (Boolean) cVar.f4261c;
        this.d = (Boolean) cVar.d;
        this.e = (Boolean) cVar.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ve)) {
            return false;
        }
        ve veVar = (ve) obj;
        if (n6.l.l(this.f49033a, veVar.f49033a) && n6.l.l(this.f49034b, veVar.f49034b) && n6.l.l(this.f49035c, veVar.f49035c) && n6.l.l(this.d, veVar.d) && n6.l.l(this.e, veVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f49033a, this.f49034b, this.f49035c, this.d, this.e});
    }
}
