package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class rb0 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public final org.telegram.ui.Components.ba f43093a;
    public final SpannableStringBuilder f43094b;
    public final org.telegram.ui.Cells.v1 f43095c;
    public final TextView d;
    public final org.telegram.ui.Cells.v1 e;
    public final TextView f43096f;
    public final org.telegram.ui.Components.lp0 h;
    public final pb0 f43097n;
    public boolean f43098r;
    public float f43099s;
    public ValueAnimator v;
    public float f43100w;
    public ValueAnimator f43101x;
    public final tb0 f43102y;

    public rb0(tb0 tb0Var, Context context) {
        super(context);
        int i10;
        int i11;
        this.f43102y = tb0Var;
        LinearLayout linearLayout = new LinearLayout(context);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        linearLayout.setGravity(i10);
        linearLayout.setImportantForAccessibility(4);
        TextView textView = new TextView(context);
        ic.a.o(15.0f, 1, textView);
        int i12 = org.telegram.ui.ActionBar.y6.L6;
        org.telegram.ui.ActionBar.f7.V(textView, i12, null);
        if (LocaleController.isRTL) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView.setGravity(i11);
        textView.setText(LocaleController.getString("LiteBatteryTitle"));
        linearLayout.addView(textView, org.telegram.ui.Components.gb1.u(-2, -2, 16));
        org.telegram.ui.Cells.v1 v1Var = new org.telegram.ui.Cells.v1(context, true, false, false);
        v1Var.v = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(4.0f), org.telegram.ui.ActionBar.y6.o1(0.15f, org.telegram.ui.ActionBar.y6.x0(null, i12, false)));
        this.f43095c = v1Var;
        v1Var.setTypeface(AndroidUtilities.bold());
        v1Var.setPadding(AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(5.33f), AndroidUtilities.dp(2.0f));
        v1Var.setTextSize(AndroidUtilities.dp(12.0f));
        org.telegram.ui.ActionBar.f7.Z(v1Var, i12, null);
        linearLayout.addView(v1Var, org.telegram.ui.Components.gb1.x(-2, 17, 16, 6, 1, 0, 0));
        addView(linearLayout, org.telegram.ui.Components.gb1.h(-1, -2.0f, 55, 21.0f, 17.0f, 21.0f, 0.0f));
        org.telegram.ui.Components.lp0 lp0Var = new org.telegram.ui.Components.lp0(context, null, true);
        this.h = lp0Var;
        lp0Var.setReportChanges(true);
        lp0Var.setDelegate(new f(this, 23));
        lp0Var.setProgress(LiteMode.getPowerSaverLevel() / 100.0f);
        lp0Var.setImportantForAccessibility(2);
        addView(lp0Var, org.telegram.ui.Components.gb1.h(-1, 44.0f, 48, 6.0f, 68.0f, 6.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setImportantForAccessibility(4);
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        int i13 = org.telegram.ui.ActionBar.y6.f23748y6;
        textView2.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i13, false));
        textView2.setGravity(3);
        textView2.setText(LocaleController.getString(R.string.LiteBatteryDisabled));
        frameLayout.addView(textView2, org.telegram.ui.Components.gb1.i(-2, -2, 19));
        org.telegram.ui.Cells.v1 v1Var2 = new org.telegram.ui.Cells.v1(this, context);
        this.e = v1Var2;
        v1Var2.b(0.45f, 240L, org.telegram.ui.Components.ds.h);
        v1Var2.setGravity(1);
        v1Var2.setTextSize(AndroidUtilities.dp(13.0f));
        org.telegram.ui.ActionBar.f7.Z(v1Var2, org.telegram.ui.ActionBar.y6.f23540n6, null);
        frameLayout.addView(v1Var2, org.telegram.ui.Components.gb1.i(-2, -2, 17));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("b");
        this.f43094b = spannableStringBuilder;
        org.telegram.ui.Components.ba baVar = new org.telegram.ui.Components.ba();
        this.f43093a = baVar;
        baVar.f26796a = v1Var2.getPaint();
        baVar.f26799f = AndroidUtilities.dp(1.5f);
        baVar.setBounds(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(-20.0f), AndroidUtilities.dp(23.0f), 0);
        spannableStringBuilder.setSpan(new ImageSpan(baVar, 0), 0, spannableStringBuilder.length(), 33);
        TextView textView3 = new TextView(context);
        this.f43096f = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.y6.x0(null, i13, false));
        textView3.setGravity(5);
        textView3.setText(LocaleController.getString(R.string.LiteBatteryEnabled));
        frameLayout.addView(textView3, org.telegram.ui.Components.gb1.i(-2, -2, 21));
        addView(frameLayout, org.telegram.ui.Components.gb1.h(-1, -2.0f, 55, 21.0f, 52.0f, 21.0f, 0.0f));
        this.f43097n = new pb0(this);
        a();
    }

    public final void a() {
        int i10;
        boolean z10;
        float f7;
        float f10;
        int powerSaverLevel = LiteMode.getPowerSaverLevel();
        org.telegram.ui.Cells.v1 v1Var = this.e;
        v1Var.a();
        if (powerSaverLevel <= 0) {
            v1Var.c(LocaleController.getString(R.string.LiteBatteryAlwaysDisabled), !LocaleController.isRTL, true);
        } else if (powerSaverLevel >= 100) {
            v1Var.c(LocaleController.getString(R.string.LiteBatteryAlwaysEnabled), !LocaleController.isRTL, true);
        } else {
            float f11 = powerSaverLevel;
            this.f43093a.a(f11 / 100.0f, true);
            v1Var.c(AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.LiteBatteryWhenBelow), TextUtils.concat(String.format("%d%% ", Integer.valueOf(Math.round(f11))), this.f43094b)), !LocaleController.isRTL, true);
        }
        if (LiteMode.isPowerSaverApplied()) {
            i10 = R.string.LiteBatteryEnabled;
        } else {
            i10 = R.string.LiteBatteryDisabled;
        }
        String upperCase = LocaleController.getString(i10).toUpperCase();
        org.telegram.ui.Cells.v1 v1Var2 = this.f43095c;
        v1Var2.setText(upperCase);
        if (powerSaverLevel > 0 && powerSaverLevel < 100) {
            z10 = true;
        } else {
            z10 = false;
        }
        float f12 = 0.0f;
        if (z10 != this.f43098r) {
            this.f43098r = z10;
            v1Var2.clearAnimation();
            ViewPropertyAnimator animate = v1Var2.animate();
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            org.telegram.messenger.vh.q(animate.alpha(f10), org.telegram.ui.Components.ds.h, 220L);
        }
        if (powerSaverLevel >= 100) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        if (this.f43099s != f7) {
            this.f43099s = f7;
            ValueAnimator valueAnimator = this.v;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.v = null;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f43099s, f7);
            this.v = ofFloat;
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final rb0 f42148b;

                {
                    this.f42148b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    switch (r2) {
                        case 0:
                            rb0 rb0Var = this.f42148b;
                            TextView textView = rb0Var.f43096f;
                            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23748y6, false);
                            int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23540n6, false);
                            float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            rb0Var.f43099s = floatValue;
                            textView.setTextColor(i0.a.f(floatValue, x02, x03));
                            return;
                        default:
                            rb0 rb0Var2 = this.f42148b;
                            TextView textView2 = rb0Var2.d;
                            int x04 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23748y6, false);
                            int x05 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23540n6, false);
                            float floatValue2 = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                            rb0Var2.f43100w = floatValue2;
                            textView2.setTextColor(i0.a.f(floatValue2, x04, x05));
                            return;
                    }
                }
            });
            this.v.addListener(new qb0(this, f7, 0));
            this.v.setInterpolator(org.telegram.ui.Components.ds.h);
            this.v.setDuration(320L);
            this.v.start();
        }
        if (powerSaverLevel <= 0) {
            f12 = 1.0f;
        }
        if (this.f43100w != f12) {
            this.f43100w = f12;
            ValueAnimator valueAnimator2 = this.f43101x;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
                this.f43101x = null;
            }
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f43100w, f12);
            this.f43101x = ofFloat2;
            ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                public final rb0 f42148b;

                {
                    this.f42148b = this;
                }

                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                    switch (r2) {
                        case 0:
                            rb0 rb0Var = this.f42148b;
                            TextView textView = rb0Var.f43096f;
                            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23748y6, false);
                            int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23540n6, false);
                            float floatValue = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            rb0Var.f43099s = floatValue;
                            textView.setTextColor(i0.a.f(floatValue, x02, x03));
                            return;
                        default:
                            rb0 rb0Var2 = this.f42148b;
                            TextView textView2 = rb0Var2.d;
                            int x04 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23748y6, false);
                            int x05 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23540n6, false);
                            float floatValue2 = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                            rb0Var2.f43100w = floatValue2;
                            textView2.setTextColor(i0.a.f(floatValue2, x04, x05));
                            return;
                    }
                }
            });
            this.f43101x.addListener(new qb0(this, f12, 1));
            this.f43101x.setInterpolator(org.telegram.ui.Components.ds.h);
            this.f43101x.setDuration(320L);
            this.f43101x.start();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23748y6));
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f43097n.onInitializeAccessibilityNodeInfo(this, accessibilityNodeInfo);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(112.0f), 1073741824));
    }

    @Override
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        this.f43097n.onPopulateAccessibilityEvent(this, accessibilityEvent);
    }

    @Override
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        return this.f43097n.performAccessibilityAction(this, i10, bundle);
    }

    @Override
    public final void updateColors() {
        ValueAnimator valueAnimator;
        TextView textView = this.f43096f;
        if (textView != null) {
            try {
                ValueAnimator valueAnimator2 = this.v;
                if (valueAnimator2 != null) {
                    if (!valueAnimator2.isRunning()) {
                    }
                }
                textView.setTextColor(i0.a.f(this.f43099s, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23748y6, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23540n6, false)));
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        TextView textView2 = this.d;
        if (textView2 != null && ((valueAnimator = this.f43101x) == null || !valueAnimator.isRunning())) {
            textView2.setTextColor(i0.a.f(this.f43100w, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23748y6, false), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23540n6, false)));
        }
        org.telegram.ui.Cells.v1 v1Var = this.f43095c;
        if (v1Var != null) {
            v1Var.invalidate();
        }
    }
}
