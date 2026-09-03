package qh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tp;
public final class x6 extends tp {
    public final int f46316i = 0;

    public x6(float f10, float f11, int i10) {
        super(f10, f11, i10);
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.f46316i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.f31382b * 2.0f) + this.f31381a);
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.f46316i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.f31382b * 2.0f) + this.f31381a);
        }
    }

    public x6(int i10) {
        super(i10);
    }
}
