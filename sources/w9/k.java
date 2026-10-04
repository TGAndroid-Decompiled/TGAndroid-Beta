package w9;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.q20;
import yh.n2;
import yh.x7;
import zg.o0;
public final class k implements Continuation, xv0, rk0 {
    public Object f48949a;

    public k(Object obj) {
        this.f48949a = obj;
    }

    @Override
    public void E(boolean z10) {
        x7 x7Var = (x7) this.f48949a;
        le.b bVar = x7Var.W;
        if (bVar != null) {
            bVar.a(z10, true);
        }
        q20 q20Var = x7Var.f39894s;
        if (q20Var != null) {
            q20Var.invalidate();
        }
    }

    @Override
    public float Y0() {
        return org.telegram.messenger.q.b(9.0f, ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) * 2) + ((x7) this.f48949a).Z, 0);
    }

    public void a(IBinder iBinder) {
        synchronized (((HashMap) this.f48949a)) {
            if (iBinder != null) {
                try {
                    iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            new y8.a();
            for (Map.Entry entry : ((HashMap) this.f48949a).entrySet()) {
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
    public int e1() {
        return ((x7) this.f48949a).f52264a0;
    }

    @Override
    public void h(View view, o0 o0Var, boolean z10, boolean z11) {
        zg.t tVar = (zg.t) this.f48949a;
        tVar.f53530a.Za(null, tVar.f53533e, tVar.f53531b, view, 0.0f, 0.0f, o0Var, false, z10, z11, false);
        AndroidUtilities.runOnUIThread(new n2(this, 10));
    }

    @Override
    public boolean j() {
        return true;
    }

    @Override
    public boolean k() {
        return false;
    }

    @Override
    public boolean p() {
        return false;
    }

    @Override
    public Object then(Task task) {
        return ((Callable) this.f48949a).call();
    }

    public k() {
        this.f48949a = new HashMap();
    }

    @Override
    public void o() {
    }

    @Override
    public void n(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
