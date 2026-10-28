package sg;

import android.content.Context;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.pt0;
public final class g0 extends d {
    public final Paint h;
    public long f48253n;
    public float f48254r;
    public float f48255s;
    public final pt0 v;

    public g0(pt0 pt0Var, Context context, f0 f0Var) {
        super(context, f0Var);
        this.v = pt0Var;
        Paint paint = new Paint();
        this.h = paint;
        setWillNotDraw(false);
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
    }

    @Override
    public final void onDraw(android.graphics.Canvas r14) {
        throw new UnsupportedOperationException("Method not decompiled: sg.g0.onDraw(android.graphics.Canvas):void");
    }
}
