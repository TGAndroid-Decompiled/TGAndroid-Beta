package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.messenger.AndroidUtilities;
public final class rz0 extends a10 {
    @Override
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        canvas.save();
        canvas.translate(AndroidUtilities.dp(2.0f), 0.0f);
        super.draw(canvas, charSequence, i10, i11, f10, i12, i13, i14, paint);
        canvas.restore();
    }
}
