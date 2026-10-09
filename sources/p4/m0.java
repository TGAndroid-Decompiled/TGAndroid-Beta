package p4;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import org.telegram.ui.Cells.c1;
public final class m0 implements IBinder.DeathRecipient {
    public final Messenger f45388a;
    public final g.c f45389b;
    public final Messenger f45390c;
    public int f45392f;
    public int f45393g;
    public final r0 f45394i;
    public int d = 1;
    public int f45391e = 1;
    public final SparseArray h = new SparseArray();

    public m0(r0 r0Var, Messenger messenger) {
        this.f45394i = r0Var;
        this.f45388a = messenger;
        g.c cVar = new g.c(this);
        this.f45389b = cVar;
        this.f45390c = new Messenger(cVar);
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
        obtain.replyTo = this.f45390c;
        try {
            this.f45388a.send(obtain);
            return true;
        } catch (DeadObjectException unused) {
            return false;
        } catch (RemoteException e7) {
            if (i10 != 2) {
                Log.e("MediaRouteProviderProxy", "Could not send message to service.", e7);
                return false;
            }
            return false;
        }
    }

    @Override
    public final void binderDied() {
        this.f45394i.f45424s.post(new l0(this, 1));
    }

    public final void c(int i10, int i11) {
        Bundle f7 = c1.f(i11, "volume");
        int i12 = this.d;
        this.d = i12 + 1;
        b(7, i12, i10, null, f7);
    }

    public final void d(int i10, int i11) {
        Bundle f7 = c1.f(i11, "volume");
        int i12 = this.d;
        this.d = i12 + 1;
        b(8, i12, i10, null, f7);
    }
}
