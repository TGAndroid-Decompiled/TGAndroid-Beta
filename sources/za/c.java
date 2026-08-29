package za;

import a4.w;
import ag.h1;
import ag.k2;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.d0;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.fragment.app.f0;
import androidx.lifecycle.a0;
import androidx.recyclerview.widget.RecyclerView;
import b6.d;
import bg.v2;
import com.google.android.gms.common.api.internal.o;
import com.google.android.gms.common.api.internal.p;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.v0;
import com.google.android.gms.common.api.internal.x;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.TaskCompletionSource;
import eg.z1;
import f2.d1;
import f2.l0;
import f2.n1;
import f2.p0;
import f2.x0;
import g.q;
import g9.h;
import g9.m;
import j$.util.DesugarCollections;
import j6.e;
import ja.e0;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.Lock;
import k1.f;
import l3.g0;
import l3.k;
import l3.n;
import l3.o0;
import l3.r;
import lh.d4;
import m.v3;
import m.y0;
import nh.g;
import org.json.JSONObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ha0;
import org.telegram.ui.Components.rp0;
import org.telegram.ui.ws0;
import r0.j0;
import r0.m1;
import t7.j;
import z5.l;
public class c implements a0, androidx.activity.result.b, s, v2, v0, o, l0, a3.b, r0.o, r, rp0, y0, f, ha0 {
    public final int f50798a;
    public Object f50799b;

    public c(Object obj, int i10) {
        this.f50798a = i10;
        this.f50799b = obj;
    }

    public static p i(Looper looper, Object obj, String str) {
        l.i(obj, "Listener must not be null");
        l.i(looper, "Looper must not be null");
        return new p(looper, obj, str);
    }

    @Override
    public void A() {
        j3.l0 l0Var = ((o0) this.f50799b).O0;
        if (l0Var != null) {
            l0Var.f10618a.f10686n.d(2);
        }
    }

    public void B(g0 g0Var) {
        j jVar = (j) this.f50799b;
        jVar.f48175a = g0Var;
        Iterator it = jVar.f48177c.iterator();
        while (it.hasNext()) {
            ((e) it.next()).b();
        }
        jVar.f48177c.clear();
        jVar.f48176b = null;
    }

    public void C(e3.f fVar, Thread thread, Throwable th2) {
        g9.p pVar = (g9.p) this.f50799b;
        synchronized (pVar) {
            String str = "Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                try {
                    g9.a0.a(pVar.f7183e.R(new m(pVar, System.currentTimeMillis(), th2, thread, fVar)));
                } catch (TimeoutException unused) {
                    Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                }
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e10);
            }
        }
    }

    public void D(String str, Bitmap bitmap) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 2) {
            throw new IllegalArgumentException(w.n("The ", str, " key cannot be used to put a Bitmap"));
        }
        ((Bundle) this.f50799b).putParcelable(str, bitmap);
    }

    public void E(long j10, String str) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 0) {
            throw new IllegalArgumentException(w.n("The ", str, " key cannot be used to put a long"));
        }
        ((Bundle) this.f50799b).putLong(str, j10);
    }

    public void F(String str, String str2) {
        a0.f fVar = MediaMetadataCompat.d;
        if (fVar.containsKey(str) && ((Integer) fVar.get(str)).intValue() != 1) {
            throw new IllegalArgumentException(w.n("The ", str, " key cannot be used to put a String"));
        }
        ((Bundle) this.f50799b).putCharSequence(str, str2);
    }

    public JSONObject G() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        FileInputStream fileInputStream2 = null;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Checking for cached settings...", null);
        }
        try {
            File file = (File) this.f50799b;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(h.j(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Exception e10) {
                        e = e10;
                        Log.e("FirebaseCrashlytics", "Failed to fetch cached settings", e);
                        h.c(fileInputStream, "Error while closing settings cache file.");
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream2 = fileInputStream;
                    h.c(fileInputStream2, "Error while closing settings cache file.");
                    throw th;
                }
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    Log.v("FirebaseCrashlytics", "Settings file does not exist.", null);
                }
                jSONObject = null;
            }
            h.c(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            h.c(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    @Override
    public void H0(int i10, int i11) {
        ((p0) this.f50799b).t(i10, i11);
    }

    @Override
    public m1 I0(View view, m1 m1Var) {
        boolean z10;
        m1 m1Var2;
        int b10;
        int c3;
        boolean z11;
        int c6;
        int d = m1Var.d();
        q qVar = (q) this.f50799b;
        Context context = qVar.f6925e;
        int d10 = m1Var.d();
        ActionBarContextView actionBarContextView = qVar.f6940y;
        int i10 = 8;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) qVar.f6940y.getLayoutParams();
            boolean z12 = true;
            if (qVar.f6940y.isShown()) {
                if (qVar.f6930h0 == null) {
                    qVar.f6930h0 = new Rect();
                    qVar.f6931i0 = new Rect();
                }
                Rect rect = qVar.f6930h0;
                Rect rect2 = qVar.f6931i0;
                rect.set(m1Var.b(), m1Var.d(), m1Var.c(), m1Var.a());
                ViewGroup viewGroup = qVar.F;
                Method method = v3.f16717a;
                if (method != null) {
                    try {
                        method.invoke(viewGroup, rect, rect2);
                    } catch (Exception e10) {
                        Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e10);
                    }
                }
                int i11 = rect.top;
                int i12 = rect.left;
                int i13 = rect.right;
                m1 f9 = j0.f(qVar.F);
                if (f9 == null) {
                    b10 = 0;
                } else {
                    b10 = f9.b();
                }
                if (f9 == null) {
                    c3 = 0;
                } else {
                    c3 = f9.c();
                }
                if (marginLayoutParams.topMargin == i11 && marginLayoutParams.leftMargin == i12 && marginLayoutParams.rightMargin == i13) {
                    z11 = false;
                } else {
                    marginLayoutParams.topMargin = i11;
                    marginLayoutParams.leftMargin = i12;
                    marginLayoutParams.rightMargin = i13;
                    z11 = true;
                }
                if (i11 > 0 && qVar.H == null) {
                    View view2 = new View(context);
                    qVar.H = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b10;
                    layoutParams.rightMargin = c3;
                    qVar.F.addView(qVar.H, -1, layoutParams);
                } else {
                    View view3 = qVar.H;
                    if (view3 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                        int i14 = marginLayoutParams2.height;
                        int i15 = marginLayoutParams.topMargin;
                        if (i14 != i15 || marginLayoutParams2.leftMargin != b10 || marginLayoutParams2.rightMargin != c3) {
                            marginLayoutParams2.height = i15;
                            marginLayoutParams2.leftMargin = b10;
                            marginLayoutParams2.rightMargin = c3;
                            qVar.H.setLayoutParams(marginLayoutParams2);
                        }
                    }
                }
                View view4 = qVar.H;
                if (view4 == null) {
                    z12 = false;
                }
                if (z12 && view4.getVisibility() != 0) {
                    View view5 = qVar.H;
                    if ((view5.getWindowSystemUiVisibility() & 8192) != 0) {
                        c6 = f0.e.c(context, 2131099654);
                    } else {
                        c6 = f0.e.c(context, 2131099653);
                    }
                    view5.setBackgroundColor(c6);
                }
                if (!qVar.M && z12) {
                    d10 = 0;
                }
                z10 = z12;
                z12 = z11;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z10 = false;
            } else {
                z10 = false;
                z12 = false;
            }
            if (z12) {
                qVar.f6940y.setLayoutParams(marginLayoutParams);
            }
        } else {
            z10 = false;
        }
        View view6 = qVar.H;
        if (view6 != null) {
            if (z10) {
                i10 = 0;
            }
            view6.setVisibility(i10);
        }
        if (d != d10) {
            m1Var2 = m1Var.f(m1Var.b(), d10, m1Var.c(), m1Var.a());
        } else {
            m1Var2 = m1Var;
        }
        return j0.h(view, m1Var2);
    }

    @Override
    public void K(float f9) {
        ws0 ws0Var = (ws0) this.f50799b;
        h1.e(ws0Var.L1).k(String.valueOf(ag.m.f584a.indexOf(ws0Var.S0.getCurrentBrush())), f9);
        k2 k2Var = ws0Var.G1;
        k2Var.f573c = f9;
        ws0Var.s0(k2Var, null);
    }

    @Override
    public void S(Object obj) {
        CharSequence charSequence = (CharSequence) obj;
        androidx.biometric.q qVar = (androidx.biometric.q) this.f50799b;
        if (charSequence != null) {
            if (qVar.R()) {
                qVar.W(charSequence);
            }
            qVar.f1052h0.d(null);
        }
    }

    @Override
    public void a(long j10) {
        n nVar = ((o0) this.f50799b).F0;
        Handler handler = nVar.f14150a;
        if (handler != null) {
            handler.post(new z1(nVar, j10, 3));
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        switch (this.f50798a) {
            case 4:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                b6.a aVar = (b6.a) ((d) obj).u();
                Parcel G0 = aVar.G0();
                w6.a.c(G0, (z5.o) this.f50799b);
                try {
                    aVar.f3996b.transact(1, G0, null, 1);
                    G0.recycle();
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Throwable th2) {
                    G0.recycle();
                    throw th2;
                }
            default:
                m7.d dVar = new m7.d(0, (TaskCompletionSource) obj2);
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.recaptchabase.internal.IRecaptchaBaseService");
                int i10 = m7.a.f16883a;
                obtain.writeStrongBinder(dVar);
                obtain.writeInt(1);
                ((x7.a) this.f50799b).writeToParcel(obtain, 0);
                ((m7.c) ((m7.f) obj).u()).E0(obtain, 2);
                return;
        }
    }

    @Override
    public void c(w5.a aVar) {
        x xVar = (x) this.f50799b;
        xVar.f3943o.lock();
        try {
            xVar.f3940l = aVar;
            x.l(xVar);
        } finally {
            xVar.f3943o.unlock();
        }
    }

    @Override
    public Object d(bd.p pVar, uc.c cVar) {
        return ((k1.a0) this.f50799b).d(new n1.c(pVar, null, 0), cVar);
    }

    @Override
    public void f() {
        j3.l0 l0Var = ((o0) this.f50799b).O0;
        if (l0Var != null) {
            l0Var.f10618a.S = true;
        }
    }

    @Override
    public void f1(int i10, int i11) {
        ((p0) this.f50799b).r(i10, i11, null);
    }

    @Override
    public Object mo18get() {
        String packageName = ((Context) ((pc.a) this.f50799b).mo18get()).getPackageName();
        if (packageName != null) {
            return packageName;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    @Override
    public md.b getData() {
        return ((k1.a0) this.f50799b).f13250c;
    }

    public MediaMetadataCompat h() {
        return new MediaMetadataCompat((Bundle) this.f50799b);
    }

    @Override
    public void i0(int i10, int i11) {
        ((p0) this.f50799b).s(i10, i11);
    }

    public void j(f2.a aVar) {
        RecyclerView recyclerView = (RecyclerView) this.f50799b;
        int i10 = aVar.f6268a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 != 8) {
                        return;
                    }
                    recyclerView.f1858x.X(recyclerView, aVar.f6269b, aVar.d);
                    return;
                }
                recyclerView.f1858x.a0(recyclerView, aVar.f6269b, aVar.d, aVar.f6270c);
                return;
            }
            recyclerView.f1858x.Y(recyclerView, aVar.f6269b, aVar.d);
            return;
        }
        recyclerView.f1858x.V(recyclerView, aVar.f6269b, aVar.d);
    }

    @Override
    public void k(Object obj) {
        ((s7.c) obj).onLocationResult((LocationResult) this.f50799b);
    }

    @Override
    public void l(Object obj) {
        androidx.activity.result.a aVar = (androidx.activity.result.a) obj;
        androidx.fragment.app.j0 j0Var = (androidx.fragment.app.j0) this.f50799b;
        f0 f0Var = (f0) j0Var.F.pollLast();
        if (f0Var == null) {
            Log.w("FragmentManager", "No Activities were started for result for " + this);
            return;
        }
        String str = f0Var.f1432a;
        int i10 = f0Var.f1433b;
        androidx.fragment.app.s q6 = j0Var.f1446c.q(str);
        if (q6 == null) {
            Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
            return;
        }
        q6.x(i10, aVar.f893a, aVar.f894b);
    }

    public void m(e0 e0Var) {
        ((y2.o) ((v2.f) ((z9.b) this.f50799b).get())).a("FIREBASE_APPQUALITY_SESSION", new v2.c("json"), new eg.n(this, 16)).a(new v2.a(null, e0Var, v2.d.f49328a, null), new sg.j(17));
    }

    @Override
    public Paint.FontMetricsInt n() {
        return ((nh.m) this.f50799b).f18076f.getEditText().getPaint().getFontMetricsInt();
    }

    @Override
    public void o(int i10, long j10, long j11) {
        n nVar = ((o0) this.f50799b).F0;
        Handler handler = nVar.f14150a;
        if (handler != null) {
            handler.post(new com.google.android.exoplayer2.upstream.d(nVar, i10, j10, j11, 1));
        }
    }

    @Override
    public void onSkipSilenceEnabledChanged(boolean z10) {
        n nVar = ((o0) this.f50799b).F0;
        Handler handler = nVar.f14150a;
        if (handler != null) {
            handler.post(new hh.f(5, nVar, z10));
        }
    }

    public void q(int i10, int i11, Object obj) {
        int i12;
        int i13;
        RecyclerView recyclerView = (RecyclerView) this.f50799b;
        int u10 = recyclerView.f1834e.u();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < u10; i15++) {
            View t10 = recyclerView.f1834e.t(i15);
            n1 U = RecyclerView.U(t10);
            if (U != null && !U.r() && (i13 = U.f6434c) >= i10 && i13 < i14) {
                U.a(2);
                if (obj == null) {
                    U.a(1024);
                } else if ((1024 & U.f6441l) == 0) {
                    if (U.f6442m == null) {
                        ArrayList arrayList = new ArrayList();
                        U.f6442m = arrayList;
                        U.f6443n = DesugarCollections.unmodifiableList(arrayList);
                    }
                    U.f6442m.add(obj);
                }
                ((x0) t10.getLayoutParams()).f6510c = true;
            }
        }
        d1 d1Var = recyclerView.f1829b;
        ArrayList arrayList2 = (ArrayList) d1Var.f6293e;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            n1 n1Var = (n1) arrayList2.get(size);
            if (n1Var != null && (i12 = n1Var.f6434c) >= i10 && i12 < i14) {
                n1Var.a(2);
                d1Var.f(size);
            }
        }
        recyclerView.f1853t0 = true;
    }

    @Override
    public void r(int i10, int i11, CharSequence charSequence, boolean z10) {
        g gVar = ((nh.m) this.f50799b).f18076f;
        if (gVar == null) {
            return;
        }
        try {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gVar.getText());
            spannableStringBuilder.replace(i10, i11 + i10, charSequence);
            if (z10) {
                Emoji.replaceEmoji(spannableStringBuilder, gVar.getEditText().getPaint().getFontMetricsInt(), false);
            }
            gVar.setText(spannableStringBuilder);
            gVar.setSelection(i10 + charSequence.length());
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public void r0() {
        d4.j0((d4) this.f50799b);
    }

    @Override
    public void t(int i10) {
        w5.a aVar;
        x xVar = (x) this.f50799b;
        Lock lock = xVar.f3943o;
        lock.lock();
        try {
            if (!xVar.f3942n && (aVar = xVar.f3941m) != null && aVar.c()) {
                xVar.f3942n = true;
                xVar.f3935e.onConnectionSuspended(i10);
                lock.unlock();
            }
            xVar.f3942n = false;
            x.k(xVar, i10);
            lock.unlock();
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }

    public void u(int i10, int i11) {
        RecyclerView recyclerView = (RecyclerView) this.f50799b;
        int u10 = recyclerView.f1834e.u();
        for (int i12 = 0; i12 < u10; i12++) {
            n1 U = RecyclerView.U(recyclerView.f1834e.t(i12));
            if (U != null && !U.r() && U.f6434c >= i10) {
                U.n(i11, false);
                recyclerView.f1847p0.f6396f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.f1829b.f6293e;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            n1 n1Var = (n1) arrayList.get(i13);
            if (n1Var != null && n1Var.f6434c >= i10) {
                n1Var.n(i11, true);
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1852s0 = true;
    }

    @Override
    public void v(Exception exc) {
        f5.a.p("MediaCodecAudioRenderer", "Audio sink error", exc);
        n nVar = ((o0) this.f50799b).F0;
        Handler handler = nVar.f14150a;
        if (handler != null) {
            handler.post(new k(nVar, exc, 1));
        }
    }

    @Override
    public void w() {
        ((o0) this.f50799b).M0 = true;
    }

    public void x(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        RecyclerView recyclerView = (RecyclerView) this.f50799b;
        int u10 = recyclerView.f1834e.u();
        int i19 = -1;
        if (i10 < i11) {
            i13 = i10;
            i12 = i11;
            i14 = -1;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i20 = 0; i20 < u10; i20++) {
            n1 U = RecyclerView.U(recyclerView.f1834e.t(i20));
            if (U != null && (i18 = U.f6434c) >= i13 && i18 <= i12) {
                if (i18 == i10) {
                    U.n(i11 - i10, false);
                } else {
                    U.n(i14, false);
                }
                recyclerView.f1847p0.f6396f = true;
            }
        }
        ArrayList arrayList = (ArrayList) recyclerView.f1829b.f6293e;
        if (i10 < i11) {
            i16 = i10;
            i15 = i11;
        } else {
            i15 = i10;
            i16 = i11;
            i19 = 1;
        }
        int size = arrayList.size();
        for (int i21 = 0; i21 < size; i21++) {
            n1 n1Var = (n1) arrayList.get(i21);
            if (n1Var != null && (i17 = n1Var.f6434c) >= i16 && i17 <= i15) {
                if (i17 == i10) {
                    n1Var.n(i11 - i10, false);
                } else {
                    n1Var.n(i19, false);
                }
            }
        }
        recyclerView.requestLayout();
        recyclerView.f1852s0 = true;
    }

    @Override
    public void y(Bundle bundle) {
        x xVar = (x) this.f50799b;
        xVar.f3943o.lock();
        try {
            Bundle bundle2 = xVar.f3939k;
            if (bundle2 == null) {
                xVar.f3939k = bundle;
            } else if (bundle != null) {
                bundle2.putAll(bundle);
            }
            xVar.f3940l = w5.a.f49757e;
            x.l(xVar);
        } finally {
            xVar.f3943o.unlock();
        }
    }

    @Override
    public void z(int i10, int i11) {
        ((p0) this.f50799b).p(i10, i11);
    }

    public c(Set set) {
        this.f50798a = 0;
        this.f50799b = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            bVar.getClass();
            ((HashMap) this.f50799b).put(a.class, bVar.f50797a);
        }
    }

    @Override
    public float get() {
        ws0 ws0Var = (ws0) this.f50799b;
        int i10 = ws0Var.L1;
        ag.m currentBrush = ws0Var.S0.getCurrentBrush();
        if (currentBrush == null) {
            return h1.e(i10).f521i;
        }
        return h1.e(i10).f(String.valueOf(ag.m.f584a.indexOf(currentBrush)), currentBrush.d());
    }

    public c(l9.b bVar) {
        this.f50798a = 28;
        this.f50799b = new File(bVar.f15103b, "com.crashlytics.settings.json");
    }

    public c(int i10) {
        this.f50798a = i10;
        switch (i10) {
            case 8:
                this.f50799b = Collections.newSetFromMap(new WeakHashMap());
                return;
            case 18:
                return;
            case 21:
                this.f50799b = new g9.l[kf.b.values().length];
                return;
            default:
                this.f50799b = new Bundle();
                return;
        }
    }

    public c(MediaMetadataCompat mediaMetadataCompat) {
        this.f50798a = 1;
        Bundle bundle = new Bundle(mediaMetadataCompat.f771a);
        this.f50799b = bundle;
        d0.a(bundle);
    }

    @Override
    public void M() {
    }

    public void e(int i10) {
    }

    public void g(int i10) {
    }

    @Override
    public void s(String str) {
    }

    @Override
    public void b(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10) {
    }

    @Override
    public void p(TLRPC.TL_document tL_document, String str, Object obj) {
    }
}
