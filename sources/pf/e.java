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
    public static int f44408n;
    public static final Rect f44409o = new Rect();
    public final n f44410a;
    public final rf.e f44411b;
    public final String f44412c;
    public final int d;
    public final int f44413e;
    public final boolean f44414f;
    public final rf.a f44415g;
    public final sf.b h;
    public final qi.f f44416i;
    public View f44417j;
    public View f44418k;
    public f0 f44419l;
    public boolean f44420m;

    public e(n nVar, d dVar) {
        int i10 = f44408n;
        f44408n = i10 + 1;
        sf.b bVar = new sf.b();
        this.h = bVar;
        g4 g4Var = new g4(this, 1);
        ?? obj = new Object();
        obj.d = new u2(obj, 11);
        obj.f45527a = g4Var;
        this.f44416i = obj;
        StringBuilder sb2 = new StringBuilder();
        String str = dVar.f44401c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i10);
        String sb3 = sb2.toString();
        this.f44412c = sb3;
        this.f44415g = dVar.f44400b;
        this.d = dVar.f44402e;
        this.f44413e = dVar.d;
        this.f44414f = dVar.f44403f;
        this.f44410a = nVar;
        bVar.c(dVar.h, dVar.f44405i);
        this.f44419l = dVar.f44404g;
        this.f44418k = dVar.f44407k;
        this.f44411b = new rf.e(this);
        View view = dVar.f44406j;
        obj.P(view);
        this.f44417j = view;
        if (view != null) {
            e(view);
        }
        b(false);
        ((HashMap) nVar.f7904a).put(sb3, this);
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
        if (this.h.b() && this.f44415g.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f44420m != z11) {
            this.f44420m = z11;
            if (z10) {
                n nVar = this.f44410a;
                nVar.I();
                ((a) nVar.f7906c).invalidate();
            }
        }
    }

    public final void c() {
        this.f44416i.P(null);
        n nVar = this.f44410a;
        if (((HashMap) nVar.f7904a).remove(this.f44412c) != null) {
            nVar.I();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.c(i10, i11)) {
            b(true);
            this.f44410a.n(this);
        }
    }

    public final void e(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: pf.e.e(android.view.View):void");
    }
}
