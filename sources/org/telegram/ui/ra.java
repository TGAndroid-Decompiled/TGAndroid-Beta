package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ra extends FrameLayout {
    public final org.telegram.ui.Components.w90 f41073a;
    public final org.telegram.ui.Cells.x1 f41074b;
    public Integer f41075c;
    public ValueAnimator d;
    public final sa e;

    public ra(sa saVar, Activity activity) {
        super(activity);
        int i10;
        this.e = saVar;
        saVar.F = this;
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(17.0f));
        setClipChildren(false);
        org.telegram.ui.Components.w90 w90Var = new org.telegram.ui.Components.w90(activity, null);
        this.f41073a = w90Var;
        w90Var.setTextSize(1, 15.0f);
        int i11 = org.telegram.ui.ActionBar.k6.F6;
        org.telegram.ui.ActionBar.r6.W(w90Var, i11, null);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        w90Var.setGravity(i10);
        int i12 = org.telegram.ui.ActionBar.k6.J6;
        org.telegram.ui.ActionBar.r6.I(w90Var, i12, null);
        int i13 = org.telegram.ui.ActionBar.k6.K6;
        org.telegram.ui.ActionBar.r6.E(w90Var, i13, null);
        w90Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        org.telegram.ui.Cells.x1 x1Var = new org.telegram.ui.Cells.x1(this, activity, 2);
        saVar.G = x1Var;
        this.f41074b = x1Var;
        x1Var.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.r6.W(x1Var, i11, null);
        x1Var.setGravity(LocaleController.isRTL ? 5 : 3);
        org.telegram.ui.ActionBar.r6.I(x1Var, i12, null);
        org.telegram.ui.ActionBar.r6.E(x1Var, i13, null);
        x1Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        addView(w90Var, w7.z5.e(-1, -2, 48));
        addView(x1Var, w7.z5.e(-1, -2, 48));
        if (saVar.f41334x != 0) {
            String string = LocaleController.getString(R.string.BotUsernameHelp);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            int indexOf = string.indexOf(42);
            int lastIndexOf = string.lastIndexOf(42);
            if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.p61("https://fragment.com", (org.telegram.ui.Components.p11) null), indexOf, lastIndexOf - 1, 33);
            }
            w90Var.setText(spannableStringBuilder);
            return;
        }
        org.telegram.ui.Cells.b1.r(R.string.UsernameHelp, w90Var);
    }

    public static void a(final ra raVar) {
        int intValue;
        int i10;
        float f7;
        org.telegram.ui.Components.w90 w90Var = raVar.f41073a;
        org.telegram.ui.Cells.x1 x1Var = raVar.f41074b;
        if (x1Var.getVisibility() == 0) {
            x1Var.measure(View.MeasureSpec.makeMeasureSpec((raVar.getMeasuredWidth() - raVar.getPaddingLeft()) - raVar.getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(9999999, Integer.MIN_VALUE));
        }
        ValueAnimator valueAnimator = raVar.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Integer num = raVar.f41075c;
        if (num == null) {
            intValue = raVar.getMeasuredHeight();
        } else {
            intValue = num.intValue();
        }
        final int i11 = intValue;
        int height = w90Var.getHeight() + AndroidUtilities.dp(27.0f);
        if (x1Var.getVisibility() == 0 && !TextUtils.isEmpty(x1Var.getText())) {
            i10 = AndroidUtilities.dp(8.0f) + x1Var.getMeasuredHeight();
        } else {
            i10 = 0;
        }
        final int i12 = height + i10;
        final float translationY = w90Var.getTranslationY();
        if (x1Var.getVisibility() == 0 && !TextUtils.isEmpty(x1Var.getText())) {
            f7 = AndroidUtilities.dp(8.0f) + x1Var.getMeasuredHeight();
        } else {
            f7 = 0.0f;
        }
        final float f10 = f7;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        raVar.d = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ra raVar2 = ra.this;
                raVar2.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                raVar2.f41073a.setTranslationY(AndroidUtilities.lerp(translationY, f10, floatValue));
                raVar2.f41075c = Integer.valueOf(AndroidUtilities.lerp(i11, i12, floatValue));
                raVar2.requestLayout();
            }
        });
        raVar.d.setDuration(200L);
        raVar.d.setInterpolator(org.telegram.ui.Components.zr.h);
        raVar.d.start();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        Integer num = this.f41075c;
        if (num != null) {
            i11 = View.MeasureSpec.makeMeasureSpec(num.intValue(), 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
