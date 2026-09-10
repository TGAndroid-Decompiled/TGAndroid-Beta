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
    public final String f39702f;
    public final MediaRouter2.RoutingController f39703g;
    public final Messenger h;
    public final Messenger f39704i;
    public final Handler f39706k;
    public m f39710o;
    public final k f39711p;
    public final SparseArray f39705j = new SparseArray();
    public final AtomicInteger f39707l = new AtomicInteger(1);
    public final org.telegram.ui.Components.voip.x f39708m = new org.telegram.ui.Components.voip.x(this, 19);
    public int f39709n = -1;

    public g(k kVar, MediaRouter2.RoutingController routingController, String str) {
        Messenger messenger;
        this.f39711p = kVar;
        this.f39703g = routingController;
        this.f39702f = str;
        Messenger n10 = k.n(routingController);
        this.h = n10;
        if (n10 == null) {
            messenger = null;
        } else {
            messenger = new Messenger(new androidx.mediarouter.app.c(this));
        }
        this.f39704i = messenger;
        this.f39706k = new Handler(Looper.getMainLooper());
    }

    @Override
    public final void d() {
        this.f39703g.release();
    }

    @Override
    public final void f(int i10) {
        MediaRouter2.RoutingController routingController = this.f39703g;
        if (routingController == null) {
            return;
        }
        routingController.setVolume(i10);
        this.f39709n = i10;
        Handler handler = this.f39706k;
        org.telegram.ui.Components.voip.x xVar = this.f39708m;
        handler.removeCallbacks(xVar);
        handler.postDelayed(xVar, 1000L);
    }

    @Override
    public final void i(int i10) {
        MediaRouter2.RoutingController routingController = this.f39703g;
        if (routingController == null) {
            return;
        }
        int i11 = this.f39709n;
        if (i11 < 0) {
            i11 = routingController.getVolume();
        }
        int max = Math.max(0, Math.min(i11 + i10, this.f39703g.getVolumeMax()));
        this.f39709n = max;
        this.f39703g.setVolume(max);
        Handler handler = this.f39706k;
        org.telegram.ui.Components.voip.x xVar = this.f39708m;
        handler.removeCallbacks(xVar);
        handler.postDelayed(xVar, 1000L);
    }

    @Override
    public final void m(String str) {
        if (str != null && !str.isEmpty()) {
            MediaRoute2Info o9 = this.f39711p.o(str);
            if (o9 == null) {
                Log.w("MR2Provider", "onAddMemberRoute: Specified route not found. routeId=".concat(str));
                return;
            } else {
                this.f39703g.selectRoute(o9);
                return;
            }
        }
        Log.w("MR2Provider", "onAddMemberRoute: Ignoring null or empty routeId.");
    }

    @Override
    public final void n(String str) {
        if (str != null && !str.isEmpty()) {
            MediaRoute2Info o9 = this.f39711p.o(str);
            if (o9 == null) {
                Log.w("MR2Provider", "onRemoveMemberRoute: Specified route not found. routeId=".concat(str));
                return;
            } else {
                this.f39703g.deselectRoute(o9);
                return;
            }
        }
        Log.w("MR2Provider", "onRemoveMemberRoute: Ignoring null or empty routeId.");
    }

    @Override
    public final void o(List list) {
        if (list != null && !list.isEmpty()) {
            String str = (String) list.get(0);
            k kVar = this.f39711p;
            MediaRoute2Info o9 = kVar.o(str);
            if (o9 == null) {
                Log.w("MR2Provider", "onUpdateMemberRoutes: Specified route not found. routeId=" + str);
                return;
            }
            kVar.f39728r.transferTo(o9);
            return;
        }
        Log.w("MR2Provider", "onUpdateMemberRoutes: Ignoring null or empty routeIds.");
    }

    public final String p() {
        m mVar = this.f39710o;
        if (mVar != null) {
            return mVar.d();
        }
        return this.f39703g.getId();
    }

    public final void q(int i10, String str) {
        Messenger messenger;
        MediaRouter2.RoutingController routingController = this.f39703g;
        if (routingController != null && !routingController.isReleased() && (messenger = this.h) != null) {
            int andIncrement = this.f39707l.getAndIncrement();
            Message obtain = Message.obtain();
            obtain.what = 7;
            obtain.arg1 = andIncrement;
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i10);
            bundle.putString("routeId", str);
            obtain.setData(bundle);
            obtain.replyTo = this.f39704i;
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
        MediaRouter2.RoutingController routingController = this.f39703g;
        if (routingController != null && !routingController.isReleased() && (messenger = this.h) != null) {
            int andIncrement = this.f39707l.getAndIncrement();
            Message obtain = Message.obtain();
            obtain.what = 8;
            obtain.arg1 = andIncrement;
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i10);
            bundle.putString("routeId", str);
            obtain.setData(bundle);
            obtain.replyTo = this.f39704i;
            try {
                messenger.send(obtain);
            } catch (DeadObjectException unused) {
            } catch (RemoteException e) {
                Log.e("MR2Provider", "Could not send control request to service.", e);
            }
        }
    }
}
