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
    public final int f41810a;
    public Object f41811b;

    public s50(Context context) {
        super(context);
        this.f41810a = 12;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f41810a) {
            case 0:
                super.dispatchDraw(canvas);
                t50 t50Var = (t50) this.f41811b;
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
        switch (this.f41810a) {
            case 0:
                super.onAttachedToWindow();
                t50 t50Var = (t50) this.f41811b;
                if (t50Var != null) {
                    t50Var.f42087g = this;
                    int i10 = 0;
                    while (true) {
                        v50[] v50VarArr = t50Var.f42084c;
                        if (i10 < v50VarArr.length) {
                            v50 v50Var = v50VarArr[i10];
                            v50Var.f42679i.add(this);
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
                xh.n1 n1Var = (xh.n1) this.f41811b;
                if (n1Var != null && !n1Var.f51621i) {
                    n1Var.f51621i = true;
                    n1Var.a();
                    ii.q1 q1Var = new ii.q1(n1Var, 20);
                    n1Var.h = q1Var;
                    LiteMode.addOnPowerSaverAppliedListener(q1Var);
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
        switch (this.f41810a) {
            case 0:
                super.onDetachedFromWindow();
                t50 t50Var = (t50) this.f41811b;
                if (t50Var != null && t50Var.f42087g != this) {
                    int i10 = 0;
                    while (true) {
                        v50[] v50VarArr = t50Var.f42084c;
                        if (i10 < v50VarArr.length) {
                            v50 v50Var = v50VarArr[i10];
                            v50Var.f42679i.remove(this);
                            v50Var.a();
                            i10++;
                        } else {
                            t50Var.f42087g = null;
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 12:
                super.onDetachedFromWindow();
                xh.n1 n1Var = (xh.n1) this.f41811b;
                if (n1Var != null && n1Var.f51621i) {
                    n1Var.f51621i = false;
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
        switch (this.f41810a) {
            case 1:
                canvas.drawColor(((tj0) this.f41811b).getThemedColor(org.telegram.ui.ActionBar.h6.e7));
                return;
            case 2:
                mq0 mq0Var = (mq0) this.f41811b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, mq0Var.f40109c.size())));
                int ceil = (int) Math.ceil(mq0Var.S.measureText(format));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ceil, AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                mq0Var.S.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.C5, false));
                mq0Var.U.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20630h5, false));
                int i11 = max / 2;
                int i12 = measuredWidth - i11;
                int i13 = i11 + measuredWidth;
                mq0Var.T.set(i12, 0.0f, i13, getMeasuredHeight());
                canvas.drawRoundRect(mq0Var.T, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), mq0Var.U);
                mq0Var.U.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.B5, false));
                mq0Var.T.set(AndroidUtilities.dp(2.0f) + i12, AndroidUtilities.dp(2.0f), i13 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(mq0Var.T, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), mq0Var.U);
                canvas.drawText(format, measuredWidth - (ceil / 2), AndroidUtilities.dp(16.2f), mq0Var.S);
                return;
            case 3:
                dr0 dr0Var = (dr0) this.f41811b;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, dr0Var.f36870c.size())));
                int ceil2 = (int) Math.ceil(dr0Var.f36878h0.measureText(format2));
                int max2 = Math.max(AndroidUtilities.dp(16.0f) + ceil2, AndroidUtilities.dp(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                dr0Var.f36878h0.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.C5, false));
                dr0Var.f36880j0.setColor(org.telegram.ui.ActionBar.h6.x0(null, dr0Var.f36893u0, false));
                int i14 = max2 / 2;
                int i15 = measuredWidth2 - i14;
                int i16 = i14 + measuredWidth2;
                dr0Var.f36879i0.set(i15, 0.0f, i16, getMeasuredHeight());
                canvas.drawRoundRect(dr0Var.f36879i0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), dr0Var.f36880j0);
                dr0Var.f36880j0.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.B5, false));
                dr0Var.f36879i0.set(AndroidUtilities.dp(2.0f) + i15, AndroidUtilities.dp(2.0f), i16 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(dr0Var.f36879i0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), dr0Var.f36880j0);
                canvas.drawText(format2, measuredWidth2 - (ceil2 / 2), AndroidUtilities.dp(16.2f), dr0Var.f36878h0);
                return;
            case 4:
                ((PhotoViewer) this.f41811b).f33847q3.a(canvas, this);
                return;
            case 5:
            case 6:
            case 9:
            case 10:
            default:
                super.onDraw(canvas);
                return;
            case 7:
                g31 g31Var = (g31) this.f41811b;
                if (g31Var.K) {
                    i10 = -15590870;
                } else {
                    i10 = -6569073;
                }
                canvas.drawColor(i10);
                org.telegram.ui.Components.gd0 gd0Var = g31Var.f37911n;
                if (gd0Var != null) {
                    gd0Var.setBounds(0, 0, getWidth(), getHeight());
                }
                g31Var.h.setBounds(0, 0, getWidth(), getHeight());
                org.telegram.ui.Components.gd0 gd0Var2 = g31Var.f37911n;
                if (gd0Var2 != null) {
                    gd0Var2.draw(canvas);
                }
                g31Var.h.draw(canvas);
                super.onDraw(canvas);
                return;
            case 8:
                ((SecretMediaViewer) this.f41811b).Q.a(canvas, this);
                return;
            case 11:
                super.onDraw(canvas);
                rg.j0 j0Var = (rg.j0) this.f41811b;
                if (j0Var.f47502p0 - j0Var.f47501o0 > 1) {
                    Paint U0 = org.telegram.ui.ActionBar.h6.U0("paintDivider", rg.j0.g0(j0Var));
                    if (U0 == null) {
                        U0 = org.telegram.ui.ActionBar.h6.f20681k0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, U0);
                    return;
                }
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f41810a) {
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                c61 c61Var = (c61) this.f41811b;
                int[] iArr = c61Var.G;
                getLocationOnScreen(iArr);
                Rect rect = c61Var.d;
                int i14 = iArr[0];
                rect.set(i14, iArr[1], getWidth() + i14, getHeight() + iArr[1]);
                AndroidUtilities.lerp(c61Var.f39115c, rect, c61Var.I, c61Var.f39116e);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        switch (this.f41810a) {
            case 0:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(38.0f));
                return;
            case 5:
                ex0 ex0Var = (ex0) this.f41811b;
                PremiumPreviewFragment premiumPreviewFragment = ex0Var.f37561c;
                if (premiumPreviewFragment.W) {
                    premiumPreviewFragment.Y = 0;
                } else {
                    int dp = AndroidUtilities.dp(64.0f);
                    if (AndroidUtilities.dp(8.0f) + ex0Var.f37561c.U.getMeasuredHeight() > dp) {
                        dp = ex0Var.f37561c.U.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                    }
                    ex0Var.f37561c.Y = dp;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(ex0Var.f37561c.Y, 1073741824));
                return;
            case 13:
                yh.p7 p7Var = (yh.p7) this.f41811b;
                if (p7Var.H) {
                    i12 = (yh.p7.D0(p7Var).getMeasuredHeight() + p7Var.I) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp2 = AndroidUtilities.dp(140.0f) + p7Var.I;
                    if (AndroidUtilities.dp(24.0f) + p7Var.f41489y.getMeasuredHeight() > dp2) {
                        dp2 = AndroidUtilities.dp(24.0f) + p7Var.f41489y.getMeasuredHeight();
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
        switch (this.f41810a) {
            case 6:
                super.setAlpha(f7);
                View view = ((ProfileActivity) this.f41811b).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 10:
                super.setAlpha(f7);
                View view2 = ((hg1) this.f41811b).fragmentView;
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
        switch (this.f41810a) {
            case 12:
                if (((xh.n1) this.f41811b) != null) {
                    if (isAttachedToWindow()) {
                        xh.n1 n1Var = (xh.n1) this.f41811b;
                        if (n1Var.f51621i) {
                            n1Var.f51621i = false;
                            n1Var.a();
                            LiteMode.removeOnPowerSaverAppliedListener(n1Var.h);
                        }
                    }
                    this.f41811b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof xh.n1) {
                    this.f41811b = (xh.n1) drawable;
                    if (isAttachedToWindow()) {
                        xh.n1 n1Var2 = (xh.n1) this.f41811b;
                        if (!n1Var2.f51621i) {
                            n1Var2.f51621i = true;
                            n1Var2.a();
                            ii.q1 q1Var = new ii.q1(n1Var2, 20);
                            n1Var2.h = q1Var;
                            LiteMode.addOnPowerSaverAppliedListener(q1Var);
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
        this.f41810a = i10;
        this.f41811b = obj;
    }

    public s50(Context context, t50 t50Var) {
        super(context);
        this.f41810a = 0;
        this.f41811b = t50Var;
        NotificationCenter.listenEmojiLoading(this);
        setOnClickListener(new uv(10, this, context));
    }
}
