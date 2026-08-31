package org.telegram.ui;

import j$.time.LocalDate;
import j$.time.Period;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class x01 {
    public final int f42921a;
    public boolean f42922b;
    public z01 f42923c;
    public final boolean[] f42926g;
    public boolean f42927i;
    public final ArrayList d = new ArrayList();
    public final ArrayList f42924e = new ArrayList();
    public final ArrayList f42925f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f42928j = new ArrayList();

    public x01(int i10, int i11) {
        boolean[] zArr = new boolean[2];
        this.f42926g = zArr;
        this.f42921a = i11;
        if (i11 <= 0) {
            zArr[0] = true;
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            String j10 = l.d.j(i11, "");
            for (int i12 = 0; i12 < j10.length(); i12++) {
                int charAt = j10.charAt(i12) - '0';
                if (charAt >= 0 && charAt <= 9) {
                    arrayList.add(Integer.valueOf(charAt));
                    hashSet.add(Integer.valueOf(charAt));
                }
            }
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            String[] strArr = a11.f34978s;
            tL_inputStickerSetShortName.short_name = "FestiveFontEmoji";
            MediaDataController.getInstance(i10).getStickerSet(tL_inputStickerSetShortName, 0, false, new a0(this, hashSet, arrayList, 7));
        }
        String str = a11.f34978s[Utilities.random.nextInt(3)];
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName2.short_name = "EmojiAnimations";
        MediaDataController.getInstance(i10).getStickerSet(tL_inputStickerSetShortName2, 0, false, new org.telegram.ui.Components.xk(24, this, str));
    }

    public static x01 c(int i10, TLRPC.UserFull userFull, x01 x01Var) {
        int i11;
        TL_account.TL_birthday tL_birthday;
        if (LiteMode.isEnabled(2) && BirthdayController.isToday(userFull)) {
            if (userFull != null && (tL_birthday = userFull.birthday) != null && (tL_birthday.flags & 1) != 0) {
                i11 = Period.between(LocalDate.of(tL_birthday.year, tL_birthday.month, tL_birthday.day), LocalDate.now()).getYears();
            } else {
                i11 = 0;
            }
            if (x01Var != null) {
                if (x01Var.f42921a == i11) {
                    return x01Var;
                }
                x01Var.b(false);
            }
            return new x01(i10, i11);
        } else if (x01Var != null) {
            x01Var.b(false);
            return null;
        } else {
            return null;
        }
    }

    public final void a() {
        if (!this.f42922b && this.f42925f.size() >= this.f42924e.size()) {
            boolean[] zArr = this.f42926g;
            int i10 = 0;
            if (zArr[0] && zArr[1]) {
                this.f42922b = true;
                ArrayList arrayList = this.h;
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((Runnable) obj).run();
                }
                arrayList.clear();
            }
        }
    }

    public final void b(boolean z4) {
        if (!z4 && !this.f42928j.isEmpty()) {
            this.f42927i = true;
            return;
        }
        this.h.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f42924e;
            if (i10 < arrayList.size()) {
                ((z01) arrayList.get(i10)).onDetachedFromWindow();
                i10++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }
}
