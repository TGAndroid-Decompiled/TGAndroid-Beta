package r2;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import b2.r0;
import e2.d0;
import java.util.ArrayList;
import java.util.List;
public final class h implements l {
    public final Context f46886a;

    public h(Context context, int i10) {
        switch (i10) {
            case 1:
                kotlin.jvm.internal.i.e(context, "context");
                this.f46886a = context;
                return;
            default:
                this.f46886a = context;
                return;
        }
    }

    public static v0.j a(h hVar, Object obj) {
        if (obj.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return hVar.c();
        }
        if (obj instanceof v0.n) {
            for (v0.p pVar : ((v0.n) obj).f49021a) {
            }
        }
        Context ctx = hVar.f46886a;
        kotlin.jvm.internal.i.e(ctx, "ctx");
        if (!ctx.getPackageManager().hasSystemFeature("android.software.leanback") && !ctx.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            int i10 = Build.VERSION.SDK_INT;
            v0.l lVar = null;
            if (i10 >= 34) {
                v0.l lVar2 = new v0.l(ctx);
                if (lVar2.isAvailableOnDevice()) {
                    lVar = lVar2;
                }
                if (lVar == null) {
                    return hVar.c();
                }
                return lVar;
            } else if (i10 > 33) {
                return null;
            } else {
                return hVar.c();
            }
        }
        return hVar.c();
    }

    @Override
    public m b(com.google.firebase.messaging.n nVar) {
        Context context;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 || ((context = this.f46886a) != null && i10 >= 28 && context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            int h = r0.h(((b2.s) nVar.f7956c).f3643r);
            e2.a.i("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + d0.F(h));
            return new n6.t(14, new b(h, 0), new b(h, 1)).b(nVar);
        }
        return new rb.a(20).b(nVar);
    }

    public v0.j c() {
        String string;
        Context context = this.f46886a;
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 132);
        ArrayList arrayList = new ArrayList();
        ServiceInfo[] serviceInfoArr = packageInfo.services;
        if (serviceInfoArr != null) {
            for (ServiceInfo serviceInfo : serviceInfoArr) {
                Bundle bundle = serviceInfo.metaData;
                if (bundle != null && (string = bundle.getString("androidx.credentials.CREDENTIAL_PROVIDER_KEY")) != null) {
                    arrayList.add(string);
                }
            }
        }
        List<String> m10 = id.g.m(arrayList);
        if (m10.isEmpty()) {
            return null;
        }
        v0.j jVar = null;
        for (String str : m10) {
            try {
                Object newInstance = Class.forName(str).getConstructor(Context.class).newInstance(context);
                kotlin.jvm.internal.i.c(newInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                v0.j jVar2 = (v0.j) newInstance;
                if (!jVar2.isAvailableOnDevice()) {
                    continue;
                } else if (jVar != null) {
                    Log.i("CredProviderFactory", "Only one active OEM CredentialProvider allowed");
                    return null;
                } else {
                    jVar = jVar2;
                }
            } catch (Throwable unused) {
            }
        }
        return jVar;
    }
}
