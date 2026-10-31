package y6;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.api.internal.o1;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import n6.l;
public final class e {
    public static Boolean d = null;
    public static String e = null;
    public static boolean f54190f = false;
    public static int f54191g = -1;
    public static Boolean h;
    public static j f54195l;
    public static k f54196m;
    public final Context f54197a;
    public static final ThreadLocal f54192i = new ThreadLocal();
    public static final o1 f54193j = new o1(4);
    public static final jb.b f54194k = new jb.b(27);
    public static final kb.a f54188b = new kb.a(27);
    public static final oa.d f54189c = new oa.d(27);

    public e(Context context) {
        this.f54197a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            Class<?> loadClass = classLoader.loadClass("com.google.android.gms.dynamite.descriptors." + str + ".ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!l.k(declaredField.get(null), str)) {
                String valueOf = String.valueOf(declaredField.get(null));
                Log.e("DynamiteModule", "Module descriptor id '" + valueOf + "' didn't match expected id '" + str + "'");
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for " + str + " not found.");
            return 0;
        } catch (Exception e7) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e7.getMessage())));
            return 0;
        }
    }

    public static e c(Context context, d dVar, String str) {
        long j10;
        e eVar;
        Boolean bool;
        x6.a X0;
        e eVar2;
        k kVar;
        boolean z10;
        x6.a X02;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            ThreadLocal threadLocal = f54192i;
            i iVar = (i) threadLocal.get();
            ?? obj = new Object();
            threadLocal.set(obj);
            o1 o1Var = f54193j;
            Long l4 = (Long) o1Var.get();
            long longValue = l4.longValue();
            try {
                o1Var.set(Long.valueOf(SystemClock.uptimeMillis()));
                a3.l e7 = dVar.e(context, str, f54194k);
                j10 = longValue;
                try {
                    Log.i("DynamiteModule", "Considering local module " + str + ":" + e7.f139a + " and remote module " + str + ":" + e7.f140b);
                    int i10 = e7.f141c;
                    if (i10 != 0) {
                        if (i10 == -1) {
                            if (e7.f139a != 0) {
                                i10 = -1;
                            }
                        }
                        if (i10 != 1 || e7.f140b != 0) {
                            if (i10 == -1) {
                                Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
                                eVar = new e(applicationContext);
                            } else if (i10 == 1) {
                                try {
                                    int i11 = e7.f140b;
                                    try {
                                        synchronized (e.class) {
                                            if (g(context)) {
                                                bool = d;
                                            } else {
                                                throw new Exception("Remote loading disabled");
                                            }
                                        }
                                        if (bool != null) {
                                            if (bool.booleanValue()) {
                                                Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i11);
                                                synchronized (e.class) {
                                                    kVar = f54196m;
                                                }
                                                if (kVar != null) {
                                                    i iVar2 = (i) threadLocal.get();
                                                    if (iVar2 != null && iVar2.f54200a != null) {
                                                        Context applicationContext2 = context.getApplicationContext();
                                                        Cursor cursor = iVar2.f54200a;
                                                        new x6.b(null);
                                                        synchronized (e.class) {
                                                            if (f54191g >= 2) {
                                                                z10 = true;
                                                            } else {
                                                                z10 = false;
                                                            }
                                                        }
                                                        if (z10) {
                                                            Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                                            X02 = kVar.Y0(new x6.b(applicationContext2), str, i11, new x6.b(cursor));
                                                        } else {
                                                            Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                                            X02 = kVar.X0(new x6.b(applicationContext2), str, i11, new x6.b(cursor));
                                                        }
                                                        Context context2 = (Context) x6.b.N0(X02);
                                                        if (context2 != null) {
                                                            eVar2 = new e(context2);
                                                        } else {
                                                            throw new Exception("Failed to get module context");
                                                        }
                                                    } else {
                                                        throw new Exception("No result cursor");
                                                    }
                                                } else {
                                                    throw new Exception("DynamiteLoaderV2 was not cached.");
                                                }
                                            } else {
                                                Log.i("DynamiteModule", "Selected remote version of " + str + ", version >= " + i11);
                                                j h10 = h(context);
                                                if (h10 != null) {
                                                    Parcel N0 = h10.N0(h10.P0(), 6);
                                                    int readInt = N0.readInt();
                                                    N0.recycle();
                                                    if (readInt >= 3) {
                                                        i iVar3 = (i) threadLocal.get();
                                                        if (iVar3 != null) {
                                                            X0 = h10.Y0(new x6.b(context), str, i11, new x6.b(iVar3.f54200a));
                                                        } else {
                                                            throw new Exception("No cached result cursor holder");
                                                        }
                                                    } else if (readInt == 2) {
                                                        Log.w("DynamiteModule", "IDynamite loader version = 2");
                                                        X0 = h10.Z0(new x6.b(context), str, i11);
                                                    } else {
                                                        Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                                        X0 = h10.X0(new x6.b(context), str, i11);
                                                    }
                                                    Object N02 = x6.b.N0(X0);
                                                    if (N02 != null) {
                                                        eVar2 = new e((Context) N02);
                                                    } else {
                                                        throw new Exception("Failed to load remote module.");
                                                    }
                                                } else {
                                                    throw new Exception("Failed to create IDynamiteLoader.");
                                                }
                                            }
                                            eVar = eVar2;
                                        } else {
                                            throw new Exception("Failed to determine which loading route to use.");
                                        }
                                    } catch (RemoteException e10) {
                                        throw new Exception("Failed to load remote module.", e10);
                                    } catch (b e11) {
                                        throw e11;
                                    } catch (Throwable th2) {
                                        throw new Exception("Failed to load remote module.", th2);
                                    }
                                } catch (b e12) {
                                    Log.w("DynamiteModule", "Failed to load remote module: " + e12.getMessage());
                                    int i12 = e7.f139a;
                                    if (i12 != 0 && dVar.e(context, str, new ae.j(i12)).f141c == -1) {
                                        Log.i("DynamiteModule", "Selected local version of ".concat(String.valueOf(str)));
                                        eVar = new e(applicationContext);
                                    } else {
                                        throw new Exception("Remote load failed. No local fallback found.", e12);
                                    }
                                }
                            } else {
                                throw new Exception("VersionPolicy returned invalid code:" + i10);
                            }
                            if (j10 == 0) {
                                f54193j.remove();
                            } else {
                                f54193j.set(l4);
                            }
                            Cursor cursor2 = obj.f54200a;
                            if (cursor2 != null) {
                                cursor2.close();
                            }
                            f54192i.set(iVar);
                            return eVar;
                        }
                    }
                    throw new Exception("No acceptable module " + str + " found. Local version is " + e7.f139a + " and remote version is " + e7.f140b + ".");
                } catch (Throwable th3) {
                    th = th3;
                    if (j10 == 0) {
                        f54193j.remove();
                    } else {
                        f54193j.set(l4);
                    }
                    Cursor cursor3 = obj.f54200a;
                    if (cursor3 != null) {
                        cursor3.close();
                    }
                    f54192i.set(iVar);
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                j10 = longValue;
            }
        } else {
            throw new Exception("null application Context");
        }
    }

    public static int d(android.content.Context r11, java.lang.String r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: y6.e.d(android.content.Context, java.lang.String, boolean):int");
    }

    public static int e(android.content.Context r12, java.lang.String r13, boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: y6.e.e(android.content.Context, java.lang.String, boolean, boolean):int");
    }

    public static void f(ClassLoader classLoader) {
        try {
            k kVar = null;
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(null).newInstance(null);
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                if (queryLocalInterface instanceof k) {
                    kVar = (k) queryLocalInterface;
                } else {
                    kVar = new a9.a(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2", 7);
                }
            }
            f54196m = kVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e7) {
            throw new Exception("Failed to instantiate dynamite loader", e7);
        }
    }

    public static boolean g(Context context) {
        int i10;
        ApplicationInfo applicationInfo;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(null) || bool.equals(h)) {
            return true;
        }
        boolean z10 = false;
        if (h == null) {
            PackageManager packageManager = context.getPackageManager();
            if (Build.VERSION.SDK_INT >= 29) {
                i10 = 268435456;
            } else {
                i10 = 0;
            }
            ProviderInfo resolveContentProvider = packageManager.resolveContentProvider("com.google.android.gms.chimera", i10);
            if (k6.e.f10936b.d(context, 10000000) == 0 && resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                z10 = true;
            }
            h = Boolean.valueOf(z10);
            if (z10 && (applicationInfo = resolveContentProvider.applicationInfo) != null && (applicationInfo.flags & 129) == 0) {
                Log.i("DynamiteModule", "Non-system-image GmsCore APK, forcing V1");
                f54190f = true;
            }
        }
        if (!z10) {
            Log.e("DynamiteModule", "Invalid GmsCore APK, remote loading disabled.");
        }
        return z10;
    }

    public static j h(Context context) {
        j jVar;
        synchronized (e.class) {
            j jVar2 = f54195l;
            if (jVar2 != null) {
                return jVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    jVar = 0;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    if (queryLocalInterface instanceof j) {
                        jVar = (j) queryLocalInterface;
                    } else {
                        jVar = new a9.a(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader", 7);
                    }
                }
                if (jVar != 0) {
                    f54195l = jVar;
                    return jVar;
                }
            } catch (Exception e7) {
                Log.e("DynamiteModule", "Failed to load IDynamiteLoader from GmsCore: " + e7.getMessage());
            }
            return null;
        }
    }

    public final IBinder b(String str) {
        try {
            return (IBinder) this.f54197a.getClassLoader().loadClass(str).newInstance();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e7) {
            throw new Exception("Failed to instantiate module class: ".concat(str), e7);
        }
    }
}
