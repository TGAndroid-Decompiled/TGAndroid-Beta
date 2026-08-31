package ph;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.pu0;
import org.telegram.ui.Components.qt0;
public final class e extends pu0 {
    public final l f44379n3;

    public e(l lVar, Context context) {
        super(context);
        this.f44379n3 = lVar;
    }

    @Override
    public final boolean A1() {
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
        float f10 = i11;
        l lVar = this.f44379n3;
        i iVar = lVar.G;
        if (lVar.f44392b) {
            qt0 qt0Var = lVar.f44397r;
            int i13 = 0;
            for (int i14 = 0; i14 < qt0Var.getChildCount(); i14++) {
                int bottom2 = qt0Var.getChildAt(i14).getBottom() - qt0Var.getPaddingTop();
                if (bottom2 > i13) {
                    i13 = bottom2;
                }
            }
            f10 = AndroidUtilities.lerp(f10, i13, lVar.f44393c);
        }
        if (lVar.v.h() <= 0) {
            i10 = 8;
        }
        iVar.setVisibility(i10);
        iVar.setTranslationY(f10);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f44379n3.f44394e;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f44379n3.f44393c;
    }

    @Override
    public final int getColumnsCount() {
        return this.f44379n3.d;
    }

    @Override
    public final dl0 getMovingAdapter() {
        l lVar = this.f44379n3;
        if (lVar.D.f5767y == 0 && !lVar.T.D.f34021z1) {
            return lVar.v;
        }
        return null;
    }

    @Override
    public final dl0 getSupportingAdapter() {
        return this.f44379n3.f44399w;
    }

    @Override
    public final qt0 getSupportingListView() {
        return this.f44379n3.f44397r;
    }

    @Override
    public final boolean z1() {
        return this.f44379n3.f44392b;
    }
}
