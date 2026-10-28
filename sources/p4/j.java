package p4;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$TransferCallback;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.li1;
public final class j extends MediaRouter2$TransferCallback {
    public final k f46738a;

    public j(k kVar) {
        this.f46738a = kVar;
    }

    public final void onStop(MediaRouter2.RoutingController routingController) {
        k kVar = this.f46738a;
        q qVar = (q) kVar.v.remove(routingController);
        if (qVar != null) {
            e eVar = (e) kVar.f46745s.f15725a;
            if (qVar == eVar.e) {
                v c10 = eVar.c();
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
        v vVar;
        this.f46738a.v.remove(routingController);
        if (routingController2 == this.f46738a.f46744r.getSystemController()) {
            e eVar = (e) this.f46738a.f46745s.f15725a;
            v c10 = eVar.c();
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
        String id2 = li1.d(selectedRoutes.get(0)).getId();
        this.f46738a.v.put(routingController2, new g(this.f46738a, routingController2, id2));
        e eVar2 = (e) this.f46738a.f46745s.f15725a;
        ArrayList arrayList = eVar2.f46699j;
        int size = arrayList.size();
        while (true) {
            if (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                vVar = (v) obj;
                if (vVar.c() == eVar2.f46707r && TextUtils.equals(id2, vVar.f46805b)) {
                    break;
                }
            } else {
                vVar = null;
                break;
            }
        }
        if (vVar == null) {
            Log.w("GlobalMediaRouter", "onSelectRoute: The target RouteInfo is not found for descriptorId=" + id2);
        } else {
            eVar2.j(vVar, 3);
        }
        this.f46738a.r(routingController2);
    }

    public final void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
        Log.w("MR2Provider", "Transfer failed. requestedRoute=" + mediaRoute2Info);
    }
}
