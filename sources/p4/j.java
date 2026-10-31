package p4;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$TransferCallback;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
public final class j extends MediaRouter2$TransferCallback {
    public final k f44753a;

    public j(k kVar) {
        this.f44753a = kVar;
    }

    public final void onStop(MediaRouter2.RoutingController routingController) {
        k kVar = this.f44753a;
        q qVar = (q) kVar.f44758w.remove(routingController);
        if (qVar != null) {
            e eVar = (e) kVar.f44757s.f10700a;
            if (qVar == eVar.e) {
                w c10 = eVar.c();
                if (eVar.e() != c10) {
                    eVar.j(c10, 2);
                    return;
                }
                return;
            }
            int i10 = e.F;
            return;
        }
        Log.w("MR2Provider", "onStop: No matching routeController found. routingController=" + routingController);
    }

    public final void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
        w wVar;
        this.f44753a.f44758w.remove(routingController);
        if (routingController2 == this.f44753a.f44756r.getSystemController()) {
            e eVar = (e) this.f44753a.f44757s.f10700a;
            w c10 = eVar.c();
            if (eVar.e() != c10) {
                eVar.j(c10, 3);
                return;
            }
            return;
        }
        List<MediaRoute2Info> selectedRoutes = routingController2.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            Log.w("MR2Provider", "Selected routes are empty. This shouldn't happen.");
            return;
        }
        int i10 = 0;
        String id2 = org.telegram.utils.twidget.t.j(selectedRoutes.get(0)).getId();
        this.f44753a.f44758w.put(routingController2, new g(this.f44753a, routingController2, id2));
        e eVar2 = (e) this.f44753a.f44757s.f10700a;
        ArrayList arrayList = eVar2.f44716j;
        int size = arrayList.size();
        while (true) {
            if (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                wVar = (w) obj;
                if (wVar.c() == eVar2.f44724r && TextUtils.equals(id2, wVar.f44824b)) {
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
        this.f44753a.r(routingController2);
    }

    public final void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
        Log.w("MR2Provider", "Transfer failed. requestedRoute=" + mediaRoute2Info);
    }
}
