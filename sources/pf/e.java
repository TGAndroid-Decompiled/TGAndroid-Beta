package pf;

import ai.u2;
import android.app.PictureInPictureParams;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import ci.h4;
import com.google.firebase.messaging.n;
import i2.e0;
import java.util.HashMap;
public final class e {
    public static int f40787n;
    public static final Rect f40788o = new Rect();
    public final n f40789a;
    public final rf.e f40790b;
    public final String f40791c;
    public final int d;
    public final int e;
    public final boolean f40792f;
    public final rf.a f40793g;
    public final sf.b h;
    public final ni.f f40794i;
    public View f40795j;
    public View f40796k;
    public e0 f40797l;
    public boolean f40798m;

    public e(n nVar, d dVar) {
        int i10 = f40787n;
        f40787n = i10 + 1;
        sf.b bVar = new sf.b();
        this.h = bVar;
        h4 h4Var = new h4(this, 1);
        ?? obj = new Object();
        obj.d = new u2(obj, 11);
        obj.f15255a = h4Var;
        this.f40794i = obj;
        StringBuilder sb2 = new StringBuilder();
        String str = dVar.f40781c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i10);
        String sb3 = sb2.toString();
        this.f40791c = sb3;
        this.f40793g = dVar.f40780b;
        this.d = dVar.e;
        this.e = dVar.d;
        this.f40792f = dVar.f40782f;
        this.f40789a = nVar;
        bVar.c(dVar.h, dVar.f40784i);
        this.f40797l = dVar.f40783g;
        this.f40796k = dVar.f40786k;
        this.f40790b = new rf.e(this);
        View view = dVar.f40785j;
        obj.P(view);
        this.f40795j = view;
        if (view != null) {
            e(view);
        }
        b(false);
        ((HashMap) nVar.f7333a).put(sb3, this);
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
        if (this.h.b() && this.f40793g.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f40798m != z11) {
            this.f40798m = z11;
            if (z10) {
                n nVar = this.f40789a;
                nVar.I();
                ((a) nVar.f7335c).invalidate();
            }
        }
    }

    public final void c() {
        this.f40794i.P(null);
        n nVar = this.f40789a;
        if (((HashMap) nVar.f7333a).remove(this.f40791c) != null) {
            nVar.I();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.c(i10, i11)) {
            b(true);
            this.f40789a.n(this);
        }
    }

    public final void e(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: pf.e.e(android.view.View):void");
    }
}
