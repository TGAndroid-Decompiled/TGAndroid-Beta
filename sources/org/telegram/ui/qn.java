package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
public final class qn extends View {
    public final ArrayList f39945a;
    public final ArrayList f39946b;
    public final co f39947c;

    public qn(co coVar, Context context) {
        super(context);
        this.f39947c = coVar;
        this.f39945a = new ArrayList();
        this.f39946b = new ArrayList();
    }

    public final void a() {
        ArrayList arrayList = this.f39945a;
        arrayList.clear();
        co coVar = this.f39947c;
        arrayList.add(coVar.K1);
        arrayList.add(coVar.f35500x0);
        arrayList.add(coVar.X);
        arrayList.add(coVar.K3);
        arrayList.add(coVar.I1);
        arrayList.add(coVar.X2);
        arrayList.add(coVar.Y);
        arrayList.add(coVar.f35326j1);
        arrayList.add(coVar.S);
        arrayList.add(coVar.R1);
        arrayList.removeAll(Collections.singleton(null));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        co coVar = this.f39947c;
        coVar.f35434rc = true;
        ArrayList arrayList = this.f39946b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).setVisibility(0);
        }
        arrayList.clear();
        coVar.f35434rc = false;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        co coVar = this.f39947c;
        coVar.f35434rc = true;
        ArrayList arrayList = this.f39945a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            View view = (View) obj;
            if (view.getVisibility() == 0) {
                view.setVisibility(8);
                this.f39946b.add(view);
            }
        }
        coVar.f35434rc = false;
    }

    @Override
    public void setTranslationX(float f7) {
        super.setTranslationX(f7);
        a();
        ArrayList arrayList = this.f39945a;
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
