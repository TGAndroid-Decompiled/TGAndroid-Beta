package w3;

import f5.w;
import i7.h0;
public final class c {
    public final int f49635a;
    public int f49636b;
    public int f49637c;
    public long d;
    public final boolean f49638e;
    public final w f49639f;
    public final w f49640g;
    public int h;
    public int f49641i;

    public c(w wVar, w wVar2, boolean z10) {
        this.f49640g = wVar;
        this.f49639f = wVar2;
        this.f49638e = z10;
        wVar2.C(12);
        this.f49635a = wVar2.u();
        wVar.C(12);
        this.f49641i = wVar.u();
        h0.a("first_chunk must be 1", wVar.e() == 1);
        this.f49636b = -1;
    }

    public final boolean a() {
        long s10;
        int i10;
        int i11 = this.f49636b + 1;
        this.f49636b = i11;
        if (i11 == this.f49635a) {
            return false;
        }
        boolean z10 = this.f49638e;
        w wVar = this.f49639f;
        if (z10) {
            s10 = wVar.v();
        } else {
            s10 = wVar.s();
        }
        this.d = s10;
        if (this.f49636b == this.h) {
            w wVar2 = this.f49640g;
            this.f49637c = wVar2.u();
            wVar2.D(4);
            int i12 = this.f49641i - 1;
            this.f49641i = i12;
            if (i12 > 0) {
                i10 = wVar2.u() - 1;
            } else {
                i10 = -1;
            }
            this.h = i10;
        }
        return true;
    }
}
