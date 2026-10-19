package p4;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$TransferCallback;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.fk0;
public final class j extends MediaRouter2$TransferCallback {
    public final k f44134a;

    public j(k kVar) {
        this.f44134a = kVar;
    }

    public final void onStop(MediaRouter2.RoutingController routingController) {
        k kVar = this.f44134a;
        q qVar = (q) kVar.v.remove(routingController);
        if (qVar != null) {
            e eVar = (e) kVar.f44141s.f15843b;
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
        this.f44134a.v.remove(routingController);
        if (routingController2 == this.f44134a.f44140r.getSystemController()) {
            e eVar = (e) this.f44134a.f44141s.f15843b;
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
        String id2 = fk0.d(selectedRoutes.get(0)).getId();
        this.f44134a.v.put(routingController2, new g(this.f44134a, routingController2, id2));
        e eVar2 = (e) this.f44134a.f44141s.f15843b;
        ArrayList arrayList = eVar2.f44095j;
        int size = arrayList.size();
        while (true) {
            if (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                vVar = (v) obj;
                if (vVar.c() == eVar2.f44103r && TextUtils.equals(id2, vVar.f44201b)) {
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
        this.f44134a.r(routingController2);
    }

    public final void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
        Log.w("MR2Provider", "Transfer failed. requestedRoute=" + mediaRoute2Info);
    }
}
