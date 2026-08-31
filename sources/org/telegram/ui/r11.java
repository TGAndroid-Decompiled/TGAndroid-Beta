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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class r11 extends FrameLayout {
    public final TextView f40745a;
    public final TextView f40746b;
    public final ImageView f40747c;
    public SharedConfig.ProxyInfo d;
    public Drawable f40748e;
    public final org.telegram.ui.Components.np f40749f;
    public boolean h;
    public boolean f40750n;
    public int f40751r;
    public final ProxyListActivity f40752s;

    public r11(ProxyListActivity proxyListActivity, Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        this.f40752s = proxyListActivity;
        TextView textView = new TextView(context);
        this.f40745a = textView;
        b.q(textView, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.G6, false), 1, 16.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        boolean z4 = LocaleController.isRTL;
        if (z4) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i18 = i11 | 48;
        if (z4) {
            i12 = 56;
        } else {
            i12 = 21;
        }
        float f10 = i12;
        if (z4) {
            i13 = 21;
        } else {
            i13 = 56;
        }
        addView(textView, k7.c6.d(-2, -2.0f, i18, f10, 10.0f, i13, 0.0f));
        TextView textView2 = new TextView(context);
        this.f40746b = textView2;
        textView2.setTextSize(1, 13.0f);
        if (LocaleController.isRTL) {
            i14 = 5;
        } else {
            i14 = 3;
        }
        textView2.setGravity(i14);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
        textView2.setEllipsize(truncateAt);
        textView2.setPadding(0, 0, 0, 0);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        int i19 = i15 | 48;
        if (z10) {
            i16 = 56;
        } else {
            i16 = 21;
        }
        addView(textView2, k7.c6.d(-2, -2.0f, i19, i16, 35.0f, z10 ? 21 : 56, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f40747c = imageView;
        imageView.setImageResource(R.drawable.msg_info);
        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.A6, false), PorterDuff.Mode.MULTIPLY));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(LocaleController.getString(R.string.Edit));
        if (LocaleController.isRTL) {
            i17 = 3;
        } else {
            i17 = 5;
        }
        addView(imageView, k7.c6.d(48, 48.0f, i17 | 48, 8.0f, 8.0f, 8.0f, 0.0f));
        imageView.setOnClickListener(new f60(this, 27));
        org.telegram.ui.Components.np npVar = new org.telegram.ui.Components.np(context, 21, null);
        this.f40749f = npVar;
        npVar.b(org.telegram.ui.ActionBar.k6.f21751i7, org.telegram.ui.ActionBar.k6.f21715g7, org.telegram.ui.ActionBar.k6.f21786k7);
        npVar.setDrawBackgroundAsArc(14);
        npVar.setVisibility(8);
        addView(npVar, k7.c6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 8.0f, 0.0f));
        setWillNotDraw(false);
    }

    public final void a(boolean z4, boolean z10) {
        int dp;
        float f10;
        int i10;
        if (this.f40750n == z4 && z10) {
            return;
        }
        this.f40750n = z4;
        if (LocaleController.isRTL) {
            dp = -AndroidUtilities.dp(32.0f);
        } else {
            dp = AndroidUtilities.dp(32.0f);
        }
        float f11 = dp;
        int i11 = 0;
        float f12 = 0.0f;
        if (!z10) {
            if (!z4) {
                f11 = 0.0f;
            }
            this.f40745a.setTranslationX(f11);
            this.f40746b.setTranslationX(f11);
            ImageView imageView = this.f40747c;
            imageView.setTranslationX(f11);
            boolean z11 = LocaleController.isRTL;
            int dp2 = AndroidUtilities.dp(32.0f);
            if (!z11) {
                dp2 = -dp2;
            }
            float f13 = dp2 + f11;
            org.telegram.ui.Components.np npVar = this.f40749f;
            npVar.setTranslationX(f13);
            if (z4) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            imageView.setVisibility(i10);
            imageView.setAlpha(1.0f);
            imageView.setScaleX(1.0f);
            imageView.setScaleY(1.0f);
            if (!z4) {
                i11 = 8;
            }
            npVar.setVisibility(i11);
            npVar.setAlpha(1.0f);
            npVar.setScaleX(1.0f);
            npVar.setScaleY(1.0f);
            return;
        }
        if (z4) {
            f10 = 0.0f;
        } else {
            f10 = 1.0f;
        }
        if (z4) {
            f12 = 1.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f10, f12).setDuration(200L);
        duration.setInterpolator(org.telegram.ui.Components.pr.f30183f);
        duration.addUpdateListener(new gg(this, f11, 4));
        duration.addListener(new org.telegram.ui.Components.x20(26, this, z4));
        duration.start();
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.r11.b():void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        b();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        if (LocaleController.isRTL) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(20.0f);
        }
        float measuredHeight = getMeasuredHeight() - 1;
        int measuredWidth = getMeasuredWidth();
        if (LocaleController.isRTL) {
            i10 = AndroidUtilities.dp(20.0f);
        } else {
            i10 = 0;
        }
        canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f21779k0);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), b.B(64.0f, 1, 1073741824));
    }

    public void setChecked(boolean z4) {
        TextView textView = this.f40746b;
        if (z4) {
            if (this.f40748e == null) {
                this.f40748e = getResources().getDrawable(R.drawable.proxy_check).mutate();
            }
            Drawable drawable = this.f40748e;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(this.f40751r, PorterDuff.Mode.MULTIPLY));
            }
            if (LocaleController.isRTL) {
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.f40748e, (Drawable) null);
                return;
            } else {
                textView.setCompoundDrawablesWithIntrinsicBounds(this.f40748e, (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            }
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setProxy(SharedConfig.ProxyInfo proxyInfo) {
        String str;
        if (proxyInfo.settings.f47300a == 3) {
            str = android.support.v4.media.a.r(new StringBuilder(), proxyInfo.settings.f47301b, " (WEB)");
        } else {
            str = proxyInfo.settings.f47301b + ":" + proxyInfo.settings.f47302c;
        }
        this.f40745a.setText(str);
        this.d = proxyInfo;
    }

    public void setValue(CharSequence charSequence) {
        this.f40746b.setText(charSequence);
    }
}
