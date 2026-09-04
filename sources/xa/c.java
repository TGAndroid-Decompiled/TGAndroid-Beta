package xa;

import a6.l;
import a6.m;
import a8.g;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Log;
import android.view.MenuItem;
import android.view.Window;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.biometric.f0;
import androidx.fragment.app.i0;
import androidx.lifecycle.a0;
import b5.p;
import bi.o5;
import c6.o;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.api.internal.g0;
import com.google.android.gms.common.api.internal.k0;
import com.google.android.gms.common.api.internal.m0;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.internal.cast.b5;
import com.google.android.gms.internal.play_billing.r;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import di.rb;
import fb.n;
import fi.y4;
import gi.s0;
import gi.t0;
import i7.f;
import i7.i;
import j$.util.DesugarCollections;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.MissingFormatArgumentException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.Lock;
import ji.b3;
import ji.c2;
import ji.g1;
import ji.g2;
import ji.h1;
import ji.s5;
import ji.v3;
import l.e0;
import l.j;
import l.x;
import m.h;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.cj0;
import org.telegram.ui.co;
import org.telegram.ui.h71;
import qg.q1;
import rg.x1;
import v7.m8;
public final class c implements s, h71, a0, androidx.activity.result.b, p, wp0, k0, v0, OnCompleteListener, x1, n, x, s0, d5, g1, y2.n, j {
    public static volatile c f49329c;
    public final int f49330a;
    public Object f49331b;

    public c(m mVar) {
        this.f49330a = 8;
        this.f49331b = (r) mVar.f316b;
    }

    public static boolean L(Bundle bundle) {
        if (!"1".equals(bundle.getString("gcm.n.e")) && !"1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")))) {
            return false;
        }
        return true;
    }

    public static String P(String str) {
        if (str.startsWith("gcm.n.")) {
            return str.substring(6);
        }
        return str;
    }

    @Override
    public e A(e eVar) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public o B() {
        o oVar = (o) this.f49331b;
        if (oVar.f4542a != null) {
            if (!Double.isNaN(oVar.d) && oVar.d < 0.0d) {
                throw new IllegalArgumentException("startTime cannot be negative or NaN.");
            }
            if (!Double.isNaN(oVar.f4545e)) {
                if (!Double.isNaN(oVar.f4546f) && oVar.f4546f >= 0.0d) {
                    return oVar;
                }
                throw new IllegalArgumentException("preloadTime cannot be negative or Nan.");
            }
            throw new IllegalArgumentException("playbackDuration cannot be NaN.");
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    public boolean D(String str) {
        String K = K(str);
        if (!"1".equals(K) && !Boolean.parseBoolean(K)) {
            return false;
        }
        return true;
    }

    public Integer E(String str) {
        String K = K(str);
        if (!TextUtils.isEmpty(K)) {
            try {
                return Integer.valueOf(Integer.parseInt(K));
            } catch (NumberFormatException unused) {
                Log.w("NotificationParams", "Couldn't parse value of " + P(str) + "(" + K + ") into an int");
                return null;
            }
        }
        return null;
    }

    public JSONArray F(String str) {
        String K = K(str);
        if (!TextUtils.isEmpty(K)) {
            try {
                return new JSONArray(K);
            } catch (JSONException unused) {
                Log.w("NotificationParams", "Malformed JSON for key " + P(str) + ": " + K + ", falling back to default");
                return null;
            }
        }
        return null;
    }

    public String G(Resources resources, String str, String str2) {
        String[] strArr;
        String K = K(str2);
        if (!TextUtils.isEmpty(K)) {
            return K;
        }
        String K2 = K(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(K2)) {
            return null;
        }
        int identifier = resources.getIdentifier(K2, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", P(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray F = F(str2.concat("_loc_args"));
        if (F == null) {
            strArr = null;
        } else {
            int length = F.length();
            strArr = new String[length];
            for (int i10 = 0; i10 < length; i10++) {
                strArr[i10] = F.optString(i10);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e7) {
            Log.w("NotificationParams", "Missing format argument for " + P(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e7);
            return null;
        }
    }

    @Override
    public void H(float f7) {
        rb rbVar = (rb) this.f49331b;
        qg.s0.e(rbVar.F1).k(String.valueOf(qg.m.f44480a.indexOf(rbVar.O0.getCurrentBrush())), f7);
        q1 q1Var = rbVar.A1;
        q1Var.f44543c = f7;
        rbVar.E0(q1Var, null, false);
    }

    public Set I() {
        Set unmodifiableSet;
        synchronized (((HashSet) this.f49331b)) {
            unmodifiableSet = DesugarCollections.unmodifiableSet((HashSet) this.f49331b);
        }
        return unmodifiableSet;
    }

    @Override
    public void J(int i10, int i11, boolean z10) {
        switch (this.f49330a) {
            case 22:
                ((ji.r) this.f49331b).I(i10, z10, i11, false, 0L);
                ji.r rVar = (ji.r) this.f49331b;
                cj0 cj0Var = rVar.O;
                if (cj0Var != null) {
                    cj0Var.i();
                    rVar.O = null;
                    return;
                }
                return;
            default:
                ((c2) this.f49331b).s0(i10, i11, z10);
                return;
        }
    }

    public String K(String str) {
        String replace;
        Bundle bundle = (Bundle) this.f49331b;
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

    public Bundle M() {
        Bundle bundle = (Bundle) this.f49331b;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    @Override
    public void N(Editable editable) {
        s5 s5Var = (s5) this.f49331b;
        ji.a aVar = s5Var.f13749a;
        if (aVar != null) {
            aVar.f13747s = true;
            aVar.f13746r = s5Var.f14167r.E;
        }
        s5Var.u();
        b3 b3Var = s5Var.E;
        if (b3Var != null && s5Var.f13749a != null) {
            b3Var.a();
        }
    }

    public da.a O(JSONObject jSONObject) {
        da.c aVar;
        int i10 = jSONObject.getInt("settings_version");
        if (i10 != 3) {
            Log.e("FirebaseCrashlytics", "Could not determine SettingsJsonTransform for settings version " + i10 + ". Using default settings values.", null);
            aVar = new qb.b(7);
        } else {
            aVar = new rb.a(7);
        }
        return aVar.k0((ob.a) this.f49331b, jSONObject);
    }

    @Override
    public boolean R(boolean z10) {
        return false;
    }

    @Override
    public void a(h1 h1Var) {
        b3 b3Var = ((s5) this.f49331b).E;
        if (b3Var != null) {
            v3 v3Var = b3Var.f13790a;
            v3.L1(v3Var, h1Var);
            v3Var.f14249h3.v(h1Var, true);
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f49330a) {
            case 1:
                a8.e eVar = new a8.e(0, (TaskCompletionSource) obj2);
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i10 = a8.a.f317a;
                obtain.writeStrongBinder(eVar);
                obtain.writeInt(1);
                ((l8.a) this.f49331b).writeToParcel(obtain, 0);
                ((a8.c) ((g) obj).u()).G0(obtain, 2);
                return;
            default:
                l lVar = new l((TaskCompletionSource) obj2);
                i iVar = (i) ((i7.c) obj).u();
                Parcel K0 = iVar.K0();
                int i11 = f.f11886a;
                K0.writeStrongBinder(lVar);
                f.c(K0, (x5.e) this.f49331b);
                iVar.L0(K0, 1);
                return;
        }
    }

    @Override
    public void b() {
        l2.g gVar = (l2.g) this.f49331b;
        gVar.A.b();
        b5 b5Var = gVar.C;
        if (b5Var == null) {
            return;
        }
        throw b5Var;
    }

    @Override
    public void close() {
        ((gi.s) this.f49331b).finishFragment();
    }

    @Override
    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) se.b.a(WebViewProviderBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f49331b).createWebView(webView));
    }

    @Override
    public void d(l.l lVar, boolean z10) {
        switch (this.f49330a) {
            case 18:
                ((g.s) this.f49331b).g(lVar);
                return;
            default:
                if (lVar instanceof e0) {
                    ((e0) lVar).f15086z.k().c(false);
                }
                x xVar = ((h) this.f49331b).f15531e;
                if (xVar != null) {
                    xVar.d(lVar, z10);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean e() {
        s5 s5Var = (s5) this.f49331b;
        b3 b3Var = s5Var.E;
        if (b3Var != null && s5Var.f13749a != null) {
            return b3Var.f13790a.R4();
        }
        return false;
    }

    @Override
    public void f() {
        m0 m0Var = (m0) this.f49331b;
        m0Var.f5055a.lock();
        try {
            m0Var.f5064m = new g0(m0Var, m0Var.f5061j, m0Var.f5062k, m0Var.d, m0Var.f5063l, m0Var.f5055a, m0Var.f5057c);
            m0Var.f5064m.x();
            m0Var.f5056b.signalAll();
        } finally {
            m0Var.f5055a.unlock();
        }
    }

    @Override
    public void f0(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        f0 f0Var = (f0) this.f49331b;
        Handler handler = f0Var.A0;
        androidx.activity.i iVar = f0Var.B0;
        handler.removeCallbacks(iVar);
        TextView textView = f0Var.G0;
        if (textView != null) {
            textView.setText(charSequence);
        }
        handler.postDelayed(iVar, 2000L);
    }

    @Override
    public void g(long j3) {
        ((gi.s) this.f49331b).presentFragment(co.R9(j3));
    }

    @Override
    public float get() {
        rb rbVar = (rb) this.f49331b;
        int i10 = rbVar.F1;
        qg.m currentBrush = rbVar.O0.getCurrentBrush();
        if (currentBrush == null) {
            return qg.s0.e(i10).f44572i;
        }
        return qg.s0.e(i10).f(String.valueOf(qg.m.f44480a.indexOf(currentBrush)), currentBrush.d());
    }

    @Override
    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) se.b.a(StaticsBoundaryInterface.class, ((WebViewProviderFactoryBoundaryInterface) this.f49331b).getStatics());
    }

    @Override
    public boolean h(h1 h1Var) {
        return false;
    }

    @Override
    public Object h2() {
        Constructor constructor = (Constructor) this.f49331b;
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e7) {
            m8 m8Var = ib.c.f11937a;
            throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e7);
        } catch (InstantiationException e10) {
            throw new RuntimeException("Failed to invoke constructor '" + ib.c.b(constructor) + "' with no args", e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException("Failed to invoke constructor '" + ib.c.b(constructor) + "' with no args", e11.getCause());
        }
    }

    @Override
    public void i(int i10, int i11) {
        g2 g2Var;
        s5 s5Var = (s5) this.f49331b;
        b3 b3Var = s5Var.E;
        if (b3Var != null && s5Var.f13749a != null && (g2Var = b3Var.f13790a.J3) != null) {
            g2Var.f(i10, i11);
        }
    }

    @Override
    public void j(Object obj) {
        int i10;
        Map map = (Map) obj;
        i0 i0Var = (i0) this.f49331b;
        String[] strArr = (String[]) map.keySet().toArray(new String[0]);
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((Boolean) arrayList.get(i11)).booleanValue()) {
                i10 = 0;
            } else {
                i10 = -1;
            }
            iArr[i11] = i10;
        }
        androidx.fragment.app.e0 e0Var = (androidx.fragment.app.e0) i0Var.F.pollFirst();
        if (e0Var == null) {
            Log.w("FragmentManager", "No permissions were requested for " + this);
            return;
        }
        String str = e0Var.f1424a;
        if (i0Var.f1438c.m(str) == null) {
            Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
        }
    }

    @Override
    public boolean k(h1 h1Var) {
        return false;
    }

    @Override
    public void l() {
        boolean z10;
        gi.s sVar = (gi.s) this.f49331b;
        le.b bVar = sVar.f10759a;
        t0 t0Var = sVar.v;
        if (t0Var.f10780n && t0Var.f10778l == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        bVar.a(z10, true);
        sVar.d.Y2.N(true);
    }

    @Override
    public void m(k6.a aVar) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.f49331b;
        xVar.f5132o.lock();
        try {
            xVar.f5130m = aVar;
            com.google.android.gms.common.api.internal.x.l(xVar);
        } finally {
            xVar.f5132o.unlock();
        }
    }

    @Override
    public void n(l.l lVar) {
        Toolbar toolbar = (Toolbar) this.f49331b;
        h hVar = toolbar.f1010a.J;
        if (hVar != null && hVar.g()) {
            return;
        }
        Iterator it = ((CopyOnWriteArrayList) toolbar.W.f15818c).iterator();
        while (it.hasNext()) {
            ((androidx.fragment.app.a0) it.next()).f1403a.t();
        }
    }

    @Override
    public void o(h1 h1Var, int i10, int i11) {
        b3 b3Var;
        q9 textSelectionHelper;
        s5 s5Var = (s5) this.f49331b;
        if (!s5Var.G && i10 != i11 && (b3Var = s5Var.E) != null && (textSelectionHelper = b3Var.f13790a.getTextSelectionHelper()) != null) {
            if (!textSelectionHelper.y() || textSelectionHelper.W != s5Var) {
                s5Var.post(new y4(this, h1Var, i11, textSelectionHelper, i10, 4));
            }
        }
    }

    @Override
    public void onComplete(Task task) {
        d6.c.h((d6.c) ((d6.j) this.f49331b).f6617c, "launchApplication", task);
    }

    @Override
    public void p(int i10) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.f49331b;
        Lock lock = xVar.f5132o;
        lock.lock();
        try {
            if (xVar.f5131n) {
                xVar.f5131n = false;
                com.google.android.gms.common.api.internal.x.k(xVar, i10);
            } else {
                xVar.f5131n = true;
                xVar.d.onConnectionSuspended(i10);
            }
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    @Override
    public boolean q(l.l lVar) {
        switch (this.f49330a) {
            case 18:
                Window.Callback callback = ((g.s) this.f49331b).f10239f.getCallback();
                if (callback != null) {
                    callback.onMenuOpened(108, lVar);
                    return true;
                }
                return true;
            default:
                h hVar = (h) this.f49331b;
                if (lVar == hVar.f15530c) {
                    return false;
                }
                ((e0) lVar).A.getClass();
                hVar.getClass();
                x xVar = hVar.f15531e;
                if (xVar == null) {
                    return false;
                }
                return xVar.q(lVar);
        }
    }

    @Override
    public boolean s(l.l lVar, MenuItem menuItem) {
        ((Toolbar) this.f49331b).getClass();
        return false;
    }

    @Override
    public String[] t() {
        return ((WebViewProviderFactoryBoundaryInterface) this.f49331b).getSupportedFeatures();
    }

    @Override
    public void v(Bundle bundle) {
        com.google.android.gms.common.api.internal.x xVar = (com.google.android.gms.common.api.internal.x) this.f49331b;
        xVar.f5132o.lock();
        try {
            xVar.f5130m = k6.a.f14804e;
            com.google.android.gms.common.api.internal.x.l(xVar);
        } finally {
            xVar.f5132o.unlock();
        }
    }

    @Override
    public void x() {
        m0 m0Var = (m0) this.f49331b;
        for (com.google.android.gms.common.api.c cVar : m0Var.f5059f.values()) {
            cVar.disconnect();
        }
        m0Var.f5066o.F = Collections.EMPTY_SET;
    }

    @Override
    public void y(CharSequence charSequence) {
        b3 b3Var = ((s5) this.f49331b).E;
        if (b3Var != null && charSequence != null && charSequence.length() > 0) {
            b3Var.f13790a.s4(charSequence.toString());
        }
    }

    @Override
    public boolean z() {
        return true;
    }

    @Override
    public void z0() {
        o5.j0((o5) this.f49331b);
    }

    public c(i7.b bVar, x5.e eVar) {
        this.f49330a = 21;
        this.f49331b = eVar;
    }

    public c(Object obj, int i10) {
        this.f49330a = i10;
        this.f49331b = obj;
    }

    public c(MediaInfo mediaInfo) {
        this.f49330a = 9;
        o oVar = new o(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, null, null);
        if (mediaInfo != null) {
            this.f49331b = oVar;
            return;
        }
        throw new IllegalArgumentException("media cannot be null.");
    }

    public c(JSONObject jSONObject) {
        this.f49330a = 9;
        this.f49331b = new o(jSONObject);
    }

    public c(int i10) {
        this.f49330a = i10;
        switch (i10) {
            case 5:
                this.f49331b = new LinkedHashMap(0, 0.75f, true);
                return;
            case 20:
                return;
            default:
                this.f49331b = new HashSet();
                return;
        }
    }

    public c(Bundle bundle) {
        this.f49330a = 12;
        this.f49331b = new Bundle(bundle);
    }

    @Override
    public void U() {
    }

    @Override
    public void r() {
    }

    @Override
    public void C(h1 h1Var) {
    }

    @Override
    public void c(Bundle bundle) {
    }

    @Override
    public void w(int i10) {
    }

    @Override
    public void u(k6.a aVar, com.google.android.gms.common.api.e eVar, boolean z10) {
    }
}
