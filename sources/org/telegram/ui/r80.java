package org.telegram.ui;

import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.messenger.ContactsController;
public final class r80 implements org.telegram.ui.ActionBar.c2 {
    public final int f40851a;
    public final int f40852b;
    public final HashMap f40853c;
    public final boolean d;
    public final boolean f40854e;

    public r80(int i10, HashMap hashMap, boolean z4, boolean z10, int i11) {
        this.f40851a = i11;
        this.f40852b = i10;
        this.f40853c = hashMap;
        this.d = z4;
        this.f40854e = z10;
    }

    @Override
    public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11 = this.f40851a;
        boolean z4 = this.f40854e;
        boolean z10 = this.d;
        HashMap<String, ContactsController.Contact> hashMap = this.f40853c;
        int i12 = this.f40852b;
        switch (i11) {
            case 0:
                Pattern pattern = LaunchActivity.f34134y1;
                ContactsController.getInstance(i12).syncPhoneBookByAlert(hashMap, z10, z4, true);
                return;
            case 1:
                Pattern pattern2 = LaunchActivity.f34134y1;
                ContactsController.getInstance(i12).syncPhoneBookByAlert(hashMap, z10, z4, false);
                return;
            default:
                Pattern pattern3 = LaunchActivity.f34134y1;
                ContactsController.getInstance(i12).syncPhoneBookByAlert(hashMap, z10, z4, true);
                return;
        }
    }
}
