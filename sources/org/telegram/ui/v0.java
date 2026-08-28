package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class v0 extends org.telegram.ui.Components.l6 {
    public final int f43349b;

    public v0(String str, int i9) {
        super(str, 0);
        this.f43349b = i9;
    }

    @Override
    public final void b(Object obj, float f10) {
        switch (this.f43349b) {
            case 0:
                ((ArticleViewer$WindowView) obj).setInnerTranslationX(f10);
                return;
            case 1:
                qn.Dc = (int) f10;
                return;
            case 2:
                ((org.telegram.ui.Cells.t1) obj).setTimeAlpha(f10);
                return;
            case 3:
                ((iz0) obj).setCrossfadeProgress(f10);
                return;
            case 4:
                ((SecretMediaViewer) obj).setVideoCrossfadeAlpha(f10);
                return;
            case 5:
                ((SecretMediaViewer) obj).setAnimationValue(f10);
                return;
            default:
                x31 x31Var = (x31) obj;
                if (x31Var.f44355a != f10) {
                    x31Var.f44355a = f10;
                    SecretMediaViewer secretMediaViewer = x31Var.f44361r;
                    secretMediaViewer.O.setAlpha(f10);
                    if (x31Var.f44356b) {
                        org.telegram.ui.ActionBar.h5 h5Var = secretMediaViewer.O;
                        h5Var.setPivotX(h5Var.getWidth());
                        org.telegram.ui.ActionBar.h5 h5Var2 = secretMediaViewer.O;
                        h5Var2.setPivotY(h5Var2.getHeight());
                        float f11 = 1.0f - f10;
                        float f12 = 1.0f - (0.1f * f11);
                        secretMediaViewer.O.setScaleX(f12);
                        secretMediaViewer.O.setScaleY(f12);
                        org.telegram.ui.Components.m61 m61Var = secretMediaViewer.M;
                        if (m61Var.f30728y != f11) {
                            m61Var.f30728y = f11;
                            m61Var.v.invalidate();
                            return;
                        }
                        return;
                    }
                    if (x31Var.f44357c) {
                        x31Var.setTranslationY((1.0f - f10) * AndroidUtilities.dpf2(24.0f));
                    }
                    secretMediaViewer.N.setAlpha(f10);
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f43349b) {
            case 0:
                return Float.valueOf(((ArticleViewer$WindowView) obj).getInnerTranslationX());
            case 1:
                return Float.valueOf(qn.Dc);
            case 2:
                return Float.valueOf(((org.telegram.ui.Cells.t1) obj).getTimeAlpha());
            case 3:
                return Float.valueOf(((iz0) obj).O);
            case 4:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 5:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            default:
                return Float.valueOf(((x31) obj).f44355a);
        }
    }
}
