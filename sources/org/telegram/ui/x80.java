package org.telegram.ui;

import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.messenger.ContactsController;
public final class x80 implements org.telegram.ui.ActionBar.a2 {
    public final int f42775a;
    public final int f42776b;
    public final HashMap f42777c;
    public final boolean d;
    public final boolean f42778e;

    public x80(int i10, HashMap hashMap, boolean z10, boolean z11, int i11) {
        this.f42775a = i11;
        this.f42776b = i10;
        this.f42777c = hashMap;
        this.d = z10;
        this.f42778e = z11;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11 = this.f42775a;
        boolean z10 = this.f42778e;
        boolean z11 = this.d;
        HashMap<String, ContactsController.Contact> hashMap = this.f42777c;
        int i12 = this.f42776b;
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
