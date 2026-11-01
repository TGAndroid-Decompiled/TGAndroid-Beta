package vh;

import android.content.Context;
import android.graphics.PorterDuff;
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
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.tc;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.eq;
import org.telegram.ui.g31;
public final class k1 extends s4.g0 {
    public final TLRPC.TL_inputStickerSetShortName E;
    public TLRPC.TL_messages_stickerSet F;
    public TLRPC.TL_messages_stickerSet G;
    public String H;
    public String I;
    public String[] J;
    public int K;
    public final l1 N;
    public int f51386c;
    public boolean f51392x;
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final HashMap f51387f = new HashMap();
    public final ArrayList h = new ArrayList();
    public final ArrayList f51388n = new ArrayList();
    public final ArrayList f51389r = new ArrayList();
    public final ArrayList f51390s = new ArrayList();
    public final ArrayList f51391w = new ArrayList();
    public int f51393y = 0;
    public final SparseIntArray D = new SparseIntArray();
    public final HashSet L = new HashSet();
    public final d0 M = new d0(this, 4);

    public k1(l1 l1Var) {
        this.N = l1Var;
        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
        this.E = tL_inputStickerSetShortName;
        tL_inputStickerSetShortName.short_name = "StaticEmoji";
    }

    public final void D(java.lang.String r27) {
        throw new UnsupportedOperationException("Method not decompiled: vh.k1.D(java.lang.String):void");
    }

    @Override
    public final int b() {
        return this.f51393y;
    }

    @Override
    public final int d(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (this.f51392x && i10 == this.f51393y - 1) {
            return 3;
        }
        if (this.D.get(i10, -1) >= 0) {
            return 1;
        }
        if (i10 >= 0) {
            ArrayList arrayList = this.f51390s;
            if (i10 < arrayList.size() && arrayList.get(i10) == this.N.f51465s.f52003k1) {
                return 4;
            }
            return 2;
        }
        return 2;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        TLRPC.Document document;
        long longValue;
        boolean z10;
        String str;
        TLRPC.StickerSet stickerSet;
        l1 l1Var = this.N;
        u1 u1Var = l1Var.f51465s;
        int i11 = c1Var.f47912f;
        View view = c1Var.f47909a;
        if (i11 == 0) {
            view.setTag(34);
            view.setLayoutParams(new s4.o0(-1, (int) u1Var.f52006o1));
            return;
        }
        boolean z11 = false;
        int i12 = 1;
        if (i11 == 1) {
            int i13 = this.D.get(i10);
            if (i13 >= 0) {
                ArrayList arrayList = this.f51388n;
                if (i13 < arrayList.size()) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i13);
                    if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null) {
                        str = stickerSet.title;
                    } else {
                        str = "";
                    }
                    String str2 = str;
                    org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
                    if (this.I == null) {
                        n8Var.a(0, str2);
                        return;
                    }
                    int indexOf = str2.toLowerCase().indexOf(this.I.toLowerCase());
                    if (indexOf < 0) {
                        n8Var.a(0, str2);
                        return;
                    } else {
                        n8Var.b(str2, 0, null, indexOf, this.I.length());
                        return;
                    }
                }
                return;
            }
            return;
        }
        int i14 = 3;
        if (i11 == 2) {
            ArrayList arrayList2 = this.f51390s;
            if (i10 >= arrayList2.size()) {
                document = null;
            } else {
                document = (TLRPC.Document) arrayList2.get(i10);
            }
            b1 b1Var = (b1) view;
            if (document == u1Var.l1) {
                b1Var.setSticker(null);
                if (b1Var.f50947a == null) {
                    ShapeDrawable d02 = org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(28.0f), -1);
                    int i15 = org.telegram.ui.ActionBar.t6.Bf;
                    org.telegram.ui.ActionBar.w6 L = org.telegram.ui.ActionBar.a7.L(0.12f, i15);
                    org.telegram.ui.ActionBar.a7.l(b1Var, d02, L.f21453a, -1, 2, L.d, u1Var.I0, PorterDuff.Mode.SRC_IN);
                    Drawable mutate = l1Var.getResources().getDrawable(2131231080).mutate();
                    org.telegram.ui.ActionBar.a7.y(b1Var, mutate, i15, u1Var.I0, PorterDuff.Mode.MULTIPLY);
                    eq eqVar = new eq(d02, mutate);
                    int L2 = org.telegram.messenger.i0.L(56.0f);
                    int L3 = org.telegram.messenger.i0.L(56.0f);
                    eqVar.h = L2;
                    eqVar.f25905n = L3;
                    int L4 = org.telegram.messenger.i0.L(24.0f);
                    int L5 = org.telegram.messenger.i0.L(24.0f);
                    eqVar.e = L4;
                    eqVar.f25904f = L5;
                    eqVar.f25906r = true;
                    b1Var.f50947a = eqVar;
                }
                b1Var.setDrawable(b1Var.f50947a);
                return;
            }
            ArrayList arrayList3 = this.f51391w;
            if (i10 >= arrayList3.size()) {
                longValue = 0;
            } else {
                longValue = ((Long) arrayList3.get(i10)).longValue();
            }
            if (document != null || longValue != 0) {
                int i16 = l1Var.f51240a;
                if (i16 == 0) {
                    if (document != null) {
                        b1Var.setSticker(null);
                        if (l1Var.f51240a == 1) {
                            z11 = true;
                        }
                        b1Var.a(document, z11);
                        return;
                    }
                    b1Var.setSticker(null);
                    if (l1Var.f51240a == 1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (b1Var.h != longValue) {
                        org.telegram.ui.Components.f5 f5Var = b1Var.d;
                        if (f5Var != null) {
                            f5Var.n(b1Var);
                        }
                        if (longValue != 0) {
                            b1Var.f50948b = true;
                            b1Var.h = longValue;
                            int i17 = b1Var.f50949c;
                            if (!z10) {
                                i12 = 16388;
                            }
                            if (!tc.e(i12)) {
                                i14 = 13;
                            }
                            org.telegram.ui.Components.f5 m10 = org.telegram.ui.Components.f5.m(i17, longValue, null, i14);
                            b1Var.d = m10;
                            if (b1Var.f50954w) {
                                m10.a(b1Var);
                                return;
                            }
                            return;
                        }
                        b1Var.f50948b = false;
                        b1Var.h = 0L;
                        b1Var.d = null;
                        return;
                    }
                    return;
                }
                if (i16 == 1) {
                    z11 = true;
                }
                b1Var.a(null, z11);
                b1Var.setSticker(document);
            }
        } else if (i11 == 3) {
            i1 i1Var = (i1) view;
            int i18 = this.K;
            if (i1Var.f51288b != i18) {
                i1Var.f51288b = i18;
                g31.D(e20.f15506s0, i1Var.f51287a);
            }
        }
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        boolean z10;
        int i11;
        org.telegram.ui.ActionBar.f5 n8Var;
        l1 l1Var = this.N;
        u1 u1Var = l1Var.f51465s;
        if (i10 == 0) {
            n8Var = new View(l1Var.getContext());
        } else if (i10 == 1) {
            Context context = l1Var.getContext();
            int i12 = u1.f52000y1;
            n8Var = new org.telegram.ui.Cells.n8(context, true, false, u1Var.I0, false);
        } else if (i10 == 3) {
            Context context2 = l1Var.getContext();
            if (l1Var.f51240a == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ?? frameLayout = new FrameLayout(context2);
            frameLayout.f51288b = -1;
            org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context2);
            frameLayout.f51287a = g9Var;
            frameLayout.addView(g9Var, w7.b6.e(36, 36, 17));
            TextView textView = new TextView(context2);
            textView.setTextSize(1, 14.0f);
            textView.setTextColor(-8553090);
            if (z10) {
                i11 = 2131748230;
            } else {
                i11 = 2131748165;
            }
            textView.setText(dd.L0(i11, null));
            frameLayout.addView(textView, w7.b6.d(-2, -2.0f, 17, 0.0f, 34.0f, 0.0f, 0.0f));
            n8Var = frameLayout;
        } else if (i10 == 4) {
            org.telegram.ui.ActionBar.f5 f5Var = new org.telegram.ui.ActionBar.f5(u1Var, l1Var.getContext());
            f5Var.f20327f = new w0(u1Var, 2);
            n8Var = f5Var;
        } else {
            n8Var = new b1(l1Var.getContext(), l1Var.f51460b);
        }
        return new s4.c1(n8Var);
    }
}
