package yh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
public final class i extends GestureDetector.SimpleOnGestureListener {
    public final View f59548a;
    public final ArrayList f59549b;
    public final j f59550c;
    public final df.c d;

    public i(df.c cVar, View view, ArrayList arrayList, j jVar) {
        this.d = cVar;
        this.f59548a = view;
        this.f59549b = arrayList;
        this.f59550c = jVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        View view = this.f59548a;
        int scrollY = view.getScrollY() + ((int) motionEvent.getY());
        int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
        int paddingTop = scrollY - view.getPaddingTop();
        df.c cVar = this.d;
        int i3 = x10 - cVar.f8843a;
        int i10 = paddingTop - cVar.f8845c;
        ArrayList arrayList = this.f59549b;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            if (((f) obj).getBounds().contains(i3, i10)) {
                cVar.f8844b = true;
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        df.c cVar = this.d;
        if (cVar.f8844b) {
            View view = this.f59548a;
            view.playSoundEffect(0);
            cVar.f8844b = false;
            int scrollY = view.getScrollY() + ((int) motionEvent.getY());
            int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
            int paddingTop = scrollY - view.getPaddingTop();
            int i3 = x10 - cVar.f8843a;
            int i10 = paddingTop - cVar.f8845c;
            ArrayList arrayList = this.f59549b;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                f fVar = (f) obj;
                if (fVar.getBounds().contains(i3, i10)) {
                    this.f59550c.l(fVar, i3, i10);
                    return true;
                }
            }
        }
        return false;
    }
}
