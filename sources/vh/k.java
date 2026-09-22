package vh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;
public final class k extends GestureDetector.SimpleOnGestureListener {
    public final View f44439a;
    public final List f44440b;
    public final l f44441c;
    public final m d;

    public k(m mVar, View view, List list, l lVar) {
        this.d = mVar;
        this.f44439a = view;
        this.f44440b = list;
        this.f44441c = lVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        View view = this.f44439a;
        int scrollY = view.getScrollY() + ((int) motionEvent.getY());
        int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
        int paddingTop = scrollY - view.getPaddingTop();
        m mVar = this.d;
        int i10 = x10 - mVar.f44444c;
        int i11 = paddingTop - mVar.d;
        for (h hVar : this.f44440b) {
            if (hVar.getBounds().contains(i10, i11)) {
                mVar.f44443b = true;
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        m mVar = this.d;
        if (mVar.f44443b) {
            View view = this.f44439a;
            view.playSoundEffect(0);
            mVar.f44443b = false;
            int scrollY = view.getScrollY() + ((int) motionEvent.getY());
            int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
            int paddingTop = scrollY - view.getPaddingTop();
            int i10 = x10 - mVar.f44444c;
            int i11 = paddingTop - mVar.d;
            for (h hVar : this.f44440b) {
                if (hVar.getBounds().contains(i10, i11)) {
                    this.f44441c.j(hVar, i10, i11);
                    return true;
                }
            }
        }
        return false;
    }
}
