package vh;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
public abstract class j8 {
    public float f51326b;
    public org.telegram.ui.Cells.g7 d;
    public ImageReceiver e;
    public th.g2 f51328f;
    public int f51325a = 0;
    public final RectF f51327c = new RectF();

    public static h8 b(org.telegram.ui.Cells.h7 h7Var) {
        if (h7Var == null) {
            return null;
        }
        org.telegram.ui.Components.g9 imageView = h7Var.getImageView();
        h8 h8Var = new h8(imageView, 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        float height = imageView.getHeight() + iArr[1];
        RectF rectF = h8Var.f51327c;
        rectF.set(i10, iArr[1], imageView.getWidth() + i10, height);
        h8Var.d = new org.telegram.ui.Cells.g7(imageView.getContext(), null, false, 2131231616, h7Var.D);
        h8Var.f51326b = Math.max(rectF.width(), rectF.height()) / 2.0f;
        return h8Var;
    }

    public static i8 c(th.l lVar) {
        if (lVar != null) {
            ImageReceiver imageReceiver = lVar.f49156r;
            if (lVar.getRootView() != null) {
                float f7 = imageReceiver.M0;
                i8 i8Var = new i8(lVar, f7 / 2.0f);
                int[] iArr = new int[2];
                float[] fArr = new float[2];
                lVar.getRootView().getLocationOnScreen(iArr);
                org.telegram.messenger.i0.r1(lVar, (ViewGroup) lVar.getRootView(), fArr);
                float f10 = iArr[0] + fArr[0] + imageReceiver.K0;
                float f11 = iArr[1] + fArr[1] + imageReceiver.L0;
                i8Var.f51327c.set(f10, f11, f10 + f7, f7 + f11);
                i8Var.e = imageReceiver;
                i8Var.f51326b = Math.max(i8Var.f51327c.width(), i8Var.f51327c.height()) / 2.0f;
                return i8Var;
            }
            return null;
        }
        return null;
    }

    public static h8 d(th.o7 o7Var) {
        th.z2 currentPeerView;
        th.g2 g2Var;
        float x10;
        if (o7Var != null) {
            h8 h8Var = new h8(o7Var, 1);
            th.e7 e7Var = o7Var.f49319n0;
            if (e7Var != null && (currentPeerView = e7Var.getCurrentPeerView()) != null && (g2Var = currentPeerView.L0) != null) {
                th.c7 c7Var = o7Var.f49330s;
                float f7 = 0.0f;
                if (c7Var == null) {
                    x10 = 0.0f;
                } else {
                    x10 = c7Var.getX();
                }
                th.c7 c7Var2 = o7Var.f49330s;
                if (c7Var2 != null) {
                    f7 = c7Var2.getY();
                }
                h8Var.f51327c.set(g2Var.getX() + currentPeerView.getX() + o7Var.X + x10 + o7Var.f49339w.getLeft(), g2Var.getY() + currentPeerView.getY() + o7Var.W + f7 + o7Var.f49339w.getTop(), (((x10 + o7Var.X) + o7Var.f49339w.getRight()) - (o7Var.f49339w.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - g2Var.getRight()), (((f7 + o7Var.W) + o7Var.f49339w.getBottom()) - (o7Var.f49339w.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - g2Var.getBottom()));
                h8Var.f51325a = 1;
                h8Var.f51326b = org.telegram.messenger.i0.L(8.0f);
                th.z2 H = o7Var.H();
                if (H != null) {
                    h8Var.f51328f = H.L0;
                }
                return h8Var;
            }
            return null;
        }
        return null;
    }

    public abstract void e();

    public abstract void f(boolean z10);

    public void a(Canvas canvas, float f7) {
    }
}
