package org.telegram.ui;
public final class s9 extends x9 {
    public final t9 f37337f0;

    public s9(t9 t9Var, int i10) {
        super(i10);
        this.f37337f0 = t9Var;
    }

    @Override
    public final void finishFragment() {
        setFinishing(true);
        this.f37337f0.dismiss();
    }

    @Override
    public final void removeSelfFromStack() {
        this.f37337f0.dismiss();
    }
}
