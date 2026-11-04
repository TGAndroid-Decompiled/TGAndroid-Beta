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
import b8.mf;
import b8.pf;
import gi.y2;
import java.util.HashSet;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.k9;
public final class i extends FrameLayout implements z5 {
    public final e6 f50858a;
    public final k9 f50859b;
    public final LinearLayout f50860c;
    public final FrameLayout.LayoutParams d;
    public final TextView f50861e;
    public final TextView f50862f;
    public final TextView h;
    public final ImageView f50863n;
    public final y2 f50864r;
    public int f50865s;
    public final Paint f50866w;
    public boolean f50867x;

    public i(Context context, e6 e6Var) {
        super(context);
        this.f50866w = new Paint(1);
        this.f50858a = e6Var;
        pf.b(this, 0.03f, 1.25f);
        k9 k9Var = new k9(context);
        this.f50859b = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
        addView(k9Var, mf.d(32, 32.0f, 19, 10.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f50860c = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.f50861e = textView;
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, mf.r(-1, -2, 51));
        TextView textView2 = new TextView(context);
        this.f50862f = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, mf.t(-1, -2, 51, 0, 3, 0, 0));
        FrameLayout.LayoutParams d = mf.d(-1, -2.0f, 19, 64.0f, 0.0f, 70.0f, 0.0f);
        this.d = d;
        addView(linearLayout, d);
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setMaxLines(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(5);
        textView3.setTextAlignment(6);
        addView(textView3, mf.d(-2, -2.0f, 21, 64.0f, -10.0f, 12.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f50863n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131230875);
        addView(imageView, mf.d(32, 32.0f, 21, 8.0f, 8.0f, 8.0f, 8.0f));
        y2 y2Var = new y2(this, getContext(), e6Var, 2);
        this.f50864r = y2Var;
        y2Var.b(-1, k6.f27878d6, k6.f28008k7);
        y2Var.setDrawUnchecked(false);
        y2Var.setDrawBackgroundAsArc(3);
        addView(y2Var, mf.d(24, 24.0f, 19, 26.0f, 12.0f, 0.0f, 0.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(k6.f27878d6));
        hashSet.add(Integer.valueOf(k6.G6));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f50867x) {
            canvas.drawRect(org.telegram.messenger.g0.L(59.0f), getHeight() - Math.max(org.telegram.messenger.g0.L(0.66f), 1), getWidth(), getHeight(), this.f50866w);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), 1073741824));
    }

    public void setChecked(boolean z10) {
        this.f50864r.a(z10, true);
    }

    @Override
    public final void updateColors() {
        int i3 = k6.f27878d6;
        e6 e6Var = this.f50858a;
        int w02 = k6.w0(i3, e6Var);
        int w03 = k6.w0(k6.G6, e6Var);
        this.f50865s = w03;
        this.f50861e.setTextColor(w03);
        this.f50862f.setTextColor(k6.w(w02, k6.r1(0.55f, w03)));
        this.h.setTextColor(k6.r1(0.55f, w03));
        this.f50863n.setColorFilter(new PorterDuffColorFilter(k6.r1(0.6f, w03), PorterDuff.Mode.SRC_IN));
        this.f50866w.setColor(k6.r1(0.1f, w03));
        this.f50859b.invalidate();
    }
}
