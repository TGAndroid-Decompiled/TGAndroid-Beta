package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.MessagesController;
public final class qw0 implements Comparator {
    public final int f36623a;
    public final MessagesController f36624b;

    public qw0(MessagesController messagesController, int i10) {
        this.f36623a = i10;
        this.f36624b = messagesController;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        dx0 dx0Var = (dx0) obj;
        dx0 dx0Var2 = (dx0) obj2;
        switch (this.f36623a) {
            case 0:
                MessagesController messagesController = this.f36624b;
                i10 = messagesController.businessFeaturesTypesToPosition.get(dx0Var.f32736a, Integer.MAX_VALUE);
                i11 = messagesController.businessFeaturesTypesToPosition.get(dx0Var2.f32736a, Integer.MAX_VALUE);
                break;
            default:
                MessagesController messagesController2 = this.f36624b;
                i10 = messagesController2.premiumFeaturesTypesToPosition.get(dx0Var.f32736a, Integer.MAX_VALUE);
                i11 = messagesController2.premiumFeaturesTypesToPosition.get(dx0Var2.f32736a, Integer.MAX_VALUE);
                break;
        }
        return i10 - i11;
    }
}
