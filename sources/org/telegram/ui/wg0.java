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
public final class wg0 extends FrameLayout {
    public final int f43105a;
    public final ih0 f43106b;

    public wg0(ih0 ih0Var, Context context, int i10) {
        super(context);
        this.f43105a = i10;
        this.f43106b = ih0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f43105a) {
            case 0:
                super.dispatchDraw(canvas);
                ih0 ih0Var = this.f43106b;
                xg0 xg0Var = ih0Var.Z;
                xg0Var.e(canvas);
                ArrayList arrayList = xg0Var.F;
                boolean z10 = true;
                float f7 = -1.0f;
                if (!arrayList.isEmpty()) {
                    jy jyVar = (jy) i0.a.g(1, arrayList);
                    ImageReceiver imageReceiver = jyVar.f38592r;
                    org.telegram.messenger.jc jcVar = imageReceiver.f14380f0;
                    if (jcVar == null) {
                        jcVar = imageReceiver.O;
                    }
                    if (jcVar == null) {
                        jcVar = imageReceiver.W;
                    }
                    if (jcVar != null) {
                        if (jyVar.f38593s == null) {
                            TLRPC.Document document = jcVar.f16437i;
                            if (document != null) {
                                jyVar.f38593s = org.telegram.messenger.b8.r("tgs", document);
                            } else {
                                jyVar.f38593s = org.telegram.messenger.b8.r("tgs", jcVar.f16435f);
                            }
                        }
                        if (jyVar.f38593s != null) {
                            Float w9 = org.telegram.messenger.ic.D().w(jyVar.f38593s);
                            if (w9 == null) {
                                w9 = Float.valueOf(1.0f);
                            }
                            f7 = (w9.floatValue() * 0.55f) + 0.15f + (w9.floatValue() * 0.3f);
                        }
                    }
                }
                if (f7 != -2.0f) {
                    ih0Var.W.h((f7 < 0.0f || f7 >= 1.0f) ? false : false);
                }
                if (!xg0Var.F.isEmpty()) {
                    invalidate();
                    return;
                }
                return;
            default:
                ih0 ih0Var2 = this.f43106b;
                if (ih0Var2.D > 0.0f && ih0Var2.h != null) {
                    ih0Var2.f38074n.reset();
                    float width = getWidth() / ih0Var2.e.getWidth();
                    ih0Var2.f38074n.postScale(width, width);
                    ih0Var2.f38066f.setLocalMatrix(ih0Var2.f38074n);
                    ih0Var2.h.setAlpha((int) (ih0Var2.D * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ih0Var2.h);
                } else {
                    canvas2 = canvas;
                }
                super.dispatchDraw(canvas2);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f43105a) {
            case 1:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f43106b.onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        float f7;
        int measuredHeight;
        yg0 yg0Var;
        int height;
        switch (this.f43105a) {
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                ih0 ih0Var = this.f43106b;
                if (!ih0Var.f38067f0 || ih0Var.f38068g0) {
                    ArrayList arrayList = ih0Var.M;
                    eh0 eh0Var = ih0Var.J;
                    if (ih0Var.E.getWidth() > 0) {
                        ih0Var.V.getLocationOnScreen(r13);
                        int[] iArr = {org.telegram.messenger.a30.D(6.0f, ih0Var.V.getWidth() - ih0Var.V.l(), iArr[0])};
                        ih0Var.W.setScaleX(ih0Var.V.getScaleX());
                        ih0Var.W.setScaleY(ih0Var.V.getScaleY());
                        int[] iArr2 = ih0Var.f38075n0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight2 = eh0Var.getMeasuredHeight() - ih0Var.W.getHeight();
                        if (ih0Var.f38064d0 != null) {
                            i14 = org.telegram.messenger.i0.L(320.0f);
                        } else {
                            i14 = 0;
                        }
                        int i15 = measuredHeight2 + i14;
                        int L = org.telegram.messenger.i0.L(8.0f) + ih0Var.d.f7767b;
                        if (arrayList.isEmpty()) {
                            f7 = -6.0f;
                        } else {
                            f7 = 48.0f;
                        }
                        int L2 = org.telegram.messenger.i0.L(f7);
                        ViewGroup viewGroup = ih0Var.Y;
                        if (viewGroup == null) {
                            measuredHeight = 0;
                        } else {
                            measuredHeight = viewGroup.getMeasuredHeight();
                        }
                        int i16 = L2 + measuredHeight;
                        int measuredHeight3 = (ih0Var.F.getMeasuredHeight() - org.telegram.messenger.i0.L(8.0f)) - ih0Var.d.d;
                        if (iArr[1] + i16 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - i16;
                        }
                        if (iArr[1] - i15 < L) {
                            iArr[1] = L + i15;
                        }
                        if (ih0Var.V.getHeight() + iArr[1] + i16 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - i16) - ih0Var.V.getHeight();
                        }
                        ih0Var.W.setX(org.telegram.messenger.i0.L(6.0f) + (iArr[0] - (yg0Var.getWidth() - ih0Var.W.l())));
                        ih0Var.W.setY(iArr[1]);
                        if (ih0Var.f38073l0) {
                            iArr[0] = iArr[0] - (ih0Var.X - ih0Var.V.l());
                        }
                        eh0Var.setX((org.telegram.messenger.i0.L(7.0f) + iArr[0]) - eh0Var.getMeasuredWidth());
                        if (ih0Var.f38067f0) {
                            org.telegram.messenger.a30.m(eh0Var.animate().translationY(((ih0Var.W.getHeight() + iArr[1]) - eh0Var.getMeasuredHeight()) - eh0Var.getTop()), ci.o.V, 250L);
                        } else {
                            eh0Var.setY((ih0Var.W.getHeight() + iArr[1]) - eh0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = ih0Var.Y;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((org.telegram.messenger.i0.L(7.0f) + iArr[0]) - ih0Var.Y.getMeasuredWidth());
                            ViewGroup viewGroup3 = ih0Var.Y;
                            int i17 = iArr[1];
                            if (arrayList.isEmpty()) {
                                height = -org.telegram.messenger.i0.L(6.0f);
                            } else {
                                height = ih0Var.W.getHeight();
                            }
                            viewGroup3.setY(i17 + height);
                        }
                        FrameLayout frameLayout = ih0Var.f38063c0;
                        if (frameLayout != null) {
                            frameLayout.setX(i0.a.d(6.0f, (ih0Var.W.l() + iArr[0]) - ih0Var.f38063c0.getMeasuredWidth(), 0));
                            RectF rectF = ih0Var.f38072k0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = ih0Var.f38063c0;
                                float max = Math.max(ih0Var.d.f7767b, rectF.top - frameLayout2.getMeasuredWidth());
                                ih0Var.f38061b0 = max;
                                frameLayout2.setY(max);
                                zg0 zg0Var = ih0Var.f38064d0;
                                if (zg0Var != null) {
                                    zg0Var.setY(Math.max(ih0Var.d.f7767b, (ih0Var.f38072k0.top - org.telegram.messenger.i0.L(24.0f)) - ih0Var.f38064d0.getMeasuredHeight()));
                                }
                            } else {
                                float height2 = (ih0Var.W.getHeight() + iArr[1]) - eh0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = ih0Var.f38063c0;
                                float max2 = Math.max(ih0Var.d.f7767b, height2 - frameLayout3.getMeasuredHeight()) + org.telegram.messenger.i0.L(24.0f);
                                ih0Var.f38061b0 = max2;
                                frameLayout3.setY(max2);
                                zg0 zg0Var2 = ih0Var.f38064d0;
                                if (zg0Var2 != null) {
                                    zg0Var2.setY(Math.max(0.0f, (height2 - zg0Var2.getMeasuredHeight()) - ih0Var.f38061b0));
                                }
                            }
                        }
                    }
                    ih0Var.f38067f0 = true;
                    return;
                }
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f43105a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                ih0 ih0Var = this.f43106b;
                yg.d.c(ih0Var.f38070i0, ih0Var.E);
                ViewGroup viewGroup = ih0Var.Y;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                    return;
                }
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }
}
