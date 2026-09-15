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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.u9;
import w7.x5;
public final class h extends FrameLayout implements z5 {
    public final e6 f38959a;
    public final u9 f38960b;
    public final LinearLayout f38961c;
    public final FrameLayout.LayoutParams d;
    public final TextView e;
    public final TextView f38962f;
    public final TextView h;
    public final ImageView f38963n;
    public final q3 f38964r;
    public int f38965s;
    public final Paint v;
    public boolean f38966w;

    public h(Context context, e6 e6Var) {
        super(context);
        this.v = new Paint(1);
        this.f38959a = e6Var;
        w7.z5.b(this, 0.03f, 1.25f);
        u9 u9Var = new u9(context);
        this.f38960b = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
        addView(u9Var, x5.d(32, 32.0f, 19, 10.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f38961c = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, x5.q(-1, -2, 51));
        TextView textView2 = new TextView(context);
        this.f38962f = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, x5.t(-1, -2, 51, 0, 3, 0, 0));
        FrameLayout.LayoutParams d = x5.d(-1, -2.0f, 19, 64.0f, 0.0f, 70.0f, 0.0f);
        this.d = d;
        addView(linearLayout, d);
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setMaxLines(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(5);
        textView3.setTextAlignment(6);
        addView(textView3, x5.d(-2, -2.0f, 21, 64.0f, -10.0f, 12.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f38963n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.attach_arrow_right);
        addView(imageView, x5.d(32, 32.0f, 21, 8.0f, 8.0f, 8.0f, 8.0f));
        q3 q3Var = new q3(this, getContext(), e6Var, 2);
        this.f38964r = q3Var;
        q3Var.b(-1, i6.f18836d6, i6.f18965k7);
        q3Var.setDrawUnchecked(false);
        q3Var.setDrawBackgroundAsArc(3);
        addView(q3Var, x5.d(24, 24.0f, 19, 26.0f, 12.0f, 0.0f, 0.0f));
    }

    @Override
    public final void e() {
        int i10 = i6.f18836d6;
        e6 e6Var = this.f38959a;
        int v02 = i6.v0(i10, e6Var);
        int v03 = i6.v0(i6.G6, e6Var);
        this.f38965s = v03;
        this.e.setTextColor(v03);
        this.f38962f.setTextColor(i6.v(v02, i6.l1(0.55f, v03)));
        this.h.setTextColor(i6.l1(0.55f, v03));
        this.f38963n.setColorFilter(new PorterDuffColorFilter(i6.l1(0.6f, v03), PorterDuff.Mode.SRC_IN));
        this.v.setColor(i6.l1(0.1f, v03));
        this.f38960b.invalidate();
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f38966w) {
            canvas.drawRect(AndroidUtilities.dp(59.0f), getHeight() - Math.max(AndroidUtilities.dp(0.66f), 1), getWidth(), getHeight(), this.v);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }

    public void setChecked(boolean z10) {
        this.f38964r.a(z10, true);
    }
}
