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
import bi.m5;
import c8.ha;
import fi.ka;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.g5;
import org.telegram.messenger.id;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.h4;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.y6;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.sm;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wp;
public final class b0 extends oj0 {
    public final i0 f56539c;

    public b0(i0 i0Var) {
        this.f56539c = i0Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        i0 i0Var = this.f56539c;
        int i7 = i0Var.f56617c2;
        if ((i7 != 11 && i7 != 34) || i0Var.T1) {
            int i10 = d1Var.f57056f;
            if (i10 == 1 || i10 == 4) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f56539c.f56619f2;
    }

    @Override
    public final int d(int i7) {
        int i10;
        i0 i0Var = this.f56539c;
        if (i0Var.f56620g2 == i7) {
            return 0;
        }
        if (i0Var.f56621h2 == i7) {
            return 2;
        }
        if (i0Var.f56622i2 == i7) {
            return 3;
        }
        if (i0Var.f56625l2 == i7) {
            return 5;
        }
        if (i0Var.f56626m2 == i7) {
            return 6;
        }
        if (i0Var.U1 == i7) {
            return 7;
        }
        if (i0Var.f56627n2 == i7) {
            return 8;
        }
        ArrayList arrayList = i0Var.f56629p2;
        if (arrayList != null && i7 >= (i10 = i0Var.f56628o2) && i7 <= arrayList.size() + i10) {
            return 9;
        }
        int i11 = i0Var.f56617c2;
        if (i11 != 5 && i11 != 11 && i11 != 34) {
            return 1;
        }
        return 4;
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        String str;
        boolean z9;
        TL_account.requirementToContactPremium requirementtocontactpremium;
        String d02;
        i0 i0Var = this.f56539c;
        int i10 = i0Var.f56617c2;
        HashSet hashSet = i0Var.f56633t2;
        int i11 = d1Var.f57056f;
        View view = d1Var.f57052a;
        boolean z10 = false;
        boolean z11 = true;
        if (i11 != 1) {
            if (i11 != 9) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        h4 h4Var = (h4) view;
                        if (i10 == 5) {
                            TLRPC.Chat chat = (TLRPC.Chat) i0Var.f56634u2.get(i7 - i0Var.f56623j2);
                            String str2 = (String) i0Var.f56635v2.get(i7 - i0Var.f56623j2);
                            String str3 = chat.title;
                            if (i7 == i0Var.f56624k2 - 1.0f) {
                                z11 = false;
                            }
                            h4Var.e(chat, str3, str2, z11);
                            h4Var.c(hashSet.contains(chat), false);
                            return;
                        } else if (i10 == 11 || i10 == 34) {
                            TLRPC.User user = (TLRPC.User) i0Var.f56636w2.get(i7 - i0Var.f56623j2);
                            ArrayList arrayList = i0Var.f56637x2;
                            if (arrayList != null && arrayList.contains(Long.valueOf(user.f27109id))) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            if (z9) {
                                requirementtocontactpremium = new TL_account.requirementToContactPremium();
                            } else {
                                requirementtocontactpremium = null;
                            }
                            h4Var.R = true;
                            h4Var.Q = requirementtocontactpremium;
                            h4Var.g();
                            if (z9) {
                                d02 = id.M0(2131749126, null);
                            } else {
                                d02 = id.d0(i0Var.f28669a, user, null, null);
                            }
                            String m10 = g5.m(0, user.first_name, user.last_name);
                            if (i7 == i0Var.f56624k2 - 1.0f) {
                                z11 = false;
                            }
                            h4Var.e(user, m10, d02, z11);
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
                        n4Var.setText(id.M0(2131742791, null));
                        return;
                    } else {
                        n4Var.setText(id.M0(2131749033, null));
                        return;
                    }
                } else if (i0Var.T1) {
                    n4Var.setText(id.M0(2131752402, null));
                    return;
                } else if (i0Var.f56636w2.size() == 1) {
                    n4Var.setText(id.M0(2131752399, null));
                    return;
                } else {
                    n4Var.setText(id.M0(2131752398, null));
                    return;
                }
            }
            int i12 = i7 - i0Var.f56628o2;
            ArrayList arrayList2 = i0Var.f56629p2;
            if (arrayList2 != null && i12 >= 0 && i12 < arrayList2.size()) {
                e0 e0Var = (e0) view;
                d0 d0Var = (d0) i0Var.f56629p2.get(i12);
                m5 m5Var = e0Var.f56564c;
                ImageView imageView = e0Var.f56562a;
                org.telegram.ui.ActionBar.m5 m5Var2 = e0Var.f56563b;
                if (d0Var instanceof c0) {
                    e0Var.f56566f = (c0) d0Var;
                    e0Var.f56565e = null;
                    imageView.setVisibility(8);
                    m5Var2.setVisibility(8);
                    m5Var.setVisibility(0);
                    org.telegram.ui.ActionBar.m5 m5Var3 = e0Var.d;
                    c0 c0Var = e0Var.f56566f;
                    if (c0Var.h) {
                        str = "BoostLevelUnlocks";
                    } else {
                        str = "BoostLevel";
                    }
                    m5Var3.l(id.G(c0Var.f56547g, str, new Object[0]), false);
                    return;
                } else if (d0Var != null) {
                    e0Var.f56566f = null;
                    e0Var.f56565e = d0Var;
                    imageView.setVisibility(0);
                    imageView.setImageResource(e0Var.f56565e.f56554a);
                    m5Var2.setVisibility(0);
                    d0 d0Var2 = e0Var.f56565e;
                    String str4 = "";
                    if (d0Var2.d != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(e0Var.f56565e.d);
                        sb2.append("_");
                        int i13 = e0Var.f56565e.f56557e;
                        id.E0();
                        sb2.append(id.f1(id.E0().A.a(i13)));
                        String N0 = id.N0(sb2.toString());
                        if (N0 == null || N0.startsWith("LOC_ERR")) {
                            N0 = id.N0(e0Var.f56565e.d + "_other");
                        }
                        if (N0 == null) {
                            N0 = "";
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N0);
                        int indexOf = N0.indexOf("%d");
                        if (indexOf >= 0) {
                            spannableStringBuilder = new SpannableStringBuilder(N0);
                            SpannableString spannableString = new SpannableString(a8.p0.n(e0Var.f56565e.f56557e, "", new StringBuilder()));
                            spannableString.setSpan(new u31(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
                            spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) spannableString);
                        }
                        m5Var2.l(spannableStringBuilder, false);
                    } else {
                        String M0 = id.M0(d0Var2.f56555b, null);
                        if (M0 != null) {
                            str4 = M0;
                        }
                        if (e0Var.f56565e.f56556c != null) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str4);
                            int indexOf2 = str4.indexOf("%s");
                            if (indexOf2 >= 0) {
                                spannableStringBuilder2 = new SpannableStringBuilder(str4);
                                SpannableString spannableString2 = new SpannableString(e0Var.f56565e.f56556c);
                                spannableString2.setSpan(new u31(org.telegram.messenger.g0.o()), 0, spannableString2.length(), 33);
                                spannableStringBuilder2.replace(indexOf2, indexOf2 + 2, (CharSequence) spannableString2);
                            }
                            m5Var2.l(spannableStringBuilder2, false);
                        } else {
                            m5Var2.l(str4, false);
                        }
                    }
                    m5Var.setVisibility(8);
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        TLRPC.Chat chat2 = (TLRPC.Chat) i0Var.d2.get(i7 - i0Var.f56623j2);
        org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) view;
        TLRPC.Chat currentChannel = nVar.getCurrentChannel();
        nVar.a(chat2, false);
        boolean contains = hashSet.contains(chat2);
        if (currentChannel == chat2) {
            z10 = true;
        }
        nVar.f29606r.a(contains, z10);
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        int i10;
        float f10;
        int i11;
        h0 h0Var;
        Context context = viewGroup.getContext();
        i0 i0Var = this.f56539c;
        switch (i7) {
            case 1:
                h0Var = new org.telegram.ui.Cells.n(context, new a0(this), true, 9);
                break;
            case 2:
                int i12 = m6.f27834a7;
                View y6Var = new y6(context, m6.w0(i12, i0Var.I0), 0);
                t6.h(i12, y6Var, i0Var.I0);
                h0Var = y6Var;
                break;
            case 3:
                View n4Var = new n4(context);
                n4Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
                h0Var = n4Var;
                break;
            case 4:
                View h4Var = new h4(1, 0, context, i0Var.I0, false, false);
                int i13 = i0Var.f28705t0;
                h4Var.setPadding(i13, 0, i13, 0);
                h0Var = h4Var;
                break;
            case 5:
                lz lzVar = new lz(context, null);
                if (i0Var.f56617c2 == 2) {
                    i10 = 22;
                } else {
                    i10 = 21;
                }
                lzVar.setViewType(i10);
                lzVar.setIsSingleCell(true);
                lzVar.setIgnoreHeightCheck(true);
                lzVar.setItemsCount(10);
                h0Var = lzVar;
                break;
            case 6:
                h0Var = new sm(i0Var.getContext(), 28);
                break;
            case 7:
                FrameLayout frameLayout = new FrameLayout(i0Var.getContext());
                frameLayout.setPadding(org.telegram.messenger.g0.L(6.0f) + i0Var.f28705t0, 0, org.telegram.messenger.g0.L(6.0f) + i0Var.f28705t0, 0);
                TextView textView = new TextView(context);
                if (i0Var.L2 == null && t3.N(i0Var.n1())) {
                    i0Var.L2 = new sh.b(this, 14);
                }
                int L = org.telegram.messenger.g0.L(18.0f);
                int L2 = org.telegram.messenger.g0.L(13.0f);
                if (i0Var.L2 == null) {
                    f10 = 18.0f;
                } else {
                    f10 = 50.0f;
                }
                textView.setPadding(L, L2, org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(13.0f));
                textView.setTextSize(1, 16.0f);
                textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                textView.setSingleLine(true);
                frameLayout.addView(textView, ha.d(-1, -2.0f, 0, 11.0f, 0.0f, 11.0f, 0.0f));
                int L3 = org.telegram.messenger.g0.L(8.0f);
                int i14 = m6.f27910e7;
                int w02 = m6.w0(i14, i0Var.I0);
                int i15 = m6.f27982i6;
                int o4 = i0.a.o(m6.w0(i15, i0Var.I0), 76);
                org.telegram.ui.Cells.y k02 = m6.k0(L3, L3, L3, L3, w02, o4, o4);
                p6 M = t6.M(i14);
                p6 g10 = t6.g(i15, 76);
                h6 h6Var = i0Var.I0;
                textView.setBackground(k02);
                t6.j(textView, k02, M, g10, h6Var);
                t6.U(textView, m6.G6, i0Var.I0);
                textView.setOnClickListener(new View.OnClickListener(this) {
                    public final b0 f56889b;

                    {
                        this.f56889b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                i0 i0Var2 = this.f56889b.f56539c;
                                wg.l.I0(i0Var2.f35905r1, i0Var2.I0, i0Var2.V1, null);
                                return;
                            case 1:
                                i0 i0Var3 = this.f56889b.f56539c;
                                org.telegram.messenger.g0.g(i0Var3.k1());
                                i0Var3.dismiss();
                                return;
                            case 2:
                                org.telegram.messenger.g0.g(this.f56889b.f56539c.k1());
                                return;
                            default:
                                i0 i0Var4 = this.f56889b.f56539c;
                                i0Var4.L2.run();
                                i0Var4.dismiss();
                                return;
                        }
                    }
                });
                if (i0Var.L2 != null) {
                    ImageView imageView = new ImageView(i0Var.getContext());
                    imageView.setImageResource(2131232378);
                    t6.s(imageView, m6.f27998j5, i0Var.I0, PorterDuff.Mode.SRC_ATOP);
                    imageView.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                    int L4 = org.telegram.messenger.g0.L(20.0f);
                    int o10 = i0.a.o(m6.w0(i15, i0Var.I0), 76);
                    org.telegram.ui.Cells.y k03 = m6.k0(L4, L4, L4, L4, 0, o10, o10);
                    p6 g11 = t6.g(i15, 76);
                    h6 h6Var2 = i0Var.I0;
                    imageView.setBackground(k03);
                    t6.j(imageView, k03, null, g11, h6Var2);
                    frameLayout.addView(imageView, ha.d(40, 40.0f, 21, 15.0f, 0.0f, 15.0f, 0.0f));
                    imageView.setOnClickListener(new View.OnClickListener(this) {
                        public final b0 f56889b;

                        {
                            this.f56889b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    i0 i0Var2 = this.f56889b.f56539c;
                                    wg.l.I0(i0Var2.f35905r1, i0Var2.I0, i0Var2.V1, null);
                                    return;
                                case 1:
                                    i0 i0Var3 = this.f56889b.f56539c;
                                    org.telegram.messenger.g0.g(i0Var3.k1());
                                    i0Var3.dismiss();
                                    return;
                                case 2:
                                    org.telegram.messenger.g0.g(this.f56889b.f56539c.k1());
                                    return;
                                default:
                                    i0 i0Var4 = this.f56889b.f56539c;
                                    i0Var4.L2.run();
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
                linearLayout.setPadding(org.telegram.messenger.g0.L(6.0f) + i0Var.f28705t0, 0, org.telegram.messenger.g0.L(6.0f) + i0Var.f28705t0, 0);
                linearLayout.setOrientation(1);
                d80 d80Var = new d80(context);
                w70 w70Var = new w70(context, null);
                if (i0Var.r1()) {
                    i11 = 2131753189;
                } else {
                    i11 = 2131753190;
                }
                SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(id.M0(i11, null));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(id.M0(2131753188, null));
                spannableStringBuilder.setSpan(new ka(this, 10), 0, spannableStringBuilder.length(), 33);
                SpannableString spannableString = new SpannableString(">");
                Drawable mutate = i0Var.getContext().getResources().getDrawable(2131232059).mutate();
                int i16 = m6.Uc;
                mutate.setColorFilter(new PorterDuffColorFilter(i16, PorterDuff.Mode.SRC_IN));
                wp wpVar = new wp(0, mutate);
                wpVar.a(i16);
                wpVar.c(org.telegram.messenger.g0.L(18.0f));
                wpVar.E = org.telegram.messenger.g0.L(11.0f);
                wpVar.f40038r = -org.telegram.messenger.g0.L(5.0f);
                spannableString.setSpan(wpVar, 0, spannableString.length(), 33);
                w70Var.setText(TextUtils.concat(X2, " ", org.telegram.messenger.g0.K2(spannableStringBuilder, spannableString, ">")));
                w70Var.setTextSize(1, 14.0f);
                w70Var.setLineSpacing(org.telegram.messenger.g0.L(3.0f), 1.0f);
                h6 h6Var3 = i0Var.I0;
                if (h6Var3 instanceof di.b) {
                    t6.U(w70Var, m6.f28282y6, h6Var3);
                } else {
                    t6.U(w70Var, m6.G6, h6Var3);
                }
                w70Var.setGravity(1);
                w70Var.setOnClickListener(new View.OnClickListener(this) {
                    public final b0 f56889b;

                    {
                        this.f56889b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                i0 i0Var2 = this.f56889b.f56539c;
                                wg.l.I0(i0Var2.f35905r1, i0Var2.I0, i0Var2.V1, null);
                                return;
                            case 1:
                                i0 i0Var3 = this.f56889b.f56539c;
                                org.telegram.messenger.g0.g(i0Var3.k1());
                                i0Var3.dismiss();
                                return;
                            case 2:
                                org.telegram.messenger.g0.g(this.f56889b.f56539c.k1());
                                return;
                            default:
                                i0 i0Var4 = this.f56889b.f56539c;
                                i0Var4.L2.run();
                                i0Var4.dismiss();
                                return;
                        }
                    }
                });
                d80Var.setOnClickListener(new ii.g(w70Var, 25));
                if (i0Var.s1()) {
                    fi.d dVar = new fi.d(context, i0Var.I0, true);
                    dVar.i(id.M0(2131751767, null), false, true);
                    dVar.setOnClickListener(new View.OnClickListener(this) {
                        public final b0 f56889b;

                        {
                            this.f56889b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    i0 i0Var2 = this.f56889b.f56539c;
                                    wg.l.I0(i0Var2.f35905r1, i0Var2.I0, i0Var2.V1, null);
                                    return;
                                case 1:
                                    i0 i0Var3 = this.f56889b.f56539c;
                                    org.telegram.messenger.g0.g(i0Var3.k1());
                                    i0Var3.dismiss();
                                    return;
                                case 2:
                                    org.telegram.messenger.g0.g(this.f56889b.f56539c.k1());
                                    return;
                                default:
                                    i0 i0Var4 = this.f56889b.f56539c;
                                    i0Var4.L2.run();
                                    i0Var4.dismiss();
                                    return;
                            }
                        }
                    });
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.addView(i0Var.B2, ha.q(-1, 44, 1.0f, 0, 0, 0, 4, 0));
                    linearLayout2.addView(dVar, ha.q(-1, 44, 1.0f, 0, 4, 0, 0, 0));
                    linearLayout.addView(linearLayout2, ha.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 44));
                } else {
                    linearLayout.addView(i0Var.A2, ha.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 48));
                }
                linearLayout.addView(d80Var, ha.k(0.0f, -5.0f, 0.0f, 0.0f, -1, 48));
                linearLayout.addView(w70Var, ha.k(12.0f, -6.0f, 12.0f, 17.0f, -1, -2));
                h0Var = linearLayout;
                break;
            case 9:
                h0Var = new e0(i0Var, context, i0Var.I0);
                break;
            default:
                h0 h0Var2 = new h0(i0Var, context);
                i0Var.Y1 = h0Var2;
                h0Var = h0Var2;
                break;
        }
        return jg.g.r(h0Var, h0Var, -1, -2);
    }
}
