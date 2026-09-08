package wh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;
public final class k extends GestureDetector.SimpleOnGestureListener {
    public final View f48683a;
    public final List f48684b;
    public final l f48685c;
    public final m d;

    public k(m mVar, View view, List list, l lVar) {
        this.d = mVar;
        this.f48683a = view;
        this.f48684b = list;
        this.f48685c = lVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        View view = this.f48683a;
        int scrollY = view.getScrollY() + ((int) motionEvent.getY());
        int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
        int paddingTop = scrollY - view.getPaddingTop();
        m mVar = this.d;
        int i10 = x10 - mVar.f48688c;
        int i11 = paddingTop - mVar.d;
        for (h hVar : this.f48684b) {
            if (hVar.getBounds().contains(i10, i11)) {
                mVar.f48687b = true;
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        m mVar = this.d;
        if (mVar.f48687b) {
            View view = this.f48683a;
            view.playSoundEffect(0);
            mVar.f48687b = false;
            int scrollY = view.getScrollY() + ((int) motionEvent.getY());
            int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
            int paddingTop = scrollY - view.getPaddingTop();
            int i10 = x10 - mVar.f48688c;
            int i11 = paddingTop - mVar.d;
            for (h hVar : this.f48684b) {
                if (hVar.getBounds().contains(i10, i11)) {
                    this.f48685c.o(hVar, i10, i11);
                    return true;
                }
            }
        }
        return false;
    }
}
