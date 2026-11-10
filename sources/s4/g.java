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
import org.telegram.ui.ActionBar.p5;
public final class g extends p {
    public final String f54825f;
    public final MediaRouter2.RoutingController f54826g;
    public final Messenger h;
    public final Messenger f54827i;
    public final Handler f54829k;
    public m f54833o;
    public final k f54834p;
    public final SparseArray f54828j = new SparseArray();
    public final AtomicInteger f54830l = new AtomicInteger(1);
    public final p5 f54831m = new p5(this, 24);
    public int f54832n = -1;

    public g(k kVar, MediaRouter2.RoutingController routingController, String str) {
        Messenger messenger;
        this.f54834p = kVar;
        this.f54826g = routingController;
        this.f54825f = str;
        Messenger n10 = k.n(routingController);
        this.h = n10;
        if (n10 == null) {
            messenger = null;
        } else {
            messenger = new Messenger(new android.support.v4.media.session.q(this));
        }
        this.f54827i = messenger;
        this.f54829k = new Handler(Looper.getMainLooper());
    }

    @Override
    public final void d() {
        this.f54826g.release();
    }

    @Override
    public final void f(int i7) {
        MediaRouter2.RoutingController routingController = this.f54826g;
        if (routingController == null) {
            return;
        }
        routingController.setVolume(i7);
        this.f54832n = i7;
        Handler handler = this.f54829k;
        p5 p5Var = this.f54831m;
        handler.removeCallbacks(p5Var);
        handler.postDelayed(p5Var, 1000L);
    }

    @Override
    public final void i(int i7) {
        MediaRouter2.RoutingController routingController = this.f54826g;
        if (routingController == null) {
            return;
        }
        int i10 = this.f54832n;
        if (i10 < 0) {
            i10 = routingController.getVolume();
        }
        int max = Math.max(0, Math.min(i10 + i7, this.f54826g.getVolumeMax()));
        this.f54832n = max;
        this.f54826g.setVolume(max);
        Handler handler = this.f54829k;
        p5 p5Var = this.f54831m;
        handler.removeCallbacks(p5Var);
        handler.postDelayed(p5Var, 1000L);
    }

    @Override
    public final void m(String str) {
        if (str != null && !str.isEmpty()) {
            MediaRoute2Info o4 = this.f54834p.o(str);
            if (o4 == null) {
                Log.w("MR2Provider", "onAddMemberRoute: Specified route not found. routeId=".concat(str));
                return;
            } else {
                this.f54826g.selectRoute(o4);
                return;
            }
        }
        Log.w("MR2Provider", "onAddMemberRoute: Ignoring null or empty routeId.");
    }

    @Override
    public final void n(String str) {
        if (str != null && !str.isEmpty()) {
            MediaRoute2Info o4 = this.f54834p.o(str);
            if (o4 == null) {
                Log.w("MR2Provider", "onRemoveMemberRoute: Specified route not found. routeId=".concat(str));
                return;
            } else {
                this.f54826g.deselectRoute(o4);
                return;
            }
        }
        Log.w("MR2Provider", "onRemoveMemberRoute: Ignoring null or empty routeId.");
    }

    @Override
    public final void o(List list) {
        if (list != null && !list.isEmpty()) {
            String str = (String) list.get(0);
            k kVar = this.f54834p;
            MediaRoute2Info o4 = kVar.o(str);
            if (o4 == null) {
                Log.w("MR2Provider", "onUpdateMemberRoutes: Specified route not found. routeId=" + str);
                return;
            }
            kVar.f54851r.transferTo(o4);
            return;
        }
        Log.w("MR2Provider", "onUpdateMemberRoutes: Ignoring null or empty routeIds.");
    }

    public final String p() {
        m mVar = this.f54833o;
        if (mVar != null) {
            return mVar.d();
        }
        return this.f54826g.getId();
    }

    public final void q(int i7, String str) {
        Messenger messenger;
        MediaRouter2.RoutingController routingController = this.f54826g;
        if (routingController != null && !routingController.isReleased() && (messenger = this.h) != null) {
            int andIncrement = this.f54830l.getAndIncrement();
            Message obtain = Message.obtain();
            obtain.what = 7;
            obtain.arg1 = andIncrement;
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i7);
            bundle.putString("routeId", str);
            obtain.setData(bundle);
            obtain.replyTo = this.f54827i;
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
        MediaRouter2.RoutingController routingController = this.f54826g;
        if (routingController != null && !routingController.isReleased() && (messenger = this.h) != null) {
            int andIncrement = this.f54830l.getAndIncrement();
            Message obtain = Message.obtain();
            obtain.what = 8;
            obtain.arg1 = andIncrement;
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i7);
            bundle.putString("routeId", str);
            obtain.setData(bundle);
            obtain.replyTo = this.f54827i;
            try {
                messenger.send(obtain);
            } catch (DeadObjectException unused) {
            } catch (RemoteException e10) {
                Log.e("MR2Provider", "Could not send control request to service.", e10);
            }
        }
    }
}
