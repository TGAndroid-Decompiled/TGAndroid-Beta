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
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.l5;
import org.telegram.ui.rk;
public final class x1 extends FrameLayout {
    public final ImageView f39644a;
    public final TextView f39645b;
    public final rk f39646c;
    public l5 d;
    public String e;
    public boolean f39647f;

    public x1(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.f39644a = imageView;
        addView(imageView, b6.d(32, 32.0f, 19, 16.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f39645b = textView;
        textView.setTextColor(j6.w0(null, j6.G6, false));
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, b6.d(-1, -2.0f, 55, 68.0f, 7.0f, 54.0f, 0.0f));
        rk rkVar = new rk(this, context, 6);
        this.f39646c = rkVar;
        rkVar.setTextColor(j6.w0(null, j6.f20256y6, false));
        rkVar.setTextSize(1, 13.0f);
        rkVar.setMaxLines(1);
        rkVar.setEllipsize(truncateAt);
        rkVar.setPivotX(0.0f);
        addView(rkVar, b6.d(-1, -2.0f, 55, 68.0f, 30.0f, 54.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.ic_ab_other);
        imageView2.setColorFilter(new PorterDuffColorFilter(j6.w0(null, j6.A6, false), PorterDuff.Mode.SRC_IN));
        addView(imageView2, b6.d(32, 32.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f39647f) {
            canvas.drawRect(AndroidUtilities.dp(64.0f), getHeight() - 1, getWidth(), getHeight(), j6.f20000k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }
}
