package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class s0 extends org.telegram.ui.Components.p6 {
    public final int f37218b;

    public s0(String str, int i10) {
        super(str, 0);
        this.f37218b = i10;
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f37218b) {
            case 0:
                ((ArticleViewer$WindowView) obj).setInnerTranslationX(f7);
                return;
            case 1:
                bo.Hc = (int) f7;
                return;
            case 2:
                ((org.telegram.ui.Cells.t1) obj).setTimeAlpha(f7);
                return;
            case 3:
                ((m01) obj).setCrossfadeProgress(f7);
                return;
            case 4:
                ((SecretMediaViewer) obj).setVideoCrossfadeAlpha(f7);
                return;
            case 5:
                ((SecretMediaViewer) obj).setAnimationValue(f7);
                return;
            default:
                b51 b51Var = (b51) obj;
                if (b51Var.f32053a != f7) {
                    b51Var.f32053a = f7;
                    SecretMediaViewer secretMediaViewer = b51Var.f32058r;
                    secretMediaViewer.S.setAlpha(f7);
                    if (b51Var.f32054b) {
                        org.telegram.ui.ActionBar.j5 j5Var = secretMediaViewer.S;
                        j5Var.setPivotX(j5Var.getWidth());
                        org.telegram.ui.ActionBar.j5 j5Var2 = secretMediaViewer.S;
                        j5Var2.setPivotY(j5Var2.getHeight());
                        float f10 = 1.0f - f7;
                        float f11 = 1.0f - (0.1f * f10);
                        secretMediaViewer.S.setScaleX(f11);
                        secretMediaViewer.S.setScaleY(f11);
                        org.telegram.ui.Components.i71 i71Var = secretMediaViewer.Q;
                        if (i71Var.f24936y != f10) {
                            i71Var.f24936y = f10;
                            i71Var.v.invalidate();
                            return;
                        }
                        return;
                    }
                    if (b51Var.f32055c) {
                        b51Var.setTranslationY((1.0f - f7) * AndroidUtilities.dpf2(24.0f));
                    }
                    secretMediaViewer.R.setAlpha(f7);
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f37218b) {
            case 0:
                return Float.valueOf(((ArticleViewer$WindowView) obj).getInnerTranslationX());
            case 1:
                return Float.valueOf(bo.Hc);
            case 2:
                return Float.valueOf(((org.telegram.ui.Cells.t1) obj).getTimeAlpha());
            case 3:
                return Float.valueOf(((m01) obj).S);
            case 4:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 5:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            default:
                return Float.valueOf(((b51) obj).f32053a);
        }
    }
}
