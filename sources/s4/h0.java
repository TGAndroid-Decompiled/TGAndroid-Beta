package s4;

import androidx.recyclerview.widget.RecyclerView;
public final class h0 implements Runnable {
    public final int f47829a;
    public final RecyclerView f47830b;

    public h0(RecyclerView recyclerView, int i10) {
        this.f47829a = i10;
        this.f47830b = recyclerView;
    }

    @Override
    public final void run() {
        switch (this.f47829a) {
            case 0:
                RecyclerView recyclerView = this.f47830b;
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
                RecyclerView recyclerView2 = this.f47830b;
                n0 n0Var = recyclerView2.f3143c0;
                if (n0Var != null) {
                    n0Var.m();
                }
                recyclerView2.A0 = false;
                return;
        }
    }
}
