package w9;

import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import n7.z0;
import org.telegram.ui.Components.qq0;
import org.telegram.ui.Components.rc;
import yh.y3;
public final class k implements Continuation, qq0 {
    public Object f48956a;

    public k(Object obj) {
        this.f48956a = obj;
    }

    public void a(IBinder iBinder) {
        synchronized (((HashMap) this.f48956a)) {
            if (iBinder != null) {
                try {
                    iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            new y8.a();
            for (Map.Entry entry : ((HashMap) this.f48956a).entrySet()) {
                if (entry.getValue() == null) {
                    try {
                        throw null;
                        break;
                    } catch (RemoteException unused) {
                        String valueOf = String.valueOf(entry.getKey());
                        Log.w("WearableClient", "onPostInitHandler: Didn't add: " + valueOf + "/null");
                    }
                } else {
                    throw new ClassCastException();
                }
            }
        }
    }

    @Override
    public Object then(Task task) {
        return ((Callable) this.f48956a).call();
    }

    @Override
    public void x0() {
        rc k10 = ((y3) this.f48956a).getBulletinFactory().k(false);
        k10.f30437t = true;
        k10.j();
    }

    public k(int i10) {
        switch (i10) {
            case 4:
                this.f48956a = new z0[zf.b.values().length];
                return;
            default:
                this.f48956a = new HashMap();
                return;
        }
    }

    @Override
    public void V() {
    }
}
