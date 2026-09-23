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
public final class y6 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public s6 f39729a;
    public final org.telegram.ui.ActionBar.d6 f39730b;
    public final TextView f39731c;
    public final org.telegram.ui.Components.p6 d;
    public final org.telegram.ui.Components.w9 e;
    public boolean f39732f;
    public boolean h;
    public org.telegram.ui.Components.op f39733n;

    public y6(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        int i10;
        int i11;
        float f7;
        float f10;
        int i12;
        int i13;
        float f11;
        float f12;
        this.f39730b = d6Var;
        TextView textView = new TextView(context);
        this.f39731c = textView;
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
        textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, d6Var));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i14 = i11 | 48;
        if (z10) {
            f7 = 21.0f;
        } else {
            f7 = 72.0f;
        }
        if (z10) {
            f10 = 72.0f;
        } else {
            f10 = 21.0f;
        }
        addView(textView, w7.x5.d(-1, -1.0f, i14, f7, 0.0f, f10, 0.0f));
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, true, true, !LocaleController.isRTL);
        this.d = p6Var;
        p6Var.b(0.55f, 320L, org.telegram.ui.Components.rr.h);
        p6Var.setTextSize(AndroidUtilities.dp(16.0f));
        if (LocaleController.isRTL) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        p6Var.setGravity(i12 | 16);
        p6Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.I6, d6Var));
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
        addView(p6Var, w7.x5.d(-2, -1.0f, i15, f11, 0.0f, f12, 0.0f));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        this.e = w9Var;
        w9Var.getAvatarDrawable().f24590p = 0.8f;
        addView(w9Var, w7.x5.d(38, 38.0f, (LocaleController.isRTL ? 5 : 3) | 16, 17.0f, 0.0f, 17.0f, 0.0f));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TextView textView;
        if (i10 == NotificationCenter.emojiLoaded && (textView = this.f39731c) != null) {
            textView.invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float dp;
        int i10;
        super.dispatchDraw(canvas);
        if (this.f39732f) {
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
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.h6.f18910k0);
        }
    }

    public org.telegram.ui.Components.w9 getImageView() {
        return this.e;
    }

    public TextView getTextView() {
        return this.f39731c;
    }

    public org.telegram.ui.Components.p6 getValueTextView() {
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
        sb2.append((Object) this.f39731c.getText());
        org.telegram.ui.Components.p6 p6Var = this.d;
        if (p6Var != null && p6Var.getVisibility() == 0) {
            str = "\n" + ((Object) p6Var.getText());
        } else {
            str = "";
        }
        sb2.append(str);
        accessibilityNodeInfo.setText(sb2.toString());
        accessibilityNodeInfo.setEnabled(isEnabled());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(50.0f) + (this.f39732f ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - AndroidUtilities.dp(34.0f);
        int i12 = measuredWidth / 2;
        org.telegram.ui.Components.w9 w9Var = this.e;
        if (w9Var.getVisibility() == 0) {
            w9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(38.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(38.0f), 1073741824));
        }
        org.telegram.ui.Components.p6 p6Var = this.d;
        if (p6Var.getVisibility() == 0) {
            p6Var.measure(View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            measuredWidth = (measuredWidth - p6Var.getMeasuredWidth()) - AndroidUtilities.dp(8.0f);
        }
        int dp = AndroidUtilities.dp(12.0f) + p6Var.getMeasuredWidth();
        boolean z10 = LocaleController.isRTL;
        TextView textView = this.f39731c;
        if (z10) {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = dp;
        } else {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = dp;
        }
        textView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth - dp, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        org.telegram.ui.Components.op opVar = this.f39733n;
        if (opVar != null) {
            opVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
        }
    }

    public void setCanDisable(boolean z10) {
        this.h = z10;
    }

    @Override
    public void setEnabled(boolean z10) {
        float f7;
        super.setEnabled(z10);
        float f10 = 1.0f;
        if (!z10 && this.h) {
            f7 = 0.5f;
        } else {
            f7 = 1.0f;
        }
        this.f39731c.setAlpha(f7);
        org.telegram.ui.Components.p6 p6Var = this.d;
        if (p6Var.getVisibility() == 0) {
            if (!z10 && this.h) {
                f10 = 0.5f;
            }
            p6Var.setAlpha(f10);
        }
    }

    public void setTextColor(int i10) {
        this.f39731c.setTextColor(i10);
    }

    public void setTextValueColor(int i10) {
        this.d.setTextColor(i10);
    }
}
