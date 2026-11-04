package vg;

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
import b8.mf;
import ci.t4;
import gi.ka;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.bd;
import org.telegram.messenger.g5;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.h4;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.x6;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.s70;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.sm;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.z70;
public final class b0 extends sj0 {
    public final i0 f56572c;

    public b0(i0 i0Var) {
        this.f56572c = i0Var;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        i0 i0Var = this.f56572c;
        int i3 = i0Var.f56651a2;
        if ((i3 != 11 && i3 != 34) || i0Var.R1) {
            int i10 = d1Var.f55544f;
            if (i10 == 1 || i10 == 4) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f56572c.f56653d2;
    }

    @Override
    public final int d(int i3) {
        int i10;
        i0 i0Var = this.f56572c;
        if (i0Var.f56654e2 == i3) {
            return 0;
        }
        if (i0Var.f56655f2 == i3) {
            return 2;
        }
        if (i0Var.f56656g2 == i3) {
            return 3;
        }
        if (i0Var.f56659j2 == i3) {
            return 5;
        }
        if (i0Var.f56660k2 == i3) {
            return 6;
        }
        if (i0Var.S1 == i3) {
            return 7;
        }
        if (i0Var.f56661l2 == i3) {
            return 8;
        }
        ArrayList arrayList = i0Var.f56663n2;
        if (arrayList != null && i3 >= (i10 = i0Var.f56662m2) && i3 <= arrayList.size() + i10) {
            return 9;
        }
        int i11 = i0Var.f56651a2;
        if (i11 != 5 && i11 != 11 && i11 != 34) {
            return 1;
        }
        return 4;
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        String str;
        boolean z10;
        TL_account.requirementToContactPremium requirementtocontactpremium;
        String d02;
        i0 i0Var = this.f56572c;
        int i10 = i0Var.f56651a2;
        HashSet hashSet = i0Var.f56667r2;
        int i11 = d1Var.f55544f;
        View view = d1Var.f55540a;
        boolean z11 = false;
        boolean z12 = true;
        if (i11 != 1) {
            if (i11 != 9) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        h4 h4Var = (h4) view;
                        if (i10 == 5) {
                            TLRPC.Chat chat = (TLRPC.Chat) i0Var.f56668s2.get(i3 - i0Var.f56657h2);
                            String str2 = (String) i0Var.f56669t2.get(i3 - i0Var.f56657h2);
                            String str3 = chat.title;
                            if (i3 == i0Var.f56658i2 - 1.0f) {
                                z12 = false;
                            }
                            h4Var.e(chat, str3, str2, z12);
                            h4Var.c(hashSet.contains(chat), false);
                            return;
                        } else if (i10 == 11 || i10 == 34) {
                            TLRPC.User user = (TLRPC.User) i0Var.f56670u2.get(i3 - i0Var.f56657h2);
                            ArrayList arrayList = i0Var.f56671v2;
                            if (arrayList != null && arrayList.contains(Long.valueOf(user.f27150id))) {
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
                                d02 = bd.M0(2131749134, null);
                            } else {
                                d02 = bd.d0(i0Var.f28583a, user, null, null);
                            }
                            String m10 = g5.m(0, user.first_name, user.last_name);
                            if (i3 == i0Var.f56658i2 - 1.0f) {
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
                        n4Var.setText(bd.M0(2131742801, null));
                        return;
                    } else {
                        n4Var.setText(bd.M0(2131749041, null));
                        return;
                    }
                } else if (i0Var.R1) {
                    n4Var.setText(bd.M0(2131752402, null));
                    return;
                } else if (i0Var.f56670u2.size() == 1) {
                    n4Var.setText(bd.M0(2131752399, null));
                    return;
                } else {
                    n4Var.setText(bd.M0(2131752398, null));
                    return;
                }
            }
            int i12 = i3 - i0Var.f56662m2;
            ArrayList arrayList2 = i0Var.f56663n2;
            if (arrayList2 != null && i12 >= 0 && i12 < arrayList2.size()) {
                e0 e0Var = (e0) view;
                d0 d0Var = (d0) i0Var.f56663n2.get(i12);
                t4 t4Var = e0Var.f56598c;
                ImageView imageView = e0Var.f56596a;
                k5 k5Var = e0Var.f56597b;
                if (d0Var instanceof c0) {
                    e0Var.f56600f = (c0) d0Var;
                    e0Var.f56599e = null;
                    imageView.setVisibility(8);
                    k5Var.setVisibility(8);
                    t4Var.setVisibility(0);
                    k5 k5Var2 = e0Var.d;
                    c0 c0Var = e0Var.f56600f;
                    if (c0Var.h) {
                        str = "BoostLevelUnlocks";
                    } else {
                        str = "BoostLevel";
                    }
                    k5Var2.l(bd.G(c0Var.f56581g, str, new Object[0]), false);
                    return;
                } else if (d0Var != null) {
                    e0Var.f56600f = null;
                    e0Var.f56599e = d0Var;
                    imageView.setVisibility(0);
                    imageView.setImageResource(e0Var.f56599e.f56588a);
                    k5Var.setVisibility(0);
                    d0 d0Var2 = e0Var.f56599e;
                    String str4 = "";
                    if (d0Var2.d != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(e0Var.f56599e.d);
                        sb2.append("_");
                        int i13 = e0Var.f56599e.f56591e;
                        bd.E0();
                        sb2.append(bd.f1(bd.E0().A.a(i13)));
                        String N0 = bd.N0(sb2.toString());
                        if (N0 == null || N0.startsWith("LOC_ERR")) {
                            N0 = bd.N0(e0Var.f56599e.d + "_other");
                        }
                        if (N0 == null) {
                            N0 = "";
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N0);
                        int indexOf = N0.indexOf("%d");
                        if (indexOf >= 0) {
                            spannableStringBuilder = new SpannableStringBuilder(N0);
                            SpannableString spannableString = new SpannableString(a1.g.o(e0Var.f56599e.f56591e, "", new StringBuilder()));
                            spannableString.setSpan(new o31(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
                            spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) spannableString);
                        }
                        k5Var.l(spannableStringBuilder, false);
                    } else {
                        String M0 = bd.M0(d0Var2.f56589b, null);
                        if (M0 != null) {
                            str4 = M0;
                        }
                        if (e0Var.f56599e.f56590c != null) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str4);
                            int indexOf2 = str4.indexOf("%s");
                            if (indexOf2 >= 0) {
                                spannableStringBuilder2 = new SpannableStringBuilder(str4);
                                SpannableString spannableString2 = new SpannableString(e0Var.f56599e.f56590c);
                                spannableString2.setSpan(new o31(org.telegram.messenger.g0.o()), 0, spannableString2.length(), 33);
                                spannableStringBuilder2.replace(indexOf2, indexOf2 + 2, (CharSequence) spannableString2);
                            }
                            k5Var.l(spannableStringBuilder2, false);
                        } else {
                            k5Var.l(str4, false);
                        }
                    }
                    t4Var.setVisibility(8);
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        TLRPC.Chat chat2 = (TLRPC.Chat) i0Var.f56652b2.get(i3 - i0Var.f56657h2);
        org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) view;
        TLRPC.Chat currentChannel = nVar.getCurrentChannel();
        nVar.a(chat2, false);
        boolean contains = hashSet.contains(chat2);
        if (currentChannel == chat2) {
            z11 = true;
        }
        nVar.f29648r.a(contains, z11);
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        int i10;
        float f10;
        int i11;
        h0 h0Var;
        Context context = viewGroup.getContext();
        i0 i0Var = this.f56572c;
        switch (i3) {
            case 1:
                h0Var = new org.telegram.ui.Cells.n(context, new a0(this), true, 9);
                break;
            case 2:
                int i12 = k6.f27824a7;
                View x6Var = new x6(context, k6.w0(i12, i0Var.J0), 0);
                r6.i(i12, x6Var, i0Var.J0);
                h0Var = x6Var;
                break;
            case 3:
                View n4Var = new n4(context);
                n4Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
                h0Var = n4Var;
                break;
            case 4:
                View h4Var = new h4(1, 0, context, i0Var.J0, false, false);
                int i13 = i0Var.f28618u0;
                h4Var.setPadding(i13, 0, i13, 0);
                h0Var = h4Var;
                break;
            case 5:
                iz izVar = new iz(context, null);
                if (i0Var.f56651a2 == 2) {
                    i10 = 22;
                } else {
                    i10 = 21;
                }
                izVar.setViewType(i10);
                izVar.setIsSingleCell(true);
                izVar.setIgnoreHeightCheck(true);
                izVar.setItemsCount(10);
                h0Var = izVar;
                break;
            case 6:
                h0Var = new sm(i0Var.getContext(), 29);
                break;
            case 7:
                FrameLayout frameLayout = new FrameLayout(i0Var.getContext());
                frameLayout.setPadding(org.telegram.messenger.g0.L(6.0f) + i0Var.f28618u0, 0, org.telegram.messenger.g0.L(6.0f) + i0Var.f28618u0, 0);
                TextView textView = new TextView(context);
                if (i0Var.J2 == null && t3.N(i0Var.n1())) {
                    i0Var.J2 = new r4.u(this, 18);
                }
                int L = org.telegram.messenger.g0.L(18.0f);
                int L2 = org.telegram.messenger.g0.L(13.0f);
                if (i0Var.J2 == null) {
                    f10 = 18.0f;
                } else {
                    f10 = 50.0f;
                }
                textView.setPadding(L, L2, org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(13.0f));
                textView.setTextSize(1, 16.0f);
                textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                textView.setSingleLine(true);
                frameLayout.addView(textView, mf.d(-1, -2.0f, 0, 11.0f, 0.0f, 11.0f, 0.0f));
                int L3 = org.telegram.messenger.g0.L(8.0f);
                int i14 = k6.f27899e7;
                int w02 = k6.w0(i14, i0Var.J0);
                int i15 = k6.f27972i6;
                int o10 = i0.a.o(k6.w0(i15, i0Var.J0), 76);
                org.telegram.ui.Cells.y k02 = k6.k0(L3, L3, L3, L3, w02, o10, o10);
                n6 N = r6.N(i14);
                n6 h = r6.h(i15, 76);
                e6 e6Var = i0Var.J0;
                textView.setBackground(k02);
                r6.k(textView, k02, N, h, e6Var);
                r6.V(textView, k6.G6, i0Var.J0);
                textView.setOnClickListener(new View.OnClickListener(this) {
                    public final b0 f56934b;

                    {
                        this.f56934b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                i0 i0Var2 = this.f56934b.f56572c;
                                xg.n.I0(i0Var2.f36105p1, i0Var2.J0, i0Var2.T1, null);
                                return;
                            case 1:
                                i0 i0Var3 = this.f56934b.f56572c;
                                org.telegram.messenger.g0.g(i0Var3.k1());
                                i0Var3.dismiss();
                                return;
                            case 2:
                                org.telegram.messenger.g0.g(this.f56934b.f56572c.k1());
                                return;
                            default:
                                i0 i0Var4 = this.f56934b.f56572c;
                                i0Var4.J2.run();
                                i0Var4.dismiss();
                                return;
                        }
                    }
                });
                if (i0Var.J2 != null) {
                    ImageView imageView = new ImageView(i0Var.getContext());
                    imageView.setImageResource(2131232378);
                    r6.t(imageView, k6.f27988j5, i0Var.J0, PorterDuff.Mode.SRC_ATOP);
                    imageView.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                    int L4 = org.telegram.messenger.g0.L(20.0f);
                    int o11 = i0.a.o(k6.w0(i15, i0Var.J0), 76);
                    org.telegram.ui.Cells.y k03 = k6.k0(L4, L4, L4, L4, 0, o11, o11);
                    n6 h7 = r6.h(i15, 76);
                    e6 e6Var2 = i0Var.J0;
                    imageView.setBackground(k03);
                    r6.k(imageView, k03, null, h7, e6Var2);
                    frameLayout.addView(imageView, mf.d(40, 40.0f, 21, 15.0f, 0.0f, 15.0f, 0.0f));
                    imageView.setOnClickListener(new View.OnClickListener(this) {
                        public final b0 f56934b;

                        {
                            this.f56934b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    i0 i0Var2 = this.f56934b.f56572c;
                                    xg.n.I0(i0Var2.f36105p1, i0Var2.J0, i0Var2.T1, null);
                                    return;
                                case 1:
                                    i0 i0Var3 = this.f56934b.f56572c;
                                    org.telegram.messenger.g0.g(i0Var3.k1());
                                    i0Var3.dismiss();
                                    return;
                                case 2:
                                    org.telegram.messenger.g0.g(this.f56934b.f56572c.k1());
                                    return;
                                default:
                                    i0 i0Var4 = this.f56934b.f56572c;
                                    i0Var4.J2.run();
                                    i0Var4.dismiss();
                                    return;
                            }
                        }
                    });
                }
                textView.setText(i0Var.k1());
                textView.setGravity(17);
                h0Var = frameLayout;
                break;
            case 8:
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setPadding(org.telegram.messenger.g0.L(6.0f) + i0Var.f28618u0, 0, org.telegram.messenger.g0.L(6.0f) + i0Var.f28618u0, 0);
                linearLayout.setOrientation(1);
                z70 z70Var = new z70(context);
                s70 s70Var = new s70(context, null);
                if (i0Var.r1()) {
                    i11 = 2131753189;
                } else {
                    i11 = 2131753190;
                }
                SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(bd.M0(i11, null));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(bd.M0(2131753188, null));
                spannableStringBuilder.setSpan(new ka(this, 10), 0, spannableStringBuilder.length(), 33);
                SpannableString spannableString = new SpannableString(">");
                Drawable mutate = i0Var.getContext().getResources().getDrawable(2131232059).mutate();
                int i16 = k6.Uc;
                mutate.setColorFilter(new PorterDuffColorFilter(i16, PorterDuff.Mode.SRC_IN));
                wp wpVar = new wp(0, mutate);
                wpVar.a(i16);
                wpVar.c(org.telegram.messenger.g0.L(18.0f));
                wpVar.F = org.telegram.messenger.g0.L(11.0f);
                wpVar.f40045r = -org.telegram.messenger.g0.L(5.0f);
                spannableString.setSpan(wpVar, 0, spannableString.length(), 33);
                s70Var.setText(TextUtils.concat(X2, " ", org.telegram.messenger.g0.K2(spannableStringBuilder, spannableString, ">")));
                s70Var.setTextSize(1, 14.0f);
                s70Var.setLineSpacing(org.telegram.messenger.g0.L(3.0f), 1.0f);
                e6 e6Var3 = i0Var.J0;
                if (e6Var3 instanceof ei.b) {
                    r6.V(s70Var, k6.f28273y6, e6Var3);
                } else {
                    r6.V(s70Var, k6.G6, e6Var3);
                }
                s70Var.setGravity(1);
                s70Var.setOnClickListener(new View.OnClickListener(this) {
                    public final b0 f56934b;

                    {
                        this.f56934b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                i0 i0Var2 = this.f56934b.f56572c;
                                xg.n.I0(i0Var2.f36105p1, i0Var2.J0, i0Var2.T1, null);
                                return;
                            case 1:
                                i0 i0Var3 = this.f56934b.f56572c;
                                org.telegram.messenger.g0.g(i0Var3.k1());
                                i0Var3.dismiss();
                                return;
                            case 2:
                                org.telegram.messenger.g0.g(this.f56934b.f56572c.k1());
                                return;
                            default:
                                i0 i0Var4 = this.f56934b.f56572c;
                                i0Var4.J2.run();
                                i0Var4.dismiss();
                                return;
                        }
                    }
                });
                z70Var.setOnClickListener(new ii.m(s70Var, 29));
                if (i0Var.s1()) {
                    gi.d dVar = new gi.d(context, i0Var.J0, true);
                    dVar.i(bd.M0(2131751767, null), false, true);
                    dVar.setOnClickListener(new View.OnClickListener(this) {
                        public final b0 f56934b;

                        {
                            this.f56934b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    i0 i0Var2 = this.f56934b.f56572c;
                                    xg.n.I0(i0Var2.f36105p1, i0Var2.J0, i0Var2.T1, null);
                                    return;
                                case 1:
                                    i0 i0Var3 = this.f56934b.f56572c;
                                    org.telegram.messenger.g0.g(i0Var3.k1());
                                    i0Var3.dismiss();
                                    return;
                                case 2:
                                    org.telegram.messenger.g0.g(this.f56934b.f56572c.k1());
                                    return;
                                default:
                                    i0 i0Var4 = this.f56934b.f56572c;
                                    i0Var4.J2.run();
                                    i0Var4.dismiss();
                                    return;
                            }
                        }
                    });
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.addView(i0Var.f56675z2, mf.q(-1, 44, 1.0f, 0, 0, 0, 4, 0));
                    linearLayout2.addView(dVar, mf.q(-1, 44, 1.0f, 0, 4, 0, 0, 0));
                    linearLayout.addView(linearLayout2, mf.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 44));
                } else {
                    linearLayout.addView(i0Var.f56674y2, mf.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 48));
                }
                linearLayout.addView(z70Var, mf.k(0.0f, -5.0f, 0.0f, 0.0f, -1, 48));
                linearLayout.addView(s70Var, mf.k(12.0f, -6.0f, 12.0f, 17.0f, -1, -2));
                h0Var = linearLayout;
                break;
            case 9:
                h0Var = new e0(i0Var, context, i0Var.J0);
                break;
            default:
                h0 h0Var2 = new h0(i0Var, context);
                i0Var.W1 = h0Var2;
                h0Var = h0Var2;
                break;
        }
        return k2.p1.p(h0Var, h0Var, -1, -2);
    }
}
