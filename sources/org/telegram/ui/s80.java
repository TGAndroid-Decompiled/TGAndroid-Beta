package org.telegram.ui;

import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.messenger.ContactsController;
public final class s80 implements org.telegram.ui.ActionBar.c2 {
    public final int f38124a;
    public final int f38125b;
    public final HashMap f38126c;
    public final boolean d;
    public final boolean e;

    public s80(int i10, HashMap hashMap, boolean z4, boolean z10, int i11) {
        this.f38124a = i11;
        this.f38125b = i10;
        this.f38126c = hashMap;
        this.d = z4;
        this.e = z10;
    }

    @Override
    public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11 = this.f38124a;
        boolean z4 = this.e;
        boolean z10 = this.d;
        HashMap<String, ContactsController.Contact> hashMap = this.f38126c;
        int i12 = this.f38125b;
        switch (i11) {
            case 0:
                Pattern pattern = LaunchActivity.f31586y1;
                ContactsController.getInstance(i12).syncPhoneBookByAlert(hashMap, z10, z4, true);
                return;
            case 1:
                Pattern pattern2 = LaunchActivity.f31586y1;
                ContactsController.getInstance(i12).syncPhoneBookByAlert(hashMap, z10, z4, false);
                return;
            default:
                Pattern pattern3 = LaunchActivity.f31586y1;
                ContactsController.getInstance(i12).syncPhoneBookByAlert(hashMap, z10, z4, true);
                return;
        }
    }
}
