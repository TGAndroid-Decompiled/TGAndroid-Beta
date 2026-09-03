package ph;

import android.graphics.PointF;
public final class m5 {
    public final String f42005a;
    public final PointF[] f42006b;
    public final float f42007c;
    public final float d;

    public m5(String str, PointF[] pointFArr) {
        this.f42005a = str;
        this.f42006b = pointFArr;
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (PointF pointF : pointFArr) {
            f10 += pointF.x;
            f11 += pointF.y;
        }
        this.f42007c = f10 / pointFArr.length;
        this.d = f11 / pointFArr.length;
    }
}
