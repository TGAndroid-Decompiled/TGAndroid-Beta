package rg;

import android.content.Context;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.gu0;
public final class h0 extends d {
    public final Paint h;
    public long f44031n;
    public float f44032r;
    public float f44033s;
    public final gu0 v;

    public h0(gu0 gu0Var, Context context, g0 g0Var) {
        super(context, g0Var);
        this.v = gu0Var;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: rg.h0.onDraw(android.graphics.Canvas):void");
    }
}
