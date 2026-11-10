package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
public final class sc1 extends View {
    public int f49830a;
    public final WallpapersListActivity f49831b;

    public sc1(WallpapersListActivity wallpapersListActivity, Context context) {
        super(context);
        this.f49831b = wallpapersListActivity;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        WallpapersListActivity wallpapersListActivity = this.f49831b;
        wallpapersListActivity.f43503s.setColor(this.f49830a);
        canvas.drawCircle(org.telegram.messenger.g0.L(25.0f), org.telegram.messenger.g0.L(31.0f), org.telegram.messenger.g0.L(18.0f), wallpapersListActivity.f43503s);
        if (this.f49830a == org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f27890d6, false)) {
            canvas.drawCircle(org.telegram.messenger.g0.L(25.0f), org.telegram.messenger.g0.L(31.0f), org.telegram.messenger.g0.L(18.0f), wallpapersListActivity.f43504w);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(org.telegram.messenger.g0.L(50.0f), org.telegram.messenger.g0.L(62.0f));
    }
}
