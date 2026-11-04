package tg;
public final class b extends h {
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
        return 2131624126;
    }

    @Override
    public final float g() {
        return 0.35f;
    }

    @Override
    public final String i(int i3) {
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 != 2) {
                    return null;
                }
                return "brush";
            }
            return "compositeWithMaskBlurer";
        }
        return "blitWithMaskBlurer";
    }
}
