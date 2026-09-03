package qh;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public abstract class w9 {
    public float f46277b;
    public org.telegram.ui.Cells.d7 d;
    public ImageReceiver f46279e;
    public oh.j3 f46280f;
    public int f46276a = 0;
    public final RectF f46278c = new RectF();

    public static t9 b(org.telegram.ui.Cells.e7 e7Var) {
        int i10;
        if (e7Var == null) {
            return null;
        }
        org.telegram.ui.Components.p9 imageView = e7Var.getImageView();
        t9 t9Var = new t9(imageView, 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        t9Var.f46278c.set(iArr[0], iArr[1], imageView.getWidth() + i10, imageView.getHeight() + iArr[1]);
        t9Var.d = new org.telegram.ui.Cells.d7(imageView.getContext(), null, false, e7Var.f22773y);
        t9Var.f46277b = Math.max(t9Var.f46278c.width(), t9Var.f46278c.height()) / 2.0f;
        return t9Var;
    }

    public static v9 c(oh.o oVar) {
        if (oVar != null) {
            ImageReceiver imageReceiver = oVar.f17524r;
            if (oVar.getRootView() != null) {
                float imageWidth = imageReceiver.getImageWidth();
                v9 v9Var = new v9(oVar, imageWidth / 2.0f);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                oVar.getRootView().getLocationOnScreen(iArr);
                AndroidUtilities.getViewPositionInParent(oVar, (ViewGroup) oVar.getRootView(), fArr);
                float imageX = imageReceiver.getImageX() + iArr[0] + fArr[0];
                float imageY = imageReceiver.getImageY() + iArr[1] + fArr[1];
                v9Var.f46278c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
                v9Var.f46279e = imageReceiver;
                v9Var.f46277b = Math.max(v9Var.f46278c.width(), v9Var.f46278c.height()) / 2.0f;
                return v9Var;
            }
            return null;
        }
        return null;
    }

    public static t9 d(oh.i9 i9Var) {
        oh.f4 currentPeerView;
        oh.j3 j3Var;
        float x10;
        if (i9Var != null) {
            t9 t9Var = new t9(i9Var, 1);
            oh.y8 y8Var = i9Var.f17279k0;
            if (y8Var != null && (currentPeerView = y8Var.getCurrentPeerView()) != null && (j3Var = currentPeerView.Z0) != null) {
                oh.w8 w8Var = i9Var.f17295s;
                float f10 = 0.0f;
                if (w8Var == null) {
                    x10 = 0.0f;
                } else {
                    x10 = w8Var.getX();
                }
                oh.w8 w8Var2 = i9Var.f17295s;
                if (w8Var2 != null) {
                    f10 = w8Var2.getY();
                }
                t9Var.f46278c.set(j3Var.getX() + currentPeerView.getX() + i9Var.U + x10 + i9Var.v.getLeft(), j3Var.getY() + currentPeerView.getY() + i9Var.T + f10 + i9Var.v.getTop(), (((x10 + i9Var.U) + i9Var.v.getRight()) - (i9Var.v.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - j3Var.getRight()), (((f10 + i9Var.T) + i9Var.v.getBottom()) - (i9Var.v.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - j3Var.getBottom()));
                t9Var.f46276a = 1;
                t9Var.f46277b = AndroidUtilities.dp(8.0f);
                oh.f4 t6 = i9Var.t();
                if (t6 != null) {
                    t9Var.f46280f = t6.Z0;
                }
                return t9Var;
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
