package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class x6 extends FrameLayout implements org.telegram.messenger.ls {
    public s6 f51538a;
    public final org.telegram.ui.ActionBar.h6 f51539b;
    public final TextView f51540c;
    public final org.telegram.ui.Components.i6 d;
    public final org.telegram.ui.Components.k9 f51541e;
    public boolean f51542f;
    public boolean h;
    public org.telegram.ui.Components.wo f51543n;

    public x6(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        int i7;
        int i10;
        float f10;
        float f11;
        int i11;
        int i12;
        float f12;
        float f13;
        this.f51539b = h6Var;
        TextView textView = new TextView(context);
        this.f51540c = textView;
        textView.setSingleLine();
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (org.telegram.messenger.id.f23161a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView.setGravity(i7 | 16);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, h6Var);
        boolean z9 = org.telegram.messenger.id.f23161a0;
        if (z9) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        int i13 = i10 | 48;
        if (z9) {
            f10 = 21.0f;
        } else {
            f10 = 72.0f;
        }
        if (z9) {
            f11 = 72.0f;
        } else {
            f11 = 21.0f;
        }
        addView(textView, c8.ha.d(-1, -1.0f, i13, f10, 0.0f, f11, 0.0f));
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(context, true, true, !org.telegram.messenger.id.f23161a0);
        this.d = i6Var;
        i6Var.b(0.55f, 320L, org.telegram.ui.Components.wq.h);
        i6Var.setTextSize(org.telegram.messenger.g0.L(16.0f));
        if (org.telegram.messenger.id.f23161a0) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        i6Var.setGravity(i11 | 16);
        org.telegram.ui.ActionBar.t6.Y(i6Var, org.telegram.ui.ActionBar.m6.I6, h6Var);
        boolean z10 = org.telegram.messenger.id.f23161a0;
        if (z10) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        int i14 = i12 | 48;
        if (z10) {
            f12 = 21.0f;
        } else {
            f12 = 72.0f;
        }
        if (z10) {
            f13 = 72.0f;
        } else {
            f13 = 21.0f;
        }
        addView(i6Var, c8.ha.d(-2, -1.0f, i14, f12, 0.0f, f13, 0.0f));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        this.f51541e = k9Var;
        k9Var.getAvatarDrawable().f38925p = 0.8f;
        addView(k9Var, c8.ha.d(38, 38.0f, (org.telegram.messenger.id.f23161a0 ? 5 : 3) | 16, 17.0f, 0.0f, 17.0f, 0.0f));
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TextView textView;
        if (i7 == org.telegram.messenger.qs.f25022i4 && (textView = this.f51540c) != null) {
            textView.invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float L;
        int i7;
        super.dispatchDraw(canvas);
        if (this.f51542f) {
            if (org.telegram.messenger.id.f23161a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(72.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (org.telegram.messenger.id.f23161a0) {
                i7 = org.telegram.messenger.g0.L(72.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.f28013k0);
        }
    }

    public org.telegram.ui.Components.k9 getImageView() {
        return this.f51541e;
    }

    public TextView getTextView() {
        return this.f51540c;
    }

    public org.telegram.ui.Components.i6 getValueTextView() {
        return this.d;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25022i4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25022i4);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) this.f51540c.getText());
        org.telegram.ui.Components.i6 i6Var = this.d;
        if (i6Var != null && i6Var.getVisibility() == 0) {
            str = "\n" + ((Object) i6Var.getText());
        } else {
            str = "";
        }
        sb2.append(str);
        accessibilityNodeInfo.setText(sb2.toString());
        accessibilityNodeInfo.setEnabled(isEnabled());
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(50.0f) + (this.f51542f ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - org.telegram.messenger.g0.L(34.0f);
        int i11 = measuredWidth / 2;
        org.telegram.ui.Components.k9 k9Var = this.f51541e;
        if (k9Var.getVisibility() == 0) {
            k9Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(38.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(38.0f), 1073741824));
        }
        org.telegram.ui.Components.i6 i6Var = this.d;
        if (i6Var.getVisibility() == 0) {
            i6Var.measure(View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            measuredWidth = (measuredWidth - i6Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(8.0f);
        }
        int L = org.telegram.messenger.g0.L(12.0f) + i6Var.getMeasuredWidth();
        boolean z9 = org.telegram.messenger.id.f23161a0;
        TextView textView = this.f51540c;
        if (z9) {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = L;
        } else {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = L;
        }
        textView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth - L, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        org.telegram.ui.Components.wo woVar = this.f51543n;
        if (woVar != null) {
            woVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), 1073741824));
        }
    }

    public void setCanDisable(boolean z9) {
        this.h = z9;
    }

    @Override
    public void setEnabled(boolean z9) {
        float f10;
        super.setEnabled(z9);
        float f11 = 1.0f;
        if (!z9 && this.h) {
            f10 = 0.5f;
        } else {
            f10 = 1.0f;
        }
        this.f51540c.setAlpha(f10);
        org.telegram.ui.Components.i6 i6Var = this.d;
        if (i6Var.getVisibility() == 0) {
            if (!z9 && this.h) {
                f11 = 0.5f;
            }
            i6Var.setAlpha(f11);
        }
    }

    public void setTextColor(int i7) {
        this.f51540c.setTextColor(i7);
    }

    public void setTextValueColor(int i7) {
        this.d.setTextColor(i7);
    }
}
