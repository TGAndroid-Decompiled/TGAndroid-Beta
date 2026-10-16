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
public final class ua extends FrameLayout {
    public final org.telegram.ui.Components.da0 f40334a;
    public final org.telegram.ui.Cells.y1 f40335b;
    public Integer f40336c;
    public ValueAnimator d;
    public final va e;

    public ua(va vaVar, Activity activity) {
        super(activity);
        int i10;
        this.e = vaVar;
        vaVar.F = this;
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(17.0f));
        setClipChildren(false);
        org.telegram.ui.Components.da0 da0Var = new org.telegram.ui.Components.da0(activity, null);
        this.f40334a = da0Var;
        da0Var.setTextSize(1, 15.0f);
        int i11 = org.telegram.ui.ActionBar.g6.F6;
        da0Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        da0Var.setGravity(i10);
        int i12 = org.telegram.ui.ActionBar.g6.J6;
        da0Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.x0(null, i12, false));
        int i13 = org.telegram.ui.ActionBar.g6.K6;
        da0Var.setHighlightColor(org.telegram.ui.ActionBar.g6.x0(null, i13, false));
        da0Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(this, activity, 2);
        vaVar.G = y1Var;
        this.f40335b = y1Var;
        y1Var.setTextSize(1, 15.0f);
        y1Var.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i11, false));
        y1Var.setGravity(LocaleController.isRTL ? 5 : 3);
        y1Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.x0(null, i12, false));
        y1Var.setHighlightColor(org.telegram.ui.ActionBar.g6.x0(null, i13, false));
        y1Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        addView(da0Var, w7.z5.e(-1, -2, 48));
        addView(y1Var, w7.z5.e(-1, -2, 48));
        if (vaVar.f40630x != 0) {
            String string = LocaleController.getString(R.string.BotUsernameHelp);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            int indexOf = string.indexOf(42);
            int lastIndexOf = string.lastIndexOf(42);
            if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.q61("https://fragment.com", (org.telegram.ui.Components.q11) null), indexOf, lastIndexOf - 1, 33);
            }
            da0Var.setText(spannableStringBuilder);
            return;
        }
        org.telegram.ui.Cells.c1.o(R.string.UsernameHelp, da0Var);
    }

    public static void a(final ua uaVar) {
        int intValue;
        int i10;
        float f7;
        org.telegram.ui.Components.da0 da0Var = uaVar.f40334a;
        org.telegram.ui.Cells.y1 y1Var = uaVar.f40335b;
        if (y1Var.getVisibility() == 0) {
            y1Var.measure(View.MeasureSpec.makeMeasureSpec((uaVar.getMeasuredWidth() - uaVar.getPaddingLeft()) - uaVar.getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(9999999, Integer.MIN_VALUE));
        }
        ValueAnimator valueAnimator = uaVar.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Integer num = uaVar.f40336c;
        if (num == null) {
            intValue = uaVar.getMeasuredHeight();
        } else {
            intValue = num.intValue();
        }
        final int i11 = intValue;
        int height = da0Var.getHeight() + AndroidUtilities.dp(27.0f);
        if (y1Var.getVisibility() == 0 && !TextUtils.isEmpty(y1Var.getText())) {
            i10 = AndroidUtilities.dp(8.0f) + y1Var.getMeasuredHeight();
        } else {
            i10 = 0;
        }
        final int i12 = height + i10;
        final float translationY = da0Var.getTranslationY();
        if (y1Var.getVisibility() == 0 && !TextUtils.isEmpty(y1Var.getText())) {
            f7 = AndroidUtilities.dp(8.0f) + y1Var.getMeasuredHeight();
        } else {
            f7 = 0.0f;
        }
        final float f10 = f7;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        uaVar.d = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ua uaVar2 = ua.this;
                uaVar2.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                uaVar2.f40334a.setTranslationY(AndroidUtilities.lerp(translationY, f10, floatValue));
                uaVar2.f40336c = Integer.valueOf(AndroidUtilities.lerp(i11, i12, floatValue));
                uaVar2.requestLayout();
            }
        });
        uaVar.d.setDuration(200L);
        uaVar.d.setInterpolator(org.telegram.ui.Components.es.h);
        uaVar.d.start();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        Integer num = this.f40336c;
        if (num != null) {
            i11 = View.MeasureSpec.makeMeasureSpec(num.intValue(), 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
