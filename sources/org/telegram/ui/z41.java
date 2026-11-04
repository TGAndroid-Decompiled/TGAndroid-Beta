package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.Crop.CropAreaView;
public final class z41 extends View {
    public ImageReceiver f52528a;
    public ImageReceiver f52529b;
    public View f52530c;
    public org.telegram.ui.Components.ad0 d;
    public Path f52531e;
    public Drawable f52532f;

    @Override
    public final void draw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() - org.telegram.messenger.g0.L(30.0f);
        int L = org.telegram.messenger.g0.L(46.0f) + measuredWidth;
        ImageReceiver imageReceiver = this.f52528a;
        imageReceiver.y0((measuredWidth - org.telegram.messenger.g0.L(46.0f)) - org.telegram.messenger.g0.L(30.0f), measuredHeight - org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f));
        this.f52529b.y0(L - org.telegram.messenger.g0.L(30.0f), measuredHeight - org.telegram.messenger.g0.L(30.0f), org.telegram.messenger.g0.L(60.0f), org.telegram.messenger.g0.L(60.0f));
        Drawable drawable = this.f52532f;
        drawable.setBounds(org.telegram.ui.Cells.f1.C(2, measuredWidth, drawable), org.telegram.ui.Cells.f1.B(2, measuredHeight, drawable), org.telegram.ui.Cells.f1.z(2, measuredWidth, drawable), org.telegram.ui.Cells.f1.i(2, measuredHeight, drawable));
        drawable.draw(canvas);
        Path path = this.f52531e;
        path.reset();
        path.addCircle(L, measuredHeight, org.telegram.messenger.g0.L(30.0f), Path.Direction.CW);
        imageReceiver.h(canvas, null);
        if (this.f52530c != null) {
            CropAreaView cropAreaView = this.d.f31808b.f53511a;
            float L2 = org.telegram.messenger.g0.L(60.0f) / cropAreaView.f31369a;
            float left = (0.0f - this.d.getLeft()) - cropAreaView.f31371b;
            canvas.save();
            canvas.clipPath(path);
            canvas.scale(L2, L2, 0.0f, 0.0f);
            canvas.translate(left, (0.0f - this.d.getTop()) - cropAreaView.f31373c);
            canvas.translate((L - org.telegram.messenger.g0.L(30.0f)) / L2, (measuredHeight - org.telegram.messenger.g0.L(30.0f)) / L2);
            PhotoViewer.v1().f41441h4 = true;
            this.f52530c.draw(canvas);
            PhotoViewer.v1().f41441h4 = false;
            canvas.restore();
        }
        super.draw(canvas);
        this.f52530c.invalidate();
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f52528a.P();
        this.f52529b.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f52528a.R();
        this.f52529b.R();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        this.f52528a.J0(org.telegram.messenger.g0.L(30.0f));
        this.f52529b.J0(org.telegram.messenger.g0.L(30.0f));
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(86.0f), 1073741824));
    }
}
