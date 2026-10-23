package rg;

import android.content.Context;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.jt0;
public final class g0 extends d {
    public final Paint h;
    public long f45780n;
    public float f45781r;
    public float f45782s;
    public final jt0 v;

    public g0(jt0 jt0Var, Context context, f0 f0Var) {
        super(context, f0Var);
        this.v = jt0Var;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: rg.g0.onDraw(android.graphics.Canvas):void");
    }
}
