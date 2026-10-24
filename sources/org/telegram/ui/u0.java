package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class u0 extends org.telegram.ui.Components.q6 {
    public final int f42168b;

    public u0(String str, int i10) {
        super(str, 0);
        this.f42168b = i10;
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f42168b) {
            case 0:
                ((ArticleViewer$WindowView) obj).setInnerTranslationX(f7);
                return;
            case 1:
                sn.Vc = (int) f7;
                return;
            case 2:
                ((org.telegram.ui.Cells.t1) obj).setTimeAlpha(f7);
                return;
            case 3:
                ((rz0) obj).setCrossfadeProgress(f7);
                return;
            case 4:
                ((SecretMediaViewer) obj).setVideoCrossfadeAlpha(f7);
                return;
            case 5:
                ((SecretMediaViewer) obj).setAnimationValue(f7);
                return;
            default:
                u31 u31Var = (u31) obj;
                if (u31Var.f42198a != f7) {
                    u31Var.f42198a = f7;
                    SecretMediaViewer secretMediaViewer = u31Var.f42203r;
                    secretMediaViewer.S.setAlpha(f7);
                    if (u31Var.f42199b) {
                        org.telegram.ui.ActionBar.n5 n5Var = secretMediaViewer.S;
                        n5Var.setPivotX(n5Var.getWidth());
                        org.telegram.ui.ActionBar.n5 n5Var2 = secretMediaViewer.S;
                        n5Var2.setPivotY(n5Var2.getHeight());
                        float f10 = 1.0f - f7;
                        float f11 = 1.0f - (0.1f * f10);
                        secretMediaViewer.S.setScaleX(f11);
                        secretMediaViewer.S.setScaleY(f11);
                        org.telegram.ui.Components.l81 l81Var = secretMediaViewer.Q;
                        if (l81Var.f28270y != f10) {
                            l81Var.f28270y = f10;
                            l81Var.v.invalidate();
                            return;
                        }
                        return;
                    }
                    if (u31Var.f42200c) {
                        u31Var.setTranslationY((1.0f - f7) * AndroidUtilities.dpf2(24.0f));
                    }
                    secretMediaViewer.R.setAlpha(f7);
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f42168b) {
            case 0:
                return Float.valueOf(((ArticleViewer$WindowView) obj).getInnerTranslationX());
            case 1:
                return Float.valueOf(sn.Vc);
            case 2:
                return Float.valueOf(((org.telegram.ui.Cells.t1) obj).getTimeAlpha());
            case 3:
                return Float.valueOf(((rz0) obj).S);
            case 4:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 5:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            default:
                return Float.valueOf(((u31) obj).f42198a);
        }
    }
}
