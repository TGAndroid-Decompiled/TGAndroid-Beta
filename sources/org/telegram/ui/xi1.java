package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class xi1 extends View {
    public int f40033a;
    public final WallpapersListActivity f40034b;

    public xi1(WallpapersListActivity wallpapersListActivity, Context context) {
        super(context);
        this.f40034b = wallpapersListActivity;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        WallpapersListActivity wallpapersListActivity = this.f40034b;
        wallpapersListActivity.f31999w.setColor(this.f40033a);
        canvas.drawCircle(AndroidUtilities.dp(25.0f), AndroidUtilities.dp(31.0f), AndroidUtilities.dp(18.0f), wallpapersListActivity.f31999w);
        if (this.f40033a == org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19076d6, false)) {
            canvas.drawCircle(AndroidUtilities.dp(25.0f), AndroidUtilities.dp(31.0f), AndroidUtilities.dp(18.0f), wallpapersListActivity.f32000x);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(62.0f));
    }
}
