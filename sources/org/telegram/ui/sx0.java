package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.HashSet;
public final class sx0 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final TextView f49979a;
    public final TextView f49980b;
    public final ImageView f49981c;
    public org.telegram.messenger.hz d;
    public Drawable f49982e;
    public final org.telegram.ui.Components.wo f49983f;
    public boolean h;
    public boolean f49984n;
    public int f49985r;
    public final ProxyListActivity f49986s;

    public sx0(ProxyListActivity proxyListActivity, Context context) {
        super(context);
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        this.f49986s = proxyListActivity;
        TextView textView = new TextView(context);
        this.f49979a = textView;
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, null);
        org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        if (org.telegram.messenger.id.f23161a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView.setGravity(i7 | 16);
        boolean z9 = org.telegram.messenger.id.f23161a0;
        if (z9) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i17 = i10 | 48;
        if (z9) {
            i11 = 56;
        } else {
            i11 = 21;
        }
        float f10 = i11;
        if (z9) {
            i12 = 21;
        } else {
            i12 = 56;
        }
        addView(textView, c8.ha.d(-2, -2.0f, i17, f10, 10.0f, i12, 0.0f));
        TextView textView2 = new TextView(context);
        this.f49980b = textView2;
        textView2.setTextSize(1, 13.0f);
        if (org.telegram.messenger.id.f23161a0) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        textView2.setGravity(i13);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setCompoundDrawablePadding(org.telegram.messenger.g0.L(6.0f));
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(0, 0, 0, 0);
        boolean z10 = org.telegram.messenger.id.f23161a0;
        if (z10) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        int i18 = i14 | 48;
        if (z10) {
            i15 = 56;
        } else {
            i15 = 21;
        }
        addView(textView2, c8.ha.d(-2, -2.0f, i18, i15, 35.0f, z10 ? 21 : 56, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f49981c = imageView;
        imageView.setImageResource(2131232185);
        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.A6, null, PorterDuff.Mode.MULTIPLY);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(org.telegram.messenger.id.M0(2131751335, null));
        if (org.telegram.messenger.id.f23161a0) {
            i16 = 3;
        } else {
            i16 = 5;
        }
        addView(imageView, c8.ha.d(48, 48.0f, i16 | 48, 8.0f, 8.0f, 8.0f, 0.0f));
        imageView.setOnClickListener(new j40(this, 28));
        org.telegram.ui.Components.wo woVar = new org.telegram.ui.Components.wo(21, context, null);
        this.f49983f = woVar;
        woVar.b(org.telegram.ui.ActionBar.m6.i7, org.telegram.ui.ActionBar.m6.f27946g7, org.telegram.ui.ActionBar.m6.f28020k7);
        woVar.setDrawBackgroundAsArc(14);
        woVar.setVisibility(8);
        addView(woVar, c8.ha.d(24, 24.0f, (org.telegram.messenger.id.f23161a0 ? 5 : 3) | 16, 16.0f, 0.0f, 8.0f, 0.0f));
        setWillNotDraw(false);
    }

    public final void a(boolean z9, boolean z10) {
        int L;
        float f10;
        int i7;
        if (this.f49984n == z9 && z10) {
            return;
        }
        this.f49984n = z9;
        if (org.telegram.messenger.id.f23161a0) {
            L = -org.telegram.messenger.g0.L(32.0f);
        } else {
            L = org.telegram.messenger.g0.L(32.0f);
        }
        float f11 = L;
        int i10 = 0;
        float f12 = 0.0f;
        if (!z10) {
            if (!z9) {
                f11 = 0.0f;
            }
            this.f49979a.setTranslationX(f11);
            this.f49980b.setTranslationX(f11);
            ImageView imageView = this.f49981c;
            imageView.setTranslationX(f11);
            boolean z11 = org.telegram.messenger.id.f23161a0;
            int L2 = org.telegram.messenger.g0.L(32.0f);
            if (!z11) {
                L2 = -L2;
            }
            float f13 = L2 + f11;
            org.telegram.ui.Components.wo woVar = this.f49983f;
            woVar.setTranslationX(f13);
            if (z9) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            imageView.setVisibility(i7);
            imageView.setAlpha(1.0f);
            imageView.setScaleX(1.0f);
            imageView.setScaleY(1.0f);
            if (!z9) {
                i10 = 8;
            }
            woVar.setVisibility(i10);
            woVar.setAlpha(1.0f);
            woVar.setScaleX(1.0f);
            woVar.setScaleY(1.0f);
            return;
        }
        if (z9) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (z9) {
            f12 = 1.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f10, f12).setDuration(200L);
        duration.setInterpolator(org.telegram.ui.Components.wq.f40046f);
        duration.addUpdateListener(new sf(this, f11, 4));
        duration.addListener(new c50(6, this, z9));
        duration.start();
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sx0.b():void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        if (org.telegram.messenger.id.f23161a0) {
            L = 0.0f;
        } else {
            L = org.telegram.messenger.g0.L(20.0f);
        }
        float f10 = L;
        float measuredHeight = getMeasuredHeight() - 1;
        int measuredWidth = getMeasuredWidth();
        if (org.telegram.messenger.id.f23161a0) {
            i7 = org.telegram.messenger.g0.L(20.0f);
        } else {
            i7 = 0;
        }
        canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.f28013k0);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), org.telegram.messenger.camera.q.B(64.0f, 1, 1073741824));
    }

    public void setChecked(boolean z9) {
        TextView textView = this.f49980b;
        if (z9) {
            if (this.f49982e == null) {
                this.f49982e = getResources().getDrawable(2131232625).mutate();
            }
            Drawable drawable = this.f49982e;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(this.f49985r, PorterDuff.Mode.MULTIPLY));
            }
            if (org.telegram.messenger.id.f23161a0) {
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.f49982e, (Drawable) null);
                return;
            } else {
                textView.setCompoundDrawablesWithIntrinsicBounds(this.f49982e, (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            }
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setProxy(org.telegram.messenger.hz hzVar) {
        String str;
        if (hzVar.f22998a.f56924a == 3) {
            str = a8.p0.s(new StringBuilder(), hzVar.f22998a.f56925b, " (WEB)");
        } else {
            str = hzVar.f22998a.f56925b + ":" + hzVar.f22998a.f56926c;
        }
        this.f49979a.setText(str);
        this.d = hzVar;
    }

    public void setValue(CharSequence charSequence) {
        this.f49980b.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        int x02;
        TextView textView = this.f49980b;
        if (textView != null) {
            try {
                if ((textView.getTag() instanceof Integer) && (x02 = org.telegram.ui.ActionBar.m6.x0(null, ((Integer) textView.getTag()).intValue(), false)) != this.f49985r) {
                    this.f49985r = x02;
                    textView.setTextColor(x02);
                    Drawable drawable = this.f49982e;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(this.f49985r, PorterDuff.Mode.MULTIPLY));
                    }
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
