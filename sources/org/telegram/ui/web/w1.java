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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.r5;
import org.telegram.ui.mk;
import w7.z5;
public final class w1 extends FrameLayout {
    public final ImageView f42790a;
    public final TextView f42791b;
    public final mk f42792c;
    public r5 d;
    public String e;
    public boolean f42793f;

    public w1(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.f42790a = imageView;
        addView(imageView, z5.a(32.0f, 16.0f, 0.0f, 0.0f, 0.0f, 32, 19));
        TextView textView = new TextView(context);
        this.f42791b = textView;
        textView.setTextColor(h6.x0(null, h6.G6, false));
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, z5.a(-2.0f, 68.0f, 7.0f, 54.0f, 0.0f, -1, 55));
        mk mkVar = new mk(this, context, 8);
        this.f42792c = mkVar;
        mkVar.setTextColor(h6.x0(null, h6.f21374y6, false));
        mkVar.setTextSize(1, 13.0f);
        mkVar.setMaxLines(1);
        mkVar.setEllipsize(truncateAt);
        mkVar.setPivotX(0.0f);
        addView(mkVar, z5.a(-2.0f, 68.0f, 30.0f, 54.0f, 0.0f, -1, 55));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.ic_ab_other);
        imageView2.setColorFilter(new PorterDuffColorFilter(h6.x0(null, h6.A6, false), PorterDuff.Mode.SRC_IN));
        addView(imageView2, z5.a(32.0f, 0.0f, 0.0f, 18.0f, 0.0f, 32, 21));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f42793f) {
            canvas.drawRect(AndroidUtilities.dp(64.0f), getHeight() - 1, getWidth(), getHeight(), h6.f21107k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }
}
