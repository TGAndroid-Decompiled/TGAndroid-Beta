package y8;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import m.t3;
public final class y0 extends n6.g {
    public final ExecutorService U;
    public final v1.b V;
    public final v1.b W;
    public final v1.b X;
    public final v1.b Y;
    public final v1.b Z;
    public final v1.b f48685a0;
    public final v1.b f48686b0;
    public final v1.b f48687c0;
    public final v1.b f48688d0;
    public final v1.b f48689e0;
    public final z0 f48690f0;

    public y0(Context context, Looper looper, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar, t3 t3Var) {
        super(context, looper, 14, t3Var, kVar, lVar, 0);
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        z0 a2 = z0.a(context);
        this.V = new v1.b();
        this.W = new v1.b();
        this.X = new v1.b();
        this.Y = new v1.b();
        this.Z = new v1.b();
        this.f48685a0 = new v1.b();
        this.f48686b0 = new v1.b();
        this.f48687c0 = new v1.b();
        this.f48688d0 = new v1.b();
        this.f48689e0 = new v1.b();
        n6.l.h(unconfigurableExecutorService);
        this.U = unconfigurableExecutorService;
        this.f48690f0 = a2;
        File file = new File(new File(context.getFilesDir(), "wearos_assets"), "streamtmp");
        file.mkdirs();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                file2.delete();
            }
        }
    }

    @Override
    public final void B(int i10, IBinder iBinder, Bundle bundle, int i11) {
        if (Log.isLoggable("WearableClient", 2)) {
            Log.v("WearableClient", "onPostInitHandler: statusCode " + i10);
        }
        if (i10 == 0) {
            this.V.b(iBinder);
            this.W.b(iBinder);
            this.X.b(iBinder);
            this.Z.b(iBinder);
            this.f48685a0.b(iBinder);
            this.f48686b0.b(iBinder);
            this.f48687c0.b(iBinder);
            this.f48688d0.b(iBinder);
            this.f48689e0.b(iBinder);
            this.Y.b(iBinder);
            i10 = 0;
        }
        super.B(i10, iBinder, bundle, i11);
    }

    @Override
    public final boolean C() {
        return true;
    }

    @Override
    public final void f(n6.b bVar) {
        int i10;
        n6.a0 a0Var = this.v;
        AtomicInteger atomicInteger = this.R;
        Context context = this.f15803n;
        if (!k()) {
            try {
                Bundle bundle = context.getPackageManager().getApplicationInfo("com.google.android.wearable.app.cn", 128).metaData;
                if (bundle != null) {
                    i10 = bundle.getInt("com.google.android.wearable.api.version", 0);
                } else {
                    i10 = 0;
                }
                if (i10 < 8600000) {
                    Log.w("WearableClient", "The Wear OS app is out of date. Requires API version 8600000 but found " + i10);
                    Intent intent = new Intent("com.google.android.wearable.app.cn.UPDATE_ANDROID_WEAR").setPackage("com.google.android.wearable.app.cn");
                    if (context.getPackageManager().resolveActivity(intent, 65536) == null) {
                        intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.wearable.app.cn").build());
                    }
                    PendingIntent activity = PendingIntent.getActivity(context, 0, intent, f8.b.f9065a);
                    n6.l.i(bVar, "Connection progress callbacks cannot be null.");
                    this.E = bVar;
                    a0Var.sendMessage(a0Var.obtainMessage(3, atomicInteger.get(), 6, activity));
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                n6.l.i(bVar, "Connection progress callbacks cannot be null.");
                this.E = bVar;
                a0Var.sendMessage(a0Var.obtainMessage(3, atomicInteger.get(), 16, null));
                return;
            }
        }
        super.f(bVar);
    }

    @Override
    public final boolean k() {
        if (!this.f48690f0.b()) {
            return true;
        }
        return false;
    }

    @Override
    public final int l() {
        return 8600000;
    }

    @Override
    public final IInterface q(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
        if (queryLocalInterface instanceof h0) {
            return (h0) queryLocalInterface;
        }
        return new a9.a(iBinder, "com.google.android.gms.wearable.internal.IWearableService", 4);
    }

    @Override
    public final k6.c[] r() {
        return x8.j.f48262b;
    }

    @Override
    public final String v() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    @Override
    public final String w() {
        return "com.google.android.gms.wearable.BIND";
    }

    @Override
    public final String x() {
        if (this.f48690f0.b()) {
            return "com.google.android.wearable.app.cn";
        }
        return "com.google.android.gms";
    }
}
