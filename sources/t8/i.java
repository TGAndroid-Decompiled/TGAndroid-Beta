package t8;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.t;
import com.google.firebase.messaging.s;
import id.z0;
import java.util.concurrent.Executor;
import z8.q;

public final class i implements z8.d, t {

    public static final i f48127b = new i(0);

    public static final i f48128c = new i(1);
    public static final i d = new i(2);

    public static final i f48129e = new i(3);

    public final int f48130a;

    public i(int i10) {
        this.f48130a = i10;
    }

    @Override
    public Exception a(Status status) {
        int i10 = status.f3186a;
        int i11 = status.f3186a;
        String strA = status.f3187b;
        if (i10 == 8) {
            if (strA == null) {
                strA = i8.j.a(i11);
            }
            return new s(strA);
        }
        if (strA == null) {
            strA = i8.j.a(i11);
        }
        return new c(strA);
    }

    @Override
    public Object u0(af.h hVar) {
        switch (this.f48130a) {
            case 0:
                Object objB = hVar.b(new q(v8.a.class, Executor.class));
                kotlin.jvm.internal.j.d(objB, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) objB);
            case 1:
                Object objB2 = hVar.b(new q(v8.c.class, Executor.class));
                kotlin.jvm.internal.j.d(objB2, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) objB2);
            case 2:
                Object objB3 = hVar.b(new q(v8.b.class, Executor.class));
                kotlin.jvm.internal.j.d(objB3, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) objB3);
            default:
                Object objB4 = hVar.b(new q(v8.d.class, Executor.class));
                kotlin.jvm.internal.j.d(objB4, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new z0((Executor) objB4);
        }
    }
}
