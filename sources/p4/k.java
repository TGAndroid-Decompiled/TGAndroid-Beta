package p4;

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
import com.google.android.gms.internal.vision.g3;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
public final class k extends g3 {
    public final f D;
    public final i2.g0 E;
    public ArrayList F;
    public final ArrayMap G;
    public final MediaRouter2 f44756r;
    public final k2.m0 f44757s;
    public final ArrayMap f44758w;
    public final MediaRouter2$RouteCallback f44759x;
    public final j f44760y;

    static {
        Log.isLoggable("MR2Provider", 3);
    }

    public k(Context context, k2.m0 m0Var) {
        super(context, null);
        this.f44758w = new ArrayMap();
        this.f44760y = new j(this);
        this.D = new f(this);
        this.F = new ArrayList();
        this.G = new ArrayMap();
        this.f44756r = MediaRouter2.getInstance(context);
        this.f44757s = m0Var;
        this.E = new i2.g0(new Handler(Looper.getMainLooper()), 1);
        if (Build.VERSION.SDK_INT >= 34) {
            this.f44759x = new i(this, 1);
        } else {
            this.f44759x = new i(this, 0);
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
        if (!(qVar instanceof g) || (routingController = ((g) qVar).f44736g) == null) {
            return null;
        }
        return routingController.getId();
    }

    @Override
    public final p c(String str) {
        for (Map.Entry entry : this.f44758w.entrySet()) {
            g gVar = (g) entry.getValue();
            if (TextUtils.equals(str, gVar.f44735f)) {
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
        for (g gVar : this.f44758w.values()) {
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
        s sVar;
        RouteDiscoveryPreference build;
        if (y.f44842c == null) {
            i10 = 0;
        } else {
            i10 = y.c().B;
        }
        MediaRouter2$RouteCallback mediaRouter2$RouteCallback = this.f44759x;
        f fVar = this.D;
        j jVar = this.f44760y;
        if (i10 > 0) {
            a0 a0Var = y.c().f44727u;
            if (a0Var == null) {
                z10 = false;
            } else {
                z10 = a0Var.d;
            }
            if (nVar == null) {
                nVar = new n(s.f44802c, false);
            }
            nVar.a();
            ArrayList c10 = nVar.f44773b.c();
            if (z10) {
                if (!c10.contains("android.media.intent.category.LIVE_AUDIO")) {
                    c10.add("android.media.intent.category.LIVE_AUDIO");
                }
            } else {
                c10.remove("android.media.intent.category.LIVE_AUDIO");
            }
            if (!c10.isEmpty()) {
                int size = c10.size();
                int i11 = 0;
                arrayList = null;
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
                sVar = s.f44802c;
            } else {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("controlCategories", arrayList);
                sVar = new s(bundle, arrayList);
            }
            boolean b10 = nVar.b();
            if (sVar != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putBundle("selector", sVar.f44803a);
                bundle2.putBoolean("activeScan", b10);
                MediaRouter2 mediaRouter2 = this.f44756r;
                sVar.a();
                if (sVar.f44804b.contains(null)) {
                    build = new RouteDiscoveryPreference.Builder(new ArrayList(), false).build();
                } else {
                    boolean z11 = bundle2.getBoolean("activeScan");
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList c11 = sVar.c();
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
                i2.g0 g0Var = this.E;
                mediaRouter2.registerRouteCallback(g0Var, mediaRouter2$RouteCallback, build);
                this.f44756r.registerTransferCallback(g0Var, jVar);
                this.f44756r.registerControllerCallback(g0Var, fVar);
                return;
            }
            throw new IllegalArgumentException("selector must not be null");
        }
        this.f44756r.unregisterRouteCallback(mediaRouter2$RouteCallback);
        this.f44756r.unregisterTransferCallback(jVar);
        this.f44756r.unregisterControllerCallback(fVar);
    }

    public final MediaRoute2Info o(String str) {
        if (str != null) {
            ArrayList arrayList = this.F;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                MediaRoute2Info j10 = org.telegram.utils.twidget.t.j(obj);
                if (TextUtils.equals(j10.getId(), str)) {
                    return j10;
                }
            }
            return null;
        }
        return null;
    }

    public final void q() {
        ArrayList arrayList = new ArrayList();
        ArraySet arraySet = new ArraySet();
        for (MediaRoute2Info mediaRoute2Info : this.f44756r.getRoutes()) {
            MediaRoute2Info j10 = org.telegram.utils.twidget.t.j(mediaRoute2Info);
            if (j10 != null && !arraySet.contains(j10) && !j10.isSystemRoute()) {
                arraySet.add(j10);
                arrayList.add(j10);
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
            MediaRoute2Info j11 = org.telegram.utils.twidget.t.j(obj);
            Bundle extras = j11.getExtras();
            if (extras != null && extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID") != null) {
                arrayMap.put(j11.getId(), extras.getString("androidx.mediarouter.media.KEY_ORIGINAL_ROUTE_ID"));
            } else {
                Log.w("MR2Provider", "Cannot find the original route Id. route=" + j11);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = this.F;
        int size2 = arrayList4.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList4.get(i12);
            i12++;
            MediaRoute2Info j12 = org.telegram.utils.twidget.t.j(obj2);
            m w9 = g0.f.w(j12);
            if (j12 != null) {
                arrayList3.add(w9);
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
        g(new b2.u(arrayList5, true));
    }

    public final void r(MediaRouter2.RoutingController routingController) {
        l lVar;
        int i10;
        g gVar = (g) this.f44758w.get(routingController);
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
        m w9 = g0.f.w(org.telegram.utils.twidget.t.j(selectedRoutes.get(0)));
        Bundle controlHints = routingController.getControlHints();
        String string = this.f5271a.getString(2131689662);
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
            } catch (Exception e) {
                Log.w("MR2Provider", "Exception while unparceling control hints.", e);
            }
        }
        if (mVar == null) {
            lVar = new l(routingController.getId(), string);
            Bundle bundle2 = lVar.f44766a;
            bundle2.putInt("connectionState", 2);
            bundle2.putInt("playbackType", 1);
        } else {
            lVar = new l(mVar);
        }
        int volume = routingController.getVolume();
        Bundle bundle3 = lVar.f44766a;
        bundle3.putInt("volume", volume);
        bundle3.putInt("volumeMax", routingController.getVolumeMax());
        bundle3.putInt("volumeHandling", routingController.getVolumeHandling());
        lVar.f44768c.clear();
        lVar.a(w9.b());
        ArrayList arrayList = lVar.f44767b;
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
        b2.u uVar = (b2.u) this.f5275n;
        if (uVar == null) {
            Log.w("MR2Provider", "setDynamicRouteDescriptors: providerDescriptor is not set.");
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        List<m> list = (List) uVar.f2301c;
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
        gVar.f44743o = b10;
        gVar.l(b10, arrayList2);
    }

    public final void s(String str) {
        MediaRoute2Info o10 = o(str);
        if (o10 == null) {
            Log.w("MR2Provider", "transferTo: Specified route not found. routeId=" + str);
            return;
        }
        this.f44756r.transferTo(o10);
    }
}
