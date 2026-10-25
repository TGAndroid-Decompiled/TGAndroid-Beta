package p4;

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
import org.telegram.ui.web.h1;
public final class g extends p {
    public final String f46680f;
    public final MediaRouter2.RoutingController f46681g;
    public final Messenger h;
    public final Messenger f46682i;
    public final Handler f46684k;
    public m f46688o;
    public final k f46689p;
    public final SparseArray f46683j = new SparseArray();
    public final AtomicInteger f46685l = new AtomicInteger(1);
    public final h1 f46686m = new h1(this, 5);
    public int f46687n = -1;

    public g(k kVar, MediaRouter2.RoutingController routingController, String str) {
        Messenger messenger;
        this.f46689p = kVar;
        this.f46681g = routingController;
        this.f46680f = str;
        Messenger n10 = k.n(routingController);
        this.h = n10;
        if (n10 == null) {
            messenger = null;
        } else {
            messenger = new Messenger(new androidx.mediarouter.app.c(this));
        }
        this.f46682i = messenger;
        this.f46684k = new Handler(Looper.getMainLooper());
    }

    @Override
    public final void d() {
        this.f46681g.release();
    }

    @Override
    public final void f(int i10) {
        MediaRouter2.RoutingController routingController = this.f46681g;
        if (routingController == null) {
            return;
        }
        routingController.setVolume(i10);
        this.f46687n = i10;
        Handler handler = this.f46684k;
        h1 h1Var = this.f46686m;
        handler.removeCallbacks(h1Var);
        handler.postDelayed(h1Var, 1000L);
    }

    @Override
    public final void i(int i10) {
        MediaRouter2.RoutingController routingController = this.f46681g;
        if (routingController == null) {
            return;
        }
        int i11 = this.f46687n;
        if (i11 < 0) {
            i11 = routingController.getVolume();
        }
        int max = Math.max(0, Math.min(i11 + i10, this.f46681g.getVolumeMax()));
        this.f46687n = max;
        this.f46681g.setVolume(max);
        Handler handler = this.f46684k;
        h1 h1Var = this.f46686m;
        handler.removeCallbacks(h1Var);
        handler.postDelayed(h1Var, 1000L);
    }

    @Override
    public final void m(String str) {
        if (str != null && !str.isEmpty()) {
            MediaRoute2Info o10 = this.f46689p.o(str);
            if (o10 == null) {
                Log.w("MR2Provider", "onAddMemberRoute: Specified route not found. routeId=".concat(str));
                return;
            } else {
                this.f46681g.selectRoute(o10);
                return;
            }
        }
        Log.w("MR2Provider", "onAddMemberRoute: Ignoring null or empty routeId.");
    }

    @Override
    public final void n(String str) {
        if (str != null && !str.isEmpty()) {
            MediaRoute2Info o10 = this.f46689p.o(str);
            if (o10 == null) {
                Log.w("MR2Provider", "onRemoveMemberRoute: Specified route not found. routeId=".concat(str));
                return;
            } else {
                this.f46681g.deselectRoute(o10);
                return;
            }
        }
        Log.w("MR2Provider", "onRemoveMemberRoute: Ignoring null or empty routeId.");
    }

    @Override
    public final void o(List list) {
        if (list != null && !list.isEmpty()) {
            String str = (String) list.get(0);
            k kVar = this.f46689p;
            MediaRoute2Info o10 = kVar.o(str);
            if (o10 == null) {
                Log.w("MR2Provider", "onUpdateMemberRoutes: Specified route not found. routeId=" + str);
                return;
            }
            kVar.f46706r.transferTo(o10);
            return;
        }
        Log.w("MR2Provider", "onUpdateMemberRoutes: Ignoring null or empty routeIds.");
    }

    public final String p() {
        m mVar = this.f46688o;
        if (mVar != null) {
            return mVar.d();
        }
        return this.f46681g.getId();
    }

    public final void q(int i10, String str) {
        Messenger messenger;
        MediaRouter2.RoutingController routingController = this.f46681g;
        if (routingController != null && !routingController.isReleased() && (messenger = this.h) != null) {
            int andIncrement = this.f46685l.getAndIncrement();
            Message obtain = Message.obtain();
            obtain.what = 7;
            obtain.arg1 = andIncrement;
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i10);
            bundle.putString("routeId", str);
            obtain.setData(bundle);
            obtain.replyTo = this.f46682i;
            try {
                messenger.send(obtain);
            } catch (DeadObjectException unused) {
            } catch (RemoteException e) {
                Log.e("MR2Provider", "Could not send control request to service.", e);
            }
        }
    }

    public final void r(int i10, String str) {
        Messenger messenger;
        MediaRouter2.RoutingController routingController = this.f46681g;
        if (routingController != null && !routingController.isReleased() && (messenger = this.h) != null) {
            int andIncrement = this.f46685l.getAndIncrement();
            Message obtain = Message.obtain();
            obtain.what = 8;
            obtain.arg1 = andIncrement;
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i10);
            bundle.putString("routeId", str);
            obtain.setData(bundle);
            obtain.replyTo = this.f46682i;
            try {
                messenger.send(obtain);
            } catch (DeadObjectException unused) {
            } catch (RemoteException e) {
                Log.e("MR2Provider", "Could not send control request to service.", e);
            }
        }
    }
}
