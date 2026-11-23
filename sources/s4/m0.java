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
    public final Messenger f57000a;
    public final g.c f57001b;
    public final Messenger f57002c;
    public int f57004f;
    public int h;
    public final r0 f57006r;
    public int d = 1;
    public int f57003e = 1;
    public final SparseArray f57005n = new SparseArray();

    public m0(r0 r0Var, Messenger messenger) {
        this.f57006r = r0Var;
        this.f57000a = messenger;
        g.c cVar = new g.c(this);
        this.f57001b = cVar;
        this.f57002c = new Messenger(cVar);
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
        obtain.replyTo = this.f57002c;
        try {
            this.f57000a.send(obtain);
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
        this.f57006r.f57036s.post(new l0(this, 1));
    }

    public final void c(int i7, int i10) {
        Bundle f10 = p5.c.f(i10, "volume");
        int i11 = this.d;
        this.d = i11 + 1;
        b(7, i11, i7, null, f10);
    }

    public final void d(int i7, int i10) {
        Bundle f10 = p5.c.f(i10, "volume");
        int i11 = this.d;
        this.d = i11 + 1;
        b(8, i11, i7, null, f10);
    }
}
