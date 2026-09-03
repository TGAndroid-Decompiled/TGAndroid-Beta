package ph;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.ou0;
import org.telegram.ui.Components.pt0;
public final class e extends ou0 {
    public final l f44410n3;

    public e(l lVar, Context context) {
        super(context);
        this.f44410n3 = lVar;
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
        l lVar = this.f44410n3;
        i iVar = lVar.G;
        if (lVar.f44423b) {
            pt0 pt0Var = lVar.f44428r;
            int i13 = 0;
            for (int i14 = 0; i14 < pt0Var.getChildCount(); i14++) {
                int bottom2 = pt0Var.getChildAt(i14).getBottom() - pt0Var.getPaddingTop();
                if (bottom2 > i13) {
                    i13 = bottom2;
                }
            }
            f10 = AndroidUtilities.lerp(f10, i13, lVar.f44424c);
        }
        if (lVar.v.h() <= 0) {
            i10 = 8;
        }
        iVar.setVisibility(i10);
        iVar.setTranslationY(f10);
    }

    @Override
    public final int getAnimateToColumnsCount() {
        return this.f44410n3.f44425e;
    }

    @Override
    public final float getChangeColumnsProgress() {
        return this.f44410n3.f44424c;
    }

    @Override
    public final int getColumnsCount() {
        return this.f44410n3.d;
    }

    @Override
    public final cl0 getMovingAdapter() {
        l lVar = this.f44410n3;
        if (lVar.D.f5767y == 0 && !lVar.T.D.f33666z1) {
            return lVar.v;
        }
        return null;
    }

    @Override
    public final cl0 getSupportingAdapter() {
        return this.f44410n3.f44430w;
    }

    @Override
    public final pt0 getSupportingListView() {
        return this.f44410n3.f44428r;
    }

    @Override
    public final boolean y1() {
        return this.f44410n3.f44423b;
    }

    @Override
    public final boolean z1() {
        return true;
    }
}
