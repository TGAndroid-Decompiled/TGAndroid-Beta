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
    public static int f44380n;
    public static final Rect f44381o = new Rect();
    public final n f44382a;
    public final sf.e f44383b;
    public final String f44384c;
    public final int d;
    public final int f44385e;
    public final boolean f44386f;
    public final sf.a f44387g;
    public final tf.b h;
    public final fg.f f44388i;
    public View f44389j;
    public View f44390k;
    public f0 f44391l;
    public boolean f44392m;

    public e(n nVar, d dVar) {
        int i10 = f44380n;
        f44380n = i10 + 1;
        tf.b bVar = new tf.b();
        this.h = bVar;
        h4 h4Var = new h4(this, 1);
        ?? obj = new Object();
        obj.d = new i2(obj, 10);
        obj.f9520a = h4Var;
        this.f44388i = obj;
        StringBuilder sb2 = new StringBuilder();
        String str = dVar.f44373c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i10);
        String sb3 = sb2.toString();
        this.f44384c = sb3;
        this.f44387g = dVar.f44372b;
        this.d = dVar.f44374e;
        this.f44385e = dVar.d;
        this.f44386f = dVar.f44375f;
        this.f44382a = nVar;
        bVar.c(dVar.h, dVar.f44377i);
        this.f44391l = dVar.f44376g;
        this.f44390k = dVar.f44379k;
        this.f44383b = new sf.e(this);
        View view = dVar.f44378j;
        obj.S(view);
        this.f44389j = view;
        if (view != null) {
            e(view);
        }
        b(false);
        ((HashMap) nVar.f6401a).put(sb3, this);
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
        if (this.h.b() && this.f44387g.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f44392m != z11) {
            this.f44392m = z11;
            if (z10) {
                n nVar = this.f44382a;
                nVar.I();
                ((a) nVar.f6403c).invalidate();
            }
        }
    }

    public final void c() {
        this.f44388i.S(null);
        n nVar = this.f44382a;
        if (((HashMap) nVar.f6401a).remove(this.f44384c) != null) {
            nVar.I();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.c(i10, i11)) {
            b(true);
            this.f44382a.n(this);
        }
    }

    public final void e(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: qf.e.e(android.view.View):void");
    }
}
