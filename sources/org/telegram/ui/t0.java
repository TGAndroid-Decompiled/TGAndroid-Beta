package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class t0 extends org.telegram.ui.Components.r6 {
    public final int f37476b;

    public t0(String str, int i10) {
        super(str, 0);
        this.f37476b = i10;
    }

    @Override
    public final void b(Object obj, float f7) {
        switch (this.f37476b) {
            case 0:
                ((ArticleViewer$WindowView) obj).setInnerTranslationX(f7);
                return;
            case 1:
                xn.Gc = (int) f7;
                return;
            case 2:
                ((org.telegram.ui.Cells.t1) obj).setTimeAlpha(f7);
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
                u41 u41Var = (u41) obj;
                if (u41Var.f37901a != f7) {
                    u41Var.f37901a = f7;
                    SecretMediaViewer secretMediaViewer = u41Var.f37906r;
                    secretMediaViewer.S.setAlpha(f7);
                    if (u41Var.f37902b) {
                        org.telegram.ui.ActionBar.i5 i5Var = secretMediaViewer.S;
                        i5Var.setPivotX(i5Var.getWidth());
                        org.telegram.ui.ActionBar.i5 i5Var2 = secretMediaViewer.S;
                        i5Var2.setPivotY(i5Var2.getHeight());
                        float f10 = 1.0f - f7;
                        float f11 = 1.0f - (0.1f * f10);
                        secretMediaViewer.S.setScaleX(f11);
                        secretMediaViewer.S.setScaleY(f11);
                        org.telegram.ui.Components.h71 h71Var = secretMediaViewer.Q;
                        if (h71Var.f24558y != f10) {
                            h71Var.f24558y = f10;
                            h71Var.v.invalidate();
                            return;
                        }
                        return;
                    }
                    if (u41Var.f37903c) {
                        u41Var.setTranslationY((1.0f - f7) * AndroidUtilities.dpf2(24.0f));
                    }
                    secretMediaViewer.R.setAlpha(f7);
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f37476b) {
            case 0:
                return Float.valueOf(((ArticleViewer$WindowView) obj).getInnerTranslationX());
            case 1:
                return Float.valueOf(xn.Gc);
            case 2:
                return Float.valueOf(((org.telegram.ui.Cells.t1) obj).getTimeAlpha());
            case 3:
                return Float.valueOf(((f01) obj).S);
            case 4:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 5:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            default:
                return Float.valueOf(((u41) obj).f37901a);
        }
    }
}
