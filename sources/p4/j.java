package p4;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.sw0;
public final class j extends MediaRouter2.TransferCallback {
    public final k f43878a;

    public j(k kVar) {
        this.f43878a = kVar;
    }

    @Override
    public final void onStop(MediaRouter2.RoutingController routingController) {
        q qVar = (q) this.f43878a.v.remove(routingController);
        if (qVar != null) {
            e eVar = (e) this.f43878a.f43885s.f16319b;
            if (qVar == eVar.f43835e) {
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

    @Override
    public final void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
        v vVar;
        this.f43878a.v.remove(routingController);
        if (routingController2 == this.f43878a.f43884r.getSystemController()) {
            e eVar = (e) this.f43878a.f43885s.f16319b;
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
        String id2 = sw0.e(selectedRoutes.get(0)).getId();
        this.f43878a.v.put(routingController2, new g(this.f43878a, routingController2, id2));
        e eVar2 = (e) this.f43878a.f43885s.f16319b;
        ArrayList arrayList = eVar2.f43839j;
        int size = arrayList.size();
        while (true) {
            if (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                vVar = (v) obj;
                if (vVar.c() == eVar2.f43847r && TextUtils.equals(id2, vVar.f43952b)) {
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
        this.f43878a.r(routingController2);
    }

    @Override
    public final void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
        Log.w("MR2Provider", "Transfer failed. requestedRoute=" + mediaRoute2Info);
    }
}
