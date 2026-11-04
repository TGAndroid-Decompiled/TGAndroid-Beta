package y3;

import g2.y;
public final class a {
    public final int f58902a;
    public int f58903b;
    public int f58904c;
    public long d;
    public final boolean f58905e;
    public final y f58906f;
    public final y f58907g;
    public int h;
    public int f58908i;

    public a(y yVar, y yVar2, boolean z10) {
        this.f58907g = yVar;
        this.f58906f = yVar2;
        this.f58905e = z10;
        yVar2.N(12);
        this.f58902a = yVar2.E();
        yVar.N(12);
        this.f58908i = yVar.E();
        e3.b.b("first_chunk must be 1", yVar.m() == 1);
        this.f58903b = -1;
    }

    public final boolean a() {
        long C;
        int i3;
        int i10 = this.f58903b + 1;
        this.f58903b = i10;
        if (i10 == this.f58902a) {
            return false;
        }
        boolean z10 = this.f58905e;
        y yVar = this.f58906f;
        if (z10) {
            C = yVar.G();
        } else {
            C = yVar.C();
        }
        this.d = C;
        if (this.f58903b == this.h) {
            y yVar2 = this.f58907g;
            this.f58904c = yVar2.E();
            yVar2.O(4);
            int i11 = this.f58908i - 1;
            this.f58908i = i11;
            if (i11 > 0) {
                i3 = yVar2.E() - 1;
            } else {
                i3 = -1;
            }
            this.h = i3;
        }
        return true;
    }
}
