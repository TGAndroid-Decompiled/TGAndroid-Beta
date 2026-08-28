package yf;

import android.content.Context;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.xs0;
public final class f0 extends d {
    public final Paint h;
    public long f49811n;
    public float f49812r;
    public float f49813s;
    public final xs0 v;

    public f0(xs0 xs0Var, Context context, e0 e0Var) {
        super(context, e0Var);
        this.v = xs0Var;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: yf.f0.onDraw(android.graphics.Canvas):void");
    }
}
