package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class t0 extends org.telegram.ui.Components.r6 {
    public final int f40646b;

    public t0(String str, int i10) {
        super(str, 0);
        this.f40646b = i10;
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f40646b) {
            case 0:
                ((ArticleViewer$WindowView) obj).setInnerTranslationX(f7);
                return;
            case 1:
                yn.Bc = (int) f7;
                return;
            case 2:
                ((org.telegram.ui.Cells.u1) obj).setTimeAlpha(f7);
                return;
            case 3:
                ((f01) obj).setCrossfadeProgress(f7);
                return;
            case 4:
                ((SecretMediaViewer) obj).setVideoCrossfadeAlpha(f7);
                return;
            case 5:
                ((SecretMediaViewer) obj).setAnimationValue(f7);
                return;
            default:
                y41 y41Var = (y41) obj;
                if (y41Var.f43062a != f7) {
                    y41Var.f43062a = f7;
                    SecretMediaViewer secretMediaViewer = y41Var.f43068r;
                    secretMediaViewer.S.setAlpha(f7);
                    if (y41Var.f43063b) {
                        org.telegram.ui.ActionBar.i5 i5Var = secretMediaViewer.S;
                        i5Var.setPivotX(i5Var.getWidth());
                        org.telegram.ui.ActionBar.i5 i5Var2 = secretMediaViewer.S;
                        i5Var2.setPivotY(i5Var2.getHeight());
                        float f10 = 1.0f - f7;
                        float f11 = 1.0f - (0.1f * f10);
                        secretMediaViewer.S.setScaleX(f11);
                        secretMediaViewer.S.setScaleY(f11);
                        org.telegram.ui.Components.f81 f81Var = secretMediaViewer.Q;
                        if (f81Var.f26390y != f10) {
                            f81Var.f26390y = f10;
                            f81Var.v.invalidate();
                            return;
                        }
                        return;
                    }
                    if (y41Var.f43064c) {
                        y41Var.setTranslationY((1.0f - f7) * AndroidUtilities.dpf2(24.0f));
                    }
                    secretMediaViewer.R.setAlpha(f7);
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f40646b) {
            case 0:
                return Float.valueOf(((ArticleViewer$WindowView) obj).getInnerTranslationX());
            case 1:
                return Float.valueOf(yn.Bc);
            case 2:
                return Float.valueOf(((org.telegram.ui.Cells.u1) obj).getTimeAlpha());
            case 3:
                return Float.valueOf(((f01) obj).S);
            case 4:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 5:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            default:
                return Float.valueOf(((y41) obj).f43062a);
        }
    }
}
