package w3;

import e2.x;
public final class a {
    public final int f50715a;
    public int f50716b;
    public int f50717c;
    public long d;
    public final boolean e;
    public final x f50718f;
    public final x f50719g;
    public int h;
    public int f50720i;

    public a(x xVar, x xVar2, boolean z10) {
        this.f50719g = xVar;
        this.f50718f = xVar2;
        this.e = z10;
        xVar2.N(12);
        this.f50715a = xVar2.E();
        xVar.N(12);
        this.f50720i = xVar.E();
        c3.b.b("first_chunk must be 1", xVar.m() == 1);
        this.f50716b = -1;
    }

    public final boolean a() {
        long C;
        int i10;
        int i11 = this.f50716b + 1;
        this.f50716b = i11;
        if (i11 == this.f50715a) {
            return false;
        }
        boolean z10 = this.e;
        x xVar = this.f50718f;
        if (z10) {
            C = xVar.G();
        } else {
            C = xVar.C();
        }
        this.d = C;
        if (this.f50716b == this.h) {
            x xVar2 = this.f50719g;
            this.f50717c = xVar2.E();
            xVar2.O(4);
            int i12 = this.f50720i - 1;
            this.f50720i = i12;
            if (i12 > 0) {
                i10 = xVar2.E() - 1;
            } else {
                i10 = -1;
            }
            this.h = i10;
        }
        return true;
    }
}
