package rh;

public final class s2 implements Runnable {

    public final int f47432a;

    public final p3 f47433b;

    public final f2.v0 f47434c;

    public s2(p3 p3Var, f2.v0 v0Var, int i10) {
        this.f47432a = i10;
        this.f47433b = p3Var;
        this.f47434c = v0Var;
    }

    @Override
    public final void run() {
        switch (this.f47432a) {
            case 0:
                this.f47433b.setItemAnimator(this.f47434c);
                break;
            default:
                this.f47433b.setItemAnimator(this.f47434c);
                break;
        }
    }
}
