package va;

import cf.c;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.i;
import m9.b;
import q9.d;
import q9.r;
import zd.y0;
public final class a implements d {
    public static final a f48252b = new a(0);
    public static final a f48253c = new a(1);
    public static final a d = new a(2);
    public static final a f48254e = new a(3);
    public final int f48255a;

    public a(int i10) {
        this.f48255a = i10;
    }

    @Override
    public final Object E(c cVar) {
        switch (this.f48255a) {
            case 0:
                Object g10 = cVar.g(new r(m9.a.class, Executor.class));
                i.d(g10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) g10);
            case 1:
                Object g11 = cVar.g(new r(m9.c.class, Executor.class));
                i.d(g11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) g11);
            case 2:
                Object g12 = cVar.g(new r(b.class, Executor.class));
                i.d(g12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) g12);
            default:
                Object g13 = cVar.g(new r(m9.d.class, Executor.class));
                i.d(g13, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) g13);
        }
    }
}
