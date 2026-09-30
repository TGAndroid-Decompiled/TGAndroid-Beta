package xh;
public final class o implements Runnable {
    public final int f46317a;
    public final v f46318b;

    public o(v vVar, int i10) {
        this.f46317a = i10;
        this.f46318b = vVar;
    }

    @Override
    public final void run() {
        switch (this.f46317a) {
            case 0:
                this.f46318b.onBackPressed();
                return;
            default:
                this.f46318b.T();
                return;
        }
    }
}
