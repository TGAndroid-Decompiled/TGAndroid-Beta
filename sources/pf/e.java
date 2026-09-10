package pf;

import android.app.PictureInPictureParams;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import bi.z4;
import com.google.firebase.messaging.n;
import i2.e0;
import java.util.HashMap;
public final class e {
    public static int f39917n;
    public static final Rect f39918o = new Rect();
    public final n f39919a;
    public final rf.e f39920b;
    public final String f39921c;
    public final int d;
    public final int e;
    public final boolean f39922f;
    public final rf.a f39923g;
    public final sf.b h;
    public final ki.f f39924i;
    public View f39925j;
    public View f39926k;
    public e0 f39927l;
    public boolean f39928m;

    public e(n nVar, d dVar) {
        int i10 = f39917n;
        f39917n = i10 + 1;
        sf.b bVar = new sf.b();
        this.h = bVar;
        z4 z4Var = new z4(this, 1);
        ?? obj = new Object();
        obj.d = new l.d(obj, 9);
        obj.f12538a = z4Var;
        this.f39924i = obj;
        StringBuilder sb2 = new StringBuilder();
        String str = dVar.f39911c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i10);
        String sb3 = sb2.toString();
        this.f39921c = sb3;
        this.f39923g = dVar.f39910b;
        this.d = dVar.e;
        this.e = dVar.d;
        this.f39922f = dVar.f39912f;
        this.f39919a = nVar;
        bVar.c(dVar.h, dVar.f39914i);
        this.f39927l = dVar.f39913g;
        this.f39926k = dVar.f39916k;
        this.f39920b = new rf.e(this);
        View view = dVar.f39915j;
        obj.N(view);
        this.f39925j = view;
        if (view != null) {
            e(view);
        }
        b(false);
        ((HashMap) nVar.f6103a).put(sb3, this);
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
        if (this.h.b() && this.f39923g.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f39928m != z11) {
            this.f39928m = z11;
            if (z10) {
                n nVar = this.f39919a;
                nVar.I();
                ((a) nVar.f6105c).invalidate();
            }
        }
    }

    public final void c() {
        this.f39924i.N(null);
        n nVar = this.f39919a;
        if (((HashMap) nVar.f6103a).remove(this.f39921c) != null) {
            nVar.I();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.c(i10, i11)) {
            b(true);
            this.f39919a.n(this);
        }
    }

    public final void e(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: pf.e.e(android.view.View):void");
    }
}
