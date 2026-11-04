package tg;

import b8.kg;
public final class g0 implements Runnable {
    public final int f55166a;
    public final i0 f55167b;
    public final kg f55168c;

    public g0(i0 i0Var, kg kgVar, int i3) {
        this.f55166a = i3;
        this.f55167b = i0Var;
        this.f55168c = kgVar;
    }

    @Override
    public final void run() {
        switch (this.f55166a) {
            case 0:
                this.f55167b.p(this.f55168c, true);
                return;
            default:
                i0 i0Var = this.f55167b;
                i0Var.f55193f.f(new g0(i0Var, this.f55168c, 0));
                return;
        }
    }
}
