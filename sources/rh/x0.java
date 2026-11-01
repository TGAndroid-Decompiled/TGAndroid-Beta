package rh;
public final class x0 implements Runnable {
    public final int f47684a;
    public final e4 f47685b;
    public final long f47686c;

    public x0(e4 e4Var, long j10, int i10) {
        this.f47684a = i10;
        this.f47685b = e4Var;
        this.f47686c = j10;
    }

    @Override
    public final void run() {
        int i10 = this.f47684a;
        long j10 = this.f47686c;
        e4 e4Var = this.f47685b;
        switch (i10) {
            case 0:
                e4Var.U1(j10);
                return;
            case 1:
                e4Var.U1(j10);
                return;
            case 2:
                w0 w0Var = e4Var.f46836m3;
                e4Var.s2(1, true, null);
                if (j10 > 0) {
                    org.telegram.messenger.i0.r(w0Var);
                    org.telegram.messenger.i0.g3(w0Var);
                    return;
                }
                return;
            case 3:
                e4Var.U1(j10);
                return;
            case 4:
                e4Var.U1(j10);
                return;
            case 5:
                new ph.l1(e4Var.getContext(), e4Var.f21584a, this.f47686c, null, new w1(e4Var, 1)).show();
                return;
            case 6:
                x7 x7Var = new x7(e4Var.getContext(), e4Var.I0, this.f47686c, 10, null, new n(9, e4Var, new boolean[]{false}), 0L);
                x7Var.setOnDismissListener(new b2(e4Var, 0));
                x7Var.show();
                return;
            case 7:
                e4Var.U1(j10);
                return;
            case 8:
                new ph.l1(e4Var.getContext(), e4Var.f21584a, this.f47686c, null, new w1(e4Var, 1)).show();
                return;
            case 9:
                e4Var.U1(j10);
                return;
            case 10:
                new ph.l1(e4Var.getContext(), e4Var.f21584a, this.f47686c, null, new w1(e4Var, 1)).show();
                return;
            case 11:
                e4Var.U1(j10);
                return;
            default:
                new ph.l1(e4Var.getContext(), e4Var.f21584a, this.f47686c, null, new w1(e4Var, 1)).show();
                return;
        }
    }
}
