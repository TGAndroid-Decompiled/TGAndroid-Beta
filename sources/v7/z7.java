package v7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
public abstract class z7 {
    public static Context f50680a;
    public static i8.e f50681b;

    public static i8.e a(Context context) {
        Class cls;
        Class cls2;
        i8.e aVar;
        n6.l.g(context);
        Log.d("z7", "preferredRenderer: ".concat("null"));
        i8.e eVar = f50681b;
        if (eVar == null) {
            AtomicBoolean atomicBoolean = k6.g.f10939a;
            int b10 = k6.g.b(context, 13400000);
            if (b10 == 0) {
                Log.i("z7", "Making Creator dynamically");
                ClassLoader classLoader = b(context).getClassLoader();
                try {
                    n6.l.g(classLoader);
                    try {
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
                            f50681b = aVar;
                            try {
                                Context b11 = b(context);
                                b11.getClass();
                                x6.b bVar = new x6.b(b11.getResources());
                                Parcel P0 = aVar.P0();
                                s7.b.c(P0, bVar);
                                P0.writeInt(12451000);
                                aVar.T0(P0, 6);
                                return f50681b;
                            } catch (RemoteException e) {
                                throw new RuntimeException(e);
                            }
                        } catch (InstantiationException unused) {
                            throw new IllegalStateException("Unable to instantiate the dynamic class ".concat(cls2.getName()));
                        }
                    } catch (IllegalAccessException unused2) {
                        throw new IllegalStateException("Unable to call the default constructor of ".concat(cls.getName()));
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
        Context context3 = f50680a;
        if (context3 == null) {
            context.getApplicationContext();
            try {
                context2 = y6.e.c(context, y6.e.f54209b, "com.google.android.gms.maps_dynamite").f54218a;
            } catch (Exception e) {
                try {
                    if (!"com.google.android.gms.maps_dynamite".equals("com.google.android.gms.maps_dynamite")) {
                        try {
                            Log.d("z7", "Attempting to load maps_dynamite again.");
                            context2 = y6.e.c(context, y6.e.f54209b, "com.google.android.gms.maps_dynamite").f54218a;
                        } catch (Exception e7) {
                            Log.e("z7", "Failed to load maps module, use pre-Chimera", e7);
                            AtomicBoolean atomicBoolean = k6.g.f10939a;
                            context2 = context.createPackageContext("com.google.android.gms", 3);
                        }
                    } else {
                        Log.e("z7", "Failed to load maps module, use pre-Chimera", e);
                        AtomicBoolean atomicBoolean2 = k6.g.f10939a;
                        context2 = context.createPackageContext("com.google.android.gms", 3);
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    context2 = null;
                }
            }
            f50680a = context2;
            return context2;
        }
        return context3;
    }
}
