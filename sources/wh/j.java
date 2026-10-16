package wh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;
public final class j extends GestureDetector.SimpleOnGestureListener {
    public final View f47698a;
    public final List f47699b;
    public final k f47700c;
    public final l d;

    public j(l lVar, View view, List list, k kVar) {
        this.d = lVar;
        this.f47698a = view;
        this.f47699b = list;
        this.f47700c = kVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        View view = this.f47698a;
        int scrollY = view.getScrollY() + ((int) motionEvent.getY());
        int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
        int paddingTop = scrollY - view.getPaddingTop();
        l lVar = this.d;
        int i10 = x10 - lVar.f47703c;
        int i11 = paddingTop - lVar.d;
        for (g gVar : this.f47699b) {
            if (gVar.getBounds().contains(i10, i11)) {
                lVar.f47702b = true;
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        l lVar = this.d;
        if (lVar.f47702b) {
            View view = this.f47698a;
            view.playSoundEffect(0);
            lVar.f47702b = false;
            int scrollY = view.getScrollY() + ((int) motionEvent.getY());
            int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
            int paddingTop = scrollY - view.getPaddingTop();
            int i10 = x10 - lVar.f47703c;
            int i11 = paddingTop - lVar.d;
            for (g gVar : this.f47699b) {
                if (gVar.getBounds().contains(i10, i11)) {
                    this.f47700c.o(gVar, i10, i11);
                    return true;
                }
            }
        }
        return false;
    }
}
