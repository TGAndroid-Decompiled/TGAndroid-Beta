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
import org.telegram.ui.Components.q5;
import org.telegram.ui.sk;
import w7.x5;
public final class z1 extends FrameLayout {
    public final ImageView f42338a;
    public final TextView f42339b;
    public final sk f42340c;
    public q5 d;
    public String f42341e;
    public boolean f42342f;

    public z1(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.f42338a = imageView;
        addView(imageView, x5.d(32, 32.0f, 19, 16.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f42339b = textView;
        textView.setTextColor(j6.w0(null, j6.G6, false));
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, x5.d(-1, -2.0f, 55, 68.0f, 7.0f, 54.0f, 0.0f));
        sk skVar = new sk(this, context, 6);
        this.f42340c = skVar;
        skVar.setTextColor(j6.w0(null, j6.f21042y6, false));
        skVar.setTextSize(1, 13.0f);
        skVar.setMaxLines(1);
        skVar.setEllipsize(truncateAt);
        skVar.setPivotX(0.0f);
        addView(skVar, x5.d(-1, -2.0f, 55, 68.0f, 30.0f, 54.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.ic_ab_other);
        imageView2.setColorFilter(new PorterDuffColorFilter(j6.w0(null, j6.A6, false), PorterDuff.Mode.SRC_IN));
        addView(imageView2, x5.d(32, 32.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f42342f) {
            canvas.drawRect(AndroidUtilities.dp(64.0f), getHeight() - 1, getWidth(), getHeight(), j6.f20785k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }
}
