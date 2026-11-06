package org.telegram.ui;

import j$.time.LocalDate;
import j$.time.Period;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class xw0 {
    public final int f52002a;
    public boolean f52003b;
    public zw0 f52004c;
    public final boolean[] f52007g;
    public boolean f52008i;
    public final ArrayList d = new ArrayList();
    public final ArrayList f52005e = new ArrayList();
    public final ArrayList f52006f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f52009j = new ArrayList();

    public xw0(int i7, int i10) {
        boolean[] zArr = new boolean[2];
        this.f52007g = zArr;
        this.f52002a = i10;
        if (i10 <= 0) {
            zArr[0] = true;
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            String j3 = jg.g.j(i10, "");
            for (int i11 = 0; i11 < j3.length(); i11++) {
                int charAt = j3.charAt(i11) - '0';
                if (charAt >= 0 && charAt <= 9) {
                    arrayList.add(Integer.valueOf(charAt));
                    hashSet.add(Integer.valueOf(charAt));
                }
            }
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            String[] strArr = ax0.f44107s;
            tL_inputStickerSetShortName.short_name = "FestiveFontEmoji";
            org.telegram.messenger.ui.b0(i7).l0(tL_inputStickerSetShortName, 0, false, false, new y(this, hashSet, arrayList, 11));
        }
        String str = ax0.f44107s[Utilities.f21331b.nextInt(3)];
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName2.short_name = "EmojiAnimations";
        org.telegram.messenger.ui.b0(i7).l0(tL_inputStickerSetShortName2, 0, false, false, new org.telegram.ui.Components.ex(22, this, str));
    }

    public static xw0 c(int i7, TLRPC.UserFull userFull, xw0 xw0Var) {
        int i10;
        TL_account.TL_birthday tL_birthday;
        if (org.telegram.messenger.rc.e(2) && org.telegram.messenger.v1.d(userFull)) {
            if (userFull != null && (tL_birthday = userFull.birthday) != null && (tL_birthday.flags & 1) != 0) {
                i10 = Period.between(LocalDate.of(tL_birthday.year, tL_birthday.month, tL_birthday.day), LocalDate.now()).getYears();
            } else {
                i10 = 0;
            }
            if (xw0Var != null) {
                if (xw0Var.f52002a == i10) {
                    return xw0Var;
                }
                xw0Var.b(false);
            }
            return new xw0(i7, i10);
        } else if (xw0Var != null) {
            xw0Var.b(false);
            return null;
        } else {
            return null;
        }
    }

    public final void a() {
        if (!this.f52003b && this.f52006f.size() >= this.f52005e.size()) {
            boolean[] zArr = this.f52007g;
            int i7 = 0;
            if (zArr[0] && zArr[1]) {
                this.f52003b = true;
                ArrayList arrayList = this.h;
                int size = arrayList.size();
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    ((Runnable) obj).run();
                }
                arrayList.clear();
            }
        }
    }

    public final void b(boolean z9) {
        if (!z9 && !this.f52009j.isEmpty()) {
            this.f52008i = true;
            return;
        }
        this.h.clear();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f52005e;
            if (i7 < arrayList.size()) {
                ((zw0) arrayList.get(i7)).R();
                i7++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }
}
