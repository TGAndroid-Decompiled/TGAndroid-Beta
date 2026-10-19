package p4;

import android.media.MediaRouter;
import android.os.Bundle;
import android.view.Display;
import java.util.ArrayList;
import java.util.HashSet;
public final class a0 extends MediaRouter.Callback {
    public final j0 f44079a;

    public a0(j0 j0Var) {
        this.f44079a = j0Var;
    }

    @Override
    public final void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        j0 j0Var = this.f44079a;
        if (j0Var.n(routeInfo)) {
            j0Var.y();
        }
    }

    @Override
    public final void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o10;
        String str;
        j0 j0Var = this.f44079a;
        j0Var.getClass();
        if (j0.s(routeInfo) == null && (o10 = j0Var.o(routeInfo)) >= 0) {
            h0 h0Var = (h0) j0Var.G.get(o10);
            String str2 = h0Var.f44126b;
            CharSequence name = h0Var.f44125a.getName(j0Var.f7280a);
            if (name != null) {
                str = name.toString();
            } else {
                str = "";
            }
            l lVar = new l(str2, str);
            j0Var.u(h0Var, lVar);
            h0Var.f44127c = lVar.b();
            j0Var.y();
        }
    }

    @Override
    public final void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i10) {
        this.f44079a.getClass();
    }

    @Override
    public final void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int i10;
        j0 j0Var = this.f44079a;
        int o10 = j0Var.o(routeInfo);
        if (o10 >= 0) {
            h0 h0Var = (h0) j0Var.G.get(o10);
            Display presentationDisplay = routeInfo.getPresentationDisplay();
            if (presentationDisplay != null) {
                i10 = presentationDisplay.getDisplayId();
            } else {
                i10 = -1;
            }
            if (i10 != h0Var.f44127c.f44148a.getInt("presentationDisplayId", -1)) {
                m mVar = h0Var.f44127c;
                new ArrayList();
                new ArrayList();
                new HashSet();
                if (mVar != null) {
                    Bundle bundle = new Bundle(mVar.f44148a);
                    ArrayList c10 = mVar.c();
                    ArrayList b10 = mVar.b();
                    HashSet a2 = mVar.a();
                    bundle.putInt("presentationDisplayId", i10);
                    bundle.putParcelableArrayList("controlFilters", new ArrayList<>(b10));
                    bundle.putStringArrayList("groupMemberIds", new ArrayList<>(c10));
                    bundle.putStringArrayList("allowedPackages", new ArrayList<>(a2));
                    h0Var.f44127c = new m(bundle);
                    j0Var.y();
                    return;
                }
                throw new IllegalArgumentException("descriptor must not be null");
            }
        }
    }

    @Override
    public final void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o10;
        j0 j0Var = this.f44079a;
        j0Var.getClass();
        if (j0.s(routeInfo) == null && (o10 = j0Var.o(routeInfo)) >= 0) {
            j0Var.G.remove(o10);
            j0Var.y();
        }
    }

    @Override
    public final void onRouteSelected(MediaRouter mediaRouter, int i10, MediaRouter.RouteInfo routeInfo) {
        v a2;
        j0 j0Var = this.f44079a;
        if (routeInfo == j0Var.f44134s.getSelectedRoute(8388611)) {
            i0 s10 = j0.s(routeInfo);
            if (s10 != null) {
                s10.f44130a.l();
                return;
            }
            int o10 = j0Var.o(routeInfo);
            if (o10 >= 0) {
                e eVar = j0Var.f44133r;
                String str = ((h0) j0Var.G.get(o10)).f44126b;
                eVar.f44087a.removeMessages(262);
                u d = eVar.d(eVar.f44102s);
                if (d != null && (a2 = d.a(str)) != null) {
                    a2.l();
                }
            }
        }
    }

    @Override
    public final void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
        this.f44079a.getClass();
    }

    @Override
    public final void onRouteUnselected(MediaRouter mediaRouter, int i10, MediaRouter.RouteInfo routeInfo) {
        this.f44079a.getClass();
    }

    @Override
    public final void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o10;
        j0 j0Var = this.f44079a;
        j0Var.getClass();
        if (j0.s(routeInfo) == null && (o10 = j0Var.o(routeInfo)) >= 0) {
            h0 h0Var = (h0) j0Var.G.get(o10);
            int volume = routeInfo.getVolume();
            if (volume != h0Var.f44127c.f44148a.getInt("volume")) {
                m mVar = h0Var.f44127c;
                new ArrayList();
                new ArrayList();
                new HashSet();
                if (mVar != null) {
                    Bundle bundle = new Bundle(mVar.f44148a);
                    ArrayList c10 = mVar.c();
                    ArrayList b10 = mVar.b();
                    HashSet a2 = mVar.a();
                    bundle.putInt("volume", volume);
                    bundle.putParcelableArrayList("controlFilters", new ArrayList<>(b10));
                    bundle.putStringArrayList("groupMemberIds", new ArrayList<>(c10));
                    bundle.putStringArrayList("allowedPackages", new ArrayList<>(a2));
                    h0Var.f44127c = new m(bundle);
                    j0Var.y();
                    return;
                }
                throw new IllegalArgumentException("descriptor must not be null");
            }
        }
    }
}
