package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class y6 extends FrameLayout implements org.telegram.messenger.cs {
    public t6 f52205a;
    public final org.telegram.ui.ActionBar.e6 f52206b;
    public final TextView f52207c;
    public final org.telegram.ui.Components.h6 d;
    public final org.telegram.ui.Components.k9 f52208e;
    public boolean f52209f;
    public boolean h;
    public org.telegram.ui.Components.wo f52210n;

    public y6(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        int i3;
        int i10;
        float f10;
        float f11;
        int i11;
        int i12;
        float f12;
        float f13;
        this.f52206b = e6Var;
        TextView textView = new TextView(context);
        this.f52207c = textView;
        textView.setSingleLine();
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (org.telegram.messenger.bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        textView.setGravity(i3 | 16);
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, e6Var);
        boolean z10 = org.telegram.messenger.bd.f21784a0;
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
        addView(textView, b8.mf.d(-1, -1.0f, i13, f10, 0.0f, f11, 0.0f));
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(context, true, true, !org.telegram.messenger.bd.f21784a0);
        this.d = h6Var;
        h6Var.b(0.55f, 320L, org.telegram.ui.Components.xq.h);
        h6Var.setTextSize(org.telegram.messenger.g0.L(16.0f));
        if (org.telegram.messenger.bd.f21784a0) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        h6Var.setGravity(i11 | 16);
        org.telegram.ui.ActionBar.r6.Z(h6Var, org.telegram.ui.ActionBar.k6.I6, e6Var);
        boolean z11 = org.telegram.messenger.bd.f21784a0;
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
        addView(h6Var, b8.mf.d(-2, -1.0f, i14, f12, 0.0f, f13, 0.0f));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f52208e = k9Var;
        k9Var.getAvatarDrawable().f38691p = 0.8f;
        addView(k9Var, b8.mf.d(38, 38.0f, (org.telegram.messenger.bd.f21784a0 ? 5 : 3) | 16, 17.0f, 0.0f, 17.0f, 0.0f));
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        TextView textView;
        if (i3 == org.telegram.messenger.hs.f23246i4 && (textView = this.f52207c) != null) {
            textView.invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float L;
        int i3;
        super.dispatchDraw(canvas);
        if (this.f52209f) {
            if (org.telegram.messenger.bd.f21784a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(72.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (org.telegram.messenger.bd.f21784a0) {
                i3 = org.telegram.messenger.g0.L(72.0f);
            } else {
                i3 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i3, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
        }
    }

    public org.telegram.ui.Components.k9 getImageView() {
        return this.f52208e;
    }

    public TextView getTextView() {
        return this.f52207c;
    }

    public org.telegram.ui.Components.h6 getValueTextView() {
        return this.d;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23246i4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23246i4);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) this.f52207c.getText());
        org.telegram.ui.Components.h6 h6Var = this.d;
        if (h6Var != null && h6Var.getVisibility() == 0) {
            str = "\n" + ((Object) h6Var.getText());
        } else {
            str = "";
        }
        sb2.append(str);
        accessibilityNodeInfo.setText(sb2.toString());
        accessibilityNodeInfo.setEnabled(isEnabled());
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.messenger.g0.L(50.0f) + (this.f52209f ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - org.telegram.messenger.g0.L(34.0f);
        int i11 = measuredWidth / 2;
        org.telegram.ui.Components.k9 k9Var = this.f52208e;
        if (k9Var.getVisibility() == 0) {
            k9Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(38.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(38.0f), 1073741824));
        }
        org.telegram.ui.Components.h6 h6Var = this.d;
        if (h6Var.getVisibility() == 0) {
            h6Var.measure(View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            measuredWidth = (measuredWidth - h6Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(8.0f);
        }
        int L = org.telegram.messenger.g0.L(12.0f) + h6Var.getMeasuredWidth();
        boolean z10 = org.telegram.messenger.bd.f21784a0;
        TextView textView = this.f52207c;
        if (z10) {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = L;
        } else {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = L;
        }
        textView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth - L, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        org.telegram.ui.Components.wo woVar = this.f52210n;
        if (woVar != null) {
            woVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), 1073741824));
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
        this.f52207c.setAlpha(f10);
        org.telegram.ui.Components.h6 h6Var = this.d;
        if (h6Var.getVisibility() == 0) {
            if (!z10 && this.h) {
                f11 = 0.5f;
            }
            h6Var.setAlpha(f11);
        }
    }

    public void setTextColor(int i3) {
        this.f52207c.setTextColor(i3);
    }

    public void setTextValueColor(int i3) {
        this.d.setTextColor(i3);
    }
}
