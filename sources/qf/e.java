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
    public static int f46105n;
    public static final Rect f46106o = new Rect();
    public final n f46107a;
    public final sf.e f46108b;
    public final String f46109c;
    public final int d;
    public final int f46110e;
    public final boolean f46111f;
    public final sf.a f46112g;
    public final tf.b h;
    public final oi.f f46113i;
    public View f46114j;
    public View f46115k;
    public f0 f46116l;
    public boolean f46117m;

    public e(n nVar, d dVar) {
        int i10 = f46105n;
        f46105n = i10 + 1;
        tf.b bVar = new tf.b();
        this.h = bVar;
        f4 f4Var = new f4(this, 1);
        ?? obj = new Object();
        obj.d = new v2(obj, 11);
        obj.f16927a = f4Var;
        this.f46113i = obj;
        StringBuilder sb2 = new StringBuilder();
        String str = dVar.f46098c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i10);
        String sb3 = sb2.toString();
        this.f46109c = sb3;
        this.f46112g = dVar.f46097b;
        this.d = dVar.f46099e;
        this.f46110e = dVar.d;
        this.f46111f = dVar.f46100f;
        this.f46107a = nVar;
        bVar.c(dVar.h, dVar.f46102i);
        this.f46116l = dVar.f46101g;
        this.f46115k = dVar.f46104k;
        this.f46108b = new sf.e(this);
        View view = dVar.f46103j;
        obj.P(view);
        this.f46114j = view;
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
        if (this.h.b() && this.f46112g.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f46117m != z11) {
            this.f46117m = z11;
            if (z10) {
                n nVar = this.f46107a;
                nVar.I();
                ((a) nVar.f7952c).invalidate();
            }
        }
    }

    public final void c() {
        this.f46113i.P(null);
        n nVar = this.f46107a;
        if (((HashMap) nVar.f7950a).remove(this.f46109c) != null) {
            nVar.I();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.c(i10, i11)) {
            b(true);
            this.f46107a.n(this);
        }
    }

    public final void e(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: qf.e.e(android.view.View):void");
    }
}
