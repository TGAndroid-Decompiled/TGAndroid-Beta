package ph;
public final class u1 implements Runnable {
    public final int f45317a;
    public final f2 f45318b;

    public u1(f2 f2Var, int i10) {
        this.f45317a = i10;
        this.f45318b = f2Var;
    }

    @Override
    public final void run() {
        switch (this.f45317a) {
            case 0:
                this.f45318b.setReordering(true);
                return;
            case 1:
                this.f45318b.setReordering(true);
                return;
            case 2:
                this.f45318b.f(false);
                return;
            default:
                this.f45318b.setReordering(true);
                return;
        }
    }
}
