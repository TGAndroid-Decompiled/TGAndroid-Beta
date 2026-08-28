package sg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedHashMap;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ll;
import org.telegram.ui.Components.voip.u2;
import pf.o1;
import td.c;
public abstract class b extends ViewGroup {
    public int f47577a;
    public int f47578b;
    public final LinkedHashMap f47579c;

    public b(Context context) {
        super(context);
        this.f47579c = new LinkedHashMap(16);
    }

    public final void a(u2 u2Var) {
        addView(u2Var);
        this.f47579c.put(u2Var, new a(u2Var, new o1(this, 7)));
    }

    public final void b(boolean z10, boolean z11) {
        boolean z12;
        int min;
        int i9;
        boolean z13;
        c cVar;
        int measuredWidth;
        int i10;
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth2 > measuredHeight) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (measuredWidth2 > 0 && measuredHeight > 0) {
            LinkedHashMap linkedHashMap = this.f47579c;
            int i11 = 0;
            for (a aVar : linkedHashMap.values()) {
                if (aVar.h) {
                    i11++;
                }
            }
            if (i11 == 0) {
                i11 = 1;
            }
            if (!z12) {
                int min2 = Math.min(AndroidUtilities.dp(50.0f) + Math.max((int) (ll.A(50.0f, i11, measuredWidth2) / (i11 + 0.333f)), 0), measuredWidth2 / i11);
                min = AndroidUtilities.dp(76.0f);
                i9 = (measuredWidth2 - (i11 * min2)) / 2;
                measuredWidth2 = min2;
            } else {
                min = Math.min(AndroidUtilities.dp(50.0f) + Math.max((int) (ll.A(50.0f, i11, measuredHeight) / (i11 + 0.333f)), 0), measuredHeight / i11);
                i9 = (measuredHeight - (i11 * min)) / 2;
            }
            int i12 = 0;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                a aVar2 = (a) entry.getValue();
                boolean z14 = aVar2.h;
                u2 u2Var = aVar2.f47575e;
                c cVar2 = aVar2.f47573b;
                td.a aVar3 = aVar2.f47574c;
                c cVar3 = aVar2.f47572a;
                if (z14) {
                    if (!z12) {
                        measuredWidth = ((measuredWidth2 - u2Var.getMeasuredWidth()) / 2) + (measuredWidth2 * i12) + i9;
                        i10 = getMeasuredHeight() - AndroidUtilities.dp(76.0f);
                    } else {
                        measuredWidth = ((measuredWidth2 - u2Var.getMeasuredWidth()) / 2) + (getMeasuredWidth() - measuredWidth2);
                        i10 = (min * i12) + i9;
                    }
                    if (!z11 && ((z10 || cVar3.f47782g) && aVar3.f47776f)) {
                        cVar3.a(measuredWidth);
                    } else {
                        cVar3.c(measuredWidth);
                    }
                    if (!z11 && ((z10 || cVar2.f47782g) && aVar3.f47776f)) {
                        cVar2.a(i10);
                    } else {
                        cVar2.c(i10);
                    }
                    i12++;
                }
                boolean z15 = aVar2.h;
                if (!z11 && (z10 || ((cVar = aVar3.h) != null && cVar.f47782g))) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                aVar3.a(z15, z13);
            }
            invalidate();
        }
    }

    public final void c(u2 u2Var, boolean z10, boolean z11) {
        a aVar = (a) this.f47579c.get(u2Var);
        if (aVar != null && aVar.h != z10) {
            aVar.h = z10;
            b(z11, false);
        }
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            childAt.layout(0, 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(size, size2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), 1073741824);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            getChildAt(i11).measure(makeMeasureSpec, makeMeasureSpec2);
        }
        if (this.f47577a == size && this.f47578b == size2) {
            b(true, false);
            return;
        }
        b(false, true);
        this.f47577a = size;
        this.f47578b = size2;
    }
}
