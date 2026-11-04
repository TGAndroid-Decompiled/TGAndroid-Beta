package r4;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.media.MediaRouter;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import com.google.android.gms.internal.vision.g3;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.ui.Components.nh;
public class k0 extends l0 implements c0 {
    public static final ArrayList J;
    public static final ArrayList K;
    public int E;
    public boolean F;
    public boolean G;
    public final ArrayList H;
    public final ArrayList I;
    public final e f54309r;
    public final MediaRouter f54310s;
    public final b0 f54311w;
    public final MediaRouter.VolumeCallback f54312x;
    public final MediaRouter.RouteCategory f54313y;

    static {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addCategory("android.media.intent.category.LIVE_AUDIO");
        ArrayList arrayList = new ArrayList();
        J = arrayList;
        arrayList.add(intentFilter);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addCategory("android.media.intent.category.LIVE_VIDEO");
        ArrayList arrayList2 = new ArrayList();
        K = arrayList2;
        arrayList2.add(intentFilter2);
    }

    public k0(Context context, e eVar) {
        super(context, new nh(new ComponentName("android", l0.class.getName()), 15));
        this.H = new ArrayList();
        this.I = new ArrayList();
        this.f54309r = eVar;
        MediaRouter mediaRouter = (MediaRouter) context.getSystemService("media_router");
        this.f54310s = mediaRouter;
        this.f54311w = new b0(this);
        this.f54312x = e0.a(this);
        this.f54313y = mediaRouter.createRouteCategory((CharSequence) context.getResources().getString(2131689667), false);
        B();
    }

    public static j0 s(MediaRouter.RouteInfo routeInfo) {
        Object tag = routeInfo.getTag();
        if (tag instanceof j0) {
            return (j0) tag;
        }
        return null;
    }

    public void A() {
        boolean z10 = this.G;
        b0 b0Var = this.f54311w;
        MediaRouter mediaRouter = this.f54310s;
        if (z10) {
            mediaRouter.removeCallback(b0Var);
        }
        this.G = true;
        mediaRouter.addCallback(this.E, b0Var, (this.F ? 1 : 0) | 2);
    }

    public final void B() {
        A();
        MediaRouter mediaRouter = this.f54310s;
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        boolean z10 = false;
        for (int i3 = 0; i3 < routeCount; i3++) {
            arrayList.add(mediaRouter.getRouteAt(i3));
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            z10 |= n((MediaRouter.RouteInfo) obj);
        }
        if (z10) {
            y();
        }
    }

    public void C(j0 j0Var) {
        int i3;
        MediaRouter.UserRouteInfo userRouteInfo = j0Var.f54303b;
        w wVar = j0Var.f54302a;
        userRouteInfo.setName(wVar.d);
        userRouteInfo.setPlaybackType(wVar.f54381l);
        userRouteInfo.setPlaybackStream(wVar.f54382m);
        userRouteInfo.setVolume(wVar.f54385p);
        userRouteInfo.setVolumeMax(wVar.f54386q);
        if (wVar.e() && !y.g()) {
            i3 = 0;
        } else {
            i3 = wVar.f54384o;
        }
        userRouteInfo.setVolumeHandling(i3);
        userRouteInfo.setDescription(wVar.f54375e);
    }

    @Override
    public final void a(MediaRouter.RouteInfo routeInfo, int i3) {
        j0 s6 = s(routeInfo);
        if (s6 != null) {
            s6.f54302a.j(i3);
        }
    }

    @Override
    public final void b(MediaRouter.RouteInfo routeInfo, int i3) {
        j0 s6 = s(routeInfo);
        if (s6 != null) {
            s6.f54302a.k(i3);
        }
    }

    @Override
    public final q d(String str) {
        int p10 = p(str);
        if (p10 >= 0) {
            return new h0(((i0) this.H.get(p10)).f54298a);
        }
        return null;
    }

    @Override
    public final void f(n nVar) {
        boolean z10;
        int i3 = 0;
        if (nVar != null) {
            nVar.a();
            ArrayList c2 = nVar.f54321b.c();
            int size = c2.size();
            int i10 = 0;
            while (i3 < size) {
                String str = (String) c2.get(i3);
                if (str.equals("android.media.intent.category.LIVE_AUDIO")) {
                    i10 |= 1;
                } else if (str.equals("android.media.intent.category.LIVE_VIDEO")) {
                    i10 |= 2;
                } else {
                    i10 |= 8388608;
                }
                i3++;
            }
            z10 = nVar.b();
            i3 = i10;
        } else {
            z10 = false;
        }
        if (this.E == i3 && this.F == z10) {
            return;
        }
        this.E = i3;
        this.F = z10;
        B();
    }

    public final boolean n(MediaRouter.RouteInfo routeInfo) {
        String str;
        String format;
        String str2;
        if (s(routeInfo) != null || o(routeInfo) >= 0) {
            return false;
        }
        MediaRouter.RouteInfo r5 = r();
        String str3 = "";
        Context context = this.f7588a;
        if (r5 == routeInfo) {
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
            int i3 = 2;
            while (true) {
                Locale locale2 = Locale.US;
                str2 = format + "_" + i3;
                if (p(str2) < 0) {
                    break;
                }
                i3++;
            }
            format = str2;
        }
        i0 i0Var = new i0(routeInfo, format);
        CharSequence name2 = routeInfo.getName(context);
        if (name2 != null) {
            str3 = name2.toString();
        }
        l lVar = new l(format, str3);
        u(i0Var, lVar);
        i0Var.f54300c = lVar.b();
        this.H.add(i0Var);
        return true;
    }

    public final int o(MediaRouter.RouteInfo routeInfo) {
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((i0) arrayList.get(i3)).f54298a == routeInfo) {
                return i3;
            }
        }
        return -1;
    }

    public final int p(String str) {
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((i0) arrayList.get(i3)).f54299b.equals(str)) {
                return i3;
            }
        }
        return -1;
    }

    public final int q(w wVar) {
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            if (((j0) arrayList.get(i3)).f54302a == wVar) {
                return i3;
            }
        }
        return -1;
    }

    public MediaRouter.RouteInfo r() {
        return this.f54310s.getDefaultRoute();
    }

    public boolean t(i0 i0Var) {
        return i0Var.f54298a.isConnecting();
    }

    public void u(i0 i0Var, l lVar) {
        boolean z10;
        MediaRouter.RouteInfo routeInfo = i0Var.f54298a;
        int supportedTypes = routeInfo.getSupportedTypes();
        if ((supportedTypes & 1) != 0) {
            lVar.a(J);
        }
        if ((supportedTypes & 2) != 0) {
            lVar.a(K);
        }
        int playbackType = routeInfo.getPlaybackType();
        Bundle bundle = lVar.f54314a;
        Bundle bundle2 = lVar.f54314a;
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
        if (t(i0Var)) {
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

    public final void v(w wVar) {
        g3 c2 = wVar.c();
        MediaRouter mediaRouter = this.f54310s;
        if (c2 != this) {
            MediaRouter.UserRouteInfo createUserRoute = mediaRouter.createUserRoute(this.f54313y);
            j0 j0Var = new j0(wVar, createUserRoute);
            createUserRoute.setTag(j0Var);
            createUserRoute.setVolumeCallback(this.f54312x);
            C(j0Var);
            this.I.add(j0Var);
            mediaRouter.addUserRoute(createUserRoute);
            return;
        }
        int o10 = o(mediaRouter.getSelectedRoute(8388611));
        if (o10 >= 0 && ((i0) this.H.get(o10)).f54299b.equals(wVar.f54373b)) {
            wVar.l();
        }
    }

    public final void w(w wVar) {
        int q10;
        if (wVar.c() != this && (q10 = q(wVar)) >= 0) {
            MediaRouter.UserRouteInfo userRouteInfo = ((j0) this.I.remove(q10)).f54303b;
            userRouteInfo.setTag(null);
            userRouteInfo.setVolumeCallback(null);
            try {
                this.f54310s.removeUserRoute(userRouteInfo);
            } catch (IllegalArgumentException e10) {
                Log.w("AxSysMediaRouteProvider", "Failed to remove user route", e10);
            }
        }
    }

    public final void x(w wVar) {
        if (wVar.g()) {
            if (wVar.c() != this) {
                int q10 = q(wVar);
                if (q10 >= 0) {
                    z(((j0) this.I.get(q10)).f54303b);
                    return;
                }
                return;
            }
            int p10 = p(wVar.f54373b);
            if (p10 >= 0) {
                z(((i0) this.H.get(p10)).f54298a);
            }
        }
    }

    public final void y() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.H;
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            m mVar = ((i0) arrayList2.get(i3)).f54300c;
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
        g(new ba.i(arrayList, false));
    }

    public void z(MediaRouter.RouteInfo routeInfo) {
        this.f54310s.selectRoute(8388611, routeInfo);
    }
}
