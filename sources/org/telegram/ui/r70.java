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
public final class r70 extends org.telegram.ui.Components.ul0 {
    public final Context f36250c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public uv f36251f;
    public String h;
    public int f36252n;
    public final s70 f36253r;

    public r70(s70 s70Var, Context context) {
        this.f36253r = s70Var;
        this.f36250c = context;
        C(true);
    }

    public static void E(r70 r70Var, String str) {
        s70 s70Var = r70Var.f36253r;
        if (s70Var.N) {
            if (!TextUtils.isEmpty(str)) {
                s70Var.d.setBackgroundColor(s70Var.getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
            } else {
                s70Var.d.setBackground(null);
            }
        }
        if (r70Var.f36252n != 0) {
            s70Var.getConnectionsManager().cancelRequest(r70Var.f36252n, true);
            r70Var.f36252n = 0;
        }
        uv uvVar = r70Var.f36251f;
        if (uvVar != null) {
            AndroidUtilities.cancelRunOnUIThread(uvVar);
            r70Var.f36251f = null;
        }
        r70Var.h = null;
        int h = r70Var.h();
        if (h > 0) {
            r70Var.d.clear();
            r70Var.e.clear();
            r70Var.t(0, h);
        }
        if (TextUtils.isEmpty(str)) {
            s70Var.f36567b.setVisibility(8);
            s70Var.f36567b.e(false, true);
            return;
        }
        if (s70Var.f36567b.getVisibility() != 0) {
            s70Var.f36567b.setVisibility(0);
            s70Var.f36567b.e(true, false);
        } else {
            s70Var.f36567b.e(true, true);
        }
        uv uvVar2 = new uv(25, r70Var, str);
        r70Var.f36251f = uvVar2;
        AndroidUtilities.runOnUIThread(uvVar2, 300L);
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
            return ((TLRPC.TL_messages_stickerSet) arrayList.get(i10)).set.f17222id;
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
            arrayList = this.e;
        } else {
            arrayList = this.d;
        }
        if (z10) {
            i10 = (i10 - this.d.size()) - 1;
        }
        org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) c1Var.f41610a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i10);
        if (i10 != arrayList.size() - 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        n8Var.d(tL_messages_stickerSet, z11, !z10);
        String str3 = this.h;
        if (str3 != null) {
            str = str3.toLowerCase(Locale.ROOT);
        } else {
            str = "";
        }
        s70 s70Var = this.f36253r;
        org.telegram.ui.ActionBar.f6 resourceProvider = s70Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str4 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str4.toLowerCase(locale).indexOf(str);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new org.telegram.ui.Components.m10(org.telegram.ui.ActionBar.j6.q6, resourceProvider), indexOf, str.length() + indexOf, 0);
            n8Var.f19573b.setText(spannableString);
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
            spannableString2.setSpan(new org.telegram.ui.Components.m10(org.telegram.ui.ActionBar.j6.q6, resourceProvider), length, str.length() + length, 0);
            n8Var.f19574c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = s70Var.f36571r;
        if (tL_messages_stickerSet2 != null) {
            j3 = tL_messages_stickerSet2.set.f17222id;
        } else if (s70Var.b0(s70Var.v) != null) {
            j3 = s70Var.b0(s70Var.v).f17222id;
        } else {
            j3 = 0;
        }
        if (tL_messages_stickerSet.set.f17222id != j3) {
            z12 = false;
        }
        n8Var.b(z12, false);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.n8 n8Var;
        int i11;
        Context context = this.f36250c;
        if (i10 != 0) {
            int i12 = org.telegram.ui.ActionBar.j6.B6;
            s70 s70Var = this.f36253r;
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(this.f36250c, i12, 21, 0, 0, false, false, s70Var.getResourceProvider());
            org.telegram.ui.Components.vq vqVar = new org.telegram.ui.Components.vq(new ColorDrawable(s70Var.getThemedColor(org.telegram.ui.ActionBar.j6.f17872a7)), org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f17892b7));
            vqVar.f28580w = true;
            m4Var.setBackground(vqVar);
            if (s70Var.N) {
                i11 = R.string.ChooseStickerMyEmojiPacks;
            } else {
                i11 = R.string.ChooseStickerMyStickerSets;
            }
            m4Var.setText(LocaleController.getString(i11));
            n8Var = m4Var;
        } else {
            org.telegram.ui.Cells.n8 n8Var2 = new org.telegram.ui.Cells.n8(context, 3);
            n8Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false));
            n8Var = n8Var2;
        }
        n8Var.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(n8Var);
    }
}
