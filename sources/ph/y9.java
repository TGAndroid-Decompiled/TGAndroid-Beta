package ph;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
public abstract class y9 {
    public float f42632b;
    public org.telegram.ui.Cells.d7 d;
    public ImageReceiver e;
    public nh.i3 f42634f;
    public int f42631a = 0;
    public final RectF f42633c = new RectF();

    public static w9 b(org.telegram.ui.Cells.e7 e7Var) {
        int i10;
        if (e7Var == null) {
            return null;
        }
        org.telegram.ui.Components.p9 imageView = e7Var.getImageView();
        w9 w9Var = new w9(imageView, 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        w9Var.f42633c.set(iArr[0], iArr[1], imageView.getWidth() + i10, imageView.getHeight() + iArr[1]);
        w9Var.d = new org.telegram.ui.Cells.d7(imageView.getContext(), null, false, e7Var.f21029y);
        w9Var.f42632b = Math.max(w9Var.f42633c.width(), w9Var.f42633c.height()) / 2.0f;
        return w9Var;
    }

    public static x9 c(nh.p pVar) {
        if (pVar != null) {
            ImageReceiver imageReceiver = pVar.f15731r;
            if (pVar.getRootView() != null) {
                float imageWidth = imageReceiver.getImageWidth();
                x9 x9Var = new x9(pVar, imageWidth / 2.0f);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                pVar.getRootView().getLocationOnScreen(iArr);
                AndroidUtilities.getViewPositionInParent(pVar, (ViewGroup) pVar.getRootView(), fArr);
                float imageX = imageReceiver.getImageX() + iArr[0] + fArr[0];
                float imageY = imageReceiver.getImageY() + iArr[1] + fArr[1];
                x9Var.f42633c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
                x9Var.e = imageReceiver;
                x9Var.f42632b = Math.max(x9Var.f42633c.width(), x9Var.f42633c.height()) / 2.0f;
                return x9Var;
            }
            return null;
        }
        return null;
    }

    public static w9 d(nh.i9 i9Var) {
        nh.d4 currentPeerView;
        nh.i3 i3Var;
        float x10;
        if (i9Var != null) {
            w9 w9Var = new w9(i9Var, 1);
            nh.y8 y8Var = i9Var.f15472k0;
            if (y8Var != null && (currentPeerView = y8Var.getCurrentPeerView()) != null && (i3Var = currentPeerView.Z0) != null) {
                nh.w8 w8Var = i9Var.f15488s;
                float f10 = 0.0f;
                if (w8Var == null) {
                    x10 = 0.0f;
                } else {
                    x10 = w8Var.getX();
                }
                nh.w8 w8Var2 = i9Var.f15488s;
                if (w8Var2 != null) {
                    f10 = w8Var2.getY();
                }
                w9Var.f42633c.set(i3Var.getX() + currentPeerView.getX() + i9Var.U + x10 + i9Var.v.getLeft(), i3Var.getY() + currentPeerView.getY() + i9Var.T + f10 + i9Var.v.getTop(), (((x10 + i9Var.U) + i9Var.v.getRight()) - (i9Var.v.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - i3Var.getRight()), (((f10 + i9Var.T) + i9Var.v.getBottom()) - (i9Var.v.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - i3Var.getBottom()));
                w9Var.f42631a = 1;
                w9Var.f42632b = AndroidUtilities.dp(8.0f);
                nh.d4 t6 = i9Var.t();
                if (t6 != null) {
                    w9Var.f42634f = t6.Z0;
                }
                return w9Var;
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
