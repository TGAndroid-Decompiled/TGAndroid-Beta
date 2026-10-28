package tg;

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
import bi.j5;
import fi.hb;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.b7;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.f7;
import org.telegram.ui.Cells.k4;
import org.telegram.ui.Cells.q4;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.ha0;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.vn;
import org.telegram.ui.Components.zq;
public final class c0 extends mm0 {
    public final j0 f48864c;

    public c0(j0 j0Var) {
        this.f48864c = j0Var;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        j0 j0Var = this.f48864c;
        int i10 = j0Var.f48926h0;
        if ((i10 != 11 && i10 != 34) || j0Var.Y) {
            int i11 = e1Var.f47776f;
            if (i11 == 1 || i11 == 4) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f48864c.f48929k0;
    }

    @Override
    public final int j(int i10) {
        int i11;
        j0 j0Var = this.f48864c;
        if (j0Var.f48930l0 == i10) {
            return 0;
        }
        if (j0Var.m0 == i10) {
            return 2;
        }
        if (j0Var.f48931n0 == i10) {
            return 3;
        }
        if (j0Var.f48934q0 == i10) {
            return 5;
        }
        if (j0Var.f48935r0 == i10) {
            return 6;
        }
        if (j0Var.Z == i10) {
            return 7;
        }
        if (j0Var.f48936s0 == i10) {
            return 8;
        }
        ArrayList arrayList = j0Var.f48938u0;
        if (arrayList != null && i10 >= (i11 = j0Var.f48937t0) && i10 <= arrayList.size() + i11) {
            return 9;
        }
        int i12 = j0Var.f48926h0;
        if (i12 != 5 && i12 != 11 && i12 != 34) {
            return 1;
        }
        return 4;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        String str;
        boolean z10;
        TL_account.requirementToContactPremium requirementtocontactpremium;
        int i11;
        String formatUserStatus;
        j0 j0Var = this.f48864c;
        int i12 = j0Var.f48926h0;
        HashSet hashSet = j0Var.f48942y0;
        int i13 = e1Var.f47776f;
        View view = e1Var.f47773a;
        boolean z11 = false;
        boolean z12 = true;
        if (i13 != 1) {
            if (i13 != 9) {
                if (i13 != 3) {
                    if (i13 == 4) {
                        k4 k4Var = (k4) view;
                        if (i12 == 5) {
                            TLRPC.Chat chat = (TLRPC.Chat) j0Var.f48943z0.get(i10 - j0Var.f48932o0);
                            String str2 = (String) j0Var.A0.get(i10 - j0Var.f48932o0);
                            String str3 = chat.title;
                            if (i10 == j0Var.f48933p0 - 1.0f) {
                                z12 = false;
                            }
                            k4Var.e(chat, str3, str2, z12);
                            k4Var.c(hashSet.contains(chat), false);
                            return;
                        } else if (i12 == 11 || i12 == 34) {
                            TLRPC.User user = (TLRPC.User) j0Var.B0.get(i10 - j0Var.f48932o0);
                            ArrayList arrayList = j0Var.C0;
                            if (arrayList != null && arrayList.contains(Long.valueOf(user.f22177id))) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                requirementtocontactpremium = new TL_account.requirementToContactPremium();
                            } else {
                                requirementtocontactpremium = null;
                            }
                            k4Var.R = true;
                            k4Var.Q = requirementtocontactpremium;
                            k4Var.g();
                            if (!z10) {
                                i11 = ((k3) j0Var).currentAccount;
                                formatUserStatus = LocaleController.formatUserStatus(i11, user, null, null);
                            } else {
                                formatUserStatus = LocaleController.getString(R.string.InvitePremiumBlockedUser);
                            }
                            String formatName = ContactsController.formatName(user.first_name, user.last_name);
                            if (i10 == j0Var.f48933p0 - 1.0f) {
                                z12 = false;
                            }
                            k4Var.e(user, formatName, formatUserStatus, z12);
                            k4Var.c(hashSet.contains(user), false);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                q4 q4Var = (q4) view;
                if (i12 != 11 && i12 != 34) {
                    if (i12 == 2) {
                        q4Var.setText(LocaleController.getString(R.string.YourPublicCommunities));
                        return;
                    } else {
                        q4Var.setText(LocaleController.getString(R.string.LastActiveCommunities));
                        return;
                    }
                } else if (j0Var.Y) {
                    q4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLink));
                    return;
                } else if (j0Var.B0.size() == 1) {
                    q4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted2));
                    return;
                } else {
                    q4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted3));
                    return;
                }
            }
            int i14 = i10 - j0Var.f48937t0;
            ArrayList arrayList2 = j0Var.f48938u0;
            if (arrayList2 != null && i14 >= 0 && i14 < arrayList2.size()) {
                f0 f0Var = (f0) view;
                e0 e0Var = (e0) j0Var.f48938u0.get(i14);
                j5 j5Var = f0Var.f48895c;
                ImageView imageView = f0Var.f48893a;
                b6 b6Var = f0Var.f48894b;
                if (e0Var instanceof d0) {
                    f0Var.f48896f = (d0) e0Var;
                    f0Var.e = null;
                    imageView.setVisibility(8);
                    b6Var.setVisibility(8);
                    j5Var.setVisibility(0);
                    b6 b6Var2 = f0Var.d;
                    d0 d0Var = f0Var.f48896f;
                    if (d0Var.h) {
                        str = "BoostLevelUnlocks";
                    } else {
                        str = "BoostLevel";
                    }
                    b6Var2.l(LocaleController.formatPluralString(str, d0Var.f48880g, new Object[0]), false);
                    return;
                } else if (e0Var != null) {
                    f0Var.f48896f = null;
                    f0Var.e = e0Var;
                    imageView.setVisibility(0);
                    imageView.setImageResource(f0Var.e.f48884a);
                    b6Var.setVisibility(0);
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
                            spannableString.setSpan(new r61(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                            spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) spannableString);
                        }
                        b6Var.l(spannableStringBuilder, false);
                    } else {
                        String string2 = LocaleController.getString(e0Var2.f48885b);
                        if (string2 != null) {
                            str4 = string2;
                        }
                        if (f0Var.e.f48886c != null) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str4);
                            int indexOf2 = str4.indexOf("%s");
                            if (indexOf2 >= 0) {
                                spannableStringBuilder2 = new SpannableStringBuilder(str4);
                                SpannableString spannableString2 = new SpannableString(f0Var.e.f48886c);
                                spannableString2.setSpan(new r61(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
                                spannableStringBuilder2.replace(indexOf2, indexOf2 + 2, (CharSequence) spannableString2);
                            }
                            b6Var.l(spannableStringBuilder2, false);
                        } else {
                            b6Var.l(str4, false);
                        }
                    }
                    j5Var.setVisibility(8);
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        TLRPC.Chat chat2 = (TLRPC.Chat) j0Var.f48927i0.get(i10 - j0Var.f48932o0);
        org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) view;
        TLRPC.Chat currentChannel = nVar.getCurrentChannel();
        nVar.a(chat2, false);
        boolean contains = hashSet.contains(chat2);
        if (currentChannel == chat2) {
            z11 = true;
        }
        nVar.f24498r.a(contains, z11);
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        u6 u6Var;
        u6 u6Var2;
        u6 u6Var3;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f7;
        u6 u6Var4;
        u6 u6Var5;
        u6 u6Var6;
        u6 u6Var7;
        u6 u6Var8;
        u6 u6Var9;
        u6 u6Var10;
        int i16;
        int i17;
        int i18;
        u6 u6Var11;
        u6 u6Var12;
        i0 i0Var;
        u6 u6Var13;
        u6 u6Var14;
        u6 u6Var15;
        Context context = viewGroup.getContext();
        j0 j0Var = this.f48864c;
        switch (i10) {
            case 1:
                i0Var = new org.telegram.ui.Cells.n(context, new b0(this), true, 9);
                break;
            case 2:
                int i19 = y6.f23300a7;
                u6Var = ((k3) j0Var).resourcesProvider;
                View f7Var = new f7(context, y6.w0(i19, u6Var), 0);
                u6Var2 = ((k3) j0Var).resourcesProvider;
                org.telegram.ui.ActionBar.f7.i(i19, f7Var, u6Var2);
                i0Var = f7Var;
                break;
            case 3:
                View q4Var = new q4(context);
                q4Var.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
                i0Var = q4Var;
                break;
            case 4:
                u6Var3 = ((k3) j0Var).resourcesProvider;
                View k4Var = new k4(1, 0, context, u6Var3, false, false);
                i11 = ((k3) j0Var).backgroundPaddingLeft;
                i12 = ((k3) j0Var).backgroundPaddingLeft;
                k4Var.setPadding(i11, 0, i12, 0);
                i0Var = k4Var;
                break;
            case 5:
                c10 c10Var = new c10(context, null);
                if (j0Var.f48926h0 == 2) {
                    i13 = 22;
                } else {
                    i13 = 21;
                }
                c10Var.setViewType(i13);
                c10Var.setIsSingleCell(true);
                c10Var.setIgnoreHeightCheck(true);
                c10Var.setItemsCount(10);
                i0Var = c10Var;
                break;
            case 6:
                i0Var = new vn(j0Var.getContext(), 29);
                break;
            case 7:
                FrameLayout frameLayout = new FrameLayout(j0Var.getContext());
                i14 = ((k3) j0Var).backgroundPaddingLeft;
                int dp = AndroidUtilities.dp(6.0f) + i14;
                i15 = ((k3) j0Var).backgroundPaddingLeft;
                frameLayout.setPadding(dp, 0, AndroidUtilities.dp(6.0f) + i15, 0);
                TextView textView = new TextView(context);
                if (j0Var.Q0 == null && ChatObject.hasAdminRights(j0Var.w1())) {
                    j0Var.Q0 = new org.telegram.ui.web.h1(this, 24);
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
                frameLayout.addView(textView, kb1.h(-1, -2.0f, 0, 11.0f, 0.0f, 11.0f, 0.0f));
                int dp4 = AndroidUtilities.dp(8.0f);
                int i20 = y6.f23377e7;
                u6Var4 = ((k3) j0Var).resourcesProvider;
                int w02 = y6.w0(i20, u6Var4);
                int i21 = y6.f23449i6;
                u6Var5 = ((k3) j0Var).resourcesProvider;
                int o10 = i0.a.o(y6.w0(i21, u6Var5), 76);
                org.telegram.ui.Cells.y j02 = y6.j0(dp4, dp4, dp4, dp4, w02, o10, o10);
                b7 N = org.telegram.ui.ActionBar.f7.N(i20);
                b7 h = org.telegram.ui.ActionBar.f7.h(i21, 76);
                u6Var6 = ((k3) j0Var).resourcesProvider;
                textView.setBackground(j02);
                org.telegram.ui.ActionBar.f7.k(textView, j02, N, h, u6Var6);
                int i22 = y6.G6;
                u6Var7 = ((k3) j0Var).resourcesProvider;
                org.telegram.ui.ActionBar.f7.V(textView, i22, u6Var7);
                textView.setOnClickListener(new View.OnClickListener(this) {
                    public final c0 f48828b;

                    {
                        this.f48828b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        u6 u6Var16;
                        switch (r2) {
                            case 0:
                                j0 j0Var2 = this.f48828b.f48864c;
                                r2 r2Var = j0Var2.f26793n;
                                long j10 = j0Var2.f48919a0;
                                u6Var16 = ((k3) j0Var2).resourcesProvider;
                                vg.n.m(r2Var, u6Var16, j10, null);
                                return;
                            case 1:
                                j0 j0Var3 = this.f48828b.f48864c;
                                AndroidUtilities.addToClipboard(j0Var3.t1());
                                j0Var3.dismiss();
                                return;
                            case 2:
                                AndroidUtilities.addToClipboard(this.f48828b.f48864c.t1());
                                return;
                            default:
                                j0 j0Var4 = this.f48828b.f48864c;
                                j0Var4.Q0.run();
                                j0Var4.dismiss();
                                return;
                        }
                    }
                });
                if (j0Var.Q0 != null) {
                    ImageView imageView = new ImageView(j0Var.getContext());
                    imageView.setImageResource(R.drawable.msg_stats);
                    int i23 = y6.f23465j5;
                    u6Var8 = ((k3) j0Var).resourcesProvider;
                    org.telegram.ui.ActionBar.f7.t(imageView, i23, u6Var8, PorterDuff.Mode.SRC_ATOP);
                    imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                    int dp5 = AndroidUtilities.dp(20.0f);
                    u6Var9 = ((k3) j0Var).resourcesProvider;
                    int o11 = i0.a.o(y6.w0(i21, u6Var9), 76);
                    org.telegram.ui.Cells.y j03 = y6.j0(dp5, dp5, dp5, dp5, 0, o11, o11);
                    b7 h10 = org.telegram.ui.ActionBar.f7.h(i21, 76);
                    u6Var10 = ((k3) j0Var).resourcesProvider;
                    imageView.setBackground(j03);
                    org.telegram.ui.ActionBar.f7.k(imageView, j03, null, h10, u6Var10);
                    frameLayout.addView(imageView, kb1.h(40, 40.0f, 21, 15.0f, 0.0f, 15.0f, 0.0f));
                    imageView.setOnClickListener(new View.OnClickListener(this) {
                        public final c0 f48828b;

                        {
                            this.f48828b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            u6 u6Var16;
                            switch (r2) {
                                case 0:
                                    j0 j0Var2 = this.f48828b.f48864c;
                                    r2 r2Var = j0Var2.f26793n;
                                    long j10 = j0Var2.f48919a0;
                                    u6Var16 = ((k3) j0Var2).resourcesProvider;
                                    vg.n.m(r2Var, u6Var16, j10, null);
                                    return;
                                case 1:
                                    j0 j0Var3 = this.f48828b.f48864c;
                                    AndroidUtilities.addToClipboard(j0Var3.t1());
                                    j0Var3.dismiss();
                                    return;
                                case 2:
                                    AndroidUtilities.addToClipboard(this.f48828b.f48864c.t1());
                                    return;
                                default:
                                    j0 j0Var4 = this.f48828b.f48864c;
                                    j0Var4.Q0.run();
                                    j0Var4.dismiss();
                                    return;
                            }
                        }
                    });
                }
                textView.setText(j0Var.t1());
                textView.setGravity(17);
                i0Var = frameLayout;
                break;
            case 8:
                LinearLayout linearLayout = new LinearLayout(context);
                i16 = ((k3) j0Var).backgroundPaddingLeft;
                int dp6 = AndroidUtilities.dp(6.0f) + i16;
                i17 = ((k3) j0Var).backgroundPaddingLeft;
                linearLayout.setPadding(dp6, 0, AndroidUtilities.dp(6.0f) + i17, 0);
                linearLayout.setOrientation(1);
                ha0 ha0Var = new ha0(context);
                aa0 aa0Var = new aa0(context, null);
                if (j0Var.B1()) {
                    i18 = R.string.BoostingStoriesByGiftingGroup2;
                } else {
                    i18 = R.string.BoostingStoriesByGiftingChannel2;
                }
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(i18));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.BoostingStoriesByGiftingLink));
                spannableStringBuilder.setSpan(new hb(this, 10), 0, spannableStringBuilder.length(), 33);
                SpannableString spannableString = new SpannableString(">");
                Drawable mutate = j0Var.getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
                int i24 = y6.gc;
                mutate.setColorFilter(new PorterDuffColorFilter(i24, PorterDuff.Mode.SRC_IN));
                zq zqVar = new zq(0, mutate);
                zqVar.setColorKey(i24);
                zqVar.setSize(AndroidUtilities.dp(18.0f));
                zqVar.setWidth(AndroidUtilities.dp(11.0f));
                zqVar.setTranslateX(-AndroidUtilities.dp(5.0f));
                spannableString.setSpan(zqVar, 0, spannableString.length(), 33);
                aa0Var.setText(TextUtils.concat(replaceTags, " ", AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString)));
                aa0Var.setTextSize(1, 14.0f);
                aa0Var.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
                u6Var11 = ((k3) j0Var).resourcesProvider;
                if (u6Var11 instanceof di.b) {
                    int i25 = y6.f23749y6;
                    u6Var14 = ((k3) j0Var).resourcesProvider;
                    org.telegram.ui.ActionBar.f7.V(aa0Var, i25, u6Var14);
                } else {
                    int i26 = y6.G6;
                    u6Var12 = ((k3) j0Var).resourcesProvider;
                    org.telegram.ui.ActionBar.f7.V(aa0Var, i26, u6Var12);
                }
                aa0Var.setGravity(1);
                aa0Var.setOnClickListener(new View.OnClickListener(this) {
                    public final c0 f48828b;

                    {
                        this.f48828b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        u6 u6Var16;
                        switch (r2) {
                            case 0:
                                j0 j0Var2 = this.f48828b.f48864c;
                                r2 r2Var = j0Var2.f26793n;
                                long j10 = j0Var2.f48919a0;
                                u6Var16 = ((k3) j0Var2).resourcesProvider;
                                vg.n.m(r2Var, u6Var16, j10, null);
                                return;
                            case 1:
                                j0 j0Var3 = this.f48828b.f48864c;
                                AndroidUtilities.addToClipboard(j0Var3.t1());
                                j0Var3.dismiss();
                                return;
                            case 2:
                                AndroidUtilities.addToClipboard(this.f48828b.f48864c.t1());
                                return;
                            default:
                                j0 j0Var4 = this.f48828b.f48864c;
                                j0Var4.Q0.run();
                                j0Var4.dismiss();
                                return;
                        }
                    }
                });
                ha0Var.setOnClickListener(new ig.d0(aa0Var, 21));
                if (j0Var.C1()) {
                    u6Var13 = ((k3) j0Var).resourcesProvider;
                    fi.d dVar = new fi.d(context, u6Var13, true);
                    dVar.i(LocaleController.getString(R.string.Copy), false, true);
                    dVar.setOnClickListener(new View.OnClickListener(this) {
                        public final c0 f48828b;

                        {
                            this.f48828b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            u6 u6Var16;
                            switch (r2) {
                                case 0:
                                    j0 j0Var2 = this.f48828b.f48864c;
                                    r2 r2Var = j0Var2.f26793n;
                                    long j10 = j0Var2.f48919a0;
                                    u6Var16 = ((k3) j0Var2).resourcesProvider;
                                    vg.n.m(r2Var, u6Var16, j10, null);
                                    return;
                                case 1:
                                    j0 j0Var3 = this.f48828b.f48864c;
                                    AndroidUtilities.addToClipboard(j0Var3.t1());
                                    j0Var3.dismiss();
                                    return;
                                case 2:
                                    AndroidUtilities.addToClipboard(this.f48828b.f48864c.t1());
                                    return;
                                default:
                                    j0 j0Var4 = this.f48828b.f48864c;
                                    j0Var4.Q0.run();
                                    j0Var4.dismiss();
                                    return;
                            }
                        }
                    });
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.addView(j0Var.G0, kb1.t(-1, 44, 1.0f, 0, 0, 0, 4, 0));
                    linearLayout2.addView(dVar, kb1.t(-1, 44, 1.0f, 0, 4, 0, 0, 0));
                    linearLayout.addView(linearLayout2, kb1.o(12.0f, 12.0f, 12.0f, 8.0f, -1, 44));
                } else {
                    linearLayout.addView(j0Var.F0, kb1.o(12.0f, 12.0f, 12.0f, 8.0f, -1, 48));
                }
                linearLayout.addView(ha0Var, kb1.o(0.0f, -5.0f, 0.0f, 0.0f, -1, 48));
                linearLayout.addView(aa0Var, kb1.o(12.0f, -6.0f, 12.0f, 17.0f, -1, -2));
                i0Var = linearLayout;
                break;
            case 9:
                u6Var15 = ((k3) j0Var).resourcesProvider;
                i0Var = new f0(j0Var, context, u6Var15);
                break;
            default:
                i0 i0Var2 = new i0(j0Var, context);
                j0Var.f48922d0 = i0Var2;
                i0Var = i0Var2;
                break;
        }
        return ic.a.n(i0Var, i0Var, -1, -2);
    }
}
