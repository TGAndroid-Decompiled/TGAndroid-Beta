package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class v0 extends org.telegram.ui.Components.s6 {
    public final int f42100b;

    public v0(String str, int i10) {
        super(str, 0);
        this.f42100b = i10;
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f42100b) {
            case 0:
                ((ArticleViewer$WindowView) obj).setInnerTranslationX(f7);
                return;
            case 1:
                sn.Hc = (int) f7;
                return;
            case 2:
                ((org.telegram.ui.Cells.u1) obj).setTimeAlpha(f7);
                return;
            case 3:
                ((qz0) obj).setCrossfadeProgress(f7);
                return;
            case 4:
                ((SecretMediaViewer) obj).setVideoCrossfadeAlpha(f7);
                return;
            case 5:
                ((SecretMediaViewer) obj).setAnimationValue(f7);
                return;
            default:
                t31 t31Var = (t31) obj;
                if (t31Var.f41606a != f7) {
                    t31Var.f41606a = f7;
                    SecretMediaViewer secretMediaViewer = t31Var.f41611r;
                    secretMediaViewer.S.setAlpha(f7);
                    if (t31Var.f41607b) {
                        org.telegram.ui.ActionBar.j5 j5Var = secretMediaViewer.S;
                        j5Var.setPivotX(j5Var.getWidth());
                        org.telegram.ui.ActionBar.j5 j5Var2 = secretMediaViewer.S;
                        j5Var2.setPivotY(j5Var2.getHeight());
                        float f10 = 1.0f - f7;
                        float f11 = 1.0f - (0.1f * f10);
                        secretMediaViewer.S.setScaleX(f11);
                        secretMediaViewer.S.setScaleY(f11);
                        org.telegram.ui.Components.c81 c81Var = secretMediaViewer.Q;
                        if (c81Var.f25160y != f10) {
                            c81Var.f25160y = f10;
                            c81Var.v.invalidate();
                            return;
                        }
                        return;
                    }
                    if (t31Var.f41608c) {
                        t31Var.setTranslationY((1.0f - f7) * AndroidUtilities.dpf2(24.0f));
                    }
                    secretMediaViewer.R.setAlpha(f7);
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f42100b) {
            case 0:
                return Float.valueOf(((ArticleViewer$WindowView) obj).getInnerTranslationX());
            case 1:
                return Float.valueOf(sn.Hc);
            case 2:
                return Float.valueOf(((org.telegram.ui.Cells.u1) obj).getTimeAlpha());
            case 3:
                return Float.valueOf(((qz0) obj).S);
            case 4:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 5:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            default:
                return Float.valueOf(((t31) obj).f41606a);
        }
    }
}
