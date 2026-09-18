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
    public final int f37198a;
    public Object f37199b;

    public s50(Context context) {
        super(context);
        this.f37198a = 12;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f37198a) {
            case 0:
                super.dispatchDraw(canvas);
                t50 t50Var = (t50) this.f37199b;
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
        switch (this.f37198a) {
            case 0:
                super.onAttachedToWindow();
                t50 t50Var = (t50) this.f37199b;
                if (t50Var != null) {
                    t50Var.f37573g = this;
                    int i10 = 0;
                    while (true) {
                        v50[] v50VarArr = t50Var.f37571c;
                        if (i10 < v50VarArr.length) {
                            v50 v50Var = v50VarArr[i10];
                            v50Var.f38305i.add(this);
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
                xh.o1 o1Var = (xh.o1) this.f37199b;
                if (o1Var != null && !o1Var.f46299i) {
                    o1Var.f46299i = true;
                    o1Var.a();
                    org.telegram.ui.web.b1 b1Var = new org.telegram.ui.web.b1(o1Var, 17);
                    o1Var.h = b1Var;
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
        switch (this.f37198a) {
            case 0:
                super.onDetachedFromWindow();
                t50 t50Var = (t50) this.f37199b;
                if (t50Var != null && t50Var.f37573g != this) {
                    int i10 = 0;
                    while (true) {
                        v50[] v50VarArr = t50Var.f37571c;
                        if (i10 < v50VarArr.length) {
                            v50 v50Var = v50VarArr[i10];
                            v50Var.f38305i.remove(this);
                            v50Var.a();
                            i10++;
                        } else {
                            t50Var.f37573g = null;
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 12:
                super.onDetachedFromWindow();
                xh.o1 o1Var = (xh.o1) this.f37199b;
                if (o1Var != null && o1Var.f46299i) {
                    o1Var.f46299i = false;
                    o1Var.a();
                    LiteMode.removeOnPowerSaverAppliedListener(o1Var.h);
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
        switch (this.f37198a) {
            case 1:
                canvas.drawColor(((sj0) this.f37199b).getThemedColor(org.telegram.ui.ActionBar.j6.e7));
                return;
            case 2:
                lq0 lq0Var = (lq0) this.f37199b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, lq0Var.f35433c.size())));
                int ceil = (int) Math.ceil(lq0Var.S.measureText(format));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ceil, AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                lq0Var.S.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.C5, false));
                lq0Var.U.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19133h5, false));
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
                cr0 cr0Var = (cr0) this.f37199b;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, cr0Var.f32764c.size())));
                int ceil2 = (int) Math.ceil(cr0Var.f32771h0.measureText(format2));
                int max2 = Math.max(AndroidUtilities.dp(16.0f) + ceil2, AndroidUtilities.dp(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                cr0Var.f32771h0.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.C5, false));
                cr0Var.f32773j0.setColor(org.telegram.ui.ActionBar.j6.w0(null, cr0Var.f32786u0, false));
                int i14 = max2 / 2;
                int i15 = measuredWidth2 - i14;
                int i16 = i14 + measuredWidth2;
                cr0Var.f32772i0.set(i15, 0.0f, i16, getMeasuredHeight());
                canvas.drawRoundRect(cr0Var.f32772i0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), cr0Var.f32773j0);
                cr0Var.f32773j0.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B5, false));
                cr0Var.f32772i0.set(AndroidUtilities.dp(2.0f) + i15, AndroidUtilities.dp(2.0f), i16 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(cr0Var.f32772i0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), cr0Var.f32773j0);
                canvas.drawText(format2, measuredWidth2 - (ceil2 / 2), AndroidUtilities.dp(16.2f), cr0Var.f32771h0);
                return;
            case 4:
                ((PhotoViewer) this.f37199b).f31287q3.a(canvas, this);
                return;
            case 5:
            case 6:
            case 9:
            case 10:
            default:
                super.onDraw(canvas);
                return;
            case 7:
                e31 e31Var = (e31) this.f37199b;
                if (e31Var.K) {
                    i10 = -15590870;
                } else {
                    i10 = -6569073;
                }
                canvas.drawColor(i10);
                org.telegram.ui.Components.lc0 lc0Var = e31Var.f33162n;
                if (lc0Var != null) {
                    lc0Var.setBounds(0, 0, getWidth(), getHeight());
                }
                e31Var.h.setBounds(0, 0, getWidth(), getHeight());
                org.telegram.ui.Components.lc0 lc0Var2 = e31Var.f33162n;
                if (lc0Var2 != null) {
                    lc0Var2.draw(canvas);
                }
                e31Var.h.draw(canvas);
                super.onDraw(canvas);
                return;
            case 8:
                ((SecretMediaViewer) this.f37199b).Q.a(canvas, this);
                return;
            case 11:
                super.onDraw(canvas);
                rg.j0 j0Var = (rg.j0) this.f37199b;
                if (j0Var.f42578p0 - j0Var.f42577o0 > 1) {
                    Paint T0 = org.telegram.ui.ActionBar.j6.T0("paintDivider", rg.j0.f0(j0Var));
                    if (T0 == null) {
                        T0 = org.telegram.ui.ActionBar.j6.f19184k0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, T0);
                    return;
                }
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f37198a) {
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                v51 v51Var = (v51) this.f37199b;
                int[] iArr = v51Var.G;
                getLocationOnScreen(iArr);
                Rect rect = v51Var.d;
                int i14 = iArr[0];
                rect.set(i14, iArr[1], getWidth() + i14, getHeight() + iArr[1]);
                AndroidUtilities.lerp(v51Var.f32575c, rect, v51Var.I, v51Var.e);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        switch (this.f37198a) {
            case 0:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(38.0f));
                return;
            case 5:
                cx0 cx0Var = (cx0) this.f37199b;
                PremiumPreviewFragment premiumPreviewFragment = cx0Var.f32813c;
                if (premiumPreviewFragment.W) {
                    premiumPreviewFragment.Y = 0;
                } else {
                    int dp = AndroidUtilities.dp(64.0f);
                    if (AndroidUtilities.dp(8.0f) + cx0Var.f32813c.U.getMeasuredHeight() > dp) {
                        dp = cx0Var.f32813c.U.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                    }
                    cx0Var.f32813c.Y = dp;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(cx0Var.f32813c.Y, 1073741824));
                return;
            case 13:
                yh.v7 v7Var = (yh.v7) this.f37199b;
                if (v7Var.H) {
                    i12 = (yh.v7.C0(v7Var).getMeasuredHeight() + v7Var.I) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp2 = AndroidUtilities.dp(140.0f) + v7Var.I;
                    if (AndroidUtilities.dp(24.0f) + v7Var.f36945y.getMeasuredHeight() > dp2) {
                        dp2 = AndroidUtilities.dp(24.0f) + v7Var.f36945y.getMeasuredHeight();
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
        switch (this.f37198a) {
            case 6:
                super.setAlpha(f7);
                View view = ((ProfileActivity) this.f37199b).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 10:
                super.setAlpha(f7);
                View view2 = ((dg1) this.f37199b).fragmentView;
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
        switch (this.f37198a) {
            case 12:
                if (((xh.o1) this.f37199b) != null) {
                    if (isAttachedToWindow()) {
                        xh.o1 o1Var = (xh.o1) this.f37199b;
                        if (o1Var.f46299i) {
                            o1Var.f46299i = false;
                            o1Var.a();
                            LiteMode.removeOnPowerSaverAppliedListener(o1Var.h);
                        }
                    }
                    this.f37199b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof xh.o1) {
                    this.f37199b = (xh.o1) drawable;
                    if (isAttachedToWindow()) {
                        xh.o1 o1Var2 = (xh.o1) this.f37199b;
                        if (!o1Var2.f46299i) {
                            o1Var2.f46299i = true;
                            o1Var2.a();
                            org.telegram.ui.web.b1 b1Var = new org.telegram.ui.web.b1(o1Var2, 17);
                            o1Var2.h = b1Var;
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
        this.f37198a = i10;
        this.f37199b = obj;
    }

    public s50(Context context, t50 t50Var) {
        super(context);
        this.f37198a = 0;
        this.f37199b = t50Var;
        NotificationCenter.listenEmojiLoading(this);
        setOnClickListener(new tv(10, this, context));
    }
}
