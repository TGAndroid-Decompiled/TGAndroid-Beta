package th;
public final class m4 implements Runnable {
    public final int f49240a;
    public final e5 f49241b;

    public m4(e5 e5Var, int i10) {
        this.f49240a = i10;
        this.f49241b = e5Var;
    }

    @Override
    public final void run() {
        switch (this.f49240a) {
            case 0:
                e5 e5Var = this.f49241b;
                e5Var.R = false;
                e5Var.S = null;
                return;
            case 1:
                e5 e5Var2 = this.f49241b;
                e5Var2.f48919s = true;
                e5Var2.f48912l.edit().putBoolean("read_loaded", true).apply();
                return;
            default:
                e5 e5Var3 = this.f49241b;
                e5Var3.R = false;
                e5Var3.S = null;
                return;
        }
    }
}
