package org.telegram.ui;
public final class s0 extends org.telegram.ui.Components.h6 {
    public final int f41321b;

    public s0(String str, int i10) {
        super(str, 0);
        this.f41321b = i10;
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f41321b) {
            case 0:
                ((ArticleViewer$WindowView) obj).setInnerTranslationX(f7);
                return;
            case 1:
                un.f42169ad = (int) f7;
                return;
            case 2:
                ((org.telegram.ui.Cells.q1) obj).setTimeAlpha(f7);
                return;
            case 3:
                ((org.telegram.messenger.fj) obj).d = f7;
                return;
            case 4:
                ((jx0) obj).setCrossfadeProgress(f7);
                return;
            case 5:
                ((SecretMediaViewer) obj).setVideoCrossfadeAlpha(f7);
                return;
            case 6:
                ((SecretMediaViewer) obj).setAnimationValue(f7);
                return;
            default:
                b11 b11Var = (b11) obj;
                if (b11Var.f35942a != f7) {
                    b11Var.f35942a = f7;
                    SecretMediaViewer secretMediaViewer = b11Var.f35947r;
                    secretMediaViewer.Q.setAlpha(f7);
                    if (b11Var.f35943b) {
                        org.telegram.ui.ActionBar.u5 u5Var = secretMediaViewer.Q;
                        u5Var.setPivotX(u5Var.getWidth());
                        org.telegram.ui.ActionBar.u5 u5Var2 = secretMediaViewer.Q;
                        u5Var2.setPivotY(u5Var2.getHeight());
                        float f10 = 1.0f - f7;
                        float f11 = 1.0f - (0.1f * f10);
                        secretMediaViewer.Q.setScaleX(f11);
                        secretMediaViewer.Q.setScaleY(f11);
                        org.telegram.ui.Components.w61 w61Var = secretMediaViewer.O;
                        if (w61Var.f32042y != f10) {
                            w61Var.f32042y = f10;
                            w61Var.v.invalidate();
                            return;
                        }
                        return;
                    }
                    if (b11Var.f35944c) {
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
        switch (this.f41321b) {
            case 0:
                return Float.valueOf(((ArticleViewer$WindowView) obj).getInnerTranslationX());
            case 1:
                return Float.valueOf(un.f42169ad);
            case 2:
                return Float.valueOf(((org.telegram.ui.Cells.q1) obj).getTimeAlpha());
            case 3:
                return Float.valueOf(((org.telegram.messenger.fj) obj).d);
            case 4:
                return Float.valueOf(((jx0) obj).S);
            case 5:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 6:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            default:
                return Float.valueOf(((b11) obj).f35942a);
        }
    }
}
