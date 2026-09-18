package w3;

import e2.v;
public final class a {
    public final int f44733a;
    public int f44734b;
    public int f44735c;
    public long d;
    public final boolean e;
    public final v f44736f;
    public final v f44737g;
    public int h;
    public int f44738i;

    public a(v vVar, v vVar2, boolean z10) {
        this.f44737g = vVar;
        this.f44736f = vVar2;
        this.e = z10;
        vVar2.J(12);
        this.f44733a = vVar2.B();
        vVar.J(12);
        this.f44738i = vVar.B();
        c3.b.c("first_chunk must be 1", vVar.j() == 1);
        this.f44734b = -1;
    }

    public final boolean a() {
        long z10;
        int i10;
        int i11 = this.f44734b + 1;
        this.f44734b = i11;
        if (i11 == this.f44733a) {
            return false;
        }
        boolean z11 = this.e;
        v vVar = this.f44736f;
        if (z11) {
            z10 = vVar.C();
        } else {
            z10 = vVar.z();
        }
        this.d = z10;
        if (this.f44734b == this.h) {
            v vVar2 = this.f44737g;
            this.f44735c = vVar2.B();
            vVar2.K(4);
            int i12 = this.f44738i - 1;
            this.f44738i = i12;
            if (i12 > 0) {
                i10 = vVar2.B() - 1;
            } else {
                i10 = -1;
            }
            this.h = i10;
        }
        return true;
    }
}
