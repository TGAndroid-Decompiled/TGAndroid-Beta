package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.MessagesController;
public final class tv0 implements Comparator {
    public final int f43073a;
    public final MessagesController f43074b;

    public tv0(MessagesController messagesController, int i9) {
        this.f43073a = i9;
        this.f43074b = messagesController;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i9;
        int i10;
        gw0 gw0Var = (gw0) obj;
        gw0 gw0Var2 = (gw0) obj2;
        switch (this.f43073a) {
            case 0:
                MessagesController messagesController = this.f43074b;
                i9 = messagesController.businessFeaturesTypesToPosition.get(gw0Var.f38610a, Integer.MAX_VALUE);
                i10 = messagesController.businessFeaturesTypesToPosition.get(gw0Var2.f38610a, Integer.MAX_VALUE);
                break;
            default:
                MessagesController messagesController2 = this.f43074b;
                i9 = messagesController2.premiumFeaturesTypesToPosition.get(gw0Var.f38610a, Integer.MAX_VALUE);
                i10 = messagesController2.premiumFeaturesTypesToPosition.get(gw0Var2.f38610a, Integer.MAX_VALUE);
                break;
        }
        return i9 - i10;
    }
}
