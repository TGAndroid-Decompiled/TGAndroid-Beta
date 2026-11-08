package wf;

import ab.b0;
import ai.h0;
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
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.v;
import androidx.fragment.app.i0;
import androidx.fragment.app.r;
import androidx.fragment.app.u;
import androidx.mediarouter.app.q;
import bi.a4;
import bi.d3;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.internal.cast.a2;
import com.google.android.gms.internal.cast.t;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import d3.g0;
import di.a1;
import di.i4;
import di.o9;
import di.p9;
import di.z3;
import e2.s;
import e2.x1;
import f3.o;
import g6.f;
import g6.h;
import h6.g;
import ii.d0;
import ii.k0;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j6.m;
import j6.n;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.j;
import li.a6;
import li.g1;
import li.g3;
import li.h4;
import li.p;
import li.q3;
import li.r3;
import li.s3;
import li.t3;
import li.y3;
import org.telegram.messenger.c20;
import org.telegram.messenger.id;
import org.telegram.messenger.t0;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.k60;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.an;
import org.telegram.ui.hy0;
import s4.x;
import s4.y;
import s4.z;
public class b implements h, h0, ce.c, OnCompleteListener, com.google.android.gms.internal.clearcut.h, k0, n, r3 {
    public static volatile b d;
    public final int f57653a;
    public Object f57654b;
    public Object f57655c;

    public b(int i7, Object obj, Object obj2) {
        this.f57653a = i7;
        this.f57654b = obj;
        this.f57655c = obj2;
    }

    public static boolean E(Editable editable, KeyEvent keyEvent, boolean z9) {
        v[] vVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (vVarArr = (v[]) editable.getSpans(selectionStart, selectionEnd, v.class)) != null && vVarArr.length > 0) {
                for (v vVar : vVarArr) {
                    int spanStart = editable.getSpanStart(vVar);
                    int spanEnd = editable.getSpanEnd(vVar);
                    if ((z9 && spanStart == selectionStart) || ((!z9 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static b Z() {
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

    public static String n0(b bVar) {
        Collection<String> collection = (Collection) bVar.f57655c;
        StringBuilder sb2 = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String str = (String) bVar.f57654b;
        if (str != null) {
            String upperCase = str.toUpperCase(Locale.ROOT);
            if (upperCase.matches("[A-F0-9]+")) {
                sb2.append("/");
                sb2.append(upperCase);
            } else {
                throw new IllegalArgumentException("Invalid application ID: ".concat(str));
            }
        }
        if (collection != null) {
            if (!collection.isEmpty()) {
                if (str == null) {
                    sb2.append("/");
                }
                sb2.append("/");
                boolean z9 = true;
                for (String str2 : collection) {
                    j6.a.b(str2);
                    if (!z9) {
                        sb2.append(",");
                    }
                    if (!j6.a.f16506a.matcher(str2).matches()) {
                        StringBuilder sb3 = new StringBuilder(str2.length());
                        for (int i7 = 0; i7 < str2.length(); i7++) {
                            char charAt = str2.charAt(i7);
                            if ((charAt < 'A' || charAt > 'Z') && ((charAt < 'a' || charAt > 'z') && ((charAt < '0' || charAt > '9') && charAt != '_' && charAt != '-' && charAt != '.' && charAt != ':'))) {
                                sb3.append(String.format("%%%04x", Integer.valueOf(charAt)));
                            } else {
                                sb3.append(charAt);
                            }
                        }
                        str2 = sb3.toString();
                    }
                    sb2.append(str2);
                    z9 = false;
                }
            } else {
                throw new IllegalArgumentException("Must specify at least one namespace");
            }
        }
        if (str == null && collection == null) {
            sb2.append("/");
        }
        if (collection == null) {
            sb2.append("/");
        }
        sb2.append("//ALLOW_IPV6");
        return sb2.toString();
    }

    public static void w(b bVar, boolean z9, boolean z10) {
        synchronized (bVar) {
            boolean z11 = false;
            if (z9) {
                if (((PowerManager.WakeLock) bVar.f57655c) == null) {
                    if (((Context) bVar.f57654b).checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                        h2.a.l("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                        return;
                    }
                    PowerManager powerManager = (PowerManager) ((Context) bVar.f57654b).getSystemService("power");
                    if (powerManager == null) {
                        h2.a.l("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                        return;
                    }
                    PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                    bVar.f57655c = newWakeLock;
                    newWakeLock.setReferenceCounted(false);
                }
            }
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) bVar.f57655c;
            if (wakeLock == null) {
                return;
            }
            if (z9 && z10) {
                z11 = true;
            }
            if (z11) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }

    public void A() {
        this.f57654b = null;
        this.f57655c = null;
    }

    @Override
    public java.lang.Object B(ce.d r6, kd.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: wf.b.B(ce.d, kd.c):java.lang.Object");
    }

    public boolean C(int i7) {
        return ((s) this.f57654b).f10542a.get(i7);
    }

    public void D() {
        String str = (String) this.f57654b;
        try {
            ga.d dVar = (ga.d) this.f57655c;
            dVar.getClass();
            new File((File) dVar.d, str).createNewFile();
        } catch (IOException e10) {
            Log.e("FirebaseCrashlytics", "Error creating marker: ".concat(str), e10);
        }
    }

    public void F(l2.d dVar) {
        synchronized (dVar) {
        }
        Handler handler = (Handler) this.f57654b;
        if (handler != null) {
            handler.post(new g0(this, dVar, 1));
        }
    }

    @Override
    public void G() {
        y3 y3Var = ((p) this.f57655c).f18761s;
        if (y3Var != null) {
            int i7 = 0;
            y3Var.e(false, true);
            int i10 = y3Var.f19002b0;
            if (i10 != 2) {
                i7 = i10;
            }
            y3Var.g(i7, true);
        }
    }

    @Override
    public void H(String str, long j3, int i7, Object obj, long j10, long j11) {
        int i10;
        m mVar = (m) this.f57655c;
        if (((n) this.f57654b) != null) {
            if (i7 == 2001) {
                Object[] objArr = {Integer.valueOf(mVar.f16521i)};
                j6.b bVar = mVar.f16541a;
                Log.w(bVar.f16508a, bVar.d("Possibility of local queue out of sync with receiver queue. Refetching sequence number. Current Local Sequence Number = %d", objArr));
                Iterator it = ((h6.h) mVar.h.f13889b).f14253i.iterator();
                while (it.hasNext()) {
                    ((g) it.next()).o();
                }
                i10 = 2001;
            } else {
                i10 = i7;
            }
            ((n) this.f57654b).H(str, j3, i10, obj, j10, j11);
        }
    }

    public void I(r f10, boolean z9) {
        j.e(f10, "f");
        r rVar = ((i0) this.f57654b).f2417y;
        if (rVar != null) {
            rVar.p().f2408o.I(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f57655c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z9) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    @Override
    public k60 J(View view) {
        p pVar = (p) this.f57655c;
        k60 k60Var = new k60(pVar, (f6) this.f57654b, view, false, false, true);
        pVar.H = k60Var;
        return k60Var;
    }

    public void K(r f10, boolean z9) {
        j.e(f10, "f");
        i0 i0Var = (i0) this.f57654b;
        u uVar = i0Var.f2415w.f2512b;
        r rVar = i0Var.f2417y;
        if (rVar != null) {
            rVar.p().f2408o.K(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f57655c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z9) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void L(r f10, boolean z9) {
        j.e(f10, "f");
        r rVar = ((i0) this.f57654b).f2417y;
        if (rVar != null) {
            rVar.p().f2408o.L(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f57655c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z9) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void M(r f10, boolean z9) {
        j.e(f10, "f");
        r rVar = ((i0) this.f57654b).f2417y;
        if (rVar != null) {
            rVar.p().f2408o.M(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f57655c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z9) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    @Override
    public void N() {
        p pVar = (p) this.f57655c;
        pVar.c0();
        pVar.d0();
    }

    public void O(r f10, boolean z9) {
        j.e(f10, "f");
        r rVar = ((i0) this.f57654b).f2417y;
        if (rVar != null) {
            rVar.p().f2408o.O(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f57655c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z9) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void Q(r f10, boolean z9) {
        j.e(f10, "f");
        r rVar = ((i0) this.f57654b).f2417y;
        if (rVar != null) {
            rVar.p().f2408o.Q(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f57655c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z9) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void R(r f10, boolean z9) {
        j.e(f10, "f");
        i0 i0Var = (i0) this.f57654b;
        u uVar = i0Var.f2415w.f2512b;
        r rVar = i0Var.f2417y;
        if (rVar != null) {
            rVar.p().f2408o.R(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f57655c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z9) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void S(r f10, boolean z9) {
        j.e(f10, "f");
        r rVar = ((i0) this.f57654b).f2417y;
        if (rVar != null) {
            rVar.p().f2408o.S(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f57655c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z9) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void T(r f10, boolean z9) {
        j.e(f10, "f");
        r rVar = ((i0) this.f57654b).f2417y;
        if (rVar != null) {
            rVar.p().f2408o.T(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f57655c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z9) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void U(r f10, Bundle bundle, boolean z9) {
        j.e(f10, "f");
        r rVar = ((i0) this.f57654b).f2417y;
        if (rVar != null) {
            rVar.p().f2408o.U(f10, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f57655c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z9) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void V(r f10, boolean z9) {
        j.e(f10, "f");
        r rVar = ((i0) this.f57654b).f2417y;
        if (rVar != null) {
            rVar.p().f2408o.V(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f57655c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z9) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void W(r f10, boolean z9) {
        j.e(f10, "f");
        r rVar = ((i0) this.f57654b).f2417y;
        if (rVar != null) {
            rVar.p().f2408o.W(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f57655c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z9) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public void X(r f10, boolean z9) {
        j.e(f10, "f");
        r rVar = ((i0) this.f57654b).f2417y;
        if (rVar != null) {
            rVar.p().f2408o.X(f10, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f57655c).iterator();
        if (it.hasNext()) {
            if (it.next() == null) {
                if (z9) {
                    throw null;
                }
                throw null;
            }
            throw new ClassCastException();
        }
    }

    public o Y(Object... objArr) {
        Constructor a10;
        synchronized (((AtomicBoolean) this.f57655c)) {
            if (!((AtomicBoolean) this.f57655c).get()) {
                try {
                    a10 = ((a1) this.f57654b).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f57655c).set(true);
                } catch (Exception e10) {
                    throw new RuntimeException("Error instantiating extension", e10);
                }
            }
            a10 = null;
        }
        if (a10 == null) {
            return null;
        }
        try {
            return (o) a10.newInstance(objArr);
        } catch (Exception e11) {
            throw new IllegalStateException("Unexpected error creating extractor", e11);
        }
    }

    @Override
    public boolean a(float r6) {
        throw new UnsupportedOperationException("Method not decompiled: wf.b.a(float):boolean");
    }

    public synchronized Map a0() {
        try {
            if (((Map) this.f57655c) == null) {
                this.f57655c = DesugarCollections.unmodifiableMap(new HashMap((HashMap) this.f57654b));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return (Map) this.f57655c;
    }

    @Override
    public void b(f fVar, boolean z9) {
        Log.d("CAST_SESSION", "onSessionResumed " + ((g6.c) fVar).a() + " " + z9);
    }

    public android.support.v4.media.session.m b0() {
        MediaController.TransportControls transportControls = ((android.support.v4.media.session.h) this.f57654b).f1777a.getTransportControls();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            return new l(transportControls);
        }
        if (i7 >= 24) {
            return new l(transportControls);
        }
        return new l(transportControls);
    }

    @Override
    public void c(f fVar, int i7) {
        Log.d("CAST_SESSION", "onSessionStartSuspended " + ((g6.c) fVar).a() + " " + i7);
    }

    public boolean c0(CharSequence charSequence, int i7, int i10, androidx.emoji2.text.o oVar) {
        int i11;
        if (oVar.f2322c == 0) {
            androidx.emoji2.text.h hVar = (androidx.emoji2.text.h) this.f57655c;
            s1.a b10 = oVar.b();
            int a10 = b10.a(8);
            if (a10 != 0) {
                ((ByteBuffer) b10.d).getShort(a10 + b10.f54236a);
            }
            androidx.emoji2.text.d dVar = (androidx.emoji2.text.d) hVar;
            dVar.getClass();
            ThreadLocal threadLocal = androidx.emoji2.text.d.f2296b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb2 = (StringBuilder) threadLocal.get();
            sb2.setLength(0);
            while (i7 < i10) {
                sb2.append(charSequence.charAt(i7));
                i7++;
            }
            TextPaint textPaint = dVar.f2297a;
            String sb3 = sb2.toString();
            int i12 = i0.c.f15123a;
            if (textPaint.hasGlyph(sb3)) {
                i11 = 2;
            } else {
                i11 = 1;
            }
            oVar.f2322c = i11;
        }
        if (oVar.f2322c != 2) {
            return false;
        }
        return true;
    }

    @Override
    public void close() {
        ((d0) this.f57655c).f15505k1.E(0);
    }

    @Override
    public void d(s3 s3Var, View view) {
        p pVar = (p) this.f57655c;
        k60 k60Var = new k60(pVar, (f6) this.f57654b, view, false, false, true);
        k60Var.Q = true;
        f2 f2Var = pVar.f39004b.W1;
        pVar.getContext();
        pVar.H = h4.b(k60Var, f2Var, s3Var, true);
    }

    public boolean d0() {
        if (((a) ((hy0) this.f57654b).d) != null) {
            return true;
        }
        return false;
    }

    @Override
    public void e(f fVar, int i7) {
        Log.d("CAST_SESSION", "onSessionStartFailed " + ((g6.c) fVar).a() + " " + i7);
    }

    public void e0(boolean z9, boolean z10, float f10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f57654b;
        z3 z3Var = (z3) this.f57655c;
        p9 p9Var = z3Var.f10007e;
        p9.A1 = f10;
        o9 o9Var = p9Var.f9584z0;
        if (o9Var != null) {
            o9Var.setSpeed(f10);
        }
        i4.Y(z3Var.f10013x, z9);
        if (z10 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
        }
    }

    @Override
    public void f(f fVar, int i7) {
        Log.d("CAST_SESSION", "onSessionResumeFailed " + ((g6.c) fVar).a() + " " + i7);
    }

    public void f0(q qVar) {
        if (qVar != null) {
            if (!((Set) this.f57655c).add(qVar)) {
                Log.w("MediaControllerCompat", "the callback has already been registered");
                return;
            }
            Handler handler = new Handler();
            qVar.f(handler);
            android.support.v4.media.session.h hVar = (android.support.v4.media.session.h) this.f57654b;
            hVar.f1777a.registerCallback(qVar.f2792a, handler);
            synchronized (hVar.f1778b) {
                if (hVar.f1780e.a() != null) {
                    android.support.v4.media.session.g gVar = new android.support.v4.media.session.g(qVar);
                    hVar.d.put(qVar, gVar);
                    qVar.f2794c = gVar;
                    try {
                        hVar.f1780e.a().p(gVar);
                        qVar.e(13, null, null);
                    } catch (RemoteException e10) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e10);
                    }
                } else {
                    qVar.f2794c = null;
                    hVar.f1779c.add(qVar);
                }
            }
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    @Override
    public void g(int i7) {
        p.S((p) this.f57655c, 74, i7);
    }

    public void g0(Object obj) {
        Handler handler = (Handler) this.f57654b;
        if (handler != null) {
            handler.post(new d3(this, obj, SystemClock.elapsedRealtime(), 3));
        }
    }

    @Override
    public void h() {
        int i7;
        p pVar = (p) this.f57655c;
        t3 t3Var = pVar.f18760r;
        y3 y3Var = pVar.f18761s;
        if (y3Var != null) {
            g3 g3Var = t3Var.f18901u3;
            if (g3Var != null && g3Var.x() && t3Var.F4()) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            if (y3Var.f19000a0 == 2) {
                y3Var.f19002b0 = i7;
            } else {
                y3Var.g(i7, true);
            }
            if (i7 != 0) {
                pVar.b0();
            }
        }
        pVar.e0();
    }

    public void h0(g7.c cVar) {
        d dVar;
        g7.c cVar2;
        Log.d("CAST_CONTROLLER", "set current media");
        hy0 hy0Var = (hy0) this.f57654b;
        g7.c cVar3 = (g7.c) hy0Var.f46527c;
        if (d1.f.u()) {
            if (cVar3 != null || cVar != null) {
                if (cVar3 != null) {
                    ArrayList arrayList = cVar3.f13573a;
                    if (cVar != null && arrayList.size() == cVar.f13573a.size()) {
                        for (int i7 = 0; i7 < arrayList.size(); i7++) {
                            e a10 = cVar3.a(i7);
                            e a11 = cVar.a(i7);
                            if ((a10 == null && a11 == null) || (a10 != null && a11 != null && Objects.equals(a10.f57667a, a11.f57667a) && Objects.equals(a10.f57668b, a11.f57668b) && Objects.equals(a10.f57669c, a11.f57669c) && Objects.equals(a10.d, a11.d) && a10.f57670e == a11.f57670e && a10.f57671f == a11.f57671f)) {
                            }
                        }
                        return;
                    }
                }
            } else {
                return;
            }
        }
        if (((a) hy0Var.d) != null && cVar != null) {
            hy0Var.j(cVar);
        }
        if (((a) hy0Var.d) != null && (cVar2 = (g7.c) hy0Var.f46527c) != null) {
            hy0Var.H(cVar2);
        }
        if (cVar != null && cVar.f13573a.size() > 0 && !cVar.a(0).f57667a.startsWith("audio/") && (dVar = (d) hy0Var.f46526b) != null) {
            dVar.l(null, null);
        }
        a aVar = (a) hy0Var.d;
        if (aVar != null && cVar != null) {
            aVar.d = cVar;
            aVar.f57652g = 0;
            aVar.h = 0;
            aVar.p();
        }
        hy0Var.f46527c = cVar;
    }

    @Override
    public void i(f fVar, String str) {
        g6.c cVar = (g6.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarted " + cVar.a() + " " + str);
        j0(cVar);
    }

    public void i0(int i7) {
        try {
            l8.e eVar = (l8.e) this.f57654b;
            Parcel p12 = eVar.p1();
            p12.writeInt(i7);
            eVar.t1(p12, 16);
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public void j(f fVar, int i7) {
        Log.d("CAST_SESSION", "onSessionEnded " + ((g6.c) fVar).a() + " " + i7);
        ((hy0) this.f57654b).K(null);
    }

    public void j0(g6.c cVar) {
        String str;
        String M0;
        hy0 hy0Var = (hy0) this.f57654b;
        if (cVar != null) {
            q6.m.d("Must be called from the main thread.");
            h6.h hVar = cVar.f13549j;
            String a10 = cVar.a();
            if (!TextUtils.isEmpty(a10) && hVar != null) {
                a aVar = (a) hy0Var.d;
                if (aVar == null || !TextUtils.equals(aVar.f57649c.a(), a10)) {
                    hy0Var.K(new a(cVar, (g6.g) this.f57655c, hVar));
                    q6.m.d("Must be called from the main thread.");
                    CastDevice castDevice = cVar.f13550k;
                    if (castDevice != null) {
                        str = castDevice.d;
                    } else {
                        str = null;
                    }
                    PhotoViewer p12 = PhotoViewer.p1();
                    d.i();
                    if (p12.E != null && p12.f41384e0 != null && p12.P1()) {
                        hc hcVar = new hc(p12.f41384e0, new di.b());
                        if (!TextUtils.isEmpty(str)) {
                            M0 = id.a0(null, null, 2131752102, str);
                        } else {
                            M0 = id.M0(2131752103, null);
                        }
                        hcVar.Q(2131624028, 36, M0).j();
                    }
                }
            }
        }
    }

    @Override
    public void k(long j3) {
        ((f2) this.f57654b).presentFragment(an.ra(j3));
        ((d0) this.f57655c).dismiss();
    }

    public void k0(q qVar) {
        if (qVar != null) {
            if (!((Set) this.f57655c).remove(qVar)) {
                Log.w("MediaControllerCompat", "the callback has never been registered");
                return;
            }
            try {
                ((android.support.v4.media.session.h) this.f57654b).b(qVar);
                return;
            } finally {
                qVar.f(null);
            }
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    @Override
    public void l(ai.i0 i0Var) {
        org.telegram.messenger.g0.E2(i0Var);
        ((Runnable) this.f57655c).run();
    }

    public void l0(ArrayList arrayList) {
        i2.r rVar;
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (((i2.q) arrayList.get(i7)).f15208a == 1) {
                try {
                    rVar = new i2.r((i2.q) arrayList.get(i7));
                } catch (i2.p unused) {
                    rVar = null;
                }
                this.f57655c = rVar;
            }
        }
    }

    @Override
    public void m(String str) {
        ((c20) this.f57654b).a(str);
    }

    public void m0(x1 x1Var) {
        Handler handler = (Handler) this.f57654b;
        if (handler != null) {
            handler.post(new a4(24, this, x1Var));
        }
    }

    @Override
    public void n(li.a aVar) {
        p pVar = (p) this.f57655c;
        di diVar = pVar.f39004b;
        f2 f2Var = diVar.W1;
        if (f2Var != null && aVar != null && (aVar.f18392b instanceof TL_iv.pageBlockMap) && org.telegram.messenger.g0.J1(f2Var)) {
            di diVar2 = new di(pVar.getContext(), diVar.W1, false, false, false, null);
            diVar2.T3 = new pb.b(13);
            diVar2.G1 = true;
            diVar2.f32989r3.setVisibility(8);
            diVar2.f32986q4 = new a3.h(pVar, aVar, diVar2, 14);
            diVar2.e1();
            diVar2.show();
        }
    }

    @Override
    public void o(a6 a6Var, String str) {
        p pVar = (p) this.f57655c;
        if (pVar.f18762w == null) {
            f6 f6Var = (f6) this.f57654b;
            pVar.f18762w = new ga.d(new ab.g(22, this, f6Var), f6Var);
        }
        pVar.f18762w.k(a6Var, str);
    }

    @Override
    public void onComplete(Task task) {
        boolean z9;
        boolean z10;
        g6.b bVar;
        boolean z11;
        String str;
        com.google.android.gms.internal.cast.p pVar = (com.google.android.gms.internal.cast.p) this.f57654b;
        g6.b bVar2 = (g6.b) this.f57655c;
        x xVar = pVar.f6939c;
        j6.b bVar3 = com.google.android.gms.internal.cast.p.f6938j;
        if (task.isSuccessful()) {
            Bundle bundle = (Bundle) task.getResult();
            if (bundle != null && bundle.containsKey("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED")) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (true != z11) {
                str = "not existed";
            } else {
                str = "existed";
            }
            bVar3.b("The module-to-client output switcher flag %s", str);
            if (z11) {
                z9 = bundle.getBoolean("com.google.android.gms.cast.FLAG_OUTPUT_SWITCHER_ENABLED");
                Log.i(bVar3.f16508a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z9), Boolean.valueOf(bVar2.f13541y)));
                if (!z9 && bVar2.f13541y) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (xVar == null && (bVar = pVar.d) != null) {
                    boolean z12 = bVar.f13539w;
                    boolean z13 = bVar.f13538s;
                    y yVar = new y();
                    int i7 = Build.VERSION.SDK_INT;
                    if (i7 >= 30) {
                        yVar.f54924b = z10;
                    }
                    if (i7 >= 30) {
                        yVar.d = z12;
                    }
                    if (i7 >= 30) {
                        yVar.f54925c = z13;
                    }
                    x.i(new z(yVar));
                    Log.i(bVar3.f16508a, bVar3.d("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(pVar.f6942i), Boolean.valueOf(z10), Boolean.valueOf(z12), Boolean.valueOf(z13)));
                    if (z12) {
                        com.google.android.gms.internal.cast.s sVar = pVar.f6941f;
                        q6.m.g(sVar);
                        com.google.android.gms.internal.cast.o oVar = new com.google.android.gms.internal.cast.o(sVar);
                        x.b();
                        x.c().f54791f = oVar;
                        a2.a(com.google.android.gms.internal.cast.a1.CAST_TRANSFER_TO_LOCAL_ENABLED);
                        return;
                    }
                    return;
                }
            }
        }
        z9 = true;
        Log.i(bVar3.f16508a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z9), Boolean.valueOf(bVar2.f13541y)));
        if (!z9) {
        }
        z10 = false;
        if (xVar == null) {
        }
    }

    @Override
    public void onContentChanged() {
        p pVar = (p) this.f57655c;
        y3 y3Var = pVar.f18761s;
        if (y3Var != null) {
            y3Var.setSendLoading(pVar.f18760r.p3());
        }
        pVar.a0(true);
        pVar.d0();
        li.d dVar = pVar.P;
        org.telegram.messenger.g0.r(dVar);
        org.telegram.messenger.g0.i3(dVar, 1000L);
    }

    @Override
    public void p(f fVar, String str) {
        Log.d("CAST_SESSION", "onSessionResuming " + ((g6.c) fVar).a() + " " + str);
    }

    @Override
    public void q() {
        y3 y3Var = ((p) this.f57655c).f18761s;
        if (y3Var != null) {
            int i7 = y3Var.f19000a0;
            if (i7 == 2) {
                i7 = 0;
            }
            y3Var.f19002b0 = i7;
            y3Var.e(false, false);
            y3Var.g(2, true);
        }
    }

    @Override
    public void r(g1 g1Var, boolean z9) {
        ((p) this.f57655c).f39004b.h1(g1Var, z9);
    }

    @Override
    public void s(f fVar) {
        g6.c cVar = (g6.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarting " + cVar.a());
        j0(cVar);
    }

    @Override
    public void t(f fVar) {
        Log.d("CAST_SESSION", "onSessionEnding " + ((g6.c) fVar).a());
    }

    public String toString() {
        switch (this.f57653a) {
            case 7:
                try {
                    if (((cc.b) this.f57655c) == null) {
                        this.f57655c = ((cc.g) this.f57654b).a();
                    }
                    return ((cc.b) this.f57655c).toString();
                } catch (bc.e unused) {
                    return "";
                }
            default:
                return super.toString();
        }
    }

    @Override
    public void u() {
        d0 d0Var = (d0) this.f57655c;
        d0Var.f15511s1.d.f37190f3.O(true);
        d0Var.f15510r1.d.f37190f3.O(true);
    }

    @Override
    public void v(String str, long j3, long j10, long j11) {
        n nVar = (n) this.f57654b;
        if (nVar != null) {
            nVar.v(str, j3, j10, j11);
        }
    }

    @Override
    public void x() {
        p pVar = (p) this.f57655c;
        if (pVar.getCurrentItemTop() != pVar.I) {
            pVar.f39004b.M1(pVar, 0);
        }
        pVar.f0();
        p.O(pVar);
    }

    @Override
    public void y(int i7) {
        p pVar = (p) this.f57655c;
        pVar.f39004b.M1(pVar, i7);
        pVar.f0();
        p.O(pVar);
    }

    @Override
    public void z(q3 q3Var, View view) {
        p pVar = (p) this.f57655c;
        k60 k60Var = new k60(pVar, (f6) this.f57654b, view, false, false, true);
        k60Var.Q = true;
        pVar.H = h4.c(k60Var, pVar.f39004b.W1, pVar.getContext(), (f6) this.f57654b, q3Var, true);
    }

    @Override
    public Object zzp() {
        boolean z9;
        Map map;
        com.google.android.gms.internal.clearcut.d dVar = (com.google.android.gms.internal.clearcut.d) this.f57654b;
        com.google.android.gms.internal.clearcut.b bVar = (com.google.android.gms.internal.clearcut.b) this.f57655c;
        bVar.getClass();
        if (com.google.android.gms.internal.clearcut.d.e()) {
            z9 = ((Boolean) com.google.android.gms.internal.clearcut.d.c(new com.google.android.gms.internal.clearcut.e("gms:phenotype:phenotype_flag:debug_disable_caching", 0))).booleanValue();
        } else {
            z9 = false;
        }
        if (z9) {
            map = bVar.b();
        } else {
            map = bVar.f7110e;
        }
        if (map == null) {
            synchronized (bVar.d) {
                try {
                    Map map2 = bVar.f7110e;
                    map = map2;
                    if (map2 == null) {
                        HashMap b10 = bVar.b();
                        bVar.f7110e = b10;
                        map = b10;
                    }
                } finally {
                }
            }
        }
        if (map == null) {
            map = Collections.EMPTY_MAP;
        }
        return (String) map.get(dVar.f7139b);
    }

    public b(int i7, boolean z9) {
        this.f57653a = i7;
    }

    public b(Object obj, int i7) {
        this.f57653a = i7;
        this.f57654b = obj;
    }

    public b(Object obj, Object obj2, boolean z9, int i7) {
        this.f57653a = i7;
        this.f57655c = obj;
        this.f57654b = obj2;
    }

    public b(l8.e eVar) {
        this.f57653a = 26;
        new HashMap();
        q6.m.g(eVar);
        this.f57654b = eVar;
    }

    public b(p6.a aVar) {
        this.f57653a = 22;
        this.f57654b = aVar == null ? null : aVar.f53480b;
    }

    public b(i0 i0Var) {
        this.f57653a = 6;
        this.f57654b = i0Var;
        this.f57655c = new CopyOnWriteArrayList();
    }

    public b(int i7) {
        this.f57653a = i7;
        switch (i7) {
            case 13:
                this.f57654b = ByteBuffer.allocateDirect(500);
                return;
            case 24:
                this.f57654b = new HashMap();
                return;
            default:
                g6.a c10 = g6.a.c(t0.f25566b);
                v0.j jVar = new v0.j(13);
                c10.getClass();
                q6.m.d("Must be called from the main thread.");
                g6.g gVar = c10.f13523c;
                gVar.getClass();
                try {
                    g6.y yVar = gVar.f13560a;
                    g6.j jVar2 = new g6.j(jVar);
                    Parcel p12 = yVar.p1();
                    t.d(p12, jVar2);
                    yVar.t1(p12, 4);
                } catch (RemoteException e10) {
                    g6.g.f13559c.a(e10, "Unable to call %s on %s.", "addCastStateListener", g6.y.class.getSimpleName());
                }
                this.f57654b = new hy0(23, false);
                g6.g b10 = c10.b();
                this.f57655c = b10;
                b10.a(this);
                j0(b10.c());
                return;
        }
    }

    public b(s sVar, SparseArray sparseArray) {
        this.f57653a = 29;
        this.f57654b = sVar;
        SparseBooleanArray sparseBooleanArray = sVar.f10542a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i7 = 0; i7 < sparseBooleanArray.size(); i7++) {
            int a10 = sVar.a(i7);
            m2.a aVar = (m2.a) sparseArray.get(a10);
            aVar.getClass();
            sparseArray2.append(a10, aVar);
        }
        this.f57655c = sparseArray2;
    }

    public b(b0 b0Var, nb.a aVar, androidx.emoji2.text.d dVar) {
        this.f57653a = 5;
        this.f57654b = b0Var;
        this.f57655c = dVar;
    }

    public b(Handler handler, d3.h0 h0Var) {
        this.f57653a = 14;
        if (h0Var != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f57654b = handler;
        this.f57655c = h0Var;
    }

    public b(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.f57653a = 4;
        if (mediaSessionCompat$Token != null) {
            this.f57655c = DesugarCollections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                this.f57654b = new android.support.v4.media.session.h(context, mediaSessionCompat$Token);
                return;
            } else {
                this.f57654b = new android.support.v4.media.session.h(context, mediaSessionCompat$Token);
                return;
            }
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    public b(a1 a1Var) {
        this.f57653a = 16;
        this.f57654b = a1Var;
        this.f57655c = new AtomicBoolean(false);
    }
}
