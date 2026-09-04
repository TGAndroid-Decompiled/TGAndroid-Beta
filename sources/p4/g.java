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
    public final String f43831f;
    public final MediaRouter2.RoutingController f43832g;
    public final Messenger h;
    public final Messenger f43833i;
    public final Handler f43835k;
    public m f43839o;
    public final k f43840p;
    public final SparseArray f43834j = new SparseArray();
    public final AtomicInteger f43836l = new AtomicInteger(1);
    public final org.telegram.ui.web.b f43837m = new org.telegram.ui.web.b(this, 10);
    public int f43838n = -1;

    public g(k kVar, MediaRouter2.RoutingController routingController, String str) {
        Messenger messenger;
        this.f43840p = kVar;
        this.f43832g = routingController;
        this.f43831f = str;
        Messenger n10 = k.n(routingController);
        this.h = n10;
        if (n10 == null) {
            messenger = null;
        } else {
            messenger = new Messenger(new androidx.mediarouter.app.c(this));
        }
        this.f43833i = messenger;
        this.f43835k = new Handler(Looper.getMainLooper());
    }

    @Override
    public final void d() {
        this.f43832g.release();
    }

    @Override
    public final void f(int i10) {
        MediaRouter2.RoutingController routingController = this.f43832g;
        if (routingController == null) {
            return;
        }
        routingController.setVolume(i10);
        this.f43838n = i10;
        Handler handler = this.f43835k;
        org.telegram.ui.web.b bVar = this.f43837m;
        handler.removeCallbacks(bVar);
        handler.postDelayed(bVar, 1000L);
    }

    @Override
    public final void i(int i10) {
        MediaRouter2.RoutingController routingController = this.f43832g;
        if (routingController == null) {
            return;
        }
        int i11 = this.f43838n;
        if (i11 < 0) {
            i11 = routingController.getVolume();
        }
        int max = Math.max(0, Math.min(i11 + i10, this.f43832g.getVolumeMax()));
        this.f43838n = max;
        this.f43832g.setVolume(max);
        Handler handler = this.f43835k;
        org.telegram.ui.web.b bVar = this.f43837m;
        handler.removeCallbacks(bVar);
        handler.postDelayed(bVar, 1000L);
    }

    @Override
    public final void m(String str) {
        if (str != null && !str.isEmpty()) {
            MediaRoute2Info o9 = this.f43840p.o(str);
            if (o9 == null) {
                Log.w("MR2Provider", "onAddMemberRoute: Specified route not found. routeId=".concat(str));
                return;
            } else {
                this.f43832g.selectRoute(o9);
                return;
            }
        }
        Log.w("MR2Provider", "onAddMemberRoute: Ignoring null or empty routeId.");
    }

    @Override
    public final void n(String str) {
        if (str != null && !str.isEmpty()) {
            MediaRoute2Info o9 = this.f43840p.o(str);
            if (o9 == null) {
                Log.w("MR2Provider", "onRemoveMemberRoute: Specified route not found. routeId=".concat(str));
                return;
            } else {
                this.f43832g.deselectRoute(o9);
                return;
            }
        }
        Log.w("MR2Provider", "onRemoveMemberRoute: Ignoring null or empty routeId.");
    }

    @Override
    public final void o(List list) {
        if (list != null && !list.isEmpty()) {
            String str = (String) list.get(0);
            k kVar = this.f43840p;
            MediaRoute2Info o9 = kVar.o(str);
            if (o9 == null) {
                Log.w("MR2Provider", "onUpdateMemberRoutes: Specified route not found. routeId=" + str);
                return;
            }
            kVar.f43857r.transferTo(o9);
            return;
        }
        Log.w("MR2Provider", "onUpdateMemberRoutes: Ignoring null or empty routeIds.");
    }

    public final String p() {
        m mVar = this.f43839o;
        if (mVar != null) {
            return mVar.d();
        }
        return this.f43832g.getId();
    }

    public final void q(int i10, String str) {
        Messenger messenger;
        MediaRouter2.RoutingController routingController = this.f43832g;
        if (routingController != null && !routingController.isReleased() && (messenger = this.h) != null) {
            int andIncrement = this.f43836l.getAndIncrement();
            Message obtain = Message.obtain();
            obtain.what = 7;
            obtain.arg1 = andIncrement;
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i10);
            bundle.putString("routeId", str);
            obtain.setData(bundle);
            obtain.replyTo = this.f43833i;
            try {
                messenger.send(obtain);
            } catch (DeadObjectException unused) {
            } catch (RemoteException e7) {
                Log.e("MR2Provider", "Could not send control request to service.", e7);
            }
        }
    }

    public final void r(int i10, String str) {
        Messenger messenger;
        MediaRouter2.RoutingController routingController = this.f43832g;
        if (routingController != null && !routingController.isReleased() && (messenger = this.h) != null) {
            int andIncrement = this.f43836l.getAndIncrement();
            Message obtain = Message.obtain();
            obtain.what = 8;
            obtain.arg1 = andIncrement;
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i10);
            bundle.putString("routeId", str);
            obtain.setData(bundle);
            obtain.replyTo = this.f43833i;
            try {
                messenger.send(obtain);
            } catch (DeadObjectException unused) {
            } catch (RemoteException e7) {
                Log.e("MR2Provider", "Could not send control request to service.", e7);
            }
        }
    }
}
