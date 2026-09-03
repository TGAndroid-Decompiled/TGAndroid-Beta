package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
public final class u0 extends org.telegram.ui.Components.m6 {
    public final int f41669b;

    public u0(String str, int i10) {
        super(str, 0);
        this.f41669b = i10;
    }

    @Override
    public final void b(Object obj, float f10) {
        switch (this.f41669b) {
            case 0:
                ((ArticleViewer$WindowView) obj).setInnerTranslationX(f10);
                return;
            case 1:
                xn.Ec = (int) f10;
                return;
            case 2:
                ((org.telegram.ui.Cells.t1) obj).setTimeAlpha(f10);
                return;
            case 3:
                ((a01) obj).setCrossfadeProgress(f10);
                return;
            case 4:
                ((SecretMediaViewer) obj).setVideoCrossfadeAlpha(f10);
                return;
            case 5:
                ((SecretMediaViewer) obj).setAnimationValue(f10);
                return;
            default:
                q41 q41Var = (q41) obj;
                if (q41Var.f40317a != f10) {
                    q41Var.f40317a = f10;
                    SecretMediaViewer secretMediaViewer = q41Var.f40323r;
                    secretMediaViewer.P.setAlpha(f10);
                    if (q41Var.f40318b) {
                        org.telegram.ui.ActionBar.l5 l5Var = secretMediaViewer.P;
                        l5Var.setPivotX(l5Var.getWidth());
                        org.telegram.ui.ActionBar.l5 l5Var2 = secretMediaViewer.P;
                        l5Var2.setPivotY(l5Var2.getHeight());
                        float f11 = 1.0f - f10;
                        float f12 = 1.0f - (0.1f * f11);
                        secretMediaViewer.P.setScaleX(f12);
                        secretMediaViewer.P.setScaleY(f12);
                        org.telegram.ui.Components.l71 l71Var = secretMediaViewer.N;
                        if (l71Var.f28677y != f11) {
                            l71Var.f28677y = f11;
                            l71Var.v.invalidate();
                            return;
                        }
                        return;
                    }
                    if (q41Var.f40319c) {
                        q41Var.setTranslationY((1.0f - f10) * AndroidUtilities.dpf2(24.0f));
                    }
                    secretMediaViewer.O.setAlpha(f10);
                    return;
                }
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f41669b) {
            case 0:
                return Float.valueOf(((ArticleViewer$WindowView) obj).getInnerTranslationX());
            case 1:
                return Float.valueOf(xn.Ec);
            case 2:
                return Float.valueOf(((org.telegram.ui.Cells.t1) obj).getTimeAlpha());
            case 3:
                return Float.valueOf(((a01) obj).P);
            case 4:
                return Float.valueOf(((SecretMediaViewer) obj).getVideoCrossfadeAlpha());
            case 5:
                return Float.valueOf(((SecretMediaViewer) obj).getAnimationValue());
            default:
                return Float.valueOf(((q41) obj).f40317a);
        }
    }
}
