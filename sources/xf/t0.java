package xf;

import android.graphics.Bitmap;
import android.graphics.PointF;
import org.telegram.ui.Components.qu0;
public final class t0 {
    public final float f49375a;
    public final float f49376b;
    public final PointF f49377c;
    public final PointF d;
    public final float f49378e;
    public final PointF f49379f;
    public final PointF f49380g;

    public t0(d8.a aVar, Bitmap bitmap, qu0 qu0Var, boolean z10) {
        float degrees;
        PointF pointF = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        for (d8.d dVar : aVar.f4452b) {
            PointF pointF5 = dVar.f4460a;
            int i9 = dVar.f4461b;
            if (i9 != 4) {
                if (i9 != 5) {
                    if (i9 != 10) {
                        if (i9 == 11) {
                            pointF4 = b(pointF5, bitmap, qu0Var, z10);
                        }
                    } else {
                        pointF2 = b(pointF5, bitmap, qu0Var, z10);
                    }
                } else {
                    pointF3 = b(pointF5, bitmap, qu0Var, z10);
                }
            } else {
                pointF = b(pointF5, bitmap, qu0Var, z10);
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
            this.f49378e = hypot;
            this.f49376b = (float) Math.toDegrees(Math.atan2(pointF2.y - pointF.y, pointF2.x - pointF.x) + 3.141592653589793d);
            this.f49375a = 2.35f * hypot;
            float f10 = hypot * 0.8f;
            float f11 = pointF7.x;
            double radians = (float) Math.toRadians(degrees - 90.0f);
            this.f49377c = new PointF((((float) Math.cos(radians)) * f10) + f11, (f10 * ((float) Math.sin(radians))) + pointF7.y);
        }
        if (pointF3 != null && pointF4 != null) {
            if (pointF3.x < pointF4.x) {
                PointF pointF8 = pointF4;
                pointF4 = pointF3;
                pointF3 = pointF8;
            }
            PointF pointF9 = new PointF((pointF4.x * 0.5f) + (pointF3.x * 0.5f), (pointF4.y * 0.5f) + (pointF3.y * 0.5f));
            this.f49379f = pointF9;
            float f12 = this.f49378e * 0.7f;
            float f13 = pointF9.x;
            double radians2 = (float) Math.toRadians(this.f49376b + 90.0f);
            this.f49380g = new PointF((((float) Math.cos(radians2)) * f12) + f13, (f12 * ((float) Math.sin(radians2))) + pointF9.y);
        }
    }

    public static PointF b(PointF pointF, Bitmap bitmap, qu0 qu0Var, boolean z10) {
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
        return new PointF((qu0Var.f32026a * pointF.x) / f10, (qu0Var.f32027b * pointF.y) / height);
    }

    public final PointF a(int i9) {
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        return null;
                    }
                    return this.f49380g;
                }
                return this.f49379f;
            }
            return this.d;
        }
        return this.f49377c;
    }
}
