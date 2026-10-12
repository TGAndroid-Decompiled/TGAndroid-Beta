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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.s5;
import org.telegram.ui.xk;
import w7.a6;
public final class x1 extends FrameLayout {
    public final ImageView f41553a;
    public final TextView f41554b;
    public final xk f41555c;
    public s5 d;
    public String e;
    public boolean f41556f;

    public x1(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.f41553a = imageView;
        addView(imageView, a6.a(32.0f, 16.0f, 0.0f, 0.0f, 0.0f, 32, 19));
        TextView textView = new TextView(context);
        this.f41554b = textView;
        textView.setTextColor(g6.x0(null, g6.G6, false));
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, a6.a(-2.0f, 68.0f, 7.0f, 54.0f, 0.0f, -1, 55));
        xk xkVar = new xk(this, context, 7);
        this.f41555c = xkVar;
        xkVar.setTextColor(g6.x0(null, g6.f20288y6, false));
        xkVar.setTextSize(1, 13.0f);
        xkVar.setMaxLines(1);
        xkVar.setEllipsize(truncateAt);
        xkVar.setPivotX(0.0f);
        addView(xkVar, a6.a(-2.0f, 68.0f, 30.0f, 54.0f, 0.0f, -1, 55));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.ic_ab_other);
        imageView2.setColorFilter(new PorterDuffColorFilter(g6.x0(null, g6.A6, false), PorterDuff.Mode.SRC_IN));
        addView(imageView2, a6.a(32.0f, 0.0f, 0.0f, 18.0f, 0.0f, 32, 21));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f41556f) {
            canvas.drawRect(AndroidUtilities.dp(64.0f), getHeight() - 1, getWidth(), getHeight(), g6.f20022k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }
}
