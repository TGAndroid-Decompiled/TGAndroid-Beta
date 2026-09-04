package v7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
public abstract class j8 {
    public static Context f47495a;
    public static i8.e f47496b;

    public static i8.e a(Context context) {
        Class cls;
        Class cls2;
        i8.e aVar;
        n6.l.h(context);
        Log.d("j8", "preferredRenderer: ".concat("null"));
        i8.e eVar = f47496b;
        if (eVar == null) {
            AtomicBoolean atomicBoolean = k6.g.f14818a;
            int b10 = k6.g.b(context, 13400000);
            if (b10 == 0) {
                Log.i("j8", "Making Creator dynamically");
                ClassLoader classLoader = b(context).getClassLoader();
                try {
                    n6.l.h(classLoader);
                    try {
                        IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.maps.internal.CreatorImpl").newInstance();
                        if (iBinder == null) {
                            aVar = 0;
                        } else {
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICreator");
                            if (queryLocalInterface instanceof i8.e) {
                                aVar = (i8.e) queryLocalInterface;
                            } else {
                                aVar = new a9.a(iBinder, "com.google.android.gms.maps.internal.ICreator", 9);
                            }
                        }
                        f47496b = aVar;
                        try {
                            Context b11 = b(context);
                            b11.getClass();
                            x6.b bVar = new x6.b(b11.getResources());
                            Parcel O0 = aVar.O0();
                            s7.b.c(O0, bVar);
                            O0.writeInt(12451000);
                            aVar.S0(O0, 6);
                            return f47496b;
                        } catch (RemoteException e7) {
                            throw new RuntimeException(e7);
                        }
                    } catch (IllegalAccessException unused) {
                        throw new IllegalStateException("Unable to call the default constructor of ".concat(cls2.getName()));
                    } catch (InstantiationException unused2) {
                        throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(cls.getName()));
                    }
                } catch (ClassNotFoundException unused3) {
                    throw new IllegalStateException("Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl");
                }
            }
            throw new k6.f(b10);
        }
        return eVar;
    }

    public static Context b(Context context) {
        Context context2;
        Context context3 = f47495a;
        if (context3 == null) {
            context.getApplicationContext();
            try {
                context2 = y6.e.c(context, y6.e.f49545b, "com.google.android.gms.maps_dynamite").f49555a;
            } catch (Exception e7) {
                try {
                    if (!"com.google.android.gms.maps_dynamite".equals("com.google.android.gms.maps_dynamite")) {
                        try {
                            Log.d("j8", "Attempting to load maps_dynamite again.");
                            context2 = y6.e.c(context, y6.e.f49545b, "com.google.android.gms.maps_dynamite").f49555a;
                        } catch (Exception e10) {
                            Log.e("j8", "Failed to load maps module, use pre-Chimera", e10);
                            AtomicBoolean atomicBoolean = k6.g.f14818a;
                            context2 = context.createPackageContext("com.google.android.gms", 3);
                        }
                    } else {
                        Log.e("j8", "Failed to load maps module, use pre-Chimera", e7);
                        AtomicBoolean atomicBoolean2 = k6.g.f14818a;
                        context2 = context.createPackageContext("com.google.android.gms", 3);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    context2 = null;
                }
            }
            f47495a = context2;
            return context2;
        }
        return context3;
    }
}
