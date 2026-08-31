package qh;

import android.graphics.PointF;
public final class l5 {
    public final String f45625a;
    public final PointF[] f45626b;
    public final float f45627c;
    public final float d;

    public l5(String str, PointF[] pointFArr) {
        this.f45625a = str;
        this.f45626b = pointFArr;
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (PointF pointF : pointFArr) {
            f10 += pointF.x;
            f11 += pointF.y;
        }
        this.f45627c = f10 / pointFArr.length;
        this.d = f11 / pointFArr.length;
    }
}
