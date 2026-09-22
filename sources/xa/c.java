package xa;

import a0.i;
import a8.e;
import ai.f6;
import ai.j;
import ai.n8;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.ResultReceiver;
import android.util.Log;
import android.view.Window;
import androidx.lifecycle.a0;
import androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer;
import ci.qb;
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
import fb.o;
import fi.s0;
import fi.t0;
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
import k2.g;
import l.x;
import n4.y;
import n6.l;
import org.json.JSONArray;
import org.json.JSONObject;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Cells.r9;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.lq0;
import org.telegram.ui.Components.po0;
import org.telegram.ui.dj0;
import org.telegram.ui.zn;
import pg.m;
import pg.t1;
import pg.u0;
import qg.w1;
import v7.j5;
import w9.h;
import x2.q;
public final class c implements s, lq0, a0, androidx.activity.result.b, ce.b, w1, v0, OnSuccessListener, SuccessContinuation, f6.a, o, s0, x, b2, po0, c5, k0, k2.o {
    public static volatile c f46054c;
    public final int f46055a;
    public Object f46056b;

    public c(r rVar, String[] strArr) {
        this.f46055a = 22;
        this.f46056b = strArr;
    }

    public static p t(Looper looper, Object obj, String str) {
        l.i(obj, "Listener must not be null");
        l.i(looper, "Looper must not be null");
        return new p(looper, obj, str);
    }

    @Override
    public r9 A() {
        m4 m4Var = ((o4) this.f46056b).G;
        if (m4Var != null) {
            return ((s3) m4Var).f11618a.getTextSelectionHelper();
        }
        return null;
    }

    @Override
    public void C(CharSequence charSequence) {
        m4 m4Var = ((o4) this.f46056b).G;
        if (m4Var != null) {
            s3 s3Var = (s3) m4Var;
            s3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                s3Var.f11618a.u4(charSequence.toString());
            }
        }
    }

    @Override
    public i D() {
        return null;
    }

    @Override
    public void E() {
        q qVar;
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.f46056b;
        synchronized (ffmpegAudioRenderer.f10685a) {
            qVar = ffmpegAudioRenderer.H;
        }
        if (qVar != null) {
            qVar.h();
        }
    }

    @Override
    public q9 F() {
        return (o4) this.f46056b;
    }

    @Override
    public ii.a H() {
        return ((o4) this.f46056b).f11221a;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        d2 d2Var = (d2) this.f46056b;
        d2Var.s0(i10, i11, z10);
        dj0 dj0Var = d2Var.O0;
        if (dj0Var != null) {
            dj0Var.i();
            d2Var.O0 = null;
        }
    }

    @Override
    public boolean K() {
        o4 o4Var = (o4) this.f46056b;
        m4 m4Var = o4Var.G;
        if (m4Var != null) {
            ii.a aVar = o4Var.f11221a;
            if (((s3) m4Var).f11618a.T4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public boolean L(int i10) {
        return true;
    }

    @Override
    public void M(Exception exc) {
        e2.a.f("DecoderAudioRenderer", "Audio sink error", exc);
        y yVar = ((FfmpegAudioRenderer) this.f46056b).I;
        Handler handler = (Handler) yVar.f15230a;
        if (handler != null) {
            handler.post(new g(yVar, exc, 1));
        }
    }

    @Override
    public void N(int i10, int i11) {
        o4 o4Var = (o4) this.f46056b;
        m4 m4Var = o4Var.G;
        if (m4Var != null) {
            ii.a aVar = o4Var.f11221a;
            h2 h2Var = ((s3) m4Var).f11618a.J3;
            if (h2Var != null) {
                h2Var.f(i10, i11);
            }
        }
    }

    @Override
    public void O(ArrayList arrayList) {
        k1 k1Var = (k1) this.f46056b;
        String str = k1Var.Z;
        if (str != null) {
            k1Var.U(str, k1Var.f9818c0, k1Var.f9819d0, k1Var.f9816b0, k1Var.f9815a0);
        }
    }

    @Override
    public void P() {
        ((FfmpegAudioRenderer) this.f46056b).Z = true;
    }

    @Override
    public void S(k2.l lVar) {
        y yVar = ((FfmpegAudioRenderer) this.f46056b).I;
        Handler handler = (Handler) yVar.f15230a;
        if (handler != null) {
            handler.post(new k2.i(yVar, lVar, 0));
        }
    }

    @Override
    public void T() {
        o4 o4Var = (o4) this.f46056b;
        m4 m4Var = o4Var.G;
        if (m4Var != null) {
            ii.a aVar = o4Var.f11221a;
            w3 w3Var = ((s3) m4Var).f11618a;
            h2 h2Var = w3Var.J3;
            if (h2Var != null) {
                h2Var.g();
            }
            w3Var.f11715h3.onContentChanged();
        }
    }

    @Override
    public void a(long j3) {
        ((fi.s) this.f46056b).presentFragment(zn.R9(j3));
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f46055a) {
            case 1:
                e eVar = new e(0, (TaskCompletionSource) obj2);
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i10 = a8.a.f305a;
                obtain.writeStrongBinder(eVar);
                obtain.writeInt(1);
                ((l8.a) this.f46056b).writeToParcel(obtain, 0);
                ((a8.c) ((a8.g) obj).u()).G0(obtain, 2);
                return;
            case 22:
                g6.q qVar = new g6.q(2, (TaskCompletionSource) obj2);
                g6.i iVar = (g6.i) ((g6.s) obj).u();
                Parcel O0 = iVar.O0();
                v.d(O0, qVar);
                O0.writeStringArray((String[]) this.f46056b);
                iVar.T0(O0, 7);
                return;
            default:
                i7.a aVar = new i7.a((TaskCompletionSource) obj2);
                i7.i iVar2 = (i7.i) ((i7.c) obj).u();
                String str = ((i7.b) this.f46056b).f11018k;
                Parcel K0 = iVar2.K0();
                int i11 = f.f11022a;
                K0.writeStrongBinder(aVar);
                K0.writeString(str);
                iVar2.L0(K0, 2);
                return;
        }
    }

    @Override
    public void b(float f7) {
        z zVar = (z) this.f46056b;
        MessageObject messageObject = zVar.P;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
        MediaController.getInstance().seekToProgress(zVar.P, f7);
    }

    @Override
    public void c(i1 i1Var) {
        m4 m4Var = ((o4) this.f46056b).G;
        if (m4Var != null) {
            w3 w3Var = ((s3) m4Var).f11618a;
            w3.N1(w3Var, i1Var);
            w3Var.f11715h3.x(i1Var, true);
        }
    }

    @Override
    public void close() {
        ((fi.s) this.f46056b).finishFragment();
    }

    @Override
    public void d(float f7) {
        MessageObject messageObject = ((z) this.f46056b).P;
        if (messageObject == null) {
            return;
        }
        messageObject.audioProgress = f7;
    }

    @Override
    public void e(long j3) {
        y yVar = ((FfmpegAudioRenderer) this.f46056b).I;
        Handler handler = (Handler) yVar.f15230a;
        if (handler != null) {
            handler.post(new j(yVar, j3, 12));
        }
    }

    @Override
    public void e0(k2.l lVar) {
        y yVar = ((FfmpegAudioRenderer) this.f46056b).I;
        Handler handler = (Handler) yVar.f15230a;
        if (handler != null) {
            handler.post(new k2.i(yVar, lVar, 1));
        }
    }

    @Override
    public void f(int i10) {
        ((k1) this.f46056b).l();
    }

    @Override
    public void g(l.l lVar, boolean z10) {
        boolean z11;
        int i10;
        g.r rVar;
        g.s sVar = (g.s) this.f46056b;
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
                sVar.f(rVar.f9277a, rVar, k10);
                sVar.h(rVar, true);
                return;
            }
            sVar.h(rVar, z10);
        }
    }

    @Override
    public void g0() {
        o4 o4Var = (o4) this.f46056b;
        m4 m4Var = o4Var.G;
        if (m4Var != null) {
            ii.a aVar = o4Var.f11221a;
            w3.P1(((s3) m4Var).f11618a);
        }
    }

    @Override
    public float get() {
        qb qbVar = (qb) this.f46056b;
        int i10 = qbVar.F1;
        m currentBrush = qbVar.O0.getCurrentBrush();
        if (currentBrush == null) {
            return u0.e(i10).f41328i;
        }
        return u0.e(i10).f(String.valueOf(m.f41218a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override
    public void h() {
        o4 o4Var = (o4) this.f46056b;
        m4 m4Var = o4Var.G;
        if (m4Var != null) {
            w3.Q1(((s3) m4Var).f11618a, o4Var.f11221a);
        }
    }

    @Override
    public void i(k6.a aVar) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.f46056b;
        xVar.f6196o.lock();
        try {
            xVar.f6193l = aVar;
            com.google.android.gms.common.api.internal.x.l(xVar);
        } finally {
            xVar.f6196o.unlock();
        }
    }

    @Override
    public void i0(java.lang.Object r12) {
        throw new UnsupportedOperationException("Method not decompiled: xa.c.i0(java.lang.Object):void");
    }

    @Override
    public void j(Object obj) {
        Bundle extras;
        ProxyBillingActivityV2 proxyBillingActivityV2 = (ProxyBillingActivityV2) this.f46056b;
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        proxyBillingActivityV2.getClass();
        Intent intent = aVar.f1921b;
        int i10 = u.e("ProxyBillingActivityV2", intent).f3895a;
        ResultReceiver resultReceiver = proxyBillingActivityV2.N;
        if (resultReceiver != null) {
            if (intent == null) {
                extras = null;
            } else {
                extras = intent.getExtras();
            }
            resultReceiver.send(i10, extras);
        }
        int i11 = aVar.f1920a;
        if (i11 != -1 || i10 != 0) {
            u.h("ProxyBillingActivityV2", "External offer dialog finished with resultCode: " + i11 + " and billing's responseCode: " + i10);
        }
        proxyBillingActivityV2.finish();
    }

    @Override
    public void k(int i10) {
        k6.a aVar;
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.f46056b;
        Lock lock = xVar.f6196o;
        lock.lock();
        try {
            if (!xVar.f6195n && (aVar = xVar.f6194m) != null && aVar.c()) {
                xVar.f6195n = true;
                xVar.e.onConnectionSuspended(i10);
                lock.unlock();
            }
            xVar.f6195n = false;
            com.google.android.gms.common.api.internal.x.k(xVar, i10);
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override
    public void l() {
        boolean z10;
        fi.s sVar = (fi.s) this.f46056b;
        le.b bVar = sVar.f9170a;
        t0 t0Var = sVar.v;
        if (t0Var.f9189n && t0Var.f9187l == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        bVar.a(z10, true);
        sVar.d.Y2.N(true);
    }

    @Override
    public void m(float f7) {
        qb qbVar = (qb) this.f46056b;
        u0.e(qbVar.F1).k(String.valueOf(m.f41218a.indexOf(qbVar.O0.getCurrentBrush())), f7);
        t1 t1Var = qbVar.A1;
        t1Var.f41316c = f7;
        qbVar.E0(t1Var, null, false);
    }

    @Override
    public void n() {
        ((FfmpegAudioRenderer) this.f46056b).f2656f0 = true;
    }

    @Override
    public void o(Bundle bundle) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.f46056b;
        xVar.f6196o.lock();
        try {
            Bundle bundle2 = xVar.f6192k;
            if (bundle2 == null) {
                xVar.f6192k = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            xVar.f6193l = k6.a.e;
            com.google.android.gms.common.api.internal.x.l(xVar);
        } finally {
            xVar.f6196o.unlock();
        }
    }

    @Override
    public void onAudioSessionIdChanged(int i10) {
        y yVar = ((FfmpegAudioRenderer) this.f46056b).I;
        Handler handler = (Handler) yVar.f15230a;
        if (handler != null) {
            handler.post(new n8(yVar, i10, 11));
        }
    }

    @Override
    public void onSkipSilenceEnabledChanged(boolean z10) {
        y yVar = ((FfmpegAudioRenderer) this.f46056b).I;
        Handler handler = (Handler) yVar.f15230a;
        if (handler != null) {
            handler.post(new bi.f(7, yVar, z10));
        }
    }

    @Override
    public void onSuccess(Object obj) {
        ((d6.a) this.f46056b).getClass();
        j5.a("com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES", (Bundle) obj);
    }

    @Override
    public Object p2() {
        Type type = (Type) this.f46056b;
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
    public boolean q(l.l lVar) {
        Window.Callback callback;
        g.s sVar = (g.s) this.f46056b;
        if (lVar == lVar.k() && sVar.O && (callback = sVar.f9298f.getCallback()) != null && !sVar.Z) {
            callback.onMenuOpened(108, lVar);
            return true;
        }
        return true;
    }

    @Override
    public void r(Bitmap bitmap) {
        ((f6.i) this.f46056b).e(bitmap, 3);
    }

    public void s(c3.j jVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f46056b;
        long[] jArr = jVar.e;
        if (jArr.length > 0 && !linkedHashMap.containsKey(Long.valueOf(jArr[0]))) {
            linkedHashMap.put(Long.valueOf(jVar.e[0]), jVar);
        }
    }

    @Override
    public void t0() {
        f6.j0((f6) this.f46056b);
    }

    @Override
    public Task then(Object obj) {
        JSONObject jSONObject;
        FileWriter fileWriter;
        Void r13 = (Void) obj;
        da.b bVar = (da.b) this.f46056b;
        c5.i iVar = (c5.i) bVar.f7583f;
        d dVar = (d) bVar.f7581b;
        String str = iVar.f3901a;
        FileWriter fileWriter2 = null;
        try {
            HashMap b10 = c5.i.b(dVar);
            aa.a aVar = new aa.a(str, b10);
            aVar.t("User-Agent", "Crashlytics Android SDK/18.6.0");
            aVar.t("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
            c5.i.a(aVar, dVar);
            String str2 = "Requesting settings from " + str;
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str2, null);
            }
            String str3 = "Settings query params were: " + b10;
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", str3, null);
            }
            jSONObject = iVar.c(aVar.m());
        } catch (IOException e) {
            Log.e("FirebaseCrashlytics", "Settings request failed.", e);
            jSONObject = null;
        }
        if (jSONObject != null) {
            da.a Q = ((a6.i) bVar.f7582c).Q(jSONObject);
            android.support.v4.media.c cVar = (android.support.v4.media.c) bVar.e;
            long j3 = Q.f7578c;
            cVar.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                Log.v("FirebaseCrashlytics", "Writing settings to cache file...", null);
            }
            try {
                jSONObject.put("expires_at", j3);
                fileWriter = new FileWriter((File) cVar.f1812b);
                try {
                    try {
                        fileWriter.write(jSONObject.toString());
                        fileWriter.flush();
                    } catch (Exception e7) {
                        e = e7;
                        Log.e("FirebaseCrashlytics", "Failed to cache settings", e);
                        h.c(fileWriter, "Failed to close settings writer.");
                        da.b.f("Loaded settings: ", jSONObject);
                        String str4 = dVar.f7589f;
                        SharedPreferences.Editor edit = ((Context) bVar.f7580a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
                        edit.putString("existing_instance_identifier", str4);
                        edit.apply();
                        ((AtomicReference) bVar.h).set(Q);
                        ((TaskCompletionSource) ((AtomicReference) bVar.f7585i).get()).trySetResult(Q);
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
            String str42 = dVar.f7589f;
            SharedPreferences.Editor edit2 = ((Context) bVar.f7580a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            edit2.putString("existing_instance_identifier", str42);
            edit2.apply();
            ((AtomicReference) bVar.h).set(Q);
            ((TaskCompletionSource) ((AtomicReference) bVar.f7585i).get()).trySetResult(Q);
        }
        return Tasks.forResult(null);
    }

    @Override
    public java.lang.Object u(ce.c r7, kd.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: xa.c.u(ce.c, kd.c):java.lang.Object");
    }

    public Set v() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.f46056b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.f46056b);
        }
        return unmodifiableSet;
    }

    @Override
    public void w(int i10, long j3, long j10) {
        y yVar = ((FfmpegAudioRenderer) this.f46056b).I;
        Handler handler = (Handler) yVar.f15230a;
        if (handler != null) {
            handler.post(new k2.j(yVar, i10, j3, j10, 0));
        }
    }

    public void x() {
        ((androidx.fragment.app.u) this.f46056b).d.R();
    }

    @Override
    public i y() {
        return null;
    }

    public void z() {
        e6.h hVar = (e6.h) this.f46056b;
        Iterator it = hVar.h.iterator();
        if (!it.hasNext()) {
            Iterator it2 = hVar.f8018i.iterator();
            while (it2.hasNext()) {
                ((e6.g) it2.next()).a();
            }
            return;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    public c(Object obj, int i10) {
        this.f46055a = i10;
        this.f46056b = obj;
    }

    public c(JSONArray jSONArray) {
        this.f46055a = 8;
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                if (optJSONObject != null) {
                    arrayList.add(new c5.l(optJSONObject));
                }
            }
        }
        this.f46056b = arrayList;
    }

    public c(x6.a aVar) {
        this.f46055a = 28;
        l.h(aVar);
        this.f46056b = aVar;
    }

    public c(int i10) {
        this.f46055a = i10;
        switch (i10) {
            case 6:
                return;
            case 7:
                this.f46056b = new LinkedHashMap();
                return;
            case 12:
                this.f46056b = Collections.newSetFromMap(new WeakHashMap());
                return;
            default:
                this.f46056b = new HashSet();
                return;
        }
    }

    @Override
    public void U() {
    }

    @Override
    public void a0() {
    }

    @Override
    public void p() {
    }
}
