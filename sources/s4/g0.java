package s4;

import androidx.recyclerview.widget.RecyclerView;
public final class g0 implements Runnable {
    public final int f43001a;
    public final RecyclerView f43002b;

    public g0(RecyclerView recyclerView, int i10) {
        this.f43001a = i10;
        this.f43002b = recyclerView;
    }

    @Override
    public final void run() {
        switch (this.f43001a) {
            case 0:
                RecyclerView recyclerView = this.f43002b;
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
                RecyclerView recyclerView2 = this.f43002b;
                m0 m0Var = recyclerView2.f2835c0;
                if (m0Var != null) {
                    m0Var.m();
                }
                recyclerView2.f2864z0 = false;
                return;
        }
    }
}
