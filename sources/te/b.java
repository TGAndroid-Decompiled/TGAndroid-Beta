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
import zh.m0;
public final class b implements d, Continuation, a0 {
    public final int f46998a;
    public Object f46999b;

    public b(int i10, boolean z10) {
        this.f46998a = i10;
    }

    public static j c(b bVar, Object obj) {
        if (obj.equals("androidx.credentials.TYPE_CLEAR_RESTORE_CREDENTIAL")) {
            return bVar.e();
        }
        if (obj instanceof n) {
            for (p pVar : ((n) obj).f47859a) {
            }
        }
        Context ctx = (Context) bVar.f46999b;
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
        m0 m0Var = (m0) this.f46999b;
        if (m0Var.getParentActivity() != null) {
            pf.d.r(m0Var.getParentActivity(), str);
        }
    }

    @Override
    public void b(b0 b0Var) {
        m0 m0Var = (m0) this.f46999b;
        FrameLayout frameLayout = m0Var.f52034f;
        if (frameLayout != null) {
            frameLayout.removeView(b0Var);
        }
        if (m0Var.F == b0Var) {
            m0Var.F = null;
        }
        c1 c1Var = m0Var.d;
        if (c1Var != null) {
            c1Var.setScanHidden(false);
        }
    }

    public void d(e eVar) {
        h8.j jVar = (h8.j) this.f46999b;
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
        Context context = (Context) this.f46999b;
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
        return ((Callable) this.f46999b).call();
    }

    public String toString() {
        switch (this.f46998a) {
            case 0:
                c cVar = c.e;
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("method-execution".substring(7));
                stringBuffer.append("(");
                stringBuffer.append(((s4.b) this.f46999b).n());
                stringBuffer.append(")");
                return stringBuffer.toString();
            default:
                return super.toString();
        }
    }

    public b(Object obj, int i10) {
        this.f46998a = i10;
        this.f46999b = obj;
    }

    public b(Context context) {
        this.f46998a = 2;
        i.e(context, "context");
        this.f46999b = context;
    }

    public b(int i10) {
        this.f46998a = i10;
        switch (i10) {
            case 7:
                this.f46999b = new CopyOnWriteArrayList();
                return;
            default:
                this.f46999b = new u(28);
                return;
        }
    }
}
