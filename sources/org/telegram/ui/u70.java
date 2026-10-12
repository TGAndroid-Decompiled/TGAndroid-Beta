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
public final class u70 extends org.telegram.ui.Components.vm0 {
    public final Context f42388c;
    public ArrayList d = new ArrayList();
    public ArrayList f42389e = new ArrayList();
    public q70 f42390f;
    public String h;
    public int f42391n;
    public final v70 f42392r;

    public u70(v70 v70Var, Context context) {
        this.f42392r = v70Var;
        this.f42388c = context;
        C(true);
    }

    public static void E(u70 u70Var, String str) {
        v70 v70Var = u70Var.f42392r;
        if (v70Var.N) {
            if (!TextUtils.isEmpty(str)) {
                v70Var.d.setBackgroundColor(v70Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20560d6));
            } else {
                v70Var.d.setBackground(null);
            }
        }
        if (u70Var.f42391n != 0) {
            v70Var.getConnectionsManager().cancelRequest(u70Var.f42391n, true);
            u70Var.f42391n = 0;
        }
        q70 q70Var = u70Var.f42390f;
        if (q70Var != null) {
            AndroidUtilities.cancelRunOnUIThread(q70Var);
            u70Var.f42390f = null;
        }
        u70Var.h = null;
        int h = u70Var.h();
        if (h > 0) {
            u70Var.d.clear();
            u70Var.f42389e.clear();
            u70Var.t(0, h);
        }
        if (TextUtils.isEmpty(str)) {
            v70Var.f42697b.setVisibility(8);
            v70Var.f42697b.e(false, true);
            return;
        }
        if (v70Var.f42697b.getVisibility() != 0) {
            v70Var.f42697b.setVisibility(0);
            v70Var.f42697b.e(true, false);
        } else {
            v70Var.f42697b.e(true, true);
        }
        q70 q70Var2 = new q70(1, u70Var, str);
        u70Var.f42390f = q70Var2;
        AndroidUtilities.runOnUIThread(q70Var2, 300L);
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
        return this.f42389e.size() + this.d.size() + (!this.f42389e.isEmpty());
    }

    @Override
    public final long i(int i10) {
        ArrayList arrayList;
        if (j(i10) == 0) {
            if (i10 > this.d.size()) {
                arrayList = this.f42389e;
            } else {
                arrayList = this.d;
            }
            if (i10 > this.d.size()) {
                i10 = (i10 - this.d.size()) - 1;
            }
            return ((TLRPC.TL_messages_stickerSet) arrayList.get(i10)).set.f19830id;
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
            arrayList = this.f42389e;
        } else {
            arrayList = this.d;
        }
        if (z10) {
            i10 = (i10 - this.d.size()) - 1;
        }
        org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) d1Var.f47897a;
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
        v70 v70Var = this.f42392r;
        org.telegram.ui.ActionBar.c6 resourceProvider = v70Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str4 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str4.toLowerCase(locale).indexOf(str);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new org.telegram.ui.Components.x10(org.telegram.ui.ActionBar.h6.q6, resourceProvider), indexOf, str.length() + indexOf, 0);
            m8Var.f22228b.setText(spannableString);
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
            spannableString2.setSpan(new org.telegram.ui.Components.x10(org.telegram.ui.ActionBar.h6.q6, resourceProvider), length, str.length() + length, 0);
            m8Var.f22229c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = v70Var.f42702r;
        if (tL_messages_stickerSet2 != null) {
            j3 = tL_messages_stickerSet2.set.f19830id;
        } else if (v70Var.b0(v70Var.v) != null) {
            j3 = v70Var.b0(v70Var.v).f19830id;
        } else {
            j3 = 0;
        }
        if (tL_messages_stickerSet.set.f19830id != j3) {
            z12 = false;
        }
        m8Var.b(z12, false);
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.m8 m8Var;
        int i11;
        Context context = this.f42388c;
        if (i10 != 0) {
            int i12 = org.telegram.ui.ActionBar.h6.B6;
            v70 v70Var = this.f42392r;
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(this.f42388c, i12, 21, 0, 0, false, false, v70Var.getResourceProvider());
            org.telegram.ui.Components.hr hrVar = new org.telegram.ui.Components.hr(new ColorDrawable(v70Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20504a7)), org.telegram.ui.ActionBar.h6.W0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f20524b7));
            hrVar.f26883w = true;
            m4Var.setBackground(hrVar);
            if (v70Var.N) {
                i11 = R.string.ChooseStickerMyEmojiPacks;
            } else {
                i11 = R.string.ChooseStickerMyStickerSets;
            }
            m4Var.setText(LocaleController.getString(i11));
            m8Var = m4Var;
        } else {
            org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(context, 3);
            m8Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20560d6, false));
            m8Var = m8Var2;
        }
        m8Var.setLayoutParams(new s4.q0(-1, -2));
        return new s4.d1(m8Var);
    }
}
