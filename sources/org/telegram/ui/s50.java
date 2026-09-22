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
public final class s50 extends View {
    public final int f37271a;
    public Object f37272b;

    public s50(Context context) {
        super(context);
        this.f37271a = 12;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f37271a) {
            case 0:
                super.dispatchDraw(canvas);
                t50 t50Var = (t50) this.f37272b;
                if (t50Var != null && t50Var.a(canvas, getMeasuredWidth(), 0.0f)) {
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
        switch (this.f37271a) {
            case 0:
                super.onAttachedToWindow();
                t50 t50Var = (t50) this.f37272b;
                if (t50Var != null) {
                    t50Var.f37569g = this;
                    int i10 = 0;
                    while (true) {
                        v50[] v50VarArr = t50Var.f37567c;
                        if (i10 < v50VarArr.length) {
                            v50 v50Var = v50VarArr[i10];
                            v50Var.f38377i.add(this);
                            v50Var.a();
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
                xh.n1 n1Var = (xh.n1) this.f37272b;
                if (n1Var != null && !n1Var.f46029i) {
                    n1Var.f46029i = true;
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
        switch (this.f37271a) {
            case 0:
                super.onDetachedFromWindow();
                t50 t50Var = (t50) this.f37272b;
                if (t50Var != null && t50Var.f37569g != this) {
                    int i10 = 0;
                    while (true) {
                        v50[] v50VarArr = t50Var.f37567c;
                        if (i10 < v50VarArr.length) {
                            v50 v50Var = v50VarArr[i10];
                            v50Var.f38377i.remove(this);
                            v50Var.a();
                            i10++;
                        } else {
                            t50Var.f37569g = null;
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 12:
                super.onDetachedFromWindow();
                xh.n1 n1Var = (xh.n1) this.f37272b;
                if (n1Var != null && n1Var.f46029i) {
                    n1Var.f46029i = false;
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
        switch (this.f37271a) {
            case 1:
                canvas.drawColor(((rj0) this.f37272b).getThemedColor(org.telegram.ui.ActionBar.i6.e7));
                return;
            case 2:
                jq0 jq0Var = (jq0) this.f37272b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, jq0Var.f34966c.size())));
                int ceil = (int) Math.ceil(jq0Var.S.measureText(format));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ceil, AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                jq0Var.S.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.C5, false));
                jq0Var.U.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18904h5, false));
                int i11 = max / 2;
                int i12 = measuredWidth - i11;
                int i13 = i11 + measuredWidth;
                jq0Var.T.set(i12, 0.0f, i13, getMeasuredHeight());
                canvas.drawRoundRect(jq0Var.T, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), jq0Var.U);
                jq0Var.U.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.B5, false));
                jq0Var.T.set(AndroidUtilities.dp(2.0f) + i12, AndroidUtilities.dp(2.0f), i13 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(jq0Var.T, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), jq0Var.U);
                canvas.drawText(format, measuredWidth - (ceil / 2), AndroidUtilities.dp(16.2f), jq0Var.S);
                return;
            case 3:
                ar0 ar0Var = (ar0) this.f37272b;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, ar0Var.f31897c.size())));
                int ceil2 = (int) Math.ceil(ar0Var.f31904h0.measureText(format2));
                int max2 = Math.max(AndroidUtilities.dp(16.0f) + ceil2, AndroidUtilities.dp(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                ar0Var.f31904h0.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.C5, false));
                ar0Var.f31906j0.setColor(org.telegram.ui.ActionBar.i6.w0(null, ar0Var.f31919u0, false));
                int i14 = max2 / 2;
                int i15 = measuredWidth2 - i14;
                int i16 = i14 + measuredWidth2;
                ar0Var.f31905i0.set(i15, 0.0f, i16, getMeasuredHeight());
                canvas.drawRoundRect(ar0Var.f31905i0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), ar0Var.f31906j0);
                ar0Var.f31906j0.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.B5, false));
                ar0Var.f31905i0.set(AndroidUtilities.dp(2.0f) + i15, AndroidUtilities.dp(2.0f), i16 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(ar0Var.f31905i0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), ar0Var.f31906j0);
                canvas.drawText(format2, measuredWidth2 - (ceil2 / 2), AndroidUtilities.dp(16.2f), ar0Var.f31904h0);
                return;
            case 4:
                ((PhotoViewer) this.f37272b).f31040q3.a(canvas, this);
                return;
            case 5:
            case 6:
            case 9:
            case 10:
            default:
                super.onDraw(canvas);
                return;
            case 7:
                f31 f31Var = (f31) this.f37272b;
                if (f31Var.K) {
                    i10 = -15590870;
                } else {
                    i10 = -6569073;
                }
                canvas.drawColor(i10);
                org.telegram.ui.Components.cc0 cc0Var = f31Var.f33478n;
                if (cc0Var != null) {
                    cc0Var.setBounds(0, 0, getWidth(), getHeight());
                }
                f31Var.h.setBounds(0, 0, getWidth(), getHeight());
                org.telegram.ui.Components.cc0 cc0Var2 = f31Var.f33478n;
                if (cc0Var2 != null) {
                    cc0Var2.draw(canvas);
                }
                f31Var.h.draw(canvas);
                super.onDraw(canvas);
                return;
            case 8:
                ((SecretMediaViewer) this.f37272b).Q.a(canvas, this);
                return;
            case 11:
                super.onDraw(canvas);
                rg.j0 j0Var = (rg.j0) this.f37272b;
                if (j0Var.f42320p0 - j0Var.f42319o0 > 1) {
                    Paint T0 = org.telegram.ui.ActionBar.i6.T0("paintDivider", rg.j0.f0(j0Var));
                    if (T0 == null) {
                        T0 = org.telegram.ui.ActionBar.i6.f18955k0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, T0);
                    return;
                }
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f37271a) {
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                w51 w51Var = (w51) this.f37272b;
                int[] iArr = w51Var.G;
                getLocationOnScreen(iArr);
                Rect rect = w51Var.d;
                int i14 = iArr[0];
                rect.set(i14, iArr[1], getWidth() + i14, getHeight() + iArr[1]);
                AndroidUtilities.lerp(w51Var.f32957c, rect, w51Var.I, w51Var.e);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        switch (this.f37271a) {
            case 0:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(38.0f));
                return;
            case 5:
                cx0 cx0Var = (cx0) this.f37272b;
                PremiumPreviewFragment premiumPreviewFragment = cx0Var.f32884c;
                if (premiumPreviewFragment.W) {
                    premiumPreviewFragment.Y = 0;
                } else {
                    int dp = AndroidUtilities.dp(64.0f);
                    if (AndroidUtilities.dp(8.0f) + cx0Var.f32884c.U.getMeasuredHeight() > dp) {
                        dp = cx0Var.f32884c.U.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                    }
                    cx0Var.f32884c.Y = dp;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(cx0Var.f32884c.Y, 1073741824));
                return;
            case 13:
                yh.x7 x7Var = (yh.x7) this.f37272b;
                if (x7Var.H) {
                    i12 = (yh.x7.C0(x7Var).getMeasuredHeight() + x7Var.I) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp2 = AndroidUtilities.dp(140.0f) + x7Var.I;
                    if (AndroidUtilities.dp(24.0f) + x7Var.f37011y.getMeasuredHeight() > dp2) {
                        dp2 = AndroidUtilities.dp(24.0f) + x7Var.f37011y.getMeasuredHeight();
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
        switch (this.f37271a) {
            case 6:
                super.setAlpha(f7);
                View view = ((ProfileActivity) this.f37272b).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 10:
                super.setAlpha(f7);
                View view2 = ((eg1) this.f37272b).fragmentView;
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
        switch (this.f37271a) {
            case 12:
                if (((xh.n1) this.f37272b) != null) {
                    if (isAttachedToWindow()) {
                        xh.n1 n1Var = (xh.n1) this.f37272b;
                        if (n1Var.f46029i) {
                            n1Var.f46029i = false;
                            n1Var.a();
                            LiteMode.removeOnPowerSaverAppliedListener(n1Var.h);
                        }
                    }
                    this.f37272b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof xh.n1) {
                    this.f37272b = (xh.n1) drawable;
                    if (isAttachedToWindow()) {
                        xh.n1 n1Var2 = (xh.n1) this.f37272b;
                        if (!n1Var2.f46029i) {
                            n1Var2.f46029i = true;
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

    public s50(Object obj, Context context, int i10) {
        super(context);
        this.f37271a = i10;
        this.f37272b = obj;
    }

    public s50(Context context, t50 t50Var) {
        super(context);
        this.f37271a = 0;
        this.f37272b = t50Var;
        NotificationCenter.listenEmojiLoading(this);
        setOnClickListener(new sv(10, this, context));
    }
}
