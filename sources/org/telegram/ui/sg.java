package org.telegram.ui;
public final class sg implements q0.a {
    public final int f37491a;
    public final bo f37492b;

    public sg(bo boVar, int i10) {
        this.f37491a = i10;
        this.f37492b = boVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f37491a) {
            case 0:
                Integer num = (Integer) obj;
                bo boVar = this.f37492b;
                boVar.getClass();
                if (num.intValue() == 0) {
                    boVar.l1 = 0;
                    boVar.Bc(true);
                    boVar.getMessagesController().markReactionsAsRead(boVar.T5, boVar.d());
                    return;
                }
                boVar.Bc(true);
                boVar.F(num.intValue(), 0, 0, 0, false, true);
                return;
            case 1:
                Integer num2 = (Integer) obj;
                bo boVar2 = this.f37492b;
                boVar2.getClass();
                if (num2.intValue() == 0) {
                    boVar2.f32367m1 = 0;
                    boVar2.Ac(true);
                    boVar2.getMessagesController().markPollVotesAsRead(boVar2.T5, boVar2.d());
                    return;
                }
                int i10 = boVar2.f32367m1 - 1;
                boVar2.f32367m1 = i10;
                if (i10 <= 0) {
                    boVar2.getMessagesController().markPollVotesAsRead(boVar2.T5, boVar2.d());
                }
                boVar2.Ac(true);
                boVar2.F(num2.intValue(), 0, 0, 0, false, true);
                return;
            default:
                bo boVar3 = this.f37492b;
                boVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boVar3.f7 = booleanValue;
                if (!booleanValue) {
                    boVar3.r8();
                    return;
                }
                return;
        }
    }
}
