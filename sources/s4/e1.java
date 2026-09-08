package s4;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
public final class e1 extends r0.b {
    public final RecyclerView d;
    public final d1 f45800e = new d1(this);

    public e1(RecyclerView recyclerView) {
        this.d = recyclerView;
    }

    @Override
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !this.d.Z()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                c0 c0Var = (c0) recyclerView.getLayoutManager();
                RecyclerView recyclerView2 = c0Var.f45870b;
                pf.e eVar = recyclerView2.f1894b;
                if (accessibilityEvent != null) {
                    boolean z10 = true;
                    if (!recyclerView2.canScrollVertically(1) && !c0Var.f45870b.canScrollVertically(-1) && !c0Var.f45870b.canScrollHorizontally(-1) && !c0Var.f45870b.canScrollHorizontally(1)) {
                        z10 = false;
                    }
                    accessibilityEvent.setScrollable(z10);
                    h0 h0Var = c0Var.f45870b.f1921w;
                    if (h0Var != null) {
                        accessibilityEvent.setItemCount(h0Var.h());
                    }
                }
                if (c0Var.r() > 0) {
                    accessibilityEvent.setFromIndex(c0Var.L0());
                    accessibilityEvent.setToIndex(c0Var.N0());
                }
            }
        }
    }

    @Override
    public final void c(View view, s0.c cVar) {
        this.f44690a.onInitializeAccessibilityNodeInfo(view, cVar.f45713a);
        RecyclerView recyclerView = this.d;
        if (!recyclerView.Z() && recyclerView.getLayoutManager() != null) {
            o0 layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f45870b;
            layoutManager.S(recyclerView2.f1894b, recyclerView2.f1918t0, cVar);
        }
    }

    @Override
    public final boolean d(android.view.View r4, int r5, android.os.Bundle r6) {
        throw new UnsupportedOperationException("Method not decompiled: s4.e1.d(android.view.View, int, android.os.Bundle):boolean");
    }
}
