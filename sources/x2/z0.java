package x2;

import android.hardware.camera2.CameraCharacteristics;
public final class z0 implements h2.j, g9.k, ua.a, t3.g {
    public final int f60299a;

    public z0(int i7) {
        this.f60299a = i7;
    }

    public static CameraCharacteristics.Key a() {
        return CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE;
    }

    @Override
    public void accept(Object obj) {
        ((a1) obj).f60032b.release();
    }

    @Override
    public Object apply(Object obj) {
        switch (this.f60299a) {
            case 1:
                return Integer.valueOf(((e2.m1) obj).f10526c);
            case 2:
            case 3:
            default:
                return (z3.q) obj;
            case 4:
                return Long.valueOf(((c4.a) obj).f4373b);
            case 5:
                return Long.valueOf(((c4.a) obj).f4374c);
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
