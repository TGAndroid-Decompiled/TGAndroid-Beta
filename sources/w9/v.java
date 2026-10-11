package w9;

import android.util.Log;
import ci.u5;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.io.File;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.GenericProvider;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.hh1;
import xh.h4;
import yh.s3;
public final class v implements Continuation, d9.e, q9.d, z1, GenericProvider, e2.h, Vector.TLDeserializer {
    public final int f50387a;

    public v(int i10) {
        this.f50387a = i10;
    }

    @Override
    public void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    @Override
    public java.lang.Object apply(java.lang.Object r26) {
        throw new UnsupportedOperationException("Method not decompiled: w9.v.apply(java.lang.Object):java.lang.Object");
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        return TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, i10, z10);
    }

    @Override
    public void f(a2 a2Var, int i10) {
        switch (this.f50387a) {
            case 3:
                a2Var.dismiss();
                return;
            case 4:
                a2Var.dismiss();
                return;
            case 8:
                s3.e2(new hh1(6, null));
                return;
            default:
                int i11 = s3.f53245r1;
                return;
        }
    }

    @Override
    public Object provide(Object obj) {
        Integer num = (Integer) obj;
        int i10 = h4.f51354k0;
        return 0;
    }

    @Override
    public Object then(Task task) {
        boolean z10;
        File file;
        if (task.isSuccessful()) {
            b bVar = (b) task.getResult();
            t9.b bVar2 = t9.b.f48335a;
            bVar2.b("Crashlytics report successfully enqueued to DataTransport: " + bVar.f50306b);
            z10 = true;
            if (bVar.f50307c.delete()) {
                bVar2.b("Deleted report file: " + file.getPath());
            } else {
                bVar2.d("Crashlytics could not delete report file: " + file.getPath(), null);
            }
        } else {
            Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", task.getException());
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    @Override
    public Object y0(u5 u5Var) {
        switch (this.f50387a) {
            case 2:
                Set y3 = u5Var.y(xa.a.class);
                xa.c cVar = xa.c.f51192c;
                if (cVar == null) {
                    synchronized (xa.c.class) {
                        try {
                            cVar = xa.c.f51192c;
                            if (cVar == null) {
                                cVar = new xa.c(0);
                                xa.c.f51192c = cVar;
                            }
                        } finally {
                        }
                    }
                }
                return new xa.b(y3, cVar);
            case 19:
                return FirebaseSessionsRegistrar.e(u5Var);
            case 20:
                return FirebaseSessionsRegistrar.f(u5Var);
            case 21:
                return FirebaseSessionsRegistrar.a(u5Var);
            case 22:
                return FirebaseSessionsRegistrar.b(u5Var);
            case 23:
                return FirebaseSessionsRegistrar.d(u5Var);
            default:
                return FirebaseSessionsRegistrar.c(u5Var);
        }
    }

    public v(Object obj, int i10) {
        this.f50387a = i10;
    }
}
