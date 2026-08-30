package ph;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.TextureView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.kg1;
public final class m5 implements Runnable {
    public final int f41937a;
    public final p5 f41938b;

    public m5(p5 p5Var, int i10) {
        this.f41937a = i10;
        this.f41938b = p5Var;
    }

    @Override
    public final void run() {
        boolean z4;
        f8.n nVar;
        switch (this.f41937a) {
            case 0:
                p5 p5Var = this.f41938b;
                if (p5Var.f42161a.get() != null && p5Var.f42164f != null && !p5Var.f42162b.get()) {
                    TextureView textureView = p5Var.f42164f.getTextureView();
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
                        Bitmap bitmap = p5Var.f42165g;
                        if (bitmap == null || max != bitmap.getWidth() || max2 != p5Var.f42165g.getHeight()) {
                            p5Var.f42165g = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                        }
                        textureView.getBitmap(p5Var.f42165g);
                        Bitmap bitmap2 = p5Var.f42165g;
                        String str = p5Var.e;
                        n5 n5Var = null;
                        if (bitmap2 != null && (nVar = (f8.n) p5Var.f42161a.get()) != null && nVar.f6101b.k()) {
                            int width2 = bitmap2.getWidth();
                            int height2 = bitmap2.getHeight();
                            androidx.biometric.e eVar = new androidx.biometric.e(15);
                            int width3 = bitmap2.getWidth();
                            int height3 = bitmap2.getHeight();
                            eVar.d = bitmap2;
                            e8.a aVar = (e8.a) eVar.f478b;
                            aVar.f5156a = width3;
                            aVar.f5157b = height3;
                            SparseArray L = nVar.L(eVar);
                            for (int i10 = 0; i10 < L.size(); i10++) {
                                f8.m mVar = (f8.m) L.valueAt(i10);
                                String str2 = mVar.f6092b;
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
                                    n5Var = new n5(trim, pointFArr);
                                }
                            }
                        }
                        n5 n5Var2 = p5Var.d;
                        if (n5Var2 != null) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (n5Var == null) {
                            z10 = false;
                        }
                        if (z4 == z10) {
                            if (n5Var != null && n5Var2 != null) {
                                PointF[] pointFArr2 = n5Var.f42009b;
                                PointF[] pointFArr3 = n5Var2.f42009b;
                                if (TextUtils.equals(n5Var.f42008a, n5Var2.f42008a)) {
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
                        p5Var.d = n5Var;
                        AndroidUtilities.runOnUIThread(new kg1(27, p5Var, n5Var));
                    }
                    if (!p5Var.f42162b.get()) {
                        Utilities.globalQueue.cancelRunnable(p5Var.h);
                        Utilities.globalQueue.postRunnable(p5Var.h, p5Var.b());
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f41938b.f42163c.run(null);
                return;
        }
    }
}
