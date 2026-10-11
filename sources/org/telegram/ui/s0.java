package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class s0 extends org.telegram.ui.Components.t6 {
    public final int f41547b;

    public s0(String str, int i10) {
        super(str, 0);
        this.f41547b = i10;
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f41547b) {
            case 0:
                ((ArticleViewer$WindowView) obj).setInnerTranslationX(f7);
                return;
            case 1:
                zn.Hc = (int) f7;
                return;
            case 2:
                ((org.telegram.ui.Cells.u1) obj).setTimeAlpha(f7);
                return;
            case 3:
                ((k01) obj).setCrossfadeProgress(f7);
                return;
            case 4:
                ((SecretMediaViewer) obj).setVideoCrossfadeAlpha(f7);
                return;
            case 5:
                ((SecretMediaViewer) obj).setAnimationValue(f7);
                return;
            default:
                d51 d51Var = (d51) obj;
                if (d51Var.f36902a != f7) {
                    d51Var.f36902a = f7;
                    SecretMediaViewer secretMediaViewer = d51Var.f36908r;
                    secretMediaViewer.S.setAlpha(f7);
                    if (d51Var.f36903b) {
                        org.telegram.ui.ActionBar.h5 h5Var = secretMediaViewer.S;
                        h5Var.setPivotX(h5Var.getWidth());
                        org.telegram.ui.ActionBar.h5 h5Var2 = secretMediaViewer.S;
                        h5Var2.setPivotY(h5Var2.getHeight());
                        float f10 = 1.0f - f7;
                        float f11 = 1.0f - (0.1f * f10);
                        secretMediaViewer.S.setScaleX(f11);
                        secretMediaViewer.S.setScaleY(f11);
                        org.telegram.ui.Components.o81 o81Var = secretMediaViewer.Q;
                        if (o81Var.f29336y != f10) {
                            o81Var.f29336y = f10;
                            o81Var.v.invalidate();
                            return;
                        }
                        return;
                    }
                    if (d51Var.f36904c) {
                        d51Var.setTranslationY((1.0f - f7) * AndroidUtilities.dpf2(24.0f));
                    }
                    secretMediaViewer.R.setAlpha(f7);
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f41547b) {
            case 0:
                return Float.valueOf(((ArticleViewer$WindowView) obj).getInnerTranslationX());
            case 1:
                return Float.valueOf(zn.Hc);
            case 2:
                return Float.valueOf(((org.telegram.ui.Cells.u1) obj).getTimeAlpha());
            case 3:
                return Float.valueOf(((k01) obj).S);
            case 4:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 5:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            default:
                return Float.valueOf(((d51) obj).f36902a);
        }
    }
}
