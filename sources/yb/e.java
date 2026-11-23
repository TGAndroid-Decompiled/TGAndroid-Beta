package yb;

import a8.r7;
import pb.g;
public final class e implements u9.d {
    public static final e f61258b = new e(0);
    public static final e f61259c = new e(1);
    public static final e d = new e(2);
    public final int f61260a;

    public e(int i7) {
        this.f61260a = i7;
    }

    @Override
    public final Object c(r7 r7Var) {
        switch (this.f61260a) {
            case 0:
                return new c((g) r7Var.a(g.class));
            case 1:
                return new b((c) r7Var.a(c.class), (pb.d) r7Var.a(pb.d.class));
            default:
                return new vb.b(r7Var.c(b.class));
        }
    }
}
