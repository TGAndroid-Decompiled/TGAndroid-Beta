package org.telegram.ui;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class xs0 extends kt0 {
    public final int f44651l0;
    public final NotificationCenter.NotificationCenterDelegate m0;

    public xs0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, nt0 nt0Var, FrameLayout frameLayout, int i10) {
        super(context, nt0Var, frameLayout);
        this.f44651l0 = i10;
        this.m0 = notificationCenterDelegate;
    }

    @Override
    public boolean C() {
        switch (this.f44651l0) {
            case 0:
                return !((PhotoViewer) this.m0).f35808s;
            default:
                return super.C();
        }
    }

    @Override
    public void D() {
        switch (this.f44651l0) {
            case 1:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.m0;
                if (secretMediaViewer.F && getScrollY() <= 0) {
                    AndroidUtilities.runOnUIThread(secretMediaViewer.f36212n1, 3000L);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public void F() {
        switch (this.f44651l0) {
            case 1:
                AndroidUtilities.cancelRunOnUIThread(((SecretMediaViewer) this.m0).f36212n1);
                return;
            default:
                return;
        }
    }

    @Override
    public void G() {
        boolean z10;
        switch (this.f44651l0) {
            case 1:
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.m0;
                if (secretMediaViewer.G0 == null) {
                    if (getScrollY() < getMeasuredHeight() / 3.0f && secretMediaViewer.f36198g0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    secretMediaViewer.k(z10, true);
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
        int i10;
        boolean z12;
        switch (this.f44651l0) {
            case 0:
                super.invalidate();
                PhotoViewer photoViewer = (PhotoViewer) this.m0;
                vt0[] vt0VarArr = photoViewer.S0;
                ImageView[] imageViewArr = photoViewer.f35830u3;
                if (photoViewer.F) {
                    int scrollY = getScrollY();
                    float translationY = photoViewer.M1.getTranslationY();
                    float f9 = 0.0f;
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
                        int b10 = vt0VarArr[0].b() + vt0VarArr[0].f43740j;
                        if (C()) {
                            i10 = AndroidUtilities.statusBarHeight;
                        } else {
                            i10 = 0;
                        }
                        int top = (((photoViewer.V1.getTop() + ((int) translationY)) - scrollY) + (org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i10)) - AndroidUtilities.dp(12.0f);
                        if (top > AndroidUtilities.dp(32.0f) + ((int) imageViewArr[0].getY())) {
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
                    if (photoViewer.f35839v3) {
                        if (imageViewArr[0].getTag() != null && ((Integer) imageViewArr[0].getTag()).intValue() == 3 && z11) {
                            imageViewArr[0].setTag(2);
                            imageViewArr[0].animate().alpha(1.0f).setDuration(150L).setListener(new e50(this, 12)).start();
                        } else if (imageViewArr[0].getTag() == null && !z11) {
                            imageViewArr[0].setTag(3);
                            imageViewArr[0].animate().alpha(0.0f).setListener(null).setDuration(150L).start();
                        }
                    }
                    vt0 vt0Var = vt0VarArr[0];
                    if (z10) {
                        f9 = 1.0f;
                    }
                    vt0Var.e(2, f9, true);
                    return;
                }
                return;
            default:
                super.invalidate();
                return;
        }
    }
}
