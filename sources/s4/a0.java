package s4;

import android.media.MediaRouter;
import android.os.Bundle;
import android.view.Display;
import java.util.ArrayList;
import java.util.HashSet;
public final class a0 extends MediaRouter.Callback {
    public final j0 f56964a;

    public a0(j0 j0Var) {
        this.f56964a = j0Var;
    }

    @Override
    public final void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        j0 j0Var = this.f56964a;
        if (j0Var.n(routeInfo)) {
            j0Var.y();
        }
    }

    @Override
    public final void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o4;
        String str;
        j0 j0Var = this.f56964a;
        j0Var.getClass();
        if (j0.s(routeInfo) == null && (o4 = j0Var.o(routeInfo)) >= 0) {
            h0 h0Var = (h0) j0Var.H.get(o4);
            String str2 = h0Var.f57012b;
            CharSequence name = h0Var.f57011a.getName(j0Var.f7238a);
            if (name != null) {
                str = name.toString();
            } else {
                str = "";
            }
            l lVar = new l(str2, str);
            j0Var.u(h0Var, lVar);
            h0Var.f57013c = lVar.b();
            j0Var.y();
        }
    }

    @Override
    public final void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i7) {
        this.f56964a.getClass();
    }

    @Override
    public final void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int i7;
        j0 j0Var = this.f56964a;
        int o4 = j0Var.o(routeInfo);
        if (o4 >= 0) {
            h0 h0Var = (h0) j0Var.H.get(o4);
            Display presentationDisplay = routeInfo.getPresentationDisplay();
            if (presentationDisplay != null) {
                i7 = presentationDisplay.getDisplayId();
            } else {
                i7 = -1;
            }
            if (i7 != h0Var.f57013c.f57034a.getInt("presentationDisplayId", -1)) {
                m mVar = h0Var.f57013c;
                new ArrayList();
                new ArrayList();
                new HashSet();
                if (mVar != null) {
                    Bundle bundle = new Bundle(mVar.f57034a);
                    ArrayList c10 = mVar.c();
                    ArrayList b10 = mVar.b();
                    HashSet a10 = mVar.a();
                    bundle.putInt("presentationDisplayId", i7);
                    bundle.putParcelableArrayList("controlFilters", new ArrayList<>(b10));
                    bundle.putStringArrayList("groupMemberIds", new ArrayList<>(c10));
                    bundle.putStringArrayList("allowedPackages", new ArrayList<>(a10));
                    h0Var.f57013c = new m(bundle);
                    j0Var.y();
                    return;
                }
                throw new IllegalArgumentException("descriptor must not be null");
            }
        }
    }

    @Override
    public final void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o4;
        j0 j0Var = this.f56964a;
        j0Var.getClass();
        if (j0.s(routeInfo) == null && (o4 = j0Var.o(routeInfo)) >= 0) {
            j0Var.H.remove(o4);
            j0Var.y();
        }
    }

    @Override
    public final void onRouteSelected(MediaRouter mediaRouter, int i7, MediaRouter.RouteInfo routeInfo) {
        v a10;
        j0 j0Var = this.f56964a;
        if (routeInfo == j0Var.f57020s.getSelectedRoute(8388611)) {
            i0 s5 = j0.s(routeInfo);
            if (s5 != null) {
                s5.f57016a.l();
                return;
            }
            int o4 = j0Var.o(routeInfo);
            if (o4 >= 0) {
                e eVar = j0Var.f57019r;
                String str = ((h0) j0Var.H.get(o4)).f57012b;
                eVar.f56972a.removeMessages(262);
                u d = eVar.d(eVar.f56988s);
                if (d != null && (a10 = d.a(str)) != null) {
                    a10.l();
                }
            }
        }
    }

    @Override
    public final void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
        this.f56964a.getClass();
    }

    @Override
    public final void onRouteUnselected(MediaRouter mediaRouter, int i7, MediaRouter.RouteInfo routeInfo) {
        this.f56964a.getClass();
    }

    @Override
    public final void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o4;
        j0 j0Var = this.f56964a;
        j0Var.getClass();
        if (j0.s(routeInfo) == null && (o4 = j0Var.o(routeInfo)) >= 0) {
            h0 h0Var = (h0) j0Var.H.get(o4);
            int volume = routeInfo.getVolume();
            if (volume != h0Var.f57013c.f57034a.getInt("volume")) {
                m mVar = h0Var.f57013c;
                new ArrayList();
                new ArrayList();
                new HashSet();
                if (mVar != null) {
                    Bundle bundle = new Bundle(mVar.f57034a);
                    ArrayList c10 = mVar.c();
                    ArrayList b10 = mVar.b();
                    HashSet a10 = mVar.a();
                    bundle.putInt("volume", volume);
                    bundle.putParcelableArrayList("controlFilters", new ArrayList<>(b10));
                    bundle.putStringArrayList("groupMemberIds", new ArrayList<>(c10));
                    bundle.putStringArrayList("allowedPackages", new ArrayList<>(a10));
                    h0Var.f57013c = new m(bundle);
                    j0Var.y();
                    return;
                }
                throw new IllegalArgumentException("descriptor must not be null");
            }
        }
    }
}
