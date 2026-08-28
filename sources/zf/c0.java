package zf;

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
import g7.e6;
import java.util.ArrayList;
import java.util.HashSet;
import kh.lb;
import kh.x8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.g4;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.z6;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.vk0;
public final class c0 extends vk0 {
    public final j0 f50478c;

    public c0(j0 j0Var) {
        this.f50478c = j0Var;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        j0 j0Var = this.f50478c;
        int i9 = j0Var.f50535d0;
        if ((i9 != 11 && i9 != 34) || j0Var.U) {
            int i10 = q1Var.f5505f;
            if (i10 == 1 || i10 == 4) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f50478c.f50538g0;
    }

    @Override
    public final int j(int i9) {
        int i10;
        j0 j0Var = this.f50478c;
        if (j0Var.f50539h0 == i9) {
            return 0;
        }
        if (j0Var.f50540i0 == i9) {
            return 2;
        }
        if (j0Var.f50541j0 == i9) {
            return 3;
        }
        if (j0Var.m0 == i9) {
            return 5;
        }
        if (j0Var.f50544n0 == i9) {
            return 6;
        }
        if (j0Var.V == i9) {
            return 7;
        }
        if (j0Var.f50545o0 == i9) {
            return 8;
        }
        ArrayList arrayList = j0Var.f50547q0;
        if (arrayList != null && i9 >= (i10 = j0Var.f50546p0) && i9 <= arrayList.size() + i10) {
            return 9;
        }
        int i11 = j0Var.f50535d0;
        if (i11 != 5 && i11 != 11 && i11 != 34) {
            return 1;
        }
        return 4;
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        String str;
        boolean z10;
        TL_account.requirementToContactPremium requirementtocontactpremium;
        int i10;
        String formatUserStatus;
        j0 j0Var = this.f50478c;
        int i11 = j0Var.f50535d0;
        HashSet hashSet = j0Var.f50551u0;
        int i12 = q1Var.f5505f;
        View view = q1Var.f5501a;
        boolean z11 = false;
        boolean z12 = true;
        if (i12 != 1) {
            if (i12 != 9) {
                if (i12 != 3) {
                    if (i12 == 4) {
                        g4 g4Var = (g4) view;
                        if (i11 == 5) {
                            TLRPC.Chat chat = (TLRPC.Chat) j0Var.f50552v0.get(i9 - j0Var.f50542k0);
                            String str2 = (String) j0Var.f50553w0.get(i9 - j0Var.f50542k0);
                            String str3 = chat.title;
                            if (i9 == j0Var.f50543l0 - 1.0f) {
                                z12 = false;
                            }
                            g4Var.e(chat, str3, str2, z12);
                            g4Var.c(hashSet.contains(chat), false);
                            return;
                        } else if (i11 == 11 || i11 == 34) {
                            TLRPC.User user = (TLRPC.User) j0Var.f50554x0.get(i9 - j0Var.f50542k0);
                            ArrayList arrayList = j0Var.f50555y0;
                            if (arrayList != null && arrayList.contains(Long.valueOf(user.f22527id))) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                requirementtocontactpremium = new TL_account.requirementToContactPremium();
                            } else {
                                requirementtocontactpremium = null;
                            }
                            g4Var.N = true;
                            g4Var.M = requirementtocontactpremium;
                            g4Var.g();
                            if (!z10) {
                                i10 = ((f3) j0Var).currentAccount;
                                formatUserStatus = LocaleController.formatUserStatus(i10, user, null, null);
                            } else {
                                formatUserStatus = LocaleController.getString(R.string.InvitePremiumBlockedUser);
                            }
                            String formatName = ContactsController.formatName(user.first_name, user.last_name);
                            if (i9 == j0Var.f50543l0 - 1.0f) {
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
                if (i11 != 11 && i11 != 34) {
                    if (i11 == 2) {
                        m4Var.setText(LocaleController.getString(R.string.YourPublicCommunities));
                        return;
                    } else {
                        m4Var.setText(LocaleController.getString(R.string.LastActiveCommunities));
                        return;
                    }
                } else if (j0Var.U) {
                    m4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLink));
                    return;
                } else if (j0Var.f50554x0.size() == 1) {
                    m4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted2));
                    return;
                } else {
                    m4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted3));
                    return;
                }
            }
            int i13 = i9 - j0Var.f50546p0;
            ArrayList arrayList2 = j0Var.f50547q0;
            if (arrayList2 != null && i13 >= 0 && i13 < arrayList2.size()) {
                f0 f0Var = (f0) view;
                e0 e0Var = (e0) j0Var.f50547q0.get(i13);
                bh.g gVar = f0Var.f50503c;
                ImageView imageView = f0Var.f50501a;
                h5 h5Var = f0Var.f50502b;
                if (e0Var instanceof d0) {
                    f0Var.f50505f = (d0) e0Var;
                    f0Var.f50504e = null;
                    imageView.setVisibility(8);
                    h5Var.setVisibility(8);
                    gVar.setVisibility(0);
                    h5 h5Var2 = f0Var.d;
                    d0 d0Var = f0Var.f50505f;
                    if (d0Var.h) {
                        str = "BoostLevelUnlocks";
                    } else {
                        str = "BoostLevel";
                    }
                    h5Var2.l(LocaleController.formatPluralString(str, d0Var.f50485g, new Object[0]), false);
                    return;
                } else if (e0Var != null) {
                    f0Var.f50505f = null;
                    f0Var.f50504e = e0Var;
                    imageView.setVisibility(0);
                    imageView.setImageResource(f0Var.f50504e.f50492a);
                    h5Var.setVisibility(0);
                    e0 e0Var2 = f0Var.f50504e;
                    String str4 = "";
                    if (e0Var2.d != null) {
                        String string = LocaleController.getString(f0Var.f50504e.d + "_" + LocaleController.getStringParamForNumber(f0Var.f50504e.f50495e));
                        if (string == null || string.startsWith("LOC_ERR")) {
                            string = LocaleController.getString(f0Var.f50504e.d + "_other");
                        }
                        if (string == null) {
                            string = "";
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                        int indexOf = string.indexOf("%d");
                        if (indexOf >= 0) {
                            spannableStringBuilder = new SpannableStringBuilder(string);
                            SpannableString spannableString = new SpannableString(aa.d.l(f0Var.f50504e.f50495e, "", new StringBuilder()));
                            spannableString.setSpan(new i41(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                            spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) spannableString);
                        }
                        h5Var.l(spannableStringBuilder, false);
                    } else {
                        String string2 = LocaleController.getString(e0Var2.f50493b);
                        if (string2 != null) {
                            str4 = string2;
                        }
                        if (f0Var.f50504e.f50494c != null) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str4);
                            int indexOf2 = str4.indexOf("%s");
                            if (indexOf2 >= 0) {
                                spannableStringBuilder2 = new SpannableStringBuilder(str4);
                                SpannableString spannableString2 = new SpannableString(f0Var.f50504e.f50494c);
                                spannableString2.setSpan(new i41(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
                                spannableStringBuilder2.replace(indexOf2, indexOf2 + 2, (CharSequence) spannableString2);
                            }
                            h5Var.l(spannableStringBuilder2, false);
                        } else {
                            h5Var.l(str4, false);
                        }
                    }
                    gVar.setVisibility(8);
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        TLRPC.Chat chat2 = (TLRPC.Chat) j0Var.f50536e0.get(i9 - j0Var.f50542k0);
        org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) view;
        TLRPC.Chat currentChannel = nVar.getCurrentChannel();
        nVar.a(chat2, false);
        boolean contains = hashSet.contains(chat2);
        if (currentChannel == chat2) {
            z11 = true;
        }
        nVar.f24729r.a(contains, z11);
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        b6 b6Var;
        b6 b6Var2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f10;
        b6 b6Var3;
        b6 b6Var4;
        b6 b6Var5;
        b6 b6Var6;
        b6 b6Var7;
        int i15;
        int i16;
        int i17;
        b6 b6Var8;
        b6 b6Var9;
        i0 i0Var;
        b6 b6Var10;
        b6 b6Var11;
        b6 b6Var12;
        Context context = viewGroup.getContext();
        j0 j0Var = this.f50478c;
        switch (i9) {
            case 1:
                i0Var = new org.telegram.ui.Cells.n(context, new a0(this), true, 9);
                break;
            case 2:
                int i18 = f6.f22947a7;
                b6Var = ((f3) j0Var).resourcesProvider;
                i0Var = new z6(context, f6.v0(i18, b6Var), 0);
                break;
            case 3:
                View m4Var = new m4(context);
                m4Var.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
                i0Var = m4Var;
                break;
            case 4:
                b6Var2 = ((f3) j0Var).resourcesProvider;
                View g4Var = new g4(1, 0, context, b6Var2, false, false);
                i10 = ((f3) j0Var).backgroundPaddingLeft;
                i11 = ((f3) j0Var).backgroundPaddingLeft;
                g4Var.setPadding(i10, 0, i11, 0);
                i0Var = g4Var;
                break;
            case 5:
                e00 e00Var = new e00(context, null);
                if (j0Var.f50535d0 == 2) {
                    i12 = 22;
                } else {
                    i12 = 21;
                }
                e00Var.setViewType(i12);
                e00Var.setIsSingleCell(true);
                e00Var.setIgnoreHeightCheck(true);
                e00Var.setItemsCount(10);
                i0Var = e00Var;
                break;
            case 6:
                i0Var = new b0(j0Var.getContext(), 0);
                break;
            case 7:
                FrameLayout frameLayout = new FrameLayout(j0Var.getContext());
                i13 = ((f3) j0Var).backgroundPaddingLeft;
                int dp = AndroidUtilities.dp(6.0f) + i13;
                i14 = ((f3) j0Var).backgroundPaddingLeft;
                frameLayout.setPadding(dp, 0, AndroidUtilities.dp(6.0f) + i14, 0);
                TextView textView = new TextView(context);
                if (j0Var.M0 == null && ChatObject.hasAdminRights(j0Var.s1())) {
                    j0Var.M0 = new pf.o1(this, 26);
                }
                int dp2 = AndroidUtilities.dp(18.0f);
                int dp3 = AndroidUtilities.dp(13.0f);
                if (j0Var.M0 == null) {
                    f10 = 18.0f;
                } else {
                    f10 = 50.0f;
                }
                textView.setPadding(dp2, dp3, AndroidUtilities.dp(f10), AndroidUtilities.dp(13.0f));
                textView.setTextSize(1, 16.0f);
                textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                textView.setSingleLine(true);
                frameLayout.addView(textView, e6.d(-1, -2.0f, 0, 11.0f, 0.0f, 11.0f, 0.0f));
                int dp4 = AndroidUtilities.dp(8.0f);
                int i19 = f6.f23020e7;
                b6Var3 = ((f3) j0Var).resourcesProvider;
                int v02 = f6.v0(i19, b6Var3);
                int i20 = f6.f23092i6;
                b6Var4 = ((f3) j0Var).resourcesProvider;
                int k10 = i0.a.k(f6.v0(i20, b6Var4), 76);
                textView.setBackground(f6.i0(dp4, dp4, dp4, dp4, v02, k10, k10));
                int i21 = f6.G6;
                b6Var5 = ((f3) j0Var).resourcesProvider;
                textView.setTextColor(f6.v0(i21, b6Var5));
                textView.setOnClickListener(new View.OnClickListener(this) {
                    public final c0 f50787b;

                    {
                        this.f50787b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        b6 b6Var13;
                        switch (r2) {
                            case 0:
                                j0 j0Var2 = this.f50787b.f50478c;
                                o2 o2Var = j0Var2.f32410n;
                                long j10 = j0Var2.W;
                                b6Var13 = ((f3) j0Var2).resourcesProvider;
                                bg.a0.m(o2Var, b6Var13, j10, null);
                                return;
                            case 1:
                                j0 j0Var3 = this.f50787b.f50478c;
                                AndroidUtilities.addToClipboard(j0Var3.p1());
                                j0Var3.dismiss();
                                return;
                            case 2:
                                AndroidUtilities.addToClipboard(this.f50787b.f50478c.p1());
                                return;
                            default:
                                j0 j0Var4 = this.f50787b.f50478c;
                                j0Var4.M0.run();
                                j0Var4.dismiss();
                                return;
                        }
                    }
                });
                if (j0Var.M0 != null) {
                    ImageView imageView = new ImageView(j0Var.getContext());
                    imageView.setImageResource(R.drawable.msg_stats);
                    int i22 = f6.f23108j5;
                    b6Var6 = ((f3) j0Var).resourcesProvider;
                    imageView.setColorFilter(f6.v0(i22, b6Var6));
                    imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                    int dp5 = AndroidUtilities.dp(20.0f);
                    b6Var7 = ((f3) j0Var).resourcesProvider;
                    int k11 = i0.a.k(f6.v0(i20, b6Var7), 76);
                    imageView.setBackground(f6.i0(dp5, dp5, dp5, dp5, 0, k11, k11));
                    frameLayout.addView(imageView, e6.d(40, 40.0f, 21, 15.0f, 0.0f, 15.0f, 0.0f));
                    imageView.setOnClickListener(new View.OnClickListener(this) {
                        public final c0 f50787b;

                        {
                            this.f50787b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            b6 b6Var13;
                            switch (r2) {
                                case 0:
                                    j0 j0Var2 = this.f50787b.f50478c;
                                    o2 o2Var = j0Var2.f32410n;
                                    long j10 = j0Var2.W;
                                    b6Var13 = ((f3) j0Var2).resourcesProvider;
                                    bg.a0.m(o2Var, b6Var13, j10, null);
                                    return;
                                case 1:
                                    j0 j0Var3 = this.f50787b.f50478c;
                                    AndroidUtilities.addToClipboard(j0Var3.p1());
                                    j0Var3.dismiss();
                                    return;
                                case 2:
                                    AndroidUtilities.addToClipboard(this.f50787b.f50478c.p1());
                                    return;
                                default:
                                    j0 j0Var4 = this.f50787b.f50478c;
                                    j0Var4.M0.run();
                                    j0Var4.dismiss();
                                    return;
                            }
                        }
                    });
                }
                textView.setText(j0Var.p1());
                textView.setGravity(17);
                i0Var = frameLayout;
                break;
            case 8:
                LinearLayout linearLayout = new LinearLayout(context);
                i15 = ((f3) j0Var).backgroundPaddingLeft;
                int dp6 = AndroidUtilities.dp(6.0f) + i15;
                i16 = ((f3) j0Var).backgroundPaddingLeft;
                linearLayout.setPadding(dp6, 0, AndroidUtilities.dp(6.0f) + i16, 0);
                linearLayout.setOrientation(1);
                s80 s80Var = new s80(context);
                l80 l80Var = new l80(context, null);
                if (j0Var.x1()) {
                    i17 = R.string.BoostingStoriesByGiftingGroup2;
                } else {
                    i17 = R.string.BoostingStoriesByGiftingChannel2;
                }
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(i17));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.BoostingStoriesByGiftingLink));
                spannableStringBuilder.setSpan(new lb(this, 8), 0, spannableStringBuilder.length(), 33);
                SpannableString spannableString = new SpannableString(">");
                Drawable mutate = j0Var.getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
                int i23 = f6.f23061gc;
                mutate.setColorFilter(new PorterDuffColorFilter(i23, PorterDuff.Mode.SRC_IN));
                eq eqVar = new eq(0, mutate);
                eqVar.setColorKey(i23);
                eqVar.setSize(AndroidUtilities.dp(18.0f));
                eqVar.setWidth(AndroidUtilities.dp(11.0f));
                eqVar.setTranslateX(-AndroidUtilities.dp(5.0f));
                spannableString.setSpan(eqVar, 0, spannableString.length(), 33);
                l80Var.setText(TextUtils.concat(replaceTags, " ", AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString)));
                l80Var.setTextSize(1, 14.0f);
                l80Var.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
                b6Var8 = ((f3) j0Var).resourcesProvider;
                if (b6Var8 instanceof ih.b) {
                    int i24 = f6.f23369y6;
                    b6Var11 = ((f3) j0Var).resourcesProvider;
                    l80Var.setTextColor(f6.v0(i24, b6Var11));
                } else {
                    int i25 = f6.G6;
                    b6Var9 = ((f3) j0Var).resourcesProvider;
                    l80Var.setTextColor(f6.v0(i25, b6Var9));
                }
                l80Var.setGravity(1);
                l80Var.setOnClickListener(new View.OnClickListener(this) {
                    public final c0 f50787b;

                    {
                        this.f50787b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        b6 b6Var13;
                        switch (r2) {
                            case 0:
                                j0 j0Var2 = this.f50787b.f50478c;
                                o2 o2Var = j0Var2.f32410n;
                                long j10 = j0Var2.W;
                                b6Var13 = ((f3) j0Var2).resourcesProvider;
                                bg.a0.m(o2Var, b6Var13, j10, null);
                                return;
                            case 1:
                                j0 j0Var3 = this.f50787b.f50478c;
                                AndroidUtilities.addToClipboard(j0Var3.p1());
                                j0Var3.dismiss();
                                return;
                            case 2:
                                AndroidUtilities.addToClipboard(this.f50787b.f50478c.p1());
                                return;
                            default:
                                j0 j0Var4 = this.f50787b.f50478c;
                                j0Var4.M0.run();
                                j0Var4.dismiss();
                                return;
                        }
                    }
                });
                s80Var.setOnClickListener(new x8(l80Var, 27));
                if (j0Var.y1()) {
                    b6Var10 = ((f3) j0Var).resourcesProvider;
                    kh.d dVar = new kh.d(context, b6Var10, true);
                    dVar.g(LocaleController.getString(R.string.Copy), false, true);
                    dVar.setOnClickListener(new View.OnClickListener(this) {
                        public final c0 f50787b;

                        {
                            this.f50787b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            b6 b6Var13;
                            switch (r2) {
                                case 0:
                                    j0 j0Var2 = this.f50787b.f50478c;
                                    o2 o2Var = j0Var2.f32410n;
                                    long j10 = j0Var2.W;
                                    b6Var13 = ((f3) j0Var2).resourcesProvider;
                                    bg.a0.m(o2Var, b6Var13, j10, null);
                                    return;
                                case 1:
                                    j0 j0Var3 = this.f50787b.f50478c;
                                    AndroidUtilities.addToClipboard(j0Var3.p1());
                                    j0Var3.dismiss();
                                    return;
                                case 2:
                                    AndroidUtilities.addToClipboard(this.f50787b.f50478c.p1());
                                    return;
                                default:
                                    j0 j0Var4 = this.f50787b.f50478c;
                                    j0Var4.M0.run();
                                    j0Var4.dismiss();
                                    return;
                            }
                        }
                    });
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.addView(j0Var.C0, e6.p(-1, 44, 1.0f, 0, 0, 0, 4, 0));
                    linearLayout2.addView(dVar, e6.p(-1, 44, 1.0f, 0, 4, 0, 0, 0));
                    linearLayout.addView(linearLayout2, e6.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 44));
                } else {
                    linearLayout.addView(j0Var.B0, e6.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 48));
                }
                linearLayout.addView(s80Var, e6.k(0.0f, -5.0f, 0.0f, 0.0f, -1, 48));
                linearLayout.addView(l80Var, e6.k(12.0f, -6.0f, 12.0f, 17.0f, -1, -2));
                i0Var = linearLayout;
                break;
            case 9:
                b6Var12 = ((f3) j0Var).resourcesProvider;
                i0Var = new f0(j0Var, context, b6Var12);
                break;
            default:
                i0 i0Var2 = new i0(j0Var, context);
                j0Var.Z = i0Var2;
                i0Var = i0Var2;
                break;
        }
        return j3.r0.s(i0Var, i0Var, -1, -2);
    }
}
