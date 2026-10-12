package qg;

import android.content.Context;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.cu0;
public final class g0 extends d {
    public final Paint h;
    public long f46190n;
    public float f46191r;
    public float f46192s;
    public final cu0 v;

    public g0(cu0 cu0Var, Context context, f0 f0Var) {
        super(context, f0Var);
        this.v = cu0Var;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: qg.g0.onDraw(android.graphics.Canvas):void");
    }
}
