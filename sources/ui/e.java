package ui;

import a0.l;
import a8.ia;
import a8.n9;
import a8.p0;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.i0;
import androidx.fragment.app.l0;
import androidx.fragment.app.o0;
import androidx.fragment.app.r;
import c4.m;
import c8.ha;
import com.google.android.gms.common.api.internal.s;
import e2.v0;
import e2.y0;
import h2.j;
import h2.m0;
import h2.x;
import h9.t0;
import h9.t1;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.Inflater;
import l.a0;
import l.k;
import m1.b0;
import org.telegram.messenger.a8;
import org.telegram.messenger.camera.q;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.r0;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Components.hi0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.v80;
import org.telegram.ui.by0;
import org.telegram.ui.c01;
import org.telegram.ui.ey0;
import org.telegram.ui.hy0;
import org.telegram.ui.jy0;
import org.telegram.ui.web.w;
import p4.d0;
import p4.e1;
import p4.i1;
import p4.j1;
import p4.v;
import ug.w0;
import x2.q1;
import y7.i6;
public final class e implements m, hi0, jy0 {
    public static volatile e f56836f;
    public final int f56837a;
    public final Object f56838b;
    public Object f56839c;
    public Object d;
    public Object f56840e;

    public e(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f56837a = i7;
        this.f56840e = obj;
        this.f56838b = obj2;
        this.f56839c = obj3;
        this.d = obj4;
    }

    public v0 A(v vVar) {
        synchronized (this.f56838b) {
            try {
                return ((p4.h) ((a0.f) this.d).get(vVar)) != null ? null : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public e1 B(v vVar) {
        synchronized (this.f56838b) {
            try {
                if (((p4.h) ((a0.f) this.d).get(vVar)) != null) {
                    return null;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public s C(v vVar) {
        p4.h hVar;
        synchronized (this.f56838b) {
            hVar = (p4.h) ((a0.f) this.d).get(vVar);
        }
        if (hVar != null) {
            return hVar.f53189b;
        }
        return null;
    }

    public boolean D(v vVar) {
        boolean z9;
        synchronized (this.f56838b) {
            if (((a0.f) this.d).get(vVar) != null) {
                z9 = true;
            } else {
                z9 = false;
            }
        }
        return z9;
    }

    @Override
    public boolean E() {
        switch (this.f56837a) {
            case 9:
                return false;
            default:
                return false;
        }
    }

    public boolean F() {
        return ((ArrayList) this.d).isEmpty();
    }

    public boolean G(v vVar, int i7) {
        p4.h hVar;
        synchronized (this.f56838b) {
            hVar = (p4.h) ((a0.f) this.d).get(vVar);
        }
        d0 d0Var = (d0) ((WeakReference) this.f56840e).get();
        if (hVar != null && hVar.f53191e.a(i7) && d0Var != null && d0Var.f53124t.t().a(i7)) {
            return true;
        }
        return false;
    }

    public boolean H(v vVar, int i7) {
        p4.h hVar;
        boolean z9;
        synchronized (this.f56838b) {
            hVar = (p4.h) ((a0.f) this.d).get(vVar);
        }
        if (hVar != null) {
            j1 j1Var = hVar.d;
            j1Var.getClass();
            if (i7 != 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            ia.e("Use contains(Command) for custom command", z9);
            for (i1 i1Var : j1Var.f53242a) {
                if (i1Var.f53214a == i7) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean I(v vVar, i1 i1Var) {
        p4.h hVar;
        synchronized (this.f56838b) {
            hVar = (p4.h) ((a0.f) this.d).get(vVar);
        }
        if (hVar != null) {
            t0 t0Var = hVar.d.f53242a;
            i1Var.getClass();
            if (t0Var.contains(i1Var) || p4.d.j(i1Var.f53215b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void J(o0 o0Var) {
        r rVar = o0Var.f2467c;
        String str = rVar.f2493e;
        HashMap hashMap = (HashMap) this.f56839c;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(rVar.f2493e, o0Var);
        if (i0.K(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + rVar);
        }
    }

    public void K(o0 o0Var) {
        HashMap hashMap = (HashMap) this.f56839c;
        r rVar = o0Var.f2467c;
        if (rVar.S) {
            ((l0) this.f56840e).f(rVar);
        }
        if (hashMap.get(rVar.f2493e) == o0Var && ((o0) hashMap.put(rVar.f2493e, null)) != null && i0.K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + rVar);
        }
    }

    @Override
    public void L(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z9) {
        int i10 = this.f56837a;
    }

    @Override
    public void M() {
        int i7 = this.f56837a;
    }

    public boolean N(k.a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f56838b).onActionItemClicked(r(aVar), new l.r((Context) this.f56839c, (l0.a) menuItem));
    }

    public boolean O(k.a aVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f56838b;
        k.e r10 = r(aVar);
        l lVar = (l) this.f56840e;
        Menu menu2 = (Menu) lVar.get(menu);
        if (menu2 == null) {
            menu2 = new a0((Context) this.f56839c, (k) menu);
            lVar.put(menu, menu2);
        }
        return callback.onCreateActionMode(r10, menu2);
    }

    @Override
    public int P() {
        return 2;
    }

    public void S() {
        boolean z9;
        if (((d) this.f56839c) == null) {
            d dVar = (d) ((ArrayDeque) this.f56838b).pollFirst();
            this.f56839c = dVar;
            if (dVar != null) {
                b bVar = new b(this, dVar, 0);
                this.d = bVar;
                g0.i3(bVar, 10000L);
                a aVar = dVar.f56834b;
                String str = aVar.f56824b;
                String str2 = aVar.f56827f;
                c cVar = new c(this, dVar);
                hy0 k10 = i.k(str);
                byte[] f10 = i.f(str2);
                int i7 = 0;
                if (k10 != null && f10 != null) {
                    try {
                        z9 = n9.a("WEB_MESSAGE_LISTENER");
                    } catch (Throwable th2) {
                        a8.g(th2, true);
                        z9 = false;
                    }
                    if (z9) {
                        synchronized (i.f56847y) {
                            i iVar = i.A;
                            if (iVar != null) {
                                iVar.q();
                                i.A = null;
                            }
                            try {
                                i iVar2 = new i(k10, str2, f10);
                                i.A = iVar2;
                                iVar2.f56869x = cVar;
                                r0 r0Var = r0.f25173f;
                                if (r0Var != null) {
                                    r0Var.d.add(iVar2);
                                }
                                iVar2.f56856j.execute(new f(iVar2, 1));
                                g0.h3(new f(iVar2, 2));
                                i7 = i.A.f56855i.getLocalPort();
                            } catch (Exception e10) {
                                a8.g(e10, true);
                                i iVar3 = i.A;
                                if (iVar3 != null) {
                                    iVar3.q();
                                    i.A = null;
                                }
                            }
                        }
                    }
                }
                dVar.d = i7;
                if (i7 == 0) {
                    m(dVar);
                }
            }
        }
    }

    public void T(v vVar) {
        synchronized (this.f56838b) {
            try {
                p4.h hVar = (p4.h) ((a0.f) this.d).remove(vVar);
                if (hVar == null) {
                    return;
                }
                ((a0.f) this.f56839c).remove(hVar.f53188a);
                hVar.f53189b.g();
                d0 d0Var = (d0) ((WeakReference) this.f56840e).get();
                if (d0Var != null && !d0Var.j()) {
                    m0.W(d0Var.f53116l, new p4.e(d0Var, vVar, 0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public boolean U() {
        switch (this.f56837a) {
            case 9:
                return false;
            default:
                return false;
        }
    }

    public java.lang.Object V(kd.c r8) {
        throw new UnsupportedOperationException("Method not decompiled: ui.e.V(kd.c):java.lang.Object");
    }

    public Bundle W(String str, Bundle bundle) {
        HashMap hashMap = (HashMap) this.d;
        if (bundle != null) {
            return (Bundle) hashMap.put(str, bundle);
        }
        return (Bundle) hashMap.remove(str);
    }

    @Override
    public void a() {
        g0.i3(new ey0((f2) this.f56838b, (Context) this.f56839c, (f6) this.d, (v80) this.f56840e, 2), 200L);
    }

    public void b(Object obj, v vVar, j1 j1Var, y0 y0Var) {
        synchronized (this.f56838b) {
            try {
                v x10 = x(obj);
                if (x10 == null) {
                    ((a0.f) this.f56839c).put(obj, vVar);
                    ?? obj2 = new Object();
                    obj2.f6682c = new Object();
                    obj2.d = new l(0);
                    ((a0.f) this.d).put(vVar, new p4.h(obj, obj2, j1Var, y0Var));
                } else {
                    p4.h hVar = (p4.h) ((a0.f) this.d).get(x10);
                    hVar.getClass();
                    hVar.d = j1Var;
                    hVar.f53191e = y0Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public c4.d c(int i7, int i10, byte[] bArr) {
        return p0.a(this, bArr, i10);
    }

    @Override
    public void d() {
        g0.i3(new by0(4, (f2) this.f56838b, (v80) this.f56840e), 200L);
    }

    public void e(r rVar) {
        if (!((ArrayList) this.f56838b).contains(rVar)) {
            synchronized (((ArrayList) this.f56838b)) {
                ((ArrayList) this.f56838b).add(rVar);
            }
            rVar.f2503w = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + rVar);
    }

    public void f(v vVar, int i7, p4.g gVar) {
        synchronized (this.f56838b) {
            try {
                p4.h hVar = (p4.h) ((a0.f) this.d).get(vVar);
                if (hVar != null) {
                    y0 y0Var = hVar.f53193g;
                    y0Var.getClass();
                    ca.i iVar = new ca.i();
                    iVar.c(y0Var.f10656a);
                    iVar.b(i7);
                    hVar.f53193g = new y0(iVar.d());
                    hVar.f53190c.add(gVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public void g() {
        f2 f2Var = (f2) this.f56838b;
        f2Var.showDialog(new w0(f2Var, 3, true));
    }

    public java.lang.Object h(kd.c r7) {
        throw new UnsupportedOperationException("Method not decompiled: ui.e.h(kd.c):java.lang.Object");
    }

    @Override
    public void i(android.view.View r13, ch.o0 r14, boolean r15, boolean r16) {
        throw new UnsupportedOperationException("Method not decompiled: ui.e.i(android.view.View, ch.o0, boolean, boolean):void");
    }

    public void j(Canvas canvas, int i7) {
        ArrayList arrayList = (ArrayList) this.d;
        canvas.clipRect(0, 0, i7, g0.L(14.66f));
        RectF rectF = g0.P;
        float f10 = i7;
        rectF.set(0.0f, 0.0f, f10, g0.L(14.66f));
        canvas.saveLayerAlpha(rectF, 255, 31);
        if (hd.f22878a0) {
            canvas.translate(f10, 0.0f);
        }
        int L = i7 - g0.L(25.0f);
        int i10 = 0;
        while (i10 < arrayList.size()) {
            mr mrVar = (mr) arrayList.get(i10);
            L = q.w(4.0f, mrVar.f36062g, L);
            if (L < 0) {
                break;
            }
            if (hd.f22878a0) {
                canvas.translate(-mrVar.f36062g, 0.0f);
                mrVar.a(canvas);
                canvas.translate(-g0.L(4.0f), 0.0f);
            } else {
                mrVar.a(canvas);
                canvas.translate(g0.L(4.0f) + mrVar.f36062g, 0.0f);
            }
            i10++;
        }
        if (i10 < arrayList.size()) {
            int size = arrayList.size() - i10;
            mr mrVar2 = (mr) this.f56840e;
            if (mrVar2 == null || mrVar2.f36057a != size) {
                ?? obj = new Object();
                obj.f36057a = size;
                my0 my0Var = new my0(jg.g.j(size, "+"), 10.0f, g0.o());
                my0Var.r((t2) this.f56838b);
                obj.f36059c = my0Var;
                int L2 = g0.L(9.32f);
                my0 my0Var2 = obj.f36059c;
                obj.f36062g = L2 + ((int) my0Var2.f36125c);
                my0Var2.i();
                int i11 = k6.f28033n8;
                obj.f36061f = i11;
                obj.f36060e = true;
                obj.d = k6.x0(null, i11, false);
                this.f56840e = obj;
            }
            if (hd.f22878a0) {
                canvas.translate(-((mr) this.f56840e).f36062g, 0.0f);
                ((mr) this.f56840e).a(canvas);
                canvas.translate(-g0.L(4.0f), 0.0f);
            } else {
                ((mr) this.f56840e).a(canvas);
                canvas.translate(g0.L(4.0f) + ((mr) this.f56840e).f36062g, 0.0f);
            }
        }
        canvas.restore();
    }

    public void m(d dVar) {
        if (((d) this.f56839c) != dVar) {
            return;
        }
        b bVar = (b) this.d;
        if (bVar != null) {
            g0.r(bVar);
            this.d = null;
        }
        b bVar2 = (b) this.f56840e;
        if (bVar2 != null) {
            g0.r(bVar2);
            this.f56840e = null;
        }
        synchronized (i.f56847y) {
            try {
                i iVar = i.A;
                if (iVar != null) {
                    iVar.q();
                    i.A = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f56839c = null;
        dVar.f56835c.run(-1L);
        S();
    }

    public r n(String str) {
        o0 o0Var = (o0) ((HashMap) this.f56839c).get(str);
        if (o0Var != null) {
            return o0Var.f2467c;
        }
        return null;
    }

    public r o(String str) {
        for (o0 o0Var : ((HashMap) this.f56839c).values()) {
            if (o0Var != null) {
                r rVar = o0Var.f2467c;
                if (!str.equals(rVar.f2493e)) {
                    rVar = rVar.L.f2398c.o(str);
                }
                if (rVar != null) {
                    return rVar;
                }
            }
        }
        return null;
    }

    public void p(p4.h hVar) {
        d0 d0Var = (d0) ((WeakReference) this.f56840e).get();
        if (d0Var != null) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            while (atomicBoolean.get()) {
                atomicBoolean.set(false);
                p4.g gVar = (p4.g) hVar.f53190c.poll();
                if (gVar == null) {
                    hVar.f53192f = false;
                    return;
                }
                AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
                p4.h hVar2 = hVar;
                m0.W(d0Var.f53116l, new w(d0Var, x(hVar.f53188a), new c01(this, gVar, atomicBoolean2, hVar2, atomicBoolean, 8)));
                atomicBoolean2.set(false);
                hVar = hVar2;
            }
        }
    }

    public void q(final v vVar) {
        synchronized (this.f56838b) {
            try {
                p4.h hVar = (p4.h) ((a0.f) this.d).get(vVar);
                if (hVar == null) {
                    return;
                }
                final y0 y0Var = hVar.f53193g;
                hVar.f53193g = y0.f10654b;
                hVar.f53190c.add(new p4.g(vVar, y0Var) {
                    public final v f53175b;

                    @Override
                    public final m9.y run() {
                        d0 d0Var = (d0) ((WeakReference) ui.e.this.f56840e).get();
                        if (d0Var != null) {
                            d0Var.p(this.f53175b);
                        }
                        return m9.w.f19996b;
                    }
                });
                if (hVar.f53192f) {
                    return;
                }
                hVar.f53192f = true;
                p(hVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public k.e r(k.a aVar) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            k.e eVar = (k.e) arrayList.get(i7);
            if (eVar != null && eVar.f17112b == aVar) {
                return eVar;
            }
        }
        k.e eVar2 = new k.e((Context) this.f56839c, aVar);
        arrayList.add(eVar2);
        return eVar2;
    }

    public ArrayList s() {
        ArrayList arrayList = new ArrayList();
        for (o0 o0Var : ((HashMap) this.f56839c).values()) {
            if (o0Var != null) {
                arrayList.add(o0Var);
            }
        }
        return arrayList;
    }

    public ArrayList t() {
        ArrayList arrayList = new ArrayList();
        for (o0 o0Var : ((HashMap) this.f56839c).values()) {
            if (o0Var != null) {
                arrayList.add(o0Var.f2467c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public String toString() {
        switch (this.f56837a) {
            case 15:
                return ((i6) this.f56840e).toString();
            default:
                return super.toString();
        }
    }

    public y0 u(v vVar) {
        synchronized (this.f56838b) {
            try {
                p4.h hVar = (p4.h) ((a0.f) this.d).get(vVar);
                if (hVar != null) {
                    return hVar.f53191e;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public boolean v() {
        switch (this.f56837a) {
            case 9:
                return true;
            default:
                return true;
        }
    }

    public h9.i0 w() {
        h9.i0 q10;
        synchronized (this.f56838b) {
            q10 = h9.i0.q(((a0.f) this.f56839c).values());
        }
        return q10;
    }

    public v x(Object obj) {
        v vVar;
        synchronized (this.f56838b) {
            vVar = (v) ((a0.f) this.f56839c).get(obj);
        }
        return vVar;
    }

    public List y() {
        ArrayList arrayList;
        if (((ArrayList) this.f56838b).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f56838b)) {
            arrayList = new ArrayList((ArrayList) this.f56838b);
        }
        return arrayList;
    }

    @Override
    public void z(byte[] bArr, int i7, int i10, c4.l lVar, j jVar) {
        g2.b bVar;
        int i11;
        int i12;
        int i13;
        int A;
        int i14;
        int i15;
        int D;
        f4.a aVar = (f4.a) this.d;
        x xVar = (x) this.f56839c;
        x xVar2 = (x) this.f56838b;
        xVar2.L(i7 + i10, bArr);
        xVar2.N(i7);
        if (((Inflater) this.f56840e) == null) {
            this.f56840e = new Inflater();
        }
        if (m0.Q(xVar2, xVar, (Inflater) this.f56840e)) {
            xVar2.L(xVar.f14164c, xVar.f14162a);
        }
        int i16 = 0;
        aVar.d = 0;
        int[] iArr = aVar.f11106b;
        x xVar3 = aVar.f11105a;
        aVar.f11108e = 0;
        aVar.f11109f = 0;
        aVar.f11110g = 0;
        aVar.h = 0;
        aVar.f11111i = 0;
        xVar3.K(0);
        aVar.f11107c = false;
        ArrayList arrayList = new ArrayList();
        while (xVar2.a() >= 3) {
            int i17 = xVar2.f14164c;
            int A2 = xVar2.A();
            int H = xVar2.H();
            int i18 = xVar2.f14163b + H;
            if (i18 > i17) {
                xVar2.N(i17);
                i11 = i16;
                bVar = null;
            } else {
                char c10 = 128;
                if (A2 != 128) {
                    switch (A2) {
                        case 20:
                            if (H % 5 == 2) {
                                xVar2.O(2);
                                Arrays.fill(iArr, i16);
                                int i19 = H / 5;
                                int i20 = i16;
                                while (i20 < i19) {
                                    int A3 = xVar2.A();
                                    char c11 = c10;
                                    double A4 = xVar2.A();
                                    double A5 = xVar2.A() - 128;
                                    double A6 = xVar2.A() - 128;
                                    iArr[A3] = m0.i((int) ((A6 * 1.772d) + A4), 0, 255) | (xVar2.A() << 24) | (m0.i((int) ((1.402d * A5) + A4), 0, 255) << 16) | (m0.i((int) ((A4 - (0.34414d * A6)) - (A5 * 0.71414d)), 0, 255) << 8);
                                    i20++;
                                    c10 = c11;
                                    aVar = aVar;
                                }
                                aVar.f11107c = true;
                                break;
                            }
                            break;
                        case 21:
                            if (H >= 4) {
                                xVar2.O(3);
                                if ((128 & xVar2.A()) != 0) {
                                    i15 = 1;
                                } else {
                                    i15 = i16;
                                }
                                int i21 = H - 4;
                                if (i15 != 0) {
                                    if (i21 >= 7 && (D = xVar2.D()) >= 4) {
                                        aVar.h = xVar2.H();
                                        aVar.f11111i = xVar2.H();
                                        xVar3.K(D - 4);
                                        i21 = H - 11;
                                    }
                                }
                                int i22 = xVar3.f14163b;
                                int i23 = xVar3.f14164c;
                                if (i22 < i23 && i21 > 0) {
                                    int min = Math.min(i21, i23 - i22);
                                    xVar2.k(i22, min, xVar3.f14162a);
                                    xVar3.N(i22 + min);
                                    break;
                                }
                            }
                            break;
                        case 22:
                            if (H >= 19) {
                                aVar.d = xVar2.H();
                                aVar.f11108e = xVar2.H();
                                xVar2.O(11);
                                aVar.f11109f = xVar2.H();
                                aVar.f11110g = xVar2.H();
                                break;
                            }
                            break;
                    }
                    i11 = 0;
                    bVar = null;
                } else {
                    if (aVar.d != 0 && aVar.f11108e != 0 && aVar.h != 0 && aVar.f11111i != 0 && (i12 = xVar3.f14164c) != 0 && xVar3.f14163b == i12 && aVar.f11107c) {
                        xVar3.N(0);
                        int i24 = aVar.h * aVar.f11111i;
                        int[] iArr2 = new int[i24];
                        int i25 = 0;
                        while (i25 < i24) {
                            int A7 = xVar3.A();
                            if (A7 != 0) {
                                i13 = i25 + 1;
                                iArr2[i25] = iArr[A7];
                            } else {
                                int A8 = xVar3.A();
                                if (A8 != 0) {
                                    if ((A8 & 64) == 0) {
                                        A = A8 & 63;
                                    } else {
                                        A = ((A8 & 63) << 8) | xVar3.A();
                                    }
                                    if ((A8 & 128) == 0) {
                                        i14 = iArr[0];
                                    } else {
                                        i14 = iArr[xVar3.A()];
                                    }
                                    i13 = A + i25;
                                    Arrays.fill(iArr2, i25, i13, i14);
                                }
                            }
                            i25 = i13;
                        }
                        Bitmap createBitmap = Bitmap.createBitmap(iArr2, aVar.h, aVar.f11111i, Bitmap.Config.ARGB_8888);
                        float f10 = aVar.d;
                        float f11 = aVar.f11108e;
                        bVar = new g2.b(null, null, null, createBitmap, aVar.f11110g / f11, 0, 0, aVar.f11109f / f10, 0, Integer.MIN_VALUE, -3.4028235E38f, aVar.h / f10, aVar.f11111i / f11, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
                    } else {
                        bVar = null;
                    }
                    i11 = 0;
                    aVar.d = 0;
                    aVar.f11108e = 0;
                    aVar.f11109f = 0;
                    aVar.f11110g = 0;
                    aVar.h = 0;
                    aVar.f11111i = 0;
                    xVar3.K(0);
                    aVar.f11107c = false;
                }
                xVar2.N(i18);
            }
            if (bVar != null) {
                arrayList.add(bVar);
            }
            i16 = i11;
        }
        jVar.accept(new c4.a(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    public e(Object obj, Object obj2, Object obj3, Object obj4, boolean z9, int i7) {
        this.f56837a = i7;
        this.f56838b = obj;
        this.f56839c = obj2;
        this.d = obj3;
        this.f56840e = obj4;
    }

    public e(t2 t2Var) {
        this.f56837a = 8;
        this.f56839c = new ArrayList();
        this.d = new ArrayList();
        this.f56840e = null;
        this.f56838b = t2Var;
    }

    public e(int i7) {
        this.f56837a = i7;
        switch (i7) {
            case 1:
                this.f56838b = new ArrayList();
                this.f56839c = new HashMap();
                this.d = new HashMap();
                return;
            case 2:
                this.f56838b = new x();
                this.f56839c = new x();
                this.d = new f4.a();
                return;
            case 7:
                this.f56838b = new ArrayList();
                this.f56839c = new ArrayList();
                this.d = new ArrayList();
                this.f56840e = new ArrayList();
                return;
            default:
                this.f56838b = new ArrayDeque();
                return;
        }
    }

    public e(d0 d0Var) {
        this.f56837a = 12;
        this.f56839c = new l(0);
        this.d = new l(0);
        this.f56838b = new Object();
        this.f56840e = new WeakReference(d0Var);
    }

    public e(Context context, ActionMode.Callback callback) {
        this.f56837a = 4;
        this.f56839c = context;
        this.f56838b = callback;
        this.d = new ArrayList();
        this.f56840e = new l(0);
    }

    public e(ng.e eVar) {
        this.f56837a = 6;
        LinearLayout linearLayout = new LinearLayout(eVar.getContext());
        this.f56840e = linearLayout;
        linearLayout.setPadding(g0.L(4.0f), g0.L(2.0f), g0.L(4.0f), g0.L(2.0f));
        if (eVar.E) {
            TextView textView = new TextView(eVar.getContext());
            this.d = textView;
            linearLayout.addView(textView);
            textView.getLayoutParams().width = g0.L(36.0f);
            textView.setVisibility(8);
            textView.setTypeface(g0.o());
            textView.setTextSize(1, 13.0f);
        }
        TextView textView2 = new TextView(eVar.getContext());
        this.f56839c = textView2;
        linearLayout.addView(textView2, ha.k(0.0f, 0.0f, 20.0f, 0.0f, -2, -2));
        q5 q5Var = new q5(eVar.getContext());
        this.f56838b = q5Var;
        linearLayout.addView(q5Var, ha.o(-1, -2));
        textView2.setGravity(8388611);
        q5Var.setGravity(8388613);
        q5Var.setTypeface(g0.o());
        q5Var.setTextSize(1, 13.0f);
        textView2.setTextSize(1, 13.0f);
    }

    public e(t1 t1Var, i2.i iVar, q4.q qVar, i2.i iVar2) {
        Object obj;
        this.f56837a = 3;
        if (t1Var != null) {
            obj = h9.i0.q(t1Var);
        } else {
            h9.g0 g0Var = h9.i0.f14329b;
            obj = t1.f14397e;
        }
        this.f56838b = obj;
        this.f56839c = iVar;
        this.d = qVar;
        this.f56840e = iVar2;
    }

    public e(b0 b0Var, List list) {
        this.f56837a = 5;
        this.f56840e = b0Var;
        this.f56838b = new ie.d();
        this.f56839c = zd.b0.a();
        this.d = hd.f.l(list);
    }

    public e(q1 q1Var, boolean[] zArr) {
        this.f56837a = 14;
        this.f56838b = q1Var;
        this.f56839c = zArr;
        int i7 = q1Var.f58353a;
        this.d = new boolean[i7];
        this.f56840e = new boolean[i7];
    }

    private final void Q() {
    }

    private final void R() {
    }

    @Override
    public void reset() {
    }

    private final void k(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z9) {
    }

    private final void l(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z9) {
    }
}
