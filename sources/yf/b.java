package yf;

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
    public final String i(int i10) {
        if (i10 == 0) {
            return "blitWithMaskBlurer";
        }
        if (i10 == 1) {
            return "compositeWithMaskBlurer";
        }
        if (i10 != 2) {
            return null;
        }
        return "brush";
    }
}
