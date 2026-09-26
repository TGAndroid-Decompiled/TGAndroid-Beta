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
    public static int f41058n;
    public static final Rect f41059o = new Rect();
    public final n f41060a;
    public final rf.e f41061b;
    public final String f41062c;
    public final int d;
    public final int e;
    public final boolean f41063f;
    public final rf.a f41064g;
    public final sf.b h;
    public final oi.f f41065i;
    public View f41066j;
    public View f41067k;
    public f0 f41068l;
    public boolean f41069m;

    public e(n nVar, d dVar) {
        int i10 = f41058n;
        f41058n = i10 + 1;
        sf.b bVar = new sf.b();
        this.h = bVar;
        g4 g4Var = new g4(this, 1);
        ?? obj = new Object();
        obj.d = new u2(obj, 11);
        obj.f15759a = g4Var;
        this.f41065i = obj;
        StringBuilder sb2 = new StringBuilder();
        String str = dVar.f41052c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i10);
        String sb3 = sb2.toString();
        this.f41062c = sb3;
        this.f41064g = dVar.f41051b;
        this.d = dVar.e;
        this.e = dVar.d;
        this.f41063f = dVar.f41053f;
        this.f41060a = nVar;
        bVar.c(dVar.h, dVar.f41055i);
        this.f41068l = dVar.f41054g;
        this.f41067k = dVar.f41057k;
        this.f41061b = new rf.e(this);
        View view = dVar.f41056j;
        obj.P(view);
        this.f41066j = view;
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
        if (this.h.b() && this.f41064g.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f41069m != z11) {
            this.f41069m = z11;
            if (z10) {
                n nVar = this.f41060a;
                nVar.I();
                ((a) nVar.f7314c).invalidate();
            }
        }
    }

    public final void c() {
        this.f41065i.P(null);
        n nVar = this.f41060a;
        if (((HashMap) nVar.f7312a).remove(this.f41062c) != null) {
            nVar.I();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.c(i10, i11)) {
            b(true);
            this.f41060a.n(this);
        }
    }

    public final void e(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: pf.e.e(android.view.View):void");
    }
}
