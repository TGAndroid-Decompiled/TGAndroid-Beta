package uh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;
public final class k extends GestureDetector.SimpleOnGestureListener {
    public final View f42811a;
    public final List f42812b;
    public final l f42813c;
    public final m d;

    public k(m mVar, View view, List list, l lVar) {
        this.d = mVar;
        this.f42811a = view;
        this.f42812b = list;
        this.f42813c = lVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        View view = this.f42811a;
        int scrollY = view.getScrollY() + ((int) motionEvent.getY());
        int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
        int paddingTop = scrollY - view.getPaddingTop();
        m mVar = this.d;
        int i10 = x10 - mVar.f42816c;
        int i11 = paddingTop - mVar.d;
        for (h hVar : this.f42812b) {
            if (hVar.getBounds().contains(i10, i11)) {
                mVar.f42815b = true;
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        m mVar = this.d;
        if (mVar.f42815b) {
            View view = this.f42811a;
            view.playSoundEffect(0);
            mVar.f42815b = false;
            int scrollY = view.getScrollY() + ((int) motionEvent.getY());
            int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
            int paddingTop = scrollY - view.getPaddingTop();
            int i10 = x10 - mVar.f42816c;
            int i11 = paddingTop - mVar.d;
            for (h hVar : this.f42812b) {
                if (hVar.getBounds().contains(i10, i11)) {
                    this.f42813c.l(hVar, i10, i11);
                    return true;
                }
            }
        }
        return false;
    }
}
