package wh;
public final class r2 implements Runnable {
    public final int f50007a;
    public final e1 f50008b;
    public final int f50009c;

    public r2(e1 e1Var, int i10, int i11) {
        this.f50007a = i11;
        this.f50008b = e1Var;
        this.f50009c = i10;
    }

    @Override
    public final void run() {
        switch (this.f50007a) {
            case 0:
                e1 e1Var = this.f50008b;
                e1Var.r();
                e1Var.setSelection(Math.max(0, Math.min(this.f50009c, e1Var.length())));
                return;
            case 1:
                e1 e1Var2 = this.f50008b;
                e1Var2.r();
                e1Var2.setSelection(Math.max(0, Math.min(this.f50009c, e1Var2.length())));
                return;
            case 2:
                e1 e1Var3 = this.f50008b;
                e1Var3.r();
                e1Var3.setSelection(Math.max(0, Math.min(this.f50009c, e1Var3.length())));
                return;
            case 3:
                e1 e1Var4 = this.f50008b;
                e1Var4.r();
                e1Var4.setSelection(Math.min(this.f50009c, e1Var4.length()));
                return;
            default:
                e1 e1Var5 = this.f50008b;
                e1Var5.r();
                e1Var5.setSelection(Math.max(0, Math.min(this.f50009c, e1Var5.length())));
                return;
        }
    }
}
