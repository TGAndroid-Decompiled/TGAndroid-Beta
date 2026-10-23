package te;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.FrameLayout;
import androidx.biometric.e;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import jd.g;
import kotlin.jvm.internal.i;
import t7.u;
import v0.j;
import v0.l;
import v0.n;
import v0.p;
import w2.d;
import zh.a0;
import zh.b0;
import zh.c1;
import zh.n0;
public final class b implements d, Continuation, a0 {
    public final int f47007a;
    public Object f47008b;

    public b(int i10, boolean z10) {
        this.f47007a = i10;
    }

    public static j c(b bVar, Object obj) {
        if (obj.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return bVar.e();
        }
        if (obj instanceof n) {
            for (p pVar : ((n) obj).f47868a) {
            }
        }
        Context ctx = (Context) bVar.f47008b;
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
                    return bVar.e();
                }
                return lVar;
            } else if (i10 > 33) {
                return null;
            } else {
                return bVar.e();
            }
        }
        return bVar.e();
    }

    @Override
    public void a(String str) {
        n0 n0Var = (n0) this.f47008b;
        if (n0Var.getParentActivity() != null) {
            pf.d.r(n0Var.getParentActivity(), str);
        }
    }

    @Override
    public void b(b0 b0Var) {
        n0 n0Var = (n0) this.f47008b;
        FrameLayout frameLayout = n0Var.f52049f;
        if (frameLayout != null) {
            frameLayout.removeView(b0Var);
        }
        if (n0Var.F == b0Var) {
            n0Var.F = null;
        }
        c1 c1Var = n0Var.d;
        if (c1Var != null) {
            c1Var.setScanHidden(false);
        }
    }

    public void d(e eVar) {
        h8.j jVar = (h8.j) this.f47008b;
        jVar.f11692a = eVar;
        Iterator it = jVar.f11694c.iterator();
        while (it.hasNext()) {
            ((x6.e) it.next()).b();
        }
        jVar.f11694c.clear();
        jVar.f11693b = null;
    }

    public j e() {
        String string;
        Context context = (Context) this.f47008b;
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
        List<String> m10 = g.m(arrayList);
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

    @Override
    public Object then(Task task) {
        return ((Callable) this.f47008b).call();
    }

    public String toString() {
        switch (this.f47007a) {
            case 0:
                c cVar = c.e;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("method-execution".substring(7));
                stringBuffer.append("(");
                stringBuffer.append(((s4.b) this.f47008b).n());
                stringBuffer.append(")");
                return stringBuffer.toString();
            default:
                return super.toString();
        }
    }

    public b(Object obj, int i10) {
        this.f47007a = i10;
        this.f47008b = obj;
    }

    public b(Context context) {
        this.f47007a = 2;
        i.e(context, "context");
        this.f47008b = context;
    }

    public b(int i10) {
        this.f47007a = i10;
        switch (i10) {
            case 7:
                this.f47008b = new CopyOnWriteArrayList();
                return;
            default:
                this.f47008b = new u(28);
                return;
        }
    }
}
