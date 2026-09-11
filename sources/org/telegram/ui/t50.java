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
public final class t50 extends View {
    public final int f40622a;
    public Object f40623b;

    public t50(Context context) {
        super(context);
        this.f40622a = 12;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f40622a) {
            case 0:
                super.dispatchDraw(canvas);
                u50 u50Var = (u50) this.f40623b;
                if (u50Var != null && u50Var.a(canvas, getMeasuredWidth(), 0.0f)) {
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
        switch (this.f40622a) {
            case 0:
                super.onAttachedToWindow();
                u50 u50Var = (u50) this.f40623b;
                if (u50Var != null) {
                    u50Var.f40934g = this;
                    int i10 = 0;
                    while (true) {
                        w50[] w50VarArr = u50Var.f40931c;
                        if (i10 < w50VarArr.length) {
                            w50 w50Var = w50VarArr[i10];
                            w50Var.f41769i.add(this);
                            w50Var.a();
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
                yh.m1 m1Var = (yh.m1) this.f40623b;
                if (m1Var != null && !m1Var.f50438i) {
                    m1Var.f50438i = true;
                    m1Var.a();
                    org.telegram.ui.web.b1 b1Var = new org.telegram.ui.web.b1(m1Var, 17);
                    m1Var.h = b1Var;
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
        switch (this.f40622a) {
            case 0:
                super.onDetachedFromWindow();
                u50 u50Var = (u50) this.f40623b;
                if (u50Var != null && u50Var.f40934g != this) {
                    int i10 = 0;
                    while (true) {
                        w50[] w50VarArr = u50Var.f40931c;
                        if (i10 < w50VarArr.length) {
                            w50 w50Var = w50VarArr[i10];
                            w50Var.f41769i.remove(this);
                            w50Var.a();
                            i10++;
                        } else {
                            u50Var.f40934g = null;
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 12:
                super.onDetachedFromWindow();
                yh.m1 m1Var = (yh.m1) this.f40623b;
                if (m1Var != null && m1Var.f50438i) {
                    m1Var.f50438i = false;
                    m1Var.a();
                    LiteMode.removeOnPowerSaverAppliedListener(m1Var.h);
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
        switch (this.f40622a) {
            case 1:
                canvas.drawColor(((tj0) this.f40623b).getThemedColor(org.telegram.ui.ActionBar.j6.e7));
                return;
            case 2:
                kq0 kq0Var = (kq0) this.f40623b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, kq0Var.f38106c.size())));
                int ceil = (int) Math.ceil(kq0Var.S.measureText(format));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ceil, AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                kq0Var.S.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.C5, false));
                kq0Var.U.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20734h5, false));
                int i11 = max / 2;
                int i12 = measuredWidth - i11;
                int i13 = i11 + measuredWidth;
                kq0Var.T.set(i12, 0.0f, i13, getMeasuredHeight());
                canvas.drawRoundRect(kq0Var.T, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), kq0Var.U);
                kq0Var.U.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B5, false));
                kq0Var.T.set(AndroidUtilities.dp(2.0f) + i12, AndroidUtilities.dp(2.0f), i13 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(kq0Var.T, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), kq0Var.U);
                canvas.drawText(format, measuredWidth - (ceil / 2), AndroidUtilities.dp(16.2f), kq0Var.S);
                return;
            case 3:
                br0 br0Var = (br0) this.f40623b;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, br0Var.f34885c.size())));
                int ceil2 = (int) Math.ceil(br0Var.f34893h0.measureText(format2));
                int max2 = Math.max(AndroidUtilities.dp(16.0f) + ceil2, AndroidUtilities.dp(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                br0Var.f34893h0.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.C5, false));
                br0Var.f34895j0.setColor(org.telegram.ui.ActionBar.j6.w0(null, br0Var.f34908u0, false));
                int i14 = max2 / 2;
                int i15 = measuredWidth2 - i14;
                int i16 = i14 + measuredWidth2;
                br0Var.f34894i0.set(i15, 0.0f, i16, getMeasuredHeight());
                canvas.drawRoundRect(br0Var.f34894i0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), br0Var.f34895j0);
                br0Var.f34895j0.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B5, false));
                br0Var.f34894i0.set(AndroidUtilities.dp(2.0f) + i15, AndroidUtilities.dp(2.0f), i16 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(br0Var.f34894i0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), br0Var.f34895j0);
                canvas.drawText(format2, measuredWidth2 - (ceil2 / 2), AndroidUtilities.dp(16.2f), br0Var.f34893h0);
                return;
            case 4:
                ((PhotoViewer) this.f40623b).f33655q3.a(canvas, this);
                return;
            case 5:
            case 6:
            case 9:
            case 10:
            default:
                super.onDraw(canvas);
                return;
            case 7:
                g31 g31Var = (g31) this.f40623b;
                if (g31Var.K) {
                    i10 = -15590870;
                } else {
                    i10 = -6569073;
                }
                canvas.drawColor(i10);
                org.telegram.ui.Components.dc0 dc0Var = g31Var.f36543n;
                if (dc0Var != null) {
                    dc0Var.setBounds(0, 0, getWidth(), getHeight());
                }
                g31Var.h.setBounds(0, 0, getWidth(), getHeight());
                org.telegram.ui.Components.dc0 dc0Var2 = g31Var.f36543n;
                if (dc0Var2 != null) {
                    dc0Var2.draw(canvas);
                }
                g31Var.h.draw(canvas);
                super.onDraw(canvas);
                return;
            case 8:
                ((SecretMediaViewer) this.f40623b).Q.a(canvas, this);
                return;
            case 11:
                super.onDraw(canvas);
                sg.k0 k0Var = (sg.k0) this.f40623b;
                if (k0Var.f46144p0 - k0Var.f46143o0 > 1) {
                    Paint T0 = org.telegram.ui.ActionBar.j6.T0("paintDivider", sg.k0.f0(k0Var));
                    if (T0 == null) {
                        T0 = org.telegram.ui.ActionBar.j6.f20785k0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, T0);
                    return;
                }
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f40622a) {
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                y51 y51Var = (y51) this.f40623b;
                int[] iArr = y51Var.G;
                getLocationOnScreen(iArr);
                Rect rect = y51Var.d;
                int i14 = iArr[0];
                rect.set(i14, iArr[1], getWidth() + i14, getHeight() + iArr[1]);
                AndroidUtilities.lerp(y51Var.f36311c, rect, y51Var.I, y51Var.f36312e);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        switch (this.f40622a) {
            case 0:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(38.0f));
                return;
            case 5:
                cx0 cx0Var = (cx0) this.f40623b;
                PremiumPreviewFragment premiumPreviewFragment = cx0Var.f35567c;
                if (premiumPreviewFragment.W) {
                    premiumPreviewFragment.Y = 0;
                } else {
                    int dp = AndroidUtilities.dp(64.0f);
                    if (AndroidUtilities.dp(8.0f) + cx0Var.f35567c.U.getMeasuredHeight() > dp) {
                        dp = cx0Var.f35567c.U.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                    }
                    cx0Var.f35567c.Y = dp;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(cx0Var.f35567c.Y, 1073741824));
                return;
            case 13:
                zh.v7 v7Var = (zh.v7) this.f40623b;
                if (v7Var.H) {
                    i12 = (zh.v7.C0(v7Var).getMeasuredHeight() + v7Var.I) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp2 = AndroidUtilities.dp(140.0f) + v7Var.I;
                    if (AndroidUtilities.dp(24.0f) + v7Var.f40049y.getMeasuredHeight() > dp2) {
                        dp2 = AndroidUtilities.dp(24.0f) + v7Var.f40049y.getMeasuredHeight();
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
        switch (this.f40622a) {
            case 6:
                super.setAlpha(f7);
                View view = ((ProfileActivity) this.f40623b).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 10:
                super.setAlpha(f7);
                View view2 = ((eg1) this.f40623b).fragmentView;
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
        switch (this.f40622a) {
            case 12:
                if (((yh.m1) this.f40623b) != null) {
                    if (isAttachedToWindow()) {
                        yh.m1 m1Var = (yh.m1) this.f40623b;
                        if (m1Var.f50438i) {
                            m1Var.f50438i = false;
                            m1Var.a();
                            LiteMode.removeOnPowerSaverAppliedListener(m1Var.h);
                        }
                    }
                    this.f40623b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof yh.m1) {
                    this.f40623b = (yh.m1) drawable;
                    if (isAttachedToWindow()) {
                        yh.m1 m1Var2 = (yh.m1) this.f40623b;
                        if (!m1Var2.f50438i) {
                            m1Var2.f50438i = true;
                            m1Var2.a();
                            org.telegram.ui.web.b1 b1Var = new org.telegram.ui.web.b1(m1Var2, 17);
                            m1Var2.h = b1Var;
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

    public t50(Object obj, Context context, int i10) {
        super(context);
        this.f40622a = i10;
        this.f40623b = obj;
    }

    public t50(Context context, u50 u50Var) {
        super(context);
        this.f40622a = 0;
        this.f40623b = u50Var;
        NotificationCenter.listenEmojiLoading(this);
        setOnClickListener(new tv(10, this, context));
    }
}
