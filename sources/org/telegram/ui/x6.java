package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class x6 extends FrameLayout implements org.telegram.messenger.us {
    public s6 f43447a;
    public final org.telegram.ui.ActionBar.p6 f43448b;
    public final TextView f43449c;
    public final org.telegram.ui.Components.f6 d;
    public final org.telegram.ui.Components.g9 e;
    public boolean f43450f;
    public boolean h;
    public org.telegram.ui.Components.ep f43451n;

    public x6(Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context);
        int i10;
        int i11;
        float f7;
        float f10;
        int i12;
        int i13;
        float f11;
        float f12;
        this.f43448b = p6Var;
        TextView textView = new TextView(context);
        this.f43449c = textView;
        textView.setSingleLine();
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setTextSize(1, 16.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (org.telegram.messenger.cd.X) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.G6, p6Var);
        boolean z10 = org.telegram.messenger.cd.X;
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
        addView(textView, w7.b6.d(-1, -1.0f, i14, f7, 0.0f, f10, 0.0f));
        org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(context, true, true, !org.telegram.messenger.cd.X);
        this.d = f6Var;
        f6Var.b(0.55f, 320L, org.telegram.ui.Components.gr.h);
        f6Var.setTextSize(org.telegram.messenger.i0.L(16.0f));
        if (org.telegram.messenger.cd.X) {
            i12 = 3;
        } else {
            i12 = 5;
        }
        f6Var.setGravity(i12 | 16);
        org.telegram.ui.ActionBar.a7.Z(f6Var, org.telegram.ui.ActionBar.t6.I6, p6Var);
        boolean z11 = org.telegram.messenger.cd.X;
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
        addView(f6Var, w7.b6.d(-2, -1.0f, i15, f11, 0.0f, f12, 0.0f));
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        this.e = g9Var;
        g9Var.getAvatarDrawable().f29871p = 0.8f;
        addView(g9Var, w7.b6.d(38, 38.0f, (org.telegram.messenger.cd.X ? 5 : 3) | 16, 17.0f, 0.0f, 17.0f, 0.0f));
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        TextView textView;
        if (i10 == org.telegram.messenger.zs.f19630i4 && (textView = this.f43449c) != null) {
            textView.invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float L;
        int i10;
        super.dispatchDraw(canvas);
        if (this.f43450f) {
            if (org.telegram.messenger.cd.X) {
                L = 0.0f;
            } else {
                L = org.telegram.messenger.i0.L(72.0f);
            }
            float f7 = L;
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (org.telegram.messenger.cd.X) {
                i10 = org.telegram.messenger.i0.L(72.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(f7, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.t6.f21052k0);
        }
    }

    public org.telegram.ui.Components.g9 getImageView() {
        return this.e;
    }

    public TextView getTextView() {
        return this.f43449c;
    }

    public org.telegram.ui.Components.f6 getValueTextView() {
        return this.d;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.f19630i4);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.f19630i4);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) this.f43449c.getText());
        org.telegram.ui.Components.f6 f6Var = this.d;
        if (f6Var != null && f6Var.getVisibility() == 0) {
            str = "\n" + ((Object) f6Var.getText());
        } else {
            str = "";
        }
        sb2.append(str);
        accessibilityNodeInfo.setText(sb2.toString());
        accessibilityNodeInfo.setEnabled(isEnabled());
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(50.0f) + (this.f43450f ? 1 : 0));
        int measuredWidth = ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - org.telegram.messenger.i0.L(34.0f);
        int i12 = measuredWidth / 2;
        org.telegram.ui.Components.g9 g9Var = this.e;
        if (g9Var.getVisibility() == 0) {
            g9Var.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(38.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(38.0f), 1073741824));
        }
        org.telegram.ui.Components.f6 f6Var = this.d;
        if (f6Var.getVisibility() == 0) {
            f6Var.measure(View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            measuredWidth = (measuredWidth - f6Var.getMeasuredWidth()) - org.telegram.messenger.i0.L(8.0f);
        }
        int L = org.telegram.messenger.i0.L(12.0f) + f6Var.getMeasuredWidth();
        boolean z10 = org.telegram.messenger.cd.X;
        TextView textView = this.f43449c;
        if (z10) {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).leftMargin = L;
        } else {
            ((ViewGroup.MarginLayoutParams) textView.getLayoutParams()).rightMargin = L;
        }
        textView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth - L, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
        org.telegram.ui.Components.ep epVar = this.f43451n;
        if (epVar != null) {
            epVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(24.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(24.0f), 1073741824));
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
        this.f43449c.setAlpha(f7);
        org.telegram.ui.Components.f6 f6Var = this.d;
        if (f6Var.getVisibility() == 0) {
            if (!z10 && this.h) {
                f10 = 0.5f;
            }
            f6Var.setAlpha(f10);
        }
    }

    public void setTextColor(int i10) {
        this.f43449c.setTextColor(i10);
    }

    public void setTextValueColor(int i10) {
        this.d.setTextColor(i10);
    }
}
