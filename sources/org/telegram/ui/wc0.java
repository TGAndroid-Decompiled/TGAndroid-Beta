package org.telegram.ui;
public final class wc0 implements Runnable {
    public final int f50774a;
    public final dd0 f50775b;
    public final int f50776c;

    public wc0(dd0 dd0Var, int i3, int i10) {
        this.f50774a = i10;
        this.f50775b = dd0Var;
        this.f50776c = i3;
    }

    @Override
    public final void run() {
        switch (this.f50774a) {
            case 0:
                org.telegram.messenger.g0.h3(new wc0(this.f50775b, this.f50776c, 1));
                return;
            case 1:
                this.f50775b.z(this.f50776c);
                return;
            default:
                this.f50775b.f44644f.f52078f[this.f50776c].C(1.0f);
                return;
        }
    }
}
