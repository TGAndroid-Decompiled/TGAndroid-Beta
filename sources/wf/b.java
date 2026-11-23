package wf;

import ab.c0;
import android.content.Context;
import android.media.MediaExtractor;
import android.media.session.MediaController;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.PowerManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.l;
import android.support.v4.media.session.m;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import androidx.emoji2.text.p;
import androidx.emoji2.text.w;
import androidx.fragment.app.j0;
import androidx.fragment.app.s;
import androidx.fragment.app.v;
import bi.s2;
import ci.a0;
import ci.b0;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.internal.cast.a1;
import com.google.android.gms.internal.cast.a2;
import com.google.android.gms.internal.clearcut.g;
import com.google.android.gms.internal.play_billing.a4;
import com.google.android.gms.internal.play_billing.b4;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.l3;
import com.google.android.gms.internal.play_billing.o3;
import com.google.android.gms.internal.play_billing.p3;
import com.google.android.gms.internal.play_billing.t3;
import com.google.android.gms.internal.play_billing.u;
import com.google.android.gms.internal.play_billing.v3;
import com.google.android.gms.internal.play_billing.w3;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d3.h0;
import e2.x1;
import ed.i;
import f5.y;
import f6.e0;
import fi.e9;
import fi.f9;
import fi.r3;
import fi.z3;
import g6.h;
import gb.j1;
import hi.p7;
import i2.r;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j6.n;
import j6.o;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.j;
import o5.t;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.t0;
import org.telegram.messenger.w10;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.kc;
import org.telegram.ui.PhotoViewer;
import s4.x;
import s4.z;
public class b implements h, ce.c, a0, OnCompleteListener, g, lf.b, y, q, ib.b, p7, j2.g, o, ja.a {
    public static volatile b d;
    public final int f59799a;
    public Object f59800b;
    public Object f59801c;

    public b(int i7, Object obj, Object obj2) {
        this.f59799a = i7;
        this.f59800b = obj;
        this.f59801c = obj2;
    }

    public static b I() {
        b bVar;
        b bVar2 = d;
        if (bVar2 == null) {
            synchronized (b.class) {
                try {
                    bVar = d;
                    if (bVar == null) {
                        bVar = new b(0);
                        d = bVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return bVar;
        }
        return bVar2;
    }

    public static void p(b bVar, boolean z10, boolean z11) {
        synchronized (bVar) {
            boolean z12 = false;
            if (z10) {
                if (((PowerManager.WakeLock) bVar.f59801c) == null) {
                    if (((Context) bVar.f59800b).checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                        h2.a.l("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                        return;
                    }
                    PowerManager powerManager = (PowerManager) ((Context) bVar.f59800b).getSystemService("power");
                    if (powerManager == null) {
                        h2.a.l("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                        return;
                    }
                    PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                    bVar.f59801c = newWakeLock;
                    newWakeLock.setReferenceCounted(false);
                }
            }
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) bVar.f59801c;
            if (wakeLock == null) {
                return;
            }
            if (z10 && z11) {
                z12 = true;
            }
            if (z12) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }

    public static boolean s(Editable editable, KeyEvent keyEvent, boolean z10) {
        w[] wVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (wVarArr = (w[]) editable.getSpans(selectionStart, selectionEnd, w.class)) != null && wVarArr.length > 0) {
                for (w wVar : wVarArr) {
                    int spanStart = editable.getSpanStart(wVar);
                    int spanEnd = editable.getSpanEnd(wVar);
                    if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void A(s f10, boolean z10) {
        j.e(f10, "f");
        j0 j0Var = (j0) this.f59800b;
        v vVar = j0Var.f2336w.f2433b;
        s sVar = j0Var.f2338y;
        if (sVar != null) {
            sVar.p().f2329o.A(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f59801c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void B(s f10, boolean z10) {
        j.e(f10, "f");
        s sVar = ((j0) this.f59800b).f2338y;
        if (sVar != null) {
            sVar.p().f2329o.B(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f59801c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    @Override
    public void C(String str, long j3, long j10, long j11) {
        o oVar = (o) this.f59800b;
        if (oVar != null) {
            oVar.C(str, j3, j10, j11);
        }
    }

    public void D(s f10, boolean z10) {
        j.e(f10, "f");
        s sVar = ((j0) this.f59800b).f2338y;
        if (sVar != null) {
            sVar.p().f2329o.D(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f59801c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void E(s f10, Bundle bundle, boolean z10) {
        j.e(f10, "f");
        s sVar = ((j0) this.f59800b).f2338y;
        if (sVar != null) {
            sVar.p().f2329o.E(f10, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f59801c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void F(s f10, boolean z10) {
        j.e(f10, "f");
        s sVar = ((j0) this.f59800b).f2338y;
        if (sVar != null) {
            sVar.p().f2329o.F(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f59801c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void G(s f10, boolean z10) {
        j.e(f10, "f");
        s sVar = ((j0) this.f59800b).f2338y;
        if (sVar != null) {
            sVar.p().f2329o.G(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f59801c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void H(s f10, boolean z10) {
        j.e(f10, "f");
        s sVar = ((j0) this.f59800b).f2338y;
        if (sVar != null) {
            sVar.p().f2329o.H(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f59801c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    @Override
    public java.lang.Object J(ce.d r6, kd.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: wf.b.J(ce.d, kd.c):java.lang.Object");
    }

    public m K() {
        MediaController.TransportControls transportControls = ((android.support.v4.media.session.h) this.f59800b).f1690a.getTransportControls();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            return new l(transportControls);
        }
        if (i7 >= 24) {
            return new l(transportControls);
        }
        return new l(transportControls);
    }

    public boolean L(CharSequence charSequence, int i7, int i10, p pVar) {
        int i11;
        if (pVar.f2237c == 0) {
            androidx.emoji2.text.h hVar = (androidx.emoji2.text.h) this.f59801c;
            s1.a b10 = pVar.b();
            int a10 = b10.a(8);
            if (a10 != 0) {
                ((ByteBuffer) b10.d).getShort(a10 + b10.f56415a);
            }
            androidx.emoji2.text.d dVar = (androidx.emoji2.text.d) hVar;
            dVar.getClass();
            ThreadLocal threadLocal = androidx.emoji2.text.d.f2210b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb2 = (StringBuilder) threadLocal.get();
            sb2.setLength(0);
            while (i7 < i10) {
                sb2.append(charSequence.charAt(i7));
                i7++;
            }
            TextPaint textPaint = dVar.f2211a;
            String sb3 = sb2.toString();
            int i12 = i0.c.f15981a;
            if (textPaint.hasGlyph(sb3)) {
                i11 = 2;
            } else {
                i11 = 1;
            }
            pVar.f2237c = i11;
        }
        if (pVar.f2237c != 2) {
            return false;
        }
        return true;
    }

    public boolean M() {
        if (((a) ((i61) this.f59800b).d) != null) {
            return true;
        }
        return false;
    }

    public void N(boolean z10, boolean z11, float f10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f59800b;
        r3 r3Var = (r3) this.f59801c;
        f9 f9Var = r3Var.f12488e;
        f9.B1 = f10;
        e9 e9Var = f9Var.A0;
        if (e9Var != null) {
            e9Var.setSpeed(f10);
        }
        z3.Y(r3Var.f12494x, z10);
        if (z11 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
        }
    }

    public void O(androidx.mediarouter.app.q qVar) {
        if (qVar != null) {
            if (!((Set) this.f59801c).add(qVar)) {
                Log.w("MediaControllerCompat", "the callback has already been registered");
                return;
            }
            Handler handler = new Handler();
            qVar.f(handler);
            android.support.v4.media.session.h hVar = (android.support.v4.media.session.h) this.f59800b;
            hVar.f1690a.registerCallback(qVar.f2712a, handler);
            synchronized (hVar.f1691b) {
                if (hVar.f1693e.a() != null) {
                    android.support.v4.media.session.g gVar = new android.support.v4.media.session.g(qVar);
                    hVar.d.put(qVar, gVar);
                    qVar.f2714c = gVar;
                    try {
                        hVar.f1693e.a().p(gVar);
                        qVar.e(13, null, null);
                    } catch (RemoteException e10) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e10);
                    }
                } else {
                    qVar.f2714c = null;
                    hVar.f1692c.add(qVar);
                }
            }
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    public void P(Object obj) {
        Handler handler = (Handler) this.f59800b;
        if (handler != null) {
            handler.post(new s2(this, obj, SystemClock.elapsedRealtime(), 1));
        }
    }

    public void Q(f fVar) {
        d dVar;
        f fVar2;
        Log.d("CAST_CONTROLLER", "set current media");
        i61 i61Var = (i61) this.f59800b;
        f fVar3 = (f) i61Var.f35959c;
        if (d1.f.u()) {
            if (fVar3 != null || fVar != null) {
                if (fVar3 != null) {
                    ArrayList arrayList = fVar3.f59818a;
                    if (fVar != null && arrayList.size() == fVar.f59818a.size()) {
                        for (int i7 = 0; i7 < arrayList.size(); i7++) {
                            e g10 = fVar3.g(i7);
                            e g11 = fVar.g(i7);
                            if ((g10 == null && g11 == null) || (g10 != null && g11 != null && Objects.equals(g10.f59813a, g11.f59813a) && Objects.equals(g10.f59814b, g11.f59814b) && Objects.equals(g10.f59815c, g11.f59815c) && Objects.equals(g10.d, g11.d) && g10.f59816e == g11.f59816e && g10.f59817f == g11.f59817f)) {
                            }
                        }
                        return;
                    }
                }
            } else {
                return;
            }
        }
        if (((a) i61Var.d) != null && fVar != null) {
            i61Var.l(fVar);
        }
        if (((a) i61Var.d) != null && (fVar2 = (f) i61Var.f35959c) != null) {
            i61Var.L(fVar2);
        }
        if (fVar != null && fVar.f59818a.size() > 0 && !fVar.g(0).f59813a.startsWith("audio/") && (dVar = (d) i61Var.f35958b) != null) {
            dVar.l(null, null);
        }
        a aVar = (a) i61Var.d;
        if (aVar != null && fVar != null) {
            aVar.d = fVar;
            aVar.f59798g = 0;
            aVar.h = 0;
            aVar.p();
        }
        i61Var.f35959c = fVar;
    }

    public void R(f5.m mVar) {
        this.f59800b = mVar;
        if (mVar.a() != null) {
            mVar.a().getClass();
            String str = mVar.a().d;
            if (str != null) {
                this.f59801c = str;
            }
        }
    }

    public void S(g6.c cVar) {
        String str;
        String N0;
        i61 i61Var = (i61) this.f59800b;
        if (cVar != null) {
            q6.m.e("Must be called from the main thread.");
            h6.h hVar = cVar.f13208j;
            String a10 = cVar.a();
            if (!TextUtils.isEmpty(a10) && hVar != null) {
                a aVar = (a) i61Var.d;
                if (aVar == null || !TextUtils.equals(aVar.f59795c.a(), a10)) {
                    i61Var.O(new a(cVar, (g6.g) this.f59801c, hVar));
                    q6.m.e("Must be called from the main thread.");
                    CastDevice castDevice = cVar.f13209k;
                    if (castDevice != null) {
                        str = castDevice.d;
                    } else {
                        str = null;
                    }
                    PhotoViewer p12 = PhotoViewer.p1();
                    d.i();
                    if (p12.F != null && p12.f43334f0 != null && p12.Q1()) {
                        kc kcVar = new kc(p12.f43334f0, new fi.b());
                        if (!TextUtils.isEmpty(str)) {
                            N0 = gd.a0(null, null, 2131752090, str);
                        } else {
                            N0 = gd.N0(2131752091, null);
                        }
                        kcVar.Q(2131624029, 36, N0).j();
                    }
                }
            }
        }
    }

    public void T(androidx.mediarouter.app.q qVar) {
        if (qVar != null) {
            if (!((Set) this.f59801c).remove(qVar)) {
                Log.w("MediaControllerCompat", "the callback has never been registered");
                return;
            }
            try {
                ((android.support.v4.media.session.h) this.f59800b).b(qVar);
                return;
            } finally {
                qVar.f(null);
            }
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    public void U(ArrayList arrayList) {
        r rVar;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (((i2.q) arrayList.get(i7)).f16066a == 1) {
                try {
                    rVar = new r((i2.q) arrayList.get(i7));
                } catch (i2.p unused) {
                    rVar = null;
                }
                this.f59801c = rVar;
            }
        }
    }

    public void V(x1 x1Var) {
        Handler handler = (Handler) this.f59800b;
        if (handler != null) {
            handler.post(new c1.a(23, this, x1Var));
        }
    }

    public void W(g3 g3Var) {
        try {
            f0(g3Var, (p3) this.f59800b);
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void X(g3 g3Var, int i7, long j3) {
        try {
            o3 o3Var = (o3) ((p3) this.f59800b).g();
            o3Var.c();
            p3.p((p3) o3Var.f7133b, i7);
            p3 p3Var = (p3) o3Var.a();
            this.f59800b = p3Var;
            if (j3 != 0) {
                o3 o3Var2 = (o3) p3Var.g();
                o3Var2.c();
                p3.r((p3) o3Var2.f7133b, j3);
                p3Var = (p3) o3Var2.a();
            }
            f0(g3Var, p3Var);
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void Y(g3 g3Var, long j3, boolean z10) {
        p3 p3Var;
        try {
            f3 f3Var = (f3) g3Var.g();
            t3 t3Var = (t3) g3Var.o().g();
            t3Var.c();
            v3.n((v3) t3Var.f7133b, z10);
            f3Var.c();
            g3.r((g3) f3Var.f7133b, (v3) t3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j3 == 0) {
                p3Var = (p3) this.f59800b;
            } else {
                o3 o3Var = (o3) ((p3) this.f59800b).g();
                o3Var.c();
                p3.r((p3) o3Var.f7133b, j3);
                p3Var = (p3) o3Var.a();
            }
            f0(g3Var2, p3Var);
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void Z(String str, long j3, int i7, Object obj, long j10, long j11) {
        ((n) this.f59801c).f17347g = null;
        o oVar = (o) this.f59800b;
        if (oVar != null) {
            oVar.Z(str, j3, i7, obj, j10, j11);
        }
    }

    @Override
    public lf.a a(b bVar) {
        int i7;
        List list = (List) this.f59801c;
        List list2 = (List) bVar.f59800b;
        if (list2 != null) {
            i7 = list2.size();
        } else {
            i7 = 0;
        }
        if (i7 > 0) {
            ArrayList arrayList = new ArrayList(list.size() + i7);
            arrayList.addAll(list);
            arrayList.addAll(list2);
            list = arrayList;
        }
        return new i(bVar, (List) this.f59800b, list);
    }

    @Override
    public void accept(Object obj, Object obj2) {
        boolean z10;
        e0 e0Var = (e0) this.f59800b;
        String str = (String) this.f59801c;
        j6.y yVar = (j6.y) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        if (e0Var.G == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        q6.m.j("Not connected to device", z10);
        j6.f fVar = (j6.f) yVar.n();
        Parcel p12 = fVar.p1();
        p12.writeString(str);
        fVar.u1(p12, 5);
        synchronized (e0Var.f11383t) {
            try {
                if (e0Var.f11380q != null) {
                    taskCompletionSource.setException(q6.m.m(new Status(2001, null, null, null)));
                } else {
                    e0Var.f11380q = taskCompletionSource;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public void b(g6.f fVar, boolean z10) {
        Log.d("CAST_SESSION", "onSessionResumed " + ((g6.c) fVar).a() + " " + z10);
    }

    public void b0(g3 g3Var, int i7, long j3, boolean z10) {
        p3 p3Var;
        try {
            o3 o3Var = (o3) ((p3) this.f59800b).g();
            o3Var.c();
            p3.p((p3) o3Var.f7133b, i7);
            this.f59800b = (p3) o3Var.a();
            f3 f3Var = (f3) g3Var.g();
            t3 t3Var = (t3) g3Var.o().g();
            t3Var.c();
            v3.n((v3) t3Var.f7133b, z10);
            f3Var.c();
            g3.r((g3) f3Var.f7133b, (v3) t3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j3 == 0) {
                p3Var = (p3) this.f59800b;
            } else {
                o3 o3Var2 = (o3) ((p3) this.f59800b).g();
                o3Var2.c();
                p3.r((p3) o3Var2.f7133b, j3);
                p3Var = (p3) o3Var2.a();
            }
            f0(g3Var2, p3Var);
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void c(g6.f fVar, int i7) {
        Log.d("CAST_SESSION", "onSessionStartSuspended " + ((g6.c) fVar).a() + " " + i7);
    }

    public void c0(l3 l3Var) {
        try {
            w3 t6 = x3.t();
            t6.d((p3) this.f59800b);
            t6.c();
            x3.p((x3) t6.f7133b, l3Var);
            ((ca.i) this.f59801c).m((x3) t6.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public j2.h createDataSource() {
        return new j2.n((Context) this.f59800b, ((j2.o) this.f59801c).createDataSource());
    }

    @Override
    public void d(g6.f fVar, int i7) {
        Log.d("CAST_SESSION", "onSessionStartFailed " + ((g6.c) fVar).a() + " " + i7);
    }

    public void d0(a4 a4Var) {
        try {
            w3 t6 = x3.t();
            t6.d((p3) this.f59800b);
            t6.c();
            x3.r((x3) t6.f7133b, a4Var);
            ((ca.i) this.f59801c).m((x3) t6.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void e(b0 b0Var) {
        g0.E2(b0Var);
        ((Runnable) this.f59801c).run();
    }

    public void e0(b4 b4Var) {
        if (b4Var == null) {
            return;
        }
        try {
            w3 t6 = x3.t();
            t6.d((p3) this.f59800b);
            t6.c();
            x3.s((x3) t6.f7133b, b4Var);
            ((ca.i) this.f59801c).m((x3) t6.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void f(String str) {
        ((w10) this.f59800b).a(str);
    }

    public void f0(g3 g3Var, p3 p3Var) {
        if (g3Var == null) {
            return;
        }
        try {
            w3 t6 = x3.t();
            t6.d(p3Var);
            t6.c();
            x3.n((x3) t6.f7133b, g3Var);
            ((ca.i) this.f59801c).m((x3) t6.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void g(g6.f fVar, int i7) {
        Log.d("CAST_SESSION", "onSessionResumeFailed " + ((g6.c) fVar).a() + " " + i7);
    }

    public void g0(i3 i3Var, p3 p3Var) {
        try {
            w3 t6 = x3.t();
            t6.d(p3Var);
            t6.c();
            x3.o((x3) t6.f7133b, i3Var);
            ((ca.i) this.f59801c).m((x3) t6.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public Object mo23get() {
        return new gb.e0((Context) ((e.a) this.f59800b).f10170a, (j1) ((ib.c) this.f59801c).mo23get());
    }

    @Override
    public StackTraceElement[] h(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        ja.a[] aVarArr = (ja.a[]) this.f59800b;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i7 = 0; i7 < 1; i7++) {
            ja.a aVar = aVarArr[i7];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = aVar.h(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > 1024) {
            return ((w7.s) this.f59801c).h(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }

    @Override
    public void i(g6.f fVar, String str) {
        g6.c cVar = (g6.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarted " + cVar.a() + " " + str);
        S(cVar);
    }

    @Override
    public void j(g6.f fVar, int i7) {
        Log.d("CAST_SESSION", "onSessionEnded " + ((g6.c) fVar).a() + " " + i7);
        ((i61) this.f59800b).O(null);
    }

    @Override
    public void k(g6.f fVar, String str) {
        Log.d("CAST_SESSION", "onSessionResuming " + ((g6.c) fVar).a() + " " + str);
    }

    @Override
    public String l() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((String) this.f59800b);
        sb2.append("|");
        File file = (File) this.f59801c;
        sb2.append(file.length());
        sb2.append("|");
        sb2.append(file.lastModified());
        return sb2.toString();
    }

    @Override
    public void m(g6.f fVar) {
        g6.c cVar = (g6.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarting " + cVar.a());
        S(cVar);
    }

    @Override
    public void n(g6.f fVar) {
        Log.d("CAST_SESSION", "onSessionEnding " + ((g6.c) fVar).a());
    }

    @Override
    public Closeable o(MediaExtractor mediaExtractor) {
        mediaExtractor.setDataSource((String) this.f59800b);
        return null;
    }

    @Override
    public void onComplete(Task task) {
        boolean z10;
        boolean z11;
        g6.b bVar;
        boolean z12;
        String str;
        com.google.android.gms.internal.cast.p pVar = (com.google.android.gms.internal.cast.p) this.f59800b;
        g6.b bVar2 = (g6.b) this.f59801c;
        x xVar = pVar.f6605c;
        j6.b bVar3 = com.google.android.gms.internal.cast.p.f6604j;
        if (task.isSuccessful()) {
            Bundle bundle = (Bundle) task.getResult();
            if (bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED")) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (true != z12) {
                str = "not existed";
            } else {
                str = "existed";
            }
            bVar3.b("The module-to-client output switcher flag %s", str);
            if (z12) {
                z10 = bundle.getBoolean("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
                Log.i(bVar3.f17332a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.f13200y)));
                if (!z10 && bVar2.f13200y) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (xVar == null && (bVar = pVar.d) != null) {
                    boolean z13 = bVar.f13198w;
                    boolean z14 = bVar.f13197s;
                    s4.y yVar = new s4.y();
                    int i7 = Build.VERSION.SDK_INT;
                    if (i7 >= 30) {
                        yVar.f57190b = z11;
                    }
                    if (i7 >= 30) {
                        yVar.d = z13;
                    }
                    if (i7 >= 30) {
                        yVar.f57191c = z14;
                    }
                    x.i(new z(yVar));
                    Log.i(bVar3.f17332a, bVar3.d("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(pVar.f6608i), Boolean.valueOf(z11), Boolean.valueOf(z13), Boolean.valueOf(z14)));
                    if (z13) {
                        com.google.android.gms.internal.cast.s sVar = pVar.f6607f;
                        q6.m.h(sVar);
                        com.google.android.gms.internal.cast.o oVar = new com.google.android.gms.internal.cast.o(sVar);
                        x.b();
                        x.c().f57057f = oVar;
                        a2.a(a1.CAST_TRANSFER_TO_LOCAL_ENABLED);
                        return;
                    }
                    return;
                }
            }
        }
        z10 = true;
        Log.i(bVar3.f17332a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.f13200y)));
        if (!z10) {
        }
        z11 = false;
        if (xVar == null) {
        }
    }

    public f5.d q() {
        if (((f5.m) this.f59800b) != null) {
            return new f5.d(this);
        }
        throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
    }

    public void r() {
        String str = (String) this.f59800b;
        try {
            ga.d dVar = (ga.d) this.f59801c;
            dVar.getClass();
            new File((File) dVar.f13272c, str).createNewFile();
        } catch (IOException e10) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e10);
        }
    }

    public void t(l2.e eVar) {
        synchronized (eVar) {
        }
        Handler handler = (Handler) this.f59800b;
        if (handler != null) {
            handler.post(new d3.g0(this, eVar, 1));
        }
    }

    public String toString() {
        switch (this.f59799a) {
            case 6:
                try {
                    if (((cc.b) this.f59801c) == null) {
                        this.f59801c = ((cc.g) this.f59800b).a();
                    }
                    return ((cc.b) this.f59801c).toString();
                } catch (bc.e unused) {
                    return "";
                }
            default:
                return super.toString();
        }
    }

    public void u(s f10, boolean z10) {
        j.e(f10, "f");
        s sVar = ((j0) this.f59800b).f2338y;
        if (sVar != null) {
            sVar.p().f2329o.u(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f59801c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void v(s f10, boolean z10) {
        j.e(f10, "f");
        j0 j0Var = (j0) this.f59800b;
        v vVar = j0Var.f2336w.f2433b;
        s sVar = j0Var.f2338y;
        if (sVar != null) {
            sVar.p().f2329o.v(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f59801c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void w(s f10, boolean z10) {
        j.e(f10, "f");
        s sVar = ((j0) this.f59800b).f2338y;
        if (sVar != null) {
            sVar.p().f2329o.w(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f59801c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void x(s f10, boolean z10) {
        j.e(f10, "f");
        s sVar = ((j0) this.f59800b).f2338y;
        if (sVar != null) {
            sVar.p().f2329o.x(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f59801c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void y(s f10, boolean z10) {
        j.e(f10, "f");
        s sVar = ((j0) this.f59800b).f2338y;
        if (sVar != null) {
            sVar.p().f2329o.y(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f59801c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void z(s f10, boolean z10) {
        j.e(f10, "f");
        s sVar = ((j0) this.f59800b).f2338y;
        if (sVar != null) {
            sVar.p().f2329o.z(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f59801c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z10) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    @Override
    public Object zzp() {
        boolean z10;
        Map map;
        com.google.android.gms.internal.clearcut.d dVar = (com.google.android.gms.internal.clearcut.d) this.f59800b;
        com.google.android.gms.internal.clearcut.b bVar = (com.google.android.gms.internal.clearcut.b) this.f59801c;
        bVar.getClass();
        if (com.google.android.gms.internal.clearcut.d.e()) {
            z10 = ((Boolean) com.google.android.gms.internal.clearcut.d.c(new aa.b0("gms:phenotype:phenotype_flag:debug_disable_caching"))).booleanValue();
        } else {
            z10 = false;
        }
        if (z10) {
            map = bVar.b();
        } else {
            map = bVar.f6783e;
        }
        if (map == null) {
            synchronized (bVar.d) {
                try {
                    Map map2 = bVar.f6783e;
                    map = map2;
                    if (map2 == null) {
                        HashMap b10 = bVar.b();
                        bVar.f6783e = b10;
                        map = b10;
                    }
                } finally {
                }
            }
        }
        if (map == null) {
            map = Collections.EMPTY_MAP;
        }
        return (String) map.get(dVar.f6802b);
    }

    public b(int i7, boolean z10) {
        this.f59799a = i7;
    }

    public b(Object obj, int i7) {
        this.f59799a = i7;
        this.f59800b = obj;
    }

    public b(Object obj, Object obj2, boolean z10, int i7) {
        this.f59799a = i7;
        this.f59801c = obj;
        this.f59800b = obj2;
    }

    public b(Context context, p3 p3Var) {
        this.f59799a = 18;
        ca.i iVar = new ca.i(2);
        try {
            t.b(context);
            iVar.f5118c = t.a().c(m5.a.f20920e).a("PLAY_BILLING_LIBRARY", new l5.c("proto"), new nb.a(9));
        } catch (Throwable unused) {
            iVar.f5117b = true;
        }
        this.f59801c = iVar;
        this.f59800b = p3Var;
    }

    public b(p6.a aVar) {
        this.f59799a = 26;
        this.f59800b = aVar == null ? null : aVar.f55597b;
    }

    public b(j0 j0Var) {
        this.f59799a = 5;
        this.f59800b = j0Var;
        this.f59801c = new CopyOnWriteArrayList();
    }

    public b(ja.a[] aVarArr) {
        this.f59799a = 29;
        this.f59800b = aVarArr;
        this.f59801c = new w7.s(11);
    }

    public b(int i7) {
        this.f59799a = i7;
        switch (i7) {
            case 13:
                this.f59800b = ByteBuffer.allocateDirect(500);
                return;
            default:
                g6.a c10 = g6.a.c(t0.f27013b);
                ug.x xVar = new ug.x(15);
                c10.getClass();
                q6.m.e("Must be called from the main thread.");
                g6.g gVar = c10.f13182c;
                gVar.getClass();
                try {
                    g6.y yVar = gVar.f13217a;
                    g6.j jVar = new g6.j(xVar);
                    Parcel p12 = yVar.p1();
                    com.google.android.gms.internal.cast.t.d(p12, jVar);
                    yVar.t1(p12, 4);
                } catch (RemoteException e10) {
                    g6.g.f13216c.a(e10, "Unable to call %s on %s.", "addCastStateListener", g6.y.class.getSimpleName());
                }
                this.f59800b = new i61(25, false);
                g6.g b10 = c10.b();
                this.f59801c = b10;
                b10.a(this);
                S(b10.c());
                return;
        }
    }

    public b(Context context) {
        this.f59799a = 27;
        j2.o oVar = new j2.o();
        this.f59800b = context.getApplicationContext();
        this.f59801c = oVar;
    }

    public b(c0 c0Var, pb.b bVar, androidx.emoji2.text.d dVar) {
        this.f59799a = 4;
        this.f59800b = c0Var;
        this.f59801c = dVar;
    }

    public b(Handler handler, h0 h0Var) {
        this.f59799a = 14;
        if (h0Var != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f59800b = handler;
        this.f59801c = h0Var;
    }

    public b(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.f59799a = 3;
        if (mediaSessionCompat$Token != null) {
            this.f59801c = DesugarCollections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                this.f59800b = new android.support.v4.media.session.h(context, mediaSessionCompat$Token);
                return;
            } else {
                this.f59800b = new android.support.v4.media.session.h(context, mediaSessionCompat$Token);
                return;
            }
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }
}
