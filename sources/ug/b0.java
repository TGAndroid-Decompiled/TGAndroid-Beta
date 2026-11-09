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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.o6;
import org.telegram.ui.ActionBar.s6;
import org.telegram.ui.Cells.h4;
import org.telegram.ui.Cells.n4;
import org.telegram.ui.Cells.y6;
import org.telegram.ui.Components.e80;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.tm;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.x70;
public final class b0 extends pj0 {
    public final i0 f56540c;

    public b0(i0 i0Var) {
        this.f56540c = i0Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        i0 i0Var = this.f56540c;
        int i7 = i0Var.Z1;
        if ((i7 != 11 && i7 != 34) || i0Var.Q1) {
            int i10 = d1Var.f57060f;
            if (i10 == 1 || i10 == 4) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f56540c.f56618c2;
    }

    @Override
    public final int d(int i7) {
        int i10;
        i0 i0Var = this.f56540c;
        if (i0Var.d2 == i7) {
            return 0;
        }
        if (i0Var.f56619e2 == i7) {
            return 2;
        }
        if (i0Var.f56620f2 == i7) {
            return 3;
        }
        if (i0Var.f56623i2 == i7) {
            return 5;
        }
        if (i0Var.f56624j2 == i7) {
            return 6;
        }
        if (i0Var.R1 == i7) {
            return 7;
        }
        if (i0Var.f56625k2 == i7) {
            return 8;
        }
        ArrayList arrayList = i0Var.f56627m2;
        if (arrayList != null && i7 >= (i10 = i0Var.f56626l2) && i7 <= arrayList.size() + i10) {
            return 9;
        }
        int i11 = i0Var.Z1;
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
        i0 i0Var = this.f56540c;
        int i10 = i0Var.Z1;
        HashSet hashSet = i0Var.f56631q2;
        int i11 = d1Var.f57060f;
        View view = d1Var.f57056a;
        boolean z10 = false;
        boolean z11 = true;
        if (i11 != 1) {
            if (i11 != 9) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        h4 h4Var = (h4) view;
                        if (i10 == 5) {
                            TLRPC.Chat chat = (TLRPC.Chat) i0Var.f56632r2.get(i7 - i0Var.f56621g2);
                            String str2 = (String) i0Var.f56633s2.get(i7 - i0Var.f56621g2);
                            String str3 = chat.title;
                            if (i7 == i0Var.f56622h2 - 1.0f) {
                                z11 = false;
                            }
                            h4Var.e(chat, str3, str2, z11);
                            h4Var.c(hashSet.contains(chat), false);
                            return;
                        } else if (i10 == 11 || i10 == 34) {
                            TLRPC.User user = (TLRPC.User) i0Var.f56634t2.get(i7 - i0Var.f56621g2);
                            ArrayList arrayList = i0Var.f56635u2;
                            if (arrayList != null && arrayList.contains(Long.valueOf(user.f27105id))) {
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
                                d02 = id.d0(i0Var.f28621a, user, null, null);
                            }
                            String m10 = g5.m(0, user.first_name, user.last_name);
                            if (i7 == i0Var.f56622h2 - 1.0f) {
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
                } else if (i0Var.Q1) {
                    n4Var.setText(id.M0(2131752402, null));
                    return;
                } else if (i0Var.f56634t2.size() == 1) {
                    n4Var.setText(id.M0(2131752399, null));
                    return;
                } else {
                    n4Var.setText(id.M0(2131752398, null));
                    return;
                }
            }
            int i12 = i7 - i0Var.f56626l2;
            ArrayList arrayList2 = i0Var.f56627m2;
            if (arrayList2 != null && i12 >= 0 && i12 < arrayList2.size()) {
                e0 e0Var = (e0) view;
                d0 d0Var = (d0) i0Var.f56627m2.get(i12);
                m5 m5Var = e0Var.f56565c;
                ImageView imageView = e0Var.f56563a;
                l5 l5Var = e0Var.f56564b;
                if (d0Var instanceof c0) {
                    e0Var.f56567f = (c0) d0Var;
                    e0Var.f56566e = null;
                    imageView.setVisibility(8);
                    l5Var.setVisibility(8);
                    m5Var.setVisibility(0);
                    l5 l5Var2 = e0Var.d;
                    c0 c0Var = e0Var.f56567f;
                    if (c0Var.h) {
                        str = "BoostLevelUnlocks";
                    } else {
                        str = "BoostLevel";
                    }
                    l5Var2.l(id.G(c0Var.f56548g, str, new Object[0]), false);
                    return;
                } else if (d0Var != null) {
                    e0Var.f56567f = null;
                    e0Var.f56566e = d0Var;
                    imageView.setVisibility(0);
                    imageView.setImageResource(e0Var.f56566e.f56555a);
                    l5Var.setVisibility(0);
                    d0 d0Var2 = e0Var.f56566e;
                    String str4 = "";
                    if (d0Var2.d != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(e0Var.f56566e.d);
                        sb2.append("_");
                        int i13 = e0Var.f56566e.f56558e;
                        id.E0();
                        sb2.append(id.f1(id.E0().A.a(i13)));
                        String N0 = id.N0(sb2.toString());
                        if (N0 == null || N0.startsWith("LOC_ERR")) {
                            N0 = id.N0(e0Var.f56566e.d + "_other");
                        }
                        if (N0 == null) {
                            N0 = "";
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(N0);
                        int indexOf = N0.indexOf("%d");
                        if (indexOf >= 0) {
                            spannableStringBuilder = new SpannableStringBuilder(N0);
                            SpannableString spannableString = new SpannableString(a8.p0.n(e0Var.f56566e.f56558e, "", new StringBuilder()));
                            spannableString.setSpan(new v31(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
                            spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) spannableString);
                        }
                        l5Var.l(spannableStringBuilder, false);
                    } else {
                        String M0 = id.M0(d0Var2.f56556b, null);
                        if (M0 != null) {
                            str4 = M0;
                        }
                        if (e0Var.f56566e.f56557c != null) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str4);
                            int indexOf2 = str4.indexOf("%s");
                            if (indexOf2 >= 0) {
                                spannableStringBuilder2 = new SpannableStringBuilder(str4);
                                SpannableString spannableString2 = new SpannableString(e0Var.f56566e.f56557c);
                                spannableString2.setSpan(new v31(org.telegram.messenger.g0.o()), 0, spannableString2.length(), 33);
                                spannableStringBuilder2.replace(indexOf2, indexOf2 + 2, (CharSequence) spannableString2);
                            }
                            l5Var.l(spannableStringBuilder2, false);
                        } else {
                            l5Var.l(str4, false);
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
        TLRPC.Chat chat2 = (TLRPC.Chat) i0Var.f56616a2.get(i7 - i0Var.f56621g2);
        org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) view;
        TLRPC.Chat currentChannel = nVar.getCurrentChannel();
        nVar.a(chat2, false);
        boolean contains = hashSet.contains(chat2);
        if (currentChannel == chat2) {
            z10 = true;
        }
        nVar.f29595r.a(contains, z10);
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        int i10;
        float f10;
        int i11;
        h0 h0Var;
        Context context = viewGroup.getContext();
        i0 i0Var = this.f56540c;
        switch (i7) {
            case 1:
                h0Var = new org.telegram.ui.Cells.n(context, new a0(this), true, 9);
                break;
            case 2:
                int i12 = l6.f27809a7;
                View y6Var = new y6(context, l6.w0(i12, i0Var.I0), 0);
                s6.h(i12, y6Var, i0Var.I0);
                h0Var = y6Var;
                break;
            case 3:
                View n4Var = new n4(context);
                n4Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
                h0Var = n4Var;
                break;
            case 4:
                View h4Var = new h4(1, 0, context, i0Var.I0, false, false);
                int i13 = i0Var.f28654t0;
                h4Var.setPadding(i13, 0, i13, 0);
                h0Var = h4Var;
                break;
            case 5:
                mz mzVar = new mz(context, null);
                if (i0Var.Z1 == 2) {
                    i10 = 22;
                } else {
                    i10 = 21;
                }
                mzVar.setViewType(i10);
                mzVar.setIsSingleCell(true);
                mzVar.setIgnoreHeightCheck(true);
                mzVar.setItemsCount(10);
                h0Var = mzVar;
                break;
            case 6:
                h0Var = new tm(i0Var.getContext(), 28);
                break;
            case 7:
                FrameLayout frameLayout = new FrameLayout(i0Var.getContext());
                frameLayout.setPadding(org.telegram.messenger.g0.L(6.0f) + i0Var.f28654t0, 0, org.telegram.messenger.g0.L(6.0f) + i0Var.f28654t0, 0);
                TextView textView = new TextView(context);
                if (i0Var.I2 == null && t3.N(i0Var.n1())) {
                    i0Var.I2 = new sh.b(this, 14);
                }
                int L = org.telegram.messenger.g0.L(18.0f);
                int L2 = org.telegram.messenger.g0.L(13.0f);
                if (i0Var.I2 == null) {
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
                int i14 = l6.f27885e7;
                int w02 = l6.w0(i14, i0Var.I0);
                int i15 = l6.f27957i6;
                int o4 = i0.a.o(l6.w0(i15, i0Var.I0), 76);
                org.telegram.ui.Cells.y k02 = l6.k0(L3, L3, L3, L3, w02, o4, o4);
                o6 M = s6.M(i14);
                o6 g10 = s6.g(i15, 76);
                g6 g6Var = i0Var.I0;
                textView.setBackground(k02);
                s6.j(textView, k02, M, g10, g6Var);
                s6.U(textView, l6.G6, i0Var.I0);
                textView.setOnClickListener(new View.OnClickListener(this) {
                    public final b0 f56893b;

                    {
                        this.f56893b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                i0 i0Var2 = this.f56893b.f56540c;
                                wg.l.I0(i0Var2.f36305o1, i0Var2.I0, i0Var2.S1, null);
                                return;
                            case 1:
                                i0 i0Var3 = this.f56893b.f56540c;
                                org.telegram.messenger.g0.g(i0Var3.k1());
                                i0Var3.dismiss();
                                return;
                            case 2:
                                org.telegram.messenger.g0.g(this.f56893b.f56540c.k1());
                                return;
                            default:
                                i0 i0Var4 = this.f56893b.f56540c;
                                i0Var4.I2.run();
                                i0Var4.dismiss();
                                return;
                        }
                    }
                });
                if (i0Var.I2 != null) {
                    ImageView imageView = new ImageView(i0Var.getContext());
                    imageView.setImageResource(2131232378);
                    s6.s(imageView, l6.f27973j5, i0Var.I0, PorterDuff.Mode.SRC_ATOP);
                    imageView.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                    int L4 = org.telegram.messenger.g0.L(20.0f);
                    int o10 = i0.a.o(l6.w0(i15, i0Var.I0), 76);
                    org.telegram.ui.Cells.y k03 = l6.k0(L4, L4, L4, L4, 0, o10, o10);
                    o6 g11 = s6.g(i15, 76);
                    g6 g6Var2 = i0Var.I0;
                    imageView.setBackground(k03);
                    s6.j(imageView, k03, null, g11, g6Var2);
                    frameLayout.addView(imageView, ha.d(40, 40.0f, 21, 15.0f, 0.0f, 15.0f, 0.0f));
                    imageView.setOnClickListener(new View.OnClickListener(this) {
                        public final b0 f56893b;

                        {
                            this.f56893b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    i0 i0Var2 = this.f56893b.f56540c;
                                    wg.l.I0(i0Var2.f36305o1, i0Var2.I0, i0Var2.S1, null);
                                    return;
                                case 1:
                                    i0 i0Var3 = this.f56893b.f56540c;
                                    org.telegram.messenger.g0.g(i0Var3.k1());
                                    i0Var3.dismiss();
                                    return;
                                case 2:
                                    org.telegram.messenger.g0.g(this.f56893b.f56540c.k1());
                                    return;
                                default:
                                    i0 i0Var4 = this.f56893b.f56540c;
                                    i0Var4.I2.run();
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
                linearLayout.setPadding(org.telegram.messenger.g0.L(6.0f) + i0Var.f28654t0, 0, org.telegram.messenger.g0.L(6.0f) + i0Var.f28654t0, 0);
                linearLayout.setOrientation(1);
                e80 e80Var = new e80(context);
                x70 x70Var = new x70(context, null);
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
                int i16 = l6.Uc;
                mutate.setColorFilter(new PorterDuffColorFilter(i16, PorterDuff.Mode.SRC_IN));
                wp wpVar = new wp(0, mutate);
                wpVar.a(i16);
                wpVar.c(org.telegram.messenger.g0.L(18.0f));
                wpVar.E = org.telegram.messenger.g0.L(11.0f);
                wpVar.f40120r = -org.telegram.messenger.g0.L(5.0f);
                spannableString.setSpan(wpVar, 0, spannableString.length(), 33);
                x70Var.setText(TextUtils.concat(X2, " ", org.telegram.messenger.g0.K2(spannableStringBuilder, spannableString, ">")));
                x70Var.setTextSize(1, 14.0f);
                x70Var.setLineSpacing(org.telegram.messenger.g0.L(3.0f), 1.0f);
                g6 g6Var3 = i0Var.I0;
                if (g6Var3 instanceof di.b) {
                    s6.U(x70Var, l6.f28257y6, g6Var3);
                } else {
                    s6.U(x70Var, l6.G6, g6Var3);
                }
                x70Var.setGravity(1);
                x70Var.setOnClickListener(new View.OnClickListener(this) {
                    public final b0 f56893b;

                    {
                        this.f56893b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                i0 i0Var2 = this.f56893b.f56540c;
                                wg.l.I0(i0Var2.f36305o1, i0Var2.I0, i0Var2.S1, null);
                                return;
                            case 1:
                                i0 i0Var3 = this.f56893b.f56540c;
                                org.telegram.messenger.g0.g(i0Var3.k1());
                                i0Var3.dismiss();
                                return;
                            case 2:
                                org.telegram.messenger.g0.g(this.f56893b.f56540c.k1());
                                return;
                            default:
                                i0 i0Var4 = this.f56893b.f56540c;
                                i0Var4.I2.run();
                                i0Var4.dismiss();
                                return;
                        }
                    }
                });
                e80Var.setOnClickListener(new ii.g(x70Var, 25));
                if (i0Var.s1()) {
                    fi.d dVar = new fi.d(context, i0Var.I0, true);
                    dVar.i(id.M0(2131751767, null), false, true);
                    dVar.setOnClickListener(new View.OnClickListener(this) {
                        public final b0 f56893b;

                        {
                            this.f56893b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    i0 i0Var2 = this.f56893b.f56540c;
                                    wg.l.I0(i0Var2.f36305o1, i0Var2.I0, i0Var2.S1, null);
                                    return;
                                case 1:
                                    i0 i0Var3 = this.f56893b.f56540c;
                                    org.telegram.messenger.g0.g(i0Var3.k1());
                                    i0Var3.dismiss();
                                    return;
                                case 2:
                                    org.telegram.messenger.g0.g(this.f56893b.f56540c.k1());
                                    return;
                                default:
                                    i0 i0Var4 = this.f56893b.f56540c;
                                    i0Var4.I2.run();
                                    i0Var4.dismiss();
                                    return;
                            }
                        }
                    });
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.addView(i0Var.f56639y2, ha.q(-1, 44, 1.0f, 0, 0, 0, 4, 0));
                    linearLayout2.addView(dVar, ha.q(-1, 44, 1.0f, 0, 4, 0, 0, 0));
                    linearLayout.addView(linearLayout2, ha.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 44));
                } else {
                    linearLayout.addView(i0Var.f56638x2, ha.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 48));
                }
                linearLayout.addView(e80Var, ha.k(0.0f, -5.0f, 0.0f, 0.0f, -1, 48));
                linearLayout.addView(x70Var, ha.k(12.0f, -6.0f, 12.0f, 17.0f, -1, -2));
                h0Var = linearLayout;
                break;
            case 9:
                h0Var = new e0(i0Var, context, i0Var.I0);
                break;
            default:
                h0 h0Var2 = new h0(i0Var, context);
                i0Var.V1 = h0Var2;
                h0Var = h0Var2;
                break;
        }
        return jg.g.r(h0Var, h0Var, -1, -2);
    }
}
