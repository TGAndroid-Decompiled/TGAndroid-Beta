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
public final class sa extends FrameLayout {
    public final org.telegram.ui.Components.z90 f43433a;
    public final org.telegram.ui.Cells.w1 f43434b;
    public Integer f43435c;
    public ValueAnimator d;
    public final ta e;

    public sa(ta taVar, Activity activity) {
        super(activity);
        int i10;
        this.e = taVar;
        taVar.F = this;
        setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(17.0f));
        setClipChildren(false);
        org.telegram.ui.Components.z90 z90Var = new org.telegram.ui.Components.z90(activity, null);
        this.f43433a = z90Var;
        z90Var.setTextSize(1, 15.0f);
        int i11 = org.telegram.ui.ActionBar.y6.F6;
        org.telegram.ui.ActionBar.f7.V(z90Var, i11, null);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        z90Var.setGravity(i10);
        int i12 = org.telegram.ui.ActionBar.y6.J6;
        org.telegram.ui.ActionBar.f7.H(z90Var, i12, null);
        int i13 = org.telegram.ui.ActionBar.y6.K6;
        org.telegram.ui.ActionBar.f7.D(z90Var, i13, null);
        z90Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        org.telegram.ui.Cells.w1 w1Var = new org.telegram.ui.Cells.w1(this, activity, 2);
        taVar.G = w1Var;
        this.f43434b = w1Var;
        w1Var.setTextSize(1, 15.0f);
        org.telegram.ui.ActionBar.f7.V(w1Var, i11, null);
        w1Var.setGravity(LocaleController.isRTL ? 5 : 3);
        org.telegram.ui.ActionBar.f7.H(w1Var, i12, null);
        org.telegram.ui.ActionBar.f7.D(w1Var, i13, null);
        w1Var.setPadding(AndroidUtilities.dp(3.0f), 0, AndroidUtilities.dp(3.0f), 0);
        addView(z90Var, org.telegram.ui.Components.gb1.i(-1, -2, 48));
        addView(w1Var, org.telegram.ui.Components.gb1.i(-1, -2, 48));
        if (taVar.f43715x != 0) {
            String string = LocaleController.getString(R.string.BotUsernameHelp);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            int indexOf = string.indexOf(42);
            int lastIndexOf = string.lastIndexOf(42);
            if (indexOf != -1 && lastIndexOf != -1 && indexOf != lastIndexOf) {
                spannableStringBuilder.replace(lastIndexOf, lastIndexOf + 1, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) "");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.x61("https://fragment.com", (org.telegram.ui.Components.y11) null), indexOf, lastIndexOf - 1, 33);
            }
            z90Var.setText(spannableStringBuilder);
            return;
        }
        d3.s(R.string.UsernameHelp, z90Var);
    }

    public static void a(final sa saVar) {
        int intValue;
        int i10;
        float f7;
        org.telegram.ui.Components.z90 z90Var = saVar.f43433a;
        org.telegram.ui.Cells.w1 w1Var = saVar.f43434b;
        if (w1Var.getVisibility() == 0) {
            w1Var.measure(View.MeasureSpec.makeMeasureSpec((saVar.getMeasuredWidth() - saVar.getPaddingLeft()) - saVar.getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec(9999999, Integer.MIN_VALUE));
        }
        ValueAnimator valueAnimator = saVar.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        Integer num = saVar.f43435c;
        if (num == null) {
            intValue = saVar.getMeasuredHeight();
        } else {
            intValue = num.intValue();
        }
        final int i11 = intValue;
        int height = z90Var.getHeight() + AndroidUtilities.dp(27.0f);
        if (w1Var.getVisibility() == 0 && !TextUtils.isEmpty(w1Var.getText())) {
            i10 = AndroidUtilities.dp(8.0f) + w1Var.getMeasuredHeight();
        } else {
            i10 = 0;
        }
        final int i12 = height + i10;
        final float translationY = z90Var.getTranslationY();
        if (w1Var.getVisibility() == 0 && !TextUtils.isEmpty(w1Var.getText())) {
            f7 = AndroidUtilities.dp(8.0f) + w1Var.getMeasuredHeight();
        } else {
            f7 = 0.0f;
        }
        final float f10 = f7;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        saVar.d = ofFloat;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                sa saVar2 = sa.this;
                saVar2.getClass();
                float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                saVar2.f43433a.setTranslationY(AndroidUtilities.lerp(translationY, f10, floatValue));
                saVar2.f43435c = Integer.valueOf(AndroidUtilities.lerp(i11, i12, floatValue));
                saVar2.requestLayout();
            }
        });
        saVar.d.setDuration(200L);
        saVar.d.setInterpolator(org.telegram.ui.Components.ds.h);
        saVar.d.start();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        Integer num = this.f43435c;
        if (num != null) {
            i11 = View.MeasureSpec.makeMeasureSpec(num.intValue(), 1073741824);
        }
        super.onMeasure(i10, i11);
    }
}
