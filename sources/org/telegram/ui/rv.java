package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
public final class rv extends View {
    public final int f51031a;
    public final Object f51032b;

    public rv(int i7, Context context, Object obj) {
        super(context);
        this.f51031a = i7;
        this.f51032b = obj;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f51031a) {
            case 2:
                super.dispatchDraw(canvas);
                g.b bVar = (g.b) this.f51032b;
                if (bVar != null && bVar.a(canvas, getMeasuredWidth(), 0.0f)) {
                    invalidate();
                    return;
                }
                return;
            case 13:
                super.dispatchDraw(canvas);
                tg.b0 b0Var = ((tp0) this.f51032b).G0;
                if (b0Var != null) {
                    b0Var.d(canvas);
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
        switch (this.f51031a) {
            case 2:
                super.onAttachedToWindow();
                g.b bVar = (g.b) this.f51032b;
                if (bVar != null) {
                    bVar.f12619i = this;
                    int i7 = 0;
                    while (true) {
                        p30[] p30VarArr = (p30[]) bVar.f12616e;
                        if (i7 < p30VarArr.length) {
                            p30 p30Var = p30VarArr[i7];
                            p30Var.f50126i.add(this);
                            p30Var.a();
                            i7++;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f51031a) {
            case 2:
                super.onDetachedFromWindow();
                g.b bVar = (g.b) this.f51032b;
                if (bVar != null && ((rv) bVar.f12619i) != this) {
                    int i7 = 0;
                    while (true) {
                        p30[] p30VarArr = (p30[]) bVar.f12616e;
                        if (i7 < p30VarArr.length) {
                            p30 p30Var = p30VarArr[i7];
                            p30Var.f50126i.remove(this);
                            p30Var.a();
                            i7++;
                        } else {
                            bVar.f12619i = null;
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        int i7 = this.f51031a;
        Object obj = this.f51032b;
        switch (i7) {
            case 3:
                canvas.drawColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28869e7, ((qg0) obj).J0));
                return;
            case 4:
                nm0 nm0Var = (nm0) obj;
                String format = String.format("%d", Integer.valueOf(Math.max(1, nm0Var.f49585c.size())));
                int ceil = (int) Math.ceil(nm0Var.T.measureText(format));
                int max = Math.max(org.telegram.messenger.g0.L(16.0f) + ceil, org.telegram.messenger.g0.L(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                nm0Var.T.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.C5, false));
                nm0Var.V.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.f28922h5, false));
                int i10 = max / 2;
                int i11 = measuredWidth - i10;
                int i12 = i10 + measuredWidth;
                nm0Var.U.set(i11, 0.0f, i12, getMeasuredHeight());
                canvas.drawRoundRect(nm0Var.U, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), nm0Var.V);
                nm0Var.V.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.B5, false));
                nm0Var.U.set(org.telegram.messenger.g0.L(2.0f) + i11, org.telegram.messenger.g0.L(2.0f), i12 - org.telegram.messenger.g0.L(2.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f));
                canvas.drawRoundRect(nm0Var.U, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), nm0Var.V);
                canvas.drawText(format, measuredWidth - (ceil / 2), org.telegram.messenger.g0.L(16.2f), nm0Var.T);
                return;
            case 5:
                ym0 ym0Var = (ym0) obj;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, ym0Var.f53568c.size())));
                int ceil2 = (int) Math.ceil(ym0Var.f53577i0.measureText(format2));
                int max2 = Math.max(org.telegram.messenger.g0.L(16.0f) + ceil2, org.telegram.messenger.g0.L(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                ym0Var.f53577i0.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.C5, false));
                ym0Var.f53579k0.setColor(org.telegram.ui.ActionBar.j6.x0(null, ym0Var.f53592v0, false));
                int i13 = max2 / 2;
                int i14 = measuredWidth2 - i13;
                int i15 = i13 + measuredWidth2;
                ym0Var.f53578j0.set(i14, 0.0f, i15, getMeasuredHeight());
                canvas.drawRoundRect(ym0Var.f53578j0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), ym0Var.f53579k0);
                ym0Var.f53579k0.setColor(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.B5, false));
                ym0Var.f53578j0.set(org.telegram.messenger.g0.L(2.0f) + i14, org.telegram.messenger.g0.L(2.0f), i15 - org.telegram.messenger.g0.L(2.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f));
                canvas.drawRoundRect(ym0Var.f53578j0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), ym0Var.f53579k0);
                canvas.drawText(format2, measuredWidth2 - (ceil2 / 2), org.telegram.messenger.g0.L(16.2f), ym0Var.f53577i0);
                return;
            case 6:
                ((PhotoViewer) obj).f42859q3.a(canvas, this);
                return;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            default:
                super.onDraw(canvas);
                return;
            case 9:
                ((SecretMediaViewer) obj).P.a(canvas, this);
                return;
            case 12:
                org.telegram.ui.Wallet.h6 h6Var = (org.telegram.ui.Wallet.h6) obj;
                float e10 = h6Var.L.e(false, h6Var.K);
                if (h6Var.R != null && getWidth() > 0) {
                    org.telegram.ui.Wallet.h6.a(h6Var, canvas, e10);
                    return;
                }
                return;
            case 14:
                super.onDraw(canvas);
                ug.j0 j0Var = (ug.j0) obj;
                if (j0Var.f58140l2 - j0Var.f58139k2 > 1) {
                    Paint W0 = org.telegram.ui.ActionBar.j6.W0("paintDivider", j0Var.J0);
                    if (W0 == null) {
                        W0 = org.telegram.ui.ActionBar.j6.f28972k0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, W0);
                    return;
                }
                return;
            case 15:
                canvas.drawColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28869e7, ((wg.c1) obj).J0));
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f51031a) {
            case 10:
                super.onLayout(z10, i7, i10, i11, i12);
                d01 d01Var = (d01) this.f51032b;
                int[] iArr = d01Var.H;
                getLocationOnScreen(iArr);
                Rect rect = d01Var.d;
                int i13 = iArr[0];
                rect.set(i13, iArr[1], getWidth() + i13, getHeight() + iArr[1]);
                org.telegram.messenger.g0.X1(d01Var.f48188c, rect, d01Var.J, d01Var.f48189e);
                return;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f51031a) {
            case 1:
                p00 p00Var = (p00) this.f51032b;
                if (p00Var.I) {
                    p00Var.K = (p00Var.p0().getMeasuredHeight() + p00Var.J) - org.telegram.messenger.g0.L(16.0f);
                } else {
                    int L = org.telegram.messenger.g0.L(140.0f) + p00Var.J;
                    if (org.telegram.messenger.g0.L(24.0f) + p00Var.E.getMeasuredHeight() > L) {
                        L = Math.max(L, (org.telegram.messenger.g0.L(24.0f) + p00Var.E.getMeasuredHeight()) - p00Var.M);
                    }
                    p00Var.K = L;
                }
                int i11 = (int) (p00Var.K - (0 * 2.5f));
                p00Var.K = i11;
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return;
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(38.0f));
                return;
            case 7:
                ms0 ms0Var = (ms0) this.f51032b;
                PremiumPreviewFragment premiumPreviewFragment = ms0Var.f49313c;
                if (premiumPreviewFragment.X) {
                    premiumPreviewFragment.Z = 0;
                } else {
                    int L2 = org.telegram.messenger.g0.L(64.0f);
                    if (org.telegram.messenger.g0.L(8.0f) + ms0Var.f49313c.V.getMeasuredHeight() > L2) {
                        L2 = ms0Var.f49313c.V.getMeasuredHeight() + org.telegram.messenger.g0.L(8.0f);
                    }
                    ms0Var.f49313c.Z = L2;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(ms0Var.f49313c.Z, 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f51031a) {
            case 0:
                super.setAlpha(f10);
                View view = ((yw) this.f51032b).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 8:
                super.setAlpha(f10);
                View view2 = ((ProfileActivity) this.f51032b).fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 11:
                super.setAlpha(f10);
                View view3 = ((u91) this.f51032b).fragmentView;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    public rv(Context context, g.b bVar) {
        super(context);
        this.f51031a = 2;
        this.f51032b = bVar;
        org.telegram.messenger.ns.i(this);
        setOnClickListener(new org.telegram.ui.Components.vv0(25, this, context));
    }
}
