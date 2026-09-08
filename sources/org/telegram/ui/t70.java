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
public final class t70 extends org.telegram.ui.Components.kl0 {
    public final Context f40670c;
    public ArrayList d = new ArrayList();
    public ArrayList f40671e = new ArrayList();
    public yt f40672f;
    public String h;
    public int f40673n;
    public final u70 f40674r;

    public t70(u70 u70Var, Context context) {
        this.f40674r = u70Var;
        this.f40670c = context;
        C(true);
    }

    public static void E(t70 t70Var, String str) {
        u70 u70Var = t70Var.f40674r;
        if (u70Var.N) {
            if (!TextUtils.isEmpty(str)) {
                u70Var.d.setBackgroundColor(u70Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20690d6));
            } else {
                u70Var.d.setBackground(null);
            }
        }
        if (t70Var.f40673n != 0) {
            u70Var.getConnectionsManager().cancelRequest(t70Var.f40673n, true);
            t70Var.f40673n = 0;
        }
        yt ytVar = t70Var.f40672f;
        if (ytVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ytVar);
            t70Var.f40672f = null;
        }
        t70Var.h = null;
        int h = t70Var.h();
        if (h > 0) {
            t70Var.d.clear();
            t70Var.f40671e.clear();
            t70Var.t(0, h);
        }
        if (TextUtils.isEmpty(str)) {
            u70Var.f40982b.setVisibility(8);
            u70Var.f40982b.e(false, true);
            return;
        }
        if (u70Var.f40982b.getVisibility() != 0) {
            u70Var.f40982b.setVisibility(0);
            u70Var.f40982b.e(true, false);
        } else {
            u70Var.f40982b.e(true, true);
        }
        yt ytVar2 = new yt(28, t70Var, str);
        t70Var.f40672f = ytVar2;
        AndroidUtilities.runOnUIThread(ytVar2, 300L);
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (j(c1Var.b()) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f40671e.size() + this.d.size() + (!this.f40671e.isEmpty());
    }

    @Override
    public final long i(int i10) {
        ArrayList arrayList;
        if (j(i10) == 0) {
            if (i10 > this.d.size()) {
                arrayList = this.f40671e;
            } else {
                arrayList = this.d;
            }
            if (i10 > this.d.size()) {
                i10 = (i10 - this.d.size()) - 1;
            }
            return ((TLRPC.TL_messages_stickerSet) arrayList.get(i10)).set.f19923id;
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
    public final void v(s4.c1 c1Var, int i10) {
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
            arrayList = this.f40671e;
        } else {
            arrayList = this.d;
        }
        if (z10) {
            i10 = (i10 - this.d.size()) - 1;
        }
        org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) c1Var.f45766a;
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
        u70 u70Var = this.f40674r;
        org.telegram.ui.ActionBar.f6 resourceProvider = u70Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str4 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str4.toLowerCase(locale).indexOf(str);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new org.telegram.ui.Components.e10(org.telegram.ui.ActionBar.j6.q6, resourceProvider), indexOf, str.length() + indexOf, 0);
            m8Var.f22322b.setText(spannableString);
        }
        int indexOf2 = stickerSet.short_name.toLowerCase(locale).indexOf(str);
        if (indexOf2 != -1) {
            if (stickerSet.emojis) {
                str2 = "t.me/addemoji/";
            } else {
                str2 = "t.me/addstickers/";
            }
            int length = str2.length() + indexOf2;
            StringBuilder u10 = a4.a.u(str2);
            u10.append(stickerSet.short_name);
            SpannableString spannableString2 = new SpannableString(u10.toString());
            spannableString2.setSpan(new org.telegram.ui.Components.e10(org.telegram.ui.ActionBar.j6.q6, resourceProvider), length, str.length() + length, 0);
            m8Var.f22323c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = u70Var.f40987r;
        if (tL_messages_stickerSet2 != null) {
            j3 = tL_messages_stickerSet2.set.f19923id;
        } else if (u70Var.b0(u70Var.v) != null) {
            j3 = u70Var.b0(u70Var.v).f19923id;
        } else {
            j3 = 0;
        }
        if (tL_messages_stickerSet.set.f19923id != j3) {
            z12 = false;
        }
        m8Var.b(z12, false);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.m8 m8Var;
        int i11;
        Context context = this.f40670c;
        if (i10 != 0) {
            int i12 = org.telegram.ui.ActionBar.j6.B6;
            u70 u70Var = this.f40674r;
            org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(this.f40670c, i12, 21, 0, 0, false, false, u70Var.getResourceProvider());
            org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(new ColorDrawable(u70Var.getThemedColor(org.telegram.ui.ActionBar.j6.f20634a7)), org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f20654b7));
            oqVar.f29194w = true;
            l4Var.setBackground(oqVar);
            if (u70Var.N) {
                i11 = R.string.ChooseStickerMyEmojiPacks;
            } else {
                i11 = R.string.ChooseStickerMyStickerSets;
            }
            l4Var.setText(LocaleController.getString(i11));
            m8Var = l4Var;
        } else {
            org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(context, 3);
            m8Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20690d6, false));
            m8Var = m8Var2;
        }
        m8Var.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(m8Var);
    }
}
