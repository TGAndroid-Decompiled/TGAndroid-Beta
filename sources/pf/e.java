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
    public static int f40818n;
    public static final Rect f40819o = new Rect();
    public final n f40820a;
    public final rf.e f40821b;
    public final String f40822c;
    public final int d;
    public final int e;
    public final boolean f40823f;
    public final rf.a f40824g;
    public final sf.b h;
    public final ni.f f40825i;
    public View f40826j;
    public View f40827k;
    public e0 f40828l;
    public boolean f40829m;

    public e(n nVar, d dVar) {
        int i10 = f40818n;
        f40818n = i10 + 1;
        sf.b bVar = new sf.b();
        this.h = bVar;
        h4 h4Var = new h4(this, 1);
        ?? obj = new Object();
        obj.d = new u2(obj, 11);
        obj.f15267a = h4Var;
        this.f40825i = obj;
        StringBuilder sb2 = new StringBuilder();
        String str = dVar.f40812c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i10);
        String sb3 = sb2.toString();
        this.f40822c = sb3;
        this.f40824g = dVar.f40811b;
        this.d = dVar.e;
        this.e = dVar.d;
        this.f40823f = dVar.f40813f;
        this.f40820a = nVar;
        bVar.c(dVar.h, dVar.f40815i);
        this.f40828l = dVar.f40814g;
        this.f40827k = dVar.f40817k;
        this.f40821b = new rf.e(this);
        View view = dVar.f40816j;
        obj.P(view);
        this.f40826j = view;
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
        if (this.h.b() && this.f40824g.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f40829m != z11) {
            this.f40829m = z11;
            if (z10) {
                n nVar = this.f40820a;
                nVar.I();
                ((a) nVar.f7338c).invalidate();
            }
        }
    }

    public final void c() {
        this.f40825i.P(null);
        n nVar = this.f40820a;
        if (((HashMap) nVar.f7336a).remove(this.f40822c) != null) {
            nVar.I();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.c(i10, i11)) {
            b(true);
            this.f40820a.n(this);
        }
    }

    public final void e(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: pf.e.e(android.view.View):void");
    }
}
