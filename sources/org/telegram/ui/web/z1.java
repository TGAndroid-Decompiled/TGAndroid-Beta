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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.p5;
import org.telegram.ui.sk;
import w7.y5;
public final class z1 extends FrameLayout {
    public final ImageView f39154a;
    public final TextView f39155b;
    public final sk f39156c;
    public p5 d;
    public String e;
    public boolean f39157f;

    public z1(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.f39154a = imageView;
        addView(imageView, y5.d(32, 32.0f, 19, 16.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f39155b = textView;
        textView.setTextColor(j6.w0(null, j6.G6, false));
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, y5.d(-1, -2.0f, 55, 68.0f, 7.0f, 54.0f, 0.0f));
        sk skVar = new sk(this, context, 6);
        this.f39156c = skVar;
        skVar.setTextColor(j6.w0(null, j6.f19492y6, false));
        skVar.setTextSize(1, 13.0f);
        skVar.setMaxLines(1);
        skVar.setEllipsize(truncateAt);
        skVar.setPivotX(0.0f);
        addView(skVar, y5.d(-1, -2.0f, 55, 68.0f, 30.0f, 54.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.ic_ab_other);
        imageView2.setColorFilter(new PorterDuffColorFilter(j6.w0(null, j6.A6, false), PorterDuff.Mode.SRC_IN));
        addView(imageView2, y5.d(32, 32.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f39157f) {
            canvas.drawRect(AndroidUtilities.dp(64.0f), getHeight() - 1, getWidth(), getHeight(), j6.f19231k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }
}
