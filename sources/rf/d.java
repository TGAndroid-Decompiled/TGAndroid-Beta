package rf;

import android.app.PictureInPictureParams;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.google.firebase.messaging.l;
import com.google.firebase.messaging.r;
import ei.z3;
import i2.i0;
import java.util.HashMap;
import k2.n0;
public final class d {
    public static int f45261n;
    public static final Rect f45262o = new Rect();
    public final l f45263a;
    public final tf.e f45264b;
    public final String f45265c;
    public final int d;
    public final int e;
    public final boolean f45266f;
    public final tf.a f45267g;
    public final n0 h;
    public final r f45268i;
    public View f45269j;
    public View f45270k;
    public i0 f45271l;
    public boolean f45272m;

    public d(l lVar, c cVar) {
        int i10 = f45261n;
        f45261n = i10 + 1;
        n0 n0Var = new n0();
        this.h = n0Var;
        r rVar = new r(new z3(this, 1));
        this.f45268i = rVar;
        StringBuilder sb2 = new StringBuilder();
        String str = cVar.f45255c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i10);
        String sb3 = sb2.toString();
        this.f45265c = sb3;
        this.f45267g = cVar.f45254b;
        this.d = cVar.e;
        this.e = cVar.d;
        this.f45266f = cVar.f45256f;
        this.f45263a = lVar;
        n0Var.d(cVar.h, cVar.f45258i);
        this.f45271l = cVar.f45257g;
        this.f45270k = cVar.f45260k;
        this.f45264b = new tf.e(this);
        View view = cVar.f45259j;
        rVar.t(view);
        this.f45269j = view;
        if (view != null) {
            e(view);
        }
        b(false);
        ((HashMap) lVar.f7645a).put(sb3, this);
        lVar.N();
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
        if (this.h.c() && this.f45267g.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f45272m != z11) {
            this.f45272m = z11;
            if (z10) {
                l lVar = this.f45263a;
                lVar.N();
                ((a) lVar.f7647c).invalidate();
            }
        }
    }

    public final void c() {
        this.f45268i.t(null);
        l lVar = this.f45263a;
        if (((HashMap) lVar.f7645a).remove(this.f45265c) != null) {
            lVar.N();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.d(i10, i11)) {
            b(true);
            this.f45263a.p(this);
        }
    }

    public final void e(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: rf.d.e(android.view.View):void");
    }
}
