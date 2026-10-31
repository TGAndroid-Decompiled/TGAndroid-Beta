package p4;

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
    public final Messenger f44774a;
    public final g.c f44775b;
    public final Messenger f44776c;
    public int f44777f;
    public int f44778g;
    public final s0 f44779i;
    public int d = 1;
    public int e = 1;
    public final SparseArray h = new SparseArray();

    public n0(s0 s0Var, Messenger messenger) {
        this.f44779i = s0Var;
        this.f44774a = messenger;
        g.c cVar = new g.c(this);
        this.f44775b = cVar;
        this.f44776c = new Messenger(cVar);
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
        obtain.replyTo = this.f44776c;
        try {
            this.f44774a.send(obtain);
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
        this.f44779i.f44806s.post(new m0(this, 1));
    }

    public final void c(int i10, int i11) {
        Bundle i12 = f1.i(i11, "volume");
        int i13 = this.d;
        this.d = i13 + 1;
        b(7, i13, i10, null, i12);
    }

    public final void d(int i10, int i11) {
        Bundle i12 = f1.i(i11, "volume");
        int i13 = this.d;
        this.d = i13 + 1;
        b(8, i13, i10, null, i12);
    }
}
