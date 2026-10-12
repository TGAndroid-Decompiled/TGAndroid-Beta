package rf;

import android.app.PictureInPictureParams;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import com.google.firebase.messaging.m;
import com.google.firebase.messaging.s;
import di.f4;
import i2.h0;
import java.util.HashMap;
import k2.m0;
public final class d {
    public static int f44172n;
    public static final Rect f44173o = new Rect();
    public final m f44174a;
    public final tf.e f44175b;
    public final String f44176c;
    public final int d;
    public final int e;
    public final boolean f44177f;
    public final tf.a f44178g;
    public final m0 h;
    public final s f44179i;
    public View f44180j;
    public View f44181k;
    public h0 f44182l;
    public boolean f44183m;

    public d(m mVar, c cVar) {
        int i10 = f44172n;
        f44172n = i10 + 1;
        m0 m0Var = new m0();
        this.h = m0Var;
        s sVar = new s(new f4(this, 1));
        this.f44179i = sVar;
        StringBuilder sb2 = new StringBuilder();
        String str = cVar.f44166c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i10);
        String sb3 = sb2.toString();
        this.f44176c = sb3;
        this.f44178g = cVar.f44165b;
        this.d = cVar.e;
        this.e = cVar.d;
        this.f44177f = cVar.f44167f;
        this.f44174a = mVar;
        m0Var.d(cVar.h, cVar.f44169i);
        this.f44182l = cVar.f44168g;
        this.f44181k = cVar.f44171k;
        this.f44175b = new tf.e(this);
        View view = cVar.f44170j;
        sVar.t(view);
        this.f44180j = view;
        if (view != null) {
            e(view);
        }
        b(false);
        ((HashMap) mVar.f6191a).put(sb3, this);
        mVar.I();
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
        if (this.h.c() && this.f44178g.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f44183m != z11) {
            this.f44183m = z11;
            if (z10) {
                m mVar = this.f44174a;
                mVar.I();
                ((a) mVar.f6193c).invalidate();
            }
        }
    }

    public final void c() {
        this.f44179i.t(null);
        m mVar = this.f44174a;
        if (((HashMap) mVar.f6191a).remove(this.f44176c) != null) {
            mVar.I();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.d(i10, i11)) {
            b(true);
            this.f44174a.n(this);
        }
    }

    public final void e(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: rf.d.e(android.view.View):void");
    }
}
