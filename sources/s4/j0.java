package s4;

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
import org.telegram.messenger.ou;
public class j0 extends k0 implements b0 {
    public static final ArrayList J;
    public static final ArrayList K;
    public int E;
    public boolean F;
    public boolean G;
    public final ArrayList H;
    public final ArrayList I;
    public final e f56400r;
    public final MediaRouter f56401s;
    public final a0 f56402w;
    public final MediaRouter.VolumeCallback f56403x;
    public final MediaRouter.RouteCategory f56404y;

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

    public j0(Context context, e eVar) {
        super(context, new ou(new ComponentName("android", k0.class.getName()), 22));
        this.H = new ArrayList();
        this.I = new ArrayList();
        this.f56400r = eVar;
        MediaRouter mediaRouter = (MediaRouter) context.getSystemService("media_router");
        this.f56401s = mediaRouter;
        this.f56402w = new a0(this);
        this.f56403x = d0.a(this);
        this.f56404y = mediaRouter.createRouteCategory((CharSequence) context.getResources().getString(2131689667), false);
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
        boolean z10 = this.G;
        a0 a0Var = this.f56402w;
        MediaRouter mediaRouter = this.f56401s;
        if (z10) {
            mediaRouter.removeCallback(a0Var);
        }
        this.G = true;
        mediaRouter.addCallback(this.E, a0Var, (this.F ? 1 : 0) | 2);
    }

    public final void B() {
        A();
        MediaRouter mediaRouter = this.f56401s;
        int routeCount = mediaRouter.getRouteCount();
        ArrayList arrayList = new ArrayList(routeCount);
        boolean z10 = false;
        for (int i7 = 0; i7 < routeCount; i7++) {
            arrayList.add(mediaRouter.getRouteAt(i7));
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

    public void C(i0 i0Var) {
        int i7;
        MediaRouter.UserRouteInfo userRouteInfo = i0Var.f56398b;
        v vVar = i0Var.f56397a;
        userRouteInfo.setName(vVar.d);
        userRouteInfo.setPlaybackType(vVar.f56477l);
        userRouteInfo.setPlaybackStream(vVar.f56478m);
        userRouteInfo.setVolume(vVar.f56481p);
        userRouteInfo.setVolumeMax(vVar.f56482q);
        if (vVar.e() && !x.g()) {
            i7 = 0;
        } else {
            i7 = vVar.f56480o;
        }
        userRouteInfo.setVolumeHandling(i7);
        userRouteInfo.setDescription(vVar.f56471e);
    }

    @Override
    public final void a(MediaRouter.RouteInfo routeInfo, int i7) {
        i0 s5 = s(routeInfo);
        if (s5 != null) {
            s5.f56397a.j(i7);
        }
    }

    @Override
    public final void b(MediaRouter.RouteInfo routeInfo, int i7) {
        i0 s5 = s(routeInfo);
        if (s5 != null) {
            s5.f56397a.k(i7);
        }
    }

    @Override
    public final q d(String str) {
        int p10 = p(str);
        if (p10 >= 0) {
            return new g0(((h0) this.H.get(p10)).f56392a);
        }
        return null;
    }

    @Override
    public final void f(n nVar) {
        boolean z10;
        int i7 = 0;
        if (nVar != null) {
            nVar.a();
            ArrayList c10 = nVar.f56424b.c();
            int size = c10.size();
            int i10 = 0;
            while (i7 < size) {
                String str = (String) c10.get(i7);
                if (str.equals("android.media.intent.category.LIVE_AUDIO")) {
                    i10 |= 1;
                } else if (str.equals("android.media.intent.category.LIVE_VIDEO")) {
                    i10 |= 2;
                } else {
                    i10 |= 8388608;
                }
                i7++;
            }
            z10 = nVar.b();
            i7 = i10;
        } else {
            z10 = false;
        }
        if (this.E == i7 && this.F == z10) {
            return;
        }
        this.E = i7;
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
        MediaRouter.RouteInfo r10 = r();
        String str3 = "";
        Context context = this.f6926a;
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
            int i7 = 2;
            while (true) {
                Locale locale2 = Locale.US;
                str2 = format + "_" + i7;
                if (p(str2) < 0) {
                    break;
                }
                i7++;
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
        h0Var.f56394c = lVar.b();
        this.H.add(h0Var);
        return true;
    }

    public final int o(MediaRouter.RouteInfo routeInfo) {
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((h0) arrayList.get(i7)).f56392a == routeInfo) {
                return i7;
            }
        }
        return -1;
    }

    public final int p(String str) {
        ArrayList arrayList = this.H;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((h0) arrayList.get(i7)).f56393b.equals(str)) {
                return i7;
            }
        }
        return -1;
    }

    public final int q(v vVar) {
        ArrayList arrayList = this.I;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (((i0) arrayList.get(i7)).f56397a == vVar) {
                return i7;
            }
        }
        return -1;
    }

    public MediaRouter.RouteInfo r() {
        return this.f56401s.getDefaultRoute();
    }

    public boolean t(h0 h0Var) {
        return h0Var.f56392a.isConnecting();
    }

    public void u(h0 h0Var, l lVar) {
        boolean z10;
        MediaRouter.RouteInfo routeInfo = h0Var.f56392a;
        int supportedTypes = routeInfo.getSupportedTypes();
        if ((supportedTypes & 1) != 0) {
            lVar.a(J);
        }
        if ((supportedTypes & 2) != 0) {
            lVar.a(K);
        }
        int playbackType = routeInfo.getPlaybackType();
        Bundle bundle = lVar.f56410a;
        Bundle bundle2 = lVar.f56410a;
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
        MediaRouter mediaRouter = this.f56401s;
        if (c10 != this) {
            MediaRouter.UserRouteInfo createUserRoute = mediaRouter.createUserRoute(this.f56404y);
            i0 i0Var = new i0(vVar, createUserRoute);
            createUserRoute.setTag(i0Var);
            createUserRoute.setVolumeCallback(this.f56403x);
            C(i0Var);
            this.I.add(i0Var);
            mediaRouter.addUserRoute(createUserRoute);
            return;
        }
        int o4 = o(mediaRouter.getSelectedRoute(8388611));
        if (o4 >= 0 && ((h0) this.H.get(o4)).f56393b.equals(vVar.f56469b)) {
            vVar.l();
        }
    }

    public final void w(v vVar) {
        int q10;
        if (vVar.c() != this && (q10 = q(vVar)) >= 0) {
            MediaRouter.UserRouteInfo userRouteInfo = ((i0) this.I.remove(q10)).f56398b;
            userRouteInfo.setTag(null);
            userRouteInfo.setVolumeCallback(null);
            try {
                this.f56401s.removeUserRoute(userRouteInfo);
            } catch (IllegalArgumentException e10) {
                Log.w("AxSysMediaRouteProvider", "Failed to remove user route", e10);
            }
        }
    }

    public final void x(v vVar) {
        if (vVar.g()) {
            if (vVar.c() != this) {
                int q10 = q(vVar);
                if (q10 >= 0) {
                    z(((i0) this.I.get(q10)).f56398b);
                    return;
                }
                return;
            }
            int p10 = p(vVar.f56469b);
            if (p10 >= 0) {
                z(((h0) this.H.get(p10)).f56392a);
            }
        }
    }

    public final void y() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.H;
        int size = arrayList2.size();
        for (int i7 = 0; i7 < size; i7++) {
            m mVar = ((h0) arrayList2.get(i7)).f56394c;
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
        g(new ca.i(arrayList, false));
    }

    public void z(MediaRouter.RouteInfo routeInfo) {
        this.f56401s.selectRoute(8388611, routeInfo);
    }
}
