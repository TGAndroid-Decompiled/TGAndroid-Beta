package xg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.LinkedHashMap;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.voip.v2;
public abstract class c extends ViewGroup {
    public int f46979a;
    public int f46980b;
    public final LinkedHashMap f46981c;

    public c(Context context) {
        super(context);
        this.f46981c = new LinkedHashMap(16);
    }

    public final void a(v2 v2Var) {
        addView(v2Var);
        this.f46981c.put(v2Var, new b(v2Var, new a(this, 0)));
    }

    public final void b(boolean z4, boolean z10) {
        boolean z11;
        int min;
        int i10;
        boolean z12;
        xd.c cVar;
        int measuredWidth;
        int i11;
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth2 > measuredHeight) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (measuredWidth2 > 0 && measuredHeight > 0) {
            LinkedHashMap linkedHashMap = this.f46981c;
            int i12 = 0;
            for (b bVar : linkedHashMap.values()) {
                if (bVar.h) {
                    i12++;
                }
            }
            if (i12 == 0) {
                i12 = 1;
            }
            if (!z11) {
                int min2 = Math.min(AndroidUtilities.dp(50.0f) + Math.max((int) (org.telegram.ui.b.z(50.0f, i12, measuredWidth2) / (i12 + 0.333f)), 0), measuredWidth2 / i12);
                min = AndroidUtilities.dp(76.0f);
                i10 = (measuredWidth2 - (i12 * min2)) / 2;
                measuredWidth2 = min2;
            } else {
                min = Math.min(AndroidUtilities.dp(50.0f) + Math.max((int) (org.telegram.ui.b.z(50.0f, i12, measuredHeight) / (i12 + 0.333f)), 0), measuredHeight / i12);
                i10 = (measuredHeight - (i12 * min)) / 2;
            }
            int i13 = 0;
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                b bVar2 = (b) entry.getValue();
                boolean z13 = bVar2.h;
                v2 v2Var = bVar2.e;
                xd.c cVar2 = bVar2.f46976b;
                xd.a aVar = bVar2.f46977c;
                xd.c cVar3 = bVar2.f46975a;
                if (z13) {
                    if (!z11) {
                        measuredWidth = ((measuredWidth2 - v2Var.getMeasuredWidth()) / 2) + (measuredWidth2 * i13) + i10;
                        i11 = getMeasuredHeight() - AndroidUtilities.dp(76.0f);
                    } else {
                        measuredWidth = ((measuredWidth2 - v2Var.getMeasuredWidth()) / 2) + (getMeasuredWidth() - measuredWidth2);
                        i11 = (min * i13) + i10;
                    }
                    if (!z10 && ((z4 || cVar3.f46898g) && aVar.f46893f)) {
                        cVar3.a(measuredWidth);
                    } else {
                        cVar3.c(measuredWidth);
                    }
                    if (!z10 && ((z4 || cVar2.f46898g) && aVar.f46893f)) {
                        cVar2.a(i11);
                    } else {
                        cVar2.c(i11);
                    }
                    i13++;
                }
                boolean z14 = bVar2.h;
                if (!z10 && (z4 || ((cVar = aVar.h) != null && cVar.f46898g))) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                aVar.a(z14, z12);
            }
            invalidate();
        }
    }

    public final void c(v2 v2Var, boolean z4, boolean z10) {
        b bVar = (b) this.f46981c.get(v2Var);
        if (bVar != null && bVar.h != z4) {
            bVar.h = z4;
            b(z10, false);
        }
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
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
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(76.0f), 1073741824);
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            getChildAt(i12).measure(makeMeasureSpec, makeMeasureSpec2);
        }
        if (this.f46979a == size && this.f46980b == size2) {
            b(true, false);
            return;
        }
        b(false, true);
        this.f46979a = size;
        this.f46980b = size2;
    }
}
