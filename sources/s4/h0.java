package s4;

import androidx.recyclerview.widget.RecyclerView;
public final class h0 implements Runnable {
    public final int f47936a;
    public final RecyclerView f47937b;

    public h0(RecyclerView recyclerView, int i10) {
        this.f47936a = i10;
        this.f47937b = recyclerView;
    }

    @Override
    public final void run() {
        switch (this.f47936a) {
            case 0:
                RecyclerView recyclerView = this.f47937b;
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
                RecyclerView recyclerView2 = this.f47937b;
                n0 n0Var = recyclerView2.f3141c0;
                if (n0Var != null) {
                    n0Var.m();
                }
                recyclerView2.A0 = false;
                return;
        }
    }
}
