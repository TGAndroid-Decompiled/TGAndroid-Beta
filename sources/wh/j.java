package wh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;
public final class j extends GestureDetector.SimpleOnGestureListener {
    public final View f49536a;
    public final List f49537b;
    public final k f49538c;
    public final l d;

    public j(l lVar, View view, List list, k kVar) {
        this.d = lVar;
        this.f49536a = view;
        this.f49537b = list;
        this.f49538c = kVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        View view = this.f49536a;
        int scrollY = view.getScrollY() + ((int) motionEvent.getY());
        int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
        int paddingTop = scrollY - view.getPaddingTop();
        l lVar = this.d;
        int i10 = x10 - lVar.f49541c;
        int i11 = paddingTop - lVar.d;
        for (g gVar : this.f49537b) {
            if (gVar.getBounds().contains(i10, i11)) {
                lVar.f49540b = true;
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        l lVar = this.d;
        if (lVar.f49540b) {
            View view = this.f49536a;
            view.playSoundEffect(0);
            lVar.f49540b = false;
            int scrollY = view.getScrollY() + ((int) motionEvent.getY());
            int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
            int paddingTop = scrollY - view.getPaddingTop();
            int i10 = x10 - lVar.f49541c;
            int i11 = paddingTop - lVar.d;
            for (g gVar : this.f49537b) {
                if (gVar.getBounds().contains(i10, i11)) {
                    this.f49538c.l(gVar, i10, i11);
                    return true;
                }
            }
        }
        return false;
    }
}
