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
    public static int f41056n;
    public static final Rect f41057o = new Rect();
    public final n f41058a;
    public final rf.e f41059b;
    public final String f41060c;
    public final int d;
    public final int e;
    public final boolean f41061f;
    public final rf.a f41062g;
    public final sf.b h;
    public final pi.f f41063i;
    public View f41064j;
    public View f41065k;
    public f0 f41066l;
    public boolean f41067m;

    public e(n nVar, d dVar) {
        int i10 = f41056n;
        f41056n = i10 + 1;
        sf.b bVar = new sf.b();
        this.h = bVar;
        g4 g4Var = new g4(this, 1);
        ?? obj = new Object();
        obj.d = new u2(obj, 11);
        obj.f41365a = g4Var;
        this.f41063i = obj;
        StringBuilder sb2 = new StringBuilder();
        String str = dVar.f41050c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i10);
        String sb3 = sb2.toString();
        this.f41060c = sb3;
        this.f41062g = dVar.f41049b;
        this.d = dVar.e;
        this.e = dVar.d;
        this.f41061f = dVar.f41051f;
        this.f41058a = nVar;
        bVar.c(dVar.h, dVar.f41053i);
        this.f41066l = dVar.f41052g;
        this.f41065k = dVar.f41055k;
        this.f41059b = new rf.e(this);
        View view = dVar.f41054j;
        obj.P(view);
        this.f41064j = view;
        if (view != null) {
            e(view);
        }
        b(false);
        ((HashMap) nVar.f7320a).put(sb3, this);
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
        if (this.h.b() && this.f41062g.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f41067m != z11) {
            this.f41067m = z11;
            if (z10) {
                n nVar = this.f41058a;
                nVar.I();
                ((a) nVar.f7322c).invalidate();
            }
        }
    }

    public final void c() {
        this.f41063i.P(null);
        n nVar = this.f41058a;
        if (((HashMap) nVar.f7320a).remove(this.f41060c) != null) {
            nVar.I();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.c(i10, i11)) {
            b(true);
            this.f41058a.n(this);
        }
    }

    public final void e(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: pf.e.e(android.view.View):void");
    }
}
