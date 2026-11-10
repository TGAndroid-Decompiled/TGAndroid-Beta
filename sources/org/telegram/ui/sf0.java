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
public final class sf0 extends FrameLayout {
    public final int f49850a;
    public final eg0 f49851b;

    public sf0(eg0 eg0Var, Context context, int i7) {
        super(context);
        this.f49850a = i7;
        this.f49851b = eg0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f49850a) {
            case 0:
                super.dispatchDraw(canvas);
                eg0 eg0Var = this.f49851b;
                tf0 tf0Var = eg0Var.Z;
                tf0Var.e(canvas);
                ArrayList arrayList = tf0Var.F;
                boolean z9 = true;
                float f10 = -1.0f;
                if (!arrayList.isEmpty()) {
                    kx kxVar = (kx) jg.g.i(1, arrayList);
                    ImageReceiver imageReceiver = kxVar.f47455r;
                    org.telegram.messenger.hc hcVar = imageReceiver.f21197f0;
                    if (hcVar == null) {
                        hcVar = imageReceiver.O;
                    }
                    if (hcVar == null) {
                        hcVar = imageReceiver.W;
                    }
                    if (hcVar != null) {
                        if (kxVar.f47456s == null) {
                            TLRPC.Document document = hcVar.f22875i;
                            if (document != null) {
                                kxVar.f47456s = org.telegram.messenger.w7.r("tgs", document);
                            } else {
                                kxVar.f47456s = org.telegram.messenger.w7.r("tgs", hcVar.f22873f);
                            }
                        }
                        if (kxVar.f47456s != null) {
                            Float w10 = org.telegram.messenger.gc.D().w(kxVar.f47456s);
                            if (w10 == null) {
                                w10 = Float.valueOf(1.0f);
                            }
                            f10 = (w10.floatValue() * 0.55f) + 0.15f + (w10.floatValue() * 0.3f);
                        }
                    }
                }
                if (f10 != -2.0f) {
                    eg0Var.W.f((f10 < 0.0f || f10 >= 1.0f) ? false : false);
                }
                if (!tf0Var.F.isEmpty()) {
                    invalidate();
                    return;
                }
                return;
            default:
                eg0 eg0Var2 = this.f49851b;
                if (eg0Var2.D > 0.0f && eg0Var2.h != null) {
                    eg0Var2.f45285n.reset();
                    float width = getWidth() / eg0Var2.f45275e.getWidth();
                    eg0Var2.f45285n.postScale(width, width);
                    eg0Var2.f45277f.setLocalMatrix(eg0Var2.f45285n);
                    eg0Var2.h.setAlpha((int) (eg0Var2.D * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), eg0Var2.h);
                } else {
                    canvas2 = canvas;
                }
                super.dispatchDraw(canvas2);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f49850a) {
            case 1:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f49851b.onBackPressed();
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
        uf0 uf0Var;
        int height;
        switch (this.f49850a) {
            case 1:
                super.onLayout(z9, i7, i10, i11, i12);
                eg0 eg0Var = this.f49851b;
                if (!eg0Var.f45278f0 || eg0Var.f45279g0) {
                    ArrayList arrayList = eg0Var.M;
                    ag0 ag0Var = eg0Var.J;
                    if (eg0Var.E.getWidth() > 0) {
                        eg0Var.V.getLocationOnScreen(r13);
                        int[] iArr = {org.telegram.messenger.camera.q.D(6.0f, eg0Var.V.getWidth() - eg0Var.V.l(), iArr[0])};
                        eg0Var.W.setScaleX(eg0Var.V.getScaleX());
                        eg0Var.W.setScaleY(eg0Var.V.getScaleY());
                        int[] iArr2 = eg0Var.f45286n0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight2 = ag0Var.getMeasuredHeight() - eg0Var.W.getHeight();
                        if (eg0Var.f45274d0 != null) {
                            i13 = org.telegram.messenger.g0.L(320.0f);
                        } else {
                            i13 = 0;
                        }
                        int i14 = measuredHeight2 + i13;
                        int L = org.telegram.messenger.g0.L(8.0f) + eg0Var.d.f15123b;
                        if (arrayList.isEmpty()) {
                            f10 = -6.0f;
                        } else {
                            f10 = 48.0f;
                        }
                        int L2 = org.telegram.messenger.g0.L(f10);
                        ViewGroup viewGroup = eg0Var.Y;
                        if (viewGroup == null) {
                            measuredHeight = 0;
                        } else {
                            measuredHeight = viewGroup.getMeasuredHeight();
                        }
                        int i15 = L2 + measuredHeight;
                        int measuredHeight3 = (eg0Var.F.getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f)) - eg0Var.d.d;
                        if (iArr[1] + i15 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - i15;
                        }
                        if (iArr[1] - i14 < L) {
                            iArr[1] = L + i14;
                        }
                        if (eg0Var.V.getHeight() + iArr[1] + i15 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - i15) - eg0Var.V.getHeight();
                        }
                        eg0Var.W.setX(org.telegram.messenger.g0.L(6.0f) + (iArr[0] - (uf0Var.getWidth() - eg0Var.W.l())));
                        eg0Var.W.setY(iArr[1]);
                        if (eg0Var.f45284l0) {
                            iArr[0] = iArr[0] - (eg0Var.X - eg0Var.V.l());
                        }
                        ag0Var.setX((org.telegram.messenger.g0.L(7.0f) + iArr[0]) - ag0Var.getMeasuredWidth());
                        if (eg0Var.f45278f0) {
                            org.telegram.messenger.camera.q.l(ag0Var.animate().translationY(((eg0Var.W.getHeight() + iArr[1]) - ag0Var.getMeasuredHeight()) - ag0Var.getTop()), mi.l.V, 250L);
                        } else {
                            ag0Var.setY((eg0Var.W.getHeight() + iArr[1]) - ag0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = eg0Var.Y;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((org.telegram.messenger.g0.L(7.0f) + iArr[0]) - eg0Var.Y.getMeasuredWidth());
                            ViewGroup viewGroup3 = eg0Var.Y;
                            int i16 = iArr[1];
                            if (arrayList.isEmpty()) {
                                height = -org.telegram.messenger.g0.L(6.0f);
                            } else {
                                height = eg0Var.W.getHeight();
                            }
                            viewGroup3.setY(i16 + height);
                        }
                        FrameLayout frameLayout = eg0Var.f45273c0;
                        if (frameLayout != null) {
                            frameLayout.setX(jg.g.e(6.0f, (eg0Var.W.l() + iArr[0]) - eg0Var.f45273c0.getMeasuredWidth(), 0));
                            RectF rectF = eg0Var.f45283k0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = eg0Var.f45273c0;
                                float max = Math.max(eg0Var.d.f15123b, rectF.top - frameLayout2.getMeasuredWidth());
                                eg0Var.f45271b0 = max;
                                frameLayout2.setY(max);
                                vf0 vf0Var = eg0Var.f45274d0;
                                if (vf0Var != null) {
                                    vf0Var.setY(Math.max(eg0Var.d.f15123b, (eg0Var.f45283k0.top - org.telegram.messenger.g0.L(24.0f)) - eg0Var.f45274d0.getMeasuredHeight()));
                                }
                            } else {
                                float height2 = (eg0Var.W.getHeight() + iArr[1]) - ag0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = eg0Var.f45273c0;
                                float max2 = Math.max(eg0Var.d.f15123b, height2 - frameLayout3.getMeasuredHeight()) + org.telegram.messenger.g0.L(24.0f);
                                eg0Var.f45271b0 = max2;
                                frameLayout3.setY(max2);
                                vf0 vf0Var2 = eg0Var.f45274d0;
                                if (vf0Var2 != null) {
                                    vf0Var2.setY(Math.max(0.0f, (height2 - vf0Var2.getMeasuredHeight()) - eg0Var.f45271b0));
                                }
                            }
                        }
                    }
                    eg0Var.f45278f0 = true;
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
        switch (this.f49850a) {
            case 1:
                super.onSizeChanged(i7, i10, i11, i12);
                eg0 eg0Var = this.f49851b;
                ih.d.c(eg0Var.f45281i0, eg0Var.E);
                ViewGroup viewGroup = eg0Var.Y;
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
