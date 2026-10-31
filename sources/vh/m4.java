package vh;

import android.graphics.PointF;
public final class m4 {
    public final String f51479a;
    public final PointF[] f51480b;
    public final float f51481c;
    public final float d;

    public m4(String str, PointF[] pointFArr) {
        this.f51479a = str;
        this.f51480b = pointFArr;
        float f7 = 0.0f;
        float f10 = 0.0f;
        for (PointF pointF : pointFArr) {
            f7 += pointF.x;
            f10 += pointF.y;
        }
        this.f51481c = f7 / pointFArr.length;
        this.d = f10 / pointFArr.length;
    }
}
