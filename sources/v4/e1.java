package v4;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
public final class e1 extends r0.b {
    public final RecyclerView d;
    public final c5.f f56973e = new c5.f(this);

    public e1(RecyclerView recyclerView) {
        this.d = recyclerView;
    }

    @Override
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !e()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                b0 b0Var = (b0) recyclerView.getLayoutManager();
                RecyclerView recyclerView2 = b0Var.f57040b;
                v0 v0Var = recyclerView2.f2842b;
                if (accessibilityEvent != null) {
                    boolean z9 = true;
                    if (!recyclerView2.canScrollVertically(1) && !b0Var.f57040b.canScrollVertically(-1) && !b0Var.f57040b.canScrollHorizontally(-1) && !b0Var.f57040b.canScrollHorizontally(1)) {
                        z9 = false;
                    }
                    accessibilityEvent.setScrollable(z9);
                    g0 g0Var = b0Var.f57040b.f2871x;
                    if (g0Var != null) {
                        accessibilityEvent.setItemCount(g0Var.b());
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
    public final void c(View view, s0.d dVar) {
        this.f54069a.onInitializeAccessibilityNodeInfo(view, dVar.f54509a);
        if (!e()) {
            RecyclerView recyclerView = this.d;
            if (recyclerView.getLayoutManager() != null) {
                n0 layoutManager = recyclerView.getLayoutManager();
                RecyclerView recyclerView2 = layoutManager.f57040b;
                layoutManager.S(recyclerView2.f2842b, recyclerView2.f2867u0, dVar);
            }
        }
    }

    @Override
    public final boolean d(android.view.View r4, int r5, android.os.Bundle r6) {
        throw new UnsupportedOperationException("Method not decompiled: v4.e1.d(android.view.View, int, android.os.Bundle):boolean");
    }

    public final boolean e() {
        RecyclerView recyclerView = this.d;
        if (!recyclerView.Z() && !recyclerView.f2867u0.f56911g) {
            return false;
        }
        return true;
    }
}
