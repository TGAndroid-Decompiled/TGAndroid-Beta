package s4;

import androidx.recyclerview.widget.RecyclerView;
public final class f0 implements Runnable {
    public final int f44877a;
    public final RecyclerView f44878b;

    public f0(RecyclerView recyclerView, int i10) {
        this.f44877a = i10;
        this.f44878b = recyclerView;
    }

    @Override
    public final void run() {
        switch (this.f44877a) {
            case 0:
                RecyclerView recyclerView = this.f44878b;
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
                RecyclerView recyclerView2 = this.f44878b;
                l0 l0Var = recyclerView2.f1996c0;
                if (l0Var != null) {
                    l0Var.m();
                }
                recyclerView2.A0 = false;
                return;
        }
    }
}
