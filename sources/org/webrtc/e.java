package org.webrtc;

import javax.microedition.khronos.egl.EGLContext;
import org.webrtc.EglBase;
import org.webrtc.EglBase10;
import org.webrtc.EglBase14;
public abstract class e {
    static {
        Object obj = EglBase.lock;
    }

    public static EglBase.ConfigBuilder a() {
        return new EglBase.ConfigBuilder();
    }

    public static EglBase b() {
        return d(null, EglBase.CONFIG_PLAIN);
    }

    public static EglBase c(EglBase.Context context) {
        return d(context, EglBase.CONFIG_PLAIN);
    }

    public static EglBase d(EglBase.Context context, int[] iArr) {
        if (context == null) {
            if (EglBase14Impl.isEGL14Supported()) {
                return j(iArr);
            }
            return g(iArr);
        } else if (context instanceof EglBase14.Context) {
            return i((EglBase14.Context) context, iArr);
        } else {
            if (context instanceof EglBase10.Context) {
                return f((EglBase10.Context) context, iArr);
            }
            throw new IllegalArgumentException("Unrecognized Context");
        }
    }

    public static EglBase10 e(EGLContext eGLContext, int[] iArr) {
        return new EglBase10Impl(eGLContext, iArr);
    }

    public static EglBase10 f(EglBase10.Context context, int[] iArr) {
        EGLContext rawContext;
        if (context == null) {
            rawContext = null;
        } else {
            rawContext = context.getRawContext();
        }
        return new EglBase10Impl(rawContext, iArr);
    }

    public static EglBase10 g(int[] iArr) {
        return new EglBase10Impl(null, iArr);
    }

    public static EglBase14 h(android.opengl.EGLContext eGLContext, int[] iArr) {
        return new EglBase14Impl(eGLContext, iArr);
    }

    public static EglBase14 i(EglBase14.Context context, int[] iArr) {
        android.opengl.EGLContext rawContext;
        if (context == null) {
            rawContext = null;
        } else {
            rawContext = context.getRawContext();
        }
        return new EglBase14Impl(rawContext, iArr);
    }

    public static EglBase14 j(int[] iArr) {
        return new EglBase14Impl(null, iArr);
    }

    public static int k(int[] iArr) {
        for (int i10 = 0; i10 < iArr.length - 1; i10++) {
            if (iArr[i10] == 12352) {
                int i11 = iArr[i10 + 1];
                if (i11 != 4) {
                    if (i11 != 64) {
                        return 1;
                    }
                    return 3;
                }
                return 2;
            }
        }
        return 1;
    }
}
