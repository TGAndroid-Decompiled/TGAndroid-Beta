package ph;

import android.graphics.PointF;
public final class n5 {
    public final String f42008a;
    public final PointF[] f42009b;
    public final float f42010c;
    public final float d;

    public n5(String str, PointF[] pointFArr) {
        this.f42008a = str;
        this.f42009b = pointFArr;
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (PointF pointF : pointFArr) {
            f10 += pointF.x;
            f11 += pointF.y;
        }
        this.f42010c = f10 / pointFArr.length;
        this.d = f11 / pointFArr.length;
    }
}
