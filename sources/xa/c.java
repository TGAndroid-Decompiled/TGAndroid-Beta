package xa;

import a0.i;
import a8.e;
import a8.g;
import ai.f6;
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
import ci.qb;
import com.android.billingclient.api.ProxyBillingActivityV2;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.common.api.internal.x;
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
import g6.q;
import g6.r;
import gg.b2;
import gg.k1;
import i7.f;
import ii.d2;
import ii.h2;
import ii.i1;
import ii.k0;
import ii.m4;
import ii.o4;
import ii.s3;
import ii.w3;
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
import l.k;
import l.w;
import n6.l;
import org.json.JSONObject;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Cells.p9;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.ao0;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.bj0;
import org.telegram.ui.bo;
import pg.m;
import pg.q1;
import qg.y1;
import v7.i5;
import w9.h;
public final class c implements s, wp0, a0, androidx.activity.result.b, ce.b, y1, v0, OnSuccessListener, SuccessContinuation, f6.a, n, s0, w, b2, he.a, ao0, b5, k0 {
    public static volatile c f45731c;
    public final int f45732a;
    public Object f45733b;

    public c(r rVar, String[] strArr) {
        this.f45732a = 22;
        this.f45733b = strArr;
    }

    public static p o(Looper looper, Object obj, String str) {
        l.i(obj, "Listener must not be null");
        l.i(looper, "Looper must not be null");
        return new p(looper, obj, str);
    }

    @Override
    public q9 E() {
        m4 m4Var = ((o4) this.f45733b).G;
        if (m4Var != null) {
            return ((s3) m4Var).f11616a.getTextSelectionHelper();
        }
        return null;
    }

    @Override
    public i F() {
        return null;
    }

    @Override
    public java.lang.Object H(ce.c r7, kd.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: xa.c.H(ce.c, kd.c):java.lang.Object");
    }

    @Override
    public void I(CharSequence charSequence) {
        m4 m4Var = ((o4) this.f45733b).G;
        if (m4Var != null) {
            s3 s3Var = (s3) m4Var;
            s3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                s3Var.f11616a.t4(charSequence.toString());
            }
        }
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        d2 d2Var = (d2) this.f45733b;
        d2Var.s0(i10, i11, z10);
        bj0 bj0Var = d2Var.O0;
        if (bj0Var != null) {
            bj0Var.i();
            d2Var.O0 = null;
        }
    }

    @Override
    public p9 K() {
        return (o4) this.f45733b;
    }

    @Override
    public ii.a N() {
        return ((o4) this.f45733b).f11219a;
    }

    @Override
    public boolean O(int i10) {
        return true;
    }

    @Override
    public boolean P() {
        o4 o4Var = (o4) this.f45733b;
        m4 m4Var = o4Var.G;
        if (m4Var != null) {
            ii.a aVar = o4Var.f11219a;
            if (((s3) m4Var).f11616a.S4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void Q(ArrayList arrayList) {
        k1 k1Var = (k1) this.f45733b;
        String str = k1Var.Z;
        if (str != null) {
            k1Var.U(str, k1Var.f9814c0, k1Var.f9815d0, k1Var.f9812b0, k1Var.f9811a0);
        }
    }

    @Override
    public void S(int i10, int i11) {
        o4 o4Var = (o4) this.f45733b;
        m4 m4Var = o4Var.G;
        if (m4Var != null) {
            ii.a aVar = o4Var.f11219a;
            h2 h2Var = ((s3) m4Var).f11616a.J3;
            if (h2Var != null) {
                h2Var.f(i10, i11);
            }
        }
    }

    @Override
    public void a(long j3) {
        ((fi.s) this.f45733b).presentFragment(bo.R9(j3));
    }

    @Override
    public void a0() {
        o4 o4Var = (o4) this.f45733b;
        m4 m4Var = o4Var.G;
        if (m4Var != null) {
            ii.a aVar = o4Var.f11219a;
            w3 w3Var = ((s3) m4Var).f11616a;
            h2 h2Var = w3Var.J3;
            if (h2Var != null) {
                h2Var.g();
            }
            w3Var.f11713h3.onContentChanged();
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f45732a) {
            case 1:
                e eVar = new e(0, (TaskCompletionSource) obj2);
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i10 = a8.a.f308a;
                obtain.writeStrongBinder(eVar);
                obtain.writeInt(1);
                ((l8.a) this.f45733b).writeToParcel(obtain, 0);
                ((a8.c) ((g) obj).u()).G0(obtain, 2);
                return;
            case 22:
                q qVar = new q(2, (TaskCompletionSource) obj2);
                g6.i iVar = (g6.i) ((g6.s) obj).u();
                Parcel O0 = iVar.O0();
                v.d(O0, qVar);
                O0.writeStringArray((String[]) this.f45733b);
                iVar.T0(O0, 7);
                return;
            default:
                i7.a aVar = new i7.a((TaskCompletionSource) obj2);
                i7.i iVar2 = (i7.i) ((i7.c) obj).u();
                String str = ((i7.b) this.f45733b).f11016k;
                Parcel K0 = iVar2.K0();
                int i11 = f.f11020a;
                K0.writeStrongBinder(aVar);
                K0.writeString(str);
                iVar2.L0(K0, 2);
                return;
        }
    }

    @Override
    public void b(float f7) {
        z zVar = (z) this.f45733b;
        MessageObject messageObject = zVar.P;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
        MediaController.getInstance().seekToProgress(zVar.P, f7);
    }

    @Override
    public void c(i1 i1Var) {
        m4 m4Var = ((o4) this.f45733b).G;
        if (m4Var != null) {
            w3 w3Var = ((s3) m4Var).f11616a;
            w3.M1(w3Var, i1Var);
            w3Var.f11713h3.t(i1Var, true);
        }
    }

    @Override
    public void close() {
        ((fi.s) this.f45733b).finishFragment();
    }

    @Override
    public void d(float f7) {
        MessageObject messageObject = ((z) this.f45733b).P;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
    }

    @Override
    public void e() {
        boolean z10;
        fi.s sVar = (fi.s) this.f45733b;
        le.b bVar = sVar.f9167a;
        t0 t0Var = sVar.v;
        if (t0Var.f9186n && t0Var.f9184l == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        bVar.a(z10, true);
        sVar.d.Y2.N(true);
    }

    public void f(j jVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f45733b;
        long[] jArr = jVar.e;
        if (jArr.length > 0 && !linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
            linkedHashMap.put(Long.valueOf(jVar.e[0]), jVar);
        }
    }

    @Override
    public void g(k kVar, boolean z10) {
        boolean z11;
        int i10;
        g.r rVar;
        g.s sVar = (g.s) this.f45733b;
        k k10 = kVar.k();
        int i11 = 0;
        if (k10 != kVar) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            kVar = k10;
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
                if (rVar != null && rVar.h == kVar) {
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
                sVar.f(rVar.f9274a, rVar, k10);
                sVar.h(rVar, true);
                return;
            }
            sVar.h(rVar, z10);
        }
    }

    @Override
    public float get() {
        qb qbVar = (qb) this.f45733b;
        int i10 = qbVar.F1;
        m currentBrush = qbVar.O0.getCurrentBrush();
        if (currentBrush == null) {
            return pg.s0.e(i10).f40993i;
        }
        return pg.s0.e(i10).f(String.valueOf(m.f40908a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override
    public void h(int i10) {
        ((k1) this.f45733b).l();
    }

    @Override
    public void i() {
        o4 o4Var = (o4) this.f45733b;
        m4 m4Var = o4Var.G;
        if (m4Var != null) {
            w3.P1(((s3) m4Var).f11616a, o4Var.f11219a);
        }
    }

    public void j(StringBuilder sb2, Iterator it) {
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
                    sb2.append((CharSequence) ((String) this.f45733b));
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
    public void k(Object obj) {
        Bundle extras;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f45733b;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f1919b;
        int i10 = u.e("ProxyBillingActivityV2", intent).f3891a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.N;
        if (resultReceiver != null) {
            if (intent == null) {
                extras = null;
            } else {
                extras = intent.getExtras();
            }
            resultReceiver.send(i10, extras);
        }
        int i11 = aVar.f1918a;
        if (i11 != -1 || i10 != 0) {
            u.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i11 + " and billing's responseCode: " + i10);
        }
        proxyBillingActivityV2.finish();
    }

    @Override
    public void l(float f7) {
        qb qbVar = (qb) this.f45733b;
        pg.s0.e(qbVar.F1).k(String.valueOf(m.f40908a.indexOf(qbVar.O0.getCurrentBrush())), f7);
        q1 q1Var = qbVar.A1;
        q1Var.f40968c = f7;
        qbVar.E0(q1Var, null, false);
    }

    @Override
    public void m(k6.a aVar) {
        x xVar = (x) this.f45733b;
        xVar.f6194o.lock();
        try {
            xVar.f6191l = aVar;
            x.l(xVar);
        } finally {
            xVar.f6194o.unlock();
        }
    }

    @Override
    public void n(Bitmap bitmap) {
        ((f6.i) this.f45733b).e(bitmap, 3);
    }

    @Override
    public void n0() {
        o4 o4Var = (o4) this.f45733b;
        m4 m4Var = o4Var.G;
        if (m4Var != null) {
            ii.a aVar = o4Var.f11219a;
            w3.O1(((s3) m4Var).f11616a);
        }
    }

    @Override
    public void onSuccess(Object obj) {
        ((d6.a) this.f45733b).getClass();
        i5.a("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
    }

    @Override
    public void p(int i10) {
        k6.a aVar;
        x xVar = (x) this.f45733b;
        Lock lock = xVar.f6194o;
        lock.lock();
        try {
            if (!xVar.f6193n && (aVar = xVar.f6192m) != null && aVar.c()) {
                xVar.f6193n = true;
                xVar.e.onConnectionSuspended(i10);
                lock.unlock();
            }
            xVar.f6193n = false;
            x.k(xVar, i10);
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override
    public void p0(java.lang.Object r12) {
        throw new UnsupportedOperationException("Method not decompiled: xa.c.p0(java.lang.Object):void");
    }

    @Override
    public Object p2() {
        Type type = (Type) this.f45733b;
        if (type instanceof ParameterizedType) {
            Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type2 instanceof Class) {
                return new EnumMap((Class) type2);
            }
            throw new RuntimeException("Invalid EnumMap type: " + type.toString());
        }
        throw new RuntimeException("Invalid EnumMap type: " + type.toString());
    }

    public Set q() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.f45733b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.f45733b);
        }
        return unmodifiableSet;
    }

    @Override
    public void r(Bundle bundle) {
        x xVar = (x) this.f45733b;
        xVar.f6194o.lock();
        try {
            Bundle bundle2 = xVar.f6190k;
            if (bundle2 == null) {
                xVar.f6190k = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            xVar.f6191l = k6.a.e;
            x.l(xVar);
        } finally {
            xVar.f6194o.unlock();
        }
    }

    public void s() {
        ((androidx.fragment.app.u) this.f45733b).d.R();
    }

    @Override
    public Task then(Object obj) {
        JSONObject jSONObject;
        FileWriter fileWriter;
        Void r13 = (Void) obj;
        da.b bVar = (da.b) this.f45733b;
        c5.i iVar = (c5.i) bVar.f7581f;
        d dVar = (d) bVar.f7579b;
        String str = iVar.f3897a;
        FileWriter fileWriter2 = null;
        try {
            HashMap b10 = c5.i.b(dVar);
            aa.a aVar = new aa.a(str, b10);
            aVar.s("User-Agent", "Crashlytics Android SDK/18.6.0");
            aVar.s("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            c5.i.a(aVar, dVar);
            String str2 = "Requesting settings from " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            String str3 = "Settings query params were: " + b10;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str3, null);
            }
            jSONObject = iVar.c(aVar.k());
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Settings request failed.", e);
            jSONObject = null;
        }
        if (jSONObject != null) {
            da.a Q = ((a6.i) bVar.f7580c).Q(jSONObject);
            a4.m mVar = (a4.m) bVar.e;
            long j3 = Q.f7576c;
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
                        String str4 = dVar.f7587f;
                        SharedPreferences.Editor edit = ((Context) bVar.f7578a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                        edit.putString("existing_instance_identifier", str4);
                        edit.apply();
                        ((AtomicReference) bVar.h).set(Q);
                        ((TaskCompletionSource) ((AtomicReference) bVar.f7583i).get()).trySetResult(Q);
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
            String str42 = dVar.f7587f;
            SharedPreferences.Editor edit2 = ((Context) bVar.f7578a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            edit2.putString("existing_instance_identifier", str42);
            edit2.apply();
            ((AtomicReference) bVar.h).set(Q);
            ((TaskCompletionSource) ((AtomicReference) bVar.f7583i).get()).trySetResult(Q);
        }
        return Tasks.forResult(null);
    }

    @Override
    public void u0() {
        f6.j0((f6) this.f45733b);
    }

    @Override
    public boolean v(k kVar) {
        Window.Callback callback;
        g.s sVar = (g.s) this.f45733b;
        if (kVar == kVar.k() && sVar.O && (callback = sVar.f9295f.getCallback()) != null && !sVar.Z) {
            callback.onMenuOpened(108, kVar);
            return true;
        }
        return true;
    }

    @Override
    public i w() {
        return null;
    }

    public c(Object obj, int i10) {
        this.f45732a = i10;
        this.f45733b = obj;
    }

    public c(x6.a aVar) {
        this.f45732a = 29;
        l.h(aVar);
        this.f45733b = aVar;
    }

    public c(int i10) {
        this.f45732a = i10;
        switch (i10) {
            case 6:
                return;
            case 7:
                this.f45733b = new LinkedHashMap();
                return;
            case 11:
                this.f45733b = Collections.newSetFromMap(new WeakHashMap());
                return;
            default:
                this.f45733b = new HashSet();
                return;
        }
    }

    public c(String str) {
        this.f45732a = 15;
        str.getClass();
        this.f45733b = str;
    }

    @Override
    public void U() {
    }
}
