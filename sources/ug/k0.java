package ug;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.n8;
import c8.m9;
import c8.na;
import c8.sa;
import hi.nb;
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
import org.telegram.messenger.i10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.n5;
import org.telegram.messenger.v3;
import org.telegram.messenger.w10;
import org.telegram.messenger.xy;
import org.telegram.messenger.zy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.m80;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.ra;
import org.telegram.ui.Components.tz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bn;
import org.telegram.ui.bx;
import org.telegram.ui.ig0;
import org.telegram.ui.qc;
import org.telegram.ui.rn;
import org.telegram.ui.tv;
import org.telegram.ui.uc1;
public class k0 extends ra implements fs {
    public static final int S2 = 0;
    public a0 A2;
    public final TextView B2;
    public hi.e C2;
    public Runnable D2;
    public boolean E2;
    public hj0 F2;
    public final g2 G2;
    public tv H2;
    public androidx.emoji2.text.q I2;
    public boolean J2;
    public TLRPC.Chat K2;
    public final tz L2;
    public Runnable M2;
    public int N2;
    public final hi.e O2;
    public int P2;
    public int Q2;
    public String R2;
    public int T1;
    public boolean U1;
    public int V1;
    public long W1;
    public TL_stories.TL_premium_boostsStatus X1;
    public g3 Y1;
    public j0 Z1;
    public boolean f58848a2;
    public boolean f58849b2;
    public org.telegram.ui.Cells.r1 f58850c2;
    public final int d2;
    public final ArrayList f58851e2;
    public boolean f58852f2;
    public int f58853g2;
    public int f58854h2;
    public int f58855i2;
    public int f58856j2;
    public int f58857k2;
    public int f58858l2;
    public int f58859m2;
    public int f58860n2;
    public int f58861o2;
    public int f58862p2;
    public ArrayList f58863q2;
    public boolean f58864r2;
    public int f58865s2;
    public i0 f58866t2;
    public final HashSet f58867u2;
    public final ArrayList f58868v2;
    public final ArrayList f58869w2;
    public ArrayList f58870x2;
    public ArrayList f58871y2;
    public ArrayList f58872z2;

    public k0(int i7, int i10, Context context, g2 g2Var, i6 i6Var) {
        super(context, g2Var, false, q1(i7), i6Var);
        this.V1 = -1;
        this.f58849b2 = false;
        this.f58851e2 = new ArrayList();
        this.f58854h2 = -1;
        this.f58855i2 = -1;
        this.f58856j2 = -1;
        this.f58857k2 = -1;
        this.f58858l2 = -1;
        this.f58859m2 = -1;
        this.f58860n2 = -1;
        this.f58861o2 = -1;
        this.f58862p2 = -1;
        this.f58865s2 = -1;
        this.f58867u2 = new HashSet();
        this.f58868v2 = new ArrayList();
        this.f58869w2 = new ArrayList();
        this.f58870x2 = new ArrayList();
        this.f58871y2 = new ArrayList();
        this.f58872z2 = new ArrayList();
        this.E2 = false;
        this.N2 = 0;
        this.Q2 = -4;
        P(n6.w0(n6.f29524h5, this.J0));
        this.P2 = this.H0;
        this.G2 = g2Var;
        this.f30223a = i10;
        this.d2 = i7;
        c1();
        H1();
        if (i7 == 2) {
            this.E2 = true;
            H1();
            ConnectionsManager.getInstance(this.f30223a).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new u(this, 0));
        } else if (i7 == 5) {
            this.E2 = true;
            H1();
            ConnectionsManager.getInstance(this.f30223a).sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new u(this, 2));
        }
        G1();
        if (i7 == 32 || r1()) {
            tz tzVar = new tz(getContext());
            this.L2 = tzVar;
            this.f30229c.addView(tzVar, na.c(-1.0f, -1));
        }
        if (i7 == 18 || i7 == 20 || i7 == 24 || i7 == 25 || i7 == 26 || i7 == 29 || i7 == 22 || i7 == 23 || i7 == 21 || i7 == 27 || i7 == 28 || i7 == 30 || i7 == 35 || i7 == 31) {
            ((ViewGroup) this.A2.getParent()).removeView(this.A2);
            tv tvVar = this.H2;
            if (tvVar != null) {
                ((ViewGroup) tvVar.getParent()).removeView(this.H2);
            }
            this.f39246o1.setPadding(0, 0, 0, 0);
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
            int i12 = n6.f29451d6;
            int o4 = i0.a.o(n6.w0(i12, i6Var), 120);
            org.telegram.ui.Cells.y k02 = n6.k0(L, L, L, L, w02, o4, o4);
            q6 M = u6.M(i11);
            q6 g10 = u6.g(i12, 120);
            textView.setBackground(k02);
            u6.j(textView, k02, M, g10, i6Var);
        }
        if (i7 == 32) {
            ((ViewGroup) this.A2.getParent()).removeView(this.A2);
            hi.e eVar = new hi.e(context, i6Var, true);
            this.O2 = eVar;
            eVar.k();
            eVar.i(gd.N0(2131753622, null), false, true);
            eVar.setOnClickListener(new t(this, 1));
            this.f30226b.addView(eVar, na.d(-1, 48.0f, 80, 16.0f, 2.0f, 16.0f, 12.0f));
            this.f30226b.post(new v(this, 3));
        }
        if (i7 != 19 && i7 != 18) {
            return;
        }
        this.f30226b.post(new v(this, 4));
    }

    public static androidx.emoji2.text.q p1(int i7, int i10) {
        ?? obj = new Object();
        obj.f2238a = 0;
        obj.d = null;
        obj.f2241e = null;
        obj.f2242f = null;
        obj.f2239b = 0;
        obj.f2240c = 0;
        if (i7 == 0) {
            obj.f2239b = mp.u1(i10).S4;
            obj.f2240c = mp.u1(i10).T4;
            obj.f2238a = 2131232206;
            obj.d = gd.a0("LimitReachedPinDialogs", null, 2131748761, Integer.valueOf(obj.f2239b), Integer.valueOf(obj.f2240c));
            obj.f2241e = gd.a0("LimitReachedPinDialogsPremium", null, 2131748759, Integer.valueOf(obj.f2240c));
            obj.f2242f = gd.a0("LimitReachedPinDialogsLocked", null, 2131748760, Integer.valueOf(obj.f2239b));
            return obj;
        } else if (i7 == 33) {
            obj.f2239b = mp.u1(i10).f25827p6;
            obj.f2240c = mp.u1(i10).f25836q6;
            obj.f2238a = 2131232206;
            obj.d = gd.a0(null, null, 2131748758, Integer.valueOf(obj.f2239b), Integer.valueOf(obj.f2240c));
            obj.f2241e = gd.a0(null, null, 2131748756, Integer.valueOf(obj.f2240c));
            obj.f2242f = gd.a0(null, null, 2131748757, Integer.valueOf(obj.f2239b));
            return obj;
        } else if (i7 == 2) {
            obj.f2239b = mp.u1(i10).U4;
            obj.f2240c = mp.u1(i10).V4;
            obj.f2238a = 2131232205;
            obj.d = gd.a0("LimitReachedPublicLinks", null, 2131748754, Integer.valueOf(obj.f2239b), Integer.valueOf(obj.f2240c));
            obj.f2241e = gd.a0("LimitReachedPublicLinksPremium", null, 2131748752, Integer.valueOf(obj.f2240c));
            obj.f2242f = gd.a0("LimitReachedPublicLinksLocked", null, 2131748753, Integer.valueOf(obj.f2239b));
            return obj;
        } else if (i7 == 12) {
            obj.f2239b = mp.u1(i10).A6;
            obj.f2240c = mp.u1(i10).B6;
            obj.f2238a = 2131232205;
            obj.d = gd.a0("LimitReachedFolderLinks", null, 2131748767, Integer.valueOf(obj.f2239b), Integer.valueOf(obj.f2240c));
            obj.f2241e = gd.a0("LimitReachedFolderLinksPremium", null, 2131748765, Integer.valueOf(obj.f2240c));
            obj.f2242f = gd.a0("LimitReachedFolderLinksLocked", null, 2131748766, Integer.valueOf(obj.f2239b));
            return obj;
        } else if (i7 == 13) {
            obj.f2239b = mp.u1(i10).C6;
            obj.f2240c = mp.u1(i10).D6;
            obj.f2238a = 2131232203;
            obj.d = gd.a0("LimitReachedSharedFolders", null, 2131748750, Integer.valueOf(obj.f2239b), Integer.valueOf(obj.f2240c));
            obj.f2241e = gd.a0("LimitReachedSharedFoldersPremium", null, 2131748748, Integer.valueOf(obj.f2240c));
            obj.f2242f = gd.a0("LimitReachedSharedFoldersLocked", null, 2131748749, Integer.valueOf(obj.f2239b));
            return obj;
        } else if (i7 == 3) {
            obj.f2239b = mp.u1(i10).O4;
            obj.f2240c = mp.u1(i10).P4;
            obj.f2238a = 2131232203;
            obj.d = gd.a0("LimitReachedFolders", null, 2131748764, Integer.valueOf(obj.f2239b), Integer.valueOf(obj.f2240c));
            obj.f2241e = gd.a0("LimitReachedFoldersPremium", null, 2131748762, Integer.valueOf(obj.f2240c));
            obj.f2242f = gd.a0("LimitReachedFoldersLocked", null, 2131748763, Integer.valueOf(obj.f2239b));
            return obj;
        } else if (i7 == 4) {
            obj.f2239b = mp.u1(i10).Q4;
            obj.f2240c = mp.u1(i10).R4;
            obj.f2238a = 2131232202;
            obj.d = gd.a0("LimitReachedChatInFolders", null, 2131748782, Integer.valueOf(obj.f2239b), Integer.valueOf(obj.f2240c));
            obj.f2241e = gd.a0("LimitReachedChatInFoldersPremium", null, 2131748780, Integer.valueOf(obj.f2240c));
            obj.f2242f = gd.a0("LimitReachedChatInFoldersLocked", null, 2131748781, Integer.valueOf(obj.f2239b));
            return obj;
        } else if (i7 == 5) {
            obj.f2239b = mp.u1(i10).G4;
            obj.f2240c = mp.u1(i10).H4;
            obj.f2238a = 2131232204;
            obj.d = gd.a0("LimitReachedCommunities", null, 2131748779, Integer.valueOf(obj.f2239b), Integer.valueOf(obj.f2240c));
            obj.f2241e = gd.a0("LimitReachedCommunitiesPremium", null, 2131748777, Integer.valueOf(obj.f2240c));
            obj.f2242f = gd.a0("LimitReachedCommunitiesLocked", null, 2131748778, Integer.valueOf(obj.f2239b));
            return obj;
        } else if (i7 == 6) {
            obj.f2239b = 100;
            obj.f2240c = 200;
            obj.f2238a = 2131232203;
            obj.d = gd.a0("LimitReachedFileSize", null, 2131748770, "2 GB", "4 GB");
            obj.f2241e = gd.a0("LimitReachedFileSizePremium", null, 2131748768, "4 GB");
            obj.f2242f = gd.a0("LimitReachedFileSizeLocked", null, 2131748769, "2 GB");
            return obj;
        } else if (i7 == 7) {
            obj.f2239b = 3;
            obj.f2240c = 4;
            obj.f2238a = 2131232201;
            obj.d = gd.a0("LimitReachedAccounts", null, 2131748784, 3, Integer.valueOf(obj.f2240c));
            obj.f2241e = gd.a0("LimitReachedAccountsPremium", null, 2131748783, Integer.valueOf(obj.f2240c));
            obj.f2242f = gd.a0("LimitReachedAccountsPremium", null, 2131748783, Integer.valueOf(obj.f2239b));
            return obj;
        } else if (i7 == 11) {
            obj.f2239b = 0;
            obj.f2240c = 0;
            obj.f2238a = 2131232205;
            obj.d = gd.a0("LimitReachedAccounts", null, 2131748784, 0, Integer.valueOf(obj.f2240c));
            obj.f2241e = "";
            obj.f2242f = "";
            return obj;
        } else if (i7 == 14) {
            obj.f2239b = mp.u1(i10).f25792l5;
            obj.f2240c = mp.u1(i10).f25800m5;
            obj.f2238a = 2131232207;
            obj.d = gd.H(',', "LimitReachedStoriesCount2First", obj.f2239b) + "\n" + gd.H(',', "LimitReachedStoriesCount2Second", obj.f2240c);
            obj.f2241e = gd.H(',', "LimitReachedStoriesCount2Premium", obj.f2240c);
            obj.f2242f = gd.H(',', "LimitReachedStoriesCount2Premium", obj.f2239b);
            return obj;
        } else if (i7 == 15) {
            obj.f2239b = mp.u1(i10).f25809n5;
            obj.f2240c = mp.u1(i10).f25817o5;
            obj.f2238a = 2131232207;
            obj.d = gd.a0("LimitReachedStoriesWeekly", null, 2131748736, Integer.valueOf(obj.f2239b), Integer.valueOf(obj.f2240c));
            obj.f2241e = gd.a0("LimitReachedStoriesWeeklyPremium", null, 2131748735, Integer.valueOf(obj.f2240c));
            obj.f2242f = gd.a0("LimitReachedStoriesWeeklyPremium", null, 2131748735, Integer.valueOf(obj.f2239b));
            return obj;
        } else if (i7 == 16) {
            obj.f2239b = mp.u1(i10).f25826p5;
            obj.f2240c = mp.u1(i10).f25835q5;
            obj.f2238a = 2131232207;
            obj.d = gd.a0("LimitReachedStoriesMonthly", null, 2131748738, Integer.valueOf(obj.f2239b), Integer.valueOf(obj.f2240c));
            obj.f2241e = gd.a0("LimitReachedStoriesMonthlyPremium", null, 2131748737, Integer.valueOf(obj.f2240c));
            obj.f2242f = gd.a0("LimitReachedStoriesMonthlyPremium", null, 2131748737, Integer.valueOf(obj.f2239b));
            return obj;
        } else if (i7 != 18 && i7 != 32 && i7 != 20 && i7 != 24 && i7 != 27 && i7 != 28 && i7 != 25 && i7 != 30 && i7 != 35 && i7 != 29 && i7 != 22 && i7 != 23 && i7 != 19 && i7 != 21 && i7 != 26) {
            return obj;
        } else {
            obj.f2239b = mp.u1(i10).f25826p5;
            obj.f2240c = mp.u1(i10).f25835q5;
            obj.f2238a = 2131231129;
            obj.d = gd.a0("LimitReachedStoriesMonthly", null, 2131748738, Integer.valueOf(obj.f2239b), Integer.valueOf(obj.f2240c));
            obj.f2241e = gd.a0("LimitReachedStoriesMonthlyPremium", null, 2131748737, Integer.valueOf(obj.f2240c));
            obj.f2242f = gd.a0("LimitReachedStoriesMonthlyPremium", null, 2131748737, Integer.valueOf(obj.f2239b));
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

    public static void x1(g2 g2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, g3 g3Var, long j3, boolean z10) {
        if (tL_premium_boostsStatus != null && g3Var != null && g2Var.getContext() != null) {
            k0 k0Var = new k0(32, g2Var.getCurrentAccount(), g2Var.getContext(), g2Var, g2Var.getResourceProvider());
            k0Var.B1(g3Var);
            k0Var.A1(tL_premium_boostsStatus, true);
            k0Var.C1(j3);
            if (z10) {
                g2Var.showDialog(k0Var);
            } else {
                k0Var.show();
            }
        }
    }

    public final void A1(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z10) {
        this.X1 = tL_premium_boostsStatus;
        this.f58848a2 = z10;
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
        this.f58870x2 = new ArrayList(arrayList);
        this.f58871y2 = arrayList2;
        this.f58872z2 = arrayList3;
        HashSet hashSet = this.f58867u2;
        hashSet.clear();
        if (this.U1) {
            ArrayList arrayList4 = this.f58870x2;
            int size = arrayList4.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList4.get(i7);
                i7++;
                TLRPC.User user = (TLRPC.User) obj;
                if (arrayList2 == null || !arrayList2.contains(Long.valueOf(user.f28641id))) {
                    hashSet.add(user);
                }
            }
        }
        H1();
        F1();
        int i10 = this.d2;
        if ((i10 == 11 || i10 == 34) && !mp.u1(this.f30223a).K3()) {
            if (((arrayList3 != null && !arrayList3.isEmpty()) || (arrayList2 != null && arrayList2.size() >= this.f58870x2.size())) && arrayList3 != null && arrayList2 != null) {
                if ((arrayList3.size() == 1 && arrayList2.size() == 1) || arrayList2.size() >= arrayList3.size()) {
                    a0 a0Var = this.A2;
                    if (a0Var != null && a0Var.getParent() != null) {
                        ((ViewGroup) this.A2.getParent()).removeView(this.A2);
                    }
                    tv tvVar = this.H2;
                    if (tvVar != null && tvVar.getParent() != null) {
                        ((ViewGroup) this.H2.getParent()).removeView(this.H2);
                    }
                    ek0 ek0Var = this.f39246o1;
                    if (ek0Var != null) {
                        ek0Var.setPadding(0, 0, 0, 0);
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
        this.f58863q2 = new ArrayList();
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X1;
        if (tL_premium_boostsStatus != null) {
            i7 = tL_premium_boostsStatus.level + 1;
        } else {
            i7 = 1;
        }
        if (this.d2 == 31) {
            i7 = 1;
        }
        mp u12 = mp.u1(this.f30223a);
        cp cpVar = u12.f25862t4;
        if (cpVar != null) {
            i10 = cpVar.e(s1());
        } else {
            i10 = 0;
        }
        int max2 = Math.max(10, i10);
        cp cpVar2 = u12.f25870u4;
        if (cpVar2 != null) {
            i11 = cpVar2.e(s1());
        } else {
            i11 = 0;
        }
        int max3 = Math.max(max2, i11);
        if (s1()) {
            max = Math.max(Math.max(Math.max(Math.max(Math.max(max3, u12.D5), u12.B5), u12.C5), u12.f25919z5), u12.f25910y5);
        } else {
            max = Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(max3, u12.f25863t5), u12.f25871u5), u12.f25880v5), u12.f25890w5), u12.f25900x5), u12.C4), u12.D4);
        }
        ArrayList arrayList = null;
        while (i7 <= max) {
            boolean s12 = s1();
            ArrayList arrayList2 = new ArrayList();
            mp u13 = mp.u1(this.f30223a);
            if (!s12 && i7 >= u13.D4) {
                arrayList2.add(f0.a(2131231823, 2131753657));
            }
            f0 b10 = f0.b(2131231820, i7, "BoostFeatureStoriesPerDay");
            b10.f58779f = true;
            arrayList2.add(b10);
            if (!s12) {
                f0 b11 = f0.b(2131231815, i7, "BoostFeatureCustomReaction");
                b11.f58779f = true;
                arrayList2.add(b11);
            }
            cp cpVar3 = u13.f25862t4;
            if (cpVar3 != null) {
                i12 = cpVar3.a(i7, false);
            } else {
                i12 = 0;
            }
            cp cpVar4 = u13.f25870u4;
            if (cpVar4 != null) {
                i13 = cpVar4.a(i7, s12);
            } else {
                i13 = 0;
            }
            if (!s12 && i12 > 0) {
                arrayList2.add(f0.b(2131231801, 7, "BoostFeatureNameColor"));
            }
            if (!s12 && i12 > 0) {
                arrayList2.add(f0.b(2131231809, i12, "BoostFeatureReplyColor"));
            }
            if (!s12 && i7 >= u13.f25863t5) {
                arrayList2.add(f0.a(2131231810, 2131753630));
            }
            if (i13 > 0) {
                if (s12) {
                    str2 = "BoostFeatureProfileColorGroup";
                } else {
                    str2 = "BoostFeatureProfileColor";
                }
                arrayList2.add(f0.b(2131231802, i13, str2));
            }
            if (s12 && i7 >= u13.A5) {
                arrayList2.add(f0.a(2131231812, 2131753648));
            }
            if ((!s12 && i7 >= u13.f25871u5) || (s12 && i7 >= u13.f25910y5)) {
                if (s12) {
                    i15 = 2131753634;
                } else {
                    i15 = 2131753635;
                }
                arrayList2.add(f0.a(2131231803, i15));
            }
            if (s12 && i7 >= u13.D5) {
                arrayList2.add(f0.a(2131231826, 2131753625));
            }
            if ((!s12 && i7 >= u13.f25880v5) || (s12 && i7 >= u13.f25919z5)) {
                arrayList2.add(new f0(2131231819, 2131753644, -1, "1000+", null));
            }
            if ((!s12 && i7 >= u13.f25890w5) || (s12 && i7 >= u13.B5)) {
                if (s12) {
                    str = "BoostFeatureBackgroundGroup";
                } else {
                    str = "BoostFeatureBackground";
                }
                arrayList2.add(f0.b(2131231827, 8, str));
            }
            if ((!s12 && i7 >= u13.f25900x5) || (s12 && i7 >= u13.C5)) {
                if (s12) {
                    i14 = 2131753649;
                } else {
                    i14 = 2131753650;
                }
                arrayList2.add(f0.a(2131231805, i14));
            }
            if (!s12 && i7 >= u13.C4) {
                arrayList2.add(f0.a(2131231811, 2131753626));
            }
            Collections.reverse(arrayList2);
            if (arrayList != null && arrayList.size() == arrayList2.size()) {
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    f0 f0Var = (f0) arrayList.get(i16);
                    f0 f0Var2 = (f0) arrayList2.get(i16);
                    int i17 = f0Var.f58778e;
                    if (f0Var2 != null && ((f0Var.f58779f && i17 > 2) || (f0Var.f58775a == f0Var2.f58775a && f0Var.f58776b == f0Var2.f58776b && TextUtils.equals(f0Var.f58777c, f0Var2.f58777c) && TextUtils.equals(f0Var.d, f0Var2.d) && i17 == f0Var2.f58778e))) {
                    }
                }
                i7++;
            }
            ArrayList arrayList3 = this.f58863q2;
            arrayList3.add(new e0(i7, arrayList3.isEmpty()));
            this.f58863q2.addAll(arrayList2);
            arrayList = arrayList2;
            i7++;
        }
    }

    public final void F1() {
        int i7;
        String str = null;
        if (this.f58852f2) {
            this.A2.c(gd.N0(2131748937, null), false, false);
            return;
        }
        int i10 = this.d2;
        if (i10 != 19 && i10 != 32 && !t1()) {
            HashSet hashSet = this.f58867u2;
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
                a0 a0Var = this.A2;
                a0Var.f58986r = false;
                a0Var.d(true);
                return;
            }
            a0 a0Var2 = this.A2;
            if (a0Var2.J == null) {
                qq qqVar = new qq(a0Var2.getContext(), null);
                a0Var2.J = qqVar;
                qqVar.setGravity(3);
                qq qqVar2 = a0Var2.J;
                int i11 = n6.Fi;
                int i12 = n6.Ji;
                pq pqVar = qqVar2.f38979a;
                pqVar.v = i11;
                pqVar.f38560w = i12;
                pqVar.f38542b = 0.8f;
                a0Var2.setClipChildren(false);
                a0Var2.addView(a0Var2.J, na.e(-1, 24, 16));
            }
            if (!this.U1) {
                this.A2.c(gd.N0(2131752029, null), true, true);
            } else if (hashSet.size() > 0) {
                this.A2.c(gd.N0(2131745423, null), true, true);
            } else {
                this.A2.c(gd.N0(2131754554, null), true, true);
            }
            this.A2.J.f38979a.c(hashSet.size(), true);
            this.A2.invalidate();
            return;
        }
        g3 g3Var = this.Y1;
        boolean z10 = g3Var.f24254a;
        if ((z10 || g3Var.f24255b) && !g3Var.f24263l && !g3Var.d) {
            if (g3Var.f24264m) {
                this.A2.c(gd.N0(2131747637, null), true, true);
                return;
            }
            a0 a0Var3 = this.A2;
            a0Var3.f58986r = false;
            a0Var3.d(true);
            return;
        }
        hi.e eVar = this.O2;
        if (z10) {
            if (wg.r.i()) {
                this.A2.c(gd.N0(2131753588, null), true, true);
            } else {
                a0 a0Var4 = this.A2;
                if (s1()) {
                    i7 = 2131753622;
                } else {
                    i7 = 2131753660;
                }
                a0Var4.c(gd.N0(i7, null), true, true);
            }
            this.C2.i(gd.N0(2131753661, null), true, true);
            if (eVar != null) {
                eVar.i(gd.N0(2131753622, null), true, true);
            }
        } else if (g3Var.f24264m) {
            this.C2.i(gd.N0(2131747637, null), true, true);
            if (eVar != null) {
                eVar.i(gd.N0(2131747637, null), true, true);
            }
            this.A2.c(gd.N0(2131747637, null), true, true);
        } else if (wg.r.i()) {
            if (eVar != null) {
                eVar.i(gd.N0(2131753622, null), true, true);
            }
            this.C2.i(gd.N0(2131753661, null), true, true);
            this.A2.c(gd.N0(2131753588, null), true, true);
        } else {
            if (eVar != null) {
                eVar.i(gd.N0(2131747637, null), true, true);
            }
            this.C2.i(gd.N0(2131747637, null), true, true);
            this.A2.c(gd.N0(2131747637, null), true, true);
        }
    }

    public final void G1() {
        String N0;
        if (this.f58852f2) {
            this.A2.c(gd.N0(2131748937, null), false, false);
            return;
        }
        int i7 = this.d2;
        if (i7 != 19 && i7 != 32 && !t1()) {
            if (i7 != 18 && i7 != 20 && i7 != 24 && i7 != 25 && i7 != 26 && i7 != 29 && i7 != 22 && i7 != 23 && i7 != 21 && i7 != 27 && i7 != 28 && i7 != 30 && i7 != 35) {
                if (!i10.i(this.f30223a).q() && !mp.u1(this.f30223a).K3() && !this.J2) {
                    this.A2.f58984f.setText(gd.N0(2131749006, null));
                    androidx.emoji2.text.q qVar = this.I2;
                    if (qVar != null) {
                        int i10 = qVar.f2239b;
                        int i11 = i10 + 1;
                        int i12 = qVar.f2240c;
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
                        a0 a0Var = this.A2;
                        a0Var.E.f41083p = null;
                        a0Var.G.setVisibility(8);
                        return;
                    }
                    a0 a0Var2 = this.A2;
                    a0Var2.E.f41083p = null;
                    a0Var2.G.setVisibility(8);
                    return;
                }
                this.A2.f58984f.setText(gd.N0(2131747637, null));
                a0 a0Var3 = this.A2;
                a0Var3.E.f41083p = null;
                a0Var3.G.setVisibility(8);
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
            spannableStringBuilder.setSpan(new kq(2131232109, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) gd.N0(2131751750, null));
            this.A2.f58984f.setText(spannableStringBuilder);
            return;
        }
        int i13 = 2131753660;
        if (wg.r.i()) {
            q0 q0Var = this.A2.f58984f;
            g3 g3Var = this.Y1;
            if (g3Var != null && g3Var.d) {
                N0 = gd.N0(2131753588, null);
            } else {
                if (s1()) {
                    i13 = 2131753622;
                }
                N0 = gd.N0(i13, null);
            }
            q0Var.setText(N0);
            g3 g3Var2 = this.Y1;
            if (g3Var2 != null && g3Var2.f24264m) {
                this.A2.f58984f.setText(gd.N0(2131747637, null));
                return;
            }
            return;
        }
        q0 q0Var2 = this.A2.f58984f;
        if (s1()) {
            i13 = 2131753622;
        }
        q0Var2.setText(gd.N0(i13, null));
    }

    public final void H1() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        this.f58855i2 = -1;
        this.f58857k2 = -1;
        this.f58858l2 = -1;
        this.f58859m2 = -1;
        this.V1 = -1;
        this.f58860n2 = -1;
        this.f58862p2 = -1;
        this.f58853g2 = 1;
        this.f58854h2 = 0;
        int i7 = this.d2;
        if (i7 != 19 && i7 != 18 && i7 != 20 && i7 != 24 && i7 != 27 && i7 != 28 && i7 != 22 && i7 != 23 && i7 != 25 && i7 != 26 && i7 != 29 && i7 != 21 && i7 != 30 && i7 != 35) {
            if (i7 != 31 && i7 != 32) {
                if (!q1(i7)) {
                    if (i7 != 11 && i7 != 34) {
                        int i10 = this.f58853g2;
                        this.f58855i2 = i10;
                        this.f58853g2 = i10 + 2;
                        this.f58856j2 = i10 + 1;
                    } else {
                        this.f39253v1 = 0.24f;
                    }
                    if (this.E2) {
                        int i11 = this.f58853g2;
                        this.f58853g2 = i11 + 1;
                        this.f58859m2 = i11;
                    } else if (i7 != 11 || this.U1) {
                        if (i7 != 11 || mp.u1(this.f30223a).K3() || ((((arrayList = this.f58872z2) == null || arrayList.isEmpty()) && ((arrayList2 = this.f58871y2) == null || arrayList2.size() < this.f58870x2.size())) || (arrayList3 = this.f58872z2) == null || arrayList3.size() != 1 || (arrayList4 = this.f58871y2) == null || arrayList4.size() != 1 || !this.U1)) {
                            int i12 = this.f58853g2;
                            this.f58857k2 = i12;
                            if (i7 != 11 && i7 != 34) {
                                if (i7 == 5) {
                                    this.f58853g2 = this.f58868v2.size() + i12;
                                } else {
                                    this.f58853g2 = this.f58851e2.size() + i12;
                                }
                            } else {
                                this.f58853g2 = this.f58870x2.size() + i12;
                            }
                            this.f58858l2 = this.f58853g2;
                        }
                        if (this.f58858l2 - this.f58857k2 > 1) {
                            int i13 = this.f58853g2;
                            this.f58853g2 = i13 + 1;
                            this.f58860n2 = i13;
                        }
                    }
                }
            } else {
                this.f39253v1 = 0.24f;
                E1();
                int i14 = this.f58853g2;
                this.f58857k2 = i14;
                int i15 = i14 + 1;
                this.f58853g2 = i15;
                this.f58862p2 = i14;
                int size = (this.f58863q2.size() - 1) + i15;
                this.f58853g2 = size;
                this.f58858l2 = size;
            }
        } else {
            if (i7 != 19 || v3.N(o1())) {
                this.f39253v1 = 0.24f;
                int i16 = this.f58853g2;
                this.f58853g2 = i16 + 1;
                this.V1 = i16;
                if (mp.u1(this.f30223a).f25854s4) {
                    int i17 = this.f58853g2;
                    this.f58853g2 = i17 + 1;
                    this.f58861o2 = i17;
                }
            }
            E1();
            int i18 = this.f58853g2;
            int i19 = i18 + 1;
            this.f58853g2 = i19;
            this.f58862p2 = i18;
            this.f58853g2 = (this.f58863q2.size() - 1) + i19;
        }
        this.f39246o1.getAdapter().f();
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        return new d0(this);
    }

    @Override
    public final CharSequence P0() {
        int i7 = this.d2;
        if (i7 != 11) {
            if (i7 != 34) {
                if (i7 != 35) {
                    int i10 = 2131753622;
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
                            return gd.N0(2131743627, null);
                        case 19:
                        case 30:
                            if (!s1()) {
                                i10 = 2131753660;
                            }
                            return gd.N0(i10, null);
                        case 31:
                            return gd.N0(2131753597, null);
                        case 32:
                            return gd.N0(2131753622, null);
                        default:
                            return gd.N0(2131748785, null);
                    }
                }
                return gd.N0(2131743627, null);
            }
            return gd.N0(2131752610, null);
        }
        return gd.N0(2131752389, null);
    }

    @Override
    public final void V0(cu0 cu0Var) {
        int i7;
        Context context = cu0Var.getContext();
        hi.e eVar = new hi.e(context, this.J0, true);
        this.C2 = eVar;
        eVar.setFlickeringLoading(true);
        this.C2.i(gd.N0(2131753661, null), false, true);
        this.C2.setOnClickListener(new t(this, 2));
        a0 a0Var = new a0(this, context, this.J0);
        this.A2 = a0Var;
        sa.b(a0Var, 0.02f, 1.2f);
        if (!this.f39251t1 && (i7 = this.d2) != 18 && i7 != 20 && i7 != 24 && i7 != 25 && i7 != 26 && i7 != 29 && i7 != 22 && i7 != 23 && i7 != 21 && i7 != 27 && i7 != 28 && i7 != 30 && i7 != 35) {
            tv tvVar = new tv(14, context, this);
            this.H2 = tvVar;
            u6.h(n6.f29524h5, tvVar, this.J0);
            cu0Var.addView(this.H2, na.d(-1, 72.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        a0 a0Var2 = this.A2;
        float f10 = (this.f30261u0 / org.telegram.messenger.g0.f24225p) + 16.0f;
        cu0Var.addView(a0Var2, na.d(-1, 48.0f, 80, f10, 0.0f, f10, 12.0f));
        int L = org.telegram.messenger.g0.L(72.0f);
        ek0 ek0Var = this.f39246o1;
        ek0Var.setPadding(0, 0, 0, L);
        ek0Var.setClipToPadding(false);
        ek0Var.setClipChildren(false);
        ek0Var.setOnItemClickListener(new n8(this, 22));
        ek0Var.setOnItemLongClickListener(new w(this, 2));
        this.A2.f58988w.setOnClickListener(new ig0(28, this, context));
        this.A2.h.setOnClickListener(new t(this, 3));
        this.F2 = new hj0(ek0Var, true);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        boolean z10;
        TLRPC.ChatFull P0;
        g2 g2Var;
        g2 g2Var2;
        if (i7 == ks.X2) {
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            g2 g2Var3 = this.f39250s1;
            g2 lastFragment = g2Var3.getParentLayout().getLastFragment();
            g2 g2Var4 = null;
            if (lastFragment instanceof ch.p) {
                List fragmentStack = g2Var3.getParentLayout().getFragmentStack();
                if (fragmentStack.size() >= 2) {
                    g2Var = (g2) p5.c.h(2, fragmentStack);
                } else {
                    g2Var = null;
                }
                if (fragmentStack.size() >= 3) {
                    g2Var2 = (g2) p5.c.h(3, fragmentStack);
                } else {
                    g2Var2 = null;
                }
                if (fragmentStack.size() >= 4) {
                    g2Var4 = (g2) p5.c.h(4, fragmentStack);
                }
                if (g2Var instanceof rn) {
                    ((ActionBarLayout) g2Var3.getParentLayout()).d0(g2Var, false);
                }
                dismiss();
                if (booleanValue) {
                    if (g2Var2 instanceof ProfileActivity) {
                        ((ActionBarLayout) g2Var3.getParentLayout()).d0(g2Var2, false);
                    }
                    lastFragment.finishFragment();
                    wg.h.f(g2Var4, chat, true);
                    return;
                }
                lastFragment.finishFragment();
                wg.h.f(g2Var2, chat, false);
            } else if ((lastFragment instanceof bn) && booleanValue) {
                wg.h.f(lastFragment, chat, true);
            } else if ((lastFragment instanceof qc) && booleanValue) {
                List fragmentStack2 = g2Var3.getParentLayout().getFragmentStack();
                ArrayList arrayList = new ArrayList();
                for (int size = fragmentStack2.size() - 2; size >= 0; size--) {
                    g2 g2Var5 = (g2) fragmentStack2.get(size);
                    if (!(g2Var5 instanceof bn) && !(g2Var5 instanceof bx)) {
                        arrayList.add(g2Var5);
                    } else {
                        g2Var4 = g2Var5;
                        break;
                    }
                }
                if (g2Var4 != null) {
                    int size2 = arrayList.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        ((ActionBarLayout) g2Var3.getParentLayout()).d0((g2) obj, false);
                    }
                    g2Var3.finishFragment();
                    dismiss();
                    wg.h.f(g2Var4, chat, true);
                }
            } else if (booleanValue) {
                nb nbVar = nb.G2;
                if (nbVar != null && nbVar.d) {
                    bn ua2 = bn.ua(-chat.f28492id);
                    LaunchActivity.Q().presentFragment(ua2, false, false);
                    nb.w();
                    dismiss();
                    wg.h.f(ua2, chat, true);
                    return;
                }
                List fragmentStack3 = g2Var3.getParentLayout().getFragmentStack();
                if (fragmentStack3.size() >= 2) {
                    g2Var4 = (g2) p5.c.h(2, fragmentStack3);
                }
                g2Var3.finishFragment();
                dismiss();
                if (g2Var4 instanceof bn) {
                    wg.h.f(g2Var4, chat, true);
                }
            } else {
                nb nbVar2 = nb.G2;
                if (nbVar2 != null && nbVar2.d) {
                    bn ua3 = bn.ua(-chat.f28492id);
                    LaunchActivity.Q().presentFragment(ua3, false, false);
                    nb.w();
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
                if (this.d2 == 32 && (P0 = mp.u1(this.f30223a).P0(-this.W1)) != null) {
                    P0.boosts_applied += intValue;
                }
                u1();
                A1(tL_premium_boostsStatus, this.f58848a2);
                g3 g3Var = this.Y1;
                if (this.X1.next_level_boosts <= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                g3Var.f24264m = z10;
                g3Var.f24263l = true;
                g3Var.a(tL_premium_myBoosts);
                if (w1()) {
                    fc Q = new kc(this.f30229c, this.J0).Q(2131624051, 30, gd.G(intValue, "BoostingReassignedFromPlural", gd.G(intValue2, "BoostingFromOtherChannel", new Object[0])));
                    Q.f35091j = 4000;
                    Q.k(true);
                }
            }
        } else if (i7 == ks.V2) {
            dismiss();
        }
    }

    public final void i1(final m80 m80Var, boolean z10) {
        if (m80Var.a() && !z10) {
            return;
        }
        m80Var.setLoading(true);
        mp.u1(this.f30223a).I0();
        wg.r.a(-this.W1, Arrays.asList(Integer.valueOf(this.Y1.f24259g)), new w10(this) {
            public final k0 f59076b;

            {
                this.f59076b = this;
            }

            @Override
            public final void a(Object obj) {
                switch (r3) {
                    case 0:
                        k0 k0Var = this.f59076b;
                        mp.u1(k0Var.f30223a).I0().a(k0Var.W1, new bi.j(k0Var, m80Var, (TL_stories.TL_premium_myBoosts) obj, 16));
                        return;
                    default:
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                        boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                        m80 m80Var2 = m80Var;
                        if (startsWith) {
                            int intValue = Utilities.z(tL_error.text).intValue();
                            if (intValue <= 5) {
                                org.telegram.messenger.g0.h3(new org.telegram.ui.web.t1(26, this.f59076b, m80Var2), intValue * 1000);
                                return;
                            }
                            wg.h.g(intValue);
                        }
                        m80Var2.setLoading(false);
                        return;
                }
            }
        }, new w10(this) {
            public final k0 f59076b;

            {
                this.f59076b = this;
            }

            @Override
            public final void a(Object obj) {
                switch (r3) {
                    case 0:
                        k0 k0Var = this.f59076b;
                        mp.u1(k0Var.f30223a).I0().a(k0Var.W1, new bi.j(k0Var, m80Var, (TL_stories.TL_premium_myBoosts) obj, 16));
                        return;
                    default:
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                        boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                        m80 m80Var2 = m80Var;
                        if (startsWith) {
                            int intValue = Utilities.z(tL_error.text).intValue();
                            if (intValue <= 5) {
                                org.telegram.messenger.g0.h3(new org.telegram.ui.web.t1(26, this.f59076b, m80Var2), intValue * 1000);
                                return;
                            }
                            wg.h.g(intValue);
                        }
                        m80Var2.setLoading(false);
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
        hi.e eVar = this.O2;
        if (eVar != null && eVar.isAttachedToWindow()) {
            i1(eVar, false);
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
        int i7 = this.f30223a;
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
            TLRPC.ChatFull P0 = mp.u1(this.f30223a).P0(-this.W1);
            int max = Math.max(P0.boosts_unrestrict - P0.boosts_applied, 0);
            if (o12 == null) {
                str2 = "";
            } else {
                str2 = o12.title;
            }
            return gd.G(max, "BoostingRemoveRestrictionsSubtitle", str2);
        }
        TLRPC.Chat O0 = mp.u1(this.f30223a).O0(Long.valueOf(-this.W1));
        if (O0 == null) {
            if (s1()) {
                i10 = 2131754876;
            } else {
                i10 = 2131754904;
            }
            str = gd.N0(i10, null);
        } else {
            str = O0.title;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X1;
        if (tL_premium_boostsStatus.boosts == tL_premium_boostsStatus.current_level_boosts) {
            z11 = true;
        } else {
            z11 = false;
        }
        int i11 = 2131752340;
        if (t1() && this.X1.next_level_boosts != 0 && z10) {
            if (s1()) {
                i11 = 2131749227;
            }
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.X1;
            int i12 = tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts;
            return gd.a0(null, null, i11, str, gd.G(i12, "MoreBoosts", Integer.valueOf(i12)));
        }
        int i13 = 2131752437;
        if (z11 && this.Y1.d) {
            if (this.X1.level == 1) {
                if (s1()) {
                    i7 = 2131749300;
                } else {
                    i7 = 2131752438;
                }
                return gd.a0(null, null, i7, new Object[0]);
            }
            if (s1()) {
                i13 = 2131749299;
            }
            return gd.a0(null, null, i13, Integer.valueOf(this.X1.level), gd.G(this.X1.level, "BoostStories", new Object[0]));
        } else if (this.Y1.d) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus3 = this.X1;
            if (tL_premium_boostsStatus3.level == 0) {
                if (s1()) {
                    i11 = 2131749227;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus4 = this.X1;
                int i14 = tL_premium_boostsStatus4.next_level_boosts - tL_premium_boostsStatus4.boosts;
                return gd.a0(null, null, i11, str, gd.G(i14, "MoreBoosts", Integer.valueOf(i14)));
            } else if (tL_premium_boostsStatus3.next_level_boosts == 0) {
                if (s1()) {
                    i13 = 2131749299;
                }
                return gd.a0(null, null, i13, Integer.valueOf(this.X1.level), gd.G(this.X1.level + 1, "BoostStories", new Object[0]));
            } else {
                if (s1()) {
                    i11 = 2131749227;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus5 = this.X1;
                int i15 = tL_premium_boostsStatus5.next_level_boosts - tL_premium_boostsStatus5.boosts;
                return gd.a0(null, null, i11, str, gd.G(i15, "MoreBoosts", Integer.valueOf(i15)));
            }
        } else {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus6 = this.X1;
            if (tL_premium_boostsStatus6.level == 0) {
                if (s1()) {
                    i11 = 2131749227;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus7 = this.X1;
                int i16 = tL_premium_boostsStatus7.next_level_boosts - tL_premium_boostsStatus7.boosts;
                return gd.a0(null, null, i11, str, gd.G(i16, "MoreBoosts", Integer.valueOf(i16)));
            } else if (tL_premium_boostsStatus6.next_level_boosts == 0) {
                if (s1()) {
                    i13 = 2131749299;
                }
                return gd.a0(null, null, i13, Integer.valueOf(this.X1.level), gd.G(this.X1.level + 1, "BoostStories", new Object[0]));
            } else {
                if (s1()) {
                    i11 = 2131749227;
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
            return gd.a0("BoostsMaxLevelReached", null, 2131753155, new Object[0]);
        }
        int i11 = 2131753660;
        if (tL_premium_boostsStatus.level > 0 && !this.Y1.d) {
            if (s1()) {
                i11 = 2131753622;
            }
            return gd.N0(i11, null);
        }
        boolean z10 = this.f58848a2;
        int i12 = this.d2;
        if (z10) {
            if (i12 == 32) {
                if (s1()) {
                    i11 = 2131753622;
                }
                return gd.N0(i11, null);
            }
            TLRPC.Chat O0 = mp.u1(this.f30223a).O0(Long.valueOf(-this.W1));
            if (this.Y1.d) {
                return gd.a0("YouBoostedChannel2", null, 2131742569, O0.title);
            }
            if (s1()) {
                i11 = 2131753622;
            }
            return gd.N0(i11, null);
        } else if (i12 == 32) {
            if (s1()) {
                i11 = 2131753622;
            }
            return gd.N0(i11, null);
        } else if (this.Y1.d) {
            if (s1()) {
                i10 = 2131742568;
            } else {
                i10 = 2131742570;
            }
            return gd.N0(i10, null);
        } else {
            if (s1()) {
                i7 = 2131753524;
            } else {
                i7 = 2131753525;
            }
            return gd.N0(i7, null);
        }
    }

    public final TLRPC.Chat o1() {
        return mp.u1(this.f30223a).O0(Long.valueOf(-this.W1));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ks.f(this.f30223a).c(this, ks.X2);
        ks.f(this.f30223a).c(this, ks.W2);
        ks.f(this.f30223a).c(this, ks.V2);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ks.f(this.f30223a).n(this, ks.X2);
        ks.f(this.f30223a).n(this, ks.W2);
        ks.f(this.f30223a).n(this, ks.V2);
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
            if (this.G0 < 0 && this.H0 == this.P2 && (w02 = n6.w0(n6.f29524h5, this.J0)) != this.H0) {
                this.H0 = w02;
                this.P2 = w02;
                E0(w02);
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    public final boolean s1() {
        return !v3.V(mp.u1(this.f30223a).O0(Long.valueOf(-this.W1)));
    }

    public final boolean t1() {
        if (r1() && v3.N(o1())) {
            return true;
        }
        return false;
    }

    public final void u1() {
        int i7;
        i0 i0Var = this.f58866t2;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X1;
        int i10 = tL_premium_boostsStatus.boosts;
        int i11 = tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.current_level_boosts;
        i0Var.f33126b++;
        i0Var.f33124a = m9.a((i10 - i7) / i11, 0.0f, 1.0f);
        i0Var.f33125a0 = true;
        i0Var.f33127b0 = i0Var.f33141n;
        i0Var.i(i10, true);
        i0Var.J.requestLayout();
        i0Var.requestLayout();
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
        ks f10 = ks.f(this.f30223a);
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.X1;
        g3 g3Var = this.Y1;
        g3Var.getClass();
        g3 g3Var2 = new g3();
        g3Var2.f24254a = g3Var.f24254a;
        g3Var2.f24255b = g3Var.f24255b;
        g3Var2.f24256c = g3Var.f24256c;
        g3Var2.d = g3Var.d;
        g3Var2.f24257e = g3Var.f24257e;
        g3Var2.f24259g = g3Var.f24259g;
        g3Var2.h = g3Var.h;
        g3Var2.f24260i = g3Var.f24260i;
        g3Var2.f24261j = g3Var.f24261j;
        g3Var2.f24262k = g3Var.f24262k;
        g3Var2.f24264m = g3Var.f24264m;
        f10.m(ks.f25280r3, tL_premium_boostsStatus, g3Var2, Long.valueOf(this.W1));
        hi.e eVar = this.O2;
        if (eVar != null) {
            TLRPC.ChatFull P0 = mp.u1(this.f30223a).P0(-this.W1);
            int max = Math.max(P0.boosts_unrestrict - P0.boosts_applied, 0);
            if (max == 0) {
                ks.f(this.f30223a).m(ks.f25273q3, new Object[0]);
                dismiss();
                return false;
            }
            eVar.c(max, true);
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i0(5));
        transitionSet.setOrdering(0);
        TransitionManager.beginDelayedTransition(this.Z1, transitionSet);
        j0 j0Var = this.Z1;
        wg.b bVar = j0Var.f58834c;
        int indexOfChild = j0Var.indexOfChild(j0Var.f58833b);
        k0 k0Var = j0Var.f58835e;
        if (k0Var.f58848a2) {
            int indexOfChild2 = j0Var.indexOfChild(j0Var.d);
            j0Var.removeView(j0Var.d);
            j0Var.d.removeView(j0Var.f58832a);
            j0Var.d.removeView(bVar);
            LinearLayout linearLayout = new LinearLayout(j0Var.getContext());
            j0Var.d = linearLayout;
            linearLayout.setOrientation(0);
            j0Var.d.setWeightSum(1.0f);
            j0Var.d.addView(j0Var.f58832a, na.p(-2, -2, 1.0f, 0));
            j0Var.d.addView(bVar, na.t(-2, -2, 48, 0, 2, 0, 0));
            j0Var.addView(j0Var.d, indexOfChild2, na.t(-2, -2, 1, 25, 22, 12, 9));
        } else {
            int indexOfChild3 = j0Var.indexOfChild(j0Var.f58832a);
            j0Var.removeView(j0Var.f58832a);
            TextView textView = new TextView(j0Var.getContext());
            j0Var.f58832a = textView;
            textView.setTypeface(org.telegram.messenger.g0.o());
            j0Var.f58832a.setTextSize(1, 20.0f);
            u6.U(j0Var.f58832a, n6.G6, k0Var.J0);
            j0Var.f58832a.setGravity(17);
            j0Var.addView(j0Var.f58832a, indexOfChild3, na.t(-2, -2, 1, 0, 22, 0, 0));
        }
        j0Var.removeView(j0Var.f58833b);
        TextView textView2 = new TextView(j0Var.getContext());
        j0Var.f58833b = textView2;
        textView2.setTextSize(1, 14.0f);
        TextView textView3 = j0Var.f58833b;
        textView3.setLineSpacing(textView3.getLineSpacingExtra(), j0Var.f58833b.getLineSpacingMultiplier() * 1.1f);
        j0Var.f58833b.setGravity(1);
        u6.U(j0Var.f58833b, n6.G6, k0Var.J0);
        j0Var.addView(j0Var.f58833b, indexOfChild, na.t(-2, -2, 1, 24, -2, 24, 17));
        this.Z1.f58832a.setText(n1());
        TextView textView4 = this.Z1.f58833b;
        mp u12 = mp.u1(this.f30223a);
        boolean s12 = s1();
        int i22 = this.d2;
        String str = null;
        if (i22 == 20) {
            if (s12) {
                i21 = 2131749225;
            } else {
                i21 = 2131752337;
            }
            str = gd.a0(null, null, i21, Integer.valueOf(k1()));
        } else if (i22 == 24) {
            if (s12) {
                i20 = 2131749221;
            } else {
                i20 = 2131752334;
            }
            str = gd.a0(null, null, i20, Integer.valueOf(k1()));
        } else if (i22 == 29) {
            str = gd.a0(null, null, 2131749224, Integer.valueOf(u12.A5));
        } else if (i22 == 30) {
            str = gd.a0(null, null, 2131752331, Integer.valueOf(u12.C4));
        } else if (i22 == 35) {
            str = gd.a0(null, null, 2131752338, Integer.valueOf(u12.D4));
        } else if (i22 == 25) {
            if (s12) {
                i18 = 2131749222;
            } else {
                i18 = 2131752335;
            }
            if (s12) {
                i19 = u12.f25919z5;
            } else {
                i19 = u12.f25880v5;
            }
            str = gd.a0(null, null, i18, Integer.valueOf(i19));
        } else if (i22 == 26) {
            if (s12) {
                i16 = 2131749217;
            } else {
                i16 = 2131752329;
            }
            if (s12) {
                i17 = u12.f25919z5;
            } else {
                i17 = u12.f25880v5;
            }
            str = gd.a0(null, null, i16, Integer.valueOf(i17));
        } else if (i22 == 27) {
            if (s12) {
                i15 = 2131749219;
            } else {
                i15 = 2131752332;
            }
            str = gd.a0(null, null, i15, Integer.valueOf(u12.f25863t5));
        } else if (i22 == 28) {
            if (s12) {
                i13 = 2131749220;
            } else {
                i13 = 2131752333;
            }
            if (s12) {
                i14 = u12.f25910y5;
            } else {
                i14 = u12.f25871u5;
            }
            str = gd.a0(null, null, i13, Integer.valueOf(i14));
        } else if (i22 == 22) {
            if (s12) {
                i11 = 2131749218;
            } else {
                i11 = 2131752330;
            }
            if (s12) {
                i12 = u12.B5;
            } else {
                i12 = u12.f25890w5;
            }
            str = gd.a0(null, null, i11, Integer.valueOf(i12));
        } else if (i22 == 23) {
            if (s12) {
                i7 = 2131749223;
            } else {
                i7 = 2131752336;
            }
            if (s12) {
                i10 = u12.C5;
            } else {
                i10 = u12.f25900x5;
            }
            str = gd.a0(null, null, i7, Integer.valueOf(i10));
        }
        if (str == null) {
            str = m1(false);
        }
        textView4.setText(org.telegram.messenger.g0.W2(str));
        F1();
        tz tzVar = this.L2;
        tzVar.c(false);
        try {
            tzVar.performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.Z1.f58834c.a(this.Y1.f24260i, true);
        this.f39246o1.y0(0);
        if (i22 == 32) {
            this.Z1.f58834c.setVisibility(8);
        }
        return true;
    }

    public final void y1(ArrayList arrayList) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.J0);
        String G = gd.G(arrayList.size(), "RevokeLinks", new Object[0]);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
        t1Var.S = G;
        if (arrayList.size() == 1) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(0);
            if (this.f58864r2) {
                t1Var.U = org.telegram.messenger.g0.W2(gd.a0("RevokeLinkAlertChannel", null, 2131745825, mp.u1(this.f30223a).X2 + "/" + v3.K(chat, false), chat.title));
            } else {
                t1Var.U = org.telegram.messenger.g0.W2(gd.a0("RevokeLinkAlert", null, 2131745826, mp.u1(this.f30223a).X2 + "/" + v3.K(chat, false), chat.title));
            }
        } else if (this.f58864r2) {
            t1Var.U = org.telegram.messenger.g0.W2(gd.a0("RevokeLinksAlertChannel", null, 2131745822, new Object[0]));
        } else {
            t1Var.U = org.telegram.messenger.g0.W2(gd.a0("RevokeLinksAlert", null, 2131745823, new Object[0]));
        }
        alertDialog$Builder.h(gd.N0(2131752577, null), null);
        alertDialog$Builder.k(gd.N0(2131745828, null), new uc1(18, this, arrayList));
        t1Var.show();
        TextView textView = (TextView) t1Var.d(-1);
        if (textView != null) {
            u6.U(textView, n6.f29692q7, this.J0);
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
            TLRPC.ChatFull P0 = mp.u1(this.f30223a).P0(this.K2.f28492id);
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
        HashSet hashSet = this.f58867u2;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            TLRPC.User user = (TLRPC.User) it.next();
            long P1 = mp.u1(this.f30223a).P1(user.f28641id);
            if (P1 <= 0) {
                P1 = n5.k(mp.u1(this.f30223a).P2(user.f28641id));
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
                arrayList4.add(Long.valueOf(((TLRPC.User) obj).f28641id));
            }
            b5.Z(this.f30223a, arrayList4, 1, new z(this, 0));
            return;
        }
        Iterator it2 = hashSet.iterator();
        boolean z11 = false;
        while (it2.hasNext()) {
            TLRPC.User user2 = (TLRPC.User) it2.next();
            if (hashMap2 == null) {
                longValue = 0;
            } else {
                longValue = ((Long) hashMap2.get(Long.valueOf(user2.f28641id))).longValue();
            }
            boolean z12 = z10;
            Iterator it3 = it2;
            xy b10 = xy.b(str2, user2.f28641id, null, null, null, true, null, null, null, false, 0, 0, null, false);
            b10.Q = longValue;
            zy.C(this.f30223a).r0(b10);
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
