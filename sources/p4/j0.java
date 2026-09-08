package p4;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaRouter;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import com.google.android.gms.internal.vision.h3;
import java.util.ArrayList;
import java.util.Locale;
import ji.u4;
public class j0 extends k0 implements b0 {
    public static final ArrayList I;
    public static final ArrayList J;
    public boolean E;
    public boolean F;
    public final ArrayList G;
    public final ArrayList H;
    public final e f43879r;
    public final MediaRouter f43880s;
    public final a0 v;
    public final MediaRouter.VolumeCallback f43881w;
    public final MediaRouter.RouteCategory f43882x;
    public int f43883y;

    static {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
        ArrayList arrayList = new ArrayList();
        I = arrayList;
        arrayList.add(intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
        ArrayList arrayList2 = new ArrayList();
        J = arrayList2;
        arrayList2.add(intentFilter2);
    }

    public j0(Context context, e eVar) {
        super(context, new u4(new ComponentName("android", k0.class.getName()), 16));
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.f43879r = eVar;
        MediaRouter mediaRouter = (MediaRouter) context.getSystemService("media_router");
        this.f43880s = mediaRouter;
        this.v = new a0(this);
        this.f43881w = d0.a(this);
        this.f43882x = mediaRouter.createRouteCategory((CharSequence) context.getResources().getString(2131689666), false);
        B();
    }

    public static i0 s(MediaRouter.RouteInfo routeInfo) {
        Object tag = routeInfo.getTag();
        if (tag instanceof i0) {
            return (i0) tag;
        }
        return null;
    }

    public void A() {
        boolean z10 = this.F;
        a0 a0Var = this.v;
        MediaRouter mediaRouter = this.f43880s;
        if (z10) {
            mediaRouter.removeCallback(a0Var);
        }
        this.F = true;
        mediaRouter.addCallback(this.f43883y, a0Var, (this.E ? 1 : 0) | 2);
    }

    public final void B() {
        A();
        MediaRouter mediaRouter = this.f43880s;
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        boolean z10 = false;
        for (int i10 = 0; i10 < routeCount; i10++) {
            arrayList.add(mediaRouter.getRouteAt(i10));
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            z10 |= n((MediaRouter.RouteInfo) obj);
        }
        if (z10) {
            y();
        }
    }

    public void C(i0 i0Var) {
        int i10;
        MediaRouter.UserRouteInfo userRouteInfo = i0Var.f43877b;
        v vVar = i0Var.f43876a;
        userRouteInfo.setName(vVar.d);
        userRouteInfo.setPlaybackType(vVar.f43960l);
        userRouteInfo.setPlaybackStream(vVar.f43961m);
        userRouteInfo.setVolume(vVar.f43964p);
        userRouteInfo.setVolumeMax(vVar.f43965q);
        if (vVar.e() && !x.g()) {
            i10 = 0;
        } else {
            i10 = vVar.f43963o;
        }
        userRouteInfo.setVolumeHandling(i10);
        userRouteInfo.setDescription(vVar.f43954e);
    }

    @Override
    public final void a(MediaRouter.RouteInfo routeInfo, int i10) {
        i0 s10 = s(routeInfo);
        if (s10 != null) {
            s10.f43876a.j(i10);
        }
    }

    @Override
    public final void b(MediaRouter.RouteInfo routeInfo, int i10) {
        i0 s10 = s(routeInfo);
        if (s10 != null) {
            s10.f43876a.k(i10);
        }
    }

    @Override
    public final q d(String str) {
        int p5 = p(str);
        if (p5 >= 0) {
            return new g0(((h0) this.G.get(p5)).f43871a);
        }
        return null;
    }

    @Override
    public final void f(n nVar) {
        boolean z10;
        int i10 = 0;
        if (nVar != null) {
            nVar.a();
            ArrayList c10 = nVar.f43903b.c();
            int size = c10.size();
            int i11 = 0;
            while (i10 < size) {
                String str = (String) c10.get(i10);
                if (str.equals("android.media.intent.category.LIVE_AUDIO")) {
                    i11 |= 1;
                } else if (str.equals("android.media.intent.category.LIVE_VIDEO")) {
                    i11 |= 2;
                } else {
                    i11 |= 8388608;
                }
                i10++;
            }
            z10 = nVar.b();
            i10 = i11;
        } else {
            z10 = false;
        }
        if (this.f43883y == i10 && this.E == z10) {
            return;
        }
        this.f43883y = i10;
        this.E = z10;
        B();
    }

    public final boolean n(MediaRouter.RouteInfo routeInfo) {
        String str;
        String format;
        String str2;
        if (s(routeInfo) != null || o(routeInfo) >= 0) {
            return false;
        }
        MediaRouter.RouteInfo r10 = r();
        String str3 = "";
        Context context = this.f5992a;
        if (r10 == routeInfo) {
            format = "DEFAULT_ROUTE";
        } else {
            Locale locale = Locale.US;
            CharSequence name = routeInfo.getName(context);
            if (name == null) {
                str = "";
            } else {
                str = name.toString();
            }
            format = String.format(locale, "ROUTE_%08x", Integer.valueOf(str.hashCode()));
        }
        if (p(format) >= 0) {
            int i10 = 2;
            while (true) {
                Locale locale2 = Locale.US;
                str2 = format + "_" + i10;
                if (p(str2) < 0) {
                    break;
                }
                i10++;
            }
            format = str2;
        }
        h0 h0Var = new h0(routeInfo, format);
        CharSequence name2 = routeInfo.getName(context);
        if (name2 != null) {
            str3 = name2.toString();
        }
        l lVar = new l(format, str3);
        u(h0Var, lVar);
        h0Var.f43873c = lVar.b();
        this.G.add(h0Var);
        return true;
    }

    public final int o(MediaRouter.RouteInfo routeInfo) {
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((h0) arrayList.get(i10)).f43871a == routeInfo) {
                return i10;
            }
        }
        return -1;
    }

    public final int p(String str) {
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((h0) arrayList.get(i10)).f43872b.equals(str)) {
                return i10;
            }
        }
        return -1;
    }

    public final int q(v vVar) {
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((i0) arrayList.get(i10)).f43876a == vVar) {
                return i10;
            }
        }
        return -1;
    }

    public MediaRouter.RouteInfo r() {
        return this.f43880s.getDefaultRoute();
    }

    public boolean t(h0 h0Var) {
        return h0Var.f43871a.isConnecting();
    }

    public void u(h0 h0Var, l lVar) {
        boolean z10;
        MediaRouter.RouteInfo routeInfo = h0Var.f43871a;
        int supportedTypes = routeInfo.getSupportedTypes();
        if ((supportedTypes & 1) != 0) {
            lVar.a(I);
        }
        if ((supportedTypes & 2) != 0) {
            lVar.a(J);
        }
        int playbackType = routeInfo.getPlaybackType();
        Bundle bundle = lVar.f43889a;
        Bundle bundle2 = lVar.f43889a;
        bundle.putInt("playbackType", playbackType);
        bundle2.putInt("playbackStream", routeInfo.getPlaybackStream());
        bundle2.putInt("volume", routeInfo.getVolume());
        bundle2.putInt("volumeMax", routeInfo.getVolumeMax());
        bundle2.putInt("volumeHandling", routeInfo.getVolumeHandling());
        if ((supportedTypes & 8388608) == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        bundle2.putBoolean("isSystemRoute", z10);
        if (!routeInfo.isEnabled()) {
            bundle2.putBoolean("enabled", false);
        }
        if (t(h0Var)) {
            bundle2.putInt("connectionState", 1);
        }
        Display presentationDisplay = routeInfo.getPresentationDisplay();
        if (presentationDisplay != null) {
            bundle2.putInt("presentationDisplayId", presentationDisplay.getDisplayId());
        }
        CharSequence description = routeInfo.getDescription();
        if (description != null) {
            bundle2.putString("status", description.toString());
        }
    }

    public final void v(v vVar) {
        h3 c10 = vVar.c();
        MediaRouter mediaRouter = this.f43880s;
        if (c10 != this) {
            MediaRouter.UserRouteInfo createUserRoute = mediaRouter.createUserRoute(this.f43882x);
            i0 i0Var = new i0(vVar, createUserRoute);
            createUserRoute.setTag(i0Var);
            createUserRoute.setVolumeCallback(this.f43881w);
            C(i0Var);
            this.H.add(i0Var);
            mediaRouter.addUserRoute(createUserRoute);
            return;
        }
        int o9 = o(mediaRouter.getSelectedRoute(8388611));
        if (o9 >= 0 && ((h0) this.G.get(o9)).f43872b.equals(vVar.f43952b)) {
            vVar.l();
        }
    }

    public final void w(v vVar) {
        int q6;
        if (vVar.c() != this && (q6 = q(vVar)) >= 0) {
            MediaRouter.UserRouteInfo userRouteInfo = ((i0) this.H.remove(q6)).f43877b;
            userRouteInfo.setTag(null);
            userRouteInfo.setVolumeCallback(null);
            try {
                this.f43880s.removeUserRoute(userRouteInfo);
            } catch (IllegalArgumentException e7) {
                Log.w("AxSysMediaRouteProvider", "Failed to remove user route", e7);
            }
        }
    }

    public final void x(v vVar) {
        if (vVar.g()) {
            if (vVar.c() != this) {
                int q6 = q(vVar);
                if (q6 >= 0) {
                    z(((i0) this.H.get(q6)).f43877b);
                    return;
                }
                return;
            }
            int p5 = p(vVar.f43952b);
            if (p5 >= 0) {
                z(((h0) this.G.get(p5)).f43871a);
            }
        }
    }

    public final void y() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.G;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = ((h0) arrayList2.get(i10)).f43873c;
            if (mVar != null) {
                if (!arrayList.contains(mVar)) {
                    arrayList.add(mVar);
                } else {
                    throw new IllegalArgumentException("route descriptor already added");
                }
            } else {
                throw new IllegalArgumentException("route must not be null");
            }
        }
        g(new b2.p(arrayList, false));
    }

    public void z(MediaRouter.RouteInfo routeInfo) {
        this.f43880s.selectRoute(8388611, routeInfo);
    }
}
