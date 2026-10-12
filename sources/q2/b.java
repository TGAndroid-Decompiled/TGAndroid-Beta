package q2;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.i;
import v0.j;
import v0.l;
import v0.n;
import v0.p;
public final class b {
    public final Context f43257a;

    public b(Context context, int i10) {
        switch (i10) {
            case 1:
                i.e(context, "context");
                this.f43257a = context;
                return;
            default:
                context.getClass();
                this.f43257a = context;
                return;
        }
    }

    public static j a(b bVar, Object obj) {
        if (obj.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return bVar.c();
        }
        if (obj instanceof n) {
            for (p pVar : ((n) obj).f46470a) {
            }
        }
        Context ctx = bVar.f43257a;
        i.e(ctx, "ctx");
        if (!ctx.getPackageManager().hasSystemFeature("android.software.leanback") && !ctx.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            int i10 = Build.VERSION.SDK_INT;
            l lVar = null;
            if (i10 >= 34) {
                l lVar2 = new l(ctx);
                if (lVar2.isAvailableOnDevice()) {
                    lVar = lVar2;
                }
                if (lVar == null) {
                    return bVar.c();
                }
                return lVar;
            } else if (i10 > 33) {
                return null;
            } else {
                return bVar.c();
            }
        }
        return bVar.c();
    }

    public static int b(b2.x r5) {
        throw new UnsupportedOperationException("Method not decompiled: q2.b.b(b2.x):int");
    }

    public j c() {
        String string;
        Context context = this.f43257a;
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
        List<String> m10 = jd.g.m(arrayList);
        if (m10.isEmpty()) {
            return null;
        }
        j jVar = null;
        for (String str : m10) {
            try {
                Object newInstance = Class.forName(str).getConstructor(Context.class).newInstance(context);
                i.c(newInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
                j jVar2 = (j) newInstance;
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
