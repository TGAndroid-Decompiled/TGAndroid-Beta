package sg;

import android.graphics.Bitmap;
import android.graphics.PointF;
import org.telegram.ui.Components.nt0;
public final class m0 {
    public final float f55153a;
    public final float f55154b;
    public final PointF f55155c;
    public final PointF d;
    public final float f55156e;
    public final PointF f55157f;
    public final PointF f55158g;

    public m0(w8.a aVar, Bitmap bitmap, nt0 nt0Var, boolean z9) {
        float degrees;
        PointF pointF = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        for (w8.c cVar : aVar.f57624b) {
            PointF pointF5 = cVar.f57629a;
            int i7 = cVar.f57630b;
            if (i7 != 4) {
                if (i7 != 5) {
                    if (i7 != 10) {
                        if (i7 == 11) {
                            pointF4 = b(pointF5, bitmap, nt0Var, z9);
                        }
                    } else {
                        pointF2 = b(pointF5, bitmap, nt0Var, z9);
                    }
                } else {
                    pointF3 = b(pointF5, bitmap, nt0Var, z9);
                }
            } else {
                pointF = b(pointF5, bitmap, nt0Var, z9);
            }
        }
        if (pointF != null && pointF2 != null) {
            if (pointF.x < pointF2.x) {
                PointF pointF6 = pointF2;
                pointF2 = pointF;
                pointF = pointF6;
            }
            PointF pointF7 = new PointF((pointF2.x * 0.5f) + (pointF.x * 0.5f), (pointF2.y * 0.5f) + (pointF.y * 0.5f));
            this.d = pointF7;
            float hypot = (float) Math.hypot(pointF2.x - pointF.x, pointF2.y - pointF.y);
            this.f55156e = hypot;
            this.f55154b = (float) Math.toDegrees(Math.atan2(pointF2.y - pointF.y, pointF2.x - pointF.x) + 3.141592653589793d);
            this.f55153a = 2.35f * hypot;
            float f10 = hypot * 0.8f;
            float f11 = pointF7.x;
            double radians = (float) Math.toRadians(degrees - 90.0f);
            this.f55155c = new PointF((((float) Math.cos(radians)) * f10) + f11, (f10 * ((float) Math.sin(radians))) + pointF7.y);
        }
        if (pointF3 != null && pointF4 != null) {
            if (pointF3.x < pointF4.x) {
                PointF pointF8 = pointF4;
                pointF4 = pointF3;
                pointF3 = pointF8;
            }
            PointF pointF9 = new PointF((pointF4.x * 0.5f) + (pointF3.x * 0.5f), (pointF4.y * 0.5f) + (pointF3.y * 0.5f));
            this.f55157f = pointF9;
            float f12 = this.f55156e * 0.7f;
            float f13 = pointF9.x;
            double radians2 = (float) Math.toRadians(this.f55154b + 90.0f);
            this.f55158g = new PointF((((float) Math.cos(radians2)) * f12) + f13, (f12 * ((float) Math.sin(radians2))) + pointF9.y);
        }
    }

    public static PointF b(PointF pointF, Bitmap bitmap, nt0 nt0Var, boolean z9) {
        int width;
        int height;
        if (z9) {
            width = bitmap.getHeight();
        } else {
            width = bitmap.getWidth();
        }
        float f10 = width;
        if (z9) {
            height = bitmap.getWidth();
        } else {
            height = bitmap.getHeight();
        }
        return new PointF((nt0Var.f36392a * pointF.x) / f10, (nt0Var.f36393b * pointF.y) / height);
    }

    public final PointF a(int i7) {
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        return null;
                    }
                    return this.f55158g;
                }
                return this.f55157f;
            }
            return this.d;
        }
        return this.f55155c;
    }
}
