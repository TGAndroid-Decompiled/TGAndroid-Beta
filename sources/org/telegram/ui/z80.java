package org.telegram.ui;

import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.messenger.ContactsController;
public final class z80 implements org.telegram.ui.ActionBar.a2 {
    public final int f40158a;
    public final int f40159b;
    public final HashMap f40160c;
    public final boolean d;
    public final boolean e;

    public z80(int i10, HashMap hashMap, boolean z10, boolean z11, int i11) {
        this.f40158a = i11;
        this.f40159b = i10;
        this.f40160c = hashMap;
        this.d = z10;
        this.e = z11;
    }

    @Override
    public final void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11 = this.f40158a;
        boolean z10 = this.e;
        boolean z11 = this.d;
        HashMap<String, ContactsController.Contact> hashMap = this.f40160c;
        int i12 = this.f40159b;
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
