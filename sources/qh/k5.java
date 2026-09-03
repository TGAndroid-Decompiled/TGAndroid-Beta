package qh;

import android.graphics.PointF;
public final class k5 {
    public final String f45609a;
    public final PointF[] f45610b;
    public final float f45611c;
    public final float d;

    public k5(String str, PointF[] pointFArr) {
        this.f45609a = str;
        this.f45610b = pointFArr;
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (PointF pointF : pointFArr) {
            f10 += pointF.x;
            f11 += pointF.y;
        }
        this.f45611c = f10 / pointFArr.length;
        this.d = f11 / pointFArr.length;
    }
}
