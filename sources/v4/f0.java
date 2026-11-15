package v4;

import androidx.recyclerview.widget.RecyclerView;
public final class f0 implements Runnable {
    public final int f58556a;
    public final RecyclerView f58557b;

    public f0(RecyclerView recyclerView, int i7) {
        this.f58556a = i7;
        this.f58557b = recyclerView;
    }

    @Override
    public final void run() {
        switch (this.f58556a) {
            case 0:
                RecyclerView recyclerView = this.f58557b;
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
                RecyclerView recyclerView2 = this.f58557b;
                m0 m0Var = recyclerView2.f2803d0;
                if (m0Var != null) {
                    m0Var.m();
                }
                recyclerView2.B0 = false;
                return;
        }
    }
}
