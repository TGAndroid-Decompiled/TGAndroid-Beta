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
import org.telegram.ui.Components.s5;
import org.telegram.ui.xk;
import w7.w5;
public final class x1 extends FrameLayout {
    public final ImageView f43471a;
    public final TextView f43472b;
    public final xk f43473c;
    public s5 d;
    public String f43474e;
    public boolean f43475f;

    public x1(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.f43471a = imageView;
        addView(imageView, w5.a(32.0f, 16.0f, 0.0f, 0.0f, 0.0f, 32, 19));
        TextView textView = new TextView(context);
        this.f43472b = textView;
        textView.setTextColor(h6.x0(null, h6.G6, false));
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, w5.a(-2.0f, 68.0f, 7.0f, 54.0f, 0.0f, -1, 55));
        xk xkVar = new xk(this, context, 7);
        this.f43473c = xkVar;
        xkVar.setTextColor(h6.x0(null, h6.f20945y6, false));
        xkVar.setTextSize(1, 13.0f);
        xkVar.setMaxLines(1);
        xkVar.setEllipsize(truncateAt);
        xkVar.setPivotX(0.0f);
        addView(xkVar, w5.a(-2.0f, 68.0f, 30.0f, 54.0f, 0.0f, -1, 55));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.ic_ab_other);
        imageView2.setColorFilter(new PorterDuffColorFilter(h6.x0(null, h6.A6, false), PorterDuff.Mode.SRC_IN));
        addView(imageView2, w5.a(32.0f, 0.0f, 0.0f, 18.0f, 0.0f, 32, 21));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f43475f) {
            canvas.drawRect(AndroidUtilities.dp(64.0f), getHeight() - 1, getWidth(), getHeight(), h6.f20681k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }
}
