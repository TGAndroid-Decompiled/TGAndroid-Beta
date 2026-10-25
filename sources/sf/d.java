package sf;

import aa.m0;
import android.app.PictureInPictureParams;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import bi.i6;
import com.google.firebase.messaging.q;
import fi.x3;
import i2.j0;
import java.util.HashMap;
import k2.o0;
public final class d {
    public static int f48123n;
    public static final Rect f48124o = new Rect();
    public final m0 f48125a;
    public final uf.e f48126b;
    public final String f48127c;
    public final int d;
    public final int e;
    public final boolean f48128f;
    public final uf.a f48129g;
    public final o0 h;
    public final q f48130i;
    public View f48131j;
    public View f48132k;
    public j0 f48133l;
    public boolean f48134m;

    public d(m0 m0Var, c cVar) {
        int i10 = f48123n;
        f48123n = i10 + 1;
        o0 o0Var = new o0();
        this.h = o0Var;
        x3 x3Var = new x3(this, 1);
        ?? obj = new Object();
        obj.d = new i6(obj, 13);
        obj.f7757a = x3Var;
        this.f48130i = obj;
        StringBuilder sb2 = new StringBuilder();
        String str = cVar.f48117c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i10);
        String sb3 = sb2.toString();
        this.f48127c = sb3;
        this.f48129g = cVar.f48116b;
        this.d = cVar.e;
        this.e = cVar.d;
        this.f48128f = cVar.f48118f;
        this.f48125a = m0Var;
        o0Var.d(cVar.h, cVar.f48120i);
        this.f48133l = cVar.f48119g;
        this.f48132k = cVar.f48122k;
        this.f48126b = new uf.e(this);
        View view = cVar.f48121j;
        obj.D(view);
        this.f48131j = view;
        if (view != null) {
            e(view);
        }
        b(false);
        ((HashMap) m0Var.f1150a).put(sb3, this);
        m0Var.E();
    }

    public final PictureInPictureParams a() {
        boolean z10;
        PictureInPictureParams.Builder a2 = this.h.a();
        a2.setActions(null);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            if (i10 >= 31) {
                z10 = true;
            } else {
                z10 = false;
            }
            a2.setAutoEnterEnabled(z10);
        }
        return a2.build();
    }

    public final void b(boolean z10) {
        boolean z11;
        if (this.h.c() && this.f48129g.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f48134m != z11) {
            this.f48134m = z11;
            if (z10) {
                m0 m0Var = this.f48125a;
                m0Var.E();
                ((a) m0Var.f1152c).invalidate();
            }
        }
    }

    public final void c() {
        this.f48130i.D(null);
        m0 m0Var = this.f48125a;
        if (((HashMap) m0Var.f1150a).remove(this.f48127c) != null) {
            m0Var.E();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.d(i10, i11)) {
            b(true);
            this.f48125a.l(this);
        }
    }

    public final void e(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: sf.d.e(android.view.View):void");
    }
}
