package vh;

import android.graphics.PointF;
public final class m4 {
    public final String f51494a;
    public final PointF[] f51495b;
    public final float f51496c;
    public final float d;

    public m4(String str, PointF[] pointFArr) {
        this.f51494a = str;
        this.f51495b = pointFArr;
        float f7 = 0.0f;
        float f10 = 0.0f;
        for (PointF pointF : pointFArr) {
            f7 += pointF.x;
            f10 += pointF.y;
        }
        this.f51496c = f7 / pointFArr.length;
        this.d = f10 / pointFArr.length;
    }
}
