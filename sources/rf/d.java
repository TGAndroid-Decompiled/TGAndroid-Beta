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
    public static int f45272n;
    public static final Rect f45273o = new Rect();
    public final l f45274a;
    public final tf.e f45275b;
    public final String f45276c;
    public final int d;
    public final int e;
    public final boolean f45277f;
    public final tf.a f45278g;
    public final n0 h;
    public final r f45279i;
    public View f45280j;
    public View f45281k;
    public i0 f45282l;
    public boolean f45283m;

    public d(l lVar, c cVar) {
        int i10 = f45272n;
        f45272n = i10 + 1;
        n0 n0Var = new n0();
        this.h = n0Var;
        r rVar = new r(new z3(this, 1));
        this.f45279i = rVar;
        StringBuilder sb2 = new StringBuilder();
        String str = cVar.f45266c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i10);
        String sb3 = sb2.toString();
        this.f45276c = sb3;
        this.f45278g = cVar.f45265b;
        this.d = cVar.e;
        this.e = cVar.d;
        this.f45277f = cVar.f45267f;
        this.f45274a = lVar;
        n0Var.d(cVar.h, cVar.f45269i);
        this.f45282l = cVar.f45268g;
        this.f45281k = cVar.f45271k;
        this.f45275b = new tf.e(this);
        View view = cVar.f45270j;
        rVar.t(view);
        this.f45280j = view;
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
        if (this.h.c() && this.f45278g.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f45283m != z11) {
            this.f45283m = z11;
            if (z10) {
                l lVar = this.f45274a;
                lVar.N();
                ((a) lVar.f7647c).invalidate();
            }
        }
    }

    public final void c() {
        this.f45279i.t(null);
        l lVar = this.f45274a;
        if (((HashMap) lVar.f7645a).remove(this.f45276c) != null) {
            lVar.N();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.d(i10, i11)) {
            b(true);
            this.f45274a.p(this);
        }
    }

    public final void e(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: rf.d.e(android.view.View):void");
    }
}
