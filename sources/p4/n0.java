package p4;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
public final class n0 implements IBinder.DeathRecipient {
    public final Messenger f43072a;
    public final g.c f43073b;
    public final Messenger f43074c;
    public int f43075f;
    public int f43076g;
    public final s0 f43077i;
    public int d = 1;
    public int e = 1;
    public final SparseArray h = new SparseArray();

    public n0(s0 s0Var, Messenger messenger) {
        this.f43077i = s0Var;
        this.f43072a = messenger;
        g.c cVar = new g.c(this);
        this.f43073b = cVar;
        this.f43074c = new Messenger(cVar);
    }

    public final void a(int i10) {
        int i11 = this.d;
        this.d = i11 + 1;
        b(5, i11, i10, null, null);
    }

    public final boolean b(int i10, int i11, int i12, Bundle bundle, Bundle bundle2) {
        Message obtain = Message.obtain();
        obtain.what = i10;
        obtain.arg1 = i11;
        obtain.arg2 = i12;
        obtain.obj = bundle;
        obtain.setData(bundle2);
        obtain.replyTo = this.f43074c;
        try {
            this.f43072a.send(obtain);
            return true;
        } catch (DeadObjectException unused) {
            return false;
        } catch (RemoteException e) {
            if (i10 != 2) {
                Log.e("MediaRouteProviderProxy", "Could not send message to service.", e);
                return false;
            }
            return false;
        }
    }

    @Override
    public final void binderDied() {
        this.f43077i.f43103s.post(new m0(this, 1));
    }

    public final void c(int i10, int i11) {
        Bundle g10 = org.telegram.ui.Cells.d0.g(i11, "volume");
        int i12 = this.d;
        this.d = i12 + 1;
        b(7, i12, i10, null, g10);
    }

    public final void d(int i10, int i11) {
        Bundle g10 = org.telegram.ui.Cells.d0.g(i11, "volume");
        int i12 = this.d;
        this.d = i12 + 1;
        b(8, i12, i10, null, g10);
    }
}
