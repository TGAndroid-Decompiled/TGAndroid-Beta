package wf;

import ab.c0;
import android.content.Context;
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
import bi.q2;
import ca.i;
import ci.a0;
import ci.b0;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.q;
import com.google.android.gms.internal.cast.a1;
import com.google.android.gms.internal.cast.a2;
import com.google.android.gms.internal.cast.t;
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
import d1.f;
import d3.h0;
import e2.x1;
import f5.y;
import f6.e0;
import fi.e9;
import fi.f9;
import fi.r3;
import fi.z3;
import g6.h;
import gb.d0;
import gb.i1;
import i2.r;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j2.o;
import j6.n;
import j6.x;
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
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.t0;
import org.telegram.messenger.y10;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.lc;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.md0;
import s4.z;
public class b implements h, ce.c, a0, OnCompleteListener, g, lf.b, y, q, ib.b, j2.g, n, ja.a {
    public static volatile b d;
    public final int f59714a;
    public Object f59715b;
    public Object f59716c;

    public b(int i7, Object obj, Object obj2) {
        this.f59714a = i7;
        this.f59715b = obj;
        this.f59716c = obj2;
    }

    public static b J() {
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
                if (((PowerManager.WakeLock) bVar.f59716c) == null) {
                    if (((Context) bVar.f59715b).checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                        h2.a.l("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                        return;
                    }
                    PowerManager powerManager = (PowerManager) ((Context) bVar.f59715b).getSystemService("power");
                    if (powerManager == null) {
                        h2.a.l("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                        return;
                    }
                    PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                    bVar.f59716c = newWakeLock;
                    newWakeLock.setReferenceCounted(false);
                }
            }
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) bVar.f59716c;
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
        s sVar = ((j0) this.f59715b).f2386y;
        if (sVar != null) {
            sVar.p().f2377o.A(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f59716c).iterator();
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

    public void C(s f10, boolean z10) {
        j.e(f10, "f");
        j0 j0Var = (j0) this.f59715b;
        v vVar = j0Var.f2384w.f2481b;
        s sVar = j0Var.f2386y;
        if (sVar != null) {
            sVar.p().f2377o.C(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f59716c).iterator();
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

    public void D(s f10, boolean z10) {
        j.e(f10, "f");
        s sVar = ((j0) this.f59715b).f2386y;
        if (sVar != null) {
            sVar.p().f2377o.D(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f59716c).iterator();
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

    public void E(s f10, boolean z10) {
        j.e(f10, "f");
        s sVar = ((j0) this.f59715b).f2386y;
        if (sVar != null) {
            sVar.p().f2377o.E(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f59716c).iterator();
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

    public void F(s f10, Bundle bundle, boolean z10) {
        j.e(f10, "f");
        s sVar = ((j0) this.f59715b).f2386y;
        if (sVar != null) {
            sVar.p().f2377o.F(f10, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f59716c).iterator();
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
        s sVar = ((j0) this.f59715b).f2386y;
        if (sVar != null) {
            sVar.p().f2377o.G(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f59716c).iterator();
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
        s sVar = ((j0) this.f59715b).f2386y;
        if (sVar != null) {
            sVar.p().f2377o.H(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f59716c).iterator();
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

    public void I(s f10, boolean z10) {
        j.e(f10, "f");
        s sVar = ((j0) this.f59715b).f2386y;
        if (sVar != null) {
            sVar.p().f2377o.I(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f59716c).iterator();
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

    public m K() {
        MediaController.TransportControls transportControls = ((android.support.v4.media.session.h) this.f59715b).f1738a.getTransportControls();
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
        if (pVar.f2285c == 0) {
            androidx.emoji2.text.h hVar = (androidx.emoji2.text.h) this.f59716c;
            s1.a b10 = pVar.b();
            int a10 = b10.a(8);
            if (a10 != 0) {
                ((ByteBuffer) b10.d).getShort(a10 + b10.f56337a);
            }
            androidx.emoji2.text.d dVar = (androidx.emoji2.text.d) hVar;
            dVar.getClass();
            ThreadLocal threadLocal = androidx.emoji2.text.d.f2258b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb2 = (StringBuilder) threadLocal.get();
            sb2.setLength(0);
            while (i7 < i10) {
                sb2.append(charSequence.charAt(i7));
                i7++;
            }
            TextPaint textPaint = dVar.f2259a;
            String sb3 = sb2.toString();
            int i12 = i0.c.f15920a;
            if (textPaint.hasGlyph(sb3)) {
                i11 = 2;
            } else {
                i11 = 1;
            }
            pVar.f2285c = i11;
        }
        if (pVar.f2285c != 2) {
            return false;
        }
        return true;
    }

    public boolean M() {
        if (((a) ((md0) this.f59715b).d) != null) {
            return true;
        }
        return false;
    }

    public void N(boolean z10, boolean z11, float f10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f59715b;
        r3 r3Var = (r3) this.f59716c;
        f9 f9Var = r3Var.f12526e;
        f9.B1 = f10;
        e9 e9Var = f9Var.A0;
        if (e9Var != null) {
            e9Var.setSpeed(f10);
        }
        z3.Y(r3Var.f12532x, z10);
        if (z11 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
        }
    }

    public void O(androidx.mediarouter.app.q qVar) {
        if (qVar != null) {
            if (!((Set) this.f59716c).add(qVar)) {
                Log.w("MediaControllerCompat", "the callback has already been registered");
                return;
            }
            Handler handler = new Handler();
            qVar.f(handler);
            android.support.v4.media.session.h hVar = (android.support.v4.media.session.h) this.f59715b;
            hVar.f1738a.registerCallback(qVar.f2760a, handler);
            synchronized (hVar.f1739b) {
                if (hVar.f1741e.a() != null) {
                    android.support.v4.media.session.g gVar = new android.support.v4.media.session.g(qVar);
                    hVar.d.put(qVar, gVar);
                    qVar.f2762c = gVar;
                    try {
                        hVar.f1741e.a().p(gVar);
                        qVar.e(13, null, null);
                    } catch (RemoteException e10) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e10);
                    }
                } else {
                    qVar.f2762c = null;
                    hVar.f1740c.add(qVar);
                }
            }
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    public void P(Object obj) {
        Handler handler = (Handler) this.f59715b;
        if (handler != null) {
            handler.post(new q2(this, obj, SystemClock.elapsedRealtime(), 1));
        }
    }

    public void Q(oi.z3 z3Var) {
        d dVar;
        oi.z3 z3Var2;
        Log.d("CAST_CONTROLLER", "set current media");
        md0 md0Var = (md0) this.f59715b;
        oi.z3 z3Var3 = (oi.z3) md0Var.f49858c;
        if (f.u()) {
            if (z3Var3 != null || z3Var != null) {
                if (z3Var3 != null) {
                    ArrayList arrayList = z3Var3.f22592a;
                    if (z3Var != null && arrayList.size() == z3Var.f22592a.size()) {
                        for (int i7 = 0; i7 < arrayList.size(); i7++) {
                            e j3 = z3Var3.j(i7);
                            e j10 = z3Var.j(i7);
                            if ((j3 == null && j10 == null) || (j3 != null && j10 != null && Objects.equals(j3.f59728a, j10.f59728a) && Objects.equals(j3.f59729b, j10.f59729b) && Objects.equals(j3.f59730c, j10.f59730c) && Objects.equals(j3.d, j10.d) && j3.f59731e == j10.f59731e && j3.f59732f == j10.f59732f)) {
                            }
                        }
                        return;
                    }
                }
            } else {
                return;
            }
        }
        if (((a) md0Var.d) != null && z3Var != null) {
            md0Var.j(z3Var);
        }
        if (((a) md0Var.d) != null && (z3Var2 = (oi.z3) md0Var.f49858c) != null) {
            md0Var.F(z3Var2);
        }
        if (z3Var != null && z3Var.f22592a.size() > 0 && !z3Var.j(0).f59728a.startsWith("audio/") && (dVar = (d) md0Var.f49857b) != null) {
            dVar.l(null, null);
        }
        a aVar = (a) md0Var.d;
        if (aVar != null && z3Var != null) {
            aVar.d = z3Var;
            aVar.f59713g = 0;
            aVar.h = 0;
            aVar.p();
        }
        md0Var.f49858c = z3Var;
    }

    public void R(f5.m mVar) {
        this.f59715b = mVar;
        if (mVar.a() != null) {
            mVar.a().getClass();
            String str = mVar.a().d;
            if (str != null) {
                this.f59716c = str;
            }
        }
    }

    public void S(g6.c cVar) {
        String str;
        String N0;
        md0 md0Var = (md0) this.f59715b;
        if (cVar != null) {
            q6.m.e("Must be called from the main thread.");
            h6.h hVar = cVar.f13246j;
            String a10 = cVar.a();
            if (!TextUtils.isEmpty(a10) && hVar != null) {
                a aVar = (a) md0Var.d;
                if (aVar == null || !TextUtils.equals(aVar.f59710c.a(), a10)) {
                    md0Var.I(new a(cVar, (g6.g) this.f59716c, hVar));
                    q6.m.e("Must be called from the main thread.");
                    CastDevice castDevice = cVar.f13247k;
                    if (castDevice != null) {
                        str = castDevice.d;
                    } else {
                        str = null;
                    }
                    PhotoViewer p12 = PhotoViewer.p1();
                    d.i();
                    if (p12.F != null && p12.f43253f0 != null && p12.P1()) {
                        lc lcVar = new lc(p12.f43253f0, new fi.b());
                        if (!TextUtils.isEmpty(str)) {
                            N0 = hd.a0(null, null, 2131752090, str);
                        } else {
                            N0 = hd.N0(2131752091, null);
                        }
                        lcVar.Q(2131624029, 36, N0).j();
                    }
                }
            }
        }
    }

    public void T(androidx.mediarouter.app.q qVar) {
        if (qVar != null) {
            if (!((Set) this.f59716c).remove(qVar)) {
                Log.w("MediaControllerCompat", "the callback has never been registered");
                return;
            }
            try {
                ((android.support.v4.media.session.h) this.f59715b).b(qVar);
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
            if (((i2.q) arrayList.get(i7)).f16005a == 1) {
                try {
                    rVar = new r((i2.q) arrayList.get(i7));
                } catch (i2.p unused) {
                    rVar = null;
                }
                this.f59716c = rVar;
            }
        }
    }

    public void V(x1 x1Var) {
        Handler handler = (Handler) this.f59715b;
        if (handler != null) {
            handler.post(new c1.a(23, this, x1Var));
        }
    }

    public void W(g3 g3Var) {
        try {
            d0(g3Var, (p3) this.f59715b);
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void X(g3 g3Var, int i7, long j3) {
        try {
            o3 o3Var = (o3) ((p3) this.f59715b).g();
            o3Var.c();
            p3.p((p3) o3Var.f7171b, i7);
            p3 p3Var = (p3) o3Var.a();
            this.f59715b = p3Var;
            if (j3 != 0) {
                o3 o3Var2 = (o3) p3Var.g();
                o3Var2.c();
                p3.r((p3) o3Var2.f7171b, j3);
                p3Var = (p3) o3Var2.a();
            }
            d0(g3Var, p3Var);
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
            v3.n((v3) t3Var.f7171b, z10);
            f3Var.c();
            g3.r((g3) f3Var.f7171b, (v3) t3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j3 == 0) {
                p3Var = (p3) this.f59715b;
            } else {
                o3 o3Var = (o3) ((p3) this.f59715b).g();
                o3Var.c();
                p3.r((p3) o3Var.f7171b, j3);
                p3Var = (p3) o3Var.a();
            }
            d0(g3Var2, p3Var);
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void Z(g3 g3Var, int i7, long j3, boolean z10) {
        p3 p3Var;
        try {
            o3 o3Var = (o3) ((p3) this.f59715b).g();
            o3Var.c();
            p3.p((p3) o3Var.f7171b, i7);
            this.f59715b = (p3) o3Var.a();
            f3 f3Var = (f3) g3Var.g();
            t3 t3Var = (t3) g3Var.o().g();
            t3Var.c();
            v3.n((v3) t3Var.f7171b, z10);
            f3Var.c();
            g3.r((g3) f3Var.f7171b, (v3) t3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j3 == 0) {
                p3Var = (p3) this.f59715b;
            } else {
                o3 o3Var2 = (o3) ((p3) this.f59715b).g();
                o3Var2.c();
                p3.r((p3) o3Var2.f7171b, j3);
                p3Var = (p3) o3Var2.a();
            }
            d0(g3Var2, p3Var);
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void a(g6.f fVar, boolean z10) {
        Log.d("CAST_SESSION", "onSessionResumed " + ((g6.c) fVar).a() + " " + z10);
    }

    public void a0(l3 l3Var) {
        try {
            w3 t6 = x3.t();
            t6.d((p3) this.f59715b);
            t6.c();
            x3.p((x3) t6.f7171b, l3Var);
            ((i) this.f59716c).m((x3) t6.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        boolean z10;
        e0 e0Var = (e0) this.f59715b;
        String str = (String) this.f59716c;
        x xVar = (x) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        if (e0Var.G == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        q6.m.j("Not connected to device", z10);
        j6.f fVar = (j6.f) xVar.n();
        Parcel p12 = fVar.p1();
        p12.writeString(str);
        fVar.u1(p12, 5);
        synchronized (e0Var.f11421t) {
            try {
                if (e0Var.f11418q != null) {
                    taskCompletionSource.setException(q6.m.m(new Status(2001, null, null, null)));
                } else {
                    e0Var.f11418q = taskCompletionSource;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public void b(g6.f fVar, int i7) {
        Log.d("CAST_SESSION", "onSessionStartSuspended " + ((g6.c) fVar).a() + " " + i7);
    }

    public void b0(a4 a4Var) {
        try {
            w3 t6 = x3.t();
            t6.d((p3) this.f59715b);
            t6.c();
            x3.r((x3) t6.f7171b, a4Var);
            ((i) this.f59716c).m((x3) t6.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void c(b0 b0Var) {
        g0.E2(b0Var);
        ((Runnable) this.f59716c).run();
    }

    public void c0(b4 b4Var) {
        if (b4Var == null) {
            return;
        }
        try {
            w3 t6 = x3.t();
            t6.d((p3) this.f59715b);
            t6.c();
            x3.s((x3) t6.f7171b, b4Var);
            ((i) this.f59716c).m((x3) t6.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public j2.h createDataSource() {
        return new j2.n((Context) this.f59715b, ((o) this.f59716c).createDataSource());
    }

    @Override
    public lf.a d(b bVar) {
        int i7;
        List list = (List) this.f59716c;
        List list2 = (List) bVar.f59715b;
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
        return new ed.i(bVar, (List) this.f59715b, list);
    }

    public void d0(g3 g3Var, p3 p3Var) {
        if (g3Var == null) {
            return;
        }
        try {
            w3 t6 = x3.t();
            t6.d(p3Var);
            t6.c();
            x3.n((x3) t6.f7171b, g3Var);
            ((i) this.f59716c).m((x3) t6.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void e(g6.f fVar, int i7) {
        Log.d("CAST_SESSION", "onSessionStartFailed " + ((g6.c) fVar).a() + " " + i7);
    }

    public void e0(i3 i3Var, p3 p3Var) {
        try {
            w3 t6 = x3.t();
            t6.d(p3Var);
            t6.c();
            x3.o((x3) t6.f7171b, i3Var);
            ((i) this.f59716c).m((x3) t6.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void f(g6.f fVar, int i7) {
        Log.d("CAST_SESSION", "onSessionResumeFailed " + ((g6.c) fVar).a() + " " + i7);
    }

    @Override
    public void g(String str, long j3, long j10, long j11) {
        n nVar = (n) this.f59715b;
        if (nVar != null) {
            nVar.g(str, j3, j10, j11);
        }
    }

    @Override
    public Object mo24get() {
        switch (this.f59714a) {
            case 22:
                return new d0((Context) ((d9.o) this.f59715b).f7954a, (i1) ((ib.c) this.f59716c).mo24get());
            default:
                return new jb.l((jb.q) ((ib.c) this.f59715b).mo24get(), (jb.q) ((ib.c) this.f59716c).mo24get());
        }
    }

    @Override
    public void h(g6.f fVar, String str) {
        g6.c cVar = (g6.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarted " + cVar.a() + " " + str);
        S(cVar);
    }

    @Override
    public void i(String str) {
        ((y10) this.f59715b).a(str);
    }

    @Override
    public void j(String str, long j3, int i7, Object obj, long j10, long j11) {
        ((j6.m) this.f59716c).f17281g = null;
        n nVar = (n) this.f59715b;
        if (nVar != null) {
            nVar.j(str, j3, i7, obj, j10, j11);
        }
    }

    @Override
    public void k(g6.f fVar, int i7) {
        Log.d("CAST_SESSION", "onSessionEnded " + ((g6.c) fVar).a() + " " + i7);
        ((md0) this.f59715b).I(null);
    }

    @Override
    public void l(g6.f fVar, String str) {
        Log.d("CAST_SESSION", "onSessionResuming " + ((g6.c) fVar).a() + " " + str);
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
    public StackTraceElement[] o(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        ja.a[] aVarArr = (ja.a[]) this.f59715b;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i7 = 0; i7 < 1; i7++) {
            ja.a aVar = aVarArr[i7];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = aVar.o(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > 1024) {
            return ((w7.s) this.f59716c).o(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }

    @Override
    public void onComplete(Task task) {
        boolean z10;
        boolean z11;
        g6.b bVar;
        boolean z12;
        String str;
        com.google.android.gms.internal.cast.p pVar = (com.google.android.gms.internal.cast.p) this.f59715b;
        g6.b bVar2 = (g6.b) this.f59716c;
        s4.x xVar = pVar.f6643c;
        j6.b bVar3 = com.google.android.gms.internal.cast.p.f6642j;
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
                Log.i(bVar3.f17269a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.f13238y)));
                if (!z10 && bVar2.f13238y) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (xVar == null && (bVar = pVar.d) != null) {
                    boolean z13 = bVar.f13236w;
                    boolean z14 = bVar.f13235s;
                    s4.y yVar = new s4.y();
                    int i7 = Build.VERSION.SDK_INT;
                    if (i7 >= 30) {
                        yVar.f57111b = z11;
                    }
                    if (i7 >= 30) {
                        yVar.d = z13;
                    }
                    if (i7 >= 30) {
                        yVar.f57112c = z14;
                    }
                    s4.x.i(new z(yVar));
                    Log.i(bVar3.f17269a, bVar3.d("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(pVar.f6646i), Boolean.valueOf(z11), Boolean.valueOf(z13), Boolean.valueOf(z14)));
                    if (z13) {
                        com.google.android.gms.internal.cast.s sVar = pVar.f6645f;
                        q6.m.h(sVar);
                        com.google.android.gms.internal.cast.o oVar = new com.google.android.gms.internal.cast.o(sVar);
                        s4.x.b();
                        s4.x.c().f56976f = oVar;
                        a2.a(a1.CAST_TRANSFER_TO_LOCAL_ENABLED);
                        return;
                    }
                    return;
                }
            }
        }
        z10 = true;
        Log.i(bVar3.f17269a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.f13238y)));
        if (!z10) {
        }
        z11 = false;
        if (xVar == null) {
        }
    }

    public f5.d q() {
        if (((f5.m) this.f59715b) != null) {
            return new f5.d(this);
        }
        throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
    }

    public void r() {
        String str = (String) this.f59715b;
        try {
            ga.d dVar = (ga.d) this.f59716c;
            dVar.getClass();
            new File((File) dVar.d, str).createNewFile();
        } catch (IOException e10) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e10);
        }
    }

    public void t(l2.d dVar) {
        synchronized (dVar) {
        }
        Handler handler = (Handler) this.f59715b;
        if (handler != null) {
            handler.post(new d3.g0(this, dVar, 1));
        }
    }

    public String toString() {
        switch (this.f59714a) {
            case 6:
                try {
                    if (((cc.b) this.f59716c) == null) {
                        this.f59716c = ((cc.g) this.f59715b).a();
                    }
                    return ((cc.b) this.f59716c).toString();
                } catch (bc.e unused) {
                    return "";
                }
            default:
                return super.toString();
        }
    }

    public void u(s f10, boolean z10) {
        j.e(f10, "f");
        s sVar = ((j0) this.f59715b).f2386y;
        if (sVar != null) {
            sVar.p().f2377o.u(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f59716c).iterator();
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
    public java.lang.Object v(ce.d r6, kd.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: wf.b.v(ce.d, kd.c):java.lang.Object");
    }

    public void w(s f10, boolean z10) {
        j.e(f10, "f");
        j0 j0Var = (j0) this.f59715b;
        v vVar = j0Var.f2384w.f2481b;
        s sVar = j0Var.f2386y;
        if (sVar != null) {
            sVar.p().f2377o.w(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f59716c).iterator();
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
        s sVar = ((j0) this.f59715b).f2386y;
        if (sVar != null) {
            sVar.p().f2377o.x(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f59716c).iterator();
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
        s sVar = ((j0) this.f59715b).f2386y;
        if (sVar != null) {
            sVar.p().f2377o.y(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f59716c).iterator();
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
        s sVar = ((j0) this.f59715b).f2386y;
        if (sVar != null) {
            sVar.p().f2377o.z(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f59716c).iterator();
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
        com.google.android.gms.internal.clearcut.d dVar = (com.google.android.gms.internal.clearcut.d) this.f59715b;
        com.google.android.gms.internal.clearcut.b bVar = (com.google.android.gms.internal.clearcut.b) this.f59716c;
        bVar.getClass();
        if (com.google.android.gms.internal.clearcut.d.e()) {
            z10 = ((Boolean) com.google.android.gms.internal.clearcut.d.c(new aa.b0("gms:phenotype:phenotype_flag:debug_disable_caching"))).booleanValue();
        } else {
            z10 = false;
        }
        if (z10) {
            map = bVar.b();
        } else {
            map = bVar.f6821e;
        }
        if (map == null) {
            synchronized (bVar.d) {
                try {
                    Map map2 = bVar.f6821e;
                    map = map2;
                    if (map2 == null) {
                        HashMap b10 = bVar.b();
                        bVar.f6821e = b10;
                        map = b10;
                    }
                } finally {
                }
            }
        }
        if (map == null) {
            map = Collections.EMPTY_MAP;
        }
        return (String) map.get(dVar.f6840b);
    }

    public b(int i7, boolean z10) {
        this.f59714a = i7;
    }

    public b(Object obj, int i7) {
        this.f59714a = i7;
        this.f59715b = obj;
    }

    public b(Object obj, Object obj2, boolean z10, int i7) {
        this.f59714a = i7;
        this.f59716c = obj;
        this.f59715b = obj2;
    }

    public b(Context context, p3 p3Var) {
        this.f59714a = 18;
        i iVar = new i(2);
        try {
            o5.s.b(context);
            iVar.f5155c = o5.s.a().c(m5.a.f20858e).a("PLAY_BILLING_LIBRARY", new l5.c("proto"), new nb.a(9));
        } catch (Throwable unused) {
            iVar.f5154b = true;
        }
        this.f59716c = iVar;
        this.f59715b = p3Var;
    }

    public b(p6.a aVar) {
        this.f59714a = 25;
        this.f59715b = aVar == null ? null : aVar.f55519b;
    }

    public b(j0 j0Var) {
        this.f59714a = 5;
        this.f59715b = j0Var;
        this.f59716c = new CopyOnWriteArrayList();
    }

    public b(ja.a[] aVarArr) {
        this.f59714a = 28;
        this.f59715b = aVarArr;
        this.f59716c = new w7.s(11);
    }

    public b(int i7) {
        this.f59714a = i7;
        switch (i7) {
            case 13:
                this.f59715b = ByteBuffer.allocateDirect(500);
                return;
            default:
                g6.a c10 = g6.a.c(t0.f26931b);
                ug.x xVar = new ug.x(15);
                c10.getClass();
                q6.m.e("Must be called from the main thread.");
                g6.g gVar = c10.f13220c;
                gVar.getClass();
                try {
                    g6.y yVar = gVar.f13255a;
                    g6.j jVar = new g6.j(xVar);
                    Parcel p12 = yVar.p1();
                    t.d(p12, jVar);
                    yVar.t1(p12, 4);
                } catch (RemoteException e10) {
                    g6.g.f13254c.a(e10, "Unable to call %s on %s.", "addCastStateListener", g6.y.class.getSimpleName());
                }
                this.f59715b = new md0(23, false);
                g6.g b10 = c10.b();
                this.f59716c = b10;
                b10.a(this);
                S(b10.c());
                return;
        }
    }

    public b(Context context) {
        this.f59714a = 26;
        o oVar = new o();
        this.f59715b = context.getApplicationContext();
        this.f59716c = oVar;
    }

    public b(c0 c0Var, pb.b bVar, androidx.emoji2.text.d dVar) {
        this.f59714a = 4;
        this.f59715b = c0Var;
        this.f59716c = dVar;
    }

    public b(Handler handler, h0 h0Var) {
        this.f59714a = 14;
        if (h0Var != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f59715b = handler;
        this.f59716c = h0Var;
    }

    public b(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.f59714a = 3;
        if (mediaSessionCompat$Token != null) {
            this.f59716c = DesugarCollections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                this.f59715b = new android.support.v4.media.session.h(context, mediaSessionCompat$Token);
                return;
            } else {
                this.f59715b = new android.support.v4.media.session.h(context, mediaSessionCompat$Token);
                return;
            }
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }
}
