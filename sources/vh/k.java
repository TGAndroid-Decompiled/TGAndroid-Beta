package vh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;
public final class k extends GestureDetector.SimpleOnGestureListener {
    public final View f44696a;
    public final List f44697b;
    public final l f44698c;
    public final m d;

    public k(m mVar, View view, List list, l lVar) {
        this.d = mVar;
        this.f44696a = view;
        this.f44697b = list;
        this.f44698c = lVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        View view = this.f44696a;
        int scrollY = view.getScrollY() + ((int) motionEvent.getY());
        int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
        int paddingTop = scrollY - view.getPaddingTop();
        m mVar = this.d;
        int i10 = x10 - mVar.f44701c;
        int i11 = paddingTop - mVar.d;
        for (h hVar : this.f44697b) {
            if (hVar.getBounds().contains(i10, i11)) {
                mVar.f44700b = true;
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        m mVar = this.d;
        if (mVar.f44700b) {
            View view = this.f44696a;
            view.playSoundEffect(0);
            mVar.f44700b = false;
            int scrollY = view.getScrollY() + ((int) motionEvent.getY());
            int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
            int paddingTop = scrollY - view.getPaddingTop();
            int i10 = x10 - mVar.f44701c;
            int i11 = paddingTop - mVar.d;
            for (h hVar : this.f44697b) {
                if (hVar.getBounds().contains(i10, i11)) {
                    this.f44698c.l(hVar, i10, i11);
                    return true;
                }
            }
        }
        return false;
    }
}
