package u4;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
public final class e1 extends r0.b {
    public final RecyclerView d;
    public final b5.g f55561e = new b5.g(this);

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
                RecyclerView recyclerView2 = b0Var.f55630b;
                tf.e eVar = recyclerView2.f2274b;
                if (accessibilityEvent != null) {
                    boolean z10 = true;
                    if (!recyclerView2.canScrollVertically(1) && !b0Var.f55630b.canScrollVertically(-1) && !b0Var.f55630b.canScrollHorizontally(-1) && !b0Var.f55630b.canScrollHorizontally(1)) {
                        z10 = false;
                    }
                    accessibilityEvent.setScrollable(z10);
                    h0 h0Var = b0Var.f55630b.f2303x;
                    if (h0Var != null) {
                        accessibilityEvent.setItemCount(h0Var.b());
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
        this.f53986a.onInitializeAccessibilityNodeInfo(view, dVar.f54570a);
        if (!e()) {
            RecyclerView recyclerView = this.d;
            if (recyclerView.getLayoutManager() != null) {
                o0 layoutManager = recyclerView.getLayoutManager();
                RecyclerView recyclerView2 = layoutManager.f55630b;
                layoutManager.S(recyclerView2.f2274b, recyclerView2.f2300v0, dVar);
            }
        }
    }

    @Override
    public final boolean d(android.view.View r4, int r5, android.os.Bundle r6) {
        throw new UnsupportedOperationException("Method not decompiled: u4.e1.d(android.view.View, int, android.os.Bundle):boolean");
    }

    public final boolean e() {
        RecyclerView recyclerView = this.d;
        if (!recyclerView.Z() && !recyclerView.f2300v0.f55495g) {
            return false;
        }
        return true;
    }
}
