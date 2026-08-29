package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class w0 extends org.telegram.ui.Components.q6 {
    public final int f43806b;

    public w0(String str, int i10) {
        super(str, 0);
        this.f43806b = i10;
    }

    @Override
    public final void b(Object obj, float f9) {
        switch (this.f43806b) {
            case 0:
                ((ArticleViewer$WindowView) obj).setInnerTranslationX(f9);
                return;
            case 1:
                tn.Dc = (int) f9;
                return;
            case 2:
                ((org.telegram.ui.Cells.s1) obj).setTimeAlpha(f9);
                return;
            case 3:
                ((iz0) obj).setCrossfadeProgress(f9);
                return;
            case 4:
                ((SecretMediaViewer) obj).setVideoCrossfadeAlpha(f9);
                return;
            case 5:
                ((SecretMediaViewer) obj).setAnimationValue(f9);
                return;
            default:
                z31 z31Var = (z31) obj;
                if (z31Var.f45056a != f9) {
                    z31Var.f45056a = f9;
                    SecretMediaViewer secretMediaViewer = z31Var.f45062r;
                    secretMediaViewer.O.setAlpha(f9);
                    if (z31Var.f45057b) {
                        org.telegram.ui.ActionBar.h5 h5Var = secretMediaViewer.O;
                        h5Var.setPivotX(h5Var.getWidth());
                        org.telegram.ui.ActionBar.h5 h5Var2 = secretMediaViewer.O;
                        h5Var2.setPivotY(h5Var2.getHeight());
                        float f10 = 1.0f - f9;
                        float f11 = 1.0f - (0.1f * f10);
                        secretMediaViewer.O.setScaleX(f11);
                        secretMediaViewer.O.setScaleY(f11);
                        org.telegram.ui.Components.z61 z61Var = secretMediaViewer.M;
                        if (z61Var.f35250y != f10) {
                            z61Var.f35250y = f10;
                            z61Var.v.invalidate();
                            return;
                        }
                        return;
                    }
                    if (z31Var.f45058c) {
                        z31Var.setTranslationY((1.0f - f9) * AndroidUtilities.dpf2(24.0f));
                    }
                    secretMediaViewer.N.setAlpha(f9);
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f43806b) {
            case 0:
                return Float.valueOf(((ArticleViewer$WindowView) obj).getInnerTranslationX());
            case 1:
                return Float.valueOf(tn.Dc);
            case 2:
                return Float.valueOf(((org.telegram.ui.Cells.s1) obj).getTimeAlpha());
            case 3:
                return Float.valueOf(((iz0) obj).O);
            case 4:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 5:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            default:
                return Float.valueOf(((z31) obj).f45056a);
        }
    }
}
