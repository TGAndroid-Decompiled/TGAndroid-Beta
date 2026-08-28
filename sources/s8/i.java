package s8;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.t;
import com.google.firebase.messaging.s;
import hd.z0;
import java.util.concurrent.Executor;
import y8.r;
public final class i implements y8.d, t {
    public static final i f47478b = new i(0);
    public static final i f47479c = new i(1);
    public static final i d = new i(2);
    public static final i f47480e = new i(3);
    public final int f47481a;

    public i(int i9) {
        this.f47481a = i9;
    }

    @Override
    public Object H1(b3.b bVar) {
        switch (this.f47481a) {
            case 0:
                Object c10 = bVar.c(new r(u8.a.class, Executor.class));
                kotlin.jvm.internal.i.d(c10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) c10);
            case 1:
                Object c11 = bVar.c(new r(u8.c.class, Executor.class));
                kotlin.jvm.internal.i.d(c11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) c11);
            case 2:
                Object c12 = bVar.c(new r(u8.b.class, Executor.class));
                kotlin.jvm.internal.i.d(c12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) c12);
            default:
                Object c13 = bVar.c(new r(u8.d.class, Executor.class));
                kotlin.jvm.internal.i.d(c13, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) c13);
        }
    }

    @Override
    public Exception a(Status status) {
        int i9 = status.f2741a;
        int i10 = status.f2741a;
        String str = status.f2742b;
        if (i9 == 8) {
            if (str == null) {
                str = h8.j.a(i10);
            }
            return new s(str);
        }
        if (str == null) {
            str = h8.j.a(i10);
        }
        return new s(str);
    }
}
