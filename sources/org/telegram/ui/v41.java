package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class v41 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final Path f41410a;
    public dh.d f41411b;

    public v41(Activity activity) {
        super(activity);
        this.f41410a = new Path();
    }

    @Override
    public final void d() {
        dh.d dVar = this.f41411b;
        if (dVar != null) {
            dVar.u();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f41410a);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        Path path = this.f41410a;
        path.rewind();
        path.addRoundRect(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(9.0f), i10 - AndroidUtilities.dp(9.0f), i11 - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Path.Direction.CW);
    }

    public void setBlurredBackground(dh.d dVar) {
        this.f41411b = dVar;
        setBackground(dVar);
    }
}
