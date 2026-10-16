package v0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import t7.u;
public final class k implements w2.d, Continuation {
    public Object f46466a;

    public k(Object obj) {
        this.f46466a = obj;
    }

    public static j a(k kVar, Object obj) {
        if (obj.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return kVar.c();
        }
        if (obj instanceof o) {
            for (q qVar : ((o) obj).f46470a) {
            }
        }
        Context ctx = (Context) kVar.f46466a;
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

    public void b(androidx.biometric.e eVar) {
        h8.j jVar = (h8.j) this.f46466a;
        jVar.f10388a = eVar;
        Iterator it = jVar.f10390c.iterator();
        while (it.hasNext()) {
            ((x6.e) it.next()).b();
        }
        jVar.f10390c.clear();
        jVar.f10389b = null;
    }

    public j c() {
        String string;
        Context context = (Context) this.f46466a;
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

    @Override
    public Object then(Task task) {
        return ((Callable) this.f46466a).call();
    }

    public k(Context context) {
        kotlin.jvm.internal.i.e(context, "context");
        this.f46466a = context;
    }

    public k(int i10) {
        switch (i10) {
            case 5:
                this.f46466a = new CopyOnWriteArrayList();
                return;
            default:
                this.f46466a = new u(28);
                return;
        }
    }
}
