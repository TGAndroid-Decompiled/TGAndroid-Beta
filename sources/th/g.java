package th;

import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.g0;
import org.telegram.messenger.ij;
import org.telegram.messenger.w7;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.RadialProgress2;
public final class g extends sh.d {
    public final ij f56073b;
    public final RadialProgress2 f56074c;

    public g(ij ijVar) {
        this.f56073b = ijVar;
        RadialProgress2 radialProgress2 = new RadialProgress2(null, null);
        this.f56074c = radialProgress2;
        TLRPC.Document F0 = ijVar.F0();
        if (ij.W2(F0)) {
            TLRPC.PhotoSize w10 = w7.w(F0.thumbs, g0.L(22.0f), true, null, false);
            radialProgress2.j(w7.w(F0.thumbs, g0.L(44.0f), true, w10, true), w10, F0, ijVar);
        } else {
            String t02 = ij.t0(F0, true);
            if (!TextUtils.isEmpty(t02)) {
                radialProgress2.h(t02);
            } else {
                radialProgress2.i(null, null, null);
            }
        }
        radialProgress2.g(l6.We, l6.Xe, l6.f27963id, l6.f27981jd);
    }

    @Override
    public final void a(View view) {
        super.a(view);
        RadialProgress2 radialProgress2 = this.f56074c;
        radialProgress2.n(view);
        radialProgress2.e();
        radialProgress2.setIcon(0, false, false);
    }

    @Override
    public final void b() {
        super.b();
        this.f56074c.f();
    }

    @Override
    public final void c(Canvas canvas, int i7, int i10) {
        RadialProgress2 radialProgress2 = this.f56074c;
        radialProgress2.setCircleRadius(i7 / 2);
        radialProgress2.r(0, 0, i7, i10);
        radialProgress2.draw(canvas);
    }
}
