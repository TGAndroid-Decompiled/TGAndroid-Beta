package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class u0 extends org.telegram.ui.Components.m6 {
    public final int f38788b;

    public u0(String str, int i10) {
        super(str, 0);
        this.f38788b = i10;
    }

    @Override
    public final void b(Object obj, float f10) {
        switch (this.f38788b) {
            case 0:
                ((ArticleViewer$WindowView) obj).setInnerTranslationX(f10);
                return;
            case 1:
                xn.Ec = (int) f10;
                return;
            case 2:
                ((org.telegram.ui.Cells.t1) obj).setTimeAlpha(f10);
                return;
            case 3:
                ((tz0) obj).setCrossfadeProgress(f10);
                return;
            case 4:
                ((SecretMediaViewer) obj).setVideoCrossfadeAlpha(f10);
                return;
            case 5:
                ((SecretMediaViewer) obj).setAnimationValue(f10);
                return;
            default:
                j41 j41Var = (j41) obj;
                if (j41Var.f35231a != f10) {
                    j41Var.f35231a = f10;
                    SecretMediaViewer secretMediaViewer = j41Var.f35236r;
                    secretMediaViewer.P.setAlpha(f10);
                    if (j41Var.f35232b) {
                        org.telegram.ui.ActionBar.k5 k5Var = secretMediaViewer.P;
                        k5Var.setPivotX(k5Var.getWidth());
                        org.telegram.ui.ActionBar.k5 k5Var2 = secretMediaViewer.P;
                        k5Var2.setPivotY(k5Var2.getHeight());
                        float f11 = 1.0f - f10;
                        float f12 = 1.0f - (0.1f * f11);
                        secretMediaViewer.P.setScaleX(f12);
                        secretMediaViewer.P.setScaleY(f12);
                        org.telegram.ui.Components.k71 k71Var = secretMediaViewer.N;
                        if (k71Var.f26199y != f11) {
                            k71Var.f26199y = f11;
                            k71Var.v.invalidate();
                            return;
                        }
                        return;
                    }
                    if (j41Var.f35233c) {
                        j41Var.setTranslationY((1.0f - f10) * AndroidUtilities.dpf2(24.0f));
                    }
                    secretMediaViewer.O.setAlpha(f10);
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f38788b) {
            case 0:
                return Float.valueOf(((ArticleViewer$WindowView) obj).getInnerTranslationX());
            case 1:
                return Float.valueOf(xn.Ec);
            case 2:
                return Float.valueOf(((org.telegram.ui.Cells.t1) obj).getTimeAlpha());
            case 3:
                return Float.valueOf(((tz0) obj).P);
            case 4:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 5:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            default:
                return Float.valueOf(((j41) obj).f35231a);
        }
    }
}
