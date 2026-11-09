package s4;

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
import org.telegram.ui.ActionBar.o5;
public final class g extends p {
    public final String f54826f;
    public final MediaRouter2.RoutingController f54827g;
    public final Messenger h;
    public final Messenger f54828i;
    public final Handler f54830k;
    public m f54834o;
    public final k f54835p;
    public final SparseArray f54829j = new SparseArray();
    public final AtomicInteger f54831l = new AtomicInteger(1);
    public final o5 f54832m = new o5(this, 24);
    public int f54833n = -1;

    public g(k kVar, MediaRouter2.RoutingController routingController, String str) {
        Messenger messenger;
        this.f54835p = kVar;
        this.f54827g = routingController;
        this.f54826f = str;
        Messenger n10 = k.n(routingController);
        this.h = n10;
        if (n10 == null) {
            messenger = null;
        } else {
            messenger = new Messenger(new android.support.v4.media.session.q(this));
        }
        this.f54828i = messenger;
        this.f54830k = new Handler(Looper.getMainLooper());
    }

    @Override
    public final void d() {
        this.f54827g.release();
    }

    @Override
    public final void f(int i7) {
        MediaRouter2.RoutingController routingController = this.f54827g;
        if (routingController == null) {
            return;
        }
        routingController.setVolume(i7);
        this.f54833n = i7;
        Handler handler = this.f54830k;
        o5 o5Var = this.f54832m;
        handler.removeCallbacks(o5Var);
        handler.postDelayed(o5Var, 1000L);
    }

    @Override
    public final void i(int i7) {
        MediaRouter2.RoutingController routingController = this.f54827g;
        if (routingController == null) {
            return;
        }
        int i10 = this.f54833n;
        if (i10 < 0) {
            i10 = routingController.getVolume();
        }
        int max = Math.max(0, Math.min(i10 + i7, this.f54827g.getVolumeMax()));
        this.f54833n = max;
        this.f54827g.setVolume(max);
        Handler handler = this.f54830k;
        o5 o5Var = this.f54832m;
        handler.removeCallbacks(o5Var);
        handler.postDelayed(o5Var, 1000L);
    }

    @Override
    public final void m(String str) {
        if (str != null && !str.isEmpty()) {
            MediaRoute2Info o4 = this.f54835p.o(str);
            if (o4 == null) {
                Log.w("MR2Provider", "onAddMemberRoute: Specified route not found. routeId=".concat(str));
                return;
            } else {
                this.f54827g.selectRoute(o4);
                return;
            }
        }
        Log.w("MR2Provider", "onAddMemberRoute: Ignoring null or empty routeId.");
    }

    @Override
    public final void n(String str) {
        if (str != null && !str.isEmpty()) {
            MediaRoute2Info o4 = this.f54835p.o(str);
            if (o4 == null) {
                Log.w("MR2Provider", "onRemoveMemberRoute: Specified route not found. routeId=".concat(str));
                return;
            } else {
                this.f54827g.deselectRoute(o4);
                return;
            }
        }
        Log.w("MR2Provider", "onRemoveMemberRoute: Ignoring null or empty routeId.");
    }

    @Override
    public final void o(List list) {
        if (list != null && !list.isEmpty()) {
            String str = (String) list.get(0);
            k kVar = this.f54835p;
            MediaRoute2Info o4 = kVar.o(str);
            if (o4 == null) {
                Log.w("MR2Provider", "onUpdateMemberRoutes: Specified route not found. routeId=" + str);
                return;
            }
            kVar.f54852r.transferTo(o4);
            return;
        }
        Log.w("MR2Provider", "onUpdateMemberRoutes: Ignoring null or empty routeIds.");
    }

    public final String p() {
        m mVar = this.f54834o;
        if (mVar != null) {
            return mVar.d();
        }
        return this.f54827g.getId();
    }

    public final void q(int i7, String str) {
        Messenger messenger;
        MediaRouter2.RoutingController routingController = this.f54827g;
        if (routingController != null && !routingController.isReleased() && (messenger = this.h) != null) {
            int andIncrement = this.f54831l.getAndIncrement();
            Message obtain = Message.obtain();
            obtain.what = 7;
            obtain.arg1 = andIncrement;
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i7);
            bundle.putString("routeId", str);
            obtain.setData(bundle);
            obtain.replyTo = this.f54828i;
            try {
                messenger.send(obtain);
            } catch (DeadObjectException unused) {
            } catch (RemoteException e10) {
                Log.e("MR2Provider", "Could not send control request to service.", e10);
            }
        }
    }

    public final void r(int i7, String str) {
        Messenger messenger;
        MediaRouter2.RoutingController routingController = this.f54827g;
        if (routingController != null && !routingController.isReleased() && (messenger = this.h) != null) {
            int andIncrement = this.f54831l.getAndIncrement();
            Message obtain = Message.obtain();
            obtain.what = 8;
            obtain.arg1 = andIncrement;
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i7);
            bundle.putString("routeId", str);
            obtain.setData(bundle);
            obtain.replyTo = this.f54828i;
            try {
                messenger.send(obtain);
            } catch (DeadObjectException unused) {
            } catch (RemoteException e10) {
                Log.e("MR2Provider", "Could not send control request to service.", e10);
            }
        }
    }
}
