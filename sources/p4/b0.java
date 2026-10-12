package p4;

import android.media.MediaRouter;
import android.os.Bundle;
import android.view.Display;
import java.util.ArrayList;
import java.util.HashSet;
public final class b0 extends MediaRouter.Callback {
    public final k0 f45209a;

    public b0(k0 k0Var) {
        this.f45209a = k0Var;
    }

    @Override
    public final void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        k0 k0Var = this.f45209a;
        if (k0Var.n(routeInfo)) {
            k0Var.y();
        }
    }

    @Override
    public final void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o9;
        String str;
        k0 k0Var = this.f45209a;
        k0Var.getClass();
        if (k0.s(routeInfo) == null && (o9 = k0Var.o(routeInfo)) >= 0) {
            i0 i0Var = (i0) k0Var.G.get(o9);
            String str2 = i0Var.f45256b;
            CharSequence name = i0Var.f45255a.getName(k0Var.f7541a);
            if (name != null) {
                str = name.toString();
            } else {
                str = "";
            }
            l lVar = new l(str2, str);
            k0Var.u(i0Var, lVar);
            i0Var.f45257c = lVar.b();
            k0Var.y();
        }
    }

    @Override
    public final void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i10) {
        this.f45209a.getClass();
    }

    @Override
    public final void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int i10;
        k0 k0Var = this.f45209a;
        int o9 = k0Var.o(routeInfo);
        if (o9 >= 0) {
            i0 i0Var = (i0) k0Var.G.get(o9);
            Display presentationDisplay = routeInfo.getPresentationDisplay();
            if (presentationDisplay != null) {
                i10 = presentationDisplay.getDisplayId();
            } else {
                i10 = -1;
            }
            if (i10 != i0Var.f45257c.f45274a.getInt("presentationDisplayId", -1)) {
                m mVar = i0Var.f45257c;
                new ArrayList();
                new ArrayList();
                new HashSet();
                if (mVar != null) {
                    Bundle bundle = new Bundle(mVar.f45274a);
                    ArrayList c10 = mVar.c();
                    ArrayList b10 = mVar.b();
                    HashSet a2 = mVar.a();
                    bundle.putInt("presentationDisplayId", i10);
                    bundle.putParcelableArrayList("controlFilters", new ArrayList<>(b10));
                    bundle.putStringArrayList("groupMemberIds", new ArrayList<>(c10));
                    bundle.putStringArrayList("allowedPackages", new ArrayList<>(a2));
                    i0Var.f45257c = new m(bundle);
                    k0Var.y();
                    return;
                }
                throw new IllegalArgumentException("descriptor must not be null");
            }
        }
    }

    @Override
    public final void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o9;
        k0 k0Var = this.f45209a;
        k0Var.getClass();
        if (k0.s(routeInfo) == null && (o9 = k0Var.o(routeInfo)) >= 0) {
            k0Var.G.remove(o9);
            k0Var.y();
        }
    }

    @Override
    public final void onRouteSelected(MediaRouter mediaRouter, int i10, MediaRouter.RouteInfo routeInfo) {
        w a2;
        k0 k0Var = this.f45209a;
        if (routeInfo == k0Var.f45267s.getSelectedRoute(8388611)) {
            j0 s10 = k0.s(routeInfo);
            if (s10 != null) {
                s10.f45259a.l();
                return;
            }
            int o9 = k0Var.o(routeInfo);
            if (o9 >= 0) {
                e eVar = k0Var.f45266r;
                String str = ((i0) k0Var.G.get(o9)).f45256b;
                eVar.f45214a.removeMessages(262);
                v d = eVar.d(eVar.f45230s);
                if (d != null && (a2 = d.a(str)) != null) {
                    a2.l();
                }
            }
        }
    }

    @Override
    public final void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
        this.f45209a.getClass();
    }

    @Override
    public final void onRouteUnselected(MediaRouter mediaRouter, int i10, MediaRouter.RouteInfo routeInfo) {
        this.f45209a.getClass();
    }

    @Override
    public final void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o9;
        k0 k0Var = this.f45209a;
        k0Var.getClass();
        if (k0.s(routeInfo) == null && (o9 = k0Var.o(routeInfo)) >= 0) {
            i0 i0Var = (i0) k0Var.G.get(o9);
            int volume = routeInfo.getVolume();
            if (volume != i0Var.f45257c.f45274a.getInt("volume")) {
                m mVar = i0Var.f45257c;
                new ArrayList();
                new ArrayList();
                new HashSet();
                if (mVar != null) {
                    Bundle bundle = new Bundle(mVar.f45274a);
                    ArrayList c10 = mVar.c();
                    ArrayList b10 = mVar.b();
                    HashSet a2 = mVar.a();
                    bundle.putInt("volume", volume);
                    bundle.putParcelableArrayList("controlFilters", new ArrayList<>(b10));
                    bundle.putStringArrayList("groupMemberIds", new ArrayList<>(c10));
                    bundle.putStringArrayList("allowedPackages", new ArrayList<>(a2));
                    i0Var.f45257c = new m(bundle);
                    k0Var.y();
                    return;
                }
                throw new IllegalArgumentException("descriptor must not be null");
            }
        }
    }
}
