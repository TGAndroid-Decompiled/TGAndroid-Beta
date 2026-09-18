package pf;

import ai.u2;
import android.app.PictureInPictureParams;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import ci.h4;
import com.google.firebase.messaging.n;
import i2.e0;
import java.util.HashMap;
public final class e {
    public static int f41046n;
    public static final Rect f41047o = new Rect();
    public final n f41048a;
    public final rf.e f41049b;
    public final String f41050c;
    public final int d;
    public final int e;
    public final boolean f41051f;
    public final rf.a f41052g;
    public final sf.b h;
    public final oi.f f41053i;
    public View f41054j;
    public View f41055k;
    public e0 f41056l;
    public boolean f41057m;

    public e(n nVar, d dVar) {
        int i10 = f41046n;
        f41046n = i10 + 1;
        sf.b bVar = new sf.b();
        this.h = bVar;
        h4 h4Var = new h4(this, 1);
        ?? obj = new Object();
        obj.d = new u2(obj, 11);
        obj.f15716a = h4Var;
        this.f41053i = obj;
        StringBuilder sb2 = new StringBuilder();
        String str = dVar.f41040c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i10);
        String sb3 = sb2.toString();
        this.f41050c = sb3;
        this.f41052g = dVar.f41039b;
        this.d = dVar.e;
        this.e = dVar.d;
        this.f41051f = dVar.f41041f;
        this.f41048a = nVar;
        bVar.c(dVar.h, dVar.f41043i);
        this.f41056l = dVar.f41042g;
        this.f41055k = dVar.f41045k;
        this.f41049b = new rf.e(this);
        View view = dVar.f41044j;
        obj.P(view);
        this.f41054j = view;
        if (view != null) {
            e(view);
        }
        b(false);
        ((HashMap) nVar.f7329a).put(sb3, this);
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
        if (this.h.b() && this.f41052g.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f41057m != z11) {
            this.f41057m = z11;
            if (z10) {
                n nVar = this.f41048a;
                nVar.I();
                ((a) nVar.f7331c).invalidate();
            }
        }
    }

    public final void c() {
        this.f41053i.P(null);
        n nVar = this.f41048a;
        if (((HashMap) nVar.f7329a).remove(this.f41050c) != null) {
            nVar.I();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.c(i10, i11)) {
            b(true);
            this.f41048a.n(this);
        }
    }

    public final void e(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: pf.e.e(android.view.View):void");
    }
}
