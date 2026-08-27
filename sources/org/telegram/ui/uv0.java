package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.MessagesController;

public final class uv0 implements Comparator {

    public final int f43298a;

    public final MessagesController f43299b;

    public uv0(MessagesController messagesController, int i10) {
        this.f43298a = i10;
        this.f43299b = messagesController;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        gw0 gw0Var = (gw0) obj;
        gw0 gw0Var2 = (gw0) obj2;
        switch (this.f43298a) {
            case 0:
                MessagesController messagesController = this.f43299b;
                i10 = messagesController.businessFeaturesTypesToPosition.get(gw0Var.f38486a, Integer.MAX_VALUE);
                i11 = messagesController.businessFeaturesTypesToPosition.get(gw0Var2.f38486a, Integer.MAX_VALUE);
                break;
            default:
                MessagesController messagesController2 = this.f43299b;
                i10 = messagesController2.premiumFeaturesTypesToPosition.get(gw0Var.f38486a, Integer.MAX_VALUE);
                i11 = messagesController2.premiumFeaturesTypesToPosition.get(gw0Var2.f38486a, Integer.MAX_VALUE);
                break;
        }
        return i10 - i11;
    }
}
