package sg;

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
import di.zb;
import java.util.ArrayList;
import java.util.HashSet;
import ji.o4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.a7;
import org.telegram.ui.Cells.g4;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.ka0;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.xn;
import org.telegram.ui.x5;
import w7.z5;
public final class c0 extends lm0 {
    public final j0 f45149c;

    public c0(j0 j0Var) {
        this.f45149c = j0Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        j0 j0Var = this.f45149c;
        int i10 = j0Var.f45210h0;
        if ((i10 != 11 && i10 != 34) || j0Var.Y) {
            int i11 = b1Var.f44841f;
            if (i11 == 1 || i11 == 4) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f45149c.f45213k0;
    }

    @Override
    public final int j(int i10) {
        int i11;
        j0 j0Var = this.f45149c;
        if (j0Var.f45214l0 == i10) {
            return 0;
        }
        if (j0Var.m0 == i10) {
            return 2;
        }
        if (j0Var.f45215n0 == i10) {
            return 3;
        }
        if (j0Var.f45218q0 == i10) {
            return 5;
        }
        if (j0Var.f45219r0 == i10) {
            return 6;
        }
        if (j0Var.Z == i10) {
            return 7;
        }
        if (j0Var.f45220s0 == i10) {
            return 8;
        }
        ArrayList arrayList = j0Var.f45222u0;
        if (arrayList != null && i10 >= (i11 = j0Var.f45221t0) && i10 <= arrayList.size() + i11) {
            return 9;
        }
        int i12 = j0Var.f45210h0;
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
        j0 j0Var = this.f45149c;
        int i12 = j0Var.f45210h0;
        HashSet hashSet = j0Var.f45226y0;
        int i13 = b1Var.f44841f;
        View view = b1Var.f44838a;
        boolean z11 = false;
        boolean z12 = true;
        if (i13 != 1) {
            if (i13 != 9) {
                if (i13 != 3) {
                    if (i13 == 4) {
                        g4 g4Var = (g4) view;
                        if (i12 == 5) {
                            TLRPC.Chat chat = (TLRPC.Chat) j0Var.f45227z0.get(i10 - j0Var.f45216o0);
                            String str2 = (String) j0Var.A0.get(i10 - j0Var.f45216o0);
                            String str3 = chat.title;
                            if (i10 == j0Var.f45217p0 - 1.0f) {
                                z12 = false;
                            }
                            g4Var.e(chat, str3, str2, z12);
                            g4Var.c(hashSet.contains(chat), false);
                            return;
                        } else if (i12 == 11 || i12 == 34) {
                            TLRPC.User user = (TLRPC.User) j0Var.B0.get(i10 - j0Var.f45216o0);
                            ArrayList arrayList = j0Var.C0;
                            if (arrayList != null && arrayList.contains(Long.valueOf(user.f19063id))) {
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
                                i11 = ((e3) j0Var).currentAccount;
                                formatUserStatus = LocaleController.formatUserStatus(i11, user, null, null);
                            } else {
                                formatUserStatus = LocaleController.getString(R.string.InvitePremiumBlockedUser);
                            }
                            String formatName = ContactsController.formatName(user.first_name, user.last_name);
                            if (i10 == j0Var.f45217p0 - 1.0f) {
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
            int i14 = i10 - j0Var.f45221t0;
            ArrayList arrayList2 = j0Var.f45222u0;
            if (arrayList2 != null && i14 >= 0 && i14 < arrayList2.size()) {
                f0 f0Var = (f0) view;
                e0 e0Var = (e0) j0Var.f45222u0.get(i14);
                x5 x5Var = f0Var.f45180c;
                ImageView imageView = f0Var.f45178a;
                h5 h5Var = f0Var.f45179b;
                if (e0Var instanceof d0) {
                    f0Var.f45181f = (d0) e0Var;
                    f0Var.e = null;
                    imageView.setVisibility(8);
                    h5Var.setVisibility(8);
                    x5Var.setVisibility(0);
                    h5 h5Var2 = f0Var.d;
                    d0 d0Var = f0Var.f45181f;
                    if (d0Var.h) {
                        str = "BoostLevelUnlocks";
                    } else {
                        str = "BoostLevel";
                    }
                    h5Var2.l(LocaleController.formatPluralString(str, d0Var.f45165g, new Object[0]), false);
                    return;
                } else if (e0Var != null) {
                    f0Var.f45181f = null;
                    f0Var.e = e0Var;
                    imageView.setVisibility(0);
                    imageView.setImageResource(f0Var.e.f45169a);
                    h5Var.setVisibility(0);
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
                            spannableString.setSpan(new j61(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                            spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) spannableString);
                        }
                        h5Var.l(spannableStringBuilder, false);
                    } else {
                        String string2 = LocaleController.getString(e0Var2.f45170b);
                        if (string2 != null) {
                            str4 = string2;
                        }
                        if (f0Var.e.f45171c != null) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str4);
                            int indexOf2 = str4.indexOf("%s");
                            if (indexOf2 >= 0) {
                                spannableStringBuilder2 = new SpannableStringBuilder(str4);
                                SpannableString spannableString2 = new SpannableString(f0Var.e.f45171c);
                                spannableString2.setSpan(new j61(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
                                spannableStringBuilder2.replace(indexOf2, indexOf2 + 2, (CharSequence) spannableString2);
                            }
                            h5Var.l(spannableStringBuilder2, false);
                        } else {
                            h5Var.l(str4, false);
                        }
                    }
                    x5Var.setVisibility(8);
                    return;
                } else {
                    return;
                }
            }
            return;
        }
        TLRPC.Chat chat2 = (TLRPC.Chat) j0Var.f45211i0.get(i10 - j0Var.f45216o0);
        org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) view;
        TLRPC.Chat currentChannel = nVar.getCurrentChannel();
        nVar.a(chat2, false);
        boolean contains = hashSet.contains(chat2);
        if (currentChannel == chat2) {
            z11 = true;
        }
        nVar.f21237r.a(contains, z11);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        c6 c6Var;
        c6 c6Var2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f7;
        c6 c6Var3;
        c6 c6Var4;
        c6 c6Var5;
        c6 c6Var6;
        c6 c6Var7;
        int i16;
        int i17;
        int i18;
        c6 c6Var8;
        c6 c6Var9;
        i0 i0Var;
        c6 c6Var10;
        c6 c6Var11;
        c6 c6Var12;
        Context context = viewGroup.getContext();
        j0 j0Var = this.f45149c;
        switch (i10) {
            case 1:
                i0Var = new org.telegram.ui.Cells.n(context, new b0(this), true, 9);
                break;
            case 2:
                int i19 = g6.f19543a7;
                c6Var = ((e3) j0Var).resourcesProvider;
                i0Var = new a7(context, g6.w0(i19, c6Var), 0);
                break;
            case 3:
                View m4Var = new m4(context);
                m4Var.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
                i0Var = m4Var;
                break;
            case 4:
                c6Var2 = ((e3) j0Var).resourcesProvider;
                View g4Var = new g4(1, 0, context, c6Var2, false, false);
                i11 = ((e3) j0Var).backgroundPaddingLeft;
                i12 = ((e3) j0Var).backgroundPaddingLeft;
                g4Var.setPadding(i11, 0, i12, 0);
                i0Var = g4Var;
                break;
            case 5:
                f10 f10Var = new f10(context, null);
                if (j0Var.f45210h0 == 2) {
                    i13 = 22;
                } else {
                    i13 = 21;
                }
                f10Var.setViewType(i13);
                f10Var.setIsSingleCell(true);
                f10Var.setIgnoreHeightCheck(true);
                f10Var.setItemsCount(10);
                i0Var = f10Var;
                break;
            case 6:
                i0Var = new xn(j0Var.getContext(), 29);
                break;
            case 7:
                FrameLayout frameLayout = new FrameLayout(j0Var.getContext());
                i14 = ((e3) j0Var).backgroundPaddingLeft;
                int dp = AndroidUtilities.dp(6.0f) + i14;
                i15 = ((e3) j0Var).backgroundPaddingLeft;
                frameLayout.setPadding(dp, 0, AndroidUtilities.dp(6.0f) + i15, 0);
                TextView textView = new TextView(context);
                if (j0Var.Q0 == null && ChatObject.hasAdminRights(j0Var.t1())) {
                    j0Var.Q0 = new ri.h0(this, 2);
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
                frameLayout.addView(textView, z5.a(-2.0f, 11.0f, 0.0f, 11.0f, 0.0f, -1, 0));
                int dp4 = AndroidUtilities.dp(8.0f);
                int i20 = g6.e7;
                c6Var3 = ((e3) j0Var).resourcesProvider;
                int w02 = g6.w0(i20, c6Var3);
                int i21 = g6.f19690i6;
                c6Var4 = ((e3) j0Var).resourcesProvider;
                int k10 = i0.a.k(g6.w0(i21, c6Var4), 76);
                textView.setBackground(g6.j0(dp4, dp4, dp4, dp4, w02, k10, k10));
                int i22 = g6.G6;
                c6Var5 = ((e3) j0Var).resourcesProvider;
                textView.setTextColor(g6.w0(i22, c6Var5));
                textView.setOnClickListener(new View.OnClickListener(this) {
                    public final c0 f45113b;

                    {
                        this.f45113b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        c6 c6Var13;
                        switch (r2) {
                            case 0:
                                j0 j0Var2 = this.f45113b.f45149c;
                                m2 m2Var = j0Var2.f24070n;
                                long j10 = j0Var2.f45203a0;
                                c6Var13 = ((e3) j0Var2).resourcesProvider;
                                ug.n.n(m2Var, c6Var13, j10, null);
                                return;
                            case 1:
                                j0 j0Var3 = this.f45113b.f45149c;
                                AndroidUtilities.addToClipboard(j0Var3.q1());
                                j0Var3.dismiss();
                                return;
                            case 2:
                                AndroidUtilities.addToClipboard(this.f45113b.f45149c.q1());
                                return;
                            default:
                                j0 j0Var4 = this.f45113b.f45149c;
                                j0Var4.Q0.run();
                                j0Var4.dismiss();
                                return;
                        }
                    }
                });
                if (j0Var.Q0 != null) {
                    ImageView imageView = new ImageView(j0Var.getContext());
                    imageView.setImageResource(R.drawable.msg_stats);
                    int i23 = g6.f19707j5;
                    c6Var6 = ((e3) j0Var).resourcesProvider;
                    imageView.setColorFilter(g6.w0(i23, c6Var6));
                    imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                    int dp5 = AndroidUtilities.dp(20.0f);
                    c6Var7 = ((e3) j0Var).resourcesProvider;
                    int k11 = i0.a.k(g6.w0(i21, c6Var7), 76);
                    imageView.setBackground(g6.j0(dp5, dp5, dp5, dp5, 0, k11, k11));
                    frameLayout.addView(imageView, z5.a(40.0f, 15.0f, 0.0f, 15.0f, 0.0f, 40, 21));
                    imageView.setOnClickListener(new View.OnClickListener(this) {
                        public final c0 f45113b;

                        {
                            this.f45113b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            c6 c6Var13;
                            switch (r2) {
                                case 0:
                                    j0 j0Var2 = this.f45113b.f45149c;
                                    m2 m2Var = j0Var2.f24070n;
                                    long j10 = j0Var2.f45203a0;
                                    c6Var13 = ((e3) j0Var2).resourcesProvider;
                                    ug.n.n(m2Var, c6Var13, j10, null);
                                    return;
                                case 1:
                                    j0 j0Var3 = this.f45113b.f45149c;
                                    AndroidUtilities.addToClipboard(j0Var3.q1());
                                    j0Var3.dismiss();
                                    return;
                                case 2:
                                    AndroidUtilities.addToClipboard(this.f45113b.f45149c.q1());
                                    return;
                                default:
                                    j0 j0Var4 = this.f45113b.f45149c;
                                    j0Var4.Q0.run();
                                    j0Var4.dismiss();
                                    return;
                            }
                        }
                    });
                }
                textView.setText(j0Var.q1());
                textView.setGravity(17);
                i0Var = frameLayout;
                break;
            case 8:
                LinearLayout linearLayout = new LinearLayout(context);
                i16 = ((e3) j0Var).backgroundPaddingLeft;
                int dp6 = AndroidUtilities.dp(6.0f) + i16;
                i17 = ((e3) j0Var).backgroundPaddingLeft;
                linearLayout.setPadding(dp6, 0, AndroidUtilities.dp(6.0f) + i17, 0);
                linearLayout.setOrientation(1);
                ka0 ka0Var = new ka0(context);
                da0 da0Var = new da0(context, null);
                if (j0Var.y1()) {
                    i18 = R.string.BoostingStoriesByGiftingGroup2;
                } else {
                    i18 = R.string.BoostingStoriesByGiftingChannel2;
                }
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(i18));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.BoostingStoriesByGiftingLink));
                spannableStringBuilder.setSpan(new zb(this, 10), 0, spannableStringBuilder.length(), 33);
                SpannableString spannableString = new SpannableString(">");
                Drawable mutate = j0Var.getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
                int i24 = g6.f19660gc;
                mutate.setColorFilter(new PorterDuffColorFilter(i24, PorterDuff.Mode.SRC_IN));
                br brVar = new br(0, mutate);
                brVar.setColorKey(i24);
                brVar.setSize(AndroidUtilities.dp(18.0f));
                brVar.setWidth(AndroidUtilities.dp(11.0f));
                brVar.setTranslateX(-AndroidUtilities.dp(5.0f));
                spannableString.setSpan(brVar, 0, spannableString.length(), 33);
                da0Var.setText(TextUtils.concat(replaceTags, " ", AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString)));
                da0Var.setTextSize(1, 14.0f);
                da0Var.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
                c6Var8 = ((e3) j0Var).resourcesProvider;
                if (c6Var8 instanceof bi.b) {
                    int i25 = g6.f19988y6;
                    c6Var11 = ((e3) j0Var).resourcesProvider;
                    da0Var.setTextColor(g6.w0(i25, c6Var11));
                } else {
                    int i26 = g6.G6;
                    c6Var9 = ((e3) j0Var).resourcesProvider;
                    da0Var.setTextColor(g6.w0(i26, c6Var9));
                }
                da0Var.setGravity(1);
                da0Var.setOnClickListener(new View.OnClickListener(this) {
                    public final c0 f45113b;

                    {
                        this.f45113b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        c6 c6Var13;
                        switch (r2) {
                            case 0:
                                j0 j0Var2 = this.f45113b.f45149c;
                                m2 m2Var = j0Var2.f24070n;
                                long j10 = j0Var2.f45203a0;
                                c6Var13 = ((e3) j0Var2).resourcesProvider;
                                ug.n.n(m2Var, c6Var13, j10, null);
                                return;
                            case 1:
                                j0 j0Var3 = this.f45113b.f45149c;
                                AndroidUtilities.addToClipboard(j0Var3.q1());
                                j0Var3.dismiss();
                                return;
                            case 2:
                                AndroidUtilities.addToClipboard(this.f45113b.f45149c.q1());
                                return;
                            default:
                                j0 j0Var4 = this.f45113b.f45149c;
                                j0Var4.Q0.run();
                                j0Var4.dismiss();
                                return;
                        }
                    }
                });
                ka0Var.setOnClickListener(new o4(da0Var, 10));
                if (j0Var.z1()) {
                    c6Var10 = ((e3) j0Var).resourcesProvider;
                    di.d dVar = new di.d(context, c6Var10, true);
                    dVar.g(LocaleController.getString(R.string.Copy), false, true);
                    dVar.setOnClickListener(new View.OnClickListener(this) {
                        public final c0 f45113b;

                        {
                            this.f45113b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            c6 c6Var13;
                            switch (r2) {
                                case 0:
                                    j0 j0Var2 = this.f45113b.f45149c;
                                    m2 m2Var = j0Var2.f24070n;
                                    long j10 = j0Var2.f45203a0;
                                    c6Var13 = ((e3) j0Var2).resourcesProvider;
                                    ug.n.n(m2Var, c6Var13, j10, null);
                                    return;
                                case 1:
                                    j0 j0Var3 = this.f45113b.f45149c;
                                    AndroidUtilities.addToClipboard(j0Var3.q1());
                                    j0Var3.dismiss();
                                    return;
                                case 2:
                                    AndroidUtilities.addToClipboard(this.f45113b.f45149c.q1());
                                    return;
                                default:
                                    j0 j0Var4 = this.f45113b.f45149c;
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
                linearLayout.addView(ka0Var, z5.k(0.0f, -5.0f, 0.0f, 0.0f, -1, 48));
                linearLayout.addView(da0Var, z5.k(12.0f, -6.0f, 12.0f, 17.0f, -1, -2));
                i0Var = linearLayout;
                break;
            case 9:
                c6Var12 = ((e3) j0Var).resourcesProvider;
                i0Var = new f0(j0Var, context, c6Var12);
                break;
            default:
                i0 i0Var2 = new i0(j0Var, context);
                j0Var.f45206d0 = i0Var2;
                i0Var = i0Var2;
                break;
        }
        return k3.l(i0Var, i0Var, -1, -2);
    }
}
