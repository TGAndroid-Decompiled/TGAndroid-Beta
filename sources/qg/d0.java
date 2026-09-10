package qg;

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
import bi.pd;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.c7;
import org.telegram.ui.Cells.g4;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.qn;
import org.telegram.ui.Components.s51;
import org.telegram.ui.Components.t90;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.uq;
import org.telegram.ui.u5;
import w7.a6;
public final class d0 extends ul0 {
    public final k0 f40706c;

    public d0(k0 k0Var) {
        this.f40706c = k0Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        k0 k0Var = this.f40706c;
        int i10 = k0Var.f40771h0;
        if ((i10 != 11 && i10 != 34) || k0Var.Y) {
            int i11 = c1Var.f41613f;
            if (i11 == 1 || i11 == 4) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f40706c.f40774k0;
    }

    @Override
    public final int j(int i10) {
        int i11;
        k0 k0Var = this.f40706c;
        if (k0Var.f40775l0 == i10) {
            return 0;
        }
        if (k0Var.m0 == i10) {
            return 2;
        }
        if (k0Var.f40776n0 == i10) {
            return 3;
        }
        if (k0Var.f40779q0 == i10) {
            return 5;
        }
        if (k0Var.f40780r0 == i10) {
            return 6;
        }
        if (k0Var.Z == i10) {
            return 7;
        }
        if (k0Var.f40781s0 == i10) {
            return 8;
        }
        ArrayList arrayList = k0Var.f40783u0;
        if (arrayList != null && i10 >= (i11 = k0Var.f40782t0) && i10 <= arrayList.size() + i11) {
            return 9;
        }
        int i12 = k0Var.f40771h0;
        if (i12 != 5 && i12 != 11 && i12 != 34) {
            return 1;
        }
        return 4;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        String str;
        boolean z10;
        TL_account.requirementToContactPremium requirementtocontactpremium;
        int i11;
        String formatUserStatus;
        k0 k0Var = this.f40706c;
        int i12 = k0Var.f40771h0;
        HashSet hashSet = k0Var.f40787y0;
        int i13 = c1Var.f41613f;
        View view = c1Var.f41610a;
        boolean z11 = false;
        boolean z12 = true;
        if (i13 != 1) {
            if (i13 != 9) {
                if (i13 != 3) {
                    if (i13 == 4) {
                        g4 g4Var = (g4) view;
                        if (i12 == 5) {
                            TLRPC.Chat chat = (TLRPC.Chat) k0Var.f40788z0.get(i10 - k0Var.f40777o0);
                            String str2 = (String) k0Var.A0.get(i10 - k0Var.f40777o0);
                            String str3 = chat.title;
                            if (i10 == k0Var.f40778p0 - 1.0f) {
                                z12 = false;
                            }
                            g4Var.e(chat, str3, str2, z12);
                            g4Var.c(hashSet.contains(chat), false);
                            return;
                        } else if (i12 == 11 || i12 == 34) {
                            TLRPC.User user = (TLRPC.User) k0Var.B0.get(i10 - k0Var.f40777o0);
                            ArrayList arrayList = k0Var.C0;
                            if (arrayList != null && arrayList.contains(Long.valueOf(user.f17342id))) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                requirementtocontactpremium = new TL_account.requirementToContactPremium();
                            } else {
                                requirementtocontactpremium = null;
                            }
                            g4Var.R = true;
                            g4Var.Q = requirementtocontactpremium;
                            g4Var.g();
                            if (!z10) {
                                i11 = ((h3) k0Var).currentAccount;
                                formatUserStatus = LocaleController.formatUserStatus(i11, user, null, null);
                            } else {
                                formatUserStatus = LocaleController.getString(R.string.InvitePremiumBlockedUser);
                            }
                            String formatName = ContactsController.formatName(user.first_name, user.last_name);
                            if (i10 == k0Var.f40778p0 - 1.0f) {
                                z12 = false;
                            }
                            g4Var.e(user, formatName, formatUserStatus, z12);
                            g4Var.c(hashSet.contains(user), false);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                m4 m4Var = (m4) view;
                if (i12 != 11 && i12 != 34) {
                    if (i12 == 2) {
                        m4Var.setText(LocaleController.getString(R.string.YourPublicCommunities));
                        return;
                    } else {
                        m4Var.setText(LocaleController.getString(R.string.LastActiveCommunities));
                        return;
                    }
                } else if (k0Var.Y) {
                    m4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLink));
                    return;
                } else if (k0Var.B0.size() == 1) {
                    m4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted2));
                    return;
                } else {
                    m4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted3));
                    return;
                }
            }
            int i14 = i10 - k0Var.f40782t0;
            ArrayList arrayList2 = k0Var.f40783u0;
            if (arrayList2 != null && i14 >= 0 && i14 < arrayList2.size()) {
                g0 g0Var = (g0) view;
                f0 f0Var = (f0) k0Var.f40783u0.get(i14);
                u5 u5Var = g0Var.f40740c;
                ImageView imageView = g0Var.f40738a;
                l5 l5Var = g0Var.f40739b;
                if (f0Var instanceof e0) {
                    g0Var.f40741f = (e0) f0Var;
                    g0Var.e = null;
                    imageView.setVisibility(8);
                    l5Var.setVisibility(8);
                    u5Var.setVisibility(0);
                    l5 l5Var2 = g0Var.d;
                    e0 e0Var = g0Var.f40741f;
                    if (e0Var.h) {
                        str = "BoostLevelUnlocks";
                    } else {
                        str = "BoostLevel";
                    }
                    l5Var2.l(LocaleController.formatPluralString(str, e0Var.f40717g, new Object[0]), false);
                    return;
                } else if (f0Var != null) {
                    g0Var.f40741f = null;
                    g0Var.e = f0Var;
                    imageView.setVisibility(0);
                    imageView.setImageResource(g0Var.e.f40731a);
                    l5Var.setVisibility(0);
                    f0 f0Var2 = g0Var.e;
                    String str4 = "";
                    if (f0Var2.d != null) {
                        String string = LocaleController.getString(g0Var.e.d + "_" + LocaleController.getStringParamForNumber(g0Var.e.e));
                        if (string == null || string.startsWith("LOC_ERR")) {
                            string = LocaleController.getString(g0Var.e.d + "_other");
                        }
                        if (string == null) {
                            string = "";
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                        int indexOf = string.indexOf("%d");
                        if (indexOf >= 0) {
                            spannableStringBuilder = new SpannableStringBuilder(string);
                            SpannableString spannableString = new SpannableString(a4.a.n(g0Var.e.e, "", new StringBuilder()));
                            spannableString.setSpan(new s51(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                            spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) spannableString);
                        }
                        l5Var.l(spannableStringBuilder, false);
                    } else {
                        String string2 = LocaleController.getString(f0Var2.f40732b);
                        if (string2 != null) {
                            str4 = string2;
                        }
                        if (g0Var.e.f40733c != null) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str4);
                            int indexOf2 = str4.indexOf("%s");
                            if (indexOf2 >= 0) {
                                spannableStringBuilder2 = new SpannableStringBuilder(str4);
                                SpannableString spannableString2 = new SpannableString(g0Var.e.f40733c);
                                spannableString2.setSpan(new s51(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
                                spannableStringBuilder2.replace(indexOf2, indexOf2 + 2, (CharSequence) spannableString2);
                            }
                            l5Var.l(spannableStringBuilder2, false);
                        } else {
                            l5Var.l(str4, false);
                        }
                    }
                    u5Var.setVisibility(8);
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        TLRPC.Chat chat2 = (TLRPC.Chat) k0Var.f40772i0.get(i10 - k0Var.f40777o0);
        org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) view;
        TLRPC.Chat currentChannel = nVar.getCurrentChannel();
        nVar.a(chat2, false);
        boolean contains = hashSet.contains(chat2);
        if (currentChannel == chat2) {
            z11 = true;
        }
        nVar.f19542r.a(contains, z11);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        f6 f6Var;
        f6 f6Var2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f7;
        f6 f6Var3;
        f6 f6Var4;
        f6 f6Var5;
        f6 f6Var6;
        f6 f6Var7;
        int i16;
        int i17;
        int i18;
        f6 f6Var8;
        f6 f6Var9;
        j0 j0Var;
        f6 f6Var10;
        f6 f6Var11;
        f6 f6Var12;
        Context context = viewGroup.getContext();
        k0 k0Var = this.f40706c;
        switch (i10) {
            case 1:
                j0Var = new org.telegram.ui.Cells.n(context, new c0(this), true, 9);
                break;
            case 2:
                int i19 = j6.f17872a7;
                f6Var = ((h3) k0Var).resourcesProvider;
                j0Var = new c7(context, j6.v0(i19, f6Var), 0);
                break;
            case 3:
                View m4Var = new m4(context);
                m4Var.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
                j0Var = m4Var;
                break;
            case 4:
                f6Var2 = ((h3) k0Var).resourcesProvider;
                View g4Var = new g4(1, 0, context, f6Var2, false, false);
                i11 = ((h3) k0Var).backgroundPaddingLeft;
                i12 = ((h3) k0Var).backgroundPaddingLeft;
                g4Var.setPadding(i11, 0, i12, 0);
                j0Var = g4Var;
                break;
            case 5:
                a10 a10Var = new a10(context, null);
                if (k0Var.f40771h0 == 2) {
                    i13 = 22;
                } else {
                    i13 = 21;
                }
                a10Var.setViewType(i13);
                a10Var.setIsSingleCell(true);
                a10Var.setIgnoreHeightCheck(true);
                a10Var.setItemsCount(10);
                j0Var = a10Var;
                break;
            case 6:
                j0Var = new qn(k0Var.getContext(), 28);
                break;
            case 7:
                FrameLayout frameLayout = new FrameLayout(k0Var.getContext());
                i14 = ((h3) k0Var).backgroundPaddingLeft;
                int dp = AndroidUtilities.dp(6.0f) + i14;
                i15 = ((h3) k0Var).backgroundPaddingLeft;
                frameLayout.setPadding(dp, 0, AndroidUtilities.dp(6.0f) + i15, 0);
                TextView textView = new TextView(context);
                if (k0Var.Q0 == null && ChatObject.hasAdminRights(k0Var.s1())) {
                    k0Var.Q0 = new org.telegram.ui.Components.voip.x(this, 29);
                }
                int dp2 = AndroidUtilities.dp(18.0f);
                int dp3 = AndroidUtilities.dp(13.0f);
                if (k0Var.Q0 == null) {
                    f7 = 18.0f;
                } else {
                    f7 = 50.0f;
                }
                textView.setPadding(dp2, dp3, AndroidUtilities.dp(f7), AndroidUtilities.dp(13.0f));
                textView.setTextSize(1, 16.0f);
                textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                textView.setSingleLine(true);
                frameLayout.addView(textView, a6.d(-1, -2.0f, 0, 11.0f, 0.0f, 11.0f, 0.0f));
                int dp4 = AndroidUtilities.dp(8.0f);
                int i20 = j6.e7;
                f6Var3 = ((h3) k0Var).resourcesProvider;
                int v02 = j6.v0(i20, f6Var3);
                int i21 = j6.f18017i6;
                f6Var4 = ((h3) k0Var).resourcesProvider;
                int k10 = i0.a.k(j6.v0(i21, f6Var4), 76);
                textView.setBackground(j6.i0(dp4, dp4, dp4, dp4, v02, k10, k10));
                int i22 = j6.G6;
                f6Var5 = ((h3) k0Var).resourcesProvider;
                textView.setTextColor(j6.v0(i22, f6Var5));
                textView.setOnClickListener(new View.OnClickListener(this) {
                    public final d0 f40683b;

                    {
                        this.f40683b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        f6 f6Var13;
                        switch (r2) {
                            case 0:
                                k0 k0Var2 = this.f40683b.f40706c;
                                p2 p2Var = k0Var2.f21452n;
                                long j3 = k0Var2.f40764a0;
                                f6Var13 = ((h3) k0Var2).resourcesProvider;
                                sg.m.m(p2Var, f6Var13, j3, null);
                                return;
                            case 1:
                                k0 k0Var3 = this.f40683b.f40706c;
                                AndroidUtilities.addToClipboard(k0Var3.p1());
                                k0Var3.dismiss();
                                return;
                            case 2:
                                AndroidUtilities.addToClipboard(this.f40683b.f40706c.p1());
                                return;
                            default:
                                k0 k0Var4 = this.f40683b.f40706c;
                                k0Var4.Q0.run();
                                k0Var4.dismiss();
                                return;
                        }
                    }
                });
                if (k0Var.Q0 != null) {
                    ImageView imageView = new ImageView(k0Var.getContext());
                    imageView.setImageResource(R.drawable.msg_stats);
                    int i23 = j6.f18034j5;
                    f6Var6 = ((h3) k0Var).resourcesProvider;
                    imageView.setColorFilter(j6.v0(i23, f6Var6));
                    imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                    int dp5 = AndroidUtilities.dp(20.0f);
                    f6Var7 = ((h3) k0Var).resourcesProvider;
                    int k11 = i0.a.k(j6.v0(i21, f6Var7), 76);
                    imageView.setBackground(j6.i0(dp5, dp5, dp5, dp5, 0, k11, k11));
                    frameLayout.addView(imageView, a6.d(40, 40.0f, 21, 15.0f, 0.0f, 15.0f, 0.0f));
                    imageView.setOnClickListener(new View.OnClickListener(this) {
                        public final d0 f40683b;

                        {
                            this.f40683b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            f6 f6Var13;
                            switch (r2) {
                                case 0:
                                    k0 k0Var2 = this.f40683b.f40706c;
                                    p2 p2Var = k0Var2.f21452n;
                                    long j3 = k0Var2.f40764a0;
                                    f6Var13 = ((h3) k0Var2).resourcesProvider;
                                    sg.m.m(p2Var, f6Var13, j3, null);
                                    return;
                                case 1:
                                    k0 k0Var3 = this.f40683b.f40706c;
                                    AndroidUtilities.addToClipboard(k0Var3.p1());
                                    k0Var3.dismiss();
                                    return;
                                case 2:
                                    AndroidUtilities.addToClipboard(this.f40683b.f40706c.p1());
                                    return;
                                default:
                                    k0 k0Var4 = this.f40683b.f40706c;
                                    k0Var4.Q0.run();
                                    k0Var4.dismiss();
                                    return;
                            }
                        }
                    });
                }
                textView.setText(k0Var.p1());
                textView.setGravity(17);
                j0Var = frameLayout;
                break;
            case 8:
                LinearLayout linearLayout = new LinearLayout(context);
                i16 = ((h3) k0Var).backgroundPaddingLeft;
                int dp6 = AndroidUtilities.dp(6.0f) + i16;
                i17 = ((h3) k0Var).backgroundPaddingLeft;
                linearLayout.setPadding(dp6, 0, AndroidUtilities.dp(6.0f) + i17, 0);
                linearLayout.setOrientation(1);
                t90 t90Var = new t90(context);
                m90 m90Var = new m90(context, null);
                if (k0Var.x1()) {
                    i18 = R.string.BoostingStoriesByGiftingGroup2;
                } else {
                    i18 = R.string.BoostingStoriesByGiftingChannel2;
                }
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(i18));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.BoostingStoriesByGiftingLink));
                spannableStringBuilder.setSpan(new pd(this, 8), 0, spannableStringBuilder.length(), 33);
                SpannableString spannableString = new SpannableString(">");
                Drawable mutate = k0Var.getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
                int i24 = j6.gc;
                mutate.setColorFilter(new PorterDuffColorFilter(i24, PorterDuff.Mode.SRC_IN));
                uq uqVar = new uq(0, mutate);
                uqVar.setColorKey(i24);
                uqVar.setSize(AndroidUtilities.dp(18.0f));
                uqVar.setWidth(AndroidUtilities.dp(11.0f));
                uqVar.setTranslateX(-AndroidUtilities.dp(5.0f));
                spannableString.setSpan(uqVar, 0, spannableString.length(), 33);
                m90Var.setText(TextUtils.concat(replaceTags, " ", AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString)));
                m90Var.setTextSize(1, 14.0f);
                m90Var.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
                f6Var8 = ((h3) k0Var).resourcesProvider;
                if (f6Var8 instanceof zh.b) {
                    int i25 = j6.f18306y6;
                    f6Var11 = ((h3) k0Var).resourcesProvider;
                    m90Var.setTextColor(j6.v0(i25, f6Var11));
                } else {
                    int i26 = j6.G6;
                    f6Var9 = ((h3) k0Var).resourcesProvider;
                    m90Var.setTextColor(j6.v0(i26, f6Var9));
                }
                m90Var.setGravity(1);
                m90Var.setOnClickListener(new View.OnClickListener(this) {
                    public final d0 f40683b;

                    {
                        this.f40683b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        f6 f6Var13;
                        switch (r2) {
                            case 0:
                                k0 k0Var2 = this.f40683b.f40706c;
                                p2 p2Var = k0Var2.f21452n;
                                long j3 = k0Var2.f40764a0;
                                f6Var13 = ((h3) k0Var2).resourcesProvider;
                                sg.m.m(p2Var, f6Var13, j3, null);
                                return;
                            case 1:
                                k0 k0Var3 = this.f40683b.f40706c;
                                AndroidUtilities.addToClipboard(k0Var3.p1());
                                k0Var3.dismiss();
                                return;
                            case 2:
                                AndroidUtilities.addToClipboard(this.f40683b.f40706c.p1());
                                return;
                            default:
                                k0 k0Var4 = this.f40683b.f40706c;
                                k0Var4.Q0.run();
                                k0Var4.dismiss();
                                return;
                        }
                    }
                });
                t90Var.setOnClickListener(new org.telegram.ui.web.c(m90Var, 4));
                if (k0Var.y1()) {
                    f6Var10 = ((h3) k0Var).resourcesProvider;
                    bi.d dVar = new bi.d(context, f6Var10, true);
                    dVar.g(LocaleController.getString(R.string.Copy), false, true);
                    dVar.setOnClickListener(new View.OnClickListener(this) {
                        public final d0 f40683b;

                        {
                            this.f40683b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            f6 f6Var13;
                            switch (r2) {
                                case 0:
                                    k0 k0Var2 = this.f40683b.f40706c;
                                    p2 p2Var = k0Var2.f21452n;
                                    long j3 = k0Var2.f40764a0;
                                    f6Var13 = ((h3) k0Var2).resourcesProvider;
                                    sg.m.m(p2Var, f6Var13, j3, null);
                                    return;
                                case 1:
                                    k0 k0Var3 = this.f40683b.f40706c;
                                    AndroidUtilities.addToClipboard(k0Var3.p1());
                                    k0Var3.dismiss();
                                    return;
                                case 2:
                                    AndroidUtilities.addToClipboard(this.f40683b.f40706c.p1());
                                    return;
                                default:
                                    k0 k0Var4 = this.f40683b.f40706c;
                                    k0Var4.Q0.run();
                                    k0Var4.dismiss();
                                    return;
                            }
                        }
                    });
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.addView(k0Var.G0, a6.p(-1, 44, 1.0f, 0, 0, 0, 4, 0));
                    linearLayout2.addView(dVar, a6.p(-1, 44, 1.0f, 0, 4, 0, 0, 0));
                    linearLayout.addView(linearLayout2, a6.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 44));
                } else {
                    linearLayout.addView(k0Var.F0, a6.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 48));
                }
                linearLayout.addView(t90Var, a6.k(0.0f, -5.0f, 0.0f, 0.0f, -1, 48));
                linearLayout.addView(m90Var, a6.k(12.0f, -6.0f, 12.0f, 17.0f, -1, -2));
                j0Var = linearLayout;
                break;
            case 9:
                f6Var12 = ((h3) k0Var).resourcesProvider;
                j0Var = new g0(k0Var, context, f6Var12);
                break;
            default:
                j0 j0Var2 = new j0(k0Var, context);
                k0Var.f40767d0 = j0Var2;
                j0Var = j0Var2;
                break;
        }
        return e2.j(j0Var, j0Var, -1, -2);
    }
}
