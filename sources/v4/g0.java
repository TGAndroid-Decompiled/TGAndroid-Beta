package v4;

import androidx.recyclerview.widget.RecyclerView;
public final class g0 implements Runnable {
    public final int f59137a;
    public final RecyclerView f59138b;

    public g0(RecyclerView recyclerView, int i7) {
        this.f59137a = i7;
        this.f59138b = recyclerView;
    }

    @Override
    public final void run() {
        switch (this.f59137a) {
            case 0:
                RecyclerView recyclerView = this.f59138b;
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
                RecyclerView recyclerView2 = this.f59138b;
                m0 m0Var = recyclerView2.f2765d0;
                if (m0Var != null) {
                    m0Var.m();
                }
                recyclerView2.B0 = false;
                return;
        }
    }
}
