package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.MessagesController;
public final class xw0 implements Comparator {
    public final int f42934a;
    public final MessagesController f42935b;

    public xw0(MessagesController messagesController, int i10) {
        this.f42934a = i10;
        this.f42935b = messagesController;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        kx0 kx0Var = (kx0) obj;
        kx0 kx0Var2 = (kx0) obj2;
        switch (this.f42934a) {
            case 0:
                MessagesController messagesController = this.f42935b;
                i10 = messagesController.businessFeaturesTypesToPosition.get(kx0Var.f38175a, Integer.MAX_VALUE);
                i11 = messagesController.businessFeaturesTypesToPosition.get(kx0Var2.f38175a, Integer.MAX_VALUE);
                break;
            default:
                MessagesController messagesController2 = this.f42935b;
                i10 = messagesController2.premiumFeaturesTypesToPosition.get(kx0Var.f38175a, Integer.MAX_VALUE);
                i11 = messagesController2.premiumFeaturesTypesToPosition.get(kx0Var2.f38175a, Integer.MAX_VALUE);
                break;
        }
        return i10 - i11;
    }
}
