package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.MessagesController;
public final class xw0 implements Comparator {
    public final int f44157a;
    public final MessagesController f44158b;

    public xw0(MessagesController messagesController, int i10) {
        this.f44157a = i10;
        this.f44158b = messagesController;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        kx0 kx0Var = (kx0) obj;
        kx0 kx0Var2 = (kx0) obj2;
        switch (this.f44157a) {
            case 0:
                MessagesController messagesController = this.f44158b;
                i10 = messagesController.businessFeaturesTypesToPosition.get(kx0Var.f39365a, Integer.MAX_VALUE);
                i11 = messagesController.businessFeaturesTypesToPosition.get(kx0Var2.f39365a, Integer.MAX_VALUE);
                break;
            default:
                MessagesController messagesController2 = this.f44158b;
                i10 = messagesController2.premiumFeaturesTypesToPosition.get(kx0Var.f39365a, Integer.MAX_VALUE);
                i11 = messagesController2.premiumFeaturesTypesToPosition.get(kx0Var2.f39365a, Integer.MAX_VALUE);
                break;
        }
        return i10 - i11;
    }
}
