package qb;

import a0.h;
import ab.e0;
import ah.f0;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.a0;
import bi.q5;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.internal.g0;
import com.google.android.gms.common.api.internal.k0;
import com.google.android.gms.common.api.internal.m0;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import di.a7;
import di.i0;
import di.y6;
import g6.n;
import gb.o;
import hg.y1;
import hg.z1;
import i2.l0;
import i5.d;
import i5.f;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.MissingFormatArgumentException;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import ji.d2;
import ji.h1;
import ji.h2;
import ji.j0;
import ji.p4;
import ji.r;
import ji.r4;
import ji.t3;
import ji.x3;
import k2.t;
import k2.t0;
import k2.x;
import k2.y0;
import l5.q;
import m.i1;
import mg.e;
import n6.l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.Components.e81;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.so0;
import org.telegram.ui.Components.yq0;
import org.telegram.ui.hj0;
import org.telegram.ui.ky;
import r2.j;
import v7.r8;
public final class c implements fl0, a0, yq0, k0, v0, OnCompleteListener, e, e81, n, i1, o, s, z1, f5, j0, x {
    public final int f43342a;
    public Object f43343b;

    public c(int i10) {
        this.f43342a = i10;
    }

    public static boolean X(Bundle bundle) {
        if (!"1".equals(bundle.getString("gcm.n.e")) && !"1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")))) {
            return false;
        }
        return true;
    }

    public static String e0(String str) {
        if (str.startsWith("gcm.n.")) {
            return str.substring(6);
        }
        return str;
    }

    @Override
    public void A() {
        ((k2.v0) this.f43343b).f14032j1 = true;
    }

    @Override
    public void B(t0 t0Var) {
        qf.b bVar = ((k2.v0) this.f43343b).f14023a1;
        Handler handler = (Handler) bVar.f43355b;
        if (handler != null) {
            handler.post(new t(bVar, t0Var, 1));
        }
    }

    @Override
    public o9 C() {
        p4 p4Var = ((r4) this.f43343b).G;
        if (p4Var != null) {
            return ((t3) p4Var).f13526a.getTextSelectionHelper();
        }
        return null;
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public void E(t0 t0Var) {
        qf.b bVar = ((k2.v0) this.f43343b).f14023a1;
        Handler handler = (Handler) bVar.f43355b;
        if (handler != null) {
            handler.post(new t(bVar, t0Var, 0));
        }
    }

    @Override
    public void F(CharSequence charSequence) {
        p4 p4Var = ((r4) this.f43343b).G;
        if (p4Var != null) {
            t3 t3Var = (t3) p4Var;
            t3Var.getClass();
            if (charSequence != null && charSequence.length() > 0) {
                t3Var.f13526a.u4(charSequence.toString());
            }
        }
    }

    @Override
    public com.google.android.gms.common.api.internal.e G(com.google.android.gms.common.api.internal.e eVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override
    public void H() {
        ((i0) this.f43343b).f7022f.o();
    }

    @Override
    public void I() {
        l0 l0Var = ((k2.v0) this.f43343b).Y;
        if (l0Var != null) {
            l0Var.a();
        }
    }

    @Override
    public void I0(ArrayList arrayList) {
        boolean z10;
        so0 so0Var = (so0) this.f43343b;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            so0Var.J.add(((y1) arrayList.get(i10)).f10801a);
        }
        ky kyVar = so0Var.U;
        if (kyVar != null) {
            if (so0Var.D0 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            kyVar.d(z10, false);
        }
        so0Var.l();
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f43342a) {
            case 26:
                ((r) this.f43343b).K(i10, z10, i11, false, 0L);
                r rVar = (r) this.f43343b;
                hj0 hj0Var = rVar.O;
                if (hj0Var != null) {
                    hj0Var.i();
                    rVar.O = null;
                    return;
                }
                return;
            default:
                d2 d2Var = (d2) this.f43343b;
                d2Var.s0(i10, i11, z10);
                hj0 hj0Var2 = d2Var.O0;
                if (hj0Var2 != null) {
                    hj0Var2.i();
                    d2Var.O0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public h K() {
        return null;
    }

    @Override
    public n9 L() {
        return (r4) this.f43343b;
    }

    public c6.o M() {
        c6.o oVar = (c6.o) this.f43343b;
        if (oVar.f4512a != null) {
            if (!Double.isNaN(oVar.d) && oVar.d < 0.0d) {
                throw new IllegalArgumentException("startTime cannot be negative or NaN.");
            }
            if (!Double.isNaN(oVar.e)) {
                if (!Double.isNaN(oVar.f4515f) && oVar.f4515f >= 0.0d) {
                    return oVar;
                }
                throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
            }
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    public c2.r N(c2.b r24) {
        throw new UnsupportedOperationException("Method not decompiled: qb.c.N(c2.b):c2.r");
    }

    @Override
    public void N0() {
        ((i0) this.f43343b).f7022f.k();
    }

    @Override
    public ji.a O() {
        return ((r4) this.f43343b).f13119a;
    }

    public boolean P(String str) {
        String W = W(str);
        if (!"1".equals(W) && !Boolean.parseBoolean(W)) {
            return false;
        }
        return true;
    }

    @Override
    public void P0(float f7) {
        ((i0) this.f43343b).f7022f.setRotation(f7);
    }

    @Override
    public boolean Q() {
        r4 r4Var = (r4) this.f43343b;
        p4 p4Var = r4Var.G;
        if (p4Var != null) {
            ji.a aVar = r4Var.f13119a;
            if (((t3) p4Var).f13526a.T4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public Integer R(String str) {
        String W = W(str);
        if (!TextUtils.isEmpty(W)) {
            try {
                return Integer.valueOf(Integer.parseInt(W));
            } catch (NumberFormatException unused) {
                Log.w("NotificationParams", "Couldn't parse value of " + e0(str) + "(" + W + ") into an int");
                return null;
            }
        }
        return null;
    }

    @Override
    public void S(int i10, int i11) {
        r4 r4Var = (r4) this.f43343b;
        p4 p4Var = r4Var.G;
        if (p4Var != null) {
            ji.a aVar = r4Var.f13119a;
            h2 h2Var = ((t3) p4Var).f13526a.H3;
            if (h2Var != null) {
                h2Var.f(i10, i11);
            }
        }
    }

    public JSONArray T(String str) {
        String W = W(str);
        if (!TextUtils.isEmpty(W)) {
            try {
                return new JSONArray(W);
            } catch (JSONException unused) {
                Log.w("NotificationParams", "Malformed JSON for key " + e0(str) + ": " + W + ", falling back to default");
                return null;
            }
        }
        return null;
    }

    public String V(Resources resources, String str, String str2) {
        String[] strArr;
        String W = W(str2);
        if (!TextUtils.isEmpty(W)) {
            return W;
        }
        String W2 = W(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(W2)) {
            return null;
        }
        int identifier = resources.getIdentifier(W2, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", e0(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray T = T(str2.concat("_loc_args"));
        if (T == null) {
            strArr = null;
        } else {
            int length = T.length();
            strArr = new String[length];
            for (int i10 = 0; i10 < length; i10++) {
                strArr[i10] = T.optString(i10);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e) {
            Log.w("NotificationParams", "Missing format argument for " + e0(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e);
            return null;
        }
    }

    public String W(String str) {
        String replace;
        Bundle bundle = (Bundle) this.f43343b;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            if (!str.startsWith("gcm.n.")) {
                replace = str;
            } else {
                replace = str.replace("gcm.n.", "gcm.notification.");
            }
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public void Y(e0 e0Var) {
        ((q) ((f) ((qa.b) this.f43343b).get())).a("FIREBASE_APPQUALITY_SESSION", new i5.c("json"), new a1.c(this, 2)).a(new i5.a(null, e0Var, d.f11319a, null), new y0(2));
    }

    @Override
    public void Z() {
        r4 r4Var = (r4) this.f43343b;
        p4 p4Var = r4Var.G;
        if (p4Var != null) {
            ji.a aVar = r4Var.f13119a;
            x3 x3Var = ((t3) p4Var).f13526a;
            h2 h2Var = x3Var.H3;
            if (h2Var != null) {
                h2Var.g();
            }
            x3Var.f13627f3.onContentChanged();
        }
    }

    @Override
    public void a(h1 h1Var) {
        p4 p4Var = ((r4) this.f43343b).G;
        if (p4Var != null) {
            x3 x3Var = ((t3) p4Var).f13526a;
            x3.N1(x3Var, h1Var);
            x3Var.f13627f3.c0(h1Var, true);
        }
    }

    @Override
    public void a0() {
        ((i0) this.f43343b).f7022f.f15824a.g(1, true);
    }

    @Override
    public void accept(Object obj, Object obj2) {
        h7.f fVar = new h7.f(0, (TaskCompletionSource) obj2);
        g gVar = new g(new com.google.android.gms.common.api.h(-1, -1, 0, true));
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.identitycredentials.internal.IIdentityCredentialService");
        int i10 = q7.a.f43324a;
        obtain.writeStrongBinder(fVar);
        q7.a.b(obtain, (g7.f) this.f43343b);
        q7.a.b(obtain, gVar);
        ((h7.b) ((h7.d) ((h7.e) obj).u())).F0(obtain, 6);
    }

    @Override
    public void b(long j10) {
        k2.v0 v0Var = (k2.v0) this.f43343b;
        v0Var.f14034m1 = true;
        qf.b bVar = v0Var.f14023a1;
        Handler handler = (Handler) bVar.f43355b;
        if (handler != null) {
            handler.post(new bi.g(bVar, j10, 13));
        }
    }

    public void b0() {
        ((androidx.fragment.app.t) this.f43343b).d.R();
    }

    public Bundle c0() {
        Bundle bundle = (Bundle) this.f43343b;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    @Override
    public void d() {
        ((k2.v0) this.f43343b).l1 = true;
    }

    public JSONObject d0() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.f43343b;
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
    public void e() {
        l0 l0Var = ((k2.v0) this.f43343b).Y;
        if (l0Var != null) {
            l0Var.f11082a.f11161i0 = true;
        }
    }

    @Override
    public void f() {
        r4 r4Var = (r4) this.f43343b;
        p4 p4Var = r4Var.G;
        if (p4Var != null) {
            x3.Q1(((t3) p4Var).f13526a, r4Var.f13119a);
        }
    }

    @Override
    public Object f2() {
        Constructor constructor = (Constructor) this.f43343b;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e) {
            r8 r8Var = jb.c.f12954a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e);
        } catch (InstantiationException e7) {
            throw new RuntimeException("Failed to invoke constructor '" + jb.c.b(constructor) + "' with no args", e7);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException("Failed to invoke constructor '" + jb.c.b(constructor) + "' with no args", e10.getCause());
        }
    }

    @Override
    public void g() {
        m0 m0Var = (m0) this.f43343b;
        m0Var.f4988a.lock();
        try {
            m0Var.f4996m = new g0(m0Var, m0Var.f4993j, m0Var.f4994k, m0Var.d, m0Var.f4995l, m0Var.f4988a, m0Var.f4990c);
            m0Var.f4996m.u();
            m0Var.f4989b.signalAll();
        } finally {
            m0Var.f4988a.unlock();
        }
    }

    @Override
    public void h(k6.a aVar) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.f43343b;
        xVar.f5060o.lock();
        try {
            xVar.f5058m = aVar;
            com.google.android.gms.common.api.internal.x.l(xVar);
        } finally {
            xVar.f5060o.unlock();
        }
    }

    @Override
    public boolean i() {
        return true;
    }

    @Override
    public void j(String str, long j10, long j11, long j12) {
        e6.o oVar = (e6.o) this.f43343b;
        try {
            oVar.a(new e6.n(new Status(2103, null, null, null), 1));
        } catch (IllegalStateException e) {
            g6.b bVar = e6.h.f8488k;
            Log.e(bVar.f9934a, bVar.d("Result already set when calling onRequestReplaced", new Object[0]), e);
        }
        Iterator it = oVar.f8509q.f8494i.iterator();
        while (it.hasNext()) {
            ((e6.g) it.next()).h(str, j10, 2103, j11, j12);
        }
    }

    @Override
    public h j0() {
        return null;
    }

    @Override
    public void k(int i10) {
        boolean z10;
        so0 so0Var = (so0) this.f43343b;
        so0Var.D0--;
        so0Var.f10569e0 = i10;
        if (so0Var.f10571f0 != i10) {
            so0Var.f10585s.clear();
        }
        if (so0Var.f10572g0 != i10) {
            so0Var.I.clear();
        }
        so0Var.N = true;
        ky kyVar = so0Var.U;
        if (kyVar != null) {
            if (so0Var.D0 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            kyVar.d(z10, true);
        }
        so0Var.l();
        ky kyVar2 = so0Var.U;
        if (kyVar2 != null) {
            kyVar2.c();
        }
    }

    @Override
    public boolean k0() {
        i0 i0Var = (i0) this.f43343b;
        di.g0 g0Var = i0Var.f7022f;
        boolean m10 = g0Var.m(-90.0f);
        g0Var.i();
        i0Var.d.invalidate();
        return m10;
    }

    @Override
    public void l(int i10) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.f43343b;
        Lock lock = xVar.f5060o;
        lock.lock();
        try {
            if (xVar.f5059n) {
                xVar.f5059n = false;
                com.google.android.gms.common.api.internal.x.k(xVar, i10);
            } else {
                xVar.f5059n = true;
                xVar.d.onConnectionSuspended(i10);
            }
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override
    public void m(int i10, long j10, long j11) {
        qf.b bVar = ((k2.v0) this.f43343b).f14023a1;
        Handler handler = (Handler) bVar.f43355b;
        if (handler != null) {
            handler.post(new k2.s(bVar, i10, j10, j11, 0));
        }
    }

    @Override
    public boolean n() {
        return false;
    }

    @Override
    public void o(Bundle bundle) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.f43343b;
        xVar.f5060o.lock();
        try {
            xVar.f5058m = k6.a.e;
            com.google.android.gms.common.api.internal.x.l(xVar);
        } finally {
            xVar.f5060o.unlock();
        }
    }

    @Override
    public void o0() {
        r4 r4Var = (r4) this.f43343b;
        p4 p4Var = r4Var.G;
        if (p4Var != null) {
            ji.a aVar = r4Var.f13119a;
            x3.P1(((t3) p4Var).f13526a);
        }
    }

    @Override
    public void onAudioSessionIdChanged(int i10) {
        j jVar;
        k2.v0 v0Var = (k2.v0) this.f43343b;
        if (Build.VERSION.SDK_INT >= 35 && (jVar = v0Var.f14025c1) != null) {
            jVar.d(i10);
        }
        qf.b bVar = v0Var.f14023a1;
        Handler handler = (Handler) bVar.f43355b;
        if (handler != null) {
            handler.post(new ah.g(bVar, i10, 13));
        }
    }

    @Override
    public void onComplete(Task task) {
        d6.c.h((d6.c) ((d6.j) this.f43343b).f6411c, "launchApplication", task);
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
    }

    @Override
    public void onSkipSilenceEnabledChanged(boolean z10) {
        qf.b bVar = ((k2.v0) this.f43343b).f14023a1;
        Handler handler = (Handler) bVar.f43355b;
        if (handler != null) {
            handler.post(new ah.t(9, bVar, z10));
        }
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        a7 a7Var = (a7) this.f43343b;
        y6 y6Var = a7Var.L;
        AndroidUtilities.cancelRunOnUIThread(y6Var);
        h81 h81Var = a7Var.f6625y;
        if (h81Var != null && h81Var.y()) {
            AndroidUtilities.runOnUIThread(y6Var);
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        ((a7) this.f43343b).i();
    }

    @Override
    public void q() {
        x2.n nVar;
        k2.v0 v0Var = (k2.v0) this.f43343b;
        synchronized (v0Var.f10915a) {
            nVar = v0Var.H;
        }
        if (nVar != null) {
            nVar.m();
        }
    }

    @Override
    public void r(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        f0 f0Var = (f0) this.f43343b;
        f0Var.f719a.eb(null, f0Var.e, f0Var.f720b, view, 0.0f, 0.0f, i1Var, false, z10, z11, false);
        AndroidUtilities.runOnUIThread(new a3.d(this, 3));
    }

    @Override
    public void s0() {
        q5.j0((q5) this.f43343b);
    }

    @Override
    public void t(Exception exc) {
        e2.a.d("MediaCodecAudioRenderer", "Audio sink error", exc);
        qf.b bVar = ((k2.v0) this.f43343b).f14023a1;
        Handler handler = (Handler) bVar.f43355b;
        if (handler != null) {
            handler.post(new k2.q(bVar, exc, 1));
        }
    }

    @Override
    public boolean t0(int i10) {
        if (i10 == ((so0) this.f43343b).f10568d0) {
            return true;
        }
        return false;
    }

    @Override
    public void u() {
        m0 m0Var = (m0) this.f43343b;
        for (com.google.android.gms.common.api.c cVar : m0Var.f4991f.values()) {
            cVar.disconnect();
        }
        m0Var.f4998o.F = Collections.EMPTY_SET;
    }

    @Override
    public void v(java.lang.String r14, long r15, int r17, java.lang.Object r18, long r19, long r21) {
        throw new UnsupportedOperationException("Method not decompiled: qb.c.v(java.lang.String, long, int, java.lang.Object, long, long):void");
    }

    @Override
    public void v0(java.lang.Object r12) {
        throw new UnsupportedOperationException("Method not decompiled: qb.c.v0(java.lang.Object):void");
    }

    @Override
    public boolean x() {
        i0 i0Var = (i0) this.f43343b;
        i0Var.d.invalidate();
        return i0Var.f7022f.j();
    }

    @Override
    public boolean z() {
        return true;
    }

    public c(Object obj, int i10) {
        this.f43342a = i10;
        this.f43343b = obj;
    }

    @Override
    public void onRenderedFirstFrame() {
    }

    public c(k6.h hVar) {
        this.f43342a = 9;
        this.f43343b = (com.google.android.gms.internal.play_billing.r) hVar.f14176b;
    }

    public c(MediaInfo mediaInfo) {
        this.f43342a = 10;
        c6.o oVar = new c6.o(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo != null) {
            this.f43343b = oVar;
            return;
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    public c(Set set) {
        this.f43342a = 0;
        this.f43343b = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            bVar.getClass();
            ((HashMap) this.f43343b).put(a.class, bVar.f43341a);
        }
    }

    public c(x6.a aVar) {
        this.f43342a = 25;
        l.h(aVar);
        this.f43343b = aVar;
    }

    public c(JSONObject jSONObject) {
        this.f43342a = 10;
        this.f43343b = new c6.o(jSONObject);
    }

    public c(ca.c cVar) {
        this.f43342a = 18;
        this.f43343b = new File(cVar.f4675b, "com.crashlytics.settings.json");
    }

    public c() {
        this.f43342a = 24;
        this.f43343b = new ya.c(gc.a.h, 22);
    }

    public c(Bundle bundle) {
        this.f43342a = 13;
        this.f43343b = new Bundle(bundle);
    }

    @Override
    public void U() {
    }

    @Override
    public void y() {
    }

    @Override
    public void c(Bundle bundle) {
    }

    @Override
    public void onSeekFinished(j2.a aVar) {
    }

    @Override
    public void onSeekStarted(j2.a aVar) {
    }

    @Override
    public void s(int i10) {
    }

    @Override
    public void onError(h81 h81Var, Exception exc) {
    }

    @Override
    public void p(k6.a aVar, com.google.android.gms.common.api.e eVar, boolean z10) {
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
    }

    @Override
    public void w(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
