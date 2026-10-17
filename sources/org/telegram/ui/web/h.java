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
import ei.k3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.y5;
import org.telegram.ui.Components.w9;
import w7.b6;
import w7.z5;
public final class h extends FrameLayout implements y5 {
    public final d6 f42607a;
    public final w9 f42608b;
    public final LinearLayout f42609c;
    public final FrameLayout.LayoutParams d;
    public final TextView e;
    public final TextView f42610f;
    public final TextView h;
    public final ImageView f42611n;
    public final k3 f42612r;
    public int f42613s;
    public final Paint v;
    public boolean f42614w;

    public h(Context context, d6 d6Var) {
        super(context);
        this.v = new Paint(1);
        this.f42607a = d6Var;
        b6.b(this, 0.03f, 1.25f);
        w9 w9Var = new w9(context);
        this.f42608b = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
        addView(w9Var, z5.a(32.0f, 10.0f, 8.0f, 8.0f, 8.0f, 32, 19));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f42609c = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, z5.q(-1, -2, 51));
        TextView textView2 = new TextView(context);
        this.f42610f = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, z5.t(-1, -2, 51, 0, 3, 0, 0));
        FrameLayout.LayoutParams a2 = z5.a(-2.0f, 64.0f, 0.0f, 70.0f, 0.0f, -1, 19);
        this.d = a2;
        addView(linearLayout, a2);
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setMaxLines(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(5);
        textView3.setTextAlignment(6);
        addView(textView3, z5.a(-2.0f, 64.0f, -10.0f, 12.0f, 0.0f, -2, 21));
        ImageView imageView = new ImageView(context);
        this.f42611n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.attach_arrow_right);
        addView(imageView, z5.a(32.0f, 8.0f, 8.0f, 8.0f, 8.0f, 32, 21));
        k3 k3Var = new k3(this, getContext(), d6Var, 2);
        this.f42612r = k3Var;
        k3Var.b(-1, h6.f20986d6, h6.f21114k7);
        k3Var.setDrawUnchecked(false);
        k3Var.setDrawBackgroundAsArc(3);
        addView(k3Var, z5.a(24.0f, 26.0f, 12.0f, 0.0f, 0.0f, 24, 19));
    }

    @Override
    public final void d() {
        int i10 = h6.f20986d6;
        d6 d6Var = this.f42607a;
        int w02 = h6.w0(i10, d6Var);
        int w03 = h6.w0(h6.G6, d6Var);
        this.f42613s = w03;
        this.e.setTextColor(w03);
        this.f42610f.setTextColor(h6.v(w02, h6.m1(0.55f, w03)));
        this.h.setTextColor(h6.m1(0.55f, w03));
        this.f42611n.setColorFilter(new PorterDuffColorFilter(h6.m1(0.6f, w03), PorterDuff.Mode.SRC_IN));
        this.v.setColor(h6.m1(0.1f, w03));
        this.f42608b.invalidate();
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f42614w) {
            canvas.drawRect(AndroidUtilities.dp(59.0f), getHeight() - Math.max(AndroidUtilities.dp(0.66f), 1), getWidth(), getHeight(), this.v);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }

    public void setChecked(boolean z10) {
        this.f42612r.a(z10, true);
    }
}
