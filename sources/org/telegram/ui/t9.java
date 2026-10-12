package org.telegram.ui;
public final class t9 extends z9 {
    public final u9 f40317h0;

    public t9(u9 u9Var, int i10) {
        super(i10);
        this.f40317h0 = u9Var;
    }

    @Override
    public final void finishFragment() {
        setFinishing(true);
        this.f40317h0.dismiss();
    }

    @Override
    public final void removeSelfFromStack() {
        this.f40317h0.dismiss();
    }
}
