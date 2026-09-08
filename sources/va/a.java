package va;

import cf.c;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.i;
import m9.b;
import q9.d;
import q9.r;
import zd.y0;
public final class a implements d {
    public static final a f47792b = new a(0);
    public static final a f47793c = new a(1);
    public static final a d = new a(2);
    public static final a f47794e = new a(3);
    public final int f47795a;

    public a(int i10) {
        this.f47795a = i10;
    }

    @Override
    public final Object D(c cVar) {
        switch (this.f47795a) {
            case 0:
                Object i10 = cVar.i(new r(m9.a.class, Executor.class));
                i.d(i10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) i10);
            case 1:
                Object i11 = cVar.i(new r(m9.c.class, Executor.class));
                i.d(i11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) i11);
            case 2:
                Object i12 = cVar.i(new r(b.class, Executor.class));
                i.d(i12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) i12);
            default:
                Object i13 = cVar.i(new r(m9.d.class, Executor.class));
                i.d(i13, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) i13);
        }
    }
}
