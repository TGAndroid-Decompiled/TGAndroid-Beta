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
    public final int f36839a;
    public Object f36840b;

    public t50(Context context) {
        super(context);
        this.f36839a = 12;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f36839a) {
            case 0:
                super.dispatchDraw(canvas);
                u50 u50Var = (u50) this.f36840b;
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
        switch (this.f36839a) {
            case 0:
                super.onAttachedToWindow();
                u50 u50Var = (u50) this.f36840b;
                if (u50Var != null) {
                    u50Var.f37115g = this;
                    int i10 = 0;
                    while (true) {
                        w50[] w50VarArr = u50Var.f37113c;
                        if (i10 < w50VarArr.length) {
                            w50 w50Var = w50VarArr[i10];
                            w50Var.f37720i.add(this);
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
                wh.m1 m1Var = (wh.m1) this.f36840b;
                if (m1Var != null && !m1Var.f44245i) {
                    m1Var.f44245i = true;
                    m1Var.a();
                    org.telegram.ui.web.y1 y1Var = new org.telegram.ui.web.y1(m1Var, 13);
                    m1Var.h = y1Var;
                    LiteMode.addOnPowerSaverAppliedListener(y1Var);
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
        switch (this.f36839a) {
            case 0:
                super.onDetachedFromWindow();
                u50 u50Var = (u50) this.f36840b;
                if (u50Var != null && u50Var.f37115g != this) {
                    int i10 = 0;
                    while (true) {
                        w50[] w50VarArr = u50Var.f37113c;
                        if (i10 < w50VarArr.length) {
                            w50 w50Var = w50VarArr[i10];
                            w50Var.f37720i.remove(this);
                            w50Var.a();
                            i10++;
                        } else {
                            u50Var.f37115g = null;
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 12:
                super.onDetachedFromWindow();
                wh.m1 m1Var = (wh.m1) this.f36840b;
                if (m1Var != null && m1Var.f44245i) {
                    m1Var.f44245i = false;
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
        switch (this.f36839a) {
            case 1:
                canvas.drawColor(((sj0) this.f36840b).getThemedColor(org.telegram.ui.ActionBar.j6.e7));
                return;
            case 2:
                kq0 kq0Var = (kq0) this.f36840b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, kq0Var.f34440c.size())));
                int ceil = (int) Math.ceil(kq0Var.S.measureText(format));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ceil, AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                kq0Var.S.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.C5, false));
                kq0Var.U.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17998h5, false));
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
                br0 br0Var = (br0) this.f36840b;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, br0Var.f31367c.size())));
                int ceil2 = (int) Math.ceil(br0Var.f31374h0.measureText(format2));
                int max2 = Math.max(AndroidUtilities.dp(16.0f) + ceil2, AndroidUtilities.dp(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                br0Var.f31374h0.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.C5, false));
                br0Var.f31376j0.setColor(org.telegram.ui.ActionBar.j6.w0(null, br0Var.f31389u0, false));
                int i14 = max2 / 2;
                int i15 = measuredWidth2 - i14;
                int i16 = i14 + measuredWidth2;
                br0Var.f31375i0.set(i15, 0.0f, i16, getMeasuredHeight());
                canvas.drawRoundRect(br0Var.f31375i0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), br0Var.f31376j0);
                br0Var.f31376j0.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.B5, false));
                br0Var.f31375i0.set(AndroidUtilities.dp(2.0f) + i15, AndroidUtilities.dp(2.0f), i16 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(br0Var.f31375i0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), br0Var.f31376j0);
                canvas.drawText(format2, measuredWidth2 - (ceil2 / 2), AndroidUtilities.dp(16.2f), br0Var.f31374h0);
                return;
            case 4:
                ((PhotoViewer) this.f36840b).f30155q3.a(canvas, this);
                return;
            case 5:
            case 6:
            case 9:
            case 10:
            default:
                super.onDraw(canvas);
                return;
            case 7:
                k31 k31Var = (k31) this.f36840b;
                if (k31Var.K) {
                    i10 = -15590870;
                } else {
                    i10 = -6569073;
                }
                canvas.drawColor(i10);
                org.telegram.ui.Components.lc0 lc0Var = k31Var.f34213n;
                if (lc0Var != null) {
                    lc0Var.setBounds(0, 0, getWidth(), getHeight());
                }
                k31Var.h.setBounds(0, 0, getWidth(), getHeight());
                org.telegram.ui.Components.lc0 lc0Var2 = k31Var.f34213n;
                if (lc0Var2 != null) {
                    lc0Var2.draw(canvas);
                }
                k31Var.h.draw(canvas);
                super.onDraw(canvas);
                return;
            case 8:
                ((SecretMediaViewer) this.f36840b).Q.a(canvas, this);
                return;
            case 11:
                super.onDraw(canvas);
                qg.k0 k0Var = (qg.k0) this.f36840b;
                if (k0Var.f40778p0 - k0Var.f40777o0 > 1) {
                    Paint T0 = org.telegram.ui.ActionBar.j6.T0("paintDivider", qg.k0.f0(k0Var));
                    if (T0 == null) {
                        T0 = org.telegram.ui.ActionBar.j6.f18049k0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, T0);
                    return;
                }
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f36839a) {
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                a61 a61Var = (a61) this.f36840b;
                int[] iArr = a61Var.G;
                getLocationOnScreen(iArr);
                Rect rect = a61Var.d;
                int i14 = iArr[0];
                rect.set(i14, iArr[1], getWidth() + i14, getHeight() + iArr[1]);
                AndroidUtilities.lerp(a61Var.f33292c, rect, a61Var.I, a61Var.e);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        switch (this.f36839a) {
            case 0:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(38.0f));
                return;
            case 5:
                ex0 ex0Var = (ex0) this.f36840b;
                PremiumPreviewFragment premiumPreviewFragment = ex0Var.f32642c;
                if (premiumPreviewFragment.W) {
                    premiumPreviewFragment.Y = 0;
                } else {
                    int dp = AndroidUtilities.dp(64.0f);
                    if (AndroidUtilities.dp(8.0f) + ex0Var.f32642c.U.getMeasuredHeight() > dp) {
                        dp = ex0Var.f32642c.U.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                    }
                    ex0Var.f32642c.Y = dp;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(ex0Var.f32642c.Y, 1073741824));
                return;
            case 13:
                xh.z7 z7Var = (xh.z7) this.f36840b;
                if (z7Var.H) {
                    i12 = (xh.z7.C0(z7Var).getMeasuredHeight() + z7Var.I) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp2 = AndroidUtilities.dp(140.0f) + z7Var.I;
                    if (AndroidUtilities.dp(24.0f) + z7Var.f36534y.getMeasuredHeight() > dp2) {
                        dp2 = AndroidUtilities.dp(24.0f) + z7Var.f36534y.getMeasuredHeight();
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
        switch (this.f36839a) {
            case 6:
                super.setAlpha(f7);
                View view = ((ProfileActivity) this.f36840b).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 10:
                super.setAlpha(f7);
                View view2 = ((ig1) this.f36840b).fragmentView;
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
        switch (this.f36839a) {
            case 12:
                if (((wh.m1) this.f36840b) != null) {
                    if (isAttachedToWindow()) {
                        wh.m1 m1Var = (wh.m1) this.f36840b;
                        if (m1Var.f44245i) {
                            m1Var.f44245i = false;
                            m1Var.a();
                            LiteMode.removeOnPowerSaverAppliedListener(m1Var.h);
                        }
                    }
                    this.f36840b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof wh.m1) {
                    this.f36840b = (wh.m1) drawable;
                    if (isAttachedToWindow()) {
                        wh.m1 m1Var2 = (wh.m1) this.f36840b;
                        if (!m1Var2.f44245i) {
                            m1Var2.f44245i = true;
                            m1Var2.a();
                            org.telegram.ui.web.y1 y1Var = new org.telegram.ui.web.y1(m1Var2, 13);
                            m1Var2.h = y1Var;
                            LiteMode.addOnPowerSaverAppliedListener(y1Var);
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
        this.f36839a = i10;
        this.f36840b = obj;
    }

    public t50(Context context, u50 u50Var) {
        super(context);
        this.f36839a = 0;
        this.f36840b = u50Var;
        NotificationCenter.listenEmojiLoading(this);
        setOnClickListener(new ow(7, this, context));
    }
}
