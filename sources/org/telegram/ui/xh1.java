package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class xh1 extends View {
    public int f43612a;
    public final WallpapersListActivity f43613b;

    public xh1(WallpapersListActivity wallpapersListActivity, Context context) {
        super(context);
        this.f43613b = wallpapersListActivity;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        WallpapersListActivity wallpapersListActivity = this.f43613b;
        wallpapersListActivity.f35538w.setColor(this.f43612a);
        canvas.drawCircle(AndroidUtilities.dp(25.0f), AndroidUtilities.dp(31.0f), AndroidUtilities.dp(18.0f), wallpapersListActivity.f35538w);
        if (this.f43612a == org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21184d6, false)) {
            canvas.drawCircle(AndroidUtilities.dp(25.0f), AndroidUtilities.dp(31.0f), AndroidUtilities.dp(18.0f), wallpapersListActivity.f35539x);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(62.0f));
    }
}
