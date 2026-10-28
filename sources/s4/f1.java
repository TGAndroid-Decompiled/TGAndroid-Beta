package s4;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
public final class f1 extends r0.b {
    public final RecyclerView d;
    public final a5.h e = new a5.h(this);

    public f1(RecyclerView recyclerView) {
        this.d = recyclerView;
    }

    @Override
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !this.d.Z()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                c0 c0Var = (c0) recyclerView.getLayoutManager();
                RecyclerView recyclerView2 = c0Var.f47854b;
                rf.e eVar = recyclerView2.f3056b;
                if (accessibilityEvent != null) {
                    boolean z10 = true;
                    if (!recyclerView2.canScrollVertically(1) && !c0Var.f47854b.canScrollVertically(-1) && !c0Var.f47854b.canScrollHorizontally(-1) && !c0Var.f47854b.canScrollHorizontally(1)) {
                        z10 = false;
                    }
                    accessibilityEvent.setScrollable(z10);
                    h0 h0Var = c0Var.f47854b.f3082w;
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
    public final void c(View view, s0.d dVar) {
        this.f47111a.onInitializeAccessibilityNodeInfo(view, dVar.f47688a);
        RecyclerView recyclerView = this.d;
        if (!recyclerView.Z() && recyclerView.getLayoutManager() != null) {
            p0 layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f47854b;
            layoutManager.S(recyclerView2.f3056b, recyclerView2.f3080u0, dVar);
        }
    }

    @Override
    public final boolean d(android.view.View r4, int r5, android.os.Bundle r6) {
        throw new UnsupportedOperationException("Method not decompiled: s4.f1.d(android.view.View, int, android.os.Bundle):boolean");
    }
}
