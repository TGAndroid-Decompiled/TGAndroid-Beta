package s4;

import androidx.recyclerview.widget.RecyclerView;
public final class g0 implements Runnable {
    public final int f43035a;
    public final RecyclerView f43036b;

    public g0(RecyclerView recyclerView, int i10) {
        this.f43035a = i10;
        this.f43036b = recyclerView;
    }

    @Override
    public final void run() {
        switch (this.f43035a) {
            case 0:
                RecyclerView recyclerView = this.f43036b;
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
                RecyclerView recyclerView2 = this.f43036b;
                m0 m0Var = recyclerView2.f2842c0;
                if (m0Var != null) {
                    m0Var.m();
                }
                recyclerView2.f2871z0 = false;
                return;
        }
    }
}
