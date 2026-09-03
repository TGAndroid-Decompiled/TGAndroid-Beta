package qh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.pq;
import org.telegram.ui.w61;
public final class m1 extends f2.p0 {
    public final TLRPC.TL_inputStickerSetShortName B;
    public TLRPC.TL_messages_stickerSet C;
    public TLRPC.TL_messages_stickerSet D;
    public String E;
    public String F;
    public String[] G;
    public int H;
    public final n1 K;
    public int f45732c;
    public boolean f45738w;
    public final HashMap d = new HashMap();
    public final HashMap f45733e = new HashMap();
    public final HashMap f45734f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f45735n = new ArrayList();
    public final ArrayList f45736r = new ArrayList();
    public final ArrayList f45737s = new ArrayList();
    public final ArrayList v = new ArrayList();
    public int f45739x = 0;
    public final SparseIntArray f45740y = new SparseIntArray();
    public final HashSet I = new HashSet();
    public final org.telegram.ui.web.s0 J = new org.telegram.ui.web.s0(this, 15);

    public m1(n1 n1Var) {
        this.K = n1Var;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        this.B = tL_inputStickerSetShortName;
        tL_inputStickerSetShortName.short_name = "StaticEmoji";
    }

    public final void D(java.lang.String r27) {
        throw new UnsupportedOperationException("Method not decompiled: qh.m1.D(java.lang.String):void");
    }

    @Override
    public final int h() {
        return this.f45739x;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (this.f45738w && i10 == this.f45739x - 1) {
            return 3;
        }
        if (this.f45740y.get(i10, -1) >= 0) {
            return 1;
        }
        if (i10 >= 0) {
            ArrayList arrayList = this.f45737s;
            if (i10 < arrayList.size() && arrayList.get(i10) == this.K.f45798s.d) {
                return 4;
            }
            return 2;
        }
        return 2;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        TLRPC.Document document;
        long longValue;
        boolean z4;
        String str;
        TLRPC.StickerSet stickerSet;
        n1 n1Var = this.K;
        x1 x1Var = n1Var.f45798s;
        int i11 = m1Var.f5879f;
        View view = m1Var.f5875a;
        if (i11 == 0) {
            view.setTag(34);
            view.setLayoutParams(new f2.x0(-1, (int) x1Var.f46302n));
            return;
        }
        boolean z10 = false;
        int i12 = 1;
        if (i11 == 1) {
            int i13 = this.f45740y.get(i10);
            if (i13 >= 0) {
                ArrayList arrayList = this.f45735n;
                if (i13 < arrayList.size()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i13);
                    if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null) {
                        str = stickerSet.title;
                    } else {
                        str = "";
                    }
                    String str2 = str;
                    org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                    if (this.F == null) {
                        m8Var.b(0, str2);
                        return;
                    }
                    int indexOf = str2.toLowerCase().indexOf(this.F.toLowerCase());
                    if (indexOf < 0) {
                        m8Var.b(0, str2);
                        return;
                    } else {
                        m8Var.c(str2, 0, null, indexOf, this.F.length());
                        return;
                    }
                }
                return;
            }
            return;
        }
        int i14 = 3;
        if (i11 == 2) {
            ArrayList arrayList2 = this.f45737s;
            if (i10 >= arrayList2.size()) {
                document = null;
            } else {
                document = (TLRPC.Document) arrayList2.get(i10);
            }
            c1 c1Var = (c1) view;
            if (document == x1Var.f46300e) {
                c1Var.setSticker(null);
                int dp = AndroidUtilities.dp(28.0f);
                int i15 = org.telegram.ui.ActionBar.k6.Me;
                ShapeDrawable b02 = org.telegram.ui.ActionBar.k6.b0(dp, org.telegram.ui.ActionBar.k6.l1(0.12f, x1Var.getThemedColor(i15)));
                Drawable mutate = n1Var.getResources().getDrawable(R.drawable.filled_add_sticker).mutate();
                mutate.setColorFilter(new PorterDuffColorFilter(x1Var.getThemedColor(i15), PorterDuff.Mode.MULTIPLY));
                pq pqVar = new pq(b02, mutate);
                int dp2 = AndroidUtilities.dp(56.0f);
                int dp3 = AndroidUtilities.dp(56.0f);
                pqVar.h = dp2;
                pqVar.f30163n = dp3;
                int dp4 = AndroidUtilities.dp(24.0f);
                int dp5 = AndroidUtilities.dp(24.0f);
                pqVar.f30161e = dp4;
                pqVar.f30162f = dp5;
                pqVar.f30164r = true;
                c1Var.setDrawable(pqVar);
                return;
            }
            ArrayList arrayList3 = this.v;
            if (i10 >= arrayList3.size()) {
                longValue = 0;
            } else {
                longValue = ((Long) arrayList3.get(i10)).longValue();
            }
            if (document != null || longValue != 0) {
                int i16 = n1Var.f45424a;
                if (i16 == 0) {
                    if (document != null) {
                        c1Var.setSticker(null);
                        if (n1Var.f45424a == 1) {
                            z10 = true;
                        }
                        c1Var.a(document, z10);
                        return;
                    }
                    c1Var.setSticker(null);
                    if (n1Var.f45424a == 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (c1Var.f45143f != longValue) {
                        org.telegram.ui.Components.l5 l5Var = c1Var.f45141c;
                        if (l5Var != null) {
                            l5Var.o(c1Var);
                        }
                        if (longValue != 0) {
                            c1Var.f45139a = true;
                            c1Var.f45143f = longValue;
                            int i17 = c1Var.f45140b;
                            if (!z4) {
                                i12 = 16388;
                            }
                            if (!LiteMode.isEnabled(i12)) {
                                i14 = 13;
                            }
                            org.telegram.ui.Components.l5 n10 = org.telegram.ui.Components.l5.n(i17, longValue, null, i14);
                            c1Var.f45141c = n10;
                            if (c1Var.f45146s) {
                                n10.a(c1Var);
                                return;
                            }
                            return;
                        }
                        c1Var.f45139a = false;
                        c1Var.f45143f = 0L;
                        c1Var.f45141c = null;
                        return;
                    }
                    return;
                }
                if (i16 == 1) {
                    z10 = true;
                }
                c1Var.a(null, z10);
                c1Var.setSticker(document);
            }
        } else if (i11 == 3) {
            j1 j1Var = (j1) view;
            int i18 = this.H;
            if (j1Var.f45518b != i18) {
                j1Var.f45518b = i18;
                w61.D(UserConfig.selectedAccount, j1Var.f45517a);
            }
        }
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        boolean z4;
        int i11;
        org.telegram.ui.ActionBar.g6 g6Var;
        v1 m8Var;
        n1 n1Var = this.K;
        x1 x1Var = n1Var.f45798s;
        if (i10 == 0) {
            m8Var = new View(n1Var.getContext());
        } else if (i10 == 1) {
            Context context = n1Var.getContext();
            g6Var = ((org.telegram.ui.ActionBar.h3) x1Var).resourcesProvider;
            m8Var = new org.telegram.ui.Cells.m8(context, true, false, g6Var, false);
        } else if (i10 == 3) {
            Context context2 = n1Var.getContext();
            if (n1Var.f45424a == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            ?? frameLayout = new FrameLayout(context2);
            frameLayout.f45518b = -1;
            org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context2);
            frameLayout.f45517a = p9Var;
            frameLayout.addView(p9Var, k7.c6.e(36, 36, 17));
            TextView textView = new TextView(context2);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-8553090);
            if (z4) {
                i11 = R.string.NoEmojiFound;
            } else {
                i11 = R.string.NoStickersFound;
            }
            textView.setText(LocaleController.getString(i11));
            frameLayout.addView(textView, k7.c6.d(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
            m8Var = frameLayout;
        } else if (i10 == 4) {
            v1 v1Var = new v1(x1Var, n1Var.getContext());
            v1Var.f46201e = new w0(x1Var, 2);
            m8Var = v1Var;
        } else {
            m8Var = new c1(n1Var.getContext(), n1Var.f45792b);
        }
        return new f2.m1(m8Var);
    }
}
