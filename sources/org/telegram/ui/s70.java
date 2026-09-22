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
public final class s70 extends org.telegram.ui.Components.xl0 {
    public final Context f37341c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public yt f37342f;
    public String h;
    public int f37343n;
    public final t70 f37344r;

    public s70(t70 t70Var, Context context) {
        this.f37344r = t70Var;
        this.f37341c = context;
        C(true);
    }

    public static void E(s70 s70Var, String str) {
        t70 t70Var = s70Var.f37344r;
        if (t70Var.N) {
            if (!TextUtils.isEmpty(str)) {
                t70Var.d.setBackgroundColor(t70Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19109d6));
            } else {
                t70Var.d.setBackground(null);
            }
        }
        if (s70Var.f37343n != 0) {
            t70Var.getConnectionsManager().cancelRequest(s70Var.f37343n, true);
            s70Var.f37343n = 0;
        }
        yt ytVar = s70Var.f37342f;
        if (ytVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ytVar);
            s70Var.f37342f = null;
        }
        s70Var.h = null;
        int h = s70Var.h();
        if (h > 0) {
            s70Var.d.clear();
            s70Var.e.clear();
            s70Var.t(0, h);
        }
        if (TextUtils.isEmpty(str)) {
            t70Var.f37680b.setVisibility(8);
            t70Var.f37680b.e(false, true);
            return;
        }
        if (t70Var.f37680b.getVisibility() != 0) {
            t70Var.f37680b.setVisibility(0);
            t70Var.f37680b.e(true, false);
        } else {
            t70Var.f37680b.e(true, true);
        }
        yt ytVar2 = new yt(28, s70Var, str);
        s70Var.f37342f = ytVar2;
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
            return ((TLRPC.TL_messages_stickerSet) arrayList.get(i10)).set.f18370id;
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
        org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) c1Var.f42995a;
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
        t70 t70Var = this.f37344r;
        org.telegram.ui.ActionBar.f6 resourceProvider = t70Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str4 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str4.toLowerCase(locale).indexOf(str);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new org.telegram.ui.Components.e10(org.telegram.ui.ActionBar.j6.q6, resourceProvider), indexOf, str.length() + indexOf, 0);
            n8Var.f20715b.setText(spannableString);
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
            n8Var.f20716c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = t70Var.f37684r;
        if (tL_messages_stickerSet2 != null) {
            j3 = tL_messages_stickerSet2.set.f18370id;
        } else if (t70Var.b0(t70Var.v) != null) {
            j3 = t70Var.b0(t70Var.v).f18370id;
        } else {
            j3 = 0;
        }
        if (tL_messages_stickerSet.set.f18370id != j3) {
            z12 = false;
        }
        n8Var.b(z12, false);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.n8 n8Var;
        int i11;
        Context context = this.f37341c;
        if (i10 != 0) {
            int i12 = org.telegram.ui.ActionBar.j6.B6;
            t70 t70Var = this.f37344r;
            org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(this.f37341c, i12, 21, 0, 0, false, false, t70Var.getResourceProvider());
            org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(new ColorDrawable(t70Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19053a7)), org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f19073b7));
            pqVar.f27404w = true;
            n4Var.setBackground(pqVar);
            if (t70Var.N) {
                i11 = R.string.ChooseStickerMyEmojiPacks;
            } else {
                i11 = R.string.ChooseStickerMyStickerSets;
            }
            n4Var.setText(LocaleController.getString(i11));
            n8Var = n4Var;
        } else {
            org.telegram.ui.Cells.n8 n8Var2 = new org.telegram.ui.Cells.n8(context, 3);
            n8Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19109d6, false));
            n8Var = n8Var2;
        }
        n8Var.setLayoutParams(new s4.p0(-1, -2));
        return new s4.c1(n8Var);
    }
}
