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
import w7.b6;
public final class d extends FrameLayout {
    public final ImageView f42815a;
    public final TextView f42816b;
    public final ImageView f42817c;
    public final Paint d;
    public boolean e;

    public d(Context context) {
        super(context);
        this.d = new Paint(1);
        ImageView imageView = new ImageView(context);
        this.f42815a = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(2131231776);
        addView(imageView, b6.d(32, 32.0f, 19, 10.0f, 8.0f, 8.0f, 8.0f));
        TextView textView = new TextView(context);
        this.f42816b = textView;
        textView.setTextSize(1, 16.0f);
        addView(textView, b6.d(-1, -2.0f, 19, 64.0f, 8.0f, 64.0f, 8.0f));
        ImageView imageView2 = new ImageView(context);
        this.f42817c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131231767);
        addView(imageView2, b6.d(32, 32.0f, 21, 8.0f, 8.0f, 10.0f, 8.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.e) {
            canvas.drawRect(org.telegram.messenger.i0.L(64.0f), getHeight() - Math.max(org.telegram.messenger.i0.L(0.66f), 1), getWidth(), getHeight(), this.d);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setAsShowMore(j jVar) {
        ImageView imageView = this.f42815a;
        imageView.setImageResource(2131230871);
        imageView.setColorFilter(new PorterDuffColorFilter(jVar.H, PorterDuff.Mode.SRC_IN));
    }
}
