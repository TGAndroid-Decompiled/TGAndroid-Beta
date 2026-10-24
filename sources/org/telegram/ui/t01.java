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
public final class t01 {
    public final int f41847a;
    public boolean f41848b;
    public v01 f41849c;
    public final boolean[] f41851g;
    public boolean f41852i;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f41850f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f41853j = new ArrayList();

    public t01(int i10, int i11) {
        boolean[] zArr = new boolean[2];
        this.f41851g = zArr;
        this.f41847a = i11;
        if (i11 <= 0) {
            zArr[0] = true;
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            String k10 = i2.o1.k(i11, "");
            for (int i12 = 0; i12 < k10.length(); i12++) {
                int charAt = k10.charAt(i12) - '0';
                if (charAt >= 0 && charAt <= 9) {
                    arrayList.add(Integer.valueOf(charAt));
                    hashSet.add(Integer.valueOf(charAt));
                }
            }
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            String[] strArr = w01.f42863s;
            tL_inputStickerSetShortName.short_name = "FestiveFontEmoji";
            MediaDataController.getInstance(i10).getStickerSet(tL_inputStickerSetShortName, 0, false, new y(this, hashSet, arrayList, 11));
        }
        String str = w01.f42863s[Utilities.random.nextInt(3)];
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName2.short_name = "EmojiAnimations";
        MediaDataController.getInstance(i10).getStickerSet(tL_inputStickerSetShortName2, 0, false, new org.telegram.ui.Components.oy(20, this, str));
    }

    public static t01 c(int i10, TLRPC.UserFull userFull, t01 t01Var) {
        int i11;
        TL_account.TL_birthday tL_birthday;
        if (LiteMode.isEnabled(2) && BirthdayController.isToday(userFull)) {
            if (userFull != null && (tL_birthday = userFull.birthday) != null && (tL_birthday.flags & 1) != 0) {
                i11 = Period.between(LocalDate.of(tL_birthday.year, tL_birthday.month, tL_birthday.day), LocalDate.now()).getYears();
            } else {
                i11 = 0;
            }
            if (t01Var != null) {
                if (t01Var.f41847a == i11) {
                    return t01Var;
                }
                t01Var.b(false);
            }
            return new t01(i10, i11);
        } else if (t01Var != null) {
            t01Var.b(false);
            return null;
        } else {
            return null;
        }
    }

    public final void a() {
        if (!this.f41848b && this.f41850f.size() >= this.e.size()) {
            boolean[] zArr = this.f41851g;
            int i10 = 0;
            if (zArr[0] && zArr[1]) {
                this.f41848b = true;
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

    public final void b(boolean z10) {
        if (!z10 && !this.f41853j.isEmpty()) {
            this.f41852i = true;
            return;
        }
        this.h.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i10 < arrayList.size()) {
                ((v01) arrayList.get(i10)).onDetachedFromWindow();
                i10++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }
}
