package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class x70 extends org.telegram.ui.Components.lm0 {
    public final Context f41767c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public o00 f41768f;
    public String h;
    public int f41769n;
    public final y70 f41770r;

    public x70(y70 y70Var, Context context) {
        this.f41770r = y70Var;
        this.f41767c = context;
        C(true);
    }

    public static void E(x70 x70Var, String str) {
        y70 y70Var = x70Var.f41770r;
        if (y70Var.N) {
            if (!TextUtils.isEmpty(str)) {
                y70Var.d.setBackgroundColor(y70Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19901d6));
            } else {
                y70Var.d.setBackground(null);
            }
        }
        if (x70Var.f41769n != 0) {
            y70Var.getConnectionsManager().cancelRequest(x70Var.f41769n, true);
            x70Var.f41769n = 0;
        }
        o00 o00Var = x70Var.f41768f;
        if (o00Var != null) {
            AndroidUtilities.cancelRunOnUIThread(o00Var);
            x70Var.f41768f = null;
        }
        x70Var.h = null;
        int h = x70Var.h();
        if (h > 0) {
            x70Var.d.clear();
            x70Var.e.clear();
            x70Var.t(0, h);
        }
        if (TextUtils.isEmpty(str)) {
            y70Var.f42058b.setVisibility(8);
            y70Var.f42058b.e(false, true);
            return;
        }
        if (y70Var.f42058b.getVisibility() != 0) {
            y70Var.f42058b.setVisibility(0);
            y70Var.f42058b.e(true, false);
        } else {
            y70Var.f42058b.e(true, true);
        }
        o00 o00Var2 = new o00(14, x70Var, str);
        x70Var.f41768f = o00Var2;
        AndroidUtilities.runOnUIThread(o00Var2, 300L);
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (j(b1Var.b()) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.e.size() + this.d.size() + (!this.e.isEmpty());
    }

    @Override
    public final long i(int i10) {
        ArrayList arrayList;
        if (j(i10) == 0) {
            if (i10 > this.d.size()) {
                arrayList = this.e;
            } else {
                arrayList = this.d;
            }
            if (i10 > this.d.size()) {
                i10 = (i10 - this.d.size()) - 1;
            }
            return ((TLRPC.TL_messages_stickerSet) arrayList.get(i10)).set.f19243id;
        }
        return -1L;
    }

    @Override
    public final int j(int i10) {
        if (this.d.size() == i10) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        boolean z10;
        ArrayList arrayList;
        boolean z11;
        String str;
        long j10;
        String str2;
        if (j(i10) != 0) {
            return;
        }
        boolean z12 = true;
        if (i10 > this.d.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            arrayList = this.e;
        } else {
            arrayList = this.d;
        }
        if (z10) {
            i10 = (i10 - this.d.size()) - 1;
        }
        org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) b1Var.f44838a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i10);
        if (i10 != arrayList.size() - 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        m8Var.d(tL_messages_stickerSet, z11, !z10);
        String str3 = this.h;
        if (str3 != null) {
            str = str3.toLowerCase(Locale.ROOT);
        } else {
            str = "";
        }
        y70 y70Var = this.f41770r;
        org.telegram.ui.ActionBar.c6 resourceProvider = y70Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str4 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str4.toLowerCase(locale).indexOf(str);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new org.telegram.ui.Components.q10(org.telegram.ui.ActionBar.g6.q6, resourceProvider), indexOf, str.length() + indexOf, 0);
            m8Var.f21521b.setText(spannableString);
        }
        int indexOf2 = stickerSet.short_name.toLowerCase(locale).indexOf(str);
        if (indexOf2 != -1) {
            if (stickerSet.emojis) {
                str2 = "t.me/addemoji/";
            } else {
                str2 = "t.me/addstickers/";
            }
            int length = str2.length() + indexOf2;
            StringBuilder u10 = a1.g.u(str2);
            u10.append(stickerSet.short_name);
            SpannableString spannableString2 = new SpannableString(u10.toString());
            spannableString2.setSpan(new org.telegram.ui.Components.q10(org.telegram.ui.ActionBar.g6.q6, resourceProvider), length, str.length() + length, 0);
            m8Var.f21522c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = y70Var.f42062r;
        if (tL_messages_stickerSet2 != null) {
            j10 = tL_messages_stickerSet2.set.f19243id;
        } else if (y70Var.b0(y70Var.v) != null) {
            j10 = y70Var.b0(y70Var.v).f19243id;
        } else {
            j10 = 0;
        }
        if (tL_messages_stickerSet.set.f19243id != j10) {
            z12 = false;
        }
        m8Var.b(z12, false);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.m8 m8Var;
        int i11;
        Context context = this.f41767c;
        if (i10 != 0) {
            int i12 = org.telegram.ui.ActionBar.g6.B6;
            y70 y70Var = this.f41770r;
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(this.f41767c, i12, 21, 0, 0, false, false, y70Var.getResourceProvider());
            org.telegram.ui.Components.cr crVar = new org.telegram.ui.Components.cr(new ColorDrawable(y70Var.getThemedColor(org.telegram.ui.ActionBar.g6.f19843a7)), org.telegram.ui.ActionBar.g6.W0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f19863b7));
            crVar.f24198w = true;
            m4Var.setBackground(crVar);
            if (y70Var.N) {
                i11 = R.string.ChooseStickerMyEmojiPacks;
            } else {
                i11 = R.string.ChooseStickerMyStickerSets;
            }
            m4Var.setText(LocaleController.getString(i11));
            m8Var = m4Var;
        } else {
            org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(context, 3);
            m8Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false));
            m8Var = m8Var2;
        }
        m8Var.setLayoutParams(new s4.o0(-1, -2));
        return new s4.b1(m8Var);
    }
}
