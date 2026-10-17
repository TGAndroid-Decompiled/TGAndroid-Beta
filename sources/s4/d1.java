package s4;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
public final class d1 extends r0.b {
    public final RecyclerView d;
    public final c1 e = new c1(this);

    public d1(RecyclerView recyclerView) {
        this.d = recyclerView;
    }

    @Override
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !this.d.Z()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                b0 b0Var = (b0) recyclerView.getLayoutManager();
                RecyclerView recyclerView2 = b0Var.f46031b;
                qf.e eVar = recyclerView2.f3606b;
                if (accessibilityEvent != null) {
                    boolean z10 = true;
                    if (!recyclerView2.canScrollVertically(1) && !b0Var.f46031b.canScrollVertically(-1) && !b0Var.f46031b.canScrollHorizontally(-1) && !b0Var.f46031b.canScrollHorizontally(1)) {
                        z10 = false;
                    }
                    accessibilityEvent.setScrollable(z10);
                    g0 g0Var = b0Var.f46031b.f3632w;
                    if (g0Var != null) {
                        accessibilityEvent.setItemCount(g0Var.h());
                    }
                }
                if (b0Var.r() > 0) {
                    accessibilityEvent.setFromIndex(b0Var.L0());
                    accessibilityEvent.setToIndex(b0Var.N0());
                }
            }
        }
    }

    @Override
    public final void c(View view, s0.c cVar) {
        this.f44812a.onInitializeAccessibilityNodeInfo(view, cVar.f45895a);
        RecyclerView recyclerView = this.d;
        if (!recyclerView.Z() && recyclerView.getLayoutManager() != null) {
            n0 layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f46031b;
            layoutManager.S(recyclerView2.f3606b, recyclerView2.f3630u0, cVar);
        }
    }

    @Override
    public final boolean d(android.view.View r4, int r5, android.os.Bundle r6) {
        throw new UnsupportedOperationException("Method not decompiled: s4.d1.d(android.view.View, int, android.os.Bundle):boolean");
    }
}
