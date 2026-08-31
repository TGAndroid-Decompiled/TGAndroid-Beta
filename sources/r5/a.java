package r5;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.cast.k4;
import com.google.android.gms.internal.cast.l4;
import com.google.android.gms.internal.cast.p4;
import j$.util.DesugarCollections;
import j7.s5;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import oh.h4;
import org.telegram.ui.Components.ai;
public final class a {
    public static final u5.b f46677l = new u5.b("CastContext", null);
    public static final Object f46678m = new Object();
    public static volatile a f46679n;
    public final Context f46680a;
    public final n f46681b;
    public final g f46682c;
    public final k d;
    public final b f46683e;
    public final u5.s f46684f;
    public final com.google.android.gms.internal.cast.c f46685g;
    public final com.google.android.gms.internal.cast.m h;
    public final List f46686i;
    public final com.google.android.gms.internal.cast.r f46687j;
    public final com.google.android.gms.internal.cast.e f46688k;

    public a(Context context, b bVar, List list, com.google.android.gms.internal.cast.o oVar, u5.s sVar) {
        r rVar;
        y yVar;
        com.google.android.gms.internal.cast.w wVar;
        k4 l4Var;
        k4 k4Var;
        this.f46680a = context;
        this.f46683e = bVar;
        this.f46684f = sVar;
        this.f46686i = list;
        this.h = new com.google.android.gms.internal.cast.m(context);
        this.f46687j = oVar.f3075f;
        if (!TextUtils.isEmpty(bVar.f46690a)) {
            this.f46688k = new com.google.android.gms.internal.cast.e(context, bVar, oVar);
        } else {
            this.f46688k = null;
        }
        HashMap hashMap = new HashMap();
        com.google.android.gms.internal.cast.e eVar = this.f46688k;
        if (eVar != null) {
            hashMap.put(eVar.f2985b, eVar.f2986c);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.cast.e eVar2 = (com.google.android.gms.internal.cast.e) it.next();
                b6.m.i(eVar2, "Additional SessionProvider must not be null.");
                String str = eVar2.f2985b;
                b6.m.g(str, "Category for SessionProvider must not be null or empty string.");
                b6.m.a("SessionProvider for category " + str + " already added", !hashMap.containsKey(str));
                hashMap.put(str, eVar2.f2986c);
            }
        }
        bVar.C = new b0(1);
        try {
            n a2 = com.google.android.gms.internal.cast.d.a(context, bVar, oVar, hashMap);
            this.f46681b = a2;
            try {
                l lVar = (l) a2;
                Parcel O0 = lVar.O0(lVar.M0(), 6);
                IBinder readStrongBinder = O0.readStrongBinder();
                if (readStrongBinder == null) {
                    rVar = 0;
                } else {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
                    if (queryLocalInterface instanceof r) {
                        rVar = (r) queryLocalInterface;
                    } else {
                        rVar = new a7.a(readStrongBinder, "com.google.android.gms.cast.framework.IDiscoveryManager", 1);
                    }
                }
                O0.recycle();
                this.d = new k(rVar);
                try {
                    l lVar2 = (l) a2;
                    Parcel O02 = lVar2.O0(lVar2.M0(), 5);
                    IBinder readStrongBinder2 = O02.readStrongBinder();
                    if (readStrongBinder2 == null) {
                        yVar = 0;
                    } else {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.cast.framework.ISessionManager");
                        if (queryLocalInterface2 instanceof y) {
                            yVar = (y) queryLocalInterface2;
                        } else {
                            yVar = new a7.a(readStrongBinder2, "com.google.android.gms.cast.framework.ISessionManager", 1);
                        }
                    }
                    O02.recycle();
                    g gVar = new g(yVar, context);
                    this.f46682c = gVar;
                    b6.m.g("PrecacheManager", "The log tag cannot be null or empty.");
                    TextUtils.isEmpty(null);
                    com.google.android.gms.internal.cast.r rVar2 = this.f46687j;
                    if (rVar2 != null) {
                        rVar2.f3107f = gVar;
                        a7.e eVar3 = rVar2.f3105c;
                        b6.m.h(eVar3);
                        eVar3.post(new com.google.android.gms.internal.cast.q(rVar2, 1));
                    }
                    if (Build.VERSION.SDK_INT >= 23) {
                        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3);
                        if (newFixedThreadPool instanceof k4) {
                            k4Var = (k4) newFixedThreadPool;
                        } else {
                            if (newFixedThreadPool instanceof ScheduledExecutorService) {
                                l4Var = new p4((ScheduledExecutorService) newFixedThreadPool);
                            } else {
                                l4Var = new l4(newFixedThreadPool);
                            }
                            k4Var = l4Var;
                        }
                        wVar = new com.google.android.gms.internal.cast.w(context, k4Var);
                    } else {
                        wVar = new Object();
                    }
                    b6.m.g("BaseNetUtils", "The log tag cannot be null or empty.");
                    TextUtils.isEmpty(null);
                    wVar.mo5zza();
                    com.google.android.gms.internal.cast.c cVar = new com.google.android.gms.internal.cast.c();
                    this.f46685g = cVar;
                    try {
                        l lVar3 = (l) a2;
                        Parcel M0 = lVar3.M0();
                        com.google.android.gms.internal.cast.s.d(M0, cVar);
                        lVar3.Q0(M0, 3);
                        cVar.f2924c.add(this.h.f3051a);
                        if (!DesugarCollections.unmodifiableList(bVar.f46698w).isEmpty()) {
                            u5.b bVar2 = f46677l;
                            Log.i(bVar2.f48349a, bVar2.d("Setting Route Discovery for appIds: ".concat(String.valueOf(DesugarCollections.unmodifiableList(this.f46683e.f46698w))), new Object[0]));
                            com.google.android.gms.internal.cast.m mVar = this.h;
                            List<String> unmodifiableList = DesugarCollections.unmodifiableList(this.f46683e.f46698w);
                            mVar.getClass();
                            com.google.android.gms.internal.cast.m.f3050f.b(l.d.k(unmodifiableList.size(), "SetRouteDiscovery for ", " IDs"), new Object[0]);
                            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                            for (String str2 : unmodifiableList) {
                                linkedHashSet.add(s5.a(str2));
                            }
                            com.google.android.gms.internal.cast.m.f3050f.b("resetting routes. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(mVar.f3053c.keySet())), new Object[0]);
                            HashMap hashMap2 = new HashMap();
                            synchronized (mVar.f3053c) {
                                try {
                                    for (String str3 : linkedHashSet) {
                                        com.google.android.gms.internal.cast.k kVar = (com.google.android.gms.internal.cast.k) mVar.f3053c.get(s5.a(str3));
                                        if (kVar != null) {
                                            hashMap2.put(str3, kVar);
                                        }
                                    }
                                    mVar.f3053c.clear();
                                    mVar.f3053c.putAll(hashMap2);
                                } finally {
                                }
                            }
                            com.google.android.gms.internal.cast.m.f3050f.b("Routes reset. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(mVar.f3053c.keySet())), new Object[0]);
                            synchronized (mVar.d) {
                                mVar.d.clear();
                                mVar.d.addAll(linkedHashSet);
                            }
                            mVar.m();
                        }
                        sVar.f(new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED"}).addOnSuccessListener(new ai(this, 11));
                        com.google.android.gms.common.api.internal.v e6 = com.google.android.gms.common.api.internal.w.e();
                        e6.f2824c = new org.telegram.ui.web.e0(sVar, new String[]{"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"}, 14);
                        e6.d = new y5.c[]{q5.y.d};
                        e6.f2823b = false;
                        e6.f2822a = 8427;
                        sVar.e(0, e6.e()).addOnSuccessListener(new h4(this, 14));
                    } catch (RemoteException e10) {
                        throw new IllegalStateException("Failed to call addAppVisibilityListener", e10);
                    }
                } catch (RemoteException e11) {
                    throw new IllegalStateException("Failed to call getSessionManagerImpl", e11);
                }
            } catch (RemoteException e12) {
                throw new IllegalStateException("Failed to call getDiscoveryManagerImpl", e12);
            }
        } catch (RemoteException e13) {
            throw new IllegalStateException("Failed to call newCastContextImpl", e13);
        }
    }

    public static a c(Context context) {
        b6.m.e("Must be called from the main thread.");
        if (f46679n == null) {
            synchronized (f46678m) {
                if (f46679n == null) {
                    Context applicationContext = context.getApplicationContext();
                    e d = d(applicationContext);
                    b castOptions = d.getCastOptions(applicationContext);
                    ?? jVar = new com.google.android.gms.common.api.j(applicationContext, u5.s.f48390k, com.google.android.gms.common.api.b.f2649i, com.google.android.gms.common.api.i.f2658c);
                    try {
                        f46679n = new a(applicationContext, castOptions, d.getAdditionalSessionProviders(applicationContext), new com.google.android.gms.internal.cast.o(applicationContext, c2.c0.d(applicationContext), castOptions, jVar), jVar);
                    } catch (d e6) {
                        throw new RuntimeException(e6);
                    }
                }
            }
        }
        return f46679n;
    }

    public static e d(Context context) {
        k6.b a2;
        try {
            a2 = k6.c.a(context);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e6) {
            e = e6;
        }
        try {
            Bundle bundle = a2.f10475a.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                f46677l.c(new Object[0]);
            }
            String string = bundle.getString("com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME");
            if (string != null) {
                return (e) Class.forName(string).asSubclass(e.class).getDeclaredConstructor(null).newInstance(null);
            }
            throw new IllegalStateException("The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.");
        } catch (ClassNotFoundException e10) {
            e = e10;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (IllegalAccessException e11) {
            e = e11;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (InstantiationException e12) {
            e = e12;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (NoSuchMethodException e13) {
            e = e13;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (NullPointerException e14) {
            e = e14;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        }
    }

    public final c2.v a() {
        b6.m.e("Must be called from the main thread.");
        try {
            l lVar = (l) this.f46681b;
            Parcel O0 = lVar.O0(lVar.M0(), 1);
            O0.recycle();
            return c2.v.b((Bundle) com.google.android.gms.internal.cast.s.a(O0, Bundle.CREATOR));
        } catch (RemoteException e6) {
            f46677l.a(e6, "Unable to call %s on %s.", "getMergedSelectorAsBundle", n.class.getSimpleName());
            return null;
        }
    }

    public final g b() {
        b6.m.e("Must be called from the main thread.");
        return this.f46682c;
    }
}
