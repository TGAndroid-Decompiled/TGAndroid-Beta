package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class w6 extends FrameLayout implements org.telegram.messenger.fs {
    public r6 f52979a;
    public final org.telegram.ui.ActionBar.h6 f52980b;
    public final TextView f52981c;
    public final org.telegram.ui.Components.o6 d;
    public final org.telegram.ui.Components.q9 f52982e;
    public boolean f52983f;
    public boolean h;
    public org.telegram.ui.Components.op f52984n;

    public w6(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        int i7;
        int i10;
        float f10;
        float f11;
        int i11;
        int i12;
        float f12;
        float f13;
        this.f52980b = h6Var;
        TextView textView = new TextView(context);
        this.f52981c = textView;
        textView.setSingleLine();
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (org.telegram.messenger.gd.f24241a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        textView.setGravity(i7 | 16);
        org.telegram.ui.ActionBar.t6.U(textView, org.telegram.ui.ActionBar.m6.G6, h6Var);
        boolean z10 = org.telegram.messenger.gd.f24241a0;
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
        addView(textView, c8.ma.d(-1, -1.0f, i13, f10, 0.0f, f11, 0.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, true, true, !org.telegram.messenger.gd.f24241a0);
        this.d = o6Var;
        o6Var.b(0.55f, 320L, org.telegram.ui.Components.nr.h);
        o6Var.setTextSize(org.telegram.messenger.g0.L(16.0f));
        if (org.telegram.messenger.gd.f24241a0) {
            i11 = 3;
        } else {
            i11 = 5;
        }
        o6Var.setGravity(i11 | 16);
        org.telegram.ui.ActionBar.t6.Y(o6Var, org.telegram.ui.ActionBar.m6.I6, h6Var);
        boolean z11 = org.telegram.messenger.gd.f24241a0;
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
        addView(o6Var, c8.ma.d(-2, -1.0f, i14, f12, 0.0f, f13, 0.0f));
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        this.f52982e = q9Var;
        q9Var.getAvatarDrawable().f33809p = 0.8f;
        addView(q9Var, c8.ma.d(38, 38.0f, (org.telegram.messenger.gd.f24241a0 ? 5 : 3) | 16, 17.0f, 0.0f, 17.0f, 0.0f));
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        TextView textView;
        if (i7 == org.telegram.messenger.ks.f25176l4 && (textView = this.f52981c) != null) {
            textView.invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float L;
        int i7;
        super.dispatchDraw(canvas);
        if (this.f52983f) {
            if (org.telegram.messenger.gd.f24241a0) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.g0.L(72.0f);
            }
            float f10 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (org.telegram.messenger.gd.f24241a0) {
                i7 = org.telegram.messenger.g0.L(72.0f);
            } else {
                i7 = 0;
            }
            canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.m6.f29501k0);
        }
    }

    public org.telegram.ui.Components.q9 getImageView() {
        return this.f52982e;
    }

    public TextView getTextView() {
        return this.f52981c;
    }

    public org.telegram.ui.Components.o6 getValueTextView() {
        return this.d;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25176l4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25176l4);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) this.f52981c.getText());
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
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(50.0f) + (this.f52983f ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - org.telegram.messenger.g0.L(34.0f);
        int i11 = measuredWidth / 2;
        org.telegram.ui.Components.q9 q9Var = this.f52982e;
        if (q9Var.getVisibility() == 0) {
            q9Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(38.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(38.0f), 1073741824));
        }
        org.telegram.ui.Components.o6 o6Var = this.d;
        if (o6Var.getVisibility() == 0) {
            o6Var.measure(View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            measuredWidth = (measuredWidth - o6Var.getMeasuredWidth()) - org.telegram.messenger.g0.L(8.0f);
        }
        int L = org.telegram.messenger.g0.L(12.0f) + o6Var.getMeasuredWidth();
        boolean z10 = org.telegram.messenger.gd.f24241a0;
        TextView textView = this.f52981c;
        if (z10) {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = L;
        } else {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = L;
        }
        textView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth - L, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        org.telegram.ui.Components.op opVar = this.f52984n;
        if (opVar != null) {
            opVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(24.0f), 1073741824));
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
        this.f52981c.setAlpha(f10);
        org.telegram.ui.Components.o6 o6Var = this.d;
        if (o6Var.getVisibility() == 0) {
            if (!z10 && this.h) {
                f11 = 0.5f;
            }
            o6Var.setAlpha(f11);
        }
    }

    public void setTextColor(int i7) {
        this.f52981c.setTextColor(i7);
    }

    public void setTextValueColor(int i7) {
        this.d.setTextColor(i7);
    }
}
