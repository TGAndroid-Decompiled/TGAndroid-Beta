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
import c8.ja;
import c8.na;
import hi.y2;
import java.util.HashSet;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.i9;
public final class h extends FrameLayout implements z5 {
    public final e6 f52612a;
    public final i9 f52613b;
    public final LinearLayout f52614c;
    public final FrameLayout.LayoutParams d;
    public final TextView f52615e;
    public final TextView f52616f;
    public final TextView h;
    public final ImageView f52617n;
    public final y2 f52618r;
    public int f52619s;
    public final Paint f52620w;
    public boolean f52621x;

    public h(Context context, e6 e6Var) {
        super(context);
        this.f52620w = new Paint(1);
        this.f52612a = e6Var;
        na.b(this, 0.03f, 1.25f);
        i9 i9Var = new i9(context);
        this.f52613b = i9Var;
        i9Var.setRoundRadius(org.telegram.messenger.g0.L(6.0f));
        addView(i9Var, ja.d(32, 32.0f, 19, 10.0f, 8.0f, 8.0f, 8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f52614c = linearLayout;
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        this.f52615e = textView;
        textView.setTextSize(1, 16.0f);
        textView.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, ja.r(-1, -2, 51));
        TextView textView2 = new TextView(context);
        this.f52616f = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setMaxLines(1);
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, ja.t(-1, -2, 51, 0, 3, 0, 0));
        FrameLayout.LayoutParams d = ja.d(-1, -2.0f, 19, 64.0f, 0.0f, 70.0f, 0.0f);
        this.d = d;
        addView(linearLayout, d);
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setMaxLines(1);
        textView3.setEllipsize(truncateAt);
        textView3.setGravity(5);
        textView3.setTextAlignment(6);
        addView(textView3, ja.d(-2, -2.0f, 21, 64.0f, -10.0f, 12.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f52617n = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131230875);
        addView(imageView, ja.d(32, 32.0f, 21, 8.0f, 8.0f, 8.0f, 8.0f));
        y2 y2Var = new y2(this, getContext(), e6Var, 2);
        this.f52618r = y2Var;
        y2Var.b(-1, j6.f28849d6, j6.f28979k7);
        y2Var.setDrawUnchecked(false);
        y2Var.setDrawBackgroundAsArc(3);
        addView(y2Var, ja.d(24, 24.0f, 19, 26.0f, 12.0f, 0.0f, 0.0f));
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(j6.f28849d6));
        hashSet.add(Integer.valueOf(j6.G6));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f52621x) {
            canvas.drawRect(org.telegram.messenger.g0.L(59.0f), getHeight() - Math.max(org.telegram.messenger.g0.L(0.66f), 1), getWidth(), getHeight(), this.f52620w);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(56.0f), 1073741824));
    }

    public void setChecked(boolean z10) {
        this.f52618r.a(z10, true);
    }

    @Override
    public final void updateColors() {
        int i7 = j6.f28849d6;
        e6 e6Var = this.f52612a;
        int w02 = j6.w0(i7, e6Var);
        int w03 = j6.w0(j6.G6, e6Var);
        this.f52619s = w03;
        this.f52615e.setTextColor(w03);
        this.f52616f.setTextColor(j6.w(w02, j6.r1(0.55f, w03)));
        this.h.setTextColor(j6.r1(0.55f, w03));
        this.f52617n.setColorFilter(new PorterDuffColorFilter(j6.r1(0.6f, w03), PorterDuff.Mode.SRC_IN));
        this.f52620w.setColor(j6.r1(0.1f, w03));
        this.f52613b.invalidate();
    }
}
