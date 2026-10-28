package p4;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import org.telegram.ui.Components.b10;
public final class m0 implements IBinder.DeathRecipient {
    public final Messenger f46755a;
    public final g.c f46756b;
    public final Messenger f46757c;
    public int f46758f;
    public int f46759g;
    public final r0 f46760i;
    public int d = 1;
    public int e = 1;
    public final SparseArray h = new SparseArray();

    public m0(r0 r0Var, Messenger messenger) {
        this.f46760i = r0Var;
        this.f46755a = messenger;
        g.c cVar = new g.c(this);
        this.f46756b = cVar;
        this.f46757c = new Messenger(cVar);
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
        obtain.replyTo = this.f46757c;
        try {
            this.f46755a.send(obtain);
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
        this.f46760i.f46787s.post(new l0(this, 1));
    }

    public final void c(int i10, int i11) {
        Bundle g7 = b10.g(i11, "volume");
        int i12 = this.d;
        this.d = i12 + 1;
        b(7, i12, i10, null, g7);
    }

    public final void d(int i10, int i11) {
        Bundle g7 = b10.g(i11, "volume");
        int i12 = this.d;
        this.d = i12 + 1;
        b(8, i12, i10, null, g7);
    }
}
