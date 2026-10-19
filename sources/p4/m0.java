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
    public final Messenger f44151a;
    public final g.c f44152b;
    public final Messenger f44153c;
    public int f44154f;
    public int f44155g;
    public final r0 f44156i;
    public int d = 1;
    public int e = 1;
    public final SparseArray h = new SparseArray();

    public m0(r0 r0Var, Messenger messenger) {
        this.f44156i = r0Var;
        this.f44151a = messenger;
        g.c cVar = new g.c(this);
        this.f44152b = cVar;
        this.f44153c = new Messenger(cVar);
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
        obtain.replyTo = this.f44153c;
        try {
            this.f44151a.send(obtain);
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
        this.f44156i.f44183s.post(new l0(this, 1));
    }

    public final void c(int i10, int i11) {
        Bundle i12 = c1.i(i11, "volume");
        int i13 = this.d;
        this.d = i13 + 1;
        b(7, i13, i10, null, i12);
    }

    public final void d(int i10, int i11) {
        Bundle i12 = c1.i(i11, "volume");
        int i13 = this.d;
        this.d = i13 + 1;
        b(8, i13, i10, null, i12);
    }
}
