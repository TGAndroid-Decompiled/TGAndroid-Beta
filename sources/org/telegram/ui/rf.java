package org.telegram.ui;
public final class rf implements org.telegram.messenger.v10 {
    public final int f49404a;
    public final cn f49405b;
    public final String f49406c;

    public rf(cn cnVar, String str, int i7) {
        this.f49404a = i7;
        this.f49405b = cnVar;
        this.f49406c = str;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f49404a) {
            case 0:
                if (bool.booleanValue()) {
                    boolean booleanValue = bool2.booleanValue();
                    cn cnVar = this.f49405b;
                    String str = this.f49406c;
                    if (booleanValue) {
                        cnVar.getMessagesController().p(str, false);
                    }
                    cnVar.getParentActivity();
                    vf.c.o(str);
                    return;
                }
                return;
            default:
                cn cnVar2 = this.f49405b;
                cnVar2.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    String str2 = this.f49406c;
                    if (booleanValue2) {
                        cnVar2.getMessagesController().p(str2, true);
                    }
                    vf.c.n(cnVar2.getParentActivity(), str2, false, null);
                    return;
                }
                return;
        }
    }
}
