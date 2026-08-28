package u5;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import f7.w;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import v0.q;
public final class h implements androidx.emoji2.text.j {
    public static h f48116b;
    public final Context f48117a;

    public h(Context context, int i9) {
        switch (i9) {
            case 1:
                this.f48117a = context.getApplicationContext();
                return;
            case 2:
                this.f48117a = context.getApplicationContext();
                return;
            case 3:
                kotlin.jvm.internal.i.e(context, "context");
                this.f48117a = context;
                return;
            default:
                this.f48117a = context.getApplicationContext();
                return;
        }
    }

    public static v0.j b(h hVar, Object obj) {
        if (obj.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return hVar.d();
        }
        if (obj instanceof v0.o) {
            for (q qVar : ((v0.o) obj).f48239a) {
            }
        }
        Context ctx = hVar.f48117a;
        kotlin.jvm.internal.i.e(ctx, "ctx");
        if (!ctx.getPackageManager().hasSystemFeature("android.software.leanback") && !ctx.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            int i9 = Build.VERSION.SDK_INT;
            v0.m mVar = null;
            if (i9 >= 34) {
                v0.m mVar2 = new v0.m(ctx);
                if (mVar2.isAvailableOnDevice()) {
                    mVar = mVar2;
                }
                if (mVar == null) {
                    return hVar.d();
                }
                return mVar;
            } else if (i9 > 33) {
                return null;
            } else {
                return hVar.d();
            }
        }
        return hVar.d();
    }

    public static h c(Context context) {
        x5.l.h(context);
        synchronized (h.class) {
            try {
                if (f48116b == null) {
                    o.a(context);
                    f48116b = new h(context, 0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f48116b;
    }

    public static final l e(PackageInfo packageInfo, l... lVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            m mVar = new m(packageInfo.signatures[0].toByteArray());
            for (int i9 = 0; i9 < lVarArr.length; i9++) {
                if (lVarArr[i9].equals(mVar)) {
                    return lVarArr[i9];
                }
            }
        }
        return null;
    }

    public static final boolean f(android.content.pm.PackageInfo r4, boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: u5.h.f(android.content.pm.PackageInfo, boolean):boolean");
    }

    @Override
    public void a(w wVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new androidx.emoji2.text.a("EmojiCompatInitializer", 0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new androidx.car.app.utils.b(this, wVar, threadPoolExecutor, 2));
    }

    public v0.j d() {
        String string;
        Context context = this.f48117a;
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
        List<String> m10 = pc.g.m(arrayList);
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
