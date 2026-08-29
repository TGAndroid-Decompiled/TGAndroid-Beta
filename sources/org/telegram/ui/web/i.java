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
import i7.f6;
import i7.h6;
import nh.h3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.Components.t9;
public final class i extends FrameLayout implements x5 {
    public final c6 f44054a;
    public final t9 f44055b;
    public final LinearLayout f44056c;
    public final FrameLayout.LayoutParams d;
    public final TextView f44057e;
    public final TextView f44058f;
    public final TextView h;
    public final ImageView f44059n;
    public final h3 f44060r;
    public int f44061s;
    public final Paint v;
    public boolean f44062w;

    public i(Context context, c6 c6Var) {
        super(context);
        this.v = new Paint(1);
        this.f44054a = c6Var;
        h6.b(this, 0.03f, 1.25f);
        t9 t9Var = new t9(context);
        this.f44055b = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
        addView(t9Var, f6.d(32, 32.0f, 19, 10.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f44056c = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.f44057e = textView;
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, f6.q(-1, -2, 51));
        TextView textView2 = new TextView(context);
        this.f44058f = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, f6.t(-1, -2, 51, 0, 3, 0, 0));
        FrameLayout.LayoutParams d = f6.d(-1, -2.0f, 19, 64.0f, 0.0f, 70.0f, 0.0f);
        this.d = d;
        addView(linearLayout, d);
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setMaxLines(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(5);
        textView3.setTextAlignment(6);
        addView(textView3, f6.d(-2, -2.0f, 21, 64.0f, -10.0f, 12.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f44059n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.attach_arrow_right);
        addView(imageView, f6.d(32, 32.0f, 21, 8.0f, 8.0f, 8.0f, 8.0f));
        h3 h3Var = new h3(this, getContext(), c6Var, 2);
        this.f44060r = h3Var;
        h3Var.b(-1, g6.f23062d6, g6.f23190k7);
        h3Var.setDrawUnchecked(false);
        h3Var.setDrawBackgroundAsArc(3);
        addView(h3Var, f6.d(24, 24.0f, 19, 26.0f, 12.0f, 0.0f, 0.0f));
    }

    @Override
    public final void e() {
        int i10 = g6.f23062d6;
        c6 c6Var = this.f44054a;
        int v02 = g6.v0(i10, c6Var);
        int v03 = g6.v0(g6.G6, c6Var);
        this.f44061s = v03;
        this.f44057e.setTextColor(v03);
        this.f44058f.setTextColor(g6.v(v02, g6.l1(0.55f, v03)));
        this.h.setTextColor(g6.l1(0.55f, v03));
        this.f44059n.setColorFilter(new PorterDuffColorFilter(g6.l1(0.6f, v03), PorterDuff.Mode.SRC_IN));
        this.v.setColor(g6.l1(0.1f, v03));
        this.f44055b.invalidate();
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f44062w) {
            canvas.drawRect(AndroidUtilities.dp(59.0f), getHeight() - Math.max(AndroidUtilities.dp(0.66f), 1), getWidth(), getHeight(), this.v);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }

    public void setChecked(boolean z10) {
        this.f44060r.a(z10, true);
    }
}
