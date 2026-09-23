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
    public static int f40742n;
    public static final Rect f40743o = new Rect();
    public final n f40744a;
    public final rf.e f40745b;
    public final String f40746c;
    public final int d;
    public final int e;
    public final boolean f40747f;
    public final rf.a f40748g;
    public final sf.b h;
    public final ni.f f40749i;
    public View f40750j;
    public View f40751k;
    public f0 f40752l;
    public boolean f40753m;

    public e(n nVar, d dVar) {
        int i10 = f40742n;
        f40742n = i10 + 1;
        sf.b bVar = new sf.b();
        this.h = bVar;
        g4 g4Var = new g4(this, 1);
        ?? obj = new Object();
        obj.d = new u2(obj, 11);
        obj.f15232a = g4Var;
        this.f40749i = obj;
        StringBuilder sb2 = new StringBuilder();
        String str = dVar.f40736c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i10);
        String sb3 = sb2.toString();
        this.f40746c = sb3;
        this.f40748g = dVar.f40735b;
        this.d = dVar.e;
        this.e = dVar.d;
        this.f40747f = dVar.f40737f;
        this.f40744a = nVar;
        bVar.c(dVar.h, dVar.f40739i);
        this.f40752l = dVar.f40738g;
        this.f40751k = dVar.f40741k;
        this.f40745b = new rf.e(this);
        View view = dVar.f40740j;
        obj.P(view);
        this.f40750j = view;
        if (view != null) {
            e(view);
        }
        b(false);
        ((HashMap) nVar.f7319a).put(sb3, this);
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
        if (this.h.b() && this.f40748g.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f40753m != z11) {
            this.f40753m = z11;
            if (z10) {
                n nVar = this.f40744a;
                nVar.I();
                ((a) nVar.f7321c).invalidate();
            }
        }
    }

    public final void c() {
        this.f40749i.P(null);
        n nVar = this.f40744a;
        if (((HashMap) nVar.f7319a).remove(this.f40746c) != null) {
            nVar.I();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.c(i10, i11)) {
            b(true);
            this.f40744a.n(this);
        }
    }

    public final void e(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: pf.e.e(android.view.View):void");
    }
}
