package org.telegram.ui;
public final class so implements Runnable {
    public final int f38412a;
    public final dp f38413b;

    public so(dp dpVar, int i10) {
        this.f38412a = i10;
        this.f38413b = dpVar;
    }

    @Override
    public final void run() {
        switch (this.f38412a) {
            case 0:
                dp dpVar = this.f38413b;
                dpVar.Z = true;
                dpVar.b0();
                return;
            case 1:
                dp dpVar2 = this.f38413b;
                dpVar2.U = dpVar2.getMessagesController().getChat(Long.valueOf(dpVar2.W));
                dpVar2.Y();
                return;
            case 2:
                this.f38413b.a0(false);
                return;
            case 3:
                dp dpVar3 = this.f38413b;
                dpVar3.Z = true;
                if (dpVar3.f33746a.length() > 0) {
                    dpVar3.W(dpVar3.f33746a.getText().toString());
                }
                dpVar3.b0();
                return;
            case 4:
                this.f38413b.Y();
                return;
            default:
                this.f38413b.a0(true);
                return;
        }
    }
}
