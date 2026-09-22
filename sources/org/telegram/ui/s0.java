package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class s0 extends org.telegram.ui.Components.p6 {
    public final int f37234b;

    public s0(String str, int i10) {
        super(str, 0);
        this.f37234b = i10;
    }

    @Override
    public final void b(Object obj, float f7) {
        switch (this.f37234b) {
            case 0:
                ((ArticleViewer$WindowView) obj).setInnerTranslationX(f7);
                return;
            case 1:
                bo.Gc = (int) f7;
                return;
            case 2:
                ((org.telegram.ui.Cells.t1) obj).setTimeAlpha(f7);
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
                c51 c51Var = (c51) obj;
                if (c51Var.f32671a != f7) {
                    c51Var.f32671a = f7;
                    SecretMediaViewer secretMediaViewer = c51Var.f32676r;
                    secretMediaViewer.S.setAlpha(f7);
                    if (c51Var.f32672b) {
                        org.telegram.ui.ActionBar.j5 j5Var = secretMediaViewer.S;
                        j5Var.setPivotX(j5Var.getWidth());
                        org.telegram.ui.ActionBar.j5 j5Var2 = secretMediaViewer.S;
                        j5Var2.setPivotY(j5Var2.getHeight());
                        float f10 = 1.0f - f7;
                        float f11 = 1.0f - (0.1f * f10);
                        secretMediaViewer.S.setScaleX(f11);
                        secretMediaViewer.S.setScaleY(f11);
                        org.telegram.ui.Components.i71 i71Var = secretMediaViewer.Q;
                        if (i71Var.f24942y != f10) {
                            i71Var.f24942y = f10;
                            i71Var.v.invalidate();
                            return;
                        }
                        return;
                    }
                    if (c51Var.f32673c) {
                        c51Var.setTranslationY((1.0f - f7) * AndroidUtilities.dpf2(24.0f));
                    }
                    secretMediaViewer.R.setAlpha(f7);
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f37234b) {
            case 0:
                return Float.valueOf(((ArticleViewer$WindowView) obj).getInnerTranslationX());
            case 1:
                return Float.valueOf(bo.Gc);
            case 2:
                return Float.valueOf(((org.telegram.ui.Cells.t1) obj).getTimeAlpha());
            case 3:
                return Float.valueOf(((n01) obj).S);
            case 4:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 5:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            default:
                return Float.valueOf(((c51) obj).f32671a);
        }
    }
}
