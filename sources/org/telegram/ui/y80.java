package org.telegram.ui;

import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.messenger.ContactsController;
public final class y80 implements org.telegram.ui.ActionBar.c2 {
    public final int f38934a;
    public final int f38935b;
    public final HashMap f38936c;
    public final boolean d;
    public final boolean e;

    public y80(int i10, HashMap hashMap, boolean z10, boolean z11, int i11) {
        this.f38934a = i11;
        this.f38935b = i10;
        this.f38936c = hashMap;
        this.d = z10;
        this.e = z11;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11 = this.f38934a;
        boolean z10 = this.e;
        boolean z11 = this.d;
        HashMap<String, ContactsController.Contact> hashMap = this.f38936c;
        int i12 = this.f38935b;
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
