package org.telegram.ui;

import java.util.Comparator;
import org.telegram.messenger.MessagesController;
public final class zw0 implements Comparator {
    public final int f44926a;
    public final MessagesController f44927b;

    public zw0(MessagesController messagesController, int i10) {
        this.f44926a = i10;
        this.f44927b = messagesController;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int i10;
        int i11;
        mx0 mx0Var = (mx0) obj;
        mx0 mx0Var2 = (mx0) obj2;
        switch (this.f44926a) {
            case 0:
                MessagesController messagesController = this.f44927b;
                i10 = messagesController.businessFeaturesTypesToPosition.get(mx0Var.f40143a, Integer.MAX_VALUE);
                i11 = messagesController.businessFeaturesTypesToPosition.get(mx0Var2.f40143a, Integer.MAX_VALUE);
                break;
            default:
                MessagesController messagesController2 = this.f44927b;
                i10 = messagesController2.premiumFeaturesTypesToPosition.get(mx0Var.f40143a, Integer.MAX_VALUE);
                i11 = messagesController2.premiumFeaturesTypesToPosition.get(mx0Var2.f40143a, Integer.MAX_VALUE);
                break;
        }
        return i10 - i11;
    }
}
