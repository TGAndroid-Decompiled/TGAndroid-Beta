package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
public final class rn extends View {
    public final ArrayList f41691a;
    public final ArrayList f41692b;
    public final eo f41693c;

    public rn(eo eoVar, Context context) {
        super(context);
        this.f41693c = eoVar;
        this.f41691a = new ArrayList();
        this.f41692b = new ArrayList();
    }

    public final void a() {
        ArrayList arrayList = this.f41691a;
        arrayList.clear();
        eo eoVar = this.f41693c;
        arrayList.add(eoVar.K1);
        arrayList.add(eoVar.f37483x0);
        arrayList.add(eoVar.X);
        arrayList.add(eoVar.K3);
        arrayList.add(eoVar.I1);
        arrayList.add(eoVar.X2);
        arrayList.add(eoVar.Y);
        arrayList.add(eoVar.f37308j1);
        arrayList.add(eoVar.S);
        arrayList.add(eoVar.R1);
        arrayList.removeAll(Collections.singleton(null));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        eo eoVar = this.f41693c;
        eoVar.f37416rc = true;
        ArrayList arrayList = this.f41692b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).setVisibility(0);
        }
        arrayList.clear();
        eoVar.f37416rc = false;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        eo eoVar = this.f41693c;
        eoVar.f37416rc = true;
        ArrayList arrayList = this.f41691a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            View view = (View) obj;
            if (view.getVisibility() == 0) {
                view.setVisibility(8);
                this.f41692b.add(view);
            }
        }
        eoVar.f37416rc = false;
    }

    @Override
    public void setTranslationX(float f7) {
        super.setTranslationX(f7);
        a();
        ArrayList arrayList = this.f41691a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            View view = (View) obj;
            if (view != null) {
                view.setTranslationX(f7);
            }
        }
    }
}
