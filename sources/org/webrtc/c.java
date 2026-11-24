package org.webrtc;

import org.webrtc.EglBase;
import org.webrtc.EglBase10;
import org.webrtc.EglBase14;
public abstract class c {
    public static final int a = 0;

    static {
        Object obj = EglBase.lock;
    }

    public static EglBase a(EglBase.Context context, int[] iArr) {
        if (context == null) {
            if (EglBase14Impl.isEGL14Supported()) {
                return new EglBase14Impl(null, iArr);
            }
            return new EglBase10Impl(null, iArr);
        } else if (context instanceof EglBase14.Context) {
            return new EglBase14Impl(((EglBase14.Context) context).getRawContext(), iArr);
        } else {
            if (context instanceof EglBase10.Context) {
                return new EglBase10Impl(((EglBase10.Context) context).getRawContext(), iArr);
            }
            w26.j("Unrecognized Context");
            return null;
        }
    }

    public static int b(int[] iArr) {
        for (int i = 0; i < iArr.length - 1; i++) {
            if (iArr[i] == 12352) {
                int i2 = iArr[i + 1];
                if (i2 != 4) {
                    if (i2 != 64) {
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
