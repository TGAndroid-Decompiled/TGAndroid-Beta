package s4;

import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
import android.media.MediaRouter2$RouteCallback;
import android.media.RouteDiscoveryPreference;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Messenger;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.ArraySet;
import android.util.Log;
import com.google.android.gms.internal.vision.h3;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.telegram.ui.Components.of;
import r0.f1;
public final class k extends h3 {
    public final f E;
    public final l2.d0 F;
    public ArrayList G;
    public final ArrayMap H;
    public final MediaRouter2 f56979r;
    public final of f56980s;
    public final ArrayMap f56981w;
    public final MediaRouter2$RouteCallback f56982x;
    public final j f56983y;

    static {
        Log.isLoggable("MR2Provider", 3);
    }

    public k(Context context, of ofVar) {
        super(context, null);
        this.f56981w = new ArrayMap();
        this.f56983y = new j(this);
        this.E = new f(this);
        this.G = new ArrayList();
        this.H = new ArrayMap();
        this.f56979r = MediaRouter2.getInstance(context);
        this.f56980s = ofVar;
        this.F = new l2.d0(new Handler(Looper.getMainLooper()), 1);
        if (Build.VERSION.SDK_INT >= 34) {
            this.f56982x = new i(this, 1);
        } else {
            this.f56982x = new i(this, 0);
        }
    }

    public static Messenger n(MediaRouter2.RoutingController routingController) {
        Bundle controlHints = routingController.getControlHints();
        if (controlHints == null) {
            return null;
        }
        return (Messenger) controlHints.getParcelable("androidx.mediarouter.media.KEY_MESSENGER");
    }

    public static String p(q qVar) {
        MediaRouter2.RoutingController routingController;
        if (!(qVar instanceof g) || (routingController = ((g) qVar).f56954g) == null) {
            return null;
        }
        return routingController.getId();
    }

    @Override
    public final p c(String str) {
        for (Map.Entry entry : this.f56981w.entrySet()) {
            g gVar = (g) entry.getValue();
            if (TextUtils.equals(str, gVar.f56953f)) {
                return gVar;
            }
        }
        return null;
    }

    @Override
    public final q d(String str) {
        return new h((String) this.H.get(str), null);
    }

    @Override
    public final q e(String str, String str2) {
        String str3 = (String) this.H.get(str);
        for (g gVar : this.f56981w.values()) {
            if (TextUtils.equals(str2, gVar.p())) {
                return new h(str3, gVar);
            }
        }
        Log.w("MR2Provider", "Could not find the matching GroupRouteController. routeId=" + str + ", routeGroupId=" + str2);
        return new h(str3, null);
    }

    @Override
    public final void f(n nVar) {
        int i7;
        boolean z10;
        ArrayList<String> arrayList;
        r rVar;
        RouteDiscoveryPreference build;
        if (x.f57062c == null) {
            i7 = 0;
        } else {
            i7 = x.c().B;
        }
        MediaRouter2$RouteCallback mediaRouter2$RouteCallback = this.f56982x;
        f fVar = this.E;
        j jVar = this.f56983y;
        if (i7 > 0) {
            z zVar = x.c().f56945u;
            if (zVar == null) {
                z10 = false;
            } else {
                z10 = zVar.d;
            }
            if (nVar == null) {
                nVar = new n(r.f57022c, false);
            }
            nVar.a();
            ArrayList c10 = nVar.f56998b.c();
            if (z10) {
                if (!c10.contains("android.media.intent.category.LIVE_AUDIO")) {
                    c10.add("android.media.intent.category.LIVE_AUDIO");
                }
            } else {
                c10.remove("android.media.intent.category.LIVE_AUDIO");
            }
            if (!c10.isEmpty()) {
                int size = c10.size();
                int i10 = 0;
                arrayList = null;
                while (i10 < size) {
                    Object obj = c10.get(i10);
                    i10++;
                    String str = (String) obj;
                    if (str != null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                        }
                        if (!arrayList.contains(str)) {
                            arrayList.add(str);
                        }
                    } else {
                        throw new IllegalArgumentException("category must not be null");
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList == null) {
                rVar = r.f57022c;
            } else {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("controlCategories", arrayList);
                rVar = new r(bundle, arrayList);
            }
            boolean b10 = nVar.b();
            if (rVar != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putBundle("selector", rVar.f57023a);
                bundle2.putBoolean("activeScan", b10);
                MediaRouter2 mediaRouter2 = this.f56979r;
                rVar.a();
                if (rVar.f57024b.contains(null)) {
                    build = new RouteDiscoveryPreference.Builder(new ArrayList(), false).build();
                } else {
                    boolean z11 = bundle2.getBoolean("activeScan");
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList c11 = rVar.c();
                    int size2 = c11.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj2 = c11.get(i11);
                        i11++;
                        String str2 = (String) obj2;
                        str2.getClass();
                        char c12 = 65535;
                        switch (str2.hashCode()) {
                            case -2065577523:
                                if (str2.equals("android.media.intent.category.REMOTE_PLAYBACK")) {
                                    c12 = 0;
                                    break;
                                }
                                break;
                            case 956939050:
                                if (str2.equals("android.media.intent.category.LIVE_AUDIO")) {
                                    c12 = 1;
                                    break;
                                }
                                break;
                            case 975975375:
                                if (str2.equals("android.media.intent.category.LIVE_VIDEO")) {
                                    c12 = 2;
                                    break;
                                }
                                break;
                        }
                        switch (c12) {
                            case 0:
                                str2 = "android.media.route.feature.REMOTE_PLAYBACK";
                                break;
                            case 1:
                                str2 = "android.media.route.feature.LIVE_AUDIO";
                                break;
                            case 2:
                                str2 = "android.media.route.feature.LIVE_VIDEO";
                                break;
                        }
                        arrayList2.add(str2);
                    }
                    build = new RouteDiscoveryPreference.Builder(arrayList2, z11).build();
                }
                l2.d0 d0Var = this.F;
                mediaRouter2.registerRouteCallback(d0Var, mediaRouter2$RouteCallback, build);
                this.f56979r.registerTransferCallback(d0Var, jVar);
                this.f56979r.registerControllerCallback(d0Var, fVar);
                return;
            }
            throw new IllegalArgumentException("selector must not be null");
        }
        this.f56979r.unregisterRouteCallback(mediaRouter2$RouteCallback);
        this.f56979r.unregisterTransferCallback(jVar);
        this.f56979r.unregisterControllerCallback(fVar);
    }

    public final MediaRoute2Info o(String str) {
        if (str != null) {
            ArrayList arrayList = this.G;
            int size = arrayList.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList.get(i7);
                i7++;
                MediaRoute2Info d = f1.d(obj);
                if (TextUtils.equals(d.getId(), str)) {
                    return d;
                }
            }
            return null;
        }
        return null;
    }

    public final void q() {
        ArrayList arrayList = new ArrayList();
        ArraySet arraySet = new ArraySet();
        for (MediaRoute2Info mediaRoute2Info : this.f56979r.getRoutes()) {
            MediaRoute2Info d = f1.d(mediaRoute2Info);
            if (d != null && !arraySet.contains(d) && !d.isSystemRoute()) {
                arraySet.add(d);
                arrayList.add(d);
            }
        }
        if (arrayList.equals(this.G)) {
            return;
        }
        this.G = arrayList;
        ArrayMap arrayMap = this.H;
        arrayMap.clear();
        ArrayList arrayList2 = this.G;
        int size = arrayList2.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            MediaRoute2Info d2 = f1.d(obj);
            Bundle extras = d2.getExtras();
            if (extras != null && extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") != null) {
                arrayMap.put(d2.getId(), extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
            } else {
                Log.w("MR2Provider", "Cannot find the original route Id. route=" + d2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = this.G;
        int size2 = arrayList4.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList4.get(i11);
            i11++;
            MediaRoute2Info d10 = f1.d(obj2);
            m w10 = g0.f.w(d10);
            if (d10 != null) {
                arrayList3.add(w10);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        if (!arrayList3.isEmpty()) {
            int size3 = arrayList3.size();
            while (i7 < size3) {
                Object obj3 = arrayList3.get(i7);
                i7++;
                m mVar = (m) obj3;
                if (mVar != null) {
                    if (!arrayList5.contains(mVar)) {
                        arrayList5.add(mVar);
                    } else {
                        throw new IllegalArgumentException("route descriptor already added");
                    }
                } else {
                    throw new IllegalArgumentException("route must not be null");
                }
            }
        }
        g(new ca.i(arrayList5, true));
    }

    public final void r(MediaRouter2.RoutingController routingController) {
        l lVar;
        int i7;
        g gVar = (g) this.f56981w.get(routingController);
        if (gVar == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No matching routeController found. routingController=" + routingController);
            return;
        }
        List<MediaRoute2Info> selectedRoutes = routingController.getSelectedRoutes();
        if (selectedRoutes.isEmpty()) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: No selected routes. This may happen when the selected routes become invalid.routingController=" + routingController);
            return;
        }
        ArrayList h = g0.f.h(selectedRoutes);
        int i10 = 0;
        m w10 = g0.f.w(f1.d(selectedRoutes.get(0)));
        Bundle controlHints = routingController.getControlHints();
        String string = this.f7206a.getString(2131689663);
        m mVar = null;
        if (controlHints != null) {
            try {
                String string2 = controlHints.getString("androidx.mediarouter.media.KEY_SESSION_NAME");
                if (!TextUtils.isEmpty(string2)) {
                    string = string2;
                }
                Bundle bundle = controlHints.getBundle("androidx.mediarouter.media.KEY_GROUP_ROUTE");
                if (bundle != null) {
                    mVar = new m(bundle);
                }
            } catch (Exception e10) {
                Log.w("MR2Provider", "Exception while unparceling control hints.", e10);
            }
        }
        if (mVar == null) {
            lVar = new l(routingController.getId(), string);
            Bundle bundle2 = lVar.f56984a;
            bundle2.putInt("connectionState", 2);
            bundle2.putInt("playbackType", 1);
        } else {
            lVar = new l(mVar);
        }
        int volume = routingController.getVolume();
        Bundle bundle3 = lVar.f56984a;
        bundle3.putInt("volume", volume);
        bundle3.putInt("volumeMax", routingController.getVolumeMax());
        bundle3.putInt("volumeHandling", routingController.getVolumeHandling());
        lVar.f56986c.clear();
        lVar.a(w10.b());
        ArrayList arrayList = lVar.f56985b;
        arrayList.clear();
        if (!h.isEmpty()) {
            int size = h.size();
            while (i10 < size) {
                Object obj = h.get(i10);
                i10++;
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    if (!arrayList.contains(str)) {
                        arrayList.add(str);
                    }
                } else {
                    throw new IllegalArgumentException("groupMemberId must not be empty");
                }
            }
        }
        m b10 = lVar.b();
        ArrayList h7 = g0.f.h(routingController.getSelectableRoutes());
        ArrayList h10 = g0.f.h(routingController.getDeselectableRoutes());
        ca.i iVar = (ca.i) this.f7211n;
        if (iVar == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: providerDescriptor is not set.");
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        List<m> list = (List) iVar.f5123c;
        if (!list.isEmpty()) {
            for (m mVar2 : list) {
                String d = mVar2.d();
                if (h.contains(d)) {
                    i7 = 3;
                } else {
                    i7 = 1;
                }
                arrayList2.add(new o(mVar2, i7, h10.contains(d), h7.contains(d), true));
            }
        }
        gVar.f56961o = b10;
        gVar.l(b10, arrayList2);
    }

    public final void s(String str) {
        MediaRoute2Info o4 = o(str);
        if (o4 == null) {
            Log.w("MR2Provider", "transferTo: Specified route not found. routeId=" + str);
            return;
        }
        this.f56979r.transferTo(o4);
    }
}
