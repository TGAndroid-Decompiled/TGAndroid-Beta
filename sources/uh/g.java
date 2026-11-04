package uh;

import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.g0;
import org.telegram.messenger.w7;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.RadialProgress2;
public final class g extends th.c {
    public final zi f56365b;
    public final RadialProgress2 f56366c;

    public g(zi ziVar) {
        this.f56365b = ziVar;
        RadialProgress2 radialProgress2 = new RadialProgress2(null, null);
        this.f56366c = radialProgress2;
        TLRPC.Document F0 = ziVar.F0();
        if (zi.X2(F0)) {
            TLRPC.PhotoSize w10 = w7.w(F0.thumbs, g0.L(22.0f), true, null, false);
            radialProgress2.j(w7.w(F0.thumbs, g0.L(44.0f), true, w10, true), w10, F0, ziVar);
        } else {
            String t02 = zi.t0(F0, true);
            if (!TextUtils.isEmpty(t02)) {
                radialProgress2.h(t02);
            } else {
                radialProgress2.i(null, null, null);
            }
        }
        radialProgress2.g(k6.We, k6.Xe, k6.f27979id, k6.f27995jd);
    }

    @Override
    public final void a(View view) {
        super.a(view);
        RadialProgress2 radialProgress2 = this.f56366c;
        radialProgress2.n(view);
        radialProgress2.e();
        radialProgress2.setIcon(0, false, false);
    }

    @Override
    public final void b() {
        super.b();
        this.f56366c.f();
    }

    @Override
    public final void c(Canvas canvas, int i3, int i10) {
        RadialProgress2 radialProgress2 = this.f56366c;
        radialProgress2.setCircleRadius(i3 / 2);
        radialProgress2.r(0, 0, i3, i10);
        radialProgress2.draw(canvas);
    }
}
