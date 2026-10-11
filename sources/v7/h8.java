package v7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
public abstract class h8 {
    public static Context f49330a;
    public static i8.e f49331b;

    public static i8.e a(Context context) {
        Class cls;
        Class cls2;
        i8.e aVar;
        n6.m.h(context);
        Log.d("h8", "preferredRenderer: ".concat("null"));
        i8.e eVar = f49331b;
        if (eVar == null) {
            AtomicBoolean atomicBoolean = k6.g.f14708a;
            int b10 = k6.g.b(context, 13400000);
            if (b10 == 0) {
                Log.i("h8", "Making Creator dynamically");
                ClassLoader classLoader = b(context).getClassLoader();
                try {
                    n6.m.h(classLoader);
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
                        f49331b = aVar;
                        try {
                            Context b11 = b(context);
                            b11.getClass();
                            x6.b bVar = new x6.b(b11.getResources());
                            Parcel N0 = aVar.N0();
                            s7.b.c(N0, bVar);
                            N0.writeInt(12451000);
                            aVar.R0(N0, 6);
                            return f49331b;
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
        Context context3 = f49330a;
        if (context3 == null) {
            context.getApplicationContext();
            try {
                context2 = y6.e.c(context, y6.e.f51844b, "com.google.android.gms.maps_dynamite").f51854a;
            } catch (Exception e7) {
                try {
                    if (!"com.google.android.gms.maps_dynamite".equals("com.google.android.gms.maps_dynamite")) {
                        try {
                            Log.d("h8", "Attempting to load maps_dynamite again.");
                            context2 = y6.e.c(context, y6.e.f51844b, "com.google.android.gms.maps_dynamite").f51854a;
                        } catch (Exception e10) {
                            Log.e("h8", "Failed to load maps module, use pre-Chimera", e10);
                            AtomicBoolean atomicBoolean = k6.g.f14708a;
                            context2 = context.createPackageContext("com.google.android.gms", 3);
                        }
                    } else {
                        Log.e("h8", "Failed to load maps module, use pre-Chimera", e7);
                        AtomicBoolean atomicBoolean2 = k6.g.f14708a;
                        context2 = context.createPackageContext("com.google.android.gms", 3);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    context2 = null;
                }
            }
            f49330a = context2;
            return context2;
        }
        return context3;
    }
}
