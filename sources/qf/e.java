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
    public static int f46158n;
    public static final Rect f46159o = new Rect();
    public final n f46160a;
    public final sf.e f46161b;
    public final String f46162c;
    public final int d;
    public final int f46163e;
    public final boolean f46164f;
    public final sf.a f46165g;
    public final tf.b h;
    public final oi.f f46166i;
    public View f46167j;
    public View f46168k;
    public f0 f46169l;
    public boolean f46170m;

    public e(n nVar, d dVar) {
        int i10 = f46158n;
        f46158n = i10 + 1;
        tf.b bVar = new tf.b();
        this.h = bVar;
        f4 f4Var = new f4(this, 1);
        ?? obj = new Object();
        obj.d = new v2(obj, 11);
        obj.f17175a = f4Var;
        this.f46166i = obj;
        StringBuilder sb2 = new StringBuilder();
        String str = dVar.f46151c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i10);
        String sb3 = sb2.toString();
        this.f46162c = sb3;
        this.f46165g = dVar.f46150b;
        this.d = dVar.f46152e;
        this.f46163e = dVar.d;
        this.f46164f = dVar.f46153f;
        this.f46160a = nVar;
        bVar.c(dVar.h, dVar.f46155i);
        this.f46169l = dVar.f46154g;
        this.f46168k = dVar.f46157k;
        this.f46161b = new sf.e(this);
        View view = dVar.f46156j;
        obj.P(view);
        this.f46167j = view;
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
        if (this.h.b() && this.f46165g.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f46170m != z11) {
            this.f46170m = z11;
            if (z10) {
                n nVar = this.f46160a;
                nVar.I();
                ((a) nVar.f7956c).invalidate();
            }
        }
    }

    public final void c() {
        this.f46166i.P(null);
        n nVar = this.f46160a;
        if (((HashMap) nVar.f7954a).remove(this.f46162c) != null) {
            nVar.I();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.c(i10, i11)) {
            b(true);
            this.f46160a.n(this);
        }
    }

    public final void e(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: qf.e.e(android.view.View):void");
    }
}
