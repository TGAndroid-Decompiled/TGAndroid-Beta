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
public final class v01 {
    public final int f39034a;
    public boolean f39035b;
    public x01 f39036c;
    public final boolean[] f39038g;
    public boolean f39039i;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f39037f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f39040j = new ArrayList();

    public v01(int i10, int i11) {
        boolean[] zArr = new boolean[2];
        this.f39038g = zArr;
        this.f39034a = i11;
        if (i11 <= 0) {
            zArr[0] = true;
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            String j10 = kh.a2.j(i11, "");
            for (int i12 = 0; i12 < j10.length(); i12++) {
                int charAt = j10.charAt(i12) - '0';
                if (charAt >= 0 && charAt <= 9) {
                    arrayList.add(Integer.valueOf(charAt));
                    hashSet.add(Integer.valueOf(charAt));
                }
            }
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            String[] strArr = y01.f40342s;
            tL_inputStickerSetShortName.short_name = "FestiveFontEmoji";
            MediaDataController.getInstance(i10).getStickerSet(tL_inputStickerSetShortName, 0, false, new a0(this, hashSet, arrayList, 7));
        }
        String str = y01.f40342s[Utilities.random.nextInt(3)];
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName2.short_name = "EmojiAnimations";
        MediaDataController.getInstance(i10).getStickerSet(tL_inputStickerSetShortName2, 0, false, new org.telegram.ui.Components.vk(24, this, str));
    }

    public static v01 c(int i10, TLRPC.UserFull userFull, v01 v01Var) {
        int i11;
        TL_account.TL_birthday tL_birthday;
        if (LiteMode.isEnabled(2) && BirthdayController.isToday(userFull)) {
            if (userFull != null && (tL_birthday = userFull.birthday) != null && (tL_birthday.flags & 1) != 0) {
                i11 = Period.between(LocalDate.of(tL_birthday.year, tL_birthday.month, tL_birthday.day), LocalDate.now()).getYears();
            } else {
                i11 = 0;
            }
            if (v01Var != null) {
                if (v01Var.f39034a == i11) {
                    return v01Var;
                }
                v01Var.b(false);
            }
            return new v01(i10, i11);
        } else if (v01Var != null) {
            v01Var.b(false);
            return null;
        } else {
            return null;
        }
    }

    public final void a() {
        if (!this.f39035b && this.f39037f.size() >= this.e.size()) {
            boolean[] zArr = this.f39038g;
            int i10 = 0;
            if (zArr[0] && zArr[1]) {
                this.f39035b = true;
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
        if (!z4 && !this.f39040j.isEmpty()) {
            this.f39039i = true;
            return;
        }
        this.h.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i10 < arrayList.size()) {
                ((x01) arrayList.get(i10)).onDetachedFromWindow();
                i10++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }
}
