package wf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public class q extends g {
    public final Matrix A1;
    public final float[] B1;
    public final Path C1;
    public boolean[] D1;
    public float[] E1;

    public q(Context context) {
        super(context, null);
        this.A1 = new Matrix();
        this.B1 = new float[2];
        this.C1 = new Path();
        this.f49574t0 = true;
        this.f49575u0 = true;
        this.f49552e = false;
    }

    @Override
    public yf.i h(xf.a aVar) {
        return new yf.i(aVar);
    }

    public final int M(float f10, float f11) {
        RectF rectF = this.E0;
        float centerX = rectF.centerX();
        float centerY = rectF.centerY() + AndroidUtilities.dp(16.0f);
        int i10 = (f10 > centerX ? 1 : (f10 == centerX ? 0 : -1));
        if (i10 >= 0 && f11 <= centerY) {
            return 0;
        }
        if (i10 >= 0 && f11 >= centerY) {
            return 1;
        }
        if (f10 < centerX && f11 >= centerY) {
            return 2;
        }
        return 3;
    }

    @Override
    public float getMinDistance() {
        return 0.1f;
    }

    @Override
    public void k(android.graphics.Canvas r46) {
        throw new UnsupportedOperationException("Method not decompiled: wf.q.k(android.graphics.Canvas):void");
    }

    @Override
    public void n(android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: wf.q.n(android.graphics.Canvas):void");
    }

    @Override
    public void onDraw(Canvas canvas) {
        F();
        k(canvas);
        i(canvas);
        ArrayList arrayList = this.f49544b;
        this.f49562j0 = arrayList.size();
        int i10 = 0;
        while (true) {
            this.f49563k0 = i10;
            int i11 = this.f49563k0;
            if (i11 < this.f49562j0) {
                l(canvas, (yf.d) arrayList.get(i11));
                p(canvas, (yf.d) arrayList.get(this.f49563k0));
                i10 = this.f49563k0 + 1;
            } else {
                j(canvas);
                m(canvas);
                o(canvas);
                super.onDraw(canvas);
                return;
            }
        }
    }

    @Override
    public void q(yf.j r21) {
        throw new UnsupportedOperationException("Method not decompiled: wf.q.q(yf.j):void");
    }

    @Override
    public final long r(int i10, int i11) {
        return 100L;
    }
}
