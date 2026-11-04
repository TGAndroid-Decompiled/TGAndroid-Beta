package r4;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import org.telegram.ui.Cells.f1;
public final class n0 implements IBinder.DeathRecipient {
    public final Messenger f54322a;
    public final g.c f54323b;
    public final Messenger f54324c;
    public int f54326f;
    public int f54327g;
    public final s0 f54328i;
    public int d = 1;
    public int f54325e = 1;
    public final SparseArray h = new SparseArray();

    public n0(s0 s0Var, Messenger messenger) {
        this.f54328i = s0Var;
        this.f54322a = messenger;
        g.c cVar = new g.c(this);
        this.f54323b = cVar;
        this.f54324c = new Messenger(cVar);
    }

    public final void a(int i3) {
        int i10 = this.d;
        this.d = i10 + 1;
        b(5, i10, i3, null, null);
    }

    public final boolean b(int i3, int i10, int i11, Bundle bundle, Bundle bundle2) {
        Message obtain = Message.obtain();
        obtain.what = i3;
        obtain.arg1 = i10;
        obtain.arg2 = i11;
        obtain.obj = bundle;
        obtain.setData(bundle2);
        obtain.replyTo = this.f54324c;
        try {
            this.f54322a.send(obtain);
            return true;
        } catch (DeadObjectException unused) {
            return false;
        } catch (RemoteException e10) {
            if (i3 != 2) {
                Log.e("MediaRouteProviderProxy", "Could not send message to service.", e10);
                return false;
            }
            return false;
        }
    }

    @Override
    public final void binderDied() {
        this.f54328i.f54356s.post(new m0(this, 1));
    }

    public final void c(int i3, int i10) {
        Bundle k10 = f1.k(i10, "volume");
        int i11 = this.d;
        this.d = i11 + 1;
        b(7, i11, i3, null, k10);
    }

    public final void d(int i3, int i10) {
        Bundle k10 = f1.k(i10, "volume");
        int i11 = this.d;
        this.d = i11 + 1;
        b(8, i11, i3, null, k10);
    }
}
