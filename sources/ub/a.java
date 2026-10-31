package ub;

import jb.g;
public final class a implements r9.d {
    public static final a f50198b = new a(0);
    public static final a f50199c = new a(1);
    public final int f50200a;

    public a(int i10) {
        this.f50200a = i10;
    }

    @Override
    public final Object K(bh.d dVar) {
        switch (this.f50200a) {
            case 0:
                return new c((g) dVar.b(g.class));
            default:
                return new b((c) dVar.b(c.class), (jb.d) dVar.b(jb.d.class));
        }
    }
}
