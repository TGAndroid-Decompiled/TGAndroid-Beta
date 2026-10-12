package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class v0 extends org.telegram.ui.Components.u6 {
    public final int f40842b;

    public v0(String str, int i10) {
        super(str, 0);
        this.f40842b = i10;
    }

    @Override
    public final void c(Object obj, float f7) {
        switch (this.f40842b) {
            case 0:
                ((ArticleViewer$WindowView) obj).setInnerTranslationX(f7);
                return;
            case 1:
                fo.Hc = (int) f7;
                return;
            case 2:
                ((org.telegram.ui.Cells.u1) obj).setTimeAlpha(f7);
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
                l51 l51Var = (l51) obj;
                if (l51Var.f37847a != f7) {
                    l51Var.f37847a = f7;
                    SecretMediaViewer secretMediaViewer = l51Var.f37852r;
                    secretMediaViewer.S.setAlpha(f7);
                    if (l51Var.f37848b) {
                        org.telegram.ui.ActionBar.h5 h5Var = secretMediaViewer.S;
                        h5Var.setPivotX(h5Var.getWidth());
                        org.telegram.ui.ActionBar.h5 h5Var2 = secretMediaViewer.S;
                        h5Var2.setPivotY(h5Var2.getHeight());
                        float f10 = 1.0f - f7;
                        float f11 = 1.0f - (0.1f * f10);
                        secretMediaViewer.S.setScaleX(f11);
                        secretMediaViewer.S.setScaleY(f11);
                        org.telegram.ui.Components.j81 j81Var = secretMediaViewer.Q;
                        if (j81Var.f26257y != f10) {
                            j81Var.f26257y = f10;
                            j81Var.v.invalidate();
                            return;
                        }
                        return;
                    }
                    if (l51Var.f37849c) {
                        l51Var.setTranslationY((1.0f - f7) * AndroidUtilities.dpf2(24.0f));
                    }
                    secretMediaViewer.R.setAlpha(f7);
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f40842b) {
            case 0:
                return Float.valueOf(((ArticleViewer$WindowView) obj).getInnerTranslationX());
            case 1:
                return Float.valueOf(fo.Hc);
            case 2:
                return Float.valueOf(((org.telegram.ui.Cells.u1) obj).getTimeAlpha());
            case 3:
                return Float.valueOf(((s01) obj).S);
            case 4:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 5:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            default:
                return Float.valueOf(((l51) obj).f37847a);
        }
    }
}
