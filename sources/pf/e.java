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
    public static int f41157n;
    public static final Rect f41158o = new Rect();
    public final n f41159a;
    public final rf.e f41160b;
    public final String f41161c;
    public final int d;
    public final int e;
    public final boolean f41162f;
    public final rf.a f41163g;
    public final sf.b h;
    public final oi.f f41164i;
    public View f41165j;
    public View f41166k;
    public f0 f41167l;
    public boolean f41168m;

    public e(n nVar, d dVar) {
        int i10 = f41157n;
        f41157n = i10 + 1;
        sf.b bVar = new sf.b();
        this.h = bVar;
        g4 g4Var = new g4(this, 1);
        ?? obj = new Object();
        obj.d = new u2(obj, 11);
        obj.f15776a = g4Var;
        this.f41164i = obj;
        StringBuilder sb2 = new StringBuilder();
        String str = dVar.f41151c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i10);
        String sb3 = sb2.toString();
        this.f41161c = sb3;
        this.f41163g = dVar.f41150b;
        this.d = dVar.e;
        this.e = dVar.d;
        this.f41162f = dVar.f41152f;
        this.f41159a = nVar;
        bVar.c(dVar.h, dVar.f41154i);
        this.f41167l = dVar.f41153g;
        this.f41166k = dVar.f41156k;
        this.f41160b = new rf.e(this);
        View view = dVar.f41155j;
        obj.P(view);
        this.f41165j = view;
        if (view != null) {
            e(view);
        }
        b(false);
        ((HashMap) nVar.f7324a).put(sb3, this);
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
        if (this.h.b() && this.f41163g.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f41168m != z11) {
            this.f41168m = z11;
            if (z10) {
                n nVar = this.f41159a;
                nVar.I();
                ((a) nVar.f7326c).invalidate();
            }
        }
    }

    public final void c() {
        this.f41164i.P(null);
        n nVar = this.f41159a;
        if (((HashMap) nVar.f7324a).remove(this.f41161c) != null) {
            nVar.I();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.c(i10, i11)) {
            b(true);
            this.f41159a.n(this);
        }
    }

    public final void e(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: pf.e.e(android.view.View):void");
    }
}
