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
public final class rx0 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public final TextView f51805a;
    public final TextView f51806b;
    public final ImageView f51807c;
    public org.telegram.messenger.az d;
    public Drawable f51808e;
    public final org.telegram.ui.Components.mp f51809f;
    public boolean h;
    public boolean f51810n;
    public int f51811r;
    public final ProxyListActivity f51812s;

    public rx0(ProxyListActivity proxyListActivity, Context context) {
        super(context);
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        this.f51812s = proxyListActivity;
        TextView textView = new TextView(context);
        this.f51805a = textView;
        org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, null);
        org.telegram.messenger.n10.q(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        if (org.telegram.messenger.gd.f24213a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView.setGravity(i7 | 16);
        boolean z10 = org.telegram.messenger.gd.f24213a0;
        if (z10) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i17 = i10 | 48;
        if (z10) {
            i11 = 56;
        } else {
            i11 = 21;
        }
        float f10 = i11;
        if (z10) {
            i12 = 21;
        } else {
            i12 = 56;
        }
        addView(textView, c8.ma.d(-2, -2.0f, i17, f10, 10.0f, i12, 0.0f));
        TextView textView2 = new TextView(context);
        this.f51806b = textView2;
        textView2.setTextSize(1, 13.0f);
        if (org.telegram.messenger.gd.f24213a0) {
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
        boolean z11 = org.telegram.messenger.gd.f24213a0;
        if (z11) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        int i18 = i14 | 48;
        if (z11) {
            i15 = 56;
        } else {
            i15 = 21;
        }
        addView(textView2, c8.ma.d(-2, -2.0f, i18, i15, 35.0f, z11 ? 21 : 56, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f51807c = imageView;
        imageView.setImageResource(2131232187);
        org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.A6, null, PorterDuff.Mode.MULTIPLY);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(org.telegram.messenger.gd.M0(2131751324, null));
        if (org.telegram.messenger.gd.f24213a0) {
            i16 = 3;
        } else {
            i16 = 5;
        }
        addView(imageView, c8.ma.d(48, 48.0f, i16 | 48, 8.0f, 8.0f, 8.0f, 0.0f));
        imageView.setOnClickListener(new j40(this, 28));
        org.telegram.ui.Components.mp mpVar = new org.telegram.ui.Components.mp(21, context, null);
        this.f51809f = mpVar;
        mpVar.b(org.telegram.ui.ActionBar.n6.i7, org.telegram.ui.ActionBar.n6.f29450g7, org.telegram.ui.ActionBar.n6.f29524k7);
        mpVar.setDrawBackgroundAsArc(14);
        mpVar.setVisibility(8);
        addView(mpVar, c8.ma.d(24, 24.0f, (org.telegram.messenger.gd.f24213a0 ? 5 : 3) | 16, 16.0f, 0.0f, 8.0f, 0.0f));
        setWillNotDraw(false);
    }

    public final void a(boolean z10, boolean z11) {
        int L;
        float f10;
        int i7;
        if (this.f51810n == z10 && z11) {
            return;
        }
        this.f51810n = z10;
        if (org.telegram.messenger.gd.f24213a0) {
            L = -org.telegram.messenger.g0.L(32.0f);
        } else {
            L = org.telegram.messenger.g0.L(32.0f);
        }
        float f11 = L;
        int i10 = 0;
        float f12 = 0.0f;
        if (!z11) {
            if (!z10) {
                f11 = 0.0f;
            }
            this.f51805a.setTranslationX(f11);
            this.f51806b.setTranslationX(f11);
            ImageView imageView = this.f51807c;
            imageView.setTranslationX(f11);
            boolean z12 = org.telegram.messenger.gd.f24213a0;
            int L2 = org.telegram.messenger.g0.L(32.0f);
            if (!z12) {
                L2 = -L2;
            }
            float f13 = L2 + f11;
            org.telegram.ui.Components.mp mpVar = this.f51809f;
            mpVar.setTranslationX(f13);
            if (z10) {
                i7 = 8;
            } else {
                i7 = 0;
            }
            imageView.setVisibility(i7);
            imageView.setAlpha(1.0f);
            imageView.setScaleX(1.0f);
            imageView.setScaleY(1.0f);
            if (!z10) {
                i10 = 8;
            }
            mpVar.setVisibility(i10);
            mpVar.setAlpha(1.0f);
            mpVar.setScaleX(1.0f);
            mpVar.setScaleY(1.0f);
            return;
        }
        if (z10) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (z10) {
            f12 = 1.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f10, f12).setDuration(200L);
        duration.setInterpolator(org.telegram.ui.Components.lr.f37208f);
        duration.addUpdateListener(new rf(this, f11, 6));
        duration.addListener(new c30(7, this, z10));
        duration.start();
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.rx0.b():void");
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
        if (org.telegram.messenger.gd.f24213a0) {
            L = 0.0f;
        } else {
            L = org.telegram.messenger.g0.L(20.0f);
        }
        float f10 = L;
        float measuredHeight = getMeasuredHeight() - 1;
        int measuredWidth = getMeasuredWidth();
        if (org.telegram.messenger.gd.f24213a0) {
            i7 = org.telegram.messenger.g0.L(20.0f);
        } else {
            i7 = 0;
        }
        canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.n6.f29517k0);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), org.telegram.messenger.n10.C(64.0f, 1, 1073741824));
    }

    public void setChecked(boolean z10) {
        TextView textView = this.f51806b;
        if (z10) {
            if (this.f51808e == null) {
                this.f51808e = getResources().getDrawable(2131232627).mutate();
            }
            Drawable drawable = this.f51808e;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(this.f51811r, PorterDuff.Mode.MULTIPLY));
            }
            if (org.telegram.messenger.gd.f24213a0) {
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.f51808e, (Drawable) null);
                return;
            } else {
                textView.setCompoundDrawablesWithIntrinsicBounds(this.f51808e, (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            }
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setProxy(org.telegram.messenger.az azVar) {
        String str;
        if (azVar.f22985a.f60607a == 3) {
            str = a8.p0.s(new StringBuilder(), azVar.f22985a.f60608b, " (WEB)");
        } else {
            str = azVar.f22985a.f60608b + ":" + azVar.f22985a.f60609c;
        }
        this.f51805a.setText(str);
        this.d = azVar;
    }

    public void setValue(CharSequence charSequence) {
        this.f51806b.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        int x02;
        TextView textView = this.f51806b;
        if (textView != null) {
            try {
                if ((textView.getTag() instanceof Integer) && (x02 = org.telegram.ui.ActionBar.n6.x0(null, ((Integer) textView.getTag()).intValue(), false)) != this.f51811r) {
                    this.f51811r = x02;
                    textView.setTextColor(x02);
                    Drawable drawable = this.f51808e;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(this.f51811r, PorterDuff.Mode.MULTIPLY));
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
