package vg;

import ai.j6;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.be;
import b8.mf;
import b8.pf;
import gi.j8;
import gi.va;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.bd;
import org.telegram.messenger.cs;
import org.telegram.messenger.e3;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.hs;
import org.telegram.messenger.m5;
import org.telegram.messenger.t3;
import org.telegram.messenger.u10;
import org.telegram.messenger.wy;
import org.telegram.messenger.xo;
import org.telegram.messenger.yy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.ac;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.v70;
import org.telegram.ui.Components.wi0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ln;
import org.telegram.ui.na1;
import org.telegram.ui.pc;
import org.telegram.ui.uw;
import org.telegram.ui.wm;
public class i0 extends ma implements cs {
    public static final int P2 = 0;
    public Runnable A2;
    public boolean B2;
    public wi0 C2;
    public final d2 D2;
    public org.telegram.ui.Components.voip.r0 E2;
    public androidx.emoji2.text.q F2;
    public boolean G2;
    public TLRPC.Chat H2;
    public final gz I2;
    public Runnable J2;
    public int K2;
    public final gi.d L2;
    public int M2;
    public int N2;
    public String O2;
    public int Q1;
    public boolean R1;
    public int S1;
    public long T1;
    public TL_stories.TL_premium_boostsStatus U1;
    public e3 V1;
    public h0 W1;
    public boolean X1;
    public boolean Y1;
    public org.telegram.ui.Cells.q1 Z1;
    public final int f56651a2;
    public final ArrayList f56652b2;
    public boolean c2;
    public int f56653d2;
    public int f56654e2;
    public int f56655f2;
    public int f56656g2;
    public int f56657h2;
    public int f56658i2;
    public int f56659j2;
    public int f56660k2;
    public int f56661l2;
    public int f56662m2;
    public ArrayList f56663n2;
    public boolean f56664o2;
    public int f56665p2;
    public g0 f56666q2;
    public final HashSet f56667r2;
    public final ArrayList f56668s2;
    public final ArrayList f56669t2;
    public ArrayList f56670u2;
    public ArrayList f56671v2;
    public ArrayList f56672w2;
    public y f56673x2;
    public final TextView f56674y2;
    public gi.d f56675z2;

    public i0(int i3, int i10, Context context, d2 d2Var, e6 e6Var) {
        super(context, d2Var, false, p1(i3), e6Var);
        this.S1 = -1;
        this.Y1 = false;
        this.f56652b2 = new ArrayList();
        this.f56654e2 = -1;
        this.f56655f2 = -1;
        this.f56656g2 = -1;
        this.f56657h2 = -1;
        this.f56658i2 = -1;
        this.f56659j2 = -1;
        this.f56660k2 = -1;
        this.f56661l2 = -1;
        this.f56662m2 = -1;
        this.f56665p2 = -1;
        this.f56667r2 = new HashSet();
        this.f56668s2 = new ArrayList();
        this.f56669t2 = new ArrayList();
        this.f56670u2 = new ArrayList();
        this.f56671v2 = new ArrayList();
        this.f56672w2 = new ArrayList();
        this.B2 = false;
        this.K2 = 0;
        this.N2 = -4;
        O(k6.w0(k6.f27954h5, this.J0));
        this.M2 = this.H0;
        this.D2 = d2Var;
        this.f28583a = i10;
        this.f56651a2 = i3;
        b1();
        G1();
        if (i3 == 2) {
            this.B2 = true;
            G1();
            ConnectionsManager.getInstance(this.f28583a).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new u(this, 0));
        } else if (i3 == 5) {
            this.B2 = true;
            G1();
            ConnectionsManager.getInstance(this.f28583a).sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new u(this, 2));
        }
        F1();
        if (i3 == 32 || q1()) {
            gz gzVar = new gz(getContext());
            this.I2 = gzVar;
            this.f28589c.addView(gzVar, mf.c(-1.0f, -1));
        }
        if (i3 == 18 || i3 == 20 || i3 == 24 || i3 == 25 || i3 == 26 || i3 == 29 || i3 == 22 || i3 == 23 || i3 == 21 || i3 == 27 || i3 == 28 || i3 == 30 || i3 == 35 || i3 == 31) {
            ((ViewGroup) this.f56673x2.getParent()).removeView(this.f56673x2);
            org.telegram.ui.Components.voip.r0 r0Var = this.E2;
            if (r0Var != null) {
                ((ViewGroup) r0Var.getParent()).removeView(this.E2);
            }
            this.f36102l1.setPadding(0, 0, 0, 0);
            TextView textView = new TextView(context);
            this.f56674y2 = textView;
            textView.setGravity(17);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setSingleLine(true);
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(this.f56673x2.getTextView().getText());
            r6.V(textView, k6.Gi, e6Var);
            textView.setOnClickListener(new t(this, 0));
            int L = org.telegram.messenger.g0.L(8.0f);
            int i11 = k6.Ci;
            int w02 = k6.w0(i11, e6Var);
            int i12 = k6.f27878d6;
            int o10 = i0.a.o(k6.w0(i12, e6Var), 120);
            org.telegram.ui.Cells.y k02 = k6.k0(L, L, L, L, w02, o10, o10);
            n6 N = r6.N(i11);
            n6 h = r6.h(i12, 120);
            textView.setBackground(k02);
            r6.k(textView, k02, N, h, e6Var);
        }
        if (i3 == 32) {
            ((ViewGroup) this.f56673x2.getParent()).removeView(this.f56673x2);
            gi.d dVar = new gi.d(context, e6Var, true);
            this.L2 = dVar;
            dVar.k();
            dVar.i(bd.M0(2131753625, null), false, true);
            dVar.setOnClickListener(new t(this, 1));
            this.f28586b.addView(dVar, mf.d(-1, 48.0f, 80, 16.0f, 2.0f, 16.0f, 12.0f));
            this.f28586b.post(new v(this, 3));
        }
        if (i3 != 19 && i3 != 18) {
            return;
        }
        this.f28586b.post(new v(this, 4));
    }

    public static androidx.emoji2.text.q o1(int i3, int i10) {
        ?? obj = new Object();
        obj.f1747a = 0;
        obj.d = null;
        obj.f1750e = null;
        obj.f1751f = null;
        obj.f1748b = 0;
        obj.f1749c = 0;
        if (i3 == 0) {
            obj.f1748b = hp.s1(i10).P4;
            obj.f1749c = hp.s1(i10).Q4;
            obj.f1747a = 2131232201;
            obj.d = bd.a0("LimitReachedPinDialogs", null, 2131748962, Integer.valueOf(obj.f1748b), Integer.valueOf(obj.f1749c));
            obj.f1750e = bd.a0("LimitReachedPinDialogsPremium", null, 2131748960, Integer.valueOf(obj.f1749c));
            obj.f1751f = bd.a0("LimitReachedPinDialogsLocked", null, 2131748961, Integer.valueOf(obj.f1748b));
            return obj;
        } else if (i3 == 33) {
            obj.f1748b = hp.s1(i10).f23065m6;
            obj.f1749c = hp.s1(i10).f23074n6;
            obj.f1747a = 2131232201;
            obj.d = bd.a0(null, null, 2131748959, Integer.valueOf(obj.f1748b), Integer.valueOf(obj.f1749c));
            obj.f1750e = bd.a0(null, null, 2131748957, Integer.valueOf(obj.f1749c));
            obj.f1751f = bd.a0(null, null, 2131748958, Integer.valueOf(obj.f1748b));
            return obj;
        } else if (i3 == 2) {
            obj.f1748b = hp.s1(i10).R4;
            obj.f1749c = hp.s1(i10).S4;
            obj.f1747a = 2131232200;
            obj.d = bd.a0("LimitReachedPublicLinks", null, 2131748955, Integer.valueOf(obj.f1748b), Integer.valueOf(obj.f1749c));
            obj.f1750e = bd.a0("LimitReachedPublicLinksPremium", null, 2131748953, Integer.valueOf(obj.f1749c));
            obj.f1751f = bd.a0("LimitReachedPublicLinksLocked", null, 2131748954, Integer.valueOf(obj.f1748b));
            return obj;
        } else if (i3 == 12) {
            obj.f1748b = hp.s1(i10).f23166x6;
            obj.f1749c = hp.s1(i10).f23176y6;
            obj.f1747a = 2131232200;
            obj.d = bd.a0("LimitReachedFolderLinks", null, 2131748968, Integer.valueOf(obj.f1748b), Integer.valueOf(obj.f1749c));
            obj.f1750e = bd.a0("LimitReachedFolderLinksPremium", null, 2131748966, Integer.valueOf(obj.f1749c));
            obj.f1751f = bd.a0("LimitReachedFolderLinksLocked", null, 2131748967, Integer.valueOf(obj.f1748b));
            return obj;
        } else if (i3 == 13) {
            obj.f1748b = hp.s1(i10).f23185z6;
            obj.f1749c = hp.s1(i10).A6;
            obj.f1747a = 2131232198;
            obj.d = bd.a0("LimitReachedSharedFolders", null, 2131748951, Integer.valueOf(obj.f1748b), Integer.valueOf(obj.f1749c));
            obj.f1750e = bd.a0("LimitReachedSharedFoldersPremium", null, 2131748949, Integer.valueOf(obj.f1749c));
            obj.f1751f = bd.a0("LimitReachedSharedFoldersLocked", null, 2131748950, Integer.valueOf(obj.f1748b));
            return obj;
        } else if (i3 == 3) {
            obj.f1748b = hp.s1(i10).L4;
            obj.f1749c = hp.s1(i10).M4;
            obj.f1747a = 2131232198;
            obj.d = bd.a0("LimitReachedFolders", null, 2131748965, Integer.valueOf(obj.f1748b), Integer.valueOf(obj.f1749c));
            obj.f1750e = bd.a0("LimitReachedFoldersPremium", null, 2131748963, Integer.valueOf(obj.f1749c));
            obj.f1751f = bd.a0("LimitReachedFoldersLocked", null, 2131748964, Integer.valueOf(obj.f1748b));
            return obj;
        } else if (i3 == 4) {
            obj.f1748b = hp.s1(i10).N4;
            obj.f1749c = hp.s1(i10).O4;
            obj.f1747a = 2131232197;
            obj.d = bd.a0("LimitReachedChatInFolders", null, 2131748983, Integer.valueOf(obj.f1748b), Integer.valueOf(obj.f1749c));
            obj.f1750e = bd.a0("LimitReachedChatInFoldersPremium", null, 2131748981, Integer.valueOf(obj.f1749c));
            obj.f1751f = bd.a0("LimitReachedChatInFoldersLocked", null, 2131748982, Integer.valueOf(obj.f1748b));
            return obj;
        } else if (i3 == 5) {
            obj.f1748b = hp.s1(i10).D4;
            obj.f1749c = hp.s1(i10).E4;
            obj.f1747a = 2131232199;
            obj.d = bd.a0("LimitReachedCommunities", null, 2131748980, Integer.valueOf(obj.f1748b), Integer.valueOf(obj.f1749c));
            obj.f1750e = bd.a0("LimitReachedCommunitiesPremium", null, 2131748978, Integer.valueOf(obj.f1749c));
            obj.f1751f = bd.a0("LimitReachedCommunitiesLocked", null, 2131748979, Integer.valueOf(obj.f1748b));
            return obj;
        } else if (i3 == 6) {
            obj.f1748b = 100;
            obj.f1749c = 200;
            obj.f1747a = 2131232198;
            obj.d = bd.a0("LimitReachedFileSize", null, 2131748971, "2 GB", "4 GB");
            obj.f1750e = bd.a0("LimitReachedFileSizePremium", null, 2131748969, "4 GB");
            obj.f1751f = bd.a0("LimitReachedFileSizeLocked", null, 2131748970, "2 GB");
            return obj;
        } else if (i3 == 7) {
            obj.f1748b = 3;
            obj.f1749c = 4;
            obj.f1747a = 2131232196;
            obj.d = bd.a0("LimitReachedAccounts", null, 2131748985, 3, Integer.valueOf(obj.f1749c));
            obj.f1750e = bd.a0("LimitReachedAccountsPremium", null, 2131748984, Integer.valueOf(obj.f1749c));
            obj.f1751f = bd.a0("LimitReachedAccountsPremium", null, 2131748984, Integer.valueOf(obj.f1748b));
            return obj;
        } else if (i3 == 11) {
            obj.f1748b = 0;
            obj.f1749c = 0;
            obj.f1747a = 2131232200;
            obj.d = bd.a0("LimitReachedAccounts", null, 2131748985, 0, Integer.valueOf(obj.f1749c));
            obj.f1750e = "";
            obj.f1751f = "";
            return obj;
        } else if (i3 == 14) {
            obj.f1748b = hp.s1(i10).f23031i5;
            obj.f1749c = hp.s1(i10).f23040j5;
            obj.f1747a = 2131232202;
            obj.d = bd.H(',', "LimitReachedStoriesCount2First", obj.f1748b) + "\n" + bd.H(',', "LimitReachedStoriesCount2Second", obj.f1749c);
            obj.f1750e = bd.H(',', "LimitReachedStoriesCount2Premium", obj.f1749c);
            obj.f1751f = bd.H(',', "LimitReachedStoriesCount2Premium", obj.f1748b);
            return obj;
        } else if (i3 == 15) {
            obj.f1748b = hp.s1(i10).f23048k5;
            obj.f1749c = hp.s1(i10).f23057l5;
            obj.f1747a = 2131232202;
            obj.d = bd.a0("LimitReachedStoriesWeekly", null, 2131748937, Integer.valueOf(obj.f1748b), Integer.valueOf(obj.f1749c));
            obj.f1750e = bd.a0("LimitReachedStoriesWeeklyPremium", null, 2131748936, Integer.valueOf(obj.f1749c));
            obj.f1751f = bd.a0("LimitReachedStoriesWeeklyPremium", null, 2131748936, Integer.valueOf(obj.f1748b));
            return obj;
        } else if (i3 == 16) {
            obj.f1748b = hp.s1(i10).f23064m5;
            obj.f1749c = hp.s1(i10).f23073n5;
            obj.f1747a = 2131232202;
            obj.d = bd.a0("LimitReachedStoriesMonthly", null, 2131748939, Integer.valueOf(obj.f1748b), Integer.valueOf(obj.f1749c));
            obj.f1750e = bd.a0("LimitReachedStoriesMonthlyPremium", null, 2131748938, Integer.valueOf(obj.f1749c));
            obj.f1751f = bd.a0("LimitReachedStoriesMonthlyPremium", null, 2131748938, Integer.valueOf(obj.f1748b));
            return obj;
        } else if (i3 != 18 && i3 != 32 && i3 != 20 && i3 != 24 && i3 != 27 && i3 != 28 && i3 != 25 && i3 != 30 && i3 != 35 && i3 != 29 && i3 != 22 && i3 != 23 && i3 != 19 && i3 != 21 && i3 != 26) {
            return obj;
        } else {
            obj.f1748b = hp.s1(i10).f23064m5;
            obj.f1749c = hp.s1(i10).f23073n5;
            obj.f1747a = 2131231127;
            obj.d = bd.a0("LimitReachedStoriesMonthly", null, 2131748939, Integer.valueOf(obj.f1748b), Integer.valueOf(obj.f1749c));
            obj.f1750e = bd.a0("LimitReachedStoriesMonthlyPremium", null, 2131748938, Integer.valueOf(obj.f1749c));
            obj.f1751f = bd.a0("LimitReachedStoriesMonthlyPremium", null, 2131748938, Integer.valueOf(obj.f1748b));
            return obj;
        }
    }

    public static boolean p1(int i3) {
        if (i3 != 0 && i3 != 33 && i3 != 3 && i3 != 4 && i3 != 6 && i3 != 7 && i3 != 12 && i3 != 13 && i3 != 14 && i3 != 15 && i3 != 16) {
            return false;
        }
        return true;
    }

    public static String u1(int i3) {
        switch (i3) {
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

    public static void w1(d2 d2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, e3 e3Var, long j10, boolean z10) {
        if (tL_premium_boostsStatus != null && e3Var != null && d2Var.getContext() != null) {
            i0 i0Var = new i0(32, d2Var.getCurrentAccount(), d2Var.getContext(), d2Var, d2Var.getResourceProvider());
            i0Var.A1(e3Var);
            i0Var.z1(tL_premium_boostsStatus, true);
            i0Var.B1(j10);
            if (z10) {
                d2Var.showDialog(i0Var);
            } else {
                i0Var.show();
            }
        }
    }

    public final void A1(e3 e3Var) {
        this.V1 = e3Var;
        E1();
        F1();
    }

    public final void B1(long j10) {
        this.T1 = j10;
        G1();
    }

    public final void C1(TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        boolean z10;
        this.H2 = chat;
        this.O2 = str;
        if (TextUtils.isEmpty(str) && !t3.y(3, chat)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.R1 = z10;
        this.f56670u2 = new ArrayList(arrayList);
        this.f56671v2 = arrayList2;
        this.f56672w2 = arrayList3;
        HashSet hashSet = this.f56667r2;
        hashSet.clear();
        if (this.R1) {
            ArrayList arrayList4 = this.f56670u2;
            int size = arrayList4.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList4.get(i3);
                i3++;
                TLRPC.User user = (TLRPC.User) obj;
                if (arrayList2 == null || !arrayList2.contains(Long.valueOf(user.f27150id))) {
                    hashSet.add(user);
                }
            }
        }
        G1();
        E1();
        int i10 = this.f56651a2;
        if ((i10 == 11 || i10 == 34) && !hp.s1(this.f28583a).D3()) {
            if (((arrayList3 != null && !arrayList3.isEmpty()) || (arrayList2 != null && arrayList2.size() >= this.f56670u2.size())) && arrayList3 != null && arrayList2 != null) {
                if ((arrayList3.size() == 1 && arrayList2.size() == 1) || arrayList2.size() >= arrayList3.size()) {
                    y yVar = this.f56673x2;
                    if (yVar != null && yVar.getParent() != null) {
                        ((ViewGroup) this.f56673x2.getParent()).removeView(this.f56673x2);
                    }
                    org.telegram.ui.Components.voip.r0 r0Var = this.E2;
                    if (r0Var != null && r0Var.getParent() != null) {
                        ((ViewGroup) this.E2.getParent()).removeView(this.E2);
                    }
                    tj0 tj0Var = this.f36102l1;
                    if (tj0Var != null) {
                        tj0Var.setPadding(0, 0, 0, 0);
                    }
                }
            }
        }
    }

    public final void D1() {
        int i3;
        int i10;
        int i11;
        int max;
        int i12;
        int i13;
        int i14;
        String str;
        int i15;
        String str2;
        this.f56663n2 = new ArrayList();
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.U1;
        if (tL_premium_boostsStatus != null) {
            i3 = tL_premium_boostsStatus.level + 1;
        } else {
            i3 = 1;
        }
        if (this.f56651a2 == 31) {
            i3 = 1;
        }
        hp s12 = hp.s1(this.f28583a);
        xo xoVar = s12.f23099q4;
        if (xoVar != null) {
            i10 = xoVar.e(r1());
        } else {
            i10 = 0;
        }
        int max2 = Math.max(10, i10);
        xo xoVar2 = s12.f23109r4;
        if (xoVar2 != null) {
            i11 = xoVar2.e(r1());
        } else {
            i11 = 0;
        }
        int max3 = Math.max(max2, i11);
        if (r1()) {
            max = Math.max(Math.max(Math.max(Math.max(Math.max(max3, s12.A5), s12.f23175y5), s12.f23184z5), s12.f23155w5), s12.f23145v5);
        } else {
            max = Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(max3, s12.f23100q5), s12.r5), s12.f23119s5), s12.f23127t5), s12.f23136u5), s12.f23183z4), s12.A4);
        }
        ArrayList arrayList = null;
        while (i3 <= max) {
            boolean r12 = r1();
            ArrayList arrayList2 = new ArrayList();
            hp s13 = hp.s1(this.f28583a);
            if (!r12 && i3 >= s13.A4) {
                arrayList2.add(d0.a(2131231819, 2131753660));
            }
            d0 b10 = d0.b(2131231816, i3, "BoostFeatureStoriesPerDay");
            b10.f56592f = true;
            arrayList2.add(b10);
            if (!r12) {
                d0 b11 = d0.b(2131231811, i3, "BoostFeatureCustomReaction");
                b11.f56592f = true;
                arrayList2.add(b11);
            }
            xo xoVar3 = s13.f23099q4;
            if (xoVar3 != null) {
                i12 = xoVar3.a(i3, false);
            } else {
                i12 = 0;
            }
            xo xoVar4 = s13.f23109r4;
            if (xoVar4 != null) {
                i13 = xoVar4.a(i3, r12);
            } else {
                i13 = 0;
            }
            if (!r12 && i12 > 0) {
                arrayList2.add(d0.b(2131231797, 7, "BoostFeatureNameColor"));
            }
            if (!r12 && i12 > 0) {
                arrayList2.add(d0.b(2131231805, i12, "BoostFeatureReplyColor"));
            }
            if (!r12 && i3 >= s13.f23100q5) {
                arrayList2.add(d0.a(2131231806, 2131753633));
            }
            if (i13 > 0) {
                if (r12) {
                    str2 = "BoostFeatureProfileColorGroup";
                } else {
                    str2 = "BoostFeatureProfileColor";
                }
                arrayList2.add(d0.b(2131231798, i13, str2));
            }
            if (r12 && i3 >= s13.f23165x5) {
                arrayList2.add(d0.a(2131231808, 2131753651));
            }
            if ((!r12 && i3 >= s13.r5) || (r12 && i3 >= s13.f23145v5)) {
                if (r12) {
                    i15 = 2131753637;
                } else {
                    i15 = 2131753638;
                }
                arrayList2.add(d0.a(2131231799, i15));
            }
            if (r12 && i3 >= s13.A5) {
                arrayList2.add(d0.a(2131231822, 2131753628));
            }
            if ((!r12 && i3 >= s13.f23119s5) || (r12 && i3 >= s13.f23155w5)) {
                arrayList2.add(new d0(2131231815, 2131753647, -1, "1000+", null));
            }
            if ((!r12 && i3 >= s13.f23127t5) || (r12 && i3 >= s13.f23175y5)) {
                if (r12) {
                    str = "BoostFeatureBackgroundGroup";
                } else {
                    str = "BoostFeatureBackground";
                }
                arrayList2.add(d0.b(2131231823, 8, str));
            }
            if ((!r12 && i3 >= s13.f23136u5) || (r12 && i3 >= s13.f23184z5)) {
                if (r12) {
                    i14 = 2131753652;
                } else {
                    i14 = 2131753653;
                }
                arrayList2.add(d0.a(2131231801, i14));
            }
            if (!r12 && i3 >= s13.f23183z4) {
                arrayList2.add(d0.a(2131231807, 2131753629));
            }
            Collections.reverse(arrayList2);
            if (arrayList != null && arrayList.size() == arrayList2.size()) {
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    d0 d0Var = (d0) arrayList.get(i16);
                    d0 d0Var2 = (d0) arrayList2.get(i16);
                    int i17 = d0Var.f56591e;
                    if (d0Var2 != null && ((d0Var.f56592f && i17 > 2) || (d0Var.f56588a == d0Var2.f56588a && d0Var.f56589b == d0Var2.f56589b && TextUtils.equals(d0Var.f56590c, d0Var2.f56590c) && TextUtils.equals(d0Var.d, d0Var2.d) && i17 == d0Var2.f56591e))) {
                    }
                }
                i3++;
            }
            ArrayList arrayList3 = this.f56663n2;
            arrayList3.add(new c0(i3, arrayList3.isEmpty()));
            this.f56663n2.addAll(arrayList2);
            arrayList = arrayList2;
            i3++;
        }
    }

    public final void E1() {
        int i3;
        String str = null;
        if (this.c2) {
            this.f56673x2.c(bd.M0(2131749138, null), false, false);
            return;
        }
        int i10 = this.f56651a2;
        if (i10 != 19 && i10 != 32 && !s1()) {
            HashSet hashSet = this.f56667r2;
            if (i10 != 11 && i10 != 34) {
                if (hashSet.size() > 0) {
                    if (i10 == 2) {
                        str = bd.G(hashSet.size(), "RevokeLinks", new Object[0]);
                    } else if (i10 == 5) {
                        str = bd.G(hashSet.size(), "LeaveCommunities", new Object[0]);
                    }
                    this.f56673x2.c(str, true, true);
                    return;
                }
                y yVar = this.f56673x2;
                yVar.f56765r = false;
                yVar.d(true);
                return;
            }
            y yVar2 = this.f56673x2;
            if (yVar2.J == null) {
                dq dqVar = new dq(yVar2.getContext(), null);
                yVar2.J = dqVar;
                dqVar.setGravity(3);
                dq dqVar2 = yVar2.J;
                int i11 = k6.Ci;
                int i12 = k6.Gi;
                cq cqVar = dqVar2.f33180a;
                cqVar.v = i11;
                cqVar.f32815w = i12;
                cqVar.f32797b = 0.8f;
                yVar2.setClipChildren(false);
                yVar2.addView(yVar2.J, mf.e(-1, 24, 16));
            }
            if (!this.R1) {
                this.f56673x2.c(bd.M0(2131752041, null), true, true);
            } else if (hashSet.size() > 0) {
                this.f56673x2.c(bd.M0(2131745629, null), true, true);
            } else {
                this.f56673x2.c(bd.M0(2131754557, null), true, true);
            }
            this.f56673x2.J.f33180a.c(hashSet.size(), true);
            this.f56673x2.invalidate();
            return;
        }
        e3 e3Var = this.V1;
        boolean z10 = e3Var.f22299a;
        if ((z10 || e3Var.f22300b) && !e3Var.f22308l && !e3Var.d) {
            if (e3Var.f22309m) {
                this.f56673x2.c(bd.M0(2131747839, null), true, true);
                return;
            }
            y yVar3 = this.f56673x2;
            yVar3.f56765r = false;
            yVar3.d(true);
            return;
        }
        gi.d dVar = this.L2;
        if (z10) {
            if (xg.s.i()) {
                this.f56673x2.c(bd.M0(2131753591, null), true, true);
            } else {
                y yVar4 = this.f56673x2;
                if (r1()) {
                    i3 = 2131753625;
                } else {
                    i3 = 2131753663;
                }
                yVar4.c(bd.M0(i3, null), true, true);
            }
            this.f56675z2.i(bd.M0(2131753664, null), true, true);
            if (dVar != null) {
                dVar.i(bd.M0(2131753625, null), true, true);
            }
        } else if (e3Var.f22309m) {
            this.f56675z2.i(bd.M0(2131747839, null), true, true);
            if (dVar != null) {
                dVar.i(bd.M0(2131747839, null), true, true);
            }
            this.f56673x2.c(bd.M0(2131747839, null), true, true);
        } else if (xg.s.i()) {
            if (dVar != null) {
                dVar.i(bd.M0(2131753625, null), true, true);
            }
            this.f56675z2.i(bd.M0(2131753664, null), true, true);
            this.f56673x2.c(bd.M0(2131753591, null), true, true);
        } else {
            if (dVar != null) {
                dVar.i(bd.M0(2131747839, null), true, true);
            }
            this.f56675z2.i(bd.M0(2131747839, null), true, true);
            this.f56673x2.c(bd.M0(2131747839, null), true, true);
        }
    }

    public final void F1() {
        String M0;
        if (this.c2) {
            this.f56673x2.c(bd.M0(2131749138, null), false, false);
            return;
        }
        int i3 = this.f56651a2;
        if (i3 != 19 && i3 != 32 && !s1()) {
            if (i3 != 18 && i3 != 20 && i3 != 24 && i3 != 25 && i3 != 26 && i3 != 29 && i3 != 22 && i3 != 23 && i3 != 21 && i3 != 27 && i3 != 28 && i3 != 30 && i3 != 35) {
                if (!h10.i(this.f28583a).q() && !hp.s1(this.f28583a).D3() && !this.G2) {
                    this.f56673x2.f56763f.setText(bd.M0(2131749207, null));
                    androidx.emoji2.text.q qVar = this.F2;
                    if (qVar != null) {
                        int i10 = qVar.f1748b;
                        int i11 = i10 + 1;
                        int i12 = qVar.f1749c;
                        if (i11 == i12) {
                            this.f56673x2.setIcon(2131623936);
                            return;
                        }
                        if (i10 != 0 && i12 != 0) {
                            float f10 = i12 / i10;
                            if (f10 >= 1.6f && f10 <= 2.5f) {
                                this.f56673x2.setIcon(2131624001);
                                return;
                            }
                        }
                        y yVar = this.f56673x2;
                        yVar.E.f39358p = null;
                        yVar.G.setVisibility(8);
                        return;
                    }
                    y yVar2 = this.f56673x2;
                    yVar2.E.f39358p = null;
                    yVar2.G.setVisibility(8);
                    return;
                }
                this.f56673x2.f56763f.setText(bd.M0(2131747839, null));
                y yVar3 = this.f56673x2;
                yVar3.E.f39358p = null;
                yVar3.G.setVisibility(8);
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
            spannableStringBuilder.setSpan(new wp(2131232104, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) bd.M0(2131751762, null));
            this.f56673x2.f56763f.setText(spannableStringBuilder);
            return;
        }
        int i13 = 2131753663;
        if (xg.s.i()) {
            n0 n0Var = this.f56673x2.f56763f;
            e3 e3Var = this.V1;
            if (e3Var != null && e3Var.d) {
                M0 = bd.M0(2131753591, null);
            } else {
                if (r1()) {
                    i13 = 2131753625;
                }
                M0 = bd.M0(i13, null);
            }
            n0Var.setText(M0);
            e3 e3Var2 = this.V1;
            if (e3Var2 != null && e3Var2.f22309m) {
                this.f56673x2.f56763f.setText(bd.M0(2131747839, null));
                return;
            }
            return;
        }
        n0 n0Var2 = this.f56673x2.f56763f;
        if (r1()) {
            i13 = 2131753625;
        }
        n0Var2.setText(bd.M0(i13, null));
    }

    public final void G1() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        this.f56655f2 = -1;
        this.f56657h2 = -1;
        this.f56658i2 = -1;
        this.f56659j2 = -1;
        this.S1 = -1;
        this.f56660k2 = -1;
        this.f56662m2 = -1;
        this.f56653d2 = 1;
        this.f56654e2 = 0;
        int i3 = this.f56651a2;
        if (i3 != 19 && i3 != 18 && i3 != 20 && i3 != 24 && i3 != 27 && i3 != 28 && i3 != 22 && i3 != 23 && i3 != 25 && i3 != 26 && i3 != 29 && i3 != 21 && i3 != 30 && i3 != 35) {
            if (i3 != 31 && i3 != 32) {
                if (!p1(i3)) {
                    if (i3 != 11 && i3 != 34) {
                        int i10 = this.f56653d2;
                        this.f56655f2 = i10;
                        this.f56653d2 = i10 + 2;
                        this.f56656g2 = i10 + 1;
                    } else {
                        this.f36108s1 = 0.24f;
                    }
                    if (this.B2) {
                        int i11 = this.f56653d2;
                        this.f56653d2 = i11 + 1;
                        this.f56659j2 = i11;
                    } else if (i3 != 11 || this.R1) {
                        if (i3 != 11 || hp.s1(this.f28583a).D3() || ((((arrayList = this.f56672w2) == null || arrayList.isEmpty()) && ((arrayList2 = this.f56671v2) == null || arrayList2.size() < this.f56670u2.size())) || (arrayList3 = this.f56672w2) == null || arrayList3.size() != 1 || (arrayList4 = this.f56671v2) == null || arrayList4.size() != 1 || !this.R1)) {
                            int i12 = this.f56653d2;
                            this.f56657h2 = i12;
                            if (i3 != 11 && i3 != 34) {
                                if (i3 == 5) {
                                    this.f56653d2 = this.f56668s2.size() + i12;
                                } else {
                                    this.f56653d2 = this.f56652b2.size() + i12;
                                }
                            } else {
                                this.f56653d2 = this.f56670u2.size() + i12;
                            }
                            this.f56658i2 = this.f56653d2;
                        }
                        if (this.f56658i2 - this.f56657h2 > 1) {
                            int i13 = this.f56653d2;
                            this.f56653d2 = i13 + 1;
                            this.f56660k2 = i13;
                        }
                    }
                }
            } else {
                this.f36108s1 = 0.24f;
                D1();
                int i14 = this.f56653d2;
                this.f56657h2 = i14;
                int i15 = i14 + 1;
                this.f56653d2 = i15;
                this.f56662m2 = i14;
                int size = (this.f56663n2.size() - 1) + i15;
                this.f56653d2 = size;
                this.f56658i2 = size;
            }
        } else {
            if (i3 != 19 || t3.N(n1())) {
                this.f36108s1 = 0.24f;
                int i16 = this.f56653d2;
                this.f56653d2 = i16 + 1;
                this.S1 = i16;
                if (hp.s1(this.f28583a).f23090p4) {
                    int i17 = this.f56653d2;
                    this.f56653d2 = i17 + 1;
                    this.f56661l2 = i17;
                }
            }
            D1();
            int i18 = this.f56653d2;
            int i19 = i18 + 1;
            this.f56653d2 = i19;
            this.f56662m2 = i18;
            this.f56653d2 = (this.f56663n2.size() - 1) + i19;
        }
        this.f36102l1.getAdapter().f();
    }

    @Override
    public final sj0 L0(tj0 tj0Var) {
        return new b0(this);
    }

    @Override
    public final CharSequence O0() {
        int i3 = this.f56651a2;
        if (i3 != 11) {
            if (i3 != 34) {
                if (i3 != 35) {
                    int i10 = 2131753625;
                    switch (i3) {
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
                            return bd.M0(2131743884, null);
                        case 19:
                        case 30:
                            if (!r1()) {
                                i10 = 2131753663;
                            }
                            return bd.M0(i10, null);
                        case 31:
                            return bd.M0(2131753600, null);
                        case 32:
                            return bd.M0(2131753625, null);
                        default:
                            return bd.M0(2131748986, null);
                    }
                }
                return bd.M0(2131743884, null);
            }
            return bd.M0(2131752622, null);
        }
        return bd.M0(2131752401, null);
    }

    @Override
    public final void U0(qt0 qt0Var) {
        int i3;
        Context context = qt0Var.getContext();
        gi.d dVar = new gi.d(context, this.J0, true);
        this.f56675z2 = dVar;
        dVar.setFlickeringLoading(true);
        this.f56675z2.i(bd.M0(2131753664, null), false, true);
        this.f56675z2.setOnClickListener(new t(this, 2));
        y yVar = new y(this, context, this.J0);
        this.f56673x2 = yVar;
        pf.b(yVar, 0.02f, 1.2f);
        if (!this.f36106q1 && (i3 = this.f56651a2) != 18 && i3 != 20 && i3 != 24 && i3 != 25 && i3 != 26 && i3 != 29 && i3 != 22 && i3 != 23 && i3 != 21 && i3 != 27 && i3 != 28 && i3 != 30 && i3 != 35) {
            org.telegram.ui.Components.voip.r0 r0Var = new org.telegram.ui.Components.voip.r0(15, context, this);
            this.E2 = r0Var;
            r6.i(k6.f27954h5, r0Var, this.J0);
            qt0Var.addView(this.E2, mf.d(-1, 72.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        y yVar2 = this.f56673x2;
        float f10 = (this.f28618u0 / org.telegram.messenger.g0.f22607p) + 16.0f;
        qt0Var.addView(yVar2, mf.d(-1, 48.0f, 80, f10, 0.0f, f10, 12.0f));
        int L = org.telegram.messenger.g0.L(72.0f);
        tj0 tj0Var = this.f36102l1;
        tj0Var.setPadding(0, 0, 0, L);
        tj0Var.setClipToPadding(false);
        tj0Var.setClipChildren(false);
        tj0Var.setOnItemClickListener(new j6(this, 22));
        tj0Var.setOnItemLongClickListener(new w(this, 2));
        this.f56673x2.f56767w.setOnClickListener(new org.telegram.ui.web.d(4, this, context));
        this.f56673x2.h.setOnClickListener(new t(this, 3));
        this.C2 = new wi0(tj0Var, true);
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        boolean z10;
        TLRPC.ChatFull N0;
        d2 d2Var;
        d2 d2Var2;
        if (i3 == hs.V2) {
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            d2 d2Var3 = this.f36105p1;
            d2 lastFragment = d2Var3.getParentLayout().getLastFragment();
            d2 d2Var4 = null;
            if (lastFragment instanceof dh.o) {
                List fragmentStack = d2Var3.getParentLayout().getFragmentStack();
                if (fragmentStack.size() >= 2) {
                    d2Var = (d2) t4.c.d(2, fragmentStack);
                } else {
                    d2Var = null;
                }
                if (fragmentStack.size() >= 3) {
                    d2Var2 = (d2) t4.c.d(3, fragmentStack);
                } else {
                    d2Var2 = null;
                }
                if (fragmentStack.size() >= 4) {
                    d2Var4 = (d2) t4.c.d(4, fragmentStack);
                }
                if (d2Var instanceof ln) {
                    ((ActionBarLayout) d2Var3.getParentLayout()).d0(d2Var, false);
                }
                dismiss();
                if (booleanValue) {
                    if (d2Var2 instanceof ProfileActivity) {
                        ((ActionBarLayout) d2Var3.getParentLayout()).d0(d2Var2, false);
                    }
                    lastFragment.finishFragment();
                    xg.j.f(d2Var4, chat, true);
                    return;
                }
                lastFragment.finishFragment();
                xg.j.f(d2Var2, chat, false);
            } else if ((lastFragment instanceof wm) && booleanValue) {
                xg.j.f(lastFragment, chat, true);
            } else if ((lastFragment instanceof pc) && booleanValue) {
                List fragmentStack2 = d2Var3.getParentLayout().getFragmentStack();
                ArrayList arrayList = new ArrayList();
                for (int size = fragmentStack2.size() - 2; size >= 0; size--) {
                    d2 d2Var5 = (d2) fragmentStack2.get(size);
                    if (!(d2Var5 instanceof wm) && !(d2Var5 instanceof uw)) {
                        arrayList.add(d2Var5);
                    } else {
                        d2Var4 = d2Var5;
                        break;
                    }
                }
                if (d2Var4 != null) {
                    int size2 = arrayList.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        ((ActionBarLayout) d2Var3.getParentLayout()).d0((d2) obj, false);
                    }
                    d2Var3.finishFragment();
                    dismiss();
                    xg.j.f(d2Var4, chat, true);
                }
            } else if (booleanValue) {
                va vaVar = va.G2;
                if (vaVar != null && vaVar.d) {
                    wm ra2 = wm.ra(-chat.f27001id);
                    LaunchActivity.Q().presentFragment(ra2, false, false);
                    va.w();
                    dismiss();
                    xg.j.f(ra2, chat, true);
                    return;
                }
                List fragmentStack3 = d2Var3.getParentLayout().getFragmentStack();
                if (fragmentStack3.size() >= 2) {
                    d2Var4 = (d2) t4.c.d(2, fragmentStack3);
                }
                d2Var3.finishFragment();
                dismiss();
                if (d2Var4 instanceof wm) {
                    xg.j.f(d2Var4, chat, true);
                }
            } else {
                va vaVar2 = va.G2;
                if (vaVar2 != null && vaVar2.d) {
                    wm ra3 = wm.ra(-chat.f27001id);
                    LaunchActivity.Q().presentFragment(ra3, false, false);
                    va.w();
                    dismiss();
                    xg.j.f(ra3, chat, false);
                    return;
                }
                dismiss();
                xg.j.f(LaunchActivity.Q(), chat, false);
            }
        } else if (i3 == hs.U2) {
            TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) objArr[0];
            int intValue = ((Integer) objArr[1]).intValue();
            int intValue2 = ((Integer) objArr[2]).intValue();
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) objArr[3];
            if (tL_premium_boostsStatus != null && this.V1 != null) {
                this.U1.boosts += intValue;
                if (this.f56651a2 == 32 && (N0 = hp.s1(this.f28583a).N0(-this.T1)) != null) {
                    N0.boosts_applied += intValue;
                }
                t1();
                z1(tL_premium_boostsStatus, this.X1);
                e3 e3Var = this.V1;
                if (this.U1.next_level_boosts <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e3Var.f22309m = z10;
                e3Var.f22308l = true;
                e3Var.a(tL_premium_myBoosts);
                if (v1()) {
                    ac Q = new fc(this.f28589c, this.J0).Q(2131624050, 30, bd.G(intValue, "BoostingReassignedFromPlural", bd.G(intValue2, "BoostingFromOtherChannel", new Object[0])));
                    Q.f31792j = 4000;
                    Q.k(true);
                }
            }
        } else if (i3 == hs.T2) {
            dismiss();
        }
    }

    public final void h1(final v70 v70Var, boolean z10) {
        if (v70Var.a() && !z10) {
            return;
        }
        v70Var.setLoading(true);
        hp.s1(this.f28583a).G0();
        xg.s.a(-this.T1, Arrays.asList(Integer.valueOf(this.V1.f22304g)), new u10(this) {
            public final i0 f56905b;

            {
                this.f56905b = this;
            }

            @Override
            public final void a(Object obj) {
                switch (r3) {
                    case 0:
                        i0 i0Var = this.f56905b;
                        hp.s1(i0Var.f28583a).G0().a(i0Var.T1, new ai.m(i0Var, v70Var, (TL_stories.TL_premium_myBoosts) obj, 13));
                        return;
                    default:
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                        boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                        v70 v70Var2 = v70Var;
                        if (startsWith) {
                            int intValue = Utilities.z(tL_error.text).intValue();
                            if (intValue <= 5) {
                                org.telegram.messenger.g0.i3(new u9.a(9, this.f56905b, v70Var2), intValue * 1000);
                                return;
                            }
                            xg.j.g(intValue);
                        }
                        v70Var2.setLoading(false);
                        return;
                }
            }
        }, new u10(this) {
            public final i0 f56905b;

            {
                this.f56905b = this;
            }

            @Override
            public final void a(Object obj) {
                switch (r3) {
                    case 0:
                        i0 i0Var = this.f56905b;
                        hp.s1(i0Var.f28583a).G0().a(i0Var.T1, new ai.m(i0Var, v70Var, (TL_stories.TL_premium_myBoosts) obj, 13));
                        return;
                    default:
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                        boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                        v70 v70Var2 = v70Var;
                        if (startsWith) {
                            int intValue = Utilities.z(tL_error.text).intValue();
                            if (intValue <= 5) {
                                org.telegram.messenger.g0.i3(new u9.a(9, this.f56905b, v70Var2), intValue * 1000);
                                return;
                            }
                            xg.j.g(intValue);
                        }
                        v70Var2.setLoading(false);
                        return;
                }
            }
        });
    }

    public final void i1() {
        if (this.f56675z2.isAttachedToWindow()) {
            h1(this.f56675z2, false);
            return;
        }
        gi.d dVar = this.L2;
        if (dVar != null && dVar.isAttachedToWindow()) {
            h1(dVar, false);
        } else {
            h1(this.f56673x2, false);
        }
    }

    public int j1() {
        return 0;
    }

    public final String k1() {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.U1;
        if (tL_premium_boostsStatus != null && !TextUtils.isEmpty(tL_premium_boostsStatus.boost_url)) {
            return this.U1.boost_url;
        }
        int i3 = this.f28583a;
        long j10 = -this.T1;
        TLRPC.Chat M0 = hp.s1(i3).M0(Long.valueOf(j10));
        if (!TextUtils.isEmpty(t3.K(M0, false))) {
            return "https://t.me/boost/" + t3.K(M0, false);
        }
        return a1.g.p(j10, "https://t.me/boost/?c=");
    }

    public final String l1(boolean z10) {
        String str;
        boolean z11;
        int i3;
        int i10;
        String str2;
        if (this.f56651a2 == 32) {
            TLRPC.Chat n12 = n1();
            TLRPC.ChatFull N0 = hp.s1(this.f28583a).N0(-this.T1);
            int max = Math.max(N0.boosts_unrestrict - N0.boosts_applied, 0);
            if (n12 == null) {
                str2 = "";
            } else {
                str2 = n12.title;
            }
            return bd.G(max, "BoostingRemoveRestrictionsSubtitle", str2);
        }
        TLRPC.Chat M0 = hp.s1(this.f28583a).M0(Long.valueOf(-this.T1));
        if (M0 == null) {
            if (r1()) {
                i10 = 2131754876;
            } else {
                i10 = 2131754904;
            }
            str = bd.M0(i10, null);
        } else {
            str = M0.title;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.U1;
        if (tL_premium_boostsStatus.boosts == tL_premium_boostsStatus.current_level_boosts) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i11 = 2131752352;
        if (s1() && this.U1.next_level_boosts != 0 && z10) {
            if (r1()) {
                i11 = 2131749428;
            }
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.U1;
            int i12 = tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts;
            return bd.a0(null, null, i11, str, bd.G(i12, "MoreBoosts", Integer.valueOf(i12)));
        }
        int i13 = 2131752449;
        if (z11 && this.V1.d) {
            if (this.U1.level == 1) {
                if (r1()) {
                    i3 = 2131749501;
                } else {
                    i3 = 2131752450;
                }
                return bd.a0(null, null, i3, new Object[0]);
            }
            if (r1()) {
                i13 = 2131749500;
            }
            return bd.a0(null, null, i13, Integer.valueOf(this.U1.level), bd.G(this.U1.level, "BoostStories", new Object[0]));
        } else if (this.V1.d) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus3 = this.U1;
            if (tL_premium_boostsStatus3.level == 0) {
                if (r1()) {
                    i11 = 2131749428;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus4 = this.U1;
                int i14 = tL_premium_boostsStatus4.next_level_boosts - tL_premium_boostsStatus4.boosts;
                return bd.a0(null, null, i11, str, bd.G(i14, "MoreBoosts", Integer.valueOf(i14)));
            } else if (tL_premium_boostsStatus3.next_level_boosts == 0) {
                if (r1()) {
                    i13 = 2131749500;
                }
                return bd.a0(null, null, i13, Integer.valueOf(this.U1.level), bd.G(this.U1.level + 1, "BoostStories", new Object[0]));
            } else {
                if (r1()) {
                    i11 = 2131749428;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus5 = this.U1;
                int i15 = tL_premium_boostsStatus5.next_level_boosts - tL_premium_boostsStatus5.boosts;
                return bd.a0(null, null, i11, str, bd.G(i15, "MoreBoosts", Integer.valueOf(i15)));
            }
        } else {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus6 = this.U1;
            if (tL_premium_boostsStatus6.level == 0) {
                if (r1()) {
                    i11 = 2131749428;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus7 = this.U1;
                int i16 = tL_premium_boostsStatus7.next_level_boosts - tL_premium_boostsStatus7.boosts;
                return bd.a0(null, null, i11, str, bd.G(i16, "MoreBoosts", Integer.valueOf(i16)));
            } else if (tL_premium_boostsStatus6.next_level_boosts == 0) {
                if (r1()) {
                    i13 = 2131749500;
                }
                return bd.a0(null, null, i13, Integer.valueOf(this.U1.level), bd.G(this.U1.level + 1, "BoostStories", new Object[0]));
            } else {
                if (r1()) {
                    i11 = 2131749428;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus8 = this.U1;
                int i17 = tL_premium_boostsStatus8.next_level_boosts - tL_premium_boostsStatus8.boosts;
                return bd.a0(null, null, i11, str, bd.G(i17, "MoreBoosts", Integer.valueOf(i17)));
            }
        }
    }

    public final String m1() {
        int i3;
        int i10;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.U1;
        if (tL_premium_boostsStatus.next_level_boosts == 0) {
            return bd.a0("BoostsMaxLevelReached", null, 2131753158, new Object[0]);
        }
        int i11 = 2131753663;
        if (tL_premium_boostsStatus.level > 0 && !this.V1.d) {
            if (r1()) {
                i11 = 2131753625;
            }
            return bd.M0(i11, null);
        }
        boolean z10 = this.X1;
        int i12 = this.f56651a2;
        if (z10) {
            if (i12 == 32) {
                if (r1()) {
                    i11 = 2131753625;
                }
                return bd.M0(i11, null);
            }
            TLRPC.Chat M0 = hp.s1(this.f28583a).M0(Long.valueOf(-this.T1));
            if (this.V1.d) {
                return bd.a0("YouBoostedChannel2", null, 2131742850, M0.title);
            }
            if (r1()) {
                i11 = 2131753625;
            }
            return bd.M0(i11, null);
        } else if (i12 == 32) {
            if (r1()) {
                i11 = 2131753625;
            }
            return bd.M0(i11, null);
        } else if (this.V1.d) {
            if (r1()) {
                i10 = 2131742849;
            } else {
                i10 = 2131742851;
            }
            return bd.M0(i10, null);
        } else {
            if (r1()) {
                i3 = 2131753527;
            } else {
                i3 = 2131753528;
            }
            return bd.M0(i3, null);
        }
    }

    public final TLRPC.Chat n1() {
        return hp.s1(this.f28583a).M0(Long.valueOf(-this.T1));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        hs.f(this.f28583a).c(this, hs.V2);
        hs.f(this.f28583a).c(this, hs.U2);
        hs.f(this.f28583a).c(this, hs.T2);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hs.f(this.f28583a).n(this, hs.V2);
        hs.f(this.f28583a).n(this, hs.U2);
        hs.f(this.f28583a).n(this, hs.T2);
    }

    public final boolean q1() {
        int i3 = this.f56651a2;
        if (i3 != 19 && i3 != 18 && i3 != 20 && i3 != 24 && i3 != 25 && i3 != 26 && i3 != 29 && i3 != 22 && i3 != 27 && i3 != 28 && i3 != 23 && i3 != 30 && i3 != 35) {
            return false;
        }
        return true;
    }

    public final boolean r1() {
        return !t3.V(hp.s1(this.f28583a).M0(Long.valueOf(-this.T1)));
    }

    @Override
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.G0 < 0 && this.H0 == this.M2 && (w02 = k6.w0(k6.f27954h5, this.J0)) != this.H0) {
                this.H0 = w02;
                this.M2 = w02;
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
        int i3;
        g0 g0Var = this.f56666q2;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.U1;
        int i10 = tL_premium_boostsStatus.boosts;
        int i11 = tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.current_level_boosts;
        g0Var.f31522b++;
        g0Var.f31520a = be.a((i10 - i3) / i11, 0.0f, 1.0f);
        g0Var.f31521a0 = true;
        g0Var.f31523b0 = g0Var.f31537n;
        g0Var.i(i10, true);
        g0Var.J.requestLayout();
        g0Var.requestLayout();
    }

    public final boolean v1() {
        int i3;
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
        hs f10 = hs.f(this.f28583a);
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.U1;
        e3 e3Var = this.V1;
        e3Var.getClass();
        e3 e3Var2 = new e3();
        e3Var2.f22299a = e3Var.f22299a;
        e3Var2.f22300b = e3Var.f22300b;
        e3Var2.f22301c = e3Var.f22301c;
        e3Var2.d = e3Var.d;
        e3Var2.f22302e = e3Var.f22302e;
        e3Var2.f22304g = e3Var.f22304g;
        e3Var2.h = e3Var.h;
        e3Var2.f22305i = e3Var.f22305i;
        e3Var2.f22306j = e3Var.f22306j;
        e3Var2.f22307k = e3Var.f22307k;
        e3Var2.f22309m = e3Var.f22309m;
        f10.m(hs.f23283p3, tL_premium_boostsStatus, e3Var2, Long.valueOf(this.T1));
        gi.d dVar = this.L2;
        if (dVar != null) {
            TLRPC.ChatFull N0 = hp.s1(this.f28583a).N0(-this.T1);
            int max = Math.max(N0.boosts_unrestrict - N0.boosts_applied, 0);
            if (max == 0) {
                hs.f(this.f28583a).m(hs.f23277o3, new Object[0]);
                dismiss();
                return false;
            }
            dVar.c(max, true);
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new org.telegram.ui.ActionBar.h0(5));
        transitionSet.setOrdering(0);
        TransitionManager.beginDelayedTransition(this.W1, transitionSet);
        h0 h0Var = this.W1;
        xg.b bVar = h0Var.f56622c;
        int indexOfChild = h0Var.indexOfChild(h0Var.f56621b);
        i0 i0Var = h0Var.f56623e;
        if (i0Var.X1) {
            int indexOfChild2 = h0Var.indexOfChild(h0Var.d);
            h0Var.removeView(h0Var.d);
            h0Var.d.removeView(h0Var.f56620a);
            h0Var.d.removeView(bVar);
            LinearLayout linearLayout = new LinearLayout(h0Var.getContext());
            h0Var.d = linearLayout;
            linearLayout.setOrientation(0);
            h0Var.d.setWeightSum(1.0f);
            h0Var.d.addView(h0Var.f56620a, mf.p(-2, -2, 1.0f, 0));
            h0Var.d.addView(bVar, mf.t(-2, -2, 48, 0, 2, 0, 0));
            h0Var.addView(h0Var.d, indexOfChild2, mf.t(-2, -2, 1, 25, 22, 12, 9));
        } else {
            int indexOfChild3 = h0Var.indexOfChild(h0Var.f56620a);
            h0Var.removeView(h0Var.f56620a);
            TextView textView = new TextView(h0Var.getContext());
            h0Var.f56620a = textView;
            textView.setTypeface(org.telegram.messenger.g0.o());
            h0Var.f56620a.setTextSize(1, 20.0f);
            r6.V(h0Var.f56620a, k6.G6, i0Var.J0);
            h0Var.f56620a.setGravity(17);
            h0Var.addView(h0Var.f56620a, indexOfChild3, mf.t(-2, -2, 1, 0, 22, 0, 0));
        }
        h0Var.removeView(h0Var.f56621b);
        TextView textView2 = new TextView(h0Var.getContext());
        h0Var.f56621b = textView2;
        textView2.setTextSize(1, 14.0f);
        TextView textView3 = h0Var.f56621b;
        textView3.setLineSpacing(textView3.getLineSpacingExtra(), h0Var.f56621b.getLineSpacingMultiplier() * 1.1f);
        h0Var.f56621b.setGravity(1);
        r6.V(h0Var.f56621b, k6.G6, i0Var.J0);
        h0Var.addView(h0Var.f56621b, indexOfChild, mf.t(-2, -2, 1, 24, -2, 24, 17));
        this.W1.f56620a.setText(m1());
        TextView textView4 = this.W1.f56621b;
        hp s12 = hp.s1(this.f28583a);
        boolean r12 = r1();
        int i22 = this.f56651a2;
        String str = null;
        if (i22 == 20) {
            if (r12) {
                i21 = 2131749426;
            } else {
                i21 = 2131752349;
            }
            str = bd.a0(null, null, i21, Integer.valueOf(j1()));
        } else if (i22 == 24) {
            if (r12) {
                i20 = 2131749422;
            } else {
                i20 = 2131752346;
            }
            str = bd.a0(null, null, i20, Integer.valueOf(j1()));
        } else if (i22 == 29) {
            str = bd.a0(null, null, 2131749425, Integer.valueOf(s12.f23165x5));
        } else if (i22 == 30) {
            str = bd.a0(null, null, 2131752343, Integer.valueOf(s12.f23183z4));
        } else if (i22 == 35) {
            str = bd.a0(null, null, 2131752350, Integer.valueOf(s12.A4));
        } else if (i22 == 25) {
            if (r12) {
                i18 = 2131749423;
            } else {
                i18 = 2131752347;
            }
            if (r12) {
                i19 = s12.f23155w5;
            } else {
                i19 = s12.f23119s5;
            }
            str = bd.a0(null, null, i18, Integer.valueOf(i19));
        } else if (i22 == 26) {
            if (r12) {
                i16 = 2131749418;
            } else {
                i16 = 2131752341;
            }
            if (r12) {
                i17 = s12.f23155w5;
            } else {
                i17 = s12.f23119s5;
            }
            str = bd.a0(null, null, i16, Integer.valueOf(i17));
        } else if (i22 == 27) {
            if (r12) {
                i15 = 2131749420;
            } else {
                i15 = 2131752344;
            }
            str = bd.a0(null, null, i15, Integer.valueOf(s12.f23100q5));
        } else if (i22 == 28) {
            if (r12) {
                i13 = 2131749421;
            } else {
                i13 = 2131752345;
            }
            if (r12) {
                i14 = s12.f23145v5;
            } else {
                i14 = s12.r5;
            }
            str = bd.a0(null, null, i13, Integer.valueOf(i14));
        } else if (i22 == 22) {
            if (r12) {
                i11 = 2131749419;
            } else {
                i11 = 2131752342;
            }
            if (r12) {
                i12 = s12.f23175y5;
            } else {
                i12 = s12.f23127t5;
            }
            str = bd.a0(null, null, i11, Integer.valueOf(i12));
        } else if (i22 == 23) {
            if (r12) {
                i3 = 2131749424;
            } else {
                i3 = 2131752348;
            }
            if (r12) {
                i10 = s12.f23184z5;
            } else {
                i10 = s12.f23136u5;
            }
            str = bd.a0(null, null, i3, Integer.valueOf(i10));
        }
        if (str == null) {
            str = l1(false);
        }
        textView4.setText(org.telegram.messenger.g0.X2(str));
        E1();
        gz gzVar = this.I2;
        gzVar.c(false);
        try {
            gzVar.performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.W1.f56622c.a(this.V1.f22305i, true);
        this.f36102l1.y0(0);
        if (i22 == 32) {
            this.W1.f56622c.setVisibility(8);
        }
        return true;
    }

    public final void x1(ArrayList arrayList) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.J0);
        String G = bd.G(arrayList.size(), "RevokeLinks", new Object[0]);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = G;
        if (arrayList.size() == 1) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(0);
            if (this.f56664o2) {
                s1Var.U = org.telegram.messenger.g0.X2(bd.a0("RevokeLinkAlertChannel", null, 2131746031, hp.s1(this.f28583a).V2 + "/" + t3.K(chat, false), chat.title));
            } else {
                s1Var.U = org.telegram.messenger.g0.X2(bd.a0("RevokeLinkAlert", null, 2131746032, hp.s1(this.f28583a).V2 + "/" + t3.K(chat, false), chat.title));
            }
        } else if (this.f56664o2) {
            s1Var.U = org.telegram.messenger.g0.X2(bd.a0("RevokeLinksAlertChannel", null, 2131746028, new Object[0]));
        } else {
            s1Var.U = org.telegram.messenger.g0.X2(bd.a0("RevokeLinksAlert", null, 2131746029, new Object[0]));
        }
        alertDialog$Builder.h(bd.M0(2131752589, null), null);
        alertDialog$Builder.k(bd.M0(2131746034, null), new na1(18, this, arrayList));
        s1Var.show();
        TextView textView = (TextView) s1Var.d(-1);
        if (textView != null) {
            r6.V(textView, k6.f28122q7, this.J0);
        }
    }

    public final void y1(HashMap hashMap) {
        String str;
        long longValue;
        ArrayList arrayList;
        HashMap hashMap2 = hashMap;
        if (!TextUtils.isEmpty(this.O2)) {
            str = this.O2;
        } else {
            TLRPC.ChatFull N0 = hp.s1(this.f28583a).N0(this.H2.f27001id);
            if (N0 == null) {
                dismiss();
                return;
            } else if (this.H2.username != null) {
                str = "@" + this.H2.username;
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
        HashSet hashSet = this.f56667r2;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            TLRPC.User user = (TLRPC.User) it.next();
            long N1 = hp.s1(this.f28583a).N1(user.f27150id);
            if (N1 <= 0) {
                N1 = m5.k(hp.s1(this.f28583a).J2(user.f27150id));
            }
            if (N1 >= 0) {
                arrayList = arrayList2;
            } else {
                arrayList = arrayList3;
            }
            arrayList.add(user);
        }
        int i3 = 0;
        boolean z10 = true;
        if (hashMap2 == null && !arrayList2.isEmpty()) {
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList2.size();
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                arrayList4.add(Long.valueOf(((TLRPC.User) obj).f27150id));
            }
            t4.b0(this.f28583a, arrayList4, 1, new j8(this, 27));
            return;
        }
        Iterator it2 = hashSet.iterator();
        boolean z11 = false;
        while (it2.hasNext()) {
            TLRPC.User user2 = (TLRPC.User) it2.next();
            if (hashMap2 == null) {
                longValue = 0;
            } else {
                longValue = ((Long) hashMap2.get(Long.valueOf(user2.f27150id))).longValue();
            }
            boolean z12 = z10;
            Iterator it3 = it2;
            wy b10 = wy.b(str2, user2.f27150id, null, null, null, true, null, null, null, false, 0, 0, null, false);
            b10.Q = longValue;
            yy.C(this.f28583a).r0(b10);
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
        this.U1 = tL_premium_boostsStatus;
        this.X1 = z10;
        G1();
    }
}
