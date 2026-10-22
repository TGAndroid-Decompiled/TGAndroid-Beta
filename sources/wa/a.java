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
    public static final a f48903b = new a(0);
    public static final a f48904c = new a(1);
    public static final a d = new a(2);
    public static final a e = new a(3);
    public final int f48905a;

    public a(int i10) {
        this.f48905a = i10;
    }

    @Override
    public final Object j2(z5 z5Var) {
        switch (this.f48905a) {
            case 0:
                Object c10 = z5Var.c(new r(n9.a.class, Executor.class));
                i.d(c10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) c10);
            case 1:
                Object c11 = z5Var.c(new r(c.class, Executor.class));
                i.d(c11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) c11);
            case 2:
                Object c12 = z5Var.c(new r(b.class, Executor.class));
                i.d(c12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) c12);
            default:
                Object c13 = z5Var.c(new r(n9.d.class, Executor.class));
                i.d(c13, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) c13);
        }
    }
}
