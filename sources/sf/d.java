package sf;

import aa.m0;
import android.app.PictureInPictureParams;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import bi.i6;
import com.google.firebase.messaging.q;
import fi.x3;
import i2.j0;
import java.util.HashMap;
import k2.o0;
public final class d {
    public static int f48164n;
    public static final Rect f48165o = new Rect();
    public final m0 f48166a;
    public final uf.e f48167b;
    public final String f48168c;
    public final int d;
    public final int e;
    public final boolean f48169f;
    public final uf.a f48170g;
    public final o0 h;
    public final q f48171i;
    public View f48172j;
    public View f48173k;
    public j0 f48174l;
    public boolean f48175m;

    public d(m0 m0Var, c cVar) {
        int i10 = f48164n;
        f48164n = i10 + 1;
        o0 o0Var = new o0();
        this.h = o0Var;
        x3 x3Var = new x3(this, 1);
        ?? obj = new Object();
        obj.d = new i6(obj, 13);
        obj.f7757a = x3Var;
        this.f48171i = obj;
        StringBuilder sb2 = new StringBuilder();
        String str = cVar.f48158c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i10);
        String sb3 = sb2.toString();
        this.f48168c = sb3;
        this.f48170g = cVar.f48157b;
        this.d = cVar.e;
        this.e = cVar.d;
        this.f48169f = cVar.f48159f;
        this.f48166a = m0Var;
        o0Var.d(cVar.h, cVar.f48161i);
        this.f48174l = cVar.f48160g;
        this.f48173k = cVar.f48163k;
        this.f48167b = new uf.e(this);
        View view = cVar.f48162j;
        obj.D(view);
        this.f48172j = view;
        if (view != null) {
            e(view);
        }
        b(false);
        ((HashMap) m0Var.f1150a).put(sb3, this);
        m0Var.E();
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
        if (this.h.c() && this.f48170g.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f48175m != z11) {
            this.f48175m = z11;
            if (z10) {
                m0 m0Var = this.f48166a;
                m0Var.E();
                ((a) m0Var.f1152c).invalidate();
            }
        }
    }

    public final void c() {
        this.f48171i.D(null);
        m0 m0Var = this.f48166a;
        if (((HashMap) m0Var.f1150a).remove(this.f48168c) != null) {
            m0Var.E();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.d(i10, i11)) {
            b(true);
            this.f48166a.l(this);
        }
    }

    public final void e(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: sf.d.e(android.view.View):void");
    }
}
