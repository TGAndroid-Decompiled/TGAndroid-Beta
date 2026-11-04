package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
public class yr0 extends FrameLayout {
    public final org.telegram.ui.ActionBar.k5 f52386a;
    public final TextView f52387b;
    public final ImageView f52388c;
    public final ImageView d;
    public boolean f52389e;
    public ls0 f52390f;
    public org.telegram.ui.Components.e5 h;
    public Drawable f52391n;

    public yr0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        setClipChildren(false);
        linearLayout.setClipChildren(false);
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.f52386a = k5Var;
        k5Var.setTypeface(org.telegram.messenger.g0.o());
        k5Var.setTextSize(15);
        org.telegram.ui.ActionBar.r6.Y(k5Var, org.telegram.ui.ActionBar.k6.G6, e6Var);
        linearLayout.addView(k5Var, b8.mf.o(-1, -2));
        TextView textView = new TextView(context);
        this.f52387b = textView;
        textView.setTextSize(1, 14.0f);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28273y6, e6Var);
        textView.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        linearLayout.addView(textView, b8.mf.q(-1, -2, 0.0f, 0, 0, 1, 0, 0));
        addView(linearLayout, b8.mf.d(-1, -2.0f, 0, 62.0f, 8.0f, 48.0f, 9.0f));
        ImageView imageView = new ImageView(context);
        this.f52388c = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        imageView.setScaleType(scaleType);
        addView(imageView, b8.mf.d(28, 28.0f, 0, 18.0f, 12.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.d = imageView2;
        imageView2.setScaleType(scaleType);
        imageView2.setImageResource(2131232059);
        org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.M6, e6Var, PorterDuff.Mode.SRC_ATOP);
        addView(imageView2, b8.mf.d(24, 24.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
    }

    public final void a(ls0 ls0Var, boolean z10) {
        long longValue;
        boolean q10 = org.telegram.messenger.h10.i(org.telegram.messenger.h10.f22829t0).q();
        ImageView imageView = this.d;
        if (q10 && ls0Var.f47430a == 12 && ls0Var.f47431b == 2131231150) {
            imageView.setVisibility(8);
            if (this.h == null) {
                this.h = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(24.0f), 13, this, false);
                if (isAttachedToWindow()) {
                    this.h.a();
                }
            }
            Long h = org.telegram.messenger.l10.h(org.telegram.messenger.h10.i(org.telegram.messenger.h10.f22829t0).f());
            if (h == null) {
                longValue = 0;
            } else {
                longValue = h.longValue();
            }
            b(longValue, false);
        } else {
            imageView.setVisibility(0);
            org.telegram.ui.Components.e5 e5Var = this.h;
            if (e5Var != null) {
                e5Var.b();
                this.h = null;
            }
        }
        this.f52390f = ls0Var;
        this.f52386a.l(ls0Var.f47432c, false);
        this.f52387b.setText(ls0Var.d);
        this.f52388c.setImageResource(ls0Var.f47431b);
        this.f52389e = z10;
    }

    public final void b(long j10, boolean z10) {
        if (this.h == null) {
            this.h = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(24.0f), 13, this, false);
            if (isAttachedToWindow()) {
                this.h.a();
            }
        }
        if (j10 == 0) {
            if (this.f52391n == null) {
                Drawable mutate = getContext().getResources().getDrawable(2131232310).mutate();
                this.f52391n = mutate;
                org.telegram.ui.ActionBar.r6.y(this, mutate, org.telegram.ui.ActionBar.k6.f28214v6, null, PorterDuff.Mode.SRC_IN);
            }
            this.h.g(this.f52391n, z10);
            return;
        }
        this.h.j(j10, z10);
    }

    public final void c() {
        this.h.setBounds((getWidth() - this.h.f33289s) - org.telegram.messenger.g0.L(21.0f), (getHeight() - this.h.f33289s) / 2, getWidth() - org.telegram.messenger.g0.L(21.0f), (getHeight() + this.h.f33289s) / 2);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.h != null) {
            c();
            this.h.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28214v6, false)));
            this.h.draw(canvas);
        }
        if (this.f52389e) {
            canvas.drawRect(org.telegram.messenger.g0.L(62.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.k6.f28002k0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        org.telegram.ui.Components.e5 e5Var = this.h;
        if (e5Var != null) {
            e5Var.a();
        }
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        org.telegram.ui.Components.e5 e5Var = this.h;
        if (e5Var != null) {
            e5Var.b();
        }
        super.onDetachedFromWindow();
    }
}
