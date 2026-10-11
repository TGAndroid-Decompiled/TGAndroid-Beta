package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.MessagesController;
public final class ww0 implements Comparator {
    public final int f43916a;
    public final MessagesController f43917b;

    public ww0(MessagesController messagesController, int i10) {
        this.f43916a = i10;
        this.f43917b = messagesController;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        jx0 jx0Var = (jx0) obj;
        jx0 jx0Var2 = (jx0) obj2;
        switch (this.f43916a) {
            case 0:
                MessagesController messagesController = this.f43917b;
                i10 = messagesController.businessFeaturesTypesToPosition.get(jx0Var.f39171a, Integer.MAX_VALUE);
                i11 = messagesController.businessFeaturesTypesToPosition.get(jx0Var2.f39171a, Integer.MAX_VALUE);
                break;
            default:
                MessagesController messagesController2 = this.f43917b;
                i10 = messagesController2.premiumFeaturesTypesToPosition.get(jx0Var.f39171a, Integer.MAX_VALUE);
                i11 = messagesController2.premiumFeaturesTypesToPosition.get(jx0Var2.f39171a, Integer.MAX_VALUE);
                break;
        }
        return i10 - i11;
    }
}
