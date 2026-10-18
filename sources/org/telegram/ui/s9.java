package org.telegram.ui;
public final class s9 extends y9 {
    public final t9 f41059i0;

    public s9(t9 t9Var, int i10) {
        super(i10);
        this.f41059i0 = t9Var;
    }

    @Override
    public final void finishFragment() {
        setFinishing(true);
        this.f41059i0.dismiss();
    }

    @Override
    public final void removeSelfFromStack() {
        this.f41059i0.dismiss();
    }
}
