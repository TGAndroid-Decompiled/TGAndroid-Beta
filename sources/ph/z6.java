package ph;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.qp;
public final class z6 extends qp {
    public final int f42699i = 0;

    public z6(float f10, float f11, int i10) {
        super(f10, f11, i10);
    }

    @Override
    public final int getIntrinsicHeight() {
        switch (this.f42699i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.f28226b * 2.0f) + this.f28225a);
        }
    }

    @Override
    public final int getIntrinsicWidth() {
        switch (this.f42699i) {
            case 0:
                return AndroidUtilities.dp(26.0f);
            default:
                return (int) ((this.f28226b * 2.0f) + this.f28225a);
        }
    }

    public z6(int i10) {
        super(i10);
    }
}
