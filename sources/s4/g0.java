package s4;

import androidx.recyclerview.widget.RecyclerView;
public final class g0 implements Runnable {
    public final int f42742a;
    public final RecyclerView f42743b;

    public g0(RecyclerView recyclerView, int i10) {
        this.f42742a = i10;
        this.f42743b = recyclerView;
    }

    @Override
    public final void run() {
        switch (this.f42742a) {
            case 0:
                RecyclerView recyclerView = this.f42743b;
                if (recyclerView.I && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.G) {
                        recyclerView.requestLayout();
                        return;
                    } else if (recyclerView.L) {
                        recyclerView.K = true;
                        return;
                    } else {
                        recyclerView.q();
                        return;
                    }
                }
                return;
            default:
                RecyclerView recyclerView2 = this.f42743b;
                m0 m0Var = recyclerView2.f2843c0;
                if (m0Var != null) {
                    m0Var.m();
                }
                recyclerView2.f2872z0 = false;
                return;
        }
    }
}
