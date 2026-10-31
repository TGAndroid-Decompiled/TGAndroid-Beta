package s4;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
public final class e1 extends r0.b {
    public final RecyclerView d;
    public final d1 e = new d1(this);

    public e1(RecyclerView recyclerView) {
        this.d = recyclerView;
    }

    @Override
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !this.d.Z()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                a0 a0Var = (a0) recyclerView.getLayoutManager();
                RecyclerView recyclerView2 = a0Var.f47979b;
                hf.e eVar = recyclerView2.f1894b;
                if (accessibilityEvent != null) {
                    boolean z10 = true;
                    if (!recyclerView2.canScrollVertically(1) && !a0Var.f47979b.canScrollVertically(-1) && !a0Var.f47979b.canScrollHorizontally(-1) && !a0Var.f47979b.canScrollHorizontally(1)) {
                        z10 = false;
                    }
                    accessibilityEvent.setScrollable(z10);
                    g0 g0Var = a0Var.f47979b.f1922x;
                    if (g0Var != null) {
                        accessibilityEvent.setItemCount(g0Var.b());
                    }
                }
                if (a0Var.r() > 0) {
                    accessibilityEvent.setFromIndex(a0Var.L0());
                    accessibilityEvent.setToIndex(a0Var.N0());
                }
            }
        }
    }

    @Override
    public final void c(View view, s0.c cVar) {
        this.f46104a.onInitializeAccessibilityNodeInfo(view, cVar.f47850a);
        RecyclerView recyclerView = this.d;
        if (!recyclerView.Z() && recyclerView.getLayoutManager() != null) {
            n0 layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f47979b;
            layoutManager.S(recyclerView2.f1894b, recyclerView2.f1918u0, cVar);
        }
    }

    @Override
    public final boolean d(android.view.View r4, int r5, android.os.Bundle r6) {
        throw new UnsupportedOperationException("Method not decompiled: s4.e1.d(android.view.View, int, android.os.Bundle):boolean");
    }
}
