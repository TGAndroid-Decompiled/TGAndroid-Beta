package qf;

import ai.v2;
import android.app.PictureInPictureParams;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import ci.f4;
import com.google.firebase.messaging.n;
import i2.f0;
import java.util.HashMap;
public final class e {
    public static int f46272n;
    public static final Rect f46273o = new Rect();
    public final n f46274a;
    public final sf.e f46275b;
    public final String f46276c;
    public final int d;
    public final int f46277e;
    public final boolean f46278f;
    public final sf.a f46279g;
    public final tf.b h;
    public final pi.f f46280i;
    public View f46281j;
    public View f46282k;
    public f0 f46283l;
    public boolean f46284m;

    public e(n nVar, d dVar) {
        int i10 = f46272n;
        f46272n = i10 + 1;
        tf.b bVar = new tf.b();
        this.h = bVar;
        f4 f4Var = new f4(this, 1);
        ?? obj = new Object();
        obj.d = new v2(obj, 11);
        obj.f45972a = f4Var;
        this.f46280i = obj;
        StringBuilder sb2 = new StringBuilder();
        String str = dVar.f46265c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i10);
        String sb3 = sb2.toString();
        this.f46276c = sb3;
        this.f46279g = dVar.f46264b;
        this.d = dVar.f46266e;
        this.f46277e = dVar.d;
        this.f46278f = dVar.f46267f;
        this.f46274a = nVar;
        bVar.c(dVar.h, dVar.f46269i);
        this.f46283l = dVar.f46268g;
        this.f46282k = dVar.f46271k;
        this.f46275b = new sf.e(this);
        View view = dVar.f46270j;
        obj.P(view);
        this.f46281j = view;
        if (view != null) {
            e(view);
        }
        b(false);
        ((HashMap) nVar.f7953a).put(sb3, this);
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
        if (this.h.b() && this.f46279g.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f46284m != z11) {
            this.f46284m = z11;
            if (z10) {
                n nVar = this.f46274a;
                nVar.I();
                ((a) nVar.f7955c).invalidate();
            }
        }
    }

    public final void c() {
        this.f46280i.P(null);
        n nVar = this.f46274a;
        if (((HashMap) nVar.f7953a).remove(this.f46276c) != null) {
            nVar.I();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.c(i10, i11)) {
            b(true);
            this.f46274a.n(this);
        }
    }

    public final void e(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: qf.e.e(android.view.View):void");
    }
}
