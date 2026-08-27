package yf;

import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.R;

public abstract class m {

    public static final List f49979a = Arrays.asList(new f(), new a(), new c(), new e(), new b(), new d());

    public float a() {
        return 0.85f;
    }

    public float b() {
        return 0.0f;
    }

    public int c() {
        return -16777216;
    }

    public float d() {
        return 0.25f;
    }

    public abstract int e();

    public float f() {
        return 1.0f;
    }

    public float g() {
        return 0.4f;
    }

    public float h() {
        return 1.0f;
    }

    public String i(int i10) {
        if (i10 == 0) {
            return "blitWithMask";
        }
        if (i10 == 1) {
            return "compositeWithMask";
        }
        if (i10 != 2) {
            return null;
        }
        return "brush";
    }

    public float j() {
        return 1.0f;
    }

    public float k() {
        return 0.15f;
    }

    public int l() {
        return R.drawable.paint_radial_brush;
    }
}
