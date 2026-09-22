package rg;

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
import ci.dc;
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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.a7;
import org.telegram.ui.Cells.g4;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.kn;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.t00;
import org.telegram.ui.t5;
import w7.x5;
public final class c0 extends kl0 {
    public final j0 f42262c;

    public c0(j0 j0Var) {
        this.f42262c = j0Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        j0 j0Var = this.f42262c;
        int i10 = j0Var.f42313h0;
        if ((i10 != 11 && i10 != 34) || j0Var.Y) {
            int i11 = c1Var.f42674f;
            if (i11 == 1 || i11 == 4) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f42262c.f42316k0;
    }

    @Override
    public final int j(int i10) {
        int i11;
        j0 j0Var = this.f42262c;
        if (j0Var.f42317l0 == i10) {
            return 0;
        }
        if (j0Var.m0 == i10) {
            return 2;
        }
        if (j0Var.f42318n0 == i10) {
            return 3;
        }
        if (j0Var.f42321q0 == i10) {
            return 5;
        }
        if (j0Var.f42322r0 == i10) {
            return 6;
        }
        if (j0Var.Z == i10) {
            return 7;
        }
        if (j0Var.f42323s0 == i10) {
            return 8;
        }
        ArrayList arrayList = j0Var.f42325u0;
        if (arrayList != null && i10 >= (i11 = j0Var.f42324t0) && i10 <= arrayList.size() + i11) {
            return 9;
        }
        int i12 = j0Var.f42313h0;
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
        j0 j0Var = this.f42262c;
        int i12 = j0Var.f42313h0;
        HashSet hashSet = j0Var.f42329y0;
        int i13 = c1Var.f42674f;
        View view = c1Var.f42671a;
        boolean z11 = false;
        boolean z12 = true;
        if (i13 != 1) {
            if (i13 != 9) {
                if (i13 != 3) {
                    if (i13 == 4) {
                        g4 g4Var = (g4) view;
                        if (i12 == 5) {
                            TLRPC.Chat chat = (TLRPC.Chat) j0Var.f42330z0.get(i10 - j0Var.f42319o0);
                            String str2 = (String) j0Var.A0.get(i10 - j0Var.f42319o0);
                            String str3 = chat.title;
                            if (i10 == j0Var.f42320p0 - 1.0f) {
                                z12 = false;
                            }
                            g4Var.e(chat, str3, str2, z12);
                            g4Var.c(hashSet.contains(chat), false);
                            return;
                        } else if (i12 == 11 || i12 == 34) {
                            TLRPC.User user = (TLRPC.User) j0Var.B0.get(i10 - j0Var.f42319o0);
                            ArrayList arrayList = j0Var.C0;
                            if (arrayList != null && arrayList.contains(Long.valueOf(user.f18256id))) {
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
                                i11 = ((f3) j0Var).currentAccount;
                                formatUserStatus = LocaleController.formatUserStatus(i11, user, null, null);
                            } else {
                                formatUserStatus = LocaleController.getString(R.string.InvitePremiumBlockedUser);
                            }
                            String formatName = ContactsController.formatName(user.first_name, user.last_name);
                            if (i10 == j0Var.f42320p0 - 1.0f) {
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
                } else if (j0Var.Y) {
                    m4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLink));
                    return;
                } else if (j0Var.B0.size() == 1) {
                    m4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted2));
                    return;
                } else {
                    m4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted3));
                    return;
                }
            }
            int i14 = i10 - j0Var.f42324t0;
            ArrayList arrayList2 = j0Var.f42325u0;
            if (arrayList2 != null && i14 >= 0 && i14 < arrayList2.size()) {
                f0 f0Var = (f0) view;
                e0 e0Var = (e0) j0Var.f42325u0.get(i14);
                t5 t5Var = f0Var.f42284c;
                ImageView imageView = f0Var.f42282a;
                j5 j5Var = f0Var.f42283b;
                if (e0Var instanceof d0) {
                    f0Var.f42285f = (d0) e0Var;
                    f0Var.e = null;
                    imageView.setVisibility(8);
                    j5Var.setVisibility(8);
                    t5Var.setVisibility(0);
                    j5 j5Var2 = f0Var.d;
                    d0 d0Var = f0Var.f42285f;
                    if (d0Var.h) {
                        str = "BoostLevelUnlocks";
                    } else {
                        str = "BoostLevel";
                    }
                    j5Var2.l(LocaleController.formatPluralString(str, d0Var.f42268g, new Object[0]), false);
                    return;
                } else if (e0Var != null) {
                    f0Var.f42285f = null;
                    f0Var.e = e0Var;
                    imageView.setVisibility(0);
                    imageView.setImageResource(f0Var.e.f42274a);
                    j5Var.setVisibility(0);
                    e0 e0Var2 = f0Var.e;
                    String str4 = "";
                    if (e0Var2.d != null) {
                        String string = LocaleController.getString(f0Var.e.d + "_" + LocaleController.getStringParamForNumber(f0Var.e.e));
                        if (string == null || string.startsWith("LOC_ERR")) {
                            string = LocaleController.getString(f0Var.e.d + "_other");
                        }
                        if (string == null) {
                            string = "";
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                        int indexOf = string.indexOf("%d");
                        if (indexOf >= 0) {
                            spannableStringBuilder = new SpannableStringBuilder(string);
                            SpannableString spannableString = new SpannableString(a4.a.o(f0Var.e.e, "", new StringBuilder()));
                            spannableString.setSpan(new f51(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                            spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) spannableString);
                        }
                        j5Var.l(spannableStringBuilder, false);
                    } else {
                        String string2 = LocaleController.getString(e0Var2.f42275b);
                        if (string2 != null) {
                            str4 = string2;
                        }
                        if (f0Var.e.f42276c != null) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str4);
                            int indexOf2 = str4.indexOf("%s");
                            if (indexOf2 >= 0) {
                                spannableStringBuilder2 = new SpannableStringBuilder(str4);
                                SpannableString spannableString2 = new SpannableString(f0Var.e.f42276c);
                                spannableString2.setSpan(new f51(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
                                spannableStringBuilder2.replace(indexOf2, indexOf2 + 2, (CharSequence) spannableString2);
                            }
                            j5Var.l(spannableStringBuilder2, false);
                        } else {
                            j5Var.l(str4, false);
                        }
                    }
                    t5Var.setVisibility(8);
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        TLRPC.Chat chat2 = (TLRPC.Chat) j0Var.f42314i0.get(i10 - j0Var.f42319o0);
        org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) view;
        TLRPC.Chat currentChannel = nVar.getCurrentChannel();
        nVar.a(chat2, false);
        boolean contains = hashSet.contains(chat2);
        if (currentChannel == chat2) {
            z11 = true;
        }
        nVar.f20439r.a(contains, z11);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        e6 e6Var;
        e6 e6Var2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f7;
        e6 e6Var3;
        e6 e6Var4;
        e6 e6Var5;
        e6 e6Var6;
        e6 e6Var7;
        int i16;
        int i17;
        int i18;
        e6 e6Var8;
        e6 e6Var9;
        i0 i0Var;
        e6 e6Var10;
        e6 e6Var11;
        e6 e6Var12;
        Context context = viewGroup.getContext();
        j0 j0Var = this.f42262c;
        switch (i10) {
            case 1:
                i0Var = new org.telegram.ui.Cells.n(context, new b0(this), true, 9);
                break;
            case 2:
                int i19 = i6.f18778a7;
                e6Var = ((f3) j0Var).resourcesProvider;
                i0Var = new a7(context, i6.v0(i19, e6Var), 0);
                break;
            case 3:
                View m4Var = new m4(context);
                m4Var.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
                i0Var = m4Var;
                break;
            case 4:
                e6Var2 = ((f3) j0Var).resourcesProvider;
                View g4Var = new g4(1, 0, context, e6Var2, false, false);
                i11 = ((f3) j0Var).backgroundPaddingLeft;
                i12 = ((f3) j0Var).backgroundPaddingLeft;
                g4Var.setPadding(i11, 0, i12, 0);
                i0Var = g4Var;
                break;
            case 5:
                t00 t00Var = new t00(context, null);
                if (j0Var.f42313h0 == 2) {
                    i13 = 22;
                } else {
                    i13 = 21;
                }
                t00Var.setViewType(i13);
                t00Var.setIsSingleCell(true);
                t00Var.setIgnoreHeightCheck(true);
                t00Var.setItemsCount(10);
                i0Var = t00Var;
                break;
            case 6:
                i0Var = new kn(j0Var.getContext(), 29);
                break;
            case 7:
                FrameLayout frameLayout = new FrameLayout(j0Var.getContext());
                i14 = ((f3) j0Var).backgroundPaddingLeft;
                int dp = AndroidUtilities.dp(6.0f) + i14;
                i15 = ((f3) j0Var).backgroundPaddingLeft;
                frameLayout.setPadding(dp, 0, AndroidUtilities.dp(6.0f) + i15, 0);
                TextView textView = new TextView(context);
                if (j0Var.Q0 == null && ChatObject.hasAdminRights(j0Var.s1())) {
                    j0Var.Q0 = new org.telegram.ui.web.u0(this, 25);
                }
                int dp2 = AndroidUtilities.dp(18.0f);
                int dp3 = AndroidUtilities.dp(13.0f);
                if (j0Var.Q0 == null) {
                    f7 = 18.0f;
                } else {
                    f7 = 50.0f;
                }
                textView.setPadding(dp2, dp3, AndroidUtilities.dp(f7), AndroidUtilities.dp(13.0f));
                textView.setTextSize(1, 16.0f);
                textView.setEllipsize(TextUtils.TruncateAt.MIDDLE);
                textView.setSingleLine(true);
                frameLayout.addView(textView, x5.d(-1, -2.0f, 0, 11.0f, 0.0f, 11.0f, 0.0f));
                int dp4 = AndroidUtilities.dp(8.0f);
                int i20 = i6.e7;
                e6Var3 = ((f3) j0Var).resourcesProvider;
                int v02 = i6.v0(i20, e6Var3);
                int i21 = i6.f18923i6;
                e6Var4 = ((f3) j0Var).resourcesProvider;
                int k10 = i0.a.k(i6.v0(i21, e6Var4), 76);
                textView.setBackground(i6.i0(dp4, dp4, dp4, dp4, v02, k10, k10));
                int i22 = i6.G6;
                e6Var5 = ((f3) j0Var).resourcesProvider;
                textView.setTextColor(i6.v0(i22, e6Var5));
                textView.setOnClickListener(new View.OnClickListener(this) {
                    public final c0 f42240b;

                    {
                        this.f42240b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        e6 e6Var13;
                        switch (r2) {
                            case 0:
                                j0 j0Var2 = this.f42240b.f42262c;
                                n2 n2Var = j0Var2.f30525n;
                                long j3 = j0Var2.f42306a0;
                                e6Var13 = ((f3) j0Var2).resourcesProvider;
                                tg.o.m(n2Var, e6Var13, j3, null);
                                return;
                            case 1:
                                j0 j0Var3 = this.f42240b.f42262c;
                                AndroidUtilities.addToClipboard(j0Var3.p1());
                                j0Var3.dismiss();
                                return;
                            case 2:
                                AndroidUtilities.addToClipboard(this.f42240b.f42262c.p1());
                                return;
                            default:
                                j0 j0Var4 = this.f42240b.f42262c;
                                j0Var4.Q0.run();
                                j0Var4.dismiss();
                                return;
                        }
                    }
                });
                if (j0Var.Q0 != null) {
                    ImageView imageView = new ImageView(j0Var.getContext());
                    imageView.setImageResource(R.drawable.msg_stats);
                    int i23 = i6.f18940j5;
                    e6Var6 = ((f3) j0Var).resourcesProvider;
                    imageView.setColorFilter(i6.v0(i23, e6Var6));
                    imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                    int dp5 = AndroidUtilities.dp(20.0f);
                    e6Var7 = ((f3) j0Var).resourcesProvider;
                    int k11 = i0.a.k(i6.v0(i21, e6Var7), 76);
                    imageView.setBackground(i6.i0(dp5, dp5, dp5, dp5, 0, k11, k11));
                    frameLayout.addView(imageView, x5.d(40, 40.0f, 21, 15.0f, 0.0f, 15.0f, 0.0f));
                    imageView.setOnClickListener(new View.OnClickListener(this) {
                        public final c0 f42240b;

                        {
                            this.f42240b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            e6 e6Var13;
                            switch (r2) {
                                case 0:
                                    j0 j0Var2 = this.f42240b.f42262c;
                                    n2 n2Var = j0Var2.f30525n;
                                    long j3 = j0Var2.f42306a0;
                                    e6Var13 = ((f3) j0Var2).resourcesProvider;
                                    tg.o.m(n2Var, e6Var13, j3, null);
                                    return;
                                case 1:
                                    j0 j0Var3 = this.f42240b.f42262c;
                                    AndroidUtilities.addToClipboard(j0Var3.p1());
                                    j0Var3.dismiss();
                                    return;
                                case 2:
                                    AndroidUtilities.addToClipboard(this.f42240b.f42262c.p1());
                                    return;
                                default:
                                    j0 j0Var4 = this.f42240b.f42262c;
                                    j0Var4.Q0.run();
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
                i16 = ((f3) j0Var).backgroundPaddingLeft;
                int dp6 = AndroidUtilities.dp(6.0f) + i16;
                i17 = ((f3) j0Var).backgroundPaddingLeft;
                linearLayout.setPadding(dp6, 0, AndroidUtilities.dp(6.0f) + i17, 0);
                linearLayout.setOrientation(1);
                j90 j90Var = new j90(context);
                c90 c90Var = new c90(context, null);
                if (j0Var.x1()) {
                    i18 = R.string.BoostingStoriesByGiftingGroup2;
                } else {
                    i18 = R.string.BoostingStoriesByGiftingChannel2;
                }
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(i18));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.BoostingStoriesByGiftingLink));
                spannableStringBuilder.setSpan(new dc(this, 8), 0, spannableStringBuilder.length(), 33);
                SpannableString spannableString = new SpannableString(">");
                Drawable mutate = j0Var.getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
                int i24 = i6.gc;
                mutate.setColorFilter(new PorterDuffColorFilter(i24, PorterDuff.Mode.SRC_IN));
                oq oqVar = new oq(0, mutate);
                oqVar.setColorKey(i24);
                oqVar.setSize(AndroidUtilities.dp(18.0f));
                oqVar.setWidth(AndroidUtilities.dp(11.0f));
                oqVar.setTranslateX(-AndroidUtilities.dp(5.0f));
                spannableString.setSpan(oqVar, 0, spannableString.length(), 33);
                c90Var.setText(TextUtils.concat(replaceTags, " ", AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString)));
                c90Var.setTextSize(1, 14.0f);
                c90Var.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
                e6Var8 = ((f3) j0Var).resourcesProvider;
                if (e6Var8 instanceof ai.d) {
                    int i25 = i6.f19215y6;
                    e6Var11 = ((f3) j0Var).resourcesProvider;
                    c90Var.setTextColor(i6.v0(i25, e6Var11));
                } else {
                    int i26 = i6.G6;
                    e6Var9 = ((f3) j0Var).resourcesProvider;
                    c90Var.setTextColor(i6.v0(i26, e6Var9));
                }
                c90Var.setGravity(1);
                c90Var.setOnClickListener(new View.OnClickListener(this) {
                    public final c0 f42240b;

                    {
                        this.f42240b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        e6 e6Var13;
                        switch (r2) {
                            case 0:
                                j0 j0Var2 = this.f42240b.f42262c;
                                n2 n2Var = j0Var2.f30525n;
                                long j3 = j0Var2.f42306a0;
                                e6Var13 = ((f3) j0Var2).resourcesProvider;
                                tg.o.m(n2Var, e6Var13, j3, null);
                                return;
                            case 1:
                                j0 j0Var3 = this.f42240b.f42262c;
                                AndroidUtilities.addToClipboard(j0Var3.p1());
                                j0Var3.dismiss();
                                return;
                            case 2:
                                AndroidUtilities.addToClipboard(this.f42240b.f42262c.p1());
                                return;
                            default:
                                j0 j0Var4 = this.f42240b.f42262c;
                                j0Var4.Q0.run();
                                j0Var4.dismiss();
                                return;
                        }
                    }
                });
                j90Var.setOnClickListener(new org.telegram.ui.Components.voip.o(c90Var, 9));
                if (j0Var.y1()) {
                    e6Var10 = ((f3) j0Var).resourcesProvider;
                    ci.d dVar = new ci.d(context, e6Var10, true);
                    dVar.g(LocaleController.getString(R.string.Copy), false, true);
                    dVar.setOnClickListener(new View.OnClickListener(this) {
                        public final c0 f42240b;

                        {
                            this.f42240b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            e6 e6Var13;
                            switch (r2) {
                                case 0:
                                    j0 j0Var2 = this.f42240b.f42262c;
                                    n2 n2Var = j0Var2.f30525n;
                                    long j3 = j0Var2.f42306a0;
                                    e6Var13 = ((f3) j0Var2).resourcesProvider;
                                    tg.o.m(n2Var, e6Var13, j3, null);
                                    return;
                                case 1:
                                    j0 j0Var3 = this.f42240b.f42262c;
                                    AndroidUtilities.addToClipboard(j0Var3.p1());
                                    j0Var3.dismiss();
                                    return;
                                case 2:
                                    AndroidUtilities.addToClipboard(this.f42240b.f42262c.p1());
                                    return;
                                default:
                                    j0 j0Var4 = this.f42240b.f42262c;
                                    j0Var4.Q0.run();
                                    j0Var4.dismiss();
                                    return;
                            }
                        }
                    });
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.addView(j0Var.G0, x5.p(-1, 44, 1.0f, 0, 0, 0, 4, 0));
                    linearLayout2.addView(dVar, x5.p(-1, 44, 1.0f, 0, 4, 0, 0, 0));
                    linearLayout.addView(linearLayout2, x5.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 44));
                } else {
                    linearLayout.addView(j0Var.F0, x5.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 48));
                }
                linearLayout.addView(j90Var, x5.k(0.0f, -5.0f, 0.0f, 0.0f, -1, 48));
                linearLayout.addView(c90Var, x5.k(12.0f, -6.0f, 12.0f, 17.0f, -1, -2));
                i0Var = linearLayout;
                break;
            case 9:
                e6Var12 = ((f3) j0Var).resourcesProvider;
                i0Var = new f0(j0Var, context, e6Var12);
                break;
            default:
                i0 i0Var2 = new i0(j0Var, context);
                j0Var.f42309d0 = i0Var2;
                i0Var = i0Var2;
                break;
        }
        return e2.k(i0Var, i0Var, -1, -2);
    }
}
