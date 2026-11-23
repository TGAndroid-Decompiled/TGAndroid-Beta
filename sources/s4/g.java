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
import org.telegram.ui.web.i1;
public final class g extends p {
    public final String f56963f;
    public final MediaRouter2.RoutingController f56964g;
    public final Messenger h;
    public final Messenger f56965i;
    public final Handler f56967k;
    public m f56971o;
    public final k f56972p;
    public final SparseArray f56966j = new SparseArray();
    public final AtomicInteger f56968l = new AtomicInteger(1);
    public final i1 f56969m = new i1(this, 8);
    public int f56970n = -1;

    public g(k kVar, MediaRouter2.RoutingController routingController, String str) {
        Messenger messenger;
        this.f56972p = kVar;
        this.f56964g = routingController;
        this.f56963f = str;
        Messenger n10 = k.n(routingController);
        this.h = n10;
        if (n10 == null) {
            messenger = null;
        } else {
            messenger = new Messenger(new android.support.v4.media.session.q(this));
        }
        this.f56965i = messenger;
        this.f56967k = new Handler(Looper.getMainLooper());
    }

    @Override
    public final void d() {
        this.f56964g.release();
    }

    @Override
    public final void f(int i7) {
        MediaRouter2.RoutingController routingController = this.f56964g;
        if (routingController == null) {
            return;
        }
        routingController.setVolume(i7);
        this.f56970n = i7;
        Handler handler = this.f56967k;
        i1 i1Var = this.f56969m;
        handler.removeCallbacks(i1Var);
        handler.postDelayed(i1Var, 1000L);
    }

    @Override
    public final void i(int i7) {
        MediaRouter2.RoutingController routingController = this.f56964g;
        if (routingController == null) {
            return;
        }
        int i10 = this.f56970n;
        if (i10 < 0) {
            i10 = routingController.getVolume();
        }
        int max = Math.max(0, Math.min(i10 + i7, this.f56964g.getVolumeMax()));
        this.f56970n = max;
        this.f56964g.setVolume(max);
        Handler handler = this.f56967k;
        i1 i1Var = this.f56969m;
        handler.removeCallbacks(i1Var);
        handler.postDelayed(i1Var, 1000L);
    }

    @Override
    public final void m(String str) {
        if (str != null && !str.isEmpty()) {
            MediaRoute2Info o4 = this.f56972p.o(str);
            if (o4 == null) {
                Log.w("MR2Provider", "onAddMemberRoute: Specified route not found. routeId=".concat(str));
                return;
            } else {
                this.f56964g.selectRoute(o4);
                return;
            }
        }
        Log.w("MR2Provider", "onAddMemberRoute: Ignoring null or empty routeId.");
    }

    @Override
    public final void n(String str) {
        if (str != null && !str.isEmpty()) {
            MediaRoute2Info o4 = this.f56972p.o(str);
            if (o4 == null) {
                Log.w("MR2Provider", "onRemoveMemberRoute: Specified route not found. routeId=".concat(str));
                return;
            } else {
                this.f56964g.deselectRoute(o4);
                return;
            }
        }
        Log.w("MR2Provider", "onRemoveMemberRoute: Ignoring null or empty routeId.");
    }

    @Override
    public final void o(List list) {
        if (list != null && !list.isEmpty()) {
            String str = (String) list.get(0);
            k kVar = this.f56972p;
            MediaRoute2Info o4 = kVar.o(str);
            if (o4 == null) {
                Log.w("MR2Provider", "onUpdateMemberRoutes: Specified route not found. routeId=" + str);
                return;
            }
            kVar.f56989r.transferTo(o4);
            return;
        }
        Log.w("MR2Provider", "onUpdateMemberRoutes: Ignoring null or empty routeIds.");
    }

    public final String p() {
        m mVar = this.f56971o;
        if (mVar != null) {
            return mVar.d();
        }
        return this.f56964g.getId();
    }

    public final void q(int i7, String str) {
        Messenger messenger;
        MediaRouter2.RoutingController routingController = this.f56964g;
        if (routingController != null && !routingController.isReleased() && (messenger = this.h) != null) {
            int andIncrement = this.f56968l.getAndIncrement();
            Message obtain = Message.obtain();
            obtain.what = 7;
            obtain.arg1 = andIncrement;
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i7);
            bundle.putString("routeId", str);
            obtain.setData(bundle);
            obtain.replyTo = this.f56965i;
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
        MediaRouter2.RoutingController routingController = this.f56964g;
        if (routingController != null && !routingController.isReleased() && (messenger = this.h) != null) {
            int andIncrement = this.f56968l.getAndIncrement();
            Message obtain = Message.obtain();
            obtain.what = 8;
            obtain.arg1 = andIncrement;
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i7);
            bundle.putString("routeId", str);
            obtain.setData(bundle);
            obtain.replyTo = this.f56965i;
            try {
                messenger.send(obtain);
            } catch (DeadObjectException unused) {
            } catch (RemoteException e10) {
                Log.e("MR2Provider", "Could not send control request to service.", e10);
            }
        }
    }
}
