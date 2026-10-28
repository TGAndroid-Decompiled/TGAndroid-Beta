package xh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;
public final class j extends GestureDetector.SimpleOnGestureListener {
    public final View f51957a;
    public final List f51958b;
    public final k f51959c;
    public final l d;

    public j(l lVar, View view, List list, k kVar) {
        this.d = lVar;
        this.f51957a = view;
        this.f51958b = list;
        this.f51959c = kVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        View view = this.f51957a;
        int scrollY = view.getScrollY() + ((int) motionEvent.getY());
        int x9 = ((int) motionEvent.getX()) - view.getPaddingLeft();
        int paddingTop = scrollY - view.getPaddingTop();
        l lVar = this.d;
        int i10 = x9 - lVar.f51962c;
        int i11 = paddingTop - lVar.d;
        for (g gVar : this.f51958b) {
            if (gVar.getBounds().contains(i10, i11)) {
                lVar.f51961b = true;
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        l lVar = this.d;
        if (lVar.f51961b) {
            View view = this.f51957a;
            view.playSoundEffect(0);
            lVar.f51961b = false;
            int scrollY = view.getScrollY() + ((int) motionEvent.getY());
            int x9 = ((int) motionEvent.getX()) - view.getPaddingLeft();
            int paddingTop = scrollY - view.getPaddingTop();
            int i10 = x9 - lVar.f51962c;
            int i11 = paddingTop - lVar.d;
            for (g gVar : this.f51958b) {
                if (gVar.getBounds().contains(i10, i11)) {
                    this.f51959c.o(gVar, i10, i11);
                    return true;
                }
            }
        }
        return false;
    }
}
