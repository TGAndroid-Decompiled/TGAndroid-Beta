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
public final class yg0 extends FrameLayout {
    public final int f43835a;
    public final kh0 f43836b;

    public yg0(kh0 kh0Var, Context context, int i10) {
        super(context);
        this.f43835a = i10;
        this.f43836b = kh0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f43835a) {
            case 0:
                super.dispatchDraw(canvas);
                kh0 kh0Var = this.f43836b;
                zg0 zg0Var = kh0Var.Z;
                zg0Var.e(canvas);
                ArrayList arrayList = zg0Var.F;
                boolean z10 = true;
                float f7 = -1.0f;
                if (!arrayList.isEmpty()) {
                    ky kyVar = (ky) i0.a.g(1, arrayList);
                    ImageReceiver imageReceiver = kyVar.f38986r;
                    org.telegram.messenger.ic icVar = imageReceiver.f14379f0;
                    if (icVar == null) {
                        icVar = imageReceiver.O;
                    }
                    if (icVar == null) {
                        icVar = imageReceiver.W;
                    }
                    if (icVar != null) {
                        if (kyVar.f38987s == null) {
                            TLRPC.Document document = icVar.f16102i;
                            if (document != null) {
                                kyVar.f38987s = org.telegram.messenger.b8.r("tgs", document);
                            } else {
                                kyVar.f38987s = org.telegram.messenger.b8.r("tgs", icVar.f16100f);
                            }
                        }
                        if (kyVar.f38987s != null) {
                            Float w9 = org.telegram.messenger.hc.D().w(kyVar.f38987s);
                            if (w9 == null) {
                                w9 = Float.valueOf(1.0f);
                            }
                            f7 = (w9.floatValue() * 0.55f) + 0.15f + (w9.floatValue() * 0.3f);
                        }
                    }
                }
                if (f7 != -2.0f) {
                    kh0Var.W.h((f7 < 0.0f || f7 >= 1.0f) ? false : false);
                }
                if (!zg0Var.F.isEmpty()) {
                    invalidate();
                    return;
                }
                return;
            default:
                kh0 kh0Var2 = this.f43836b;
                if (kh0Var2.D > 0.0f && kh0Var2.h != null) {
                    kh0Var2.f38844n.reset();
                    float width = getWidth() / kh0Var2.e.getWidth();
                    kh0Var2.f38844n.postScale(width, width);
                    kh0Var2.f38836f.setLocalMatrix(kh0Var2.f38844n);
                    kh0Var2.h.setAlpha((int) (kh0Var2.D * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), kh0Var2.h);
                } else {
                    canvas2 = canvas;
                }
                super.dispatchDraw(canvas2);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f43835a) {
            case 1:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f43836b.onBackPressed();
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
        ah0 ah0Var;
        int height;
        switch (this.f43835a) {
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                kh0 kh0Var = this.f43836b;
                if (!kh0Var.f38837f0 || kh0Var.f38838g0) {
                    ArrayList arrayList = kh0Var.M;
                    gh0 gh0Var = kh0Var.J;
                    if (kh0Var.E.getWidth() > 0) {
                        kh0Var.V.getLocationOnScreen(r13);
                        int[] iArr = {org.telegram.messenger.z20.D(6.0f, kh0Var.V.getWidth() - kh0Var.V.l(), iArr[0])};
                        kh0Var.W.setScaleX(kh0Var.V.getScaleX());
                        kh0Var.W.setScaleY(kh0Var.V.getScaleY());
                        int[] iArr2 = kh0Var.f38845n0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight2 = gh0Var.getMeasuredHeight() - kh0Var.W.getHeight();
                        if (kh0Var.f38834d0 != null) {
                            i14 = org.telegram.messenger.i0.L(320.0f);
                        } else {
                            i14 = 0;
                        }
                        int i15 = measuredHeight2 + i14;
                        int L = org.telegram.messenger.i0.L(8.0f) + kh0Var.d.f7766b;
                        if (arrayList.isEmpty()) {
                            f7 = -6.0f;
                        } else {
                            f7 = 48.0f;
                        }
                        int L2 = org.telegram.messenger.i0.L(f7);
                        ViewGroup viewGroup = kh0Var.Y;
                        if (viewGroup == null) {
                            measuredHeight = 0;
                        } else {
                            measuredHeight = viewGroup.getMeasuredHeight();
                        }
                        int i16 = L2 + measuredHeight;
                        int measuredHeight3 = (kh0Var.F.getMeasuredHeight() - org.telegram.messenger.i0.L(8.0f)) - kh0Var.d.d;
                        if (iArr[1] + i16 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - i16;
                        }
                        if (iArr[1] - i15 < L) {
                            iArr[1] = L + i15;
                        }
                        if (kh0Var.V.getHeight() + iArr[1] + i16 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - i16) - kh0Var.V.getHeight();
                        }
                        kh0Var.W.setX(org.telegram.messenger.i0.L(6.0f) + (iArr[0] - (ah0Var.getWidth() - kh0Var.W.l())));
                        kh0Var.W.setY(iArr[1]);
                        if (kh0Var.f38843l0) {
                            iArr[0] = iArr[0] - (kh0Var.X - kh0Var.V.l());
                        }
                        gh0Var.setX((org.telegram.messenger.i0.L(7.0f) + iArr[0]) - gh0Var.getMeasuredWidth());
                        if (kh0Var.f38837f0) {
                            org.telegram.messenger.z20.m(gh0Var.animate().translationY(((kh0Var.W.getHeight() + iArr[1]) - gh0Var.getMeasuredHeight()) - gh0Var.getTop()), ci.o.V, 250L);
                        } else {
                            gh0Var.setY((kh0Var.W.getHeight() + iArr[1]) - gh0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = kh0Var.Y;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((org.telegram.messenger.i0.L(7.0f) + iArr[0]) - kh0Var.Y.getMeasuredWidth());
                            ViewGroup viewGroup3 = kh0Var.Y;
                            int i17 = iArr[1];
                            if (arrayList.isEmpty()) {
                                height = -org.telegram.messenger.i0.L(6.0f);
                            } else {
                                height = kh0Var.W.getHeight();
                            }
                            viewGroup3.setY(i17 + height);
                        }
                        FrameLayout frameLayout = kh0Var.f38833c0;
                        if (frameLayout != null) {
                            frameLayout.setX(i0.a.d(6.0f, (kh0Var.W.l() + iArr[0]) - kh0Var.f38833c0.getMeasuredWidth(), 0));
                            RectF rectF = kh0Var.f38842k0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = kh0Var.f38833c0;
                                float max = Math.max(kh0Var.d.f7766b, rectF.top - frameLayout2.getMeasuredWidth());
                                kh0Var.f38831b0 = max;
                                frameLayout2.setY(max);
                                bh0 bh0Var = kh0Var.f38834d0;
                                if (bh0Var != null) {
                                    bh0Var.setY(Math.max(kh0Var.d.f7766b, (kh0Var.f38842k0.top - org.telegram.messenger.i0.L(24.0f)) - kh0Var.f38834d0.getMeasuredHeight()));
                                }
                            } else {
                                float height2 = (kh0Var.W.getHeight() + iArr[1]) - gh0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = kh0Var.f38833c0;
                                float max2 = Math.max(kh0Var.d.f7766b, height2 - frameLayout3.getMeasuredHeight()) + org.telegram.messenger.i0.L(24.0f);
                                kh0Var.f38831b0 = max2;
                                frameLayout3.setY(max2);
                                bh0 bh0Var2 = kh0Var.f38834d0;
                                if (bh0Var2 != null) {
                                    bh0Var2.setY(Math.max(0.0f, (height2 - bh0Var2.getMeasuredHeight()) - kh0Var.f38831b0));
                                }
                            }
                        }
                    }
                    kh0Var.f38837f0 = true;
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
        switch (this.f43835a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                kh0 kh0Var = this.f43836b;
                yg.d.c(kh0Var.f38840i0, kh0Var.E);
                ViewGroup viewGroup = kh0Var.Y;
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
