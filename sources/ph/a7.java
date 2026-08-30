package ph;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rp;
public final class a7 extends rp {
    public final int f41279i = 0;

    public a7(float f10, float f11, int i10) {
        super(f10, f11, i10);
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.f41279i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.f28507b * 2.0f) + this.f28506a);
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.f41279i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.f28507b * 2.0f) + this.f28506a);
        }
    }

    public a7(int i10) {
        super(i10);
    }
}
