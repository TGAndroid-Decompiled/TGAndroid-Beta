package qf;

import android.content.Context;
import android.graphics.Bitmap;
import android.media.session.MediaController;
import android.net.Uri;
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
import androidx.emoji2.text.v;
import androidx.fragment.app.s;
import androidx.mediarouter.app.q;
import b2.r0;
import b2.u;
import c3.o;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.internal.cast.d1;
import com.google.android.gms.internal.cast.d2;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import d6.h;
import d6.j;
import e0.f0;
import e2.x;
import e9.n0;
import e9.x1;
import g6.n;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j4.a0;
import j4.b0;
import j4.d0;
import j9.y;
import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
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
import k2.r;
import ki.g1;
import ki.h0;
import ki.h1;
import ki.j0;
import ki.k0;
import kotlin.jvm.internal.i;
import m.g3;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Components.xc;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.hk0;
import p4.z;
public class b implements h, OnCompleteListener, com.google.android.gms.internal.clearcut.h, ee.b, f6.a, fa.a, g2.g, n, a0, Continuation, g1, e2.d {
    public static volatile b d;
    public final int f44464a;
    public Object f44465b;
    public Object f44466c;

    public b(int i10) {
        this.f44464a = i10;
    }

    public static boolean B(Editable editable, KeyEvent keyEvent, boolean z10) {
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

    public static b Y() {
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

    public static String g0(b bVar) {
        Collection<String> collection = (Collection) bVar.f44466c;
        StringBuilder sb2 = new StringBuilder("com.google.android.gms.cast.CATEGORY_CAST");
        String str = (String) bVar.f44465b;
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
                boolean z10 = true;
                for (String str2 : collection) {
                    g6.a.b(str2);
                    if (!z10) {
                        sb2.append(",");
                    }
                    if (!g6.a.f10841a.matcher(str2).matches()) {
                        StringBuilder sb3 = new StringBuilder(str2.length());
                        for (int i10 = 0; i10 < str2.length(); i10++) {
                            char charAt = str2.charAt(i10);
                            if ((charAt < 'A' || charAt > 'Z') && ((charAt < 'a' || charAt > 'z') && ((charAt < '0' || charAt > '9') && charAt != '_' && charAt != '-' && charAt != '.' && charAt != ':'))) {
                                sb3.append(String.format("%%%04x", Integer.valueOf(charAt)));
                            } else {
                                sb3.append(charAt);
                            }
                        }
                        str2 = sb3.toString();
                    }
                    sb2.append(str2);
                    z10 = false;
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

    public static void o(b bVar, boolean z10, boolean z11) {
        synchronized (bVar) {
            boolean z12 = false;
            if (z10) {
                if (((PowerManager.WakeLock) bVar.f44466c) == null) {
                    if (((Context) bVar.f44465b).checkSelfPermission("android.permission.WAKE_LOCK") != 0) {
                        e2.a.l("WakeLockManager", "WAKE_LOCK permission not granted, can't acquire wake lock for playback");
                        return;
                    }
                    PowerManager powerManager = (PowerManager) ((Context) bVar.f44465b).getSystemService("power");
                    if (powerManager == null) {
                        e2.a.l("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                        return;
                    }
                    PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                    bVar.f44466c = newWakeLock;
                    newWakeLock.setReferenceCounted(false);
                }
            }
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) bVar.f44466c;
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

    public static String y(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
        }
        return null;
    }

    public boolean A(int i10) {
        return ((u) this.f44465b).f4055a.get(i10);
    }

    public void C(i2.d dVar) {
        synchronized (dVar) {
        }
        Handler handler = (Handler) this.f44465b;
        if (handler != null) {
            handler.post(new r(this, dVar, 0));
        }
    }

    @Override
    public void D(CharSequence charSequence) {
        ((j0) this.f44465b).v(charSequence);
    }

    public void E(s f7, boolean z10) {
        i.e(f7, "f");
        s sVar = ((androidx.fragment.app.j0) this.f44465b).f3211y;
        if (sVar != null) {
            sVar.p().f3202o.E(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f44466c).iterator();
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

    public void F(s f7, boolean z10) {
        i.e(f7, "f");
        androidx.fragment.app.j0 j0Var = (androidx.fragment.app.j0) this.f44465b;
        androidx.fragment.app.v vVar = j0Var.f3209w.f3298b;
        s sVar = j0Var.f3211y;
        if (sVar != null) {
            sVar.p().f3202o.F(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f44466c).iterator();
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

    public void G(s f7, boolean z10) {
        i.e(f7, "f");
        s sVar = ((androidx.fragment.app.j0) this.f44465b).f3211y;
        if (sVar != null) {
            sVar.p().f3202o.G(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f44466c).iterator();
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

    public void H(s f7, boolean z10) {
        i.e(f7, "f");
        s sVar = ((androidx.fragment.app.j0) this.f44465b).f3211y;
        if (sVar != null) {
            sVar.p().f3202o.H(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f44466c).iterator();
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

    public void I(s f7, boolean z10) {
        i.e(f7, "f");
        s sVar = ((androidx.fragment.app.j0) this.f44465b).f3211y;
        if (sVar != null) {
            sVar.p().f3202o.I(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f44466c).iterator();
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

    public void J(s f7, boolean z10) {
        i.e(f7, "f");
        s sVar = ((androidx.fragment.app.j0) this.f44465b).f3211y;
        if (sVar != null) {
            sVar.p().f3202o.J(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f44466c).iterator();
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

    public void K(s f7, boolean z10) {
        i.e(f7, "f");
        androidx.fragment.app.j0 j0Var = (androidx.fragment.app.j0) this.f44465b;
        androidx.fragment.app.v vVar = j0Var.f3209w.f3298b;
        s sVar = j0Var.f3211y;
        if (sVar != null) {
            sVar.p().f3202o.K(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f44466c).iterator();
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

    public void L(s f7, boolean z10) {
        i.e(f7, "f");
        s sVar = ((androidx.fragment.app.j0) this.f44465b).f3211y;
        if (sVar != null) {
            sVar.p().f3202o.L(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f44466c).iterator();
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
    public void M(Editable editable) {
        ((k0) this.f44466c).i();
        ((j0) this.f44465b).N();
    }

    public void N(s f7, boolean z10) {
        i.e(f7, "f");
        s sVar = ((androidx.fragment.app.j0) this.f44465b).f3211y;
        if (sVar != null) {
            sVar.p().f3202o.N(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f44466c).iterator();
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

    public void O(s f7, Bundle bundle, boolean z10) {
        i.e(f7, "f");
        s sVar = ((androidx.fragment.app.j0) this.f44465b).f3211y;
        if (sVar != null) {
            sVar.p().f3202o.O(f7, bundle, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f44466c).iterator();
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

    public void P(s f7, boolean z10) {
        i.e(f7, "f");
        s sVar = ((androidx.fragment.app.j0) this.f44465b).f3211y;
        if (sVar != null) {
            sVar.p().f3202o.P(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f44466c).iterator();
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
    public boolean Q(boolean z10) {
        return false;
    }

    @Override
    public boolean R(h1 h1Var) {
        return false;
    }

    public void S(s f7, boolean z10) {
        i.e(f7, "f");
        s sVar = ((androidx.fragment.app.j0) this.f44465b).f3211y;
        if (sVar != null) {
            sVar.p().f3202o.S(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f44466c).iterator();
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

    public void T(s f7, boolean z10) {
        i.e(f7, "f");
        s sVar = ((androidx.fragment.app.j0) this.f44465b).f3211y;
        if (sVar != null) {
            sVar.p().f3202o.T(f7, true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.f44466c).iterator();
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

    public com.google.android.datatransport.cct.CctBackendFactory U(java.lang.String r14) {
        throw new UnsupportedOperationException("Method not decompiled: qf.b.U(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    @Override
    public void V(h1 h1Var, int i10, int i11) {
        n9 t10;
        j0 j0Var = (j0) this.f44465b;
        if (!((k0) this.f44466c).d && i10 != i11 && (t10 = j0Var.t()) != null) {
            if (!t10.x() || t10.W != j0Var.B()) {
                h1Var.post(new h0(this, h1Var, i11, t10, j0Var, i10));
            }
        }
    }

    public gb.n W(lb.a r7) {
        throw new UnsupportedOperationException("Method not decompiled: qf.b.W(lb.a):gb.n");
    }

    public o X(Object... objArr) {
        Constructor a2;
        synchronized (((AtomicBoolean) this.f44466c)) {
            if (!((AtomicBoolean) this.f44466c).get()) {
                try {
                    a2 = ((aa.a) this.f44465b).a();
                } catch (ClassNotFoundException unused) {
                    ((AtomicBoolean) this.f44466c).set(true);
                } catch (Exception e) {
                    throw new RuntimeException("Error instantiating extension", e);
                }
            }
            a2 = null;
        }
        if (a2 == null) {
            return null;
        }
        try {
            return (o) a2.newInstance(objArr);
        } catch (Exception e7) {
            throw new IllegalStateException("Unexpected error creating extractor", e7);
        }
    }

    public m Z() {
        MediaController.TransportControls transportControls = ((android.support.v4.media.session.h) this.f44465b).f2613a.getTransportControls();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            return new l(transportControls);
        }
        if (i10 >= 24) {
            return new l(transportControls);
        }
        return new l(transportControls);
    }

    @Override
    public void a(x xVar) {
        d0 d0Var = (d0) this.f44466c;
        SparseArray sparseArray = d0Var.h;
        a4.g gVar = (a4.g) this.f44465b;
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
                        sparseArray.put(g11, new b0(new f0(d0Var, g11)));
                        d0Var.f14019n++;
                    }
                }
            }
            if (d0Var.f14009a != 2) {
                sparseArray.remove(0);
            }
        }
    }

    public boolean a0(CharSequence charSequence, int i10, int i11, androidx.emoji2.text.o oVar) {
        int i12;
        if (oVar.f3116c == 0) {
            androidx.emoji2.text.h hVar = (androidx.emoji2.text.h) this.f44466c;
            p1.a b10 = oVar.b();
            int a2 = b10.a(8);
            if (a2 != 0) {
                ((ByteBuffer) b10.d).getShort(a2 + b10.f43937a);
            }
            androidx.emoji2.text.d dVar = (androidx.emoji2.text.d) hVar;
            dVar.getClass();
            ThreadLocal threadLocal = androidx.emoji2.text.d.f3092b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb2 = (StringBuilder) threadLocal.get();
            sb2.setLength(0);
            while (i10 < i11) {
                sb2.append(charSequence.charAt(i10));
                i10++;
            }
            TextPaint textPaint = dVar.f3093a;
            String sb3 = sb2.toString();
            int i13 = i0.d.f12287a;
            if (textPaint.hasGlyph(sb3)) {
                i12 = 2;
            } else {
                i12 = 1;
            }
            oVar.f3116c = i12;
        }
        if (oVar.f3116c != 2) {
            return false;
        }
        return true;
    }

    public boolean b0() {
        if (((a) ((g3) this.f44465b).d) != null) {
            return true;
        }
        return false;
    }

    @Override
    public void c(h1 h1Var) {
        ((j0) this.f44465b).c(h1Var);
    }

    public void c0(q qVar) {
        if (qVar != null) {
            if (!((Set) this.f44466c).add(qVar)) {
                Log.w("MediaControllerCompat", "the callback has already been registered");
                return;
            }
            Handler handler = new Handler();
            qVar.f(handler);
            android.support.v4.media.session.h hVar = (android.support.v4.media.session.h) this.f44465b;
            hVar.f2613a.registerCallback(qVar.f3558a, handler);
            synchronized (hVar.f2614b) {
                if (hVar.e.a() != null) {
                    android.support.v4.media.session.g gVar = new android.support.v4.media.session.g(qVar);
                    hVar.d.put(qVar, gVar);
                    qVar.f3560c = gVar;
                    try {
                        hVar.e.a().o(gVar);
                        qVar.e(13, null, null);
                    } catch (RemoteException e) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e);
                    }
                } else {
                    qVar.f3560c = null;
                    hVar.f2615c.add(qVar);
                }
            }
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    @Override
    public g2.h createDataSource() {
        return new g2.n((Context) this.f44465b, ((g2.o) this.f44466c).createDataSource());
    }

    @Override
    public void d(d6.f fVar, String str) {
        Log.d("CAST_SESSION", "onSessionResuming " + ((d6.c) fVar).a() + " " + str);
    }

    public void d0(g gVar) {
        d dVar;
        g gVar2;
        Log.d("CAST_CONTROLLER", "set current media");
        g3 g3Var = (g3) this.f44465b;
        g gVar3 = (g) g3Var.f16197c;
        if (b5.d.u()) {
            if (gVar3 != null || gVar != null) {
                if (gVar3 != null) {
                    ArrayList arrayList = gVar3.f44486a;
                    if (gVar != null && arrayList.size() == gVar.f44486a.size()) {
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            f a2 = gVar3.a(i10);
                            f a10 = gVar.a(i10);
                            if ((a2 == null && a10 == null) || (a2 != null && a10 != null && Objects.equals(a2.f44482a, a10.f44482a) && Objects.equals(a2.f44483b, a10.f44483b) && Objects.equals(a2.f44484c, a10.f44484c) && Objects.equals(a2.d, a10.d) && a2.e == a10.e && a2.f44485f == a10.f44485f)) {
                            }
                        }
                        return;
                    }
                }
            } else {
                return;
            }
        }
        if (((a) g3Var.d) != null && gVar != null) {
            g3Var.o(gVar);
        }
        if (((a) g3Var.d) != null && (gVar2 = (g) g3Var.f16197c) != null) {
            g3Var.S(gVar2);
        }
        if (gVar != null && gVar.f44486a.size() > 0 && !gVar.a(0).f44482a.startsWith("audio/") && (dVar = (d) g3Var.f16196b) != null) {
            dVar.l(null, null);
        }
        a aVar = (a) g3Var.d;
        if (aVar != null && gVar != null) {
            aVar.d = gVar;
            aVar.f44463g = 0;
            aVar.h = 0;
            aVar.p();
        }
        g3Var.f16197c = gVar;
    }

    @Override
    public y e(r0 r0Var) {
        Uri uri;
        byte[] bArr;
        g3 g3Var = (g3) this.f44466c;
        if (g3Var != null && (((uri = (Uri) g3Var.f16197c) != null && uri.equals(r0Var.f3965n)) || ((bArr = (byte[]) g3Var.f16196b) != null && Arrays.equals(bArr, r0Var.f3962k)))) {
            y yVar = (y) ((g3) this.f44466c).d;
            yVar.getClass();
            return yVar;
        }
        y e = ((e2.d) this.f44465b).e(r0Var);
        if (e == null) {
            return null;
        }
        this.f44466c = new g3(r0Var, e);
        return e;
    }

    public void e0(d6.c cVar) {
        String str;
        String string;
        g3 g3Var = (g3) this.f44465b;
        if (cVar != null) {
            n6.l.e("Must be called from the main thread.");
            e6.h hVar = cVar.f7856j;
            String a2 = cVar.a();
            if (!TextUtils.isEmpty(a2) && hVar != null) {
                a aVar = (a) g3Var.d;
                if (aVar == null || !TextUtils.equals(aVar.f44461c.a(), a2)) {
                    g3Var.V(new a(cVar, (d6.g) this.f44466c, hVar));
                    n6.l.e("Must be called from the main thread.");
                    CastDevice castDevice = cVar.f7857k;
                    if (castDevice != null) {
                        str = castDevice.d;
                    } else {
                        str = null;
                    }
                    PhotoViewer t12 = PhotoViewer.t1();
                    d.i();
                    if (t12.E != null && t12.f33266e0 != null && t12.R1()) {
                        xc xcVar = new xc(t12.f33266e0, new ci.b());
                        int i10 = R.raw.forward;
                        if (!TextUtils.isEmpty(str)) {
                            string = LocaleController.formatString(R.string.ChromecastStartedTo, str);
                        } else {
                            string = LocaleController.getString(R.string.ChromecastStarted);
                        }
                        xcVar.Q(i10, 36, string).j();
                    }
                }
            }
        }
    }

    @Override
    public boolean f() {
        return ((j0) this.f44465b).G();
    }

    public void f0(q qVar) {
        if (qVar != null) {
            if (!((Set) this.f44466c).remove(qVar)) {
                Log.w("MediaControllerCompat", "the callback has never been registered");
                return;
            }
            try {
                ((android.support.v4.media.session.h) this.f44465b).b(qVar);
                return;
            } finally {
                qVar.f(null);
            }
        }
        throw new IllegalArgumentException("callback must not be null");
    }

    @Override
    public void g(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionStartFailed " + ((d6.c) fVar).a() + " " + i10);
    }

    @Override
    public void h(int i10, int i11) {
        ((j0) this.f44465b).K(i10, i11);
    }

    @Override
    public void i(d6.f fVar, boolean z10) {
        Log.d("CAST_SESSION", "onSessionResumed " + ((d6.c) fVar).a() + " " + z10);
    }

    @Override
    public void j(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionEnded " + ((d6.c) fVar).a() + " " + i10);
        ((g3) this.f44465b).V(null);
    }

    @Override
    public void k(Bitmap bitmap) {
        n4.s sVar = (n4.s) this.f44465b;
        sVar.f17122c = bitmap;
        f6.f fVar = (f6.f) this.f44466c;
        fVar.f10476l = sVar;
        fVar.b();
    }

    @Override
    public void l(h1 h1Var) {
        ((j0) this.f44465b).g();
    }

    @Override
    public void n(d6.f fVar) {
        d6.c cVar = (d6.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarting " + cVar.a());
        e0(cVar);
    }

    @Override
    public void onComplete(Task task) {
        boolean z10;
        boolean z11;
        d6.b bVar;
        boolean z12;
        String str;
        switch (this.f44464a) {
            case 2:
                a9.e eVar = (a9.e) this.f44465b;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f44466c;
                synchronized (eVar.f329f) {
                    eVar.e.remove(taskCompletionSource);
                }
                return;
            default:
                com.google.android.gms.internal.cast.r rVar = (com.google.android.gms.internal.cast.r) this.f44465b;
                d6.b bVar2 = (d6.b) this.f44466c;
                p4.x xVar = rVar.f6763c;
                g6.b bVar3 = com.google.android.gms.internal.cast.r.f6762j;
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
                        Log.i(bVar3.f10843a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.f7848x)));
                        if (!z10 && bVar2.f7848x) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (xVar == null && (bVar = rVar.d) != null) {
                            boolean z13 = bVar.v;
                            boolean z14 = bVar.f7846s;
                            p4.y yVar = new p4.y();
                            int i10 = Build.VERSION.SDK_INT;
                            if (i10 >= 30) {
                                yVar.f44251b = z11;
                            }
                            if (i10 >= 30) {
                                yVar.d = z13;
                            }
                            if (i10 >= 30) {
                                yVar.f44252c = z14;
                            }
                            p4.x.i(new z(yVar));
                            Log.i(bVar3.f10843a, bVar3.d("media transfer = %b, session transfer = %b, transfer to local = %b, in-app output switcher = %b", Boolean.valueOf(rVar.f6765i), Boolean.valueOf(z11), Boolean.valueOf(z13), Boolean.valueOf(z14)));
                            if (z13) {
                                com.google.android.gms.internal.cast.u uVar = rVar.f6764f;
                                n6.l.h(uVar);
                                com.google.android.gms.internal.cast.q qVar = new com.google.android.gms.internal.cast.q(uVar);
                                p4.x.b();
                                p4.x.c().f44118f = qVar;
                                d2.a(d1.CAST_TRANSFER_TO_LOCAL_ENABLED);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                }
                z10 = true;
                Log.i(bVar3.f10843a, bVar3.d("Set up output switcher flags: %b (from module), %b (from CastOptions)", Boolean.valueOf(z10), Boolean.valueOf(bVar2.f7848x)));
                if (!z10) {
                }
                z11 = false;
                if (xVar == null) {
                    return;
                }
                return;
        }
    }

    @Override
    public void p(String str, long j10, long j11, long j12) {
        n nVar = (n) this.f44465b;
        if (nVar != null) {
            nVar.p(str, j10, j11, j12);
        }
    }

    @Override
    public boolean q(h1 h1Var) {
        return false;
    }

    @Override
    public java.lang.Object r(ee.c r6, md.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: qf.b.r(ee.c, md.c):java.lang.Object");
    }

    @Override
    public void s(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionResumeFailed " + ((d6.c) fVar).a() + " " + i10);
    }

    @Override
    public StackTraceElement[] s0(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        fa.a[] aVarArr = (fa.a[]) this.f44465b;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i10 = 0; i10 < 1; i10++) {
            fa.a aVar = aVarArr[i10];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = aVar.s0(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > 1024) {
            return ((rb.b) this.f44466c).s0(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }

    @Override
    public void t(String str, long j10, int i10, Object obj, long j11, long j12) {
        ((g6.m) this.f44466c).f10853g = null;
        n nVar = (n) this.f44465b;
        if (nVar != null) {
            nVar.t(str, j10, i10, obj, j11, j12);
        }
    }

    @Override
    public Object then(Task task) {
        j6.a aVar = (j6.a) this.f44465b;
        Bundle bundle = (Bundle) this.f44466c;
        aVar.getClass();
        if (!task.isSuccessful()) {
            return task;
        }
        Bundle bundle2 = (Bundle) task.getResult();
        if (bundle2 != null && bundle2.containsKey("google.messenger")) {
            return aVar.a(bundle).onSuccessTask(j6.m.f14286a, j6.b.f14267b);
        }
        return task;
    }

    public String toString() {
        switch (this.f44464a) {
            case 20:
                return ((HashMap) this.f44465b).toString();
            default:
                return super.toString();
        }
    }

    @Override
    public void u(d6.f fVar) {
        Log.d("CAST_SESSION", "onSessionEnding " + ((d6.c) fVar).a());
    }

    @Override
    public y v(byte[] bArr) {
        byte[] bArr2;
        g3 g3Var = (g3) this.f44466c;
        if (g3Var != null && (bArr2 = (byte[]) g3Var.f16196b) != null && Arrays.equals(bArr2, bArr)) {
            y yVar = (y) ((g3) this.f44466c).d;
            yVar.getClass();
            return yVar;
        }
        y v = ((e2.d) this.f44465b).v(bArr);
        this.f44466c = new g3(bArr, v);
        return v;
    }

    @Override
    public void w(d6.f fVar, String str) {
        d6.c cVar = (d6.c) fVar;
        Log.d("CAST_SESSION", "onSessionStarted " + cVar.a() + " " + str);
        e0(cVar);
    }

    @Override
    public void x(d6.f fVar, int i10) {
        Log.d("CAST_SESSION", "onSessionStartSuspended " + ((d6.c) fVar).a() + " " + i10);
    }

    public void z() {
        this.f44465b = null;
        this.f44466c = null;
    }

    @Override
    public Object zzp() {
        boolean z10;
        Map map;
        com.google.android.gms.internal.clearcut.d dVar = (com.google.android.gms.internal.clearcut.d) this.f44465b;
        com.google.android.gms.internal.clearcut.b bVar = (com.google.android.gms.internal.clearcut.b) this.f44466c;
        bVar.getClass();
        if (com.google.android.gms.internal.clearcut.d.e()) {
            z10 = ((Boolean) com.google.android.gms.internal.clearcut.d.c(new com.google.android.gms.internal.clearcut.e("gms:phenotype:phenotype_flag:debug_disable_caching", 0))).booleanValue();
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
        return (String) map.get(dVar.f6913b);
    }

    public b(int i10, Object obj, Object obj2) {
        this.f44464a = i10;
        this.f44465b = obj;
        this.f44466c = obj2;
    }

    public b(Object obj, int i10) {
        this.f44464a = i10;
        this.f44465b = obj;
    }

    public b(Object obj, Object obj2, boolean z10, int i10) {
        this.f44464a = i10;
        this.f44465b = obj2;
        this.f44466c = obj;
    }

    public b(androidx.fragment.app.j0 j0Var) {
        this.f44464a = 6;
        this.f44465b = j0Var;
        this.f44466c = new CopyOnWriteArrayList();
    }

    public b(fa.a[] aVarArr) {
        this.f44464a = 17;
        this.f44465b = aVarArr;
        this.f44466c = new rb.b(8);
    }

    public b() {
        this.f44464a = 0;
        d6.a c10 = d6.a.c(ApplicationLoader.applicationContext);
        hk0 hk0Var = new hk0(22);
        c10.getClass();
        n6.l.e("Must be called from the main thread.");
        d6.g gVar = c10.f7833c;
        gVar.getClass();
        try {
            d6.y yVar = gVar.f7865a;
            j jVar = new j(hk0Var);
            Parcel N0 = yVar.N0();
            com.google.android.gms.internal.cast.v.d(N0, jVar);
            yVar.R0(N0, 4);
        } catch (RemoteException e) {
            d6.g.f7864c.a(e, "Unable to call %s on %s.", "addCastStateListener", d6.y.class.getSimpleName());
        }
        this.f44465b = new g3(23, false);
        d6.g b10 = c10.b();
        this.f44466c = b10;
        b10.a(this);
        e0(b10.c());
    }

    @Override
    public void m() {
    }

    public b(Context context, int i10) {
        this.f44464a = i10;
        switch (i10) {
            case 29:
                this.f44466c = null;
                this.f44465b = context;
                return;
            default:
                g2.o oVar = new g2.o();
                this.f44465b = context.getApplicationContext();
                this.f44466c = oVar;
                return;
        }
    }

    public b(u uVar, SparseArray sparseArray) {
        this.f44464a = 23;
        this.f44465b = uVar;
        SparseBooleanArray sparseBooleanArray = uVar.f4055a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i10 = 0; i10 < sparseBooleanArray.size(); i10++) {
            int a2 = uVar.a(i10);
            j2.a aVar = (j2.a) sparseArray.get(a2);
            aVar.getClass();
            sparseArray2.append(a2, aVar);
        }
        this.f44466c = sparseArray2;
    }

    public b(qi.e eVar, rb.b bVar, androidx.emoji2.text.d dVar) {
        this.f44464a = 5;
        this.f44465b = eVar;
        this.f44466c = dVar;
    }

    public b(Handler handler, k2.u uVar) {
        this.f44464a = 26;
        if (uVar != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.f44465b = handler;
        this.f44466c = uVar;
    }

    public b(ArrayList arrayList, ArrayList arrayList2) {
        this.f44464a = 21;
        int size = arrayList.size();
        this.f44465b = new int[size];
        this.f44466c = new float[size];
        for (int i10 = 0; i10 < size; i10++) {
            ((int[]) this.f44465b)[i10] = ((Integer) arrayList.get(i10)).intValue();
            ((float[]) this.f44466c)[i10] = ((Float) arrayList2.get(i10)).floatValue();
        }
    }

    public b(int i10, int i11) {
        this.f44464a = 21;
        this.f44465b = new int[]{i10, i11};
        this.f44466c = new float[]{0.0f, 1.0f};
    }

    public b(Context context, MediaSessionCompat$Token mediaSessionCompat$Token) {
        this.f44464a = 4;
        if (mediaSessionCompat$Token != null) {
            this.f44466c = DesugarCollections.synchronizedSet(new HashSet());
            if (Build.VERSION.SDK_INT >= 29) {
                this.f44465b = new android.support.v4.media.session.h(context, mediaSessionCompat$Token);
                return;
            } else {
                this.f44465b = new android.support.v4.media.session.h(context, mediaSessionCompat$Token);
                return;
            }
        }
        throw new IllegalArgumentException("sessionToken must not be null");
    }

    public b(int i10, int i11, int i12) {
        this.f44464a = 21;
        this.f44465b = new int[]{i10, i11, i12};
        this.f44466c = new float[]{0.0f, 0.5f, 1.0f};
    }

    @Override
    public void b(e2.k0 k0Var, c3.q qVar, j4.f0 f0Var) {
    }

    public b(a3.f fVar) {
        this.f44464a = 1;
        this.f44466c = fVar;
    }

    public b(x1 x1Var, int[] iArr) {
        this.f44464a = 15;
        this.f44465b = n0.u(x1Var);
        this.f44466c = iArr;
    }

    public b(d0 d0Var) {
        this.f44464a = 24;
        this.f44466c = d0Var;
        this.f44465b = new a4.g(new byte[4], 4);
    }

    public b(aa.a aVar) {
        this.f44464a = 7;
        this.f44465b = aVar;
        this.f44466c = new AtomicBoolean(false);
    }
}
