package tg;

import android.graphics.Bitmap;
import android.graphics.PointF;
import org.telegram.ui.Components.lt0;
public final class l0 {
    public final float f55242a;
    public final float f55243b;
    public final PointF f55244c;
    public final PointF d;
    public final float f55245e;
    public final PointF f55246f;
    public final PointF f55247g;

    public l0(v8.a aVar, Bitmap bitmap, lt0 lt0Var, boolean z10) {
        float degrees;
        PointF pointF = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        for (v8.c cVar : aVar.f56477b) {
            PointF pointF5 = cVar.f56482a;
            int i3 = cVar.f56483b;
            if (i3 != 4) {
                if (i3 != 5) {
                    if (i3 != 10) {
                        if (i3 == 11) {
                            pointF4 = b(pointF5, bitmap, lt0Var, z10);
                        }
                    } else {
                        pointF2 = b(pointF5, bitmap, lt0Var, z10);
                    }
                } else {
                    pointF3 = b(pointF5, bitmap, lt0Var, z10);
                }
            } else {
                pointF = b(pointF5, bitmap, lt0Var, z10);
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
            this.f55245e = hypot;
            this.f55243b = (float) Math.toDegrees(Math.atan2(pointF2.y - pointF.y, pointF2.x - pointF.x) + 3.141592653589793d);
            this.f55242a = 2.35f * hypot;
            float f10 = hypot * 0.8f;
            float f11 = pointF7.x;
            double radians = (float) Math.toRadians(degrees - 90.0f);
            this.f55244c = new PointF((((float) Math.cos(radians)) * f10) + f11, (f10 * ((float) Math.sin(radians))) + pointF7.y);
        }
        if (pointF3 != null && pointF4 != null) {
            if (pointF3.x < pointF4.x) {
                PointF pointF8 = pointF4;
                pointF4 = pointF3;
                pointF3 = pointF8;
            }
            PointF pointF9 = new PointF((pointF4.x * 0.5f) + (pointF3.x * 0.5f), (pointF4.y * 0.5f) + (pointF3.y * 0.5f));
            this.f55246f = pointF9;
            float f12 = this.f55245e * 0.7f;
            float f13 = pointF9.x;
            double radians2 = (float) Math.toRadians(this.f55243b + 90.0f);
            this.f55247g = new PointF((((float) Math.cos(radians2)) * f12) + f13, (f12 * ((float) Math.sin(radians2))) + pointF9.y);
        }
    }

    public static PointF b(PointF pointF, Bitmap bitmap, lt0 lt0Var, boolean z10) {
        int width;
        int height;
        if (z10) {
            width = bitmap.getHeight();
        } else {
            width = bitmap.getWidth();
        }
        float f10 = width;
        if (z10) {
            height = bitmap.getWidth();
        } else {
            height = bitmap.getHeight();
        }
        return new PointF((lt0Var.f35877a * pointF.x) / f10, (lt0Var.f35878b * pointF.y) / height);
    }

    public final PointF a(int i3) {
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        return null;
                    }
                    return this.f55247g;
                }
                return this.f55246f;
            }
            return this.d;
        }
        return this.f55244c;
    }
}
