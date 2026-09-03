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
import kf.k0;
import org.telegram.ui.Components.tp0;
public final class a {
    public static final u5.b f43355l = new u5.b("CastContext", null);
    public static final Object f43356m = new Object();
    public static volatile a f43357n;
    public final Context f43358a;
    public final n f43359b;
    public final g f43360c;
    public final k d;
    public final b e;
    public final u5.s f43361f;
    public final com.google.android.gms.internal.cast.c f43362g;
    public final com.google.android.gms.internal.cast.m h;
    public final List f43363i;
    public final com.google.android.gms.internal.cast.s f43364j;
    public final com.google.android.gms.internal.cast.e f43365k;

    public a(Context context, b bVar, List list, com.google.android.gms.internal.cast.p pVar, u5.s sVar) {
        r rVar;
        y yVar;
        com.google.android.gms.internal.cast.x xVar;
        l4 m4Var;
        l4 l4Var;
        this.f43358a = context;
        this.e = bVar;
        this.f43361f = sVar;
        this.f43363i = list;
        this.h = new com.google.android.gms.internal.cast.m(context);
        this.f43364j = pVar.f3108f;
        if (!TextUtils.isEmpty(bVar.f43367a)) {
            this.f43365k = new com.google.android.gms.internal.cast.e(context, bVar, pVar);
        } else {
            this.f43365k = null;
        }
        HashMap hashMap = new HashMap();
        com.google.android.gms.internal.cast.e eVar = this.f43365k;
        if (eVar != null) {
            hashMap.put(eVar.f3020b, eVar.f3021c);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.cast.e eVar2 = (com.google.android.gms.internal.cast.e) it.next();
                b6.m.i(eVar2, "Additional SessionProvider must not be null.");
                String str = eVar2.f3020b;
                b6.m.g(str, "Category for SessionProvider must not be null or empty string.");
                b6.m.a("SessionProvider for category " + str + " already added", !hashMap.containsKey(str));
                hashMap.put(str, eVar2.f3021c);
            }
        }
        bVar.C = new b0(1);
        try {
            n a2 = com.google.android.gms.internal.cast.d.a(context, bVar, pVar, hashMap);
            this.f43359b = a2;
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
                    this.f43360c = gVar;
                    b6.m.g("PrecacheManager", "The log tag cannot be null or empty.");
                    TextUtils.isEmpty(null);
                    com.google.android.gms.internal.cast.s sVar2 = this.f43364j;
                    if (sVar2 != null) {
                        sVar2.f3135f = gVar;
                        a7.e eVar3 = sVar2.f3134c;
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
                    xVar.mo5zza();
                    com.google.android.gms.internal.cast.c cVar = new com.google.android.gms.internal.cast.c();
                    this.f43362g = cVar;
                    try {
                        l lVar3 = (l) a2;
                        Parcel M0 = lVar3.M0();
                        com.google.android.gms.internal.cast.t.d(M0, cVar);
                        lVar3.Q0(M0, 3);
                        cVar.f2963c.add(this.h.f3084a);
                        if (!DesugarCollections.unmodifiableList(bVar.f43374w).isEmpty()) {
                            u5.b bVar2 = f43355l;
                            Log.i(bVar2.f45160a, bVar2.d("Setting Route Discovery for appIds: ".concat(String.valueOf(DesugarCollections.unmodifiableList(this.e.f43374w))), new Object[0]));
                            com.google.android.gms.internal.cast.m mVar = this.h;
                            List<String> unmodifiableList = DesugarCollections.unmodifiableList(this.e.f43374w);
                            mVar.getClass();
                            com.google.android.gms.internal.cast.m.f3083f.b(k0.k(unmodifiableList.size(), "SetRouteDiscovery for ", " IDs"), new Object[0]);
                            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                            for (String str2 : unmodifiableList) {
                                linkedHashSet.add(u5.a(str2));
                            }
                            com.google.android.gms.internal.cast.m.f3083f.b("resetting routes. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(mVar.f3086c.keySet())), new Object[0]);
                            HashMap hashMap2 = new HashMap();
                            synchronized (mVar.f3086c) {
                                try {
                                    for (String str3 : linkedHashSet) {
                                        com.google.android.gms.internal.cast.k kVar = (com.google.android.gms.internal.cast.k) mVar.f3086c.get(u5.a(str3));
                                        if (kVar != null) {
                                            hashMap2.put(str3, kVar);
                                        }
                                    }
                                    mVar.f3086c.clear();
                                    mVar.f3086c.putAll(hashMap2);
                                } finally {
                                }
                            }
                            com.google.android.gms.internal.cast.m.f3083f.b("Routes reset. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(mVar.f3086c.keySet())), new Object[0]);
                            synchronized (mVar.d) {
                                mVar.d.clear();
                                mVar.d.addAll(linkedHashSet);
                            }
                            mVar.m();
                        }
                        sVar.f(new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED"}).addOnSuccessListener(new o2.i(this, 15));
                        com.google.android.gms.common.api.internal.v e = com.google.android.gms.common.api.internal.w.e();
                        e.f2868c = new o2.i(sVar, new String[]{"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"}, 22);
                        e.d = new y5.c[]{q5.y.d};
                        e.f2867b = false;
                        e.f2866a = 8427;
                        sVar.e(0, e.e()).addOnSuccessListener(new tp0(this, 10));
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
        if (f43357n == null) {
            synchronized (f43356m) {
                if (f43357n == null) {
                    Context applicationContext = context.getApplicationContext();
                    e d = d(applicationContext);
                    b castOptions = d.getCastOptions(applicationContext);
                    ?? jVar = new com.google.android.gms.common.api.j(applicationContext, u5.s.f45198k, com.google.android.gms.common.api.b.f2704i, com.google.android.gms.common.api.i.f2713c);
                    try {
                        f43357n = new a(applicationContext, castOptions, d.getAdditionalSessionProviders(applicationContext), new com.google.android.gms.internal.cast.p(applicationContext, c2.d0.d(applicationContext), castOptions, jVar), jVar);
                    } catch (d e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
        return f43357n;
    }

    public static e d(Context context) {
        bb.b a2;
        try {
            a2 = k6.b.a(context);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e) {
            e = e;
        }
        try {
            Bundle bundle = ((Context) a2.f1772b).getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                f43355l.c(new Object[0]);
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

    public final c2.w a() {
        b6.m.e("Must be called from the main thread.");
        try {
            l lVar = (l) this.f43359b;
            Parcel O0 = lVar.O0(lVar.M0(), 1);
            O0.recycle();
            return c2.w.b((Bundle) com.google.android.gms.internal.cast.t.a(O0, Bundle.CREATOR));
        } catch (RemoteException e) {
            f43355l.a(e, "Unable to call %s on %s.", "getMergedSelectorAsBundle", n.class.getSimpleName());
            return null;
        }
    }

    public final g b() {
        b6.m.e("Must be called from the main thread.");
        return this.f43360c;
    }
}
