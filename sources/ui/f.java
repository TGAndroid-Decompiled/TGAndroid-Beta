package ui;

import a0.l;
import ai.f2;
import ai.t6;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.emoji2.text.t;
import b4.m;
import b8.ke;
import b8.p9;
import b8.zb;
import d2.a1;
import d2.x0;
import g2.n0;
import g2.y;
import g9.i0;
import g9.t0;
import gi.n3;
import gi.w5;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.Inflater;
import k2.p1;
import l.a0;
import l.k;
import l.r;
import m2.s;
import o4.e0;
import o4.j1;
import o4.n1;
import o4.o1;
import o4.v;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.messenger.r0;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.j50;
import org.telegram.ui.Components.ki0;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.qv0;
import org.telegram.ui.vx0;
import org.telegram.ui.zx0;
import p4.q;
import vg.v0;
import wd.z;
import x7.n6;
import za.p;
public final class f implements m, ki0, zx0, p5.b {
    public static volatile f f56388f;
    public final int f56389a;
    public Object f56390b;
    public Object f56391c;
    public Object d;
    public Object f56392e;

    public f(int i3, boolean z10) {
        this.f56389a = i3;
    }

    public boolean A(k.a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f56390b).onActionItemClicked(l(aVar), new r((Context) this.f56391c, (l0.a) menuItem));
    }

    @Override
    public b4.d B(int i3, int i10, byte[] bArr) {
        return a1.g.a(this, bArr, i10);
    }

    public boolean C(k.a aVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f56390b;
        k.e l10 = l(aVar);
        l lVar = (l) this.f56392e;
        Menu menu2 = (Menu) lVar.get(menu);
        if (menu2 == null) {
            menu2 = new a0((Context) this.f56391c, (k) menu);
            lVar.put(menu, menu2);
        }
        return callback.onCreateActionMode(l10, menu2);
    }

    @Override
    public void E(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i3, boolean z10) {
        int i10 = this.f56389a;
    }

    @Override
    public void F(byte[] bArr, int i3, int i10, b4.l lVar, g2.k kVar) {
        f2.b bVar;
        int i11;
        int i12;
        int i13;
        int A;
        int i14;
        int i15;
        int D;
        e4.a aVar = (e4.a) this.d;
        y yVar = (y) this.f56391c;
        y yVar2 = (y) this.f56390b;
        yVar2.L(i3 + i10, bArr);
        yVar2.N(i3);
        if (((Inflater) this.f56392e) == null) {
            this.f56392e = new Inflater();
        }
        if (n0.Q(yVar2, yVar, (Inflater) this.f56392e)) {
            yVar2.L(yVar.f11925c, yVar.f11923a);
        }
        int i16 = 0;
        aVar.d = 0;
        int[] iArr = aVar.f9547b;
        y yVar3 = aVar.f9546a;
        aVar.f9549e = 0;
        aVar.f9550f = 0;
        aVar.f9551g = 0;
        aVar.h = 0;
        aVar.f9552i = 0;
        yVar3.K(0);
        aVar.f9548c = false;
        ArrayList arrayList = new ArrayList();
        while (yVar2.a() >= 3) {
            int i17 = yVar2.f11925c;
            int A2 = yVar2.A();
            int H = yVar2.H();
            int i18 = yVar2.f11924b + H;
            if (i18 > i17) {
                yVar2.N(i17);
                i11 = i16;
                bVar = null;
            } else {
                char c2 = 128;
                if (A2 != 128) {
                    switch (A2) {
                        case 20:
                            if (H % 5 == 2) {
                                yVar2.O(2);
                                Arrays.fill(iArr, i16);
                                int i19 = H / 5;
                                int i20 = i16;
                                while (i20 < i19) {
                                    int A3 = yVar2.A();
                                    char c10 = c2;
                                    double A4 = yVar2.A();
                                    double A5 = yVar2.A() - 128;
                                    double A6 = yVar2.A() - 128;
                                    iArr[A3] = n0.i((int) ((A6 * 1.772d) + A4), 0, 255) | (yVar2.A() << 24) | (n0.i((int) ((1.402d * A5) + A4), 0, 255) << 16) | (n0.i((int) ((A4 - (0.34414d * A6)) - (A5 * 0.71414d)), 0, 255) << 8);
                                    i20++;
                                    c2 = c10;
                                    aVar = aVar;
                                }
                                aVar.f9548c = true;
                                break;
                            }
                            break;
                        case 21:
                            if (H >= 4) {
                                yVar2.O(3);
                                if ((128 & yVar2.A()) != 0) {
                                    i15 = 1;
                                } else {
                                    i15 = i16;
                                }
                                int i21 = H - 4;
                                if (i15 != 0) {
                                    if (i21 >= 7 && (D = yVar2.D()) >= 4) {
                                        aVar.h = yVar2.H();
                                        aVar.f9552i = yVar2.H();
                                        yVar3.K(D - 4);
                                        i21 = H - 11;
                                    }
                                }
                                int i22 = yVar3.f11924b;
                                int i23 = yVar3.f11925c;
                                if (i22 < i23 && i21 > 0) {
                                    int min = Math.min(i21, i23 - i22);
                                    yVar2.k(i22, min, yVar3.f11923a);
                                    yVar3.N(i22 + min);
                                    break;
                                }
                            }
                            break;
                        case 22:
                            if (H >= 19) {
                                aVar.d = yVar2.H();
                                aVar.f9549e = yVar2.H();
                                yVar2.O(11);
                                aVar.f9550f = yVar2.H();
                                aVar.f9551g = yVar2.H();
                                break;
                            }
                            break;
                    }
                    i11 = 0;
                    bVar = null;
                } else {
                    if (aVar.d != 0 && aVar.f9549e != 0 && aVar.h != 0 && aVar.f9552i != 0 && (i12 = yVar3.f11925c) != 0 && yVar3.f11924b == i12 && aVar.f9548c) {
                        yVar3.N(0);
                        int i24 = aVar.h * aVar.f9552i;
                        int[] iArr2 = new int[i24];
                        int i25 = 0;
                        while (i25 < i24) {
                            int A7 = yVar3.A();
                            if (A7 != 0) {
                                i13 = i25 + 1;
                                iArr2[i25] = iArr[A7];
                            } else {
                                int A8 = yVar3.A();
                                if (A8 != 0) {
                                    if ((A8 & 64) == 0) {
                                        A = A8 & 63;
                                    } else {
                                        A = ((A8 & 63) << 8) | yVar3.A();
                                    }
                                    if ((A8 & 128) == 0) {
                                        i14 = iArr[0];
                                    } else {
                                        i14 = iArr[yVar3.A()];
                                    }
                                    i13 = A + i25;
                                    Arrays.fill(iArr2, i25, i13, i14);
                                }
                            }
                            i25 = i13;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(iArr2, aVar.h, aVar.f9552i, Bitmap.Config.ARGB_8888);
                        float f10 = aVar.d;
                        float f11 = aVar.f9549e;
                        bVar = new f2.b(null, null, null, createBitmap, aVar.f9551g / f11, 0, 0, aVar.f9550f / f10, 0, Integer.MIN_VALUE, -3.4028235E38f, aVar.h / f10, aVar.f9552i / f11, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
                    } else {
                        bVar = null;
                    }
                    i11 = 0;
                    aVar.d = 0;
                    aVar.f9549e = 0;
                    aVar.f9550f = 0;
                    aVar.f9551g = 0;
                    aVar.h = 0;
                    aVar.f9552i = 0;
                    yVar3.K(0);
                    aVar.f9548c = false;
                }
                yVar2.N(i18);
            }
            if (bVar != null) {
                arrayList.add(bVar);
            }
            i16 = i11;
        }
        kVar.accept(new b4.a(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    public gf.f H(String str) {
        if (str != null) {
            df.g gVar = new df.g((ArrayList) this.f56390b, (hf.b) this.d, (ArrayList) this.f56391c);
            int i3 = 0;
            while (true) {
                int length = str.length();
                int i10 = i3;
                while (true) {
                    if (i10 < length) {
                        char charAt = str.charAt(i10);
                        if (charAt == '\n' || charAt == '\r') {
                            break;
                        }
                        i10++;
                    } else {
                        i10 = -1;
                        break;
                    }
                }
                if (i10 == -1) {
                    break;
                }
                gVar.i(str.substring(i3, i10));
                i3 = i10 + 1;
                if (i3 < str.length() && str.charAt(i10) == '\r' && str.charAt(i3) == '\n') {
                    i3 = i10 + 2;
                }
            }
            if (str.length() > 0 && (i3 == 0 || i3 < str.length())) {
                gVar.i(str.substring(i3));
            }
            gVar.f(gVar.f8873n);
            hf.a A = gVar.f8869j.A(new q(gVar.f8870k, gVar.f8872m));
            for (jf.a aVar : gVar.f8874o) {
                aVar.g(A);
            }
            gf.f fVar = (gf.f) gVar.f8871l.f8859b;
            Iterator it = ((ArrayList) this.f56392e).iterator();
            if (!it.hasNext()) {
                return fVar;
            }
            throw a1.g.m(it);
        }
        throw new NullPointerException("input must not be null");
    }

    public void I() {
        boolean z10;
        if (((e) this.f56391c) == null) {
            e eVar = (e) ((ArrayDeque) this.f56390b).pollFirst();
            this.f56391c = eVar;
            if (eVar != null) {
                c cVar = new c(this, eVar, 0);
                this.d = cVar;
                g0.i3(cVar, 10000L);
                a aVar = eVar.f56386b;
                String str = aVar.f56372b;
                String str2 = aVar.f56375f;
                d dVar = new d(this, eVar);
                p7.d k10 = j.k(str);
                byte[] f10 = j.f(str2);
                int i3 = 0;
                if (k10 != null && f10 != null) {
                    try {
                        z10 = p9.a("WEB_MESSAGE_LISTENER");
                    } catch (Throwable th2) {
                        a8.g(th2, true);
                        z10 = false;
                    }
                    if (z10) {
                        synchronized (j.f56399y) {
                            j jVar = j.A;
                            if (jVar != null) {
                                jVar.q();
                                j.A = null;
                            }
                            try {
                                j jVar2 = new j(k10, str2, f10);
                                j.A = jVar2;
                                jVar2.f56421x = dVar;
                                r0 r0Var = r0.f25016f;
                                if (r0Var != null) {
                                    r0Var.d.add(jVar2);
                                }
                                jVar2.f56408j.execute(new g(jVar2, 1));
                                g0.h3(new g(jVar2, 2));
                                i3 = j.A.f56407i.getLocalPort();
                            } catch (Exception e10) {
                                a8.g(e10, true);
                                j jVar3 = j.A;
                                if (jVar3 != null) {
                                    jVar3.q();
                                    j.A = null;
                                }
                            }
                        }
                    }
                }
                eVar.d = i3;
                if (i3 == 0) {
                    h(eVar);
                }
            }
        }
    }

    @Override
    public void J() {
        int i3 = this.f56389a;
    }

    public void K(v vVar) {
        synchronized (this.f56390b) {
            try {
                o4.h hVar = (o4.h) ((a0.f) this.d).remove(vVar);
                if (hVar == null) {
                    return;
                }
                ((a0.f) this.f56391c).remove(hVar.f20652a);
                hVar.f20653b.g();
                e0 e0Var = (e0) ((WeakReference) this.f56392e).get();
                if (e0Var != null && !e0Var.j()) {
                    n0.W(e0Var.f20628l, new o4.e(e0Var, vVar, 0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void L(View view) {
        f2 f2Var = (f2) this.f56392e;
        if (((View) this.f56391c) == view) {
            return;
        }
        M(null);
        View view2 = (View) this.f56391c;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(f2Var);
        }
        if (view != null) {
            view.addOnAttachStateChangeListener(f2Var);
            if (view.isAttachedToWindow()) {
                M(view.getViewTreeObserver());
            }
        }
        this.f56391c = view;
    }

    public void M(ViewTreeObserver viewTreeObserver) {
        n3 n3Var = (n3) this.f56390b;
        ViewTreeObserver viewTreeObserver2 = (ViewTreeObserver) this.d;
        if (viewTreeObserver2 == viewTreeObserver) {
            return;
        }
        if (viewTreeObserver2 != null && viewTreeObserver2.isAlive()) {
            ((ViewTreeObserver) this.d).removeOnGlobalLayoutListener(n3Var);
        }
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(n3Var);
        }
        this.d = viewTreeObserver;
    }

    @Override
    public boolean O() {
        switch (this.f56389a) {
            case 10:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int Y() {
        return 2;
    }

    public void a(Object obj, v vVar, o1 o1Var, a1 a1Var) {
        synchronized (this.f56390b) {
            try {
                v o10 = o(obj);
                if (o10 == null) {
                    ((a0.f) this.f56391c).put(obj, vVar);
                    ?? obj2 = new Object();
                    obj2.f6737c = new Object();
                    obj2.d = new l(0);
                    ((a0.f) this.d).put(vVar, new o4.h(obj, obj2, o1Var, a1Var));
                } else {
                    o4.h hVar = (o4.h) ((a0.f) this.d).get(o10);
                    hVar.getClass();
                    hVar.d = o1Var;
                    hVar.f20655e = a1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b(v vVar, int i3, o4.g gVar) {
        synchronized (this.f56390b) {
            try {
                o4.h hVar = (o4.h) ((a0.f) this.d).get(vVar);
                if (hVar != null) {
                    a1 a1Var = hVar.f20657g;
                    a1Var.getClass();
                    ba.i iVar = new ba.i();
                    iVar.c(a1Var.f8026a);
                    iVar.b(i3);
                    hVar.f20657g = new a1(iVar.d());
                    hVar.f20654c.add(gVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c(Canvas canvas, int i3) {
        ArrayList arrayList = (ArrayList) this.d;
        canvas.clipRect(0, 0, i3, g0.L(14.66f));
        RectF rectF = g0.P;
        float f10 = i3;
        rectF.set(0.0f, 0.0f, f10, g0.L(14.66f));
        canvas.saveLayerAlpha(rectF, 255, 31);
        if (bd.f21784a0) {
            canvas.translate(f10, 0.0f);
        }
        int L = i3 - g0.L(25.0f);
        int i10 = 0;
        while (i10 < arrayList.size()) {
            mr mrVar = (mr) arrayList.get(i10);
            L = org.telegram.messenger.camera.q.w(4.0f, mrVar.f36237g, L);
            if (L < 0) {
                break;
            }
            if (bd.f21784a0) {
                canvas.translate(-mrVar.f36237g, 0.0f);
                mrVar.a(canvas);
                canvas.translate(-g0.L(4.0f), 0.0f);
            } else {
                mrVar.a(canvas);
                canvas.translate(g0.L(4.0f) + mrVar.f36237g, 0.0f);
            }
            i10++;
        }
        if (i10 < arrayList.size()) {
            int size = arrayList.size() - i10;
            mr mrVar2 = (mr) this.f56392e;
            if (mrVar2 == null || mrVar2.f36232a != size) {
                ?? obj = new Object();
                obj.f36232a = size;
                ly0 ly0Var = new ly0(p1.i(size, "+"), 10.0f, g0.o());
                ly0Var.r((t2) this.f56390b);
                obj.f36234c = ly0Var;
                int L2 = g0.L(9.32f);
                ly0 ly0Var2 = obj.f36234c;
                obj.f36237g = L2 + ((int) ly0Var2.f35918c);
                ly0Var2.i();
                int i11 = k6.f28064n8;
                obj.f36236f = i11;
                obj.f36235e = true;
                obj.d = k6.x0(null, i11, false);
                this.f56392e = obj;
            }
            if (bd.f21784a0) {
                canvas.translate(-((mr) this.f56392e).f36237g, 0.0f);
                ((mr) this.f56392e).a(canvas);
                canvas.translate(-g0.L(4.0f), 0.0f);
            } else {
                ((mr) this.f56392e).a(canvas);
                canvas.translate(g0.L(4.0f) + ((mr) this.f56392e).f36237g, 0.0f);
            }
        }
        canvas.restore();
    }

    @Override
    public void f() {
        g0.i3(new vx0((d2) this.f56390b, (Context) this.f56391c, (e6) this.d, (j50) this.f56392e, 2), 200L);
    }

    @Override
    public void g() {
        g0.i3(new qv0(9, (d2) this.f56390b, (j50) this.f56392e), 200L);
    }

    @Override
    public Object mo5get() {
        return new p((Executor) ((cd.a) this.f56390b).mo5get(), (u5.d) ((cd.a) this.f56391c).mo5get(), (p7.d) ((p7.d) this.d).mo5get(), (v5.c) ((cd.a) this.f56392e).mo5get());
    }

    public void h(e eVar) {
        if (((e) this.f56391c) != eVar) {
            return;
        }
        c cVar = (c) this.d;
        if (cVar != null) {
            g0.r(cVar);
            this.d = null;
        }
        c cVar2 = (c) this.f56392e;
        if (cVar2 != null) {
            g0.r(cVar2);
            this.f56392e = null;
        }
        synchronized (j.f56399y) {
            try {
                j jVar = j.A;
                if (jVar != null) {
                    jVar.q();
                    j.A = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f56391c = null;
        eVar.f56387c.run(-1L);
        I();
    }

    @Override
    public void i() {
        d2 d2Var = (d2) this.f56390b;
        d2Var.showDialog(new v0(d2Var, 3, true));
    }

    public void j(o4.h hVar) {
        e0 e0Var = (e0) ((WeakReference) this.f56392e).get();
        if (e0Var != null) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            while (atomicBoolean.get()) {
                atomicBoolean.set(false);
                o4.g gVar = (o4.g) hVar.f20654c.poll();
                if (gVar == null) {
                    hVar.f20656f = false;
                    return;
                }
                AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
                o4.h hVar2 = hVar;
                n0.W(e0Var.f20628l, new s(e0Var, o(hVar.f20652a), new t6(this, gVar, atomicBoolean2, hVar2, atomicBoolean, 19)));
                atomicBoolean2.set(false);
                hVar = hVar2;
            }
        }
    }

    public void k(final v vVar) {
        synchronized (this.f56390b) {
            try {
                o4.h hVar = (o4.h) ((a0.f) this.d).get(vVar);
                if (hVar == null) {
                    return;
                }
                final a1 a1Var = hVar.f20657g;
                hVar.f20657g = a1.f8024b;
                hVar.f20654c.add(new o4.g(vVar, a1Var) {
                    public final v f20643b;

                    @Override
                    public final l9.y run() {
                        e0 e0Var = (e0) ((WeakReference) ui.f.this.f56392e).get();
                        if (e0Var != null) {
                            e0Var.p(this.f20643b);
                        }
                        return l9.w.f18167b;
                    }
                });
                if (hVar.f20656f) {
                    return;
                }
                hVar.f20656f = true;
                j(hVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public k.e l(k.a aVar) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            k.e eVar = (k.e) arrayList.get(i3);
            if (eVar != null && eVar.f16394b == aVar) {
                return eVar;
            }
        }
        k.e eVar2 = new k.e((Context) this.f56391c, aVar);
        arrayList.add(eVar2);
        return eVar2;
    }

    public a1 m(v vVar) {
        synchronized (this.f56390b) {
            try {
                o4.h hVar = (o4.h) ((a0.f) this.d).get(vVar);
                if (hVar != null) {
                    return hVar.f20655e;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public i0 n() {
        i0 q10;
        synchronized (this.f56390b) {
            q10 = i0.q(((a0.f) this.f56391c).values());
        }
        return q10;
    }

    public v o(Object obj) {
        v vVar;
        synchronized (this.f56390b) {
            vVar = (v) ((a0.f) this.f56391c).get(obj);
        }
        return vVar;
    }

    public x0 p(v vVar) {
        synchronized (this.f56390b) {
            try {
                return ((o4.h) ((a0.f) this.d).get(vVar)) != null ? null : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public j1 q(v vVar) {
        synchronized (this.f56390b) {
            try {
                if (((o4.h) ((a0.f) this.d).get(vVar)) != null) {
                    return null;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public boolean r() {
        switch (this.f56389a) {
            case 10:
                return true;
            default:
                return true;
        }
    }

    public com.google.android.gms.common.api.internal.s s(v vVar) {
        o4.h hVar;
        synchronized (this.f56390b) {
            hVar = (o4.h) ((a0.f) this.d).get(vVar);
        }
        if (hVar != null) {
            return hVar.f20653b;
        }
        return null;
    }

    public boolean t(v vVar) {
        boolean z10;
        synchronized (this.f56390b) {
            if (((a0.f) this.d).get(vVar) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public String toString() {
        switch (this.f56389a) {
            case 15:
                return ((i9) this.f56392e).toString();
            default:
                return super.toString();
        }
    }

    public boolean u() {
        return ((ArrayList) this.d).isEmpty();
    }

    @Override
    public boolean v() {
        switch (this.f56389a) {
            case 10:
                return false;
            default:
                return false;
        }
    }

    public boolean w(v vVar, int i3) {
        o4.h hVar;
        synchronized (this.f56390b) {
            hVar = (o4.h) ((a0.f) this.d).get(vVar);
        }
        e0 e0Var = (e0) ((WeakReference) this.f56392e).get();
        if (hVar != null && hVar.f20655e.a(i3) && e0Var != null && e0Var.f20636t.t().a(i3)) {
            return true;
        }
        return false;
    }

    public boolean x(v vVar, int i3) {
        o4.h hVar;
        boolean z10;
        synchronized (this.f56390b) {
            hVar = (o4.h) ((a0.f) this.d).get(vVar);
        }
        if (hVar != null) {
            o1 o1Var = hVar.d;
            o1Var.getClass();
            if (i3 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            zb.e("Use contains(Command) for custom command", z10);
            for (n1 n1Var : o1Var.f20791a) {
                if (n1Var.f20763a == i3) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean y(v vVar, n1 n1Var) {
        o4.h hVar;
        synchronized (this.f56390b) {
            hVar = (o4.h) ((a0.f) this.d).get(vVar);
        }
        if (hVar != null) {
            t0 t0Var = hVar.d.f20791a;
            n1Var.getClass();
            if (t0Var.contains(n1Var) || o4.d.j(n1Var.f20764b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void z(android.view.View r13, dh.n0 r14, boolean r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: ui.f.z(android.view.View, dh.n0, boolean, boolean):void");
    }

    public f(Object obj, Object obj2, Object obj3, Object obj4, int i3) {
        this.f56389a = i3;
        this.f56392e = obj;
        this.f56390b = obj2;
        this.f56391c = obj3;
        this.d = obj4;
    }

    public f(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i3) {
        this.f56389a = i3;
        this.f56390b = obj;
        this.f56391c = obj2;
        this.d = obj3;
        this.f56392e = obj4;
    }

    public f(n3 n3Var) {
        this.f56389a = 16;
        this.f56392e = new f2(this, 16);
        this.f56390b = n3Var;
    }

    public f(z zVar, l1.y yVar, ae.d dVar) {
        this.f56389a = 6;
        this.f56390b = zVar;
        this.f56391c = dVar;
        this.d = n6.a(Integer.MAX_VALUE, null, 6);
        this.f56392e = new w5(8);
        wd.a1 a1Var = (wd.a1) zVar.c().get(wd.y.f57551b);
        if (a1Var != null) {
            a1Var.invokeOnCompletion(new l1.v0(yVar, this, 1));
        }
    }

    public f(ke keVar) {
        this.f56389a = 4;
        LinkedHashSet linkedHashSet = df.g.f8860p;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll((ArrayList) keVar.f2716b);
        for (Class cls : (LinkedHashSet) keVar.f2718e) {
            arrayList.add(df.g.f8861q.get(cls));
        }
        this.f56390b = arrayList;
        hf.b bVar = (q) keVar.f2719f;
        bVar = bVar == null ? new mb.b(10) : bVar;
        this.d = bVar;
        this.f56392e = (ArrayList) keVar.d;
        ArrayList arrayList2 = (ArrayList) keVar.f2717c;
        this.f56391c = arrayList2;
        bVar.A(new q(arrayList2, Collections.EMPTY_MAP));
    }

    public f(t2 t2Var) {
        this.f56389a = 9;
        this.f56391c = new ArrayList();
        this.d = new ArrayList();
        this.f56392e = null;
        this.f56390b = t2Var;
    }

    public f(int i3) {
        this.f56389a = i3;
        switch (i3) {
            case 3:
                this.f56390b = new y();
                this.f56391c = new y();
                this.d = new e4.a();
                return;
            case 8:
                this.f56390b = new ArrayList();
                this.f56391c = new ArrayList();
                this.d = new ArrayList();
                this.f56392e = new ArrayList();
                return;
            default:
                this.f56390b = new ArrayDeque();
                return;
        }
    }

    public f(e0 e0Var) {
        this.f56389a = 7;
        this.f56391c = new l(0);
        this.d = new l(0);
        this.f56390b = new Object();
        this.f56392e = new WeakReference(e0Var);
    }

    public f(Typeface typeface, r1.b bVar) {
        int i3;
        int i10;
        int i11;
        int i12;
        this.f56389a = 1;
        this.f56392e = typeface;
        this.f56390b = bVar;
        this.d = new t(1024);
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i13 = a10 + bVar.f54061a;
            i3 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i13) + i13);
        } else {
            i3 = 0;
        }
        this.f56391c = new char[i3 * 2];
        int a11 = bVar.a(6);
        if (a11 != 0) {
            int i14 = a11 + bVar.f54061a;
            i10 = ((ByteBuffer) bVar.d).getInt(((ByteBuffer) bVar.d).getInt(i14) + i14);
        } else {
            i10 = 0;
        }
        for (int i15 = 0; i15 < i10; i15++) {
            androidx.emoji2.text.p pVar = new androidx.emoji2.text.p(this, i15);
            r1.a b10 = pVar.b();
            int a12 = b10.a(4);
            Character.toChars(a12 != 0 ? ((ByteBuffer) b10.d).getInt(a12 + b10.f54061a) : 0, (char[]) this.f56391c, i15 * 2);
            r1.a b11 = pVar.b();
            int a13 = b11.a(16);
            if (a13 != 0) {
                int i16 = a13 + b11.f54061a;
                i11 = ((ByteBuffer) b11.d).getInt(((ByteBuffer) b11.d).getInt(i16) + i16);
            } else {
                i11 = 0;
            }
            if (i11 > 0) {
                t tVar = (t) this.d;
                r1.a b12 = pVar.b();
                int a14 = b12.a(16);
                if (a14 != 0) {
                    int i17 = a14 + b12.f54061a;
                    i12 = ((ByteBuffer) b12.d).getInt(((ByteBuffer) b12.d).getInt(i17) + i17);
                } else {
                    i12 = 0;
                }
                tVar.a(pVar, 0, i12 - 1);
            } else {
                throw new IllegalArgumentException("invalid metadata codepoint length");
            }
        }
    }

    public f(Context context, ActionMode.Callback callback) {
        this.f56389a = 5;
        this.f56391c = context;
        this.f56390b = callback;
        this.d = new ArrayList();
        this.f56392e = new l(0);
    }

    private final void D() {
    }

    private final void G() {
    }

    @Override
    public void reset() {
    }

    private final void d(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i3, boolean z10) {
    }

    private final void e(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i3, boolean z10) {
    }
}
