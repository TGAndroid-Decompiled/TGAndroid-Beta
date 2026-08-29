package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
public final class w6 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public q6 f43843a;
    public final org.telegram.ui.ActionBar.c6 f43844b;
    public final TextView f43845c;
    public final org.telegram.ui.Components.o6 d;
    public final org.telegram.ui.Components.t9 f43846e;
    public boolean f43847f;
    public boolean h;
    public org.telegram.ui.Components.hp f43848n;

    public w6(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        int i10;
        int i11;
        float f9;
        float f10;
        int i12;
        int i13;
        float f11;
        float f12;
        this.f43844b = c6Var;
        TextView textView = new TextView(context);
        this.f43845c = textView;
        textView.setSingleLine();
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i14 = i11 | 48;
        if (z10) {
            f9 = 21.0f;
        } else {
            f9 = 72.0f;
        }
        if (z10) {
            f10 = 72.0f;
        } else {
            f10 = 21.0f;
        }
        addView(textView, i7.f6.d(-1, -1.0f, i14, f9, 0.0f, f10, 0.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, true, true, !LocaleController.isRTL);
        this.d = o6Var;
        o6Var.b(0.55f, 320L, org.telegram.ui.Components.jr.h);
        o6Var.setTextSize(AndroidUtilities.dp(16.0f));
        if (LocaleController.isRTL) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        o6Var.setGravity(i12 | 16);
        o6Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.I6, c6Var));
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i13 = 3;
        } else {
            i13 = 5;
        }
        int i15 = i13 | 48;
        if (z11) {
            f11 = 21.0f;
        } else {
            f11 = 72.0f;
        }
        if (z11) {
            f12 = 72.0f;
        } else {
            f12 = 21.0f;
        }
        addView(o6Var, i7.f6.d(-2, -1.0f, i15, f11, 0.0f, f12, 0.0f));
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
        this.f43846e = t9Var;
        t9Var.getAvatarDrawable().f27964p = 0.8f;
        addView(t9Var, i7.f6.d(38, 38.0f, (LocaleController.isRTL ? 5 : 3) | 16, 17.0f, 0.0f, 17.0f, 0.0f));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TextView textView;
        if (i10 == NotificationCenter.emojiLoaded && (textView = this.f43845c) != null) {
            textView.invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float dp;
        int i10;
        super.dispatchDraw(canvas);
        if (this.f43847f) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(72.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(72.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.g6.f23183k0);
        }
    }

    public org.telegram.ui.Components.t9 getImageView() {
        return this.f43846e;
    }

    public TextView getTextView() {
        return this.f43845c;
    }

    public org.telegram.ui.Components.o6 getValueTextView() {
        return this.d;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) this.f43845c.getText());
        org.telegram.ui.Components.o6 o6Var = this.d;
        if (o6Var != null && o6Var.getVisibility() == 0) {
            str = "\n" + ((Object) o6Var.getText());
        } else {
            str = "";
        }
        sb2.append(str);
        accessibilityNodeInfo.setText(sb2.toString());
        accessibilityNodeInfo.setEnabled(isEnabled());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(50.0f) + (this.f43847f ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - AndroidUtilities.dp(34.0f);
        int i12 = measuredWidth / 2;
        org.telegram.ui.Components.t9 t9Var = this.f43846e;
        if (t9Var.getVisibility() == 0) {
            t9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(38.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(38.0f), 1073741824));
        }
        org.telegram.ui.Components.o6 o6Var = this.d;
        if (o6Var.getVisibility() == 0) {
            o6Var.measure(View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            measuredWidth = (measuredWidth - o6Var.getMeasuredWidth()) - AndroidUtilities.dp(8.0f);
        }
        int dp = AndroidUtilities.dp(12.0f) + o6Var.getMeasuredWidth();
        boolean z10 = LocaleController.isRTL;
        TextView textView = this.f43845c;
        if (z10) {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = dp;
        } else {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = dp;
        }
        textView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth - dp, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        org.telegram.ui.Components.hp hpVar = this.f43848n;
        if (hpVar != null) {
            hpVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
        }
    }

    public void setCanDisable(boolean z10) {
        this.h = z10;
    }

    @Override
    public void setEnabled(boolean z10) {
        float f9;
        super.setEnabled(z10);
        float f10 = 1.0f;
        if (!z10 && this.h) {
            f9 = 0.5f;
        } else {
            f9 = 1.0f;
        }
        this.f43845c.setAlpha(f9);
        org.telegram.ui.Components.o6 o6Var = this.d;
        if (o6Var.getVisibility() == 0) {
            if (!z10 && this.h) {
                f10 = 0.5f;
            }
            o6Var.setAlpha(f10);
        }
    }

    public void setTextColor(int i10) {
        this.f43845c.setTextColor(i10);
    }

    public void setTextValueColor(int i10) {
        this.d.setTextColor(i10);
    }
}
