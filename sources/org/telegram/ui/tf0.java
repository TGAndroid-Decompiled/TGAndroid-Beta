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
public final class tf0 extends FrameLayout {
    public final int f52278a;
    public final fg0 f52279b;

    public tf0(fg0 fg0Var, Context context, int i7) {
        super(context);
        this.f52278a = i7;
        this.f52279b = fg0Var;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.f52278a) {
            case 0:
                super.dispatchDraw(canvas);
                fg0 fg0Var = this.f52279b;
                uf0 uf0Var = fg0Var.f47619a0;
                uf0Var.e(canvas);
                ArrayList arrayList = uf0Var.G;
                boolean z10 = true;
                float f10 = -1.0f;
                if (!arrayList.isEmpty()) {
                    mx mxVar = (mx) i5.c.h(1, arrayList);
                    ImageReceiver imageReceiver = mxVar.f49980r;
                    org.telegram.messenger.fc fcVar = imageReceiver.f22636g0;
                    if (fcVar == null) {
                        fcVar = imageReceiver.P;
                    }
                    if (fcVar == null) {
                        fcVar = imageReceiver.X;
                    }
                    if (fcVar != null) {
                        if (mxVar.f49981s == null) {
                            TLRPC.Document document = fcVar.f23870i;
                            if (document != null) {
                                mxVar.f49981s = org.telegram.messenger.w7.r("tgs", document);
                            } else {
                                mxVar.f49981s = org.telegram.messenger.w7.r("tgs", fcVar.f23868f);
                            }
                        }
                        if (mxVar.f49981s != null) {
                            Float w10 = org.telegram.messenger.ec.D().w(mxVar.f49981s);
                            if (w10 == null) {
                                w10 = Float.valueOf(1.0f);
                            }
                            f10 = (w10.floatValue() * 0.55f) + 0.15f + (w10.floatValue() * 0.3f);
                        }
                    }
                }
                if (f10 != -2.0f) {
                    fg0Var.X.g((f10 < 0.0f || f10 >= 1.0f) ? false : false);
                }
                if (!uf0Var.G.isEmpty()) {
                    invalidate();
                    return;
                }
                return;
            default:
                fg0 fg0Var2 = this.f52279b;
                if (fg0Var2.E > 0.0f && fg0Var2.h != null) {
                    fg0Var2.f47635n.reset();
                    float width = getWidth() / fg0Var2.f47625e.getWidth();
                    fg0Var2.f47635n.postScale(width, width);
                    fg0Var2.f47627f.setLocalMatrix(fg0Var2.f47635n);
                    fg0Var2.h.setAlpha((int) (fg0Var2.E * 255.0f));
                    canvas2 = canvas;
                    canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), fg0Var2.h);
                } else {
                    canvas2 = canvas;
                }
                super.dispatchDraw(canvas2);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f52278a) {
            case 1:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    this.f52279b.onBackPressed();
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
        vf0 vf0Var;
        int height;
        switch (this.f52278a) {
            case 1:
                super.onLayout(z10, i7, i10, i11, i12);
                fg0 fg0Var = this.f52279b;
                if (!fg0Var.f47629g0 || fg0Var.f47630h0) {
                    ArrayList arrayList = fg0Var.N;
                    bg0 bg0Var = fg0Var.K;
                    if (fg0Var.F.getWidth() > 0) {
                        int[] iArr = new int[2];
                        fg0Var.d(iArr);
                        fg0Var.X.setScaleX(fg0Var.W.getScaleX());
                        fg0Var.X.setScaleY(fg0Var.W.getScaleY());
                        int[] iArr2 = fg0Var.f47641r0;
                        iArr2[0] = iArr[0];
                        iArr2[1] = iArr[1];
                        int measuredHeight2 = bg0Var.getMeasuredHeight() - fg0Var.X.getHeight();
                        if (fg0Var.f47626e0 != null) {
                            i13 = org.telegram.messenger.g0.L(320.0f);
                        } else {
                            i13 = 0;
                        }
                        int i14 = measuredHeight2 + i13;
                        int L = org.telegram.messenger.g0.L(8.0f) + fg0Var.d.f15890b;
                        if (arrayList.isEmpty()) {
                            f10 = -6.0f;
                        } else {
                            f10 = 48.0f;
                        }
                        int L2 = org.telegram.messenger.g0.L(f10);
                        ViewGroup viewGroup = fg0Var.Z;
                        if (viewGroup == null) {
                            measuredHeight = 0;
                        } else {
                            measuredHeight = viewGroup.getMeasuredHeight();
                        }
                        int i15 = L2 + measuredHeight;
                        int measuredHeight3 = (fg0Var.G.getMeasuredHeight() - org.telegram.messenger.g0.L(8.0f)) - fg0Var.d.d;
                        if (iArr[1] + i15 > measuredHeight3) {
                            iArr[1] = measuredHeight3 - i15;
                        }
                        if (iArr[1] - i14 < L) {
                            iArr[1] = L + i14;
                        }
                        if (fg0Var.W.getHeight() + iArr[1] + i15 > measuredHeight3) {
                            iArr[1] = (measuredHeight3 - i15) - fg0Var.W.getHeight();
                        }
                        fg0Var.X.setX(org.telegram.messenger.g0.L(6.0f) + (iArr[0] - (vf0Var.getWidth() - fg0Var.X.l())));
                        fg0Var.X.setY(iArr[1]);
                        if (fg0Var.f47638p0) {
                            iArr[0] = iArr[0] - (fg0Var.Y - fg0Var.W.l());
                        }
                        bg0Var.setX((org.telegram.messenger.g0.L(7.0f) + iArr[0]) - bg0Var.getMeasuredWidth());
                        if (fg0Var.f47629g0) {
                            org.telegram.messenger.n10.o(bg0Var.animate().translationY(((fg0Var.X.getHeight() + iArr[1]) - bg0Var.getMeasuredHeight()) - bg0Var.getTop()), pi.k.V, 250L);
                        } else {
                            bg0Var.setY((fg0Var.X.getHeight() + iArr[1]) - bg0Var.getMeasuredHeight());
                        }
                        ViewGroup viewGroup2 = fg0Var.Z;
                        if (viewGroup2 != null) {
                            viewGroup2.setX((org.telegram.messenger.g0.L(7.0f) + iArr[0]) - fg0Var.Z.getMeasuredWidth());
                            ViewGroup viewGroup3 = fg0Var.Z;
                            int i16 = iArr[1];
                            if (arrayList.isEmpty()) {
                                height = -org.telegram.messenger.g0.L(6.0f);
                            } else {
                                height = fg0Var.X.getHeight();
                            }
                            viewGroup3.setY(i16 + height);
                        }
                        FrameLayout frameLayout = fg0Var.f47624d0;
                        if (frameLayout != null) {
                            frameLayout.setX(i5.c.d(6.0f, (fg0Var.X.l() + iArr[0]) - fg0Var.f47624d0.getMeasuredWidth(), 0));
                            RectF rectF = fg0Var.f47634l0;
                            if (rectF != null) {
                                FrameLayout frameLayout2 = fg0Var.f47624d0;
                                float max = Math.max(fg0Var.d.f15890b, rectF.top - frameLayout2.getMeasuredWidth());
                                fg0Var.f47623c0 = max;
                                frameLayout2.setY(max);
                                wf0 wf0Var = fg0Var.f47626e0;
                                if (wf0Var != null) {
                                    wf0Var.setY(Math.max(fg0Var.d.f15890b, (fg0Var.f47634l0.top - org.telegram.messenger.g0.L(24.0f)) - fg0Var.f47626e0.getMeasuredHeight()));
                                }
                            } else {
                                float height2 = (fg0Var.X.getHeight() + iArr[1]) - bg0Var.getMeasuredHeight();
                                FrameLayout frameLayout3 = fg0Var.f47624d0;
                                float max2 = Math.max(fg0Var.d.f15890b, height2 - frameLayout3.getMeasuredHeight()) + org.telegram.messenger.g0.L(24.0f);
                                fg0Var.f47623c0 = max2;
                                frameLayout3.setY(max2);
                                wf0 wf0Var2 = fg0Var.f47626e0;
                                if (wf0Var2 != null) {
                                    wf0Var2.setY(Math.max(0.0f, (height2 - wf0Var2.getMeasuredHeight()) - fg0Var.f47623c0));
                                }
                            }
                        }
                    }
                    fg0Var.f47629g0 = true;
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
        switch (this.f52278a) {
            case 1:
                super.onSizeChanged(i7, i10, i11, i12);
                fg0 fg0Var = this.f52279b;
                ih.d.c(fg0Var.f47632j0, fg0Var.F);
                ViewGroup viewGroup = fg0Var.Z;
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
