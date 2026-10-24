package rf;

import android.app.PictureInPictureParams;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.google.firebase.messaging.l;
import com.google.firebase.messaging.r;
import ei.z3;
import i2.h0;
import java.util.HashMap;
import k2.n0;
public final class d {
    public static int f45684n;
    public static final Rect f45685o = new Rect();
    public final l f45686a;
    public final tf.e f45687b;
    public final String f45688c;
    public final int d;
    public final int e;
    public final boolean f45689f;
    public final tf.a f45690g;
    public final n0 h;
    public final r f45691i;
    public View f45692j;
    public View f45693k;
    public h0 f45694l;
    public boolean f45695m;

    public d(l lVar, c cVar) {
        int i10 = f45684n;
        f45684n = i10 + 1;
        n0 n0Var = new n0();
        this.h = n0Var;
        r rVar = new r(new z3(this, 1));
        this.f45691i = rVar;
        StringBuilder sb2 = new StringBuilder();
        String str = cVar.f45678c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i10);
        String sb3 = sb2.toString();
        this.f45688c = sb3;
        this.f45690g = cVar.f45677b;
        this.d = cVar.e;
        this.e = cVar.d;
        this.f45689f = cVar.f45679f;
        this.f45686a = lVar;
        n0Var.d(cVar.h, cVar.f45681i);
        this.f45694l = cVar.f45680g;
        this.f45693k = cVar.f45683k;
        this.f45687b = new tf.e(this);
        View view = cVar.f45682j;
        rVar.t(view);
        this.f45692j = view;
        if (view != null) {
            e(view);
        }
        b(false);
        ((HashMap) lVar.f7657a).put(sb3, this);
        lVar.E();
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
        if (this.h.c() && this.f45690g.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f45695m != z11) {
            this.f45695m = z11;
            if (z10) {
                l lVar = this.f45686a;
                lVar.E();
                ((a) lVar.f7659c).invalidate();
            }
        }
    }

    public final void c() {
        this.f45691i.t(null);
        l lVar = this.f45686a;
        if (((HashMap) lVar.f7657a).remove(this.f45688c) != null) {
            lVar.E();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.d(i10, i11)) {
            b(true);
            this.f45686a.l(this);
        }
    }

    public final void e(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: rf.d.e(android.view.View):void");
    }
}
