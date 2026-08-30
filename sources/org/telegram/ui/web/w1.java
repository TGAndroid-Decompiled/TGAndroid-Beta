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
import org.telegram.ui.pk;
public final class w1 extends FrameLayout {
    public final ImageView f39692a;
    public final TextView f39693b;
    public final pk f39694c;
    public l5 d;
    public String e;
    public boolean f39695f;

    public w1(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.f39692a = imageView;
        addView(imageView, b6.d(32, 32.0f, 19, 16.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f39693b = textView;
        textView.setTextColor(j6.w0(null, j6.G6, false));
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, b6.d(-1, -2.0f, 55, 68.0f, 7.0f, 54.0f, 0.0f));
        pk pkVar = new pk(this, context, 6);
        this.f39694c = pkVar;
        pkVar.setTextColor(j6.w0(null, j6.f20281y6, false));
        pkVar.setTextSize(1, 13.0f);
        pkVar.setMaxLines(1);
        pkVar.setEllipsize(truncateAt);
        pkVar.setPivotX(0.0f);
        addView(pkVar, b6.d(-1, -2.0f, 55, 68.0f, 30.0f, 54.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.ic_ab_other);
        imageView2.setColorFilter(new PorterDuffColorFilter(j6.w0(null, j6.A6, false), PorterDuff.Mode.SRC_IN));
        addView(imageView2, b6.d(32, 32.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f39695f) {
            canvas.drawRect(AndroidUtilities.dp(64.0f), getHeight() - 1, getWidth(), getHeight(), j6.f20025k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }
}
