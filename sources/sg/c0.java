package sg;

import ai.o5;
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
import com.google.android.gms.internal.play_billing.k3;
import ei.kb;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.b7;
import org.telegram.ui.Cells.f4;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.sn;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.w90;
import org.telegram.ui.Components.z00;
import w7.z5;
public final class c0 extends km0 {
    public final j0 f46650c;

    public c0(j0 j0Var) {
        this.f46650c = j0Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        j0 j0Var = this.f46650c;
        int i10 = j0Var.f46712h0;
        if ((i10 != 11 && i10 != 34) || j0Var.Y) {
            int i11 = b1Var.f46345f;
            if (i11 == 1 || i11 == 4) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f46650c.f46715k0;
    }

    @Override
    public final int j(int i10) {
        int i11;
        j0 j0Var = this.f46650c;
        if (j0Var.f46716l0 == i10) {
            return 0;
        }
        if (j0Var.m0 == i10) {
            return 2;
        }
        if (j0Var.f46717n0 == i10) {
            return 3;
        }
        if (j0Var.f46720q0 == i10) {
            return 5;
        }
        if (j0Var.f46721r0 == i10) {
            return 6;
        }
        if (j0Var.Z == i10) {
            return 7;
        }
        if (j0Var.f46722s0 == i10) {
            return 8;
        }
        ArrayList arrayList = j0Var.f46724u0;
        if (arrayList != null && i10 >= (i11 = j0Var.f46723t0) && i10 <= arrayList.size() + i11) {
            return 9;
        }
        int i12 = j0Var.f46712h0;
        if (i12 != 5 && i12 != 11 && i12 != 34) {
            return 1;
        }
        return 4;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        String str;
        boolean z10;
        TL_account.requirementToContactPremium requirementtocontactpremium;
        int i11;
        String formatUserStatus;
        j0 j0Var = this.f46650c;
        int i12 = j0Var.f46712h0;
        HashSet hashSet = j0Var.f46728y0;
        int i13 = b1Var.f46345f;
        View view = b1Var.f46342a;
        boolean z11 = false;
        boolean z12 = true;
        if (i13 != 1) {
            if (i13 != 9) {
                if (i13 != 3) {
                    if (i13 == 4) {
                        f4 f4Var = (f4) view;
                        if (i12 == 5) {
                            TLRPC.Chat chat = (TLRPC.Chat) j0Var.f46729z0.get(i10 - j0Var.f46718o0);
                            String str2 = (String) j0Var.A0.get(i10 - j0Var.f46718o0);
                            String str3 = chat.title;
                            if (i10 == j0Var.f46719p0 - 1.0f) {
                                z12 = false;
                            }
                            f4Var.e(chat, str3, str2, z12);
                            f4Var.c(hashSet.contains(chat), false);
                            return;
                        } else if (i12 == 11 || i12 == 34) {
                            TLRPC.User user = (TLRPC.User) j0Var.B0.get(i10 - j0Var.f46718o0);
                            ArrayList arrayList = j0Var.C0;
                            if (arrayList != null && arrayList.contains(Long.valueOf(user.f20491id))) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                requirementtocontactpremium = new TL_account.requirementToContactPremium();
                            } else {
                                requirementtocontactpremium = null;
                            }
                            f4Var.R = true;
                            f4Var.Q = requirementtocontactpremium;
                            f4Var.g();
                            if (!z10) {
                                i11 = ((h3) j0Var).currentAccount;
                                formatUserStatus = LocaleController.formatUserStatus(i11, user, null, null);
                            } else {
                                formatUserStatus = LocaleController.getString(R.string.InvitePremiumBlockedUser);
                            }
                            String formatName = ContactsController.formatName(user.first_name, user.last_name);
                            if (i10 == j0Var.f46719p0 - 1.0f) {
                                z12 = false;
                            }
                            f4Var.e(user, formatName, formatUserStatus, z12);
                            f4Var.c(hashSet.contains(user), false);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                l4 l4Var = (l4) view;
                if (i12 != 11 && i12 != 34) {
                    if (i12 == 2) {
                        l4Var.setText(LocaleController.getString(R.string.YourPublicCommunities));
                        return;
                    } else {
                        l4Var.setText(LocaleController.getString(R.string.LastActiveCommunities));
                        return;
                    }
                } else if (j0Var.Y) {
                    l4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLink));
                    return;
                } else if (j0Var.B0.size() == 1) {
                    l4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted2));
                    return;
                } else {
                    l4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted3));
                    return;
                }
            }
            int i14 = i10 - j0Var.f46723t0;
            ArrayList arrayList2 = j0Var.f46724u0;
            if (arrayList2 != null && i14 >= 0 && i14 < arrayList2.size()) {
                f0 f0Var = (f0) view;
                e0 e0Var = (e0) j0Var.f46724u0.get(i14);
                o5 o5Var = f0Var.f46681c;
                ImageView imageView = f0Var.f46679a;
                n5 n5Var = f0Var.f46680b;
                if (e0Var instanceof d0) {
                    f0Var.f46682f = (d0) e0Var;
                    f0Var.e = null;
                    imageView.setVisibility(8);
                    n5Var.setVisibility(8);
                    o5Var.setVisibility(0);
                    n5 n5Var2 = f0Var.d;
                    d0 d0Var = f0Var.f46682f;
                    if (d0Var.h) {
                        str = "BoostLevelUnlocks";
                    } else {
                        str = "BoostLevel";
                    }
                    n5Var2.l(LocaleController.formatPluralString(str, d0Var.f46666g, new Object[0]), false);
                    return;
                } else if (e0Var != null) {
                    f0Var.f46682f = null;
                    f0Var.e = e0Var;
                    imageView.setVisibility(0);
                    imageView.setImageResource(f0Var.e.f46670a);
                    n5Var.setVisibility(0);
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
                            SpannableString spannableString = new SpannableString(a1.g.n(f0Var.e.e, "", new StringBuilder()));
                            spannableString.setSpan(new i61(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                            spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) spannableString);
                        }
                        n5Var.l(spannableStringBuilder, false);
                    } else {
                        String string2 = LocaleController.getString(e0Var2.f46671b);
                        if (string2 != null) {
                            str4 = string2;
                        }
                        if (f0Var.e.f46672c != null) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str4);
                            int indexOf2 = str4.indexOf("%s");
                            if (indexOf2 >= 0) {
                                spannableStringBuilder2 = new SpannableStringBuilder(str4);
                                SpannableString spannableString2 = new SpannableString(f0Var.e.f46672c);
                                spannableString2.setSpan(new i61(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
                                spannableStringBuilder2.replace(indexOf2, indexOf2 + 2, (CharSequence) spannableString2);
                            }
                            n5Var.l(spannableStringBuilder2, false);
                        } else {
                            n5Var.l(str4, false);
                        }
                    }
                    o5Var.setVisibility(8);
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        TLRPC.Chat chat2 = (TLRPC.Chat) j0Var.f46713i0.get(i10 - j0Var.f46718o0);
        org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) view;
        TLRPC.Chat currentChannel = nVar.getCurrentChannel();
        nVar.a(chat2, false);
        boolean contains = hashSet.contains(chat2);
        if (currentChannel == chat2) {
            z11 = true;
        }
        nVar.f22743r.a(contains, z11);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        g6 g6Var;
        g6 g6Var2;
        g6 g6Var3;
        int i11;
        int i12;
        z00 z00Var;
        i0 i0Var;
        int i13;
        int i14;
        float f7;
        g6 g6Var4;
        g6 g6Var5;
        g6 g6Var6;
        g6 g6Var7;
        g6 g6Var8;
        g6 g6Var9;
        g6 g6Var10;
        int i15;
        int i16;
        int i17;
        g6 g6Var11;
        g6 g6Var12;
        g6 g6Var13;
        g6 g6Var14;
        g6 g6Var15;
        Context context = viewGroup.getContext();
        int i18 = 21;
        j0 j0Var = this.f46650c;
        switch (i10) {
            case 1:
                i0Var = new org.telegram.ui.Cells.n(context, new b0(this), true, 9);
                break;
            case 2:
                int i19 = k6.f21126a7;
                g6Var = ((h3) j0Var).resourcesProvider;
                View b7Var = new b7(context, k6.w0(i19, g6Var), 0);
                g6Var2 = ((h3) j0Var).resourcesProvider;
                r6.i(i19, b7Var, g6Var2);
                i0Var = b7Var;
                break;
            case 3:
                View l4Var = new l4(context);
                l4Var.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
                i0Var = l4Var;
                break;
            case 4:
                g6Var3 = ((h3) j0Var).resourcesProvider;
                View f4Var = new f4(1, 0, context, g6Var3, false, false);
                i11 = ((h3) j0Var).backgroundPaddingLeft;
                i12 = ((h3) j0Var).backgroundPaddingLeft;
                f4Var.setPadding(i11, 0, i12, 0);
                i0Var = f4Var;
                break;
            case 5:
                z00 z00Var2 = new z00(context, null);
                if (j0Var.f46712h0 == 2) {
                    i18 = 22;
                }
                z00Var2.setViewType(i18);
                z00Var2.setIsSingleCell(true);
                z00Var2.setIgnoreHeightCheck(true);
                z00Var2.setItemsCount(10);
                z00Var = z00Var2;
                i0Var = z00Var;
                break;
            case 6:
                i0Var = new sn(j0Var.getContext(), 29);
                break;
            case 7:
                ?? frameLayout = new FrameLayout(j0Var.getContext());
                i13 = ((h3) j0Var).backgroundPaddingLeft;
                int dp = AndroidUtilities.dp(6.0f) + i13;
                i14 = ((h3) j0Var).backgroundPaddingLeft;
                frameLayout.setPadding(dp, 0, AndroidUtilities.dp(6.0f) + i14, 0);
                TextView textView = new TextView(context);
                if (j0Var.Q0 == null && ChatObject.hasAdminRights(j0Var.w1())) {
                    j0Var.Q0 = new org.telegram.ui.web.a2(this, 21);
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
                frameLayout.addView(textView, z5.d(-1, -2.0f, 0, 11.0f, 0.0f, 11.0f, 0.0f));
                int dp4 = AndroidUtilities.dp(8.0f);
                int i20 = k6.e7;
                g6Var4 = ((h3) j0Var).resourcesProvider;
                int w02 = k6.w0(i20, g6Var4);
                int i21 = k6.f21273i6;
                g6Var5 = ((h3) j0Var).resourcesProvider;
                int o10 = i0.a.o(k6.w0(i21, g6Var5), 76);
                org.telegram.ui.Cells.y j02 = k6.j0(dp4, dp4, dp4, dp4, w02, o10, o10);
                n6 O = r6.O(i20);
                n6 h = r6.h(i21, 76);
                g6Var6 = ((h3) j0Var).resourcesProvider;
                textView.setBackground(j02);
                r6.k(textView, j02, O, h, g6Var6);
                int i22 = k6.G6;
                g6Var7 = ((h3) j0Var).resourcesProvider;
                r6.W(textView, i22, g6Var7);
                textView.setOnClickListener(new View.OnClickListener(this) {
                    public final c0 f46614b;

                    {
                        this.f46614b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        g6 g6Var16;
                        switch (r2) {
                            case 0:
                                j0 j0Var2 = this.f46614b.f46650c;
                                o2 o2Var = j0Var2.f33212n;
                                long j10 = j0Var2.f46705a0;
                                g6Var16 = ((h3) j0Var2).resourcesProvider;
                                ug.l.m(o2Var, g6Var16, j10, null);
                                return;
                            case 1:
                                j0 j0Var3 = this.f46614b.f46650c;
                                AndroidUtilities.addToClipboard(j0Var3.t1());
                                j0Var3.dismiss();
                                return;
                            case 2:
                                AndroidUtilities.addToClipboard(this.f46614b.f46650c.t1());
                                return;
                            default:
                                j0 j0Var4 = this.f46614b.f46650c;
                                j0Var4.Q0.run();
                                j0Var4.dismiss();
                                return;
                        }
                    }
                });
                if (j0Var.Q0 != null) {
                    ImageView imageView = new ImageView(j0Var.getContext());
                    imageView.setImageResource(R.drawable.msg_stats);
                    int i23 = k6.f21290j5;
                    g6Var8 = ((h3) j0Var).resourcesProvider;
                    r6.t(imageView, i23, g6Var8, PorterDuff.Mode.SRC_ATOP);
                    imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                    int dp5 = AndroidUtilities.dp(20.0f);
                    g6Var9 = ((h3) j0Var).resourcesProvider;
                    int o11 = i0.a.o(k6.w0(i21, g6Var9), 76);
                    org.telegram.ui.Cells.y j03 = k6.j0(dp5, dp5, dp5, dp5, 0, o11, o11);
                    n6 h10 = r6.h(i21, 76);
                    g6Var10 = ((h3) j0Var).resourcesProvider;
                    imageView.setBackground(j03);
                    r6.k(imageView, j03, null, h10, g6Var10);
                    frameLayout.addView(imageView, z5.d(40, 40.0f, 21, 15.0f, 0.0f, 15.0f, 0.0f));
                    imageView.setOnClickListener(new View.OnClickListener(this) {
                        public final c0 f46614b;

                        {
                            this.f46614b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            g6 g6Var16;
                            switch (r2) {
                                case 0:
                                    j0 j0Var2 = this.f46614b.f46650c;
                                    o2 o2Var = j0Var2.f33212n;
                                    long j10 = j0Var2.f46705a0;
                                    g6Var16 = ((h3) j0Var2).resourcesProvider;
                                    ug.l.m(o2Var, g6Var16, j10, null);
                                    return;
                                case 1:
                                    j0 j0Var3 = this.f46614b.f46650c;
                                    AndroidUtilities.addToClipboard(j0Var3.t1());
                                    j0Var3.dismiss();
                                    return;
                                case 2:
                                    AndroidUtilities.addToClipboard(this.f46614b.f46650c.t1());
                                    return;
                                default:
                                    j0 j0Var4 = this.f46614b.f46650c;
                                    j0Var4.Q0.run();
                                    j0Var4.dismiss();
                                    return;
                            }
                        }
                    });
                }
                textView.setText(j0Var.t1());
                textView.setGravity(17);
                z00Var = frameLayout;
                i0Var = z00Var;
                break;
            case 8:
                LinearLayout linearLayout = new LinearLayout(context);
                i15 = ((h3) j0Var).backgroundPaddingLeft;
                int dp6 = AndroidUtilities.dp(6.0f) + i15;
                i16 = ((h3) j0Var).backgroundPaddingLeft;
                linearLayout.setPadding(dp6, 0, AndroidUtilities.dp(6.0f) + i16, 0);
                linearLayout.setOrientation(1);
                da0 da0Var = new da0(context);
                w90 w90Var = new w90(context, null);
                if (j0Var.B1()) {
                    i17 = R.string.BoostingStoriesByGiftingGroup2;
                } else {
                    i17 = R.string.BoostingStoriesByGiftingChannel2;
                }
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(i17));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.BoostingStoriesByGiftingLink));
                spannableStringBuilder.setSpan(new kb(this, 10), 0, spannableStringBuilder.length(), 33);
                SpannableString spannableString = new SpannableString(">");
                Drawable mutate = j0Var.getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
                int i24 = k6.f21243gc;
                mutate.setColorFilter(new PorterDuffColorFilter(i24, PorterDuff.Mode.SRC_IN));
                vq vqVar = new vq(0, mutate);
                vqVar.setColorKey(i24);
                vqVar.setSize(AndroidUtilities.dp(18.0f));
                vqVar.setWidth(AndroidUtilities.dp(11.0f));
                vqVar.setTranslateX(-AndroidUtilities.dp(5.0f));
                spannableString.setSpan(vqVar, 0, spannableString.length(), 33);
                w90Var.setText(TextUtils.concat(replaceTags, " ", AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString)));
                w90Var.setTextSize(1, 14.0f);
                w90Var.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
                g6Var11 = ((h3) j0Var).resourcesProvider;
                if (g6Var11 instanceof ci.b) {
                    int i25 = k6.f21572y6;
                    g6Var14 = ((h3) j0Var).resourcesProvider;
                    r6.W(w90Var, i25, g6Var14);
                } else {
                    int i26 = k6.G6;
                    g6Var12 = ((h3) j0Var).resourcesProvider;
                    r6.W(w90Var, i26, g6Var12);
                }
                w90Var.setGravity(1);
                w90Var.setOnClickListener(new View.OnClickListener(this) {
                    public final c0 f46614b;

                    {
                        this.f46614b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        g6 g6Var16;
                        switch (r2) {
                            case 0:
                                j0 j0Var2 = this.f46614b.f46650c;
                                o2 o2Var = j0Var2.f33212n;
                                long j10 = j0Var2.f46705a0;
                                g6Var16 = ((h3) j0Var2).resourcesProvider;
                                ug.l.m(o2Var, g6Var16, j10, null);
                                return;
                            case 1:
                                j0 j0Var3 = this.f46614b.f46650c;
                                AndroidUtilities.addToClipboard(j0Var3.t1());
                                j0Var3.dismiss();
                                return;
                            case 2:
                                AndroidUtilities.addToClipboard(this.f46614b.f46650c.t1());
                                return;
                            default:
                                j0 j0Var4 = this.f46614b.f46650c;
                                j0Var4.Q0.run();
                                j0Var4.dismiss();
                                return;
                        }
                    }
                });
                da0Var.setOnClickListener(new hg.r0(w90Var, 20));
                if (j0Var.C1()) {
                    g6Var13 = ((h3) j0Var).resourcesProvider;
                    ei.d dVar = new ei.d(context, g6Var13, true);
                    dVar.i(LocaleController.getString(R.string.Copy), false, true);
                    dVar.setOnClickListener(new View.OnClickListener(this) {
                        public final c0 f46614b;

                        {
                            this.f46614b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            g6 g6Var16;
                            switch (r2) {
                                case 0:
                                    j0 j0Var2 = this.f46614b.f46650c;
                                    o2 o2Var = j0Var2.f33212n;
                                    long j10 = j0Var2.f46705a0;
                                    g6Var16 = ((h3) j0Var2).resourcesProvider;
                                    ug.l.m(o2Var, g6Var16, j10, null);
                                    return;
                                case 1:
                                    j0 j0Var3 = this.f46614b.f46650c;
                                    AndroidUtilities.addToClipboard(j0Var3.t1());
                                    j0Var3.dismiss();
                                    return;
                                case 2:
                                    AndroidUtilities.addToClipboard(this.f46614b.f46650c.t1());
                                    return;
                                default:
                                    j0 j0Var4 = this.f46614b.f46650c;
                                    j0Var4.Q0.run();
                                    j0Var4.dismiss();
                                    return;
                            }
                        }
                    });
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.addView(j0Var.G0, z5.p(-1, 44, 1.0f, 0, 0, 0, 4, 0));
                    linearLayout2.addView(dVar, z5.p(-1, 44, 1.0f, 0, 4, 0, 0, 0));
                    linearLayout.addView(linearLayout2, z5.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 44));
                } else {
                    linearLayout.addView(j0Var.F0, z5.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 48));
                }
                linearLayout.addView(da0Var, z5.k(0.0f, -5.0f, 0.0f, 0.0f, -1, 48));
                linearLayout.addView(w90Var, z5.k(12.0f, -6.0f, 12.0f, 17.0f, -1, -2));
                i0Var = linearLayout;
                break;
            case 9:
                g6Var15 = ((h3) j0Var).resourcesProvider;
                i0Var = new f0(j0Var, context, g6Var15);
                break;
            default:
                i0 i0Var2 = new i0(j0Var, context);
                j0Var.f46708d0 = i0Var2;
                i0Var = i0Var2;
                break;
        }
        return k3.l(i0Var, i0Var, -1, -2);
    }
}
