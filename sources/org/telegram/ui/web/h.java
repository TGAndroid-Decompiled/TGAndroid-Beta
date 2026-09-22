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
import ci.q3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.v9;
import w7.a6;
import w7.y5;
public final class h extends FrameLayout implements z5 {
    public final f6 f38930a;
    public final v9 f38931b;
    public final LinearLayout f38932c;
    public final FrameLayout.LayoutParams d;
    public final TextView e;
    public final TextView f38933f;
    public final TextView h;
    public final ImageView f38934n;
    public final q3 f38935r;
    public int f38936s;
    public final Paint v;
    public boolean f38937w;

    public h(Context context, f6 f6Var) {
        super(context);
        this.v = new Paint(1);
        this.f38930a = f6Var;
        a6.b(this, 0.03f, 1.25f);
        v9 v9Var = new v9(context);
        this.f38931b = v9Var;
        v9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
        addView(v9Var, y5.d(32, 32.0f, 19, 10.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f38932c = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, y5.q(-1, -2, 51));
        TextView textView2 = new TextView(context);
        this.f38933f = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, y5.t(-1, -2, 51, 0, 3, 0, 0));
        FrameLayout.LayoutParams d = y5.d(-1, -2.0f, 19, 64.0f, 0.0f, 70.0f, 0.0f);
        this.d = d;
        addView(linearLayout, d);
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setMaxLines(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(5);
        textView3.setTextAlignment(6);
        addView(textView3, y5.d(-2, -2.0f, 21, 64.0f, -10.0f, 12.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f38934n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.attach_arrow_right);
        addView(imageView, y5.d(32, 32.0f, 21, 8.0f, 8.0f, 8.0f, 8.0f));
        q3 q3Var = new q3(this, getContext(), f6Var, 2);
        this.f38935r = q3Var;
        q3Var.b(-1, j6.f19109d6, j6.f19238k7);
        q3Var.setDrawUnchecked(false);
        q3Var.setDrawBackgroundAsArc(3);
        addView(q3Var, y5.d(24, 24.0f, 19, 26.0f, 12.0f, 0.0f, 0.0f));
    }

    @Override
    public final void e() {
        int i10 = j6.f19109d6;
        f6 f6Var = this.f38930a;
        int v02 = j6.v0(i10, f6Var);
        int v03 = j6.v0(j6.G6, f6Var);
        this.f38936s = v03;
        this.e.setTextColor(v03);
        this.f38933f.setTextColor(j6.v(v02, j6.l1(0.55f, v03)));
        this.h.setTextColor(j6.l1(0.55f, v03));
        this.f38934n.setColorFilter(new PorterDuffColorFilter(j6.l1(0.6f, v03), PorterDuff.Mode.SRC_IN));
        this.v.setColor(j6.l1(0.1f, v03));
        this.f38931b.invalidate();
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f38937w) {
            canvas.drawRect(AndroidUtilities.dp(59.0f), getHeight() - Math.max(AndroidUtilities.dp(0.66f), 1), getWidth(), getHeight(), this.v);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }

    public void setChecked(boolean z10) {
        this.f38935r.a(z10, true);
    }
}
