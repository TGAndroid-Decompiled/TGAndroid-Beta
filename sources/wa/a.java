package wa;

import be.z0;
import com.google.android.gms.internal.cast.z5;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.i;
import n9.b;
import n9.c;
import r9.d;
import r9.r;
public final class a implements d {
    public static final a f48941b = new a(0);
    public static final a f48942c = new a(1);
    public static final a d = new a(2);
    public static final a e = new a(3);
    public final int f48943a;

    public a(int i10) {
        this.f48943a = i10;
    }

    @Override
    public final Object j2(z5 z5Var) {
        switch (this.f48943a) {
            case 0:
                Object f7 = z5Var.f(new r(n9.a.class, Executor.class));
                i.d(f7, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) f7);
            case 1:
                Object f10 = z5Var.f(new r(c.class, Executor.class));
                i.d(f10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) f10);
            case 2:
                Object f11 = z5Var.f(new r(b.class, Executor.class));
                i.d(f11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) f11);
            default:
                Object f12 = z5Var.f(new r(n9.d.class, Executor.class));
                i.d(f12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) f12);
        }
    }
}
