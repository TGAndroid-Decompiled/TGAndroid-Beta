package xe;

import android.app.PictureInPictureParams;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.google.firebase.messaging.t;
import h3.k0;
import java.util.HashMap;
import kh.z3;
import m.t3;
public final class d {
    public static int f49142n;
    public static final Rect f49143o = new Rect();
    public final t3 f49144a;
    public final ze.e f49145b;
    public final String f49146c;
    public final int d;
    public final int f49147e;
    public final boolean f49148f;
    public final ze.a f49149g;
    public final af.c h;
    public final t f49150i;
    public View f49151j;
    public View f49152k;
    public k0 f49153l;
    public boolean f49154m;

    public d(t3 t3Var, c cVar) {
        int i9 = f49142n;
        f49142n = i9 + 1;
        af.c cVar2 = new af.c();
        this.h = cVar2;
        t tVar = new t(new z3(this, 1));
        this.f49150i = tVar;
        StringBuilder sb2 = new StringBuilder();
        String str = cVar.f49135c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i9);
        String sb3 = sb2.toString();
        this.f49146c = sb3;
        this.f49149g = cVar.f49134b;
        this.d = cVar.f49136e;
        this.f49147e = cVar.d;
        this.f49148f = cVar.f49137f;
        this.f49144a = t3Var;
        cVar2.c(cVar.h, cVar.f49139i);
        this.f49153l = cVar.f49138g;
        this.f49152k = cVar.f49141k;
        this.f49145b = new ze.e(this);
        View view = cVar.f49140j;
        tVar.O(view);
        this.f49151j = view;
        if (view != null) {
            e(view);
        }
        b(false);
        ((HashMap) t3Var.f17098a).put(sb3, this);
        t3Var.g();
    }

    public final PictureInPictureParams a() {
        boolean z10;
        PictureInPictureParams.Builder a2 = this.h.a();
        a2.setActions(null);
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 31) {
            if (i9 >= 31) {
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
        if (this.h.b() && this.f49149g.f()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f49154m != z11) {
            this.f49154m = z11;
            if (z10) {
                t3 t3Var = this.f49144a;
                t3Var.g();
                ((a) t3Var.f17100c).invalidate();
            }
        }
    }

    public final void c() {
        this.f49150i.O(null);
        t3 t3Var = this.f49144a;
        if (((HashMap) t3Var.f17098a).remove(this.f49146c) != null) {
            t3Var.g();
        }
    }

    public final void d(int i9, int i10) {
        if (this.h.c(i9, i10)) {
            b(true);
            this.f49144a.a(this);
        }
    }

    public final void e(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: xe.d.e(android.view.View):void");
    }
}
