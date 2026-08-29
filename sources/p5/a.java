package p5;

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
import c2.v0;
import com.google.android.gms.internal.cast.l4;
import com.google.android.gms.internal.cast.m4;
import com.google.android.gms.internal.cast.q4;
import h7.r5;
import j$.util.DesugarCollections;
import j7.l1;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
public final class a {
    public static final s5.b f45598l = new s5.b("CastContext", null);
    public static final Object f45599m = new Object();
    public static volatile a f45600n;
    public final Context f45601a;
    public final n f45602b;
    public final g f45603c;
    public final k d;
    public final b f45604e;
    public final s5.s f45605f;
    public final com.google.android.gms.internal.cast.d f45606g;
    public final com.google.android.gms.internal.cast.n h;
    public final List f45607i;
    public final com.google.android.gms.internal.cast.t f45608j;
    public final com.google.android.gms.internal.cast.f f45609k;

    public a(Context context, b bVar, List list, com.google.android.gms.internal.cast.q qVar, s5.s sVar) {
        r rVar;
        y yVar;
        com.google.android.gms.internal.cast.y yVar2;
        l4 m4Var;
        l4 l4Var;
        this.f45601a = context;
        this.f45604e = bVar;
        this.f45605f = sVar;
        this.f45607i = list;
        this.h = new com.google.android.gms.internal.cast.n(context);
        this.f45608j = qVar.f4237f;
        if (!TextUtils.isEmpty(bVar.f45611a)) {
            this.f45609k = new com.google.android.gms.internal.cast.f(context, bVar, qVar);
        } else {
            this.f45609k = null;
        }
        HashMap hashMap = new HashMap();
        com.google.android.gms.internal.cast.f fVar = this.f45609k;
        if (fVar != null) {
            hashMap.put(fVar.f4137b, fVar.f4138c);
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                com.google.android.gms.internal.cast.f fVar2 = (com.google.android.gms.internal.cast.f) it.next();
                z5.l.i(fVar2, "Additional SessionProvider must not be null.");
                String str = fVar2.f4137b;
                z5.l.g(str, "Category for SessionProvider must not be null or empty string.");
                z5.l.a("SessionProvider for category " + str + " already added", !hashMap.containsKey(str));
                hashMap.put(str, fVar2.f4138c);
            }
        }
        bVar.B = new b0(1);
        try {
            n a2 = com.google.android.gms.internal.cast.e.a(context, bVar, qVar, hashMap);
            this.f45602b = a2;
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
                        rVar = new com.google.android.gms.internal.cast.a(readStrongBinder, "com.google.android.gms.cast.framework.IDiscoveryManager", 0);
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
                            yVar = new com.google.android.gms.internal.cast.a(readStrongBinder2, "com.google.android.gms.cast.framework.ISessionManager", 0);
                        }
                    }
                    O02.recycle();
                    g gVar = new g(yVar, context);
                    this.f45603c = gVar;
                    z5.l.g("PrecacheManager", "The log tag cannot be null or empty.");
                    TextUtils.isEmpty(null);
                    com.google.android.gms.internal.cast.t tVar = this.f45608j;
                    if (tVar != null) {
                        tVar.f4269f = gVar;
                        v0 v0Var = tVar.f4267c;
                        z5.l.h(v0Var);
                        v0Var.post(new com.google.android.gms.internal.cast.s(tVar, 1));
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
                        yVar2 = new com.google.android.gms.internal.cast.y(context, l4Var);
                    } else {
                        yVar2 = new Object();
                    }
                    z5.l.g("BaseNetUtils", "The log tag cannot be null or empty.");
                    TextUtils.isEmpty(null);
                    yVar2.mo5zza();
                    com.google.android.gms.internal.cast.d dVar = new com.google.android.gms.internal.cast.d();
                    this.f45606g = dVar;
                    try {
                        l lVar3 = (l) a2;
                        Parcel M0 = lVar3.M0();
                        com.google.android.gms.internal.cast.u.d(M0, dVar);
                        lVar3.Q0(M0, 3);
                        dVar.f4077c.add(this.h.f4209a);
                        if (!DesugarCollections.unmodifiableList(bVar.f45619w).isEmpty()) {
                            s5.b bVar2 = f45598l;
                            Log.i(bVar2.f47580a, bVar2.d("Setting Route Discovery for appIds: ".concat(String.valueOf(DesugarCollections.unmodifiableList(this.f45604e.f45619w))), new Object[0]));
                            com.google.android.gms.internal.cast.n nVar = this.h;
                            List<String> unmodifiableList = DesugarCollections.unmodifiableList(this.f45604e.f45619w);
                            nVar.getClass();
                            com.google.android.gms.internal.cast.n.f4208f.b(l1.l(unmodifiableList.size(), "SetRouteDiscovery for ", " IDs"), new Object[0]);
                            LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
                            for (String str2 : unmodifiableList) {
                                linkedHashSet.add(r5.a(str2));
                            }
                            com.google.android.gms.internal.cast.n.f4208f.b("resetting routes. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(nVar.f4211c.keySet())), new Object[0]);
                            HashMap hashMap2 = new HashMap();
                            synchronized (nVar.f4211c) {
                                try {
                                    for (String str3 : linkedHashSet) {
                                        com.google.android.gms.internal.cast.l lVar4 = (com.google.android.gms.internal.cast.l) nVar.f4211c.get(r5.a(str3));
                                        if (lVar4 != null) {
                                            hashMap2.put(str3, lVar4);
                                        }
                                    }
                                    nVar.f4211c.clear();
                                    nVar.f4211c.putAll(hashMap2);
                                } finally {
                                }
                            }
                            com.google.android.gms.internal.cast.n.f4208f.b("Routes reset. appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(nVar.f4211c.keySet())), new Object[0]);
                            synchronized (nVar.d) {
                                nVar.d.clear();
                                nVar.d.addAll(linkedHashSet);
                            }
                            nVar.m();
                        }
                        sVar.f(new String[]{"com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_ENABLED", "com.google.android.gms.cast.FLAG_CLIENT_SESSION_ANALYTICS_MODE", "com.google.android.gms.cast.FLAG_FIRELOG_UPLOAD_MODE", "com.google.android.gms.cast.FLAG_ANALYTICS_LOGGING_BUCKET_SIZE", "com.google.android.gms.cast.FLAG_CLIENT_FEATURE_USAGE_ANALYTICS_ENABLED"}).addOnSuccessListener(new o1.a(this, 13));
                        com.google.android.gms.common.api.internal.v b10 = com.google.android.gms.common.api.internal.w.b();
                        b10.f3928c = new o3.y(sVar, new String[]{"com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES"});
                        b10.d = new w5.c[]{o5.y.d};
                        b10.f3927b = false;
                        b10.f3926a = 8427;
                        sVar.e(0, b10.b()).addOnSuccessListener(new o4.g(this, 9));
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
        z5.l.e("Must be called from the main thread.");
        if (f45600n == null) {
            synchronized (f45599m) {
                if (f45600n == null) {
                    Context applicationContext = context.getApplicationContext();
                    e d = d(applicationContext);
                    b castOptions = d.getCastOptions(applicationContext);
                    ?? jVar = new com.google.android.gms.common.api.j(applicationContext, s5.s.f47621k, com.google.android.gms.common.api.b.f3758i, com.google.android.gms.common.api.i.f3767c);
                    try {
                        f45600n = new a(applicationContext, castOptions, d.getAdditionalSessionProviders(applicationContext), new com.google.android.gms.internal.cast.q(applicationContext, c2.d0.d(applicationContext), castOptions, jVar), jVar);
                    } catch (d e10) {
                        throw new RuntimeException(e10);
                    }
                }
            }
        }
        return f45600n;
    }

    public static e d(Context context) {
        androidx.biometric.t a2;
        try {
            a2 = i6.b.a(context);
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e10) {
            e = e10;
        }
        try {
            Bundle bundle = a2.f1053a.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                f45598l.c(new Object[0]);
            }
            String string = bundle.getString("com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME");
            if (string != null) {
                return (e) Class.forName(string).asSubclass(e.class).getDeclaredConstructor(null).newInstance(null);
            }
            throw new IllegalStateException("The fully qualified name of the implementation of OptionsProvider must be provided as a metadata in the AndroidManifest.xml with key com.google.android.gms.cast.framework.OPTIONS_PROVIDER_CLASS_NAME.");
        } catch (ClassNotFoundException e11) {
            e = e11;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (IllegalAccessException e12) {
            e = e12;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (InstantiationException e13) {
            e = e13;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (NoSuchMethodException e14) {
            e = e14;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        } catch (NullPointerException e15) {
            e = e15;
            throw new IllegalStateException("Failed to initialize CastContext.", e);
        }
    }

    public final c2.w a() {
        z5.l.e("Must be called from the main thread.");
        try {
            l lVar = (l) this.f45602b;
            Parcel O0 = lVar.O0(lVar.M0(), 1);
            O0.recycle();
            return c2.w.b((Bundle) com.google.android.gms.internal.cast.u.a(O0, Bundle.CREATOR));
        } catch (RemoteException e10) {
            f45598l.a(e10, "Unable to call %s on %s.", "getMergedSelectorAsBundle", n.class.getSimpleName());
            return null;
        }
    }

    public final g b() {
        z5.l.e("Must be called from the main thread.");
        return this.f45603c;
    }
}
