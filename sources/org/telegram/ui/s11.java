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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class s11 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final TextView f43335a;
    public final TextView f43336b;
    public final ImageView f43337c;
    public SharedConfig.ProxyInfo d;
    public Drawable e;
    public final org.telegram.ui.Components.zp f43338f;
    public boolean h;
    public boolean f43339n;
    public int f43340r;
    public final ProxyListActivity f43341s;

    public s11(ProxyListActivity proxyListActivity, Context context) {
        super(context);
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        this.f43341s = proxyListActivity;
        TextView textView = new TextView(context);
        this.f43335a = textView;
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, null);
        org.telegram.messenger.vh.r(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i18 = i11 | 48;
        if (z10) {
            i12 = 56;
        } else {
            i12 = 21;
        }
        float f7 = i12;
        if (z10) {
            i13 = 21;
        } else {
            i13 = 56;
        }
        addView(textView, org.telegram.ui.Components.gb1.h(-2, -2.0f, i18, f7, 10.0f, i13, 0.0f));
        TextView textView2 = new TextView(context);
        this.f43336b = textView2;
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
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        int i19 = i15 | 48;
        if (z11) {
            i16 = 56;
        } else {
            i16 = 21;
        }
        addView(textView2, org.telegram.ui.Components.gb1.h(-2, -2.0f, i19, i16, 35.0f, z11 ? 21 : 56, 0.0f));
        ImageView imageView = new ImageView(context);
        this.f43337c = imageView;
        imageView.setImageResource(R.drawable.msg_info);
        org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.A6, null, PorterDuff.Mode.MULTIPLY);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setContentDescription(LocaleController.getString(R.string.Edit));
        if (LocaleController.isRTL) {
            i17 = 3;
        } else {
            i17 = 5;
        }
        addView(imageView, org.telegram.ui.Components.gb1.h(48, 48.0f, i17 | 48, 8.0f, 8.0f, 8.0f, 0.0f));
        imageView.setOnClickListener(new x50(this, 28));
        org.telegram.ui.Components.zp zpVar = new org.telegram.ui.Components.zp(context, 21, null);
        this.f43338f = zpVar;
        zpVar.b(org.telegram.ui.ActionBar.y6.f23447i7, org.telegram.ui.ActionBar.y6.g7, org.telegram.ui.ActionBar.y6.f23483k7);
        zpVar.setDrawBackgroundAsArc(14);
        zpVar.setVisibility(8);
        addView(zpVar, org.telegram.ui.Components.gb1.h(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 16, 16.0f, 0.0f, 8.0f, 0.0f));
        setWillNotDraw(false);
    }

    public final void a(boolean z10, boolean z11) {
        int dp;
        float f7;
        int i10;
        if (this.f43339n == z10 && z11) {
            return;
        }
        this.f43339n = z10;
        if (LocaleController.isRTL) {
            dp = -AndroidUtilities.dp(32.0f);
        } else {
            dp = AndroidUtilities.dp(32.0f);
        }
        float f10 = dp;
        int i11 = 0;
        float f11 = 0.0f;
        if (!z11) {
            if (!z10) {
                f10 = 0.0f;
            }
            this.f43335a.setTranslationX(f10);
            this.f43336b.setTranslationX(f10);
            ImageView imageView = this.f43337c;
            imageView.setTranslationX(f10);
            boolean z12 = LocaleController.isRTL;
            int dp2 = AndroidUtilities.dp(32.0f);
            if (!z12) {
                dp2 = -dp2;
            }
            float f12 = dp2 + f10;
            org.telegram.ui.Components.zp zpVar = this.f43338f;
            zpVar.setTranslationX(f12);
            if (z10) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            imageView.setVisibility(i10);
            imageView.setAlpha(1.0f);
            imageView.setScaleX(1.0f);
            imageView.setScaleY(1.0f);
            if (!z10) {
                i11 = 8;
            }
            zpVar.setVisibility(i11);
            zpVar.setAlpha(1.0f);
            zpVar.setScaleX(1.0f);
            zpVar.setScaleY(1.0f);
            return;
        }
        if (z10) {
            f7 = 0.0f;
        } else {
            f7 = 1.0f;
        }
        if (z10) {
            f11 = 1.0f;
        }
        ValueAnimator duration = ValueAnimator.ofFloat(f7, f11).setDuration(200L);
        duration.setInterpolator(org.telegram.ui.Components.ds.f27584f);
        duration.addUpdateListener(new dg(this, f10, 4));
        duration.addListener(new q40(7, this, z10));
        duration.start();
    }

    public final void b() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.s11.b():void");
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
        float f7 = dp;
        float measuredHeight = getMeasuredHeight() - 1;
        int measuredWidth = getMeasuredWidth();
        if (LocaleController.isRTL) {
            i10 = AndroidUtilities.dp(20.0f);
        } else {
            i10 = 0;
        }
        canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.y6.f23476k0);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), org.telegram.messenger.vh.D(64.0f, 1, 1073741824));
    }

    public void setChecked(boolean z10) {
        TextView textView = this.f43336b;
        if (z10) {
            if (this.e == null) {
                this.e = getResources().getDrawable(R.drawable.proxy_check).mutate();
            }
            Drawable drawable = this.e;
            if (drawable != null) {
                drawable.setColorFilter(new PorterDuffColorFilter(this.f43340r, PorterDuff.Mode.MULTIPLY));
            }
            if (LocaleController.isRTL) {
                textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.e, (Drawable) null);
                return;
            } else {
                textView.setCompoundDrawablesWithIntrinsicBounds(this.e, (Drawable) null, (Drawable) null, (Drawable) null);
                return;
            }
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void setProxy(SharedConfig.ProxyInfo proxyInfo) {
        String str;
        if (proxyInfo.settings.f49167a == 3) {
            str = a1.g.s(new StringBuilder(), proxyInfo.settings.f49168b, " (WEB)");
        } else {
            str = proxyInfo.settings.f49168b + ":" + proxyInfo.settings.f49169c;
        }
        this.f43335a.setText(str);
        this.d = proxyInfo;
    }

    public void setValue(CharSequence charSequence) {
        this.f43336b.setText(charSequence);
    }

    @Override
    public final void updateColors() {
        int x02;
        TextView textView = this.f43336b;
        if (textView != null) {
            try {
                if ((textView.getTag() instanceof Integer) && (x02 = org.telegram.ui.ActionBar.y6.x0(null, ((Integer) textView.getTag()).intValue(), false)) != this.f43340r) {
                    this.f43340r = x02;
                    textView.setTextColor(x02);
                    Drawable drawable = this.e;
                    if (drawable != null) {
                        drawable.setColorFilter(new PorterDuffColorFilter(this.f43340r, PorterDuff.Mode.MULTIPLY));
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
