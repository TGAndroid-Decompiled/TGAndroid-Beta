package r4;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$TransferCallback;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
public final class j extends MediaRouter2$TransferCallback {
    public final k f54301a;

    public j(k kVar) {
        this.f54301a = kVar;
    }

    public final void onStop(MediaRouter2.RoutingController routingController) {
        k kVar = this.f54301a;
        q qVar = (q) kVar.f54306w.remove(routingController);
        if (qVar != null) {
            e eVar = (e) kVar.f54305s.f34636b;
            if (qVar == eVar.f54260e) {
                w c2 = eVar.c();
                if (eVar.e() != c2) {
                    eVar.j(c2, 2);
                    return;
                }
                return;
            }
            int i3 = e.F;
            return;
        }
        Log.w("MR2Provider", "onStop: No matching routeController found. routingController=" + routingController);
    }

    public final void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
        w wVar;
        this.f54301a.f54306w.remove(routingController);
        if (routingController2 == this.f54301a.f54304r.getSystemController()) {
            e eVar = (e) this.f54301a.f54305s.f34636b;
            w c2 = eVar.c();
            if (eVar.e() != c2) {
                eVar.j(c2, 3);
                return;
            }
            return;
        }
        List<MediaRoute2Info> selectedRoutes = routingController2.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            Log.w("MR2Provider", "Selected routes are empty. This shouldn't happen.");
            return;
        }
        int i3 = 0;
        String id2 = org.telegram.utils.twidget.a.b(selectedRoutes.get(0)).getId();
        this.f54301a.f54306w.put(routingController2, new g(this.f54301a, routingController2, id2));
        e eVar2 = (e) this.f54301a.f54305s.f34636b;
        ArrayList arrayList = eVar2.f54264j;
        int size = arrayList.size();
        while (true) {
            if (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                wVar = (w) obj;
                if (wVar.c() == eVar2.f54272r && TextUtils.equals(id2, wVar.f54373b)) {
                    break;
                }
            } else {
                wVar = null;
                break;
            }
        }
        if (wVar == null) {
            Log.w("GlobalMediaRouter", "onSelectRoute: The target RouteInfo is not found for descriptorId=" + id2);
        } else {
            eVar2.j(wVar, 3);
        }
        this.f54301a.r(routingController2);
    }

    public final void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
        Log.w("MR2Provider", "Transfer failed. requestedRoute=" + mediaRoute2Info);
    }
}
