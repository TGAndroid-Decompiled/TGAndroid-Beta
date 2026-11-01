package th;

import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.dd;
import org.telegram.messenger.i20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.jk0;
import org.telegram.ui.Components.z60;
public final class j3 implements jk0 {
    public final o7 f49115a;
    public final y3 f49116b;

    public j3(y3 y3Var, o7 o7Var) {
        this.f49116b = y3Var;
        this.f49115a = o7Var;
    }

    @Override
    public final boolean f(int i10, View view) {
        final TL_stories.StoryView storyView;
        final wp r12;
        final TLRPC.User Z1;
        boolean z10;
        boolean z11;
        String str;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        TLRPC.InputStickerSet c10;
        y3 y3Var = this.f49116b;
        b bVar = y3Var.f49690s;
        int i11 = y3Var.f49691w;
        if (view instanceof org.telegram.ui.Cells.q6) {
            final org.telegram.ui.Cells.q6 q6Var = (org.telegram.ui.Cells.q6) view;
            o7 o7Var = this.f49115a;
            if (o7Var.f49353w != null && (storyView = ((q3) y3Var.f49692x.f49527c.get(i10)).f49400b) != null && (Z1 = (r12 = wp.r1(i11)).Z1(Long.valueOf(storyView.user_id))) != null) {
                if (r12.G0.indexOfKey(Z1.f19943id) >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!Z1.contact && org.telegram.messenger.i5.r(i11).f16220f0.get(Long.valueOf(Z1.f19943id)) == null) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                boolean d = y3Var.d(storyView);
                boolean N = r12.O1().N(storyView);
                boolean B = i20.B(Z1);
                if (TextUtils.isEmpty(Z1.first_name)) {
                    if (TextUtils.isEmpty(Z1.last_name)) {
                        str = "";
                    } else {
                        str = Z1.last_name;
                    }
                } else {
                    str = Z1.first_name;
                }
                int indexOf = str.indexOf(" ");
                if (indexOf > 2) {
                    str = str.substring(0, indexOf);
                }
                if (B) {
                    return false;
                }
                z60 F = z60.F(o7Var.f49353w, bVar, view);
                F.f33026i = 3;
                F.f33028j = true;
                F.W(new ColorDrawable(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21002h5, bVar)));
                F.f33044s = 133;
                if (d && !N && !z10 && !B) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                final String str2 = str;
                F.l(2131232387, dd.a0(null, null, 2131744681, str), new Runnable(this) {
                    public final j3 f49031b;

                    {
                        this.f49031b = this;
                    }

                    @Override
                    public final void run() {
                        int i12 = r7;
                        float f7 = 0.5f;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.q6 q6Var2 = q6Var;
                        String str3 = str2;
                        TLRPC.User user = Z1;
                        wp wpVar = r12;
                        j3 j3Var = this.f49031b;
                        switch (i12) {
                            case 0:
                                wpVar.O1().m0(user.f19943id, true, true);
                                y3 y3Var2 = j3Var.f49116b;
                                new cc(y3Var2, y3Var2.f49690s).Q(2131624048, 36, dd.a0(null, null, 2131744682, str3)).j();
                                if (y3Var2.d(storyView2)) {
                                    f7 = 1.0f;
                                }
                                q6Var2.a(true, f7);
                                return;
                            default:
                                wpVar.O1().m0(user.f19943id, false, true);
                                y3 y3Var3 = j3Var.f49116b;
                                new cc(y3Var3, y3Var3.f49690s).Q(2131623989, 36, dd.a0(null, null, 2131744487, str3)).j();
                                if (y3Var3.d(storyView2)) {
                                    f7 = 1.0f;
                                }
                                q6Var2.a(true, f7);
                                return;
                        }
                    }
                }, z12);
                F.E();
                F.t();
                if (N && !z10 && !B) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                F.l(2131232222, dd.a0(null, null, 2131744488, str2), new Runnable(this) {
                    public final j3 f49031b;

                    {
                        this.f49031b = this;
                    }

                    @Override
                    public final void run() {
                        int i12 = r7;
                        float f7 = 0.5f;
                        TL_stories.StoryView storyView2 = storyView;
                        org.telegram.ui.Cells.q6 q6Var2 = q6Var;
                        String str3 = str2;
                        TLRPC.User user = Z1;
                        wp wpVar = r12;
                        j3 j3Var = this.f49031b;
                        switch (i12) {
                            case 0:
                                wpVar.O1().m0(user.f19943id, true, true);
                                y3 y3Var2 = j3Var.f49116b;
                                new cc(y3Var2, y3Var2.f49690s).Q(2131624048, 36, dd.a0(null, null, 2131744682, str3)).j();
                                if (y3Var2.d(storyView2)) {
                                    f7 = 1.0f;
                                }
                                q6Var2.a(true, f7);
                                return;
                            default:
                                wpVar.O1().m0(user.f19943id, false, true);
                                y3 y3Var3 = j3Var.f49116b;
                                new cc(y3Var3, y3Var3.f49690s).Q(2131623989, 36, dd.a0(null, null, 2131744487, str3)).j();
                                if (y3Var3.d(storyView2)) {
                                    f7 = 1.0f;
                                }
                                q6Var2.a(true, f7);
                                return;
                        }
                    }
                }, z13);
                F.E();
                F.t();
                if (!z11 && !z10 && !B) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                F.m(2131232414, new Runnable(this) {
                    public final j3 f49074b;

                    {
                        this.f49074b = this;
                    }

                    @Override
                    public final void run() {
                        float f7;
                        float f10;
                        switch (r6) {
                            case 0:
                                r12.w(Z1.f19943id);
                                y3 y3Var2 = this.f49074b.f49116b;
                                new cc(y3Var2, y3Var2.f49690s).e(true).j();
                                if (y3Var2.d(storyView)) {
                                    f7 = 1.0f;
                                } else {
                                    f7 = 0.5f;
                                }
                                q6Var.a(true, f7);
                                return;
                            default:
                                wp wpVar = r12;
                                e5 O1 = wpVar.O1();
                                TLRPC.User user = Z1;
                                O1.m0(user.f19943id, false, true);
                                wpVar.c5(null, user.f19943id);
                                y3 y3Var3 = this.f49074b.f49116b;
                                new cc(y3Var3, y3Var3.f49690s).e(false).j();
                                if (y3Var3.d(storyView)) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.5f;
                                }
                                q6Var.a(true, f10);
                                return;
                        }
                    }
                }, dd.L0(2131753692, null), z14, true);
                if (!z11 && z10 && !B) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                F.l(2131232066, dd.L0(2131743936, null), new Runnable(this) {
                    public final j3 f49074b;

                    {
                        this.f49074b = this;
                    }

                    @Override
                    public final void run() {
                        float f7;
                        float f10;
                        switch (r6) {
                            case 0:
                                r12.w(Z1.f19943id);
                                y3 y3Var2 = this.f49074b.f49116b;
                                new cc(y3Var2, y3Var2.f49690s).e(true).j();
                                if (y3Var2.d(storyView)) {
                                    f7 = 1.0f;
                                } else {
                                    f7 = 0.5f;
                                }
                                q6Var.a(true, f7);
                                return;
                            default:
                                wp wpVar = r12;
                                e5 O1 = wpVar.O1();
                                TLRPC.User user = Z1;
                                O1.m0(user.f19943id, false, true);
                                wpVar.c5(null, user.f19943id);
                                y3 y3Var3 = this.f49074b.f49116b;
                                new cc(y3Var3, y3Var3.f49690s).e(false).j();
                                if (y3Var3.d(storyView)) {
                                    f10 = 1.0f;
                                } else {
                                    f10 = 0.5f;
                                }
                                q6Var.a(true, f10);
                                return;
                        }
                    }
                }, z15);
                if (z11 && !B) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                F.m(2131232414, new rh.r4(this, Z1, str2, q6Var, storyView, 10), dd.L0(2131744705, null), z16, true);
                TLRPC.Reaction reaction = storyView.reaction;
                if ((reaction instanceof TLRPC.TL_reactionCustomEmoji) && (c10 = org.telegram.ui.Components.f5.g(i11).c(((TLRPC.TL_reactionCustomEmoji) reaction).document_id)) != null) {
                    F.k();
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(c10);
                    da0 da0Var = new da0(y3Var.f49691w, 3, y3Var.getContext(), arrayList, bVar);
                    da0Var.setOnClickListener(new rh.e7(this, arrayList, F, 5));
                    F.q(da0Var);
                    z17 = true;
                } else {
                    z17 = false;
                }
                if (F.x() <= 0 && !z17) {
                    return false;
                }
                F.Z();
                try {
                    y3Var.performHapticFeedback(0, 1);
                } catch (Exception unused) {
                }
                return true;
            }
        }
        return false;
    }
}
