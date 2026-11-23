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
public final class rx0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public final TextView f51784a;
    public final TextView f51785b;
    public final ImageView f51786c;
    public org.telegram.messenger.bz d;
    public Drawable f51787e;
    public final org.telegram.ui.Components.op f51788f;
    public boolean h;
    public boolean f51789n;
    public int f51790r;
    public final ProxyListActivity f51791s;

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
        this.f51791s = proxyListActivity;
        TextView textView = new TextView(context);
        this.f51784a = textView;
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, null);
        org.telegram.messenger.o10.q(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        if (org.telegram.messenger.hd.f24444a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView.setGravity(i7 | 16);
        boolean z10 = org.telegram.messenger.hd.f24444a0;
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
        this.f51785b = textView2;
        textView2.setTextSize(1, 13.0f);
        if (org.telegram.messenger.hd.f24444a0) {
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
        boolean z11 = org.telegram.messenger.hd.f24444a0;
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
        this.f51786c = imageView;
        imageView.setImageResource(2131232187);
        org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.A6, null, PorterDuff.Mode.MULTIPLY);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(org.telegram.messenger.hd.N0(2131751323, null));
        if (org.telegram.messenger.hd.f24444a0) {
            i16 = 3;
        } else {
            i16 = 5;
        }
        addView(imageView, c8.ma.d(48, 48.0f, i16 | 48, 8.0f, 8.0f, 8.0f, 0.0f));
        imageView.setOnClickListener(new j40(this, 28));
        org.telegram.ui.Components.op opVar = new org.telegram.ui.Components.op(21, context, null);
        this.f51788f = opVar;
        opVar.b(org.telegram.ui.ActionBar.m6.i7, org.telegram.ui.ActionBar.m6.f29437g7, org.telegram.ui.ActionBar.m6.f29511k7);
        opVar.setDrawBackgroundAsArc(14);
        opVar.setVisibility(8);
        addView(opVar, c8.ma.d(24, 24.0f, (org.telegram.messenger.hd.f24444a0 ? 5 : 3) | 16, 16.0f, 0.0f, 8.0f, 0.0f));
        setWillNotDraw(false);
    }

    public final void a(boolean z10, boolean z11) {
        int L;
        float f10;
        int i7;
        if (this.f51789n == z10 && z11) {
            return;
        }
        this.f51789n = z10;
        if (org.telegram.messenger.hd.f24444a0) {
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
            this.f51784a.setTranslationX(f11);
            this.f51785b.setTranslationX(f11);
            ImageView imageView = this.f51786c;
            imageView.setTranslationX(f11);
            boolean z12 = org.telegram.messenger.hd.f24444a0;
            int L2 = org.telegram.messenger.g0.L(32.0f);
            if (!z12) {
                L2 = -L2;
            }
            float f13 = L2 + f11;
            org.telegram.ui.Components.op opVar = this.f51788f;
            opVar.setTranslationX(f13);
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
            opVar.setVisibility(i10);
            opVar.setAlpha(1.0f);
            opVar.setScaleX(1.0f);
            opVar.setScaleY(1.0f);
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
        duration.setInterpolator(org.telegram.ui.Components.nr.f37961f);
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
        if (org.telegram.messenger.hd.f24444a0) {
            L = 0.0f;
        } else {
            L = org.telegram.messenger.g0.L(20.0f);
        }
        float f10 = L;
        float measuredHeight = getMeasuredHeight() - 1;
        int measuredWidth = getMeasuredWidth();
        if (org.telegram.messenger.hd.f24444a0) {
            i7 = org.telegram.messenger.g0.L(20.0f);
        } else {
            i7 = 0;
        }
        canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.f29504k0);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), org.telegram.messenger.o10.C(64.0f, 1, 1073741824));
    }

    public void setChecked(boolean z10) {
        TextView textView = this.f51785b;
        if (z10) {
            if (this.f51787e == null) {
                this.f51787e = getResources().getDrawable(2131232627).mutate();
            }
            Drawable drawable = this.f51787e;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(this.f51790r, PorterDuff.Mode.MULTIPLY));
            }
            if (org.telegram.messenger.hd.f24444a0) {
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.f51787e, (Drawable) null);
                return;
            } else {
                textView.setCompoundDrawablesWithIntrinsicBounds(this.f51787e, (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            }
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setProxy(org.telegram.messenger.bz bzVar) {
        String str;
        if (bzVar.f23197a.f60652a == 3) {
            str = a8.p0.s(new StringBuilder(), bzVar.f23197a.f60653b, " (WEB)");
        } else {
            str = bzVar.f23197a.f60653b + ":" + bzVar.f23197a.f60654c;
        }
        this.f51784a.setText(str);
        this.d = bzVar;
    }

    public void setValue(CharSequence charSequence) {
        this.f51785b.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        int x02;
        TextView textView = this.f51785b;
        if (textView != null) {
            try {
                if ((textView.getTag() instanceof Integer) && (x02 = org.telegram.ui.ActionBar.m6.x0(null, ((Integer) textView.getTag()).intValue(), false)) != this.f51790r) {
                    this.f51790r = x02;
                    textView.setTextColor(x02);
                    Drawable drawable = this.f51787e;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(this.f51790r, PorterDuff.Mode.MULTIPLY));
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
