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
public final class x6 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public r6 f43831a;
    public final org.telegram.ui.ActionBar.e6 f43832b;
    public final TextView f43833c;
    public final org.telegram.ui.Components.r6 d;
    public final org.telegram.ui.Components.y9 f43834e;
    public boolean f43835f;
    public boolean h;
    public org.telegram.ui.Components.dq f43836n;

    public x6(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i10;
        int i11;
        float f7;
        float f10;
        int i12;
        int i13;
        float f11;
        float f12;
        this.f43832b = e6Var;
        TextView textView = new TextView(context);
        this.f43833c = textView;
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
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var));
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
        addView(textView, w7.x5.a(-1.0f, f7, 0.0f, f10, 0.0f, -1, i14));
        org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(context, true, true, !LocaleController.isRTL);
        this.d = r6Var;
        r6Var.b(0.55f, 320L, org.telegram.ui.Components.hs.h);
        r6Var.setTextSize(AndroidUtilities.dp(16.0f));
        if (LocaleController.isRTL) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        r6Var.setGravity(i12 | 16);
        r6Var.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.I6, e6Var));
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
        addView(r6Var, w7.x5.a(-1.0f, f11, 0.0f, f12, 0.0f, -2, i15));
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
        this.f43834e = y9Var;
        y9Var.getAvatarDrawable().f27652p = 0.8f;
        addView(y9Var, w7.x5.a(38.0f, 17.0f, 0.0f, 17.0f, 0.0f, 38, (LocaleController.isRTL ? 5 : 3) | 16));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TextView textView;
        if (i10 == NotificationCenter.emojiLoaded && (textView = this.f43833c) != null) {
            textView.invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float dp;
        int i10;
        super.dispatchDraw(canvas);
        if (this.f43835f) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(72.0f);
            }
            float f7 = dp;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(72.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.i6.f20919k0);
        }
    }

    public org.telegram.ui.Components.y9 getImageView() {
        return this.f43834e;
    }

    public TextView getTextView() {
        return this.f43833c;
    }

    public org.telegram.ui.Components.r6 getValueTextView() {
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
        sb2.append((Object) this.f43833c.getText());
        org.telegram.ui.Components.r6 r6Var = this.d;
        if (r6Var != null && r6Var.getVisibility() == 0) {
            str = "\n" + ((Object) r6Var.getText());
        } else {
            str = "";
        }
        sb2.append(str);
        accessibilityNodeInfo.setText(sb2.toString());
        accessibilityNodeInfo.setEnabled(isEnabled());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(50.0f) + (this.f43835f ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - AndroidUtilities.dp(34.0f);
        int i12 = measuredWidth / 2;
        org.telegram.ui.Components.y9 y9Var = this.f43834e;
        if (y9Var.getVisibility() == 0) {
            y9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(38.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(38.0f), 1073741824));
        }
        org.telegram.ui.Components.r6 r6Var = this.d;
        if (r6Var.getVisibility() == 0) {
            r6Var.measure(View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            measuredWidth = (measuredWidth - r6Var.getMeasuredWidth()) - AndroidUtilities.dp(8.0f);
        }
        int dp = AndroidUtilities.dp(12.0f) + r6Var.getMeasuredWidth();
        boolean z10 = LocaleController.isRTL;
        TextView textView = this.f43833c;
        if (z10) {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = dp;
        } else {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = dp;
        }
        textView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth - dp, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        org.telegram.ui.Components.dq dqVar = this.f43836n;
        if (dqVar != null) {
            dqVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
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
        this.f43833c.setAlpha(f7);
        org.telegram.ui.Components.r6 r6Var = this.d;
        if (r6Var.getVisibility() == 0) {
            if (!z10 && this.h) {
                f10 = 0.5f;
            }
            r6Var.setAlpha(f10);
        }
    }

    public void setTextColor(int i10) {
        this.f43833c.setTextColor(i10);
    }

    public void setTextValueColor(int i10) {
        this.d.setTextColor(i10);
    }
}
