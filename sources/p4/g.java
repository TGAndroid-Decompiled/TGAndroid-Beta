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
public final class g extends p {
    public final String f40844f;
    public final MediaRouter2.RoutingController f40845g;
    public final Messenger h;
    public final Messenger f40846i;
    public final Handler f40848k;
    public m f40852o;
    public final k f40853p;
    public final SparseArray f40847j = new SparseArray();
    public final AtomicInteger f40849l = new AtomicInteger(1);
    public final org.telegram.ui.web.q0 f40850m = new org.telegram.ui.web.q0(this, 8);
    public int f40851n = -1;

    public g(k kVar, MediaRouter2.RoutingController routingController, String str) {
        Messenger messenger;
        this.f40853p = kVar;
        this.f40845g = routingController;
        this.f40844f = str;
        Messenger n10 = k.n(routingController);
        this.h = n10;
        if (n10 == null) {
            messenger = null;
        } else {
            messenger = new Messenger(new androidx.mediarouter.app.c(this));
        }
        this.f40846i = messenger;
        this.f40848k = new Handler(Looper.getMainLooper());
    }

    @Override
    public final void d() {
        this.f40845g.release();
    }

    @Override
    public final void f(int i10) {
        MediaRouter2.RoutingController routingController = this.f40845g;
        if (routingController == null) {
            return;
        }
        routingController.setVolume(i10);
        this.f40851n = i10;
        Handler handler = this.f40848k;
        org.telegram.ui.web.q0 q0Var = this.f40850m;
        handler.removeCallbacks(q0Var);
        handler.postDelayed(q0Var, 1000L);
    }

    @Override
    public final void i(int i10) {
        MediaRouter2.RoutingController routingController = this.f40845g;
        if (routingController == null) {
            return;
        }
        int i11 = this.f40851n;
        if (i11 < 0) {
            i11 = routingController.getVolume();
        }
        int max = Math.max(0, Math.min(i11 + i10, this.f40845g.getVolumeMax()));
        this.f40851n = max;
        this.f40845g.setVolume(max);
        Handler handler = this.f40848k;
        org.telegram.ui.web.q0 q0Var = this.f40850m;
        handler.removeCallbacks(q0Var);
        handler.postDelayed(q0Var, 1000L);
    }

    @Override
    public final void m(String str) {
        if (str != null && !str.isEmpty()) {
            MediaRoute2Info o9 = this.f40853p.o(str);
            if (o9 == null) {
                Log.w("MR2Provider", "onAddMemberRoute: Specified route not found. routeId=".concat(str));
                return;
            } else {
                this.f40845g.selectRoute(o9);
                return;
            }
        }
        Log.w("MR2Provider", "onAddMemberRoute: Ignoring null or empty routeId.");
    }

    @Override
    public final void n(String str) {
        if (str != null && !str.isEmpty()) {
            MediaRoute2Info o9 = this.f40853p.o(str);
            if (o9 == null) {
                Log.w("MR2Provider", "onRemoveMemberRoute: Specified route not found. routeId=".concat(str));
                return;
            } else {
                this.f40845g.deselectRoute(o9);
                return;
            }
        }
        Log.w("MR2Provider", "onRemoveMemberRoute: Ignoring null or empty routeId.");
    }

    @Override
    public final void o(List list) {
        if (list != null && !list.isEmpty()) {
            String str = (String) list.get(0);
            k kVar = this.f40853p;
            MediaRoute2Info o9 = kVar.o(str);
            if (o9 == null) {
                Log.w("MR2Provider", "onUpdateMemberRoutes: Specified route not found. routeId=" + str);
                return;
            }
            kVar.f40870r.transferTo(o9);
            return;
        }
        Log.w("MR2Provider", "onUpdateMemberRoutes: Ignoring null or empty routeIds.");
    }

    public final String p() {
        m mVar = this.f40852o;
        if (mVar != null) {
            return mVar.d();
        }
        return this.f40845g.getId();
    }

    public final void q(int i10, String str) {
        Messenger messenger;
        MediaRouter2.RoutingController routingController = this.f40845g;
        if (routingController != null && !routingController.isReleased() && (messenger = this.h) != null) {
            int andIncrement = this.f40849l.getAndIncrement();
            Message obtain = Message.obtain();
            obtain.what = 7;
            obtain.arg1 = andIncrement;
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i10);
            bundle.putString("routeId", str);
            obtain.setData(bundle);
            obtain.replyTo = this.f40846i;
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
        MediaRouter2.RoutingController routingController = this.f40845g;
        if (routingController != null && !routingController.isReleased() && (messenger = this.h) != null) {
            int andIncrement = this.f40849l.getAndIncrement();
            Message obtain = Message.obtain();
            obtain.what = 8;
            obtain.arg1 = andIncrement;
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i10);
            bundle.putString("routeId", str);
            obtain.setData(bundle);
            obtain.replyTo = this.f40846i;
            try {
                messenger.send(obtain);
            } catch (DeadObjectException unused) {
            } catch (RemoteException e) {
                Log.e("MR2Provider", "Could not send control request to service.", e);
            }
        }
    }
}
