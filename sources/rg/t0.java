package rg;

import android.graphics.Bitmap;
import android.graphics.PointF;
import org.telegram.ui.Components.rw0;
public final class t0 {
    public final float f47592a;
    public final float f47593b;
    public final PointF f47594c;
    public final PointF d;
    public final float e;
    public final PointF f47595f;
    public final PointF f47596g;

    public t0(u8.a aVar, Bitmap bitmap, rw0 rw0Var, boolean z10) {
        float degrees;
        PointF pointF = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        PointF pointF4 = null;
        for (u8.c cVar : aVar.f49653b) {
            PointF pointF5 = cVar.f49657a;
            int i10 = cVar.f49658b;
            if (i10 != 4) {
                if (i10 != 5) {
                    if (i10 != 10) {
                        if (i10 == 11) {
                            pointF4 = b(pointF5, bitmap, rw0Var, z10);
                        }
                    } else {
                        pointF2 = b(pointF5, bitmap, rw0Var, z10);
                    }
                } else {
                    pointF3 = b(pointF5, bitmap, rw0Var, z10);
                }
            } else {
                pointF = b(pointF5, bitmap, rw0Var, z10);
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
            this.e = hypot;
            this.f47593b = (float) Math.toDegrees(Math.atan2(pointF2.y - pointF.y, pointF2.x - pointF.x) + 3.141592653589793d);
            this.f47592a = 2.35f * hypot;
            float f7 = hypot * 0.8f;
            float f10 = pointF7.x;
            double radians = (float) Math.toRadians(degrees - 90.0f);
            this.f47594c = new PointF((((float) Math.cos(radians)) * f7) + f10, (f7 * ((float) Math.sin(radians))) + pointF7.y);
        }
        if (pointF3 != null && pointF4 != null) {
            if (pointF3.x < pointF4.x) {
                PointF pointF8 = pointF4;
                pointF4 = pointF3;
                pointF3 = pointF8;
            }
            PointF pointF9 = new PointF((pointF4.x * 0.5f) + (pointF3.x * 0.5f), (pointF4.y * 0.5f) + (pointF3.y * 0.5f));
            this.f47595f = pointF9;
            float f11 = this.e * 0.7f;
            float f12 = pointF9.x;
            double radians2 = (float) Math.toRadians(this.f47593b + 90.0f);
            this.f47596g = new PointF((((float) Math.cos(radians2)) * f11) + f12, (f11 * ((float) Math.sin(radians2))) + pointF9.y);
        }
    }

    public static PointF b(PointF pointF, Bitmap bitmap, rw0 rw0Var, boolean z10) {
        int width;
        int height;
        if (z10) {
            width = bitmap.getHeight();
        } else {
            width = bitmap.getWidth();
        }
        float f7 = width;
        if (z10) {
            height = bitmap.getWidth();
        } else {
            height = bitmap.getHeight();
        }
        return new PointF((rw0Var.f32392a * pointF.x) / f7, (rw0Var.f32393b * pointF.y) / height);
    }

    public final PointF a(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        return null;
                    }
                    return this.f47596g;
                }
                return this.f47595f;
            }
            return this.d;
        }
        return this.f47594c;
    }
}
