package ph;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.sg1;
public final class l5 implements Runnable {
    public final int f41944a;
    public final o5 f41945b;

    public l5(o5 o5Var, int i10) {
        this.f41944a = i10;
        this.f41945b = o5Var;
    }

    @Override
    public final void run() {
        boolean z4;
        f8.n nVar;
        switch (this.f41944a) {
            case 0:
                o5 o5Var = this.f41945b;
                if (o5Var.f42095a.get() != null && o5Var.f42098f != null && !o5Var.f42096b.get()) {
                    TextureView textureView = o5Var.f42098f.getTextureView();
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
                        Bitmap bitmap = o5Var.f42099g;
                        if (bitmap == null || max != bitmap.getWidth() || max2 != o5Var.f42099g.getHeight()) {
                            o5Var.f42099g = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                        }
                        textureView.getBitmap(o5Var.f42099g);
                        Bitmap bitmap2 = o5Var.f42099g;
                        String str = o5Var.e;
                        m5 m5Var = null;
                        if (bitmap2 != null && (nVar = (f8.n) o5Var.f42095a.get()) != null && nVar.f6090b.k()) {
                            int width2 = bitmap2.getWidth();
                            int height2 = bitmap2.getHeight();
                            af.d dVar = new af.d(15);
                            int width3 = bitmap2.getWidth();
                            int height3 = bitmap2.getHeight();
                            dVar.d = bitmap2;
                            e8.a aVar = (e8.a) dVar.f159b;
                            aVar.f5162a = width3;
                            aVar.f5163b = height3;
                            SparseArray L = nVar.L(dVar);
                            for (int i10 = 0; i10 < L.size(); i10++) {
                                f8.m mVar = (f8.m) L.valueAt(i10);
                                String str2 = mVar.f6081b;
                                Point[] pointArr = mVar.e;
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
                                    m5Var = new m5(trim, pointFArr);
                                }
                            }
                        }
                        m5 m5Var2 = o5Var.d;
                        if (m5Var2 != null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (m5Var == null) {
                            z10 = false;
                        }
                        if (z4 == z10) {
                            if (m5Var != null && m5Var2 != null) {
                                PointF[] pointFArr2 = m5Var.f42006b;
                                PointF[] pointFArr3 = m5Var2.f42006b;
                                if (TextUtils.equals(m5Var.f42005a, m5Var2.f42005a)) {
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
                        o5Var.d = m5Var;
                        AndroidUtilities.runOnUIThread(new sg1(27, o5Var, m5Var));
                    }
                    if (!o5Var.f42096b.get()) {
                        Utilities.globalQueue.cancelRunnable(o5Var.h);
                        Utilities.globalQueue.postRunnable(o5Var.h, o5Var.b());
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f41945b.f42097c.run(null);
                return;
        }
    }
}
