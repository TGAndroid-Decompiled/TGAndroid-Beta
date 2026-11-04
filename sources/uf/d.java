package uf;

import android.app.PictureInPictureParams;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import gi.n3;
import java.util.HashMap;
import k2.i0;
import l2.e;
import m2.m0;
import ui.f;
public final class d {
    public static int f55847n;
    public static final Rect f55848o = new Rect();
    public final e f55849a;
    public final wf.e f55850b;
    public final String f55851c;
    public final int d;
    public final int f55852e;
    public final boolean f55853f;
    public final wf.a f55854g;
    public final m0 h;
    public final f f55855i;
    public View f55856j;
    public View f55857k;
    public i0 f55858l;
    public boolean f55859m;

    public d(e eVar, c cVar) {
        int i3 = f55847n;
        f55847n = i3 + 1;
        m0 m0Var = new m0();
        this.h = m0Var;
        f fVar = new f(new n3(this, 1));
        this.f55855i = fVar;
        StringBuilder sb2 = new StringBuilder();
        String str = cVar.f55840c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i3);
        String sb3 = sb2.toString();
        this.f55851c = sb3;
        this.f55854g = cVar.f55839b;
        this.d = cVar.f55841e;
        this.f55852e = cVar.d;
        this.f55853f = cVar.f55842f;
        this.f55849a = eVar;
        m0Var.d(cVar.h, cVar.f55844i);
        this.f55858l = cVar.f55843g;
        this.f55857k = cVar.f55846k;
        this.f55850b = new wf.e(this);
        View view = cVar.f55845j;
        fVar.L(view);
        this.f55856j = view;
        if (view != null) {
            e(view);
        }
        b(false);
        ((HashMap) eVar.f17689a).put(sb3, this);
        eVar.v();
    }

    public final PictureInPictureParams a() {
        boolean z10;
        PictureInPictureParams.Builder a10 = this.h.a();
        a10.setActions(null);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 31) {
            if (i3 >= 31) {
                z10 = true;
            } else {
                z10 = false;
            }
            a10.setAutoEnterEnabled(z10);
        }
        return a10.build();
    }

    public final void b(boolean z10) {
        boolean z11;
        if (this.h.c() && this.f55854g.o()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f55859m != z11) {
            this.f55859m = z11;
            if (z10) {
                e eVar = this.f55849a;
                eVar.v();
                ((a) eVar.f17691c).invalidate();
            }
        }
    }

    public final void c() {
        this.f55855i.L(null);
        e eVar = this.f55849a;
        if (((HashMap) eVar.f17689a).remove(this.f55851c) != null) {
            eVar.v();
        }
    }

    public final void d(int i3, int i10) {
        if (this.h.d(i3, i10)) {
            b(true);
            this.f55849a.f(this);
        }
    }

    public final void e(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: uf.d.e(android.view.View):void");
    }
}
