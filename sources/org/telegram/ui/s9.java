package org.telegram.ui;
public final class s9 extends y9 {
    public final t9 f41836h0;

    public s9(t9 t9Var, int i10) {
        super(i10);
        this.f41836h0 = t9Var;
    }

    @Override
    public final void finishFragment() {
        setFinishing(true);
        this.f41836h0.dismiss();
    }

    @Override
    public final void removeSelfFromStack() {
        this.f41836h0.dismiss();
    }
}
