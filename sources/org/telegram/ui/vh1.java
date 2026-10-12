package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class vh1 extends LinearLayout {
    public final org.telegram.ui.ActionBar.c6 f42798a;
    public final ImageView f42799b;
    public final LinearLayout f42800c;
    public final TextView d;
    public final TextView f42801e;
    public final ImageView f42802f;
    public boolean h;
    public boolean f42803n;

    public vh1(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        setOrientation(0);
        this.f42798a = c6Var;
        ImageView imageView = new ImageView(context);
        this.f42799b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        addView(imageView, w7.w5.t(40, 40, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f42800c = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f));
        addView(linearLayout, w7.w5.p(0, -2, 1.0f, 23, 0, 0, 32, 0));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 16.0f);
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.w5.t(-1, -2, 7, 0, 0, 0, 0), context);
        this.f42801e = h;
        h.setTextSize(1, 13.0f);
        linearLayout.addView(h, w7.w5.r(-1, -2, 7, 0.0f, 4.33f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f42802f = imageView2;
        imageView2.setScaleType(scaleType);
        addView(imageView2, w7.w5.t(40, 40, 21, 12, 0, 12, 0));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
