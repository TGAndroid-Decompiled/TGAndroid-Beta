package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class t0 extends org.telegram.ui.Components.q6 {
    public final int f36801b;

    public t0(String str, int i10) {
        super(str, 0);
        this.f36801b = i10;
    }

    @Override
    public final void b(Object obj, float f7) {
        switch (this.f36801b) {
            case 0:
                ((ArticleViewer$WindowView) obj).setInnerTranslationX(f7);
                return;
            case 1:
                eo.Hc = (int) f7;
                return;
            case 2:
                ((org.telegram.ui.Cells.t1) obj).setTimeAlpha(f7);
                return;
            case 3:
                ((s01) obj).setCrossfadeProgress(f7);
                return;
            case 4:
                ((SecretMediaViewer) obj).setVideoCrossfadeAlpha(f7);
                return;
            case 5:
                ((SecretMediaViewer) obj).setAnimationValue(f7);
                return;
            default:
                h51 h51Var = (h51) obj;
                if (h51Var.f33278a != f7) {
                    h51Var.f33278a = f7;
                    SecretMediaViewer secretMediaViewer = h51Var.f33283r;
                    secretMediaViewer.S.setAlpha(f7);
                    if (h51Var.f33279b) {
                        org.telegram.ui.ActionBar.l5 l5Var = secretMediaViewer.S;
                        l5Var.setPivotX(l5Var.getWidth());
                        org.telegram.ui.ActionBar.l5 l5Var2 = secretMediaViewer.S;
                        l5Var2.setPivotY(l5Var2.getHeight());
                        float f10 = 1.0f - f7;
                        float f11 = 1.0f - (0.1f * f10);
                        secretMediaViewer.S.setScaleX(f11);
                        secretMediaViewer.S.setScaleY(f11);
                        org.telegram.ui.Components.v71 v71Var = secretMediaViewer.Q;
                        if (v71Var.f27869y != f10) {
                            v71Var.f27869y = f10;
                            v71Var.v.invalidate();
                            return;
                        }
                        return;
                    }
                    if (h51Var.f33280c) {
                        h51Var.setTranslationY((1.0f - f7) * AndroidUtilities.dpf2(24.0f));
                    }
                    secretMediaViewer.R.setAlpha(f7);
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f36801b) {
            case 0:
                return Float.valueOf(((ArticleViewer$WindowView) obj).getInnerTranslationX());
            case 1:
                return Float.valueOf(eo.Hc);
            case 2:
                return Float.valueOf(((org.telegram.ui.Cells.t1) obj).getTimeAlpha());
            case 3:
                return Float.valueOf(((s01) obj).S);
            case 4:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 5:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            default:
                return Float.valueOf(((h51) obj).f33278a);
        }
    }
}
