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
import h7.z5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.k5;
import org.telegram.ui.ik;

public final class u1 extends FrameLayout {

    public final ImageView f44007a;

    public final TextView f44008b;

    public final ik f44009c;
    public k5 d;

    public String f44010e;

    public boolean f44011f;

    public u1(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.f44007a = imageView;
        addView(imageView, z5.d(32, 32.0f, 19, 16.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.f44008b = textView;
        textView.setTextColor(g6.w0(null, g6.G6, false));
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        addView(textView, z5.d(-1, -2.0f, 55, 68.0f, 7.0f, 54.0f, 0.0f));
        ik ikVar = new ik(this, context, 6);
        this.f44009c = ikVar;
        ikVar.setTextColor(g6.w0(null, g6.f23423y6, false));
        ikVar.setTextSize(1, 13.0f);
        ikVar.setMaxLines(1);
        ikVar.setEllipsize(truncateAt);
        ikVar.setPivotX(0.0f);
        addView(ikVar, z5.d(-1, -2.0f, 55, 68.0f, 30.0f, 54.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setScaleType(ImageView.ScaleType.CENTER);
        imageView2.setImageResource(R.drawable.ic_ab_other);
        imageView2.setColorFilter(new PorterDuffColorFilter(g6.w0(null, g6.A6, false), PorterDuff.Mode.SRC_IN));
        addView(imageView2, z5.d(32, 32.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f44011f) {
            canvas.drawRect(AndroidUtilities.dp(64.0f), getHeight() - 1, getWidth(), getHeight(), g6.f23175k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }
}
