package s4;

import androidx.recyclerview.widget.RecyclerView;
public final class g0 implements Runnable {
    public final int f42711a;
    public final RecyclerView f42712b;

    public g0(RecyclerView recyclerView, int i10) {
        this.f42711a = i10;
        this.f42712b = recyclerView;
    }

    @Override
    public final void run() {
        switch (this.f42711a) {
            case 0:
                RecyclerView recyclerView = this.f42712b;
                if (recyclerView.I && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.G) {
                        recyclerView.requestLayout();
                        return;
                    } else if (recyclerView.L) {
                        recyclerView.K = true;
                        return;
                    } else {
                        recyclerView.p();
                        return;
                    }
                }
                return;
            default:
                RecyclerView recyclerView2 = this.f42712b;
                m0 m0Var = recyclerView2.f2840c0;
                if (m0Var != null) {
                    m0Var.m();
                }
                recyclerView2.f2869z0 = false;
                return;
        }
    }
}
