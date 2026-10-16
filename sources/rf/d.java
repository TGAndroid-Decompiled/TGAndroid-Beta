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
    public static int f43931n;
    public static final Rect f43932o = new Rect();
    public final m f43933a;
    public final tf.e f43934b;
    public final String f43935c;
    public final int d;
    public final int e;
    public final boolean f43936f;
    public final tf.a f43937g;
    public final m0 h;
    public final s f43938i;
    public View f43939j;
    public View f43940k;
    public h0 f43941l;
    public boolean f43942m;

    public d(m mVar, c cVar) {
        int i10 = f43931n;
        f43931n = i10 + 1;
        m0 m0Var = new m0();
        this.h = m0Var;
        s sVar = new s(new f4(this, 1));
        this.f43938i = sVar;
        StringBuilder sb2 = new StringBuilder();
        String str = cVar.f43925c;
        sb2.append(str == null ? "pip-source" : str);
        sb2.append("-");
        sb2.append(i10);
        String sb3 = sb2.toString();
        this.f43935c = sb3;
        this.f43937g = cVar.f43924b;
        this.d = cVar.e;
        this.e = cVar.d;
        this.f43936f = cVar.f43926f;
        this.f43933a = mVar;
        m0Var.d(cVar.h, cVar.f43928i);
        this.f43941l = cVar.f43927g;
        this.f43940k = cVar.f43930k;
        this.f43934b = new tf.e(this);
        View view = cVar.f43929j;
        sVar.t(view);
        this.f43939j = view;
        if (view != null) {
            e(view);
        }
        b(false);
        ((HashMap) mVar.f6194a).put(sb3, this);
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
        if (this.h.c() && this.f43937g.g()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f43942m != z11) {
            this.f43942m = z11;
            if (z10) {
                m mVar = this.f43933a;
                mVar.I();
                ((a) mVar.f6196c).invalidate();
            }
        }
    }

    public final void c() {
        this.f43938i.t(null);
        m mVar = this.f43933a;
        if (((HashMap) mVar.f6194a).remove(this.f43935c) != null) {
            mVar.I();
        }
    }

    public final void d(int i10, int i11) {
        if (this.h.d(i10, i11)) {
            b(true);
            this.f43933a.n(this);
        }
    }

    public final void e(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: rf.d.e(android.view.View):void");
    }
}
