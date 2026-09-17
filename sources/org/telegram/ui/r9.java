package org.telegram.ui;
public final class r9 extends w9 {
    public final s9 f37124f0;

    public r9(s9 s9Var, int i10) {
        super(i10);
        this.f37124f0 = s9Var;
    }

    @Override
    public final void finishFragment() {
        setFinishing(true);
        this.f37124f0.dismiss();
    }

    @Override
    public final void removeSelfFromStack() {
        this.f37124f0.dismiss();
    }
}
