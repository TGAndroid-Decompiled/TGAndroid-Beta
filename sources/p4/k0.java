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
public class k0 extends l0 implements c0 {
    public static final ArrayList I;
    public static final ArrayList J;
    public boolean E;
    public boolean F;
    public final ArrayList G;
    public final ArrayList H;
    public final e f45266r;
    public final MediaRouter f45267s;
    public final b0 v;
    public final MediaRouter.VolumeCallback f45268w;
    public final MediaRouter.RouteCategory f45269x;
    public int f45270y;

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

    public k0(Context context, e eVar) {
        super(context, new k2.g0(new ComponentName("android", l0.class.getName()), 17));
        this.G = new ArrayList();
        this.H = new ArrayList();
        this.f45266r = eVar;
        MediaRouter mediaRouter = (MediaRouter) context.getSystemService("media_router");
        this.f45267s = mediaRouter;
        this.v = new b0(this);
        this.f45268w = e0.a(this);
        this.f45269x = mediaRouter.createRouteCategory((CharSequence) context.getResources().getString(2131689666), false);
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
        boolean z10 = this.F;
        b0 b0Var = this.v;
        MediaRouter mediaRouter = this.f45267s;
        if (z10) {
            mediaRouter.removeCallback(b0Var);
        }
        this.F = true;
        mediaRouter.addCallback(this.f45270y, b0Var, (this.E ? 1 : 0) | 2);
    }

    public final void B() {
        A();
        MediaRouter mediaRouter = this.f45267s;
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

    public void C(j0 j0Var) {
        int i10;
        MediaRouter.UserRouteInfo userRouteInfo = j0Var.f45260b;
        w wVar = j0Var.f45259a;
        userRouteInfo.setName(wVar.d);
        userRouteInfo.setPlaybackType(wVar.f45345l);
        userRouteInfo.setPlaybackStream(wVar.f45346m);
        userRouteInfo.setVolume(wVar.f45349p);
        userRouteInfo.setVolumeMax(wVar.f45350q);
        if (wVar.e() && !y.g()) {
            i10 = 0;
        } else {
            i10 = wVar.f45348o;
        }
        userRouteInfo.setVolumeHandling(i10);
        userRouteInfo.setDescription(wVar.f45339e);
    }

    @Override
    public final void a(MediaRouter.RouteInfo routeInfo, int i10) {
        j0 s10 = s(routeInfo);
        if (s10 != null) {
            s10.f45259a.j(i10);
        }
    }

    @Override
    public final void b(MediaRouter.RouteInfo routeInfo, int i10) {
        j0 s10 = s(routeInfo);
        if (s10 != null) {
            s10.f45259a.k(i10);
        }
    }

    @Override
    public final q d(String str) {
        int p5 = p(str);
        if (p5 >= 0) {
            return new h0(((i0) this.G.get(p5)).f45255a);
        }
        return null;
    }

    @Override
    public final void f(n nVar) {
        boolean z10;
        int i10 = 0;
        if (nVar != null) {
            nVar.a();
            ArrayList c10 = nVar.f45278b.c();
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
        if (this.f45270y == i10 && this.E == z10) {
            return;
        }
        this.f45270y = i10;
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
        Context context = this.f7541a;
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
        i0 i0Var = new i0(routeInfo, format);
        CharSequence name2 = routeInfo.getName(context);
        if (name2 != null) {
            str3 = name2.toString();
        }
        l lVar = new l(format, str3);
        u(i0Var, lVar);
        i0Var.f45257c = lVar.b();
        this.G.add(i0Var);
        return true;
    }

    public final int o(MediaRouter.RouteInfo routeInfo) {
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((i0) arrayList.get(i10)).f45255a == routeInfo) {
                return i10;
            }
        }
        return -1;
    }

    public final int p(String str) {
        ArrayList arrayList = this.G;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((i0) arrayList.get(i10)).f45256b.equals(str)) {
                return i10;
            }
        }
        return -1;
    }

    public final int q(w wVar) {
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((j0) arrayList.get(i10)).f45259a == wVar) {
                return i10;
            }
        }
        return -1;
    }

    public MediaRouter.RouteInfo r() {
        return this.f45267s.getDefaultRoute();
    }

    public boolean t(i0 i0Var) {
        return i0Var.f45255a.isConnecting();
    }

    public void u(i0 i0Var, l lVar) {
        boolean z10;
        MediaRouter.RouteInfo routeInfo = i0Var.f45255a;
        int supportedTypes = routeInfo.getSupportedTypes();
        if ((supportedTypes & 1) != 0) {
            lVar.a(I);
        }
        if ((supportedTypes & 2) != 0) {
            lVar.a(J);
        }
        int playbackType = routeInfo.getPlaybackType();
        Bundle bundle = lVar.f45271a;
        Bundle bundle2 = lVar.f45271a;
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
        h3 c10 = wVar.c();
        MediaRouter mediaRouter = this.f45267s;
        if (c10 != this) {
            MediaRouter.UserRouteInfo createUserRoute = mediaRouter.createUserRoute(this.f45269x);
            j0 j0Var = new j0(wVar, createUserRoute);
            createUserRoute.setTag(j0Var);
            createUserRoute.setVolumeCallback(this.f45268w);
            C(j0Var);
            this.H.add(j0Var);
            mediaRouter.addUserRoute(createUserRoute);
            return;
        }
        int o9 = o(mediaRouter.getSelectedRoute(8388611));
        if (o9 >= 0 && ((i0) this.G.get(o9)).f45256b.equals(wVar.f45337b)) {
            wVar.l();
        }
    }

    public final void w(w wVar) {
        int q6;
        if (wVar.c() != this && (q6 = q(wVar)) >= 0) {
            MediaRouter.UserRouteInfo userRouteInfo = ((j0) this.H.remove(q6)).f45260b;
            userRouteInfo.setTag(null);
            userRouteInfo.setVolumeCallback(null);
            try {
                this.f45267s.removeUserRoute(userRouteInfo);
            } catch (IllegalArgumentException e7) {
                Log.w("AxSysMediaRouteProvider", "Failed to remove user route", e7);
            }
        }
    }

    public final void x(w wVar) {
        if (wVar.g()) {
            if (wVar.c() != this) {
                int q6 = q(wVar);
                if (q6 >= 0) {
                    z(((j0) this.H.get(q6)).f45260b);
                    return;
                }
                return;
            }
            int p5 = p(wVar.f45337b);
            if (p5 >= 0) {
                z(((i0) this.G.get(p5)).f45255a);
            }
        }
    }

    public final void y() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.G;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            m mVar = ((i0) arrayList2.get(i10)).f45257c;
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
        this.f45267s.selectRoute(8388611, routeInfo);
    }
}
