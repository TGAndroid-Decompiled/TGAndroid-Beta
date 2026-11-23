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
import bi.s2;
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
import oi.y3;
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
    public final int f59679a;
    public Object f59680b;
    public Object f59681c;

    public b(int i7, Object obj, Object obj2) {
        this.f59679a = i7;
        this.f59680b = obj;
        this.f59681c = obj2;
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
                if (((PowerManager.WakeLock) bVar.f59681c) == null) {
                    if (((Context) bVar.f59680b).checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                        h2.a.l("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                        return;
                    }
                    PowerManager powerManager = (PowerManager) ((Context) bVar.f59680b).getSystemService("power");
                    if (powerManager == null) {
                        h2.a.l("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                        return;
                    }
                    PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                    bVar.f59681c = newWakeLock;
                    newWakeLock.setReferenceCounted(false);
                }
            }
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) bVar.f59681c;
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
        s sVar = ((j0) this.f59680b).f2337y;
        if (sVar != null) {
            sVar.p().f2328o.A(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f59681c).iterator();
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
        j0 j0Var = (j0) this.f59680b;
        v vVar = j0Var.f2335w.f2432b;
        s sVar = j0Var.f2337y;
        if (sVar != null) {
            sVar.p().f2328o.C(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f59681c).iterator();
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
        s sVar = ((j0) this.f59680b).f2337y;
        if (sVar != null) {
            sVar.p().f2328o.D(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f59681c).iterator();
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
        s sVar = ((j0) this.f59680b).f2337y;
        if (sVar != null) {
            sVar.p().f2328o.E(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f59681c).iterator();
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
        s sVar = ((j0) this.f59680b).f2337y;
        if (sVar != null) {
            sVar.p().f2328o.F(f10, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f59681c).iterator();
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
        s sVar = ((j0) this.f59680b).f2337y;
        if (sVar != null) {
            sVar.p().f2328o.G(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f59681c).iterator();
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
        s sVar = ((j0) this.f59680b).f2337y;
        if (sVar != null) {
            sVar.p().f2328o.H(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f59681c).iterator();
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
        s sVar = ((j0) this.f59680b).f2337y;
        if (sVar != null) {
            sVar.p().f2328o.I(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f59681c).iterator();
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
        MediaController.TransportControls transportControls = ((android.support.v4.media.session.h) this.f59680b).f1689a.getTransportControls();
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
        if (pVar.f2236c == 0) {
            androidx.emoji2.text.h hVar = (androidx.emoji2.text.h) this.f59681c;
            s1.a b10 = pVar.b();
            int a10 = b10.a(8);
            if (a10 != 0) {
                ((ByteBuffer) b10.d).getShort(a10 + b10.f56302a);
            }
            androidx.emoji2.text.d dVar = (androidx.emoji2.text.d) hVar;
            dVar.getClass();
            ThreadLocal threadLocal = androidx.emoji2.text.d.f2209b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb2 = (StringBuilder) threadLocal.get();
            sb2.setLength(0);
            while (i7 < i10) {
                sb2.append(charSequence.charAt(i7));
                i7++;
            }
            TextPaint textPaint = dVar.f2210a;
            String sb3 = sb2.toString();
            int i12 = i0.c.f15886a;
            if (textPaint.hasGlyph(sb3)) {
                i11 = 2;
            } else {
                i11 = 1;
            }
            pVar.f2236c = i11;
        }
        if (pVar.f2236c != 2) {
            return false;
        }
        return true;
    }

    public boolean M() {
        if (((a) ((md0) this.f59680b).d) != null) {
            return true;
        }
        return false;
    }

    public void N(boolean z10, boolean z11, float f10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f59680b;
        r3 r3Var = (r3) this.f59681c;
        f9 f9Var = r3Var.f12487e;
        f9.B1 = f10;
        e9 e9Var = f9Var.A0;
        if (e9Var != null) {
            e9Var.setSpeed(f10);
        }
        z3.Y(r3Var.f12493x, z10);
        if (z11 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
        }
    }

    public void O(androidx.mediarouter.app.q qVar) {
        if (qVar != null) {
            if (!((Set) this.f59681c).add(qVar)) {
                Log.w("MediaControllerCompat", "the callback has already been registered");
                return;
            }
            Handler handler = new Handler();
            qVar.f(handler);
            android.support.v4.media.session.h hVar = (android.support.v4.media.session.h) this.f59680b;
            hVar.f1689a.registerCallback(qVar.f2711a, handler);
            synchronized (hVar.f1690b) {
                if (hVar.f1692e.a() != null) {
                    android.support.v4.media.session.g gVar = new android.support.v4.media.session.g(qVar);
                    hVar.d.put(qVar, gVar);
                    qVar.f2713c = gVar;
                    try {
                        hVar.f1692e.a().p(gVar);
                        qVar.e(13, null, null);
                    } catch (RemoteException e10) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e10);
                    }
                } else {
                    qVar.f2713c = null;
                    hVar.f1691c.add(qVar);
                }
            }
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    public void P(Object obj) {
        Handler handler = (Handler) this.f59680b;
        if (handler != null) {
            handler.post(new s2(this, obj, SystemClock.elapsedRealtime(), 1));
        }
    }

    public void Q(y3 y3Var) {
        d dVar;
        y3 y3Var2;
        Log.d("CAST_CONTROLLER", "set current media");
        md0 md0Var = (md0) this.f59680b;
        y3 y3Var3 = (y3) md0Var.f49831c;
        if (f.u()) {
            if (y3Var3 != null || y3Var != null) {
                if (y3Var3 != null) {
                    ArrayList arrayList = y3Var3.f22529a;
                    if (y3Var != null && arrayList.size() == y3Var.f22529a.size()) {
                        for (int i7 = 0; i7 < arrayList.size(); i7++) {
                            e j3 = y3Var3.j(i7);
                            e j10 = y3Var.j(i7);
                            if ((j3 == null && j10 == null) || (j3 != null && j10 != null && Objects.equals(j3.f59693a, j10.f59693a) && Objects.equals(j3.f59694b, j10.f59694b) && Objects.equals(j3.f59695c, j10.f59695c) && Objects.equals(j3.d, j10.d) && j3.f59696e == j10.f59696e && j3.f59697f == j10.f59697f)) {
                            }
                        }
                        return;
                    }
                }
            } else {
                return;
            }
        }
        if (((a) md0Var.d) != null && y3Var != null) {
            md0Var.j(y3Var);
        }
        if (((a) md0Var.d) != null && (y3Var2 = (y3) md0Var.f49831c) != null) {
            md0Var.F(y3Var2);
        }
        if (y3Var != null && y3Var.f22529a.size() > 0 && !y3Var.j(0).f59693a.startsWith("audio/") && (dVar = (d) md0Var.f49830b) != null) {
            dVar.l(null, null);
        }
        a aVar = (a) md0Var.d;
        if (aVar != null && y3Var != null) {
            aVar.d = y3Var;
            aVar.f59678g = 0;
            aVar.h = 0;
            aVar.p();
        }
        md0Var.f49831c = y3Var;
    }

    public void R(f5.m mVar) {
        this.f59680b = mVar;
        if (mVar.a() != null) {
            mVar.a().getClass();
            String str = mVar.a().d;
            if (str != null) {
                this.f59681c = str;
            }
        }
    }

    public void S(g6.c cVar) {
        String str;
        String N0;
        md0 md0Var = (md0) this.f59680b;
        if (cVar != null) {
            q6.m.e("Must be called from the main thread.");
            h6.h hVar = cVar.f13209j;
            String a10 = cVar.a();
            if (!TextUtils.isEmpty(a10) && hVar != null) {
                a aVar = (a) md0Var.d;
                if (aVar == null || !TextUtils.equals(aVar.f59675c.a(), a10)) {
                    md0Var.I(new a(cVar, (g6.g) this.f59681c, hVar));
                    q6.m.e("Must be called from the main thread.");
                    CastDevice castDevice = cVar.f13210k;
                    if (castDevice != null) {
                        str = castDevice.d;
                    } else {
                        str = null;
                    }
                    PhotoViewer p12 = PhotoViewer.p1();
                    d.i();
                    if (p12.F != null && p12.f43218f0 != null && p12.P1()) {
                        lc lcVar = new lc(p12.f43218f0, new fi.b());
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
            if (!((Set) this.f59681c).remove(qVar)) {
                Log.w("MediaControllerCompat", "the callback has never been registered");
                return;
            }
            try {
                ((android.support.v4.media.session.h) this.f59680b).b(qVar);
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
            if (((i2.q) arrayList.get(i7)).f15971a == 1) {
                try {
                    rVar = new r((i2.q) arrayList.get(i7));
                } catch (i2.p unused) {
                    rVar = null;
                }
                this.f59681c = rVar;
            }
        }
    }

    public void V(x1 x1Var) {
        Handler handler = (Handler) this.f59680b;
        if (handler != null) {
            handler.post(new c1.c(21, this, x1Var));
        }
    }

    public void W(g3 g3Var) {
        try {
            d0(g3Var, (p3) this.f59680b);
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void X(g3 g3Var, int i7, long j3) {
        try {
            o3 o3Var = (o3) ((p3) this.f59680b).g();
            o3Var.c();
            p3.p((p3) o3Var.f7134b, i7);
            p3 p3Var = (p3) o3Var.a();
            this.f59680b = p3Var;
            if (j3 != 0) {
                o3 o3Var2 = (o3) p3Var.g();
                o3Var2.c();
                p3.r((p3) o3Var2.f7134b, j3);
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
            v3.n((v3) t3Var.f7134b, z10);
            f3Var.c();
            g3.r((g3) f3Var.f7134b, (v3) t3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j3 == 0) {
                p3Var = (p3) this.f59680b;
            } else {
                o3 o3Var = (o3) ((p3) this.f59680b).g();
                o3Var.c();
                p3.r((p3) o3Var.f7134b, j3);
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
            o3 o3Var = (o3) ((p3) this.f59680b).g();
            o3Var.c();
            p3.p((p3) o3Var.f7134b, i7);
            this.f59680b = (p3) o3Var.a();
            f3 f3Var = (f3) g3Var.g();
            t3 t3Var = (t3) g3Var.o().g();
            t3Var.c();
            v3.n((v3) t3Var.f7134b, z10);
            f3Var.c();
            g3.r((g3) f3Var.f7134b, (v3) t3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j3 == 0) {
                p3Var = (p3) this.f59680b;
            } else {
                o3 o3Var2 = (o3) ((p3) this.f59680b).g();
                o3Var2.c();
                p3.r((p3) o3Var2.f7134b, j3);
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
            t6.d((p3) this.f59680b);
            t6.c();
            x3.p((x3) t6.f7134b, l3Var);
            ((i) this.f59681c).m((x3) t6.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void accept(Object obj, Object obj2) {
        boolean z10;
        e0 e0Var = (e0) this.f59680b;
        String str = (String) this.f59681c;
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
        synchronized (e0Var.f11384t) {
            try {
                if (e0Var.f11381q != null) {
                    taskCompletionSource.setException(q6.m.m(new Status(2001, null, null, null)));
                } else {
                    e0Var.f11381q = taskCompletionSource;
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
            t6.d((p3) this.f59680b);
            t6.c();
            x3.r((x3) t6.f7134b, a4Var);
            ((i) this.f59681c).m((x3) t6.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void c(b0 b0Var) {
        g0.E2(b0Var);
        ((Runnable) this.f59681c).run();
    }

    public void c0(b4 b4Var) {
        if (b4Var == null) {
            return;
        }
        try {
            w3 t6 = x3.t();
            t6.d((p3) this.f59680b);
            t6.c();
            x3.s((x3) t6.f7134b, b4Var);
            ((i) this.f59681c).m((x3) t6.a());
        } catch (Throwable th2) {
            u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public j2.h createDataSource() {
        return new j2.n((Context) this.f59680b, ((o) this.f59681c).createDataSource());
    }

    @Override
    public lf.a d(b bVar) {
        int i7;
        List list = (List) this.f59681c;
        List list2 = (List) bVar.f59680b;
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
        return new ed.i(bVar, (List) this.f59680b, list);
    }

    public void d0(g3 g3Var, p3 p3Var) {
        if (g3Var == null) {
            return;
        }
        try {
            w3 t6 = x3.t();
            t6.d(p3Var);
            t6.c();
            x3.n((x3) t6.f7134b, g3Var);
            ((i) this.f59681c).m((x3) t6.a());
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
            x3.o((x3) t6.f7134b, i3Var);
            ((i) this.f59681c).m((x3) t6.a());
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
        n nVar = (n) this.f59680b;
        if (nVar != null) {
            nVar.g(str, j3, j10, j11);
        }
    }

    @Override
    public Object mo24get() {
        switch (this.f59679a) {
            case 22:
                return new d0((Context) ((d9.o) this.f59680b).f7917a, (i1) ((ib.c) this.f59681c).mo24get());
            default:
                return new jb.l((jb.q) ((ib.c) this.f59680b).mo24get(), (jb.q) ((ib.c) this.f59681c).mo24get());
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
        ((y10) this.f59680b).a(str);
    }

    @Override
    public void j(String str, long j3, int i7, Object obj, long j10, long j11) {
        ((j6.m) this.f59681c).f17247g = null;
        n nVar = (n) this.f59680b;
        if (nVar != null) {
            nVar.j(str, j3, i7, obj, j10, j11);
        }
    }

    @Override
    public void k(g6.f fVar, int i7) {
        Log.d("CAST_SESSION", "onSessionEnded " + ((g6.c) fVar).a() + " " + i7);
        ((md0) this.f59680b).I(null);
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
        ja.a[] aVarArr = (ja.a[]) this.f59680b;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i7 = 0; i7 < 1; i7++) {
            ja.a aVar = aVarArr[i7];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = aVar.o(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > 1024) {
            return ((w7.s) this.f59681c).o(stackTraceElementArr2);
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
        com.google.android.gms.internal.cast.p pVar = (com.google.android.gms.internal.cast.p) this.f59680b;
        g6.b bVar2 = (g6.b) this.f59681c;
        s4.x xVar = pVar.f6606c;
        j6.b bVar3 = com.google.android.gms.internal.cast.p.f6605j;
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
                Log.i(bVar3.f17235a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.f13201y)));
                if (!z10 && bVar2.f13201y) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (xVar == null && (bVar = pVar.d) != null) {
                    boolean z13 = bVar.f13199w;
                    boolean z14 = bVar.f13198s;
                    s4.y yVar = new s4.y();
                    int i7 = Build.VERSION.SDK_INT;
                    if (i7 >= 30) {
                        yVar.f57076b = z11;
                    }
                    if (i7 >= 30) {
                        yVar.d = z13;
                    }
                    if (i7 >= 30) {
                        yVar.f57077c = z14;
                    }
                    s4.x.i(new z(yVar));
                    Log.i(bVar3.f17235a, bVar3.d("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(pVar.f6609i), Boolean.valueOf(z11), Boolean.valueOf(z13), Boolean.valueOf(z14)));
                    if (z13) {
                        com.google.android.gms.internal.cast.s sVar = pVar.f6608f;
                        q6.m.h(sVar);
                        com.google.android.gms.internal.cast.o oVar = new com.google.android.gms.internal.cast.o(sVar);
                        s4.x.b();
                        s4.x.c().f56941f = oVar;
                        a2.a(a1.CAST_TRANSFER_TO_LOCAL_ENABLED);
                        return;
                    }
                    return;
                }
            }
        }
        z10 = true;
        Log.i(bVar3.f17235a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.f13201y)));
        if (!z10) {
        }
        z11 = false;
        if (xVar == null) {
        }
    }

    public f5.d q() {
        if (((f5.m) this.f59680b) != null) {
            return new f5.d(this);
        }
        throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
    }

    public void r() {
        String str = (String) this.f59680b;
        try {
            ga.d dVar = (ga.d) this.f59681c;
            dVar.getClass();
            new File((File) dVar.d, str).createNewFile();
        } catch (IOException e10) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e10);
        }
    }

    public void t(l2.d dVar) {
        synchronized (dVar) {
        }
        Handler handler = (Handler) this.f59680b;
        if (handler != null) {
            handler.post(new d3.g0(this, dVar, 1));
        }
    }

    public String toString() {
        switch (this.f59679a) {
            case 6:
                try {
                    if (((cc.b) this.f59681c) == null) {
                        this.f59681c = ((cc.g) this.f59680b).a();
                    }
                    return ((cc.b) this.f59681c).toString();
                } catch (bc.e unused) {
                    return "";
                }
            default:
                return super.toString();
        }
    }

    public void u(s f10, boolean z10) {
        j.e(f10, "f");
        s sVar = ((j0) this.f59680b).f2337y;
        if (sVar != null) {
            sVar.p().f2328o.u(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f59681c).iterator();
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
        j0 j0Var = (j0) this.f59680b;
        v vVar = j0Var.f2335w.f2432b;
        s sVar = j0Var.f2337y;
        if (sVar != null) {
            sVar.p().f2328o.w(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f59681c).iterator();
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
        s sVar = ((j0) this.f59680b).f2337y;
        if (sVar != null) {
            sVar.p().f2328o.x(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f59681c).iterator();
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
        s sVar = ((j0) this.f59680b).f2337y;
        if (sVar != null) {
            sVar.p().f2328o.y(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f59681c).iterator();
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
        s sVar = ((j0) this.f59680b).f2337y;
        if (sVar != null) {
            sVar.p().f2328o.z(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f59681c).iterator();
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
        com.google.android.gms.internal.clearcut.d dVar = (com.google.android.gms.internal.clearcut.d) this.f59680b;
        com.google.android.gms.internal.clearcut.b bVar = (com.google.android.gms.internal.clearcut.b) this.f59681c;
        bVar.getClass();
        if (com.google.android.gms.internal.clearcut.d.e()) {
            z10 = ((Boolean) com.google.android.gms.internal.clearcut.d.c(new aa.b0("gms:phenotype:phenotype_flag:debug_disable_caching"))).booleanValue();
        } else {
            z10 = false;
        }
        if (z10) {
            map = bVar.b();
        } else {
            map = bVar.f6784e;
        }
        if (map == null) {
            synchronized (bVar.d) {
                try {
                    Map map2 = bVar.f6784e;
                    map = map2;
                    if (map2 == null) {
                        HashMap b10 = bVar.b();
                        bVar.f6784e = b10;
                        map = b10;
                    }
                } finally {
                }
            }
        }
        if (map == null) {
            map = Collections.EMPTY_MAP;
        }
        return (String) map.get(dVar.f6803b);
    }

    public b(int i7, boolean z10) {
        this.f59679a = i7;
    }

    public b(Object obj, int i7) {
        this.f59679a = i7;
        this.f59680b = obj;
    }

    public b(Object obj, Object obj2, boolean z10, int i7) {
        this.f59679a = i7;
        this.f59681c = obj;
        this.f59680b = obj2;
    }

    public b(Context context, p3 p3Var) {
        this.f59679a = 18;
        i iVar = new i(2);
        try {
            o5.s.b(context);
            iVar.f5118c = o5.s.a().c(m5.a.f20824e).a("PLAY_BILLING_LIBRARY", new l5.c("proto"), new nb.a(9));
        } catch (Throwable unused) {
            iVar.f5117b = true;
        }
        this.f59681c = iVar;
        this.f59680b = p3Var;
    }

    public b(p6.a aVar) {
        this.f59679a = 25;
        this.f59680b = aVar == null ? null : aVar.f55484b;
    }

    public b(j0 j0Var) {
        this.f59679a = 5;
        this.f59680b = j0Var;
        this.f59681c = new CopyOnWriteArrayList();
    }

    public b(ja.a[] aVarArr) {
        this.f59679a = 28;
        this.f59680b = aVarArr;
        this.f59681c = new w7.s(11);
    }

    public b(int i7) {
        this.f59679a = i7;
        switch (i7) {
            case 13:
                this.f59680b = ByteBuffer.allocateDirect(500);
                return;
            default:
                g6.a c10 = g6.a.c(t0.f26895b);
                ug.x xVar = new ug.x(15);
                c10.getClass();
                q6.m.e("Must be called from the main thread.");
                g6.g gVar = c10.f13183c;
                gVar.getClass();
                try {
                    g6.y yVar = gVar.f13218a;
                    g6.j jVar = new g6.j(xVar);
                    Parcel p12 = yVar.p1();
                    t.d(p12, jVar);
                    yVar.t1(p12, 4);
                } catch (RemoteException e10) {
                    g6.g.f13217c.a(e10, "Unable to call %s on %s.", "addCastStateListener", g6.y.class.getSimpleName());
                }
                this.f59680b = new md0(23, false);
                g6.g b10 = c10.b();
                this.f59681c = b10;
                b10.a(this);
                S(b10.c());
                return;
        }
    }

    public b(Context context) {
        this.f59679a = 26;
        o oVar = new o();
        this.f59680b = context.getApplicationContext();
        this.f59681c = oVar;
    }

    public b(c0 c0Var, pb.b bVar, androidx.emoji2.text.d dVar) {
        this.f59679a = 4;
        this.f59680b = c0Var;
        this.f59681c = dVar;
    }

    public b(Handler handler, h0 h0Var) {
        this.f59679a = 14;
        if (h0Var != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f59680b = handler;
        this.f59681c = h0Var;
    }

    public b(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.f59679a = 3;
        if (mediaSessionCompat$Token != null) {
            this.f59681c = DesugarCollections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                this.f59680b = new android.support.v4.media.session.h(context, mediaSessionCompat$Token);
                return;
            } else {
                this.f59680b = new android.support.v4.media.session.h(context, mediaSessionCompat$Token);
                return;
            }
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }
}
