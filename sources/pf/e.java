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
    public static int f40813n;
    public static final Rect f40814o = new Rect();
    public final n f40815a;
    public final rf.e f40816b;
    public final String f40817c;
    public final int d;
    public final int e;
    public final boolean f40818f;
    public final rf.a f40819g;
    public final sf.b h;
    public final ni.f f40820i;
    public View f40821j;
    public View f40822k;
    public e0 f40823l;
    public boolean f40824m;

    public e(n nVar, d dVar) {
        int i10 = f40813n;
        f40813n = i10 + 1;
        sf.b bVar = new sf.b();
        this.h = bVar;
        h4 h4Var = new h4(this, 1);
        ?? obj = new Object();
        obj.d = new u2(obj, 11);
        obj.f15267a = h4Var;
        this.f40820i = obj;
        StringBuilder sb2 = new StringBuilder();
        String str = dVar.f40807c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i10);
        String sb3 = sb2.toString();
        this.f40817c = sb3;
        this.f40819g = dVar.f40806b;
        this.d = dVar.e;
        this.e = dVar.d;
        this.f40818f = dVar.f40808f;
        this.f40815a = nVar;
        bVar.c(dVar.h, dVar.f40810i);
        this.f40823l = dVar.f40809g;
        this.f40822k = dVar.f40812k;
        this.f40816b = new rf.e(this);
        View view = dVar.f40811j;
        obj.P(view);
        this.f40821j = view;
        if (view != null) {
            e(view);
        }
        b(false);
        ((HashMap) nVar.f7336a).put(sb3, this);
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
        if (this.h.b() && this.f40819g.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f40824m != z11) {
            this.f40824m = z11;
            if (z10) {
                n nVar = this.f40815a;
                nVar.I();
                ((a) nVar.f7338c).invalidate();
            }
        }
    }

    public final void c() {
        this.f40820i.P(null);
        n nVar = this.f40815a;
        if (((HashMap) nVar.f7336a).remove(this.f40817c) != null) {
            nVar.I();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.c(i10, i11)) {
            b(true);
            this.f40815a.n(this);
        }
    }

    public final void e(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: pf.e.e(android.view.View):void");
    }
}
