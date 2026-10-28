package za;

import a8.fd;
import a8.h0;
import a8.yb;
import aa.b0;
import ai.n0;
import ai.o0;
import ai.t1;
import ai.z0;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.t;
import androidx.lifecycle.a0;
import b8.e;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.api.internal.r;
import com.google.android.gms.common.api.internal.u0;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import e2.j;
import e2.x;
import e9.k;
import f9.e1;
import f9.g1;
import fi.d0;
import fi.e0;
import fi.gb;
import fi.ib;
import fi.j0;
import fi.o6;
import fi.sb;
import fi.ta;
import fi.w7;
import fi.wb;
import fi.y5;
import h6.i;
import h6.q;
import h6.s;
import hb.n;
import i4.g;
import i4.h;
import j$.util.DesugarCollections;
import j7.f;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.regex.Pattern;
import l.w;
import ng.o;
import o6.l;
import org.chromium.support_lib_boundary.WebMessageListenerBoundaryInterface;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.t81;
import org.telegram.ui.d61;
import qf.d;
import sg.c2;
import z3.m;
public final class c implements n0, a0, r, d61, WebMessageListenerBoundaryInterface, u0, androidx.activity.result.b, OnCompleteListener, k, SuccessContinuation, o, wb, w, g6.a, n, m {
    public static volatile c f52900c;
    public final int f52901a;
    public final Object f52902b;

    public c(h6.r rVar, String[] strArr) {
        this.f52901a = 25;
        this.f52902b = strArr;
    }

    public static p l(Looper looper, Object obj, String str) {
        l.i(obj, "Listener must not be null");
        l.i(looper, "Looper must not be null");
        return new p(looper, obj, str);
    }

    @Override
    public void A(boolean z10) {
        c2 c2Var;
        sb sbVar = ((gb) ((o6) this.f52902b)).C0;
        ta taVar = sbVar.f11672v1;
        if (taVar != null) {
            c2 c2Var2 = null;
            if (!z10 && (taVar.getSelectedEntity() instanceof c2)) {
                sbVar.f11672v1.A0(null, true);
            } else if (z10 && !(sbVar.f11672v1.getSelectedEntity() instanceof c2)) {
                y5 y5Var = sbVar.f11672v1.G0;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    if (i11 < y5Var.getChildCount()) {
                        View childAt = y5Var.getChildAt(i11);
                        if (childAt instanceof c2) {
                            c2Var = (c2) childAt;
                            break;
                        }
                        i11++;
                    } else {
                        c2Var = null;
                        break;
                    }
                }
                if (c2Var != null) {
                    ta taVar2 = sbVar.f11672v1;
                    y5 y5Var2 = taVar2.G0;
                    while (true) {
                        if (i10 >= y5Var2.getChildCount()) {
                            break;
                        }
                        View childAt2 = y5Var2.getChildAt(i10);
                        if (childAt2 instanceof c2) {
                            c2Var2 = (c2) childAt2;
                            break;
                        }
                        i10++;
                    }
                    taVar2.A0(c2Var2, true);
                }
            }
        }
    }

    @Override
    public void B(float f7, int i10) {
        ArrayList arrayList;
        o6 o6Var = (o6) this.f52902b;
        w7 w7Var = o6Var.d;
        if (w7Var != null && (arrayList = w7Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((w7) o6Var.d.T.get(i10)).V = f7;
        }
    }

    @Override
    public void C(float f7) {
        o6 o6Var = (o6) this.f52902b;
        w7 w7Var = o6Var.d;
        if (w7Var == null) {
            return;
        }
        w7Var.F = f7;
        w7Var.f11907j = true;
        o6Var.w(true);
    }

    @Override
    public void D(float f7) {
        o6 o6Var = (o6) this.f52902b;
        w7 w7Var = o6Var.d;
        if (w7Var == null) {
            return;
        }
        w7Var.E = f7;
        w7Var.f11907j = true;
        o6Var.w(true);
    }

    @Override
    public void E(float f7, int i10) {
        ArrayList arrayList;
        o6 o6Var = (o6) this.f52902b;
        w7 w7Var = o6Var.d;
        if (w7Var != null && (arrayList = w7Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((w7) o6Var.d.T.get(i10)).W = f7;
        }
    }

    @Override
    public void F(float f7) {
        w7 w7Var = ((o6) this.f52902b).d;
        if (w7Var == null) {
            return;
        }
        w7Var.f11888a0 = f7;
        w7Var.f11907j = true;
    }

    @Override
    public void G(byte[] bArr, int i10, int i11, z3.l lVar, j jVar) {
        boolean z10;
        d2.b a2;
        boolean z11;
        x xVar = (x) this.f52902b;
        xVar.L(i10 + i11, bArr);
        xVar.N(i10);
        ArrayList arrayList = new ArrayList();
        while (xVar.a() > 0) {
            if (xVar.a() >= 8) {
                z10 = true;
            } else {
                z10 = false;
            }
            yb.f("Incomplete Mp4Webvtt Top Level box header found.", z10);
            int m10 = xVar.m();
            if (xVar.m() == 1987343459) {
                int i12 = m10 - 8;
                CharSequence charSequence = null;
                d2.a aVar = null;
                while (i12 > 0) {
                    if (i12 >= 8) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    yb.f("Incomplete vtt cue box header found.", z11);
                    int m11 = xVar.m();
                    int m12 = xVar.m();
                    int i13 = m11 - 8;
                    byte[] bArr2 = xVar.f9731a;
                    int i14 = xVar.f9732b;
                    String str = e2.n0.f9691a;
                    String str2 = new String(bArr2, i14, i13, StandardCharsets.UTF_8);
                    xVar.O(i13);
                    i12 = (i12 - 8) - i13;
                    if (m12 == 1937011815) {
                        g gVar = new g();
                        h.e(str2, gVar);
                        aVar = gVar.a();
                    } else if (m12 == 1885436268) {
                        charSequence = h.f(null, str2.trim(), Collections.EMPTY_LIST);
                    }
                }
                if (charSequence == null) {
                    charSequence = "";
                }
                if (aVar != null) {
                    aVar.f7836a = charSequence;
                    aVar.f7837b = null;
                    a2 = aVar.a();
                } else {
                    Pattern pattern = h.f13870a;
                    g gVar2 = new g();
                    gVar2.f13864c = charSequence;
                    a2 = gVar2.a().a();
                }
                arrayList.add(a2);
            } else {
                xVar.O(m10 - 8);
            }
        }
        jVar.accept(new z3.a(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    @Override
    public void I() {
        ((o6) this.f52902b).q(null);
    }

    @Override
    public void J(float f7) {
        o6 o6Var = (o6) this.f52902b;
        w7 w7Var = o6Var.d;
        if (w7Var == null) {
            return;
        }
        w7Var.f11927t0 = f7;
        w7Var.f11907j = true;
        o6Var.y(true);
    }

    @Override
    public void K(int i10, long j10) {
        ArrayList arrayList;
        o6 o6Var = (o6) this.f52902b;
        w7 w7Var = o6Var.d;
        if (w7Var != null && (arrayList = w7Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((w7) o6Var.d.T.get(i10)).X = j10;
        }
    }

    @Override
    public void L(long j10) {
        o6 o6Var = (o6) this.f52902b;
        w7 w7Var = o6Var.d;
        if (w7Var == null) {
            return;
        }
        w7Var.D = j10;
        w7Var.f11907j = true;
        o6Var.w(true);
    }

    public a8.h0 M(n4.s r41) {
        throw new UnsupportedOperationException("Method not decompiled: za.c.M(n4.s):a8.h0");
    }

    public StringBuilder N() {
        gf.a aVar = (gf.a) this.f52902b;
        if (aVar instanceof bf.p) {
            StringBuilder sb2 = ((bf.p) aVar).f3974b.f3960b;
            if (sb2.length() != 0) {
                return sb2;
            }
            return null;
        }
        return null;
    }

    public Set O() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.f52902b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.f52902b);
        }
        return unmodifiableSet;
    }

    @Override
    public void Q(java.lang.Object r12) {
        throw new UnsupportedOperationException("Method not decompiled: za.c.Q(java.lang.Object):void");
    }

    public Boolean R() {
        Bundle bundle = (Bundle) this.f52902b;
        if (bundle.containsKey("firebase_sessions_enabled")) {
            return Boolean.valueOf(bundle.getBoolean("firebase_sessions_enabled"));
        }
        return null;
    }

    public c3.j S() {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (c3.j jVar : ((LinkedHashMap) this.f52902b).values()) {
            arrayList.add(jVar.f6065b);
            arrayList2.add(jVar.f6066c);
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
        yb.c(j10, "the total number of elements (%s) in the arrays must fit in an int", z10);
        int[] iArr3 = new int[i10];
        int i11 = 0;
        for (int[] iArr4 : iArr) {
            System.arraycopy(iArr4, 0, iArr3, i11, iArr4.length);
            i11 += iArr4.length;
        }
        return new c3.j(iArr3, fd.a((long[][]) arrayList2.toArray(new long[arrayList2.size()])), fd.a((long[][]) arrayList3.toArray(new long[arrayList3.size()])), fd.a((long[][]) arrayList4.toArray(new long[arrayList4.size()])));
    }

    public void T() {
        ((t) this.f52902b).d.R();
    }

    @Override
    public Object U1() {
        Type type = (Type) this.f52902b;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return new EnumMap((Class) type2);
            }
            throw new RuntimeException("Invalid EnumMap type: " + type.toString());
        }
        throw new RuntimeException("Invalid EnumMap type: " + type.toString());
    }

    @Override
    public void a(o0 o0Var) {
        z0 z0Var = (z0) this.f52902b;
        FrameLayout frameLayout = z0Var.f1994f;
        if (frameLayout != null) {
            frameLayout.removeView(o0Var);
        }
        if (z0Var.F == o0Var) {
            z0Var.F = null;
        }
        t1 t1Var = z0Var.d;
        if (t1Var != null) {
            t1Var.setScanHidden(false);
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        int i10 = this.f52901a;
        Object obj3 = this.f52902b;
        switch (i10) {
            case 5:
                e eVar = new e(1, (TaskCompletionSource) obj2);
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i11 = b8.a.f3673a;
                obtain.writeStrongBinder(eVar);
                obtain.writeInt(1);
                ((m8.c) obj3).writeToParcel(obtain, 0);
                ((b8.c) ((b8.g) obj).u()).F0(obtain, 1);
                return;
            case 25:
                q qVar = new q(2, (TaskCompletionSource) obj2);
                i iVar = (i) ((s) obj).u();
                Parcel N0 = iVar.N0();
                com.google.android.gms.internal.cast.t.d(N0, qVar);
                N0.writeStringArray((String[]) obj3);
                iVar.S0(N0, 7);
                return;
            default:
                j7.a aVar = new j7.a((TaskCompletionSource) obj2);
                j7.i iVar2 = (j7.i) ((j7.c) obj).u();
                String str = ((j7.b) obj3).f15533k;
                Parcel J0 = iVar2.J0();
                int i12 = f.f15537a;
                J0.writeStrongBinder(aVar);
                J0.writeString(str);
                iVar2.K0(J0, 2);
                return;
        }
    }

    @Override
    public Object apply(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        g1 g1Var = (g1) this.f52902b;
        g1Var.getClass();
        entry.getClass();
        return new e1(entry, g1Var);
    }

    @Override
    public void b(int i10) {
        e0 e0Var = ((o6) this.f52902b).E;
        if (e0Var != null) {
            ArrayList arrayList = e0Var.h;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                d0 d0Var = (d0) obj;
                if (d0Var.f10701a == i10) {
                    d0Var.f10702b.d(1.0f, true);
                    e0Var.invalidate();
                    return;
                }
            }
        }
    }

    @Override
    public void c(float f7) {
        o6 o6Var = (o6) this.f52902b;
        w7 w7Var = o6Var.d;
        if (w7Var == null) {
            return;
        }
        w7Var.f11929u0 = f7;
        w7Var.f11907j = true;
        o6Var.c();
    }

    @Override
    public void d(Object obj) {
        Bundle extras;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f52902b;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f2134b;
        int i10 = u.e("ProxyBillingActivityV2", intent).f7985a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.N;
        if (resultReceiver != null) {
            if (intent == null) {
                extras = null;
            } else {
                extras = intent.getExtras();
            }
            resultReceiver.send(i10, extras);
        }
        int i11 = aVar.f2133a;
        if (i11 != -1 || i10 != 0) {
            u.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i11 + " and billing's responseCode: " + i10);
        }
        proxyBillingActivityV2.finish();
    }

    @Override
    public void e(float f7) {
        o6 o6Var = (o6) this.f52902b;
        w7 w7Var = o6Var.d;
        if (w7Var == null) {
            return;
        }
        w7Var.G = f7;
        w7Var.f11907j = true;
        o6Var.c();
    }

    @Override
    public void f(String str) {
        z0 z0Var = (z0) this.f52902b;
        if (z0Var.getParentActivity() != null) {
            d.r(z0Var.getParentActivity(), str);
        }
    }

    @Override
    public void g(l.k kVar, boolean z10) {
        ((g.r) this.f52902b).g(kVar);
    }

    @Override
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_LISTENER", "WEB_MESSAGE_ARRAY_BUFFER"};
    }

    @Override
    public void h(long j10, boolean z10) {
        o6 o6Var = (o6) this.f52902b;
        if (!z10) {
            o6Var.m(j10);
            return;
        }
        t81 t81Var = o6Var.e;
        if (t81Var != null) {
            t81Var.L(j10, true);
        } else if (o6Var.j()) {
            o6Var.E.m(j10, true);
        } else {
            t81 t81Var2 = o6Var.f11392y;
            if (t81Var2 != null) {
                t81Var2.L(j10, false);
            }
        }
    }

    public void i(c3.j jVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f52902b;
        long[] jArr = jVar.e;
        if (jArr.length > 0 && !linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
            linkedHashMap.put(Long.valueOf(jVar.e[0]), jVar);
        }
    }

    @Override
    public z3.d j(int i10, int i11, byte[] bArr) {
        return b10.a(this, bArr, i11);
    }

    @Override
    public void k(Bitmap bitmap) {
        ((g6.h) this.f52902b).e(bitmap, 3);
    }

    @Override
    public void m() {
        o6 o6Var = (o6) this.f52902b;
        o6Var.s(null, null, true);
        sb sbVar = ((gb) o6Var).C0;
        gb gbVar = sbVar.X0;
        if (gbVar != null) {
            gbVar.s(null, null, true);
        }
        ta taVar = sbVar.f11672v1;
        if (taVar != null) {
            taVar.n0();
        }
        ib ibVar = sbVar.f11613c1;
        if (ibVar != null) {
            ibVar.setHasRoundVideo(false);
        }
        w7 w7Var = sbVar.K1;
        if (w7Var != null) {
            File file = w7Var.f11917o0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception unused) {
                }
                sbVar.K1.f11917o0 = null;
            }
            if (sbVar.K1.f11919p0 != null) {
                try {
                    new File(sbVar.K1.f11919p0).delete();
                } catch (Exception unused2) {
                }
                sbVar.K1.f11919p0 = null;
            }
        }
    }

    @Override
    public void n(float f7) {
        o6 o6Var = (o6) this.f52902b;
        w7 w7Var = o6Var.d;
        if (w7Var == null) {
            return;
        }
        w7Var.f11925s0 = f7;
        w7Var.f11907j = true;
        o6Var.y(true);
    }

    @Override
    public void o(boolean z10) {
        o6 o6Var = (o6) this.f52902b;
        if (o6Var.j()) {
            o6Var.E.getClass();
        }
        o6Var.x(-4, z10);
    }

    @Override
    public void onComplete(Task task) {
        e6.c.h((e6.c) ((e6.j) this.f52902b).f9820c, "joinApplication", task);
    }

    @Override
    public void onPostMessage(android.webkit.WebView r8, java.lang.reflect.InvocationHandler r9, android.net.Uri r10, boolean r11, java.lang.reflect.InvocationHandler r12) {
        throw new UnsupportedOperationException("Method not decompiled: za.c.onPostMessage(android.webkit.WebView, java.lang.reflect.InvocationHandler, android.net.Uri, boolean, java.lang.reflect.InvocationHandler):void");
    }

    @Override
    public void p(int i10) {
        l6.a aVar;
        com.google.android.gms.common.api.internal.w wVar = (com.google.android.gms.common.api.internal.w) this.f52902b;
        Lock lock = wVar.f6636o;
        lock.lock();
        try {
            if (!wVar.f6635n && (aVar = wVar.f6634m) != null && aVar.c()) {
                wVar.f6635n = true;
                wVar.e.onConnectionSuspended(i10);
                lock.unlock();
            }
            wVar.f6635n = false;
            com.google.android.gms.common.api.internal.w.k(wVar, i10);
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override
    public void q() {
        ((j0) this.f52902b).d.invalidate();
    }

    @Override
    public void r(float f7, int i10) {
        ArrayList arrayList;
        o6 o6Var = (o6) this.f52902b;
        w7 w7Var = o6Var.d;
        if (w7Var != null && (arrayList = w7Var.T) != null && i10 >= 0 && i10 < arrayList.size()) {
            ((w7) o6Var.d.T.get(i10)).P = f7;
        }
    }

    @Override
    public void s(Bundle bundle) {
        com.google.android.gms.common.api.internal.w wVar = (com.google.android.gms.common.api.internal.w) this.f52902b;
        wVar.f6636o.lock();
        try {
            Bundle bundle2 = wVar.f6632k;
            if (bundle2 == null) {
                wVar.f6632k = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            wVar.f6633l = l6.a.e;
            com.google.android.gms.common.api.internal.w.l(wVar);
        } finally {
            wVar.f6636o.unlock();
        }
    }

    @Override
    public boolean t(l.k kVar) {
        Window.Callback callback = ((g.r) this.f52902b).f12174f.getCallback();
        if (callback != null) {
            callback.onMenuOpened(108, kVar);
            return true;
        }
        return true;
    }

    @Override
    public Task then(Object obj) {
        JSONObject jSONObject;
        FileWriter fileWriter;
        Void r13 = (Void) obj;
        b0 b0Var = (b0) this.f52902b;
        d5.j jVar = (d5.j) b0Var.d;
        fa.c cVar = (fa.c) b0Var.f1033c;
        String str = jVar.f7988a;
        FileWriter fileWriter2 = null;
        try {
            HashMap c10 = d5.j.c(cVar);
            h0 h0Var = new h0(str, c10);
            h0Var.r("User-Agent", "Crashlytics Android SDK/18.6.0");
            h0Var.r("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            d5.j.b(h0Var, cVar);
            String str2 = "Requesting settings from " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            String str3 = "Settings query params were: " + c10;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str3, null);
            }
            jSONObject = jVar.d(h0Var.l());
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Settings request failed.", e);
            jSONObject = null;
        }
        if (jSONObject != null) {
            fa.a b02 = ((b6.i) b0Var.f1034f).b0(jSONObject);
            a4.l lVar = (a4.l) b0Var.f1035g;
            long j10 = b02.f10371c;
            lVar.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j10);
                fileWriter = new FileWriter((File) lVar.f279b);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Exception e10) {
                        e = e10;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                        y9.h.c(fileWriter, "Failed to close settings writer.");
                        b0.f("Loaded settings: ", jSONObject);
                        String str4 = cVar.f10376f;
                        SharedPreferences.Editor edit = ((Context) b0Var.f1031a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                        edit.putString("existing_instance_identifier", str4);
                        edit.apply();
                        ((AtomicReference) b0Var.h).set(b02);
                        ((TaskCompletionSource) ((AtomicReference) b0Var.f1036i).get()).trySetResult(b02);
                        return Tasks.forResult(null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter2 = fileWriter;
                    y9.h.c(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e11) {
                e = e11;
                fileWriter = null;
            } catch (Throwable th3) {
                th = th3;
                y9.h.c(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            y9.h.c(fileWriter, "Failed to close settings writer.");
            b0.f("Loaded settings: ", jSONObject);
            String str42 = cVar.f10376f;
            SharedPreferences.Editor edit2 = ((Context) b0Var.f1031a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            edit2.putString("existing_instance_identifier", str42);
            edit2.apply();
            ((AtomicReference) b0Var.h).set(b02);
            ((TaskCompletionSource) ((AtomicReference) b0Var.f1036i).get()).trySetResult(b02);
        }
        return Tasks.forResult(null);
    }

    @Override
    public void u(float f7) {
        o6 o6Var = (o6) this.f52902b;
        w7 w7Var = o6Var.d;
        if (w7Var == null) {
            return;
        }
        w7Var.P = f7;
        o6Var.c();
    }

    @Override
    public void v(float f7, boolean z10) {
        o6 o6Var = (o6) this.f52902b;
        w7 w7Var = o6Var.d;
        if (w7Var != null) {
            w7Var.Z = f7;
            w7Var.f11907j = true;
            t81 t81Var = o6Var.e;
            if (t81Var != null && t81Var.p() != -9223372036854775807L) {
                o6Var.m(f7 * ((float) o6Var.e.p()));
            }
        }
    }

    @Override
    public void w(l6.a aVar) {
        com.google.android.gms.common.api.internal.w wVar = (com.google.android.gms.common.api.internal.w) this.f52902b;
        wVar.f6636o.lock();
        try {
            wVar.f6633l = aVar;
            com.google.android.gms.common.api.internal.w.l(wVar);
        } finally {
            wVar.f6636o.unlock();
        }
    }

    @Override
    public int y() {
        return 2;
    }

    @Override
    public void z(long j10) {
        o6 o6Var = (o6) this.f52902b;
        w7 w7Var = o6Var.d;
        if (w7Var == null) {
            return;
        }
        w7Var.f11923r0 = j10;
        w7Var.f11907j = true;
        o6Var.y(true);
    }

    public c(Object obj, int i10) {
        this.f52901a = i10;
        this.f52902b = obj;
    }

    public c(JSONArray jSONArray) {
        this.f52901a = 13;
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                if (optJSONObject != null) {
                    arrayList.add(new d5.m(optJSONObject));
                }
            }
        }
        this.f52902b = arrayList;
    }

    public c(Context context) {
        this.f52901a = 15;
        kotlin.jvm.internal.i.e(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.f52902b = bundle == null ? Bundle.EMPTY : bundle;
    }

    public c(int i10) {
        this.f52901a = i10;
        switch (i10) {
            case 8:
                this.f52902b = new LinkedHashMap();
                return;
            case 10:
                this.f52902b = Collections.newSetFromMap(new WeakHashMap());
                return;
            case 27:
                this.f52902b = new x();
                return;
            case 28:
                this.f52902b = new a4.l(25);
                return;
            default:
                this.f52902b = new HashSet();
                return;
        }
    }

    @Override
    public void P() {
    }

    @Override
    public void reset() {
    }

    @Override
    public void H(boolean z10) {
    }

    @Override
    public void x(boolean z10) {
    }
}
