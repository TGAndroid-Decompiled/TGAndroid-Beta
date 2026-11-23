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
    public final int f52009a;
    public final eg0 f52010b;

    public sf0(eg0 eg0Var, Context context, int i7) {
        super(context);
        this.f52009a = i7;
        this.f52010b = eg0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f52009a) {
            case 0:
                super.dispatchDraw(canvas);
                eg0 eg0Var = this.f52010b;
                tf0 tf0Var = eg0Var.f47233a0;
                tf0Var.e(canvas);
                ArrayList arrayList = tf0Var.G;
                boolean z10 = true;
                float f10 = -1.0f;
                if (!arrayList.isEmpty()) {
                    mx mxVar = (mx) i5.c.h(1, arrayList);
                    ImageReceiver imageReceiver = mxVar.f49999r;
                    org.telegram.messenger.gc gcVar = imageReceiver.f22631g0;
                    if (gcVar == null) {
                        gcVar = imageReceiver.P;
                    }
                    if (gcVar == null) {
                        gcVar = imageReceiver.X;
                    }
                    if (gcVar != null) {
                        if (mxVar.f50000s == null) {
                            TLRPC.Document document = gcVar.f24082i;
                            if (document != null) {
                                mxVar.f50000s = org.telegram.messenger.w7.r("tgs", document);
                            } else {
                                mxVar.f50000s = org.telegram.messenger.w7.r("tgs", gcVar.f24080f);
                            }
                        }
                        if (mxVar.f50000s != null) {
                            Float w10 = org.telegram.messenger.fc.D().w(mxVar.f50000s);
                            if (w10 == null) {
                                w10 = Float.valueOf(1.0f);
                            }
                            f10 = (w10.floatValue() * 0.55f) + 0.15f + (w10.floatValue() * 0.3f);
                        }
                    }
                }
                if (f10 != -2.0f) {
                    eg0Var.X.g((f10 < 0.0f || f10 >= 1.0f) ? false : false);
                }
                if (!tf0Var.G.isEmpty()) {
                    invalidate();
                    return;
                }
                return;
            default:
                eg0 eg0Var2 = this.f52010b;
                if (eg0Var2.E > 0.0f && eg0Var2.h != null) {
                    eg0Var2.f47249n.reset();
                    float width = getWidth() / eg0Var2.f47239e.getWidth();
                    eg0Var2.f47249n.postScale(width, width);
                    eg0Var2.f47241f.setLocalMatrix(eg0Var2.f47249n);
                    eg0Var2.h.setAlpha((int) (eg0Var2.E * 255.0f));
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
        switch (this.f52009a) {
            case 1:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f52010b.onBackPressed();
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
        uf0 uf0Var;
        int height;
        switch (this.f52009a) {
            case 1:
                super.onLayout(z10, i7, i10, i11, i12);
                eg0 eg0Var = this.f52010b;
                if (!eg0Var.f47243g0 || eg0Var.f47244h0) {
                    ArrayList arrayList = eg0Var.N;
                    ag0 ag0Var = eg0Var.K;
                    if (eg0Var.F.getWidth() > 0) {
                        int[] iArr = new int[2];
                        eg0Var.d(iArr);
                        eg0Var.X.setScaleX(eg0Var.W.getScaleX());
                        eg0Var.X.setScaleY(eg0Var.W.getScaleY());
                        int[] iArr2 = eg0Var.f47255r0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight2 = ag0Var.getMeasuredHeight() - eg0Var.X.getHeight();
                        if (eg0Var.f47240e0 != null) {
                            i13 = org.telegram.messenger.g0.L(320.0f);
                        } else {
                            i13 = 0;
                        }
                        int i14 = measuredHeight2 + i13;
                        int L = org.telegram.messenger.g0.L(8.0f) + eg0Var.d.f15884b;
                        if (arrayList.isEmpty()) {
                            f10 = -6.0f;
                        } else {
                            f10 = 48.0f;
                        }
                        int L2 = org.telegram.messenger.g0.L(f10);
                        ViewGroup viewGroup = eg0Var.Z;
                        if (viewGroup == null) {
                            measuredHeight = 0;
                        } else {
                            measuredHeight = viewGroup.getMeasuredHeight();
                        }
                        int i15 = L2 + measuredHeight;
                        int measuredHeight3 = (eg0Var.G.getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f)) - eg0Var.d.d;
                        if (iArr[1] + i15 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - i15;
                        }
                        if (iArr[1] - i14 < L) {
                            iArr[1] = L + i14;
                        }
                        if (eg0Var.W.getHeight() + iArr[1] + i15 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - i15) - eg0Var.W.getHeight();
                        }
                        eg0Var.X.setX(org.telegram.messenger.g0.L(6.0f) + (iArr[0] - (uf0Var.getWidth() - eg0Var.X.l())));
                        eg0Var.X.setY(iArr[1]);
                        if (eg0Var.f47252p0) {
                            iArr[0] = iArr[0] - (eg0Var.Y - eg0Var.W.l());
                        }
                        ag0Var.setX((org.telegram.messenger.g0.L(7.0f) + iArr[0]) - ag0Var.getMeasuredWidth());
                        if (eg0Var.f47243g0) {
                            org.telegram.messenger.o10.o(ag0Var.animate().translationY(((eg0Var.X.getHeight() + iArr[1]) - ag0Var.getMeasuredHeight()) - ag0Var.getTop()), pi.k.V, 250L);
                        } else {
                            ag0Var.setY((eg0Var.X.getHeight() + iArr[1]) - ag0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = eg0Var.Z;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((org.telegram.messenger.g0.L(7.0f) + iArr[0]) - eg0Var.Z.getMeasuredWidth());
                            ViewGroup viewGroup3 = eg0Var.Z;
                            int i16 = iArr[1];
                            if (arrayList.isEmpty()) {
                                height = -org.telegram.messenger.g0.L(6.0f);
                            } else {
                                height = eg0Var.X.getHeight();
                            }
                            viewGroup3.setY(i16 + height);
                        }
                        FrameLayout frameLayout = eg0Var.f47238d0;
                        if (frameLayout != null) {
                            frameLayout.setX(i5.c.d(6.0f, (eg0Var.X.l() + iArr[0]) - eg0Var.f47238d0.getMeasuredWidth(), 0));
                            RectF rectF = eg0Var.f47248l0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = eg0Var.f47238d0;
                                float max = Math.max(eg0Var.d.f15884b, rectF.top - frameLayout2.getMeasuredWidth());
                                eg0Var.f47237c0 = max;
                                frameLayout2.setY(max);
                                vf0 vf0Var = eg0Var.f47240e0;
                                if (vf0Var != null) {
                                    vf0Var.setY(Math.max(eg0Var.d.f15884b, (eg0Var.f47248l0.top - org.telegram.messenger.g0.L(24.0f)) - eg0Var.f47240e0.getMeasuredHeight()));
                                }
                            } else {
                                float height2 = (eg0Var.X.getHeight() + iArr[1]) - ag0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = eg0Var.f47238d0;
                                float max2 = Math.max(eg0Var.d.f15884b, height2 - frameLayout3.getMeasuredHeight()) + org.telegram.messenger.g0.L(24.0f);
                                eg0Var.f47237c0 = max2;
                                frameLayout3.setY(max2);
                                vf0 vf0Var2 = eg0Var.f47240e0;
                                if (vf0Var2 != null) {
                                    vf0Var2.setY(Math.max(0.0f, (height2 - vf0Var2.getMeasuredHeight()) - eg0Var.f47237c0));
                                }
                            }
                        }
                    }
                    eg0Var.f47243g0 = true;
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
        switch (this.f52009a) {
            case 1:
                super.onSizeChanged(i7, i10, i11, i12);
                eg0 eg0Var = this.f52010b;
                ih.d.c(eg0Var.f47246j0, eg0Var.F);
                ViewGroup viewGroup = eg0Var.Z;
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
