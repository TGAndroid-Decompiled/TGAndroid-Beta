package v0;

import android.util.Log;
import com.google.android.gms.internal.cast.z5;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.File;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import org.telegram.messenger.GenericProvider;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.z1;
import yh.f4;
public final class k implements q3.g, d9.k, Continuation, e2.j, r9.d, z1, GenericProvider, Vector.TLDeserializer {
    public final int f48301a;

    public k(int i10) {
        this.f48301a = i10;
    }

    @Override
    public void accept(Object obj) {
        ((ExecutorService) obj).shutdown();
    }

    @Override
    public java.lang.Object apply(java.lang.Object r26) {
        throw new UnsupportedOperationException("Method not decompiled: v0.k.apply(java.lang.Object):java.lang.Object");
    }

    @Override
    public boolean b(int i10, int i11, int i12, int i13, int i14) {
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
    public void g(c2 c2Var, int i10) {
        switch (this.f48301a) {
            case 13:
                c2Var.dismiss();
                return;
            default:
                c2Var.dismiss();
                return;
        }
    }

    @Override
    public Object j2(z5 z5Var) {
        Set y3 = z5Var.y(ya.a.class);
        ya.c cVar = ya.c.f50561c;
        if (cVar == null) {
            synchronized (ya.c.class) {
                try {
                    cVar = ya.c.f50561c;
                    if (cVar == null) {
                        cVar = new ya.c();
                        ya.c.f50561c = cVar;
                    }
                } finally {
                }
            }
        }
        return new ya.b(y3, cVar);
    }

    @Override
    public Object provide(Object obj) {
        Integer num = (Integer) obj;
        int i10 = f4.f50686k0;
        return 0;
    }

    @Override
    public Object then(Task task) {
        boolean z10;
        File file;
        if (task.isSuccessful()) {
            x9.b bVar = (x9.b) task.getResult();
            u9.b bVar2 = u9.b.f48072a;
            bVar2.b("Crashlytics report successfully enqueued to DataTransport: " + bVar.f50116b);
            z10 = true;
            if (bVar.f50117c.delete()) {
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

    public k(com.google.firebase.messaging.l lVar) {
        this.f48301a = 10;
    }
}
