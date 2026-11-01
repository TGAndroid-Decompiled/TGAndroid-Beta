package uh;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.i0;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.ss0;
import org.telegram.ui.l10;
public final class c extends qt0 {
    public final i f50249u3;

    public c(i iVar, Context context) {
        super(context);
        this.f50249u3 = iVar;
    }

    @Override
    public final boolean A1() {
        return this.f50249u3.f50260b;
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
        i iVar = this.f50249u3;
        l10 l10Var = iVar.J;
        if (iVar.f50260b) {
            ss0 ss0Var = iVar.f50264r;
            int i13 = 0;
            for (int i14 = 0; i14 < ss0Var.getChildCount(); i14++) {
                int bottom2 = ss0Var.getChildAt(i14).getBottom() - ss0Var.getPaddingTop();
                if (bottom2 > i13) {
                    i13 = bottom2;
                }
            }
            f7 = i0.T1(f7, i13, iVar.f50261c);
        }
        if (iVar.f50266w.b() <= 0) {
            i10 = 8;
        }
        l10Var.setVisibility(i10);
        l10Var.setTranslationY(f7);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f50249u3.e;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f50249u3.f50261c;
    }

    @Override
    public final int getColumnsCount() {
        return this.f50249u3.d;
    }

    @Override
    public final bk0 getMovingAdapter() {
        i iVar = this.f50249u3;
        if (iVar.G.D == 0 && !iVar.W.G.E1) {
            return iVar.f50266w;
        }
        return null;
    }

    @Override
    public final bk0 getSupportingAdapter() {
        return this.f50249u3.f50267x;
    }

    @Override
    public final ss0 getSupportingListView() {
        return this.f50249u3.f50264r;
    }
}
