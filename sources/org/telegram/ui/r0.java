package org.telegram.ui;
public final class r0 extends org.telegram.ui.Components.j6 {
    public final int f48979b;

    public r0(String str, int i3) {
        super(str, 0);
        this.f48979b = i3;
    }

    @Override
    public final void c(Object obj, float f10) {
        switch (this.f48979b) {
            case 0:
                ((ArticleViewer$WindowView) obj).setInnerTranslationX(f10);
                return;
            case 1:
                wm.f51227jd = (int) f10;
                return;
            case 2:
                ((org.telegram.ui.Cells.q1) obj).setTimeAlpha(f10);
                return;
            case 3:
                ((org.telegram.messenger.vi) obj).d = f10;
                return;
            case 4:
                ((nv0) obj).setCrossfadeProgress(f10);
                return;
            case 5:
                ((SecretMediaViewer) obj).setVideoCrossfadeAlpha(f10);
                return;
            case 6:
                ((SecretMediaViewer) obj).setAnimationValue(f10);
                return;
            default:
                cz0 cz0Var = (cz0) obj;
                if (cz0Var.f44497a != f10) {
                    cz0Var.f44497a = f10;
                    SecretMediaViewer secretMediaViewer = cz0Var.f44503r;
                    secretMediaViewer.R.setAlpha(f10);
                    if (cz0Var.f44498b) {
                        org.telegram.ui.ActionBar.k5 k5Var = secretMediaViewer.R;
                        k5Var.setPivotX(k5Var.getWidth());
                        org.telegram.ui.ActionBar.k5 k5Var2 = secretMediaViewer.R;
                        k5Var2.setPivotY(k5Var2.getHeight());
                        float f11 = 1.0f - f10;
                        float f12 = 1.0f - (0.1f * f11);
                        secretMediaViewer.R.setScaleX(f12);
                        secretMediaViewer.R.setScaleY(f12);
                        org.telegram.ui.Components.o51 o51Var = secretMediaViewer.P;
                        if (o51Var.f36740y != f11) {
                            o51Var.f36740y = f11;
                            o51Var.v.invalidate();
                            return;
                        }
                        return;
                    }
                    if (cz0Var.f44499c) {
                        cz0Var.setTranslationY((1.0f - f10) * org.telegram.messenger.g0.N(24.0f));
                    }
                    secretMediaViewer.Q.setAlpha(f10);
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f48979b) {
            case 0:
                return Float.valueOf(((ArticleViewer$WindowView) obj).getInnerTranslationX());
            case 1:
                return Float.valueOf(wm.f51227jd);
            case 2:
                return Float.valueOf(((org.telegram.ui.Cells.q1) obj).getTimeAlpha());
            case 3:
                return Float.valueOf(((org.telegram.messenger.vi) obj).d);
            case 4:
                return Float.valueOf(((nv0) obj).T);
            case 5:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 6:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            default:
                return Float.valueOf(((cz0) obj).f44497a);
        }
    }
}
