package t6;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;
import n6.h0;
import n6.l;
import w6.b;
public final class a {
    public static final Object f42078b = new Object();
    public static volatile a f42079c;
    public final ConcurrentHashMap f42080a = new ConcurrentHashMap();

    public static a a() {
        if (f42079c == null) {
            synchronized (f42078b) {
                try {
                    if (f42079c == null) {
                        f42079c = new a();
                    }
                } finally {
                }
            }
        }
        a aVar = f42079c;
        l.h(aVar);
        return aVar;
    }

    public final void b(Context context, ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof h0)) {
            ConcurrentHashMap concurrentHashMap = this.f42080a;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    try {
                        context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                    } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                    }
                    return;
                } finally {
                    concurrentHashMap.remove(serviceConnection);
                }
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }

    public final boolean c(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, Executor executor) {
        boolean bindService;
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((b.a(context).f11992a.getPackageManager().getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!(serviceConnection instanceof h0)) {
            ConcurrentHashMap concurrentHashMap = this.f42080a;
            ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
            if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
                Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
            }
            if (executor == null) {
                executor = null;
            }
            try {
                if (Build.VERSION.SDK_INT >= 29 && executor != null) {
                    bindService = context.bindService(intent, i10, executor, serviceConnection);
                } else {
                    bindService = context.bindService(intent, serviceConnection, i10);
                }
                if (!bindService) {
                    return false;
                }
                return bindService;
            } finally {
                concurrentHashMap.remove(serviceConnection, serviceConnection);
            }
        }
        if (executor == null) {
            executor = null;
        }
        if (Build.VERSION.SDK_INT >= 29 && executor != null) {
            return context.bindService(intent, i10, executor, serviceConnection);
        }
        return context.bindService(intent, serviceConnection, i10);
    }
}
