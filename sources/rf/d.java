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
    public static int f45269n;
    public static final Rect f45270o = new Rect();
    public final l f45271a;
    public final tf.e f45272b;
    public final String f45273c;
    public final int d;
    public final int e;
    public final boolean f45274f;
    public final tf.a f45275g;
    public final n0 h;
    public final r f45276i;
    public View f45277j;
    public View f45278k;
    public i0 f45279l;
    public boolean f45280m;

    public d(l lVar, c cVar) {
        int i10 = f45269n;
        f45269n = i10 + 1;
        n0 n0Var = new n0();
        this.h = n0Var;
        r rVar = new r(new z3(this, 1));
        this.f45276i = rVar;
        StringBuilder sb2 = new StringBuilder();
        String str = cVar.f45263c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i10);
        String sb3 = sb2.toString();
        this.f45273c = sb3;
        this.f45275g = cVar.f45262b;
        this.d = cVar.e;
        this.e = cVar.d;
        this.f45274f = cVar.f45264f;
        this.f45271a = lVar;
        n0Var.d(cVar.h, cVar.f45266i);
        this.f45279l = cVar.f45265g;
        this.f45278k = cVar.f45268k;
        this.f45272b = new tf.e(this);
        View view = cVar.f45267j;
        rVar.t(view);
        this.f45277j = view;
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
        if (this.h.c() && this.f45275g.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f45280m != z11) {
            this.f45280m = z11;
            if (z10) {
                l lVar = this.f45271a;
                lVar.N();
                ((a) lVar.f7647c).invalidate();
            }
        }
    }

    public final void c() {
        this.f45276i.t(null);
        l lVar = this.f45271a;
        if (((HashMap) lVar.f7645a).remove(this.f45273c) != null) {
            lVar.N();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.d(i10, i11)) {
            b(true);
            this.f45271a.p(this);
        }
    }

    public final void e(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: rf.d.e(android.view.View):void");
    }
}
