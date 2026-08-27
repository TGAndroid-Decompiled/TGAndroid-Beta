package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.Crop.CropAreaView;

public final class z91 extends View {

    public ImageReceiver f45114a;

    public ImageReceiver f45115b;

    public View f45116c;
    public org.telegram.ui.Components.ge0 d;

    public Path f45117e;

    public Drawable f45118f;

    @Override
    public final void draw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(30.0f);
        int iDp = measuredWidth - AndroidUtilities.dp(46.0f);
        int iDp2 = AndroidUtilities.dp(46.0f) + measuredWidth;
        ImageReceiver imageReceiver = this.f45114a;
        imageReceiver.setImageCoords(iDp - AndroidUtilities.dp(30.0f), measuredHeight - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        this.f45115b.setImageCoords(iDp2 - AndroidUtilities.dp(30.0f), measuredHeight - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        Drawable drawable = this.f45118f;
        drawable.setBounds(org.telegram.messenger.rl.v(2, measuredWidth, drawable), org.telegram.messenger.rl.e(2, measuredHeight, drawable), org.telegram.messenger.rl.A(2, measuredWidth, drawable), org.telegram.messenger.rl.y(2, measuredHeight, drawable));
        drawable.draw(canvas);
        Path path = this.f45117e;
        path.reset();
        path.addCircle(iDp2, measuredHeight, AndroidUtilities.dp(30.0f), Path.Direction.CW);
        imageReceiver.draw(canvas);
        if (this.f45116c != null) {
            float top = 0.0f - this.d.getTop();
            float left = 0.0f - this.d.getLeft();
            float fDp = AndroidUtilities.dp(60.0f);
            CropAreaView cropAreaView = this.d.f28602b.f48626a;
            float f10 = fDp / cropAreaView.f26343a;
            float f11 = top - cropAreaView.f26347c;
            float f12 = left - cropAreaView.f26345b;
            canvas.save();
            canvas.clipPath(path);
            canvas.scale(f10, f10, 0.0f, 0.0f);
            canvas.translate(f12, f11);
            canvas.translate((iDp2 - AndroidUtilities.dp(30.0f)) / f10, (measuredHeight - AndroidUtilities.dp(30.0f)) / f10);
            PhotoViewer.t1().f35605c4 = true;
            this.f45116c.draw(canvas);
            PhotoViewer.t1().f35605c4 = false;
            canvas.restore();
        }
        super.draw(canvas);
        this.f45116c.invalidate();
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f45114a.onAttachedToWindow();
        this.f45115b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f45114a.onDetachedFromWindow();
        this.f45115b.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f45114a.setRoundRadius(AndroidUtilities.dp(30.0f));
        this.f45115b.setRoundRadius(AndroidUtilities.dp(30.0f));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), 1073741824));
    }
}
