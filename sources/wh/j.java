package wh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.List;
public final class j extends GestureDetector.SimpleOnGestureListener {
    public final View f49085a;
    public final List f49086b;
    public final k f49087c;
    public final l d;

    public j(l lVar, View view, List list, k kVar) {
        this.d = lVar;
        this.f49085a = view;
        this.f49086b = list;
        this.f49087c = kVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        View view = this.f49085a;
        int scrollY = view.getScrollY() + ((int) motionEvent.getY());
        int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
        int paddingTop = scrollY - view.getPaddingTop();
        l lVar = this.d;
        int i10 = x10 - lVar.f49090c;
        int i11 = paddingTop - lVar.d;
        for (g gVar : this.f49086b) {
            if (gVar.getBounds().contains(i10, i11)) {
                lVar.f49089b = true;
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        l lVar = this.d;
        if (lVar.f49089b) {
            View view = this.f49085a;
            view.playSoundEffect(0);
            lVar.f49089b = false;
            int scrollY = view.getScrollY() + ((int) motionEvent.getY());
            int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
            int paddingTop = scrollY - view.getPaddingTop();
            int i10 = x10 - lVar.f49090c;
            int i11 = paddingTop - lVar.d;
            for (g gVar : this.f49086b) {
                if (gVar.getBounds().contains(i10, i11)) {
                    this.f49087c.o(gVar, i10, i11);
                    return true;
                }
            }
        }
        return false;
    }
}
