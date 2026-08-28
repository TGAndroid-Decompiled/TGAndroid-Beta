package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.CheckBoxBase;
public final class yi0 extends View {
    public final int f44883a;
    public final Object f44884b;

    public yi0(Object obj, Context context, int i9) {
        super(context);
        this.f44883a = i9;
        this.f44884b = obj;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f44883a) {
            case 10:
                ig.b bVar = ((pg.f) this.f44884b).E;
                if (bVar != null) {
                    bVar.draw(canvas);
                }
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f44883a) {
            case 12:
                super.onAttachedToWindow();
                ((CheckBoxBase) this.f44884b).f26308l = true;
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f44883a) {
            case 12:
                super.onDetachedFromWindow();
                ((CheckBoxBase) this.f44884b).f26308l = false;
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        int i9;
        int i10 = this.f44883a;
        Object obj = this.f44884b;
        switch (i10) {
            case 0:
                canvas.drawColor(((bj0) obj).getThemedColor(org.telegram.ui.ActionBar.f6.f23020e7));
                return;
            case 1:
                ip0 ip0Var = (ip0) obj;
                String format = String.format("%d", Integer.valueOf(Math.max(1, ip0Var.f39241c.size())));
                int ceil = (int) Math.ceil(ip0Var.O.measureText(format));
                int max = Math.max(AndroidUtilities.dp(16.0f) + ceil, AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                ip0Var.O.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.C5, false));
                ip0Var.Q.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23072h5, false));
                int i11 = max / 2;
                int i12 = measuredWidth - i11;
                int i13 = i11 + measuredWidth;
                ip0Var.P.set(i12, 0.0f, i13, getMeasuredHeight());
                canvas.drawRoundRect(ip0Var.P, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), ip0Var.Q);
                ip0Var.Q.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.B5, false));
                ip0Var.P.set(AndroidUtilities.dp(2.0f) + i12, AndroidUtilities.dp(2.0f), i13 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(ip0Var.P, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), ip0Var.Q);
                canvas.drawText(format, measuredWidth - (ceil / 2), AndroidUtilities.dp(16.2f), ip0Var.O);
                return;
            case 2:
                zp0 zp0Var = (zp0) obj;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, zp0Var.f45210c.size())));
                int ceil2 = (int) Math.ceil(zp0Var.f45212d0.measureText(format2));
                int max2 = Math.max(AndroidUtilities.dp(16.0f) + ceil2, AndroidUtilities.dp(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                zp0Var.f45212d0.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.C5, false));
                zp0Var.f45216f0.setColor(org.telegram.ui.ActionBar.f6.w0(null, zp0Var.f45227q0, false));
                int i14 = max2 / 2;
                int i15 = measuredWidth2 - i14;
                int i16 = i14 + measuredWidth2;
                zp0Var.f45214e0.set(i15, 0.0f, i16, getMeasuredHeight());
                canvas.drawRoundRect(zp0Var.f45214e0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), zp0Var.f45216f0);
                zp0Var.f45216f0.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.B5, false));
                zp0Var.f45214e0.set(AndroidUtilities.dp(2.0f) + i15, AndroidUtilities.dp(2.0f), i16 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(zp0Var.f45214e0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), zp0Var.f45216f0);
                canvas.drawText(format2, measuredWidth2 - (ceil2 / 2), AndroidUtilities.dp(16.2f), zp0Var.f45212d0);
                return;
            case 3:
                ((PhotoViewer) obj).f35691m3.a(canvas, this);
                return;
            case 4:
            case 5:
            case 8:
            case 9:
            case 10:
            default:
                super.onDraw(canvas);
                return;
            case 6:
                z11 z11Var = (z11) obj;
                if (z11Var.G) {
                    i9 = -15590870;
                } else {
                    i9 = -6569073;
                }
                canvas.drawColor(i9);
                org.telegram.ui.Components.jb0 jb0Var = z11Var.f45005n;
                if (jb0Var != null) {
                    jb0Var.setBounds(0, 0, getWidth(), getHeight());
                }
                z11Var.h.setBounds(0, 0, getWidth(), getHeight());
                org.telegram.ui.Components.jb0 jb0Var2 = z11Var.f45005n;
                if (jb0Var2 != null) {
                    jb0Var2.draw(canvas);
                }
                z11Var.h.draw(canvas);
                super.onDraw(canvas);
                return;
            case 7:
                ((SecretMediaViewer) obj).M.a(canvas, this);
                return;
            case 11:
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(22.6f), AndroidUtilities.dpf2(21.66f));
                ((qh.q0) obj).f46623c.draw(canvas);
                canvas.restore();
                return;
            case 12:
                int dp = AndroidUtilities.dp(20.0f);
                CheckBoxBase checkBoxBase = (CheckBoxBase) obj;
                checkBoxBase.e((getWidth() - dp) / 2, (getHeight() - dp) / 2, dp, dp);
                checkBoxBase.a(canvas);
                return;
            case 13:
                super.onDraw(canvas);
                zf.j0 j0Var = (zf.j0) obj;
                if (j0Var.f50543l0 - j0Var.f50542k0 > 1) {
                    Paint T0 = org.telegram.ui.ActionBar.f6.T0("paintDivider", zf.j0.e0(j0Var));
                    if (T0 == null) {
                        T0 = org.telegram.ui.ActionBar.f6.f23121k0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, T0);
                    return;
                }
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        switch (this.f44883a) {
            case 8:
                super.onLayout(z10, i9, i10, i11, i12);
                q41 q41Var = (q41) this.f44884b;
                int[] iArr = q41Var.C;
                getLocationOnScreen(iArr);
                Rect rect = q41Var.d;
                int i13 = iArr[0];
                rect.set(i13, iArr[1], getWidth() + i13, getHeight() + iArr[1]);
                AndroidUtilities.lerp(q41Var.f44369c, rect, q41Var.E, q41Var.f44370e);
                return;
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i9, int i10) {
        switch (this.f44883a) {
            case 4:
                yv0 yv0Var = (yv0) this.f44884b;
                PremiumPreviewFragment premiumPreviewFragment = yv0Var.f44958c;
                if (premiumPreviewFragment.S) {
                    premiumPreviewFragment.U = 0;
                } else {
                    int dp = AndroidUtilities.dp(64.0f);
                    if (AndroidUtilities.dp(8.0f) + yv0Var.f44958c.Q.getMeasuredHeight() > dp) {
                        dp = yv0Var.f44958c.Q.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                    }
                    yv0Var.f44958c.U = dp;
                }
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(yv0Var.f44958c.U, 1073741824));
                return;
            case 12:
                setMeasuredDimension(View.MeasureSpec.getSize(i9), AndroidUtilities.dp(24.0f));
                return;
            default:
                super.onMeasure(i9, i10);
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f44883a) {
            case 5:
                super.setAlpha(f10);
                View view = ((ProfileActivity) this.f44884b).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 9:
                super.setAlpha(f10);
                View view2 = ((we1) this.f44884b).fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    public yi0(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f44883a = 12;
        CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, b6Var);
        this.f44884b = checkBoxBase;
        checkBoxBase.h(org.telegram.ui.ActionBar.f6.hl, org.telegram.ui.ActionBar.f6.f23385z5, org.telegram.ui.ActionBar.f6.f23128k7);
        checkBoxBase.d(10);
        checkBoxBase.k(true);
        checkBoxBase.i(AndroidUtilities.dp(5.0f));
    }
}
