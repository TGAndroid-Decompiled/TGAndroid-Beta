package org.telegram.ui;

import j$.time.LocalDate;
import j$.time.Period;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
public final class ww0 {
    public final int f53015a;
    public boolean f53016b;
    public yw0 f53017c;
    public final boolean[] f53020g;
    public boolean f53021i;
    public final ArrayList d = new ArrayList();
    public final ArrayList f53018e = new ArrayList();
    public final ArrayList f53019f = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList f53022j = new ArrayList();

    public ww0(int i7, int i10) {
        boolean[] zArr = new boolean[2];
        this.f53020g = zArr;
        this.f53015a = i10;
        if (i10 <= 0) {
            zArr[0] = true;
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            String i11 = i5.c.i(i10, "");
            for (int i12 = 0; i12 < i11.length(); i12++) {
                int charAt = i11.charAt(i12) - '0';
                if (charAt >= 0 && charAt <= 9) {
                    arrayList.add(Integer.valueOf(charAt));
                    hashSet.add(Integer.valueOf(charAt));
                }
            }
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            String[] strArr = zw0.f54035s;
            tL_inputStickerSetShortName.short_name = "FestiveFontEmoji";
            org.telegram.messenger.si.b0(i7).l0(tL_inputStickerSetShortName, 0, false, false, new x(this, hashSet, arrayList, 11));
        }
        String str = zw0.f54035s[Utilities.f22414b.nextInt(3)];
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
        tL_inputStickerSetShortName2.short_name = "EmojiAnimations";
        org.telegram.messenger.si.b0(i7).l0(tL_inputStickerSetShortName2, 0, false, false, new org.telegram.ui.Components.gh(27, this, str));
    }

    public static ww0 c(int i7, TLRPC.UserFull userFull, ww0 ww0Var) {
        int i10;
        TL_account.TL_birthday tL_birthday;
        if (org.telegram.messenger.qc.e(2) && org.telegram.messenger.v1.d(userFull)) {
            if (userFull != null && (tL_birthday = userFull.birthday) != null && (tL_birthday.flags & 1) != 0) {
                i10 = Period.between(LocalDate.of(tL_birthday.year, tL_birthday.month, tL_birthday.day), LocalDate.now()).getYears();
            } else {
                i10 = 0;
            }
            if (ww0Var != null) {
                if (ww0Var.f53015a == i10) {
                    return ww0Var;
                }
                ww0Var.b(false);
            }
            return new ww0(i7, i10);
        } else if (ww0Var != null) {
            ww0Var.b(false);
            return null;
        } else {
            return null;
        }
    }

    public final void a() {
        if (!this.f53016b && this.f53019f.size() >= this.f53018e.size()) {
            boolean[] zArr = this.f53020g;
            int i7 = 0;
            if (zArr[0] && zArr[1]) {
                this.f53016b = true;
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

    public final void b(boolean z10) {
        if (!z10 && !this.f53022j.isEmpty()) {
            this.f53021i = true;
            return;
        }
        this.h.clear();
        int i7 = 0;
        while (true) {
            ArrayList arrayList = this.f53018e;
            if (i7 < arrayList.size()) {
                ((yw0) arrayList.get(i7)).R();
                i7++;
            } else {
                arrayList.clear();
                return;
            }
        }
    }
}
