package v3;

import android.hardware.fingerprint.FingerprintManager;
import android.util.Log;
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
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.zg1;
import xh.h4;
import yh.y3;
import za.e0;
import za.k0;
import za.m;
import za.u;
public final class d implements q3.g, d9.e, Continuation, q9.d, a2, GenericProvider, e2.h, Vector.TLDeserializer {
    public final int f43821a;

    public d(int i10) {
        this.f43821a = i10;
    }

    public static FingerprintManager a(Object obj) {
        return (FingerprintManager) obj;
    }

    @Override
    public Object G(cf.c cVar) {
        m m10getComponents$lambda0;
        k0 m11getComponents$lambda1;
        e0 m12getComponents$lambda2;
        bb.h m13getComponents$lambda3;
        u m14getComponents$lambda4;
        switch (this.f43821a) {
            case 7:
                Set w10 = cVar.w(xa.a.class);
                xa.c cVar2 = xa.c.f45685c;
                if (cVar2 == null) {
                    synchronized (xa.c.class) {
                        try {
                            cVar2 = xa.c.f45685c;
                            if (cVar2 == null) {
                                cVar2 = new xa.c(0);
                                xa.c.f45685c = cVar2;
                            }
                        } finally {
                        }
                    }
                }
                return new xa.b(w10, cVar2);
            case 25:
                m10getComponents$lambda0 = FirebaseSessionsRegistrar.m10getComponents$lambda0(cVar);
                return m10getComponents$lambda0;
            case 26:
                m11getComponents$lambda1 = FirebaseSessionsRegistrar.m11getComponents$lambda1(cVar);
                return m11getComponents$lambda1;
            case 27:
                m12getComponents$lambda2 = FirebaseSessionsRegistrar.m12getComponents$lambda2(cVar);
                return m12getComponents$lambda2;
            case 28:
                m13getComponents$lambda3 = FirebaseSessionsRegistrar.m13getComponents$lambda3(cVar);
                return m13getComponents$lambda3;
            default:
                m14getComponents$lambda4 = FirebaseSessionsRegistrar.m14getComponents$lambda4(cVar);
                return m14getComponents$lambda4;
        }
    }

    @Override
    public void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    @Override
    public java.lang.Object apply(java.lang.Object r26) {
        throw new UnsupportedOperationException("Method not decompiled: v3.d.apply(java.lang.Object):java.lang.Object");
    }

    @Override
    public boolean c(int i10, int i11, int i12, int i13, int i14) {
        if (i11 != 67 || i12 != 79 || i13 != 77 || (i14 != 77 && i10 != 2)) {
            if (i11 == 77 && i12 == 76 && i13 == 76) {
                if (i14 == 84 || i10 == 2) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        return TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, i10, z10);
    }

    @Override
    public void f(b2 b2Var, int i10) {
        switch (this.f43821a) {
            case 9:
                b2Var.dismiss();
                return;
            case 10:
                b2Var.dismiss();
                return;
            case 14:
                y3.d2(new zg1(6, null));
                return;
            default:
                int i11 = y3.f47945q1;
                return;
        }
    }

    @Override
    public Object provide(Object obj) {
        Integer num = (Integer) obj;
        int i10 = h4.f45839k0;
        return 0;
    }

    @Override
    public Object then(Task task) {
        boolean z10;
        File file;
        if (task.isSuccessful()) {
            w9.b bVar = (w9.b) task.getResult();
            t9.b bVar2 = t9.b.f43002a;
            bVar2.b("Crashlytics report successfully enqueued to DataTransport: " + bVar.f44862b);
            z10 = true;
            if (bVar.f44863c.delete()) {
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

    public d(Object obj, int i10) {
        this.f43821a = i10;
    }
}
