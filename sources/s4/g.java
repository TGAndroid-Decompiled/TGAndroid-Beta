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
import org.telegram.ui.ActionBar.m5;
public final class g extends p {
    public final String f54697f;
    public final MediaRouter2.RoutingController f54698g;
    public final Messenger h;
    public final Messenger f54699i;
    public final Handler f54701k;
    public m f54705o;
    public final k f54706p;
    public final SparseArray f54700j = new SparseArray();
    public final AtomicInteger f54702l = new AtomicInteger(1);
    public final m5 f54703m = new m5(this, 26);
    public int f54704n = -1;

    public g(k kVar, MediaRouter2.RoutingController routingController, String str) {
        Messenger messenger;
        this.f54706p = kVar;
        this.f54698g = routingController;
        this.f54697f = str;
        Messenger n10 = k.n(routingController);
        this.h = n10;
        if (n10 == null) {
            messenger = null;
        } else {
            messenger = new Messenger(new android.support.v4.media.session.q(this));
        }
        this.f54699i = messenger;
        this.f54701k = new Handler(Looper.getMainLooper());
    }

    @Override
    public final void d() {
        this.f54698g.release();
    }

    @Override
    public final void f(int i7) {
        MediaRouter2.RoutingController routingController = this.f54698g;
        if (routingController == null) {
            return;
        }
        routingController.setVolume(i7);
        this.f54704n = i7;
        Handler handler = this.f54701k;
        m5 m5Var = this.f54703m;
        handler.removeCallbacks(m5Var);
        handler.postDelayed(m5Var, 1000L);
    }

    @Override
    public final void i(int i7) {
        MediaRouter2.RoutingController routingController = this.f54698g;
        if (routingController == null) {
            return;
        }
        int i10 = this.f54704n;
        if (i10 < 0) {
            i10 = routingController.getVolume();
        }
        int max = Math.max(0, Math.min(i10 + i7, this.f54698g.getVolumeMax()));
        this.f54704n = max;
        this.f54698g.setVolume(max);
        Handler handler = this.f54701k;
        m5 m5Var = this.f54703m;
        handler.removeCallbacks(m5Var);
        handler.postDelayed(m5Var, 1000L);
    }

    @Override
    public final void m(String str) {
        if (str != null && !str.isEmpty()) {
            MediaRoute2Info o4 = this.f54706p.o(str);
            if (o4 == null) {
                Log.w("MR2Provider", "onAddMemberRoute: Specified route not found. routeId=".concat(str));
                return;
            } else {
                this.f54698g.selectRoute(o4);
                return;
            }
        }
        Log.w("MR2Provider", "onAddMemberRoute: Ignoring null or empty routeId.");
    }

    @Override
    public final void n(String str) {
        if (str != null && !str.isEmpty()) {
            MediaRoute2Info o4 = this.f54706p.o(str);
            if (o4 == null) {
                Log.w("MR2Provider", "onRemoveMemberRoute: Specified route not found. routeId=".concat(str));
                return;
            } else {
                this.f54698g.deselectRoute(o4);
                return;
            }
        }
        Log.w("MR2Provider", "onRemoveMemberRoute: Ignoring null or empty routeId.");
    }

    @Override
    public final void o(List list) {
        if (list != null && !list.isEmpty()) {
            String str = (String) list.get(0);
            k kVar = this.f54706p;
            MediaRoute2Info o4 = kVar.o(str);
            if (o4 == null) {
                Log.w("MR2Provider", "onUpdateMemberRoutes: Specified route not found. routeId=" + str);
                return;
            }
            kVar.f54723r.transferTo(o4);
            return;
        }
        Log.w("MR2Provider", "onUpdateMemberRoutes: Ignoring null or empty routeIds.");
    }

    public final String p() {
        m mVar = this.f54705o;
        if (mVar != null) {
            return mVar.d();
        }
        return this.f54698g.getId();
    }

    public final void q(int i7, String str) {
        Messenger messenger;
        MediaRouter2.RoutingController routingController = this.f54698g;
        if (routingController != null && !routingController.isReleased() && (messenger = this.h) != null) {
            int andIncrement = this.f54702l.getAndIncrement();
            Message obtain = Message.obtain();
            obtain.what = 7;
            obtain.arg1 = andIncrement;
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i7);
            bundle.putString("routeId", str);
            obtain.setData(bundle);
            obtain.replyTo = this.f54699i;
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
        MediaRouter2.RoutingController routingController = this.f54698g;
        if (routingController != null && !routingController.isReleased() && (messenger = this.h) != null) {
            int andIncrement = this.f54702l.getAndIncrement();
            Message obtain = Message.obtain();
            obtain.what = 8;
            obtain.arg1 = andIncrement;
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i7);
            bundle.putString("routeId", str);
            obtain.setData(bundle);
            obtain.replyTo = this.f54699i;
            try {
                messenger.send(obtain);
            } catch (DeadObjectException unused) {
            } catch (RemoteException e10) {
                Log.e("MR2Provider", "Could not send control request to service.", e10);
            }
        }
    }
}
