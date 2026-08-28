package xf;

import org.telegram.messenger.R;
public final class b extends m {
    @Override
    public final float a() {
        return 1.0f;
    }

    @Override
    public final float d() {
        return 1.0f;
    }

    @Override
    public final int e() {
        return R.raw.photo_blur;
    }

    @Override
    public final float g() {
        return 0.35f;
    }

    @Override
    public final String i(int i9) {
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    return null;
                }
                return "brush";
            }
            return "compositeWithMaskBlurer";
        }
        return "blitWithMaskBlurer";
    }
}
