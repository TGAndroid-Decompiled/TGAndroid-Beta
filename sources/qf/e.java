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
    public static int f44352n;
    public static final Rect f44353o = new Rect();
    public final n f44354a;
    public final sf.e f44355b;
    public final String f44356c;
    public final int d;
    public final int f44357e;
    public final boolean f44358f;
    public final sf.a f44359g;
    public final tf.b h;
    public final fg.f f44360i;
    public View f44361j;
    public View f44362k;
    public f0 f44363l;
    public boolean f44364m;

    public e(n nVar, d dVar) {
        int i10 = f44352n;
        f44352n = i10 + 1;
        tf.b bVar = new tf.b();
        this.h = bVar;
        h4 h4Var = new h4(this, 1);
        ?? obj = new Object();
        obj.d = new i2(obj, 10);
        obj.f9492a = h4Var;
        this.f44360i = obj;
        StringBuilder sb2 = new StringBuilder();
        String str = dVar.f44345c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i10);
        String sb3 = sb2.toString();
        this.f44356c = sb3;
        this.f44359g = dVar.f44344b;
        this.d = dVar.f44346e;
        this.f44357e = dVar.d;
        this.f44358f = dVar.f44347f;
        this.f44354a = nVar;
        bVar.c(dVar.h, dVar.f44349i);
        this.f44363l = dVar.f44348g;
        this.f44362k = dVar.f44351k;
        this.f44355b = new sf.e(this);
        View view = dVar.f44350j;
        obj.S(view);
        this.f44361j = view;
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
        if (this.h.b() && this.f44359g.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f44364m != z11) {
            this.f44364m = z11;
            if (z10) {
                n nVar = this.f44354a;
                nVar.I();
                ((a) nVar.f6376c).invalidate();
            }
        }
    }

    public final void c() {
        this.f44360i.S(null);
        n nVar = this.f44354a;
        if (((HashMap) nVar.f6374a).remove(this.f44356c) != null) {
            nVar.I();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.c(i10, i11)) {
            b(true);
            this.f44354a.n(this);
        }
    }

    public final void e(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: qf.e.e(android.view.View):void");
    }
}
