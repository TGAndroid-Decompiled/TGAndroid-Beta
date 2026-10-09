package s4;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
public final class f1 extends r0.b {
    public final RecyclerView d;
    public final e1 f47693e = new e1(this);

    public f1(RecyclerView recyclerView) {
        this.d = recyclerView;
    }

    @Override
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !this.d.Z()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                d0 d0Var = (d0) recyclerView.getLayoutManager();
                RecyclerView recyclerView2 = d0Var.f47764b;
                pf.e eVar = recyclerView2.f3140b;
                if (accessibilityEvent != null) {
                    boolean z10 = true;
                    if (!recyclerView2.canScrollVertically(1) && !d0Var.f47764b.canScrollVertically(-1) && !d0Var.f47764b.canScrollHorizontally(-1) && !d0Var.f47764b.canScrollHorizontally(1)) {
                        z10 = false;
                    }
                    accessibilityEvent.setScrollable(z10);
                    i0 i0Var = d0Var.f47764b.f3167w;
                    if (i0Var != null) {
                        accessibilityEvent.setItemCount(i0Var.h());
                    }
                }
                if (d0Var.r() > 0) {
                    accessibilityEvent.setFromIndex(d0Var.L0());
                    accessibilityEvent.setToIndex(d0Var.N0());
                }
            }
        }
    }

    @Override
    public final void c(View view, s0.d dVar) {
        this.f46731a.onInitializeAccessibilityNodeInfo(view, dVar.f47587a);
        RecyclerView recyclerView = this.d;
        if (!recyclerView.Z() && recyclerView.getLayoutManager() != null) {
            p0 layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f47764b;
            layoutManager.S(recyclerView2.f3140b, recyclerView2.f3165u0, dVar);
        }
    }

    @Override
    public final boolean d(android.view.View r4, int r5, android.os.Bundle r6) {
        throw new UnsupportedOperationException("Method not decompiled: s4.f1.d(android.view.View, int, android.os.Bundle):boolean");
    }
}
