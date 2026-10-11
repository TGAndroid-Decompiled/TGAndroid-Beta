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
    public static int f46238n;
    public static final Rect f46239o = new Rect();
    public final n f46240a;
    public final sf.e f46241b;
    public final String f46242c;
    public final int d;
    public final int f46243e;
    public final boolean f46244f;
    public final sf.a f46245g;
    public final tf.b h;
    public final pi.f f46246i;
    public View f46247j;
    public View f46248k;
    public f0 f46249l;
    public boolean f46250m;

    public e(n nVar, d dVar) {
        int i10 = f46238n;
        f46238n = i10 + 1;
        tf.b bVar = new tf.b();
        this.h = bVar;
        f4 f4Var = new f4(this, 1);
        ?? obj = new Object();
        obj.d = new v2(obj, 11);
        obj.f45938a = f4Var;
        this.f46246i = obj;
        StringBuilder sb2 = new StringBuilder();
        String str = dVar.f46231c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i10);
        String sb3 = sb2.toString();
        this.f46242c = sb3;
        this.f46245g = dVar.f46230b;
        this.d = dVar.f46232e;
        this.f46243e = dVar.d;
        this.f46244f = dVar.f46233f;
        this.f46240a = nVar;
        bVar.c(dVar.h, dVar.f46235i);
        this.f46249l = dVar.f46234g;
        this.f46248k = dVar.f46237k;
        this.f46241b = new sf.e(this);
        View view = dVar.f46236j;
        obj.P(view);
        this.f46247j = view;
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
        if (this.h.b() && this.f46245g.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f46250m != z11) {
            this.f46250m = z11;
            if (z10) {
                n nVar = this.f46240a;
                nVar.I();
                ((a) nVar.f7955c).invalidate();
            }
        }
    }

    public final void c() {
        this.f46246i.P(null);
        n nVar = this.f46240a;
        if (((HashMap) nVar.f7953a).remove(this.f46242c) != null) {
            nVar.I();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.c(i10, i11)) {
            b(true);
            this.f46240a.n(this);
        }
    }

    public final void e(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: qf.e.e(android.view.View):void");
    }
}
