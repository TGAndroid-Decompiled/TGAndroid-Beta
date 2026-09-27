package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class vi1 extends View {
    public int f38621a;
    public final WallpapersListActivity f38622b;

    public vi1(WallpapersListActivity wallpapersListActivity, Context context) {
        super(context);
        this.f38622b = wallpapersListActivity;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        WallpapersListActivity wallpapersListActivity = this.f38622b;
        wallpapersListActivity.f31924s.setColor(this.f38621a);
        canvas.drawCircle(AndroidUtilities.dp(25.0f), AndroidUtilities.dp(31.0f), AndroidUtilities.dp(18.0f), wallpapersListActivity.f31924s);
        if (this.f38621a == org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f19057d6, false)) {
            canvas.drawCircle(AndroidUtilities.dp(25.0f), AndroidUtilities.dp(31.0f), AndroidUtilities.dp(18.0f), wallpapersListActivity.v);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(62.0f));
    }
}
