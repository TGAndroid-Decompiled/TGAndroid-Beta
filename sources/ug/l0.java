package ug;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.i8;
import c8.l9;
import c8.ma;
import c8.ra;
import hi.ta;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.cp;
import org.telegram.messenger.fs;
import org.telegram.messenger.g3;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.v3;
import org.telegram.messenger.x10;
import org.telegram.messenger.xy;
import org.telegram.messenger.zy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.fj0;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.n80;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.uz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;
import org.telegram.ui.cx;
import org.telegram.ui.qc;
import org.telegram.ui.rn;
import org.telegram.ui.uv;
import org.telegram.ui.wc1;
public class l0 extends sa implements fs {
    public static final int S2 = 0;
    public b0 A2;
    public final TextView B2;
    public hi.d C2;
    public Runnable D2;
    public boolean E2;
    public fj0 F2;
    public final h2 G2;
    public uv H2;
    public androidx.emoji2.text.q I2;
    public boolean J2;
    public TLRPC.Chat K2;
    public final uz L2;
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
    public g3 Y1;
    public k0 Z1;
    public boolean f58728a2;
    public boolean f58729b2;
    public org.telegram.ui.Cells.q1 f58730c2;
    public final int d2;
    public final ArrayList f58731e2;
    public boolean f58732f2;
    public int f58733g2;
    public int f58734h2;
    public int f58735i2;
    public int f58736j2;
    public int f58737k2;
    public int f58738l2;
    public int f58739m2;
    public int f58740n2;
    public int f58741o2;
    public int f58742p2;
    public ArrayList f58743q2;
    public boolean f58744r2;
    public int f58745s2;
    public j0 f58746t2;
    public final HashSet f58747u2;
    public final ArrayList f58748v2;
    public final ArrayList f58749w2;
    public ArrayList f58750x2;
    public ArrayList f58751y2;
    public ArrayList f58752z2;

    public l0(int i7, int i10, Context context, h2 h2Var, i6 i6Var) {
        super(context, h2Var, false, q1(i7), i6Var);
        this.V1 = -1;
        this.f58729b2 = false;
        this.f58731e2 = new ArrayList();
        this.f58734h2 = -1;
        this.f58735i2 = -1;
        this.f58736j2 = -1;
        this.f58737k2 = -1;
        this.f58738l2 = -1;
        this.f58739m2 = -1;
        this.f58740n2 = -1;
        this.f58741o2 = -1;
        this.f58742p2 = -1;
        this.f58745s2 = -1;
        this.f58747u2 = new HashSet();
        this.f58748v2 = new ArrayList();
        this.f58749w2 = new ArrayList();
        this.f58750x2 = new ArrayList();
        this.f58751y2 = new ArrayList();
        this.f58752z2 = new ArrayList();
        this.E2 = false;
        this.N2 = 0;
        this.Q2 = -4;
        P(n6.w0(n6.f29469h5, this.J0));
        this.P2 = this.H0;
        this.G2 = h2Var;
        this.f30189a = i10;
        this.d2 = i7;
        c1();
        H1();
        if (i7 == 2) {
            this.E2 = true;
            H1();
            ConnectionsManager.getInstance(this.f30189a).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new u(this, 0));
        } else if (i7 == 5) {
            this.E2 = true;
            H1();
            ConnectionsManager.getInstance(this.f30189a).sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new u(this, 2));
        }
        G1();
        if (i7 == 32 || r1()) {
            uz uzVar = new uz(getContext());
            this.L2 = uzVar;
            this.f30195c.addView(uzVar, ma.c(-1.0f, -1));
        }
        if (i7 == 18 || i7 == 20 || i7 == 24 || i7 == 25 || i7 == 26 || i7 == 29 || i7 == 22 || i7 == 23 || i7 == 21 || i7 == 27 || i7 == 28 || i7 == 30 || i7 == 35 || i7 == 31) {
            ((ViewGroup) this.A2.getParent()).removeView(this.A2);
            uv uvVar = this.H2;
            if (uvVar != null) {
                ((ViewGroup) uvVar.getParent()).removeView(this.H2);
            }
            this.f39534o1.setPadding(0, 0, 0, 0);
            TextView textView = new TextView(context);
            this.B2 = textView;
            textView.setGravity(17);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setSingleLine(true);
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(this.A2.getTextView().getText());
            u6.U(textView, n6.Ji, i6Var);
            textView.setOnClickListener(new t(this, 0));
            int L = org.telegram.messenger.g0.L(8.0f);
            int i11 = n6.Fi;
            int w02 = n6.w0(i11, i6Var);
            int i12 = n6.f29396d6;
            int o4 = i0.a.o(n6.w0(i12, i6Var), 120);
            org.telegram.ui.Cells.y k02 = n6.k0(L, L, L, L, w02, o4, o4);
            q6 M = u6.M(i11);
            q6 g10 = u6.g(i12, 120);
            textView.setBackground(k02);
            u6.j(textView, k02, M, g10, i6Var);
        }
        if (i7 == 32) {
            ((ViewGroup) this.A2.getParent()).removeView(this.A2);
            hi.d dVar = new hi.d(context, i6Var, true);
            this.O2 = dVar;
            dVar.k();
            dVar.i(gd.M0(2131753623, null), false, true);
            dVar.setOnClickListener(new t(this, 1));
            this.f30192b.addView(dVar, ma.d(-1, 48.0f, 80, 16.0f, 2.0f, 16.0f, 12.0f));
            this.f30192b.post(new v(this, 3));
        }
        if (i7 != 19 && i7 != 18) {
            return;
        }
        this.f30192b.post(new v(this, 4));
    }

    public static androidx.emoji2.text.q p1(int i7, int i10) {
        ?? obj = new Object();
        obj.f2266a = 0;
        obj.d = null;
        obj.f2269e = null;
        obj.f2270f = null;
        obj.f2267b = 0;
        obj.f2268c = 0;
        if (i7 == 0) {
            obj.f2267b = mp.u1(i10).S4;
            obj.f2268c = mp.u1(i10).T4;
            obj.f2266a = 2131232203;
            obj.d = gd.a0("LimitReachedPinDialogs", null, 2131748762, Integer.valueOf(obj.f2267b), Integer.valueOf(obj.f2268c));
            obj.f2269e = gd.a0("LimitReachedPinDialogsPremium", null, 2131748760, Integer.valueOf(obj.f2268c));
            obj.f2270f = gd.a0("LimitReachedPinDialogsLocked", null, 2131748761, Integer.valueOf(obj.f2267b));
            return obj;
        } else if (i7 == 33) {
            obj.f2267b = mp.u1(i10).f25734p6;
            obj.f2268c = mp.u1(i10).f25743q6;
            obj.f2266a = 2131232203;
            obj.d = gd.a0(null, null, 2131748759, Integer.valueOf(obj.f2267b), Integer.valueOf(obj.f2268c));
            obj.f2269e = gd.a0(null, null, 2131748757, Integer.valueOf(obj.f2268c));
            obj.f2270f = gd.a0(null, null, 2131748758, Integer.valueOf(obj.f2267b));
            return obj;
        } else if (i7 == 2) {
            obj.f2267b = mp.u1(i10).U4;
            obj.f2268c = mp.u1(i10).V4;
            obj.f2266a = 2131232202;
            obj.d = gd.a0("LimitReachedPublicLinks", null, 2131748755, Integer.valueOf(obj.f2267b), Integer.valueOf(obj.f2268c));
            obj.f2269e = gd.a0("LimitReachedPublicLinksPremium", null, 2131748753, Integer.valueOf(obj.f2268c));
            obj.f2270f = gd.a0("LimitReachedPublicLinksLocked", null, 2131748754, Integer.valueOf(obj.f2267b));
            return obj;
        } else if (i7 == 12) {
            obj.f2267b = mp.u1(i10).A6;
            obj.f2268c = mp.u1(i10).B6;
            obj.f2266a = 2131232202;
            obj.d = gd.a0("LimitReachedFolderLinks", null, 2131748768, Integer.valueOf(obj.f2267b), Integer.valueOf(obj.f2268c));
            obj.f2269e = gd.a0("LimitReachedFolderLinksPremium", null, 2131748766, Integer.valueOf(obj.f2268c));
            obj.f2270f = gd.a0("LimitReachedFolderLinksLocked", null, 2131748767, Integer.valueOf(obj.f2267b));
            return obj;
        } else if (i7 == 13) {
            obj.f2267b = mp.u1(i10).C6;
            obj.f2268c = mp.u1(i10).D6;
            obj.f2266a = 2131232200;
            obj.d = gd.a0("LimitReachedSharedFolders", null, 2131748751, Integer.valueOf(obj.f2267b), Integer.valueOf(obj.f2268c));
            obj.f2269e = gd.a0("LimitReachedSharedFoldersPremium", null, 2131748749, Integer.valueOf(obj.f2268c));
            obj.f2270f = gd.a0("LimitReachedSharedFoldersLocked", null, 2131748750, Integer.valueOf(obj.f2267b));
            return obj;
        } else if (i7 == 3) {
            obj.f2267b = mp.u1(i10).O4;
            obj.f2268c = mp.u1(i10).P4;
            obj.f2266a = 2131232200;
            obj.d = gd.a0("LimitReachedFolders", null, 2131748765, Integer.valueOf(obj.f2267b), Integer.valueOf(obj.f2268c));
            obj.f2269e = gd.a0("LimitReachedFoldersPremium", null, 2131748763, Integer.valueOf(obj.f2268c));
            obj.f2270f = gd.a0("LimitReachedFoldersLocked", null, 2131748764, Integer.valueOf(obj.f2267b));
            return obj;
        } else if (i7 == 4) {
            obj.f2267b = mp.u1(i10).Q4;
            obj.f2268c = mp.u1(i10).R4;
            obj.f2266a = 2131232199;
            obj.d = gd.a0("LimitReachedChatInFolders", null, 2131748783, Integer.valueOf(obj.f2267b), Integer.valueOf(obj.f2268c));
            obj.f2269e = gd.a0("LimitReachedChatInFoldersPremium", null, 2131748781, Integer.valueOf(obj.f2268c));
            obj.f2270f = gd.a0("LimitReachedChatInFoldersLocked", null, 2131748782, Integer.valueOf(obj.f2267b));
            return obj;
        } else if (i7 == 5) {
            obj.f2267b = mp.u1(i10).G4;
            obj.f2268c = mp.u1(i10).H4;
            obj.f2266a = 2131232201;
            obj.d = gd.a0("LimitReachedCommunities", null, 2131748780, Integer.valueOf(obj.f2267b), Integer.valueOf(obj.f2268c));
            obj.f2269e = gd.a0("LimitReachedCommunitiesPremium", null, 2131748778, Integer.valueOf(obj.f2268c));
            obj.f2270f = gd.a0("LimitReachedCommunitiesLocked", null, 2131748779, Integer.valueOf(obj.f2267b));
            return obj;
        } else if (i7 == 6) {
            obj.f2267b = 100;
            obj.f2268c = 200;
            obj.f2266a = 2131232200;
            obj.d = gd.a0("LimitReachedFileSize", null, 2131748771, "2 GB", "4 GB");
            obj.f2269e = gd.a0("LimitReachedFileSizePremium", null, 2131748769, "4 GB");
            obj.f2270f = gd.a0("LimitReachedFileSizeLocked", null, 2131748770, "2 GB");
            return obj;
        } else if (i7 == 7) {
            obj.f2267b = 3;
            obj.f2268c = 4;
            obj.f2266a = 2131232198;
            obj.d = gd.a0("LimitReachedAccounts", null, 2131748785, 3, Integer.valueOf(obj.f2268c));
            obj.f2269e = gd.a0("LimitReachedAccountsPremium", null, 2131748784, Integer.valueOf(obj.f2268c));
            obj.f2270f = gd.a0("LimitReachedAccountsPremium", null, 2131748784, Integer.valueOf(obj.f2267b));
            return obj;
        } else if (i7 == 11) {
            obj.f2267b = 0;
            obj.f2268c = 0;
            obj.f2266a = 2131232202;
            obj.d = gd.a0("LimitReachedAccounts", null, 2131748785, 0, Integer.valueOf(obj.f2268c));
            obj.f2269e = "";
            obj.f2270f = "";
            return obj;
        } else if (i7 == 14) {
            obj.f2267b = mp.u1(i10).f25699l5;
            obj.f2268c = mp.u1(i10).f25707m5;
            obj.f2266a = 2131232204;
            obj.d = gd.H(',', "LimitReachedStoriesCount2First", obj.f2267b) + "\n" + gd.H(',', "LimitReachedStoriesCount2Second", obj.f2268c);
            obj.f2269e = gd.H(',', "LimitReachedStoriesCount2Premium", obj.f2268c);
            obj.f2270f = gd.H(',', "LimitReachedStoriesCount2Premium", obj.f2267b);
            return obj;
        } else if (i7 == 15) {
            obj.f2267b = mp.u1(i10).f25716n5;
            obj.f2268c = mp.u1(i10).f25724o5;
            obj.f2266a = 2131232204;
            obj.d = gd.a0("LimitReachedStoriesWeekly", null, 2131748737, Integer.valueOf(obj.f2267b), Integer.valueOf(obj.f2268c));
            obj.f2269e = gd.a0("LimitReachedStoriesWeeklyPremium", null, 2131748736, Integer.valueOf(obj.f2268c));
            obj.f2270f = gd.a0("LimitReachedStoriesWeeklyPremium", null, 2131748736, Integer.valueOf(obj.f2267b));
            return obj;
        } else if (i7 == 16) {
            obj.f2267b = mp.u1(i10).f25733p5;
            obj.f2268c = mp.u1(i10).f25742q5;
            obj.f2266a = 2131232204;
            obj.d = gd.a0("LimitReachedStoriesMonthly", null, 2131748739, Integer.valueOf(obj.f2267b), Integer.valueOf(obj.f2268c));
            obj.f2269e = gd.a0("LimitReachedStoriesMonthlyPremium", null, 2131748738, Integer.valueOf(obj.f2268c));
            obj.f2270f = gd.a0("LimitReachedStoriesMonthlyPremium", null, 2131748738, Integer.valueOf(obj.f2267b));
            return obj;
        } else if (i7 != 18 && i7 != 32 && i7 != 20 && i7 != 24 && i7 != 27 && i7 != 28 && i7 != 25 && i7 != 30 && i7 != 35 && i7 != 29 && i7 != 22 && i7 != 23 && i7 != 19 && i7 != 21 && i7 != 26) {
            return obj;
        } else {
            obj.f2267b = mp.u1(i10).f25733p5;
            obj.f2268c = mp.u1(i10).f25742q5;
            obj.f2266a = 2131231127;
            obj.d = gd.a0("LimitReachedStoriesMonthly", null, 2131748739, Integer.valueOf(obj.f2267b), Integer.valueOf(obj.f2268c));
            obj.f2269e = gd.a0("LimitReachedStoriesMonthlyPremium", null, 2131748738, Integer.valueOf(obj.f2268c));
            obj.f2270f = gd.a0("LimitReachedStoriesMonthlyPremium", null, 2131748738, Integer.valueOf(obj.f2267b));
            return obj;
        }
    }

    public static boolean q1(int i7) {
        if (i7 != 0 && i7 != 33 && i7 != 3 && i7 != 4 && i7 != 6 && i7 != 7 && i7 != 12 && i7 != 13 && i7 != 14 && i7 != 15 && i7 != 16) {
            return false;
        }
        return true;
    }

    public static String v1(int i7) {
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

    public static void x1(h2 h2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, g3 g3Var, long j3, boolean z10) {
        if (tL_premium_boostsStatus != null && g3Var != null && h2Var.getContext() != null) {
            l0 l0Var = new l0(32, h2Var.getCurrentAccount(), h2Var.getContext(), h2Var, h2Var.getResourceProvider());
            l0Var.B1(g3Var);
            l0Var.A1(tL_premium_boostsStatus, true);
            l0Var.C1(j3);
            if (z10) {
                h2Var.showDialog(l0Var);
            } else {
                l0Var.show();
            }
        }
    }

    public final void A1(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z10) {
        this.X1 = tL_premium_boostsStatus;
        this.f58728a2 = z10;
        H1();
    }

    public final void B1(g3 g3Var) {
        this.Y1 = g3Var;
        F1();
        G1();
    }

    public final void C1(long j3) {
        this.W1 = j3;
        H1();
    }

    public final void D1(TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        boolean z10;
        this.K2 = chat;
        this.R2 = str;
        if (TextUtils.isEmpty(str) && !v3.y(3, chat)) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.U1 = z10;
        this.f58750x2 = new ArrayList(arrayList);
        this.f58751y2 = arrayList2;
        this.f58752z2 = arrayList3;
        HashSet hashSet = this.f58747u2;
        hashSet.clear();
        if (this.U1) {
            ArrayList arrayList4 = this.f58750x2;
            int size = arrayList4.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList4.get(i7);
                i7++;
                TLRPC.User user = (TLRPC.User) obj;
                if (arrayList2 == null || !arrayList2.contains(Long.valueOf(user.f28554id))) {
                    hashSet.add(user);
                }
            }
        }
        H1();
        F1();
        int i10 = this.d2;
        if ((i10 == 11 || i10 == 34) && !mp.u1(this.f30189a).K3()) {
            if (((arrayList3 != null && !arrayList3.isEmpty()) || (arrayList2 != null && arrayList2.size() >= this.f58750x2.size())) && arrayList3 != null && arrayList2 != null) {
                if ((arrayList3.size() == 1 && arrayList2.size() == 1) || arrayList2.size() >= arrayList3.size()) {
                    b0 b0Var = this.A2;
                    if (b0Var != null && b0Var.getParent() != null) {
                        ((ViewGroup) this.A2.getParent()).removeView(this.A2);
                    }
                    uv uvVar = this.H2;
                    if (uvVar != null && uvVar.getParent() != null) {
                        ((ViewGroup) this.H2.getParent()).removeView(this.H2);
                    }
                    ck0 ck0Var = this.f39534o1;
                    if (ck0Var != null) {
                        ck0Var.setPadding(0, 0, 0, 0);
                    }
                }
            }
        }
    }

    public final void E1() {
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
        this.f58743q2 = new ArrayList();
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X1;
        if (tL_premium_boostsStatus != null) {
            i7 = tL_premium_boostsStatus.level + 1;
        } else {
            i7 = 1;
        }
        if (this.d2 == 31) {
            i7 = 1;
        }
        mp u12 = mp.u1(this.f30189a);
        cp cpVar = u12.f25769t4;
        if (cpVar != null) {
            i10 = cpVar.e(s1());
        } else {
            i10 = 0;
        }
        int max2 = Math.max(10, i10);
        cp cpVar2 = u12.f25777u4;
        if (cpVar2 != null) {
            i11 = cpVar2.e(s1());
        } else {
            i11 = 0;
        }
        int max3 = Math.max(max2, i11);
        if (s1()) {
            max = Math.max(Math.max(Math.max(Math.max(Math.max(max3, u12.D5), u12.B5), u12.C5), u12.f25826z5), u12.f25817y5);
        } else {
            max = Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(max3, u12.f25770t5), u12.f25778u5), u12.f25787v5), u12.f25797w5), u12.f25807x5), u12.C4), u12.D4);
        }
        ArrayList arrayList = null;
        while (i7 <= max) {
            boolean s12 = s1();
            ArrayList arrayList2 = new ArrayList();
            mp u13 = mp.u1(this.f30189a);
            if (!s12 && i7 >= u13.D4) {
                arrayList2.add(g0.a(2131231820, 2131753658));
            }
            g0 b10 = g0.b(2131231817, i7, "BoostFeatureStoriesPerDay");
            b10.f58662f = true;
            arrayList2.add(b10);
            if (!s12) {
                g0 b11 = g0.b(2131231812, i7, "BoostFeatureCustomReaction");
                b11.f58662f = true;
                arrayList2.add(b11);
            }
            cp cpVar3 = u13.f25769t4;
            if (cpVar3 != null) {
                i12 = cpVar3.a(i7, false);
            } else {
                i12 = 0;
            }
            cp cpVar4 = u13.f25777u4;
            if (cpVar4 != null) {
                i13 = cpVar4.a(i7, s12);
            } else {
                i13 = 0;
            }
            if (!s12 && i12 > 0) {
                arrayList2.add(g0.b(2131231798, 7, "BoostFeatureNameColor"));
            }
            if (!s12 && i12 > 0) {
                arrayList2.add(g0.b(2131231806, i12, "BoostFeatureReplyColor"));
            }
            if (!s12 && i7 >= u13.f25770t5) {
                arrayList2.add(g0.a(2131231807, 2131753631));
            }
            if (i13 > 0) {
                if (s12) {
                    str2 = "BoostFeatureProfileColorGroup";
                } else {
                    str2 = "BoostFeatureProfileColor";
                }
                arrayList2.add(g0.b(2131231799, i13, str2));
            }
            if (s12 && i7 >= u13.A5) {
                arrayList2.add(g0.a(2131231809, 2131753649));
            }
            if ((!s12 && i7 >= u13.f25778u5) || (s12 && i7 >= u13.f25817y5)) {
                if (s12) {
                    i15 = 2131753635;
                } else {
                    i15 = 2131753636;
                }
                arrayList2.add(g0.a(2131231800, i15));
            }
            if (s12 && i7 >= u13.D5) {
                arrayList2.add(g0.a(2131231823, 2131753626));
            }
            if ((!s12 && i7 >= u13.f25787v5) || (s12 && i7 >= u13.f25826z5)) {
                arrayList2.add(new g0(2131231816, 2131753645, -1, "1000+", null));
            }
            if ((!s12 && i7 >= u13.f25797w5) || (s12 && i7 >= u13.B5)) {
                if (s12) {
                    str = "BoostFeatureBackgroundGroup";
                } else {
                    str = "BoostFeatureBackground";
                }
                arrayList2.add(g0.b(2131231824, 8, str));
            }
            if ((!s12 && i7 >= u13.f25807x5) || (s12 && i7 >= u13.C5)) {
                if (s12) {
                    i14 = 2131753650;
                } else {
                    i14 = 2131753651;
                }
                arrayList2.add(g0.a(2131231802, i14));
            }
            if (!s12 && i7 >= u13.C4) {
                arrayList2.add(g0.a(2131231808, 2131753627));
            }
            Collections.reverse(arrayList2);
            if (arrayList != null && arrayList.size() == arrayList2.size()) {
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    g0 g0Var = (g0) arrayList.get(i16);
                    g0 g0Var2 = (g0) arrayList2.get(i16);
                    int i17 = g0Var.f58661e;
                    if (g0Var2 != null && ((g0Var.f58662f && i17 > 2) || (g0Var.f58658a == g0Var2.f58658a && g0Var.f58659b == g0Var2.f58659b && TextUtils.equals(g0Var.f58660c, g0Var2.f58660c) && TextUtils.equals(g0Var.d, g0Var2.d) && i17 == g0Var2.f58661e))) {
                    }
                }
                i7++;
            }
            ArrayList arrayList3 = this.f58743q2;
            arrayList3.add(new f0(i7, arrayList3.isEmpty()));
            this.f58743q2.addAll(arrayList2);
            arrayList = arrayList2;
            i7++;
        }
    }

    public final void F1() {
        int i7;
        String str = null;
        if (this.f58732f2) {
            this.A2.c(gd.M0(2131748938, null), false, false);
            return;
        }
        int i10 = this.d2;
        if (i10 != 19 && i10 != 32 && !t1()) {
            HashSet hashSet = this.f58747u2;
            if (i10 != 11 && i10 != 34) {
                if (hashSet.size() > 0) {
                    if (i10 == 2) {
                        str = gd.G(hashSet.size(), "RevokeLinks", new Object[0]);
                    } else if (i10 == 5) {
                        str = gd.G(hashSet.size(), "LeaveCommunities", new Object[0]);
                    }
                    this.A2.c(str, true, true);
                    return;
                }
                b0 b0Var = this.A2;
                b0Var.f58865r = false;
                b0Var.d(true);
                return;
            }
            b0 b0Var2 = this.A2;
            if (b0Var2.J == null) {
                rq rqVar = new rq(b0Var2.getContext(), null);
                b0Var2.J = rqVar;
                rqVar.setGravity(3);
                rq rqVar2 = b0Var2.J;
                int i11 = n6.Fi;
                int i12 = n6.Ji;
                qq qqVar = rqVar2.f39274a;
                qqVar.v = i11;
                qqVar.f38882w = i12;
                qqVar.f38864b = 0.8f;
                b0Var2.setClipChildren(false);
                b0Var2.addView(b0Var2.J, ma.e(-1, 24, 16));
            }
            if (!this.U1) {
                this.A2.c(gd.M0(2131752030, null), true, true);
            } else if (hashSet.size() > 0) {
                this.A2.c(gd.M0(2131745424, null), true, true);
            } else {
                this.A2.c(gd.M0(2131754555, null), true, true);
            }
            this.A2.J.f39274a.c(hashSet.size(), true);
            this.A2.invalidate();
            return;
        }
        g3 g3Var = this.Y1;
        boolean z10 = g3Var.f24155a;
        if ((z10 || g3Var.f24156b) && !g3Var.f24164l && !g3Var.d) {
            if (g3Var.f24165m) {
                this.A2.c(gd.M0(2131747638, null), true, true);
                return;
            }
            b0 b0Var3 = this.A2;
            b0Var3.f58865r = false;
            b0Var3.d(true);
            return;
        }
        hi.d dVar = this.O2;
        if (z10) {
            if (wg.s.i()) {
                this.A2.c(gd.M0(2131753589, null), true, true);
            } else {
                b0 b0Var4 = this.A2;
                if (s1()) {
                    i7 = 2131753623;
                } else {
                    i7 = 2131753661;
                }
                b0Var4.c(gd.M0(i7, null), true, true);
            }
            this.C2.i(gd.M0(2131753662, null), true, true);
            if (dVar != null) {
                dVar.i(gd.M0(2131753623, null), true, true);
            }
        } else if (g3Var.f24165m) {
            this.C2.i(gd.M0(2131747638, null), true, true);
            if (dVar != null) {
                dVar.i(gd.M0(2131747638, null), true, true);
            }
            this.A2.c(gd.M0(2131747638, null), true, true);
        } else if (wg.s.i()) {
            if (dVar != null) {
                dVar.i(gd.M0(2131753623, null), true, true);
            }
            this.C2.i(gd.M0(2131753662, null), true, true);
            this.A2.c(gd.M0(2131753589, null), true, true);
        } else {
            if (dVar != null) {
                dVar.i(gd.M0(2131747638, null), true, true);
            }
            this.C2.i(gd.M0(2131747638, null), true, true);
            this.A2.c(gd.M0(2131747638, null), true, true);
        }
    }

    public final void G1() {
        String M0;
        if (this.f58732f2) {
            this.A2.c(gd.M0(2131748938, null), false, false);
            return;
        }
        int i7 = this.d2;
        if (i7 != 19 && i7 != 32 && !t1()) {
            if (i7 != 18 && i7 != 20 && i7 != 24 && i7 != 25 && i7 != 26 && i7 != 29 && i7 != 22 && i7 != 23 && i7 != 21 && i7 != 27 && i7 != 28 && i7 != 30 && i7 != 35) {
                if (!j10.i(this.f30189a).q() && !mp.u1(this.f30189a).K3() && !this.J2) {
                    this.A2.f58863f.setText(gd.M0(2131749007, null));
                    androidx.emoji2.text.q qVar = this.I2;
                    if (qVar != null) {
                        int i10 = qVar.f2267b;
                        int i11 = i10 + 1;
                        int i12 = qVar.f2268c;
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
                        b0 b0Var = this.A2;
                        b0Var.E.f41059p = null;
                        b0Var.G.setVisibility(8);
                        return;
                    }
                    b0 b0Var2 = this.A2;
                    b0Var2.E.f41059p = null;
                    b0Var2.G.setVisibility(8);
                    return;
                }
                this.A2.f58863f.setText(gd.M0(2131747638, null));
                b0 b0Var3 = this.A2;
                b0Var3.E.f41059p = null;
                b0Var3.G.setVisibility(8);
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
            spannableStringBuilder.setSpan(new lq(2131232106, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) gd.M0(2131751751, null));
            this.A2.f58863f.setText(spannableStringBuilder);
            return;
        }
        int i13 = 2131753661;
        if (wg.s.i()) {
            r0 r0Var = this.A2.f58863f;
            g3 g3Var = this.Y1;
            if (g3Var != null && g3Var.d) {
                M0 = gd.M0(2131753589, null);
            } else {
                if (s1()) {
                    i13 = 2131753623;
                }
                M0 = gd.M0(i13, null);
            }
            r0Var.setText(M0);
            g3 g3Var2 = this.Y1;
            if (g3Var2 != null && g3Var2.f24165m) {
                this.A2.f58863f.setText(gd.M0(2131747638, null));
                return;
            }
            return;
        }
        r0 r0Var2 = this.A2.f58863f;
        if (s1()) {
            i13 = 2131753623;
        }
        r0Var2.setText(gd.M0(i13, null));
    }

    public final void H1() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        this.f58735i2 = -1;
        this.f58737k2 = -1;
        this.f58738l2 = -1;
        this.f58739m2 = -1;
        this.V1 = -1;
        this.f58740n2 = -1;
        this.f58742p2 = -1;
        this.f58733g2 = 1;
        this.f58734h2 = 0;
        int i7 = this.d2;
        if (i7 != 19 && i7 != 18 && i7 != 20 && i7 != 24 && i7 != 27 && i7 != 28 && i7 != 22 && i7 != 23 && i7 != 25 && i7 != 26 && i7 != 29 && i7 != 21 && i7 != 30 && i7 != 35) {
            if (i7 != 31 && i7 != 32) {
                if (!q1(i7)) {
                    if (i7 != 11 && i7 != 34) {
                        int i10 = this.f58733g2;
                        this.f58735i2 = i10;
                        this.f58733g2 = i10 + 2;
                        this.f58736j2 = i10 + 1;
                    } else {
                        this.f39541v1 = 0.24f;
                    }
                    if (this.E2) {
                        int i11 = this.f58733g2;
                        this.f58733g2 = i11 + 1;
                        this.f58739m2 = i11;
                    } else if (i7 != 11 || this.U1) {
                        if (i7 != 11 || mp.u1(this.f30189a).K3() || ((((arrayList = this.f58752z2) == null || arrayList.isEmpty()) && ((arrayList2 = this.f58751y2) == null || arrayList2.size() < this.f58750x2.size())) || (arrayList3 = this.f58752z2) == null || arrayList3.size() != 1 || (arrayList4 = this.f58751y2) == null || arrayList4.size() != 1 || !this.U1)) {
                            int i12 = this.f58733g2;
                            this.f58737k2 = i12;
                            if (i7 != 11 && i7 != 34) {
                                if (i7 == 5) {
                                    this.f58733g2 = this.f58748v2.size() + i12;
                                } else {
                                    this.f58733g2 = this.f58731e2.size() + i12;
                                }
                            } else {
                                this.f58733g2 = this.f58750x2.size() + i12;
                            }
                            this.f58738l2 = this.f58733g2;
                        }
                        if (this.f58738l2 - this.f58737k2 > 1) {
                            int i13 = this.f58733g2;
                            this.f58733g2 = i13 + 1;
                            this.f58740n2 = i13;
                        }
                    }
                }
            } else {
                this.f39541v1 = 0.24f;
                E1();
                int i14 = this.f58733g2;
                this.f58737k2 = i14;
                int i15 = i14 + 1;
                this.f58733g2 = i15;
                this.f58742p2 = i14;
                int size = (this.f58743q2.size() - 1) + i15;
                this.f58733g2 = size;
                this.f58738l2 = size;
            }
        } else {
            if (i7 != 19 || v3.N(o1())) {
                this.f39541v1 = 0.24f;
                int i16 = this.f58733g2;
                this.f58733g2 = i16 + 1;
                this.V1 = i16;
                if (mp.u1(this.f30189a).f25761s4) {
                    int i17 = this.f58733g2;
                    this.f58733g2 = i17 + 1;
                    this.f58741o2 = i17;
                }
            }
            E1();
            int i18 = this.f58733g2;
            int i19 = i18 + 1;
            this.f58733g2 = i19;
            this.f58742p2 = i18;
            this.f58733g2 = (this.f58743q2.size() - 1) + i19;
        }
        this.f39534o1.getAdapter().f();
    }

    @Override
    public final bk0 M0(ck0 ck0Var) {
        return new e0(this);
    }

    @Override
    public final CharSequence P0() {
        int i7 = this.d2;
        if (i7 != 11) {
            if (i7 != 34) {
                if (i7 != 35) {
                    int i10 = 2131753623;
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
                            return gd.M0(2131743637, null);
                        case 19:
                        case 30:
                            if (!s1()) {
                                i10 = 2131753661;
                            }
                            return gd.M0(i10, null);
                        case 31:
                            return gd.M0(2131753598, null);
                        case 32:
                            return gd.M0(2131753623, null);
                        default:
                            return gd.M0(2131748786, null);
                    }
                }
                return gd.M0(2131743637, null);
            }
            return gd.M0(2131752611, null);
        }
        return gd.M0(2131752390, null);
    }

    @Override
    public final void V0(au0 au0Var) {
        int i7;
        Context context = au0Var.getContext();
        hi.d dVar = new hi.d(context, this.J0, true);
        this.C2 = dVar;
        dVar.setFlickeringLoading(true);
        this.C2.i(gd.M0(2131753662, null), false, true);
        this.C2.setOnClickListener(new t(this, 2));
        b0 b0Var = new b0(this, context, this.J0);
        this.A2 = b0Var;
        ra.b(b0Var, 0.02f, 1.2f);
        if (!this.f39539t1 && (i7 = this.d2) != 18 && i7 != 20 && i7 != 24 && i7 != 25 && i7 != 26 && i7 != 29 && i7 != 22 && i7 != 23 && i7 != 21 && i7 != 27 && i7 != 28 && i7 != 30 && i7 != 35) {
            uv uvVar = new uv(14, context, this);
            this.H2 = uvVar;
            u6.h(n6.f29469h5, uvVar, this.J0);
            au0Var.addView(this.H2, ma.d(-1, 72.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        b0 b0Var2 = this.A2;
        float f10 = (this.f30227u0 / org.telegram.messenger.g0.f24120p) + 16.0f;
        au0Var.addView(b0Var2, ma.d(-1, 48.0f, 80, f10, 0.0f, f10, 12.0f));
        int L = org.telegram.messenger.g0.L(72.0f);
        ck0 ck0Var = this.f39534o1;
        ck0Var.setPadding(0, 0, 0, L);
        ck0Var.setClipToPadding(false);
        ck0Var.setClipChildren(false);
        ck0Var.setOnItemClickListener(new i8(this, 22));
        ck0Var.setOnItemLongClickListener(new w(this, 2));
        this.A2.f58867w.setOnClickListener(new a0(0, this, context));
        this.A2.h.setOnClickListener(new t(this, 3));
        this.F2 = new fj0(ck0Var, true);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        boolean z10;
        TLRPC.ChatFull P0;
        h2 h2Var;
        h2 h2Var2;
        if (i7 == ks.X2) {
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            h2 h2Var3 = this.f39538s1;
            h2 lastFragment = h2Var3.getParentLayout().getLastFragment();
            h2 h2Var4 = null;
            if (lastFragment instanceof ch.p) {
                List fragmentStack = h2Var3.getParentLayout().getFragmentStack();
                if (fragmentStack.size() >= 2) {
                    h2Var = (h2) p5.c.h(2, fragmentStack);
                } else {
                    h2Var = null;
                }
                if (fragmentStack.size() >= 3) {
                    h2Var2 = (h2) p5.c.h(3, fragmentStack);
                } else {
                    h2Var2 = null;
                }
                if (fragmentStack.size() >= 4) {
                    h2Var4 = (h2) p5.c.h(4, fragmentStack);
                }
                if (h2Var instanceof rn) {
                    ((ActionBarLayout) h2Var3.getParentLayout()).d0(h2Var, false);
                }
                dismiss();
                if (booleanValue) {
                    if (h2Var2 instanceof ProfileActivity) {
                        ((ActionBarLayout) h2Var3.getParentLayout()).d0(h2Var2, false);
                    }
                    lastFragment.finishFragment();
                    wg.h.f(h2Var4, chat, true);
                    return;
                }
                lastFragment.finishFragment();
                wg.h.f(h2Var2, chat, false);
            } else if ((lastFragment instanceof bn) && booleanValue) {
                wg.h.f(lastFragment, chat, true);
            } else if ((lastFragment instanceof qc) && booleanValue) {
                List fragmentStack2 = h2Var3.getParentLayout().getFragmentStack();
                ArrayList arrayList = new ArrayList();
                for (int size = fragmentStack2.size() - 2; size >= 0; size--) {
                    h2 h2Var5 = (h2) fragmentStack2.get(size);
                    if (!(h2Var5 instanceof bn) && !(h2Var5 instanceof cx)) {
                        arrayList.add(h2Var5);
                    } else {
                        h2Var4 = h2Var5;
                        break;
                    }
                }
                if (h2Var4 != null) {
                    int size2 = arrayList.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        ((ActionBarLayout) h2Var3.getParentLayout()).d0((h2) obj, false);
                    }
                    h2Var3.finishFragment();
                    dismiss();
                    wg.h.f(h2Var4, chat, true);
                }
            } else if (booleanValue) {
                ta taVar = ta.G2;
                if (taVar != null && taVar.d) {
                    bn ua2 = bn.ua(-chat.f28405id);
                    LaunchActivity.Q().presentFragment(ua2, false, false);
                    ta.w();
                    dismiss();
                    wg.h.f(ua2, chat, true);
                    return;
                }
                List fragmentStack3 = h2Var3.getParentLayout().getFragmentStack();
                if (fragmentStack3.size() >= 2) {
                    h2Var4 = (h2) p5.c.h(2, fragmentStack3);
                }
                h2Var3.finishFragment();
                dismiss();
                if (h2Var4 instanceof bn) {
                    wg.h.f(h2Var4, chat, true);
                }
            } else {
                ta taVar2 = ta.G2;
                if (taVar2 != null && taVar2.d) {
                    bn ua3 = bn.ua(-chat.f28405id);
                    LaunchActivity.Q().presentFragment(ua3, false, false);
                    ta.w();
                    dismiss();
                    wg.h.f(ua3, chat, false);
                    return;
                }
                dismiss();
                wg.h.f(LaunchActivity.Q(), chat, false);
            }
        } else if (i7 == ks.W2) {
            TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) objArr[0];
            int intValue = ((Integer) objArr[1]).intValue();
            int intValue2 = ((Integer) objArr[2]).intValue();
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) objArr[3];
            if (tL_premium_boostsStatus != null && this.Y1 != null) {
                this.X1.boosts += intValue;
                if (this.d2 == 32 && (P0 = mp.u1(this.f30189a).P0(-this.W1)) != null) {
                    P0.boosts_applied += intValue;
                }
                u1();
                A1(tL_premium_boostsStatus, this.f58728a2);
                g3 g3Var = this.Y1;
                if (this.X1.next_level_boosts <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                g3Var.f24165m = z10;
                g3Var.f24164l = true;
                g3Var.a(tL_premium_myBoosts);
                if (w1()) {
                    gc Q = new lc(this.f30195c, this.J0).Q(2131624051, 30, gd.G(intValue, "BoostingReassignedFromPlural", gd.G(intValue2, "BoostingFromOtherChannel", new Object[0])));
                    Q.f35461j = 4000;
                    Q.k(true);
                }
            }
        } else if (i7 == ks.V2) {
            dismiss();
        }
    }

    public final void i1(final n80 n80Var, boolean z10) {
        if (n80Var.a() && !z10) {
            return;
        }
        n80Var.setLoading(true);
        mp.u1(this.f30189a).I0();
        wg.s.a(-this.W1, Arrays.asList(Integer.valueOf(this.Y1.f24160g)), new x10(this) {
            public final l0 f58947b;

            {
                this.f58947b = this;
            }

            @Override
            public final void a(Object obj) {
                switch (r3) {
                    case 0:
                        l0 l0Var = this.f58947b;
                        mp.u1(l0Var.f30189a).I0().a(l0Var.W1, new bi.j(l0Var, n80Var, (TL_stories.TL_premium_myBoosts) obj, 16));
                        return;
                    default:
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                        boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                        n80 n80Var2 = n80Var;
                        if (startsWith) {
                            int intValue = Utilities.z(tL_error.text).intValue();
                            if (intValue <= 5) {
                                org.telegram.messenger.g0.h3(new p4.o0(20, this.f58947b, n80Var2), intValue * 1000);
                                return;
                            }
                            wg.h.g(intValue);
                        }
                        n80Var2.setLoading(false);
                        return;
                }
            }
        }, new x10(this) {
            public final l0 f58947b;

            {
                this.f58947b = this;
            }

            @Override
            public final void a(Object obj) {
                switch (r3) {
                    case 0:
                        l0 l0Var = this.f58947b;
                        mp.u1(l0Var.f30189a).I0().a(l0Var.W1, new bi.j(l0Var, n80Var, (TL_stories.TL_premium_myBoosts) obj, 16));
                        return;
                    default:
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                        boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                        n80 n80Var2 = n80Var;
                        if (startsWith) {
                            int intValue = Utilities.z(tL_error.text).intValue();
                            if (intValue <= 5) {
                                org.telegram.messenger.g0.h3(new p4.o0(20, this.f58947b, n80Var2), intValue * 1000);
                                return;
                            }
                            wg.h.g(intValue);
                        }
                        n80Var2.setLoading(false);
                        return;
                }
            }
        });
    }

    public final void j1() {
        if (this.C2.isAttachedToWindow()) {
            i1(this.C2, false);
            return;
        }
        hi.d dVar = this.O2;
        if (dVar != null && dVar.isAttachedToWindow()) {
            i1(dVar, false);
        } else {
            i1(this.A2, false);
        }
    }

    public int k1() {
        return 0;
    }

    public final String l1() {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X1;
        if (tL_premium_boostsStatus != null && !TextUtils.isEmpty(tL_premium_boostsStatus.boost_url)) {
            return this.X1.boost_url;
        }
        int i7 = this.f30189a;
        long j3 = -this.W1;
        TLRPC.Chat O0 = mp.u1(i7).O0(Long.valueOf(j3));
        if (!TextUtils.isEmpty(v3.K(O0, false))) {
            return "https://t.me/boost/" + v3.K(O0, false);
        }
        return a8.p0.o(j3, "https://t.me/boost/?c=");
    }

    public final String m1(boolean z10) {
        String str;
        boolean z11;
        int i7;
        int i10;
        String str2;
        if (this.d2 == 32) {
            TLRPC.Chat o12 = o1();
            TLRPC.ChatFull P0 = mp.u1(this.f30189a).P0(-this.W1);
            int max = Math.max(P0.boosts_unrestrict - P0.boosts_applied, 0);
            if (o12 == null) {
                str2 = "";
            } else {
                str2 = o12.title;
            }
            return gd.G(max, "BoostingRemoveRestrictionsSubtitle", str2);
        }
        TLRPC.Chat O0 = mp.u1(this.f30189a).O0(Long.valueOf(-this.W1));
        if (O0 == null) {
            if (s1()) {
                i10 = 2131754876;
            } else {
                i10 = 2131754904;
            }
            str = gd.M0(i10, null);
        } else {
            str = O0.title;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X1;
        if (tL_premium_boostsStatus.boosts == tL_premium_boostsStatus.current_level_boosts) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i11 = 2131752341;
        if (t1() && this.X1.next_level_boosts != 0 && z10) {
            if (s1()) {
                i11 = 2131749228;
            }
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.X1;
            int i12 = tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts;
            return gd.a0(null, null, i11, str, gd.G(i12, "MoreBoosts", Integer.valueOf(i12)));
        }
        int i13 = 2131752438;
        if (z11 && this.Y1.d) {
            if (this.X1.level == 1) {
                if (s1()) {
                    i7 = 2131749301;
                } else {
                    i7 = 2131752439;
                }
                return gd.a0(null, null, i7, new Object[0]);
            }
            if (s1()) {
                i13 = 2131749300;
            }
            return gd.a0(null, null, i13, Integer.valueOf(this.X1.level), gd.G(this.X1.level, "BoostStories", new Object[0]));
        } else if (this.Y1.d) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus3 = this.X1;
            if (tL_premium_boostsStatus3.level == 0) {
                if (s1()) {
                    i11 = 2131749228;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus4 = this.X1;
                int i14 = tL_premium_boostsStatus4.next_level_boosts - tL_premium_boostsStatus4.boosts;
                return gd.a0(null, null, i11, str, gd.G(i14, "MoreBoosts", Integer.valueOf(i14)));
            } else if (tL_premium_boostsStatus3.next_level_boosts == 0) {
                if (s1()) {
                    i13 = 2131749300;
                }
                return gd.a0(null, null, i13, Integer.valueOf(this.X1.level), gd.G(this.X1.level + 1, "BoostStories", new Object[0]));
            } else {
                if (s1()) {
                    i11 = 2131749228;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus5 = this.X1;
                int i15 = tL_premium_boostsStatus5.next_level_boosts - tL_premium_boostsStatus5.boosts;
                return gd.a0(null, null, i11, str, gd.G(i15, "MoreBoosts", Integer.valueOf(i15)));
            }
        } else {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus6 = this.X1;
            if (tL_premium_boostsStatus6.level == 0) {
                if (s1()) {
                    i11 = 2131749228;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus7 = this.X1;
                int i16 = tL_premium_boostsStatus7.next_level_boosts - tL_premium_boostsStatus7.boosts;
                return gd.a0(null, null, i11, str, gd.G(i16, "MoreBoosts", Integer.valueOf(i16)));
            } else if (tL_premium_boostsStatus6.next_level_boosts == 0) {
                if (s1()) {
                    i13 = 2131749300;
                }
                return gd.a0(null, null, i13, Integer.valueOf(this.X1.level), gd.G(this.X1.level + 1, "BoostStories", new Object[0]));
            } else {
                if (s1()) {
                    i11 = 2131749228;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus8 = this.X1;
                int i17 = tL_premium_boostsStatus8.next_level_boosts - tL_premium_boostsStatus8.boosts;
                return gd.a0(null, null, i11, str, gd.G(i17, "MoreBoosts", Integer.valueOf(i17)));
            }
        }
    }

    public final String n1() {
        int i7;
        int i10;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X1;
        if (tL_premium_boostsStatus.next_level_boosts == 0) {
            return gd.a0("BoostsMaxLevelReached", null, 2131753156, new Object[0]);
        }
        int i11 = 2131753661;
        if (tL_premium_boostsStatus.level > 0 && !this.Y1.d) {
            if (s1()) {
                i11 = 2131753623;
            }
            return gd.M0(i11, null);
        }
        boolean z10 = this.f58728a2;
        int i12 = this.d2;
        if (z10) {
            if (i12 == 32) {
                if (s1()) {
                    i11 = 2131753623;
                }
                return gd.M0(i11, null);
            }
            TLRPC.Chat O0 = mp.u1(this.f30189a).O0(Long.valueOf(-this.W1));
            if (this.Y1.d) {
                return gd.a0("YouBoostedChannel2", null, 2131742582, O0.title);
            }
            if (s1()) {
                i11 = 2131753623;
            }
            return gd.M0(i11, null);
        } else if (i12 == 32) {
            if (s1()) {
                i11 = 2131753623;
            }
            return gd.M0(i11, null);
        } else if (this.Y1.d) {
            if (s1()) {
                i10 = 2131742581;
            } else {
                i10 = 2131742583;
            }
            return gd.M0(i10, null);
        } else {
            if (s1()) {
                i7 = 2131753525;
            } else {
                i7 = 2131753526;
            }
            return gd.M0(i7, null);
        }
    }

    public final TLRPC.Chat o1() {
        return mp.u1(this.f30189a).O0(Long.valueOf(-this.W1));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ks.f(this.f30189a).c(this, ks.X2);
        ks.f(this.f30189a).c(this, ks.W2);
        ks.f(this.f30189a).c(this, ks.V2);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.f(this.f30189a).n(this, ks.X2);
        ks.f(this.f30189a).n(this, ks.W2);
        ks.f(this.f30189a).n(this, ks.V2);
    }

    public final boolean r1() {
        int i7 = this.d2;
        if (i7 != 19 && i7 != 18 && i7 != 20 && i7 != 24 && i7 != 25 && i7 != 26 && i7 != 29 && i7 != 22 && i7 != 27 && i7 != 28 && i7 != 23 && i7 != 30 && i7 != 35) {
            return false;
        }
        return true;
    }

    @Override
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.G0 < 0 && this.H0 == this.P2 && (w02 = n6.w0(n6.f29469h5, this.J0)) != this.H0) {
                this.H0 = w02;
                this.P2 = w02;
                E0(w02);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final boolean s1() {
        return !v3.V(mp.u1(this.f30189a).O0(Long.valueOf(-this.W1)));
    }

    public final boolean t1() {
        if (r1() && v3.N(o1())) {
            return true;
        }
        return false;
    }

    public final void u1() {
        int i7;
        j0 j0Var = this.f58746t2;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X1;
        int i10 = tL_premium_boostsStatus.boosts;
        int i11 = tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.current_level_boosts;
        j0Var.f33026b++;
        j0Var.f33024a = l9.a((i10 - i7) / i11, 0.0f, 1.0f);
        j0Var.f33025a0 = true;
        j0Var.f33027b0 = j0Var.f33041n;
        j0Var.i(i10, true);
        j0Var.J.requestLayout();
        j0Var.requestLayout();
    }

    public final boolean w1() {
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
        ks f10 = ks.f(this.f30189a);
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X1;
        g3 g3Var = this.Y1;
        g3Var.getClass();
        g3 g3Var2 = new g3();
        g3Var2.f24155a = g3Var.f24155a;
        g3Var2.f24156b = g3Var.f24156b;
        g3Var2.f24157c = g3Var.f24157c;
        g3Var2.d = g3Var.d;
        g3Var2.f24158e = g3Var.f24158e;
        g3Var2.f24160g = g3Var.f24160g;
        g3Var2.h = g3Var.h;
        g3Var2.f24161i = g3Var.f24161i;
        g3Var2.f24162j = g3Var.f24162j;
        g3Var2.f24163k = g3Var.f24163k;
        g3Var2.f24165m = g3Var.f24165m;
        f10.m(ks.f25183r3, tL_premium_boostsStatus, g3Var2, Long.valueOf(this.W1));
        hi.d dVar = this.O2;
        if (dVar != null) {
            TLRPC.ChatFull P0 = mp.u1(this.f30189a).P0(-this.W1);
            int max = Math.max(P0.boosts_unrestrict - P0.boosts_applied, 0);
            if (max == 0) {
                ks.f(this.f30189a).m(ks.f25176q3, new Object[0]);
                dismiss();
                return false;
            }
            dVar.c(max, true);
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new org.telegram.ui.ActionBar.j0(5));
        transitionSet.setOrdering(0);
        TransitionManager.beginDelayedTransition(this.Z1, transitionSet);
        k0 k0Var = this.Z1;
        wg.b bVar = k0Var.f58724c;
        int indexOfChild = k0Var.indexOfChild(k0Var.f58723b);
        l0 l0Var = k0Var.f58725e;
        if (l0Var.f58728a2) {
            int indexOfChild2 = k0Var.indexOfChild(k0Var.d);
            k0Var.removeView(k0Var.d);
            k0Var.d.removeView(k0Var.f58722a);
            k0Var.d.removeView(bVar);
            LinearLayout linearLayout = new LinearLayout(k0Var.getContext());
            k0Var.d = linearLayout;
            linearLayout.setOrientation(0);
            k0Var.d.setWeightSum(1.0f);
            k0Var.d.addView(k0Var.f58722a, ma.p(-2, -2, 1.0f, 0));
            k0Var.d.addView(bVar, ma.t(-2, -2, 48, 0, 2, 0, 0));
            k0Var.addView(k0Var.d, indexOfChild2, ma.t(-2, -2, 1, 25, 22, 12, 9));
        } else {
            int indexOfChild3 = k0Var.indexOfChild(k0Var.f58722a);
            k0Var.removeView(k0Var.f58722a);
            TextView textView = new TextView(k0Var.getContext());
            k0Var.f58722a = textView;
            textView.setTypeface(org.telegram.messenger.g0.o());
            k0Var.f58722a.setTextSize(1, 20.0f);
            u6.U(k0Var.f58722a, n6.G6, l0Var.J0);
            k0Var.f58722a.setGravity(17);
            k0Var.addView(k0Var.f58722a, indexOfChild3, ma.t(-2, -2, 1, 0, 22, 0, 0));
        }
        k0Var.removeView(k0Var.f58723b);
        TextView textView2 = new TextView(k0Var.getContext());
        k0Var.f58723b = textView2;
        textView2.setTextSize(1, 14.0f);
        TextView textView3 = k0Var.f58723b;
        textView3.setLineSpacing(textView3.getLineSpacingExtra(), k0Var.f58723b.getLineSpacingMultiplier() * 1.1f);
        k0Var.f58723b.setGravity(1);
        u6.U(k0Var.f58723b, n6.G6, l0Var.J0);
        k0Var.addView(k0Var.f58723b, indexOfChild, ma.t(-2, -2, 1, 24, -2, 24, 17));
        this.Z1.f58722a.setText(n1());
        TextView textView4 = this.Z1.f58723b;
        mp u12 = mp.u1(this.f30189a);
        boolean s12 = s1();
        int i22 = this.d2;
        String str = null;
        if (i22 == 20) {
            if (s12) {
                i21 = 2131749226;
            } else {
                i21 = 2131752338;
            }
            str = gd.a0(null, null, i21, Integer.valueOf(k1()));
        } else if (i22 == 24) {
            if (s12) {
                i20 = 2131749222;
            } else {
                i20 = 2131752335;
            }
            str = gd.a0(null, null, i20, Integer.valueOf(k1()));
        } else if (i22 == 29) {
            str = gd.a0(null, null, 2131749225, Integer.valueOf(u12.A5));
        } else if (i22 == 30) {
            str = gd.a0(null, null, 2131752332, Integer.valueOf(u12.C4));
        } else if (i22 == 35) {
            str = gd.a0(null, null, 2131752339, Integer.valueOf(u12.D4));
        } else if (i22 == 25) {
            if (s12) {
                i18 = 2131749223;
            } else {
                i18 = 2131752336;
            }
            if (s12) {
                i19 = u12.f25826z5;
            } else {
                i19 = u12.f25787v5;
            }
            str = gd.a0(null, null, i18, Integer.valueOf(i19));
        } else if (i22 == 26) {
            if (s12) {
                i16 = 2131749218;
            } else {
                i16 = 2131752330;
            }
            if (s12) {
                i17 = u12.f25826z5;
            } else {
                i17 = u12.f25787v5;
            }
            str = gd.a0(null, null, i16, Integer.valueOf(i17));
        } else if (i22 == 27) {
            if (s12) {
                i15 = 2131749220;
            } else {
                i15 = 2131752333;
            }
            str = gd.a0(null, null, i15, Integer.valueOf(u12.f25770t5));
        } else if (i22 == 28) {
            if (s12) {
                i13 = 2131749221;
            } else {
                i13 = 2131752334;
            }
            if (s12) {
                i14 = u12.f25817y5;
            } else {
                i14 = u12.f25778u5;
            }
            str = gd.a0(null, null, i13, Integer.valueOf(i14));
        } else if (i22 == 22) {
            if (s12) {
                i11 = 2131749219;
            } else {
                i11 = 2131752331;
            }
            if (s12) {
                i12 = u12.B5;
            } else {
                i12 = u12.f25797w5;
            }
            str = gd.a0(null, null, i11, Integer.valueOf(i12));
        } else if (i22 == 23) {
            if (s12) {
                i7 = 2131749224;
            } else {
                i7 = 2131752337;
            }
            if (s12) {
                i10 = u12.C5;
            } else {
                i10 = u12.f25807x5;
            }
            str = gd.a0(null, null, i7, Integer.valueOf(i10));
        }
        if (str == null) {
            str = m1(false);
        }
        textView4.setText(org.telegram.messenger.g0.W2(str));
        F1();
        uz uzVar = this.L2;
        uzVar.c(false);
        try {
            uzVar.performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.Z1.f58724c.a(this.Y1.f24161i, true);
        this.f39534o1.y0(0);
        if (i22 == 32) {
            this.Z1.f58724c.setVisibility(8);
        }
        return true;
    }

    public final void y1(ArrayList arrayList) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.J0);
        String G = gd.G(arrayList.size(), "RevokeLinks", new Object[0]);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f28746a;
        u1Var.S = G;
        if (arrayList.size() == 1) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(0);
            if (this.f58744r2) {
                u1Var.U = org.telegram.messenger.g0.W2(gd.a0("RevokeLinkAlertChannel", null, 2131745826, mp.u1(this.f30189a).X2 + "/" + v3.K(chat, false), chat.title));
            } else {
                u1Var.U = org.telegram.messenger.g0.W2(gd.a0("RevokeLinkAlert", null, 2131745827, mp.u1(this.f30189a).X2 + "/" + v3.K(chat, false), chat.title));
            }
        } else if (this.f58744r2) {
            u1Var.U = org.telegram.messenger.g0.W2(gd.a0("RevokeLinksAlertChannel", null, 2131745823, new Object[0]));
        } else {
            u1Var.U = org.telegram.messenger.g0.W2(gd.a0("RevokeLinksAlert", null, 2131745824, new Object[0]));
        }
        alertDialog$Builder.h(gd.M0(2131752578, null), null);
        alertDialog$Builder.k(gd.M0(2131745829, null), new wc1(18, this, arrayList));
        u1Var.show();
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            u6.U(textView, n6.f29637q7, this.J0);
        }
    }

    public final void z1(HashMap hashMap) {
        String str;
        long longValue;
        ArrayList arrayList;
        HashMap hashMap2 = hashMap;
        if (!TextUtils.isEmpty(this.R2)) {
            str = this.R2;
        } else {
            TLRPC.ChatFull P0 = mp.u1(this.f30189a).P0(this.K2.f28405id);
            if (P0 == null) {
                dismiss();
                return;
            } else if (this.K2.username != null) {
                str = "@" + this.K2.username;
            } else {
                TLRPC.TL_chatInviteExported tL_chatInviteExported = P0.exported_invite;
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
        HashSet hashSet = this.f58747u2;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            TLRPC.User user = (TLRPC.User) it.next();
            long P1 = mp.u1(this.f30189a).P1(user.f28554id);
            if (P1 <= 0) {
                P1 = n5.k(mp.u1(this.f30189a).P2(user.f28554id));
            }
            if (P1 >= 0) {
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
                arrayList4.add(Long.valueOf(((TLRPC.User) obj).f28554id));
            }
            b5.Z(this.f30189a, arrayList4, 1, new z(this, 0));
            return;
        }
        Iterator it2 = hashSet.iterator();
        boolean z11 = false;
        while (it2.hasNext()) {
            TLRPC.User user2 = (TLRPC.User) it2.next();
            if (hashMap2 == null) {
                longValue = 0;
            } else {
                longValue = ((Long) hashMap2.get(Long.valueOf(user2.f28554id))).longValue();
            }
            boolean z12 = z10;
            Iterator it3 = it2;
            xy b10 = xy.b(str2, user2.f28554id, null, null, null, true, null, null, null, false, 0, 0, null, false);
            b10.Q = longValue;
            zy.C(this.f30189a).r0(b10);
            if (b10.Q > 0) {
                z11 = z12;
            }
            hashMap2 = hashMap;
            z10 = z12;
            it2 = it3;
        }
        if (!z11) {
            org.telegram.messenger.g0.g3(new v(this, 2));
        }
        dismiss();
    }
}
