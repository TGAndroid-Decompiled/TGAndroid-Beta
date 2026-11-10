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
import org.telegram.messenger.id;
import org.telegram.messenger.r0;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.t2;
import org.telegram.ui.Components.hi0;
import org.telegram.ui.Components.lr;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.r80;
import org.telegram.ui.iy0;
import org.telegram.ui.ly0;
import org.telegram.ui.ny0;
import org.telegram.ui.rw0;
import org.telegram.ui.sw0;
import p4.d0;
import p4.e1;
import p4.i1;
import p4.j1;
import p4.v;
import ug.w0;
import x2.p1;
import y7.i6;
public final class e implements m, hi0, ny0 {
    public static volatile e f56937f;
    public final int f56938a;
    public final Object f56939b;
    public Object f56940c;
    public Object d;
    public Object f56941e;

    public e(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f56938a = i7;
        this.f56941e = obj;
        this.f56939b = obj2;
        this.f56940c = obj3;
        this.d = obj4;
    }

    public v0 A(v vVar) {
        synchronized (this.f56939b) {
            try {
                return ((p4.h) ((a0.f) this.d).get(vVar)) != null ? null : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public e1 B(v vVar) {
        synchronized (this.f56939b) {
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
        synchronized (this.f56939b) {
            hVar = (p4.h) ((a0.f) this.d).get(vVar);
        }
        if (hVar != null) {
            return hVar.f53294b;
        }
        return null;
    }

    public boolean D(v vVar) {
        boolean z9;
        synchronized (this.f56939b) {
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
        switch (this.f56938a) {
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
        synchronized (this.f56939b) {
            hVar = (p4.h) ((a0.f) this.d).get(vVar);
        }
        d0 d0Var = (d0) ((WeakReference) this.f56941e).get();
        if (hVar != null && hVar.f53296e.a(i7) && d0Var != null && d0Var.f53229t.t().a(i7)) {
            return true;
        }
        return false;
    }

    public boolean H(v vVar, int i7) {
        p4.h hVar;
        boolean z9;
        synchronized (this.f56939b) {
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
            for (i1 i1Var : j1Var.f53347a) {
                if (i1Var.f53319a == i7) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean I(v vVar, i1 i1Var) {
        p4.h hVar;
        synchronized (this.f56939b) {
            hVar = (p4.h) ((a0.f) this.d).get(vVar);
        }
        if (hVar != null) {
            t0 t0Var = hVar.d.f53347a;
            i1Var.getClass();
            if (t0Var.contains(i1Var) || p4.d.j(i1Var.f53320b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void J(o0 o0Var) {
        r rVar = o0Var.f2467c;
        String str = rVar.f2493e;
        HashMap hashMap = (HashMap) this.f56940c;
        if (hashMap.get(str) != null) {
            return;
        }
        hashMap.put(rVar.f2493e, o0Var);
        if (i0.K(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + rVar);
        }
    }

    public void K(o0 o0Var) {
        HashMap hashMap = (HashMap) this.f56940c;
        r rVar = o0Var.f2467c;
        if (rVar.S) {
            ((l0) this.f56941e).f(rVar);
        }
        if (hashMap.get(rVar.f2493e) == o0Var && ((o0) hashMap.put(rVar.f2493e, null)) != null && i0.K(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + rVar);
        }
    }

    @Override
    public void L(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z9) {
        int i10 = this.f56938a;
    }

    @Override
    public void M() {
        int i7 = this.f56938a;
    }

    public boolean N(k.a aVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f56939b).onActionItemClicked(r(aVar), new l.r((Context) this.f56940c, (l0.a) menuItem));
    }

    public boolean O(k.a aVar, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f56939b;
        k.e r10 = r(aVar);
        l lVar = (l) this.f56941e;
        Menu menu2 = (Menu) lVar.get(menu);
        if (menu2 == null) {
            menu2 = new a0((Context) this.f56940c, (k) menu);
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
        if (((d) this.f56940c) == null) {
            d dVar = (d) ((ArrayDeque) this.f56939b).pollFirst();
            this.f56940c = dVar;
            if (dVar != null) {
                b bVar = new b(this, dVar, 0);
                this.d = bVar;
                g0.i3(bVar, 10000L);
                a aVar = dVar.f56935b;
                String str = aVar.f56925b;
                String str2 = aVar.f56928f;
                c cVar = new c(this, dVar);
                ly0 k10 = i.k(str);
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
                        synchronized (i.f56948y) {
                            i iVar = i.A;
                            if (iVar != null) {
                                iVar.q();
                                i.A = null;
                            }
                            try {
                                i iVar2 = new i(k10, str2, f10);
                                i.A = iVar2;
                                iVar2.f56970x = cVar;
                                r0 r0Var = r0.f25190f;
                                if (r0Var != null) {
                                    r0Var.d.add(iVar2);
                                }
                                iVar2.f56957j.execute(new f(iVar2, 1));
                                g0.h3(new f(iVar2, 2));
                                i7 = i.A.f56956i.getLocalPort();
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
        synchronized (this.f56939b) {
            try {
                p4.h hVar = (p4.h) ((a0.f) this.d).remove(vVar);
                if (hVar == null) {
                    return;
                }
                ((a0.f) this.f56940c).remove(hVar.f53293a);
                hVar.f53294b.g();
                d0 d0Var = (d0) ((WeakReference) this.f56941e).get();
                if (d0Var != null && !d0Var.j()) {
                    m0.W(d0Var.f53221l, new p4.e(d0Var, vVar, 0));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public boolean U() {
        switch (this.f56938a) {
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
        g0.i3(new iy0((f2) this.f56939b, (Context) this.f56940c, (h6) this.d, (r80) this.f56941e, 2), 200L);
    }

    public void b(Object obj, v vVar, j1 j1Var, y0 y0Var) {
        synchronized (this.f56939b) {
            try {
                v x10 = x(obj);
                if (x10 == null) {
                    ((a0.f) this.f56940c).put(obj, vVar);
                    ?? obj2 = new Object();
                    obj2.f6685c = new Object();
                    obj2.d = new l(0);
                    ((a0.f) this.d).put(vVar, new p4.h(obj, obj2, j1Var, y0Var));
                } else {
                    p4.h hVar = (p4.h) ((a0.f) this.d).get(x10);
                    hVar.getClass();
                    hVar.d = j1Var;
                    hVar.f53296e = y0Var;
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
        g0.i3(new rw0(6, (f2) this.f56939b, (r80) this.f56941e), 200L);
    }

    public void e(r rVar) {
        if (!((ArrayList) this.f56939b).contains(rVar)) {
            synchronized (((ArrayList) this.f56939b)) {
                ((ArrayList) this.f56939b).add(rVar);
            }
            rVar.f2503w = true;
            return;
        }
        throw new IllegalStateException("Fragment already added: " + rVar);
    }

    public void f(v vVar, int i7, p4.g gVar) {
        synchronized (this.f56939b) {
            try {
                p4.h hVar = (p4.h) ((a0.f) this.d).get(vVar);
                if (hVar != null) {
                    y0 y0Var = hVar.f53298g;
                    y0Var.getClass();
                    ca.i iVar = new ca.i();
                    iVar.c(y0Var.f10661a);
                    iVar.b(i7);
                    hVar.f53298g = new y0(iVar.d());
                    hVar.f53295c.add(gVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public void g() {
        f2 f2Var = (f2) this.f56939b;
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
        if (id.f23161a0) {
            canvas.translate(f10, 0.0f);
        }
        int L = i7 - g0.L(25.0f);
        int i10 = 0;
        while (i10 < arrayList.size()) {
            lr lrVar = (lr) arrayList.get(i10);
            L = q.w(4.0f, lrVar.f35732g, L);
            if (L < 0) {
                break;
            }
            if (id.f23161a0) {
                canvas.translate(-lrVar.f35732g, 0.0f);
                lrVar.a(canvas);
                canvas.translate(-g0.L(4.0f), 0.0f);
            } else {
                lrVar.a(canvas);
                canvas.translate(g0.L(4.0f) + lrVar.f35732g, 0.0f);
            }
            i10++;
        }
        if (i10 < arrayList.size()) {
            int size = arrayList.size() - i10;
            lr lrVar2 = (lr) this.f56941e;
            if (lrVar2 == null || lrVar2.f35727a != size) {
                ?? obj = new Object();
                obj.f35727a = size;
                my0 my0Var = new my0(jg.g.j(size, "+"), 10.0f, g0.o());
                my0Var.r((t2) this.f56939b);
                obj.f35729c = my0Var;
                int L2 = g0.L(9.32f);
                my0 my0Var2 = obj.f35729c;
                obj.f35732g = L2 + ((int) my0Var2.f36133c);
                my0Var2.i();
                int i11 = m6.f28074n8;
                obj.f35731f = i11;
                obj.f35730e = true;
                obj.d = m6.x0(null, i11, false);
                this.f56941e = obj;
            }
            if (id.f23161a0) {
                canvas.translate(-((lr) this.f56941e).f35732g, 0.0f);
                ((lr) this.f56941e).a(canvas);
                canvas.translate(-g0.L(4.0f), 0.0f);
            } else {
                ((lr) this.f56941e).a(canvas);
                canvas.translate(g0.L(4.0f) + ((lr) this.f56941e).f35732g, 0.0f);
            }
        }
        canvas.restore();
    }

    public void m(d dVar) {
        if (((d) this.f56940c) != dVar) {
            return;
        }
        b bVar = (b) this.d;
        if (bVar != null) {
            g0.r(bVar);
            this.d = null;
        }
        b bVar2 = (b) this.f56941e;
        if (bVar2 != null) {
            g0.r(bVar2);
            this.f56941e = null;
        }
        synchronized (i.f56948y) {
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
        this.f56940c = null;
        dVar.f56936c.run(-1L);
        S();
    }

    public r n(String str) {
        o0 o0Var = (o0) ((HashMap) this.f56940c).get(str);
        if (o0Var != null) {
            return o0Var.f2467c;
        }
        return null;
    }

    public r o(String str) {
        for (o0 o0Var : ((HashMap) this.f56940c).values()) {
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
        d0 d0Var = (d0) ((WeakReference) this.f56941e).get();
        if (d0Var != null) {
            AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            while (atomicBoolean.get()) {
                atomicBoolean.set(false);
                p4.g gVar = (p4.g) hVar.f53295c.poll();
                if (gVar == null) {
                    hVar.f53297f = false;
                    return;
                }
                AtomicBoolean atomicBoolean2 = new AtomicBoolean(true);
                p4.h hVar2 = hVar;
                m0.W(d0Var.f53221l, new org.telegram.ui.web.s(d0Var, x(hVar.f53293a), new sw0(this, gVar, atomicBoolean2, hVar2, atomicBoolean, 9)));
                atomicBoolean2.set(false);
                hVar = hVar2;
            }
        }
    }

    public void q(final v vVar) {
        synchronized (this.f56939b) {
            try {
                p4.h hVar = (p4.h) ((a0.f) this.d).get(vVar);
                if (hVar == null) {
                    return;
                }
                final y0 y0Var = hVar.f53298g;
                hVar.f53298g = y0.f10659b;
                hVar.f53295c.add(new p4.g(vVar, y0Var) {
                    public final v f53280b;

                    @Override
                    public final m9.y run() {
                        d0 d0Var = (d0) ((WeakReference) ui.e.this.f56941e).get();
                        if (d0Var != null) {
                            d0Var.p(this.f53280b);
                        }
                        return m9.w.f20004b;
                    }
                });
                if (hVar.f53297f) {
                    return;
                }
                hVar.f53297f = true;
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
            if (eVar != null && eVar.f17115b == aVar) {
                return eVar;
            }
        }
        k.e eVar2 = new k.e((Context) this.f56940c, aVar);
        arrayList.add(eVar2);
        return eVar2;
    }

    public ArrayList s() {
        ArrayList arrayList = new ArrayList();
        for (o0 o0Var : ((HashMap) this.f56940c).values()) {
            if (o0Var != null) {
                arrayList.add(o0Var);
            }
        }
        return arrayList;
    }

    public ArrayList t() {
        ArrayList arrayList = new ArrayList();
        for (o0 o0Var : ((HashMap) this.f56940c).values()) {
            if (o0Var != null) {
                arrayList.add(o0Var.f2467c);
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    public String toString() {
        switch (this.f56938a) {
            case 15:
                return ((i6) this.f56941e).toString();
            default:
                return super.toString();
        }
    }

    public y0 u(v vVar) {
        synchronized (this.f56939b) {
            try {
                p4.h hVar = (p4.h) ((a0.f) this.d).get(vVar);
                if (hVar != null) {
                    return hVar.f53296e;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public boolean v() {
        switch (this.f56938a) {
            case 9:
                return true;
            default:
                return true;
        }
    }

    public h9.i0 w() {
        h9.i0 q10;
        synchronized (this.f56939b) {
            q10 = h9.i0.q(((a0.f) this.f56940c).values());
        }
        return q10;
    }

    public v x(Object obj) {
        v vVar;
        synchronized (this.f56939b) {
            vVar = (v) ((a0.f) this.f56940c).get(obj);
        }
        return vVar;
    }

    public List y() {
        ArrayList arrayList;
        if (((ArrayList) this.f56939b).isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (((ArrayList) this.f56939b)) {
            arrayList = new ArrayList((ArrayList) this.f56939b);
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
        x xVar = (x) this.f56940c;
        x xVar2 = (x) this.f56939b;
        xVar2.L(i7 + i10, bArr);
        xVar2.N(i7);
        if (((Inflater) this.f56941e) == null) {
            this.f56941e = new Inflater();
        }
        if (m0.Q(xVar2, xVar, (Inflater) this.f56941e)) {
            xVar2.L(xVar.f14166c, xVar.f14164a);
        }
        int i16 = 0;
        aVar.d = 0;
        int[] iArr = aVar.f11111b;
        x xVar3 = aVar.f11110a;
        aVar.f11113e = 0;
        aVar.f11114f = 0;
        aVar.f11115g = 0;
        aVar.h = 0;
        aVar.f11116i = 0;
        xVar3.K(0);
        aVar.f11112c = false;
        ArrayList arrayList = new ArrayList();
        while (xVar2.a() >= 3) {
            int i17 = xVar2.f14166c;
            int A2 = xVar2.A();
            int H = xVar2.H();
            int i18 = xVar2.f14165b + H;
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
                                aVar.f11112c = true;
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
                                        aVar.f11116i = xVar2.H();
                                        xVar3.K(D - 4);
                                        i21 = H - 11;
                                    }
                                }
                                int i22 = xVar3.f14165b;
                                int i23 = xVar3.f14166c;
                                if (i22 < i23 && i21 > 0) {
                                    int min = Math.min(i21, i23 - i22);
                                    xVar2.k(i22, min, xVar3.f14164a);
                                    xVar3.N(i22 + min);
                                    break;
                                }
                            }
                            break;
                        case 22:
                            if (H >= 19) {
                                aVar.d = xVar2.H();
                                aVar.f11113e = xVar2.H();
                                xVar2.O(11);
                                aVar.f11114f = xVar2.H();
                                aVar.f11115g = xVar2.H();
                                break;
                            }
                            break;
                    }
                    i11 = 0;
                    bVar = null;
                } else {
                    if (aVar.d != 0 && aVar.f11113e != 0 && aVar.h != 0 && aVar.f11116i != 0 && (i12 = xVar3.f14166c) != 0 && xVar3.f14165b == i12 && aVar.f11112c) {
                        xVar3.N(0);
                        int i24 = aVar.h * aVar.f11116i;
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
                        Bitmap createBitmap = Bitmap.createBitmap(iArr2, aVar.h, aVar.f11116i, Bitmap.Config.ARGB_8888);
                        float f10 = aVar.d;
                        float f11 = aVar.f11113e;
                        bVar = new g2.b(null, null, null, createBitmap, aVar.f11115g / f11, 0, 0, aVar.f11114f / f10, 0, Integer.MIN_VALUE, -3.4028235E38f, aVar.h / f10, aVar.f11116i / f11, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
                    } else {
                        bVar = null;
                    }
                    i11 = 0;
                    aVar.d = 0;
                    aVar.f11113e = 0;
                    aVar.f11114f = 0;
                    aVar.f11115g = 0;
                    aVar.h = 0;
                    aVar.f11116i = 0;
                    xVar3.K(0);
                    aVar.f11112c = false;
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
        this.f56938a = i7;
        this.f56939b = obj;
        this.f56940c = obj2;
        this.d = obj3;
        this.f56941e = obj4;
    }

    public e(t2 t2Var) {
        this.f56938a = 8;
        this.f56940c = new ArrayList();
        this.d = new ArrayList();
        this.f56941e = null;
        this.f56939b = t2Var;
    }

    public e(int i7) {
        this.f56938a = i7;
        switch (i7) {
            case 1:
                this.f56939b = new ArrayList();
                this.f56940c = new HashMap();
                this.d = new HashMap();
                return;
            case 2:
                this.f56939b = new x();
                this.f56940c = new x();
                this.d = new f4.a();
                return;
            case 7:
                this.f56939b = new ArrayList();
                this.f56940c = new ArrayList();
                this.d = new ArrayList();
                this.f56941e = new ArrayList();
                return;
            default:
                this.f56939b = new ArrayDeque();
                return;
        }
    }

    public e(d0 d0Var) {
        this.f56938a = 12;
        this.f56940c = new l(0);
        this.d = new l(0);
        this.f56939b = new Object();
        this.f56941e = new WeakReference(d0Var);
    }

    public e(Context context, ActionMode.Callback callback) {
        this.f56938a = 4;
        this.f56940c = context;
        this.f56939b = callback;
        this.d = new ArrayList();
        this.f56941e = new l(0);
    }

    public e(ng.e eVar) {
        this.f56938a = 6;
        LinearLayout linearLayout = new LinearLayout(eVar.getContext());
        this.f56941e = linearLayout;
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
        this.f56940c = textView2;
        linearLayout.addView(textView2, ha.k(0.0f, 0.0f, 20.0f, 0.0f, -2, -2));
        p5 p5Var = new p5(eVar.getContext());
        this.f56939b = p5Var;
        linearLayout.addView(p5Var, ha.o(-1, -2));
        textView2.setGravity(8388611);
        p5Var.setGravity(8388613);
        p5Var.setTypeface(g0.o());
        p5Var.setTextSize(1, 13.0f);
        textView2.setTextSize(1, 13.0f);
    }

    public e(t1 t1Var, i2.i iVar, q4.q qVar, i2.i iVar2) {
        Object obj;
        this.f56938a = 3;
        if (t1Var != null) {
            obj = h9.i0.q(t1Var);
        } else {
            h9.g0 g0Var = h9.i0.f14331b;
            obj = t1.f14399e;
        }
        this.f56939b = obj;
        this.f56940c = iVar;
        this.d = qVar;
        this.f56941e = iVar2;
    }

    public e(b0 b0Var, List list) {
        this.f56938a = 5;
        this.f56941e = b0Var;
        this.f56939b = new ie.d();
        this.f56940c = zd.b0.a();
        this.d = hd.f.l(list);
    }

    public e(p1 p1Var, boolean[] zArr) {
        this.f56938a = 14;
        this.f56939b = p1Var;
        this.f56940c = zArr;
        int i7 = p1Var.f58455a;
        this.d = new boolean[i7];
        this.f56941e = new boolean[i7];
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
