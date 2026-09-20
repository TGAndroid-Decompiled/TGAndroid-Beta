package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.MessagesController;
public final class xw0 implements Comparator {
    public final int f39738a;
    public final MessagesController f39739b;

    public xw0(MessagesController messagesController, int i10) {
        this.f39738a = i10;
        this.f39739b = messagesController;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        kx0 kx0Var = (kx0) obj;
        kx0 kx0Var2 = (kx0) obj2;
        switch (this.f39738a) {
            case 0:
                MessagesController messagesController = this.f39739b;
                i10 = messagesController.businessFeaturesTypesToPosition.get(kx0Var.f35260a, Integer.MAX_VALUE);
                i11 = messagesController.businessFeaturesTypesToPosition.get(kx0Var2.f35260a, Integer.MAX_VALUE);
                break;
            default:
                MessagesController messagesController2 = this.f39739b;
                i10 = messagesController2.premiumFeaturesTypesToPosition.get(kx0Var.f35260a, Integer.MAX_VALUE);
                i11 = messagesController2.premiumFeaturesTypesToPosition.get(kx0Var2.f35260a, Integer.MAX_VALUE);
                break;
        }
        return i10 - i11;
    }
}
