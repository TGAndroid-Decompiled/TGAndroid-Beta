package u8;

import a5.j;
import a9.v;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.t;
import com.google.firebase.messaging.r;
import java.util.concurrent.Executor;
import jd.y0;
public final class h implements a9.e, t {
    public static final h f49139b = new h(0);
    public static final h f49140c = new h(1);
    public static final h d = new h(2);
    public static final h f49141e = new h(3);
    public final int f49142a;

    public h(int i10) {
        this.f49142a = i10;
    }

    @Override
    public Object I0(j jVar) {
        switch (this.f49142a) {
            case 0:
                Object d10 = jVar.d(new v(w8.a.class, Executor.class));
                kotlin.jvm.internal.j.d(d10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) d10);
            case 1:
                Object d11 = jVar.d(new v(w8.c.class, Executor.class));
                kotlin.jvm.internal.j.d(d11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) d11);
            case 2:
                Object d12 = jVar.d(new v(w8.b.class, Executor.class));
                kotlin.jvm.internal.j.d(d12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) d12);
            default:
                Object d13 = jVar.d(new v(w8.d.class, Executor.class));
                kotlin.jvm.internal.j.d(d13, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new y0((Executor) d13);
        }
    }

    @Override
    public Exception a(Status status) {
        int i10 = status.f3755a;
        int i11 = status.f3755a;
        String str = status.f3756b;
        if (i10 == 8) {
            if (str == null) {
                str = j8.j.a(i11);
            }
            return new r(str);
        }
        if (str == null) {
            str = j8.j.a(i11);
        }
        return new r(str);
    }
}
