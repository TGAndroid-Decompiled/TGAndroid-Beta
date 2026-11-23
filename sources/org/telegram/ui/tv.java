package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
public final class tv extends View {
    public final int f52484a;
    public final Object f52485b;

    public tv(int i7, Context context, Object obj) {
        super(context);
        this.f52484a = i7;
        this.f52485b = obj;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f52484a) {
            case 2:
                super.dispatchDraw(canvas);
                g.b bVar = (g.b) this.f52485b;
                if (bVar != null && bVar.a(canvas, getMeasuredWidth(), 0.0f)) {
                    invalidate();
                    return;
                }
                return;
            case 13:
                super.dispatchDraw(canvas);
                tg.g0 g0Var = ((vp0) this.f52485b).G0;
                if (g0Var != null) {
                    g0Var.d(canvas);
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
        switch (this.f52484a) {
            case 2:
                super.onAttachedToWindow();
                g.b bVar = (g.b) this.f52485b;
                if (bVar != null) {
                    bVar.f12927i = this;
                    int i7 = 0;
                    while (true) {
                        r30[] r30VarArr = (r30[]) bVar.f12924e;
                        if (i7 < r30VarArr.length) {
                            r30 r30Var = r30VarArr[i7];
                            r30Var.f51605i.add(this);
                            r30Var.a();
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
        switch (this.f52484a) {
            case 2:
                super.onDetachedFromWindow();
                g.b bVar = (g.b) this.f52485b;
                if (bVar != null && ((tv) bVar.f12927i) != this) {
                    int i7 = 0;
                    while (true) {
                        r30[] r30VarArr = (r30[]) bVar.f12924e;
                        if (i7 < r30VarArr.length) {
                            r30 r30Var = r30VarArr[i7];
                            r30Var.f51605i.remove(this);
                            r30Var.a();
                            i7++;
                        } else {
                            bVar.f12927i = null;
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
        int i7 = this.f52484a;
        Object obj = this.f52485b;
        switch (i7) {
            case 3:
                canvas.drawColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29471e7, ((tg0) obj).J0));
                return;
            case 4:
                om0 om0Var = (om0) obj;
                String format = String.format("%d", Integer.valueOf(Math.max(1, om0Var.f50719c.size())));
                int ceil = (int) Math.ceil(om0Var.T.measureText(format));
                int max = Math.max(org.telegram.messenger.g0.L(16.0f) + ceil, org.telegram.messenger.g0.L(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                om0Var.T.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.C5, false));
                om0Var.V.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29524h5, false));
                int i10 = max / 2;
                int i11 = measuredWidth - i10;
                int i12 = i10 + measuredWidth;
                om0Var.U.set(i11, 0.0f, i12, getMeasuredHeight());
                canvas.drawRoundRect(om0Var.U, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), om0Var.V);
                om0Var.V.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.B5, false));
                om0Var.U.set(org.telegram.messenger.g0.L(2.0f) + i11, org.telegram.messenger.g0.L(2.0f), i12 - org.telegram.messenger.g0.L(2.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f));
                canvas.drawRoundRect(om0Var.U, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), om0Var.V);
                canvas.drawText(format, measuredWidth - (ceil / 2), org.telegram.messenger.g0.L(16.2f), om0Var.T);
                return;
            case 5:
                an0 an0Var = (an0) obj;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, an0Var.f45747c.size())));
                int ceil2 = (int) Math.ceil(an0Var.f45756i0.measureText(format2));
                int max2 = Math.max(org.telegram.messenger.g0.L(16.0f) + ceil2, org.telegram.messenger.g0.L(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                an0Var.f45756i0.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.C5, false));
                an0Var.f45758k0.setColor(org.telegram.ui.ActionBar.n6.x0(null, an0Var.f45771v0, false));
                int i13 = max2 / 2;
                int i14 = measuredWidth2 - i13;
                int i15 = i13 + measuredWidth2;
                an0Var.f45757j0.set(i14, 0.0f, i15, getMeasuredHeight());
                canvas.drawRoundRect(an0Var.f45757j0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), an0Var.f45758k0);
                an0Var.f45758k0.setColor(org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.B5, false));
                an0Var.f45757j0.set(org.telegram.messenger.g0.L(2.0f) + i14, org.telegram.messenger.g0.L(2.0f), i15 - org.telegram.messenger.g0.L(2.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f));
                canvas.drawRoundRect(an0Var.f45757j0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), an0Var.f45758k0);
                canvas.drawText(format2, measuredWidth2 - (ceil2 / 2), org.telegram.messenger.g0.L(16.2f), an0Var.f45756i0);
                return;
            case 6:
                ((PhotoViewer) obj).f43430q3.a(canvas, this);
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
                org.telegram.ui.Wallet.y6 y6Var = (org.telegram.ui.Wallet.y6) obj;
                float e10 = y6Var.L.e(false, y6Var.K);
                if (y6Var.R != null && getWidth() > 0) {
                    org.telegram.ui.Wallet.y6.a(y6Var, canvas, e10);
                    return;
                }
                return;
            case 14:
                super.onDraw(canvas);
                ug.k0 k0Var = (ug.k0) obj;
                if (k0Var.f58858l2 - k0Var.f58857k2 > 1) {
                    Paint W0 = org.telegram.ui.ActionBar.n6.W0("paintDivider", k0Var.J0);
                    if (W0 == null) {
                        W0 = org.telegram.ui.ActionBar.n6.f29574k0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, W0);
                    return;
                }
                return;
            case 15:
                canvas.drawColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29471e7, ((wg.d1) obj).J0));
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f52484a) {
            case 10:
                super.onLayout(z10, i7, i10, i11, i12);
                g01 g01Var = (g01) this.f52485b;
                int[] iArr = g01Var.H;
                getLocationOnScreen(iArr);
                Rect rect = g01Var.d;
                int i13 = iArr[0];
                rect.set(i13, iArr[1], getWidth() + i13, getHeight() + iArr[1]);
                org.telegram.messenger.g0.X1(g01Var.f49926c, rect, g01Var.J, g01Var.f49927e);
                return;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f52484a) {
            case 1:
                r00 r00Var = (r00) this.f52485b;
                if (r00Var.I) {
                    r00Var.K = (r00Var.p0().getMeasuredHeight() + r00Var.J) - org.telegram.messenger.g0.L(16.0f);
                } else {
                    int L = org.telegram.messenger.g0.L(140.0f) + r00Var.J;
                    if (org.telegram.messenger.g0.L(24.0f) + r00Var.E.getMeasuredHeight() > L) {
                        L = Math.max(L, (org.telegram.messenger.g0.L(24.0f) + r00Var.E.getMeasuredHeight()) - r00Var.M);
                    }
                    r00Var.K = L;
                }
                int i11 = (int) (r00Var.K - (0 * 2.5f));
                r00Var.K = i11;
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return;
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(38.0f));
                return;
            case 7:
                ps0 ps0Var = (ps0) this.f52485b;
                PremiumPreviewFragment premiumPreviewFragment = ps0Var.f51138c;
                if (premiumPreviewFragment.X) {
                    premiumPreviewFragment.Z = 0;
                } else {
                    int L2 = org.telegram.messenger.g0.L(64.0f);
                    if (org.telegram.messenger.g0.L(8.0f) + ps0Var.f51138c.V.getMeasuredHeight() > L2) {
                        L2 = ps0Var.f51138c.V.getMeasuredHeight() + org.telegram.messenger.g0.L(8.0f);
                    }
                    ps0Var.f51138c.Z = L2;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(ps0Var.f51138c.Z, 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f52484a) {
            case 0:
                super.setAlpha(f10);
                View view = ((bx) this.f52485b).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 8:
                super.setAlpha(f10);
                View view2 = ((ProfileActivity) this.f52485b).fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 11:
                super.setAlpha(f10);
                View view3 = ((w91) this.f52485b).fragmentView;
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

    public tv(Context context, g.b bVar) {
        super(context);
        this.f52484a = 2;
        this.f52485b = bVar;
        org.telegram.messenger.ks.i(this);
        setOnClickListener(new org.telegram.ui.Components.p31(19, this, context));
    }
}
