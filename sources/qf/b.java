package qf;

import ah.h0;
import android.content.Context;
import android.graphics.Bitmap;
import android.media.session.MediaController;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.PowerManager;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.l;
import android.support.v4.media.session.m;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import android.view.View;
import androidx.emoji2.text.o;
import androidx.emoji2.text.v;
import androidx.fragment.app.i0;
import androidx.fragment.app.u;
import androidx.mediarouter.app.q;
import bi.h5;
import bi.q5;
import bi.rb;
import bi.sb;
import c5.g0;
import c5.j;
import c5.p;
import c6.e0;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.d1;
import com.google.android.gms.internal.cast.d2;
import com.google.android.gms.internal.play_billing.b4;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.m3;
import com.google.android.gms.internal.play_billing.p3;
import com.google.android.gms.internal.play_billing.q3;
import com.google.android.gms.internal.play_billing.w3;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.internal.play_billing.y3;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d6.h;
import e2.k0;
import e2.x;
import e9.n0;
import e9.x1;
import g6.n;
import g6.w;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j4.a0;
import j4.b0;
import j4.d0;
import j4.f0;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import ji.c4;
import ji.h1;
import ji.i6;
import ji.k3;
import ji.l4;
import ji.u3;
import ji.v3;
import k2.r;
import kotlin.jvm.internal.i;
import li.k;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.vi;
import org.telegram.ui.Components.zc;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ul0;
import p4.y;
import p4.z;
public class b implements h, OnCompleteListener, g0, s, com.google.android.gms.internal.clearcut.g, ee.b, f6.a, fa.a, g2.g, n, a0, Continuation, v3 {
    public static volatile b d;
    public final int f43354a;
    public Object f43355b;
    public Object f43356c;

    public b(int i10) {
        this.f43354a = i10;
    }

    public static boolean A(Editable editable, KeyEvent keyEvent, boolean z10) {
        v[] vVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (vVarArr = (v[]) editable.getSpans(selectionStart, selectionEnd, v.class)) != null && vVarArr.length > 0) {
                for (v vVar : vVarArr) {
                    int spanStart = editable.getSpanStart(vVar);
                    int spanEnd = editable.getSpanEnd(vVar);
                    if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static b T() {
        b bVar;
        b bVar2 = d;
        if (bVar2 == null) {
            synchronized (b.class) {
                try {
                    bVar = d;
                    if (bVar == null) {
                        bVar = new b();
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

    public static void s(b bVar, boolean z10, boolean z11) {
        synchronized (bVar) {
            boolean z12 = false;
            if (z10) {
                if (((PowerManager.WakeLock) bVar.f43356c) == null) {
                    if (((Context) bVar.f43355b).checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                        e2.a.l("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                        return;
                    }
                    PowerManager powerManager = (PowerManager) ((Context) bVar.f43355b).getSystemService("power");
                    if (powerManager == null) {
                        e2.a.l("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                        return;
                    }
                    PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                    bVar.f43356c = newWakeLock;
                    newWakeLock.setReferenceCounted(false);
                }
            }
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) bVar.f43356c;
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

    public static String x(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
        }
        return null;
    }

    public void B(i2.e eVar) {
        synchronized (eVar) {
        }
        Handler handler = (Handler) this.f43355b;
        if (handler != null) {
            handler.post(new r(this, eVar, 0));
        }
    }

    public void C(androidx.fragment.app.r f7, boolean z10) {
        i.e(f7, "f");
        androidx.fragment.app.r rVar = ((i0) this.f43355b).f1591y;
        if (rVar != null) {
            rVar.p().f1582o.C(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f43356c).iterator();
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
    public void D() {
        ji.r rVar = (ji.r) this.f43356c;
        if (rVar.getCurrentItemTop() != rVar.I) {
            rVar.f27671b.b2(rVar, 0);
        }
        rVar.d0();
        ji.r.N(rVar);
    }

    public void E(androidx.fragment.app.r f7, boolean z10) {
        i.e(f7, "f");
        i0 i0Var = (i0) this.f43355b;
        u uVar = i0Var.f1589w.f1678b;
        androidx.fragment.app.r rVar = i0Var.f1591y;
        if (rVar != null) {
            rVar.p().f1582o.E(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f43356c).iterator();
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

    public void F(androidx.fragment.app.r f7, boolean z10) {
        i.e(f7, "f");
        androidx.fragment.app.r rVar = ((i0) this.f43355b).f1591y;
        if (rVar != null) {
            rVar.p().f1582o.F(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f43356c).iterator();
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
    public void G(int i10) {
        ji.r rVar = (ji.r) this.f43356c;
        rVar.f27671b.b2(rVar, i10);
        rVar.d0();
        ji.r.N(rVar);
    }

    public void H(androidx.fragment.app.r f7, boolean z10) {
        i.e(f7, "f");
        androidx.fragment.app.r rVar = ((i0) this.f43355b).f1591y;
        if (rVar != null) {
            rVar.p().f1582o.H(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f43356c).iterator();
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

    public void I(androidx.fragment.app.r f7, boolean z10) {
        i.e(f7, "f");
        androidx.fragment.app.r rVar = ((i0) this.f43355b).f1591y;
        if (rVar != null) {
            rVar.p().f1582o.I(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f43356c).iterator();
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

    public void J(androidx.fragment.app.r f7, boolean z10) {
        i.e(f7, "f");
        androidx.fragment.app.r rVar = ((i0) this.f43355b).f1591y;
        if (rVar != null) {
            rVar.p().f1582o.J(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f43356c).iterator();
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

    public void K(androidx.fragment.app.r f7, boolean z10) {
        i.e(f7, "f");
        i0 i0Var = (i0) this.f43355b;
        u uVar = i0Var.f1589w.f1678b;
        androidx.fragment.app.r rVar = i0Var.f1591y;
        if (rVar != null) {
            rVar.p().f1582o.K(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f43356c).iterator();
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

    public void L(androidx.fragment.app.r f7, boolean z10) {
        i.e(f7, "f");
        androidx.fragment.app.r rVar = ((i0) this.f43355b).f1591y;
        if (rVar != null) {
            rVar.p().f1582o.L(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f43356c).iterator();
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

    public void M(androidx.fragment.app.r f7, boolean z10) {
        i.e(f7, "f");
        androidx.fragment.app.r rVar = ((i0) this.f43355b).f1591y;
        if (rVar != null) {
            rVar.p().f1582o.M(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f43356c).iterator();
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
    public void N(ji.a aVar) {
        ji.r rVar = (ji.r) this.f43356c;
        vi viVar = rVar.f27671b;
        m2 m2Var = viVar.f30001f0;
        if (m2Var != null && aVar != null && (aVar.f13103b instanceof TL_iv.pageBlockMap) && AndroidUtilities.isMapsInstalled(m2Var)) {
            vi viVar2 = new vi(rVar.getContext(), viVar.f30001f0, false, false, false, null);
            viVar2.f29993c2 = new t7.u(11);
            viVar2.P = true;
            viVar2.A1.setVisibility(8);
            viVar2.f30056w2 = new androidx.car.app.utils.a(rVar, aVar, viVar2, 10);
            viVar2.t1();
            viVar2.show();
        }
    }

    public void O(androidx.fragment.app.r f7, Bundle bundle, boolean z10) {
        i.e(f7, "f");
        androidx.fragment.app.r rVar = ((i0) this.f43355b).f1591y;
        if (rVar != null) {
            rVar.p().f1582o.O(f7, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f43356c).iterator();
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

    public void P(androidx.fragment.app.r f7, boolean z10) {
        i.e(f7, "f");
        androidx.fragment.app.r rVar = ((i0) this.f43355b).f1591y;
        if (rVar != null) {
            rVar.p().f1582o.P(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f43356c).iterator();
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

    public void Q(androidx.fragment.app.r f7, boolean z10) {
        i.e(f7, "f");
        androidx.fragment.app.r rVar = ((i0) this.f43355b).f1591y;
        if (rVar != null) {
            rVar.p().f1582o.Q(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f43356c).iterator();
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

    public void R(androidx.fragment.app.r f7, boolean z10) {
        i.e(f7, "f");
        androidx.fragment.app.r rVar = ((i0) this.f43355b).f1591y;
        if (rVar != null) {
            rVar.p().f1582o.R(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f43356c).iterator();
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

    public gb.o S(lb.a r7) {
        throw new UnsupportedOperationException("Method not decompiled: qf.b.S(lb.a):gb.o");
    }

    public m U() {
        MediaController.TransportControls transportControls = ((android.support.v4.media.session.h) this.f43355b).f991a.getTransportControls();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            return new l(transportControls);
        }
        if (i10 >= 24) {
            return new l(transportControls);
        }
        return new l(transportControls);
    }

    public boolean V(CharSequence charSequence, int i10, int i11, o oVar) {
        int i12;
        if (oVar.f1501c == 0) {
            androidx.emoji2.text.h hVar = (androidx.emoji2.text.h) this.f43356c;
            p1.a b10 = oVar.b();
            int a2 = b10.a(8);
            if (a2 != 0) {
                ((ByteBuffer) b10.d).getShort(a2 + b10.f42830a);
            }
            androidx.emoji2.text.d dVar = (androidx.emoji2.text.d) hVar;
            dVar.getClass();
            ThreadLocal threadLocal = androidx.emoji2.text.d.f1477b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb2 = (StringBuilder) threadLocal.get();
            sb2.setLength(0);
            while (i10 < i11) {
                sb2.append(charSequence.charAt(i10));
                i10++;
            }
            TextPaint textPaint = dVar.f1478a;
            String sb3 = sb2.toString();
            int i13 = i0.c.f10891a;
            if (textPaint.hasGlyph(sb3)) {
                i12 = 2;
            } else {
                i12 = 1;
            }
            oVar.f1501c = i12;
        }
        if (oVar.f1501c != 2) {
            return false;
        }
        return true;
    }

    public boolean W() {
        if (((a) ((k) this.f43355b).d) != null) {
            return true;
        }
        return false;
    }

    @Override
    public void X() {
        c4 c4Var = ((ji.r) this.f43356c).f13484s;
        if (c4Var != null) {
            int i10 = 0;
            c4Var.e(false, true);
            int i11 = c4Var.f13176b0;
            if (i11 != 2) {
                i10 = i11;
            }
            c4Var.f(i10, true);
        }
    }

    @Override
    public m80 Y(View view) {
        ji.r rVar = (ji.r) this.f43356c;
        m80 m80Var = new m80(rVar, (c6) this.f43355b, view, false, false, true);
        rVar.H = m80Var;
        return m80Var;
    }

    public void Z(boolean z10, boolean z11, float f7) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f43355b;
        h5 h5Var = (h5) this.f43356c;
        sb sbVar = h5Var.e;
        sb.B1 = f7;
        rb rbVar = sbVar.f3716z0;
        if (rbVar != null) {
            rbVar.setSpeed(f7);
        }
        q5.a0(h5Var.f3122l, z10);
        if (z11 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
        }
    }

    @Override
    public void a(x xVar) {
        d0 d0Var = (d0) this.f43356c;
        SparseArray sparseArray = d0Var.h;
        a4.g gVar = (a4.g) this.f43355b;
        if (xVar.A() == 0 && (xVar.A() & 128) != 0) {
            xVar.O(6);
            int a2 = xVar.a() / 4;
            for (int i10 = 0; i10 < a2; i10++) {
                xVar.k(0, 4, gVar.f260b);
                gVar.m(0);
                int g10 = gVar.g(16);
                gVar.o(3);
                if (g10 == 0) {
                    gVar.o(13);
                } else {
                    int g11 = gVar.g(13);
                    if (sparseArray.get(g11) == null) {
                        sparseArray.put(g11, new b0(new e0.g0(d0Var, g11)));
                        d0Var.f12610n++;
                    }
                }
            }
            if (d0Var.f12600a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    public void a0(q qVar) {
        if (qVar != null) {
            if (!((Set) this.f43356c).add(qVar)) {
                Log.w("MediaControllerCompat", "the callback has already been registered");
                return;
            }
            Handler handler = new Handler();
            qVar.f(handler);
            android.support.v4.media.session.h hVar = (android.support.v4.media.session.h) this.f43355b;
            hVar.f991a.registerCallback(qVar.f1941a, handler);
            synchronized (hVar.f992b) {
                if (hVar.e.a() != null) {
                    android.support.v4.media.session.g gVar = new android.support.v4.media.session.g(qVar);
                    hVar.d.put(qVar, gVar);
                    qVar.f1943c = gVar;
                    try {
                        hVar.e.a().o(gVar);
                        qVar.e(13, null, null);
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                    }
                } else {
                    qVar.f1943c = null;
                    hVar.f993c.add(qVar);
                }
            }
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    @Override
    public void accept(Object obj, Object obj2) {
        boolean z10;
        e0 e0Var = (e0) this.f43355b;
        String str = (String) this.f43356c;
        w wVar = (w) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        if (e0Var.F == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        n6.l.j("Not connected to device", z10);
        g6.f fVar = (g6.f) wVar.u();
        Parcel N0 = fVar.N0();
        N0.writeString(str);
        fVar.S0(N0, 5);
        synchronized (e0Var.f4473s) {
            try {
                if (e0Var.f4470p != null) {
                    taskCompletionSource.setException(n6.l.m(new Status(2001, null, null, null)));
                } else {
                    e0Var.f4470p = taskCompletionSource;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public void b0() {
        ji.r rVar = (ji.r) this.f43356c;
        rVar.a0();
        rVar.b0();
    }

    @Override
    public boolean c(float r6) {
        throw new UnsupportedOperationException("Method not decompiled: qf.b.c(float):boolean");
    }

    @Override
    public void c0(h1 h1Var, boolean z10) {
        ((ji.r) this.f43356c).f27671b.w1(h1Var, z10);
    }

    @Override
    public g2.h createDataSource() {
        return new g2.n((Context) this.f43355b, ((g2.o) this.f43356c).createDataSource());
    }

    @Override
    public void d(d6.f fVar, String str) {
        Log.d("CAST_SESSION", "onSessionResuming " + ((d6.c) fVar).a() + " " + str);
    }

    public void d0(g gVar) {
        d dVar;
        g gVar2;
        Log.d("CAST_CONTROLLER", "set current media");
        k kVar = (k) this.f43355b;
        g gVar3 = (g) kVar.f14821c;
        if (b5.d.u()) {
            if (gVar3 != null || gVar != null) {
                if (gVar3 != null) {
                    ArrayList arrayList = gVar3.f43376a;
                    if (gVar != null && arrayList.size() == gVar.f43376a.size()) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            f a2 = gVar3.a(i10);
                            f a10 = gVar.a(i10);
                            if ((a2 == null && a10 == null) || (a2 != null && a10 != null && Objects.equals(a2.f43372a, a10.f43372a) && Objects.equals(a2.f43373b, a10.f43373b) && Objects.equals(a2.f43374c, a10.f43374c) && Objects.equals(a2.d, a10.d) && a2.e == a10.e && a2.f43375f == a10.f43375f)) {
                            }
                        }
                        return;
                    }
                }
            } else {
                return;
            }
        }
        if (((a) kVar.d) != null && gVar != null) {
            kVar.l(gVar);
        }
        if (((a) kVar.d) != null && (gVar2 = (g) kVar.f14821c) != null) {
            kVar.S(gVar2);
        }
        if (gVar != null && gVar.f43376a.size() > 0 && !gVar.a(0).f43372a.startsWith("audio/") && (dVar = (d) kVar.f14820b) != null) {
            dVar.l(null, null);
        }
        a aVar = (a) kVar.d;
        if (aVar != null && gVar != null) {
            aVar.d = gVar;
            aVar.f43353g = 0;
            aVar.h = 0;
            aVar.p();
        }
        kVar.f14821c = gVar;
    }

    @Override
    public void e(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionStartFailed " + ((d6.c) fVar).a() + " " + i10);
    }

    public void e0(p pVar) {
        this.f43355b = pVar;
        if (pVar.a() != null) {
            pVar.a().getClass();
            String str = pVar.a().d;
            if (str != null) {
                this.f43356c = str;
            }
        }
    }

    @Override
    public void f(d6.f fVar, boolean z10) {
        Log.d("CAST_SESSION", "onSessionResumed " + ((d6.c) fVar).a() + " " + z10);
    }

    public void f0(d6.c cVar) {
        String str;
        String string;
        k kVar = (k) this.f43355b;
        if (cVar != null) {
            n6.l.e("Must be called from the main thread.");
            e6.h hVar = cVar.f6398j;
            String a2 = cVar.a();
            if (!TextUtils.isEmpty(a2) && hVar != null) {
                a aVar = (a) kVar.d;
                if (aVar == null || !TextUtils.equals(aVar.f43351c.a(), a2)) {
                    kVar.V(new a(cVar, (d6.g) this.f43356c, hVar));
                    n6.l.e("Must be called from the main thread.");
                    CastDevice castDevice = cVar.f6399k;
                    if (castDevice != null) {
                        str = castDevice.d;
                    } else {
                        str = null;
                    }
                    PhotoViewer t12 = PhotoViewer.t1();
                    d.i();
                    if (t12.E != null && t12.f32226e0 != null && t12.R1()) {
                        zc zcVar = new zc(t12.f32226e0, new bi.b());
                        int i10 = R.raw.forward;
                        if (!TextUtils.isEmpty(str)) {
                            string = LocaleController.formatString(R.string.ChromecastStartedTo, str);
                        } else {
                            string = LocaleController.getString(R.string.ChromecastStarted);
                        }
                        zcVar.Q(i10, 36, string).j();
                    }
                }
            }
        }
    }

    @Override
    public java.lang.Object g(ee.c r6, md.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: qf.b.g(ee.c, md.c):java.lang.Object");
    }

    public void g0(q qVar) {
        if (qVar != null) {
            if (!((Set) this.f43356c).remove(qVar)) {
                Log.w("MediaControllerCompat", "the callback has never been registered");
                return;
            }
            try {
                ((android.support.v4.media.session.h) this.f43355b).b(qVar);
                return;
            } finally {
                qVar.f(null);
            }
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    @Override
    public void h(u3 u3Var, View view) {
        ji.r rVar = (ji.r) this.f43356c;
        m80 m80Var = new m80(rVar, (c6) this.f43355b, view, false, false, true);
        m80Var.Q = true;
        rVar.H = l4.c(m80Var, rVar.f27671b.f30001f0, rVar.getContext(), (c6) this.f43355b, u3Var, true);
    }

    public void h0(g3 g3Var) {
        try {
            p0(g3Var, (q3) this.f43355b);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void i(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionEnded " + ((d6.c) fVar).a() + " " + i10);
        ((k) this.f43355b).V(null);
    }

    public void i0(g3 g3Var, int i10, long j10) {
        try {
            p3 p3Var = (p3) ((q3) this.f43355b).g();
            p3Var.c();
            q3.p((q3) p3Var.f5764b, i10);
            q3 q3Var = (q3) p3Var.a();
            this.f43355b = q3Var;
            if (j10 != 0) {
                p3 p3Var2 = (p3) q3Var.g();
                p3Var2.c();
                q3.r((q3) p3Var2.f5764b, j10);
                q3Var = (q3) p3Var2.a();
            }
            p0(g3Var, q3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void j(String str, long j10, long j11, long j12) {
        n nVar = (n) this.f43355b;
        if (nVar != null) {
            nVar.j(str, j10, j11, j12);
        }
    }

    public void j0(g3 g3Var, long j10, boolean z10) {
        q3 q3Var;
        try {
            f3 f3Var = (f3) g3Var.g();
            com.google.android.gms.internal.play_billing.u3 u3Var = (com.google.android.gms.internal.play_billing.u3) g3Var.o().g();
            u3Var.c();
            w3.n((w3) u3Var.f5764b, z10);
            f3Var.c();
            g3.r((g3) f3Var.f5764b, (w3) u3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j10 == 0) {
                q3Var = (q3) this.f43355b;
            } else {
                p3 p3Var = (p3) ((q3) this.f43355b).g();
                p3Var.c();
                q3.r((q3) p3Var.f5764b, j10);
                q3Var = (q3) p3Var.a();
            }
            p0(g3Var2, q3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void k(d6.f fVar) {
        d6.c cVar = (d6.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarting " + cVar.a());
        f0(cVar);
    }

    public void k0(g3 g3Var, int i10, long j10, boolean z10) {
        q3 q3Var;
        try {
            p3 p3Var = (p3) ((q3) this.f43355b).g();
            p3Var.c();
            q3.p((q3) p3Var.f5764b, i10);
            this.f43355b = (q3) p3Var.a();
            f3 f3Var = (f3) g3Var.g();
            com.google.android.gms.internal.play_billing.u3 u3Var = (com.google.android.gms.internal.play_billing.u3) g3Var.o().g();
            u3Var.c();
            w3.n((w3) u3Var.f5764b, z10);
            f3Var.c();
            g3.r((g3) f3Var.f5764b, (w3) u3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j10 == 0) {
                q3Var = (q3) this.f43355b;
            } else {
                p3 p3Var2 = (p3) ((q3) this.f43355b).g();
                p3Var2.c();
                q3.r((q3) p3Var2.f5764b, j10);
                q3Var = (q3) p3Var2.a();
            }
            p0(g3Var2, q3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void l(ji.w3 w3Var, View view) {
        ji.r rVar = (ji.r) this.f43356c;
        m80 m80Var = new m80(rVar, (c6) this.f43355b, view, false, false, true);
        m80Var.Q = true;
        m2 m2Var = rVar.f27671b.f30001f0;
        rVar.getContext();
        rVar.H = l4.b(m80Var, m2Var, w3Var, true);
    }

    public void l0(m3 m3Var) {
        try {
            x3 t10 = y3.t();
            t10.d((q3) this.f43355b);
            t10.c();
            y3.p((y3) t10.f5764b, m3Var);
            ((b2.u) this.f43356c).i((y3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void m(int i10) {
        ji.r.R((ji.r) this.f43356c, 74, i10);
    }

    @Override
    public void m0(i6 i6Var, String str) {
        ji.r rVar = (ji.r) this.f43356c;
        if (rVar.v == null) {
            c6 c6Var = (c6) this.f43355b;
            rVar.v = new m.q3(new h0(20, this, c6Var), c6Var);
        }
        rVar.v.f(i6Var, str);
    }

    @Override
    public void n(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionResumeFailed " + ((d6.c) fVar).a() + " " + i10);
    }

    public void n0(b4 b4Var) {
        try {
            x3 t10 = y3.t();
            t10.d((q3) this.f43355b);
            t10.c();
            y3.r((y3) t10.f5764b, b4Var);
            ((b2.u) this.f43356c).i((y3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void o() {
        int i10;
        ji.r rVar = (ji.r) this.f43356c;
        ji.x3 x3Var = rVar.f13483r;
        c4 c4Var = rVar.f13484s;
        if (c4Var != null) {
            k3 k3Var = x3Var.f13639l3;
            if (k3Var != null && k3Var.x() && x3Var.D4()) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            if (c4Var.f13174a0 == 2) {
                c4Var.f13176b0 = i10;
            } else {
                c4Var.f(i10, true);
            }
            if (i10 != 0) {
                rVar.Z();
            }
        }
        rVar.c0();
    }

    public void o0(com.google.android.gms.internal.play_billing.c4 c4Var) {
        if (c4Var == null) {
            return;
        }
        try {
            x3 t10 = y3.t();
            t10.d((q3) this.f43355b);
            t10.c();
            y3.s((y3) t10.f5764b, c4Var);
            ((b2.u) this.f43356c).i((y3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void onComplete(Task task) {
        boolean z10;
        boolean z11;
        d6.b bVar;
        boolean z12;
        String str;
        switch (this.f43354a) {
            case 2:
                a9.e eVar = (a9.e) this.f43355b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f43356c;
                synchronized (eVar.f326f) {
                    eVar.e.remove(taskCompletionSource);
                }
                return;
            default:
                com.google.android.gms.internal.cast.r rVar = (com.google.android.gms.internal.cast.r) this.f43355b;
                d6.b bVar2 = (d6.b) this.f43356c;
                y yVar = rVar.f5306c;
                g6.b bVar3 = com.google.android.gms.internal.cast.r.f5305j;
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
                        Log.i(bVar3.f9934a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.f6390x)));
                        if (!z10 && bVar2.f6390x) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (yVar == null && (bVar = rVar.d) != null) {
                            boolean z13 = bVar.v;
                            boolean z14 = bVar.f6388s;
                            z zVar = new z();
                            int i10 = Build.VERSION.SDK_INT;
                            if (i10 >= 30) {
                                zVar.f43143b = z11;
                            }
                            if (i10 >= 30) {
                                zVar.d = z13;
                            }
                            if (i10 >= 30) {
                                zVar.f43144c = z14;
                            }
                            y.i(new p4.a0(zVar));
                            Log.i(bVar3.f9934a, bVar3.d("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(rVar.f5308i), Boolean.valueOf(z11), Boolean.valueOf(z13), Boolean.valueOf(z14)));
                            if (z13) {
                                com.google.android.gms.internal.cast.u uVar = rVar.f5307f;
                                n6.l.h(uVar);
                                com.google.android.gms.internal.cast.q qVar = new com.google.android.gms.internal.cast.q(uVar);
                                y.b();
                                y.c().f43011f = qVar;
                                d2.a(d1.CAST_TRANSFER_TO_LOCAL_ENABLED);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                z10 = true;
                Log.i(bVar3.f9934a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.f6390x)));
                if (!z10) {
                }
                z11 = false;
                if (yVar == null) {
                    return;
                }
                return;
        }
    }

    @Override
    public void onContentChanged() {
        ji.r rVar = (ji.r) this.f43356c;
        c4 c4Var = rVar.f13484s;
        if (c4Var != null) {
            c4Var.setSendLoading(rVar.f13483r.n3());
        }
        rVar.Y(true);
        rVar.b0();
        ji.d dVar = rVar.P;
        AndroidUtilities.cancelRunOnUIThread(dVar);
        AndroidUtilities.runOnUIThread(dVar, 1000L);
    }

    @Override
    public void p(d6.f fVar) {
        Log.d("CAST_SESSION", "onSessionEnding " + ((d6.c) fVar).a());
    }

    public void p0(g3 g3Var, q3 q3Var) {
        if (g3Var == null) {
            return;
        }
        try {
            x3 t10 = y3.t();
            t10.d(q3Var);
            t10.c();
            y3.n((y3) t10.f5764b, g3Var);
            ((b2.u) this.f43356c).i((y3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void q(d6.f fVar, String str) {
        d6.c cVar = (d6.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarted " + cVar.a() + " " + str);
        f0(cVar);
    }

    public void q0(i3 i3Var, q3 q3Var) {
        try {
            x3 t10 = y3.t();
            t10.d(q3Var);
            t10.c();
            y3.o((y3) t10.f5764b, i3Var);
            ((b2.u) this.f43356c).i((y3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void r(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionStartSuspended " + ((d6.c) fVar).a() + " " + i10);
    }

    @Override
    public StackTraceElement[] s0(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        fa.a[] aVarArr = (fa.a[]) this.f43355b;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i10 = 0; i10 < 1; i10++) {
            fa.a aVar = aVarArr[i10];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = aVar.s0(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > 1024) {
            return ((rb.b) this.f43356c).s0(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }

    @Override
    public void t(Bitmap bitmap) {
        n4.s sVar = (n4.s) this.f43355b;
        sVar.f16032c = bitmap;
        f6.f fVar = (f6.f) this.f43356c;
        fVar.f9032l = sVar;
        fVar.b();
    }

    @Override
    public Object then(Task task) {
        j6.a aVar = (j6.a) this.f43355b;
        Bundle bundle = (Bundle) this.f43356c;
        aVar.getClass();
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        if (bundle2 != null && bundle2.containsKey("google.messenger")) {
            return aVar.a(bundle).onSuccessTask(j6.m.f12875a, j6.b.f12856b);
        }
        return task;
    }

    public String toString() {
        switch (this.f43354a) {
            case 22:
                return ((HashMap) this.f43355b).toString();
            default:
                return super.toString();
        }
    }

    @Override
    public void u() {
        c4 c4Var = ((ji.r) this.f43356c).f13484s;
        if (c4Var != null) {
            int i10 = c4Var.f13174a0;
            if (i10 == 2) {
                i10 = 0;
            }
            c4Var.f13176b0 = i10;
            c4Var.e(false, false);
            c4Var.f(2, true);
        }
    }

    @Override
    public void v(String str, long j10, int i10, Object obj, long j11, long j12) {
        ((g6.m) this.f43356c).f9944g = null;
        n nVar = (n) this.f43355b;
        if (nVar != null) {
            nVar.v(str, j10, i10, obj, j11, j12);
        }
    }

    public c5.e w() {
        if (((p) this.f43355b) != null) {
            return new c5.e(this);
        }
        throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
    }

    public void y() {
        this.f43355b = null;
        this.f43356c = null;
    }

    public boolean z(int i10) {
        return ((b2.v) this.f43355b).f2443a.get(i10);
    }

    @Override
    public Object zzp() {
        boolean z10;
        Map map;
        com.google.android.gms.internal.clearcut.d dVar = (com.google.android.gms.internal.clearcut.d) this.f43355b;
        com.google.android.gms.internal.clearcut.b bVar = (com.google.android.gms.internal.clearcut.b) this.f43356c;
        bVar.getClass();
        if (com.google.android.gms.internal.clearcut.d.e()) {
            z10 = ((Boolean) com.google.android.gms.internal.clearcut.d.c(new j("gms:phenotype:phenotype_flag:debug_disable_caching"))).booleanValue();
        } else {
            z10 = false;
        }
        if (z10) {
            map = bVar.b();
        } else {
            map = bVar.e;
        }
        if (map == null) {
            synchronized (bVar.d) {
                try {
                    Map map2 = bVar.e;
                    map = map2;
                    if (map2 == null) {
                        HashMap b10 = bVar.b();
                        bVar.e = b10;
                        map = b10;
                    }
                } finally {
                }
            }
        }
        if (map == null) {
            map = Collections.EMPTY_MAP;
        }
        return (String) map.get(dVar.f5460b);
    }

    public b(int i10, Object obj, Object obj2) {
        this.f43354a = i10;
        this.f43355b = obj;
        this.f43356c = obj2;
    }

    public b(Object obj, Object obj2, boolean z10, int i10) {
        this.f43354a = i10;
        this.f43356c = obj;
        this.f43355b = obj2;
    }

    public b(Context context, q3 q3Var) {
        this.f43354a = 10;
        b2.u uVar = new b2.u(1);
        try {
            l5.s.b(context);
            uVar.f2397c = l5.s.a().c(j5.a.e).a("PLAY_BILLING_LIBRARY", new i5.c("proto"), new sb.a(4));
        } catch (Throwable unused) {
            uVar.f2396b = true;
        }
        this.f43356c = uVar;
        this.f43355b = q3Var;
    }

    public b(i0 i0Var) {
        this.f43354a = 6;
        this.f43355b = i0Var;
        this.f43356c = new CopyOnWriteArrayList();
    }

    public b(fa.a[] aVarArr) {
        this.f43354a = 19;
        this.f43355b = aVarArr;
        this.f43356c = new rb.b(8);
    }

    public b() {
        this.f43354a = 0;
        d6.a c10 = d6.a.c(ApplicationLoader.applicationContext);
        ul0 ul0Var = new ul0(21);
        c10.getClass();
        n6.l.e("Must be called from the main thread.");
        d6.g gVar = c10.f6375c;
        gVar.getClass();
        try {
            d6.y yVar = gVar.f6407a;
            d6.j jVar = new d6.j(ul0Var);
            Parcel N0 = yVar.N0();
            com.google.android.gms.internal.cast.v.d(N0, jVar);
            yVar.R0(N0, 4);
        } catch (RemoteException e) {
            d6.g.f6406c.a(e, "Unable to call %s on %s.", "addCastStateListener", d6.y.class.getSimpleName());
        }
        this.f43355b = new k(24, false);
        d6.g b10 = c10.b();
        this.f43356c = b10;
        b10.a(this);
        f0(b10.c());
    }

    public b(b2.v vVar, SparseArray sparseArray) {
        this.f43354a = 25;
        this.f43355b = vVar;
        SparseBooleanArray sparseBooleanArray = vVar.f2443a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
            int a2 = vVar.a(i10);
            j2.a aVar = (j2.a) sparseArray.get(a2);
            aVar.getClass();
            sparseArray2.append(a2, aVar);
        }
        this.f43356c = sparseArray2;
    }

    public b(qi.e eVar, rb.b bVar, androidx.emoji2.text.d dVar) {
        this.f43354a = 5;
        this.f43355b = eVar;
        this.f43356c = dVar;
    }

    public b(Context context, int i10) {
        this.f43354a = i10;
        switch (i10) {
            case 20:
                g2.o oVar = new g2.o();
                this.f43355b = context.getApplicationContext();
                this.f43356c = oVar;
                return;
            default:
                this.f43355b = context;
                return;
        }
    }

    public b(Handler handler, k2.u uVar) {
        this.f43354a = 29;
        if (uVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f43355b = handler;
        this.f43356c = uVar;
    }

    public b(ArrayList arrayList, ArrayList arrayList2) {
        this.f43354a = 23;
        int size = arrayList.size();
        this.f43355b = new int[size];
        this.f43356c = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            ((int[]) this.f43355b)[i10] = ((Integer) arrayList.get(i10)).intValue();
            ((float[]) this.f43356c)[i10] = ((Float) arrayList2.get(i10)).floatValue();
        }
    }

    public b(int i10, int i11) {
        this.f43354a = 23;
        this.f43355b = new int[]{i10, i11};
        this.f43356c = new float[]{0.0f, 1.0f};
    }

    public b(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.f43354a = 4;
        if (mediaSessionCompat$Token != null) {
            this.f43356c = DesugarCollections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                this.f43355b = new android.support.v4.media.session.h(context, mediaSessionCompat$Token);
                return;
            } else {
                this.f43355b = new android.support.v4.media.session.h(context, mediaSessionCompat$Token);
                return;
            }
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    @Override
    public void b(k0 k0Var, c3.q qVar, f0 f0Var) {
    }

    public b(int i10, int i11, int i12) {
        this.f43354a = 23;
        this.f43355b = new int[]{i10, i11, i12};
        this.f43356c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public b(a3.f fVar) {
        this.f43354a = 1;
        this.f43356c = fVar;
    }

    public b(x1 x1Var, int[] iArr) {
        this.f43354a = 17;
        this.f43355b = n0.u(x1Var);
        this.f43356c = iArr;
    }

    public b(d0 d0Var) {
        this.f43354a = 26;
        this.f43356c = d0Var;
        this.f43355b = new a4.g(new byte[4], 4);
    }
}
