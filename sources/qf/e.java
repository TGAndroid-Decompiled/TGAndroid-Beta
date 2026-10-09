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
    public static int f46160n;
    public static final Rect f46161o = new Rect();
    public final n f46162a;
    public final sf.e f46163b;
    public final String f46164c;
    public final int d;
    public final int f46165e;
    public final boolean f46166f;
    public final sf.a f46167g;
    public final tf.b h;
    public final oi.f f46168i;
    public View f46169j;
    public View f46170k;
    public f0 f46171l;
    public boolean f46172m;

    public e(n nVar, d dVar) {
        int i10 = f46160n;
        f46160n = i10 + 1;
        tf.b bVar = new tf.b();
        this.h = bVar;
        f4 f4Var = new f4(this, 1);
        ?? obj = new Object();
        obj.d = new v2(obj, 11);
        obj.f17175a = f4Var;
        this.f46168i = obj;
        StringBuilder sb2 = new StringBuilder();
        String str = dVar.f46153c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i10);
        String sb3 = sb2.toString();
        this.f46164c = sb3;
        this.f46167g = dVar.f46152b;
        this.d = dVar.f46154e;
        this.f46165e = dVar.d;
        this.f46166f = dVar.f46155f;
        this.f46162a = nVar;
        bVar.c(dVar.h, dVar.f46157i);
        this.f46171l = dVar.f46156g;
        this.f46170k = dVar.f46159k;
        this.f46163b = new sf.e(this);
        View view = dVar.f46158j;
        obj.P(view);
        this.f46169j = view;
        if (view != null) {
            e(view);
        }
        b(false);
        ((HashMap) nVar.f7954a).put(sb3, this);
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
        if (this.h.b() && this.f46167g.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f46172m != z11) {
            this.f46172m = z11;
            if (z10) {
                n nVar = this.f46162a;
                nVar.I();
                ((a) nVar.f7956c).invalidate();
            }
        }
    }

    public final void c() {
        this.f46168i.P(null);
        n nVar = this.f46162a;
        if (((HashMap) nVar.f7954a).remove(this.f46164c) != null) {
            nVar.I();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.c(i10, i11)) {
            b(true);
            this.f46162a.n(this);
        }
    }

    public final void e(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: qf.e.e(android.view.View):void");
    }
}
