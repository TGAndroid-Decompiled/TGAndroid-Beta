package qh;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.mg1;
public final class k5 implements Runnable {
    public final int f45565a;
    public final n5 f45566b;

    public k5(n5 n5Var, int i10) {
        this.f45565a = i10;
        this.f45566b = n5Var;
    }

    @Override
    public final void run() {
        boolean z4;
        f8.n nVar;
        switch (this.f45565a) {
            case 0:
                n5 n5Var = this.f45566b;
                if (n5Var.f45768a.get() != null && n5Var.f45772f != null && !n5Var.f45769b.get()) {
                    TextureView textureView = n5Var.f45772f.getTextureView();
                    if (textureView != null) {
                        int width = textureView.getWidth();
                        int height = textureView.getHeight();
                        if (width > 720 || height > 720) {
                            float f10 = width;
                            float f11 = height;
                            float min = Math.min(720.0f / f10, 720.0f / f11);
                            width = (int) (f10 * min);
                            height = (int) (f11 * min);
                        }
                        boolean z10 = true;
                        int max = Math.max(1, width);
                        int max2 = Math.max(1, height);
                        Bitmap bitmap = n5Var.f45773g;
                        if (bitmap == null || max != bitmap.getWidth() || max2 != n5Var.f45773g.getHeight()) {
                            n5Var.f45773g = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                        }
                        textureView.getBitmap(n5Var.f45773g);
                        Bitmap bitmap2 = n5Var.f45773g;
                        String str = n5Var.f45771e;
                        l5 l5Var = null;
                        if (bitmap2 != null && (nVar = (f8.n) n5Var.f45768a.get()) != null && nVar.f6220b.k()) {
                            int width2 = bitmap2.getWidth();
                            int height2 = bitmap2.getHeight();
                            androidx.biometric.e eVar = new androidx.biometric.e(15);
                            int width3 = bitmap2.getWidth();
                            int height3 = bitmap2.getHeight();
                            eVar.d = bitmap2;
                            e8.a aVar = (e8.a) eVar.f527b;
                            aVar.f4995a = width3;
                            aVar.f4996b = height3;
                            SparseArray L = nVar.L(eVar);
                            for (int i10 = 0; i10 < L.size(); i10++) {
                                f8.m mVar = (f8.m) L.valueAt(i10);
                                String str2 = mVar.f6210b;
                                Point[] pointArr = mVar.f6212e;
                                if (str2 != null) {
                                    String trim = str2.trim();
                                    if (!trim.startsWith(str)) {
                                        if (!trim.startsWith("https://" + str)) {
                                            if (!trim.startsWith("http://" + str)) {
                                            }
                                        }
                                    }
                                    PointF[] pointFArr = new PointF[pointArr.length];
                                    for (int i11 = 0; i11 < pointArr.length; i11++) {
                                        Point point = pointArr[i11];
                                        pointFArr[i11] = new PointF(point.x / width2, point.y / height2);
                                    }
                                    l5Var = new l5(trim, pointFArr);
                                }
                            }
                        }
                        l5 l5Var2 = n5Var.d;
                        if (l5Var2 != null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (l5Var == null) {
                            z10 = false;
                        }
                        if (z4 == z10) {
                            if (l5Var != null && l5Var2 != null) {
                                PointF[] pointFArr2 = l5Var.f45626b;
                                PointF[] pointFArr3 = l5Var2.f45626b;
                                if (TextUtils.equals(l5Var.f45625a, l5Var2.f45625a)) {
                                    if (pointFArr2 != pointFArr3) {
                                        if (pointFArr2.length == pointFArr3.length) {
                                            for (int i12 = 0; i12 < pointFArr2.length; i12++) {
                                                if (Math.abs(pointFArr2[i12].x - pointFArr3[i12].x) <= 0.001f && Math.abs(pointFArr2[i12].y - pointFArr3[i12].y) <= 0.001f) {
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        n5Var.d = l5Var;
                        AndroidUtilities.runOnUIThread(new mg1(27, n5Var, l5Var));
                    }
                    if (!n5Var.f45769b.get()) {
                        Utilities.globalQueue.cancelRunnable(n5Var.h);
                        Utilities.globalQueue.postRunnable(n5Var.h, n5Var.b());
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f45566b.f45770c.run(null);
                return;
        }
    }
}
