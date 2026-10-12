package wh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;
public final class j extends GestureDetector.SimpleOnGestureListener {
    public final View f47699a;
    public final List f47700b;
    public final k f47701c;
    public final l d;

    public j(l lVar, View view, List list, k kVar) {
        this.d = lVar;
        this.f47699a = view;
        this.f47700b = list;
        this.f47701c = kVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        View view = this.f47699a;
        int scrollY = view.getScrollY() + ((int) motionEvent.getY());
        int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
        int paddingTop = scrollY - view.getPaddingTop();
        l lVar = this.d;
        int i10 = x10 - lVar.f47704c;
        int i11 = paddingTop - lVar.d;
        for (g gVar : this.f47700b) {
            if (gVar.getBounds().contains(i10, i11)) {
                lVar.f47703b = true;
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        l lVar = this.d;
        if (lVar.f47703b) {
            View view = this.f47699a;
            view.playSoundEffect(0);
            lVar.f47703b = false;
            int scrollY = view.getScrollY() + ((int) motionEvent.getY());
            int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
            int paddingTop = scrollY - view.getPaddingTop();
            int i10 = x10 - lVar.f47704c;
            int i11 = paddingTop - lVar.d;
            for (g gVar : this.f47700b) {
                if (gVar.getBounds().contains(i10, i11)) {
                    this.f47701c.o(gVar, i10, i11);
                    return true;
                }
            }
        }
        return false;
    }
}
