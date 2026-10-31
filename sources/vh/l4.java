package vh;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.TextureView;
import org.telegram.messenger.Utilities;
public final class l4 implements Runnable {
    public final int f51456a;
    public final o4 f51457b;

    public l4(o4 o4Var, int i10) {
        this.f51456a = i10;
        this.f51457b = o4Var;
    }

    @Override
    public final void run() {
        boolean z10;
        r8.n nVar;
        switch (this.f51456a) {
            case 0:
                o4 o4Var = this.f51457b;
                if (o4Var.f51594a.get() != null && o4Var.f51597f != null && !o4Var.f51595b.get()) {
                    TextureView textureView = o4Var.f51597f.getTextureView();
                    if (textureView != null) {
                        int width = textureView.getWidth();
                        int height = textureView.getHeight();
                        if (width > 720 || height > 720) {
                            float f7 = width;
                            float f10 = height;
                            float min = Math.min(720.0f / f7, 720.0f / f10);
                            width = (int) (f7 * min);
                            height = (int) (f10 * min);
                        }
                        boolean z11 = true;
                        int max = Math.max(1, width);
                        int max2 = Math.max(1, height);
                        Bitmap bitmap = o4Var.f51598g;
                        if (bitmap == null || max != bitmap.getWidth() || max2 != o4Var.f51598g.getHeight()) {
                            o4Var.f51598g = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
                        }
                        textureView.getBitmap(o4Var.f51598g);
                        Bitmap bitmap2 = o4Var.f51598g;
                        String str = o4Var.e;
                        m4 m4Var = null;
                        if (bitmap2 != null && (nVar = (r8.n) o4Var.f51594a.get()) != null && nVar.f46419b.k()) {
                            int width2 = bitmap2.getWidth();
                            int height2 = bitmap2.getHeight();
                            q5.d dVar = new q5.d(1);
                            int width3 = bitmap2.getWidth();
                            int height3 = bitmap2.getHeight();
                            dVar.d = bitmap2;
                            a3.l lVar = (a3.l) dVar.f45487b;
                            lVar.f139a = width3;
                            lVar.f140b = height3;
                            SparseArray e12 = nVar.e1(dVar);
                            for (int i10 = 0; i10 < e12.size(); i10++) {
                                r8.m mVar = (r8.m) e12.valueAt(i10);
                                String str2 = mVar.f46410b;
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
                                    m4Var = new m4(trim, pointFArr);
                                }
                            }
                        }
                        m4 m4Var2 = o4Var.d;
                        if (m4Var2 != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (m4Var == null) {
                            z11 = false;
                        }
                        if (z10 == z11) {
                            if (m4Var != null && m4Var2 != null) {
                                PointF[] pointFArr2 = m4Var.f51480b;
                                PointF[] pointFArr3 = m4Var2.f51480b;
                                if (TextUtils.equals(m4Var.f51479a, m4Var2.f51479a)) {
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
                        o4Var.d = m4Var;
                        org.telegram.messenger.i0.g3(new d1(8, o4Var, m4Var));
                    }
                    if (!o4Var.f51595b.get()) {
                        Utilities.e.a(o4Var.h);
                        Utilities.e.d(o4Var.h, o4Var.b());
                        return;
                    }
                    return;
                }
                return;
            default:
                this.f51457b.f51596c.a(null);
                return;
        }
    }
}
