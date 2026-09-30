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
    public static int f41060n;
    public static final Rect f41061o = new Rect();
    public final n f41062a;
    public final rf.e f41063b;
    public final String f41064c;
    public final int d;
    public final int e;
    public final boolean f41065f;
    public final rf.a f41066g;
    public final sf.b h;
    public final oi.f f41067i;
    public View f41068j;
    public View f41069k;
    public f0 f41070l;
    public boolean f41071m;

    public e(n nVar, d dVar) {
        int i10 = f41060n;
        f41060n = i10 + 1;
        sf.b bVar = new sf.b();
        this.h = bVar;
        g4 g4Var = new g4(this, 1);
        ?? obj = new Object();
        obj.d = new u2(obj, 11);
        obj.f15760a = g4Var;
        this.f41067i = obj;
        StringBuilder sb2 = new StringBuilder();
        String str = dVar.f41054c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i10);
        String sb3 = sb2.toString();
        this.f41064c = sb3;
        this.f41066g = dVar.f41053b;
        this.d = dVar.e;
        this.e = dVar.d;
        this.f41065f = dVar.f41055f;
        this.f41062a = nVar;
        bVar.c(dVar.h, dVar.f41057i);
        this.f41070l = dVar.f41056g;
        this.f41069k = dVar.f41059k;
        this.f41063b = new rf.e(this);
        View view = dVar.f41058j;
        obj.P(view);
        this.f41068j = view;
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
        if (this.h.b() && this.f41066g.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f41071m != z11) {
            this.f41071m = z11;
            if (z10) {
                n nVar = this.f41062a;
                nVar.I();
                ((a) nVar.f7314c).invalidate();
            }
        }
    }

    public final void c() {
        this.f41067i.P(null);
        n nVar = this.f41062a;
        if (((HashMap) nVar.f7312a).remove(this.f41064c) != null) {
            nVar.I();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.c(i10, i11)) {
            b(true);
            this.f41062a.n(this);
        }
    }

    public final void e(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: pf.e.e(android.view.View):void");
    }
}
