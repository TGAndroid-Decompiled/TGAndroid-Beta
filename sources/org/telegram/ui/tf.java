package org.telegram.ui;
public final class tf implements q0.a {
    public final int f50019a;
    public final an f50020b;

    public tf(an anVar, int i7) {
        this.f50019a = i7;
        this.f50020b = anVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f50019a) {
            case 0:
                Integer num = (Integer) obj;
                an anVar = this.f50020b;
                anVar.getClass();
                if (num.intValue() == 0) {
                    anVar.f44014z1 = 0;
                    anVar.fd(true);
                    anVar.getMessagesController().t3(anVar.f43818j6, anVar.b());
                    return;
                }
                anVar.fd(true);
                anVar.l(num.intValue(), 0, false, 0, true, 0);
                return;
            case 1:
                Integer num2 = (Integer) obj;
                an anVar2 = this.f50020b;
                anVar2.getClass();
                if (num2.intValue() == 0) {
                    anVar2.A1 = 0;
                    anVar2.ed(true);
                    anVar2.getMessagesController().s3(anVar2.f43818j6, anVar2.b());
                    return;
                }
                int i7 = anVar2.A1 - 1;
                anVar2.A1 = i7;
                if (i7 <= 0) {
                    anVar2.getMessagesController().s3(anVar2.f43818j6, anVar2.b());
                }
                anVar2.ed(true);
                anVar2.l(num2.intValue(), 0, false, 0, true, 0);
                return;
            default:
                an anVar3 = this.f50020b;
                anVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                anVar3.f43968v7 = booleanValue;
                if (!booleanValue) {
                    anVar3.J8();
                    return;
                }
                return;
        }
    }
}
