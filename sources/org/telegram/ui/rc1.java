package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class rc1 extends View {
    public int f49452a;
    public final WallpapersListActivity f49453b;

    public rc1(WallpapersListActivity wallpapersListActivity, Context context) {
        super(context);
        this.f49453b = wallpapersListActivity;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        WallpapersListActivity wallpapersListActivity = this.f49453b;
        wallpapersListActivity.f43501s.setColor(this.f49452a);
        canvas.drawCircle(org.telegram.messenger.g0.L(25.0f), org.telegram.messenger.g0.L(31.0f), org.telegram.messenger.g0.L(18.0f), wallpapersListActivity.f43501s);
        if (this.f49452a == org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27865d6, false)) {
            canvas.drawCircle(org.telegram.messenger.g0.L(25.0f), org.telegram.messenger.g0.L(31.0f), org.telegram.messenger.g0.L(18.0f), wallpapersListActivity.f43502w);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(62.0f));
    }
}
