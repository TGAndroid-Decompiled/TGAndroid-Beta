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
import c8.na;
import di.n4;
import hi.cb;
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
import org.telegram.ui.Cells.i4;
import org.telegram.ui.Cells.o4;
import org.telegram.ui.Cells.y6;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.in;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.vz;
public final class d0 extends dk0 {
    public final k0 f58764c;

    public d0(k0 k0Var) {
        this.f58764c = k0Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        k0 k0Var = this.f58764c;
        int i7 = k0Var.d2;
        if ((i7 != 11 && i7 != 34) || k0Var.U1) {
            int i10 = f1Var.f59249f;
            if (i10 == 1 || i10 == 4) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f58764c.f58853g2;
    }

    @Override
    public final int d(int i7) {
        int i10;
        k0 k0Var = this.f58764c;
        if (k0Var.f58854h2 == i7) {
            return 0;
        }
        if (k0Var.f58855i2 == i7) {
            return 2;
        }
        if (k0Var.f58856j2 == i7) {
            return 3;
        }
        if (k0Var.f58859m2 == i7) {
            return 5;
        }
        if (k0Var.f58860n2 == i7) {
            return 6;
        }
        if (k0Var.V1 == i7) {
            return 7;
        }
        if (k0Var.f58861o2 == i7) {
            return 8;
        }
        ArrayList arrayList = k0Var.f58863q2;
        if (arrayList != null && i7 >= (i10 = k0Var.f58862p2) && i7 <= arrayList.size() + i10) {
            return 9;
        }
        int i11 = k0Var.d2;
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
        k0 k0Var = this.f58764c;
        int i10 = k0Var.d2;
        HashSet hashSet = k0Var.f58867u2;
        int i11 = f1Var.f59249f;
        View view = f1Var.f59245a;
        boolean z11 = false;
        boolean z12 = true;
        if (i11 != 1) {
            if (i11 != 9) {
                if (i11 != 3) {
                    if (i11 == 4) {
                        i4 i4Var = (i4) view;
                        if (i10 == 5) {
                            TLRPC.Chat chat = (TLRPC.Chat) k0Var.f58868v2.get(i7 - k0Var.f58857k2);
                            String str2 = (String) k0Var.f58869w2.get(i7 - k0Var.f58857k2);
                            String str3 = chat.title;
                            if (i7 == k0Var.f58858l2 - 1.0f) {
                                z12 = false;
                            }
                            i4Var.e(chat, str3, str2, z12);
                            i4Var.c(hashSet.contains(chat), false);
                            return;
                        } else if (i10 == 11 || i10 == 34) {
                            TLRPC.User user = (TLRPC.User) k0Var.f58870x2.get(i7 - k0Var.f58857k2);
                            ArrayList arrayList = k0Var.f58871y2;
                            if (arrayList != null && arrayList.contains(Long.valueOf(user.f28641id))) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                requirementtocontactpremium = new TL_account.requirementToContactPremium();
                            } else {
                                requirementtocontactpremium = null;
                            }
                            i4Var.S = true;
                            i4Var.R = requirementtocontactpremium;
                            i4Var.g();
                            if (z10) {
                                d02 = gd.N0(2131748933, null);
                            } else {
                                d02 = gd.d0(k0Var.f30223a, user, null, null);
                            }
                            String m10 = i5.m(0, user.first_name, user.last_name);
                            if (i7 == k0Var.f58858l2 - 1.0f) {
                                z12 = false;
                            }
                            i4Var.e(user, m10, d02, z12);
                            i4Var.c(hashSet.contains(user), false);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                o4 o4Var = (o4) view;
                if (i10 != 11 && i10 != 34) {
                    if (i10 == 2) {
                        o4Var.setText(gd.N0(2131742520, null));
                        return;
                    } else {
                        o4Var.setText(gd.N0(2131748840, null));
                        return;
                    }
                } else if (k0Var.U1) {
                    o4Var.setText(gd.N0(2131752390, null));
                    return;
                } else if (k0Var.f58870x2.size() == 1) {
                    o4Var.setText(gd.N0(2131752387, null));
                    return;
                } else {
                    o4Var.setText(gd.N0(2131752386, null));
                    return;
                }
            }
            int i12 = i7 - k0Var.f58862p2;
            ArrayList arrayList2 = k0Var.f58863q2;
            if (arrayList2 != null && i12 >= 0 && i12 < arrayList2.size()) {
                g0 g0Var = (g0) view;
                f0 f0Var = (f0) k0Var.f58863q2.get(i12);
                n4 n4Var = g0Var.f58786c;
                ImageView imageView = g0Var.f58784a;
                n5 n5Var = g0Var.f58785b;
                if (f0Var instanceof e0) {
                    g0Var.f58788f = (e0) f0Var;
                    g0Var.f58787e = null;
                    imageView.setVisibility(8);
                    n5Var.setVisibility(8);
                    n4Var.setVisibility(0);
                    n5 n5Var2 = g0Var.d;
                    e0 e0Var = g0Var.f58788f;
                    if (e0Var.h) {
                        str = "BoostLevelUnlocks";
                    } else {
                        str = "BoostLevel";
                    }
                    n5Var2.l(gd.G(e0Var.f58769g, str, new Object[0]), false);
                    return;
                } else if (f0Var != null) {
                    g0Var.f58788f = null;
                    g0Var.f58787e = f0Var;
                    imageView.setVisibility(0);
                    imageView.setImageResource(g0Var.f58787e.f58775a);
                    n5Var.setVisibility(0);
                    f0 f0Var2 = g0Var.f58787e;
                    String str4 = "";
                    if (f0Var2.d != null) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(g0Var.f58787e.d);
                        sb2.append("_");
                        int i13 = g0Var.f58787e.f58778e;
                        gd.E0();
                        sb2.append(gd.g1(gd.E0().A.a(i13)));
                        String O0 = gd.O0(sb2.toString());
                        if (O0 == null || O0.startsWith("LOC_ERR")) {
                            O0 = gd.O0(g0Var.f58787e.d + "_other");
                        }
                        if (O0 == null) {
                            O0 = "";
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(O0);
                        int indexOf = O0.indexOf("%d");
                        if (indexOf >= 0) {
                            spannableStringBuilder = new SpannableStringBuilder(O0);
                            SpannableString spannableString = new SpannableString(a8.p0.n(g0Var.f58787e.f58778e, "", new StringBuilder()));
                            spannableString.setSpan(new k41(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
                            spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) spannableString);
                        }
                        n5Var.l(spannableStringBuilder, false);
                    } else {
                        String N0 = gd.N0(f0Var2.f58776b, null);
                        if (N0 != null) {
                            str4 = N0;
                        }
                        if (g0Var.f58787e.f58777c != null) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str4);
                            int indexOf2 = str4.indexOf("%s");
                            if (indexOf2 >= 0) {
                                spannableStringBuilder2 = new SpannableStringBuilder(str4);
                                SpannableString spannableString2 = new SpannableString(g0Var.f58787e.f58777c);
                                spannableString2.setSpan(new k41(org.telegram.messenger.g0.o()), 0, spannableString2.length(), 33);
                                spannableStringBuilder2.replace(indexOf2, indexOf2 + 2, (CharSequence) spannableString2);
                            }
                            n5Var.l(spannableStringBuilder2, false);
                        } else {
                            n5Var.l(str4, false);
                        }
                    }
                    n4Var.setVisibility(8);
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        TLRPC.Chat chat2 = (TLRPC.Chat) k0Var.f58851e2.get(i7 - k0Var.f58857k2);
        org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) view;
        TLRPC.Chat currentChannel = nVar.getCurrentChannel();
        nVar.a(chat2, false);
        boolean contains = hashSet.contains(chat2);
        if (currentChannel == chat2) {
            z11 = true;
        }
        nVar.f31194r.a(contains, z11);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        int i10;
        float f10;
        int i11;
        j0 j0Var;
        Context context = viewGroup.getContext();
        k0 k0Var = this.f58764c;
        switch (i7) {
            case 1:
                j0Var = new org.telegram.ui.Cells.n(context, new c0(this), true, 9);
                break;
            case 2:
                int i12 = n6.f29394a7;
                View y6Var = new y6(context, n6.w0(i12, k0Var.J0), 0);
                u6.h(i12, y6Var, k0Var.J0);
                j0Var = y6Var;
                break;
            case 3:
                View o4Var = new o4(context);
                o4Var.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
                j0Var = o4Var;
                break;
            case 4:
                View i4Var = new i4(1, 0, context, k0Var.J0, false, false);
                int i13 = k0Var.f30261u0;
                i4Var.setPadding(i13, 0, i13, 0);
                j0Var = i4Var;
                break;
            case 5:
                vz vzVar = new vz(context, null);
                if (k0Var.d2 == 2) {
                    i10 = 22;
                } else {
                    i10 = 21;
                }
                vzVar.setViewType(i10);
                vzVar.setIsSingleCell(true);
                vzVar.setIgnoreHeightCheck(true);
                vzVar.setItemsCount(10);
                j0Var = vzVar;
                break;
            case 6:
                j0Var = new in(k0Var.getContext(), 28);
                break;
            case 7:
                FrameLayout frameLayout = new FrameLayout(k0Var.getContext());
                frameLayout.setPadding(org.telegram.messenger.g0.L(6.0f) + k0Var.f30261u0, 0, org.telegram.messenger.g0.L(6.0f) + k0Var.f30261u0, 0);
                TextView textView = new TextView(context);
                if (k0Var.M2 == null && v3.N(k0Var.o1())) {
                    k0Var.M2 = new org.telegram.ui.web.z0(this, 25);
                }
                int L = org.telegram.messenger.g0.L(18.0f);
                int L2 = org.telegram.messenger.g0.L(13.0f);
                if (k0Var.M2 == null) {
                    f10 = 18.0f;
                } else {
                    f10 = 50.0f;
                }
                textView.setPadding(L, L2, org.telegram.messenger.g0.L(f10), org.telegram.messenger.g0.L(13.0f));
                textView.setTextSize(1, 16.0f);
                textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                textView.setSingleLine(true);
                frameLayout.addView(textView, na.d(-1, -2.0f, 0, 11.0f, 0.0f, 11.0f, 0.0f));
                int L3 = org.telegram.messenger.g0.L(8.0f);
                int i14 = n6.f29471e7;
                int w02 = n6.w0(i14, k0Var.J0);
                int i15 = n6.f29543i6;
                int o4 = i0.a.o(n6.w0(i15, k0Var.J0), 76);
                org.telegram.ui.Cells.y k02 = n6.k0(L3, L3, L3, L3, w02, o4, o4);
                q6 M = u6.M(i14);
                q6 g10 = u6.g(i15, 76);
                i6 i6Var = k0Var.J0;
                textView.setBackground(k02);
                u6.j(textView, k02, M, g10, i6Var);
                u6.U(textView, n6.G6, k0Var.J0);
                textView.setOnClickListener(new View.OnClickListener(this) {
                    public final d0 f58739b;

                    {
                        this.f58739b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                k0 k0Var2 = this.f58739b.f58764c;
                                wg.l.J0(k0Var2.f39250s1, k0Var2.J0, k0Var2.W1, null);
                                return;
                            case 1:
                                k0 k0Var3 = this.f58739b.f58764c;
                                org.telegram.messenger.g0.g(k0Var3.l1());
                                k0Var3.dismiss();
                                return;
                            case 2:
                                org.telegram.messenger.g0.g(this.f58739b.f58764c.l1());
                                return;
                            default:
                                k0 k0Var4 = this.f58739b.f58764c;
                                k0Var4.M2.run();
                                k0Var4.dismiss();
                                return;
                        }
                    }
                });
                if (k0Var.M2 != null) {
                    ImageView imageView = new ImageView(k0Var.getContext());
                    imageView.setImageResource(2131232383);
                    u6.s(imageView, n6.f29559j5, k0Var.J0, PorterDuff.Mode.SRC_ATOP);
                    imageView.setPadding(org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f));
                    int L4 = org.telegram.messenger.g0.L(20.0f);
                    int o10 = i0.a.o(n6.w0(i15, k0Var.J0), 76);
                    org.telegram.ui.Cells.y k03 = n6.k0(L4, L4, L4, L4, 0, o10, o10);
                    q6 g11 = u6.g(i15, 76);
                    i6 i6Var2 = k0Var.J0;
                    imageView.setBackground(k03);
                    u6.j(imageView, k03, null, g11, i6Var2);
                    frameLayout.addView(imageView, na.d(40, 40.0f, 21, 15.0f, 0.0f, 15.0f, 0.0f));
                    imageView.setOnClickListener(new View.OnClickListener(this) {
                        public final d0 f58739b;

                        {
                            this.f58739b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    k0 k0Var2 = this.f58739b.f58764c;
                                    wg.l.J0(k0Var2.f39250s1, k0Var2.J0, k0Var2.W1, null);
                                    return;
                                case 1:
                                    k0 k0Var3 = this.f58739b.f58764c;
                                    org.telegram.messenger.g0.g(k0Var3.l1());
                                    k0Var3.dismiss();
                                    return;
                                case 2:
                                    org.telegram.messenger.g0.g(this.f58739b.f58764c.l1());
                                    return;
                                default:
                                    k0 k0Var4 = this.f58739b.f58764c;
                                    k0Var4.M2.run();
                                    k0Var4.dismiss();
                                    return;
                            }
                        }
                    });
                }
                textView.setText(k0Var.l1());
                textView.setGravity(17);
                j0Var = frameLayout;
                break;
            case 8:
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setPadding(org.telegram.messenger.g0.L(6.0f) + k0Var.f30261u0, 0, org.telegram.messenger.g0.L(6.0f) + k0Var.f30261u0, 0);
                linearLayout.setOrientation(1);
                q80 q80Var = new q80(context);
                j80 j80Var = new j80(context, null);
                if (k0Var.s1()) {
                    i11 = 2131753186;
                } else {
                    i11 = 2131753187;
                }
                SpannableStringBuilder W2 = org.telegram.messenger.g0.W2(gd.N0(i11, null));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gd.N0(2131753185, null));
                spannableStringBuilder.setSpan(new cb(this, 10), 0, spannableStringBuilder.length(), 33);
                SpannableString spannableString = new SpannableString(">");
                Drawable mutate = k0Var.getContext().getResources().getDrawable(2131232064).mutate();
                int i16 = n6.Xc;
                mutate.setColorFilter(new PorterDuffColorFilter(i16, PorterDuff.Mode.SRC_IN));
                kq kqVar = new kq(0, mutate);
                kqVar.a(i16);
                kqVar.c(org.telegram.messenger.g0.L(18.0f));
                kqVar.F = org.telegram.messenger.g0.L(11.0f);
                kqVar.f36853r = -org.telegram.messenger.g0.L(5.0f);
                spannableString.setSpan(kqVar, 0, spannableString.length(), 33);
                j80Var.setText(TextUtils.concat(W2, " ", org.telegram.messenger.g0.K2(spannableStringBuilder, spannableString, ">")));
                j80Var.setTextSize(1, 14.0f);
                j80Var.setLineSpacing(org.telegram.messenger.g0.L(3.0f), 1.0f);
                i6 i6Var3 = k0Var.J0;
                if (i6Var3 instanceof fi.b) {
                    u6.U(j80Var, n6.f29843y6, i6Var3);
                } else {
                    u6.U(j80Var, n6.G6, i6Var3);
                }
                j80Var.setGravity(1);
                j80Var.setOnClickListener(new View.OnClickListener(this) {
                    public final d0 f58739b;

                    {
                        this.f58739b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r2) {
                            case 0:
                                k0 k0Var2 = this.f58739b.f58764c;
                                wg.l.J0(k0Var2.f39250s1, k0Var2.J0, k0Var2.W1, null);
                                return;
                            case 1:
                                k0 k0Var3 = this.f58739b.f58764c;
                                org.telegram.messenger.g0.g(k0Var3.l1());
                                k0Var3.dismiss();
                                return;
                            case 2:
                                org.telegram.messenger.g0.g(this.f58739b.f58764c.l1());
                                return;
                            default:
                                k0 k0Var4 = this.f58739b.f58764c;
                                k0Var4.M2.run();
                                k0Var4.dismiss();
                                return;
                        }
                    }
                });
                q80Var.setOnClickListener(new tg.a0(j80Var, 2));
                if (k0Var.t1()) {
                    hi.e eVar = new hi.e(context, k0Var.J0, true);
                    eVar.i(gd.N0(2131751755, null), false, true);
                    eVar.setOnClickListener(new View.OnClickListener(this) {
                        public final d0 f58739b;

                        {
                            this.f58739b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            switch (r2) {
                                case 0:
                                    k0 k0Var2 = this.f58739b.f58764c;
                                    wg.l.J0(k0Var2.f39250s1, k0Var2.J0, k0Var2.W1, null);
                                    return;
                                case 1:
                                    k0 k0Var3 = this.f58739b.f58764c;
                                    org.telegram.messenger.g0.g(k0Var3.l1());
                                    k0Var3.dismiss();
                                    return;
                                case 2:
                                    org.telegram.messenger.g0.g(this.f58739b.f58764c.l1());
                                    return;
                                default:
                                    k0 k0Var4 = this.f58739b.f58764c;
                                    k0Var4.M2.run();
                                    k0Var4.dismiss();
                                    return;
                            }
                        }
                    });
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.addView(k0Var.C2, na.q(-1, 44, 1.0f, 0, 0, 0, 4, 0));
                    linearLayout2.addView(eVar, na.q(-1, 44, 1.0f, 0, 4, 0, 0, 0));
                    linearLayout.addView(linearLayout2, na.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 44));
                } else {
                    linearLayout.addView(k0Var.B2, na.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 48));
                }
                linearLayout.addView(q80Var, na.k(0.0f, -5.0f, 0.0f, 0.0f, -1, 48));
                linearLayout.addView(j80Var, na.k(12.0f, -6.0f, 12.0f, 17.0f, -1, -2));
                j0Var = linearLayout;
                break;
            case 9:
                j0Var = new g0(k0Var, context, k0Var.J0);
                break;
            default:
                j0 j0Var2 = new j0(k0Var, context);
                k0Var.Z1 = j0Var2;
                j0Var = j0Var2;
                break;
        }
        return i5.c.q(j0Var, j0Var, -1, -2);
    }
}
