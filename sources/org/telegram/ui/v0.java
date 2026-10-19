package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class v0 extends org.telegram.ui.Components.s6 {
    public final int f42077b;

    public v0(String str, int i10) {
        super(str, 0);
        this.f42077b = i10;
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f42077b) {
            case 0:
                ((ArticleViewer$WindowView) obj).setInnerTranslationX(f7);
                return;
            case 1:
                qn.Ic = (int) f7;
                return;
            case 2:
                ((org.telegram.ui.Cells.u1) obj).setTimeAlpha(f7);
                return;
            case 3:
                ((oz0) obj).setCrossfadeProgress(f7);
                return;
            case 4:
                ((SecretMediaViewer) obj).setVideoCrossfadeAlpha(f7);
                return;
            case 5:
                ((SecretMediaViewer) obj).setAnimationValue(f7);
                return;
            default:
                r31 r31Var = (r31) obj;
                if (r31Var.f41051a != f7) {
                    r31Var.f41051a = f7;
                    SecretMediaViewer secretMediaViewer = r31Var.f41056r;
                    secretMediaViewer.S.setAlpha(f7);
                    if (r31Var.f41052b) {
                        org.telegram.ui.ActionBar.j5 j5Var = secretMediaViewer.S;
                        j5Var.setPivotX(j5Var.getWidth());
                        org.telegram.ui.ActionBar.j5 j5Var2 = secretMediaViewer.S;
                        j5Var2.setPivotY(j5Var2.getHeight());
                        float f10 = 1.0f - f7;
                        float f11 = 1.0f - (0.1f * f10);
                        secretMediaViewer.S.setScaleX(f11);
                        secretMediaViewer.S.setScaleY(f11);
                        org.telegram.ui.Components.d81 d81Var = secretMediaViewer.Q;
                        if (d81Var.f25485y != f10) {
                            d81Var.f25485y = f10;
                            d81Var.v.invalidate();
                            return;
                        }
                        return;
                    }
                    if (r31Var.f41053c) {
                        r31Var.setTranslationY((1.0f - f7) * AndroidUtilities.dpf2(24.0f));
                    }
                    secretMediaViewer.R.setAlpha(f7);
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f42077b) {
            case 0:
                return Float.valueOf(((ArticleViewer$WindowView) obj).getInnerTranslationX());
            case 1:
                return Float.valueOf(qn.Ic);
            case 2:
                return Float.valueOf(((org.telegram.ui.Cells.u1) obj).getTimeAlpha());
            case 3:
                return Float.valueOf(((oz0) obj).S);
            case 4:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 5:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            default:
                return Float.valueOf(((r31) obj).f41051a);
        }
    }
}
