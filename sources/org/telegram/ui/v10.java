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
public final class v10 extends View {
    public final int f42098a;
    public Object f42099b;

    public v10(Context context) {
        super(context);
        this.f42098a = 13;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f42098a) {
            case 1:
                super.dispatchDraw(canvas);
                b50 b50Var = (b50) this.f42099b;
                if (b50Var != null && b50Var.a(canvas, getMeasuredWidth(), 0.0f)) {
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
        switch (this.f42098a) {
            case 1:
                super.onAttachedToWindow();
                b50 b50Var = (b50) this.f42099b;
                if (b50Var != null) {
                    b50Var.f35509g = this;
                    int i10 = 0;
                    while (true) {
                        d50[] d50VarArr = b50Var.f35507c;
                        if (i10 < d50VarArr.length) {
                            d50 d50Var = d50VarArr[i10];
                            d50Var.f36272i.add(this);
                            d50Var.a();
                            i10++;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            case 13:
                super.onAttachedToWindow();
                yh.l1 l1Var = (yh.l1) this.f42099b;
                if (l1Var != null && !l1Var.f50368i) {
                    l1Var.f50368i = true;
                    l1Var.a();
                    ig.l0 l0Var = new ig.l0(l1Var, 26);
                    l1Var.h = l0Var;
                    LiteMode.addOnPowerSaverAppliedListener(l0Var);
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
        switch (this.f42098a) {
            case 1:
                super.onDetachedFromWindow();
                b50 b50Var = (b50) this.f42099b;
                if (b50Var != null && b50Var.f35509g != this) {
                    int i10 = 0;
                    while (true) {
                        d50[] d50VarArr = b50Var.f35507c;
                        if (i10 < d50VarArr.length) {
                            d50 d50Var = d50VarArr[i10];
                            d50Var.f36272i.remove(this);
                            d50Var.a();
                            i10++;
                        } else {
                            b50Var.f35509g = null;
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 13:
                super.onDetachedFromWindow();
                yh.l1 l1Var = (yh.l1) this.f42099b;
                if (l1Var != null && l1Var.f50368i) {
                    l1Var.f50368i = false;
                    l1Var.a();
                    LiteMode.removeOnPowerSaverAppliedListener(l1Var.h);
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
        switch (this.f42098a) {
            case 2:
                canvas.drawColor(((bj0) this.f42099b).getThemedColor(org.telegram.ui.ActionBar.h6.e7));
                return;
            case 3:
                sp0 sp0Var = (sp0) this.f42099b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, sp0Var.f41512c.size())));
                int ceil = (int) Math.ceil(sp0Var.S.measureText(format));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ceil, AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                sp0Var.S.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.C5, false));
                sp0Var.U.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21065h5, false));
                int i10 = max / 2;
                int i11 = measuredWidth - i10;
                int i12 = i10 + measuredWidth;
                sp0Var.T.set(i11, 0.0f, i12, getMeasuredHeight());
                canvas.drawRoundRect(sp0Var.T, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), sp0Var.U);
                sp0Var.U.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.B5, false));
                sp0Var.T.set(AndroidUtilities.dp(2.0f) + i11, AndroidUtilities.dp(2.0f), i12 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(sp0Var.T, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), sp0Var.U);
                canvas.drawText(format, measuredWidth - (ceil / 2), AndroidUtilities.dp(16.2f), sp0Var.S);
                return;
            case 4:
                jq0 jq0Var = (jq0) this.f42099b;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, jq0Var.f38309c.size())));
                int ceil2 = (int) Math.ceil(jq0Var.f38316h0.measureText(format2));
                int max2 = Math.max(AndroidUtilities.dp(16.0f) + ceil2, AndroidUtilities.dp(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                jq0Var.f38316h0.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.C5, false));
                jq0Var.f38318j0.setColor(org.telegram.ui.ActionBar.h6.x0(null, jq0Var.f38331u0, false));
                int i13 = max2 / 2;
                int i14 = measuredWidth2 - i13;
                int i15 = i13 + measuredWidth2;
                jq0Var.f38317i0.set(i14, 0.0f, i15, getMeasuredHeight());
                canvas.drawRoundRect(jq0Var.f38317i0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), jq0Var.f38318j0);
                jq0Var.f38318j0.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.B5, false));
                jq0Var.f38317i0.set(AndroidUtilities.dp(2.0f) + i14, AndroidUtilities.dp(2.0f), i15 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(jq0Var.f38317i0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), jq0Var.f38318j0);
                canvas.drawText(format2, measuredWidth2 - (ceil2 / 2), AndroidUtilities.dp(16.2f), jq0Var.f38316h0);
                return;
            case 5:
                ((PhotoViewer) this.f42099b).f33390q3.a(canvas, this);
                return;
            case 6:
            case 7:
            case 9:
            case 10:
            default:
                super.onDraw(canvas);
                return;
            case 8:
                ((SecretMediaViewer) this.f42099b).Q.a(canvas, this);
                return;
            case 11:
                org.telegram.ui.Wallet.x5 x5Var = (org.telegram.ui.Wallet.x5) this.f42099b;
                float d = x5Var.K.d(x5Var.J, false);
                if (x5Var.Q != null && getWidth() > 0) {
                    org.telegram.ui.Wallet.x5.a(x5Var, canvas, d);
                    return;
                }
                return;
            case 12:
                super.onDraw(canvas);
                sg.k0 k0Var = (sg.k0) this.f42099b;
                if (k0Var.f46304p0 - k0Var.f46303o0 > 1) {
                    Paint U0 = org.telegram.ui.ActionBar.h6.U0("paintDivider", sg.k0.g0(k0Var));
                    if (U0 == null) {
                        U0 = org.telegram.ui.ActionBar.h6.f21115k0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, U0);
                    return;
                }
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f42098a) {
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                m41 m41Var = (m41) this.f42099b;
                int[] iArr = m41Var.G;
                getLocationOnScreen(iArr);
                Rect rect = m41Var.d;
                int i14 = iArr[0];
                rect.set(i14, iArr[1], getWidth() + i14, getHeight() + iArr[1]);
                AndroidUtilities.lerp(m41Var.f41601c, rect, m41Var.I, m41Var.e);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f42098a) {
            case 0:
                y10 y10Var = (y10) this.f42099b;
                if (y10Var.H) {
                    int i12 = y10Var.I;
                    kVar = ((org.telegram.ui.ActionBar.n2) y10Var).actionBar;
                    y10Var.J = (kVar.getMeasuredHeight() + i12) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp = AndroidUtilities.dp(140.0f) + y10Var.I;
                    if (AndroidUtilities.dp(24.0f) + y10Var.f43336y.getMeasuredHeight() > dp) {
                        dp = Math.max(dp, (AndroidUtilities.dp(24.0f) + y10Var.f43336y.getMeasuredHeight()) - y10Var.L);
                    }
                    y10Var.J = dp;
                }
                int i13 = (int) (y10Var.J - (0 * 2.5f));
                y10Var.J = i13;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
                return;
            case 1:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(38.0f));
                return;
            case 6:
                gw0 gw0Var = (gw0) this.f42099b;
                PremiumPreviewFragment premiumPreviewFragment = gw0Var.f37433c;
                if (premiumPreviewFragment.W) {
                    premiumPreviewFragment.Y = 0;
                } else {
                    int dp2 = AndroidUtilities.dp(64.0f);
                    if (AndroidUtilities.dp(8.0f) + gw0Var.f37433c.U.getMeasuredHeight() > dp2) {
                        dp2 = gw0Var.f37433c.U.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                    }
                    gw0Var.f37433c.Y = dp2;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(gw0Var.f37433c.Y, 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f42098a) {
            case 7:
                super.setAlpha(f7);
                View view = ((ProfileActivity) this.f42099b).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 10:
                super.setAlpha(f7);
                View view2 = ((re1) this.f42099b).fragmentView;
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
        switch (this.f42098a) {
            case 13:
                if (((yh.l1) this.f42099b) != null) {
                    if (isAttachedToWindow()) {
                        yh.l1 l1Var = (yh.l1) this.f42099b;
                        if (l1Var.f50368i) {
                            l1Var.f50368i = false;
                            l1Var.a();
                            LiteMode.removeOnPowerSaverAppliedListener(l1Var.h);
                        }
                    }
                    this.f42099b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof yh.l1) {
                    this.f42099b = (yh.l1) drawable;
                    if (isAttachedToWindow()) {
                        yh.l1 l1Var2 = (yh.l1) this.f42099b;
                        if (!l1Var2.f50368i) {
                            l1Var2.f50368i = true;
                            l1Var2.a();
                            ig.l0 l0Var = new ig.l0(l1Var2, 26);
                            l1Var2.h = l0Var;
                            LiteMode.addOnPowerSaverAppliedListener(l0Var);
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

    public v10(Object obj, Context context, int i10) {
        super(context);
        this.f42098a = i10;
        this.f42099b = obj;
    }

    public v10(Context context, b50 b50Var) {
        super(context);
        this.f42098a = 1;
        this.f42099b = b50Var;
        NotificationCenter.listenEmojiLoading(this);
        setOnClickListener(new org.telegram.ui.Components.i51(20, this, context));
    }
}
