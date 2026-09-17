package s4;

import androidx.recyclerview.widget.RecyclerView;
public final class g0 implements Runnable {
    public final int f45784a;
    public final RecyclerView f45785b;

    public g0(RecyclerView recyclerView, int i10) {
        this.f45784a = i10;
        this.f45785b = recyclerView;
    }

    @Override
    public final void run() {
        switch (this.f45784a) {
            case 0:
                RecyclerView recyclerView = this.f45785b;
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
                RecyclerView recyclerView2 = this.f45785b;
                m0 m0Var = recyclerView2.f1870c0;
                if (m0Var != null) {
                    m0Var.m();
                }
                recyclerView2.f1900z0 = false;
                return;
        }
    }
}
