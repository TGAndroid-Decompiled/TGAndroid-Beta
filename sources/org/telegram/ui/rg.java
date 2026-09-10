package org.telegram.ui;
public final class rg implements q0.a {
    public final int f36361a;
    public final eo f36362b;

    public rg(eo eoVar, int i10) {
        this.f36361a = i10;
        this.f36362b = eoVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f36361a) {
            case 0:
                Integer num = (Integer) obj;
                eo eoVar = this.f36362b;
                eoVar.getClass();
                if (num.intValue() == 0) {
                    eoVar.l1 = 0;
                    eoVar.Bc(true);
                    eoVar.getMessagesController().markReactionsAsRead(eoVar.T5, eoVar.d());
                    return;
                }
                eoVar.Bc(true);
                eoVar.E(num.intValue(), 0, 0, 0, false, true);
                return;
            case 1:
                Integer num2 = (Integer) obj;
                eo eoVar2 = this.f36362b;
                eoVar2.getClass();
                if (num2.intValue() == 0) {
                    eoVar2.f32403m1 = 0;
                    eoVar2.Ac(true);
                    eoVar2.getMessagesController().markPollVotesAsRead(eoVar2.T5, eoVar2.d());
                    return;
                }
                int i10 = eoVar2.f32403m1 - 1;
                eoVar2.f32403m1 = i10;
                if (i10 <= 0) {
                    eoVar2.getMessagesController().markPollVotesAsRead(eoVar2.T5, eoVar2.d());
                }
                eoVar2.Ac(true);
                eoVar2.E(num2.intValue(), 0, 0, 0, false, true);
                return;
            default:
                eo eoVar3 = this.f36362b;
                eoVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                eoVar3.f7 = booleanValue;
                if (!booleanValue) {
                    eoVar3.r8();
                    return;
                }
                return;
        }
    }
}
