package p4;

import android.media.MediaRouter;
import android.os.Bundle;
import android.view.Display;
import java.util.ArrayList;
import java.util.HashSet;
public final class a0 extends MediaRouter.Callback {
    public final j0 f43824a;

    public a0(j0 j0Var) {
        this.f43824a = j0Var;
    }

    @Override
    public final void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        j0 j0Var = this.f43824a;
        if (j0Var.n(routeInfo)) {
            j0Var.y();
        }
    }

    @Override
    public final void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o9;
        String str;
        j0 j0Var = this.f43824a;
        j0Var.getClass();
        if (j0.s(routeInfo) == null && (o9 = j0Var.o(routeInfo)) >= 0) {
            h0 h0Var = (h0) j0Var.G.get(o9);
            String str2 = h0Var.f43872b;
            CharSequence name = h0Var.f43871a.getName(j0Var.f5992a);
            if (name != null) {
                str = name.toString();
            } else {
                str = "";
            }
            l lVar = new l(str2, str);
            j0Var.u(h0Var, lVar);
            h0Var.f43873c = lVar.b();
            j0Var.y();
        }
    }

    @Override
    public final void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i10) {
        this.f43824a.getClass();
    }

    @Override
    public final void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int i10;
        j0 j0Var = this.f43824a;
        int o9 = j0Var.o(routeInfo);
        if (o9 >= 0) {
            h0 h0Var = (h0) j0Var.G.get(o9);
            Display presentationDisplay = routeInfo.getPresentationDisplay();
            if (presentationDisplay != null) {
                i10 = presentationDisplay.getDisplayId();
            } else {
                i10 = -1;
            }
            if (i10 != h0Var.f43873c.f43894a.getInt("presentationDisplayId", -1)) {
                m mVar = h0Var.f43873c;
                new ArrayList();
                new ArrayList();
                new HashSet();
                if (mVar != null) {
                    Bundle bundle = new Bundle(mVar.f43894a);
                    ArrayList c10 = mVar.c();
                    ArrayList b10 = mVar.b();
                    HashSet a2 = mVar.a();
                    bundle.putInt("presentationDisplayId", i10);
                    bundle.putParcelableArrayList("controlFilters", new ArrayList<>(b10));
                    bundle.putStringArrayList("groupMemberIds", new ArrayList<>(c10));
                    bundle.putStringArrayList("allowedPackages", new ArrayList<>(a2));
                    h0Var.f43873c = new m(bundle);
                    j0Var.y();
                    return;
                }
                throw new IllegalArgumentException("descriptor must not be null");
            }
        }
    }

    @Override
    public final void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o9;
        j0 j0Var = this.f43824a;
        j0Var.getClass();
        if (j0.s(routeInfo) == null && (o9 = j0Var.o(routeInfo)) >= 0) {
            j0Var.G.remove(o9);
            j0Var.y();
        }
    }

    @Override
    public final void onRouteSelected(MediaRouter mediaRouter, int i10, MediaRouter.RouteInfo routeInfo) {
        v a2;
        j0 j0Var = this.f43824a;
        if (routeInfo == j0Var.f43880s.getSelectedRoute(8388611)) {
            i0 s10 = j0.s(routeInfo);
            if (s10 != null) {
                s10.f43876a.l();
                return;
            }
            int o9 = j0Var.o(routeInfo);
            if (o9 >= 0) {
                e eVar = j0Var.f43879r;
                String str = ((h0) j0Var.G.get(o9)).f43872b;
                eVar.f43832a.removeMessages(262);
                u d = eVar.d(eVar.f43848s);
                if (d != null && (a2 = d.a(str)) != null) {
                    a2.l();
                }
            }
        }
    }

    @Override
    public final void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
        this.f43824a.getClass();
    }

    @Override
    public final void onRouteUnselected(MediaRouter mediaRouter, int i10, MediaRouter.RouteInfo routeInfo) {
        this.f43824a.getClass();
    }

    @Override
    public final void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o9;
        j0 j0Var = this.f43824a;
        j0Var.getClass();
        if (j0.s(routeInfo) == null && (o9 = j0Var.o(routeInfo)) >= 0) {
            h0 h0Var = (h0) j0Var.G.get(o9);
            int volume = routeInfo.getVolume();
            if (volume != h0Var.f43873c.f43894a.getInt("volume")) {
                m mVar = h0Var.f43873c;
                new ArrayList();
                new ArrayList();
                new HashSet();
                if (mVar != null) {
                    Bundle bundle = new Bundle(mVar.f43894a);
                    ArrayList c10 = mVar.c();
                    ArrayList b10 = mVar.b();
                    HashSet a2 = mVar.a();
                    bundle.putInt("volume", volume);
                    bundle.putParcelableArrayList("controlFilters", new ArrayList<>(b10));
                    bundle.putStringArrayList("groupMemberIds", new ArrayList<>(c10));
                    bundle.putStringArrayList("allowedPackages", new ArrayList<>(a2));
                    h0Var.f43873c = new m(bundle);
                    j0Var.y();
                    return;
                }
                throw new IllegalArgumentException("descriptor must not be null");
            }
        }
    }
}
