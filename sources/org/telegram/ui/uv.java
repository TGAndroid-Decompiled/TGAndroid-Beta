package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
public final class uv extends View {
    public final int f52645a;
    public final Object f52646b;

    public uv(int i7, Context context, Object obj) {
        super(context);
        this.f52645a = i7;
        this.f52646b = obj;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f52645a) {
            case 2:
                super.dispatchDraw(canvas);
                g.b bVar = (g.b) this.f52646b;
                if (bVar != null && bVar.a(canvas, getMeasuredWidth(), 0.0f)) {
                    invalidate();
                    return;
                }
                return;
            case 13:
                super.dispatchDraw(canvas);
                tg.c0 c0Var = ((vp0) this.f52646b).G0;
                if (c0Var != null) {
                    c0Var.d(canvas);
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
        switch (this.f52645a) {
            case 2:
                super.onAttachedToWindow();
                g.b bVar = (g.b) this.f52646b;
                if (bVar != null) {
                    bVar.f12965i = this;
                    int i7 = 0;
                    while (true) {
                        s30[] s30VarArr = (s30[]) bVar.f12962e;
                        if (i7 < s30VarArr.length) {
                            s30 s30Var = s30VarArr[i7];
                            s30Var.f51913i.add(this);
                            s30Var.a();
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
        switch (this.f52645a) {
            case 2:
                super.onDetachedFromWindow();
                g.b bVar = (g.b) this.f52646b;
                if (bVar != null && ((uv) bVar.f12965i) != this) {
                    int i7 = 0;
                    while (true) {
                        s30[] s30VarArr = (s30[]) bVar.f12962e;
                        if (i7 < s30VarArr.length) {
                            s30 s30Var = s30VarArr[i7];
                            s30Var.f51913i.remove(this);
                            s30Var.a();
                            i7++;
                        } else {
                            bVar.f12965i = null;
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
        int i7 = this.f52645a;
        Object obj = this.f52646b;
        switch (i7) {
            case 3:
                canvas.drawColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29401e7, ((vg0) obj).J0));
                return;
            case 4:
                qm0 qm0Var = (qm0) obj;
                String format = String.format("%d", Integer.valueOf(Math.max(1, qm0Var.f51305c.size())));
                int ceil = (int) Math.ceil(qm0Var.T.measureText(format));
                int max = Math.max(org.telegram.messenger.g0.L(16.0f) + ceil, org.telegram.messenger.g0.L(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                qm0Var.T.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.C5, false));
                qm0Var.V.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29454h5, false));
                int i10 = max / 2;
                int i11 = measuredWidth - i10;
                int i12 = i10 + measuredWidth;
                qm0Var.U.set(i11, 0.0f, i12, getMeasuredHeight());
                canvas.drawRoundRect(qm0Var.U, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), qm0Var.V);
                qm0Var.V.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.B5, false));
                qm0Var.U.set(org.telegram.messenger.g0.L(2.0f) + i11, org.telegram.messenger.g0.L(2.0f), i12 - org.telegram.messenger.g0.L(2.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f));
                canvas.drawRoundRect(qm0Var.U, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), qm0Var.V);
                canvas.drawText(format, measuredWidth - (ceil / 2), org.telegram.messenger.g0.L(16.2f), qm0Var.T);
                return;
            case 5:
                cn0 cn0Var = (cn0) obj;
                String format2 = String.format("%d", Integer.valueOf(Math.max(1, cn0Var.f46600c.size())));
                int ceil2 = (int) Math.ceil(cn0Var.f46609i0.measureText(format2));
                int max2 = Math.max(org.telegram.messenger.g0.L(16.0f) + ceil2, org.telegram.messenger.g0.L(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                cn0Var.f46609i0.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.C5, false));
                cn0Var.f46611k0.setColor(org.telegram.ui.ActionBar.m6.x0(null, cn0Var.f46624v0, false));
                int i13 = max2 / 2;
                int i14 = measuredWidth2 - i13;
                int i15 = i13 + measuredWidth2;
                cn0Var.f46610j0.set(i14, 0.0f, i15, getMeasuredHeight());
                canvas.drawRoundRect(cn0Var.f46610j0, org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), cn0Var.f46611k0);
                cn0Var.f46611k0.setColor(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.B5, false));
                cn0Var.f46610j0.set(org.telegram.messenger.g0.L(2.0f) + i14, org.telegram.messenger.g0.L(2.0f), i15 - org.telegram.messenger.g0.L(2.0f), getMeasuredHeight() - org.telegram.messenger.g0.L(2.0f));
                canvas.drawRoundRect(cn0Var.f46610j0, org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(10.0f), cn0Var.f46611k0);
                canvas.drawText(format2, measuredWidth2 - (ceil2 / 2), org.telegram.messenger.g0.L(16.2f), cn0Var.f46609i0);
                return;
            case 6:
                ((PhotoViewer) obj).f43349q3.a(canvas, this);
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
                org.telegram.ui.Wallet.x6 x6Var = (org.telegram.ui.Wallet.x6) obj;
                float e10 = x6Var.L.e(false, x6Var.K);
                if (x6Var.R != null && getWidth() > 0) {
                    org.telegram.ui.Wallet.x6.a(x6Var, canvas, e10);
                    return;
                }
                return;
            case 14:
                super.onDraw(canvas);
                ug.k0 k0Var = (ug.k0) obj;
                if (k0Var.f58778l2 - k0Var.f58777k2 > 1) {
                    Paint W0 = org.telegram.ui.ActionBar.m6.W0("paintDivider", k0Var.J0);
                    if (W0 == null) {
                        W0 = org.telegram.ui.ActionBar.m6.f29504k0;
                    }
                    canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, W0);
                    return;
                }
                return;
            case 15:
                canvas.drawColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29401e7, ((wg.e1) obj).J0));
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f52645a) {
            case 10:
                super.onLayout(z10, i7, i10, i11, i12);
                i01 i01Var = (i01) this.f52646b;
                int[] iArr = i01Var.H;
                getLocationOnScreen(iArr);
                Rect rect = i01Var.d;
                int i13 = iArr[0];
                rect.set(i13, iArr[1], getWidth() + i13, getHeight() + iArr[1]);
                org.telegram.messenger.g0.X1(i01Var.f50400c, rect, i01Var.J, i01Var.f50401e);
                return;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f52645a) {
            case 1:
                s00 s00Var = (s00) this.f52646b;
                if (s00Var.I) {
                    s00Var.K = (s00Var.p0().getMeasuredHeight() + s00Var.J) - org.telegram.messenger.g0.L(16.0f);
                } else {
                    int L = org.telegram.messenger.g0.L(140.0f) + s00Var.J;
                    if (org.telegram.messenger.g0.L(24.0f) + s00Var.E.getMeasuredHeight() > L) {
                        L = Math.max(L, (org.telegram.messenger.g0.L(24.0f) + s00Var.E.getMeasuredHeight()) - s00Var.M);
                    }
                    s00Var.K = L;
                }
                int i11 = (int) (s00Var.K - (0 * 2.5f));
                s00Var.K = i11;
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
                return;
            case 2:
                setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(38.0f));
                return;
            case 7:
                qs0 qs0Var = (qs0) this.f52646b;
                PremiumPreviewFragment premiumPreviewFragment = qs0Var.f51351c;
                if (premiumPreviewFragment.X) {
                    premiumPreviewFragment.Z = 0;
                } else {
                    int L2 = org.telegram.messenger.g0.L(64.0f);
                    if (org.telegram.messenger.g0.L(8.0f) + qs0Var.f51351c.V.getMeasuredHeight() > L2) {
                        L2 = qs0Var.f51351c.V.getMeasuredHeight() + org.telegram.messenger.g0.L(8.0f);
                    }
                    qs0Var.f51351c.Z = L2;
                }
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(qs0Var.f51351c.Z, 1073741824));
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f52645a) {
            case 0:
                super.setAlpha(f10);
                View view = ((cx) this.f52646b).fragmentView;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 8:
                super.setAlpha(f10);
                View view2 = ((ProfileActivity) this.f52646b).fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 11:
                super.setAlpha(f10);
                View view3 = ((y91) this.f52646b).fragmentView;
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

    public uv(Context context, g.b bVar) {
        super(context);
        this.f52645a = 2;
        this.f52646b = bVar;
        org.telegram.messenger.ls.i(this);
        setOnClickListener(new org.telegram.ui.Components.q31(19, this, context));
    }
}
