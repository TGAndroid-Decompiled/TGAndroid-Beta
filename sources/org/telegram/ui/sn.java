package org.telegram.ui;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
public final class sn extends View {
    public final ArrayList f39851a;
    public final ArrayList f39852b;
    public final fo f39853c;

    public sn(fo foVar, Context context) {
        super(context);
        this.f39853c = foVar;
        this.f39851a = new ArrayList();
        this.f39852b = new ArrayList();
    }

    public final void a() {
        ArrayList arrayList = this.f39851a;
        arrayList.clear();
        fo foVar = this.f39853c;
        arrayList.add(foVar.K1);
        arrayList.add(foVar.f35861x0);
        arrayList.add(foVar.X);
        arrayList.add(foVar.K3);
        arrayList.add(foVar.I1);
        arrayList.add(foVar.X2);
        arrayList.add(foVar.Y);
        arrayList.add(foVar.f35685j1);
        arrayList.add(foVar.S);
        arrayList.add(foVar.R1);
        arrayList.removeAll(Collections.singleton(null));
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        fo foVar = this.f39853c;
        foVar.f35794rc = true;
        ArrayList arrayList = this.f39852b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((View) obj).setVisibility(0);
        }
        arrayList.clear();
        foVar.f35794rc = false;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        fo foVar = this.f39853c;
        foVar.f35794rc = true;
        ArrayList arrayList = this.f39851a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            View view = (View) obj;
            if (view.getVisibility() == 0) {
                view.setVisibility(8);
                this.f39852b.add(view);
            }
        }
        foVar.f35794rc = false;
    }

    @Override
    public void setTranslationX(float f7) {
        super.setTranslationX(f7);
        a();
        ArrayList arrayList = this.f39851a;
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
