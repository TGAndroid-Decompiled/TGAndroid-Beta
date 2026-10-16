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
public final class t11 {
    public final int f39982a;
    public boolean f39983b;
    public v11 f39984c;
    public final boolean[] f39986g;
    public boolean f39987i;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f39985f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f39988j = new ArrayList();

    public t11(int i10, int i11) {
        boolean[] zArr = new boolean[2];
        this.f39986g = zArr;
        this.f39982a = i11;
        if (i11 <= 0) {
            zArr[0] = true;
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            String j10 = i2.d.j(i11, "");
            for (int i12 = 0; i12 < j10.length(); i12++) {
                int charAt = j10.charAt(i12) - '0';
                if (charAt >= 0 && charAt <= 9) {
                    arrayList.add(Integer.valueOf(charAt));
                    hashSet.add(Integer.valueOf(charAt));
                }
            }
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            String[] strArr = w11.f40833s;
            tL_inputStickerSetShortName.short_name = "FestiveFontEmoji";
            MediaDataController.getInstance(i10).getStickerSet(tL_inputStickerSetShortName, 0, false, new z(this, hashSet, arrayList, 11));
        }
        String str = w11.f40833s[Utilities.random.nextInt(3)];
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName2.short_name = "EmojiAnimations";
        MediaDataController.getInstance(i10).getStickerSet(tL_inputStickerSetShortName2, 0, false, new mt(14, this, str));
    }

    public static t11 c(int i10, TLRPC.UserFull userFull, t11 t11Var) {
        int i11;
        TL_account.TL_birthday tL_birthday;
        if (LiteMode.isEnabled(2) && BirthdayController.isToday(userFull)) {
            if (userFull != null && (tL_birthday = userFull.birthday) != null && (tL_birthday.flags & 1) != 0) {
                i11 = Period.between(LocalDate.of(tL_birthday.year, tL_birthday.month, tL_birthday.day), LocalDate.now()).getYears();
            } else {
                i11 = 0;
            }
            if (t11Var != null) {
                if (t11Var.f39982a == i11) {
                    return t11Var;
                }
                t11Var.b(false);
            }
            return new t11(i10, i11);
        } else if (t11Var != null) {
            t11Var.b(false);
            return null;
        } else {
            return null;
        }
    }

    public final void a() {
        if (!this.f39983b && this.f39985f.size() >= this.e.size()) {
            boolean[] zArr = this.f39986g;
            int i10 = 0;
            if (zArr[0] && zArr[1]) {
                this.f39983b = true;
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
        if (!z10 && !this.f39988j.isEmpty()) {
            this.f39987i = true;
            return;
        }
        this.h.clear();
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i10 < arrayList.size()) {
                ((v11) arrayList.get(i10)).onDetachedFromWindow();
                i10++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }
}
