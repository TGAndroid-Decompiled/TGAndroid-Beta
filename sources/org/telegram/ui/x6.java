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
    public r6 f44378a;
    public final org.telegram.ui.ActionBar.b6 f44379b;
    public final TextView f44380c;
    public final org.telegram.ui.Components.j6 d;
    public final org.telegram.ui.Components.o9 f44381e;
    public boolean f44382f;
    public boolean h;
    public org.telegram.ui.Components.dp f44383n;

    public x6(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        int i9;
        int i10;
        float f10;
        float f11;
        int i11;
        int i12;
        float f12;
        float f13;
        this.f44379b = b6Var;
        TextView textView = new TextView(context);
        this.f44380c = textView;
        textView.setSingleLine();
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (LocaleController.isRTL) {
            i9 = 5;
        } else {
            i9 = 3;
        }
        textView.setGravity(i9 | 16);
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var));
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i13 = i10 | 48;
        if (z10) {
            f10 = 21.0f;
        } else {
            f10 = 72.0f;
        }
        if (z10) {
            f11 = 72.0f;
        } else {
            f11 = 21.0f;
        }
        addView(textView, g7.e6.d(-1, -1.0f, i13, f10, 0.0f, f11, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, true, true, !LocaleController.isRTL);
        this.d = j6Var;
        j6Var.b(0.55f, 320L, org.telegram.ui.Components.gr.h);
        j6Var.setTextSize(AndroidUtilities.dp(16.0f));
        if (LocaleController.isRTL) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        j6Var.setGravity(i11 | 16);
        j6Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.I6, b6Var));
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        int i14 = i12 | 48;
        if (z11) {
            f12 = 21.0f;
        } else {
            f12 = 72.0f;
        }
        if (z11) {
            f13 = 72.0f;
        } else {
            f13 = 21.0f;
        }
        addView(j6Var, g7.e6.d(-2, -1.0f, i14, f12, 0.0f, f13, 0.0f));
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
        this.f44381e = o9Var;
        o9Var.getAvatarDrawable().f35234p = 0.8f;
        addView(o9Var, g7.e6.d(38, 38.0f, (LocaleController.isRTL ? 5 : 3) | 16, 17.0f, 0.0f, 17.0f, 0.0f));
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        TextView textView;
        if (i9 == NotificationCenter.emojiLoaded && (textView = this.f44380c) != null) {
            textView.invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float dp;
        int i9;
        super.dispatchDraw(canvas);
        if (this.f44382f) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(72.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i9 = AndroidUtilities.dp(72.0f);
            } else {
                i9 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i9, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.f6.f23121k0);
        }
    }

    public org.telegram.ui.Components.o9 getImageView() {
        return this.f44381e;
    }

    public TextView getTextView() {
        return this.f44380c;
    }

    public org.telegram.ui.Components.j6 getValueTextView() {
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
        sb2.append((Object) this.f44380c.getText());
        org.telegram.ui.Components.j6 j6Var = this.d;
        if (j6Var != null && j6Var.getVisibility() == 0) {
            str = "\n" + ((Object) j6Var.getText());
        } else {
            str = "";
        }
        sb2.append(str);
        accessibilityNodeInfo.setText(sb2.toString());
        accessibilityNodeInfo.setEnabled(isEnabled());
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i9), AndroidUtilities.dp(50.0f) + (this.f44382f ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - AndroidUtilities.dp(34.0f);
        int i11 = measuredWidth / 2;
        org.telegram.ui.Components.o9 o9Var = this.f44381e;
        if (o9Var.getVisibility() == 0) {
            o9Var.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(38.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(38.0f), 1073741824));
        }
        org.telegram.ui.Components.j6 j6Var = this.d;
        if (j6Var.getVisibility() == 0) {
            j6Var.measure(View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            measuredWidth = (measuredWidth - j6Var.getMeasuredWidth()) - AndroidUtilities.dp(8.0f);
        }
        int dp = AndroidUtilities.dp(12.0f) + j6Var.getMeasuredWidth();
        boolean z10 = LocaleController.isRTL;
        TextView textView = this.f44380c;
        if (z10) {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = dp;
        } else {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = dp;
        }
        textView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth - dp, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        org.telegram.ui.Components.dp dpVar = this.f44383n;
        if (dpVar != null) {
            dpVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(24.0f), 1073741824));
        }
    }

    public void setCanDisable(boolean z10) {
        this.h = z10;
    }

    @Override
    public void setEnabled(boolean z10) {
        float f10;
        super.setEnabled(z10);
        float f11 = 1.0f;
        if (!z10 && this.h) {
            f10 = 0.5f;
        } else {
            f10 = 1.0f;
        }
        this.f44380c.setAlpha(f10);
        org.telegram.ui.Components.j6 j6Var = this.d;
        if (j6Var.getVisibility() == 0) {
            if (!z10 && this.h) {
                f11 = 0.5f;
            }
            j6Var.setAlpha(f11);
        }
    }

    public void setTextColor(int i9) {
        this.f44380c.setTextColor(i9);
    }

    public void setTextValueColor(int i9) {
        this.d.setTextColor(i9);
    }
}
