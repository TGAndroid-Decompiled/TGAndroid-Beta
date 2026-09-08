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
    public static int f44379n;
    public static final Rect f44380o = new Rect();
    public final n f44381a;
    public final sf.e f44382b;
    public final String f44383c;
    public final int d;
    public final int f44384e;
    public final boolean f44385f;
    public final sf.a f44386g;
    public final tf.b h;
    public final fg.f f44387i;
    public View f44388j;
    public View f44389k;
    public f0 f44390l;
    public boolean f44391m;

    public e(n nVar, d dVar) {
        int i10 = f44379n;
        f44379n = i10 + 1;
        tf.b bVar = new tf.b();
        this.h = bVar;
        h4 h4Var = new h4(this, 1);
        ?? obj = new Object();
        obj.d = new i2(obj, 10);
        obj.f9520a = h4Var;
        this.f44387i = obj;
        StringBuilder sb2 = new StringBuilder();
        String str = dVar.f44372c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i10);
        String sb3 = sb2.toString();
        this.f44383c = sb3;
        this.f44386g = dVar.f44371b;
        this.d = dVar.f44373e;
        this.f44384e = dVar.d;
        this.f44385f = dVar.f44374f;
        this.f44381a = nVar;
        bVar.c(dVar.h, dVar.f44376i);
        this.f44390l = dVar.f44375g;
        this.f44389k = dVar.f44378k;
        this.f44382b = new sf.e(this);
        View view = dVar.f44377j;
        obj.S(view);
        this.f44388j = view;
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
        if (this.h.b() && this.f44386g.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f44391m != z11) {
            this.f44391m = z11;
            if (z10) {
                n nVar = this.f44381a;
                nVar.I();
                ((a) nVar.f6403c).invalidate();
            }
        }
    }

    public final void c() {
        this.f44387i.S(null);
        n nVar = this.f44381a;
        if (((HashMap) nVar.f6401a).remove(this.f44383c) != null) {
            nVar.I();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.c(i10, i11)) {
            b(true);
            this.f44381a.n(this);
        }
    }

    public final void e(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: qf.e.e(android.view.View):void");
    }
}
