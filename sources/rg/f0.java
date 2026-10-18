package rg;

import android.content.Context;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.it0;
public final class f0 extends d {
    public final Paint h;
    public long f45386n;
    public float f45387r;
    public float f45388s;
    public final it0 v;

    public f0(it0 it0Var, Context context, e0 e0Var) {
        super(context, e0Var);
        this.v = it0Var;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: rg.f0.onDraw(android.graphics.Canvas):void");
    }
}
