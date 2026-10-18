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
    public static int f45307n;
    public static final Rect f45308o = new Rect();
    public final l f45309a;
    public final tf.e f45310b;
    public final String f45311c;
    public final int d;
    public final int e;
    public final boolean f45312f;
    public final tf.a f45313g;
    public final n0 h;
    public final r f45314i;
    public View f45315j;
    public View f45316k;
    public h0 f45317l;
    public boolean f45318m;

    public d(l lVar, c cVar) {
        int i10 = f45307n;
        f45307n = i10 + 1;
        n0 n0Var = new n0();
        this.h = n0Var;
        r rVar = new r(new z3(this, 1));
        this.f45314i = rVar;
        StringBuilder sb2 = new StringBuilder();
        String str = cVar.f45301c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i10);
        String sb3 = sb2.toString();
        this.f45311c = sb3;
        this.f45313g = cVar.f45300b;
        this.d = cVar.e;
        this.e = cVar.d;
        this.f45312f = cVar.f45302f;
        this.f45309a = lVar;
        n0Var.d(cVar.h, cVar.f45304i);
        this.f45317l = cVar.f45303g;
        this.f45316k = cVar.f45306k;
        this.f45310b = new tf.e(this);
        View view = cVar.f45305j;
        rVar.t(view);
        this.f45315j = view;
        if (view != null) {
            e(view);
        }
        b(false);
        ((HashMap) lVar.f7648a).put(sb3, this);
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
        if (this.h.c() && this.f45313g.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f45318m != z11) {
            this.f45318m = z11;
            if (z10) {
                l lVar = this.f45309a;
                lVar.N();
                ((a) lVar.f7650c).invalidate();
            }
        }
    }

    public final void c() {
        this.f45314i.t(null);
        l lVar = this.f45309a;
        if (((HashMap) lVar.f7648a).remove(this.f45311c) != null) {
            lVar.N();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.d(i10, i11)) {
            b(true);
            this.f45309a.p(this);
        }
    }

    public final void e(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: rf.d.e(android.view.View):void");
    }
}
