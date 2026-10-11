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
public final class r70 extends org.telegram.ui.Components.rm0 {
    public final Context f41342c;
    public ArrayList d = new ArrayList();
    public ArrayList f41343e = new ArrayList();
    public n70 f41344f;
    public String h;
    public int f41345n;
    public final s70 f41346r;

    public r70(s70 s70Var, Context context) {
        this.f41346r = s70Var;
        this.f41342c = context;
        C(true);
    }

    public static void E(r70 r70Var, String str) {
        s70 s70Var = r70Var.f41346r;
        if (s70Var.N) {
            if (!TextUtils.isEmpty(str)) {
                s70Var.d.setBackgroundColor(s70Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20786d6));
            } else {
                s70Var.d.setBackground(null);
            }
        }
        if (r70Var.f41345n != 0) {
            s70Var.getConnectionsManager().cancelRequest(r70Var.f41345n, true);
            r70Var.f41345n = 0;
        }
        n70 n70Var = r70Var.f41344f;
        if (n70Var != null) {
            AndroidUtilities.cancelRunOnUIThread(n70Var);
            r70Var.f41344f = null;
        }
        r70Var.h = null;
        int h = r70Var.h();
        if (h > 0) {
            r70Var.d.clear();
            r70Var.f41343e.clear();
            r70Var.t(0, h);
        }
        if (TextUtils.isEmpty(str)) {
            s70Var.f41615b.setVisibility(8);
            s70Var.f41615b.e(false, true);
            return;
        }
        if (s70Var.f41615b.getVisibility() != 0) {
            s70Var.f41615b.setVisibility(0);
            s70Var.f41615b.e(true, false);
        } else {
            s70Var.f41615b.e(true, true);
        }
        n70 n70Var2 = new n70(2, r70Var, str);
        r70Var.f41344f = n70Var2;
        AndroidUtilities.runOnUIThread(n70Var2, 300L);
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (j(d1Var.b()) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f41343e.size() + this.d.size() + (!this.f41343e.isEmpty());
    }

    @Override
    public final long i(int i10) {
        ArrayList arrayList;
        if (j(i10) == 0) {
            if (i10 > this.d.size()) {
                arrayList = this.f41343e;
            } else {
                arrayList = this.d;
            }
            if (i10 > this.d.size()) {
                i10 = (i10 - this.d.size()) - 1;
            }
            return ((TLRPC.TL_messages_stickerSet) arrayList.get(i10)).set.f20059id;
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
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
        ArrayList arrayList;
        boolean z11;
        String str;
        long j3;
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
            arrayList = this.f41343e;
        } else {
            arrayList = this.d;
        }
        if (z10) {
            i10 = (i10 - this.d.size()) - 1;
        }
        org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) d1Var.f47748a;
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
        s70 s70Var = this.f41346r;
        org.telegram.ui.ActionBar.d6 resourceProvider = s70Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str4 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str4.toLowerCase(locale).indexOf(str);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new org.telegram.ui.Components.v10(org.telegram.ui.ActionBar.h6.q6, resourceProvider), indexOf, str.length() + indexOf, 0);
            m8Var.f22456b.setText(spannableString);
        }
        int indexOf2 = stickerSet.short_name.toLowerCase(locale).indexOf(str);
        if (indexOf2 != -1) {
            if (stickerSet.emojis) {
                str2 = "t.me/addemoji/";
            } else {
                str2 = "t.me/addstickers/";
            }
            int length = str2.length() + indexOf2;
            StringBuilder v = a1.g.v(str2);
            v.append(stickerSet.short_name);
            SpannableString spannableString2 = new SpannableString(v.toString());
            spannableString2.setSpan(new org.telegram.ui.Components.v10(org.telegram.ui.ActionBar.h6.q6, resourceProvider), length, str.length() + length, 0);
            m8Var.f22457c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = s70Var.f41620r;
        if (tL_messages_stickerSet2 != null) {
            j3 = tL_messages_stickerSet2.set.f20059id;
        } else if (s70Var.b0(s70Var.v) != null) {
            j3 = s70Var.b0(s70Var.v).f20059id;
        } else {
            j3 = 0;
        }
        if (tL_messages_stickerSet.set.f20059id != j3) {
            z12 = false;
        }
        m8Var.b(z12, false);
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.m8 m8Var;
        int i11;
        Context context = this.f41342c;
        if (i10 != 0) {
            int i12 = org.telegram.ui.ActionBar.h6.B6;
            s70 s70Var = this.f41346r;
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(this.f41342c, i12, 21, 0, 0, false, false, s70Var.getResourceProvider());
            org.telegram.ui.Components.fr frVar = new org.telegram.ui.Components.fr(new ColorDrawable(s70Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20730a7)), org.telegram.ui.ActionBar.h6.W0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f20750b7));
            frVar.f26475w = true;
            m4Var.setBackground(frVar);
            if (s70Var.N) {
                i11 = R.string.ChooseStickerMyEmojiPacks;
            } else {
                i11 = R.string.ChooseStickerMyStickerSets;
            }
            m4Var.setText(LocaleController.getString(i11));
            m8Var = m4Var;
        } else {
            org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(context, 3);
            m8Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20786d6, false));
            m8Var = m8Var2;
        }
        m8Var.setLayoutParams(new s4.q0(-1, -2));
        return new s4.d1(m8Var);
    }
}
