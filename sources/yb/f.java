package yb;

import a8.r7;
import pb.g;
public final class f implements u9.d {
    public static final f f59229b = new f(0);
    public static final f f59230c = new f(1);
    public static final f d = new f(2);
    public final int f59231a;

    public f(int i7) {
        this.f59231a = i7;
    }

    @Override
    public final Object e(r7 r7Var) {
        switch (this.f59231a) {
            case 0:
                return new d((g) r7Var.a(g.class));
            case 1:
                return new c((d) r7Var.a(d.class), (pb.d) r7Var.a(pb.d.class));
            default:
                return new vb.b(r7Var.c(c.class));
        }
    }
}
