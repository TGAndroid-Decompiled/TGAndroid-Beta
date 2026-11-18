package v4;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
public final class g1 extends r0.b {
    public final RecyclerView d;
    public final c5.g f59144e = new c5.g(this);

    public g1(RecyclerView recyclerView) {
        this.d = recyclerView;
    }

    @Override
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !e()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                c0 c0Var = (c0) recyclerView.getLayoutManager();
                RecyclerView recyclerView2 = c0Var.f59207b;
                x0 x0Var = recyclerView2.f2790b;
                if (accessibilityEvent != null) {
                    boolean z10 = true;
                    if (!recyclerView2.canScrollVertically(1) && !c0Var.f59207b.canScrollVertically(-1) && !c0Var.f59207b.canScrollHorizontally(-1) && !c0Var.f59207b.canScrollHorizontally(1)) {
                        z10 = false;
                    }
                    accessibilityEvent.setScrollable(z10);
                    i0 i0Var = c0Var.f59207b.f2819x;
                    if (i0Var != null) {
                        accessibilityEvent.setItemCount(i0Var.b());
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
        this.f56216a.onInitializeAccessibilityNodeInfo(view, cVar.f56740a);
        if (!e()) {
            RecyclerView recyclerView = this.d;
            if (recyclerView.getLayoutManager() != null) {
                p0 layoutManager = recyclerView.getLayoutManager();
                RecyclerView recyclerView2 = layoutManager.f59207b;
                layoutManager.S(recyclerView2.f2790b, recyclerView2.f2816v0, cVar);
            }
        }
    }

    @Override
    public final boolean d(android.view.View r4, int r5, android.os.Bundle r6) {
        throw new UnsupportedOperationException("Method not decompiled: v4.g1.d(android.view.View, int, android.os.Bundle):boolean");
    }

    public final boolean e() {
        RecyclerView recyclerView = this.d;
        if (!recyclerView.Z() && !recyclerView.f2816v0.f59090g) {
            return false;
        }
        return true;
    }
}
