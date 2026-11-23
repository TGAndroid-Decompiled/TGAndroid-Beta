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
import org.telegram.ui.web.z0;
public final class g extends p {
    public final String f57079f;
    public final MediaRouter2.RoutingController f57080g;
    public final Messenger h;
    public final Messenger f57081i;
    public final Handler f57083k;
    public m f57087o;
    public final k f57088p;
    public final SparseArray f57082j = new SparseArray();
    public final AtomicInteger f57084l = new AtomicInteger(1);
    public final z0 f57085m = new z0(this, 9);
    public int f57086n = -1;

    public g(k kVar, MediaRouter2.RoutingController routingController, String str) {
        Messenger messenger;
        this.f57088p = kVar;
        this.f57080g = routingController;
        this.f57079f = str;
        Messenger n10 = k.n(routingController);
        this.h = n10;
        if (n10 == null) {
            messenger = null;
        } else {
            messenger = new Messenger(new android.support.v4.media.session.q(this));
        }
        this.f57081i = messenger;
        this.f57083k = new Handler(Looper.getMainLooper());
    }

    @Override
    public final void d() {
        this.f57080g.release();
    }

    @Override
    public final void f(int i7) {
        MediaRouter2.RoutingController routingController = this.f57080g;
        if (routingController == null) {
            return;
        }
        routingController.setVolume(i7);
        this.f57086n = i7;
        Handler handler = this.f57083k;
        z0 z0Var = this.f57085m;
        handler.removeCallbacks(z0Var);
        handler.postDelayed(z0Var, 1000L);
    }

    @Override
    public final void i(int i7) {
        MediaRouter2.RoutingController routingController = this.f57080g;
        if (routingController == null) {
            return;
        }
        int i10 = this.f57086n;
        if (i10 < 0) {
            i10 = routingController.getVolume();
        }
        int max = Math.max(0, Math.min(i10 + i7, this.f57080g.getVolumeMax()));
        this.f57086n = max;
        this.f57080g.setVolume(max);
        Handler handler = this.f57083k;
        z0 z0Var = this.f57085m;
        handler.removeCallbacks(z0Var);
        handler.postDelayed(z0Var, 1000L);
    }

    @Override
    public final void m(String str) {
        if (str != null && !str.isEmpty()) {
            MediaRoute2Info o4 = this.f57088p.o(str);
            if (o4 == null) {
                Log.w("MR2Provider", "onAddMemberRoute: Specified route not found. routeId=".concat(str));
                return;
            } else {
                this.f57080g.selectRoute(o4);
                return;
            }
        }
        Log.w("MR2Provider", "onAddMemberRoute: Ignoring null or empty routeId.");
    }

    @Override
    public final void n(String str) {
        if (str != null && !str.isEmpty()) {
            MediaRoute2Info o4 = this.f57088p.o(str);
            if (o4 == null) {
                Log.w("MR2Provider", "onRemoveMemberRoute: Specified route not found. routeId=".concat(str));
                return;
            } else {
                this.f57080g.deselectRoute(o4);
                return;
            }
        }
        Log.w("MR2Provider", "onRemoveMemberRoute: Ignoring null or empty routeId.");
    }

    @Override
    public final void o(List list) {
        if (list != null && !list.isEmpty()) {
            String str = (String) list.get(0);
            k kVar = this.f57088p;
            MediaRoute2Info o4 = kVar.o(str);
            if (o4 == null) {
                Log.w("MR2Provider", "onUpdateMemberRoutes: Specified route not found. routeId=" + str);
                return;
            }
            kVar.f57105r.transferTo(o4);
            return;
        }
        Log.w("MR2Provider", "onUpdateMemberRoutes: Ignoring null or empty routeIds.");
    }

    public final String p() {
        m mVar = this.f57087o;
        if (mVar != null) {
            return mVar.d();
        }
        return this.f57080g.getId();
    }

    public final void q(int i7, String str) {
        Messenger messenger;
        MediaRouter2.RoutingController routingController = this.f57080g;
        if (routingController != null && !routingController.isReleased() && (messenger = this.h) != null) {
            int andIncrement = this.f57084l.getAndIncrement();
            Message obtain = Message.obtain();
            obtain.what = 7;
            obtain.arg1 = andIncrement;
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i7);
            bundle.putString("routeId", str);
            obtain.setData(bundle);
            obtain.replyTo = this.f57081i;
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
        MediaRouter2.RoutingController routingController = this.f57080g;
        if (routingController != null && !routingController.isReleased() && (messenger = this.h) != null) {
            int andIncrement = this.f57084l.getAndIncrement();
            Message obtain = Message.obtain();
            obtain.what = 8;
            obtain.arg1 = andIncrement;
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i7);
            bundle.putString("routeId", str);
            obtain.setData(bundle);
            obtain.replyTo = this.f57081i;
            try {
                messenger.send(obtain);
            } catch (DeadObjectException unused) {
            } catch (RemoteException e10) {
                Log.e("MR2Provider", "Could not send control request to service.", e10);
            }
        }
    }
}
