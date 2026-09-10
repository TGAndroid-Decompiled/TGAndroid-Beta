package s4;

import androidx.recyclerview.widget.RecyclerView;
public final class g0 implements Runnable {
    public final int f41650a;
    public final RecyclerView f41651b;

    public g0(RecyclerView recyclerView, int i10) {
        this.f41650a = i10;
        this.f41651b = recyclerView;
    }

    @Override
    public final void run() {
        switch (this.f41650a) {
            case 0:
                RecyclerView recyclerView = this.f41651b;
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
                RecyclerView recyclerView2 = this.f41651b;
                m0 m0Var = recyclerView2.f1535c0;
                if (m0Var != null) {
                    m0Var.m();
                }
                recyclerView2.f1564z0 = false;
                return;
        }
    }
}
