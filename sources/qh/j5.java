package qh;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.bh1;
public final class j5 implements Runnable {
    public final int f45533a;
    public final m5 f45534b;

    public j5(m5 m5Var, int i10) {
        this.f45533a = i10;
        this.f45534b = m5Var;
    }

    @Override
    public final void run() {
        boolean z4;
        f8.n nVar;
        switch (this.f45533a) {
            case 0:
                m5 m5Var = this.f45534b;
                if (m5Var.f45745a.get() != null && m5Var.f45749f != null && !m5Var.f45746b.get()) {
                    TextureView textureView = m5Var.f45749f.getTextureView();
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
                        Bitmap bitmap = m5Var.f45750g;
                        if (bitmap == null || max != bitmap.getWidth() || max2 != m5Var.f45750g.getHeight()) {
                            m5Var.f45750g = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                        }
                        textureView.getBitmap(m5Var.f45750g);
                        Bitmap bitmap2 = m5Var.f45750g;
                        String str = m5Var.f45748e;
                        k5 k5Var = null;
                        if (bitmap2 != null && (nVar = (f8.n) m5Var.f45745a.get()) != null && nVar.f6220b.k()) {
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
                                    k5Var = new k5(trim, pointFArr);
                                }
                            }
                        }
                        k5 k5Var2 = m5Var.d;
                        if (k5Var2 != null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (k5Var == null) {
                            z10 = false;
                        }
                        if (z4 == z10) {
                            if (k5Var != null && k5Var2 != null) {
                                PointF[] pointFArr2 = k5Var.f45610b;
                                PointF[] pointFArr3 = k5Var2.f45610b;
                                if (TextUtils.equals(k5Var.f45609a, k5Var2.f45609a)) {
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
                        m5Var.d = k5Var;
                        AndroidUtilities.runOnUIThread(new bh1(26, m5Var, k5Var));
                    }
                    if (!m5Var.f45746b.get()) {
                        Utilities.globalQueue.cancelRunnable(m5Var.h);
                        Utilities.globalQueue.postRunnable(m5Var.h, m5Var.b());
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f45534b.f45747c.run(null);
                return;
        }
    }
}
