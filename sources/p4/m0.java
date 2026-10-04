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
    public final Messenger f44217a;
    public final g.d f44218b;
    public final Messenger f44219c;
    public int f44221f;
    public int f44222g;
    public final r0 f44223i;
    public int d = 1;
    public int f44220e = 1;
    public final SparseArray h = new SparseArray();

    public m0(r0 r0Var, Messenger messenger) {
        this.f44223i = r0Var;
        this.f44217a = messenger;
        g.d dVar = new g.d(this);
        this.f44218b = dVar;
        this.f44219c = new Messenger(dVar);
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
        obtain.replyTo = this.f44219c;
        try {
            this.f44217a.send(obtain);
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
        this.f44223i.f44253s.post(new l0(this, 1));
    }

    public final void c(int i10, int i11) {
        Bundle h = c1.h(i11, "volume");
        int i12 = this.d;
        this.d = i12 + 1;
        b(7, i12, i10, null, h);
    }

    public final void d(int i10, int i11) {
        Bundle h = c1.h(i11, "volume");
        int i12 = this.d;
        this.d = i12 + 1;
        b(8, i12, i10, null, h);
    }
}
