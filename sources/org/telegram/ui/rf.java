package org.telegram.ui;
public final class rf implements org.telegram.messenger.v10 {
    public final int f49504a;
    public final an f49505b;
    public final String f49506c;

    public rf(an anVar, String str, int i7) {
        this.f49504a = i7;
        this.f49505b = anVar;
        this.f49506c = str;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        switch (this.f49504a) {
            case 0:
                if (bool.booleanValue()) {
                    boolean booleanValue = bool2.booleanValue();
                    an anVar = this.f49505b;
                    String str = this.f49506c;
                    if (booleanValue) {
                        anVar.getMessagesController().p(str, false);
                    }
                    anVar.getParentActivity();
                    vf.c.o(str);
                    return;
                }
                return;
            default:
                an anVar2 = this.f49505b;
                anVar2.getClass();
                if (bool.booleanValue()) {
                    boolean booleanValue2 = bool2.booleanValue();
                    String str2 = this.f49506c;
                    if (booleanValue2) {
                        anVar2.getMessagesController().p(str2, true);
                    }
                    vf.c.n(anVar2.getParentActivity(), str2, false, null);
                    return;
                }
                return;
        }
    }
}
