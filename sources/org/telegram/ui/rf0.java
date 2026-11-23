package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class rf0 extends FrameLayout {
    public final int f51717a;
    public final dg0 f51718b;

    public rf0(dg0 dg0Var, Context context, int i7) {
        super(context);
        this.f51717a = i7;
        this.f51718b = dg0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f51717a) {
            case 0:
                super.dispatchDraw(canvas);
                dg0 dg0Var = this.f51718b;
                sf0 sf0Var = dg0Var.f47092a0;
                sf0Var.e(canvas);
                ArrayList arrayList = sf0Var.G;
                boolean z10 = true;
                float f10 = -1.0f;
                if (!arrayList.isEmpty()) {
                    lx lxVar = (lx) i5.c.h(1, arrayList);
                    ImageReceiver imageReceiver = lxVar.f49867r;
                    org.telegram.messenger.fc fcVar = imageReceiver.f22734g0;
                    if (fcVar == null) {
                        fcVar = imageReceiver.P;
                    }
                    if (fcVar == null) {
                        fcVar = imageReceiver.X;
                    }
                    if (fcVar != null) {
                        if (lxVar.f49868s == null) {
                            TLRPC.Document document = fcVar.f23978i;
                            if (document != null) {
                                lxVar.f49868s = org.telegram.messenger.w7.r("tgs", document);
                            } else {
                                lxVar.f49868s = org.telegram.messenger.w7.r("tgs", fcVar.f23976f);
                            }
                        }
                        if (lxVar.f49868s != null) {
                            Float w10 = org.telegram.messenger.ec.D().w(lxVar.f49868s);
                            if (w10 == null) {
                                w10 = Float.valueOf(1.0f);
                            }
                            f10 = (w10.floatValue() * 0.55f) + 0.15f + (w10.floatValue() * 0.3f);
                        }
                    }
                }
                if (f10 != -2.0f) {
                    dg0Var.X.h((f10 < 0.0f || f10 >= 1.0f) ? false : false);
                }
                if (!sf0Var.G.isEmpty()) {
                    invalidate();
                    return;
                }
                return;
            default:
                dg0 dg0Var2 = this.f51718b;
                if (dg0Var2.E > 0.0f && dg0Var2.h != null) {
                    dg0Var2.f47108n.reset();
                    float width = getWidth() / dg0Var2.f47098e.getWidth();
                    dg0Var2.f47108n.postScale(width, width);
                    dg0Var2.f47100f.setLocalMatrix(dg0Var2.f47108n);
                    dg0Var2.h.setAlpha((int) (dg0Var2.E * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), dg0Var2.h);
                } else {
                    canvas2 = canvas;
                }
                super.dispatchDraw(canvas2);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f51717a) {
            case 1:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f51718b.onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        int i13;
        float f10;
        int measuredHeight;
        tf0 tf0Var;
        int height;
        switch (this.f51717a) {
            case 1:
                super.onLayout(z10, i7, i10, i11, i12);
                dg0 dg0Var = this.f51718b;
                if (!dg0Var.f47102g0 || dg0Var.f47103h0) {
                    ArrayList arrayList = dg0Var.N;
                    zf0 zf0Var = dg0Var.K;
                    if (dg0Var.F.getWidth() > 0) {
                        int[] iArr = new int[2];
                        dg0Var.d(iArr);
                        dg0Var.X.setScaleX(dg0Var.W.getScaleX());
                        dg0Var.X.setScaleY(dg0Var.W.getScaleY());
                        int[] iArr2 = dg0Var.f47114r0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight2 = zf0Var.getMeasuredHeight() - dg0Var.X.getHeight();
                        if (dg0Var.f47099e0 != null) {
                            i13 = org.telegram.messenger.g0.L(320.0f);
                        } else {
                            i13 = 0;
                        }
                        int i14 = measuredHeight2 + i13;
                        int L = org.telegram.messenger.g0.L(8.0f) + dg0Var.d.f15979b;
                        if (arrayList.isEmpty()) {
                            f10 = -6.0f;
                        } else {
                            f10 = 48.0f;
                        }
                        int L2 = org.telegram.messenger.g0.L(f10);
                        ViewGroup viewGroup = dg0Var.Z;
                        if (viewGroup == null) {
                            measuredHeight = 0;
                        } else {
                            measuredHeight = viewGroup.getMeasuredHeight();
                        }
                        int i15 = L2 + measuredHeight;
                        int measuredHeight3 = (dg0Var.G.getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f)) - dg0Var.d.d;
                        if (iArr[1] + i15 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - i15;
                        }
                        if (iArr[1] - i14 < L) {
                            iArr[1] = L + i14;
                        }
                        if (dg0Var.W.getHeight() + iArr[1] + i15 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - i15) - dg0Var.W.getHeight();
                        }
                        dg0Var.X.setX(org.telegram.messenger.g0.L(6.0f) + (iArr[0] - (tf0Var.getWidth() - dg0Var.X.l())));
                        dg0Var.X.setY(iArr[1]);
                        if (dg0Var.f47111p0) {
                            iArr[0] = iArr[0] - (dg0Var.Y - dg0Var.W.l());
                        }
                        zf0Var.setX((org.telegram.messenger.g0.L(7.0f) + iArr[0]) - zf0Var.getMeasuredWidth());
                        if (dg0Var.f47102g0) {
                            org.telegram.messenger.m10.o(zf0Var.animate().translationY(((dg0Var.X.getHeight() + iArr[1]) - zf0Var.getMeasuredHeight()) - zf0Var.getTop()), pi.k.V, 250L);
                        } else {
                            zf0Var.setY((dg0Var.X.getHeight() + iArr[1]) - zf0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = dg0Var.Z;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((org.telegram.messenger.g0.L(7.0f) + iArr[0]) - dg0Var.Z.getMeasuredWidth());
                            ViewGroup viewGroup3 = dg0Var.Z;
                            int i16 = iArr[1];
                            if (arrayList.isEmpty()) {
                                height = -org.telegram.messenger.g0.L(6.0f);
                            } else {
                                height = dg0Var.X.getHeight();
                            }
                            viewGroup3.setY(i16 + height);
                        }
                        FrameLayout frameLayout = dg0Var.f47097d0;
                        if (frameLayout != null) {
                            frameLayout.setX(i5.c.d(6.0f, (dg0Var.X.l() + iArr[0]) - dg0Var.f47097d0.getMeasuredWidth(), 0));
                            RectF rectF = dg0Var.f47107l0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = dg0Var.f47097d0;
                                float max = Math.max(dg0Var.d.f15979b, rectF.top - frameLayout2.getMeasuredWidth());
                                dg0Var.f47096c0 = max;
                                frameLayout2.setY(max);
                                uf0 uf0Var = dg0Var.f47099e0;
                                if (uf0Var != null) {
                                    uf0Var.setY(Math.max(dg0Var.d.f15979b, (dg0Var.f47107l0.top - org.telegram.messenger.g0.L(24.0f)) - dg0Var.f47099e0.getMeasuredHeight()));
                                }
                            } else {
                                float height2 = (dg0Var.X.getHeight() + iArr[1]) - zf0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = dg0Var.f47097d0;
                                float max2 = Math.max(dg0Var.d.f15979b, height2 - frameLayout3.getMeasuredHeight()) + org.telegram.messenger.g0.L(24.0f);
                                dg0Var.f47096c0 = max2;
                                frameLayout3.setY(max2);
                                uf0 uf0Var2 = dg0Var.f47099e0;
                                if (uf0Var2 != null) {
                                    uf0Var2.setY(Math.max(0.0f, (height2 - uf0Var2.getMeasuredHeight()) - dg0Var.f47096c0));
                                }
                            }
                        }
                    }
                    dg0Var.f47102g0 = true;
                    return;
                }
                return;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.f51717a) {
            case 1:
                super.onSizeChanged(i7, i10, i11, i12);
                dg0 dg0Var = this.f51718b;
                ih.d.c(dg0Var.f47105j0, dg0Var.F);
                ViewGroup viewGroup = dg0Var.Z;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                    return;
                }
                return;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                return;
        }
    }
}
