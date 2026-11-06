package org.telegram.ui;
public final class tf implements q0.a {
    public final int f50047a;
    public final an f50048b;

    public tf(an anVar, int i7) {
        this.f50047a = i7;
        this.f50048b = anVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f50047a) {
            case 0:
                Integer num = (Integer) obj;
                an anVar = this.f50048b;
                anVar.getClass();
                if (num.intValue() == 0) {
                    anVar.f44039z1 = 0;
                    anVar.fd(true);
                    anVar.getMessagesController().t3(anVar.f43843j6, anVar.b());
                    return;
                }
                anVar.fd(true);
                anVar.l(num.intValue(), 0, false, 0, true, 0);
                return;
            case 1:
                Integer num2 = (Integer) obj;
                an anVar2 = this.f50048b;
                anVar2.getClass();
                if (num2.intValue() == 0) {
                    anVar2.A1 = 0;
                    anVar2.ed(true);
                    anVar2.getMessagesController().s3(anVar2.f43843j6, anVar2.b());
                    return;
                }
                int i7 = anVar2.A1 - 1;
                anVar2.A1 = i7;
                if (i7 <= 0) {
                    anVar2.getMessagesController().s3(anVar2.f43843j6, anVar2.b());
                }
                anVar2.ed(true);
                anVar2.l(num2.intValue(), 0, false, 0, true, 0);
                return;
            default:
                an anVar3 = this.f50048b;
                anVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                anVar3.f43993v7 = booleanValue;
                if (!booleanValue) {
                    anVar3.J8();
                    return;
                }
                return;
        }
    }
}
