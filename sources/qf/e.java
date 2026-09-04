package qf;

import android.app.PictureInPictureParams;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import bi.i2;
import com.google.firebase.messaging.n;
import di.h4;
import i2.f0;
import java.util.HashMap;
public final class e {
    public static int f44351n;
    public static final Rect f44352o = new Rect();
    public final n f44353a;
    public final sf.e f44354b;
    public final String f44355c;
    public final int d;
    public final int f44356e;
    public final boolean f44357f;
    public final sf.a f44358g;
    public final tf.b h;
    public final fg.f f44359i;
    public View f44360j;
    public View f44361k;
    public f0 f44362l;
    public boolean f44363m;

    public e(n nVar, d dVar) {
        int i10 = f44351n;
        f44351n = i10 + 1;
        tf.b bVar = new tf.b();
        this.h = bVar;
        h4 h4Var = new h4(this, 1);
        ?? obj = new Object();
        obj.d = new i2(obj, 10);
        obj.f9492a = h4Var;
        this.f44359i = obj;
        StringBuilder sb2 = new StringBuilder();
        String str = dVar.f44344c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i10);
        String sb3 = sb2.toString();
        this.f44355c = sb3;
        this.f44358g = dVar.f44343b;
        this.d = dVar.f44345e;
        this.f44356e = dVar.d;
        this.f44357f = dVar.f44346f;
        this.f44353a = nVar;
        bVar.c(dVar.h, dVar.f44348i);
        this.f44362l = dVar.f44347g;
        this.f44361k = dVar.f44350k;
        this.f44354b = new sf.e(this);
        View view = dVar.f44349j;
        obj.S(view);
        this.f44360j = view;
        if (view != null) {
            e(view);
        }
        b(false);
        ((HashMap) nVar.f6374a).put(sb3, this);
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
        if (this.h.b() && this.f44358g.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f44363m != z11) {
            this.f44363m = z11;
            if (z10) {
                n nVar = this.f44353a;
                nVar.I();
                ((a) nVar.f6376c).invalidate();
            }
        }
    }

    public final void c() {
        this.f44359i.S(null);
        n nVar = this.f44353a;
        if (((HashMap) nVar.f6374a).remove(this.f44355c) != null) {
            nVar.I();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.c(i10, i11)) {
            b(true);
            this.f44353a.n(this);
        }
    }

    public final void e(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: qf.e.e(android.view.View):void");
    }
}
