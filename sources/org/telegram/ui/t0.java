package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class t0 extends org.telegram.ui.Components.r6 {
    public final int f37901b;

    public t0(String str, int i10) {
        super(str, 0);
        this.f37901b = i10;
    }

    @Override
    public final void b(Object obj, float f7) {
        switch (this.f37901b) {
            case 0:
                ((ArticleViewer$WindowView) obj).setInnerTranslationX(f7);
                return;
            case 1:
                wn.Gc = (int) f7;
                return;
            case 2:
                ((org.telegram.ui.Cells.u1) obj).setTimeAlpha(f7);
                return;
            case 3:
                ((d01) obj).setCrossfadeProgress(f7);
                return;
            case 4:
                ((SecretMediaViewer) obj).setVideoCrossfadeAlpha(f7);
                return;
            case 5:
                ((SecretMediaViewer) obj).setAnimationValue(f7);
                return;
            default:
                v41 v41Var = (v41) obj;
                if (v41Var.f38630a != f7) {
                    v41Var.f38630a = f7;
                    SecretMediaViewer secretMediaViewer = v41Var.f38635r;
                    secretMediaViewer.S.setAlpha(f7);
                    if (v41Var.f38631b) {
                        org.telegram.ui.ActionBar.h5 h5Var = secretMediaViewer.S;
                        h5Var.setPivotX(h5Var.getWidth());
                        org.telegram.ui.ActionBar.h5 h5Var2 = secretMediaViewer.S;
                        h5Var2.setPivotY(h5Var2.getHeight());
                        float f10 = 1.0f - f7;
                        float f11 = 1.0f - (0.1f * f10);
                        secretMediaViewer.S.setScaleX(f11);
                        secretMediaViewer.S.setScaleY(f11);
                        org.telegram.ui.Components.u71 u71Var = secretMediaViewer.Q;
                        if (u71Var.f28755y != f10) {
                            u71Var.f28755y = f10;
                            u71Var.v.invalidate();
                            return;
                        }
                        return;
                    }
                    if (v41Var.f38632c) {
                        v41Var.setTranslationY((1.0f - f7) * AndroidUtilities.dpf2(24.0f));
                    }
                    secretMediaViewer.R.setAlpha(f7);
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f37901b) {
            case 0:
                return Float.valueOf(((ArticleViewer$WindowView) obj).getInnerTranslationX());
            case 1:
                return Float.valueOf(wn.Gc);
            case 2:
                return Float.valueOf(((org.telegram.ui.Cells.u1) obj).getTimeAlpha());
            case 3:
                return Float.valueOf(((d01) obj).S);
            case 4:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 5:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            default:
                return Float.valueOf(((v41) obj).f38630a);
        }
    }
}
