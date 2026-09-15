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
    public static int f40791n;
    public static final Rect f40792o = new Rect();
    public final n f40793a;
    public final rf.e f40794b;
    public final String f40795c;
    public final int d;
    public final int e;
    public final boolean f40796f;
    public final rf.a f40797g;
    public final sf.b h;
    public final ni.f f40798i;
    public View f40799j;
    public View f40800k;
    public e0 f40801l;
    public boolean f40802m;

    public e(n nVar, d dVar) {
        int i10 = f40791n;
        f40791n = i10 + 1;
        sf.b bVar = new sf.b();
        this.h = bVar;
        h4 h4Var = new h4(this, 1);
        ?? obj = new Object();
        obj.d = new u2(obj, 10);
        obj.f15257a = h4Var;
        this.f40798i = obj;
        StringBuilder sb2 = new StringBuilder();
        String str = dVar.f40785c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i10);
        String sb3 = sb2.toString();
        this.f40795c = sb3;
        this.f40797g = dVar.f40784b;
        this.d = dVar.e;
        this.e = dVar.d;
        this.f40796f = dVar.f40786f;
        this.f40793a = nVar;
        bVar.c(dVar.h, dVar.f40788i);
        this.f40801l = dVar.f40787g;
        this.f40800k = dVar.f40790k;
        this.f40794b = new rf.e(this);
        View view = dVar.f40789j;
        obj.P(view);
        this.f40799j = view;
        if (view != null) {
            e(view);
        }
        b(false);
        ((HashMap) nVar.f7331a).put(sb3, this);
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
        if (this.h.b() && this.f40797g.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f40802m != z11) {
            this.f40802m = z11;
            if (z10) {
                n nVar = this.f40793a;
                nVar.I();
                ((a) nVar.f7333c).invalidate();
            }
        }
    }

    public final void c() {
        this.f40798i.P(null);
        n nVar = this.f40793a;
        if (((HashMap) nVar.f7331a).remove(this.f40795c) != null) {
            nVar.I();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.c(i10, i11)) {
            b(true);
            this.f40793a.n(this);
        }
    }

    public final void e(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: pf.e.e(android.view.View):void");
    }
}
