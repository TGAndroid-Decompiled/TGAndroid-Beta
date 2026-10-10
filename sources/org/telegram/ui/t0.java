package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class t0 extends org.telegram.ui.Components.t6 {
    public final int f41851b;

    public t0(String str, int i10) {
        super(str, 0);
        this.f41851b = i10;
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f41851b) {
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
                ((l01) obj).setCrossfadeProgress(f7);
                return;
            case 4:
                ((SecretMediaViewer) obj).setVideoCrossfadeAlpha(f7);
                return;
            case 5:
                ((SecretMediaViewer) obj).setAnimationValue(f7);
                return;
            default:
                e51 e51Var = (e51) obj;
                if (e51Var.f37201a != f7) {
                    e51Var.f37201a = f7;
                    SecretMediaViewer secretMediaViewer = e51Var.f37207r;
                    secretMediaViewer.S.setAlpha(f7);
                    if (e51Var.f37202b) {
                        org.telegram.ui.ActionBar.j5 j5Var = secretMediaViewer.S;
                        j5Var.setPivotX(j5Var.getWidth());
                        org.telegram.ui.ActionBar.j5 j5Var2 = secretMediaViewer.S;
                        j5Var2.setPivotY(j5Var2.getHeight());
                        float f10 = 1.0f - f7;
                        float f11 = 1.0f - (0.1f * f10);
                        secretMediaViewer.S.setScaleX(f11);
                        secretMediaViewer.S.setScaleY(f11);
                        org.telegram.ui.Components.n81 n81Var = secretMediaViewer.Q;
                        if (n81Var.f29067y != f10) {
                            n81Var.f29067y = f10;
                            n81Var.v.invalidate();
                            return;
                        }
                        return;
                    }
                    if (e51Var.f37203c) {
                        e51Var.setTranslationY((1.0f - f7) * AndroidUtilities.dpf2(24.0f));
                    }
                    secretMediaViewer.R.setAlpha(f7);
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f41851b) {
            case 0:
                return Float.valueOf(((ArticleViewer$WindowView) obj).getInnerTranslationX());
            case 1:
                return Float.valueOf(zn.Hc);
            case 2:
                return Float.valueOf(((org.telegram.ui.Cells.u1) obj).getTimeAlpha());
            case 3:
                return Float.valueOf(((l01) obj).S);
            case 4:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 5:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            default:
                return Float.valueOf(((e51) obj).f37201a);
        }
    }
}
