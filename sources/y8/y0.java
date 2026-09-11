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
public final class y0 extends n6.g {
    public final ExecutorService U;
    public final pb.c V;
    public final pb.c W;
    public final pb.c X;
    public final pb.c Y;
    public final pb.c Z;
    public final pb.c f49669a0;
    public final pb.c f49670b0;
    public final pb.c f49671c0;
    public final pb.c f49672d0;
    public final pb.c f49673e0;
    public final z0 f49674f0;

    public y0(Context context, Looper looper, com.google.android.gms.common.api.k kVar, com.google.android.gms.common.api.l lVar, p3 p3Var) {
        super(context, looper, 14, p3Var, kVar, lVar, 0);
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());
        z0 a2 = z0.a(context);
        this.V = new pb.c();
        this.W = new pb.c();
        this.X = new pb.c();
        this.Y = new pb.c();
        this.Z = new pb.c();
        this.f49669a0 = new pb.c();
        this.f49670b0 = new pb.c();
        this.f49671c0 = new pb.c();
        this.f49672d0 = new pb.c();
        this.f49673e0 = new pb.c();
        n6.l.h(unconfigurableExecutorService);
        this.U = unconfigurableExecutorService;
        this.f49674f0 = a2;
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
            this.V.a(iBinder);
            this.W.a(iBinder);
            this.X.a(iBinder);
            this.Z.a(iBinder);
            this.f49669a0.a(iBinder);
            this.f49670b0.a(iBinder);
            this.f49671c0.a(iBinder);
            this.f49672d0.a(iBinder);
            this.f49673e0.a(iBinder);
            this.Y.a(iBinder);
            i10 = 0;
        }
        super.B(i10, iBinder, bundle, i11);
    }

    @Override
    public final boolean C() {
        return true;
    }

    @Override
    public final void e(n6.b bVar) {
        int i10;
        n6.a0 a0Var = this.v;
        AtomicInteger atomicInteger = this.R;
        Context context = this.f16539n;
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
                    PendingIntent activity = PendingIntent.getActivity(context, 0, intent, f8.b.f9414a);
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
        super.e(bVar);
    }

    @Override
    public final boolean k() {
        if (!this.f49674f0.b()) {
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
        return x8.j.f49284b;
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
        if (this.f49674f0.b()) {
            return "com.google.android.wearable.app.cn";
        }
        return "com.google.android.gms";
    }
}
