package s4;

import androidx.recyclerview.widget.RecyclerView;
public final class g0 implements Runnable {
    public final int f42986a;
    public final RecyclerView f42987b;

    public g0(RecyclerView recyclerView, int i10) {
        this.f42986a = i10;
        this.f42987b = recyclerView;
    }

    @Override
    public final void run() {
        switch (this.f42986a) {
            case 0:
                RecyclerView recyclerView = this.f42987b;
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
                RecyclerView recyclerView2 = this.f42987b;
                m0 m0Var = recyclerView2.f2835c0;
                if (m0Var != null) {
                    m0Var.m();
                }
                recyclerView2.f2864z0 = false;
                return;
        }
    }
}
