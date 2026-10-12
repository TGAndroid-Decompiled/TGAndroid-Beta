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
import org.telegram.ui.Components.voip.m2;
public final class g extends p {
    public final String f43033f;
    public final MediaRouter2.RoutingController f43034g;
    public final Messenger h;
    public final Messenger f43035i;
    public final Handler f43037k;
    public m f43041o;
    public final k f43042p;
    public final SparseArray f43036j = new SparseArray();
    public final AtomicInteger f43038l = new AtomicInteger(1);
    public final m2 f43039m = new m2(this, 13);
    public int f43040n = -1;

    public g(k kVar, MediaRouter2.RoutingController routingController, String str) {
        Messenger messenger;
        this.f43042p = kVar;
        this.f43034g = routingController;
        this.f43033f = str;
        Messenger n10 = k.n(routingController);
        this.h = n10;
        if (n10 == null) {
            messenger = null;
        } else {
            messenger = new Messenger(new ab.o0(this));
        }
        this.f43035i = messenger;
        this.f43037k = new Handler(Looper.getMainLooper());
    }

    @Override
    public final void d() {
        this.f43034g.release();
    }

    @Override
    public final void f(int i10) {
        MediaRouter2.RoutingController routingController = this.f43034g;
        if (routingController == null) {
            return;
        }
        routingController.setVolume(i10);
        this.f43040n = i10;
        Handler handler = this.f43037k;
        m2 m2Var = this.f43039m;
        handler.removeCallbacks(m2Var);
        handler.postDelayed(m2Var, 1000L);
    }

    @Override
    public final void i(int i10) {
        MediaRouter2.RoutingController routingController = this.f43034g;
        if (routingController == null) {
            return;
        }
        int i11 = this.f43040n;
        if (i11 < 0) {
            i11 = routingController.getVolume();
        }
        int max = Math.max(0, Math.min(i11 + i10, this.f43034g.getVolumeMax()));
        this.f43040n = max;
        this.f43034g.setVolume(max);
        Handler handler = this.f43037k;
        m2 m2Var = this.f43039m;
        handler.removeCallbacks(m2Var);
        handler.postDelayed(m2Var, 1000L);
    }

    @Override
    public final void m(String str) {
        if (str != null && !str.isEmpty()) {
            MediaRoute2Info o10 = this.f43042p.o(str);
            if (o10 == null) {
                Log.w("MR2Provider", "onAddMemberRoute: Specified route not found. routeId=".concat(str));
                return;
            } else {
                this.f43034g.selectRoute(o10);
                return;
            }
        }
        Log.w("MR2Provider", "onAddMemberRoute: Ignoring null or empty routeId.");
    }

    @Override
    public final void n(String str) {
        if (str != null && !str.isEmpty()) {
            MediaRoute2Info o10 = this.f43042p.o(str);
            if (o10 == null) {
                Log.w("MR2Provider", "onRemoveMemberRoute: Specified route not found. routeId=".concat(str));
                return;
            } else {
                this.f43034g.deselectRoute(o10);
                return;
            }
        }
        Log.w("MR2Provider", "onRemoveMemberRoute: Ignoring null or empty routeId.");
    }

    @Override
    public final void o(List list) {
        if (list != null && !list.isEmpty()) {
            String str = (String) list.get(0);
            k kVar = this.f43042p;
            MediaRoute2Info o10 = kVar.o(str);
            if (o10 == null) {
                Log.w("MR2Provider", "onUpdateMemberRoutes: Specified route not found. routeId=" + str);
                return;
            }
            kVar.f43054r.transferTo(o10);
            return;
        }
        Log.w("MR2Provider", "onUpdateMemberRoutes: Ignoring null or empty routeIds.");
    }

    public final String p() {
        m mVar = this.f43041o;
        if (mVar != null) {
            return mVar.d();
        }
        return this.f43034g.getId();
    }

    public final void q(int i10, String str) {
        Messenger messenger;
        MediaRouter2.RoutingController routingController = this.f43034g;
        if (routingController != null && !routingController.isReleased() && (messenger = this.h) != null) {
            int andIncrement = this.f43038l.getAndIncrement();
            Message obtain = Message.obtain();
            obtain.what = 7;
            obtain.arg1 = andIncrement;
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i10);
            bundle.putString("routeId", str);
            obtain.setData(bundle);
            obtain.replyTo = this.f43035i;
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
        MediaRouter2.RoutingController routingController = this.f43034g;
        if (routingController != null && !routingController.isReleased() && (messenger = this.h) != null) {
            int andIncrement = this.f43038l.getAndIncrement();
            Message obtain = Message.obtain();
            obtain.what = 8;
            obtain.arg1 = andIncrement;
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i10);
            bundle.putString("routeId", str);
            obtain.setData(bundle);
            obtain.replyTo = this.f43035i;
            try {
                messenger.send(obtain);
            } catch (DeadObjectException unused) {
            } catch (RemoteException e) {
                Log.e("MR2Provider", "Could not send control request to service.", e);
            }
        }
    }
}
