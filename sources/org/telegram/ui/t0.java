package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class t0 extends org.telegram.ui.Components.t6 {
    public final int f42034b;

    public t0(String str, int i10) {
        super(str, 0);
        this.f42034b = i10;
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f42034b) {
            case 0:
                ((ArticleViewer$WindowView) obj).setInnerTranslationX(f7);
                return;
            case 1:
                eo.Hc = (int) f7;
                return;
            case 2:
                ((org.telegram.ui.Cells.u1) obj).setTimeAlpha(f7);
                return;
            case 3:
                ((n01) obj).setCrossfadeProgress(f7);
                return;
            case 4:
                ((SecretMediaViewer) obj).setVideoCrossfadeAlpha(f7);
                return;
            case 5:
                ((SecretMediaViewer) obj).setAnimationValue(f7);
                return;
            default:
                h51 h51Var = (h51) obj;
                if (h51Var.f38248a != f7) {
                    h51Var.f38248a = f7;
                    SecretMediaViewer secretMediaViewer = h51Var.f38254r;
                    secretMediaViewer.S.setAlpha(f7);
                    if (h51Var.f38249b) {
                        org.telegram.ui.ActionBar.h5 h5Var = secretMediaViewer.S;
                        h5Var.setPivotX(h5Var.getWidth());
                        org.telegram.ui.ActionBar.h5 h5Var2 = secretMediaViewer.S;
                        h5Var2.setPivotY(h5Var2.getHeight());
                        float f10 = 1.0f - f7;
                        float f11 = 1.0f - (0.1f * f10);
                        secretMediaViewer.S.setScaleX(f11);
                        secretMediaViewer.S.setScaleY(f11);
                        org.telegram.ui.Components.s81 s81Var = secretMediaViewer.Q;
                        if (s81Var.f30496y != f10) {
                            s81Var.f30496y = f10;
                            s81Var.v.invalidate();
                            return;
                        }
                        return;
                    }
                    if (h51Var.f38250c) {
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
        switch (this.f42034b) {
            case 0:
                return Float.valueOf(((ArticleViewer$WindowView) obj).getInnerTranslationX());
            case 1:
                return Float.valueOf(eo.Hc);
            case 2:
                return Float.valueOf(((org.telegram.ui.Cells.u1) obj).getTimeAlpha());
            case 3:
                return Float.valueOf(((n01) obj).S);
            case 4:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 5:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            default:
                return Float.valueOf(((h51) obj).f38248a);
        }
    }
}
