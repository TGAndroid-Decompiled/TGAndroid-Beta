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
import com.google.android.gms.internal.vision.e2;
import di.ec;
import java.util.ArrayList;
import java.util.HashSet;
import ji.m4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.a7;
import org.telegram.ui.Cells.f4;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.t00;
import org.telegram.ui.t5;
import w7.x5;
public final class d0 extends kl0 {
    public final k0 f46091c;

    public d0(k0 k0Var) {
        this.f46091c = k0Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        k0 k0Var = this.f46091c;
        int i10 = k0Var.f46165h0;
        if ((i10 != 11 && i10 != 34) || k0Var.Y) {
            int i11 = c1Var.f45770f;
            if (i11 == 1 || i11 == 4) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f46091c.f46168k0;
    }

    @Override
    public final int j(int i10) {
        int i11;
        k0 k0Var = this.f46091c;
        if (k0Var.f46169l0 == i10) {
            return 0;
        }
        if (k0Var.m0 == i10) {
            return 2;
        }
        if (k0Var.f46170n0 == i10) {
            return 3;
        }
        if (k0Var.f46173q0 == i10) {
            return 5;
        }
        if (k0Var.f46174r0 == i10) {
            return 6;
        }
        if (k0Var.Z == i10) {
            return 7;
        }
        if (k0Var.f46175s0 == i10) {
            return 8;
        }
        ArrayList arrayList = k0Var.f46177u0;
        if (arrayList != null && i10 >= (i11 = k0Var.f46176t0) && i10 <= arrayList.size() + i11) {
            return 9;
        }
        int i12 = k0Var.f46165h0;
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
        k0 k0Var = this.f46091c;
        int i12 = k0Var.f46165h0;
        HashSet hashSet = k0Var.f46181y0;
        int i13 = c1Var.f45770f;
        View view = c1Var.f45766a;
        boolean z11 = false;
        boolean z12 = true;
        if (i13 != 1) {
            if (i13 != 9) {
                if (i13 != 3) {
                    if (i13 == 4) {
                        f4 f4Var = (f4) view;
                        if (i12 == 5) {
                            TLRPC.Chat chat = (TLRPC.Chat) k0Var.f46182z0.get(i10 - k0Var.f46171o0);
                            String str2 = (String) k0Var.A0.get(i10 - k0Var.f46171o0);
                            String str3 = chat.title;
                            if (i10 == k0Var.f46172p0 - 1.0f) {
                                z12 = false;
                            }
                            f4Var.e(chat, str3, str2, z12);
                            f4Var.c(hashSet.contains(chat), false);
                            return;
                        } else if (i12 == 11 || i12 == 34) {
                            TLRPC.User user = (TLRPC.User) k0Var.B0.get(i10 - k0Var.f46171o0);
                            ArrayList arrayList = k0Var.C0;
                            if (arrayList != null && arrayList.contains(Long.valueOf(user.f20043id))) {
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
                                i11 = ((f3) k0Var).currentAccount;
                                formatUserStatus = LocaleController.formatUserStatus(i11, user, null, null);
                            } else {
                                formatUserStatus = LocaleController.getString(R.string.InvitePremiumBlockedUser);
                            }
                            String formatName = ContactsController.formatName(user.first_name, user.last_name);
                            if (i10 == k0Var.f46172p0 - 1.0f) {
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
                } else if (k0Var.Y) {
                    l4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLink));
                    return;
                } else if (k0Var.B0.size() == 1) {
                    l4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted2));
                    return;
                } else {
                    l4Var.setText(LocaleController.getString(R.string.ChannelInviteViaLinkRestricted3));
                    return;
                }
            }
            int i14 = i10 - k0Var.f46176t0;
            ArrayList arrayList2 = k0Var.f46177u0;
            if (arrayList2 != null && i14 >= 0 && i14 < arrayList2.size()) {
                g0 g0Var = (g0) view;
                f0 f0Var = (f0) k0Var.f46177u0.get(i14);
                t5 t5Var = g0Var.f46129c;
                ImageView imageView = g0Var.f46127a;
                j5 j5Var = g0Var.f46128b;
                if (f0Var instanceof e0) {
                    g0Var.f46131f = (e0) f0Var;
                    g0Var.f46130e = null;
                    imageView.setVisibility(8);
                    j5Var.setVisibility(8);
                    t5Var.setVisibility(0);
                    j5 j5Var2 = g0Var.d;
                    e0 e0Var = g0Var.f46131f;
                    if (e0Var.h) {
                        str = "BoostLevelUnlocks";
                    } else {
                        str = "BoostLevel";
                    }
                    j5Var2.l(LocaleController.formatPluralString(str, e0Var.f46104g, new Object[0]), false);
                    return;
                } else if (f0Var != null) {
                    g0Var.f46131f = null;
                    g0Var.f46130e = f0Var;
                    imageView.setVisibility(0);
                    imageView.setImageResource(g0Var.f46130e.f46119a);
                    j5Var.setVisibility(0);
                    f0 f0Var2 = g0Var.f46130e;
                    String str4 = "";
                    if (f0Var2.d != null) {
                        String string = LocaleController.getString(g0Var.f46130e.d + "_" + LocaleController.getStringParamForNumber(g0Var.f46130e.f46122e));
                        if (string == null || string.startsWith("LOC_ERR")) {
                            string = LocaleController.getString(g0Var.f46130e.d + "_other");
                        }
                        if (string == null) {
                            string = "";
                        }
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                        int indexOf = string.indexOf("%d");
                        if (indexOf >= 0) {
                            spannableStringBuilder = new SpannableStringBuilder(string);
                            SpannableString spannableString = new SpannableString(a4.a.n(g0Var.f46130e.f46122e, "", new StringBuilder()));
                            spannableString.setSpan(new e51(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                            spannableStringBuilder.replace(indexOf, indexOf + 2, (CharSequence) spannableString);
                        }
                        j5Var.l(spannableStringBuilder, false);
                    } else {
                        String string2 = LocaleController.getString(f0Var2.f46120b);
                        if (string2 != null) {
                            str4 = string2;
                        }
                        if (g0Var.f46130e.f46121c != null) {
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str4);
                            int indexOf2 = str4.indexOf("%s");
                            if (indexOf2 >= 0) {
                                spannableStringBuilder2 = new SpannableStringBuilder(str4);
                                SpannableString spannableString2 = new SpannableString(g0Var.f46130e.f46121c);
                                spannableString2.setSpan(new e51(AndroidUtilities.bold()), 0, spannableString2.length(), 33);
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
        TLRPC.Chat chat2 = (TLRPC.Chat) k0Var.f46166i0.get(i10 - k0Var.f46171o0);
        org.telegram.ui.Cells.n nVar = (org.telegram.ui.Cells.n) view;
        TLRPC.Chat currentChannel = nVar.getCurrentChannel();
        nVar.a(chat2, false);
        boolean contains = hashSet.contains(chat2);
        if (currentChannel == chat2) {
            z11 = true;
        }
        nVar.f22341r.a(contains, z11);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        f6 f6Var;
        f6 f6Var2;
        int i11;
        int i12;
        int i13;
        FrameLayout frameLayout;
        j0 j0Var;
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
        f6 f6Var10;
        f6 f6Var11;
        f6 f6Var12;
        Context context = viewGroup.getContext();
        k0 k0Var = this.f46091c;
        switch (i10) {
            case 1:
                j0Var = new org.telegram.ui.Cells.n(context, new c0(this), true, 9);
                break;
            case 2:
                int i19 = j6.f20634a7;
                f6Var = ((f3) k0Var).resourcesProvider;
                j0Var = new a7(context, j6.v0(i19, f6Var), 0);
                break;
            case 3:
                View l4Var = new l4(context);
                l4Var.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
                j0Var = l4Var;
                break;
            case 4:
                f6Var2 = ((f3) k0Var).resourcesProvider;
                View f4Var = new f4(1, 0, context, f6Var2, false, false);
                i11 = ((f3) k0Var).backgroundPaddingLeft;
                i12 = ((f3) k0Var).backgroundPaddingLeft;
                f4Var.setPadding(i11, 0, i12, 0);
                j0Var = f4Var;
                break;
            case 5:
                t00 t00Var = new t00(context, null);
                if (k0Var.f46165h0 == 2) {
                    i13 = 22;
                } else {
                    i13 = 21;
                }
                t00Var.setViewType(i13);
                t00Var.setIsSingleCell(true);
                t00Var.setIgnoreHeightCheck(true);
                t00Var.setItemsCount(10);
                j0Var = t00Var;
                break;
            case 6:
                frameLayout = new jn(k0Var.getContext(), 29);
                j0Var = frameLayout;
                break;
            case 7:
                FrameLayout frameLayout2 = new FrameLayout(k0Var.getContext());
                i14 = ((f3) k0Var).backgroundPaddingLeft;
                int dp = AndroidUtilities.dp(6.0f) + i14;
                i15 = ((f3) k0Var).backgroundPaddingLeft;
                frameLayout2.setPadding(dp, 0, AndroidUtilities.dp(6.0f) + i15, 0);
                TextView textView = new TextView(context);
                if (k0Var.Q0 == null && ChatObject.hasAdminRights(k0Var.s1())) {
                    k0Var.Q0 = new org.telegram.ui.web.b(this, 29);
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
                frameLayout2.addView(textView, x5.d(-1, -2.0f, 0, 11.0f, 0.0f, 11.0f, 0.0f));
                int dp4 = AndroidUtilities.dp(8.0f);
                int i20 = j6.e7;
                f6Var3 = ((f3) k0Var).resourcesProvider;
                int v02 = j6.v0(i20, f6Var3);
                int i21 = j6.f20780i6;
                f6Var4 = ((f3) k0Var).resourcesProvider;
                int k10 = i0.a.k(j6.v0(i21, f6Var4), 76);
                textView.setBackground(j6.i0(dp4, dp4, dp4, dp4, v02, k10, k10));
                int i22 = j6.G6;
                f6Var5 = ((f3) k0Var).resourcesProvider;
                textView.setTextColor(j6.v0(i22, f6Var5));
                textView.setOnClickListener(new View.OnClickListener(this) {
                    public final d0 f46054b;

                    {
                        this.f46054b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        f6 f6Var13;
                        switch (r2) {
                            case 0:
                                k0 k0Var2 = this.f46054b.f46091c;
                                n2 n2Var = k0Var2.f24676n;
                                long j3 = k0Var2.f46158a0;
                                f6Var13 = ((f3) k0Var2).resourcesProvider;
                                ug.n.m(n2Var, f6Var13, j3, null);
                                return;
                            case 1:
                                k0 k0Var3 = this.f46054b.f46091c;
                                AndroidUtilities.addToClipboard(k0Var3.p1());
                                k0Var3.dismiss();
                                return;
                            case 2:
                                AndroidUtilities.addToClipboard(this.f46054b.f46091c.p1());
                                return;
                            default:
                                k0 k0Var4 = this.f46054b.f46091c;
                                k0Var4.Q0.run();
                                k0Var4.dismiss();
                                return;
                        }
                    }
                });
                if (k0Var.Q0 != null) {
                    ImageView imageView = new ImageView(k0Var.getContext());
                    imageView.setImageResource(R.drawable.msg_stats);
                    int i23 = j6.f20797j5;
                    f6Var6 = ((f3) k0Var).resourcesProvider;
                    imageView.setColorFilter(j6.v0(i23, f6Var6));
                    imageView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                    int dp5 = AndroidUtilities.dp(20.0f);
                    f6Var7 = ((f3) k0Var).resourcesProvider;
                    int k11 = i0.a.k(j6.v0(i21, f6Var7), 76);
                    imageView.setBackground(j6.i0(dp5, dp5, dp5, dp5, 0, k11, k11));
                    frameLayout2.addView(imageView, x5.d(40, 40.0f, 21, 15.0f, 0.0f, 15.0f, 0.0f));
                    imageView.setOnClickListener(new View.OnClickListener(this) {
                        public final d0 f46054b;

                        {
                            this.f46054b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            f6 f6Var13;
                            switch (r2) {
                                case 0:
                                    k0 k0Var2 = this.f46054b.f46091c;
                                    n2 n2Var = k0Var2.f24676n;
                                    long j3 = k0Var2.f46158a0;
                                    f6Var13 = ((f3) k0Var2).resourcesProvider;
                                    ug.n.m(n2Var, f6Var13, j3, null);
                                    return;
                                case 1:
                                    k0 k0Var3 = this.f46054b.f46091c;
                                    AndroidUtilities.addToClipboard(k0Var3.p1());
                                    k0Var3.dismiss();
                                    return;
                                case 2:
                                    AndroidUtilities.addToClipboard(this.f46054b.f46091c.p1());
                                    return;
                                default:
                                    k0 k0Var4 = this.f46054b.f46091c;
                                    k0Var4.Q0.run();
                                    k0Var4.dismiss();
                                    return;
                            }
                        }
                    });
                }
                textView.setText(k0Var.p1());
                textView.setGravity(17);
                frameLayout = frameLayout2;
                j0Var = frameLayout;
                break;
            case 8:
                LinearLayout linearLayout = new LinearLayout(context);
                i16 = ((f3) k0Var).backgroundPaddingLeft;
                int dp6 = AndroidUtilities.dp(6.0f) + i16;
                i17 = ((f3) k0Var).backgroundPaddingLeft;
                linearLayout.setPadding(dp6, 0, AndroidUtilities.dp(6.0f) + i17, 0);
                linearLayout.setOrientation(1);
                k90 k90Var = new k90(context);
                d90 d90Var = new d90(context, null);
                if (k0Var.x1()) {
                    i18 = R.string.BoostingStoriesByGiftingGroup2;
                } else {
                    i18 = R.string.BoostingStoriesByGiftingChannel2;
                }
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(i18));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.BoostingStoriesByGiftingLink));
                spannableStringBuilder.setSpan(new ec(this, 8), 0, spannableStringBuilder.length(), 33);
                SpannableString spannableString = new SpannableString(">");
                Drawable mutate = k0Var.getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
                int i24 = j6.gc;
                mutate.setColorFilter(new PorterDuffColorFilter(i24, PorterDuff.Mode.SRC_IN));
                nq nqVar = new nq(0, mutate);
                nqVar.setColorKey(i24);
                nqVar.setSize(AndroidUtilities.dp(18.0f));
                nqVar.setWidth(AndroidUtilities.dp(11.0f));
                nqVar.setTranslateX(-AndroidUtilities.dp(5.0f));
                spannableString.setSpan(nqVar, 0, spannableString.length(), 33);
                d90Var.setText(TextUtils.concat(replaceTags, " ", AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString)));
                d90Var.setTextSize(1, 14.0f);
                d90Var.setLineSpacing(AndroidUtilities.dp(3.0f), 1.0f);
                f6Var8 = ((f3) k0Var).resourcesProvider;
                if (f6Var8 instanceof bi.b) {
                    int i25 = j6.f21069y6;
                    f6Var11 = ((f3) k0Var).resourcesProvider;
                    d90Var.setTextColor(j6.v0(i25, f6Var11));
                } else {
                    int i26 = j6.G6;
                    f6Var9 = ((f3) k0Var).resourcesProvider;
                    d90Var.setTextColor(j6.v0(i26, f6Var9));
                }
                d90Var.setGravity(1);
                d90Var.setOnClickListener(new View.OnClickListener(this) {
                    public final d0 f46054b;

                    {
                        this.f46054b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        f6 f6Var13;
                        switch (r2) {
                            case 0:
                                k0 k0Var2 = this.f46054b.f46091c;
                                n2 n2Var = k0Var2.f24676n;
                                long j3 = k0Var2.f46158a0;
                                f6Var13 = ((f3) k0Var2).resourcesProvider;
                                ug.n.m(n2Var, f6Var13, j3, null);
                                return;
                            case 1:
                                k0 k0Var3 = this.f46054b.f46091c;
                                AndroidUtilities.addToClipboard(k0Var3.p1());
                                k0Var3.dismiss();
                                return;
                            case 2:
                                AndroidUtilities.addToClipboard(this.f46054b.f46091c.p1());
                                return;
                            default:
                                k0 k0Var4 = this.f46054b.f46091c;
                                k0Var4.Q0.run();
                                k0Var4.dismiss();
                                return;
                        }
                    }
                });
                k90Var.setOnClickListener(new m4(d90Var, 10));
                if (k0Var.y1()) {
                    f6Var10 = ((f3) k0Var).resourcesProvider;
                    di.d dVar = new di.d(context, f6Var10, true);
                    dVar.g(LocaleController.getString(R.string.Copy), false, true);
                    dVar.setOnClickListener(new View.OnClickListener(this) {
                        public final d0 f46054b;

                        {
                            this.f46054b = this;
                        }

                        @Override
                        public final void onClick(View view) {
                            f6 f6Var13;
                            switch (r2) {
                                case 0:
                                    k0 k0Var2 = this.f46054b.f46091c;
                                    n2 n2Var = k0Var2.f24676n;
                                    long j3 = k0Var2.f46158a0;
                                    f6Var13 = ((f3) k0Var2).resourcesProvider;
                                    ug.n.m(n2Var, f6Var13, j3, null);
                                    return;
                                case 1:
                                    k0 k0Var3 = this.f46054b.f46091c;
                                    AndroidUtilities.addToClipboard(k0Var3.p1());
                                    k0Var3.dismiss();
                                    return;
                                case 2:
                                    AndroidUtilities.addToClipboard(this.f46054b.f46091c.p1());
                                    return;
                                default:
                                    k0 k0Var4 = this.f46054b.f46091c;
                                    k0Var4.Q0.run();
                                    k0Var4.dismiss();
                                    return;
                            }
                        }
                    });
                    LinearLayout linearLayout2 = new LinearLayout(context);
                    linearLayout2.addView(k0Var.G0, x5.p(-1, 44, 1.0f, 0, 0, 0, 4, 0));
                    linearLayout2.addView(dVar, x5.p(-1, 44, 1.0f, 0, 4, 0, 0, 0));
                    linearLayout.addView(linearLayout2, x5.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 44));
                } else {
                    linearLayout.addView(k0Var.F0, x5.k(12.0f, 12.0f, 12.0f, 8.0f, -1, 48));
                }
                linearLayout.addView(k90Var, x5.k(0.0f, -5.0f, 0.0f, 0.0f, -1, 48));
                linearLayout.addView(d90Var, x5.k(12.0f, -6.0f, 12.0f, 17.0f, -1, -2));
                j0Var = linearLayout;
                break;
            case 9:
                f6Var12 = ((f3) k0Var).resourcesProvider;
                j0Var = new g0(k0Var, context, f6Var12);
                break;
            default:
                j0 j0Var2 = new j0(k0Var, context);
                k0Var.f46161d0 = j0Var2;
                j0Var = j0Var2;
                break;
        }
        return e2.l(j0Var, j0Var, -1, -2);
    }
}
