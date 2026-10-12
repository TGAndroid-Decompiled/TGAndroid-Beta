package vh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;
public final class j extends GestureDetector.SimpleOnGestureListener {
    public final View f49957a;
    public final List f49958b;
    public final k f49959c;
    public final l d;

    public j(l lVar, View view, List list, k kVar) {
        this.d = lVar;
        this.f49957a = view;
        this.f49958b = list;
        this.f49959c = kVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        View view = this.f49957a;
        int scrollY = view.getScrollY() + ((int) motionEvent.getY());
        int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
        int paddingTop = scrollY - view.getPaddingTop();
        l lVar = this.d;
        int i10 = x10 - lVar.f49962c;
        int i11 = paddingTop - lVar.d;
        for (g gVar : this.f49958b) {
            if (gVar.getBounds().contains(i10, i11)) {
                lVar.f49961b = true;
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        l lVar = this.d;
        if (lVar.f49961b) {
            View view = this.f49957a;
            view.playSoundEffect(0);
            lVar.f49961b = false;
            int scrollY = view.getScrollY() + ((int) motionEvent.getY());
            int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
            int paddingTop = scrollY - view.getPaddingTop();
            int i10 = x10 - lVar.f49962c;
            int i11 = paddingTop - lVar.d;
            for (g gVar : this.f49958b) {
                if (gVar.getBounds().contains(i10, i11)) {
                    this.f49959c.l(gVar, i10, i11);
                    return true;
                }
            }
        }
        return false;
    }
}
