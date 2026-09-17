package wh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;
public final class k extends GestureDetector.SimpleOnGestureListener {
    public final View f48684a;
    public final List f48685b;
    public final l f48686c;
    public final m d;

    public k(m mVar, View view, List list, l lVar) {
        this.d = mVar;
        this.f48684a = view;
        this.f48685b = list;
        this.f48686c = lVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        View view = this.f48684a;
        int scrollY = view.getScrollY() + ((int) motionEvent.getY());
        int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
        int paddingTop = scrollY - view.getPaddingTop();
        m mVar = this.d;
        int i10 = x10 - mVar.f48689c;
        int i11 = paddingTop - mVar.d;
        for (h hVar : this.f48685b) {
            if (hVar.getBounds().contains(i10, i11)) {
                mVar.f48688b = true;
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        m mVar = this.d;
        if (mVar.f48688b) {
            View view = this.f48684a;
            view.playSoundEffect(0);
            mVar.f48688b = false;
            int scrollY = view.getScrollY() + ((int) motionEvent.getY());
            int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
            int paddingTop = scrollY - view.getPaddingTop();
            int i10 = x10 - mVar.f48689c;
            int i11 = paddingTop - mVar.d;
            for (h hVar : this.f48685b) {
                if (hVar.getBounds().contains(i10, i11)) {
                    this.f48686c.o(hVar, i10, i11);
                    return true;
                }
            }
        }
        return false;
    }
}
