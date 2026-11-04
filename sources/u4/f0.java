package u4;

import androidx.recyclerview.widget.RecyclerView;
public final class f0 implements Runnable {
    public final int f55565a;
    public final RecyclerView f55566b;

    public f0(RecyclerView recyclerView, int i3) {
        this.f55565a = i3;
        this.f55566b = recyclerView;
    }

    @Override
    public final void run() {
        switch (this.f55565a) {
            case 0:
                RecyclerView recyclerView = this.f55566b;
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
                RecyclerView recyclerView2 = this.f55566b;
                m0 m0Var = recyclerView2.f2278d0;
                if (m0Var != null) {
                    m0Var.m();
                }
                recyclerView2.B0 = false;
                return;
        }
    }
}
