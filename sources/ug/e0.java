package ug;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import hi.ia;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.gd;
import org.telegram.messenger.i5;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.h4;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.y6;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.r80;
import org.telegram.ui.Components.wz;
public final class e0 extends bk0 {
    public final l0 f58646c;

    public e0(l0 l0Var) {
        this.f58646c = l0Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        l0 l0Var = this.f58646c;
        int i7 = l0Var.d2;
        if ((i7 != 11 && i7 != 34) || l0Var.U1) {
            int i10 = f1Var.f59126f;
            if (i10 == 1 || i10 == 4) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f58646c.f58733g2;
    }

    @Override
    public final int d(int i7) {
        int i10;
        l0 l0Var = this.f58646c;
        if (l0Var.f58734h2 == i7) {
            return 0;
        }
        if (l0Var.f58735i2 == i7) {
            return 2;
        }
        if (l0Var.f58736j2 == i7) {
            return 3;
        }
        if (l0Var.f58739m2 == i7) {
            return 5;
        }
        if (l0Var.f58740n2 == i7) {
            return 6;
        }
        if (l0Var.V1 == i7) {
            return 7;
        }
        if (l0Var.f58741o2 == i7) {
            return 8;
        }
        ArrayList arrayList = l0Var.f58743q2;
        if (arrayList != null && i7 >= (i10 = l0Var.f58742p2) && i7 <= arrayList.size() + i10) {
            return 9;
        }
        int i11 = l0Var.d2;
        if (i11 != 5 && i11 != 11 && i11 != 34) {
            return 1;
        }
        return 4;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        String str;
        boolean z10;
        TL_account.requirementToContactPremium requirementtocontactpremium;
        String d02;
        l0 l0Var = this.f58646c;
        int i10 = l0Var.d2;
        HashSet hashSet = l0Var.f58747u2;
        int i11 = f1Var.f59126f;
        View view = f1Var.f59122a;
        boolean z11 = false;
        boolean z12 = true;
        if (i11 != 1) {
            if (i11 != 9) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        h4 h4Var = (h4) view;
                        if (i10 == 5) {
                            TLRPC.Chat chat = (TLRPC.Chat) l0Var.f58748v2.get(i7 - l0Var.f58737k2);
                            String str2 = (String) l0Var.f58749w2.get(i7 - l0Var.f58737k2);
                            String str3 = chat.title;
                            if (i7 == l0Var.f58738l2 - 1.0f) {
                                z12 = false;
                            }
                            h4Var.e(chat, str3, str2, z12);
                            h4Var.c(hashSet.contains(chat), false);
                            return;
                        } else if (i10 == 11 || i10 == 34) {
                            TLRPC.User user = (TLRPC.User) l0Var.f58750x2.get(i7 - l0Var.f58737k2);
                            ArrayList arrayList = l0Var.f58751y2;
                            if (arrayList != null && arrayList.contains(Long.valueOf(user.f28554id))) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                requirementtocontactpremium = new TL_account.requirementToContactPremium();
                            } else {
                                requirementtocontactpremium = null;
                            }
                            h4Var.S = true;
                            h4Var.R = requirementtocontactpremium;
                            h4Var.g();
                            if (z10) {
                                d02 = gd.M0(2131748934, null);
                            } else {
                                d02 = gd.d0(l0Var.f30189a, user, null, null);
                            }
                            String m10 = i5.m(0, user.first_name, user.last_name);
                            if (i7 == l0Var.f58738l2 - 1.0f) {
                                z12 = false;
                            }
                            h4Var.e(user, m10, d02, z12);
                            h4Var.c(hashSet.contains(user), false);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                n4 n4Var = (n4) view;
                if (i10 != 11 && i10 != 34) {
                    if (i10 == 2) {
                        n4Var.setText(gd.M0(2131742533, null));
                        return;
                    } else {
                        n4Var.setText(gd.M0(2131748841, null));
                        return;
                    }
                } else if (l0Var.U1) {
                    n4Var.setText(gd.M0(2131752391, null));
                    return;
                } else if (l0Var.f58750x2.size() == 1) {
                    n4Var.setText(gd.M0(2131752388, null));
                    return;
                } else {
                    n4Var.setText(gd.M0(2131752387, null));
                    return;
                }
            }
            int i12 = i7 - l0Var.f58742p2;
            ArrayList arrayList2 = l0Var.f58743q2;
            if (arrayList2 != null && i12 >= 0 && i12 < arrayList2.size()) {
                h0 h0Var = (h0) view;
                g0 g0Var = (g0) l0Var.f58743q2.get(i12);
                di.n4 n4Var2 = h0Var.f58668c;
                ImageView imageView = h0Var.f58666a;
                n5 n5Var = h0Var.f58667b;
                if (g0Var instanceof f0) {
                    h0Var.f58670f = (f0) g0Var;
                    h0Var.f58669e = null;
                    imageView.setVisibility(8);
                    n5Var.setVisibility(8);
                    n4Var2.setVisibility(0);
                    n5 n5Var2 = h0Var.d;
                    f0 f0Var = h0Var.f58670f;
                    if (f0Var.h) {
                        str = "BoostLevelUnlocks";
                    } else {
                        str = "BoostLevel";
                    }
                    n5Var2.l(gd.G(f0Var.f58651g, str, new Object[0]), false);
                    return;
                } else if (g0Var != null) {
                    h0Var.f58670f = null;
                    h0Var.f58669e = g0Var;
                    imageView.setVisibility(0);
                    imageView.setImageResource(h0Var.f58669e.f58658a);
                    n5Var.setVisibility(0);
                    g0 g0Var2 = h0Var.f58669e;
                    String str4 = "";
                    if (g0Var2.d != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(h0Var.f58669e.d);
                        sb2.append("_");
                        int i13 = h0Var.f58669e.f58661e;
                        gd.E0();
                        sb2.append(gd.f1(gd.E0().A.a(i13)));
                        String N0 = gd.N0(sb2.toString());
                        if (N0 == null || N0.startsWith("LOC_ERR")) {
                            N0 = gd.N0(h0Var.f58669e.d + "_other");
                        }
                        if (N0 == null) {
                            N0 = "";
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N0);
                        int indexOf = N0.indexOf("%d");
                        if (indexOf >= 0) {
                            spannableStringBuilder = new SpannableStringBuilder(N0);
                            SpannableString spannableString = new SpannableString(a8.p0.n(h0Var.f58669e.f58661e, "", new StringBuilder()));
                            spannableString.setSpan(new i41(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
                            spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) spannableString);
                        }
                        n5Var.l(spannableStringBuilder, false);
                    } else {
                        String M0 = gd.M0(g0Var2.f58659b, null);
                        if (M0 != null) {
                            str4 = M0;
                        }
                        if (h0Var.f58669e.f58660c != null) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str4);
                            int indexOf2 = str4.indexOf("%s");
                            if (indexOf2 >= 0) {
                                spannableStringBuilder2 = new SpannableStringBuilder(str4);
                                SpannableString spannableString2 = new SpannableString(h0Var.f58669e.f58660c);
                                spannableString2.setSpan(new i41(org.telegram.messenger.g0.o()), 0, spannableString2.length(), 33);
                                spannableStringBuilder2.replace(indexOf2, indexOf2 + 2, (CharSequence) spannableString2);
                            }
                            n5Var.l(spannableStringBuilder2, false);
                        } else {
                            n5Var.l(str4, false);
                        }
                    }
                    n4Var2.setVisibility(8);
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        TLRPC.Chat chat2 = (TLRPC.Chat) l0Var.f58731e2.get(i7 - l0Var.f58737k2);
        org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) view;
        TLRPC.Chat currentChannel = nVar.getCurrentChannel();
        nVar.a(chat2, false);
        boolean contains = hashSet.contains(chat2);
        if (currentChannel == chat2) {
            z11 = true;
        }
        nVar.f31100r.a(contains, z11);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        int i10;
        k0 k0Var;
        float f10;
        int i11;
        Context context = viewGroup.getContext();
        l0 l0Var = this.f58646c;
        switch (i7) {
            case 1:
                k0Var = new org.telegram.ui.Cells.n(context, new d0(this), true, 9);
                break;
            case 2:
                int i12 = n6.f29339a7;
                View y6Var = new y6(context, n6.w0(i12, l0Var.J0), 0);
                u6.h(i12, y6Var, l0Var.J0);
                k0Var = y6Var;
                break;
            case 3:
                View n4Var = new n4(context);
                n4Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
                k0Var = n4Var;
                break;
            case 4:
                View h4Var = new h4(1, 0, context, l0Var.J0, false, false);
                int i13 = l0Var.f30227u0;
                h4Var.setPadding(i13, 0, i13, 0);
                k0Var = h4Var;
                break;
            case 5:
                wz wzVar = new wz(context, null);
                if (l0Var.d2 == 2) {
                    i10 = 22;
                } else {
                    i10 = 21;
                }
                wzVar.setViewType(i10);
                wzVar.setIsSingleCell(true);
                wzVar.setIgnoreHeightCheck(true);
                wzVar.setItemsCount(10);
                k0Var = wzVar;
                break;
            case 6:
                k0Var = new jn(l0Var.getContext(), 28);
                break;
            case 7:
                FrameLayout frameLayout = new FrameLayout(l0Var.getContext());
                frameLayout.setPadding(org.telegram.messenger.g0.L(6.0f) + l0Var.f30227u0, 0, org.telegram.messenger.g0.L(6.0f) + l0Var.f30227u0, 0);
                TextView textView = new TextView(context);
                if (l0Var.M2 == null && v3.N(l0Var.o1())) {
                    l0Var.M2 = new org.telegram.ui.web.z0(this, 24);
                }
                int L = org.telegram.messenger.g0.L(18.0f);
                int L2 = org.telegram.messenger.g0.L(13.0f);
                if (l0Var.M2 == null) {
                    f10 = 18.0f;
                } else {
                    f10 = 50.0f;
                }
                textView.setPadding(L, L2, org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(13.0f));
                textView.setTextSize(1, 16.0f);
                textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                textView.setSingleLine(true);
                frameLayout.addView(textView, ma.d(-1, -2.0f, 0, 11.0f, 0.0f, 11.0f, 0.0f));
                int L3 = org.telegram.messenger.g0.L(8.0f);
                int i14 = n6.f29416e7;
                int w02 = n6.w0(i14, l0Var.J0);
                int i15 = n6.f29488i6;
                int o4 = i0.a.o(n6.w0(i15, l0Var.J0), 76);
                org.telegram.ui.Cells.y k02 = n6.k0(L3, L3, L3, L3, w02, o4, o4);
                q6 M = u6.M(i14);
                q6 g10 = u6.g(i15, 76);
                i6 i6Var = l0Var.J0;
                textView.setBackground(k02);
                u6.j(textView, k02, M, g10, i6Var);
                u6.U(textView, n6.G6, l0Var.J0);
                textView.setOnClickListener(new View.OnClickListener(this) {
                    public final e0 f58624b;

                    {
                        this.f58624b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                l0 l0Var2 = this.f58624b.f58646c;
                                wg.l.J0(l0Var2.f39538s1, l0Var2.J0, l0Var2.W1, null);
                                return;
                            case 1:
                                l0 l0Var3 = this.f58624b.f58646c;
                                org.telegram.messenger.g0.g(l0Var3.l1());
                                l0Var3.dismiss();
                                return;
                            case 2:
                                org.telegram.messenger.g0.g(this.f58624b.f58646c.l1());
                                return;
                            default:
                                l0 l0Var4 = this.f58624b.f58646c;
                                l0Var4.M2.run();
                                l0Var4.dismiss();
                                return;
                        }
                    }
                });
                if (l0Var.M2 != null) {
                    ImageView imageView = new ImageView(l0Var.getContext());
                    imageView.setImageResource(2131232380);
                    u6.s(imageView, n6.f29504j5, l0Var.J0, PorterDuff.Mode.SRC_ATOP);
                    imageView.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                    int L4 = org.telegram.messenger.g0.L(20.0f);
                    int o10 = i0.a.o(n6.w0(i15, l0Var.J0), 76);
                    org.telegram.ui.Cells.y k03 = n6.k0(L4, L4, L4, L4, 0, o10, o10);
                    q6 g11 = u6.g(i15, 76);
                    i6 i6Var2 = l0Var.J0;
                    imageView.setBackground(k03);
                    u6.j(imageView, k03, null, g11, i6Var2);
                    frameLayout.addView(imageView, ma.d(40, 40.0f, 21, 15.0f, 0.0f, 15.0f, 0.0f));
                    imageView.setOnClickListener(new View.OnClickListener(this) {
                        public final e0 f58624b;

                        {
                            this.f58624b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    l0 l0Var2 = this.f58624b.f58646c;
                                    wg.l.J0(l0Var2.f39538s1, l0Var2.J0, l0Var2.W1, null);
                                    return;
                                case 1:
                                    l0 l0Var3 = this.f58624b.f58646c;
                                    org.telegram.messenger.g0.g(l0Var3.l1());
                                    l0Var3.dismiss();
                                    return;
                                case 2:
                                    org.telegram.messenger.g0.g(this.f58624b.f58646c.l1());
                                    return;
                                default:
                                    l0 l0Var4 = this.f58624b.f58646c;
                                    l0Var4.M2.run();
                                    l0Var4.dismiss();
                                    return;
                            }
                        }
                    });
                }
                textView.setText(l0Var.l1());
                textView.setGravity(17);
                k0Var = frameLayout;
                break;
            case 8:
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setPadding(org.telegram.messenger.g0.L(6.0f) + l0Var.f30227u0, 0, org.telegram.messenger.g0.L(6.0f) + l0Var.f30227u0, 0);
                linearLayout.setOrientation(1);
                r80 r80Var = new r80(context);
                k80 k80Var = new k80(context, null);
                if (l0Var.s1()) {
                    i11 = 2131753187;
                } else {
                    i11 = 2131753188;
                }
                SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(gd.M0(i11, null));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gd.M0(2131753186, null));
                spannableStringBuilder.setSpan(new ia(this, 10), 0, spannableStringBuilder.length(), 33);
                SpannableString spannableString = new SpannableString(">");
                Drawable mutate = l0Var.getContext().getResources().getDrawable(2131232061).mutate();
                int i16 = n6.Xc;
                mutate.setColorFilter(new PorterDuffColorFilter(i16, PorterDuff.Mode.SRC_IN));
                lq lqVar = new lq(0, mutate);
                lqVar.a(i16);
                lqVar.c(org.telegram.messenger.g0.L(18.0f));
                lqVar.F = org.telegram.messenger.g0.L(11.0f);
                lqVar.f37198r = -org.telegram.messenger.g0.L(5.0f);
                spannableString.setSpan(lqVar, 0, spannableString.length(), 33);
                k80Var.setText(TextUtils.concat(W2, " ", org.telegram.messenger.g0.K2(spannableStringBuilder, spannableString, ">")));
                k80Var.setTextSize(1, 14.0f);
                k80Var.setLineSpacing(org.telegram.messenger.g0.L(3.0f), 1.0f);
                i6 i6Var3 = l0Var.J0;
                if (i6Var3 instanceof fi.b) {
                    u6.U(k80Var, n6.f29788y6, i6Var3);
                } else {
                    u6.U(k80Var, n6.G6, i6Var3);
                }
                k80Var.setGravity(1);
                k80Var.setOnClickListener(new View.OnClickListener(this) {
                    public final e0 f58624b;

                    {
                        this.f58624b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                l0 l0Var2 = this.f58624b.f58646c;
                                wg.l.J0(l0Var2.f39538s1, l0Var2.J0, l0Var2.W1, null);
                                return;
                            case 1:
                                l0 l0Var3 = this.f58624b.f58646c;
                                org.telegram.messenger.g0.g(l0Var3.l1());
                                l0Var3.dismiss();
                                return;
                            case 2:
                                org.telegram.messenger.g0.g(this.f58624b.f58646c.l1());
                                return;
                            default:
                                l0 l0Var4 = this.f58624b.f58646c;
                                l0Var4.M2.run();
                                l0Var4.dismiss();
                                return;
                        }
                    }
                });
                r80Var.setOnClickListener(new sh.b(k80Var, 3));
                if (l0Var.t1()) {
                    hi.d dVar = new hi.d(context, l0Var.J0, true);
                    dVar.i(gd.M0(2131751756, null), false, true);
                    dVar.setOnClickListener(new View.OnClickListener(this) {
                        public final e0 f58624b;

                        {
                            this.f58624b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    l0 l0Var2 = this.f58624b.f58646c;
                                    wg.l.J0(l0Var2.f39538s1, l0Var2.J0, l0Var2.W1, null);
                                    return;
                                case 1:
                                    l0 l0Var3 = this.f58624b.f58646c;
                                    org.telegram.messenger.g0.g(l0Var3.l1());
                                    l0Var3.dismiss();
                                    return;
                                case 2:
                                    org.telegram.messenger.g0.g(this.f58624b.f58646c.l1());
                                    return;
                                default:
                                    l0 l0Var4 = this.f58624b.f58646c;
                                    l0Var4.M2.run();
                                    l0Var4.dismiss();
                                    return;
                            }
                        }
                    });
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.addView(l0Var.C2, ma.q(-1, 44, 1.0f, 0, 0, 0, 4, 0));
                    linearLayout2.addView(dVar, ma.q(-1, 44, 1.0f, 0, 4, 0, 0, 0));
                    linearLayout.addView(linearLayout2, ma.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 44));
                } else {
                    linearLayout.addView(l0Var.B2, ma.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 48));
                }
                linearLayout.addView(r80Var, ma.k(0.0f, -5.0f, 0.0f, 0.0f, -1, 48));
                linearLayout.addView(k80Var, ma.k(12.0f, -6.0f, 12.0f, 17.0f, -1, -2));
                k0Var = linearLayout;
                break;
            case 9:
                k0Var = new h0(l0Var, context, l0Var.J0);
                break;
            default:
                k0 k0Var2 = new k0(l0Var, context);
                l0Var.Z1 = k0Var2;
                k0Var = k0Var2;
                break;
        }
        return i5.c.q(k0Var, k0Var, -1, -2);
    }
}
