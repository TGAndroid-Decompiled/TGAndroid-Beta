package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class yp0 extends lq0 {
    public final int f52098p0;
    public final org.telegram.messenger.ls f52099q0;

    public yp0(org.telegram.messenger.ls lsVar, Context context, oq0 oq0Var, FrameLayout frameLayout, int i7) {
        super(context, oq0Var, frameLayout);
        this.f52098p0 = i7;
        this.f52099q0 = lsVar;
    }

    @Override
    public boolean D() {
        switch (this.f52098p0) {
            case 0:
                return !((PhotoViewer) this.f52099q0).f41504s;
            default:
                return super.D();
        }
    }

    @Override
    public void E() {
        switch (this.f52098p0) {
            case 1:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f52099q0;
                if (secretMediaViewer.J && getScrollY() <= 0) {
                    org.telegram.messenger.g0.i3(secretMediaViewer.f41929p1, 3000L);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void F() {
        switch (this.f52098p0) {
            case 1:
                org.telegram.messenger.g0.r(((SecretMediaViewer) this.f52099q0).f41929p1);
                return;
            default:
                return;
        }
    }

    @Override
    public void G() {
        boolean z9;
        switch (this.f52098p0) {
            case 1:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f52099q0;
                if (secretMediaViewer.I0 == null) {
                    if (getScrollY() < getMeasuredHeight() / 3.0f && secretMediaViewer.f41916i0) {
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
        switch (this.f52098p0) {
            case 0:
                super.invalidate();
                PhotoViewer photoViewer = (PhotoViewer) this.f52099q0;
                yo0[] yo0VarArr = photoViewer.W0;
                ImageView[] imageViewArr = photoViewer.f41553x3;
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
                        int b10 = yo0VarArr[0].b() + yo0VarArr[0].f52084j;
                        if (D()) {
                            i7 = org.telegram.messenger.g0.f22561m;
                        } else {
                            i7 = 0;
                        }
                        int top = (((photoViewer.Z1.getTop() + ((int) translationY)) - scrollY) + (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i7)) - org.telegram.messenger.g0.L(12.0f);
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
                    if (photoViewer.f41563y3) {
                        if (imageViewArr[0].getTag() != null && ((Integer) imageViewArr[0].getTag()).intValue() == 3 && z10) {
                            imageViewArr[0].setTag(2);
                            imageViewArr[0].animate().alpha(1.0f).setDuration(150L).setListener(new g30(this, 13)).start();
                        } else if (imageViewArr[0].getTag() == null && !z10) {
                            imageViewArr[0].setTag(3);
                            imageViewArr[0].animate().alpha(0.0f).setListener(null).setDuration(150L).start();
                        }
                    }
                    yo0 yo0Var = yo0VarArr[0];
                    if (z9) {
                        f10 = 1.0f;
                    }
                    yo0Var.e(2, f10, true);
                    return;
                }
                return;
            default:
                super.invalidate();
                return;
        }
    }
}
