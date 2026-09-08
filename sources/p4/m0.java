package p4;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import org.telegram.ui.Cells.p6;
public final class m0 implements IBinder.DeathRecipient {
    public final Messenger f43895a;
    public final g.d f43896b;
    public final Messenger f43897c;
    public int f43899f;
    public int f43900g;
    public final r0 f43901i;
    public int d = 1;
    public int f43898e = 1;
    public final SparseArray h = new SparseArray();

    public m0(r0 r0Var, Messenger messenger) {
        this.f43901i = r0Var;
        this.f43895a = messenger;
        g.d dVar = new g.d(this);
        this.f43896b = dVar;
        this.f43897c = new Messenger(dVar);
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
        obtain.replyTo = this.f43897c;
        try {
            this.f43895a.send(obtain);
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
        this.f43901i.f43931s.post(new l0(this, 1));
    }

    public final void c(int i10, int i11) {
        Bundle e7 = p6.e(i11, "volume");
        int i12 = this.d;
        this.d = i12 + 1;
        b(7, i12, i10, null, e7);
    }

    public final void d(int i10, int i11) {
        Bundle e7 = p6.e(i11, "volume");
        int i12 = this.d;
        this.d = i12 + 1;
        b(8, i12, i10, null, e7);
    }
}
