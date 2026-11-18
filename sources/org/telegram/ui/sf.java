package org.telegram.ui;
public final class sf implements q0.a {
    public final int f51989a;
    public final bn f51990b;

    public sf(bn bnVar, int i7) {
        this.f51989a = i7;
        this.f51990b = bnVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f51989a) {
            case 0:
                Integer num = (Integer) obj;
                bn bnVar = this.f51990b;
                bnVar.getClass();
                if (num.intValue() == 0) {
                    bnVar.A1 = 0;
                    bnVar.jd(true);
                    bnVar.getMessagesController().A3(bnVar.f46085l6, bnVar.d());
                    return;
                }
                bnVar.jd(true);
                bnVar.l(num.intValue(), 0, false, 0, true, 0);
                return;
            case 1:
                Integer num2 = (Integer) obj;
                bn bnVar2 = this.f51990b;
                bnVar2.getClass();
                if (num2.intValue() == 0) {
                    bnVar2.B1 = 0;
                    bnVar2.id(true);
                    bnVar2.getMessagesController().z3(bnVar2.f46085l6, bnVar2.d());
                    return;
                }
                int i7 = bnVar2.B1 - 1;
                bnVar2.B1 = i7;
                if (i7 <= 0) {
                    bnVar2.getMessagesController().z3(bnVar2.f46085l6, bnVar2.d());
                }
                bnVar2.id(true);
                bnVar2.l(num2.intValue(), 0, false, 0, true, 0);
                return;
            default:
                bn bnVar3 = this.f51990b;
                bnVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                bnVar3.f46239x7 = booleanValue;
                if (!booleanValue) {
                    bnVar3.L8();
                    return;
                }
                return;
        }
    }
}
