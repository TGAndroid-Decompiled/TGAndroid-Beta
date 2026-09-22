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
    public static int f41107n;
    public static final Rect f41108o = new Rect();
    public final n f41109a;
    public final rf.e f41110b;
    public final String f41111c;
    public final int d;
    public final int e;
    public final boolean f41112f;
    public final rf.a f41113g;
    public final sf.b h;
    public final oi.f f41114i;
    public View f41115j;
    public View f41116k;
    public e0 f41117l;
    public boolean f41118m;

    public e(n nVar, d dVar) {
        int i10 = f41107n;
        f41107n = i10 + 1;
        sf.b bVar = new sf.b();
        this.h = bVar;
        h4 h4Var = new h4(this, 1);
        ?? obj = new Object();
        obj.d = new u2(obj, 11);
        obj.f15763a = h4Var;
        this.f41114i = obj;
        StringBuilder sb2 = new StringBuilder();
        String str = dVar.f41101c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i10);
        String sb3 = sb2.toString();
        this.f41111c = sb3;
        this.f41113g = dVar.f41100b;
        this.d = dVar.e;
        this.e = dVar.d;
        this.f41112f = dVar.f41102f;
        this.f41109a = nVar;
        bVar.c(dVar.h, dVar.f41104i);
        this.f41117l = dVar.f41103g;
        this.f41116k = dVar.f41106k;
        this.f41110b = new rf.e(this);
        View view = dVar.f41105j;
        obj.P(view);
        this.f41115j = view;
        if (view != null) {
            e(view);
        }
        b(false);
        ((HashMap) nVar.f7328a).put(sb3, this);
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
        if (this.h.b() && this.f41113g.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f41118m != z11) {
            this.f41118m = z11;
            if (z10) {
                n nVar = this.f41109a;
                nVar.I();
                ((a) nVar.f7330c).invalidate();
            }
        }
    }

    public final void c() {
        this.f41114i.P(null);
        n nVar = this.f41109a;
        if (((HashMap) nVar.f7328a).remove(this.f41111c) != null) {
            nVar.I();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.c(i10, i11)) {
            b(true);
            this.f41109a.n(this);
        }
    }

    public final void e(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: pf.e.e(android.view.View):void");
    }
}
