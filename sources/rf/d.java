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
    public static int f45259n;
    public static final Rect f45260o = new Rect();
    public final l f45261a;
    public final tf.e f45262b;
    public final String f45263c;
    public final int d;
    public final int e;
    public final boolean f45264f;
    public final tf.a f45265g;
    public final n0 h;
    public final r f45266i;
    public View f45267j;
    public View f45268k;
    public i0 f45269l;
    public boolean f45270m;

    public d(l lVar, c cVar) {
        int i10 = f45259n;
        f45259n = i10 + 1;
        n0 n0Var = new n0();
        this.h = n0Var;
        r rVar = new r(new z3(this, 1));
        this.f45266i = rVar;
        StringBuilder sb2 = new StringBuilder();
        String str = cVar.f45253c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i10);
        String sb3 = sb2.toString();
        this.f45263c = sb3;
        this.f45265g = cVar.f45252b;
        this.d = cVar.e;
        this.e = cVar.d;
        this.f45264f = cVar.f45254f;
        this.f45261a = lVar;
        n0Var.d(cVar.h, cVar.f45256i);
        this.f45269l = cVar.f45255g;
        this.f45268k = cVar.f45258k;
        this.f45262b = new tf.e(this);
        View view = cVar.f45257j;
        rVar.t(view);
        this.f45267j = view;
        if (view != null) {
            e(view);
        }
        b(false);
        ((HashMap) lVar.f7647a).put(sb3, this);
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
        if (this.h.c() && this.f45265g.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f45270m != z11) {
            this.f45270m = z11;
            if (z10) {
                l lVar = this.f45261a;
                lVar.N();
                ((a) lVar.f7649c).invalidate();
            }
        }
    }

    public final void c() {
        this.f45266i.t(null);
        l lVar = this.f45261a;
        if (((HashMap) lVar.f7647a).remove(this.f45263c) != null) {
            lVar.N();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.d(i10, i11)) {
            b(true);
            this.f45261a.p(this);
        }
    }

    public final void e(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: rf.d.e(android.view.View):void");
    }
}
