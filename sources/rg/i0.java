package rg;

import android.content.Context;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.zt0;
public final class i0 extends d {
    public final Paint h;
    public long f45240n;
    public float f45241r;
    public float f45242s;
    public final zt0 v;

    public i0(zt0 zt0Var, Context context, h0 h0Var) {
        super(context, h0Var);
        this.v = zt0Var;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: rg.i0.onDraw(android.graphics.Canvas):void");
    }
}
