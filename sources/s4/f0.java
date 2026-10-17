package s4;

import androidx.recyclerview.widget.RecyclerView;
public final class f0 implements Runnable {
    public final int f45977a;
    public final RecyclerView f45978b;

    public f0(RecyclerView recyclerView, int i10) {
        this.f45977a = i10;
        this.f45978b = recyclerView;
    }

    @Override
    public final void run() {
        switch (this.f45977a) {
            case 0:
                RecyclerView recyclerView = this.f45978b;
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
                RecyclerView recyclerView2 = this.f45978b;
                l0 l0Var = recyclerView2.f3609c0;
                if (l0Var != null) {
                    l0Var.m();
                }
                recyclerView2.A0 = false;
                return;
        }
    }
}
