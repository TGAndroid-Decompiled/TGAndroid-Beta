package va;

import cf.c;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.i;
import m9.b;
import q9.d;
import q9.r;
import zd.y0;
public final class a implements d {
    public static final a f44605b = new a(0);
    public static final a f44606c = new a(1);
    public static final a d = new a(2);
    public static final a e = new a(3);
    public final int f44607a;

    public a(int i10) {
        this.f44607a = i10;
    }

    @Override
    public final Object G(c cVar) {
        switch (this.f44607a) {
            case 0:
                Object h = cVar.h(new r(m9.a.class, Executor.class));
                i.d(h, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) h);
            case 1:
                Object h10 = cVar.h(new r(m9.c.class, Executor.class));
                i.d(h10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) h10);
            case 2:
                Object h11 = cVar.h(new r(b.class, Executor.class));
                i.d(h11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) h11);
            default:
                Object h12 = cVar.h(new r(m9.d.class, Executor.class));
                i.d(h12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) h12);
        }
    }
}
