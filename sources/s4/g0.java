package s4;

import androidx.recyclerview.widget.RecyclerView;
public final class g0 implements Runnable {
    public final int f46569a;
    public final RecyclerView f46570b;

    public g0(RecyclerView recyclerView, int i10) {
        this.f46569a = i10;
        this.f46570b = recyclerView;
    }

    @Override
    public final void run() {
        switch (this.f46569a) {
            case 0:
                RecyclerView recyclerView = this.f46570b;
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
                RecyclerView recyclerView2 = this.f46570b;
                m0 m0Var = recyclerView2.f3064c0;
                if (m0Var != null) {
                    m0Var.m();
                }
                recyclerView2.f3094z0 = false;
                return;
        }
    }
}
