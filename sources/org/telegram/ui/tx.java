package org.telegram.ui;

import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
public final class tx extends org.telegram.ui.Components.o5 {
    @Override
    public final void draw(Canvas canvas) {
        canvas.save();
        canvas.translate(AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(1.0f));
        super.draw(canvas);
        canvas.restore();
    }
}
