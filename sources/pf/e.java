package pf;

import ai.u2;
import android.app.PictureInPictureParams;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import ci.g4;
import com.google.firebase.messaging.n;
import i2.f0;
import java.util.HashMap;
public final class e {
    public static int f44422n;
    public static final Rect f44423o = new Rect();
    public final n f44424a;
    public final rf.e f44425b;
    public final String f44426c;
    public final int d;
    public final int f44427e;
    public final boolean f44428f;
    public final rf.a f44429g;
    public final sf.b h;
    public final qi.f f44430i;
    public View f44431j;
    public View f44432k;
    public f0 f44433l;
    public boolean f44434m;

    public e(n nVar, d dVar) {
        int i10 = f44422n;
        f44422n = i10 + 1;
        sf.b bVar = new sf.b();
        this.h = bVar;
        g4 g4Var = new g4(this, 1);
        ?? obj = new Object();
        obj.d = new u2(obj, 11);
        obj.f45541a = g4Var;
        this.f44430i = obj;
        StringBuilder sb2 = new StringBuilder();
        String str = dVar.f44415c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i10);
        String sb3 = sb2.toString();
        this.f44426c = sb3;
        this.f44429g = dVar.f44414b;
        this.d = dVar.f44416e;
        this.f44427e = dVar.d;
        this.f44428f = dVar.f44417f;
        this.f44424a = nVar;
        bVar.c(dVar.h, dVar.f44419i);
        this.f44433l = dVar.f44418g;
        this.f44432k = dVar.f44421k;
        this.f44425b = new rf.e(this);
        View view = dVar.f44420j;
        obj.P(view);
        this.f44431j = view;
        if (view != null) {
            e(view);
        }
        b(false);
        ((HashMap) nVar.f7905a).put(sb3, this);
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
        if (this.h.b() && this.f44429g.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f44434m != z11) {
            this.f44434m = z11;
            if (z10) {
                n nVar = this.f44424a;
                nVar.I();
                ((a) nVar.f7907c).invalidate();
            }
        }
    }

    public final void c() {
        this.f44430i.P(null);
        n nVar = this.f44424a;
        if (((HashMap) nVar.f7905a).remove(this.f44426c) != null) {
            nVar.I();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.c(i10, i11)) {
            b(true);
            this.f44424a.n(this);
        }
    }

    public final void e(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: pf.e.e(android.view.View):void");
    }
}
