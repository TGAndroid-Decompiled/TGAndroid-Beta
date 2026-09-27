package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class u0 extends org.telegram.ui.Components.r6 {
    public final int f38091b;

    public u0(String str, int i10) {
        super(str, 0);
        this.f38091b = i10;
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f38091b) {
            case 0:
                ((ArticleViewer$WindowView) obj).setInnerTranslationX(f7);
                return;
            case 1:
                xn.Gc = (int) f7;
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
                if (y41Var.f40130a != f7) {
                    y41Var.f40130a = f7;
                    SecretMediaViewer secretMediaViewer = y41Var.f40135r;
                    secretMediaViewer.S.setAlpha(f7);
                    if (y41Var.f40131b) {
                        org.telegram.ui.ActionBar.j5 j5Var = secretMediaViewer.S;
                        j5Var.setPivotX(j5Var.getWidth());
                        org.telegram.ui.ActionBar.j5 j5Var2 = secretMediaViewer.S;
                        j5Var2.setPivotY(j5Var2.getHeight());
                        float f10 = 1.0f - f7;
                        float f11 = 1.0f - (0.1f * f10);
                        secretMediaViewer.S.setScaleX(f11);
                        secretMediaViewer.S.setScaleY(f11);
                        org.telegram.ui.Components.w71 w71Var = secretMediaViewer.Q;
                        if (w71Var.f29885y != f10) {
                            w71Var.f29885y = f10;
                            w71Var.v.invalidate();
                            return;
                        }
                        return;
                    }
                    if (y41Var.f40132c) {
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
        switch (this.f38091b) {
            case 0:
                return Float.valueOf(((ArticleViewer$WindowView) obj).getInnerTranslationX());
            case 1:
                return Float.valueOf(xn.Gc);
            case 2:
                return Float.valueOf(((org.telegram.ui.Cells.u1) obj).getTimeAlpha());
            case 3:
                return Float.valueOf(((f01) obj).S);
            case 4:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 5:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            default:
                return Float.valueOf(((y41) obj).f40130a);
        }
    }
}
