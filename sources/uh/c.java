package uh;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.i0;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.pt0;
import org.telegram.ui.Components.rs0;
import org.telegram.ui.m10;
public final class c extends pt0 {
    public final i f50235u3;

    public c(i iVar, Context context) {
        super(context);
        this.f50235u3 = iVar;
    }

    @Override
    public final boolean A1() {
        return this.f50235u3.f50246b;
    }

    @Override
    public final boolean B1() {
        return true;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            int bottom = getChildAt(i12).getBottom() - getPaddingTop();
            if (bottom > i11) {
                i11 = bottom;
            }
        }
        float f7 = i11;
        i iVar = this.f50235u3;
        m10 m10Var = iVar.J;
        if (iVar.f50246b) {
            rs0 rs0Var = iVar.f50250r;
            int i13 = 0;
            for (int i14 = 0; i14 < rs0Var.getChildCount(); i14++) {
                int bottom2 = rs0Var.getChildAt(i14).getBottom() - rs0Var.getPaddingTop();
                if (bottom2 > i13) {
                    i13 = bottom2;
                }
            }
            f7 = i0.T1(f7, i13, iVar.f50247c);
        }
        if (iVar.f50252w.b() <= 0) {
            i10 = 8;
        }
        m10Var.setVisibility(i10);
        m10Var.setTranslationY(f7);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f50235u3.e;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f50235u3.f50247c;
    }

    @Override
    public final int getColumnsCount() {
        return this.f50235u3.d;
    }

    @Override
    public final ak0 getMovingAdapter() {
        i iVar = this.f50235u3;
        if (iVar.G.D == 0 && !iVar.W.G.E1) {
            return iVar.f50252w;
        }
        return null;
    }

    @Override
    public final ak0 getSupportingAdapter() {
        return this.f50235u3.f50253x;
    }

    @Override
    public final rs0 getSupportingListView() {
        return this.f50235u3.f50250r;
    }
}
