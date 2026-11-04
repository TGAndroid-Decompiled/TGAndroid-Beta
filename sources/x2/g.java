package x2;

import b8.kg;
import w2.c1;
import w2.d1;
public final class g implements d1 {
    public final i f58155a;
    public final c1 f58156b;
    public final int f58157c;
    public boolean d;
    public final i f58158e;

    public g(i iVar, i iVar2, c1 c1Var, int i3) {
        this.f58158e = iVar;
        this.f58155a = iVar2;
        this.f58156b = c1Var;
        this.f58157c = i3;
    }

    public final void b() {
        if (!this.d) {
            i iVar = this.f58158e;
            kg kgVar = iVar.h;
            int[] iArr = iVar.f58160b;
            int i3 = this.f58157c;
            kgVar.k(iArr[i3], iVar.f58161c[i3], 0, null, iVar.K);
            this.d = true;
        }
    }

    @Override
    public final boolean f() {
        i iVar = this.f58158e;
        if (!iVar.x() && this.f58156b.A(iVar.Q)) {
            return true;
        }
        return false;
    }

    @Override
    public final int m(long j10) {
        i iVar = this.f58158e;
        if (iVar.x()) {
            return 0;
        }
        boolean z10 = iVar.Q;
        c1 c1Var = this.f58156b;
        int x10 = c1Var.x(j10, z10);
        a aVar = iVar.M;
        if (aVar != null) {
            x10 = Math.min(x10, aVar.d(this.f58157c + 1) - c1Var.v());
        }
        c1Var.L(x10);
        if (x10 > 0) {
            b();
        }
        return x10;
    }

    @Override
    public final int o(tf.b bVar, j2.h hVar, int i3) {
        i iVar = this.f58158e;
        if (!iVar.x()) {
            a aVar = iVar.M;
            c1 c1Var = this.f58156b;
            if (aVar != null && aVar.d(this.f58157c + 1) <= c1Var.v()) {
                return -3;
            }
            b();
            return c1Var.F(bVar, hVar, i3, iVar.Q);
        }
        return -3;
    }

    @Override
    public final void a() {
    }
}
