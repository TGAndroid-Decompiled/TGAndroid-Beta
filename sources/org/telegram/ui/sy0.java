package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Path;
import android.widget.FrameLayout;
import java.util.HashSet;
public final class sy0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public final Path f49646a;
    public gh.g f49647b;

    public sy0(Activity activity) {
        super(activity);
        this.f49646a = new Path();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.f49646a);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        Path path = this.f49646a;
        path.rewind();
        path.addRoundRect(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(9.0f), i3 - org.telegram.messenger.g0.L(9.0f), i10 - org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), Path.Direction.CW);
    }

    public void setBlurredBackground(gh.g gVar) {
        this.f49647b = gVar;
        setBackground(gVar);
    }

    @Override
    public final void updateColors() {
        gh.g gVar = this.f49647b;
        if (gVar != null) {
            gVar.updateColors();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
