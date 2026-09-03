package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class wa1 extends View {
    public ImageReceiver f42394a;
    public ImageReceiver f42395b;
    public View f42396c;
    public org.telegram.ui.Components.af0 d;
    public Path f42397e;
    public Drawable f42398f;

    @Override
    public final void draw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(30.0f);
        int dp = AndroidUtilities.dp(46.0f) + measuredWidth;
        ImageReceiver imageReceiver = this.f42394a;
        imageReceiver.setImageCoords((measuredWidth - AndroidUtilities.dp(46.0f)) - AndroidUtilities.dp(30.0f), measuredHeight - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        this.f42395b.setImageCoords(dp - AndroidUtilities.dp(30.0f), measuredHeight - AndroidUtilities.dp(30.0f), AndroidUtilities.dp(60.0f), AndroidUtilities.dp(60.0f));
        Drawable drawable = this.f42398f;
        drawable.setBounds(b.u(2, measuredWidth, drawable), b.f(2, measuredHeight, drawable), b.A(2, measuredWidth, drawable), b.y(2, measuredHeight, drawable));
        drawable.draw(canvas);
        Path path = this.f42397e;
        path.reset();
        path.addCircle(dp, measuredHeight, AndroidUtilities.dp(30.0f), Path.Direction.CW);
        imageReceiver.draw(canvas);
        if (this.f42396c != null) {
            CropAreaView cropAreaView = this.d.f25240b.f51201a;
            float dp2 = AndroidUtilities.dp(60.0f) / cropAreaView.f24845a;
            float left = (0.0f - this.d.getLeft()) - cropAreaView.f24847b;
            canvas.save();
            canvas.clipPath(path);
            canvas.scale(dp2, dp2, 0.0f, 0.0f);
            canvas.translate(left, (0.0f - this.d.getTop()) - cropAreaView.f24849c);
            canvas.translate((dp - AndroidUtilities.dp(30.0f)) / dp2, (measuredHeight - AndroidUtilities.dp(30.0f)) / dp2);
            PhotoViewer.t1().f34252d4 = true;
            this.f42396c.draw(canvas);
            PhotoViewer.t1().f34252d4 = false;
            canvas.restore();
        }
        super.draw(canvas);
        this.f42396c.invalidate();
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f42394a.onAttachedToWindow();
        this.f42395b.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f42394a.onDetachedFromWindow();
        this.f42395b.onDetachedFromWindow();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        this.f42394a.setRoundRadius(AndroidUtilities.dp(30.0f));
        this.f42395b.setRoundRadius(AndroidUtilities.dp(30.0f));
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(86.0f), 1073741824));
    }
}
