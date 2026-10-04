package org.telegram.ui.web;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.q5;
import org.telegram.ui.pk;
import w7.z5;
public final class z1 extends FrameLayout {
    public final ImageView f42434a;
    public final TextView f42435b;
    public final pk f42436c;
    public q5 d;
    public String f42437e;
    public boolean f42438f;

    public z1(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.f42434a = imageView;
        addView(imageView, z5.d(32, 32.0f, 19, 16.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f42435b = textView;
        textView.setTextColor(i6.w0(null, i6.G6, false));
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, z5.d(-1, -2.0f, 55, 68.0f, 7.0f, 54.0f, 0.0f));
        pk pkVar = new pk(this, context, 6);
        this.f42436c = pkVar;
        pkVar.setTextColor(i6.w0(null, i6.f21204y6, false));
        pkVar.setTextSize(1, 13.0f);
        pkVar.setMaxLines(1);
        pkVar.setEllipsize(truncateAt);
        pkVar.setPivotX(0.0f);
        addView(pkVar, z5.d(-1, -2.0f, 55, 68.0f, 30.0f, 54.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.ic_ab_other);
        imageView2.setColorFilter(new PorterDuffColorFilter(i6.w0(null, i6.A6, false), PorterDuff.Mode.SRC_IN));
        addView(imageView2, z5.d(32, 32.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f42438f) {
            canvas.drawRect(AndroidUtilities.dp(64.0f), getHeight() - 1, getWidth(), getHeight(), i6.f20940k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }
}
