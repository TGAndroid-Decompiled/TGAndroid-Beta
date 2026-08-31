package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class u0 extends org.telegram.ui.Components.m6 {
    public final int f41743b;

    public u0(String str, int i10) {
        super(str, 0);
        this.f41743b = i10;
    }

    @Override
    public final void b(Object obj, float f10) {
        switch (this.f41743b) {
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
                ((vz0) obj).setCrossfadeProgress(f10);
                return;
            case 4:
                ((SecretMediaViewer) obj).setVideoCrossfadeAlpha(f10);
                return;
            case 5:
                ((SecretMediaViewer) obj).setAnimationValue(f10);
                return;
            default:
                l41 l41Var = (l41) obj;
                if (l41Var.f38630a != f10) {
                    l41Var.f38630a = f10;
                    SecretMediaViewer secretMediaViewer = l41Var.f38636r;
                    secretMediaViewer.P.setAlpha(f10);
                    if (l41Var.f38631b) {
                        org.telegram.ui.ActionBar.l5 l5Var = secretMediaViewer.P;
                        l5Var.setPivotX(l5Var.getWidth());
                        org.telegram.ui.ActionBar.l5 l5Var2 = secretMediaViewer.P;
                        l5Var2.setPivotY(l5Var2.getHeight());
                        float f11 = 1.0f - f10;
                        float f12 = 1.0f - (0.1f * f11);
                        secretMediaViewer.P.setScaleX(f12);
                        secretMediaViewer.P.setScaleY(f12);
                        org.telegram.ui.Components.m71 m71Var = secretMediaViewer.N;
                        if (m71Var.f28978y != f11) {
                            m71Var.f28978y = f11;
                            m71Var.v.invalidate();
                            return;
                        }
                        return;
                    }
                    if (l41Var.f38632c) {
                        l41Var.setTranslationY((1.0f - f10) * AndroidUtilities.dpf2(24.0f));
                    }
                    secretMediaViewer.O.setAlpha(f10);
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f41743b) {
            case 0:
                return Float.valueOf(((ArticleViewer$WindowView) obj).getInnerTranslationX());
            case 1:
                return Float.valueOf(xn.Ec);
            case 2:
                return Float.valueOf(((org.telegram.ui.Cells.t1) obj).getTimeAlpha());
            case 3:
                return Float.valueOf(((vz0) obj).P);
            case 4:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 5:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            default:
                return Float.valueOf(((l41) obj).f38630a);
        }
    }
}
