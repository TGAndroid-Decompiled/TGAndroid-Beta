package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.MessagesController;
public final class rw0 implements Comparator {
    public final int f37242a;
    public final MessagesController f37243b;

    public rw0(MessagesController messagesController, int i10) {
        this.f37242a = i10;
        this.f37243b = messagesController;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        ex0 ex0Var = (ex0) obj;
        ex0 ex0Var2 = (ex0) obj2;
        switch (this.f37242a) {
            case 0:
                MessagesController messagesController = this.f37243b;
                i10 = messagesController.businessFeaturesTypesToPosition.get(ex0Var.f33341a, Integer.MAX_VALUE);
                i11 = messagesController.businessFeaturesTypesToPosition.get(ex0Var2.f33341a, Integer.MAX_VALUE);
                break;
            default:
                MessagesController messagesController2 = this.f37243b;
                i10 = messagesController2.premiumFeaturesTypesToPosition.get(ex0Var.f33341a, Integer.MAX_VALUE);
                i11 = messagesController2.premiumFeaturesTypesToPosition.get(ex0Var2.f33341a, Integer.MAX_VALUE);
                break;
        }
        return i10 - i11;
    }
}
