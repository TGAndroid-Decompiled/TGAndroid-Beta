package wa;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.i;
import n9.b;
import n9.c;
import r9.d;
import r9.r;
import td.y0;
public final class a implements d {
    public static final a f52787b = new a(0);
    public static final a f52788c = new a(1);
    public static final a d = new a(2);
    public static final a e = new a(3);
    public final int f52789a;

    public a(int i10) {
        this.f52789a = i10;
    }

    @Override
    public final Object K(bh.d dVar) {
        switch (this.f52789a) {
            case 0:
                Object d10 = dVar.d(new r(n9.a.class, Executor.class));
                i.d(d10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) d10);
            case 1:
                Object d11 = dVar.d(new r(c.class, Executor.class));
                i.d(d11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) d11);
            case 2:
                Object d12 = dVar.d(new r(b.class, Executor.class));
                i.d(d12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) d12);
            default:
                Object d13 = dVar.d(new r(n9.d.class, Executor.class));
                i.d(d13, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) d13);
        }
    }
}
