package va;

import cf.c;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.i;
import m9.b;
import q9.d;
import q9.s;
import zd.y0;
public final class a implements d {
    public static final a f44597b = new a(0);
    public static final a f44598c = new a(1);
    public static final a d = new a(2);
    public static final a e = new a(3);
    public final int f44599a;

    public a(int i10) {
        this.f44599a = i10;
    }

    @Override
    public final Object G(c cVar) {
        switch (this.f44599a) {
            case 0:
                Object m10 = cVar.m(new s(m9.a.class, Executor.class));
                i.d(m10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) m10);
            case 1:
                Object m11 = cVar.m(new s(m9.c.class, Executor.class));
                i.d(m11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) m11);
            case 2:
                Object m12 = cVar.m(new s(b.class, Executor.class));
                i.d(m12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) m12);
            default:
                Object m13 = cVar.m(new s(m9.d.class, Executor.class));
                i.d(m13, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) m13);
        }
    }
}
