package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

public final class w0 extends org.telegram.ui.Components.l6 {

    public final int f43558b;

    public w0(String str, int i10) {
        super(str, 0);
        this.f43558b = i10;
    }

    @Override
    public final void c(Object obj, float f10) {
        switch (this.f43558b) {
            case 0:
                ((ArticleViewer$WindowView) obj).setInnerTranslationX(f10);
                break;
            case 1:
                rn.Dc = (int) f10;
                break;
            case 2:
                ((org.telegram.ui.Cells.s1) obj).setTimeAlpha(f10);
                break;
            case 3:
                ((iz0) obj).setCrossfadeProgress(f10);
                break;
            case 4:
                ((SecretMediaViewer) obj).setVideoCrossfadeAlpha(f10);
                break;
            case 5:
                ((SecretMediaViewer) obj).setAnimationValue(f10);
                break;
            default:
                w31 w31Var = (w31) obj;
                if (w31Var.f43591a != f10) {
                    w31Var.f43591a = f10;
                    SecretMediaViewer secretMediaViewer = w31Var.f43597r;
                    secretMediaViewer.O.setAlpha(f10);
                    if (!w31Var.f43592b) {
                        if (w31Var.f43593c) {
                            w31Var.setTranslationY((1.0f - f10) * AndroidUtilities.dpf2(24.0f));
                        }
                        secretMediaViewer.N.setAlpha(f10);
                    } else {
                        org.telegram.ui.ActionBar.h5 h5Var = secretMediaViewer.O;
                        h5Var.setPivotX(h5Var.getWidth());
                        org.telegram.ui.ActionBar.h5 h5Var2 = secretMediaViewer.O;
                        h5Var2.setPivotY(h5Var2.getHeight());
                        float f11 = 1.0f - f10;
                        float f12 = 1.0f - (0.1f * f11);
                        secretMediaViewer.O.setScaleX(f12);
                        secretMediaViewer.O.setScaleY(f12);
                        org.telegram.ui.Components.o61 o61Var = secretMediaViewer.M;
                        if (o61Var.f31198y != f11) {
                            o61Var.f31198y = f11;
                            o61Var.v.invalidate();
                        }
                    }
                }
                break;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f43558b) {
            case 0:
                return Float.valueOf(((ArticleViewer$WindowView) obj).getInnerTranslationX());
            case 1:
                return Float.valueOf(rn.Dc);
            case 2:
                return Float.valueOf(((org.telegram.ui.Cells.s1) obj).getTimeAlpha());
            case 3:
                return Float.valueOf(((iz0) obj).O);
            case 4:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 5:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            default:
                return Float.valueOf(((w31) obj).f43591a);
        }
    }
}
