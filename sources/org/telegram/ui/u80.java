package org.telegram.ui;

import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.messenger.ContactsController;
public final class u80 implements org.telegram.ui.ActionBar.z1 {
    public final int f38347a;
    public final int f38348b;
    public final HashMap f38349c;
    public final boolean d;
    public final boolean e;

    public u80(int i10, HashMap hashMap, boolean z10, boolean z11, int i11) {
        this.f38347a = i11;
        this.f38348b = i10;
        this.f38349c = hashMap;
        this.d = z10;
        this.e = z11;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11 = this.f38347a;
        boolean z10 = this.e;
        boolean z11 = this.d;
        HashMap<String, ContactsController.Contact> hashMap = this.f38349c;
        int i12 = this.f38348b;
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
