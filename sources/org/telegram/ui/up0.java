package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class up0 extends hq0 {
    public final int f51994q0;
    public final org.telegram.messenger.is f51995r0;

    public up0(org.telegram.messenger.is isVar, Context context, kq0 kq0Var, FrameLayout frameLayout, int i7) {
        super(context, kq0Var, frameLayout);
        this.f51994q0 = i7;
        this.f51995r0 = isVar;
    }

    @Override
    public boolean D() {
        switch (this.f51994q0) {
            case 0:
                return !((PhotoViewer) this.f51995r0).f42875s;
            default:
                return super.D();
        }
    }

    @Override
    public void E() {
        switch (this.f51994q0) {
            case 1:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f51995r0;
                if (secretMediaViewer.K && getScrollY() <= 0) {
                    org.telegram.messenger.g0.i3(secretMediaViewer.f43304q1, 3000L);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void F() {
        switch (this.f51994q0) {
            case 1:
                org.telegram.messenger.g0.r(((SecretMediaViewer) this.f51995r0).f43304q1);
                return;
            default:
                return;
        }
    }

    @Override
    public void G() {
        boolean z10;
        switch (this.f51994q0) {
            case 1:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f51995r0;
                if (secretMediaViewer.J0 == null) {
                    if (getScrollY() < getMeasuredHeight() / 3.0f && secretMediaViewer.f43291j0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    secretMediaViewer.l(z10, true);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void invalidate() {
        boolean z10;
        boolean z11;
        int i7;
        boolean z12;
        switch (this.f51994q0) {
            case 0:
                super.invalidate();
                PhotoViewer photoViewer = (PhotoViewer) this.f51995r0;
                to0[] to0VarArr = photoViewer.X0;
                ImageView[] imageViewArr = photoViewer.f42934y3;
                if (photoViewer.K) {
                    int scrollY = getScrollY();
                    float translationY = photoViewer.R1.getTranslationY();
                    float f10 = 0.0f;
                    if (scrollY == 0 && translationY == 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (scrollY == 0 && translationY == 0.0f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z10) {
                        int b10 = to0VarArr[0].b() + to0VarArr[0].f51635j;
                        if (D()) {
                            i7 = org.telegram.messenger.g0.f23603m;
                        } else {
                            i7 = 0;
                        }
                        int top = (((photoViewer.f42717a2.getTop() + ((int) translationY)) - scrollY) + (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i7)) - org.telegram.messenger.g0.L(12.0f);
                        if (top > org.telegram.messenger.g0.L(32.0f) + ((int) imageViewArr[0].getY())) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (top > b10) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        z11 = z12;
                    }
                    if (photoViewer.f42943z3) {
                        if (imageViewArr[0].getTag() != null && ((Integer) imageViewArr[0].getTag()).intValue() == 3 && z11) {
                            imageViewArr[0].setTag(2);
                            imageViewArr[0].animate().alpha(1.0f).setDuration(150L).setListener(new xx(this, 14)).start();
                        } else if (imageViewArr[0].getTag() == null && !z11) {
                            imageViewArr[0].setTag(3);
                            imageViewArr[0].animate().alpha(0.0f).setListener(null).setDuration(150L).start();
                        }
                    }
                    to0 to0Var = to0VarArr[0];
                    if (z10) {
                        f10 = 1.0f;
                    }
                    to0Var.e(2, f10, true);
                    return;
                }
                return;
            default:
                super.invalidate();
                return;
        }
    }
}
