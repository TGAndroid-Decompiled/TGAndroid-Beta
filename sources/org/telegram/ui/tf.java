package org.telegram.ui;
public final class tf implements q0.a {
    public final int f50175a;
    public final cn f50176b;

    public tf(cn cnVar, int i7) {
        this.f50175a = i7;
        this.f50176b = cnVar;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f50175a) {
            case 0:
                Integer num = (Integer) obj;
                cn cnVar = this.f50176b;
                cnVar.getClass();
                if (num.intValue() == 0) {
                    cnVar.f44701z1 = 0;
                    cnVar.id(true);
                    cnVar.getMessagesController().t3(cnVar.f44504j6, cnVar.b());
                    return;
                }
                cnVar.id(true);
                cnVar.l(num.intValue(), 0, false, 0, true, 0);
                return;
            case 1:
                Integer num2 = (Integer) obj;
                cn cnVar2 = this.f50176b;
                cnVar2.getClass();
                if (num2.intValue() == 0) {
                    cnVar2.A1 = 0;
                    cnVar2.hd(true);
                    cnVar2.getMessagesController().s3(cnVar2.f44504j6, cnVar2.b());
                    return;
                }
                int i7 = cnVar2.A1 - 1;
                cnVar2.A1 = i7;
                if (i7 <= 0) {
                    cnVar2.getMessagesController().s3(cnVar2.f44504j6, cnVar2.b());
                }
                cnVar2.hd(true);
                cnVar2.l(num2.intValue(), 0, false, 0, true, 0);
                return;
            default:
                cn cnVar3 = this.f50176b;
                cnVar3.getClass();
                boolean booleanValue = ((Boolean) obj).booleanValue();
                cnVar3.f44655v7 = booleanValue;
                if (!booleanValue) {
                    cnVar3.K8();
                    return;
                }
                return;
        }
    }
}
