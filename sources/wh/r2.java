package wh;
public final class r2 implements Runnable {
    public final int f49970a;
    public final e1 f49971b;
    public final int f49972c;

    public r2(e1 e1Var, int i10, int i11) {
        this.f49970a = i11;
        this.f49971b = e1Var;
        this.f49972c = i10;
    }

    @Override
    public final void run() {
        switch (this.f49970a) {
            case 0:
                e1 e1Var = this.f49971b;
                e1Var.r();
                e1Var.setSelection(Math.max(0, Math.min(this.f49972c, e1Var.length())));
                return;
            case 1:
                e1 e1Var2 = this.f49971b;
                e1Var2.r();
                e1Var2.setSelection(Math.max(0, Math.min(this.f49972c, e1Var2.length())));
                return;
            case 2:
                e1 e1Var3 = this.f49971b;
                e1Var3.r();
                e1Var3.setSelection(Math.max(0, Math.min(this.f49972c, e1Var3.length())));
                return;
            case 3:
                e1 e1Var4 = this.f49971b;
                e1Var4.r();
                e1Var4.setSelection(Math.min(this.f49972c, e1Var4.length()));
                return;
            default:
                e1 e1Var5 = this.f49971b;
                e1Var5.r();
                e1Var5.setSelection(Math.max(0, Math.min(this.f49972c, e1Var5.length())));
                return;
        }
    }
}
