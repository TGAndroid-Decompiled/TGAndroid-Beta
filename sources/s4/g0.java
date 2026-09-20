package s4;

import androidx.recyclerview.widget.RecyclerView;
public final class g0 implements Runnable {
    public final int f43014a;
    public final RecyclerView f43015b;

    public g0(RecyclerView recyclerView, int i10) {
        this.f43014a = i10;
        this.f43015b = recyclerView;
    }

    @Override
    public final void run() {
        switch (this.f43014a) {
            case 0:
                RecyclerView recyclerView = this.f43015b;
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
                RecyclerView recyclerView2 = this.f43015b;
                m0 m0Var = recyclerView2.f2843c0;
                if (m0Var != null) {
                    m0Var.m();
                }
                recyclerView2.f2872z0 = false;
                return;
        }
    }
}
