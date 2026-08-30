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
import com.google.android.gms.internal.cast.l4;
import com.google.android.gms.internal.cast.m4;
import com.google.android.gms.internal.cast.q4;
import j$.util.DesugarCollections;
import j7.u5;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import kh.a2;
import ph.j5;
public final class a {
    public static final u5.b f43331l = new u5.b("CastContext", null);
    public static final Object f43332m = new Object();
    public static volatile a f43333n;
    public final Context f43334a;
    public final n f43335b;
    public final g f43336c;
    public final k d;
    public final b e;
    public final u5.s f43337f;
    public final com.google.android.gms.internal.cast.c f43338g;
    public final com.google.android.gms.internal.cast.m h;
    public final List f43339i;
    public final com.google.android.gms.internal.cast.s f43340j;
    public final com.google.android.gms.internal.cast.e f43341k;

    public a(Context context, b bVar, List list, com.google.android.gms.internal.cast.p pVar, u5.s sVar) {
        r rVar;
        y yVar;
        com.google.android.gms.internal.cast.x xVar;
        l4 m4Var;
        l4 l4Var;
        this.f43334a = context;
        this.e = bVar;
        this.f43337f = sVar;
        this.f43339i = list;
        this.h = new com.google.android.gms.internal.cast.m(context);
        this.f43340j = pVar.f3125f;
        if (!TextUtils.isEmpty(bVar.f43343a)) {
            this.f43341k = new com.google.android.gms.internal.cast.e(context, bVar, pVar);
        } else {
            this.f43341k = null;
        }
        HashMap hashMap = new HashMap();
        com.google.android.gms.internal.cast.e eVar = this.f43341k;
        if (eVar != null) {
            hashMap.put(eVar.f3037b, eVar.f3038c);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.cast.e eVar2 = (com.google.android.gms.internal.cast.e) it.next();
                b6.m.i(eVar2, "Additional SessionProvider must not be null.");
                String str = eVar2.f3037b;
                b6.m.g(str, "Category for SessionProvider must not be null or empty string.");
                b6.m.a("SessionProvider for category " + str + " already added", !hashMap.containsKey(str));
                hashMap.put(str, eVar2.f3038c);
            }
        }
        bVar.C = new b0(1);
        try {
            n a2 = com.google.android.gms.internal.cast.d.a(context, bVar, pVar, hashMap);
            this.f43335b = a2;
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
                    this.f43336c = gVar;
                    b6.m.g("PrecacheManager", "The log tag cannot be null or empty.");
                    TextUtils.isEmpty(null);
                    com.google.android.gms.internal.cast.s sVar2 = this.f43340j;
                    if (sVar2 != null) {
                        sVar2.f3152f = gVar;
                        a7.e eVar3 = sVar2.f3151c;
                        b6.m.h(eVar3);
                        eVar3.post(new com.google.android.gms.internal.cast.r(sVar2, 1));
                    }
                    if (Build.VERSION.SDK_INT >= 23) {
                        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(3);
                        if (newFixedThreadPool instanceof l4) {
                            l4Var = (l4) newFixedThreadPool;
                        } else {
                            if (newFixedThreadPool instanceof ScheduledExecutorService) {
                                m4Var = new q4((ScheduledExecutorService) newFixedThreadPool);
                            } else {
                                m4Var = new m4(newFixedThreadPool);
                            }
                            l4Var = m4Var;
                        }
                        xVar = new com.google.android.gms.internal.cast.x(context, l4Var);
                    } else {
                        xVar = new Object();
                    }
                    b6.m.g("BaseNetUtils", "The log tag cannot be null or empty.");
                    TextUtils.isEmpty(null);
                    xVar.mo6zza();
                    com.google.android.gms.internal.cast.c cVar = new com.google.android.gms.internal.cast.c();
                    this.f43338g = cVar;
                    try {
                        l lVar3 = (l) a2;
                        Parcel M0 = lVar3.M0();
                        com.google.android.gms.internal.cast.t.d(M0, cVar);
                        lVar3.Q0(M0, 3);
                        cVar.f2980c.add(this.h.f3101a);
                        if (!DesugarCollections.unmodifiableList(bVar.f43350w).isEmpty()) {
                            u5.b bVar2 = f43331l;
                            Log.i(bVar2.f45098a, bVar2.d("Setting Route Discovery for appIds: ".concat(String.valueOf(DesugarCollections.unmodifiableList(this.e.f43350w))), new Object[0]));
                            com.google.android.gms.internal.cast.m mVar = this.h;
                            List<String> unmodifiableList = DesugarCollections.unmodifiableList(this.e.f43350w);
                            mVar.getClass();
                            com.google.android.gms.internal.cast.m.f3100f.b(a2.k(unmodifiableList.size(), "SetRouteDiscovery for ", " IDs"), new Object[0]);
                            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                            for (String str2 : unmodifiableList) {
                                linkedHashSet.add(u5.a(str2));
                            }
                            com.google.android.gms.internal.cast.m.f3100f.b("resetting routes. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(mVar.f3103c.keySet())), new Object[0]);
                            HashMap hashMap2 = new HashMap();
                            synchronized (mVar.f3103c) {
                                try {
                                    for (String str3 : linkedHashSet) {
                                        com.google.android.gms.internal.cast.k kVar = (com.google.android.gms.internal.cast.k) mVar.f3103c.get(u5.a(str3));
                                        if (kVar != null) {
                                            hashMap2.put(str3, kVar);
                                        }
                                    }
                                    mVar.f3103c.clear();
                                    mVar.f3103c.putAll(hashMap2);
                                } finally {
                                }
                            }
                            com.google.android.gms.internal.cast.m.f3100f.b("Routes reset. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(mVar.f3103c.keySet())), new Object[0]);
                            synchronized (mVar.d) {
                                mVar.d.clear();
                                mVar.d.addAll(linkedHashSet);
                            }
                            mVar.m();
                        }
                        sVar.f(new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED"}).addOnSuccessListener(new j5(this, 4));
                        com.google.android.gms.common.api.internal.v e = com.google.android.gms.common.api.internal.w.e();
                        e.f2885c = new j5(sVar, new String[]{"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"}, 11);
                        e.d = new y5.c[]{q5.y.d};
                        e.f2884b = false;
                        e.f2883a = 8427;
                        sVar.e(0, e.e()).addOnSuccessListener(new o2.o(this, 17));
                    } catch (RemoteException e6) {
                        throw new IllegalStateException("Failed to call addAppVisibilityListener", e6);
                    }
                } catch (RemoteException e10) {
                    throw new IllegalStateException("Failed to call getSessionManagerImpl", e10);
                }
            } catch (RemoteException e11) {
                throw new IllegalStateException("Failed to call getDiscoveryManagerImpl", e11);
            }
        } catch (RemoteException e12) {
            throw new IllegalStateException("Failed to call newCastContextImpl", e12);
        }
    }

    public static a c(Context context) {
        b6.m.e("Must be called from the main thread.");
        if (f43333n == null) {
            synchronized (f43332m) {
                if (f43333n == null) {
                    Context applicationContext = context.getApplicationContext();
                    e d = d(applicationContext);
                    b castOptions = d.getCastOptions(applicationContext);
                    ?? jVar = new com.google.android.gms.common.api.j(applicationContext, u5.s.f45136k, com.google.android.gms.common.api.b.f2721i, com.google.android.gms.common.api.i.f2730c);
                    try {
                        f43333n = new a(applicationContext, castOptions, d.getAdditionalSessionProviders(applicationContext), new com.google.android.gms.internal.cast.p(applicationContext, c2.c0.d(applicationContext), castOptions, jVar), jVar);
                    } catch (d e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        return f43333n;
    }

    public static e d(Context context) {
        k6.b a2;
        try {
            a2 = k6.c.a(context);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e) {
            e = e;
        }
        try {
            Bundle bundle = a2.f9754a.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                f43331l.c(new Object[0]);
            }
            String string = bundle.getString("com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME");
            if (string != null) {
                return (e) Class.forName(string).asSubclass(e.class).getDeclaredConstructor(null).newInstance(null);
            }
            throw new IllegalStateException("The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.");
        } catch (ClassNotFoundException e6) {
            e = e6;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (IllegalAccessException e10) {
            e = e10;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (InstantiationException e11) {
            e = e11;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (NoSuchMethodException e12) {
            e = e12;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (NullPointerException e13) {
            e = e13;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        }
    }

    public final c2.v a() {
        b6.m.e("Must be called from the main thread.");
        try {
            l lVar = (l) this.f43335b;
            Parcel O0 = lVar.O0(lVar.M0(), 1);
            O0.recycle();
            return c2.v.b((Bundle) com.google.android.gms.internal.cast.t.a(O0, Bundle.CREATOR));
        } catch (RemoteException e) {
            f43331l.a(e, "Unable to call %s on %s.", "getMergedSelectorAsBundle", n.class.getSimpleName());
            return null;
        }
    }

    public final g b() {
        b6.m.e("Must be called from the main thread.");
        return this.f43336c;
    }
}
