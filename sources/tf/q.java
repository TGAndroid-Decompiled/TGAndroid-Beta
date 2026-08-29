package tf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
public class q extends g {
    public final float[] A1;
    public final Path B1;
    public boolean[] C1;
    public float[] D1;
    public final Matrix f48316z1;

    public q(Context context) {
        super(context, null);
        this.f48316z1 = new Matrix();
        this.A1 = new float[2];
        this.B1 = new Path();
        this.f48283s0 = true;
        this.f48284t0 = true;
        this.f48263e = false;
    }

    @Override
    public vf.i h(uf.a aVar) {
        return new vf.i(aVar);
    }

    public final int M(float f9, float f10) {
        RectF rectF = this.D0;
        float centerX = rectF.centerX();
        float centerY = rectF.centerY() + AndroidUtilities.dp(16.0f);
        int i10 = (f9 > centerX ? 1 : (f9 == centerX ? 0 : -1));
        if (i10 >= 0 && f10 <= centerY) {
            return 0;
        }
        if (i10 >= 0 && f10 >= centerY) {
            return 1;
        }
        if (f9 < centerX && f10 >= centerY) {
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
        throw new UnsupportedOperationException("Method not decompiled: tf.q.k(android.graphics.Canvas):void");
    }

    @Override
    public void n(android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: tf.q.n(android.graphics.Canvas):void");
    }

    @Override
    public void onDraw(Canvas canvas) {
        F();
        k(canvas);
        i(canvas);
        ArrayList arrayList = this.f48255b;
        this.f48271i0 = arrayList.size();
        int i10 = 0;
        while (true) {
            this.f48272j0 = i10;
            int i11 = this.f48272j0;
            if (i11 < this.f48271i0) {
                l(canvas, (vf.d) arrayList.get(i11));
                p(canvas, (vf.d) arrayList.get(this.f48272j0));
                i10 = this.f48272j0 + 1;
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
    public void q(vf.j r21) {
        throw new UnsupportedOperationException("Method not decompiled: tf.q.q(vf.j):void");
    }

    @Override
    public final long r(int i10, int i11) {
        return 100L;
    }
}
