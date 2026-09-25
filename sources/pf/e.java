package pf;

import ai.u2;
import android.app.PictureInPictureParams;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import ci.g4;
import com.google.firebase.messaging.n;
import i2.f0;
import java.util.HashMap;
public final class e {
    public static int f41059n;
    public static final Rect f41060o = new Rect();
    public final n f41061a;
    public final rf.e f41062b;
    public final String f41063c;
    public final int d;
    public final int e;
    public final boolean f41064f;
    public final rf.a f41065g;
    public final sf.b h;
    public final oi.f f41066i;
    public View f41067j;
    public View f41068k;
    public f0 f41069l;
    public boolean f41070m;

    public e(n nVar, d dVar) {
        int i10 = f41059n;
        f41059n = i10 + 1;
        sf.b bVar = new sf.b();
        this.h = bVar;
        g4 g4Var = new g4(this, 1);
        ?? obj = new Object();
        obj.d = new u2(obj, 11);
        obj.f15759a = g4Var;
        this.f41066i = obj;
        StringBuilder sb2 = new StringBuilder();
        String str = dVar.f41053c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i10);
        String sb3 = sb2.toString();
        this.f41063c = sb3;
        this.f41065g = dVar.f41052b;
        this.d = dVar.e;
        this.e = dVar.d;
        this.f41064f = dVar.f41054f;
        this.f41061a = nVar;
        bVar.c(dVar.h, dVar.f41056i);
        this.f41069l = dVar.f41055g;
        this.f41068k = dVar.f41058k;
        this.f41062b = new rf.e(this);
        View view = dVar.f41057j;
        obj.P(view);
        this.f41067j = view;
        if (view != null) {
            e(view);
        }
        b(false);
        ((HashMap) nVar.f7312a).put(sb3, this);
        nVar.I();
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
        if (this.h.b() && this.f41065g.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f41070m != z11) {
            this.f41070m = z11;
            if (z10) {
                n nVar = this.f41061a;
                nVar.I();
                ((a) nVar.f7314c).invalidate();
            }
        }
    }

    public final void c() {
        this.f41066i.P(null);
        n nVar = this.f41061a;
        if (((HashMap) nVar.f7312a).remove(this.f41063c) != null) {
            nVar.I();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.c(i10, i11)) {
            b(true);
            this.f41061a.n(this);
        }
    }

    public final void e(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: pf.e.e(android.view.View):void");
    }
}
