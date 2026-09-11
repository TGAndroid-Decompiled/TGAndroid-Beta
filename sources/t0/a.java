package t0;

import android.hardware.fingerprint.FingerprintManager;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.n;
import java.io.File;
import java.util.Set;
import org.telegram.messenger.GenericProvider;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.rc0;
import yh.f4;
public final class a implements pa.a, d9.e, a2, rc0, q3.g, Continuation, q9.d, Vector.TLDeserializer, GenericProvider {
    public final int f46417a;

    public a(int i10) {
        this.f46417a = i10;
    }

    public static FingerprintManager a(Object obj) {
        return (FingerprintManager) obj;
    }

    @Override
    public Object D(cf.c cVar) {
        Set s10 = cVar.s(xa.a.class);
        xa.c cVar2 = xa.c.f49329c;
        if (cVar2 == null) {
            synchronized (xa.c.class) {
                try {
                    cVar2 = xa.c.f49329c;
                    if (cVar2 == null) {
                        cVar2 = new xa.c(0);
                        xa.c.f49329c = cVar2;
                    }
                } finally {
                }
            }
        }
        return new xa.b(s10, cVar2);
    }

    @Override
    public java.lang.Object apply(java.lang.Object r26) {
        throw new UnsupportedOperationException("Method not decompiled: t0.a.apply(java.lang.Object):java.lang.Object");
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
    public String f(int i10) {
        switch (this.f46417a) {
            case 6:
                return String.valueOf(i10);
            default:
                return String.format("%02d", Integer.valueOf(i10 * 5));
        }
    }

    @Override
    public void g(b2 b2Var, int i10) {
        switch (this.f46417a) {
            case 5:
                return;
            case 8:
                b2Var.dismiss();
                return;
            case 9:
                b2Var.dismiss();
                return;
            case 25:
                b2Var.dismiss();
                return;
            default:
                b2Var.dismiss();
                return;
        }
    }

    @Override
    public void h(pa.b bVar) {
        bVar.get().getClass();
        throw new ClassCastException();
    }

    @Override
    public Object provide(Object obj) {
        Integer num = (Integer) obj;
        int i10 = f4.f50275k0;
        return 0;
    }

    @Override
    public Object then(Task task) {
        boolean z10;
        File file;
        if (task.isSuccessful()) {
            w9.b bVar = (w9.b) task.getResult();
            t9.b bVar2 = t9.b.f46479a;
            bVar2.b("Crashlytics report successfully enqueued to DataTransport: " + bVar.f48376b);
            z10 = true;
            if (bVar.f48377c.delete()) {
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

    public a(n nVar) {
        this.f46417a = 20;
    }

    private final void b(b2 b2Var, int i10) {
    }
}
