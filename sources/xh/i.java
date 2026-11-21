package xh;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
public final class i extends GestureDetector.SimpleOnGestureListener {
    public final View f60629a;
    public final ArrayList f60630b;
    public final j f60631c;
    public final gf.c d;

    public i(gf.c cVar, View view, ArrayList arrayList, j jVar) {
        this.d = cVar;
        this.f60629a = view;
        this.f60630b = arrayList;
        this.f60631c = jVar;
    }

    @Override
    public final boolean onDown(MotionEvent motionEvent) {
        View view = this.f60629a;
        int scrollY = view.getScrollY() + ((int) motionEvent.getY());
        int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
        int paddingTop = scrollY - view.getPaddingTop();
        gf.c cVar = this.d;
        int i7 = x10 - cVar.f13556a;
        int i10 = paddingTop - cVar.f13558c;
        ArrayList arrayList = this.f60630b;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            if (((f) obj).getBounds().contains(i7, i10)) {
                cVar.f13557b = true;
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        gf.c cVar = this.d;
        if (cVar.f13557b) {
            View view = this.f60629a;
            view.playSoundEffect(0);
            cVar.f13557b = false;
            int scrollY = view.getScrollY() + ((int) motionEvent.getY());
            int x10 = ((int) motionEvent.getX()) - view.getPaddingLeft();
            int paddingTop = scrollY - view.getPaddingTop();
            int i7 = x10 - cVar.f13556a;
            int i10 = paddingTop - cVar.f13558c;
            ArrayList arrayList = this.f60630b;
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                f fVar = (f) obj;
                if (fVar.getBounds().contains(i7, i10)) {
                    this.f60631c.a(fVar, i7, i10);
                    return true;
                }
            }
        }
        return false;
    }
}
