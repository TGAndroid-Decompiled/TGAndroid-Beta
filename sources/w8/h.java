package w8;

import c9.u;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.t;
import java.util.concurrent.Executor;
import l8.j;
import ld.y0;
public final class h implements c9.f, t {
    public static final h f46567b = new h(0);
    public static final h f46568c = new h(1);
    public static final h d = new h(2);
    public static final h e = new h(3);
    public final int f46569a;

    public h(int i10) {
        this.f46569a = i10;
    }

    @Override
    public Exception a(Status status) {
        int i10 = status.f2701a;
        int i11 = status.f2701a;
        String str = status.f2702b;
        if (i10 == 8) {
            if (str == null) {
                str = j.a(i11);
            }
            return new b7.a(str);
        }
        if (str == null) {
            str = j.a(i11);
        }
        return new b7.a(str);
    }

    @Override
    public Object d0(c5.j jVar) {
        switch (this.f46569a) {
            case 0:
                Object f10 = jVar.f(new u(y8.a.class, Executor.class));
                kotlin.jvm.internal.j.d(f10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) f10);
            case 1:
                Object f11 = jVar.f(new u(y8.c.class, Executor.class));
                kotlin.jvm.internal.j.d(f11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) f11);
            case 2:
                Object f12 = jVar.f(new u(y8.b.class, Executor.class));
                kotlin.jvm.internal.j.d(f12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) f12);
            default:
                Object f13 = jVar.f(new u(y8.d.class, Executor.class));
                kotlin.jvm.internal.j.d(f13, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) f13);
        }
    }
}
