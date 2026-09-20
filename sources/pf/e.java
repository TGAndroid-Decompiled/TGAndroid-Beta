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
    public static int f41087n;
    public static final Rect f41088o = new Rect();
    public final n f41089a;
    public final rf.e f41090b;
    public final String f41091c;
    public final int d;
    public final int e;
    public final boolean f41092f;
    public final rf.a f41093g;
    public final sf.b h;
    public final oi.f f41094i;
    public View f41095j;
    public View f41096k;
    public e0 f41097l;
    public boolean f41098m;

    public e(n nVar, d dVar) {
        int i10 = f41087n;
        f41087n = i10 + 1;
        sf.b bVar = new sf.b();
        this.h = bVar;
        h4 h4Var = new h4(this, 1);
        ?? obj = new Object();
        obj.d = new u2(obj, 11);
        obj.f15748a = h4Var;
        this.f41094i = obj;
        StringBuilder sb2 = new StringBuilder();
        String str = dVar.f41081c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i10);
        String sb3 = sb2.toString();
        this.f41091c = sb3;
        this.f41093g = dVar.f41080b;
        this.d = dVar.e;
        this.e = dVar.d;
        this.f41092f = dVar.f41082f;
        this.f41089a = nVar;
        bVar.c(dVar.h, dVar.f41084i);
        this.f41097l = dVar.f41083g;
        this.f41096k = dVar.f41086k;
        this.f41090b = new rf.e(this);
        View view = dVar.f41085j;
        obj.P(view);
        this.f41095j = view;
        if (view != null) {
            e(view);
        }
        b(false);
        ((HashMap) nVar.f7330a).put(sb3, this);
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
        if (this.h.b() && this.f41093g.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f41098m != z11) {
            this.f41098m = z11;
            if (z10) {
                n nVar = this.f41089a;
                nVar.I();
                ((a) nVar.f7332c).invalidate();
            }
        }
    }

    public final void c() {
        this.f41094i.P(null);
        n nVar = this.f41089a;
        if (((HashMap) nVar.f7330a).remove(this.f41091c) != null) {
            nVar.I();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.c(i10, i11)) {
            b(true);
            this.f41089a.n(this);
        }
    }

    public final void e(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: pf.e.e(android.view.View):void");
    }
}
