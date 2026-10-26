package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class s0 extends org.telegram.ui.Components.u6 {
    public final int f43317b;

    public s0(String str, int i10) {
        super(str, 0);
        this.f43317b = i10;
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f43317b) {
            case 0:
                ((ArticleViewer$WindowView) obj).setInnerTranslationX(f7);
                return;
            case 1:
                un.f44171bd = (int) f7;
                return;
            case 2:
                ((org.telegram.ui.Cells.s1) obj).setTimeAlpha(f7);
                return;
            case 3:
                ((wz0) obj).setCrossfadeProgress(f7);
                return;
            case 4:
                ((SecretMediaViewer) obj).setVideoCrossfadeAlpha(f7);
                return;
            case 5:
                ((SecretMediaViewer) obj).setAnimationValue(f7);
                return;
            default:
                w31 w31Var = (w31) obj;
                if (w31Var.f44966a != f7) {
                    w31Var.f44966a = f7;
                    SecretMediaViewer secretMediaViewer = w31Var.f44971r;
                    secretMediaViewer.S.setAlpha(f7);
                    if (w31Var.f44967b) {
                        org.telegram.ui.ActionBar.b6 b6Var = secretMediaViewer.S;
                        b6Var.setPivotX(b6Var.getWidth());
                        org.telegram.ui.ActionBar.b6 b6Var2 = secretMediaViewer.S;
                        b6Var2.setPivotY(b6Var2.getHeight());
                        float f10 = 1.0f - f7;
                        float f11 = 1.0f - (0.1f * f10);
                        secretMediaViewer.S.setScaleX(f11);
                        secretMediaViewer.S.setScaleY(f11);
                        org.telegram.ui.Components.u81 u81Var = secretMediaViewer.Q;
                        if (u81Var.f33313y != f10) {
                            u81Var.f33313y = f10;
                            u81Var.v.invalidate();
                            return;
                        }
                        return;
                    }
                    if (w31Var.f44968c) {
                        w31Var.setTranslationY((1.0f - f7) * AndroidUtilities.dpf2(24.0f));
                    }
                    secretMediaViewer.R.setAlpha(f7);
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f43317b) {
            case 0:
                return Float.valueOf(((ArticleViewer$WindowView) obj).getInnerTranslationX());
            case 1:
                return Float.valueOf(un.f44171bd);
            case 2:
                return Float.valueOf(((org.telegram.ui.Cells.s1) obj).getTimeAlpha());
            case 3:
                return Float.valueOf(((wz0) obj).S);
            case 4:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 5:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            default:
                return Float.valueOf(((w31) obj).f44966a);
        }
    }
}
