package org.telegram.ui;

import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.messenger.ContactsController;
public final class z80 implements org.telegram.ui.ActionBar.a2 {
    public final int f43362a;
    public final int f43363b;
    public final HashMap f43364c;
    public final boolean d;
    public final boolean f43365e;

    public z80(int i10, HashMap hashMap, boolean z10, boolean z11, int i11) {
        this.f43362a = i11;
        this.f43363b = i10;
        this.f43364c = hashMap;
        this.d = z10;
        this.f43365e = z11;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11 = this.f43362a;
        boolean z10 = this.f43365e;
        boolean z11 = this.d;
        HashMap<String, ContactsController.Contact> hashMap = this.f43364c;
        int i12 = this.f43363b;
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
