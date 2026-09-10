package org.telegram.ui;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class xh1 extends LinearLayout {
    public final org.telegram.ui.ActionBar.f6 f38753a;
    public final ImageView f38754b;
    public final LinearLayout f38755c;
    public final TextView d;
    public final TextView e;
    public final ImageView f38756f;
    public boolean h;
    public boolean f38757n;

    public xh1(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        setOrientation(0);
        this.f38753a = f6Var;
        ImageView imageView = new ImageView(context);
        this.f38754b = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        addView(imageView, w7.a6.t(40, 40, 19, 12, 0, 12, 0));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f38755c = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f));
        addView(linearLayout, w7.a6.p(0, -2, 1.0f, 23, 0, 0, 32, 0));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextSize(1, 16.0f);
        TextView g10 = com.google.android.gms.internal.vision.e2.g(linearLayout, textView, w7.a6.t(-1, -2, 7, 0, 0, 0, 0), context);
        this.e = g10;
        g10.setTextSize(1, 13.0f);
        linearLayout.addView(g10, w7.a6.r(-1, -2, 7, 0.0f, 4.33f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.f38756f = imageView2;
        imageView2.setScaleType(scaleType);
        addView(imageView2, w7.a6.t(40, 40, 21, 12, 0, 12, 0));
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }
}
