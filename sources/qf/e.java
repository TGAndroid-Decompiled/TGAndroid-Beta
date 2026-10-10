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
    public static int f46204n;
    public static final Rect f46205o = new Rect();
    public final n f46206a;
    public final sf.e f46207b;
    public final String f46208c;
    public final int d;
    public final int f46209e;
    public final boolean f46210f;
    public final sf.a f46211g;
    public final tf.b h;
    public final oi.f f46212i;
    public View f46213j;
    public View f46214k;
    public f0 f46215l;
    public boolean f46216m;

    public e(n nVar, d dVar) {
        int i10 = f46204n;
        f46204n = i10 + 1;
        tf.b bVar = new tf.b();
        this.h = bVar;
        f4 f4Var = new f4(this, 1);
        ?? obj = new Object();
        obj.d = new v2(obj, 11);
        obj.f17179a = f4Var;
        this.f46212i = obj;
        StringBuilder sb2 = new StringBuilder();
        String str = dVar.f46197c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i10);
        String sb3 = sb2.toString();
        this.f46208c = sb3;
        this.f46211g = dVar.f46196b;
        this.d = dVar.f46198e;
        this.f46209e = dVar.d;
        this.f46210f = dVar.f46199f;
        this.f46206a = nVar;
        bVar.c(dVar.h, dVar.f46201i);
        this.f46215l = dVar.f46200g;
        this.f46214k = dVar.f46203k;
        this.f46207b = new sf.e(this);
        View view = dVar.f46202j;
        obj.P(view);
        this.f46213j = view;
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
        if (this.h.b() && this.f46211g.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f46216m != z11) {
            this.f46216m = z11;
            if (z10) {
                n nVar = this.f46206a;
                nVar.I();
                ((a) nVar.f7956c).invalidate();
            }
        }
    }

    public final void c() {
        this.f46212i.P(null);
        n nVar = this.f46206a;
        if (((HashMap) nVar.f7954a).remove(this.f46208c) != null) {
            nVar.I();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.c(i10, i11)) {
            b(true);
            this.f46206a.n(this);
        }
    }

    public final void e(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: qf.e.e(android.view.View):void");
    }
}
