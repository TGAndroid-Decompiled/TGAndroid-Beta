package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.MessagesController;
public final class tv0 implements Comparator {
    public final int f43102a;
    public final MessagesController f43103b;

    public tv0(MessagesController messagesController, int i10) {
        this.f43102a = i10;
        this.f43103b = messagesController;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        fw0 fw0Var = (fw0) obj;
        fw0 fw0Var2 = (fw0) obj2;
        switch (this.f43102a) {
            case 0:
                MessagesController messagesController = this.f43103b;
                i10 = messagesController.businessFeaturesTypesToPosition.get(fw0Var.f38243a, Integer.MAX_VALUE);
                i11 = messagesController.businessFeaturesTypesToPosition.get(fw0Var2.f38243a, Integer.MAX_VALUE);
                break;
            default:
                MessagesController messagesController2 = this.f43103b;
                i10 = messagesController2.premiumFeaturesTypesToPosition.get(fw0Var.f38243a, Integer.MAX_VALUE);
                i11 = messagesController2.premiumFeaturesTypesToPosition.get(fw0Var2.f38243a, Integer.MAX_VALUE);
                break;
        }
        return i10 - i11;
    }
}
