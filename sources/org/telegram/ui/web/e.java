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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import w7.z5;
public final class e extends FrameLayout {
    public final ImageView f42174a;
    public final TextView f42175b;
    public final ImageView f42176c;
    public final Paint d;
    public boolean f42177e;

    public e(Context context) {
        super(context);
        this.d = new Paint(1);
        ImageView imageView = new ImageView(context);
        this.f42174a = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(R.drawable.menu_clear_recent);
        addView(imageView, z5.d(32, 32.0f, 19, 10.0f, 8.0f, 8.0f, 8.0f));
        TextView textView = new TextView(context);
        this.f42175b = textView;
        textView.setTextSize(1, 16.0f);
        addView(textView, z5.d(-1, -2.0f, 19, 64.0f, 8.0f, 64.0f, 8.0f));
        ImageView imageView2 = new ImageView(context);
        this.f42176c = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(R.drawable.menu_browser_arrowup);
        addView(imageView2, z5.d(32, 32.0f, 21, 8.0f, 8.0f, 10.0f, 8.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f42177e) {
            canvas.drawRect(AndroidUtilities.dp(64.0f), getHeight() - Math.max(AndroidUtilities.dp(0.66f), 1), getWidth(), getHeight(), this.d);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setAsShowMore(k kVar) {
        int i10 = R.drawable.arrow_more;
        ImageView imageView = this.f42174a;
        imageView.setImageResource(i10);
        imageView.setColorFilter(new PorterDuffColorFilter(kVar.H, PorterDuff.Mode.SRC_IN));
    }
}
