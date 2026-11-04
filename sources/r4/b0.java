package r4;

import android.media.MediaRouter;
import android.os.Bundle;
import android.view.Display;
import java.util.ArrayList;
import java.util.HashSet;
public final class b0 extends MediaRouter.Callback {
    public final k0 f54252a;

    public b0(k0 k0Var) {
        this.f54252a = k0Var;
    }

    @Override
    public final void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        k0 k0Var = this.f54252a;
        if (k0Var.n(routeInfo)) {
            k0Var.y();
        }
    }

    @Override
    public final void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o10;
        String str;
        k0 k0Var = this.f54252a;
        k0Var.getClass();
        if (k0.s(routeInfo) == null && (o10 = k0Var.o(routeInfo)) >= 0) {
            i0 i0Var = (i0) k0Var.H.get(o10);
            String str2 = i0Var.f54299b;
            CharSequence name = i0Var.f54298a.getName(k0Var.f7588a);
            if (name != null) {
                str = name.toString();
            } else {
                str = "";
            }
            l lVar = new l(str2, str);
            k0Var.u(i0Var, lVar);
            i0Var.f54300c = lVar.b();
            k0Var.y();
        }
    }

    @Override
    public final void onRouteGrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup, int i3) {
        this.f54252a.getClass();
    }

    @Override
    public final void onRoutePresentationDisplayChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int i3;
        k0 k0Var = this.f54252a;
        int o10 = k0Var.o(routeInfo);
        if (o10 >= 0) {
            i0 i0Var = (i0) k0Var.H.get(o10);
            Display presentationDisplay = routeInfo.getPresentationDisplay();
            if (presentationDisplay != null) {
                i3 = presentationDisplay.getDisplayId();
            } else {
                i3 = -1;
            }
            if (i3 != i0Var.f54300c.f54317a.getInt("presentationDisplayId", -1)) {
                m mVar = i0Var.f54300c;
                new ArrayList();
                new ArrayList();
                new HashSet();
                if (mVar != null) {
                    Bundle bundle = new Bundle(mVar.f54317a);
                    ArrayList c2 = mVar.c();
                    ArrayList b10 = mVar.b();
                    HashSet a10 = mVar.a();
                    bundle.putInt("presentationDisplayId", i3);
                    bundle.putParcelableArrayList("controlFilters", new ArrayList<>(b10));
                    bundle.putStringArrayList("groupMemberIds", new ArrayList<>(c2));
                    bundle.putStringArrayList("allowedPackages", new ArrayList<>(a10));
                    i0Var.f54300c = new m(bundle);
                    k0Var.y();
                    return;
                }
                throw new IllegalArgumentException("descriptor must not be null");
            }
        }
    }

    @Override
    public final void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o10;
        k0 k0Var = this.f54252a;
        k0Var.getClass();
        if (k0.s(routeInfo) == null && (o10 = k0Var.o(routeInfo)) >= 0) {
            k0Var.H.remove(o10);
            k0Var.y();
        }
    }

    @Override
    public final void onRouteSelected(MediaRouter mediaRouter, int i3, MediaRouter.RouteInfo routeInfo) {
        w a10;
        k0 k0Var = this.f54252a;
        if (routeInfo == k0Var.f54310s.getSelectedRoute(8388611)) {
            j0 s6 = k0.s(routeInfo);
            if (s6 != null) {
                s6.f54302a.l();
                return;
            }
            int o10 = k0Var.o(routeInfo);
            if (o10 >= 0) {
                e eVar = k0Var.f54309r;
                String str = ((i0) k0Var.H.get(o10)).f54299b;
                eVar.f54257a.removeMessages(262);
                v d = eVar.d(eVar.f54273s);
                if (d != null && (a10 = d.a(str)) != null) {
                    a10.l();
                }
            }
        }
    }

    @Override
    public final void onRouteUngrouped(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo, MediaRouter.RouteGroup routeGroup) {
        this.f54252a.getClass();
    }

    @Override
    public final void onRouteUnselected(MediaRouter mediaRouter, int i3, MediaRouter.RouteInfo routeInfo) {
        this.f54252a.getClass();
    }

    @Override
    public final void onRouteVolumeChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
        int o10;
        k0 k0Var = this.f54252a;
        k0Var.getClass();
        if (k0.s(routeInfo) == null && (o10 = k0Var.o(routeInfo)) >= 0) {
            i0 i0Var = (i0) k0Var.H.get(o10);
            int volume = routeInfo.getVolume();
            if (volume != i0Var.f54300c.f54317a.getInt("volume")) {
                m mVar = i0Var.f54300c;
                new ArrayList();
                new ArrayList();
                new HashSet();
                if (mVar != null) {
                    Bundle bundle = new Bundle(mVar.f54317a);
                    ArrayList c2 = mVar.c();
                    ArrayList b10 = mVar.b();
                    HashSet a10 = mVar.a();
                    bundle.putInt("volume", volume);
                    bundle.putParcelableArrayList("controlFilters", new ArrayList<>(b10));
                    bundle.putStringArrayList("groupMemberIds", new ArrayList<>(c2));
                    bundle.putStringArrayList("allowedPackages", new ArrayList<>(a10));
                    i0Var.f54300c = new m(bundle);
                    k0Var.y();
                    return;
                }
                throw new IllegalArgumentException("descriptor must not be null");
            }
        }
    }
}
