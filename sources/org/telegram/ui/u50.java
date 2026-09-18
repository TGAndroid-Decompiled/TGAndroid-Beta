package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.NotificationCenter;
public final class u50 extends View {
    public final int f37945a;
    public Object f37946b;

    public u50(Context context) {
        super(context);
        this.f37945a = 12;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f37945a) {
            case 0:
                super.dispatchDraw(canvas);
                v50 v50Var = (v50) this.f37946b;
                if (v50Var != null && v50Var.a(canvas, getMeasuredWidth(), 0.0f)) {
                    invalidate();
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f37945a) {
            case 0:
                super.onAttachedToWindow();
                v50 v50Var = (v50) this.f37946b;
                if (v50Var != null) {
                    v50Var.f38297g = this;
                    int i10 = 0;
                    while (true) {
                        x50[] x50VarArr = v50Var.f38295c;
                        if (i10 < x50VarArr.length) {
                            x50 x50Var = x50VarArr[i10];
                            x50Var.f39388i.add(this);
                            x50Var.a();
                            i10++;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            case 12:
                super.onAttachedToWindow();
                xh.n1 n1Var = (xh.n1) this.f37946b;
                if (n1Var != null && !n1Var.f46061i) {
                    n1Var.f46061i = true;
                    n1Var.a();
                    org.telegram.ui.web.b1 b1Var = new org.telegram.ui.web.b1(n1Var, 17);
                    n1Var.h = b1Var;
                    LiteMode.addOnPowerSaverAppliedListener(b1Var);
                    return;
                }
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f37945a) {
            case 0:
                super.onDetachedFromWindow();
                v50 v50Var = (v50) this.f37946b;
                if (v50Var != null && v50Var.f38297g != this) {
                    int i10 = 0;
                    while (true) {
                        x50[] x50VarArr = v50Var.f38295c;
                        if (i10 < x50VarArr.length) {
                            x50 x50Var = x50VarArr[i10];
                            x50Var.f39388i.remove(this);
                            x50Var.a();
                            i10++;
                        } else {
                            v50Var.f38297g = null;
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 12:
                super.onDetachedFromWindow();
                xh.n1 n1Var = (xh.n1) this.f37946b;
                if (n1Var != null && n1Var.f46061i) {
                    n1Var.f46061i = false;
                    n1Var.a();
                    LiteMode.removeOnPowerSaverAppliedListener(n1Var.h);
                    return;
                }
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        int i10;
        switch (this.f37945a) {
            case 1:
                canvas.drawColor(((tj0) this.f37946b).getThemedColor(org.telegram.ui.ActionBar.j6.e7));
                return;
            case 2:
                lq0 lq0Var = (lq0) this.f37946b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, lq0Var.f35607c.size())));
                int ceil = (int) Math.ceil(lq0Var.S.measureText(format));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ceil, AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                lq0Var.S.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.C5, false));
                lq0Var.U.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18934h5, false));
                int i11 = max / 2;
                int i12 = measuredWidth - i11;
                int i13 = i11 + measuredWidth;
                lq0Var.T.set(i12, 0.0f, i13, getMeasuredHeight());
                canvas.drawRoundRect(lq0Var.T, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), lq0Var.U);
                lq0Var.U.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B5, false));
                lq0Var.T.set(AndroidUtilities.dp(2.0f) + i12, AndroidUtilities.dp(2.0f), i13 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(lq0Var.T, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), lq0Var.U);
                canvas.drawText(format, measuredWidth - (ceil / 2), AndroidUtilities.dp(16.2f), lq0Var.S);
                return;
            case 3:
                cr0 cr0Var = (cr0) this.f37946b;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, cr0Var.f32879c.size())));
                int ceil2 = (int) Math.ceil(cr0Var.f32886h0.measureText(format2));
                int max2 = Math.max(AndroidUtilities.dp(16.0f) + ceil2, AndroidUtilities.dp(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                cr0Var.f32886h0.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.C5, false));
                cr0Var.f32888j0.setColor(org.telegram.ui.ActionBar.j6.w0(null, cr0Var.f32901u0, false));
                int i14 = max2 / 2;
                int i15 = measuredWidth2 - i14;
                int i16 = i14 + measuredWidth2;
                cr0Var.f32887i0.set(i15, 0.0f, i16, getMeasuredHeight());
                canvas.drawRoundRect(cr0Var.f32887i0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), cr0Var.f32888j0);
                cr0Var.f32888j0.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B5, false));
                cr0Var.f32887i0.set(AndroidUtilities.dp(2.0f) + i15, AndroidUtilities.dp(2.0f), i16 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(cr0Var.f32887i0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), cr0Var.f32888j0);
                canvas.drawText(format2, measuredWidth2 - (ceil2 / 2), AndroidUtilities.dp(16.2f), cr0Var.f32886h0);
                return;
            case 4:
                ((PhotoViewer) this.f37946b).f31060q3.a(canvas, this);
                return;
            case 5:
            case 6:
            case 9:
            case 10:
            default:
                super.onDraw(canvas);
                return;
            case 7:
                g31 g31Var = (g31) this.f37946b;
                if (g31Var.K) {
                    i10 = -15590870;
                } else {
                    i10 = -6569073;
                }
                canvas.drawColor(i10);
                org.telegram.ui.Components.cc0 cc0Var = g31Var.f33836n;
                if (cc0Var != null) {
                    cc0Var.setBounds(0, 0, getWidth(), getHeight());
                }
                g31Var.h.setBounds(0, 0, getWidth(), getHeight());
                org.telegram.ui.Components.cc0 cc0Var2 = g31Var.f33836n;
                if (cc0Var2 != null) {
                    cc0Var2.draw(canvas);
                }
                g31Var.h.draw(canvas);
                super.onDraw(canvas);
                return;
            case 8:
                ((SecretMediaViewer) this.f37946b).Q.a(canvas, this);
                return;
            case 11:
                super.onDraw(canvas);
                rg.j0 j0Var = (rg.j0) this.f37946b;
                if (j0Var.f42351p0 - j0Var.f42350o0 > 1) {
                    Paint T0 = org.telegram.ui.ActionBar.j6.T0("paintDivider", rg.j0.f0(j0Var));
                    if (T0 == null) {
                        T0 = org.telegram.ui.ActionBar.j6.f18985k0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, T0);
                    return;
                }
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f37945a) {
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                x51 x51Var = (x51) this.f37946b;
                int[] iArr = x51Var.G;
                getLocationOnScreen(iArr);
                Rect rect = x51Var.d;
                int i14 = iArr[0];
                rect.set(i14, iArr[1], getWidth() + i14, getHeight() + iArr[1]);
                AndroidUtilities.lerp(x51Var.f33317c, rect, x51Var.I, x51Var.e);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        switch (this.f37945a) {
            case 0:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(38.0f));
                return;
            case 5:
                ex0 ex0Var = (ex0) this.f37946b;
                PremiumPreviewFragment premiumPreviewFragment = ex0Var.f33493c;
                if (premiumPreviewFragment.W) {
                    premiumPreviewFragment.Y = 0;
                } else {
                    int dp = AndroidUtilities.dp(64.0f);
                    if (AndroidUtilities.dp(8.0f) + ex0Var.f33493c.U.getMeasuredHeight() > dp) {
                        dp = ex0Var.f33493c.U.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                    }
                    ex0Var.f33493c.Y = dp;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(ex0Var.f33493c.Y, 1073741824));
                return;
            case 13:
                yh.y7 y7Var = (yh.y7) this.f37946b;
                if (y7Var.H) {
                    i12 = (yh.y7.C0(y7Var).getMeasuredHeight() + y7Var.I) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp2 = AndroidUtilities.dp(140.0f) + y7Var.I;
                    if (AndroidUtilities.dp(24.0f) + y7Var.f37635y.getMeasuredHeight() > dp2) {
                        dp2 = AndroidUtilities.dp(24.0f) + y7Var.f37635y.getMeasuredHeight();
                    }
                    i12 = dp2;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (i12 - (0 * 2.5f)), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f37945a) {
            case 6:
                super.setAlpha(f7);
                View view = ((ProfileActivity) this.f37946b).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 10:
                super.setAlpha(f7);
                View view2 = ((fg1) this.f37946b).fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setBackground(Drawable drawable) {
        switch (this.f37945a) {
            case 12:
                if (((xh.n1) this.f37946b) != null) {
                    if (isAttachedToWindow()) {
                        xh.n1 n1Var = (xh.n1) this.f37946b;
                        if (n1Var.f46061i) {
                            n1Var.f46061i = false;
                            n1Var.a();
                            LiteMode.removeOnPowerSaverAppliedListener(n1Var.h);
                        }
                    }
                    this.f37946b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof xh.n1) {
                    this.f37946b = (xh.n1) drawable;
                    if (isAttachedToWindow()) {
                        xh.n1 n1Var2 = (xh.n1) this.f37946b;
                        if (!n1Var2.f46061i) {
                            n1Var2.f46061i = true;
                            n1Var2.a();
                            org.telegram.ui.web.b1 b1Var = new org.telegram.ui.web.b1(n1Var2, 17);
                            n1Var2.h = b1Var;
                            LiteMode.addOnPowerSaverAppliedListener(b1Var);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                super.setBackground(drawable);
                return;
        }
    }

    public u50(Object obj, Context context, int i10) {
        super(context);
        this.f37945a = i10;
        this.f37946b = obj;
    }

    public u50(Context context, v50 v50Var) {
        super(context);
        this.f37945a = 0;
        this.f37946b = v50Var;
        NotificationCenter.listenEmojiLoading(this);
        setOnClickListener(new uv(10, this, context));
    }
}
