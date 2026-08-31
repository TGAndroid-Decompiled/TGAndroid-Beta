package qh;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public abstract class x9 {
    public float f46304b;
    public org.telegram.ui.Cells.d7 d;
    public ImageReceiver f46306e;
    public oh.j3 f46307f;
    public int f46303a = 0;
    public final RectF f46305c = new RectF();

    public static u9 b(org.telegram.ui.Cells.e7 e7Var) {
        int i10;
        if (e7Var == null) {
            return null;
        }
        org.telegram.ui.Components.p9 imageView = e7Var.getImageView();
        u9 u9Var = new u9(imageView, 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        u9Var.f46305c.set(iArr[0], iArr[1], imageView.getWidth() + i10, imageView.getHeight() + iArr[1]);
        u9Var.d = new org.telegram.ui.Cells.d7(imageView.getContext(), null, false, e7Var.f22771y);
        u9Var.f46304b = Math.max(u9Var.f46305c.width(), u9Var.f46305c.height()) / 2.0f;
        return u9Var;
    }

    public static w9 c(oh.o oVar) {
        if (oVar != null) {
            ImageReceiver imageReceiver = oVar.f17522r;
            if (oVar.getRootView() != null) {
                float imageWidth = imageReceiver.getImageWidth();
                w9 w9Var = new w9(oVar, imageWidth / 2.0f);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                oVar.getRootView().getLocationOnScreen(iArr);
                AndroidUtilities.getViewPositionInParent(oVar, (ViewGroup) oVar.getRootView(), fArr);
                float imageX = imageReceiver.getImageX() + iArr[0] + fArr[0];
                float imageY = imageReceiver.getImageY() + iArr[1] + fArr[1];
                w9Var.f46305c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
                w9Var.f46306e = imageReceiver;
                w9Var.f46304b = Math.max(w9Var.f46305c.width(), w9Var.f46305c.height()) / 2.0f;
                return w9Var;
            }
            return null;
        }
        return null;
    }

    public static u9 d(oh.i9 i9Var) {
        oh.f4 currentPeerView;
        oh.j3 j3Var;
        float x10;
        if (i9Var != null) {
            u9 u9Var = new u9(i9Var, 1);
            oh.y8 y8Var = i9Var.f17277k0;
            if (y8Var != null && (currentPeerView = y8Var.getCurrentPeerView()) != null && (j3Var = currentPeerView.Z0) != null) {
                oh.w8 w8Var = i9Var.f17293s;
                float f10 = 0.0f;
                if (w8Var == null) {
                    x10 = 0.0f;
                } else {
                    x10 = w8Var.getX();
                }
                oh.w8 w8Var2 = i9Var.f17293s;
                if (w8Var2 != null) {
                    f10 = w8Var2.getY();
                }
                u9Var.f46305c.set(j3Var.getX() + currentPeerView.getX() + i9Var.U + x10 + i9Var.v.getLeft(), j3Var.getY() + currentPeerView.getY() + i9Var.T + f10 + i9Var.v.getTop(), (((x10 + i9Var.U) + i9Var.v.getRight()) - (i9Var.v.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - j3Var.getRight()), (((f10 + i9Var.T) + i9Var.v.getBottom()) - (i9Var.v.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - j3Var.getBottom()));
                u9Var.f46303a = 1;
                u9Var.f46304b = AndroidUtilities.dp(8.0f);
                oh.f4 t6 = i9Var.t();
                if (t6 != null) {
                    u9Var.f46307f = t6.Z0;
                }
                return u9Var;
            }
            return null;
        }
        return null;
    }

    public abstract void e();

    public abstract void f(boolean z4);

    public void a(Canvas canvas, float f10) {
    }
}
