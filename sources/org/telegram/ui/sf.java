package org.telegram.ui;
public final class sf implements q0.a {
    public final int f52077a;
    public final bn f52078b;

    public sf(bn bnVar, int i7) {
        this.f52077a = i7;
        this.f52078b = bnVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f52077a) {
            case 0:
                Integer num = (Integer) obj;
                bn bnVar = this.f52078b;
                bnVar.getClass();
                if (num.intValue() == 0) {
                    bnVar.A1 = 0;
                    bnVar.jd(true);
                    bnVar.getMessagesController().A3(bnVar.f46271l6, bnVar.b());
                    return;
                }
                bnVar.jd(true);
                bnVar.l(num.intValue(), 0, false, 0, true, 0);
                return;
            case 1:
                Integer num2 = (Integer) obj;
                bn bnVar2 = this.f52078b;
                bnVar2.getClass();
                if (num2.intValue() == 0) {
                    bnVar2.B1 = 0;
                    bnVar2.id(true);
                    bnVar2.getMessagesController().z3(bnVar2.f46271l6, bnVar2.b());
                    return;
                }
                int i7 = bnVar2.B1 - 1;
                bnVar2.B1 = i7;
                if (i7 <= 0) {
                    bnVar2.getMessagesController().z3(bnVar2.f46271l6, bnVar2.b());
                }
                bnVar2.id(true);
                bnVar2.l(num2.intValue(), 0, false, 0, true, 0);
                return;
            default:
                bn bnVar3 = this.f52078b;
                bnVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                bnVar3.f46425x7 = booleanValue;
                if (!booleanValue) {
                    bnVar3.L8();
                    return;
                }
                return;
        }
    }
}
