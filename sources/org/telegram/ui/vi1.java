package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class vi1 extends View {
    public int f41762a;
    public final WallpapersListActivity f41763b;

    public vi1(WallpapersListActivity wallpapersListActivity, Context context) {
        super(context);
        this.f41763b = wallpapersListActivity;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        WallpapersListActivity wallpapersListActivity = this.f41763b;
        wallpapersListActivity.f34632s.setColor(this.f41762a);
        canvas.drawCircle(AndroidUtilities.dp(25.0f), AndroidUtilities.dp(31.0f), AndroidUtilities.dp(18.0f), wallpapersListActivity.f34632s);
        if (this.f41762a == org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20827d6, false)) {
            canvas.drawCircle(AndroidUtilities.dp(25.0f), AndroidUtilities.dp(31.0f), AndroidUtilities.dp(18.0f), wallpapersListActivity.v);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(50.0f), AndroidUtilities.dp(62.0f));
    }
}
