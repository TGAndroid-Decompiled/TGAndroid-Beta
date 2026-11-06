package v4;

import androidx.recyclerview.widget.RecyclerView;
public final class f0 implements Runnable {
    public final int f56976a;
    public final RecyclerView f56977b;

    public f0(RecyclerView recyclerView, int i7) {
        this.f56976a = i7;
        this.f56977b = recyclerView;
    }

    @Override
    public final void run() {
        switch (this.f56976a) {
            case 0:
                RecyclerView recyclerView = this.f56977b;
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
                RecyclerView recyclerView2 = this.f56977b;
                l0 l0Var = recyclerView2.f2845c0;
                if (l0Var != null) {
                    l0Var.m();
                }
                recyclerView2.A0 = false;
                return;
        }
    }
}
