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
    public final org.telegram.ui.Components.q90 f39955a;
    public final org.telegram.ui.Cells.y1 f39956b;
    public Integer f39957c;
    public ValueAnimator d;
    public final sa f39958e;

    public ra(sa saVar, Activity activity) {
        super(activity);
        int i10;
        this.f39958e = saVar;
        saVar.F = this;
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(17.0f));
        setClipChildren(false);
        org.telegram.ui.Components.q90 q90Var = new org.telegram.ui.Components.q90(activity, null);
        this.f39955a = q90Var;
        q90Var.setTextSize(1, 15.0f);
        int i11 = org.telegram.ui.ActionBar.i6.F6;
        q90Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        q90Var.setGravity(i10);
        int i12 = org.telegram.ui.ActionBar.i6.J6;
        q90Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
        int i13 = org.telegram.ui.ActionBar.i6.K6;
        q90Var.setHighlightColor(org.telegram.ui.ActionBar.i6.w0(null, i13, false));
        q90Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(this, activity, 2);
        saVar.G = y1Var;
        this.f39956b = y1Var;
        y1Var.setTextSize(1, 15.0f);
        y1Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i11, false));
        y1Var.setGravity(LocaleController.isRTL ? 5 : 3);
        y1Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
        y1Var.setHighlightColor(org.telegram.ui.ActionBar.i6.w0(null, i13, false));
        y1Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        addView(q90Var, w7.z5.e(-1, -2, 48));
        addView(y1Var, w7.z5.e(-1, -2, 48));
        if (saVar.f40431x != 0) {
            String string = LocaleController.getString(R.string.BotUsernameHelp);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            int indexOf = string.indexOf(42);
            int lastIndexOf = string.lastIndexOf(42);
            if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.k61("https://fragment.com", (org.telegram.ui.Components.m11) null), indexOf, lastIndexOf - 1, 33);
            }
            q90Var.setText(spannableStringBuilder);
            return;
        }
        org.telegram.ui.Cells.c1.q(R.string.UsernameHelp, q90Var);
    }

    public static void a(final ra raVar) {
        int intValue;
        int i10;
        final float f7;
        org.telegram.ui.Components.q90 q90Var = raVar.f39955a;
        org.telegram.ui.Cells.y1 y1Var = raVar.f39956b;
        if (y1Var.getVisibility() == 0) {
            y1Var.measure(View.MeasureSpec.makeMeasureSpec((raVar.getMeasuredWidth() - raVar.getPaddingLeft()) - raVar.getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(9999999, Integer.MIN_VALUE));
        }
        ValueAnimator valueAnimator = raVar.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Integer num = raVar.f39957c;
        if (num == null) {
            intValue = raVar.getMeasuredHeight();
        } else {
            intValue = num.intValue();
        }
        final int i11 = intValue;
        int height = q90Var.getHeight() + AndroidUtilities.dp(27.0f);
        if (y1Var.getVisibility() == 0 && !TextUtils.isEmpty(y1Var.getText())) {
            i10 = AndroidUtilities.dp(8.0f) + y1Var.getMeasuredHeight();
        } else {
            i10 = 0;
        }
        final int i12 = height + i10;
        final float translationY = q90Var.getTranslationY();
        if (y1Var.getVisibility() == 0 && !TextUtils.isEmpty(y1Var.getText())) {
            f7 = AndroidUtilities.dp(8.0f) + y1Var.getMeasuredHeight();
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        raVar.d = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                ra raVar2 = ra.this;
                raVar2.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                raVar2.f39955a.setTranslationY(AndroidUtilities.lerp(translationY, f7, floatValue));
                raVar2.f39957c = Integer.valueOf(AndroidUtilities.lerp(i11, i12, floatValue));
                raVar2.requestLayout();
            }
        });
        raVar.d.setDuration(200L);
        raVar.d.setInterpolator(org.telegram.ui.Components.tr.h);
        raVar.d.start();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        Integer num = this.f39957c;
        if (num != null) {
            i11 = View.MeasureSpec.makeMeasureSpec(num.intValue(), 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
