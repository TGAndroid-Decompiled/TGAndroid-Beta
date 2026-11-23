package v4;

import androidx.recyclerview.widget.RecyclerView;
public final class g0 implements Runnable {
    public final int f59266a;
    public final RecyclerView f59267b;

    public g0(RecyclerView recyclerView, int i7) {
        this.f59266a = i7;
        this.f59267b = recyclerView;
    }

    @Override
    public final void run() {
        switch (this.f59266a) {
            case 0:
                RecyclerView recyclerView = this.f59267b;
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
                RecyclerView recyclerView2 = this.f59267b;
                n0 n0Var = recyclerView2.f2766d0;
                if (n0Var != null) {
                    n0Var.m();
                }
                recyclerView2.B0 = false;
                return;
        }
    }
}
