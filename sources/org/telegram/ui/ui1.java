package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class ui1 extends View {
    public int f41849a;
    public final WallpapersListActivity f41850b;

    public ui1(WallpapersListActivity wallpapersListActivity, Context context) {
        super(context);
        this.f41850b = wallpapersListActivity;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        WallpapersListActivity wallpapersListActivity = this.f41850b;
        wallpapersListActivity.f34961w.setColor(this.f41849a);
        canvas.drawCircle(AndroidUtilities.dp(25.0f), AndroidUtilities.dp(31.0f), AndroidUtilities.dp(18.0f), wallpapersListActivity.f34961w);
        if (this.f41849a == org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21661d6, false)) {
            canvas.drawCircle(AndroidUtilities.dp(25.0f), AndroidUtilities.dp(31.0f), AndroidUtilities.dp(18.0f), wallpapersListActivity.f34962x);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(62.0f));
    }
}
