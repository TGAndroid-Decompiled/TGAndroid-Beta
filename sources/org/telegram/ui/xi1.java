package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class xi1 extends View {
    public int f39287a;
    public final WallpapersListActivity f39288b;

    public xi1(WallpapersListActivity wallpapersListActivity, Context context) {
        super(context);
        this.f39288b = wallpapersListActivity;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        WallpapersListActivity wallpapersListActivity = this.f39288b;
        wallpapersListActivity.f31610w.setColor(this.f39287a);
        canvas.drawCircle(AndroidUtilities.dp(25.0f), AndroidUtilities.dp(31.0f), AndroidUtilities.dp(18.0f), wallpapersListActivity.f31610w);
        if (this.f39287a == org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f18789d6, false)) {
            canvas.drawCircle(AndroidUtilities.dp(25.0f), AndroidUtilities.dp(31.0f), AndroidUtilities.dp(18.0f), wallpapersListActivity.f31611x);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(62.0f));
    }
}
