package qb;

import a0.h;
import ab.e0;
import ah.i1;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.util.Log;
import android.view.View;
import androidx.biometric.o;
import androidx.biometric.q;
import androidx.biometric.u;
import androidx.biometric.y;
import androidx.fragment.app.f0;
import androidx.fragment.app.j0;
import androidx.fragment.app.k0;
import androidx.lifecycle.a0;
import androidx.lifecycle.t;
import androidx.lifecycle.z;
import c3.j;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.api.internal.u0;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.identitycredentials.GetCredentialRequest;
import com.google.android.gms.internal.cast.v;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import ei.xa;
import g6.i;
import g6.n;
import g6.s;
import h7.d;
import h7.e;
import h7.f;
import hg.z1;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import m.j1;
import n6.l;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.LaunchActivity;
import qg.m;
import qg.t1;
import qg.v0;
import rg.v1;
import v7.c8;
import v7.j5;
import v7.r8;
import v7.u6;
public final class c implements cl0, a0, androidx.activity.result.b, WebMessageListenerBoundaryInterface, u0, OnSuccessListener, n, ee.b, v1, j1, r, gb.n, z1 {
    public final int f44437a;
    public Object f44438b;

    public c(g6.r rVar, String[] strArr) {
        this.f44437a = 23;
        this.f44438b = strArr;
    }

    public static p d(Looper looper, Object obj, String str) {
        l.i(obj, "Listener must not be null");
        l.i(looper, "Looper must not be null");
        return new p(looper, obj, str);
    }

    @Override
    public h G() {
        return null;
    }

    @Override
    public boolean O(int i10) {
        return true;
    }

    @Override
    public void S(ArrayList arrayList) {
        hg.j1 j1Var = (hg.j1) this.f44438b;
        String str = j1Var.Z;
        if (str != null) {
            j1Var.U(str, j1Var.f11922c0, j1Var.f11923d0, j1Var.f11920b0, j1Var.f11919a0);
        }
    }

    @Override
    public void U(float f7) {
        xa xaVar = (xa) this.f44438b;
        v0.e(xaVar.F1).k(String.valueOf(m.f44564a.indexOf(xaVar.O0.getCurrentBrush())), f7);
        t1 t1Var = xaVar.A1;
        t1Var.f44662c = f7;
        xaVar.D0(t1Var, null, false);
    }

    @Override
    public void Y(Object obj) {
        switch (this.f44437a) {
            case 5:
                q qVar = (q) this.f44438b;
                if (((Boolean) obj).booleanValue()) {
                    if (qVar.R()) {
                        qVar.W(qVar.q(2131689613));
                    }
                    y yVar = qVar.f2833l0;
                    if (!yVar.f2849n) {
                        Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                    } else {
                        Executor executor = yVar.d;
                        if (executor == null) {
                            executor = new o(1);
                        }
                        executor.execute(new androidx.biometric.h(qVar, 0));
                    }
                    y yVar2 = qVar.f2833l0;
                    if (yVar2.f2856u == null) {
                        yVar2.f2856u = new z();
                    }
                    y.h(yVar2.f2856u, Boolean.FALSE);
                    return;
                }
                return;
            default:
                t tVar = (t) obj;
                androidx.fragment.app.p pVar = (androidx.fragment.app.p) this.f44438b;
                if (tVar != null && pVar.f3243r0) {
                    pVar.getClass();
                    throw new IllegalStateException("Fragment " + pVar + " did not return a View from onCreateView() or this was called before onCreateView().");
                }
                return;
        }
    }

    public void a(j jVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f44438b;
        long[] jArr = jVar.e;
        if (jArr.length > 0 && !linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
            linkedHashMap.put(Long.valueOf(jVar.e[0]), jVar);
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f44437a) {
            case 23:
                g6.q qVar = new g6.q(1, (TaskCompletionSource) obj2);
                i iVar = (i) ((s) obj).u();
                Parcel N0 = iVar.N0();
                v.d(N0, qVar);
                N0.writeStringArray((String[]) this.f44438b);
                iVar.S0(N0, 6);
                return;
            default:
                f fVar = new f(1, (TaskCompletionSource) obj2);
                g gVar = new g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
                int i10 = q7.a.f44419a;
                obtain.writeStrongBinder(fVar);
                q7.a.b(obtain, (GetCredentialRequest) this.f44438b);
                q7.a.b(obtain, gVar);
                ((h7.b) ((d) ((e) obj).u())).F0(obtain, 1);
                return;
        }
    }

    public void b(StringBuilder sb2, Iterator it) {
        d9.l lVar = (d9.l) this.f44438b;
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb2.append(d9.l.f(entry.getKey()));
            sb2.append("=");
            sb2.append(d9.l.f(entry.getValue()));
            while (it.hasNext()) {
                sb2.append((CharSequence) lVar.f7892a);
                Map.Entry entry2 = (Map.Entry) it.next();
                sb2.append(d9.l.f(entry2.getKey()));
                sb2.append("=");
                sb2.append(d9.l.f(entry2.getValue()));
            }
        }
    }

    public void c(j6.l lVar, u uVar) {
        k0 k0Var = (k0) this.f44438b;
        if (k0Var == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
        } else if (k0Var.P()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
        } else {
            k0 k0Var2 = (k0) this.f44438b;
            q qVar = (q) k0Var2.D("androidx.biometric.BiometricFragment");
            if (qVar == null) {
                qVar = new q();
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(k0Var2);
                aVar.f(0, qVar, "androidx.biometric.BiometricFragment");
                aVar.e(true, true);
                k0Var2.A(true);
                k0Var2.E();
            }
            androidx.fragment.app.v k10 = qVar.k();
            if (k10 == null) {
                Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
                return;
            }
            y yVar = qVar.f2833l0;
            yVar.f2842f = lVar;
            int i10 = lVar.f14288a;
            if (i10 == 0) {
                if (uVar != null) {
                    i10 = 15;
                } else {
                    i10 = 255;
                }
            }
            if (Build.VERSION.SDK_INT < 30 && i10 == 15 && uVar == null) {
                yVar.f2843g = v7.m.a();
            } else {
                yVar.f2843g = uVar;
            }
            if (qVar.Q()) {
                qVar.f2833l0.f2846k = qVar.q(2131689576);
            } else {
                qVar.f2833l0.f2846k = null;
            }
            if (qVar.Q() && new androidx.biometric.e(new k6.h(k10, 1)).f(255) != 0) {
                qVar.f2833l0.f2849n = true;
                qVar.S();
            } else if (qVar.f2833l0.f2851p) {
                qVar.f2832k0.postDelayed(new androidx.biometric.p(qVar), 600L);
            } else {
                qVar.X();
            }
        }
    }

    public c2.r e(c2.b r24) {
        throw new UnsupportedOperationException("Method not decompiled: qb.c.e(c2.b):c2.r");
    }

    @Override
    public void f(int i10) {
        ((hg.j1) this.f44438b).l();
    }

    @Override
    public Object f2() {
        Constructor constructor = (Constructor) this.f44438b;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e) {
            r8 r8Var = jb.c.f14370a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (InstantiationException e7) {
            throw new RuntimeException("Failed to invoke constructor '" + jb.c.b(constructor) + "' with no args", e7);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException("Failed to invoke constructor '" + jb.c.b(constructor) + "' with no args", e10.getCause());
        }
    }

    @Override
    public void g(k6.a aVar) {
        w wVar = (w) this.f44438b;
        wVar.f6511o.lock();
        try {
            wVar.f6508l = aVar;
            w.l(wVar);
        } finally {
            wVar.f6511o.unlock();
        }
    }

    @Override
    public float get() {
        xa xaVar = (xa) this.f44438b;
        int i10 = xaVar.F1;
        m currentBrush = xaVar.O0.getCurrentBrush();
        if (currentBrush == null) {
            return v0.e(i10).f44685i;
        }
        return v0.e(i10).f(String.valueOf(m.f44564a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override
    public void h(Object obj) {
        Bundle extras;
        switch (this.f44437a) {
            case 8:
                androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
                j0 j0Var = (j0) this.f44438b;
                f0 f0Var = (f0) j0Var.F.pollFirst();
                if (f0Var == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    return;
                }
                String str = f0Var.f3176a;
                int i10 = f0Var.f3177b;
                androidx.fragment.app.s f7 = j0Var.f3190c.f(str);
                if (f7 == null) {
                    Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str);
                    return;
                }
                f7.x(i10, aVar.f2679a, aVar.f2680b);
                return;
            default:
                ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f44438b;
                androidx.activity.result.a aVar2 = (androidx.activity.result.a) obj;
                proxyBillingActivityV2.getClass();
                Intent intent = aVar2.f2680b;
                int i11 = com.google.android.gms.internal.play_billing.u.e("ProxyBillingActivityV2", intent).f4752a;
                ResultReceiver resultReceiver = proxyBillingActivityV2.N;
                if (resultReceiver != null) {
                    if (intent == null) {
                        extras = null;
                    } else {
                        extras = intent.getExtras();
                    }
                    resultReceiver.send(i11, extras);
                }
                int i12 = aVar2.f2679a;
                if (i12 != -1 || i11 != 0) {
                    com.google.android.gms.internal.play_billing.u.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i12 + " and billing's responseCode: " + i11);
                }
                proxyBillingActivityV2.finish();
                return;
        }
    }

    @Override
    public boolean i() {
        return true;
    }

    @Override
    public void j(String str, long j10, long j11, long j12) {
        e6.o oVar = (e6.o) this.f44438b;
        try {
            oVar.a(new e6.n(new Status(2103, null, null, null), 1));
        } catch (IllegalStateException e) {
            g6.b bVar = e6.h.f8368k;
            Log.e(bVar.f10842a, bVar.d("Result already set when calling onRequestReplaced", new Object[0]), e);
        }
        Iterator it = oVar.f8389q.f8374i.iterator();
        while (it.hasNext()) {
            ((e6.g) it.next()).h(str, j10, 2103, j11, j12);
        }
    }

    public Boolean k() {
        Bundle bundle = (Bundle) this.f44438b;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    @Override
    public java.lang.Object l(ee.c r7, md.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: qb.c.l(ee.c, md.c):java.lang.Object");
    }

    @Override
    public boolean m() {
        return false;
    }

    @Override
    public void n(int i10) {
        k6.a aVar;
        w wVar = (w) this.f44438b;
        Lock lock = wVar.f6511o;
        lock.lock();
        try {
            if (!wVar.f6510n && (aVar = wVar.f6509m) != null && aVar.c()) {
                wVar.f6510n = true;
                wVar.e.onConnectionSuspended(i10);
                lock.unlock();
            }
            wVar.f6510n = false;
            w.k(wVar, i10);
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override
    public void o(View view, i1 i1Var, boolean z10, boolean z11) {
        ah.f0 f0Var = (ah.f0) this.f44438b;
        f0Var.f723a.eb(null, f0Var.e, f0Var.f724b, view, 0.0f, 0.0f, i1Var, false, z10, z11, false);
        AndroidUtilities.runOnUIThread(new a3.d(this, 3));
    }

    @Override
    public void onPostMessage(android.webkit.WebView r8, java.lang.reflect.InvocationHandler r9, android.net.Uri r10, boolean r11, java.lang.reflect.InvocationHandler r12) {
        throw new UnsupportedOperationException("Method not decompiled: qb.c.onPostMessage(android.webkit.WebView, java.lang.reflect.InvocationHandler, android.net.Uri, boolean, java.lang.reflect.InvocationHandler):void");
    }

    @Override
    public void onSuccess(Object obj) {
        ((d6.a) this.f44438b).getClass();
        j5.a("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
    }

    @Override
    public void p(Bundle bundle) {
        w wVar = (w) this.f44438b;
        wVar.f6511o.lock();
        try {
            Bundle bundle2 = wVar.f6507k;
            if (bundle2 == null) {
                wVar.f6507k = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            wVar.f6508l = k6.a.e;
            w.l(wVar);
        } finally {
            wVar.f6511o.unlock();
        }
    }

    public void r(e0 e0Var) {
        ((l5.r) ((i5.f) ((qa.b) this.f44438b).get())).a("FIREBASE_APPQUALITY_SESSION", new i5.c("json"), new a1.c(this, 2)).a(new i5.a(null, e0Var, i5.d.f12708a, null), new k2.f0(4));
    }

    public j s() {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (j jVar : ((LinkedHashMap) this.f44438b).values()) {
            arrayList.add(jVar.f4629b);
            arrayList2.add(jVar.f4630c);
            arrayList3.add(jVar.d);
            arrayList4.add(jVar.e);
        }
        int[][] iArr = (int[][]) arrayList.toArray(new int[arrayList.size()]);
        long j10 = 0;
        for (int[] iArr2 : iArr) {
            j10 += iArr2.length;
        }
        int i10 = (int) j10;
        if (j10 == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.c(j10, "the total number of elements (%s) in the arrays must fit in an int", z10);
        int[] iArr3 = new int[i10];
        int i11 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, i11, iArr4.length);
            i11 += iArr4.length;
        }
        return new j(iArr3, c8.a((long[][]) arrayList2.toArray(new long[arrayList2.size()])), c8.a((long[][]) arrayList3.toArray(new long[arrayList3.size()])), c8.a((long[][]) arrayList4.toArray(new long[arrayList4.size()])));
    }

    @Override
    public void t(java.lang.String r14, long r15, int r17, java.lang.Object r18, long r19, long r21) {
        throw new UnsupportedOperationException("Method not decompiled: qb.c.t(java.lang.String, long, int, java.lang.Object, long, long):void");
    }

    public JSONObject u() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.f44438b;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(x9.h.j(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e) {
                        e = e;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        x9.h.c(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    x9.h.c(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            x9.h.c(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e7) {
            e = e7;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            x9.h.c(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    @Override
    public boolean w() {
        return false;
    }

    @Override
    public h y() {
        return null;
    }

    public c(Object obj, int i10) {
        this.f44437a = i10;
        this.f44438b = obj;
    }

    public c(Set set) {
        this.f44437a = 0;
        this.f44438b = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            bVar.getClass();
            ((HashMap) this.f44438b).put(a.class, bVar.f44436a);
        }
    }

    public c(Context context) {
        this.f44437a = 12;
        kotlin.jvm.internal.i.e(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.f44438b = bundle == null ? Bundle.EMPTY : bundle;
    }

    public c(ca.c cVar) {
        this.f44437a = 19;
        this.f44438b = new File(cVar.f5046b, "com.crashlytics.settings.json");
    }

    public c(int i10) {
        this.f44437a = i10;
        switch (i10) {
            case 13:
                this.f44438b = Collections.newSetFromMap(new WeakHashMap());
                return;
            case 27:
                return;
            case 28:
                this.f44438b = new ya.d(gc.a.h, 21);
                return;
            default:
                this.f44438b = new LinkedHashMap();
                return;
        }
    }

    public c(LaunchActivity launchActivity, Executor executor, v7.l lVar) {
        this.f44437a = 6;
        if (launchActivity == null) {
            throw new IllegalArgumentException("FragmentActivity must not be null.");
        }
        if (executor != null) {
            k0 s10 = launchActivity.s();
            y yVar = (y) new androidx.biometric.e(launchActivity).j(y.class);
            this.f44438b = s10;
            yVar.d = executor;
            yVar.e = lVar;
            return;
        }
        throw new IllegalArgumentException("Executor must not be null.");
    }

    @Override
    public void v() {
    }

    @Override
    public void q(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
