package qh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tp;
public final class y6 extends tp {
    public final int f46360i = 0;

    public y6(float f10, float f11, int i10) {
        super(f10, f11, i10);
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.f46360i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.f31428b * 2.0f) + this.f31427a);
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.f46360i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.f31428b * 2.0f) + this.f31427a);
        }
    }

    public y6(int i10) {
        super(i10);
    }
}
