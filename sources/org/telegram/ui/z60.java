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
public final class z60 extends org.telegram.ui.Components.hm0 {
    public final Context f43645c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public lt f43646f;
    public String h;
    public int f43647n;
    public final a70 f43648r;

    public z60(a70 a70Var, Context context) {
        this.f43648r = a70Var;
        this.f43645c = context;
        C(true);
    }

    public static void E(z60 z60Var, String str) {
        a70 a70Var = z60Var.f43648r;
        if (a70Var.N) {
            if (!TextUtils.isEmpty(str)) {
                a70Var.d.setBackgroundColor(a70Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20989d6));
            } else {
                a70Var.d.setBackground(null);
            }
        }
        if (z60Var.f43647n != 0) {
            a70Var.getConnectionsManager().cancelRequest(z60Var.f43647n, true);
            z60Var.f43647n = 0;
        }
        lt ltVar = z60Var.f43646f;
        if (ltVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ltVar);
            z60Var.f43646f = null;
        }
        z60Var.h = null;
        int h = z60Var.h();
        if (h > 0) {
            z60Var.d.clear();
            z60Var.e.clear();
            z60Var.t(0, h);
        }
        if (TextUtils.isEmpty(str)) {
            a70Var.f35283b.setVisibility(8);
            a70Var.f35283b.e(false, true);
            return;
        }
        if (a70Var.f35283b.getVisibility() != 0) {
            a70Var.f35283b.setVisibility(0);
            a70Var.f35283b.e(true, false);
        } else {
            a70Var.f35283b.e(true, true);
        }
        lt ltVar2 = new lt(27, z60Var, str);
        z60Var.f43646f = ltVar2;
        AndroidUtilities.runOnUIThread(ltVar2, 300L);
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
            return ((TLRPC.TL_messages_stickerSet) arrayList.get(i10)).set.f20302id;
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
        org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) b1Var.f45910a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i10);
        if (i10 != arrayList.size() - 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        l8Var.d(tL_messages_stickerSet, z11, !z10);
        String str3 = this.h;
        if (str3 != null) {
            str = str3.toLowerCase(Locale.ROOT);
        } else {
            str = "";
        }
        a70 a70Var = this.f43648r;
        org.telegram.ui.ActionBar.d6 resourceProvider = a70Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str4 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str4.toLowerCase(locale).indexOf(str);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new org.telegram.ui.Components.m10(org.telegram.ui.ActionBar.h6.q6, resourceProvider), indexOf, str.length() + indexOf, 0);
            l8Var.f22539b.setText(spannableString);
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
            spannableString2.setSpan(new org.telegram.ui.Components.m10(org.telegram.ui.ActionBar.h6.q6, resourceProvider), length, str.length() + length, 0);
            l8Var.f22540c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = a70Var.f35287r;
        if (tL_messages_stickerSet2 != null) {
            j10 = tL_messages_stickerSet2.set.f20302id;
        } else if (a70Var.b0(a70Var.v) != null) {
            j10 = a70Var.b0(a70Var.v).f20302id;
        } else {
            j10 = 0;
        }
        if (tL_messages_stickerSet.set.f20302id != j10) {
            z12 = false;
        }
        l8Var.b(z12, false);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.l8 l8Var;
        int i11;
        Context context = this.f43645c;
        if (i10 != 0) {
            int i12 = org.telegram.ui.ActionBar.h6.B6;
            a70 a70Var = this.f43648r;
            org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(this.f43645c, i12, 21, 0, 0, false, false, a70Var.getResourceProvider());
            org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(new ColorDrawable(a70Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20931a7)), org.telegram.ui.ActionBar.h6.W0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f20951b7));
            zqVar.f33023w = true;
            l4Var.setBackground(zqVar);
            if (a70Var.N) {
                i11 = R.string.ChooseStickerMyEmojiPacks;
            } else {
                i11 = R.string.ChooseStickerMyStickerSets;
            }
            l4Var.setText(LocaleController.getString(i11));
            l8Var = l4Var;
        } else {
            org.telegram.ui.Cells.l8 l8Var2 = new org.telegram.ui.Cells.l8(context, 3);
            l8Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20989d6, false));
            l8Var = l8Var2;
        }
        l8Var.setLayoutParams(new s4.o0(-1, -2));
        return new s4.b1(l8Var);
    }
}
