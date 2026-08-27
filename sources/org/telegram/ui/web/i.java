package org.telegram.ui.web;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import h7.b6;
import h7.z5;
import lh.j3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.Components.n9;

public final class i extends FrameLayout implements x5 {

    public final c6 f43852a;

    public final n9 f43853b;

    public final LinearLayout f43854c;
    public final FrameLayout.LayoutParams d;

    public final TextView f43855e;

    public final TextView f43856f;
    public final TextView h;

    public final ImageView f43857n;

    public final j3 f43858r;

    public int f43859s;
    public final Paint v;

    public boolean f43860w;

    public i(Context context, c6 c6Var) {
        super(context);
        this.v = new Paint(1);
        this.f43852a = c6Var;
        b6.b(this, 0.03f, 1.25f);
        n9 n9Var = new n9(context);
        this.f43853b = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
        addView(n9Var, z5.d(32, 32.0f, 19, 10.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f43854c = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.f43855e = textView;
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, z5.q(-1, -2, 51));
        TextView textView2 = new TextView(context);
        this.f43856f = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, z5.t(-1, -2, 51, 0, 3, 0, 0));
        FrameLayout.LayoutParams layoutParamsD = z5.d(-1, -2.0f, 19, 64.0f, 0.0f, 70.0f, 0.0f);
        this.d = layoutParamsD;
        addView(linearLayout, layoutParamsD);
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setMaxLines(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(5);
        textView3.setTextAlignment(6);
        addView(textView3, z5.d(-2, -2.0f, 21, 64.0f, -10.0f, 12.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f43857n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.attach_arrow_right);
        addView(imageView, z5.d(32, 32.0f, 21, 8.0f, 8.0f, 8.0f, 8.0f));
        j3 j3Var = new j3(this, getContext(), c6Var, 2);
        this.f43858r = j3Var;
        j3Var.b(-1, g6.f23053d6, g6.f23182k7);
        j3Var.setDrawUnchecked(false);
        j3Var.setDrawBackgroundAsArc(3);
        addView(j3Var, z5.d(24, 24.0f, 19, 26.0f, 12.0f, 0.0f, 0.0f));
    }

    @Override
    public final void d() {
        int i10 = g6.f23053d6;
        c6 c6Var = this.f43852a;
        int iV0 = g6.v0(i10, c6Var);
        int iV1 = g6.v0(g6.G6, c6Var);
        this.f43859s = iV1;
        this.f43855e.setTextColor(iV1);
        this.f43856f.setTextColor(g6.v(iV0, g6.l1(0.55f, iV1)));
        this.h.setTextColor(g6.l1(0.55f, iV1));
        this.f43857n.setColorFilter(new PorterDuffColorFilter(g6.l1(0.6f, iV1), PorterDuff.Mode.SRC_IN));
        this.v.setColor(g6.l1(0.1f, iV1));
        this.f43853b.invalidate();
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f43860w) {
            canvas.drawRect(AndroidUtilities.dp(59.0f), getHeight() - Math.max(AndroidUtilities.dp(0.66f), 1), getWidth(), getHeight(), this.v);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }

    public void setChecked(boolean z10) {
        this.f43858r.a(z10, true);
    }
}
