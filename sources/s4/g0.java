package s4;

import androidx.recyclerview.widget.RecyclerView;
public final class g0 implements Runnable {
    public final int f43045a;
    public final RecyclerView f43046b;

    public g0(RecyclerView recyclerView, int i10) {
        this.f43045a = i10;
        this.f43046b = recyclerView;
    }

    @Override
    public final void run() {
        switch (this.f43045a) {
            case 0:
                RecyclerView recyclerView = this.f43046b;
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
                RecyclerView recyclerView2 = this.f43046b;
                m0 m0Var = recyclerView2.f2837c0;
                if (m0Var != null) {
                    m0Var.m();
                }
                recyclerView2.f2866z0 = false;
                return;
        }
    }
}
