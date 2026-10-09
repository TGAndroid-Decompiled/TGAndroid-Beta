package s4;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
public final class e1 extends r0.b {
    public final int d = 0;
    public final Object f47688e;

    public e1(f1 f1Var) {
        this.f47688e = f1Var;
    }

    @Override
    public void b(android.view.View r3, android.view.accessibility.AccessibilityEvent r4) {
        throw new UnsupportedOperationException("Method not decompiled: s4.e1.b(android.view.View, android.view.accessibility.AccessibilityEvent):void");
    }

    @Override
    public final void c(View view, s0.d dVar) {
        boolean z10;
        switch (this.d) {
            case 0:
                this.f46731a.onInitializeAccessibilityNodeInfo(view, dVar.f47587a);
                f1 f1Var = (f1) this.f47688e;
                RecyclerView recyclerView = f1Var.d;
                RecyclerView recyclerView2 = f1Var.d;
                if (!recyclerView.Z() && recyclerView2.getLayoutManager() != null) {
                    recyclerView2.getLayoutManager().T(view, dVar);
                    return;
                }
                return;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo = dVar.f47587a;
                this.f46731a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                dVar.i(z4.g.class.getName());
                z4.g gVar = (z4.g) this.f47688e;
                z4.a aVar = gVar.f53542e;
                if (aVar != null && aVar.b() > 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                accessibilityNodeInfo.setScrollable(z10);
                if (gVar.canScrollHorizontally(1)) {
                    dVar.a(4096);
                }
                if (gVar.canScrollHorizontally(-1)) {
                    dVar.a(8192);
                    return;
                }
                return;
        }
    }

    @Override
    public final boolean d(View view, int i10, Bundle bundle) {
        switch (this.d) {
            case 0:
                f1 f1Var = (f1) this.f47688e;
                if (super.d(view, i10, bundle)) {
                    return true;
                }
                RecyclerView recyclerView = f1Var.d;
                RecyclerView recyclerView2 = f1Var.d;
                if (!recyclerView.Z() && recyclerView2.getLayoutManager() != null) {
                    pf.e eVar = recyclerView2.getLayoutManager().f47764b.f3140b;
                }
                return false;
            default:
                z4.g gVar = (z4.g) this.f47688e;
                if (super.d(view, i10, bundle)) {
                    return true;
                }
                if (i10 != 4096) {
                    if (i10 == 8192 && gVar.canScrollHorizontally(-1)) {
                        gVar.setCurrentItem(gVar.f53544f - 1);
                        return true;
                    }
                } else if (gVar.canScrollHorizontally(1)) {
                    gVar.setCurrentItem(gVar.f53544f + 1);
                    return true;
                }
                return false;
        }
    }

    public e1(z4.g gVar) {
        this.f47688e = gVar;
    }
}
