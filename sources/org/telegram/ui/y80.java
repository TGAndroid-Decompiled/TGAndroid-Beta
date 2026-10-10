package org.telegram.ui;

import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.messenger.ContactsController;
public final class y80 implements org.telegram.ui.ActionBar.a2 {
    public final int f44321a;
    public final int f44322b;
    public final HashMap f44323c;
    public final boolean d;
    public final boolean f44324e;

    public y80(int i10, HashMap hashMap, boolean z10, boolean z11, int i11) {
        this.f44321a = i11;
        this.f44322b = i10;
        this.f44323c = hashMap;
        this.d = z10;
        this.f44324e = z11;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11 = this.f44321a;
        boolean z10 = this.f44324e;
        boolean z11 = this.d;
        HashMap<String, ContactsController.Contact> hashMap = this.f44323c;
        int i12 = this.f44322b;
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
