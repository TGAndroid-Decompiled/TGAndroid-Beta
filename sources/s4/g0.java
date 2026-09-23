package s4;

import androidx.recyclerview.widget.RecyclerView;
public final class g0 implements Runnable {
    public final int f42667a;
    public final RecyclerView f42668b;

    public g0(RecyclerView recyclerView, int i10) {
        this.f42667a = i10;
        this.f42668b = recyclerView;
    }

    @Override
    public final void run() {
        switch (this.f42667a) {
            case 0:
                RecyclerView recyclerView = this.f42668b;
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
                RecyclerView recyclerView2 = this.f42668b;
                m0 m0Var = recyclerView2.f2835c0;
                if (m0Var != null) {
                    m0Var.m();
                }
                recyclerView2.f2864z0 = false;
                return;
        }
    }
}
