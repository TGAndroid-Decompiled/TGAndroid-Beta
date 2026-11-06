package s4;

import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$TransferCallback;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
public final class j extends MediaRouter2$TransferCallback {
    public final k f54741a;

    public j(k kVar) {
        this.f54741a = kVar;
    }

    public final void onStop(MediaRouter2.RoutingController routingController) {
        k kVar = this.f54741a;
        q qVar = (q) kVar.f54749w.remove(routingController);
        if (qVar != null) {
            e eVar = (e) kVar.f54748s.f37389b;
            if (qVar == eVar.f54698e) {
                v c10 = eVar.c();
                if (eVar.e() != c10) {
                    eVar.j(c10, 2);
                    return;
                }
                return;
            }
            int i7 = e.F;
            return;
        }
        Log.w("MR2Provider", "onStop: No matching routeController found. routingController=" + routingController);
    }

    public final void onTransfer(MediaRouter2.RoutingController routingController, MediaRouter2.RoutingController routingController2) {
        v vVar;
        this.f54741a.f54749w.remove(routingController);
        if (routingController2 == this.f54741a.f54747r.getSystemController()) {
            e eVar = (e) this.f54741a.f54748s.f37389b;
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
        int i7 = 0;
        String id2 = s0.b.d(selectedRoutes.get(0)).getId();
        this.f54741a.f54749w.put(routingController2, new g(this.f54741a, routingController2, id2));
        e eVar2 = (e) this.f54741a.f54748s.f37389b;
        ArrayList arrayList = eVar2.f54702j;
        int size = arrayList.size();
        while (true) {
            if (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                vVar = (v) obj;
                if (vVar.c() == eVar2.f54710r && TextUtils.equals(id2, vVar.f54809b)) {
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
        this.f54741a.r(routingController2);
    }

    public final void onTransferFailure(MediaRoute2Info mediaRoute2Info) {
        Log.w("MR2Provider", "Transfer failed. requestedRoute=" + mediaRoute2Info);
    }
}
