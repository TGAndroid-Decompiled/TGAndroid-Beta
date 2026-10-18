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
public final class x10 extends View {
    public final int f42958a;
    public Object f42959b;

    public x10(Context context) {
        super(context);
        this.f42958a = 13;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f42958a) {
            case 1:
                super.dispatchDraw(canvas);
                d50 d50Var = (d50) this.f42959b;
                if (d50Var != null && d50Var.a(canvas, getMeasuredWidth(), 0.0f)) {
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
        switch (this.f42958a) {
            case 1:
                super.onAttachedToWindow();
                d50 d50Var = (d50) this.f42959b;
                if (d50Var != null) {
                    d50Var.f36065g = this;
                    int i10 = 0;
                    while (true) {
                        f50[] f50VarArr = d50Var.f36063c;
                        if (i10 < f50VarArr.length) {
                            f50 f50Var = f50VarArr[i10];
                            f50Var.f36811i.add(this);
                            f50Var.a();
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
                yh.l1 l1Var = (yh.l1) this.f42959b;
                if (l1Var != null && !l1Var.f50358i) {
                    l1Var.f50358i = true;
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
        switch (this.f42958a) {
            case 1:
                super.onDetachedFromWindow();
                d50 d50Var = (d50) this.f42959b;
                if (d50Var != null && d50Var.f36065g != this) {
                    int i10 = 0;
                    while (true) {
                        f50[] f50VarArr = d50Var.f36063c;
                        if (i10 < f50VarArr.length) {
                            f50 f50Var = f50VarArr[i10];
                            f50Var.f36811i.remove(this);
                            f50Var.a();
                            i10++;
                        } else {
                            d50Var.f36065g = null;
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 13:
                super.onDetachedFromWindow();
                yh.l1 l1Var = (yh.l1) this.f42959b;
                if (l1Var != null && l1Var.f50358i) {
                    l1Var.f50358i = false;
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
    public void onDraw(final Canvas canvas) {
        switch (this.f42958a) {
            case 2:
                canvas.drawColor(((cj0) this.f42959b).getThemedColor(org.telegram.ui.ActionBar.h6.e7));
                return;
            case 3:
                up0 up0Var = (up0) this.f42959b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, up0Var.f42001c.size())));
                int ceil = (int) Math.ceil(up0Var.S.measureText(format));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ceil, AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                up0Var.S.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.C5, false));
                up0Var.U.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21057h5, false));
                int i10 = max / 2;
                int i11 = measuredWidth - i10;
                int i12 = i10 + measuredWidth;
                up0Var.T.set(i11, 0.0f, i12, getMeasuredHeight());
                canvas.drawRoundRect(up0Var.T, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), up0Var.U);
                up0Var.U.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.B5, false));
                up0Var.T.set(AndroidUtilities.dp(2.0f) + i11, AndroidUtilities.dp(2.0f), i12 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(up0Var.T, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), up0Var.U);
                canvas.drawText(format, measuredWidth - (ceil / 2), AndroidUtilities.dp(16.2f), up0Var.S);
                return;
            case 4:
                lq0 lq0Var = (lq0) this.f42959b;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, lq0Var.f38871c.size())));
                int ceil2 = (int) Math.ceil(lq0Var.f38878h0.measureText(format2));
                int max2 = Math.max(AndroidUtilities.dp(16.0f) + ceil2, AndroidUtilities.dp(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                lq0Var.f38878h0.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.C5, false));
                lq0Var.f38880j0.setColor(org.telegram.ui.ActionBar.h6.x0(null, lq0Var.f38893u0, false));
                int i13 = max2 / 2;
                int i14 = measuredWidth2 - i13;
                int i15 = i13 + measuredWidth2;
                lq0Var.f38879i0.set(i14, 0.0f, i15, getMeasuredHeight());
                canvas.drawRoundRect(lq0Var.f38879i0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), lq0Var.f38880j0);
                lq0Var.f38880j0.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.B5, false));
                lq0Var.f38879i0.set(AndroidUtilities.dp(2.0f) + i14, AndroidUtilities.dp(2.0f), i15 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(lq0Var.f38879i0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), lq0Var.f38880j0);
                canvas.drawText(format2, measuredWidth2 - (ceil2 / 2), AndroidUtilities.dp(16.2f), lq0Var.f38878h0);
                return;
            case 5:
                ((PhotoViewer) this.f42959b).f33373q3.a(canvas, this);
                return;
            case 6:
            case 7:
            case 9:
            case 10:
            default:
                super.onDraw(canvas);
                return;
            case 8:
                ((SecretMediaViewer) this.f42959b).Q.a(canvas, this);
                return;
            case 11:
                final org.telegram.ui.Wallet.x5 x5Var = (org.telegram.ui.Wallet.x5) this.f42959b;
                float d = x5Var.L.d(x5Var.K, false);
                if (x5Var.R != null && d > 0.0f && getWidth() > 0) {
                    float width = x5Var.getFrontFace().getWidth() / 1640.0f;
                    Paint paint = x5Var.J;
                    paint.setTypeface(org.telegram.ui.Wallet.x5.f(x5Var.getContext()));
                    paint.setTextSize(47.345238f * width);
                    paint.setTextAlign(Paint.Align.CENTER);
                    paint.setColor(org.telegram.ui.Wallet.h7.b(x5Var.f35085b0));
                    paint.setAlpha((int) (255.0f * d));
                    Paint.FontMetrics fontMetrics = paint.getFontMetrics();
                    final float f7 = 0.5f * (-(fontMetrics.ascent + fontMetrics.descent));
                    final float f10 = 27.333332f * width;
                    final String[] split = org.telegram.ui.Wallet.x5.e(x5Var.R).split("\\n");
                    canvas.save();
                    canvas.translate(width * 1527.738f, 0.5002976f * x5Var.getFrontFace().getHeight());
                    canvas.rotate(90.0f);
                    x5Var.b(d, false, new org.telegram.ui.Wallet.o2(x5Var, 2), new Runnable() {
                        @Override
                        public final void run() {
                            x5 x5Var2 = x5.this;
                            x5Var2.getClass();
                            String[] strArr = split;
                            String str = strArr[0];
                            float f11 = f10;
                            float f12 = f7;
                            Paint paint2 = x5Var2.J;
                            Canvas canvas2 = canvas;
                            canvas2.drawText(str, 0.0f, (-f11) + f12, paint2);
                            if (strArr.length > 1) {
                                canvas2.drawText(strArr[1], 0.0f, f11 + f12, paint2);
                            }
                        }
                    });
                    canvas.restore();
                    return;
                }
                return;
            case 12:
                super.onDraw(canvas);
                sg.k0 k0Var = (sg.k0) this.f42959b;
                if (k0Var.f46293p0 - k0Var.f46292o0 > 1) {
                    Paint U0 = org.telegram.ui.ActionBar.h6.U0("paintDivider", sg.k0.g0(k0Var));
                    if (U0 == null) {
                        U0 = org.telegram.ui.ActionBar.h6.f21107k0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, U0);
                    return;
                }
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f42958a) {
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                o41 o41Var = (o41) this.f42959b;
                int[] iArr = o41Var.G;
                getLocationOnScreen(iArr);
                Rect rect = o41Var.d;
                int i14 = iArr[0];
                rect.set(i14, iArr[1], getWidth() + i14, getHeight() + iArr[1]);
                AndroidUtilities.lerp(o41Var.f42100c, rect, o41Var.I, o41Var.e);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f42958a) {
            case 0:
                a20 a20Var = (a20) this.f42959b;
                if (a20Var.H) {
                    int i12 = a20Var.I;
                    kVar = ((org.telegram.ui.ActionBar.n2) a20Var).actionBar;
                    a20Var.J = (kVar.getMeasuredHeight() + i12) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp = AndroidUtilities.dp(140.0f) + a20Var.I;
                    if (AndroidUtilities.dp(24.0f) + a20Var.f35249y.getMeasuredHeight() > dp) {
                        dp = Math.max(dp, (AndroidUtilities.dp(24.0f) + a20Var.f35249y.getMeasuredHeight()) - a20Var.L);
                    }
                    a20Var.J = dp;
                }
                int i13 = (int) (a20Var.J - (0 * 2.5f));
                a20Var.J = i13;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
                return;
            case 1:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(38.0f));
                return;
            case 6:
                iw0 iw0Var = (iw0) this.f42959b;
                PremiumPreviewFragment premiumPreviewFragment = iw0Var.f37989c;
                if (premiumPreviewFragment.W) {
                    premiumPreviewFragment.Y = 0;
                } else {
                    int dp2 = AndroidUtilities.dp(64.0f);
                    if (AndroidUtilities.dp(8.0f) + iw0Var.f37989c.U.getMeasuredHeight() > dp2) {
                        dp2 = iw0Var.f37989c.U.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                    }
                    iw0Var.f37989c.Y = dp2;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(iw0Var.f37989c.Y, 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f42958a) {
            case 7:
                super.setAlpha(f7);
                View view = ((ProfileActivity) this.f42959b).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 10:
                super.setAlpha(f7);
                View view2 = ((te1) this.f42959b).fragmentView;
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
        switch (this.f42958a) {
            case 13:
                if (((yh.l1) this.f42959b) != null) {
                    if (isAttachedToWindow()) {
                        yh.l1 l1Var = (yh.l1) this.f42959b;
                        if (l1Var.f50358i) {
                            l1Var.f50358i = false;
                            l1Var.a();
                            LiteMode.removeOnPowerSaverAppliedListener(l1Var.h);
                        }
                    }
                    this.f42959b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof yh.l1) {
                    this.f42959b = (yh.l1) drawable;
                    if (isAttachedToWindow()) {
                        yh.l1 l1Var2 = (yh.l1) this.f42959b;
                        if (!l1Var2.f50358i) {
                            l1Var2.f50358i = true;
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

    public x10(Object obj, Context context, int i10) {
        super(context);
        this.f42958a = i10;
        this.f42959b = obj;
    }

    public x10(Context context, d50 d50Var) {
        super(context);
        this.f42958a = 1;
        this.f42959b = d50Var;
        NotificationCenter.listenEmojiLoading(this);
        setOnClickListener(new org.telegram.ui.Components.g51(20, this, context));
    }
}
