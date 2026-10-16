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
    public final int f41434a;
    public Object f41435b;

    public x50(Context context) {
        super(context);
        this.f41434a = 12;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f41434a) {
            case 0:
                super.dispatchDraw(canvas);
                y50 y50Var = (y50) this.f41435b;
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
        switch (this.f41434a) {
            case 0:
                super.onAttachedToWindow();
                y50 y50Var = (y50) this.f41435b;
                if (y50Var != null) {
                    y50Var.f41739g = this;
                    int i10 = 0;
                    while (true) {
                        a60[] a60VarArr = y50Var.f41737c;
                        if (i10 < a60VarArr.length) {
                            a60 a60Var = a60VarArr[i10];
                            a60Var.f33754i.add(this);
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
                yh.m1 m1Var = (yh.m1) this.f41435b;
                if (m1Var != null && !m1Var.f48992i) {
                    m1Var.f48992i = true;
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
        switch (this.f41434a) {
            case 0:
                super.onDetachedFromWindow();
                y50 y50Var = (y50) this.f41435b;
                if (y50Var != null && y50Var.f41739g != this) {
                    int i10 = 0;
                    while (true) {
                        a60[] a60VarArr = y50Var.f41737c;
                        if (i10 < a60VarArr.length) {
                            a60 a60Var = a60VarArr[i10];
                            a60Var.f33754i.remove(this);
                            a60Var.a();
                            i10++;
                        } else {
                            y50Var.f41739g = null;
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 12:
                super.onDetachedFromWindow();
                yh.m1 m1Var = (yh.m1) this.f41435b;
                if (m1Var != null && m1Var.f48992i) {
                    m1Var.f48992i = false;
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
        switch (this.f41434a) {
            case 1:
                canvas.drawColor(((wj0) this.f41435b).getThemedColor(org.telegram.ui.ActionBar.g6.e7));
                return;
            case 2:
                oq0 oq0Var = (oq0) this.f41435b;
                String format = String.format("%d", Integer.valueOf(Math.max(1, oq0Var.f38730c.size())));
                int ceil = (int) Math.ceil(oq0Var.S.measureText(format));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ceil, AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                oq0Var.S.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.C5, false));
                oq0Var.U.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19672h5, false));
                int i11 = max / 2;
                int i12 = measuredWidth - i11;
                int i13 = i11 + measuredWidth;
                oq0Var.T.set(i12, 0.0f, i13, getMeasuredHeight());
                canvas.drawRoundRect(oq0Var.T, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), oq0Var.U);
                oq0Var.U.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.B5, false));
                oq0Var.T.set(AndroidUtilities.dp(2.0f) + i12, AndroidUtilities.dp(2.0f), i13 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(oq0Var.T, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), oq0Var.U);
                canvas.drawText(format, measuredWidth - (ceil / 2), AndroidUtilities.dp(16.2f), oq0Var.S);
                return;
            case 3:
                fr0 fr0Var = (fr0) this.f41435b;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, fr0Var.f35915c.size())));
                int ceil2 = (int) Math.ceil(fr0Var.f35922h0.measureText(format2));
                int max2 = Math.max(AndroidUtilities.dp(16.0f) + ceil2, AndroidUtilities.dp(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                fr0Var.f35922h0.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.C5, false));
                fr0Var.f35924j0.setColor(org.telegram.ui.ActionBar.g6.x0(null, fr0Var.f35937u0, false));
                int i14 = max2 / 2;
                int i15 = measuredWidth2 - i14;
                int i16 = i14 + measuredWidth2;
                fr0Var.f35923i0.set(i15, 0.0f, i16, getMeasuredHeight());
                canvas.drawRoundRect(fr0Var.f35923i0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), fr0Var.f35924j0);
                fr0Var.f35924j0.setColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.B5, false));
                fr0Var.f35923i0.set(AndroidUtilities.dp(2.0f) + i15, AndroidUtilities.dp(2.0f), i16 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(fr0Var.f35923i0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), fr0Var.f35924j0);
                canvas.drawText(format2, measuredWidth2 - (ceil2 / 2), AndroidUtilities.dp(16.2f), fr0Var.f35922h0);
                return;
            case 4:
                ((PhotoViewer) this.f41435b).f32035q3.a(canvas, this);
                return;
            case 5:
            case 6:
            case 9:
            case 10:
            default:
                super.onDraw(canvas);
                return;
            case 7:
                l31 l31Var = (l31) this.f41435b;
                if (l31Var.K) {
                    i10 = -15590870;
                } else {
                    i10 = -6569073;
                }
                canvas.drawColor(i10);
                org.telegram.ui.Components.cd0 cd0Var = l31Var.f37596n;
                if (cd0Var != null) {
                    cd0Var.setBounds(0, 0, getWidth(), getHeight());
                }
                l31Var.h.setBounds(0, 0, getWidth(), getHeight());
                org.telegram.ui.Components.cd0 cd0Var2 = l31Var.f37596n;
                if (cd0Var2 != null) {
                    cd0Var2.draw(canvas);
                }
                l31Var.h.draw(canvas);
                super.onDraw(canvas);
                return;
            case 8:
                ((SecretMediaViewer) this.f41435b).Q.a(canvas, this);
                return;
            case 11:
                super.onDraw(canvas);
                sg.j0 j0Var = (sg.j0) this.f41435b;
                if (j0Var.f45217p0 - j0Var.f45216o0 > 1) {
                    Paint U0 = org.telegram.ui.ActionBar.g6.U0("paintDivider", sg.j0.g0(j0Var));
                    if (U0 == null) {
                        U0 = org.telegram.ui.ActionBar.g6.f19722k0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, U0);
                    return;
                }
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f41434a) {
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                g61 g61Var = (g61) this.f41435b;
                int[] iArr = g61Var.G;
                getLocationOnScreen(iArr);
                Rect rect = g61Var.d;
                int i14 = iArr[0];
                rect.set(i14, iArr[1], getWidth() + i14, getHeight() + iArr[1]);
                AndroidUtilities.lerp(g61Var.f38272c, rect, g61Var.I, g61Var.e);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        switch (this.f41434a) {
            case 0:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(38.0f));
                return;
            case 5:
                ix0 ix0Var = (ix0) this.f41435b;
                PremiumPreviewFragment premiumPreviewFragment = ix0Var.f36886c;
                if (premiumPreviewFragment.W) {
                    premiumPreviewFragment.Y = 0;
                } else {
                    int dp = AndroidUtilities.dp(64.0f);
                    if (AndroidUtilities.dp(8.0f) + ix0Var.f36886c.U.getMeasuredHeight() > dp) {
                        dp = ix0Var.f36886c.U.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                    }
                    ix0Var.f36886c.Y = dp;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(ix0Var.f36886c.Y, 1073741824));
                return;
            case 13:
                zh.p7 p7Var = (zh.p7) this.f41435b;
                if (p7Var.H) {
                    i12 = (zh.p7.D0(p7Var).getMeasuredHeight() + p7Var.I) - AndroidUtilities.dp(16.0f);
                } else {
                    int dp2 = AndroidUtilities.dp(140.0f) + p7Var.I;
                    if (AndroidUtilities.dp(24.0f) + p7Var.f40555y.getMeasuredHeight() > dp2) {
                        dp2 = AndroidUtilities.dp(24.0f) + p7Var.f40555y.getMeasuredHeight();
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
        switch (this.f41434a) {
            case 6:
                super.setAlpha(f7);
                View view = ((ProfileActivity) this.f41435b).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 10:
                super.setAlpha(f7);
                View view2 = ((kg1) this.f41435b).fragmentView;
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
        switch (this.f41434a) {
            case 12:
                if (((yh.m1) this.f41435b) != null) {
                    if (isAttachedToWindow()) {
                        yh.m1 m1Var = (yh.m1) this.f41435b;
                        if (m1Var.f48992i) {
                            m1Var.f48992i = false;
                            m1Var.a();
                            LiteMode.removeOnPowerSaverAppliedListener(m1Var.h);
                        }
                    }
                    this.f41435b = null;
                }
                super.setBackground(drawable);
                if (drawable instanceof yh.m1) {
                    this.f41435b = (yh.m1) drawable;
                    if (isAttachedToWindow()) {
                        yh.m1 m1Var2 = (yh.m1) this.f41435b;
                        if (!m1Var2.f48992i) {
                            m1Var2.f48992i = true;
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
        this.f41434a = i10;
        this.f41435b = obj;
    }

    public x50(Context context, y50 y50Var) {
        super(context);
        this.f41434a = 0;
        this.f41435b = y50Var;
        NotificationCenter.listenEmojiLoading(this);
        setOnClickListener(new xv(10, this, context));
    }
}
