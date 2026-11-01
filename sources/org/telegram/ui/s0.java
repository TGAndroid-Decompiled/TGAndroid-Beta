package org.telegram.ui;
public final class s0 extends org.telegram.ui.Components.h6 {
    public final int f41181b;

    public s0(String str, int i10) {
        super(str, 0);
        this.f41181b = i10;
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f41181b) {
            case 0:
                ((ArticleViewer$WindowView) obj).setInnerTranslationX(f7);
                return;
            case 1:
                un.f41979bd = (int) f7;
                return;
            case 2:
                ((org.telegram.ui.Cells.q1) obj).setTimeAlpha(f7);
                return;
            case 3:
                ((org.telegram.messenger.gj) obj).d = f7;
                return;
            case 4:
                ((ix0) obj).setCrossfadeProgress(f7);
                return;
            case 5:
                ((SecretMediaViewer) obj).setVideoCrossfadeAlpha(f7);
                return;
            case 6:
                ((SecretMediaViewer) obj).setAnimationValue(f7);
                return;
            default:
                b11 b11Var = (b11) obj;
                if (b11Var.f35901a != f7) {
                    b11Var.f35901a = f7;
                    SecretMediaViewer secretMediaViewer = b11Var.f35906r;
                    secretMediaViewer.Q.setAlpha(f7);
                    if (b11Var.f35902b) {
                        org.telegram.ui.ActionBar.u5 u5Var = secretMediaViewer.Q;
                        u5Var.setPivotX(u5Var.getWidth());
                        org.telegram.ui.ActionBar.u5 u5Var2 = secretMediaViewer.Q;
                        u5Var2.setPivotY(u5Var2.getHeight());
                        float f10 = 1.0f - f7;
                        float f11 = 1.0f - (0.1f * f10);
                        secretMediaViewer.Q.setScaleX(f11);
                        secretMediaViewer.Q.setScaleY(f11);
                        org.telegram.ui.Components.x61 x61Var = secretMediaViewer.O;
                        if (x61Var.f32472y != f10) {
                            x61Var.f32472y = f10;
                            x61Var.v.invalidate();
                            return;
                        }
                        return;
                    }
                    if (b11Var.f35903c) {
                        b11Var.setTranslationY((1.0f - f7) * org.telegram.messenger.i0.N(24.0f));
                    }
                    secretMediaViewer.P.setAlpha(f7);
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f41181b) {
            case 0:
                return Float.valueOf(((ArticleViewer$WindowView) obj).getInnerTranslationX());
            case 1:
                return Float.valueOf(un.f41979bd);
            case 2:
                return Float.valueOf(((org.telegram.ui.Cells.q1) obj).getTimeAlpha());
            case 3:
                return Float.valueOf(((org.telegram.messenger.gj) obj).d);
            case 4:
                return Float.valueOf(((ix0) obj).S);
            case 5:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 6:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            default:
                return Float.valueOf(((b11) obj).f35901a);
        }
    }
}
