package xa;

import a8.e;
import a8.g;
import ai.e6;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.util.Log;
import android.view.Window;
import androidx.lifecycle.a0;
import c3.j;
import ci.nb;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.internal.cast.v;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import da.d;
import fb.n;
import fi.s0;
import fi.t0;
import g6.i;
import g6.q;
import g6.r;
import gg.b2;
import gg.k1;
import i7.f;
import ii.e2;
import ii.i1;
import ii.i2;
import ii.k0;
import ii.n4;
import ii.p4;
import ii.t3;
import ii.x3;
import ii.z;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import l.x;
import n6.l;
import org.json.JSONObject;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.jq0;
import org.telegram.ui.Components.no0;
import org.telegram.ui.vi0;
import org.telegram.ui.wn;
import pg.m;
import pg.t1;
import pg.u0;
import qg.w1;
import v7.j5;
import w9.h;
public final class c implements s, jq0, a0, androidx.activity.result.b, ce.b, w1, v0, OnSuccessListener, SuccessContinuation, f6.a, n, s0, x, b2, he.a, no0, d5, k0 {
    public static volatile c f46014c;
    public final int f46015a;
    public Object f46016b;

    public c(r rVar, String[] strArr) {
        this.f46015a = 22;
        this.f46016b = strArr;
    }

    public static p t(Looper looper, Object obj, String str) {
        l.i(obj, "Listener must not be null");
        l.i(looper, "Looper must not be null");
        return new p(looper, obj, str);
    }

    @Override
    public q9 C() {
        n4 n4Var = ((p4) this.f46016b).G;
        if (n4Var != null) {
            return ((t3) n4Var).f11626a.getTextSelectionHelper();
        }
        return null;
    }

    @Override
    public void E(CharSequence charSequence) {
        n4 n4Var = ((p4) this.f46016b).G;
        if (n4Var != null) {
            t3 t3Var = (t3) n4Var;
            t3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                t3Var.f11626a.t4(charSequence.toString());
            }
        }
    }

    @Override
    public void F(ArrayList arrayList) {
        k1 k1Var = (k1) this.f46016b;
        String str = k1Var.Z;
        if (str != null) {
            k1Var.U(str, k1Var.f9799c0, k1Var.f9800d0, k1Var.f9797b0, k1Var.f9796a0);
        }
    }

    @Override
    public p9 I() {
        return (p4) this.f46016b;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        e2 e2Var = (e2) this.f46016b;
        e2Var.s0(i10, i11, z10);
        vi0 vi0Var = e2Var.O0;
        if (vi0Var != null) {
            vi0Var.i();
            e2Var.O0 = null;
        }
    }

    @Override
    public void K(float f7) {
        nb nbVar = (nb) this.f46016b;
        u0.e(nbVar.F1).k(String.valueOf(m.f41170a.indexOf(nbVar.O0.getCurrentBrush())), f7);
        t1 t1Var = nbVar.A1;
        t1Var.f41268c = f7;
        nbVar.E0(t1Var, null, false);
    }

    @Override
    public ii.a M() {
        return ((p4) this.f46016b).f11207a;
    }

    @Override
    public boolean N() {
        p4 p4Var = (p4) this.f46016b;
        n4 n4Var = p4Var.G;
        if (n4Var != null) {
            ii.a aVar = p4Var.f11207a;
            if (((t3) n4Var).f11626a.S4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void Q(int i10, int i11) {
        p4 p4Var = (p4) this.f46016b;
        n4 n4Var = p4Var.G;
        if (n4Var != null) {
            ii.a aVar = p4Var.f11207a;
            i2 i2Var = ((t3) n4Var).f11626a.J3;
            if (i2Var != null) {
                i2Var.f(i10, i11);
            }
        }
    }

    @Override
    public void W() {
        p4 p4Var = (p4) this.f46016b;
        n4 n4Var = p4Var.G;
        if (n4Var != null) {
            ii.a aVar = p4Var.f11207a;
            x3 x3Var = ((t3) n4Var).f11626a;
            i2 i2Var = x3Var.J3;
            if (i2Var != null) {
                i2Var.g();
            }
            x3Var.f11728h3.onContentChanged();
        }
    }

    @Override
    public void a(int i10) {
        ((k1) this.f46016b).l();
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f46015a) {
            case 1:
                e eVar = new e(0, (TaskCompletionSource) obj2);
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i10 = a8.a.f308a;
                obtain.writeStrongBinder(eVar);
                obtain.writeInt(1);
                ((l8.a) this.f46016b).writeToParcel(obtain, 0);
                ((a8.c) ((g) obj).u()).G0(obtain, 2);
                return;
            case 22:
                q qVar = new q(2, (TaskCompletionSource) obj2);
                i iVar = (i) ((g6.s) obj).u();
                Parcel O0 = iVar.O0();
                v.d(O0, qVar);
                O0.writeStringArray((String[]) this.f46016b);
                iVar.T0(O0, 7);
                return;
            default:
                i7.a aVar = new i7.a((TaskCompletionSource) obj2);
                i7.i iVar2 = (i7.i) ((i7.c) obj).u();
                String str = ((i7.b) this.f46016b).f11004k;
                Parcel K0 = iVar2.K0();
                int i11 = f.f11008a;
                K0.writeStrongBinder(aVar);
                K0.writeString(str);
                iVar2.L0(K0, 2);
                return;
        }
    }

    @Override
    public void b(float f7) {
        z zVar = (z) this.f46016b;
        MessageObject messageObject = zVar.P;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
        MediaController.getInstance().seekToProgress(zVar.P, f7);
    }

    @Override
    public void c(i1 i1Var) {
        n4 n4Var = ((p4) this.f46016b).G;
        if (n4Var != null) {
            x3 x3Var = ((t3) n4Var).f11626a;
            x3.M1(x3Var, i1Var);
            x3Var.f11728h3.t(i1Var, true);
        }
    }

    @Override
    public void close() {
        ((fi.s) this.f46016b).finishFragment();
    }

    @Override
    public void d(float f7) {
        MessageObject messageObject = ((z) this.f46016b).P;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
    }

    @Override
    public void e(long j3) {
        ((fi.s) this.f46016b).presentFragment(wn.R9(j3));
    }

    @Override
    public void f() {
        boolean z10;
        fi.s sVar = (fi.s) this.f46016b;
        le.c cVar = sVar.f9152a;
        t0 t0Var = sVar.v;
        if (t0Var.f9171n && t0Var.f9169l == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        cVar.a(z10, true);
        sVar.d.Y2.N(true);
    }

    @Override
    public void g(l.l lVar, boolean z10) {
        boolean z11;
        int i10;
        g.r rVar;
        g.s sVar = (g.s) this.f46016b;
        l.l k10 = lVar.k();
        int i11 = 0;
        if (k10 != lVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            lVar = k10;
        }
        g.r[] rVarArr = sVar.U;
        if (rVarArr != null) {
            i10 = rVarArr.length;
        } else {
            i10 = 0;
        }
        while (true) {
            if (i11 < i10) {
                rVar = rVarArr[i11];
                if (rVar != null && rVar.h == lVar) {
                    break;
                }
                i11++;
            } else {
                rVar = null;
                break;
            }
        }
        if (rVar != null) {
            if (z11) {
                sVar.f(rVar.f9259a, rVar, k10);
                sVar.h(rVar, true);
                return;
            }
            sVar.h(rVar, z10);
        }
    }

    @Override
    public float get() {
        nb nbVar = (nb) this.f46016b;
        int i10 = nbVar.F1;
        m currentBrush = nbVar.O0.getCurrentBrush();
        if (currentBrush == null) {
            return u0.e(i10).f41280i;
        }
        return u0.e(i10).f(String.valueOf(m.f41170a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override
    public void h() {
        p4 p4Var = (p4) this.f46016b;
        n4 n4Var = p4Var.G;
        if (n4Var != null) {
            x3.P1(((t3) n4Var).f11626a, p4Var.f11207a);
        }
    }

    @Override
    public a0.i i() {
        return null;
    }

    public void j(j jVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f46016b;
        long[] jArr = jVar.e;
        if (jArr.length > 0 && !linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
            linkedHashMap.put(Long.valueOf(jVar.e[0]), jVar);
        }
    }

    @Override
    public void k(Object obj) {
        Bundle extras;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f46016b;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f1914b;
        int i10 = u.e("ProxyBillingActivityV2", intent).f3886a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.N;
        if (resultReceiver != null) {
            if (intent == null) {
                extras = null;
            } else {
                extras = intent.getExtras();
            }
            resultReceiver.send(i10, extras);
        }
        int i11 = aVar.f1913a;
        if (i11 != -1 || i10 != 0) {
            u.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i11 + " and billing's responseCode: " + i10);
        }
        proxyBillingActivityV2.finish();
    }

    @Override
    public void k0() {
        p4 p4Var = (p4) this.f46016b;
        n4 n4Var = p4Var.G;
        if (n4Var != null) {
            ii.a aVar = p4Var.f11207a;
            x3.O1(((t3) n4Var).f11626a);
        }
    }

    @Override
    public java.lang.Object l(ce.c r7, kd.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: xa.c.l(ce.c, kd.c):java.lang.Object");
    }

    @Override
    public void m(k6.a aVar) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.f46016b;
        xVar.f6180o.lock();
        try {
            xVar.f6177l = aVar;
            com.google.android.gms.common.api.internal.x.l(xVar);
        } finally {
            xVar.f6180o.unlock();
        }
    }

    @Override
    public void m0(java.lang.Object r12) {
        throw new UnsupportedOperationException("Method not decompiled: xa.c.m0(java.lang.Object):void");
    }

    @Override
    public void n(Bitmap bitmap) {
        ((f6.i) this.f46016b).e(bitmap, 3);
    }

    @Override
    public a0.i o() {
        return null;
    }

    @Override
    public void onSuccess(Object obj) {
        ((d6.a) this.f46016b).getClass();
        j5.a("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
    }

    public void p(StringBuilder sb2, Iterator it) {
        CharSequence obj;
        CharSequence obj2;
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                if (next instanceof CharSequence) {
                    obj = (CharSequence) next;
                } else {
                    obj = next.toString();
                }
                sb2.append(obj);
                while (it.hasNext()) {
                    sb2.append((CharSequence) ((String) this.f46016b));
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    if (next2 instanceof CharSequence) {
                        obj2 = (CharSequence) next2;
                    } else {
                        obj2 = next2.toString();
                    }
                    sb2.append(obj2);
                }
            }
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @Override
    public Object p2() {
        Type type = (Type) this.f46016b;
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
    public void q(int i10) {
        k6.a aVar;
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.f46016b;
        Lock lock = xVar.f6180o;
        lock.lock();
        try {
            if (!xVar.f6179n && (aVar = xVar.f6178m) != null && aVar.c()) {
                xVar.f6179n = true;
                xVar.e.onConnectionSuspended(i10);
                lock.unlock();
            }
            xVar.f6179n = false;
            com.google.android.gms.common.api.internal.x.k(xVar, i10);
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override
    public void r(Bundle bundle) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.f46016b;
        xVar.f6180o.lock();
        try {
            Bundle bundle2 = xVar.f6176k;
            if (bundle2 == null) {
                xVar.f6176k = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            xVar.f6177l = k6.a.e;
            com.google.android.gms.common.api.internal.x.l(xVar);
        } finally {
            xVar.f6180o.unlock();
        }
    }

    @Override
    public boolean s(int i10) {
        return true;
    }

    @Override
    public Task then(Object obj) {
        JSONObject jSONObject;
        FileWriter fileWriter;
        Void r13 = (Void) obj;
        da.b bVar = (da.b) this.f46016b;
        c5.i iVar = (c5.i) bVar.f7566f;
        d dVar = (d) bVar.f7564b;
        String str = iVar.f3892a;
        FileWriter fileWriter2 = null;
        try {
            HashMap b10 = c5.i.b(dVar);
            aa.a aVar = new aa.a(str, b10);
            aVar.q("User-Agent", "Crashlytics Android SDK/18.6.0");
            aVar.q("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            c5.i.a(aVar, dVar);
            String str2 = "Requesting settings from " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            String str3 = "Settings query params were: " + b10;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str3, null);
            }
            jSONObject = iVar.c(aVar.j());
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Settings request failed.", e);
            jSONObject = null;
        }
        if (jSONObject != null) {
            da.a R = ((a6.i) bVar.f7565c).R(jSONObject);
            a4.m mVar = (a4.m) bVar.e;
            long j3 = R.f7561c;
            mVar.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j3);
                fileWriter = new FileWriter((File) mVar.f275b);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Exception e7) {
                        e = e7;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                        h.c(fileWriter, "Failed to close settings writer.");
                        da.b.f("Loaded settings: ", jSONObject);
                        String str4 = dVar.f7572f;
                        SharedPreferences.Editor edit = ((Context) bVar.f7563a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                        edit.putString("existing_instance_identifier", str4);
                        edit.apply();
                        ((AtomicReference) bVar.h).set(R);
                        ((TaskCompletionSource) ((AtomicReference) bVar.f7568i).get()).trySetResult(R);
                        return Tasks.forResult(null);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileWriter2 = fileWriter;
                    h.c(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e10) {
                e = e10;
                fileWriter = null;
            } catch (Throwable th3) {
                th = th3;
                h.c(fileWriter2, "Failed to close settings writer.");
                throw th;
            }
            h.c(fileWriter, "Failed to close settings writer.");
            da.b.f("Loaded settings: ", jSONObject);
            String str42 = dVar.f7572f;
            SharedPreferences.Editor edit2 = ((Context) bVar.f7563a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            edit2.putString("existing_instance_identifier", str42);
            edit2.apply();
            ((AtomicReference) bVar.h).set(R);
            ((TaskCompletionSource) ((AtomicReference) bVar.f7568i).get()).trySetResult(R);
        }
        return Tasks.forResult(null);
    }

    public Set u() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.f46016b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.f46016b);
        }
        return unmodifiableSet;
    }

    @Override
    public void u0() {
        e6.j0((e6) this.f46016b);
    }

    @Override
    public boolean v(l.l lVar) {
        Window.Callback callback;
        g.s sVar = (g.s) this.f46016b;
        if (lVar == lVar.k() && sVar.O && (callback = sVar.f9280f.getCallback()) != null && !sVar.Z) {
            callback.onMenuOpened(108, lVar);
            return true;
        }
        return true;
    }

    public void w() {
        ((androidx.fragment.app.u) this.f46016b).d.R();
    }

    public c(Object obj, int i10) {
        this.f46015a = i10;
        this.f46016b = obj;
    }

    public c(x6.a aVar) {
        this.f46015a = 29;
        l.h(aVar);
        this.f46016b = aVar;
    }

    public c(int i10) {
        this.f46015a = i10;
        switch (i10) {
            case 6:
                return;
            case 7:
                this.f46016b = new LinkedHashMap();
                return;
            case 11:
                this.f46016b = Collections.newSetFromMap(new WeakHashMap());
                return;
            default:
                this.f46016b = new HashSet();
                return;
        }
    }

    public c(String str) {
        this.f46015a = 15;
        str.getClass();
        this.f46016b = str;
    }

    @Override
    public void U() {
    }
}
