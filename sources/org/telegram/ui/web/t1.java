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
import g7.e6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.k5;
import org.telegram.ui.gk;
public final class t1 extends FrameLayout {
    public final ImageView f44020a;
    public final TextView f44021b;
    public final gk f44022c;
    public k5 d;
    public String f44023e;
    public boolean f44024f;

    public t1(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.f44020a = imageView;
        addView(imageView, e6.d(32, 32.0f, 19, 16.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f44021b = textView;
        textView.setTextColor(f6.w0(null, f6.G6, false));
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, e6.d(-1, -2.0f, 55, 68.0f, 7.0f, 54.0f, 0.0f));
        gk gkVar = new gk(this, context, 6);
        this.f44022c = gkVar;
        gkVar.setTextColor(f6.w0(null, f6.f23369y6, false));
        gkVar.setTextSize(1, 13.0f);
        gkVar.setMaxLines(1);
        gkVar.setEllipsize(truncateAt);
        gkVar.setPivotX(0.0f);
        addView(gkVar, e6.d(-1, -2.0f, 55, 68.0f, 30.0f, 54.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.ic_ab_other);
        imageView2.setColorFilter(new PorterDuffColorFilter(f6.w0(null, f6.A6, false), PorterDuff.Mode.SRC_IN));
        addView(imageView2, e6.d(32, 32.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f44024f) {
            canvas.drawRect(AndroidUtilities.dp(64.0f), getHeight() - 1, getWidth(), getHeight(), f6.f23121k0);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }
}
