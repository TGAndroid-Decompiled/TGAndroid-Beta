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
    public final int f37254a;
    public Object f37255b;

    public s50(Context context) {
        super(context);
        this.f37254a = 12;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f37254a) {
            case 0:
                super.dispatchDraw(canvas);
                t50 t50Var = (t50) this.f37255b;
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
        switch (this.f37254a) {
            case 0:
                super.onAttachedToWindow();
                t50 t50Var = (t50) this.f37255b;
                if (t50Var != null) {
                    t50Var.f37556g = this;
                    int i10 = 0;
                    while (true) {
                        v50[] v50VarArr = t50Var.f37554c;
                        if (i10 < v50VarArr.length) {
                            v50 v50Var = v50VarArr[i10];
                            v50Var.f38364i.add(this);
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
                xh.n1 n1Var = (xh.n1) this.f37255b;
                if (n1Var != null && !n1Var.f46033i) {
                    n1Var.f46033i = true;
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
        switch (this.f37254a) {
            case 0:
                super.onDetachedFromWindow();
                t50 t50Var = (t50) this.f37255b;
                if (t50Var != null && t50Var.f37556g != this) {
                    int i10 = 0;
                    while (true) {
                        v50[] v50VarArr = t50Var.f37554c;
                        if (i10 < v50VarArr.length) {
                            v50 v50Var = v50VarArr[i10];
                            v50Var.f38364i.remove(this);
                            v50Var.a();
                            i10++;
                        } else {
                            t50Var.f37556g = null;
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 12:
                super.onDetachedFromWindow();
                xh.n1 n1Var = (xh.n1) this.f37255b;
                if (n1Var != null && n1Var.f46033i) {
                    n1Var.f46033i = false;
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
        switch (this.f37254a) {
            case 1:
                canvas.drawColor(((rj0) this.f37255b).getThemedColor(org.telegram.ui.ActionBar.i6.e7));
                return;
            case 2:
                jq0 jq0Var = (jq0) this.f37255b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, jq0Var.f34953c.size())));
                int ceil = (int) Math.ceil(jq0Var.S.measureText(format));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ceil, AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                jq0Var.S.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.C5, false));
                jq0Var.U.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18907h5, false));
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
                ar0 ar0Var = (ar0) this.f37255b;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, ar0Var.f31912c.size())));
                int ceil2 = (int) Math.ceil(ar0Var.f31919h0.measureText(format2));
                int max2 = Math.max(AndroidUtilities.dp(16.0f) + ceil2, AndroidUtilities.dp(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                ar0Var.f31919h0.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.C5, false));
                ar0Var.f31921j0.setColor(org.telegram.ui.ActionBar.i6.w0(null, ar0Var.f31934u0, false));
                int i14 = max2 / 2;
                int i15 = measuredWidth2 - i14;
                int i16 = i14 + measuredWidth2;
                ar0Var.f31920i0.set(i15, 0.0f, i16, getMeasuredHeight());
                canvas.drawRoundRect(ar0Var.f31920i0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), ar0Var.f31921j0);
                ar0Var.f31921j0.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.B5, false));
                ar0Var.f31920i0.set(AndroidUtilities.dp(2.0f) + i15, AndroidUtilities.dp(2.0f), i16 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(ar0Var.f31920i0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), ar0Var.f31921j0);
                canvas.drawText(format2, measuredWidth2 - (ceil2 / 2), AndroidUtilities.dp(16.2f), ar0Var.f31919h0);
                return;
            case 4:
                ((PhotoViewer) this.f37255b).f31042q3.a(canvas, this);
                return;
            case 5:
            case 6:
            case 9:
            case 10:
            default:
                super.onDraw(canvas);
                return;
            case 7:
                e31 e31Var = (e31) this.f37255b;
                if (e31Var.K) {
                    i10 = -15590870;
                } else {
                    i10 = -6569073;
                }
                canvas.drawColor(i10);
                org.telegram.ui.Components.cc0 cc0Var = e31Var.f33203n;
                if (cc0Var != null) {
                    cc0Var.setBounds(0, 0, getWidth(), getHeight());
                }
                e31Var.h.setBounds(0, 0, getWidth(), getHeight());
                org.telegram.ui.Components.cc0 cc0Var2 = e31Var.f33203n;
                if (cc0Var2 != null) {
                    cc0Var2.draw(canvas);
                }
                e31Var.h.draw(canvas);
                super.onDraw(canvas);
                return;
            case 8:
                ((SecretMediaViewer) this.f37255b).Q.a(canvas, this);
                return;
            case 11:
                super.onDraw(canvas);
                rg.j0 j0Var = (rg.j0) this.f37255b;
                if (j0Var.f42324p0 - j0Var.f42323o0 > 1) {
                    Paint T0 = org.telegram.ui.ActionBar.i6.T0("paintDivider", rg.j0.f0(j0Var));
                    if (T0 == null) {
                        T0 = org.telegram.ui.ActionBar.i6.f18958k0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, T0);
                    return;
                }
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f37254a) {
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                v51 v51Var = (v51) this.f37255b;
                int[] iArr = v51Var.G;
                getLocationOnScreen(iArr);
                Rect rect = v51Var.d;
                int i14 = iArr[0];
                rect.set(i14, iArr[1], getWidth() + i14, getHeight() + iArr[1]);
                AndroidUtilities.lerp(v51Var.f32700c, rect, v51Var.I, v51Var.e);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        switch (this.f37254a) {
            case 0:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(38.0f));
                return;
            case 5:
                cx0 cx0Var = (cx0) this.f37255b;
                PremiumPreviewFragment premiumPreviewFragment = cx0Var.f32874c;
                if (premiumPreviewFragment.W) {
                    premiumPreviewFragment.Y = 0;
                } else {
                    int dp = AndroidUtilities.dp(64.0f);
                    if (AndroidUtilities.dp(8.0f) + cx0Var.f32874c.U.getMeasuredHeight() > dp) {
                        dp = cx0Var.f32874c.U.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                    }
                    cx0Var.f32874c.Y = dp;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(cx0Var.f32874c.Y, 1073741824));
                return;
            case 13:
                yh.y7 y7Var = (yh.y7) this.f37255b;
                if (y7Var.H) {
                    i12 = (yh.y7.C0(y7Var).getMeasuredHeight() + y7Var.I) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp2 = AndroidUtilities.dp(140.0f) + y7Var.I;
                    if (AndroidUtilities.dp(24.0f) + y7Var.f37005y.getMeasuredHeight() > dp2) {
                        dp2 = AndroidUtilities.dp(24.0f) + y7Var.f37005y.getMeasuredHeight();
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
        switch (this.f37254a) {
            case 6:
                super.setAlpha(f7);
                View view = ((ProfileActivity) this.f37255b).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 10:
                super.setAlpha(f7);
                View view2 = ((dg1) this.f37255b).fragmentView;
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
        switch (this.f37254a) {
            case 12:
                if (((xh.n1) this.f37255b) != null) {
                    if (isAttachedToWindow()) {
                        xh.n1 n1Var = (xh.n1) this.f37255b;
                        if (n1Var.f46033i) {
                            n1Var.f46033i = false;
                            n1Var.a();
                            LiteMode.removeOnPowerSaverAppliedListener(n1Var.h);
                        }
                    }
                    this.f37255b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof xh.n1) {
                    this.f37255b = (xh.n1) drawable;
                    if (isAttachedToWindow()) {
                        xh.n1 n1Var2 = (xh.n1) this.f37255b;
                        if (!n1Var2.f46033i) {
                            n1Var2.f46033i = true;
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
        this.f37254a = i10;
        this.f37255b = obj;
    }

    public s50(Context context, t50 t50Var) {
        super(context);
        this.f37254a = 0;
        this.f37255b = t50Var;
        NotificationCenter.listenEmojiLoading(this);
        setOnClickListener(new sv(10, this, context));
    }
}
