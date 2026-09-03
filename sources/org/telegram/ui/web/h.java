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
import k7.b6;
import k7.d6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.p9;
public final class h extends FrameLayout implements a6 {
    public final f6 f39457a;
    public final p9 f39458b;
    public final LinearLayout f39459c;
    public final FrameLayout.LayoutParams d;
    public final TextView e;
    public final TextView f39460f;
    public final TextView h;
    public final ImageView f39461n;
    public final org.telegram.ui.Cells.j2 f39462r;
    public int f39463s;
    public final Paint v;
    public boolean f39464w;

    public h(Context context, f6 f6Var) {
        super(context);
        this.v = new Paint(1);
        this.f39457a = f6Var;
        d6.b(this, 0.03f, 1.25f);
        p9 p9Var = new p9(context);
        this.f39458b = p9Var;
        p9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
        addView(p9Var, b6.d(32, 32.0f, 19, 10.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f39459c = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, b6.q(-1, -2, 51));
        TextView textView2 = new TextView(context);
        this.f39460f = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, b6.t(-1, -2, 51, 0, 3, 0, 0));
        FrameLayout.LayoutParams d = b6.d(-1, -2.0f, 19, 64.0f, 0.0f, 70.0f, 0.0f);
        this.d = d;
        addView(linearLayout, d);
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setMaxLines(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(5);
        textView3.setTextAlignment(6);
        addView(textView3, b6.d(-2, -2.0f, 21, 64.0f, -10.0f, 12.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f39461n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.attach_arrow_right);
        addView(imageView, b6.d(32, 32.0f, 21, 8.0f, 8.0f, 8.0f, 8.0f));
        org.telegram.ui.Cells.j2 j2Var = new org.telegram.ui.Cells.j2(this, getContext(), f6Var, 1);
        this.f39462r = j2Var;
        j2Var.b(-1, j6.f19881d6, j6.f20007k7);
        j2Var.setDrawUnchecked(false);
        j2Var.setDrawBackgroundAsArc(3);
        addView(j2Var, b6.d(24, 24.0f, 19, 26.0f, 12.0f, 0.0f, 0.0f));
    }

    @Override
    public final void e() {
        int i10 = j6.f19881d6;
        f6 f6Var = this.f39457a;
        int v02 = j6.v0(i10, f6Var);
        int v03 = j6.v0(j6.G6, f6Var);
        this.f39463s = v03;
        this.e.setTextColor(v03);
        this.f39460f.setTextColor(j6.v(v02, j6.l1(0.55f, v03)));
        this.h.setTextColor(j6.l1(0.55f, v03));
        this.f39461n.setColorFilter(new PorterDuffColorFilter(j6.l1(0.6f, v03), PorterDuff.Mode.SRC_IN));
        this.v.setColor(j6.l1(0.1f, v03));
        this.f39458b.invalidate();
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f39464w) {
            canvas.drawRect(AndroidUtilities.dp(59.0f), getHeight() - Math.max(AndroidUtilities.dp(0.66f), 1), getWidth(), getHeight(), this.v);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }

    public void setChecked(boolean z4) {
        this.f39462r.a(z4, true);
    }
}
