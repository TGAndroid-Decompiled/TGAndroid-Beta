package va;

import bi.u6;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.i;
import m9.b;
import m9.c;
import q9.d;
import q9.r;
import zd.y0;
public final class a implements d {
    public static final a f43297b = new a(0);
    public static final a f43298c = new a(1);
    public static final a d = new a(2);
    public static final a e = new a(3);
    public final int f43299a;

    public a(int i10) {
        this.f43299a = i10;
    }

    @Override
    public final Object P1(u6 u6Var) {
        switch (this.f43299a) {
            case 0:
                Object h = u6Var.h(new r(m9.a.class, Executor.class));
                i.d(h, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) h);
            case 1:
                Object h10 = u6Var.h(new r(c.class, Executor.class));
                i.d(h10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) h10);
            case 2:
                Object h11 = u6Var.h(new r(b.class, Executor.class));
                i.d(h11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) h11);
            default:
                Object h12 = u6Var.h(new r(m9.d.class, Executor.class));
                i.d(h12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) h12);
        }
    }
}
