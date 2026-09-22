package v0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
public final class k {
    public final Context f44133a;

    public k(Context context, int i10) {
        switch (i10) {
            case 1:
                this.f44133a = context;
                return;
            default:
                kotlin.jvm.internal.i.e(context, "context");
                this.f44133a = context;
                return;
        }
    }

    public static j a(k kVar, Object obj) {
        if (obj.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return kVar.c();
        }
        if (obj instanceof o) {
            for (q qVar : ((o) obj).f44137a) {
            }
        }
        Context ctx = kVar.f44133a;
        kotlin.jvm.internal.i.e(ctx, "ctx");
        if (!ctx.getPackageManager().hasSystemFeature("android.software.leanback") && !ctx.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            int i10 = Build.VERSION.SDK_INT;
            m mVar = null;
            if (i10 >= 34) {
                m mVar2 = new m(ctx);
                if (mVar2.isAvailableOnDevice()) {
                    mVar = mVar2;
                }
                if (mVar == null) {
                    return kVar.c();
                }
                return mVar;
            } else if (i10 > 33) {
                return null;
            } else {
                return kVar.c();
            }
        }
        return kVar.c();
    }

    public PackageInfo b(int i10, String str) {
        return this.f44133a.getPackageManager().getPackageInfo(str, i10);
    }

    public j c() {
        String string;
        Context context = this.f44133a;
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
        List<String> m10 = hd.g.m(arrayList);
        if (m10.isEmpty()) {
            return null;
        }
        j jVar = null;
        for (String str : m10) {
            try {
                Object newInstance = Class.forName(str).getConstructor(Context.class).newInstance(context);
                kotlin.jvm.internal.i.c(newInstance, "null cannot be cast to non-null type androidx.credentials.CredentialProvider");
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
