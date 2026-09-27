package org.telegram.ui;

import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.messenger.ContactsController;
public final class w80 implements org.telegram.ui.ActionBar.b2 {
    public final int f38839a;
    public final int f38840b;
    public final HashMap f38841c;
    public final boolean d;
    public final boolean e;

    public w80(int i10, HashMap hashMap, boolean z10, boolean z11, int i11) {
        this.f38839a = i11;
        this.f38840b = i10;
        this.f38841c = hashMap;
        this.d = z10;
        this.e = z11;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11 = this.f38839a;
        boolean z10 = this.e;
        boolean z11 = this.d;
        HashMap<String, ContactsController.Contact> hashMap = this.f38841c;
        int i12 = this.f38840b;
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
