package org.telegram.ui;
public final class y21 implements Runnable {
    public final int f53391a;
    public final k31 f53392b;

    public y21(k31 k31Var, int i7) {
        this.f53391a = i7;
        this.f53392b = k31Var;
    }

    @Override
    public final void run() {
        int i7 = this.f53391a;
        k31 k31Var = this.f53392b;
        switch (i7) {
            case 0:
                org.telegram.messenger.np.s1(k31Var.currentAccount).l0(null);
                return;
            case 1:
                vf.c.t(k31Var.getParentActivity(), org.telegram.messenger.hd.M0(2131752154, null));
                return;
            default:
                k31Var.f48519c.f39892g3.O(true);
                return;
        }
    }
}
