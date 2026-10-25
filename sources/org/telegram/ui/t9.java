package org.telegram.ui;
public final class t9 extends y9 {
    public final u9 f43699g0;

    public t9(u9 u9Var, int i10) {
        super(i10);
        this.f43699g0 = u9Var;
    }

    @Override
    public final void finishFragment() {
        setFinishing(true);
        this.f43699g0.dismiss();
    }

    @Override
    public final void removeSelfFromStack() {
        this.f43699g0.dismiss();
    }
}
