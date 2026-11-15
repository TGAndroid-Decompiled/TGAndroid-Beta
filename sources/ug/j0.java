package ug;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.b6;
import c8.i9;
import c8.na;
import hi.g7;
import hi.sa;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.cz;
import org.telegram.messenger.dp;
import org.telegram.messenger.e3;
import org.telegram.messenger.ez;
import org.telegram.messenger.hd;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.m5;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.t3;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.c80;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Wallet.k8;
import org.telegram.ui.an;
import org.telegram.ui.qc;
import org.telegram.ui.qn;
import org.telegram.ui.rv;
import org.telegram.ui.sc1;
import org.telegram.ui.yw;
public class j0 extends ja implements is {
    public static final int S2 = 0;
    public z A2;
    public final TextView B2;
    public hi.d C2;
    public Runnable D2;
    public boolean E2;
    public xi0 F2;
    public final e2 G2;
    public rv H2;
    public androidx.emoji2.text.q I2;
    public boolean J2;
    public TLRPC.Chat K2;
    public final nz L2;
    public Runnable M2;
    public int N2;
    public final hi.d O2;
    public int P2;
    public int Q2;
    public String R2;
    public int T1;
    public boolean U1;
    public int V1;
    public long W1;
    public TL_stories.TL_premium_boostsStatus X1;
    public e3 Y1;
    public i0 Z1;
    public boolean f58130a2;
    public boolean f58131b2;
    public org.telegram.ui.Cells.q1 f58132c2;
    public final int d2;
    public final ArrayList f58133e2;
    public boolean f58134f2;
    public int f58135g2;
    public int f58136h2;
    public int f58137i2;
    public int f58138j2;
    public int f58139k2;
    public int f58140l2;
    public int f58141m2;
    public int f58142n2;
    public int f58143o2;
    public int f58144p2;
    public ArrayList f58145q2;
    public boolean f58146r2;
    public int f58147s2;
    public h0 f58148t2;
    public final HashSet f58149u2;
    public final ArrayList f58150v2;
    public final ArrayList f58151w2;
    public ArrayList f58152x2;
    public ArrayList f58153y2;
    public ArrayList f58154z2;

    public j0(int i7, int i10, Context context, e2 e2Var, e6 e6Var) {
        super(context, e2Var, false, p1(i7), e6Var);
        this.V1 = -1;
        this.f58131b2 = false;
        this.f58133e2 = new ArrayList();
        this.f58136h2 = -1;
        this.f58137i2 = -1;
        this.f58138j2 = -1;
        this.f58139k2 = -1;
        this.f58140l2 = -1;
        this.f58141m2 = -1;
        this.f58142n2 = -1;
        this.f58143o2 = -1;
        this.f58144p2 = -1;
        this.f58147s2 = -1;
        this.f58149u2 = new HashSet();
        this.f58150v2 = new ArrayList();
        this.f58151w2 = new ArrayList();
        this.f58152x2 = new ArrayList();
        this.f58153y2 = new ArrayList();
        this.f58154z2 = new ArrayList();
        this.E2 = false;
        this.N2 = 0;
        this.Q2 = -4;
        P(j6.w0(j6.f28922h5, this.J0));
        this.P2 = this.H0;
        this.G2 = e2Var;
        this.f29679a = i10;
        this.d2 = i7;
        b1();
        G1();
        if (i7 == 2) {
            this.E2 = true;
            G1();
            ConnectionsManager.getInstance(this.f29679a).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new u(this, 0));
        } else if (i7 == 5) {
            this.E2 = true;
            G1();
            ConnectionsManager.getInstance(this.f29679a).sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new u(this, 2));
        }
        F1();
        if (i7 == 32 || q1()) {
            nz nzVar = new nz(getContext());
            this.L2 = nzVar;
            this.f29685c.addView(nzVar, c8.ja.c(-1.0f, -1));
        }
        if (i7 == 18 || i7 == 20 || i7 == 24 || i7 == 25 || i7 == 26 || i7 == 29 || i7 == 22 || i7 == 23 || i7 == 21 || i7 == 27 || i7 == 28 || i7 == 30 || i7 == 35 || i7 == 31) {
            ((ViewGroup) this.A2.getParent()).removeView(this.A2);
            rv rvVar = this.H2;
            if (rvVar != null) {
                ((ViewGroup) rvVar.getParent()).removeView(this.H2);
            }
            this.f35931o1.setPadding(0, 0, 0, 0);
            TextView textView = new TextView(context);
            this.B2 = textView;
            textView.setGravity(17);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setSingleLine(true);
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(this.A2.getTextView().getText());
            q6.U(textView, j6.Ji, e6Var);
            textView.setOnClickListener(new t(this, 0));
            int L = org.telegram.messenger.g0.L(8.0f);
            int i11 = j6.Fi;
            int w02 = j6.w0(i11, e6Var);
            int i12 = j6.f28849d6;
            int o4 = i0.a.o(j6.w0(i12, e6Var), 120);
            org.telegram.ui.Cells.y k02 = j6.k0(L, L, L, L, w02, o4, o4);
            m6 M = q6.M(i11);
            m6 g10 = q6.g(i12, 120);
            textView.setBackground(k02);
            q6.j(textView, k02, M, g10, e6Var);
        }
        if (i7 == 32) {
            ((ViewGroup) this.A2.getParent()).removeView(this.A2);
            hi.d dVar = new hi.d(context, e6Var, true);
            this.O2 = dVar;
            dVar.k();
            dVar.i(hd.M0(2131753625, null), false, true);
            dVar.setOnClickListener(new t(this, 1));
            this.f29682b.addView(dVar, c8.ja.d(-1, 48.0f, 80, 16.0f, 2.0f, 16.0f, 12.0f));
            this.f29682b.post(new v(this, 3));
        }
        if (i7 != 19 && i7 != 18) {
            return;
        }
        this.f29682b.post(new v(this, 4));
    }

    public static androidx.emoji2.text.q o1(int i7, int i10) {
        ?? obj = new Object();
        obj.f2275a = 0;
        obj.d = null;
        obj.f2278e = null;
        obj.f2279f = null;
        obj.f2276b = 0;
        obj.f2277c = 0;
        if (i7 == 0) {
            obj.f2276b = np.s1(i10).Q4;
            obj.f2277c = np.s1(i10).R4;
            obj.f2275a = 2131232202;
            obj.d = hd.a0("LimitReachedPinDialogs", null, 2131748954, Integer.valueOf(obj.f2276b), Integer.valueOf(obj.f2277c));
            obj.f2278e = hd.a0("LimitReachedPinDialogsPremium", null, 2131748952, Integer.valueOf(obj.f2277c));
            obj.f2279f = hd.a0("LimitReachedPinDialogsLocked", null, 2131748953, Integer.valueOf(obj.f2276b));
            return obj;
        } else if (i7 == 33) {
            obj.f2276b = np.s1(i10).f25349n6;
            obj.f2277c = np.s1(i10).f25357o6;
            obj.f2275a = 2131232202;
            obj.d = hd.a0(null, null, 2131748951, Integer.valueOf(obj.f2276b), Integer.valueOf(obj.f2277c));
            obj.f2278e = hd.a0(null, null, 2131748949, Integer.valueOf(obj.f2277c));
            obj.f2279f = hd.a0(null, null, 2131748950, Integer.valueOf(obj.f2276b));
            return obj;
        } else if (i7 == 2) {
            obj.f2276b = np.s1(i10).S4;
            obj.f2277c = np.s1(i10).T4;
            obj.f2275a = 2131232201;
            obj.d = hd.a0("LimitReachedPublicLinks", null, 2131748947, Integer.valueOf(obj.f2276b), Integer.valueOf(obj.f2277c));
            obj.f2278e = hd.a0("LimitReachedPublicLinksPremium", null, 2131748945, Integer.valueOf(obj.f2277c));
            obj.f2279f = hd.a0("LimitReachedPublicLinksLocked", null, 2131748946, Integer.valueOf(obj.f2276b));
            return obj;
        } else if (i7 == 12) {
            obj.f2276b = np.s1(i10).f25450y6;
            obj.f2277c = np.s1(i10).f25459z6;
            obj.f2275a = 2131232201;
            obj.d = hd.a0("LimitReachedFolderLinks", null, 2131748960, Integer.valueOf(obj.f2276b), Integer.valueOf(obj.f2277c));
            obj.f2278e = hd.a0("LimitReachedFolderLinksPremium", null, 2131748958, Integer.valueOf(obj.f2277c));
            obj.f2279f = hd.a0("LimitReachedFolderLinksLocked", null, 2131748959, Integer.valueOf(obj.f2276b));
            return obj;
        } else if (i7 == 13) {
            obj.f2276b = np.s1(i10).A6;
            obj.f2277c = np.s1(i10).B6;
            obj.f2275a = 2131232199;
            obj.d = hd.a0("LimitReachedSharedFolders", null, 2131748943, Integer.valueOf(obj.f2276b), Integer.valueOf(obj.f2277c));
            obj.f2278e = hd.a0("LimitReachedSharedFoldersPremium", null, 2131748941, Integer.valueOf(obj.f2277c));
            obj.f2279f = hd.a0("LimitReachedSharedFoldersLocked", null, 2131748942, Integer.valueOf(obj.f2276b));
            return obj;
        } else if (i7 == 3) {
            obj.f2276b = np.s1(i10).M4;
            obj.f2277c = np.s1(i10).N4;
            obj.f2275a = 2131232199;
            obj.d = hd.a0("LimitReachedFolders", null, 2131748957, Integer.valueOf(obj.f2276b), Integer.valueOf(obj.f2277c));
            obj.f2278e = hd.a0("LimitReachedFoldersPremium", null, 2131748955, Integer.valueOf(obj.f2277c));
            obj.f2279f = hd.a0("LimitReachedFoldersLocked", null, 2131748956, Integer.valueOf(obj.f2276b));
            return obj;
        } else if (i7 == 4) {
            obj.f2276b = np.s1(i10).O4;
            obj.f2277c = np.s1(i10).P4;
            obj.f2275a = 2131232198;
            obj.d = hd.a0("LimitReachedChatInFolders", null, 2131748975, Integer.valueOf(obj.f2276b), Integer.valueOf(obj.f2277c));
            obj.f2278e = hd.a0("LimitReachedChatInFoldersPremium", null, 2131748973, Integer.valueOf(obj.f2277c));
            obj.f2279f = hd.a0("LimitReachedChatInFoldersLocked", null, 2131748974, Integer.valueOf(obj.f2276b));
            return obj;
        } else if (i7 == 5) {
            obj.f2276b = np.s1(i10).E4;
            obj.f2277c = np.s1(i10).F4;
            obj.f2275a = 2131232200;
            obj.d = hd.a0("LimitReachedCommunities", null, 2131748972, Integer.valueOf(obj.f2276b), Integer.valueOf(obj.f2277c));
            obj.f2278e = hd.a0("LimitReachedCommunitiesPremium", null, 2131748970, Integer.valueOf(obj.f2277c));
            obj.f2279f = hd.a0("LimitReachedCommunitiesLocked", null, 2131748971, Integer.valueOf(obj.f2276b));
            return obj;
        } else if (i7 == 6) {
            obj.f2276b = 100;
            obj.f2277c = 200;
            obj.f2275a = 2131232199;
            obj.d = hd.a0("LimitReachedFileSize", null, 2131748963, "2 GB", "4 GB");
            obj.f2278e = hd.a0("LimitReachedFileSizePremium", null, 2131748961, "4 GB");
            obj.f2279f = hd.a0("LimitReachedFileSizeLocked", null, 2131748962, "2 GB");
            return obj;
        } else if (i7 == 7) {
            obj.f2276b = 3;
            obj.f2277c = 4;
            obj.f2275a = 2131232197;
            obj.d = hd.a0("LimitReachedAccounts", null, 2131748977, 3, Integer.valueOf(obj.f2277c));
            obj.f2278e = hd.a0("LimitReachedAccountsPremium", null, 2131748976, Integer.valueOf(obj.f2277c));
            obj.f2279f = hd.a0("LimitReachedAccountsPremium", null, 2131748976, Integer.valueOf(obj.f2276b));
            return obj;
        } else if (i7 == 11) {
            obj.f2276b = 0;
            obj.f2277c = 0;
            obj.f2275a = 2131232201;
            obj.d = hd.a0("LimitReachedAccounts", null, 2131748977, 0, Integer.valueOf(obj.f2277c));
            obj.f2278e = "";
            obj.f2279f = "";
            return obj;
        } else if (i7 == 14) {
            obj.f2276b = np.s1(i10).f25314j5;
            obj.f2277c = np.s1(i10).f25323k5;
            obj.f2275a = 2131232203;
            obj.d = hd.H(',', "LimitReachedStoriesCount2First", obj.f2276b) + "\n" + hd.H(',', "LimitReachedStoriesCount2Second", obj.f2277c);
            obj.f2278e = hd.H(',', "LimitReachedStoriesCount2Premium", obj.f2277c);
            obj.f2279f = hd.H(',', "LimitReachedStoriesCount2Premium", obj.f2276b);
            return obj;
        } else if (i7 == 15) {
            obj.f2276b = np.s1(i10).f25331l5;
            obj.f2277c = np.s1(i10).f25339m5;
            obj.f2275a = 2131232203;
            obj.d = hd.a0("LimitReachedStoriesWeekly", null, 2131748929, Integer.valueOf(obj.f2276b), Integer.valueOf(obj.f2277c));
            obj.f2278e = hd.a0("LimitReachedStoriesWeeklyPremium", null, 2131748928, Integer.valueOf(obj.f2277c));
            obj.f2279f = hd.a0("LimitReachedStoriesWeeklyPremium", null, 2131748928, Integer.valueOf(obj.f2276b));
            return obj;
        } else if (i7 == 16) {
            obj.f2276b = np.s1(i10).f25348n5;
            obj.f2277c = np.s1(i10).f25356o5;
            obj.f2275a = 2131232203;
            obj.d = hd.a0("LimitReachedStoriesMonthly", null, 2131748931, Integer.valueOf(obj.f2276b), Integer.valueOf(obj.f2277c));
            obj.f2278e = hd.a0("LimitReachedStoriesMonthlyPremium", null, 2131748930, Integer.valueOf(obj.f2277c));
            obj.f2279f = hd.a0("LimitReachedStoriesMonthlyPremium", null, 2131748930, Integer.valueOf(obj.f2276b));
            return obj;
        } else if (i7 != 18 && i7 != 32 && i7 != 20 && i7 != 24 && i7 != 27 && i7 != 28 && i7 != 25 && i7 != 30 && i7 != 35 && i7 != 29 && i7 != 22 && i7 != 23 && i7 != 19 && i7 != 21 && i7 != 26) {
            return obj;
        } else {
            obj.f2276b = np.s1(i10).f25348n5;
            obj.f2277c = np.s1(i10).f25356o5;
            obj.f2275a = 2131231127;
            obj.d = hd.a0("LimitReachedStoriesMonthly", null, 2131748931, Integer.valueOf(obj.f2276b), Integer.valueOf(obj.f2277c));
            obj.f2278e = hd.a0("LimitReachedStoriesMonthlyPremium", null, 2131748930, Integer.valueOf(obj.f2277c));
            obj.f2279f = hd.a0("LimitReachedStoriesMonthlyPremium", null, 2131748930, Integer.valueOf(obj.f2276b));
            return obj;
        }
    }

    public static boolean p1(int i7) {
        if (i7 != 0 && i7 != 33 && i7 != 3 && i7 != 4 && i7 != 6 && i7 != 7 && i7 != 12 && i7 != 13 && i7 != 14 && i7 != 15 && i7 != 16) {
            return false;
        }
        return true;
    }

    public static String u1(int i7) {
        switch (i7) {
            case 0:
                return "double_limits__dialog_pinned";
            case 1:
            case 7:
            case 11:
            default:
                return null;
            case 2:
                return "double_limits__channels_public";
            case 3:
                return "double_limits__dialog_filters";
            case 4:
                return "double_limits__dialog_filters_chats";
            case 5:
                return "double_limits__channels";
            case 6:
                return "double_limits__upload_max_fileparts";
            case 8:
                return "double_limits__caption_length";
            case 9:
                return "double_limits__saved_gifs";
            case 10:
                return "double_limits__stickers_faved";
            case 12:
                return "double_limits__chatlist_invites";
            case 13:
                return "double_limits__chatlists_joined";
        }
    }

    public static void w1(e2 e2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, e3 e3Var, long j3, boolean z10) {
        if (tL_premium_boostsStatus != null && e3Var != null && e2Var.getContext() != null) {
            j0 j0Var = new j0(32, e2Var.getCurrentAccount(), e2Var.getContext(), e2Var, e2Var.getResourceProvider());
            j0Var.A1(e3Var);
            j0Var.z1(tL_premium_boostsStatus, true);
            j0Var.B1(j3);
            if (z10) {
                e2Var.showDialog(j0Var);
            } else {
                j0Var.show();
            }
        }
    }

    public final void A1(e3 e3Var) {
        this.Y1 = e3Var;
        E1();
        F1();
    }

    public final void B1(long j3) {
        this.W1 = j3;
        G1();
    }

    public final void C1(TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        boolean z10;
        this.K2 = chat;
        this.R2 = str;
        if (TextUtils.isEmpty(str) && !t3.y(3, chat)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.U1 = z10;
        this.f58152x2 = new ArrayList(arrayList);
        this.f58153y2 = arrayList2;
        this.f58154z2 = arrayList3;
        HashSet hashSet = this.f58149u2;
        hashSet.clear();
        if (this.U1) {
            ArrayList arrayList4 = this.f58152x2;
            int size = arrayList4.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList4.get(i7);
                i7++;
                TLRPC.User user = (TLRPC.User) obj;
                if (arrayList2 == null || !arrayList2.contains(Long.valueOf(user.f28200id))) {
                    hashSet.add(user);
                }
            }
        }
        G1();
        E1();
        int i10 = this.d2;
        if ((i10 == 11 || i10 == 34) && !np.s1(this.f29679a).D3()) {
            if (((arrayList3 != null && !arrayList3.isEmpty()) || (arrayList2 != null && arrayList2.size() >= this.f58152x2.size())) && arrayList3 != null && arrayList2 != null) {
                if ((arrayList3.size() == 1 && arrayList2.size() == 1) || arrayList2.size() >= arrayList3.size()) {
                    z zVar = this.A2;
                    if (zVar != null && zVar.getParent() != null) {
                        ((ViewGroup) this.A2.getParent()).removeView(this.A2);
                    }
                    rv rvVar = this.H2;
                    if (rvVar != null && rvVar.getParent() != null) {
                        ((ViewGroup) this.H2.getParent()).removeView(this.H2);
                    }
                    uj0 uj0Var = this.f35931o1;
                    if (uj0Var != null) {
                        uj0Var.setPadding(0, 0, 0, 0);
                    }
                }
            }
        }
    }

    public final void D1() {
        int i7;
        int i10;
        int i11;
        int max;
        int i12;
        int i13;
        int i14;
        String str;
        int i15;
        String str2;
        this.f58145q2 = new ArrayList();
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X1;
        if (tL_premium_boostsStatus != null) {
            i7 = tL_premium_boostsStatus.level + 1;
        } else {
            i7 = 1;
        }
        if (this.d2 == 31) {
            i7 = 1;
        }
        np s12 = np.s1(this.f29679a);
        dp dpVar = s12.f25383r4;
        if (dpVar != null) {
            i10 = dpVar.e(r1());
        } else {
            i10 = 0;
        }
        int max2 = Math.max(10, i10);
        dp dpVar2 = s12.f25393s4;
        if (dpVar2 != null) {
            i11 = dpVar2.e(r1());
        } else {
            i11 = 0;
        }
        int max3 = Math.max(max2, i11);
        if (r1()) {
            max = Math.max(Math.max(Math.max(Math.max(Math.max(max3, s12.B5), s12.f25458z5), s12.A5), s12.f25439x5), s12.f25429w5);
        } else {
            max = Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(max3, s12.f25384r5), s12.s5), s12.f25402t5), s12.f25410u5), s12.f25419v5), s12.A4), s12.B4);
        }
        ArrayList arrayList = null;
        while (i7 <= max) {
            boolean r12 = r1();
            ArrayList arrayList2 = new ArrayList();
            np s13 = np.s1(this.f29679a);
            if (!r12 && i7 >= s13.B4) {
                arrayList2.add(e0.a(2131231819, 2131753660));
            }
            e0 b10 = e0.b(2131231816, i7, "BoostFeatureStoriesPerDay");
            b10.f58070f = true;
            arrayList2.add(b10);
            if (!r12) {
                e0 b11 = e0.b(2131231811, i7, "BoostFeatureCustomReaction");
                b11.f58070f = true;
                arrayList2.add(b11);
            }
            dp dpVar3 = s13.f25383r4;
            if (dpVar3 != null) {
                i12 = dpVar3.a(i7, false);
            } else {
                i12 = 0;
            }
            dp dpVar4 = s13.f25393s4;
            if (dpVar4 != null) {
                i13 = dpVar4.a(i7, r12);
            } else {
                i13 = 0;
            }
            if (!r12 && i12 > 0) {
                arrayList2.add(e0.b(2131231797, 7, "BoostFeatureNameColor"));
            }
            if (!r12 && i12 > 0) {
                arrayList2.add(e0.b(2131231805, i12, "BoostFeatureReplyColor"));
            }
            if (!r12 && i7 >= s13.f25384r5) {
                arrayList2.add(e0.a(2131231806, 2131753633));
            }
            if (i13 > 0) {
                if (r12) {
                    str2 = "BoostFeatureProfileColorGroup";
                } else {
                    str2 = "BoostFeatureProfileColor";
                }
                arrayList2.add(e0.b(2131231798, i13, str2));
            }
            if (r12 && i7 >= s13.f25449y5) {
                arrayList2.add(e0.a(2131231808, 2131753651));
            }
            if ((!r12 && i7 >= s13.s5) || (r12 && i7 >= s13.f25429w5)) {
                if (r12) {
                    i15 = 2131753637;
                } else {
                    i15 = 2131753638;
                }
                arrayList2.add(e0.a(2131231799, i15));
            }
            if (r12 && i7 >= s13.B5) {
                arrayList2.add(e0.a(2131231822, 2131753628));
            }
            if ((!r12 && i7 >= s13.f25402t5) || (r12 && i7 >= s13.f25439x5)) {
                arrayList2.add(new e0(2131231815, 2131753647, -1, "1000+", null));
            }
            if ((!r12 && i7 >= s13.f25410u5) || (r12 && i7 >= s13.f25458z5)) {
                if (r12) {
                    str = "BoostFeatureBackgroundGroup";
                } else {
                    str = "BoostFeatureBackground";
                }
                arrayList2.add(e0.b(2131231823, 8, str));
            }
            if ((!r12 && i7 >= s13.f25419v5) || (r12 && i7 >= s13.A5)) {
                if (r12) {
                    i14 = 2131753652;
                } else {
                    i14 = 2131753653;
                }
                arrayList2.add(e0.a(2131231801, i14));
            }
            if (!r12 && i7 >= s13.A4) {
                arrayList2.add(e0.a(2131231807, 2131753629));
            }
            Collections.reverse(arrayList2);
            if (arrayList != null && arrayList.size() == arrayList2.size()) {
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    e0 e0Var = (e0) arrayList.get(i16);
                    e0 e0Var2 = (e0) arrayList2.get(i16);
                    int i17 = e0Var.f58069e;
                    if (e0Var2 != null && ((e0Var.f58070f && i17 > 2) || (e0Var.f58066a == e0Var2.f58066a && e0Var.f58067b == e0Var2.f58067b && TextUtils.equals(e0Var.f58068c, e0Var2.f58068c) && TextUtils.equals(e0Var.d, e0Var2.d) && i17 == e0Var2.f58069e))) {
                    }
                }
                i7++;
            }
            ArrayList arrayList3 = this.f58145q2;
            arrayList3.add(new d0(i7, arrayList3.isEmpty()));
            this.f58145q2.addAll(arrayList2);
            arrayList = arrayList2;
            i7++;
        }
    }

    public final void E1() {
        int i7;
        String str = null;
        if (this.f58134f2) {
            this.A2.c(hd.M0(2131749130, null), false, false);
            return;
        }
        int i10 = this.d2;
        if (i10 != 19 && i10 != 32 && !s1()) {
            HashSet hashSet = this.f58149u2;
            if (i10 != 11 && i10 != 34) {
                if (hashSet.size() > 0) {
                    if (i10 == 2) {
                        str = hd.G(hashSet.size(), "RevokeLinks", new Object[0]);
                    } else if (i10 == 5) {
                        str = hd.G(hashSet.size(), "LeaveCommunities", new Object[0]);
                    }
                    this.A2.c(str, true, true);
                    return;
                }
                z zVar = this.A2;
                zVar.f58269r = false;
                zVar.d(true);
                return;
            }
            z zVar2 = this.A2;
            if (zVar2.J == null) {
                kq kqVar = new kq(zVar2.getContext(), null);
                zVar2.J = kqVar;
                kqVar.setGravity(3);
                kq kqVar2 = zVar2.J;
                int i11 = j6.Fi;
                int i12 = j6.Ji;
                jq jqVar = kqVar2.f36574a;
                jqVar.v = i11;
                jqVar.f36148w = i12;
                jqVar.f36130b = 0.8f;
                zVar2.setClipChildren(false);
                zVar2.addView(zVar2.J, c8.ja.e(-1, 24, 16));
            }
            if (!this.U1) {
                this.A2.c(hd.M0(2131752041, null), true, true);
            } else if (hashSet.size() > 0) {
                this.A2.c(hd.M0(2131745619, null), true, true);
            } else {
                this.A2.c(hd.M0(2131754557, null), true, true);
            }
            this.A2.J.f36574a.c(hashSet.size(), true);
            this.A2.invalidate();
            return;
        }
        e3 e3Var = this.Y1;
        boolean z10 = e3Var.f23254a;
        if ((z10 || e3Var.f23255b) && !e3Var.f23263l && !e3Var.d) {
            if (e3Var.f23264m) {
                this.A2.c(hd.M0(2131747831, null), true, true);
                return;
            }
            z zVar3 = this.A2;
            zVar3.f58269r = false;
            zVar3.d(true);
            return;
        }
        hi.d dVar = this.O2;
        if (z10) {
            if (wg.q.i()) {
                this.A2.c(hd.M0(2131753591, null), true, true);
            } else {
                z zVar4 = this.A2;
                if (r1()) {
                    i7 = 2131753625;
                } else {
                    i7 = 2131753663;
                }
                zVar4.c(hd.M0(i7, null), true, true);
            }
            this.C2.i(hd.M0(2131753664, null), true, true);
            if (dVar != null) {
                dVar.i(hd.M0(2131753625, null), true, true);
            }
        } else if (e3Var.f23264m) {
            this.C2.i(hd.M0(2131747831, null), true, true);
            if (dVar != null) {
                dVar.i(hd.M0(2131747831, null), true, true);
            }
            this.A2.c(hd.M0(2131747831, null), true, true);
        } else if (wg.q.i()) {
            if (dVar != null) {
                dVar.i(hd.M0(2131753625, null), true, true);
            }
            this.C2.i(hd.M0(2131753664, null), true, true);
            this.A2.c(hd.M0(2131753591, null), true, true);
        } else {
            if (dVar != null) {
                dVar.i(hd.M0(2131747831, null), true, true);
            }
            this.C2.i(hd.M0(2131747831, null), true, true);
            this.A2.c(hd.M0(2131747831, null), true, true);
        }
    }

    public final void F1() {
        String M0;
        if (this.f58134f2) {
            this.A2.c(hd.M0(2131749130, null), false, false);
            return;
        }
        int i7 = this.d2;
        if (i7 != 19 && i7 != 32 && !s1()) {
            if (i7 != 18 && i7 != 20 && i7 != 24 && i7 != 25 && i7 != 26 && i7 != 29 && i7 != 22 && i7 != 23 && i7 != 21 && i7 != 27 && i7 != 28 && i7 != 30 && i7 != 35) {
                if (!m10.i(this.f29679a).q() && !np.s1(this.f29679a).D3() && !this.J2) {
                    this.A2.f58267f.setText(hd.M0(2131749199, null));
                    androidx.emoji2.text.q qVar = this.I2;
                    if (qVar != null) {
                        int i10 = qVar.f2276b;
                        int i11 = i10 + 1;
                        int i12 = qVar.f2277c;
                        if (i11 == i12) {
                            this.A2.setIcon(2131623936);
                            return;
                        }
                        if (i10 != 0 && i12 != 0) {
                            float f10 = i12 / i10;
                            if (f10 >= 1.6f && f10 <= 2.5f) {
                                this.A2.setIcon(2131624002);
                                return;
                            }
                        }
                        z zVar = this.A2;
                        zVar.E.f40807p = null;
                        zVar.G.setVisibility(8);
                        return;
                    }
                    z zVar2 = this.A2;
                    zVar2.E.f40807p = null;
                    zVar2.G.setVisibility(8);
                    return;
                }
                this.A2.f58267f.setText(hd.M0(2131747831, null));
                z zVar3 = this.A2;
                zVar3.E.f40807p = null;
                zVar3.G.setVisibility(8);
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
            spannableStringBuilder.setSpan(new eq(2131232105, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) hd.M0(2131751762, null));
            this.A2.f58267f.setText(spannableStringBuilder);
            return;
        }
        int i13 = 2131753663;
        if (wg.q.i()) {
            p0 p0Var = this.A2.f58267f;
            e3 e3Var = this.Y1;
            if (e3Var != null && e3Var.d) {
                M0 = hd.M0(2131753591, null);
            } else {
                if (r1()) {
                    i13 = 2131753625;
                }
                M0 = hd.M0(i13, null);
            }
            p0Var.setText(M0);
            e3 e3Var2 = this.Y1;
            if (e3Var2 != null && e3Var2.f23264m) {
                this.A2.f58267f.setText(hd.M0(2131747831, null));
                return;
            }
            return;
        }
        p0 p0Var2 = this.A2.f58267f;
        if (r1()) {
            i13 = 2131753625;
        }
        p0Var2.setText(hd.M0(i13, null));
    }

    public final void G1() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        this.f58137i2 = -1;
        this.f58139k2 = -1;
        this.f58140l2 = -1;
        this.f58141m2 = -1;
        this.V1 = -1;
        this.f58142n2 = -1;
        this.f58144p2 = -1;
        this.f58135g2 = 1;
        this.f58136h2 = 0;
        int i7 = this.d2;
        if (i7 != 19 && i7 != 18 && i7 != 20 && i7 != 24 && i7 != 27 && i7 != 28 && i7 != 22 && i7 != 23 && i7 != 25 && i7 != 26 && i7 != 29 && i7 != 21 && i7 != 30 && i7 != 35) {
            if (i7 != 31 && i7 != 32) {
                if (!p1(i7)) {
                    if (i7 != 11 && i7 != 34) {
                        int i10 = this.f58135g2;
                        this.f58137i2 = i10;
                        this.f58135g2 = i10 + 2;
                        this.f58138j2 = i10 + 1;
                    } else {
                        this.f35938v1 = 0.24f;
                    }
                    if (this.E2) {
                        int i11 = this.f58135g2;
                        this.f58135g2 = i11 + 1;
                        this.f58141m2 = i11;
                    } else if (i7 != 11 || this.U1) {
                        if (i7 != 11 || np.s1(this.f29679a).D3() || ((((arrayList = this.f58154z2) == null || arrayList.isEmpty()) && ((arrayList2 = this.f58153y2) == null || arrayList2.size() < this.f58152x2.size())) || (arrayList3 = this.f58154z2) == null || arrayList3.size() != 1 || (arrayList4 = this.f58153y2) == null || arrayList4.size() != 1 || !this.U1)) {
                            int i12 = this.f58135g2;
                            this.f58139k2 = i12;
                            if (i7 != 11 && i7 != 34) {
                                if (i7 == 5) {
                                    this.f58135g2 = this.f58150v2.size() + i12;
                                } else {
                                    this.f58135g2 = this.f58133e2.size() + i12;
                                }
                            } else {
                                this.f58135g2 = this.f58152x2.size() + i12;
                            }
                            this.f58140l2 = this.f58135g2;
                        }
                        if (this.f58140l2 - this.f58139k2 > 1) {
                            int i13 = this.f58135g2;
                            this.f58135g2 = i13 + 1;
                            this.f58142n2 = i13;
                        }
                    }
                }
            } else {
                this.f35938v1 = 0.24f;
                D1();
                int i14 = this.f58135g2;
                this.f58139k2 = i14;
                int i15 = i14 + 1;
                this.f58135g2 = i15;
                this.f58144p2 = i14;
                int size = (this.f58145q2.size() - 1) + i15;
                this.f58135g2 = size;
                this.f58140l2 = size;
            }
        } else {
            if (i7 != 19 || t3.N(n1())) {
                this.f35938v1 = 0.24f;
                int i16 = this.f58135g2;
                this.f58135g2 = i16 + 1;
                this.V1 = i16;
                if (np.s1(this.f29679a).f25373q4) {
                    int i17 = this.f58135g2;
                    this.f58135g2 = i17 + 1;
                    this.f58143o2 = i17;
                }
            }
            D1();
            int i18 = this.f58135g2;
            int i19 = i18 + 1;
            this.f58135g2 = i19;
            this.f58144p2 = i18;
            this.f58135g2 = (this.f58145q2.size() - 1) + i19;
        }
        this.f35931o1.getAdapter().f();
    }

    @Override
    public final tj0 L0(uj0 uj0Var) {
        return new c0(this);
    }

    @Override
    public final CharSequence O0() {
        int i7 = this.d2;
        if (i7 != 11) {
            if (i7 != 34) {
                if (i7 != 35) {
                    int i10 = 2131753625;
                    switch (i7) {
                        case 18:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                            return hd.M0(2131743874, null);
                        case 19:
                        case 30:
                            if (!r1()) {
                                i10 = 2131753663;
                            }
                            return hd.M0(i10, null);
                        case 31:
                            return hd.M0(2131753600, null);
                        case 32:
                            return hd.M0(2131753625, null);
                        default:
                            return hd.M0(2131748978, null);
                    }
                }
                return hd.M0(2131743874, null);
            }
            return hd.M0(2131752622, null);
        }
        return hd.M0(2131752401, null);
    }

    @Override
    public final void U0(st0 st0Var) {
        int i7;
        Context context = st0Var.getContext();
        hi.d dVar = new hi.d(context, this.J0, true);
        this.C2 = dVar;
        dVar.setFlickeringLoading(true);
        this.C2.i(hd.M0(2131753664, null), false, true);
        this.C2.setOnClickListener(new t(this, 2));
        z zVar = new z(this, context, this.J0);
        this.A2 = zVar;
        na.b(zVar, 0.02f, 1.2f);
        if (!this.f35936t1 && (i7 = this.d2) != 18 && i7 != 20 && i7 != 24 && i7 != 25 && i7 != 26 && i7 != 29 && i7 != 22 && i7 != 23 && i7 != 21 && i7 != 27 && i7 != 28 && i7 != 30 && i7 != 35) {
            rv rvVar = new rv(14, context, this);
            this.H2 = rvVar;
            q6.h(j6.f28922h5, rvVar, this.J0);
            st0Var.addView(this.H2, c8.ja.d(-1, 72.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        z zVar2 = this.A2;
        float f10 = (this.f29717u0 / org.telegram.messenger.g0.f23610p) + 16.0f;
        st0Var.addView(zVar2, c8.ja.d(-1, 48.0f, 80, f10, 0.0f, f10, 12.0f));
        int L = org.telegram.messenger.g0.L(72.0f);
        uj0 uj0Var = this.f35931o1;
        uj0Var.setPadding(0, 0, 0, L);
        uj0Var.setClipToPadding(false);
        uj0Var.setClipChildren(false);
        uj0Var.setOnItemClickListener(new b6(this, 22));
        uj0Var.setOnItemLongClickListener(new w(this, 2));
        this.A2.f58271w.setOnClickListener(new sc1(5, this, context));
        this.A2.h.setOnClickListener(new t(this, 3));
        this.F2 = new xi0(uj0Var, true);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        boolean z10;
        TLRPC.ChatFull N0;
        e2 e2Var;
        e2 e2Var2;
        if (i7 == ns.V2) {
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            e2 e2Var3 = this.f35935s1;
            e2 lastFragment = e2Var3.getParentLayout().getLastFragment();
            e2 e2Var4 = null;
            if (lastFragment instanceof ch.o) {
                List fragmentStack = e2Var3.getParentLayout().getFragmentStack();
                if (fragmentStack.size() >= 2) {
                    e2Var = (e2) r.b.h(2, fragmentStack);
                } else {
                    e2Var = null;
                }
                if (fragmentStack.size() >= 3) {
                    e2Var2 = (e2) r.b.h(3, fragmentStack);
                } else {
                    e2Var2 = null;
                }
                if (fragmentStack.size() >= 4) {
                    e2Var4 = (e2) r.b.h(4, fragmentStack);
                }
                if (e2Var instanceof qn) {
                    ((ActionBarLayout) e2Var3.getParentLayout()).d0(e2Var, false);
                }
                dismiss();
                if (booleanValue) {
                    if (e2Var2 instanceof ProfileActivity) {
                        ((ActionBarLayout) e2Var3.getParentLayout()).d0(e2Var2, false);
                    }
                    lastFragment.finishFragment();
                    wg.h.f(e2Var4, chat, true);
                    return;
                }
                lastFragment.finishFragment();
                wg.h.f(e2Var2, chat, false);
            } else if ((lastFragment instanceof an) && booleanValue) {
                wg.h.f(lastFragment, chat, true);
            } else if ((lastFragment instanceof qc) && booleanValue) {
                List fragmentStack2 = e2Var3.getParentLayout().getFragmentStack();
                ArrayList arrayList = new ArrayList();
                for (int size = fragmentStack2.size() - 2; size >= 0; size--) {
                    e2 e2Var5 = (e2) fragmentStack2.get(size);
                    if (!(e2Var5 instanceof an) && !(e2Var5 instanceof yw)) {
                        arrayList.add(e2Var5);
                    } else {
                        e2Var4 = e2Var5;
                        break;
                    }
                }
                if (e2Var4 != null) {
                    int size2 = arrayList.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        ((ActionBarLayout) e2Var3.getParentLayout()).d0((e2) obj, false);
                    }
                    e2Var3.finishFragment();
                    dismiss();
                    wg.h.f(e2Var4, chat, true);
                }
            } else if (booleanValue) {
                sa saVar = sa.G2;
                if (saVar != null && saVar.d) {
                    an ua2 = an.ua(-chat.f28051id);
                    LaunchActivity.Q().presentFragment(ua2, false, false);
                    sa.w();
                    dismiss();
                    wg.h.f(ua2, chat, true);
                    return;
                }
                List fragmentStack3 = e2Var3.getParentLayout().getFragmentStack();
                if (fragmentStack3.size() >= 2) {
                    e2Var4 = (e2) r.b.h(2, fragmentStack3);
                }
                e2Var3.finishFragment();
                dismiss();
                if (e2Var4 instanceof an) {
                    wg.h.f(e2Var4, chat, true);
                }
            } else {
                sa saVar2 = sa.G2;
                if (saVar2 != null && saVar2.d) {
                    an ua3 = an.ua(-chat.f28051id);
                    LaunchActivity.Q().presentFragment(ua3, false, false);
                    sa.w();
                    dismiss();
                    wg.h.f(ua3, chat, false);
                    return;
                }
                dismiss();
                wg.h.f(LaunchActivity.Q(), chat, false);
            }
        } else if (i7 == ns.U2) {
            TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) objArr[0];
            int intValue = ((Integer) objArr[1]).intValue();
            int intValue2 = ((Integer) objArr[2]).intValue();
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) objArr[3];
            if (tL_premium_boostsStatus != null && this.Y1 != null) {
                this.X1.boosts += intValue;
                if (this.d2 == 32 && (N0 = np.s1(this.f29679a).N0(-this.W1)) != null) {
                    N0.boosts_applied += intValue;
                }
                t1();
                z1(tL_premium_boostsStatus, this.f58130a2);
                e3 e3Var = this.Y1;
                if (this.X1.next_level_boosts <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e3Var.f23264m = z10;
                e3Var.f23263l = true;
                e3Var.a(tL_premium_myBoosts);
                if (v1()) {
                    xb Q = new cc(this.f29685c, this.J0).Q(2131624051, 30, hd.G(intValue, "BoostingReassignedFromPlural", hd.G(intValue2, "BoostingFromOtherChannel", new Object[0])));
                    Q.f41635j = 4000;
                    Q.k(true);
                }
            }
        } else if (i7 == ns.T2) {
            dismiss();
        }
    }

    public final void h1(final c80 c80Var, boolean z10) {
        if (c80Var.a() && !z10) {
            return;
        }
        c80Var.setLoading(true);
        np.s1(this.f29679a).G0();
        wg.q.a(-this.W1, Arrays.asList(Integer.valueOf(this.Y1.f23259g)), new z10(this) {
            public final j0 f58384b;

            {
                this.f58384b = this;
            }

            @Override
            public final void a(Object obj) {
                switch (r3) {
                    case 0:
                        j0 j0Var = this.f58384b;
                        np.s1(j0Var.f29679a).G0().a(j0Var.W1, new bi.j(j0Var, c80Var, (TL_stories.TL_premium_myBoosts) obj, 13));
                        return;
                    default:
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                        boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                        c80 c80Var2 = c80Var;
                        if (startsWith) {
                            int intValue = Utilities.z(tL_error.text).intValue();
                            if (intValue <= 5) {
                                org.telegram.messenger.g0.i3(new org.telegram.ui.web.e1(28, this.f58384b, c80Var2), intValue * 1000);
                                return;
                            }
                            wg.h.g(intValue);
                        }
                        c80Var2.setLoading(false);
                        return;
                }
            }
        }, new z10(this) {
            public final j0 f58384b;

            {
                this.f58384b = this;
            }

            @Override
            public final void a(Object obj) {
                switch (r3) {
                    case 0:
                        j0 j0Var = this.f58384b;
                        np.s1(j0Var.f29679a).G0().a(j0Var.W1, new bi.j(j0Var, c80Var, (TL_stories.TL_premium_myBoosts) obj, 13));
                        return;
                    default:
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                        boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                        c80 c80Var2 = c80Var;
                        if (startsWith) {
                            int intValue = Utilities.z(tL_error.text).intValue();
                            if (intValue <= 5) {
                                org.telegram.messenger.g0.i3(new org.telegram.ui.web.e1(28, this.f58384b, c80Var2), intValue * 1000);
                                return;
                            }
                            wg.h.g(intValue);
                        }
                        c80Var2.setLoading(false);
                        return;
                }
            }
        });
    }

    public final void i1() {
        if (this.C2.isAttachedToWindow()) {
            h1(this.C2, false);
            return;
        }
        hi.d dVar = this.O2;
        if (dVar != null && dVar.isAttachedToWindow()) {
            h1(dVar, false);
        } else {
            h1(this.A2, false);
        }
    }

    public int j1() {
        return 0;
    }

    public final String k1() {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X1;
        if (tL_premium_boostsStatus != null && !TextUtils.isEmpty(tL_premium_boostsStatus.boost_url)) {
            return this.X1.boost_url;
        }
        int i7 = this.f29679a;
        long j3 = -this.W1;
        TLRPC.Chat M0 = np.s1(i7).M0(Long.valueOf(j3));
        if (!TextUtils.isEmpty(t3.K(M0, false))) {
            return "https://t.me/boost/" + t3.K(M0, false);
        }
        return a8.p0.o(j3, "https://t.me/boost/?c=");
    }

    public final String l1(boolean z10) {
        String str;
        boolean z11;
        int i7;
        int i10;
        String str2;
        if (this.d2 == 32) {
            TLRPC.Chat n1 = n1();
            TLRPC.ChatFull N0 = np.s1(this.f29679a).N0(-this.W1);
            int max = Math.max(N0.boosts_unrestrict - N0.boosts_applied, 0);
            if (n1 == null) {
                str2 = "";
            } else {
                str2 = n1.title;
            }
            return hd.G(max, "BoostingRemoveRestrictionsSubtitle", str2);
        }
        TLRPC.Chat M0 = np.s1(this.f29679a).M0(Long.valueOf(-this.W1));
        if (M0 == null) {
            if (r1()) {
                i10 = 2131754876;
            } else {
                i10 = 2131754904;
            }
            str = hd.M0(i10, null);
        } else {
            str = M0.title;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X1;
        if (tL_premium_boostsStatus.boosts == tL_premium_boostsStatus.current_level_boosts) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i11 = 2131752352;
        if (s1() && this.X1.next_level_boosts != 0 && z10) {
            if (r1()) {
                i11 = 2131749420;
            }
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.X1;
            int i12 = tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts;
            return hd.a0(null, null, i11, str, hd.G(i12, "MoreBoosts", Integer.valueOf(i12)));
        }
        int i13 = 2131752449;
        if (z11 && this.Y1.d) {
            if (this.X1.level == 1) {
                if (r1()) {
                    i7 = 2131749493;
                } else {
                    i7 = 2131752450;
                }
                return hd.a0(null, null, i7, new Object[0]);
            }
            if (r1()) {
                i13 = 2131749492;
            }
            return hd.a0(null, null, i13, Integer.valueOf(this.X1.level), hd.G(this.X1.level, "BoostStories", new Object[0]));
        } else if (this.Y1.d) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus3 = this.X1;
            if (tL_premium_boostsStatus3.level == 0) {
                if (r1()) {
                    i11 = 2131749420;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus4 = this.X1;
                int i14 = tL_premium_boostsStatus4.next_level_boosts - tL_premium_boostsStatus4.boosts;
                return hd.a0(null, null, i11, str, hd.G(i14, "MoreBoosts", Integer.valueOf(i14)));
            } else if (tL_premium_boostsStatus3.next_level_boosts == 0) {
                if (r1()) {
                    i13 = 2131749492;
                }
                return hd.a0(null, null, i13, Integer.valueOf(this.X1.level), hd.G(this.X1.level + 1, "BoostStories", new Object[0]));
            } else {
                if (r1()) {
                    i11 = 2131749420;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus5 = this.X1;
                int i15 = tL_premium_boostsStatus5.next_level_boosts - tL_premium_boostsStatus5.boosts;
                return hd.a0(null, null, i11, str, hd.G(i15, "MoreBoosts", Integer.valueOf(i15)));
            }
        } else {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus6 = this.X1;
            if (tL_premium_boostsStatus6.level == 0) {
                if (r1()) {
                    i11 = 2131749420;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus7 = this.X1;
                int i16 = tL_premium_boostsStatus7.next_level_boosts - tL_premium_boostsStatus7.boosts;
                return hd.a0(null, null, i11, str, hd.G(i16, "MoreBoosts", Integer.valueOf(i16)));
            } else if (tL_premium_boostsStatus6.next_level_boosts == 0) {
                if (r1()) {
                    i13 = 2131749492;
                }
                return hd.a0(null, null, i13, Integer.valueOf(this.X1.level), hd.G(this.X1.level + 1, "BoostStories", new Object[0]));
            } else {
                if (r1()) {
                    i11 = 2131749420;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus8 = this.X1;
                int i17 = tL_premium_boostsStatus8.next_level_boosts - tL_premium_boostsStatus8.boosts;
                return hd.a0(null, null, i11, str, hd.G(i17, "MoreBoosts", Integer.valueOf(i17)));
            }
        }
    }

    public final String m1() {
        int i7;
        int i10;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X1;
        if (tL_premium_boostsStatus.next_level_boosts == 0) {
            return hd.a0("BoostsMaxLevelReached", null, 2131753158, new Object[0]);
        }
        int i11 = 2131753663;
        if (tL_premium_boostsStatus.level > 0 && !this.Y1.d) {
            if (r1()) {
                i11 = 2131753625;
            }
            return hd.M0(i11, null);
        }
        boolean z10 = this.f58130a2;
        int i12 = this.d2;
        if (z10) {
            if (i12 == 32) {
                if (r1()) {
                    i11 = 2131753625;
                }
                return hd.M0(i11, null);
            }
            TLRPC.Chat M0 = np.s1(this.f29679a).M0(Long.valueOf(-this.W1));
            if (this.Y1.d) {
                return hd.a0("YouBoostedChannel2", null, 2131742840, M0.title);
            }
            if (r1()) {
                i11 = 2131753625;
            }
            return hd.M0(i11, null);
        } else if (i12 == 32) {
            if (r1()) {
                i11 = 2131753625;
            }
            return hd.M0(i11, null);
        } else if (this.Y1.d) {
            if (r1()) {
                i10 = 2131742839;
            } else {
                i10 = 2131742841;
            }
            return hd.M0(i10, null);
        } else {
            if (r1()) {
                i7 = 2131753527;
            } else {
                i7 = 2131753528;
            }
            return hd.M0(i7, null);
        }
    }

    public final TLRPC.Chat n1() {
        return np.s1(this.f29679a).M0(Long.valueOf(-this.W1));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ns.f(this.f29679a).c(this, ns.V2);
        ns.f(this.f29679a).c(this, ns.U2);
        ns.f(this.f29679a).c(this, ns.T2);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ns.f(this.f29679a).n(this, ns.V2);
        ns.f(this.f29679a).n(this, ns.U2);
        ns.f(this.f29679a).n(this, ns.T2);
    }

    public final boolean q1() {
        int i7 = this.d2;
        if (i7 != 19 && i7 != 18 && i7 != 20 && i7 != 24 && i7 != 25 && i7 != 26 && i7 != 29 && i7 != 22 && i7 != 27 && i7 != 28 && i7 != 23 && i7 != 30 && i7 != 35) {
            return false;
        }
        return true;
    }

    public final boolean r1() {
        return !t3.V(np.s1(this.f29679a).M0(Long.valueOf(-this.W1)));
    }

    @Override
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.G0 < 0 && this.H0 == this.P2 && (w02 = j6.w0(j6.f28922h5, this.J0)) != this.H0) {
                this.H0 = w02;
                this.P2 = w02;
                E0(w02);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final boolean s1() {
        if (q1() && t3.N(n1())) {
            return true;
        }
        return false;
    }

    public final void t1() {
        int i7;
        h0 h0Var = this.f58148t2;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X1;
        int i10 = tL_premium_boostsStatus.boosts;
        int i11 = tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.current_level_boosts;
        h0Var.f32629b++;
        h0Var.f32627a = i9.a((i10 - i7) / i11, 0.0f, 1.0f);
        h0Var.f32628a0 = true;
        h0Var.f32630b0 = h0Var.f32644n;
        h0Var.i(i10, true);
        h0Var.J.requestLayout();
        h0Var.requestLayout();
    }

    public final boolean v1() {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        ns f10 = ns.f(this.f29679a);
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X1;
        e3 e3Var = this.Y1;
        e3Var.getClass();
        e3 e3Var2 = new e3();
        e3Var2.f23254a = e3Var.f23254a;
        e3Var2.f23255b = e3Var.f23255b;
        e3Var2.f23256c = e3Var.f23256c;
        e3Var2.d = e3Var.d;
        e3Var2.f23257e = e3Var.f23257e;
        e3Var2.f23259g = e3Var.f23259g;
        e3Var2.h = e3Var.h;
        e3Var2.f23260i = e3Var.f23260i;
        e3Var2.f23261j = e3Var.f23261j;
        e3Var2.f23262k = e3Var.f23262k;
        e3Var2.f23264m = e3Var.f23264m;
        f10.m(ns.f25551p3, tL_premium_boostsStatus, e3Var2, Long.valueOf(this.W1));
        hi.d dVar = this.O2;
        if (dVar != null) {
            TLRPC.ChatFull N0 = np.s1(this.f29679a).N0(-this.W1);
            int max = Math.max(N0.boosts_unrestrict - N0.boosts_applied, 0);
            if (max == 0) {
                ns.f(this.f29679a).m(ns.f25546o3, new Object[0]);
                dismiss();
                return false;
            }
            dVar.c(max, true);
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i0(5));
        transitionSet.setOrdering(0);
        TransitionManager.beginDelayedTransition(this.Z1, transitionSet);
        i0 i0Var = this.Z1;
        wg.b bVar = i0Var.f58121c;
        int indexOfChild = i0Var.indexOfChild(i0Var.f58120b);
        j0 j0Var = i0Var.f58122e;
        if (j0Var.f58130a2) {
            int indexOfChild2 = i0Var.indexOfChild(i0Var.d);
            i0Var.removeView(i0Var.d);
            i0Var.d.removeView(i0Var.f58119a);
            i0Var.d.removeView(bVar);
            LinearLayout linearLayout = new LinearLayout(i0Var.getContext());
            i0Var.d = linearLayout;
            linearLayout.setOrientation(0);
            i0Var.d.setWeightSum(1.0f);
            i0Var.d.addView(i0Var.f58119a, c8.ja.p(-2, -2, 1.0f, 0));
            i0Var.d.addView(bVar, c8.ja.t(-2, -2, 48, 0, 2, 0, 0));
            i0Var.addView(i0Var.d, indexOfChild2, c8.ja.t(-2, -2, 1, 25, 22, 12, 9));
        } else {
            int indexOfChild3 = i0Var.indexOfChild(i0Var.f58119a);
            i0Var.removeView(i0Var.f58119a);
            TextView textView = new TextView(i0Var.getContext());
            i0Var.f58119a = textView;
            textView.setTypeface(org.telegram.messenger.g0.o());
            i0Var.f58119a.setTextSize(1, 20.0f);
            q6.U(i0Var.f58119a, j6.G6, j0Var.J0);
            i0Var.f58119a.setGravity(17);
            i0Var.addView(i0Var.f58119a, indexOfChild3, c8.ja.t(-2, -2, 1, 0, 22, 0, 0));
        }
        i0Var.removeView(i0Var.f58120b);
        TextView textView2 = new TextView(i0Var.getContext());
        i0Var.f58120b = textView2;
        textView2.setTextSize(1, 14.0f);
        TextView textView3 = i0Var.f58120b;
        textView3.setLineSpacing(textView3.getLineSpacingExtra(), i0Var.f58120b.getLineSpacingMultiplier() * 1.1f);
        i0Var.f58120b.setGravity(1);
        q6.U(i0Var.f58120b, j6.G6, j0Var.J0);
        i0Var.addView(i0Var.f58120b, indexOfChild, c8.ja.t(-2, -2, 1, 24, -2, 24, 17));
        this.Z1.f58119a.setText(m1());
        TextView textView4 = this.Z1.f58120b;
        np s12 = np.s1(this.f29679a);
        boolean r12 = r1();
        int i22 = this.d2;
        String str = null;
        if (i22 == 20) {
            if (r12) {
                i21 = 2131749418;
            } else {
                i21 = 2131752349;
            }
            str = hd.a0(null, null, i21, Integer.valueOf(j1()));
        } else if (i22 == 24) {
            if (r12) {
                i20 = 2131749414;
            } else {
                i20 = 2131752346;
            }
            str = hd.a0(null, null, i20, Integer.valueOf(j1()));
        } else if (i22 == 29) {
            str = hd.a0(null, null, 2131749417, Integer.valueOf(s12.f25449y5));
        } else if (i22 == 30) {
            str = hd.a0(null, null, 2131752343, Integer.valueOf(s12.A4));
        } else if (i22 == 35) {
            str = hd.a0(null, null, 2131752350, Integer.valueOf(s12.B4));
        } else if (i22 == 25) {
            if (r12) {
                i18 = 2131749415;
            } else {
                i18 = 2131752347;
            }
            if (r12) {
                i19 = s12.f25439x5;
            } else {
                i19 = s12.f25402t5;
            }
            str = hd.a0(null, null, i18, Integer.valueOf(i19));
        } else if (i22 == 26) {
            if (r12) {
                i16 = 2131749410;
            } else {
                i16 = 2131752341;
            }
            if (r12) {
                i17 = s12.f25439x5;
            } else {
                i17 = s12.f25402t5;
            }
            str = hd.a0(null, null, i16, Integer.valueOf(i17));
        } else if (i22 == 27) {
            if (r12) {
                i15 = 2131749412;
            } else {
                i15 = 2131752344;
            }
            str = hd.a0(null, null, i15, Integer.valueOf(s12.f25384r5));
        } else if (i22 == 28) {
            if (r12) {
                i13 = 2131749413;
            } else {
                i13 = 2131752345;
            }
            if (r12) {
                i14 = s12.f25429w5;
            } else {
                i14 = s12.s5;
            }
            str = hd.a0(null, null, i13, Integer.valueOf(i14));
        } else if (i22 == 22) {
            if (r12) {
                i11 = 2131749411;
            } else {
                i11 = 2131752342;
            }
            if (r12) {
                i12 = s12.f25458z5;
            } else {
                i12 = s12.f25410u5;
            }
            str = hd.a0(null, null, i11, Integer.valueOf(i12));
        } else if (i22 == 23) {
            if (r12) {
                i7 = 2131749416;
            } else {
                i7 = 2131752348;
            }
            if (r12) {
                i10 = s12.A5;
            } else {
                i10 = s12.f25419v5;
            }
            str = hd.a0(null, null, i7, Integer.valueOf(i10));
        }
        if (str == null) {
            str = l1(false);
        }
        textView4.setText(org.telegram.messenger.g0.X2(str));
        E1();
        nz nzVar = this.L2;
        nzVar.c(false);
        try {
            nzVar.performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.Z1.f58121c.a(this.Y1.f23260i, true);
        this.f35931o1.y0(0);
        if (i22 == 32) {
            this.Z1.f58121c.setVisibility(8);
        }
        return true;
    }

    public final void x1(ArrayList arrayList) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.J0);
        String G = hd.G(arrayList.size(), "RevokeLinks", new Object[0]);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = G;
        if (arrayList.size() == 1) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(0);
            if (this.f58146r2) {
                t1Var.U = org.telegram.messenger.g0.X2(hd.a0("RevokeLinkAlertChannel", null, 2131746021, np.s1(this.f29679a).V2 + "/" + t3.K(chat, false), chat.title));
            } else {
                t1Var.U = org.telegram.messenger.g0.X2(hd.a0("RevokeLinkAlert", null, 2131746022, np.s1(this.f29679a).V2 + "/" + t3.K(chat, false), chat.title));
            }
        } else if (this.f58146r2) {
            t1Var.U = org.telegram.messenger.g0.X2(hd.a0("RevokeLinksAlertChannel", null, 2131746018, new Object[0]));
        } else {
            t1Var.U = org.telegram.messenger.g0.X2(hd.a0("RevokeLinksAlert", null, 2131746019, new Object[0]));
        }
        alertDialog$Builder.h(hd.M0(2131752589, null), null);
        alertDialog$Builder.k(hd.M0(2131746024, null), new k8(20, this, arrayList));
        t1Var.show();
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            q6.U(textView, j6.f29090q7, this.J0);
        }
    }

    public final void y1(HashMap hashMap) {
        String str;
        long longValue;
        ArrayList arrayList;
        HashMap hashMap2 = hashMap;
        if (!TextUtils.isEmpty(this.R2)) {
            str = this.R2;
        } else {
            TLRPC.ChatFull N0 = np.s1(this.f29679a).N0(this.K2.f28051id);
            if (N0 == null) {
                dismiss();
                return;
            } else if (this.K2.username != null) {
                str = "@" + this.K2.username;
            } else {
                TLRPC.TL_chatInviteExported tL_chatInviteExported = N0.exported_invite;
                if (tL_chatInviteExported != null) {
                    str = tL_chatInviteExported.link;
                } else {
                    dismiss();
                    return;
                }
            }
        }
        String str2 = str;
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        HashSet hashSet = this.f58149u2;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            TLRPC.User user = (TLRPC.User) it.next();
            long N1 = np.s1(this.f29679a).N1(user.f28200id);
            if (N1 <= 0) {
                N1 = m5.k(np.s1(this.f29679a).J2(user.f28200id));
            }
            if (N1 >= 0) {
                arrayList = arrayList2;
            } else {
                arrayList = arrayList3;
            }
            arrayList.add(user);
        }
        int i7 = 0;
        boolean z10 = true;
        if (hashMap2 == null && !arrayList2.isEmpty()) {
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList2.size();
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                arrayList4.add(Long.valueOf(((TLRPC.User) obj).f28200id));
            }
            t4.Z(this.f29679a, arrayList4, 1, new g7(this, 29));
            return;
        }
        Iterator it2 = hashSet.iterator();
        boolean z11 = false;
        while (it2.hasNext()) {
            TLRPC.User user2 = (TLRPC.User) it2.next();
            if (hashMap2 == null) {
                longValue = 0;
            } else {
                longValue = ((Long) hashMap2.get(Long.valueOf(user2.f28200id))).longValue();
            }
            boolean z12 = z10;
            Iterator it3 = it2;
            cz b10 = cz.b(str2, user2.f28200id, null, null, null, true, null, null, null, false, 0, 0, null, false);
            b10.Q = longValue;
            ez.C(this.f29679a).r0(b10);
            if (b10.Q > 0) {
                z11 = z12;
            }
            hashMap2 = hashMap;
            z10 = z12;
            it2 = it3;
        }
        if (!z11) {
            org.telegram.messenger.g0.h3(new v(this, 2));
        }
        dismiss();
    }

    public final void z1(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z10) {
        this.X1 = tL_premium_boostsStatus;
        this.f58130a2 = z10;
        G1();
    }
}
