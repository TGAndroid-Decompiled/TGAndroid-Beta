package ub;

import jb.g;
public final class a implements r9.d {
    public static final a f50212b = new a(0);
    public static final a f50213c = new a(1);
    public final int f50214a;

    public a(int i10) {
        this.f50214a = i10;
    }

    @Override
    public final Object K(bh.d dVar) {
        switch (this.f50214a) {
            case 0:
                return new c((g) dVar.b(g.class));
            default:
                return new b((c) dVar.b(c.class), (jb.d) dVar.b(jb.d.class));
        }
    }
}
