package org.telegram.ui;
public final class s9 extends x9 {
    public final t9 f38127c0;

    public s9(t9 t9Var, int i10) {
        super(i10);
        this.f38127c0 = t9Var;
    }

    @Override
    public final void finishFragment() {
        setFinishing(true);
        this.f38127c0.dismiss();
    }

    @Override
    public final void removeSelfFromStack() {
        this.f38127c0.dismiss();
    }
}
