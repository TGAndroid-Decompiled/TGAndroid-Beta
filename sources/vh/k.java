package vh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;
public final class k extends GestureDetector.SimpleOnGestureListener {
    public final View f44393a;
    public final List f44394b;
    public final l f44395c;
    public final m d;

    public k(m mVar, View view, List list, l lVar) {
        this.d = mVar;
        this.f44393a = view;
        this.f44394b = list;
        this.f44395c = lVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        View view = this.f44393a;
        int scrollY = view.getScrollY() + ((int) motionEvent.getY());
        int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
        int paddingTop = scrollY - view.getPaddingTop();
        m mVar = this.d;
        int i10 = x10 - mVar.f44398c;
        int i11 = paddingTop - mVar.d;
        for (h hVar : this.f44394b) {
            if (hVar.getBounds().contains(i10, i11)) {
                mVar.f44397b = true;
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        m mVar = this.d;
        if (mVar.f44397b) {
            View view = this.f44393a;
            view.playSoundEffect(0);
            mVar.f44397b = false;
            int scrollY = view.getScrollY() + ((int) motionEvent.getY());
            int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
            int paddingTop = scrollY - view.getPaddingTop();
            int i10 = x10 - mVar.f44398c;
            int i11 = paddingTop - mVar.d;
            for (h hVar : this.f44394b) {
                if (hVar.getBounds().contains(i10, i11)) {
                    this.f44395c.j(hVar, i10, i11);
                    return true;
                }
            }
        }
        return false;
    }
}
