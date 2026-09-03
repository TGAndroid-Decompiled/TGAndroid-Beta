package org.telegram.ui;

import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.messenger.ContactsController;
public final class r80 implements org.telegram.ui.ActionBar.c2 {
    public final int f40773a;
    public final int f40774b;
    public final HashMap f40775c;
    public final boolean d;
    public final boolean f40776e;

    public r80(int i10, HashMap hashMap, boolean z4, boolean z10, int i11) {
        this.f40773a = i11;
        this.f40774b = i10;
        this.f40775c = hashMap;
        this.d = z4;
        this.f40776e = z10;
    }

    @Override
    public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11 = this.f40773a;
        boolean z4 = this.f40776e;
        boolean z10 = this.d;
        HashMap<String, ContactsController.Contact> hashMap = this.f40775c;
        int i12 = this.f40774b;
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
