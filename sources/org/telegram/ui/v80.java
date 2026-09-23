package org.telegram.ui;

import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.messenger.ContactsController;
public final class v80 implements org.telegram.ui.ActionBar.a2 {
    public final int f38322a;
    public final int f38323b;
    public final HashMap f38324c;
    public final boolean d;
    public final boolean e;

    public v80(int i10, HashMap hashMap, boolean z10, boolean z11, int i11) {
        this.f38322a = i11;
        this.f38323b = i10;
        this.f38324c = hashMap;
        this.d = z10;
        this.e = z11;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11 = this.f38322a;
        boolean z10 = this.e;
        boolean z11 = this.d;
        HashMap<String, ContactsController.Contact> hashMap = this.f38324c;
        int i12 = this.f38323b;
        switch (i11) {
            case 0:
                Pattern pattern = LaunchActivity.B1;
                ContactsController.getInstance(i12).syncPhoneBookByAlert(hashMap, z11, z10, true);
                return;
            case 1:
                Pattern pattern2 = LaunchActivity.B1;
                ContactsController.getInstance(i12).syncPhoneBookByAlert(hashMap, z11, z10, false);
                return;
            default:
                Pattern pattern3 = LaunchActivity.B1;
                ContactsController.getInstance(i12).syncPhoneBookByAlert(hashMap, z11, z10, true);
                return;
        }
    }
}
