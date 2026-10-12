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
import ci.o3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.Components.y9;
import w7.w5;
import w7.y5;
public final class h extends FrameLayout implements x5 {
    public final c6 f43265a;
    public final y9 f43266b;
    public final LinearLayout f43267c;
    public final FrameLayout.LayoutParams d;
    public final TextView f43268e;
    public final TextView f43269f;
    public final TextView h;
    public final ImageView f43270n;
    public final o3 f43271r;
    public int f43272s;
    public final Paint v;
    public boolean f43273w;

    public h(Context context, c6 c6Var) {
        super(context);
        this.v = new Paint(1);
        this.f43265a = c6Var;
        y5.b(this, 0.03f, 1.25f);
        y9 y9Var = new y9(context);
        this.f43266b = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
        addView(y9Var, w5.a(32.0f, 10.0f, 8.0f, 8.0f, 8.0f, 32, 19));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f43267c = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.f43268e = textView;
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, w5.q(-1, -2, 51));
        TextView textView2 = new TextView(context);
        this.f43269f = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, w5.t(-1, -2, 51, 0, 3, 0, 0));
        FrameLayout.LayoutParams a2 = w5.a(-2.0f, 64.0f, 0.0f, 70.0f, 0.0f, -1, 19);
        this.d = a2;
        addView(linearLayout, a2);
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setMaxLines(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(5);
        textView3.setTextAlignment(6);
        addView(textView3, w5.a(-2.0f, 64.0f, -10.0f, 12.0f, 0.0f, -2, 21));
        ImageView imageView = new ImageView(context);
        this.f43270n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.attach_arrow_right);
        addView(imageView, w5.a(32.0f, 8.0f, 8.0f, 8.0f, 8.0f, 32, 21));
        o3 o3Var = new o3(this, getContext(), c6Var, 2);
        this.f43271r = o3Var;
        o3Var.b(-1, h6.f20559d6, h6.f20688k7);
        o3Var.setDrawUnchecked(false);
        o3Var.setDrawBackgroundAsArc(3);
        addView(o3Var, w5.a(24.0f, 26.0f, 12.0f, 0.0f, 0.0f, 24, 19));
    }

    @Override
    public final void e() {
        int i10 = h6.f20559d6;
        c6 c6Var = this.f43265a;
        int w02 = h6.w0(i10, c6Var);
        int w03 = h6.w0(h6.G6, c6Var);
        this.f43272s = w03;
        this.f43268e.setTextColor(w03);
        this.f43269f.setTextColor(h6.v(w02, h6.m1(0.55f, w03)));
        this.h.setTextColor(h6.m1(0.55f, w03));
        this.f43270n.setColorFilter(new PorterDuffColorFilter(h6.m1(0.6f, w03), PorterDuff.Mode.SRC_IN));
        this.v.setColor(h6.m1(0.1f, w03));
        this.f43266b.invalidate();
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f43273w) {
            canvas.drawRect(AndroidUtilities.dp(59.0f), getHeight() - Math.max(AndroidUtilities.dp(0.66f), 1), getWidth(), getHeight(), this.v);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }

    public void setChecked(boolean z10) {
        this.f43271r.a(z10, true);
    }
}
