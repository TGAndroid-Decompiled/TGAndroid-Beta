package tg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.rl;
import org.telegram.ui.Components.voip.u2;
import ud.c;

public abstract class b extends ViewGroup {

    public int f48226a;

    public int f48227b;

    public final LinkedHashMap f48228c;

    public b(Context context) {
        super(context);
        this.f48228c = new LinkedHashMap(16);
    }

    public final void a(u2 u2Var) {
        addView(u2Var);
        this.f48228c.put(u2Var, new a(u2Var, new qf.b(this, 14)));
    }

    public final void b(boolean z10, boolean z11) {
        int iMin;
        int i10;
        c cVar;
        int measuredWidth;
        int measuredHeight;
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        boolean z12 = measuredWidth2 <= measuredHeight2;
        if (measuredWidth2 <= 0 || measuredHeight2 <= 0) {
            return;
        }
        LinkedHashMap linkedHashMap = this.f48228c;
        Iterator it = linkedHashMap.values().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (((a) it.next()).h) {
                i11++;
            }
        }
        if (i11 == 0) {
            i11 = 1;
        }
        if (z12) {
            iMin = Math.min(AndroidUtilities.dp(50.0f) + Math.max((int) (rl.z(50.0f, i11, measuredHeight2) / (i11 + 0.333f)), 0), measuredHeight2 / i11);
            i10 = (measuredHeight2 - (i11 * iMin)) / 2;
        } else {
            int iMin2 = Math.min(AndroidUtilities.dp(50.0f) + Math.max((int) (rl.z(50.0f, i11, measuredWidth2) / (i11 + 0.333f)), 0), measuredWidth2 / i11);
            iMin = AndroidUtilities.dp(76.0f);
            i10 = (measuredWidth2 - (i11 * iMin2)) / 2;
            measuredWidth2 = iMin2;
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        int i12 = 0;
        while (it2.hasNext()) {
            a aVar = (a) ((Map.Entry) it2.next()).getValue();
            boolean z13 = aVar.h;
            u2 u2Var = aVar.f48224e;
            c cVar2 = aVar.f48222b;
            ud.a aVar2 = aVar.f48223c;
            c cVar3 = aVar.f48221a;
            if (z13) {
                if (z12) {
                    measuredWidth = ((measuredWidth2 - u2Var.getMeasuredWidth()) / 2) + (getMeasuredWidth() - measuredWidth2);
                    measuredHeight = (iMin * i12) + i10;
                } else {
                    measuredWidth = ((measuredWidth2 - u2Var.getMeasuredWidth()) / 2) + (measuredWidth2 * i12) + i10;
                    measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(76.0f);
                }
                if (z11 || !((z10 || cVar3.f48504g) && aVar2.f48498f)) {
                    cVar3.c(measuredWidth);
                } else {
                    cVar3.a(measuredWidth);
                }
                if (z11 || !((z10 || cVar2.f48504g) && aVar2.f48498f)) {
                    cVar2.c(measuredHeight);
                } else {
                    cVar2.a(measuredHeight);
                }
                i12++;
            }
            aVar2.a(aVar.h, !z11 && (z10 || ((cVar = aVar2.h) != null && cVar.f48504g)));
        }
        invalidate();
    }

    public final void c(u2 u2Var, boolean z10, boolean z11) {
        a aVar = (a) this.f48228c.get(u2Var);
        if (aVar == null || aVar.h == z10) {
            return;
        }
        aVar.h = z10;
        b(z11, false);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), 1073741824);
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            getChildAt(i12).measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        }
        if (this.f48226a == size && this.f48227b == size2) {
            b(true, false);
            return;
        }
        b(false, true);
        this.f48226a = size;
        this.f48227b = size2;
    }
}
