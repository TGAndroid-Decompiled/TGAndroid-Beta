package s4;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
public final class m0 implements IBinder.DeathRecipient {
    public final Messenger f54862a;
    public final g.c f54863b;
    public final Messenger f54864c;
    public int f54866f;
    public int f54867g;
    public final r0 f54868i;
    public int d = 1;
    public int f54865e = 1;
    public final SparseArray h = new SparseArray();

    public m0(r0 r0Var, Messenger messenger) {
        this.f54868i = r0Var;
        this.f54862a = messenger;
        g.c cVar = new g.c(this);
        this.f54863b = cVar;
        this.f54864c = new Messenger(cVar);
    }

    public final void a(int i7) {
        int i10 = this.d;
        this.d = i10 + 1;
        b(5, i10, i7, null, null);
    }

    public final boolean b(int i7, int i10, int i11, Bundle bundle, Bundle bundle2) {
        Message obtain = Message.obtain();
        obtain.what = i7;
        obtain.arg1 = i10;
        obtain.arg2 = i11;
        obtain.obj = bundle;
        obtain.setData(bundle2);
        obtain.replyTo = this.f54864c;
        try {
            this.f54862a.send(obtain);
            return true;
        } catch (DeadObjectException unused) {
            return false;
        } catch (RemoteException e10) {
            if (i7 != 2) {
                Log.e("MediaRouteProviderProxy", "Could not send message to service.", e10);
                return false;
            }
            return false;
        }
    }

    @Override
    public final void binderDied() {
        this.f54868i.f54898s.post(new l0(this, 1));
    }

    public final void c(int i7, int i10) {
        Bundle f10 = rf.b.f(i10, "volume");
        int i11 = this.d;
        this.d = i11 + 1;
        b(7, i11, i7, null, f10);
    }

    public final void d(int i7, int i10) {
        Bundle f10 = rf.b.f(i10, "volume");
        int i11 = this.d;
        this.d = i11 + 1;
        b(8, i11, i7, null, f10);
    }
}
