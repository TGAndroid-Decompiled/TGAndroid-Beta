package v4;

import androidx.recyclerview.widget.RecyclerView;
public final class h0 implements Runnable {
    public final int f59150a;
    public final RecyclerView f59151b;

    public h0(RecyclerView recyclerView, int i7) {
        this.f59150a = i7;
        this.f59151b = recyclerView;
    }

    @Override
    public final void run() {
        switch (this.f59150a) {
            case 0:
                RecyclerView recyclerView = this.f59151b;
                if (recyclerView.J && !recyclerView.isLayoutRequested()) {
                    if (!recyclerView.H) {
                        recyclerView.requestLayout();
                        return;
                    } else if (recyclerView.M) {
                        recyclerView.L = true;
                        return;
                    } else {
                        recyclerView.p();
                        return;
                    }
                }
                return;
            default:
                RecyclerView recyclerView2 = this.f59151b;
                n0 n0Var = recyclerView2.f2795d0;
                if (n0Var != null) {
                    n0Var.m();
                }
                recyclerView2.B0 = false;
                return;
        }
    }
}
