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
    public final int f49476a;
    public final dg0 f49477b;

    public rf0(dg0 dg0Var, Context context, int i7) {
        super(context);
        this.f49476a = i7;
        this.f49477b = dg0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f49476a) {
            case 0:
                super.dispatchDraw(canvas);
                dg0 dg0Var = this.f49477b;
                sf0 sf0Var = dg0Var.Z;
                sf0Var.e(canvas);
                ArrayList arrayList = sf0Var.F;
                boolean z9 = true;
                float f10 = -1.0f;
                if (!arrayList.isEmpty()) {
                    jx jxVar = (jx) jg.g.i(1, arrayList);
                    ImageReceiver imageReceiver = jxVar.f47121r;
                    org.telegram.messenger.hc hcVar = imageReceiver.f21192f0;
                    if (hcVar == null) {
                        hcVar = imageReceiver.O;
                    }
                    if (hcVar == null) {
                        hcVar = imageReceiver.W;
                    }
                    if (hcVar != null) {
                        if (jxVar.f47122s == null) {
                            TLRPC.Document document = hcVar.f22871i;
                            if (document != null) {
                                jxVar.f47122s = org.telegram.messenger.w7.r("tgs", document);
                            } else {
                                jxVar.f47122s = org.telegram.messenger.w7.r("tgs", hcVar.f22869f);
                            }
                        }
                        if (jxVar.f47122s != null) {
                            Float w10 = org.telegram.messenger.gc.D().w(jxVar.f47122s);
                            if (w10 == null) {
                                w10 = Float.valueOf(1.0f);
                            }
                            f10 = (w10.floatValue() * 0.55f) + 0.15f + (w10.floatValue() * 0.3f);
                        }
                    }
                }
                if (f10 != -2.0f) {
                    dg0Var.W.f((f10 < 0.0f || f10 >= 1.0f) ? false : false);
                }
                if (!sf0Var.F.isEmpty()) {
                    invalidate();
                    return;
                }
                return;
            default:
                dg0 dg0Var2 = this.f49477b;
                if (dg0Var2.D > 0.0f && dg0Var2.h != null) {
                    dg0Var2.f44964n.reset();
                    float width = getWidth() / dg0Var2.f44954e.getWidth();
                    dg0Var2.f44964n.postScale(width, width);
                    dg0Var2.f44956f.setLocalMatrix(dg0Var2.f44964n);
                    dg0Var2.h.setAlpha((int) (dg0Var2.D * 255.0f));
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
        switch (this.f49476a) {
            case 1:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f49477b.onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        int i13;
        float f10;
        int measuredHeight;
        tf0 tf0Var;
        int height;
        switch (this.f49476a) {
            case 1:
                super.onLayout(z9, i7, i10, i11, i12);
                dg0 dg0Var = this.f49477b;
                if (!dg0Var.f44957f0 || dg0Var.f44958g0) {
                    ArrayList arrayList = dg0Var.M;
                    zf0 zf0Var = dg0Var.J;
                    if (dg0Var.E.getWidth() > 0) {
                        dg0Var.V.getLocationOnScreen(r13);
                        int[] iArr = {org.telegram.messenger.camera.q.D(6.0f, dg0Var.V.getWidth() - dg0Var.V.l(), iArr[0])};
                        dg0Var.W.setScaleX(dg0Var.V.getScaleX());
                        dg0Var.W.setScaleY(dg0Var.V.getScaleY());
                        int[] iArr2 = dg0Var.f44965n0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight2 = zf0Var.getMeasuredHeight() - dg0Var.W.getHeight();
                        if (dg0Var.f44953d0 != null) {
                            i13 = org.telegram.messenger.g0.L(320.0f);
                        } else {
                            i13 = 0;
                        }
                        int i14 = measuredHeight2 + i13;
                        int L = org.telegram.messenger.g0.L(8.0f) + dg0Var.d.f15121b;
                        if (arrayList.isEmpty()) {
                            f10 = -6.0f;
                        } else {
                            f10 = 48.0f;
                        }
                        int L2 = org.telegram.messenger.g0.L(f10);
                        ViewGroup viewGroup = dg0Var.Y;
                        if (viewGroup == null) {
                            measuredHeight = 0;
                        } else {
                            measuredHeight = viewGroup.getMeasuredHeight();
                        }
                        int i15 = L2 + measuredHeight;
                        int measuredHeight3 = (dg0Var.F.getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f)) - dg0Var.d.d;
                        if (iArr[1] + i15 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - i15;
                        }
                        if (iArr[1] - i14 < L) {
                            iArr[1] = L + i14;
                        }
                        if (dg0Var.V.getHeight() + iArr[1] + i15 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - i15) - dg0Var.V.getHeight();
                        }
                        dg0Var.W.setX(org.telegram.messenger.g0.L(6.0f) + (iArr[0] - (tf0Var.getWidth() - dg0Var.W.l())));
                        dg0Var.W.setY(iArr[1]);
                        if (dg0Var.f44963l0) {
                            iArr[0] = iArr[0] - (dg0Var.X - dg0Var.V.l());
                        }
                        zf0Var.setX((org.telegram.messenger.g0.L(7.0f) + iArr[0]) - zf0Var.getMeasuredWidth());
                        if (dg0Var.f44957f0) {
                            org.telegram.messenger.camera.q.l(zf0Var.animate().translationY(((dg0Var.W.getHeight() + iArr[1]) - zf0Var.getMeasuredHeight()) - zf0Var.getTop()), mi.l.V, 250L);
                        } else {
                            zf0Var.setY((dg0Var.W.getHeight() + iArr[1]) - zf0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = dg0Var.Y;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((org.telegram.messenger.g0.L(7.0f) + iArr[0]) - dg0Var.Y.getMeasuredWidth());
                            ViewGroup viewGroup3 = dg0Var.Y;
                            int i16 = iArr[1];
                            if (arrayList.isEmpty()) {
                                height = -org.telegram.messenger.g0.L(6.0f);
                            } else {
                                height = dg0Var.W.getHeight();
                            }
                            viewGroup3.setY(i16 + height);
                        }
                        FrameLayout frameLayout = dg0Var.f44952c0;
                        if (frameLayout != null) {
                            frameLayout.setX(jg.g.e(6.0f, (dg0Var.W.l() + iArr[0]) - dg0Var.f44952c0.getMeasuredWidth(), 0));
                            RectF rectF = dg0Var.f44962k0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = dg0Var.f44952c0;
                                float max = Math.max(dg0Var.d.f15121b, rectF.top - frameLayout2.getMeasuredWidth());
                                dg0Var.f44950b0 = max;
                                frameLayout2.setY(max);
                                uf0 uf0Var = dg0Var.f44953d0;
                                if (uf0Var != null) {
                                    uf0Var.setY(Math.max(dg0Var.d.f15121b, (dg0Var.f44962k0.top - org.telegram.messenger.g0.L(24.0f)) - dg0Var.f44953d0.getMeasuredHeight()));
                                }
                            } else {
                                float height2 = (dg0Var.W.getHeight() + iArr[1]) - zf0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = dg0Var.f44952c0;
                                float max2 = Math.max(dg0Var.d.f15121b, height2 - frameLayout3.getMeasuredHeight()) + org.telegram.messenger.g0.L(24.0f);
                                dg0Var.f44950b0 = max2;
                                frameLayout3.setY(max2);
                                uf0 uf0Var2 = dg0Var.f44953d0;
                                if (uf0Var2 != null) {
                                    uf0Var2.setY(Math.max(0.0f, (height2 - uf0Var2.getMeasuredHeight()) - dg0Var.f44950b0));
                                }
                            }
                        }
                    }
                    dg0Var.f44957f0 = true;
                    return;
                }
                return;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.f49476a) {
            case 1:
                super.onSizeChanged(i7, i10, i11, i12);
                dg0 dg0Var = this.f49477b;
                ih.d.c(dg0Var.f44960i0, dg0Var.E);
                ViewGroup viewGroup = dg0Var.Y;
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
