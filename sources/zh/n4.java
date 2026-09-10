package zh;
public final class n4 implements Runnable {
    public final int f48707a;
    public final i5 f48708b;

    public n4(i5 i5Var, int i10) {
        this.f48707a = i10;
        this.f48708b = i5Var;
    }

    @Override
    public final void run() {
        switch (this.f48707a) {
            case 0:
                i5 i5Var = this.f48708b;
                i5Var.R = false;
                i5Var.S = null;
                return;
            case 1:
                i5 i5Var2 = this.f48708b;
                i5Var2.f48514s = true;
                i5Var2.f48507l.edit().putBoolean("read_loaded", true).apply();
                return;
            default:
                i5 i5Var3 = this.f48708b;
                i5Var3.R = false;
                i5Var3.S = null;
                return;
        }
    }
}
