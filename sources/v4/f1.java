package v4;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
public final class f1 extends r0.b {
    public final RecyclerView d;
    public final c5.g f58558e = new c5.g(this);

    public f1(RecyclerView recyclerView) {
        this.d = recyclerView;
    }

    @Override
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !e()) {
            RecyclerView recyclerView = (RecyclerView) view;
            if (recyclerView.getLayoutManager() != null) {
                b0 b0Var = (b0) recyclerView.getLayoutManager();
                RecyclerView recyclerView2 = b0Var.f58622b;
                w0 w0Var = recyclerView2.f2799b;
                if (accessibilityEvent != null) {
                    boolean z10 = true;
                    if (!recyclerView2.canScrollVertically(1) && !b0Var.f58622b.canScrollVertically(-1) && !b0Var.f58622b.canScrollHorizontally(-1) && !b0Var.f58622b.canScrollHorizontally(1)) {
                        z10 = false;
                    }
                    accessibilityEvent.setScrollable(z10);
                    h0 h0Var = b0Var.f58622b.f2828x;
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
    public final void c(View view, s0.c cVar) {
        this.f55642a.onInitializeAccessibilityNodeInfo(view, cVar.f56166a);
        if (!e()) {
            RecyclerView recyclerView = this.d;
            if (recyclerView.getLayoutManager() != null) {
                o0 layoutManager = recyclerView.getLayoutManager();
                RecyclerView recyclerView2 = layoutManager.f58622b;
                layoutManager.S(recyclerView2.f2799b, recyclerView2.f2825v0, cVar);
            }
        }
    }

    @Override
    public final boolean d(android.view.View r4, int r5, android.os.Bundle r6) {
        throw new UnsupportedOperationException("Method not decompiled: v4.f1.d(android.view.View, int, android.os.Bundle):boolean");
    }

    public final boolean e() {
        RecyclerView recyclerView = this.d;
        if (!recyclerView.Z() && !recyclerView.f2825v0.f58505g) {
            return false;
        }
        return true;
    }
}
