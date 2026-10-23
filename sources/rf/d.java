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
    public static int f45685n;
    public static final Rect f45686o = new Rect();
    public final l f45687a;
    public final tf.e f45688b;
    public final String f45689c;
    public final int d;
    public final int e;
    public final boolean f45690f;
    public final tf.a f45691g;
    public final n0 h;
    public final r f45692i;
    public View f45693j;
    public View f45694k;
    public h0 f45695l;
    public boolean f45696m;

    public d(l lVar, c cVar) {
        int i10 = f45685n;
        f45685n = i10 + 1;
        n0 n0Var = new n0();
        this.h = n0Var;
        r rVar = new r(new z3(this, 1));
        this.f45692i = rVar;
        StringBuilder sb2 = new StringBuilder();
        String str = cVar.f45679c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i10);
        String sb3 = sb2.toString();
        this.f45689c = sb3;
        this.f45691g = cVar.f45678b;
        this.d = cVar.e;
        this.e = cVar.d;
        this.f45690f = cVar.f45680f;
        this.f45687a = lVar;
        n0Var.d(cVar.h, cVar.f45682i);
        this.f45695l = cVar.f45681g;
        this.f45694k = cVar.f45684k;
        this.f45688b = new tf.e(this);
        View view = cVar.f45683j;
        rVar.t(view);
        this.f45693j = view;
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
        if (this.h.c() && this.f45691g.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f45696m != z11) {
            this.f45696m = z11;
            if (z10) {
                l lVar = this.f45687a;
                lVar.E();
                ((a) lVar.f7659c).invalidate();
            }
        }
    }

    public final void c() {
        this.f45692i.t(null);
        l lVar = this.f45687a;
        if (((HashMap) lVar.f7657a).remove(this.f45689c) != null) {
            lVar.E();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.d(i10, i11)) {
            b(true);
            this.f45687a.l(this);
        }
    }

    public final void e(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: rf.d.e(android.view.View):void");
    }
}
