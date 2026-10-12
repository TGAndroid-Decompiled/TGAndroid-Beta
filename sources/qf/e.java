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
    public static int f46097n;
    public static final Rect f46098o = new Rect();
    public final n f46099a;
    public final sf.e f46100b;
    public final String f46101c;
    public final int d;
    public final int f46102e;
    public final boolean f46103f;
    public final sf.a f46104g;
    public final tf.b h;
    public final oi.f f46105i;
    public View f46106j;
    public View f46107k;
    public f0 f46108l;
    public boolean f46109m;

    public e(n nVar, d dVar) {
        int i10 = f46097n;
        f46097n = i10 + 1;
        tf.b bVar = new tf.b();
        this.h = bVar;
        f4 f4Var = new f4(this, 1);
        ?? obj = new Object();
        obj.d = new v2(obj, 11);
        obj.f16926a = f4Var;
        this.f46105i = obj;
        StringBuilder sb2 = new StringBuilder();
        String str = dVar.f46090c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i10);
        String sb3 = sb2.toString();
        this.f46101c = sb3;
        this.f46104g = dVar.f46089b;
        this.d = dVar.f46091e;
        this.f46102e = dVar.d;
        this.f46103f = dVar.f46092f;
        this.f46099a = nVar;
        bVar.c(dVar.h, dVar.f46094i);
        this.f46108l = dVar.f46093g;
        this.f46107k = dVar.f46096k;
        this.f46100b = new sf.e(this);
        View view = dVar.f46095j;
        obj.P(view);
        this.f46106j = view;
        if (view != null) {
            e(view);
        }
        b(false);
        ((HashMap) nVar.f7950a).put(sb3, this);
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
        if (this.h.b() && this.f46104g.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f46109m != z11) {
            this.f46109m = z11;
            if (z10) {
                n nVar = this.f46099a;
                nVar.I();
                ((a) nVar.f7952c).invalidate();
            }
        }
    }

    public final void c() {
        this.f46105i.P(null);
        n nVar = this.f46099a;
        if (((HashMap) nVar.f7950a).remove(this.f46101c) != null) {
            nVar.I();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.c(i10, i11)) {
            b(true);
            this.f46099a.n(this);
        }
    }

    public final void e(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: qf.e.e(android.view.View):void");
    }
}
