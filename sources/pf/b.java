package pf;

import a3.i0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.session.MediaController;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.l;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.KeyEvent;
import androidx.emoji2.text.v;
import androidx.fragment.app.r;
import androidx.fragment.app.u;
import b2.x1;
import bi.f5;
import bi.o5;
import bi.ob;
import bi.pb;
import c5.f0;
import c6.e0;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.internal.cast.f1;
import com.google.android.gms.internal.cast.f2;
import com.google.android.gms.internal.cast.q;
import com.google.android.gms.internal.play_billing.a4;
import com.google.android.gms.internal.play_billing.b4;
import com.google.android.gms.internal.play_billing.f3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.i3;
import com.google.android.gms.internal.play_billing.l3;
import com.google.android.gms.internal.play_billing.o3;
import com.google.android.gms.internal.play_billing.p3;
import com.google.android.gms.internal.play_billing.t3;
import com.google.android.gms.internal.play_billing.v3;
import com.google.android.gms.internal.play_billing.w3;
import com.google.android.gms.internal.play_billing.x3;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d6.h;
import d6.j;
import e9.a1;
import e9.g0;
import g2.o;
import g6.n;
import g6.w;
import i2.c0;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j4.a0;
import j4.b0;
import j4.d0;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import ji.g1;
import ji.h0;
import ji.h1;
import ji.j0;
import ji.k0;
import kotlin.jvm.internal.i;
import m2.t;
import n2.p;
import n4.y;
import n7.z0;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.Components.yc;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.sw0;
import p4.x;
import p4.z;
import z3.m;
public class b implements h, f0, s, OnCompleteListener, com.google.android.gms.internal.clearcut.g, cf.b, f6.a, g2.g, n, m, a0, Continuation, g1 {
    public static volatile b d;
    public final int f44045a;
    public Object f44046b;
    public Object f44047c;

    public b(int i10, Object obj, Object obj2) {
        this.f44045a = i10;
        this.f44047c = obj;
        this.f44046b = obj2;
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

    public static b W() {
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

    public void B(i2.h hVar) {
        synchronized (hVar) {
        }
        Handler handler = (Handler) this.f44046b;
        if (handler != null) {
            handler.post(new i0(this, hVar, 1));
        }
    }

    @Override
    public void C(h1 h1Var) {
        ((j0) this.f44046b).g();
    }

    public void D(r f7, boolean z10) {
        i.e(f7, "f");
        r rVar = ((androidx.fragment.app.i0) this.f44046b).f1457y;
        if (rVar != null) {
            rVar.p().f1448o.D(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f44047c).iterator();
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

    public void E(r f7, boolean z10) {
        i.e(f7, "f");
        androidx.fragment.app.i0 i0Var = (androidx.fragment.app.i0) this.f44046b;
        u uVar = i0Var.f1455w.f1552b;
        r rVar = i0Var.f1457y;
        if (rVar != null) {
            rVar.p().f1448o.E(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f44047c).iterator();
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

    public void F(r f7, boolean z10) {
        i.e(f7, "f");
        r rVar = ((androidx.fragment.app.i0) this.f44046b).f1457y;
        if (rVar != null) {
            rVar.p().f1448o.F(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f44047c).iterator();
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

    public void G(r f7, boolean z10) {
        i.e(f7, "f");
        r rVar = ((androidx.fragment.app.i0) this.f44046b).f1457y;
        if (rVar != null) {
            rVar.p().f1448o.G(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f44047c).iterator();
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

    public void H(r f7, boolean z10) {
        i.e(f7, "f");
        r rVar = ((androidx.fragment.app.i0) this.f44046b).f1457y;
        if (rVar != null) {
            rVar.p().f1448o.H(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f44047c).iterator();
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

    public void I(r f7, boolean z10) {
        i.e(f7, "f");
        r rVar = ((androidx.fragment.app.i0) this.f44046b).f1457y;
        if (rVar != null) {
            rVar.p().f1448o.I(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f44047c).iterator();
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

    public void J(r f7, boolean z10) {
        i.e(f7, "f");
        androidx.fragment.app.i0 i0Var = (androidx.fragment.app.i0) this.f44046b;
        u uVar = i0Var.f1455w.f1552b;
        r rVar = i0Var.f1457y;
        if (rVar != null) {
            rVar.p().f1448o.J(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f44047c).iterator();
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

    public void K(r f7, boolean z10) {
        i.e(f7, "f");
        r rVar = ((androidx.fragment.app.i0) this.f44046b).f1457y;
        if (rVar != null) {
            rVar.p().f1448o.K(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f44047c).iterator();
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

    public void L(r f7, boolean z10) {
        i.e(f7, "f");
        r rVar = ((androidx.fragment.app.i0) this.f44046b).f1457y;
        if (rVar != null) {
            rVar.p().f1448o.L(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f44047c).iterator();
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

    public void M(r f7, Bundle bundle, boolean z10) {
        i.e(f7, "f");
        r rVar = ((androidx.fragment.app.i0) this.f44046b).f1457y;
        if (rVar != null) {
            rVar.p().f1448o.M(f7, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f44047c).iterator();
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
    public void N(Editable editable) {
        ((k0) this.f44047c).i();
        ((j0) this.f44046b).P();
    }

    public void O(r f7, boolean z10) {
        i.e(f7, "f");
        r rVar = ((androidx.fragment.app.i0) this.f44046b).f1457y;
        if (rVar != null) {
            rVar.p().f1448o.O(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f44047c).iterator();
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

    public void P(r f7, boolean z10) {
        i.e(f7, "f");
        r rVar = ((androidx.fragment.app.i0) this.f44046b).f1457y;
        if (rVar != null) {
            rVar.p().f1448o.P(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f44047c).iterator();
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

    public void Q(r f7, boolean z10) {
        i.e(f7, "f");
        r rVar = ((androidx.fragment.app.i0) this.f44046b).f1457y;
        if (rVar != null) {
            rVar.p().f1448o.Q(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f44047c).iterator();
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
    public boolean R(boolean z10) {
        return false;
    }

    public com.google.android.datatransport.cct.CctBackendFactory S(java.lang.String r14) {
        throw new UnsupportedOperationException("Method not decompiled: pf.b.S(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    public fb.n T(kb.a r8) {
        throw new UnsupportedOperationException("Method not decompiled: pf.b.T(kb.a):fb.n");
    }

    @Override
    public int U() {
        return 1;
    }

    public dc.b V() {
        if (((dc.b) this.f44047c) == null) {
            dc.f fVar = (dc.f) this.f44046b;
            int[] iArr = fVar.f6709c;
            cc.d dVar = fVar.f6707a;
            int i10 = dVar.f4732a;
            int i11 = dVar.f4733b;
            dc.b bVar = new dc.b(i10, i11);
            if (fVar.f6708b.length < i10) {
                fVar.f6708b = new byte[i10];
            }
            for (int i12 = 0; i12 < 32; i12++) {
                iArr[i12] = 0;
            }
            for (int i13 = 1; i13 < 5; i13++) {
                byte[] b10 = dVar.b((i11 * i13) / 5, fVar.f6708b);
                int i14 = (i10 * 4) / 5;
                for (int i15 = i10 / 5; i15 < i14; i15++) {
                    int i16 = (b10[i15] & 255) >> 3;
                    iArr[i16] = iArr[i16] + 1;
                }
            }
            int length = iArr.length;
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            for (int i20 = 0; i20 < length; i20++) {
                int i21 = iArr[i20];
                if (i21 > i17) {
                    i19 = i20;
                    i17 = i21;
                }
                if (i21 > i18) {
                    i18 = i21;
                }
            }
            int i22 = 0;
            int i23 = 0;
            for (int i24 = 0; i24 < length; i24++) {
                int i25 = i24 - i19;
                int i26 = iArr[i24] * i25 * i25;
                if (i26 > i23) {
                    i22 = i24;
                    i23 = i26;
                }
            }
            if (i19 <= i22) {
                int i27 = i19;
                i19 = i22;
                i22 = i27;
            }
            if (i19 - i22 > length / 16) {
                int i28 = i19 - 1;
                int i29 = i28;
                int i30 = -1;
                while (i28 > i22) {
                    int i31 = i28 - i22;
                    int i32 = (i18 - iArr[i28]) * (i19 - i28) * i31 * i31;
                    if (i32 > i30) {
                        i29 = i28;
                        i30 = i32;
                    }
                    i28--;
                }
                int i33 = i29 << 3;
                byte[] a2 = dVar.a();
                for (int i34 = 0; i34 < i11; i34++) {
                    int i35 = i34 * i10;
                    for (int i36 = 0; i36 < i10; i36++) {
                        if ((a2[i35 + i36] & 255) < i33) {
                            int i37 = (i36 / 32) + (bVar.f6693c * i34);
                            int[] iArr2 = bVar.d;
                            iArr2[i37] = iArr2[i37] | (1 << (i36 & 31));
                        }
                    }
                }
                this.f44047c = bVar;
            } else {
                throw cc.e.a();
            }
        }
        return (dc.b) this.f44047c;
    }

    public String X(String str) {
        Resources resources = (Resources) this.f44046b;
        int identifier = resources.getIdentifier(str, "string", (String) this.f44047c);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public l Y() {
        MediaController.TransportControls transportControls = ((android.support.v4.media.session.h) this.f44046b).f821a.getTransportControls();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            return new l(transportControls);
        }
        if (i10 >= 24) {
            return new l(transportControls);
        }
        if (i10 >= 23) {
            return new l(transportControls);
        }
        return new l(transportControls);
    }

    public boolean Z(java.lang.CharSequence r10, int r11, int r12, androidx.emoji2.text.o r13) {
        throw new UnsupportedOperationException("Method not decompiled: pf.b.Z(java.lang.CharSequence, int, int, androidx.emoji2.text.o):boolean");
    }

    @Override
    public void a(h1 h1Var) {
        ((j0) this.f44046b).a(h1Var);
    }

    public boolean a0() {
        if (((a) ((t) this.f44046b).d) != null) {
            return true;
        }
        return false;
    }

    @Override
    public void accept(Object obj, Object obj2) {
        boolean z10;
        e0 e0Var = (e0) this.f44046b;
        String str = (String) this.f44047c;
        w wVar = (w) obj;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        if (e0Var.F == 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        n6.l.j("Not connected to device", z10);
        g6.f fVar = (g6.f) wVar.u();
        Parcel O0 = fVar.O0();
        O0.writeString(str);
        fVar.T0(O0, 5);
        synchronized (e0Var.f4498s) {
            try {
                if (e0Var.f4495p != null) {
                    taskCompletionSource.setException(n6.l.m(new Status(2001, null, null, null)));
                } else {
                    e0Var.f4495p = taskCompletionSource;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public void b(e2.v vVar) {
        d0 d0Var = (d0) this.f44047c;
        SparseArray sparseArray = d0Var.h;
        a4.h hVar = (a4.h) this.f44046b;
        if (vVar.x() == 0 && (vVar.x() & 128) != 0) {
            vVar.K(6);
            int a2 = vVar.a() / 4;
            for (int i10 = 0; i10 < a2; i10++) {
                vVar.h(0, 4, hVar.f262b);
                hVar.q(0);
                int i11 = hVar.i(16);
                hVar.t(3);
                if (i11 == 0) {
                    hVar.t(13);
                } else {
                    int i12 = hVar.i(13);
                    if (sparseArray.get(i12) == null) {
                        sparseArray.put(i12, new b0(new e0.i0(d0Var, i12)));
                        d0Var.f13260n++;
                    }
                }
            }
            if (d0Var.f13249a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    public void b0(Exception exc, boolean z10) {
        int i10;
        this.f44047c = null;
        HashSet hashSet = (HashSet) this.f44046b;
        e9.i0 v = e9.i0.v(hashSet);
        hashSet.clear();
        g0 listIterator = v.listIterator(0);
        while (listIterator.hasNext()) {
            n2.b bVar = (n2.b) listIterator.next();
            bVar.getClass();
            if (z10) {
                i10 = 1;
            } else {
                i10 = 3;
            }
            bVar.l(i10, exc);
        }
    }

    public void c0(boolean z10, boolean z11, float f7) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f44046b;
        f5 f5Var = (f5) this.f44047c;
        pb pbVar = f5Var.f2966e;
        pb.B1 = f7;
        ob obVar = pbVar.f3588z0;
        if (obVar != null) {
            obVar.setSpeed(f7);
        }
        o5.a0(f5Var.f2972l, z10);
        if (z11 && actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack() != null) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
        }
    }

    @Override
    public g2.h createDataSource() {
        return new g2.n((Context) this.f44046b, ((o) this.f44047c).createDataSource());
    }

    @Override
    public void d(d6.f fVar, String str) {
        Log.d("CAST_SESSION", "onSessionResuming " + ((d6.c) fVar).a() + " " + str);
    }

    public void d0(n2.b bVar) {
        ((HashSet) this.f44046b).add(bVar);
        if (((n2.b) this.f44047c) != null) {
            return;
        }
        this.f44047c = bVar;
        p k10 = bVar.f16360b.k();
        bVar.f16379x = k10;
        android.support.v4.media.session.f fVar = bVar.f16374r;
        String str = e2.d0.f8737a;
        k10.getClass();
        fVar.getClass();
        fVar.obtainMessage(1, new n2.a(u2.t.f46804b.getAndIncrement(), true, SystemClock.elapsedRealtime(), k10)).sendToTarget();
    }

    @Override
    public boolean e() {
        return ((j0) this.f44046b).L();
    }

    @Override
    public void e0(byte[] r19, int r20, int r21, z3.l r22, e2.h r23) {
        throw new UnsupportedOperationException("Method not decompiled: pf.b.e0(byte[], int, int, z3.l, e2.h):void");
    }

    @Override
    public void f(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionStartFailed " + ((d6.c) fVar).a() + " " + i10);
    }

    public void f0(androidx.mediarouter.app.r rVar) {
        if (rVar != null) {
            if (!((Set) this.f44047c).add(rVar)) {
                Log.w("MediaControllerCompat", "the callback has already been registered");
                return;
            }
            Handler handler = new Handler();
            rVar.f(handler);
            android.support.v4.media.session.h hVar = (android.support.v4.media.session.h) this.f44046b;
            hVar.f821a.registerCallback(rVar.f1821a, handler);
            synchronized (hVar.f822b) {
                if (hVar.f824e.a() != null) {
                    android.support.v4.media.session.g gVar = new android.support.v4.media.session.g(rVar);
                    hVar.d.put(rVar, gVar);
                    rVar.f1823c = gVar;
                    try {
                        hVar.f824e.a().o(gVar);
                        rVar.e(13, null, null);
                    } catch (RemoteException e7) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e7);
                    }
                } else {
                    rVar.f1823c = null;
                    hVar.f823c.add(rVar);
                }
            }
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    @Override
    public void g(d6.f fVar, boolean z10) {
        Log.d("CAST_SESSION", "onSessionResumed " + ((d6.c) fVar).a() + " " + z10);
    }

    public void g0(g gVar) {
        d dVar;
        g gVar2;
        Log.d("CAST_CONTROLLER", "set current media");
        t tVar = (t) this.f44046b;
        g gVar3 = (g) tVar.f15818c;
        if (b5.d.u()) {
            if (gVar3 != null || gVar != null) {
                if (gVar3 != null) {
                    ArrayList arrayList = gVar3.f44070a;
                    if (gVar != null && arrayList.size() == gVar.f44070a.size()) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            f a2 = gVar3.a(i10);
                            f a10 = gVar.a(i10);
                            if ((a2 == null && a10 == null) || (a2 != null && a10 != null && Objects.equals(a2.f44065a, a10.f44065a) && Objects.equals(a2.f44066b, a10.f44066b) && Objects.equals(a2.f44067c, a10.f44067c) && Objects.equals(a2.d, a10.d) && a2.f44068e == a10.f44068e && a2.f44069f == a10.f44069f)) {
                            }
                        }
                        return;
                    }
                }
            } else {
                return;
            }
        }
        if (((a) tVar.d) != null && gVar != null) {
            tVar.l(gVar);
        }
        if (((a) tVar.d) != null && (gVar2 = (g) tVar.f15818c) != null) {
            tVar.M(gVar2);
        }
        if (gVar != null && gVar.f44070a.size() > 0 && !gVar.a(0).f44065a.startsWith("audio/") && (dVar = (d) tVar.f15817b) != null) {
            dVar.l(null, null);
        }
        a aVar = (a) tVar.d;
        if (aVar != null && gVar != null) {
            aVar.d = gVar;
            aVar.f44044g = 0;
            aVar.h = 0;
            aVar.p();
        }
        tVar.f15818c = gVar;
    }

    @Override
    public boolean h(h1 h1Var) {
        return false;
    }

    public void h0(c5.o oVar) {
        this.f44046b = oVar;
        if (oVar.a() != null) {
            oVar.a().getClass();
            String str = oVar.a().d;
            if (str != null) {
                this.f44047c = str;
            }
        }
    }

    @Override
    public void i(int i10, int i11) {
        ((j0) this.f44046b).M(i10, i11);
    }

    public void i0(d6.c cVar) {
        String str;
        String string;
        t tVar = (t) this.f44046b;
        if (cVar != null) {
            n6.l.e("Must be called from the main thread.");
            e6.h hVar = cVar.f6604j;
            String a2 = cVar.a();
            if (!TextUtils.isEmpty(a2) && hVar != null) {
                a aVar = (a) tVar.d;
                if (aVar == null || !TextUtils.equals(aVar.f44041c.a(), a2)) {
                    tVar.P(new a(cVar, (d6.g) this.f44047c, hVar));
                    n6.l.e("Must be called from the main thread.");
                    CastDevice castDevice = cVar.f6605k;
                    if (castDevice != null) {
                        str = castDevice.d;
                    } else {
                        str = null;
                    }
                    PhotoViewer t12 = PhotoViewer.t1();
                    d.i();
                    if (t12.E != null && t12.f33549e0 != null && t12.Q1()) {
                        yc ycVar = new yc(t12.f33549e0, new bi.b());
                        int i10 = R.raw.forward;
                        if (!TextUtils.isEmpty(str)) {
                            string = LocaleController.formatString(R.string.ChromecastStartedTo, str);
                        } else {
                            string = LocaleController.getString(R.string.ChromecastStarted);
                        }
                        ycVar.Q(i10, 36, string).j();
                    }
                }
            }
        }
    }

    @Override
    public void j(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionEnded " + ((d6.c) fVar).a() + " " + i10);
        ((t) this.f44046b).P(null);
    }

    public void j0(androidx.mediarouter.app.r rVar) {
        if (rVar != null) {
            if (!((Set) this.f44047c).remove(rVar)) {
                Log.w("MediaControllerCompat", "the callback has never been registered");
                return;
            }
            try {
                ((android.support.v4.media.session.h) this.f44046b).b(rVar);
                return;
            } finally {
                rVar.f(null);
            }
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    @Override
    public boolean k(h1 h1Var) {
        return false;
    }

    public void k0(x1 x1Var) {
        Handler handler = (Handler) this.f44046b;
        if (handler != null) {
            handler.post(new a1.e(2, this, x1Var));
        }
    }

    @Override
    public void l(Bitmap bitmap) {
        y yVar = (y) this.f44046b;
        yVar.f16497c = bitmap;
        f6.g gVar = (f6.g) this.f44047c;
        gVar.f9383l = yVar;
        gVar.b();
    }

    public void l0(g3 g3Var) {
        try {
            s0(g3Var, (p3) this.f44046b);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void m(String str, long j3, long j10, long j11) {
        n nVar = (n) this.f44046b;
        if (nVar != null) {
            nVar.m(str, j3, j10, j11);
        }
    }

    public void m0(g3 g3Var, int i10, long j3) {
        try {
            o3 o3Var = (o3) ((p3) this.f44046b).g();
            o3Var.c();
            p3.p((p3) o3Var.f5898b, i10);
            p3 p3Var = (p3) o3Var.a();
            this.f44046b = p3Var;
            if (j3 != 0) {
                o3 o3Var2 = (o3) p3Var.g();
                o3Var2.c();
                p3.r((p3) o3Var2.f5898b, j3);
                p3Var = (p3) o3Var2.a();
            }
            s0(g3Var, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void n(d6.f fVar) {
        d6.c cVar = (d6.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarting " + cVar.a());
        i0(cVar);
    }

    public void n0(g3 g3Var, long j3, boolean z10) {
        p3 p3Var;
        try {
            f3 f3Var = (f3) g3Var.g();
            t3 t3Var = (t3) g3Var.o().g();
            t3Var.c();
            v3.n((v3) t3Var.f5898b, z10);
            f3Var.c();
            g3.r((g3) f3Var.f5898b, (v3) t3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j3 == 0) {
                p3Var = (p3) this.f44046b;
            } else {
                o3 o3Var = (o3) ((p3) this.f44046b).g();
                o3Var.c();
                p3.r((p3) o3Var.f5898b, j3);
                p3Var = (p3) o3Var.a();
            }
            s0(g3Var2, p3Var);
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void o(h1 h1Var, int i10, int i11) {
        q9 u10;
        j0 j0Var = (j0) this.f44046b;
        if (!((k0) this.f44047c).d && i10 != i11 && (u10 = j0Var.u()) != null) {
            if (!u10.y() || u10.W != j0Var.D()) {
                h1Var.post(new h0(this, h1Var, i11, u10, j0Var, i10));
            }
        }
    }

    public void o0(g3 g3Var, int i10, long j3, boolean z10) {
        p3 p3Var;
        try {
            o3 o3Var = (o3) ((p3) this.f44046b).g();
            o3Var.c();
            p3.p((p3) o3Var.f5898b, i10);
            this.f44046b = (p3) o3Var.a();
            f3 f3Var = (f3) g3Var.g();
            t3 t3Var = (t3) g3Var.o().g();
            t3Var.c();
            v3.n((v3) t3Var.f5898b, z10);
            f3Var.c();
            g3.r((g3) f3Var.f5898b, (v3) t3Var.a());
            g3 g3Var2 = (g3) f3Var.a();
            if (j3 == 0) {
                p3Var = (p3) this.f44046b;
            } else {
                o3 o3Var2 = (o3) ((p3) this.f44046b).g();
                o3Var2.c();
                p3.r((p3) o3Var2.f5898b, j3);
                p3Var = (p3) o3Var2.a();
            }
            s0(g3Var2, p3Var);
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
        com.google.android.gms.internal.cast.r rVar = (com.google.android.gms.internal.cast.r) this.f44046b;
        d6.b bVar2 = (d6.b) this.f44047c;
        x xVar = rVar.f5437c;
        g6.b bVar3 = com.google.android.gms.internal.cast.r.f5436j;
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
                Log.i(bVar3.f10386a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.f6595x)));
                if (!z10 && bVar2.f6595x) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (xVar == null && (bVar = rVar.d) != null) {
                    boolean z13 = bVar.v;
                    boolean z14 = bVar.f6593s;
                    p4.y yVar = new p4.y();
                    int i10 = Build.VERSION.SDK_INT;
                    if (i10 >= 30) {
                        yVar.f43948b = z11;
                    }
                    if (i10 >= 30) {
                        yVar.d = z13;
                    }
                    if (i10 >= 30) {
                        yVar.f43949c = z14;
                    }
                    x.i(new z(yVar));
                    Log.i(bVar3.f10386a, bVar3.d("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(rVar.f5440i), Boolean.valueOf(z11), Boolean.valueOf(z13), Boolean.valueOf(z14)));
                    if (z13) {
                        com.google.android.gms.internal.cast.u uVar = rVar.f5439f;
                        n6.l.h(uVar);
                        q qVar = new q(uVar);
                        x.b();
                        x.c().f43809f = qVar;
                        f2.a(f1.CAST_TRANSFER_TO_LOCAL_ENABLED);
                        return;
                    }
                    return;
                }
            }
        }
        z10 = true;
        Log.i(bVar3.f10386a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.f6595x)));
        if (!z10) {
        }
        z11 = false;
        if (xVar == null) {
        }
    }

    @Override
    public z3.d p(int i10, int i11, byte[] bArr) {
        return w.f.a(this, bArr, i11);
    }

    public void p0(l3 l3Var) {
        try {
            w3 t10 = x3.t();
            t10.d((p3) this.f44046b);
            t10.c();
            x3.p((x3) t10.f5898b, l3Var);
            ((b2.p) this.f44047c).i((x3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void q(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionResumeFailed " + ((d6.c) fVar).a() + " " + i10);
    }

    public void q0(a4 a4Var) {
        try {
            w3 t10 = x3.t();
            t10.d((p3) this.f44046b);
            t10.c();
            x3.r((x3) t10.f5898b, a4Var);
            ((b2.p) this.f44047c).i((x3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    public void r0(b4 b4Var) {
        if (b4Var == null) {
            return;
        }
        try {
            w3 t10 = x3.t();
            t10.d((p3) this.f44046b);
            t10.c();
            x3.s((x3) t10.f5898b, b4Var);
            ((b2.p) this.f44047c).i((x3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void s(String str, long j3, int i10, Object obj, long j10, long j11) {
        ((g6.m) this.f44047c).f10398g = null;
        n nVar = (n) this.f44046b;
        if (nVar != null) {
            nVar.s(str, j3, i10, obj, j10, j11);
        }
    }

    public void s0(g3 g3Var, p3 p3Var) {
        if (g3Var == null) {
            return;
        }
        try {
            w3 t10 = x3.t();
            t10.d(p3Var);
            t10.c();
            x3.n((x3) t10.f5898b, g3Var);
            ((b2.p) this.f44047c).i((x3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public void t(d6.f fVar) {
        Log.d("CAST_SESSION", "onSessionEnding " + ((d6.c) fVar).a());
    }

    public void t0(i3 i3Var, p3 p3Var) {
        try {
            w3 t10 = x3.t();
            t10.d(p3Var);
            t10.c();
            x3.o((x3) t10.f5898b, i3Var);
            ((b2.p) this.f44047c).i((x3) t10.a());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.u.i("BillingLogger", "Unable to log.", th2);
        }
    }

    @Override
    public Object then(Task task) {
        j6.a aVar = (j6.a) this.f44046b;
        Bundle bundle = (Bundle) this.f44047c;
        aVar.getClass();
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        if (bundle2 != null && bundle2.containsKey("google.messenger")) {
            return aVar.a(bundle).onSuccessTask(j6.m.f13553a, j6.b.f13530b);
        }
        return task;
    }

    public String toString() {
        switch (this.f44045a) {
            case 10:
                try {
                    return V().toString();
                } catch (cc.e unused) {
                    return "";
                }
            case 17:
                return ((HashMap) this.f44046b).toString();
            default:
                return super.toString();
        }
    }

    @Override
    public void u(d6.f fVar, String str) {
        d6.c cVar = (d6.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarted " + cVar.a() + " " + str);
        i0(cVar);
    }

    @Override
    public void v(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionStartSuspended " + ((d6.c) fVar).a() + " " + i10);
    }

    public c5.e w() {
        if (((c5.o) this.f44046b) != null) {
            return new c5.e(this);
        }
        throw new NullPointerException("ProductDetails is required for constructing ProductDetailsParams.");
    }

    @Override
    public void y(CharSequence charSequence) {
        ((j0) this.f44046b).A(charSequence);
    }

    @Override
    public cf.a y1(z0 z0Var) {
        int i10;
        List list = (List) this.f44047c;
        List list2 = (List) z0Var.f16703b;
        if (list2 != null) {
            i10 = list2.size();
        } else {
            i10 = 0;
        }
        if (i10 > 0) {
            ArrayList arrayList = new ArrayList(list.size() + i10);
            arrayList.addAll(list);
            arrayList.addAll(list2);
            list = arrayList;
        }
        return new ed.i(z0Var, (List) this.f44046b, list);
    }

    public boolean z(int i10) {
        return ((b2.q) this.f44046b).f2259a.get(i10);
    }

    @Override
    public Object zzp() {
        boolean z10;
        Map map;
        com.google.android.gms.internal.clearcut.d dVar = (com.google.android.gms.internal.clearcut.d) this.f44046b;
        com.google.android.gms.internal.clearcut.b bVar = (com.google.android.gms.internal.clearcut.b) this.f44047c;
        bVar.getClass();
        if (com.google.android.gms.internal.clearcut.d.e()) {
            z10 = ((Boolean) com.google.android.gms.internal.clearcut.d.c(new c5.i("gms:phenotype:phenotype_flag:debug_disable_caching"))).booleanValue();
        } else {
            z10 = false;
        }
        if (z10) {
            map = bVar.b();
        } else {
            map = bVar.f5545e;
        }
        if (map == null) {
            synchronized (bVar.d) {
                try {
                    Map map2 = bVar.f5545e;
                    map = map2;
                    if (map2 == null) {
                        HashMap b10 = bVar.b();
                        bVar.f5545e = b10;
                        map = b10;
                    }
                } finally {
                }
            }
        }
        if (map == null) {
            map = Collections.EMPTY_MAP;
        }
        return (String) map.get(dVar.f5571b);
    }

    public b(int i10, boolean z10) {
        this.f44045a = i10;
    }

    public b(Object obj, Object obj2, boolean z10, int i10) {
        this.f44045a = i10;
        this.f44046b = obj;
        this.f44047c = obj2;
    }

    public b(Context context, p3 p3Var) {
        this.f44045a = 8;
        b2.p pVar = new b2.p(1);
        try {
            l5.s.b(context);
            pVar.f2233c = l5.s.a().c(j5.a.f13508e).a("PLAY_BILLING_LIBRARY", new i5.c("proto"), new t7.u(5));
        } catch (Throwable unused) {
            pVar.f2232b = true;
        }
        this.f44047c = pVar;
        this.f44046b = p3Var;
    }

    public b(androidx.fragment.app.i0 i0Var) {
        this.f44045a = 4;
        this.f44046b = i0Var;
        this.f44047c = new CopyOnWriteArrayList();
    }

    public b(dc.f fVar) {
        this.f44045a = 10;
        this.f44046b = fVar;
    }

    public b(int i10) {
        this.f44045a = i10;
        switch (i10) {
            case 21:
                this.f44046b = new e2.v();
                this.f44047c = new i4.a();
                return;
            case 28:
                this.f44046b = new HashSet();
                return;
            default:
                d6.a c10 = d6.a.c(ApplicationLoader.applicationContext);
                sw0 sw0Var = new sw0(11);
                c10.getClass();
                n6.l.e("Must be called from the main thread.");
                d6.g gVar = c10.f6578c;
                gVar.getClass();
                try {
                    d6.y yVar = gVar.f6613a;
                    j jVar = new j(sw0Var);
                    Parcel O0 = yVar.O0();
                    com.google.android.gms.internal.cast.v.d(O0, jVar);
                    yVar.S0(O0, 4);
                } catch (RemoteException e7) {
                    d6.g.f6612c.a(e7, "Unable to call %s on %s.", "addCastStateListener", d6.y.class.getSimpleName());
                }
                this.f44046b = new t(17, false);
                d6.g b10 = c10.b();
                this.f44047c = b10;
                b10.a(this);
                i0(b10.c());
                return;
        }
    }

    @Override
    public void r() {
    }

    @Override
    public void reset() {
    }

    public b(Context context, int i10) {
        this.f44045a = i10;
        switch (i10) {
            case 26:
                this.f44046b = context != null ? context.getApplicationContext() : null;
                return;
            case 27:
                this.f44047c = null;
                this.f44046b = context;
                return;
            case 28:
            default:
                o oVar = new o();
                this.f44046b = context.getApplicationContext();
                this.f44047c = oVar;
                return;
            case 29:
                n6.l.h(context);
                Resources resources = context.getResources();
                this.f44046b = resources;
                this.f44047c = resources.getResourcePackageName(2131689566);
                return;
        }
    }

    public b(b2.q qVar, SparseArray sparseArray) {
        this.f44045a = 22;
        this.f44046b = qVar;
        SparseBooleanArray sparseBooleanArray = qVar.f2259a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
            int a2 = qVar.a(i10);
            j2.a aVar = (j2.a) sparseArray.get(a2);
            aVar.getClass();
            sparseArray2.append(a2, aVar);
        }
        this.f44047c = sparseArray2;
    }

    public b(com.google.firebase.messaging.s sVar, t7.u uVar, androidx.emoji2.text.d dVar) {
        this.f44045a = 3;
        this.f44046b = sVar;
        this.f44047c = dVar;
    }

    public b(Handler handler, c0 c0Var) {
        this.f44045a = 1;
        if (c0Var != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f44046b = handler;
        this.f44047c = c0Var;
    }

    public b(ArrayList arrayList, ArrayList arrayList2) {
        this.f44045a = 20;
        int size = arrayList.size();
        this.f44046b = new int[size];
        this.f44047c = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            ((int[]) this.f44046b)[i10] = ((Integer) arrayList.get(i10)).intValue();
            ((float[]) this.f44047c)[i10] = ((Float) arrayList2.get(i10)).floatValue();
        }
    }

    @Override
    public void c(e2.b0 b0Var, c3.q qVar, j4.f0 f0Var) {
    }

    public b(int i10, int i11) {
        this.f44045a = 20;
        this.f44046b = new int[]{i10, i11};
        this.f44047c = new float[]{0.0f, 1.0f};
    }

    public b(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.f44045a = 2;
        if (mediaSessionCompat$Token != null) {
            this.f44047c = DesugarCollections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                this.f44046b = new android.support.v4.media.session.h(context, mediaSessionCompat$Token);
                return;
            } else {
                this.f44046b = new android.support.v4.media.session.h(context, mediaSessionCompat$Token);
                return;
            }
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    public b(int i10, int i11, int i12) {
        this.f44045a = 20;
        this.f44046b = new int[]{i10, i11, i12};
        this.f44047c = new float[]{0.0f, 0.5f, 1.0f};
    }

    public b(a1 a1Var, int[] iArr) {
        this.f44045a = 15;
        this.f44046b = e9.i0.v(a1Var);
        this.f44047c = iArr;
    }

    public b(d0 d0Var) {
        this.f44045a = 23;
        this.f44047c = d0Var;
        this.f44046b = new a4.h(new byte[4], 4);
    }
}
