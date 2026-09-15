package s4;

import androidx.recyclerview.widget.RecyclerView;
public final class g0 implements Runnable {
    public final int f42715a;
    public final RecyclerView f42716b;

    public g0(RecyclerView recyclerView, int i10) {
        this.f42715a = i10;
        this.f42716b = recyclerView;
    }

    @Override
    public final void run() {
        switch (this.f42715a) {
            case 0:
                RecyclerView recyclerView = this.f42716b;
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
                RecyclerView recyclerView2 = this.f42716b;
                m0 m0Var = recyclerView2.f2838c0;
                if (m0Var != null) {
                    m0Var.m();
                }
                recyclerView2.f2867z0 = false;
                return;
        }
    }
}
