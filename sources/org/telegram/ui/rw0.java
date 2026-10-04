package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.MessagesController;
public final class rw0 implements Comparator {
    public final int f40295a;
    public final MessagesController f40296b;

    public rw0(MessagesController messagesController, int i10) {
        this.f40295a = i10;
        this.f40296b = messagesController;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        ex0 ex0Var = (ex0) obj;
        ex0 ex0Var2 = (ex0) obj2;
        switch (this.f40295a) {
            case 0:
                MessagesController messagesController = this.f40296b;
                i10 = messagesController.businessFeaturesTypesToPosition.get(ex0Var.f36107a, Integer.MAX_VALUE);
                i11 = messagesController.businessFeaturesTypesToPosition.get(ex0Var2.f36107a, Integer.MAX_VALUE);
                break;
            default:
                MessagesController messagesController2 = this.f40296b;
                i10 = messagesController2.premiumFeaturesTypesToPosition.get(ex0Var.f36107a, Integer.MAX_VALUE);
                i11 = messagesController2.premiumFeaturesTypesToPosition.get(ex0Var2.f36107a, Integer.MAX_VALUE);
                break;
        }
        return i10 - i11;
    }
}
