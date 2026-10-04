package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class xi1 extends View {
    public int f42902a;
    public final WallpapersListActivity f42903b;

    public xi1(WallpapersListActivity wallpapersListActivity, Context context) {
        super(context);
        this.f42903b = wallpapersListActivity;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        WallpapersListActivity wallpapersListActivity = this.f42903b;
        wallpapersListActivity.f34619s.setColor(this.f42902a);
        canvas.drawCircle(AndroidUtilities.dp(25.0f), AndroidUtilities.dp(31.0f), AndroidUtilities.dp(18.0f), wallpapersListActivity.f34619s);
        if (this.f42902a == org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20822d6, false)) {
            canvas.drawCircle(AndroidUtilities.dp(25.0f), AndroidUtilities.dp(31.0f), AndroidUtilities.dp(18.0f), wallpapersListActivity.v);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(62.0f));
    }
}
