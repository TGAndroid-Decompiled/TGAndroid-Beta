package t0;

import android.hardware.fingerprint.FingerprintManager;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import b2.l1;
import c3.o;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import e9.a1;
import e9.g0;
import e9.i0;
import e9.q;
import java.io.File;
import java.util.ArrayList;
import java.util.Set;
import org.telegram.messenger.GenericProvider;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.hh1;
import u2.d0;
import u2.o1;
import xh.g4;
import yh.z3;
public final class a implements pa.a, a2, qc0, d9.e, q3.g, Continuation, q9.d, GenericProvider, Vector.TLDeserializer {
    public final int f42992a;

    public a(int i10) {
        this.f42992a = i10;
    }

    public static FingerprintManager a(Object obj) {
        return (FingerprintManager) obj;
    }

    @Override
    public Object G(cf.c cVar) {
        Set w10 = cVar.w(xa.a.class);
        xa.c cVar2 = xa.c.f45731c;
        if (cVar2 == null) {
            synchronized (xa.c.class) {
                try {
                    cVar2 = xa.c.f45731c;
                    if (cVar2 == null) {
                        cVar2 = new xa.c(0);
                        xa.c.f45731c = cVar2;
                    }
                } finally {
                }
            }
        }
        return new xa.b(w10, cVar2);
    }

    @Override
    public Object apply(Object obj) {
        switch (this.f42992a) {
            case 7:
                return ((o) obj).c().getClass().getSimpleName();
            case 8:
                return i0.v(q.w(((d0) obj).r().f43454b, new a(9)));
            case 9:
                return Integer.valueOf(((l1) obj).f3090c);
            case 16:
                return Long.valueOf(((z3.b) obj).f48074b);
            case 17:
                return Long.valueOf(((z3.b) obj).f48075c);
            case 18:
                return (w3.o) obj;
            default:
                o1 o1Var = (o1) obj;
                o1Var.getClass();
                Bundle bundle = new Bundle();
                String str = o1.e;
                a1 a1Var = o1Var.f43454b;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>(a1Var.d);
                g0 listIterator = a1Var.listIterator(0);
                while (listIterator.hasNext()) {
                    arrayList.add(((l1) listIterator.next()).c());
                }
                bundle.putParcelableArrayList(str, arrayList);
                return bundle;
        }
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
    public String e(int i10) {
        switch (this.f42992a) {
            case 3:
                return String.valueOf(i10);
            default:
                return String.format("%02d", Integer.valueOf(i10 * 5));
        }
    }

    @Override
    public void f(b2 b2Var, int i10) {
        switch (this.f42992a) {
            case 2:
                return;
            case 5:
                b2Var.dismiss();
                return;
            case 6:
                b2Var.dismiss();
                return;
            case 24:
                b2Var.dismiss();
                return;
            case 25:
                b2Var.dismiss();
                return;
            case 28:
                z3.d2(new hh1(6, null));
                return;
            default:
                int i11 = z3.f48010q1;
                return;
        }
    }

    @Override
    public void j(pa.b bVar) {
        bVar.get().getClass();
        throw new ClassCastException();
    }

    @Override
    public Object provide(Object obj) {
        Integer num = (Integer) obj;
        int i10 = g4.f45874k0;
        return 0;
    }

    @Override
    public Object then(Task task) {
        boolean z10;
        File file;
        if (task.isSuccessful()) {
            w9.b bVar = (w9.b) task.getResult();
            t9.b bVar2 = t9.b.f43047a;
            bVar2.b("Crashlytics report successfully enqueued to DataTransport: " + bVar.f44908b);
            z10 = true;
            if (bVar.f44909c.delete()) {
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

    public a(Object obj, int i10) {
        this.f42992a = i10;
    }

    private final void b(b2 b2Var, int i10) {
    }
}
