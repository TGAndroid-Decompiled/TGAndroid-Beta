package r4;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.ui.ActionBar.d4;
public final class g extends p {
    public final String f54283f;
    public final MediaRouter2.RoutingController f54284g;
    public final Messenger h;
    public final Messenger f54285i;
    public final Handler f54287k;
    public m f54291o;
    public final k f54292p;
    public final SparseArray f54286j = new SparseArray();
    public final AtomicInteger f54288l = new AtomicInteger(1);
    public final d4 f54289m = new d4(this, 29);
    public int f54290n = -1;

    public g(k kVar, MediaRouter2.RoutingController routingController, String str) {
        Messenger messenger;
        this.f54292p = kVar;
        this.f54284g = routingController;
        this.f54283f = str;
        Messenger n4 = k.n(routingController);
        this.h = n4;
        if (n4 == null) {
            messenger = null;
        } else {
            messenger = new Messenger(new android.support.v4.media.session.q(this));
        }
        this.f54285i = messenger;
        this.f54287k = new Handler(Looper.getMainLooper());
    }

    @Override
    public final void d() {
        this.f54284g.release();
    }

    @Override
    public final void f(int i3) {
        MediaRouter2.RoutingController routingController = this.f54284g;
        if (routingController == null) {
            return;
        }
        routingController.setVolume(i3);
        this.f54290n = i3;
        Handler handler = this.f54287k;
        d4 d4Var = this.f54289m;
        handler.removeCallbacks(d4Var);
        handler.postDelayed(d4Var, 1000L);
    }

    @Override
    public final void i(int i3) {
        MediaRouter2.RoutingController routingController = this.f54284g;
        if (routingController == null) {
            return;
        }
        int i10 = this.f54290n;
        if (i10 < 0) {
            i10 = routingController.getVolume();
        }
        int max = Math.max(0, Math.min(i10 + i3, this.f54284g.getVolumeMax()));
        this.f54290n = max;
        this.f54284g.setVolume(max);
        Handler handler = this.f54287k;
        d4 d4Var = this.f54289m;
        handler.removeCallbacks(d4Var);
        handler.postDelayed(d4Var, 1000L);
    }

    @Override
    public final void m(String str) {
        if (str != null && !str.isEmpty()) {
            MediaRoute2Info o10 = this.f54292p.o(str);
            if (o10 == null) {
                Log.w("MR2Provider", "onAddMemberRoute: Specified route not found. routeId=".concat(str));
                return;
            } else {
                this.f54284g.selectRoute(o10);
                return;
            }
        }
        Log.w("MR2Provider", "onAddMemberRoute: Ignoring null or empty routeId.");
    }

    @Override
    public final void n(String str) {
        if (str != null && !str.isEmpty()) {
            MediaRoute2Info o10 = this.f54292p.o(str);
            if (o10 == null) {
                Log.w("MR2Provider", "onRemoveMemberRoute: Specified route not found. routeId=".concat(str));
                return;
            } else {
                this.f54284g.deselectRoute(o10);
                return;
            }
        }
        Log.w("MR2Provider", "onRemoveMemberRoute: Ignoring null or empty routeId.");
    }

    @Override
    public final void o(List list) {
        if (list != null && !list.isEmpty()) {
            String str = (String) list.get(0);
            k kVar = this.f54292p;
            MediaRoute2Info o10 = kVar.o(str);
            if (o10 == null) {
                Log.w("MR2Provider", "onUpdateMemberRoutes: Specified route not found. routeId=" + str);
                return;
            }
            kVar.f54304r.transferTo(o10);
            return;
        }
        Log.w("MR2Provider", "onUpdateMemberRoutes: Ignoring null or empty routeIds.");
    }

    public final String p() {
        m mVar = this.f54291o;
        if (mVar != null) {
            return mVar.d();
        }
        return this.f54284g.getId();
    }

    public final void q(int i3, String str) {
        Messenger messenger;
        MediaRouter2.RoutingController routingController = this.f54284g;
        if (routingController != null && !routingController.isReleased() && (messenger = this.h) != null) {
            int andIncrement = this.f54288l.getAndIncrement();
            Message obtain = Message.obtain();
            obtain.what = 7;
            obtain.arg1 = andIncrement;
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i3);
            bundle.putString("routeId", str);
            obtain.setData(bundle);
            obtain.replyTo = this.f54285i;
            try {
                messenger.send(obtain);
            } catch (DeadObjectException unused) {
            } catch (RemoteException e10) {
                Log.e("MR2Provider", "Could not send control request to service.", e10);
            }
        }
    }

    public final void r(int i3, String str) {
        Messenger messenger;
        MediaRouter2.RoutingController routingController = this.f54284g;
        if (routingController != null && !routingController.isReleased() && (messenger = this.h) != null) {
            int andIncrement = this.f54288l.getAndIncrement();
            Message obtain = Message.obtain();
            obtain.what = 8;
            obtain.arg1 = andIncrement;
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i3);
            bundle.putString("routeId", str);
            obtain.setData(bundle);
            obtain.replyTo = this.f54285i;
            try {
                messenger.send(obtain);
            } catch (DeadObjectException unused) {
            } catch (RemoteException e10) {
                Log.e("MR2Provider", "Could not send control request to service.", e10);
            }
        }
    }
}
