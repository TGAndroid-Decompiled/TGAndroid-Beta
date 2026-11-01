package w7;

import android.view.Gravity;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import org.telegram.messenger.dd;
public abstract class b6 {
    public static FrameLayout.LayoutParams a(float f7, float f10, int i10) {
        return new FrameLayout.LayoutParams(z(f7), z(f10), i10);
    }

    public static FrameLayout.LayoutParams b(float f7, float f10, int i10, float f11, float f12, float f13, float f14) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(z(f7), z(f10), i10);
        layoutParams.setMargins(org.telegram.messenger.i0.L(f11), org.telegram.messenger.i0.L(f12), org.telegram.messenger.i0.L(f13), org.telegram.messenger.i0.L(f14));
        return layoutParams;
    }

    public static FrameLayout.LayoutParams c(float f7, int i10) {
        return new FrameLayout.LayoutParams(z(i10), z(f7));
    }

    public static FrameLayout.LayoutParams d(int i10, float f7, int i11, float f10, float f11, float f12, float f13) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(z(i10), z(f7), i11);
        layoutParams.setMargins(org.telegram.messenger.i0.L(f10), org.telegram.messenger.i0.L(f11), org.telegram.messenger.i0.L(f12), org.telegram.messenger.i0.L(f13));
        return layoutParams;
    }

    public static FrameLayout.LayoutParams e(int i10, int i11, int i12) {
        return new FrameLayout.LayoutParams(z(i10), z(i11), i12);
    }

    public static FrameLayout.LayoutParams f(float f7, int i10, int i11, int i12, int i13, int i14, int i15) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(z(i10), z(f7), i11);
        layoutParams.setMargins(i12, i13, i14, i15);
        return layoutParams;
    }

    public static FrameLayout.LayoutParams g() {
        return c(-1.0f, -1);
    }

    public static FrameLayout.LayoutParams h(float f7, float f10, int i10) {
        return new FrameLayout.LayoutParams(z(f7), z(f10), Gravity.getAbsoluteGravity(i10, dd.X ? 1 : 0));
    }

    public static FrameLayout.LayoutParams i(float f7, float f10, int i10, float f11, float f12, float f13, float f14) {
        float f15;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(z(f7), z(f10), Gravity.getAbsoluteGravity(i10, dd.X ? 1 : 0));
        if (dd.X) {
            f15 = f13;
        } else {
            f15 = f11;
        }
        layoutParams.leftMargin = org.telegram.messenger.i0.L(f15);
        layoutParams.topMargin = org.telegram.messenger.i0.L(f12);
        if (!dd.X) {
            f11 = f13;
        }
        layoutParams.rightMargin = org.telegram.messenger.i0.L(f11);
        layoutParams.bottomMargin = org.telegram.messenger.i0.L(f14);
        return layoutParams;
    }

    public static LinearLayout.LayoutParams j(float f7, float f10) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(-2.0f), z(20.66f));
        layoutParams.setMargins(org.telegram.messenger.i0.L(f7), org.telegram.messenger.i0.L(0.0f), org.telegram.messenger.i0.L(f10), org.telegram.messenger.i0.L(0.0f));
        layoutParams.gravity = 16;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams k(float f7, float f10, float f11, float f12, int i10, int i11) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(i10), z(i11));
        layoutParams.setMargins(org.telegram.messenger.i0.L(f7), org.telegram.messenger.i0.L(f10), org.telegram.messenger.i0.L(f11), org.telegram.messenger.i0.L(f12));
        return layoutParams;
    }

    public static LinearLayout.LayoutParams l(float f7, int i10, int i11) {
        return new LinearLayout.LayoutParams(z(i10), z(i11), f7);
    }

    public static LinearLayout.LayoutParams m(float f7, int i10, int i11, int i12, int i13, int i14) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(i10), z(i11), f7);
        layoutParams.setMargins(org.telegram.messenger.i0.L(i12), org.telegram.messenger.i0.L(0), org.telegram.messenger.i0.L(i13), org.telegram.messenger.i0.L(i14));
        return layoutParams;
    }

    public static LinearLayout.LayoutParams n(float f7, int i10, int i11, int i12, int i13, int i14, int i15) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(i10), z(f7));
        layoutParams.setMargins(org.telegram.messenger.i0.L(i12), org.telegram.messenger.i0.L(i13), org.telegram.messenger.i0.L(i14), org.telegram.messenger.i0.L(i15));
        layoutParams.gravity = i11;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams o(int i10, int i11) {
        return new LinearLayout.LayoutParams(z(i10), z(i11));
    }

    public static LinearLayout.LayoutParams p(int i10, int i11, float f7, int i12) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(i10), z(i11), f7);
        layoutParams.gravity = i12;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams q(int i10, int i11, float f7, int i12, int i13, int i14, int i15, int i16) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(i10), z(i11), f7);
        layoutParams.setMargins(org.telegram.messenger.i0.L(i13), org.telegram.messenger.i0.L(i14), org.telegram.messenger.i0.L(i15), org.telegram.messenger.i0.L(i16));
        layoutParams.gravity = i12;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams r(int i10, int i11, int i12) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(i10), z(i11));
        layoutParams.gravity = i12;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams s(int i10, int i11, int i12, float f7, float f10, float f11, float f12) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(i10), z(i11));
        layoutParams.setMargins(org.telegram.messenger.i0.L(f7), org.telegram.messenger.i0.L(f10), org.telegram.messenger.i0.L(f11), org.telegram.messenger.i0.L(f12));
        layoutParams.gravity = i12;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams t(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(i10), z(i11));
        layoutParams.setMargins(org.telegram.messenger.i0.L(i13), org.telegram.messenger.i0.L(i14), org.telegram.messenger.i0.L(i15), org.telegram.messenger.i0.L(i16));
        layoutParams.gravity = i12;
        return layoutParams;
    }

    public static LinearLayout.LayoutParams u(float f7, float f10, int i10, float f11, float f12, float f13, float f14) {
        float f15;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(z(f7), z(f10), Gravity.getAbsoluteGravity(i10, dd.X ? 1 : 0));
        if (dd.X) {
            f15 = f13;
        } else {
            f15 = f11;
        }
        layoutParams.leftMargin = org.telegram.messenger.i0.L(f15);
        layoutParams.topMargin = org.telegram.messenger.i0.L(f12);
        if (!dd.X) {
            f11 = f13;
        }
        layoutParams.rightMargin = org.telegram.messenger.i0.L(f11);
        layoutParams.bottomMargin = org.telegram.messenger.i0.L(f14);
        return layoutParams;
    }

    public static RelativeLayout.LayoutParams v(int i10, float f7, int i11, float f10, int i12) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(z(f7), z(f10));
        if (i12 >= 0) {
            layoutParams.addRule(i12);
        }
        layoutParams.leftMargin = org.telegram.messenger.i0.L(i10);
        float f11 = 0;
        layoutParams.topMargin = org.telegram.messenger.i0.L(f11);
        layoutParams.rightMargin = org.telegram.messenger.i0.L(i11);
        layoutParams.bottomMargin = org.telegram.messenger.i0.L(f11);
        return layoutParams;
    }

    public static RelativeLayout.LayoutParams w(int i10, int i11) {
        return v(0, i10, 0, i11, -1);
    }

    public static FrameLayout.LayoutParams x(int i10, int i11, int i12) {
        return new FrameLayout.LayoutParams(z(i10), z(i11), i12);
    }

    public static int y() {
        if (dd.X) {
            return 5;
        }
        return 3;
    }

    public static int z(float f7) {
        if (f7 >= 0.0f) {
            f7 = org.telegram.messenger.i0.L(f7);
        }
        return (int) f7;
    }
}
