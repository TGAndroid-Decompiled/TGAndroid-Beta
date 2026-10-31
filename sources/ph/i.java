package ph;

import android.content.Context;
import android.view.MotionEvent;
import org.telegram.ui.ActionBar.p6;
public final class i extends vh.d {
    public final int f45110k0;

    public i(int i10, Context context, p6 p6Var, boolean z10) {
        super(context, p6Var, z10);
        this.f45110k0 = i10;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f45110k0) {
            case 0:
                if (!this.f51052c0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean j() {
        switch (this.f45110k0) {
            case 1:
                return false;
            case 2:
            default:
                return super.j();
            case 3:
                return false;
        }
    }
}
