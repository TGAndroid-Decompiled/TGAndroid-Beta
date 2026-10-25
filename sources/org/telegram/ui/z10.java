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
public final class z10 extends View {
    public final int f46151a;
    public Object f46152b;

    public z10(Context context) {
        super(context);
        this.f46151a = 13;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f46151a) {
            case 1:
                super.dispatchDraw(canvas);
                f50 f50Var = (f50) this.f46152b;
                if (f50Var != null && f50Var.a(canvas, getMeasuredWidth(), 0.0f)) {
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
        switch (this.f46151a) {
            case 1:
                super.onAttachedToWindow();
                f50 f50Var = (f50) this.f46152b;
                if (f50Var != null) {
                    f50Var.f39264g = this;
                    int i10 = 0;
                    while (true) {
                        h50[] h50VarArr = f50Var.f39262c;
                        if (i10 < h50VarArr.length) {
                            h50 h50Var = h50VarArr[i10];
                            h50Var.f39897i.add(this);
                            h50Var.a();
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
                zh.m1 m1Var = (zh.m1) this.f46152b;
                if (m1Var != null && !m1Var.f53139i) {
                    m1Var.f53139i = true;
                    m1Var.a();
                    zh.l1 l1Var = new zh.l1(m1Var, 0);
                    m1Var.h = l1Var;
                    LiteMode.addOnPowerSaverAppliedListener(l1Var);
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
        switch (this.f46151a) {
            case 1:
                super.onDetachedFromWindow();
                f50 f50Var = (f50) this.f46152b;
                if (f50Var != null && f50Var.f39264g != this) {
                    int i10 = 0;
                    while (true) {
                        h50[] h50VarArr = f50Var.f39262c;
                        if (i10 < h50VarArr.length) {
                            h50 h50Var = h50VarArr[i10];
                            h50Var.f39897i.remove(this);
                            h50Var.a();
                            i10++;
                        } else {
                            f50Var.f39264g = null;
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 13:
                super.onDetachedFromWindow();
                zh.m1 m1Var = (zh.m1) this.f46152b;
                if (m1Var != null && m1Var.f53139i) {
                    m1Var.f53139i = false;
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
        switch (this.f46151a) {
            case 2:
                canvas.drawColor(((cj0) this.f46152b).getThemedColor(org.telegram.ui.ActionBar.y6.f23374e7));
                return;
            case 3:
                aq0 aq0Var = (aq0) this.f46152b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, aq0Var.f37874c.size())));
                int ceil = (int) Math.ceil(aq0Var.S.measureText(format));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ceil, AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                aq0Var.S.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.C5, false));
                aq0Var.U.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23425h5, false));
                int i10 = max / 2;
                int i11 = measuredWidth - i10;
                int i12 = i10 + measuredWidth;
                aq0Var.T.set(i11, 0.0f, i12, getMeasuredHeight());
                canvas.drawRoundRect(aq0Var.T, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), aq0Var.U);
                aq0Var.U.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.B5, false));
                aq0Var.T.set(AndroidUtilities.dp(2.0f) + i11, AndroidUtilities.dp(2.0f), i12 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(aq0Var.T, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), aq0Var.U);
                canvas.drawText(format, measuredWidth - (ceil / 2), AndroidUtilities.dp(16.2f), aq0Var.S);
                return;
            case 4:
                rq0 rq0Var = (rq0) this.f46152b;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, rq0Var.f43243c.size())));
                int ceil2 = (int) Math.ceil(rq0Var.f43250h0.measureText(format2));
                int max2 = Math.max(AndroidUtilities.dp(16.0f) + ceil2, AndroidUtilities.dp(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                rq0Var.f43250h0.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.C5, false));
                rq0Var.f43252j0.setColor(org.telegram.ui.ActionBar.y6.x0(null, rq0Var.f43265u0, false));
                int i13 = max2 / 2;
                int i14 = measuredWidth2 - i13;
                int i15 = i13 + measuredWidth2;
                rq0Var.f43251i0.set(i14, 0.0f, i15, getMeasuredHeight());
                canvas.drawRoundRect(rq0Var.f43251i0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), rq0Var.f43252j0);
                rq0Var.f43252j0.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.B5, false));
                rq0Var.f43251i0.set(AndroidUtilities.dp(2.0f) + i14, AndroidUtilities.dp(2.0f), i15 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(rq0Var.f43251i0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), rq0Var.f43252j0);
                canvas.drawText(format2, measuredWidth2 - (ceil2 / 2), AndroidUtilities.dp(16.2f), rq0Var.f43250h0);
                return;
            case 5:
                ((PhotoViewer) this.f46152b).f35751q3.a(canvas, this);
                return;
            case 6:
            case 7:
            case 9:
            case 10:
            default:
                super.onDraw(canvas);
                return;
            case 8:
                ((SecretMediaViewer) this.f46152b).Q.a(canvas, this);
                return;
            case 11:
                org.telegram.ui.Wallet.w5 w5Var = (org.telegram.ui.Wallet.w5) this.f46152b;
                float d = w5Var.K.d(w5Var.J, false);
                if (w5Var.Q != null && getWidth() > 0) {
                    org.telegram.ui.Wallet.w5.a(w5Var, canvas, d);
                    return;
                }
                return;
            case 12:
                super.onDraw(canvas);
                tg.j0 j0Var = (tg.j0) this.f46152b;
                if (j0Var.f48895p0 - j0Var.f48894o0 > 1) {
                    Paint V0 = org.telegram.ui.ActionBar.y6.V0("paintDivider", tg.j0.f0(j0Var));
                    if (V0 == null) {
                        V0 = org.telegram.ui.ActionBar.y6.f23476k0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, V0);
                    return;
                }
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f46151a) {
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                r41 r41Var = (r41) this.f46152b;
                int[] iArr = r41Var.G;
                getLocationOnScreen(iArr);
                Rect rect = r41Var.d;
                int i14 = iArr[0];
                rect.set(i14, iArr[1], getWidth() + i14, getHeight() + iArr[1]);
                AndroidUtilities.lerp(r41Var.f45958c, rect, r41Var.I, r41Var.e);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f46151a) {
            case 0:
                d20 d20Var = (d20) this.f46152b;
                if (d20Var.H) {
                    d20Var.J = (d20Var.l0().getMeasuredHeight() + d20Var.I) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp = AndroidUtilities.dp(140.0f) + d20Var.I;
                    if (AndroidUtilities.dp(24.0f) + d20Var.f38720y.getMeasuredHeight() > dp) {
                        dp = Math.max(dp, (AndroidUtilities.dp(24.0f) + d20Var.f38720y.getMeasuredHeight()) - d20Var.L);
                    }
                    d20Var.J = dp;
                }
                int i12 = (int) (d20Var.J - (0 * 2.5f));
                d20Var.J = i12;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                return;
            case 1:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(38.0f));
                return;
            case 6:
                ow0 ow0Var = (ow0) this.f46152b;
                PremiumPreviewFragment premiumPreviewFragment = ow0Var.f42299c;
                if (premiumPreviewFragment.W) {
                    premiumPreviewFragment.Y = 0;
                } else {
                    int dp2 = AndroidUtilities.dp(64.0f);
                    if (AndroidUtilities.dp(8.0f) + ow0Var.f42299c.U.getMeasuredHeight() > dp2) {
                        dp2 = ow0Var.f42299c.U.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                    }
                    ow0Var.f42299c.Y = dp2;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(ow0Var.f42299c.Y, 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f46151a) {
            case 7:
                super.setAlpha(f7);
                View view = ((ProfileActivity) this.f46152b).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 10:
                super.setAlpha(f7);
                View view2 = ((af1) this.f46152b).fragmentView;
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
        switch (this.f46151a) {
            case 13:
                if (((zh.m1) this.f46152b) != null) {
                    if (isAttachedToWindow()) {
                        zh.m1 m1Var = (zh.m1) this.f46152b;
                        if (m1Var.f53139i) {
                            m1Var.f53139i = false;
                            m1Var.a();
                            LiteMode.removeOnPowerSaverAppliedListener(m1Var.h);
                        }
                    }
                    this.f46152b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof zh.m1) {
                    this.f46152b = (zh.m1) drawable;
                    if (isAttachedToWindow()) {
                        zh.m1 m1Var2 = (zh.m1) this.f46152b;
                        if (!m1Var2.f53139i) {
                            m1Var2.f53139i = true;
                            m1Var2.a();
                            zh.l1 l1Var = new zh.l1(m1Var2, 0);
                            m1Var2.h = l1Var;
                            LiteMode.addOnPowerSaverAppliedListener(l1Var);
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

    public z10(Object obj, Context context, int i10) {
        super(context);
        this.f46151a = i10;
        this.f46152b = obj;
    }

    public z10(Context context, f50 f50Var) {
        super(context);
        this.f46151a = 1;
        this.f46152b = f50Var;
        NotificationCenter.listenEmojiLoading(this);
        setOnClickListener(new org.telegram.ui.Components.k51(21, this, context));
    }
}
