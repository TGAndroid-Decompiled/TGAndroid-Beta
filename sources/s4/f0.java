package s4;

import androidx.recyclerview.widget.RecyclerView;
public final class f0 implements Runnable {
    public final int f45956a;
    public final RecyclerView f45957b;

    public f0(RecyclerView recyclerView, int i10) {
        this.f45956a = i10;
        this.f45957b = recyclerView;
    }

    @Override
    public final void run() {
        switch (this.f45956a) {
            case 0:
                RecyclerView recyclerView = this.f45957b;
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
                RecyclerView recyclerView2 = this.f45957b;
                l0 l0Var = recyclerView2.f3606c0;
                if (l0Var != null) {
                    l0Var.m();
                }
                recyclerView2.A0 = false;
                return;
        }
    }
}
