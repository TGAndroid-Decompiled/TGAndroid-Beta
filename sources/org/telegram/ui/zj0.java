package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class zj0 extends FrameLayout implements org.telegram.messenger.x5 {
    public final TextView f52597a;
    public final TextView f52598b;
    public final org.telegram.ui.Components.l9 f52599c;
    public final org.telegram.ui.Components.dh0 d;
    public int f52600e;
    public org.telegram.messenger.ew f52601f;
    public final int h;
    public final bk0 f52602n;

    public zj0(bk0 bk0Var, Activity activity) {
        super(activity);
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        this.f52602n = bk0Var;
        i7 = ((org.telegram.ui.ActionBar.f2) bk0Var).currentAccount;
        this.h = org.telegram.messenger.z5.q(i7).k();
        this.d = new org.telegram.ui.Components.dh0(this);
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(activity);
        this.f52599c = l9Var;
        if (org.telegram.messenger.hd.f22878a0) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        addView(l9Var, c8.ha.d(48, 48.0f, i10 | 48, 21.0f, 8.0f, 21.0f, 0.0f));
        TextView textView = new TextView(activity);
        this.f52597a = textView;
        org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
        org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (org.telegram.messenger.hd.f22878a0) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        textView.setGravity(i11 | 16);
        boolean z9 = org.telegram.messenger.hd.f22878a0;
        if (z9) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        int i17 = i12 | 48;
        if (z9) {
            i13 = 21;
        } else {
            i13 = 81;
        }
        float f10 = i13;
        if (z9) {
            i14 = 81;
        } else {
            i14 = 21;
        }
        addView(textView, c8.ha.d(-2, -2.0f, i17, f10, 10.0f, i14, 0.0f));
        TextView textView2 = new TextView(activity);
        this.f52598b = textView2;
        org.telegram.ui.ActionBar.r6.V(textView2, org.telegram.ui.ActionBar.k6.f28259z6, null);
        textView2.setTextSize(1, 13.0f);
        if (org.telegram.messenger.hd.f22878a0) {
            i15 = 5;
        } else {
            i15 = 3;
        }
        textView2.setGravity(i15);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        boolean z10 = org.telegram.messenger.hd.f22878a0;
        int i18 = (z10 ? 5 : 3) | 48;
        if (z10) {
            i16 = 21;
        } else {
            i16 = 81;
        }
        addView(textView2, c8.ha.d(-2, -2.0f, i18, i16, 35.0f, z10 ? 81 : 21, 0.0f));
        setWillNotDraw(false);
    }

    @Override
    public final void C(boolean z9) {
        a(false);
    }

    @Override
    public final void M(String str) {
        this.d.e(true, 1.0f);
        a(true);
    }

    public final void a(boolean z9) {
        int i7;
        int i10;
        int i11;
        int i12;
        String r10 = org.telegram.messenger.w7.r(null, this.f52601f);
        org.telegram.messenger.w7.G(org.telegram.messenger.p10.f24467s0);
        boolean exists = org.telegram.messenger.w7.I(this.f52601f).exists();
        boolean isEmpty = TextUtils.isEmpty(r10);
        org.telegram.ui.Components.dh0 dh0Var = this.d;
        if (isEmpty) {
            dh0Var.d(null, false, false);
            return;
        }
        org.telegram.messenger.ew ewVar = this.f52601f;
        String str = ewVar.f22267c;
        float f10 = 0.0f;
        bk0 bk0Var = this.f52602n;
        if (str != null) {
            if (ewVar.d != null) {
                i12 = ((org.telegram.ui.ActionBar.f2) bk0Var).currentAccount;
                org.telegram.messenger.z5.q(i12).v(this);
                dh0Var.d(null, false, z9);
                this.f52600e = -1;
                return;
            }
            i11 = ((org.telegram.ui.ActionBar.f2) bk0Var).currentAccount;
            org.telegram.messenger.z5.q(i11).a(this.f52601f.f22267c, null, this);
            this.f52600e = 1;
            Float w10 = org.telegram.messenger.gc.D().w(this.f52601f.f22267c);
            dh0Var.d(getResources().getDrawable(2131231005), true, z9);
            if (w10 != null) {
                f10 = w10.floatValue();
            }
            dh0Var.e(false, f10);
            invalidate();
        } else if (exists) {
            i10 = ((org.telegram.ui.ActionBar.f2) bk0Var).currentAccount;
            org.telegram.messenger.z5.q(i10).v(this);
            this.f52600e = -1;
            dh0Var.d(null, false, z9);
            invalidate();
        } else {
            i7 = ((org.telegram.ui.ActionBar.f2) bk0Var).currentAccount;
            org.telegram.messenger.z5.q(i7).a(r10, null, this);
            this.f52600e = 1;
            Float w11 = org.telegram.messenger.gc.D().w(r10);
            dh0Var.d(getResources().getDrawable(2131231005), true, z9);
            if (w11 != null) {
                f10 = w11.floatValue();
            }
            dh0Var.e(z9, f10);
            invalidate();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        boolean drawChild = super.drawChild(canvas, view, j3);
        if (view == this.f52599c) {
            this.d.a(canvas);
        }
        return drawChild;
    }

    @Override
    public int getObserverTag() {
        return this.h;
    }

    @Override
    public final void i(long j3, long j10) {
        this.d.e(true, Math.min(1.0f, ((float) j3) / ((float) j10)));
        if (this.f52600e != 1) {
            a(false);
        }
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f52597a.invalidate();
    }

    @Override
    public final void o(long j3, long j10) {
        this.d.e(true, Math.min(1.0f, ((float) j3) / ((float) j10)));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float L;
        int i7;
        if (org.telegram.messenger.hd.f22878a0) {
            L = 0.0f;
        } else {
            L = org.telegram.messenger.g0.L(20.0f);
        }
        float f10 = L;
        float measuredHeight = getMeasuredHeight() - 1;
        int measuredWidth = getMeasuredWidth();
        if (org.telegram.messenger.hd.f22878a0) {
            i7 = org.telegram.messenger.g0.L(20.0f);
        } else {
            i7 = 0;
        }
        canvas.drawLine(f10, measuredHeight, measuredWidth - i7, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.k6.f27972k0);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        org.telegram.ui.Components.l9 l9Var = this.f52599c;
        int measuredWidth = ((l9Var.getMeasuredWidth() - org.telegram.messenger.g0.L(24.0f)) / 2) + l9Var.getLeft();
        int measuredHeight = ((l9Var.getMeasuredHeight() - org.telegram.messenger.g0.L(24.0f)) / 2) + l9Var.getTop();
        this.d.f(measuredWidth, measuredHeight, org.telegram.messenger.g0.L(24.0f) + measuredWidth, org.telegram.messenger.g0.L(24.0f) + measuredHeight);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), org.telegram.messenger.camera.q.B(64.0f, 1, 1073741824));
    }

    public void setValue(CharSequence charSequence) {
        this.f52598b.setText(charSequence);
    }
}
