package zh;
public final class o implements Runnable {
    public final int f53166a;
    public final v f53167b;

    public o(v vVar, int i10) {
        this.f53166a = i10;
        this.f53167b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f53166a) {
            case 0:
                this.f53167b.onBackPressed();
                return;
            default:
                this.f53167b.T();
                return;
        }
    }
}
