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
    public static final a f47508b = new a(0);
    public static final a f47509c = new a(1);
    public static final a d = new a(2);
    public static final a e = new a(3);
    public final int f47510a;

    public a(int i10) {
        this.f47510a = i10;
    }

    @Override
    public final Object j2(z5 z5Var) {
        switch (this.f47510a) {
            case 0:
                Object e7 = z5Var.e(new r(n9.a.class, Executor.class));
                i.d(e7, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) e7);
            case 1:
                Object e10 = z5Var.e(new r(c.class, Executor.class));
                i.d(e10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) e10);
            case 2:
                Object e11 = z5Var.e(new r(b.class, Executor.class));
                i.d(e11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) e11);
            default:
                Object e12 = z5Var.e(new r(n9.d.class, Executor.class));
                i.d(e12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) e12);
        }
    }
}
