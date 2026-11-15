package x2;

import android.hardware.camera2.CameraCharacteristics;
public final class p1 implements g9.k, ua.a, t3.g {
    public final int f59635a;

    public p1(int i7) {
        this.f59635a = i7;
    }

    public static CameraCharacteristics.Key a() {
        return CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
    }

    @Override
    public Object apply(Object obj) {
        switch (this.f59635a) {
            case 0:
                return Integer.valueOf(((e2.m1) obj).f10211c);
            case 1:
            case 2:
            default:
                return (z3.q) obj;
            case 3:
                return Long.valueOf(((c4.a) obj).f4092b);
            case 4:
                return Long.valueOf(((c4.a) obj).f4093c);
        }
    }

    @Override
    public void b(ua.b bVar) {
        bVar.get().getClass();
        throw new ClassCastException();
    }

    @Override
    public boolean c(int i7, int i10, int i11, int i12, int i13) {
        if (i10 != 67 || i11 != 79 || i12 != 77 || (i13 != 77 && i7 != 2)) {
            if (i10 == 77 && i11 == 76 && i12 == 76) {
                if (i13 == 84 || i7 == 2) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }
}
