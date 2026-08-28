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
public final class y60 extends org.telegram.ui.Components.vk0 {
    public final Context f44753c;
    public ArrayList d = new ArrayList();
    public ArrayList f44754e = new ArrayList();
    public x20 f44755f;
    public String h;
    public int f44756n;
    public final z60 f44757r;

    public y60(z60 z60Var, Context context) {
        this.f44757r = z60Var;
        this.f44753c = context;
        C(true);
    }

    public static void E(y60 y60Var, String str) {
        z60 z60Var = y60Var.f44757r;
        if (z60Var.J) {
            if (!TextUtils.isEmpty(str)) {
                z60Var.d.setBackgroundColor(z60Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
            } else {
                z60Var.d.setBackground(null);
            }
        }
        if (y60Var.f44756n != 0) {
            z60Var.getConnectionsManager().cancelRequest(y60Var.f44756n, true);
            y60Var.f44756n = 0;
        }
        x20 x20Var = y60Var.f44755f;
        if (x20Var != null) {
            AndroidUtilities.cancelRunOnUIThread(x20Var);
            y60Var.f44755f = null;
        }
        y60Var.h = null;
        int h = y60Var.h();
        if (h > 0) {
            y60Var.d.clear();
            y60Var.f44754e.clear();
            y60Var.t(0, h);
        }
        if (TextUtils.isEmpty(str)) {
            z60Var.f45042b.setVisibility(8);
            z60Var.f45042b.e(false, true);
            return;
        }
        if (z60Var.f45042b.getVisibility() != 0) {
            z60Var.f45042b.setVisibility(0);
            z60Var.f45042b.e(true, false);
        } else {
            z60Var.f45042b.e(true, true);
        }
        x20 x20Var2 = new x20(4, y60Var, str);
        y60Var.f44755f = x20Var2;
        AndroidUtilities.runOnUIThread(x20Var2, 300L);
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        if (j(q1Var.b()) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f44754e.size() + this.d.size() + (!this.f44754e.isEmpty());
    }

    @Override
    public final long i(int i9) {
        ArrayList arrayList;
        if (j(i9) == 0) {
            if (i9 > this.d.size()) {
                arrayList = this.f44754e;
            } else {
                arrayList = this.d;
            }
            if (i9 > this.d.size()) {
                i9 = (i9 - this.d.size()) - 1;
            }
            return ((TLRPC.TL_messages_stickerSet) arrayList.get(i9)).set.f22407id;
        }
        return -1L;
    }

    @Override
    public final int j(int i9) {
        if (this.d.size() == i9) {
            return 1;
        }
        return 0;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        boolean z10;
        ArrayList arrayList;
        boolean z11;
        String str;
        long j10;
        String str2;
        if (j(i9) != 0) {
            return;
        }
        boolean z12 = true;
        if (i9 > this.d.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            arrayList = this.f44754e;
        } else {
            arrayList = this.d;
        }
        if (z10) {
            i9 = (i9 - this.d.size()) - 1;
        }
        org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) q1Var.f5501a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i9);
        if (i9 != arrayList.size() - 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        k8Var.d(tL_messages_stickerSet, z11, !z10);
        String str3 = this.h;
        if (str3 != null) {
            str = str3.toLowerCase(Locale.ROOT);
        } else {
            str = "";
        }
        z60 z60Var = this.f44757r;
        org.telegram.ui.ActionBar.b6 resourceProvider = z60Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str4 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str4.toLowerCase(locale).indexOf(str);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new org.telegram.ui.Components.p00(org.telegram.ui.ActionBar.f6.f23229q6, resourceProvider), indexOf, str.length() + indexOf, 0);
            k8Var.f24617b.setText(spannableString);
        }
        int indexOf2 = stickerSet.short_name.toLowerCase(locale).indexOf(str);
        if (indexOf2 != -1) {
            if (stickerSet.emojis) {
                str2 = "t.me/addemoji/";
            } else {
                str2 = "t.me/addstickers/";
            }
            int length = str2.length() + indexOf2;
            StringBuilder n10 = e2.c.n(str2);
            n10.append(stickerSet.short_name);
            SpannableString spannableString2 = new SpannableString(n10.toString());
            spannableString2.setSpan(new org.telegram.ui.Components.p00(org.telegram.ui.ActionBar.f6.f23229q6, resourceProvider), length, str.length() + length, 0);
            k8Var.f24618c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = z60Var.f45047r;
        if (tL_messages_stickerSet2 != null) {
            j10 = tL_messages_stickerSet2.set.f22407id;
        } else if (z60Var.a0(z60Var.v) != null) {
            j10 = z60Var.a0(z60Var.v).f22407id;
        } else {
            j10 = 0;
        }
        if (tL_messages_stickerSet.set.f22407id != j10) {
            z12 = false;
        }
        k8Var.b(z12, false);
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.Cells.k8 k8Var;
        int i10;
        Context context = this.f44753c;
        if (i9 != 0) {
            int i11 = org.telegram.ui.ActionBar.f6.B6;
            z60 z60Var = this.f44757r;
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(this.f44753c, i11, 21, 0, 0, false, false, z60Var.getResourceProvider());
            org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(new ColorDrawable(z60Var.getThemedColor(org.telegram.ui.ActionBar.f6.f22947a7)), org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.f22966b7));
            fqVar.f28550w = true;
            m4Var.setBackground(fqVar);
            if (z60Var.J) {
                i10 = R.string.ChooseStickerMyEmojiPacks;
            } else {
                i10 = R.string.ChooseStickerMyStickerSets;
            }
            m4Var.setText(LocaleController.getString(i10));
            k8Var = m4Var;
        } else {
            org.telegram.ui.Cells.k8 k8Var2 = new org.telegram.ui.Cells.k8(context, 3);
            k8Var2.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false));
            k8Var = k8Var2;
        }
        k8Var.setLayoutParams(new f2.a1(-1, -2));
        return new f2.q1(k8Var);
    }
}
