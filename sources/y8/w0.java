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
import m.p3;
public final class w0 extends n6.g {
    public final ExecutorService U;
    public final ib.c V;
    public final ib.c W;
    public final ib.c X;
    public final ib.c Y;
    public final ib.c Z;
    public final ib.c f54313a0;
    public final ib.c f54314b0;
    public final ib.c f54315c0;
    public final ib.c f54316d0;
    public final ib.c f54317e0;
    public final x0 f54318f0;

    public w0(Context context, Looper looper, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar, p3 p3Var) {
        super(context, looper, 14, p3Var, kVar, lVar, 0);
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        x0 a2 = x0.a(context);
        this.V = new ib.c();
        this.W = new ib.c();
        this.X = new ib.c();
        this.Y = new ib.c();
        this.Z = new ib.c();
        this.f54313a0 = new ib.c();
        this.f54314b0 = new ib.c();
        this.f54315c0 = new ib.c();
        this.f54316d0 = new ib.c();
        this.f54317e0 = new ib.c();
        n6.l.g(unconfigurableExecutorService);
        this.U = unconfigurableExecutorService;
        this.f54318f0 = a2;
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
    public final void C(int i10, IBinder iBinder, Bundle bundle, int i11) {
        if (Log.isLoggable("WearableClient", 2)) {
            Log.v("WearableClient", "onPostInitHandler: statusCode " + i10);
        }
        if (i10 == 0) {
            this.V.a(iBinder);
            this.W.a(iBinder);
            this.X.a(iBinder);
            this.Z.a(iBinder);
            this.f54313a0.a(iBinder);
            this.f54314b0.a(iBinder);
            this.f54315c0.a(iBinder);
            this.f54316d0.a(iBinder);
            this.f54317e0.a(iBinder);
            this.Y.a(iBinder);
            i10 = 0;
        }
        super.C(i10, iBinder, bundle, i11);
    }

    @Override
    public final boolean D() {
        return true;
    }

    @Override
    public final void f(n6.b bVar) {
        int i10;
        n6.a0 a0Var = this.f13589w;
        AtomicInteger atomicInteger = this.R;
        Context context = this.f13586n;
        if (!l()) {
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
                    PendingIntent activity = PendingIntent.getActivity(context, 0, intent, f8.b.f6963a);
                    n6.l.h(bVar, "Connection progress callbacks cannot be null.");
                    this.E = bVar;
                    a0Var.sendMessage(a0Var.obtainMessage(3, atomicInteger.get(), 6, activity));
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                n6.l.h(bVar, "Connection progress callbacks cannot be null.");
                this.E = bVar;
                a0Var.sendMessage(a0Var.obtainMessage(3, atomicInteger.get(), 16, null));
                return;
            }
        }
        super.f(bVar);
    }

    @Override
    public final boolean l() {
        if (!this.f54318f0.b()) {
            return true;
        }
        return false;
    }

    @Override
    public final int m() {
        return 8600000;
    }

    @Override
    public final IInterface r(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.wearable.internal.IWearableService");
        if (queryLocalInterface instanceof f0) {
            return (f0) queryLocalInterface;
        }
        return new a9.a(iBinder, "com.google.android.gms.wearable.internal.IWearableService", 4);
    }

    @Override
    public final k6.c[] s() {
        return x8.c.f53445b;
    }

    @Override
    public final String w() {
        return "com.google.android.gms.wearable.internal.IWearableService";
    }

    @Override
    public final String x() {
        return "com.google.android.gms.wearable.BIND";
    }

    @Override
    public final String y() {
        if (this.f54318f0.b()) {
            return "com.google.android.wearable.app.cn";
        }
        return "com.google.android.gms";
    }
}
