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
    public static int f44415n;
    public static final Rect f44416o = new Rect();
    public final n f44417a;
    public final rf.e f44418b;
    public final String f44419c;
    public final int d;
    public final int f44420e;
    public final boolean f44421f;
    public final rf.a f44422g;
    public final sf.b h;
    public final qi.f f44423i;
    public View f44424j;
    public View f44425k;
    public f0 f44426l;
    public boolean f44427m;

    public e(n nVar, d dVar) {
        int i10 = f44415n;
        f44415n = i10 + 1;
        sf.b bVar = new sf.b();
        this.h = bVar;
        g4 g4Var = new g4(this, 1);
        ?? obj = new Object();
        obj.d = new u2(obj, 11);
        obj.f45534a = g4Var;
        this.f44423i = obj;
        StringBuilder sb2 = new StringBuilder();
        String str = dVar.f44408c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i10);
        String sb3 = sb2.toString();
        this.f44419c = sb3;
        this.f44422g = dVar.f44407b;
        this.d = dVar.f44409e;
        this.f44420e = dVar.d;
        this.f44421f = dVar.f44410f;
        this.f44417a = nVar;
        bVar.c(dVar.h, dVar.f44412i);
        this.f44426l = dVar.f44411g;
        this.f44425k = dVar.f44414k;
        this.f44418b = new rf.e(this);
        View view = dVar.f44413j;
        obj.P(view);
        this.f44424j = view;
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
        if (this.h.b() && this.f44422g.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f44427m != z11) {
            this.f44427m = z11;
            if (z10) {
                n nVar = this.f44417a;
                nVar.I();
                ((a) nVar.f7907c).invalidate();
            }
        }
    }

    public final void c() {
        this.f44423i.P(null);
        n nVar = this.f44417a;
        if (((HashMap) nVar.f7905a).remove(this.f44419c) != null) {
            nVar.I();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.c(i10, i11)) {
            b(true);
            this.f44417a.n(this);
        }
    }

    public final void e(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: pf.e.e(android.view.View):void");
    }
}
