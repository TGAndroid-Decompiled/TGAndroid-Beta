package rh;
public final class x0 implements Runnable {
    public final int f47674a;
    public final e4 f47675b;
    public final long f47676c;

    public x0(e4 e4Var, long j10, int i10) {
        this.f47674a = i10;
        this.f47675b = e4Var;
        this.f47676c = j10;
    }

    @Override
    public final void run() {
        int i10 = this.f47674a;
        long j10 = this.f47676c;
        e4 e4Var = this.f47675b;
        switch (i10) {
            case 0:
                e4Var.U1(j10);
                return;
            case 1:
                e4Var.U1(j10);
                return;
            case 2:
                w0 w0Var = e4Var.f46822m3;
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
                new ph.l1(e4Var.getContext(), e4Var.f21583a, this.f47676c, null, new w1(e4Var, 1)).show();
                return;
            case 6:
                x7 x7Var = new x7(e4Var.getContext(), e4Var.I0, this.f47676c, 10, null, new o(8, e4Var, new boolean[]{false}), 0L);
                x7Var.setOnDismissListener(new b2(e4Var, 0));
                x7Var.show();
                return;
            case 7:
                e4Var.U1(j10);
                return;
            case 8:
                new ph.l1(e4Var.getContext(), e4Var.f21583a, this.f47676c, null, new w1(e4Var, 1)).show();
                return;
            case 9:
                e4Var.U1(j10);
                return;
            case 10:
                new ph.l1(e4Var.getContext(), e4Var.f21583a, this.f47676c, null, new w1(e4Var, 1)).show();
                return;
            case 11:
                e4Var.U1(j10);
                return;
            default:
                new ph.l1(e4Var.getContext(), e4Var.f21583a, this.f47676c, null, new w1(e4Var, 1)).show();
                return;
        }
    }
}
