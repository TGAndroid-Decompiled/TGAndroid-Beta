package org.telegram.ui;
public final class rg implements q0.a {
    public final int f39791a;
    public final fo f39792b;

    public rg(fo foVar, int i10) {
        this.f39791a = i10;
        this.f39792b = foVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f39791a) {
            case 0:
                Integer num = (Integer) obj;
                fo foVar = this.f39792b;
                foVar.getClass();
                if (num.intValue() == 0) {
                    foVar.l1 = 0;
                    foVar.Fc(true);
                    foVar.getMessagesController().markReactionsAsRead(foVar.T5, foVar.d());
                    return;
                }
                foVar.Fc(true);
                foVar.j(num.intValue(), 0, false, 0, true, 0);
                return;
            case 1:
                Integer num2 = (Integer) obj;
                fo foVar2 = this.f39792b;
                foVar2.getClass();
                if (num2.intValue() == 0) {
                    foVar2.f36020m1 = 0;
                    foVar2.Ec(true);
                    foVar2.getMessagesController().markPollVotesAsRead(foVar2.T5, foVar2.d());
                    return;
                }
                int i10 = foVar2.f36020m1 - 1;
                foVar2.f36020m1 = i10;
                if (i10 <= 0) {
                    foVar2.getMessagesController().markPollVotesAsRead(foVar2.T5, foVar2.d());
                }
                foVar2.Ec(true);
                foVar2.j(num2.intValue(), 0, false, 0, true, 0);
                return;
            default:
                fo foVar3 = this.f39792b;
                foVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                foVar3.f7 = booleanValue;
                if (!booleanValue) {
                    foVar3.v8();
                    return;
                }
                return;
        }
    }
}
