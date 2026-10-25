package z8;

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
import m.r3;
public final class z0 extends o6.g {
    public final ExecutorService U;
    public final i2.c V;
    public final i2.c W;
    public final i2.c X;
    public final i2.c Y;
    public final i2.c Z;
    public final i2.c f52800a0;
    public final i2.c f52801b0;
    public final i2.c f52802c0;
    public final i2.c f52803d0;
    public final i2.c f52804e0;
    public final a1 f52805f0;

    public z0(Context context, Looper looper, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar, r3 r3Var) {
        super(context, looper, 14, r3Var, kVar, lVar, 0);
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        a1 a2 = a1.a(context);
        this.V = new i2.c(2);
        this.W = new i2.c(2);
        this.X = new i2.c(2);
        this.Y = new i2.c(2);
        this.Z = new i2.c(2);
        this.f52800a0 = new i2.c(2);
        this.f52801b0 = new i2.c(2);
        this.f52802c0 = new i2.c(2);
        this.f52803d0 = new i2.c(2);
        this.f52804e0 = new i2.c(2);
        o6.l.h(unconfigurableExecutorService);
        this.U = unconfigurableExecutorService;
        this.f52805f0 = a2;
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
            this.V.c(iBinder);
            this.W.c(iBinder);
            this.X.c(iBinder);
            this.Z.c(iBinder);
            this.f52800a0.c(iBinder);
            this.f52801b0.c(iBinder);
            this.f52802c0.c(iBinder);
            this.f52803d0.c(iBinder);
            this.f52804e0.c(iBinder);
            this.Y.c(iBinder);
            i10 = 0;
        }
        super.B(i10, iBinder, bundle, i11);
    }

    @Override
    public final boolean C() {
        return true;
    }

    @Override
    public final void h(o6.b bVar) {
        int i10;
        o6.a0 a0Var = this.v;
        AtomicInteger atomicInteger = this.R;
        Context context = this.f19127n;
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
                    PendingIntent activity = PendingIntent.getActivity(context, 0, intent, g8.b.f12397a);
                    o6.l.i(bVar, "Connection progress callbacks cannot be null.");
                    this.E = bVar;
                    a0Var.sendMessage(a0Var.obtainMessage(3, atomicInteger.get(), 6, activity));
                    return;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                o6.l.i(bVar, "Connection progress callbacks cannot be null.");
                this.E = bVar;
                a0Var.sendMessage(a0Var.obtainMessage(3, atomicInteger.get(), 16, null));
                return;
            }
        }
        super.h(bVar);
    }

    @Override
    public final boolean k() {
        if (!this.f52805f0.b()) {
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
        if (queryLocalInterface instanceof i0) {
            return (i0) queryLocalInterface;
        }
        return new a8.a(iBinder, "com.google.android.gms.wearable.internal.IWearableService", 5);
    }

    @Override
    public final l6.c[] r() {
        return y8.j.f52397b;
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
        if (this.f52805f0.b()) {
            return "com.google.android.wearable.app.cn";
        }
        return "com.google.android.gms";
    }
}
