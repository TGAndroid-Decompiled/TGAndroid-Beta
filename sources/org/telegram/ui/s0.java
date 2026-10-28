package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class s0 extends org.telegram.ui.Components.u6 {
    public final int f43197b;

    public s0(String str, int i10) {
        super(str, 0);
        this.f43197b = i10;
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f43197b) {
            case 0:
                ((ArticleViewer$WindowView) obj).setInnerTranslationX(f7);
                return;
            case 1:
                wn.f45035fd = (int) f7;
                return;
            case 2:
                ((org.telegram.ui.Cells.s1) obj).setTimeAlpha(f7);
                return;
            case 3:
                ((yz0) obj).setCrossfadeProgress(f7);
                return;
            case 4:
                ((SecretMediaViewer) obj).setVideoCrossfadeAlpha(f7);
                return;
            case 5:
                ((SecretMediaViewer) obj).setAnimationValue(f7);
                return;
            default:
                z31 z31Var = (z31) obj;
                if (z31Var.f46150a != f7) {
                    z31Var.f46150a = f7;
                    SecretMediaViewer secretMediaViewer = z31Var.f46155r;
                    secretMediaViewer.S.setAlpha(f7);
                    if (z31Var.f46151b) {
                        org.telegram.ui.ActionBar.b6 b6Var = secretMediaViewer.S;
                        b6Var.setPivotX(b6Var.getWidth());
                        org.telegram.ui.ActionBar.b6 b6Var2 = secretMediaViewer.S;
                        b6Var2.setPivotY(b6Var2.getHeight());
                        float f10 = 1.0f - f7;
                        float f11 = 1.0f - (0.1f * f10);
                        secretMediaViewer.S.setScaleX(f11);
                        secretMediaViewer.S.setScaleY(f11);
                        org.telegram.ui.Components.v81 v81Var = secretMediaViewer.Q;
                        if (v81Var.f33628y != f10) {
                            v81Var.f33628y = f10;
                            v81Var.v.invalidate();
                            return;
                        }
                        return;
                    }
                    if (z31Var.f46152c) {
                        z31Var.setTranslationY((1.0f - f7) * AndroidUtilities.dpf2(24.0f));
                    }
                    secretMediaViewer.R.setAlpha(f7);
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f43197b) {
            case 0:
                return Float.valueOf(((ArticleViewer$WindowView) obj).getInnerTranslationX());
            case 1:
                return Float.valueOf(wn.f45035fd);
            case 2:
                return Float.valueOf(((org.telegram.ui.Cells.s1) obj).getTimeAlpha());
            case 3:
                return Float.valueOf(((yz0) obj).S);
            case 4:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 5:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            default:
                return Float.valueOf(((z31) obj).f46150a);
        }
    }
}
