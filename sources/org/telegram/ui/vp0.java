package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class vp0 extends iq0 {
    public final int f50812p0;
    public final org.telegram.messenger.ls f50813q0;

    public vp0(org.telegram.messenger.ls lsVar, Context context, lq0 lq0Var, FrameLayout frameLayout, int i7) {
        super(context, lq0Var, frameLayout);
        this.f50812p0 = i7;
        this.f50813q0 = lsVar;
    }

    @Override
    public boolean D() {
        switch (this.f50812p0) {
            case 0:
                return !((PhotoViewer) this.f50813q0).f41503s;
            default:
                return super.D();
        }
    }

    @Override
    public void E() {
        switch (this.f50812p0) {
            case 1:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f50813q0;
                if (secretMediaViewer.J && getScrollY() <= 0) {
                    org.telegram.messenger.g0.i3(secretMediaViewer.f41928p1, 3000L);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void F() {
        switch (this.f50812p0) {
            case 1:
                org.telegram.messenger.g0.r(((SecretMediaViewer) this.f50813q0).f41928p1);
                return;
            default:
                return;
        }
    }

    @Override
    public void G() {
        boolean z9;
        switch (this.f50812p0) {
            case 1:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f50813q0;
                if (secretMediaViewer.I0 == null) {
                    if (getScrollY() < getMeasuredHeight() / 3.0f && secretMediaViewer.f41915i0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    secretMediaViewer.l(z9, true);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void invalidate() {
        boolean z9;
        boolean z10;
        int i7;
        boolean z11;
        switch (this.f50812p0) {
            case 0:
                super.invalidate();
                PhotoViewer photoViewer = (PhotoViewer) this.f50813q0;
                vo0[] vo0VarArr = photoViewer.W0;
                ImageView[] imageViewArr = photoViewer.f41552x3;
                if (photoViewer.J) {
                    int scrollY = getScrollY();
                    float translationY = photoViewer.Q1.getTranslationY();
                    float f10 = 0.0f;
                    if (scrollY == 0 && translationY == 0.0f) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (scrollY == 0 && translationY == 0.0f) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (!z9) {
                        int b10 = vo0VarArr[0].b() + vo0VarArr[0].f50798j;
                        if (D()) {
                            i7 = org.telegram.messenger.g0.f22531m;
                        } else {
                            i7 = 0;
                        }
                        int top = (((photoViewer.Z1.getTop() + ((int) translationY)) - scrollY) + (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i7)) - org.telegram.messenger.g0.L(12.0f);
                        if (top > org.telegram.messenger.g0.L(32.0f) + ((int) imageViewArr[0].getY())) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (top > b10) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        z10 = z11;
                    }
                    if (photoViewer.f41562y3) {
                        if (imageViewArr[0].getTag() != null && ((Integer) imageViewArr[0].getTag()).intValue() == 3 && z10) {
                            imageViewArr[0].setTag(2);
                            imageViewArr[0].animate().alpha(1.0f).setDuration(150L).setListener(new d30(this, 13)).start();
                        } else if (imageViewArr[0].getTag() == null && !z10) {
                            imageViewArr[0].setTag(3);
                            imageViewArr[0].animate().alpha(0.0f).setListener(null).setDuration(150L).start();
                        }
                    }
                    vo0 vo0Var = vo0VarArr[0];
                    if (z9) {
                        f10 = 1.0f;
                    }
                    vo0Var.e(2, f10, true);
                    return;
                }
                return;
            default:
                super.invalidate();
                return;
        }
    }
}
