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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.u9;
import w7.z5;
public final class i extends FrameLayout implements b6 {
    public final g6 f43127a;
    public final u9 f43128b;
    public final LinearLayout f43129c;
    public final FrameLayout.LayoutParams d;
    public final TextView e;
    public final TextView f43130f;
    public final TextView h;
    public final ImageView f43131n;
    public final k3 f43132r;
    public int f43133s;
    public final Paint v;
    public boolean f43134w;

    public i(Context context, g6 g6Var) {
        super(context);
        this.v = new Paint(1);
        this.f43127a = g6Var;
        w7.b6.b(this, 0.03f, 1.25f);
        u9 u9Var = new u9(context);
        this.f43128b = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(6.0f));
        addView(u9Var, z5.d(32, 32.0f, 19, 10.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f43129c = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, z5.q(-1, -2, 51));
        TextView textView2 = new TextView(context);
        this.f43130f = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, z5.t(-1, -2, 51, 0, 3, 0, 0));
        FrameLayout.LayoutParams d = z5.d(-1, -2.0f, 19, 64.0f, 0.0f, 70.0f, 0.0f);
        this.d = d;
        addView(linearLayout, d);
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setMaxLines(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(5);
        textView3.setTextAlignment(6);
        addView(textView3, z5.d(-2, -2.0f, 21, 64.0f, -10.0f, 12.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f43131n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.attach_arrow_right);
        addView(imageView, z5.d(32, 32.0f, 21, 8.0f, 8.0f, 8.0f, 8.0f));
        k3 k3Var = new k3(this, getContext(), g6Var, 2);
        this.f43132r = k3Var;
        k3Var.b(-1, k6.f21184d6, k6.f21312k7);
        k3Var.setDrawUnchecked(false);
        k3Var.setDrawBackgroundAsArc(3);
        addView(k3Var, z5.d(24, 24.0f, 19, 26.0f, 12.0f, 0.0f, 0.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.f21184d6));
        hashSet.add(Integer.valueOf(k6.G6));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f43134w) {
            canvas.drawRect(AndroidUtilities.dp(59.0f), getHeight() - Math.max(AndroidUtilities.dp(0.66f), 1), getWidth(), getHeight(), this.v);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
    }

    public void setChecked(boolean z10) {
        this.f43132r.a(z10, true);
    }

    @Override
    public final void updateColors() {
        int i10 = k6.f21184d6;
        g6 g6Var = this.f43127a;
        int w02 = k6.w0(i10, g6Var);
        int w03 = k6.w0(k6.G6, g6Var);
        this.f43133s = w03;
        this.e.setTextColor(w03);
        this.f43130f.setTextColor(k6.v(w02, k6.o1(0.55f, w03)));
        this.h.setTextColor(k6.o1(0.55f, w03));
        this.f43131n.setColorFilter(new PorterDuffColorFilter(k6.o1(0.6f, w03), PorterDuff.Mode.SRC_IN));
        this.v.setColor(k6.o1(0.1f, w03));
        this.f43128b.invalidate();
    }
}
