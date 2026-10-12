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
public final class ta extends FrameLayout {
    public final org.telegram.ui.Components.ia0 f42135a;
    public final org.telegram.ui.Cells.y1 f42136b;
    public Integer f42137c;
    public ValueAnimator d;
    public final ua f42138e;

    public ta(ua uaVar, Activity activity) {
        super(activity);
        int i10;
        this.f42138e = uaVar;
        uaVar.F = this;
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(17.0f));
        setClipChildren(false);
        org.telegram.ui.Components.ia0 ia0Var = new org.telegram.ui.Components.ia0(activity, null);
        this.f42135a = ia0Var;
        ia0Var.setTextSize(1, 15.0f);
        int i11 = org.telegram.ui.ActionBar.h6.F6;
        ia0Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        ia0Var.setGravity(i10);
        int i12 = org.telegram.ui.ActionBar.h6.J6;
        ia0Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        int i13 = org.telegram.ui.ActionBar.h6.K6;
        ia0Var.setHighlightColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
        ia0Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(this, activity, 2);
        uaVar.G = y1Var;
        this.f42136b = y1Var;
        y1Var.setTextSize(1, 15.0f);
        y1Var.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i11, false));
        y1Var.setGravity(LocaleController.isRTL ? 5 : 3);
        y1Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.x0(null, i12, false));
        y1Var.setHighlightColor(org.telegram.ui.ActionBar.h6.x0(null, i13, false));
        y1Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        addView(ia0Var, w7.w5.e(-1, -2, 48));
        addView(y1Var, w7.w5.e(-1, -2, 48));
        if (uaVar.f42441x != 0) {
            String string = LocaleController.getString(R.string.BotUsernameHelp);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            int indexOf = string.indexOf(42);
            int lastIndexOf = string.lastIndexOf(42);
            if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.y61("https://fragment.com", (org.telegram.ui.Components.z11) null), indexOf, lastIndexOf - 1, 33);
            }
            ia0Var.setText(spannableStringBuilder);
            return;
        }
        org.telegram.ui.Cells.c1.o(R.string.UsernameHelp, ia0Var);
    }

    public static void a(final ta taVar) {
        int intValue;
        int i10;
        float f7;
        org.telegram.ui.Components.ia0 ia0Var = taVar.f42135a;
        org.telegram.ui.Cells.y1 y1Var = taVar.f42136b;
        if (y1Var.getVisibility() == 0) {
            y1Var.measure(View.MeasureSpec.makeMeasureSpec((taVar.getMeasuredWidth() - taVar.getPaddingLeft()) - taVar.getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(9999999, Integer.MIN_VALUE));
        }
        ValueAnimator valueAnimator = taVar.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Integer num = taVar.f42137c;
        if (num == null) {
            intValue = taVar.getMeasuredHeight();
        } else {
            intValue = num.intValue();
        }
        final int i11 = intValue;
        int height = ia0Var.getHeight() + AndroidUtilities.dp(27.0f);
        if (y1Var.getVisibility() == 0 && !TextUtils.isEmpty(y1Var.getText())) {
            i10 = AndroidUtilities.dp(8.0f) + y1Var.getMeasuredHeight();
        } else {
            i10 = 0;
        }
        final int i12 = height + i10;
        final float translationY = ia0Var.getTranslationY();
        if (y1Var.getVisibility() == 0 && !TextUtils.isEmpty(y1Var.getText())) {
            f7 = AndroidUtilities.dp(8.0f) + y1Var.getMeasuredHeight();
        } else {
            f7 = 0.0f;
        }
        final float f10 = f7;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        taVar.d = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ta taVar2 = ta.this;
                taVar2.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                taVar2.f42135a.setTranslationY(AndroidUtilities.lerp(translationY, f10, floatValue));
                taVar2.f42137c = Integer.valueOf(AndroidUtilities.lerp(i11, i12, floatValue));
                taVar2.requestLayout();
            }
        });
        taVar.d.setDuration(200L);
        taVar.d.setInterpolator(org.telegram.ui.Components.js.h);
        taVar.d.start();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        Integer num = this.f42137c;
        if (num != null) {
            i11 = View.MeasureSpec.makeMeasureSpec(num.intValue(), 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
