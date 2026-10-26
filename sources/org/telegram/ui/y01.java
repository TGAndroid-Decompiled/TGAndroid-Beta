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
public final class y01 {
    public final int f45919a;
    public boolean f45920b;
    public a11 f45921c;
    public final boolean[] f45923g;
    public boolean f45924i;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f45922f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f45925j = new ArrayList();

    public y01(int i10, int i11) {
        boolean[] zArr = new boolean[2];
        this.f45923g = zArr;
        this.f45919a = i11;
        if (i11 <= 0) {
            zArr[0] = true;
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            String i12 = ic.a.i(i11, "");
            for (int i13 = 0; i13 < i12.length(); i13++) {
                int charAt = i12.charAt(i13) - '0';
                if (charAt >= 0 && charAt <= 9) {
                    arrayList.add(Integer.valueOf(charAt));
                    hashSet.add(Integer.valueOf(charAt));
                }
            }
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            String[] strArr = b11.f37944s;
            tL_inputStickerSetShortName.short_name = "FestiveFontEmoji";
            MediaDataController.getInstance(i10).getStickerSet(tL_inputStickerSetShortName, 0, false, new y(this, hashSet, arrayList, 11));
        }
        String str = b11.f37944s[Utilities.random.nextInt(3)];
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName2.short_name = "EmojiAnimations";
        MediaDataController.getInstance(i10).getStickerSet(tL_inputStickerSetShortName2, 0, false, new org.telegram.ui.Components.oy(22, this, str));
    }

    public static y01 c(int i10, TLRPC.UserFull userFull, y01 y01Var) {
        int i11;
        TL_account.TL_birthday tL_birthday;
        if (LiteMode.isEnabled(2) && BirthdayController.isToday(userFull)) {
            if (userFull != null && (tL_birthday = userFull.birthday) != null && (tL_birthday.flags & 1) != 0) {
                i11 = Period.between(LocalDate.of(tL_birthday.year, tL_birthday.month, tL_birthday.day), LocalDate.now()).getYears();
            } else {
                i11 = 0;
            }
            if (y01Var != null) {
                if (y01Var.f45919a == i11) {
                    return y01Var;
                }
                y01Var.b(false);
            }
            return new y01(i10, i11);
        } else if (y01Var != null) {
            y01Var.b(false);
            return null;
        } else {
            return null;
        }
    }

    public final void a() {
        if (!this.f45920b && this.f45922f.size() >= this.e.size()) {
            boolean[] zArr = this.f45923g;
            int i10 = 0;
            if (zArr[0] && zArr[1]) {
                this.f45920b = true;
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
        if (!z10 && !this.f45925j.isEmpty()) {
            this.f45924i = true;
            return;
        }
        this.h.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i10 < arrayList.size()) {
                ((a11) arrayList.get(i10)).onDetachedFromWindow();
                i10++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }
}
