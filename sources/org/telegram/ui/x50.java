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
public final class x50 extends View {
    public final int f41750a;
    public Object f41751b;

    public x50(Context context) {
        super(context);
        this.f41750a = 12;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f41750a) {
            case 0:
                super.dispatchDraw(canvas);
                y50 y50Var = (y50) this.f41751b;
                if (y50Var != null && y50Var.a(canvas, getMeasuredWidth(), 0.0f)) {
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
        switch (this.f41750a) {
            case 0:
                super.onAttachedToWindow();
                y50 y50Var = (y50) this.f41751b;
                if (y50Var != null) {
                    y50Var.f42036g = this;
                    int i10 = 0;
                    while (true) {
                        a60[] a60VarArr = y50Var.f42034c;
                        if (i10 < a60VarArr.length) {
                            a60 a60Var = a60VarArr[i10];
                            a60Var.f34051i.add(this);
                            a60Var.a();
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
                yh.m1 m1Var = (yh.m1) this.f41751b;
                if (m1Var != null && !m1Var.f48993i) {
                    m1Var.f48993i = true;
                    m1Var.a();
                    ji.p1 p1Var = new ji.p1(m1Var, 20);
                    m1Var.h = p1Var;
                    LiteMode.addOnPowerSaverAppliedListener(p1Var);
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
        switch (this.f41750a) {
            case 0:
                super.onDetachedFromWindow();
                y50 y50Var = (y50) this.f41751b;
                if (y50Var != null && y50Var.f42036g != this) {
                    int i10 = 0;
                    while (true) {
                        a60[] a60VarArr = y50Var.f42034c;
                        if (i10 < a60VarArr.length) {
                            a60 a60Var = a60VarArr[i10];
                            a60Var.f34051i.remove(this);
                            a60Var.a();
                            i10++;
                        } else {
                            y50Var.f42036g = null;
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 12:
                super.onDetachedFromWindow();
                yh.m1 m1Var = (yh.m1) this.f41751b;
                if (m1Var != null && m1Var.f48993i) {
                    m1Var.f48993i = false;
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
        switch (this.f41750a) {
            case 1:
                canvas.drawColor(((xj0) this.f41751b).getThemedColor(org.telegram.ui.ActionBar.g6.e7));
                return;
            case 2:
                qq0 qq0Var = (qq0) this.f41751b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, qq0Var.f39518c.size())));
                int ceil = (int) Math.ceil(qq0Var.S.measureText(format));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ceil, AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                qq0Var.S.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.C5, false));
                qq0Var.U.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19972h5, false));
                int i11 = max / 2;
                int i12 = measuredWidth - i11;
                int i13 = i11 + measuredWidth;
                qq0Var.T.set(i12, 0.0f, i13, getMeasuredHeight());
                canvas.drawRoundRect(qq0Var.T, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), qq0Var.U);
                qq0Var.U.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.B5, false));
                qq0Var.T.set(AndroidUtilities.dp(2.0f) + i12, AndroidUtilities.dp(2.0f), i13 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(qq0Var.T, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), qq0Var.U);
                canvas.drawText(format, measuredWidth - (ceil / 2), AndroidUtilities.dp(16.2f), qq0Var.S);
                return;
            case 3:
                hr0 hr0Var = (hr0) this.f41751b;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, hr0Var.f36917c.size())));
                int ceil2 = (int) Math.ceil(hr0Var.f36924h0.measureText(format2));
                int max2 = Math.max(AndroidUtilities.dp(16.0f) + ceil2, AndroidUtilities.dp(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                hr0Var.f36924h0.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.C5, false));
                hr0Var.f36926j0.setColor(org.telegram.ui.ActionBar.g6.x0(null, hr0Var.f36939u0, false));
                int i14 = max2 / 2;
                int i15 = measuredWidth2 - i14;
                int i16 = i14 + measuredWidth2;
                hr0Var.f36925i0.set(i15, 0.0f, i16, getMeasuredHeight());
                canvas.drawRoundRect(hr0Var.f36925i0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), hr0Var.f36926j0);
                hr0Var.f36926j0.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.B5, false));
                hr0Var.f36925i0.set(AndroidUtilities.dp(2.0f) + i15, AndroidUtilities.dp(2.0f), i16 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(hr0Var.f36925i0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), hr0Var.f36926j0);
                canvas.drawText(format2, measuredWidth2 - (ceil2 / 2), AndroidUtilities.dp(16.2f), hr0Var.f36924h0);
                return;
            case 4:
                ((PhotoViewer) this.f41751b).f32333q3.a(canvas, this);
                return;
            case 5:
            case 6:
            case 9:
            case 10:
            default:
                super.onDraw(canvas);
                return;
            case 7:
                l31 l31Var = (l31) this.f41751b;
                if (l31Var.K) {
                    i10 = -15590870;
                } else {
                    i10 = -6569073;
                }
                canvas.drawColor(i10);
                org.telegram.ui.Components.cd0 cd0Var = l31Var.f37830n;
                if (cd0Var != null) {
                    cd0Var.setBounds(0, 0, getWidth(), getHeight());
                }
                l31Var.h.setBounds(0, 0, getWidth(), getHeight());
                org.telegram.ui.Components.cd0 cd0Var2 = l31Var.f37830n;
                if (cd0Var2 != null) {
                    cd0Var2.draw(canvas);
                }
                l31Var.h.draw(canvas);
                super.onDraw(canvas);
                return;
            case 8:
                ((SecretMediaViewer) this.f41751b).Q.a(canvas, this);
                return;
            case 11:
                super.onDraw(canvas);
                sg.j0 j0Var = (sg.j0) this.f41751b;
                if (j0Var.f45217p0 - j0Var.f45216o0 > 1) {
                    Paint U0 = org.telegram.ui.ActionBar.g6.U0("paintDivider", sg.j0.g0(j0Var));
                    if (U0 == null) {
                        U0 = org.telegram.ui.ActionBar.g6.f20022k0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, U0);
                    return;
                }
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f41750a) {
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                g61 g61Var = (g61) this.f41751b;
                int[] iArr = g61Var.G;
                getLocationOnScreen(iArr);
                Rect rect = g61Var.d;
                int i14 = iArr[0];
                rect.set(i14, iArr[1], getWidth() + i14, getHeight() + iArr[1]);
                AndroidUtilities.lerp(g61Var.f38557c, rect, g61Var.I, g61Var.e);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        switch (this.f41750a) {
            case 0:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(38.0f));
                return;
            case 5:
                ix0 ix0Var = (ix0) this.f41751b;
                PremiumPreviewFragment premiumPreviewFragment = ix0Var.f37213c;
                if (premiumPreviewFragment.W) {
                    premiumPreviewFragment.Y = 0;
                } else {
                    int dp = AndroidUtilities.dp(64.0f);
                    if (AndroidUtilities.dp(8.0f) + ix0Var.f37213c.U.getMeasuredHeight() > dp) {
                        dp = ix0Var.f37213c.U.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                    }
                    ix0Var.f37213c.Y = dp;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(ix0Var.f37213c.Y, 1073741824));
                return;
            case 13:
                zh.p7 p7Var = (zh.p7) this.f41751b;
                if (p7Var.H) {
                    i12 = (zh.p7.D0(p7Var).getMeasuredHeight() + p7Var.I) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp2 = AndroidUtilities.dp(140.0f) + p7Var.I;
                    if (AndroidUtilities.dp(24.0f) + p7Var.f40868y.getMeasuredHeight() > dp2) {
                        dp2 = AndroidUtilities.dp(24.0f) + p7Var.f40868y.getMeasuredHeight();
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
        switch (this.f41750a) {
            case 6:
                super.setAlpha(f7);
                View view = ((ProfileActivity) this.f41751b).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 10:
                super.setAlpha(f7);
                View view2 = ((lg1) this.f41751b).fragmentView;
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
        switch (this.f41750a) {
            case 12:
                if (((yh.m1) this.f41751b) != null) {
                    if (isAttachedToWindow()) {
                        yh.m1 m1Var = (yh.m1) this.f41751b;
                        if (m1Var.f48993i) {
                            m1Var.f48993i = false;
                            m1Var.a();
                            LiteMode.removeOnPowerSaverAppliedListener(m1Var.h);
                        }
                    }
                    this.f41751b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof yh.m1) {
                    this.f41751b = (yh.m1) drawable;
                    if (isAttachedToWindow()) {
                        yh.m1 m1Var2 = (yh.m1) this.f41751b;
                        if (!m1Var2.f48993i) {
                            m1Var2.f48993i = true;
                            m1Var2.a();
                            ji.p1 p1Var = new ji.p1(m1Var2, 20);
                            m1Var2.h = p1Var;
                            LiteMode.addOnPowerSaverAppliedListener(p1Var);
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

    public x50(Object obj, Context context, int i10) {
        super(context);
        this.f41750a = i10;
        this.f41751b = obj;
    }

    public x50(Context context, y50 y50Var) {
        super(context);
        this.f41750a = 0;
        this.f41751b = y50Var;
        NotificationCenter.listenEmojiLoading(this);
        setOnClickListener(new xv(10, this, context));
    }
}
