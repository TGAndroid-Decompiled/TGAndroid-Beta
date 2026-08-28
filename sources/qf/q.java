package qf;

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
    public final Matrix f46257z1;

    public q(Context context) {
        super(context, null);
        this.f46257z1 = new Matrix();
        this.A1 = new float[2];
        this.B1 = new Path();
        this.f46224s0 = true;
        this.f46225t0 = true;
        this.f46204e = false;
    }

    @Override
    public sf.i h(rf.a aVar) {
        return new sf.i(aVar);
    }

    public final int M(float f10, float f11) {
        RectF rectF = this.D0;
        float centerX = rectF.centerX();
        float centerY = rectF.centerY() + AndroidUtilities.dp(16.0f);
        int i9 = (f10 > centerX ? 1 : (f10 == centerX ? 0 : -1));
        if (i9 >= 0 && f11 <= centerY) {
            return 0;
        }
        if (i9 >= 0 && f11 >= centerY) {
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
        throw new UnsupportedOperationException("Method not decompiled: qf.q.k(android.graphics.Canvas):void");
    }

    @Override
    public void n(android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: qf.q.n(android.graphics.Canvas):void");
    }

    @Override
    public void onDraw(Canvas canvas) {
        F();
        k(canvas);
        i(canvas);
        ArrayList arrayList = this.f46196b;
        this.f46212i0 = arrayList.size();
        int i9 = 0;
        while (true) {
            this.f46213j0 = i9;
            int i10 = this.f46213j0;
            if (i10 < this.f46212i0) {
                l(canvas, (sf.d) arrayList.get(i10));
                p(canvas, (sf.d) arrayList.get(this.f46213j0));
                i9 = this.f46213j0 + 1;
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
    public void q(sf.j r21) {
        throw new UnsupportedOperationException("Method not decompiled: qf.q.q(sf.j):void");
    }

    @Override
    public final long r(int i9, int i10) {
        return 100L;
    }
}
