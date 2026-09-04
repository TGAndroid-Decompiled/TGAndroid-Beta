package p4;

import android.content.Context;
import android.media.MediaRoute2Info;
import android.media.MediaRouter2;
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
import org.telegram.ui.sw0;
public final class k extends h3 {
    public final k2.a0 E;
    public ArrayList F;
    public final ArrayMap G;
    public final MediaRouter2 f43857r;
    public final mg.n f43858s;
    public final ArrayMap v;
    public final MediaRouter2.RouteCallback f43859w;
    public final j f43860x;
    public final f f43861y;

    static {
        Log.isLoggable("MR2Provider", 3);
    }

    public k(Context context, mg.n nVar) {
        super(context, null);
        this.v = new ArrayMap();
        this.f43860x = new j(this);
        this.f43861y = new f(this);
        this.F = new ArrayList();
        this.G = new ArrayMap();
        this.f43857r = MediaRouter2.getInstance(context);
        this.f43858s = nVar;
        this.E = new k2.a0(new Handler(Looper.getMainLooper()), 0);
        if (Build.VERSION.SDK_INT >= 34) {
            this.f43859w = new i(this, 1);
        } else {
            this.f43859w = new i(this, 0);
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
        if (!(qVar instanceof g) || (routingController = ((g) qVar).f43832g) == null) {
            return null;
        }
        return routingController.getId();
    }

    @Override
    public final p c(String str) {
        for (Map.Entry entry : this.v.entrySet()) {
            g gVar = (g) entry.getValue();
            if (TextUtils.equals(str, gVar.f43831f)) {
                return gVar;
            }
        }
        return null;
    }

    @Override
    public final q d(String str) {
        return new h((String) this.G.get(str), null);
    }

    @Override
    public final q e(String str, String str2) {
        String str3 = (String) this.G.get(str);
        for (g gVar : this.v.values()) {
            if (TextUtils.equals(str2, gVar.p())) {
                return new h(str3, gVar);
            }
        }
        Log.w("MR2Provider", "Could not find the matching GroupRouteController. routeId=" + str + ", routeGroupId=" + str2);
        return new h(str3, null);
    }

    @Override
    public final void f(n nVar) {
        int i10;
        boolean z10;
        ArrayList<String> arrayList;
        r rVar;
        RouteDiscoveryPreference build;
        if (x.f43944c == null) {
            i10 = 0;
        } else {
            i10 = x.c().B;
        }
        f fVar = this.f43861y;
        j jVar = this.f43860x;
        if (i10 > 0) {
            z zVar = x.c().f43823u;
            if (zVar == null) {
                z10 = false;
            } else {
                z10 = zVar.d;
            }
            if (nVar == null) {
                nVar = new n(r.f43900c, false);
            }
            nVar.a();
            ArrayList c10 = nVar.f43876b.c();
            if (z10) {
                if (!c10.contains("android.media.intent.category.LIVE_AUDIO")) {
                    c10.add("android.media.intent.category.LIVE_AUDIO");
                }
            } else {
                c10.remove("android.media.intent.category.LIVE_AUDIO");
            }
            if (!c10.isEmpty()) {
                int size = c10.size();
                arrayList = null;
                int i11 = 0;
                while (i11 < size) {
                    Object obj = c10.get(i11);
                    i11++;
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
                rVar = r.f43900c;
            } else {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("controlCategories", arrayList);
                rVar = new r(bundle, arrayList);
            }
            boolean b10 = nVar.b();
            if (rVar != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putBundle("selector", rVar.f43901a);
                bundle2.putBoolean("activeScan", b10);
                MediaRouter2 mediaRouter2 = this.f43857r;
                MediaRouter2.RouteCallback routeCallback = this.f43859w;
                rVar.a();
                if (rVar.f43902b.contains(null)) {
                    build = new RouteDiscoveryPreference.Builder(new ArrayList(), false).build();
                } else {
                    boolean z11 = bundle2.getBoolean("activeScan");
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList c11 = rVar.c();
                    int size2 = c11.size();
                    int i12 = 0;
                    while (i12 < size2) {
                        Object obj2 = c11.get(i12);
                        i12++;
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
                k2.a0 a0Var = this.E;
                mediaRouter2.registerRouteCallback(a0Var, routeCallback, build);
                this.f43857r.registerTransferCallback(a0Var, jVar);
                this.f43857r.registerControllerCallback(a0Var, fVar);
                return;
            }
            throw new IllegalArgumentException("selector must not be null");
        }
        this.f43857r.unregisterRouteCallback(this.f43859w);
        this.f43857r.unregisterTransferCallback(jVar);
        this.f43857r.unregisterControllerCallback(fVar);
    }

    public final MediaRoute2Info o(String str) {
        if (str != null) {
            ArrayList arrayList = this.F;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                MediaRoute2Info e7 = sw0.e(obj);
                if (TextUtils.equals(e7.getId(), str)) {
                    return e7;
                }
            }
            return null;
        }
        return null;
    }

    public final void q() {
        ArrayList arrayList = new ArrayList();
        ArraySet arraySet = new ArraySet();
        for (MediaRoute2Info mediaRoute2Info : this.f43857r.getRoutes()) {
            MediaRoute2Info e7 = sw0.e(mediaRoute2Info);
            if (e7 != null && !arraySet.contains(e7) && !e7.isSystemRoute()) {
                arraySet.add(e7);
                arrayList.add(e7);
            }
        }
        if (arrayList.equals(this.F)) {
            return;
        }
        this.F = arrayList;
        ArrayMap arrayMap = this.G;
        arrayMap.clear();
        ArrayList arrayList2 = this.F;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            MediaRoute2Info e10 = sw0.e(obj);
            Bundle extras = e10.getExtras();
            if (extras != null && extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") != null) {
                arrayMap.put(e10.getId(), extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
            } else {
                Log.w("MR2Provider", "Cannot find the original route Id. route=" + e10);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = this.F;
        int size2 = arrayList4.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList4.get(i12);
            i12++;
            MediaRoute2Info e11 = sw0.e(obj2);
            m w10 = g0.f.w(e11);
            if (e11 != null) {
                arrayList3.add(w10);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        if (!arrayList3.isEmpty()) {
            int size3 = arrayList3.size();
            while (i10 < size3) {
                Object obj3 = arrayList3.get(i10);
                i10++;
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
        g(new b2.p(arrayList5, true));
    }

    public final void r(MediaRouter2.RoutingController routingController) {
        l lVar;
        int i10;
        g gVar = (g) this.v.get(routingController);
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
        int i11 = 0;
        m w10 = g0.f.w(sw0.e(selectedRoutes.get(0)));
        Bundle controlHints = routingController.getControlHints();
        String string = this.f5965a.getString(2131689662);
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
            } catch (Exception e7) {
                Log.w("MR2Provider", "Exception while unparceling control hints.", e7);
            }
        }
        if (mVar == null) {
            lVar = new l(routingController.getId(), string);
            Bundle bundle2 = lVar.f43862a;
            bundle2.putInt("connectionState", 2);
            bundle2.putInt("playbackType", 1);
        } else {
            lVar = new l(mVar);
        }
        int volume = routingController.getVolume();
        Bundle bundle3 = lVar.f43862a;
        bundle3.putInt("volume", volume);
        bundle3.putInt("volumeMax", routingController.getVolumeMax());
        bundle3.putInt("volumeHandling", routingController.getVolumeHandling());
        lVar.f43864c.clear();
        lVar.a(w10.b());
        ArrayList arrayList = lVar.f43863b;
        arrayList.clear();
        if (!h.isEmpty()) {
            int size = h.size();
            while (i11 < size) {
                Object obj = h.get(i11);
                i11++;
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
        ArrayList h10 = g0.f.h(routingController.getSelectableRoutes());
        ArrayList h11 = g0.f.h(routingController.getDeselectableRoutes());
        b2.p pVar = (b2.p) this.f5970n;
        if (pVar == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: providerDescriptor is not set.");
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        List<m> list = (List) pVar.f2233c;
        if (!list.isEmpty()) {
            for (m mVar2 : list) {
                String d = mVar2.d();
                if (h.contains(d)) {
                    i10 = 3;
                } else {
                    i10 = 1;
                }
                arrayList2.add(new o(mVar2, i10, h11.contains(d), h10.contains(d), true));
            }
        }
        gVar.f43839o = b10;
        gVar.l(b10, arrayList2);
    }

    public final void s(String str) {
        MediaRoute2Info o9 = o(str);
        if (o9 == null) {
            Log.w("MR2Provider", "transferTo: Specified route not found. routeId=" + str);
            return;
        }
        this.f43857r.transferTo(o9);
    }
}
