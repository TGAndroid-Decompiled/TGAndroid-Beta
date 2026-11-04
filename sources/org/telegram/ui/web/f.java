package org.telegram.ui.web;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import b8.mf;
public final class f extends FrameLayout {
    public final ImageView f50837a;
    public final TextView f50838b;
    public final ImageView f50839c;
    public final Paint d;
    public boolean f50840e;

    public f(Context context) {
        super(context);
        this.d = new Paint(1);
        ImageView imageView = new ImageView(context);
        this.f50837a = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231777);
        addView(imageView, mf.d(32, 32.0f, 19, 10.0f, 8.0f, 8.0f, 8.0f));
        TextView textView = new TextView(context);
        this.f50838b = textView;
        textView.setTextSize(1, 16.0f);
        addView(textView, mf.d(-1, -2.0f, 19, 64.0f, 8.0f, 64.0f, 8.0f));
        ImageView imageView2 = new ImageView(context);
        this.f50839c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131231768);
        addView(imageView2, mf.d(32, 32.0f, 21, 8.0f, 8.0f, 10.0f, 8.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f50840e) {
            canvas.drawRect(org.telegram.messenger.g0.L(64.0f), getHeight() - Math.max(org.telegram.messenger.g0.L(0.66f), 1), getWidth(), getHeight(), this.d);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), i10);
    }

    public void setAsShowMore(l lVar) {
        ImageView imageView = this.f50837a;
        imageView.setImageResource(2131230871);
        imageView.setColorFilter(new PorterDuffColorFilter(lVar.I, PorterDuff.Mode.SRC_IN));
    }
}
