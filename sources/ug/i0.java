package ug;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.v3;
import c8.ha;
import c8.j9;
import c8.ka;
import fi.va;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a8;
import org.telegram.messenger.c20;
import org.telegram.messenger.e3;
import org.telegram.messenger.ez;
import org.telegram.messenger.gp;
import org.telegram.messenger.gz;
import org.telegram.messenger.id;
import org.telegram.messenger.ls;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.t3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.Components.bq;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.Components.si0;
import org.telegram.ui.Components.v4;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.z70;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;
import org.telegram.ui.fk0;
import org.telegram.ui.l00;
import org.telegram.ui.pn;
import org.telegram.ui.rc;
import org.telegram.ui.ww;
public class i0 extends na implements ls {
    public static final int O2 = 0;
    public boolean A2;
    public si0 B2;
    public final f2 C2;
    public l00 D2;
    public androidx.emoji2.text.p E2;
    public boolean F2;
    public TLRPC.Chat G2;
    public final kz H2;
    public Runnable I2;
    public int J2;
    public final fi.d K2;
    public int L2;
    public int M2;
    public String N2;
    public int P1;
    public boolean Q1;
    public int R1;
    public long S1;
    public TL_stories.TL_premium_boostsStatus T1;
    public e3 U1;
    public h0 V1;
    public boolean W1;
    public boolean X1;
    public org.telegram.ui.Cells.q1 Y1;
    public final int Z1;
    public final ArrayList f56604a2;
    public boolean f56605b2;
    public int f56606c2;
    public int d2;
    public int f56607e2;
    public int f56608f2;
    public int f56609g2;
    public int f56610h2;
    public int f56611i2;
    public int f56612j2;
    public int f56613k2;
    public int f56614l2;
    public ArrayList f56615m2;
    public boolean f56616n2;
    public int f56617o2;
    public g0 f56618p2;
    public final HashSet f56619q2;
    public final ArrayList f56620r2;
    public final ArrayList f56621s2;
    public ArrayList f56622t2;
    public ArrayList f56623u2;
    public ArrayList f56624v2;
    public y f56625w2;
    public final TextView f56626x2;
    public fi.d f56627y2;
    public Runnable f56628z2;

    public i0(int i7, int i10, Context context, f2 f2Var, f6 f6Var) {
        super(context, f2Var, false, p1(i7), f6Var);
        this.R1 = -1;
        this.X1 = false;
        this.f56604a2 = new ArrayList();
        this.d2 = -1;
        this.f56607e2 = -1;
        this.f56608f2 = -1;
        this.f56609g2 = -1;
        this.f56610h2 = -1;
        this.f56611i2 = -1;
        this.f56612j2 = -1;
        this.f56613k2 = -1;
        this.f56614l2 = -1;
        this.f56617o2 = -1;
        this.f56619q2 = new HashSet();
        this.f56620r2 = new ArrayList();
        this.f56621s2 = new ArrayList();
        this.f56622t2 = new ArrayList();
        this.f56623u2 = new ArrayList();
        this.f56624v2 = new ArrayList();
        this.A2 = false;
        this.J2 = 0;
        this.M2 = -4;
        O(k6.w0(k6.f27925h5, this.I0));
        this.L2 = this.G0;
        this.C2 = f2Var;
        this.f28616a = i10;
        this.Z1 = i7;
        b1();
        G1();
        if (i7 == 2) {
            this.A2 = true;
            G1();
            ConnectionsManager.getInstance(this.f28616a).sendRequest(new TLRPC.TL_channels_getAdminedPublicChannels(), new u(this, 0));
        } else if (i7 == 5) {
            this.A2 = true;
            G1();
            ConnectionsManager.getInstance(this.f28616a).sendRequest(new TLRPC.TL_channels_getInactiveChannels(), new u(this, 2));
        }
        F1();
        if (i7 == 32 || q1()) {
            kz kzVar = new kz(getContext());
            this.H2 = kzVar;
            this.f28622c.addView(kzVar, ha.c(-1.0f, -1));
        }
        if (i7 == 18 || i7 == 20 || i7 == 24 || i7 == 25 || i7 == 26 || i7 == 29 || i7 == 22 || i7 == 23 || i7 == 21 || i7 == 27 || i7 == 28 || i7 == 30 || i7 == 35 || i7 == 31) {
            ((ViewGroup) this.f56625w2.getParent()).removeView(this.f56625w2);
            l00 l00Var = this.D2;
            if (l00Var != null) {
                ((ViewGroup) l00Var.getParent()).removeView(this.D2);
            }
            this.f36277k1.setPadding(0, 0, 0, 0);
            TextView textView = new TextView(context);
            this.f56626x2 = textView;
            textView.setGravity(17);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setSingleLine(true);
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(org.telegram.messenger.g0.o());
            textView.setText(this.f56625w2.getTextView().getText());
            r6.V(textView, k6.Gi, f6Var);
            textView.setOnClickListener(new t(this, 0));
            int L = org.telegram.messenger.g0.L(8.0f);
            int i11 = k6.Ci;
            int w02 = k6.w0(i11, f6Var);
            int i12 = k6.f27852d6;
            int o4 = i0.a.o(k6.w0(i12, f6Var), 120);
            org.telegram.ui.Cells.y k02 = k6.k0(L, L, L, L, w02, o4, o4);
            n6 N = r6.N(i11);
            n6 h = r6.h(i12, 120);
            textView.setBackground(k02);
            r6.k(textView, k02, N, h, f6Var);
        }
        if (i7 == 32) {
            ((ViewGroup) this.f56625w2.getParent()).removeView(this.f56625w2);
            fi.d dVar = new fi.d(context, f6Var, true);
            this.K2 = dVar;
            dVar.k();
            dVar.i(id.M0(2131753625, null), false, true);
            dVar.setOnClickListener(new t(this, 1));
            this.f28619b.addView(dVar, ha.d(-1, 48.0f, 80, 16.0f, 2.0f, 16.0f, 12.0f));
            this.f28619b.post(new v(this, 3));
        }
        if (i7 != 19 && i7 != 18) {
            return;
        }
        this.f28619b.post(new v(this, 4));
    }

    public static androidx.emoji2.text.p o1(int i7, int i10) {
        ?? obj = new Object();
        obj.f2323a = 0;
        obj.d = null;
        obj.f2326e = null;
        obj.f2327f = null;
        obj.f2324b = 0;
        obj.f2325c = 0;
        if (i7 == 0) {
            obj.f2324b = qp.s1(i10).P4;
            obj.f2325c = qp.s1(i10).Q4;
            obj.f2323a = 2131232201;
            obj.d = id.a0("LimitReachedPinDialogs", null, 2131748955, Integer.valueOf(obj.f2324b), Integer.valueOf(obj.f2325c));
            obj.f2326e = id.a0("LimitReachedPinDialogsPremium", null, 2131748953, Integer.valueOf(obj.f2325c));
            obj.f2327f = id.a0("LimitReachedPinDialogsLocked", null, 2131748954, Integer.valueOf(obj.f2324b));
            return obj;
        } else if (i7 == 33) {
            obj.f2324b = qp.s1(i10).f24841m6;
            obj.f2325c = qp.s1(i10).f24850n6;
            obj.f2323a = 2131232201;
            obj.d = id.a0(null, null, 2131748952, Integer.valueOf(obj.f2324b), Integer.valueOf(obj.f2325c));
            obj.f2326e = id.a0(null, null, 2131748950, Integer.valueOf(obj.f2325c));
            obj.f2327f = id.a0(null, null, 2131748951, Integer.valueOf(obj.f2324b));
            return obj;
        } else if (i7 == 2) {
            obj.f2324b = qp.s1(i10).R4;
            obj.f2325c = qp.s1(i10).S4;
            obj.f2323a = 2131232200;
            obj.d = id.a0("LimitReachedPublicLinks", null, 2131748948, Integer.valueOf(obj.f2324b), Integer.valueOf(obj.f2325c));
            obj.f2326e = id.a0("LimitReachedPublicLinksPremium", null, 2131748946, Integer.valueOf(obj.f2325c));
            obj.f2327f = id.a0("LimitReachedPublicLinksLocked", null, 2131748947, Integer.valueOf(obj.f2324b));
            return obj;
        } else if (i7 == 12) {
            obj.f2324b = qp.s1(i10).f24941x6;
            obj.f2325c = qp.s1(i10).f24951y6;
            obj.f2323a = 2131232200;
            obj.d = id.a0("LimitReachedFolderLinks", null, 2131748961, Integer.valueOf(obj.f2324b), Integer.valueOf(obj.f2325c));
            obj.f2326e = id.a0("LimitReachedFolderLinksPremium", null, 2131748959, Integer.valueOf(obj.f2325c));
            obj.f2327f = id.a0("LimitReachedFolderLinksLocked", null, 2131748960, Integer.valueOf(obj.f2324b));
            return obj;
        } else if (i7 == 13) {
            obj.f2324b = qp.s1(i10).f24960z6;
            obj.f2325c = qp.s1(i10).A6;
            obj.f2323a = 2131232198;
            obj.d = id.a0("LimitReachedSharedFolders", null, 2131748944, Integer.valueOf(obj.f2324b), Integer.valueOf(obj.f2325c));
            obj.f2326e = id.a0("LimitReachedSharedFoldersPremium", null, 2131748942, Integer.valueOf(obj.f2325c));
            obj.f2327f = id.a0("LimitReachedSharedFoldersLocked", null, 2131748943, Integer.valueOf(obj.f2324b));
            return obj;
        } else if (i7 == 3) {
            obj.f2324b = qp.s1(i10).L4;
            obj.f2325c = qp.s1(i10).M4;
            obj.f2323a = 2131232198;
            obj.d = id.a0("LimitReachedFolders", null, 2131748958, Integer.valueOf(obj.f2324b), Integer.valueOf(obj.f2325c));
            obj.f2326e = id.a0("LimitReachedFoldersPremium", null, 2131748956, Integer.valueOf(obj.f2325c));
            obj.f2327f = id.a0("LimitReachedFoldersLocked", null, 2131748957, Integer.valueOf(obj.f2324b));
            return obj;
        } else if (i7 == 4) {
            obj.f2324b = qp.s1(i10).N4;
            obj.f2325c = qp.s1(i10).O4;
            obj.f2323a = 2131232197;
            obj.d = id.a0("LimitReachedChatInFolders", null, 2131748976, Integer.valueOf(obj.f2324b), Integer.valueOf(obj.f2325c));
            obj.f2326e = id.a0("LimitReachedChatInFoldersPremium", null, 2131748974, Integer.valueOf(obj.f2325c));
            obj.f2327f = id.a0("LimitReachedChatInFoldersLocked", null, 2131748975, Integer.valueOf(obj.f2324b));
            return obj;
        } else if (i7 == 5) {
            obj.f2324b = qp.s1(i10).D4;
            obj.f2325c = qp.s1(i10).E4;
            obj.f2323a = 2131232199;
            obj.d = id.a0("LimitReachedCommunities", null, 2131748973, Integer.valueOf(obj.f2324b), Integer.valueOf(obj.f2325c));
            obj.f2326e = id.a0("LimitReachedCommunitiesPremium", null, 2131748971, Integer.valueOf(obj.f2325c));
            obj.f2327f = id.a0("LimitReachedCommunitiesLocked", null, 2131748972, Integer.valueOf(obj.f2324b));
            return obj;
        } else if (i7 == 6) {
            obj.f2324b = 100;
            obj.f2325c = 200;
            obj.f2323a = 2131232198;
            obj.d = id.a0("LimitReachedFileSize", null, 2131748964, "2 GB", "4 GB");
            obj.f2326e = id.a0("LimitReachedFileSizePremium", null, 2131748962, "4 GB");
            obj.f2327f = id.a0("LimitReachedFileSizeLocked", null, 2131748963, "2 GB");
            return obj;
        } else if (i7 == 7) {
            obj.f2324b = 3;
            obj.f2325c = 4;
            obj.f2323a = 2131232196;
            obj.d = id.a0("LimitReachedAccounts", null, 2131748978, 3, Integer.valueOf(obj.f2325c));
            obj.f2326e = id.a0("LimitReachedAccountsPremium", null, 2131748977, Integer.valueOf(obj.f2325c));
            obj.f2327f = id.a0("LimitReachedAccountsPremium", null, 2131748977, Integer.valueOf(obj.f2324b));
            return obj;
        } else if (i7 == 11) {
            obj.f2324b = 0;
            obj.f2325c = 0;
            obj.f2323a = 2131232200;
            obj.d = id.a0("LimitReachedAccounts", null, 2131748978, 0, Integer.valueOf(obj.f2325c));
            obj.f2326e = "";
            obj.f2327f = "";
            return obj;
        } else if (i7 == 14) {
            obj.f2324b = qp.s1(i10).f24808i5;
            obj.f2325c = qp.s1(i10).f24815j5;
            obj.f2323a = 2131232202;
            obj.d = id.H(',', "LimitReachedStoriesCount2First", obj.f2324b) + "\n" + id.H(',', "LimitReachedStoriesCount2Second", obj.f2325c);
            obj.f2326e = id.H(',', "LimitReachedStoriesCount2Premium", obj.f2325c);
            obj.f2327f = id.H(',', "LimitReachedStoriesCount2Premium", obj.f2324b);
            return obj;
        } else if (i7 == 15) {
            obj.f2324b = qp.s1(i10).f24824k5;
            obj.f2325c = qp.s1(i10).f24832l5;
            obj.f2323a = 2131232202;
            obj.d = id.a0("LimitReachedStoriesWeekly", null, 2131748930, Integer.valueOf(obj.f2324b), Integer.valueOf(obj.f2325c));
            obj.f2326e = id.a0("LimitReachedStoriesWeeklyPremium", null, 2131748929, Integer.valueOf(obj.f2325c));
            obj.f2327f = id.a0("LimitReachedStoriesWeeklyPremium", null, 2131748929, Integer.valueOf(obj.f2324b));
            return obj;
        } else if (i7 == 16) {
            obj.f2324b = qp.s1(i10).f24840m5;
            obj.f2325c = qp.s1(i10).f24849n5;
            obj.f2323a = 2131232202;
            obj.d = id.a0("LimitReachedStoriesMonthly", null, 2131748932, Integer.valueOf(obj.f2324b), Integer.valueOf(obj.f2325c));
            obj.f2326e = id.a0("LimitReachedStoriesMonthlyPremium", null, 2131748931, Integer.valueOf(obj.f2325c));
            obj.f2327f = id.a0("LimitReachedStoriesMonthlyPremium", null, 2131748931, Integer.valueOf(obj.f2324b));
            return obj;
        } else if (i7 != 18 && i7 != 32 && i7 != 20 && i7 != 24 && i7 != 27 && i7 != 28 && i7 != 25 && i7 != 30 && i7 != 35 && i7 != 29 && i7 != 22 && i7 != 23 && i7 != 19 && i7 != 21 && i7 != 26) {
            return obj;
        } else {
            obj.f2324b = qp.s1(i10).f24840m5;
            obj.f2325c = qp.s1(i10).f24849n5;
            obj.f2323a = 2131231127;
            obj.d = id.a0("LimitReachedStoriesMonthly", null, 2131748932, Integer.valueOf(obj.f2324b), Integer.valueOf(obj.f2325c));
            obj.f2326e = id.a0("LimitReachedStoriesMonthlyPremium", null, 2131748931, Integer.valueOf(obj.f2325c));
            obj.f2327f = id.a0("LimitReachedStoriesMonthlyPremium", null, 2131748931, Integer.valueOf(obj.f2324b));
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

    public static void w1(f2 f2Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, e3 e3Var, long j3, boolean z9) {
        if (tL_premium_boostsStatus != null && e3Var != null && f2Var.getContext() != null) {
            i0 i0Var = new i0(32, f2Var.getCurrentAccount(), f2Var.getContext(), f2Var, f2Var.getResourceProvider());
            i0Var.A1(e3Var);
            i0Var.z1(tL_premium_boostsStatus, true);
            i0Var.B1(j3);
            if (z9) {
                f2Var.showDialog(i0Var);
            } else {
                i0Var.show();
            }
        }
    }

    public final void A1(e3 e3Var) {
        this.U1 = e3Var;
        E1();
        F1();
    }

    public final void B1(long j3) {
        this.S1 = j3;
        G1();
    }

    public final void C1(TLRPC.Chat chat, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str) {
        boolean z9;
        this.G2 = chat;
        this.N2 = str;
        if (TextUtils.isEmpty(str) && !t3.y(3, chat)) {
            z9 = false;
        } else {
            z9 = true;
        }
        this.Q1 = z9;
        this.f56622t2 = new ArrayList(arrayList);
        this.f56623u2 = arrayList2;
        this.f56624v2 = arrayList3;
        HashSet hashSet = this.f56619q2;
        hashSet.clear();
        if (this.Q1) {
            ArrayList arrayList4 = this.f56622t2;
            int size = arrayList4.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList4.get(i7);
                i7++;
                TLRPC.User user = (TLRPC.User) obj;
                if (arrayList2 == null || !arrayList2.contains(Long.valueOf(user.f27105id))) {
                    hashSet.add(user);
                }
            }
        }
        G1();
        E1();
        int i10 = this.Z1;
        if ((i10 == 11 || i10 == 34) && !qp.s1(this.f28616a).D3()) {
            if (((arrayList3 != null && !arrayList3.isEmpty()) || (arrayList2 != null && arrayList2.size() >= this.f56622t2.size())) && arrayList3 != null && arrayList2 != null) {
                if ((arrayList3.size() == 1 && arrayList2.size() == 1) || arrayList2.size() >= arrayList3.size()) {
                    y yVar = this.f56625w2;
                    if (yVar != null && yVar.getParent() != null) {
                        ((ViewGroup) this.f56625w2.getParent()).removeView(this.f56625w2);
                    }
                    l00 l00Var = this.D2;
                    if (l00Var != null && l00Var.getParent() != null) {
                        ((ViewGroup) this.D2.getParent()).removeView(this.D2);
                    }
                    pj0 pj0Var = this.f36277k1;
                    if (pj0Var != null) {
                        pj0Var.setPadding(0, 0, 0, 0);
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
        this.f56615m2 = new ArrayList();
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.T1;
        if (tL_premium_boostsStatus != null) {
            i7 = tL_premium_boostsStatus.level + 1;
        } else {
            i7 = 1;
        }
        if (this.Z1 == 31) {
            i7 = 1;
        }
        qp s12 = qp.s1(this.f28616a);
        gp gpVar = s12.f24874q4;
        if (gpVar != null) {
            i10 = gpVar.e(r1());
        } else {
            i10 = 0;
        }
        int max2 = Math.max(10, i10);
        gp gpVar2 = s12.f24884r4;
        if (gpVar2 != null) {
            i11 = gpVar2.e(r1());
        } else {
            i11 = 0;
        }
        int max3 = Math.max(max2, i11);
        if (r1()) {
            max = Math.max(Math.max(Math.max(Math.max(Math.max(max3, s12.A5), s12.f24950y5), s12.f24959z5), s12.f24930w5), s12.f24920v5);
        } else {
            max = Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(Math.max(max3, s12.f24875q5), s12.f24885r5), s12.s5), s12.f24903t5), s12.f24911u5), s12.f24958z4), s12.A4);
        }
        ArrayList arrayList = null;
        while (i7 <= max) {
            boolean r12 = r1();
            ArrayList arrayList2 = new ArrayList();
            qp s13 = qp.s1(this.f28616a);
            if (!r12 && i7 >= s13.A4) {
                arrayList2.add(d0.a(2131231819, 2131753660));
            }
            d0 b10 = d0.b(2131231816, i7, "BoostFeatureStoriesPerDay");
            b10.f56547f = true;
            arrayList2.add(b10);
            if (!r12) {
                d0 b11 = d0.b(2131231811, i7, "BoostFeatureCustomReaction");
                b11.f56547f = true;
                arrayList2.add(b11);
            }
            gp gpVar3 = s13.f24874q4;
            if (gpVar3 != null) {
                i12 = gpVar3.a(i7, false);
            } else {
                i12 = 0;
            }
            gp gpVar4 = s13.f24884r4;
            if (gpVar4 != null) {
                i13 = gpVar4.a(i7, r12);
            } else {
                i13 = 0;
            }
            if (!r12 && i12 > 0) {
                arrayList2.add(d0.b(2131231797, 7, "BoostFeatureNameColor"));
            }
            if (!r12 && i12 > 0) {
                arrayList2.add(d0.b(2131231805, i12, "BoostFeatureReplyColor"));
            }
            if (!r12 && i7 >= s13.f24875q5) {
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
            if (r12 && i7 >= s13.f24940x5) {
                arrayList2.add(d0.a(2131231808, 2131753651));
            }
            if ((!r12 && i7 >= s13.f24885r5) || (r12 && i7 >= s13.f24920v5)) {
                if (r12) {
                    i15 = 2131753637;
                } else {
                    i15 = 2131753638;
                }
                arrayList2.add(d0.a(2131231799, i15));
            }
            if (r12 && i7 >= s13.A5) {
                arrayList2.add(d0.a(2131231822, 2131753628));
            }
            if ((!r12 && i7 >= s13.s5) || (r12 && i7 >= s13.f24930w5)) {
                arrayList2.add(new d0(2131231815, 2131753647, -1, "1000+", null));
            }
            if ((!r12 && i7 >= s13.f24903t5) || (r12 && i7 >= s13.f24950y5)) {
                if (r12) {
                    str = "BoostFeatureBackgroundGroup";
                } else {
                    str = "BoostFeatureBackground";
                }
                arrayList2.add(d0.b(2131231823, 8, str));
            }
            if ((!r12 && i7 >= s13.f24911u5) || (r12 && i7 >= s13.f24959z5)) {
                if (r12) {
                    i14 = 2131753652;
                } else {
                    i14 = 2131753653;
                }
                arrayList2.add(d0.a(2131231801, i14));
            }
            if (!r12 && i7 >= s13.f24958z4) {
                arrayList2.add(d0.a(2131231807, 2131753629));
            }
            Collections.reverse(arrayList2);
            if (arrayList != null && arrayList.size() == arrayList2.size()) {
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    d0 d0Var = (d0) arrayList.get(i16);
                    d0 d0Var2 = (d0) arrayList2.get(i16);
                    int i17 = d0Var.f56546e;
                    if (d0Var2 != null && ((d0Var.f56547f && i17 > 2) || (d0Var.f56543a == d0Var2.f56543a && d0Var.f56544b == d0Var2.f56544b && TextUtils.equals(d0Var.f56545c, d0Var2.f56545c) && TextUtils.equals(d0Var.d, d0Var2.d) && i17 == d0Var2.f56546e))) {
                    }
                }
                i7++;
            }
            ArrayList arrayList3 = this.f56615m2;
            arrayList3.add(new c0(i7, arrayList3.isEmpty()));
            this.f56615m2.addAll(arrayList2);
            arrayList = arrayList2;
            i7++;
        }
    }

    public final void E1() {
        int i7;
        String str = null;
        if (this.f56605b2) {
            this.f56625w2.c(id.M0(2131749131, null), false, false);
            return;
        }
        int i10 = this.Z1;
        if (i10 != 19 && i10 != 32 && !s1()) {
            HashSet hashSet = this.f56619q2;
            if (i10 != 11 && i10 != 34) {
                if (hashSet.size() > 0) {
                    if (i10 == 2) {
                        str = id.G(hashSet.size(), "RevokeLinks", new Object[0]);
                    } else if (i10 == 5) {
                        str = id.G(hashSet.size(), "LeaveCommunities", new Object[0]);
                    }
                    this.f56625w2.c(str, true, true);
                    return;
                }
                y yVar = this.f56625w2;
                yVar.f56759r = false;
                yVar.d(true);
                return;
            }
            y yVar2 = this.f56625w2;
            if (yVar2.I == null) {
                cq cqVar = new cq(yVar2.getContext(), null);
                yVar2.I = cqVar;
                cqVar.setGravity(3);
                cq cqVar2 = yVar2.I;
                int i11 = k6.Ci;
                int i12 = k6.Gi;
                bq bqVar = cqVar2.f32663a;
                bqVar.v = i11;
                bqVar.f32324w = i12;
                bqVar.f32306b = 0.8f;
                yVar2.setClipChildren(false);
                yVar2.addView(yVar2.I, ha.e(-1, 24, 16));
            }
            if (!this.Q1) {
                this.f56625w2.c(id.M0(2131752041, null), true, true);
            } else if (hashSet.size() > 0) {
                this.f56625w2.c(id.M0(2131745622, null), true, true);
            } else {
                this.f56625w2.c(id.M0(2131754557, null), true, true);
            }
            this.f56625w2.I.f32663a.c(hashSet.size(), true);
            this.f56625w2.invalidate();
            return;
        }
        e3 e3Var = this.U1;
        boolean z9 = e3Var.f22171a;
        if ((z9 || e3Var.f22172b) && !e3Var.f22180l && !e3Var.d) {
            if (e3Var.f22181m) {
                this.f56625w2.c(id.M0(2131747832, null), true, true);
                return;
            }
            y yVar3 = this.f56625w2;
            yVar3.f56759r = false;
            yVar3.d(true);
            return;
        }
        fi.d dVar = this.K2;
        if (z9) {
            if (wg.s.i()) {
                this.f56625w2.c(id.M0(2131753591, null), true, true);
            } else {
                y yVar4 = this.f56625w2;
                if (r1()) {
                    i7 = 2131753625;
                } else {
                    i7 = 2131753663;
                }
                yVar4.c(id.M0(i7, null), true, true);
            }
            this.f56627y2.i(id.M0(2131753664, null), true, true);
            if (dVar != null) {
                dVar.i(id.M0(2131753625, null), true, true);
            }
        } else if (e3Var.f22181m) {
            this.f56627y2.i(id.M0(2131747832, null), true, true);
            if (dVar != null) {
                dVar.i(id.M0(2131747832, null), true, true);
            }
            this.f56625w2.c(id.M0(2131747832, null), true, true);
        } else if (wg.s.i()) {
            if (dVar != null) {
                dVar.i(id.M0(2131753625, null), true, true);
            }
            this.f56627y2.i(id.M0(2131753664, null), true, true);
            this.f56625w2.c(id.M0(2131753591, null), true, true);
        } else {
            if (dVar != null) {
                dVar.i(id.M0(2131747832, null), true, true);
            }
            this.f56627y2.i(id.M0(2131747832, null), true, true);
            this.f56625w2.c(id.M0(2131747832, null), true, true);
        }
    }

    public final void F1() {
        String M0;
        if (this.f56605b2) {
            this.f56625w2.c(id.M0(2131749131, null), false, false);
            return;
        }
        int i7 = this.Z1;
        if (i7 != 19 && i7 != 32 && !s1()) {
            if (i7 != 18 && i7 != 20 && i7 != 24 && i7 != 25 && i7 != 26 && i7 != 29 && i7 != 22 && i7 != 23 && i7 != 21 && i7 != 27 && i7 != 28 && i7 != 30 && i7 != 35) {
                if (!p10.i(this.f28616a).q() && !qp.s1(this.f28616a).D3() && !this.F2) {
                    this.f56625w2.f56757f.setText(id.M0(2131749200, null));
                    androidx.emoji2.text.p pVar = this.E2;
                    if (pVar != null) {
                        int i10 = pVar.f2324b;
                        int i11 = i10 + 1;
                        int i12 = pVar.f2325c;
                        if (i11 == i12) {
                            this.f56625w2.setIcon(2131623936);
                            return;
                        }
                        if (i10 != 0 && i12 != 0) {
                            float f10 = i12 / i10;
                            if (f10 >= 1.6f && f10 <= 2.5f) {
                                this.f56625w2.setIcon(2131624001);
                                return;
                            }
                        }
                        y yVar = this.f56625w2;
                        yVar.D.f39383p = null;
                        yVar.F.setVisibility(8);
                        return;
                    }
                    y yVar2 = this.f56625w2;
                    yVar2.D.f39383p = null;
                    yVar2.F.setVisibility(8);
                    return;
                }
                this.f56625w2.f56757f.setText(id.M0(2131747832, null));
                y yVar3 = this.f56625w2;
                yVar3.D.f39383p = null;
                yVar3.F.setVisibility(8);
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d ");
            spannableStringBuilder.setSpan(new wp(2131232104, 0), 0, 1, 0);
            spannableStringBuilder.append((CharSequence) id.M0(2131751762, null));
            this.f56625w2.f56757f.setText(spannableStringBuilder);
            return;
        }
        int i13 = 2131753663;
        if (wg.s.i()) {
            o0 o0Var = this.f56625w2.f56757f;
            e3 e3Var = this.U1;
            if (e3Var != null && e3Var.d) {
                M0 = id.M0(2131753591, null);
            } else {
                if (r1()) {
                    i13 = 2131753625;
                }
                M0 = id.M0(i13, null);
            }
            o0Var.setText(M0);
            e3 e3Var2 = this.U1;
            if (e3Var2 != null && e3Var2.f22181m) {
                this.f56625w2.f56757f.setText(id.M0(2131747832, null));
                return;
            }
            return;
        }
        o0 o0Var2 = this.f56625w2.f56757f;
        if (r1()) {
            i13 = 2131753625;
        }
        o0Var2.setText(id.M0(i13, null));
    }

    public final void G1() {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        this.f56607e2 = -1;
        this.f56609g2 = -1;
        this.f56610h2 = -1;
        this.f56611i2 = -1;
        this.R1 = -1;
        this.f56612j2 = -1;
        this.f56614l2 = -1;
        this.f56606c2 = 1;
        this.d2 = 0;
        int i7 = this.Z1;
        if (i7 != 19 && i7 != 18 && i7 != 20 && i7 != 24 && i7 != 27 && i7 != 28 && i7 != 22 && i7 != 23 && i7 != 25 && i7 != 26 && i7 != 29 && i7 != 21 && i7 != 30 && i7 != 35) {
            if (i7 != 31 && i7 != 32) {
                if (!p1(i7)) {
                    if (i7 != 11 && i7 != 34) {
                        int i10 = this.f56606c2;
                        this.f56607e2 = i10;
                        this.f56606c2 = i10 + 2;
                        this.f56608f2 = i10 + 1;
                    } else {
                        this.f36282r1 = 0.24f;
                    }
                    if (this.A2) {
                        int i11 = this.f56606c2;
                        this.f56606c2 = i11 + 1;
                        this.f56611i2 = i11;
                    } else if (i7 != 11 || this.Q1) {
                        if (i7 != 11 || qp.s1(this.f28616a).D3() || ((((arrayList = this.f56624v2) == null || arrayList.isEmpty()) && ((arrayList2 = this.f56623u2) == null || arrayList2.size() < this.f56622t2.size())) || (arrayList3 = this.f56624v2) == null || arrayList3.size() != 1 || (arrayList4 = this.f56623u2) == null || arrayList4.size() != 1 || !this.Q1)) {
                            int i12 = this.f56606c2;
                            this.f56609g2 = i12;
                            if (i7 != 11 && i7 != 34) {
                                if (i7 == 5) {
                                    this.f56606c2 = this.f56620r2.size() + i12;
                                } else {
                                    this.f56606c2 = this.f56604a2.size() + i12;
                                }
                            } else {
                                this.f56606c2 = this.f56622t2.size() + i12;
                            }
                            this.f56610h2 = this.f56606c2;
                        }
                        if (this.f56610h2 - this.f56609g2 > 1) {
                            int i13 = this.f56606c2;
                            this.f56606c2 = i13 + 1;
                            this.f56612j2 = i13;
                        }
                    }
                }
            } else {
                this.f36282r1 = 0.24f;
                D1();
                int i14 = this.f56606c2;
                this.f56609g2 = i14;
                int i15 = i14 + 1;
                this.f56606c2 = i15;
                this.f56614l2 = i14;
                int size = (this.f56615m2.size() - 1) + i15;
                this.f56606c2 = size;
                this.f56610h2 = size;
            }
        } else {
            if (i7 != 19 || t3.N(n1())) {
                this.f36282r1 = 0.24f;
                int i16 = this.f56606c2;
                this.f56606c2 = i16 + 1;
                this.R1 = i16;
                if (qp.s1(this.f28616a).f24865p4) {
                    int i17 = this.f56606c2;
                    this.f56606c2 = i17 + 1;
                    this.f56613k2 = i17;
                }
            }
            D1();
            int i18 = this.f56606c2;
            int i19 = i18 + 1;
            this.f56606c2 = i19;
            this.f56614l2 = i18;
            this.f56606c2 = (this.f56615m2.size() - 1) + i19;
        }
        this.f36277k1.getAdapter().f();
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        return new b0(this);
    }

    @Override
    public final CharSequence O0() {
        int i7 = this.Z1;
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
                            return id.M0(2131743877, null);
                        case 19:
                        case 30:
                            if (!r1()) {
                                i10 = 2131753663;
                            }
                            return id.M0(i10, null);
                        case 31:
                            return id.M0(2131753600, null);
                        case 32:
                            return id.M0(2131753625, null);
                        default:
                            return id.M0(2131748979, null);
                    }
                }
                return id.M0(2131743877, null);
            }
            return id.M0(2131752622, null);
        }
        return id.M0(2131752401, null);
    }

    @Override
    public final void U0(rt0 rt0Var) {
        int i7;
        Context context = rt0Var.getContext();
        fi.d dVar = new fi.d(context, this.I0, true);
        this.f56627y2 = dVar;
        dVar.setFlickeringLoading(true);
        this.f56627y2.i(id.M0(2131753664, null), false, true);
        this.f56627y2.setOnClickListener(new t(this, 2));
        y yVar = new y(this, context, this.I0);
        this.f56625w2 = yVar;
        ka.b(yVar, 0.02f, 1.2f);
        if (!this.f36280p1 && (i7 = this.Z1) != 18 && i7 != 20 && i7 != 24 && i7 != 25 && i7 != 26 && i7 != 29 && i7 != 22 && i7 != 23 && i7 != 21 && i7 != 27 && i7 != 28 && i7 != 30 && i7 != 35) {
            l00 l00Var = new l00(13, context, this);
            this.D2 = l00Var;
            r6.i(k6.f27925h5, l00Var, this.I0);
            rt0Var.addView(this.D2, ha.d(-1, 72.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        y yVar2 = this.f56625w2;
        float f10 = (this.f28649t0 / org.telegram.messenger.g0.f22562p) + 16.0f;
        rt0Var.addView(yVar2, ha.d(-1, 48.0f, 80, f10, 0.0f, f10, 12.0f));
        int L = org.telegram.messenger.g0.L(72.0f);
        pj0 pj0Var = this.f36277k1;
        pj0Var.setPadding(0, 0, 0, L);
        pj0Var.setClipToPadding(false);
        pj0Var.setClipChildren(false);
        pj0Var.setOnItemClickListener(new ai.k(this, 21));
        pj0Var.setOnItemLongClickListener(new w(this, 2));
        this.f56625w2.f56761w.setOnClickListener(new fk0(28, this, context));
        this.f56625w2.h.setOnClickListener(new t(this, 3));
        this.B2 = new si0(pj0Var, true);
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        boolean z9;
        TLRPC.ChatFull N0;
        f2 f2Var;
        f2 f2Var2;
        if (i7 == qs.V2) {
            TLRPC.Chat chat = (TLRPC.Chat) objArr[0];
            boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
            f2 f2Var3 = this.f36279o1;
            f2 lastFragment = f2Var3.getParentLayout().getLastFragment();
            f2 f2Var4 = null;
            if (lastFragment instanceof ch.o) {
                List fragmentStack = f2Var3.getParentLayout().getFragmentStack();
                if (fragmentStack.size() >= 2) {
                    f2Var = (f2) rf.b.g(2, fragmentStack);
                } else {
                    f2Var = null;
                }
                if (fragmentStack.size() >= 3) {
                    f2Var2 = (f2) rf.b.g(3, fragmentStack);
                } else {
                    f2Var2 = null;
                }
                if (fragmentStack.size() >= 4) {
                    f2Var4 = (f2) rf.b.g(4, fragmentStack);
                }
                if (f2Var instanceof pn) {
                    ((ActionBarLayout) f2Var3.getParentLayout()).d0(f2Var, false);
                }
                dismiss();
                if (booleanValue) {
                    if (f2Var2 instanceof ProfileActivity) {
                        ((ActionBarLayout) f2Var3.getParentLayout()).d0(f2Var2, false);
                    }
                    lastFragment.finishFragment();
                    wg.h.f(f2Var4, chat, true);
                    return;
                }
                lastFragment.finishFragment();
                wg.h.f(f2Var2, chat, false);
            } else if ((lastFragment instanceof an) && booleanValue) {
                wg.h.f(lastFragment, chat, true);
            } else if ((lastFragment instanceof rc) && booleanValue) {
                List fragmentStack2 = f2Var3.getParentLayout().getFragmentStack();
                ArrayList arrayList = new ArrayList();
                for (int size = fragmentStack2.size() - 2; size >= 0; size--) {
                    f2 f2Var5 = (f2) fragmentStack2.get(size);
                    if (!(f2Var5 instanceof an) && !(f2Var5 instanceof ww)) {
                        arrayList.add(f2Var5);
                    } else {
                        f2Var4 = f2Var5;
                        break;
                    }
                }
                if (f2Var4 != null) {
                    int size2 = arrayList.size();
                    int i11 = 0;
                    while (i11 < size2) {
                        Object obj = arrayList.get(i11);
                        i11++;
                        ((ActionBarLayout) f2Var3.getParentLayout()).d0((f2) obj, false);
                    }
                    f2Var3.finishFragment();
                    dismiss();
                    wg.h.f(f2Var4, chat, true);
                }
            } else if (booleanValue) {
                va vaVar = va.F2;
                if (vaVar != null && vaVar.d) {
                    an ra2 = an.ra(-chat.f26956id);
                    LaunchActivity.Q().presentFragment(ra2, false, false);
                    va.w();
                    dismiss();
                    wg.h.f(ra2, chat, true);
                    return;
                }
                List fragmentStack3 = f2Var3.getParentLayout().getFragmentStack();
                if (fragmentStack3.size() >= 2) {
                    f2Var4 = (f2) rf.b.g(2, fragmentStack3);
                }
                f2Var3.finishFragment();
                dismiss();
                if (f2Var4 instanceof an) {
                    wg.h.f(f2Var4, chat, true);
                }
            } else {
                va vaVar2 = va.F2;
                if (vaVar2 != null && vaVar2.d) {
                    an ra3 = an.ra(-chat.f26956id);
                    LaunchActivity.Q().presentFragment(ra3, false, false);
                    va.w();
                    dismiss();
                    wg.h.f(ra3, chat, false);
                    return;
                }
                dismiss();
                wg.h.f(LaunchActivity.Q(), chat, false);
            }
        } else if (i7 == qs.U2) {
            TL_stories.TL_premium_myBoosts tL_premium_myBoosts = (TL_stories.TL_premium_myBoosts) objArr[0];
            int intValue = ((Integer) objArr[1]).intValue();
            int intValue2 = ((Integer) objArr[2]).intValue();
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) objArr[3];
            if (tL_premium_boostsStatus != null && this.U1 != null) {
                this.T1.boosts += intValue;
                if (this.Z1 == 32 && (N0 = qp.s1(this.f28616a).N0(-this.S1)) != null) {
                    N0.boosts_applied += intValue;
                }
                t1();
                z1(tL_premium_boostsStatus, this.W1);
                e3 e3Var = this.U1;
                if (this.T1.next_level_boosts <= 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                e3Var.f22181m = z9;
                e3Var.f22180l = true;
                e3Var.a(tL_premium_myBoosts);
                if (v1()) {
                    cc Q = new hc(this.f28622c, this.I0).Q(2131624050, 30, id.G(intValue, "BoostingReassignedFromPlural", id.G(intValue2, "BoostingFromOtherChannel", new Object[0])));
                    Q.f32545j = 4000;
                    Q.k(true);
                }
            }
        } else if (i7 == qs.T2) {
            dismiss();
        }
    }

    public final void h1(final z70 z70Var, boolean z9) {
        if (z70Var.a() && !z9) {
            return;
        }
        z70Var.setLoading(true);
        qp.s1(this.f28616a).G0();
        wg.s.a(-this.S1, Arrays.asList(Integer.valueOf(this.U1.f22176g)), new c20(this) {
            public final i0 f56861b;

            {
                this.f56861b = this;
            }

            @Override
            public final void a(Object obj) {
                switch (r3) {
                    case 0:
                        i0 i0Var = this.f56861b;
                        qp.s1(i0Var.f28616a).G0().a(i0Var.S1, new v3(i0Var, z70Var, (TL_stories.TL_premium_myBoosts) obj, 11));
                        return;
                    default:
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                        boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                        z70 z70Var2 = z70Var;
                        if (startsWith) {
                            int intValue = Utilities.z(tL_error.text).intValue();
                            if (intValue <= 5) {
                                org.telegram.messenger.g0.i3(new u9.f(3, this.f56861b, z70Var2), intValue * 1000);
                                return;
                            }
                            wg.h.g(intValue);
                        }
                        z70Var2.setLoading(false);
                        return;
                }
            }
        }, new c20(this) {
            public final i0 f56861b;

            {
                this.f56861b = this;
            }

            @Override
            public final void a(Object obj) {
                switch (r3) {
                    case 0:
                        i0 i0Var = this.f56861b;
                        qp.s1(i0Var.f28616a).G0().a(i0Var.S1, new v3(i0Var, z70Var, (TL_stories.TL_premium_myBoosts) obj, 11));
                        return;
                    default:
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                        boolean startsWith = tL_error.text.startsWith("FLOOD_WAIT");
                        z70 z70Var2 = z70Var;
                        if (startsWith) {
                            int intValue = Utilities.z(tL_error.text).intValue();
                            if (intValue <= 5) {
                                org.telegram.messenger.g0.i3(new u9.f(3, this.f56861b, z70Var2), intValue * 1000);
                                return;
                            }
                            wg.h.g(intValue);
                        }
                        z70Var2.setLoading(false);
                        return;
                }
            }
        });
    }

    public final void i1() {
        if (this.f56627y2.isAttachedToWindow()) {
            h1(this.f56627y2, false);
            return;
        }
        fi.d dVar = this.K2;
        if (dVar != null && dVar.isAttachedToWindow()) {
            h1(dVar, false);
        } else {
            h1(this.f56625w2, false);
        }
    }

    public int j1() {
        return 0;
    }

    public final String k1() {
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.T1;
        if (tL_premium_boostsStatus != null && !TextUtils.isEmpty(tL_premium_boostsStatus.boost_url)) {
            return this.T1.boost_url;
        }
        int i7 = this.f28616a;
        long j3 = -this.S1;
        TLRPC.Chat M0 = qp.s1(i7).M0(Long.valueOf(j3));
        if (!TextUtils.isEmpty(t3.K(M0, false))) {
            return "https://t.me/boost/" + t3.K(M0, false);
        }
        return a8.p0.o(j3, "https://t.me/boost/?c=");
    }

    public final String l1(boolean z9) {
        String str;
        boolean z10;
        int i7;
        int i10;
        String str2;
        if (this.Z1 == 32) {
            TLRPC.Chat n1 = n1();
            TLRPC.ChatFull N0 = qp.s1(this.f28616a).N0(-this.S1);
            int max = Math.max(N0.boosts_unrestrict - N0.boosts_applied, 0);
            if (n1 == null) {
                str2 = "";
            } else {
                str2 = n1.title;
            }
            return id.G(max, "BoostingRemoveRestrictionsSubtitle", str2);
        }
        TLRPC.Chat M0 = qp.s1(this.f28616a).M0(Long.valueOf(-this.S1));
        if (M0 == null) {
            if (r1()) {
                i10 = 2131754876;
            } else {
                i10 = 2131754904;
            }
            str = id.M0(i10, null);
        } else {
            str = M0.title;
        }
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.T1;
        if (tL_premium_boostsStatus.boosts == tL_premium_boostsStatus.current_level_boosts) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = 2131752352;
        if (s1() && this.T1.next_level_boosts != 0 && z9) {
            if (r1()) {
                i11 = 2131749421;
            }
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus2 = this.T1;
            int i12 = tL_premium_boostsStatus2.next_level_boosts - tL_premium_boostsStatus2.boosts;
            return id.a0(null, null, i11, str, id.G(i12, "MoreBoosts", Integer.valueOf(i12)));
        }
        int i13 = 2131752449;
        if (z10 && this.U1.d) {
            if (this.T1.level == 1) {
                if (r1()) {
                    i7 = 2131749494;
                } else {
                    i7 = 2131752450;
                }
                return id.a0(null, null, i7, new Object[0]);
            }
            if (r1()) {
                i13 = 2131749493;
            }
            return id.a0(null, null, i13, Integer.valueOf(this.T1.level), id.G(this.T1.level, "BoostStories", new Object[0]));
        } else if (this.U1.d) {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus3 = this.T1;
            if (tL_premium_boostsStatus3.level == 0) {
                if (r1()) {
                    i11 = 2131749421;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus4 = this.T1;
                int i14 = tL_premium_boostsStatus4.next_level_boosts - tL_premium_boostsStatus4.boosts;
                return id.a0(null, null, i11, str, id.G(i14, "MoreBoosts", Integer.valueOf(i14)));
            } else if (tL_premium_boostsStatus3.next_level_boosts == 0) {
                if (r1()) {
                    i13 = 2131749493;
                }
                return id.a0(null, null, i13, Integer.valueOf(this.T1.level), id.G(this.T1.level + 1, "BoostStories", new Object[0]));
            } else {
                if (r1()) {
                    i11 = 2131749421;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus5 = this.T1;
                int i15 = tL_premium_boostsStatus5.next_level_boosts - tL_premium_boostsStatus5.boosts;
                return id.a0(null, null, i11, str, id.G(i15, "MoreBoosts", Integer.valueOf(i15)));
            }
        } else {
            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus6 = this.T1;
            if (tL_premium_boostsStatus6.level == 0) {
                if (r1()) {
                    i11 = 2131749421;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus7 = this.T1;
                int i16 = tL_premium_boostsStatus7.next_level_boosts - tL_premium_boostsStatus7.boosts;
                return id.a0(null, null, i11, str, id.G(i16, "MoreBoosts", Integer.valueOf(i16)));
            } else if (tL_premium_boostsStatus6.next_level_boosts == 0) {
                if (r1()) {
                    i13 = 2131749493;
                }
                return id.a0(null, null, i13, Integer.valueOf(this.T1.level), id.G(this.T1.level + 1, "BoostStories", new Object[0]));
            } else {
                if (r1()) {
                    i11 = 2131749421;
                }
                TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus8 = this.T1;
                int i17 = tL_premium_boostsStatus8.next_level_boosts - tL_premium_boostsStatus8.boosts;
                return id.a0(null, null, i11, str, id.G(i17, "MoreBoosts", Integer.valueOf(i17)));
            }
        }
    }

    public final String m1() {
        int i7;
        int i10;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.T1;
        if (tL_premium_boostsStatus.next_level_boosts == 0) {
            return id.a0("BoostsMaxLevelReached", null, 2131753158, new Object[0]);
        }
        int i11 = 2131753663;
        if (tL_premium_boostsStatus.level > 0 && !this.U1.d) {
            if (r1()) {
                i11 = 2131753625;
            }
            return id.M0(i11, null);
        }
        boolean z9 = this.W1;
        int i12 = this.Z1;
        if (z9) {
            if (i12 == 32) {
                if (r1()) {
                    i11 = 2131753625;
                }
                return id.M0(i11, null);
            }
            TLRPC.Chat M0 = qp.s1(this.f28616a).M0(Long.valueOf(-this.S1));
            if (this.U1.d) {
                return id.a0("YouBoostedChannel2", null, 2131742843, M0.title);
            }
            if (r1()) {
                i11 = 2131753625;
            }
            return id.M0(i11, null);
        } else if (i12 == 32) {
            if (r1()) {
                i11 = 2131753625;
            }
            return id.M0(i11, null);
        } else if (this.U1.d) {
            if (r1()) {
                i10 = 2131742842;
            } else {
                i10 = 2131742844;
            }
            return id.M0(i10, null);
        } else {
            if (r1()) {
                i7 = 2131753527;
            } else {
                i7 = 2131753528;
            }
            return id.M0(i7, null);
        }
    }

    public final TLRPC.Chat n1() {
        return qp.s1(this.f28616a).M0(Long.valueOf(-this.S1));
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        qs.f(this.f28616a).c(this, qs.V2);
        qs.f(this.f28616a).c(this, qs.U2);
        qs.f(this.f28616a).c(this, qs.T2);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        qs.f(this.f28616a).n(this, qs.V2);
        qs.f(this.f28616a).n(this, qs.U2);
        qs.f(this.f28616a).n(this, qs.T2);
    }

    public final boolean q1() {
        int i7 = this.Z1;
        if (i7 != 19 && i7 != 18 && i7 != 20 && i7 != 24 && i7 != 25 && i7 != 26 && i7 != 29 && i7 != 22 && i7 != 27 && i7 != 28 && i7 != 23 && i7 != 30 && i7 != 35) {
            return false;
        }
        return true;
    }

    public final boolean r1() {
        return !t3.V(qp.s1(this.f28616a).M0(Long.valueOf(-this.S1)));
    }

    @Override
    public final void s0() {
        int w02;
        super.s0();
        try {
            if (this.F0 < 0 && this.G0 == this.L2 && (w02 = k6.w0(k6.f27925h5, this.I0)) != this.G0) {
                this.G0 = w02;
                this.L2 = w02;
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
        g0 g0Var = this.f56618p2;
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.T1;
        int i10 = tL_premium_boostsStatus.boosts;
        int i11 = tL_premium_boostsStatus.next_level_boosts - tL_premium_boostsStatus.current_level_boosts;
        g0Var.f31451b++;
        g0Var.f31449a = j9.a((i10 - i7) / i11, 0.0f, 1.0f);
        g0Var.W = true;
        g0Var.f31450a0 = g0Var.f31466n;
        g0Var.i(i10, true);
        g0Var.I.requestLayout();
        g0Var.requestLayout();
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
        qs f10 = qs.f(this.f28616a);
        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = this.T1;
        e3 e3Var = this.U1;
        e3Var.getClass();
        e3 e3Var2 = new e3();
        e3Var2.f22171a = e3Var.f22171a;
        e3Var2.f22172b = e3Var.f22172b;
        e3Var2.f22173c = e3Var.f22173c;
        e3Var2.d = e3Var.d;
        e3Var2.f22174e = e3Var.f22174e;
        e3Var2.f22176g = e3Var.f22176g;
        e3Var2.h = e3Var.h;
        e3Var2.f22177i = e3Var.f22177i;
        e3Var2.f22178j = e3Var.f22178j;
        e3Var2.f22179k = e3Var.f22179k;
        e3Var2.f22181m = e3Var.f22181m;
        f10.m(qs.f25054p3, tL_premium_boostsStatus, e3Var2, Long.valueOf(this.S1));
        fi.d dVar = this.K2;
        if (dVar != null) {
            TLRPC.ChatFull N0 = qp.s1(this.f28616a).N0(-this.S1);
            int max = Math.max(N0.boosts_unrestrict - N0.boosts_applied, 0);
            if (max == 0) {
                qs.f(this.f28616a).m(qs.f25049o3, new Object[0]);
                dismiss();
                return false;
            }
            dVar.c(max, true);
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new org.telegram.ui.ActionBar.i0(5));
        transitionSet.setOrdering(0);
        TransitionManager.beginDelayedTransition(this.V1, transitionSet);
        h0 h0Var = this.V1;
        wg.b bVar = h0Var.f56599c;
        int indexOfChild = h0Var.indexOfChild(h0Var.f56598b);
        i0 i0Var = h0Var.f56600e;
        if (i0Var.W1) {
            int indexOfChild2 = h0Var.indexOfChild(h0Var.d);
            h0Var.removeView(h0Var.d);
            h0Var.d.removeView(h0Var.f56597a);
            h0Var.d.removeView(bVar);
            LinearLayout linearLayout = new LinearLayout(h0Var.getContext());
            h0Var.d = linearLayout;
            linearLayout.setOrientation(0);
            h0Var.d.setWeightSum(1.0f);
            h0Var.d.addView(h0Var.f56597a, ha.p(-2, -2, 1.0f, 0));
            h0Var.d.addView(bVar, ha.t(-2, -2, 48, 0, 2, 0, 0));
            h0Var.addView(h0Var.d, indexOfChild2, ha.t(-2, -2, 1, 25, 22, 12, 9));
        } else {
            int indexOfChild3 = h0Var.indexOfChild(h0Var.f56597a);
            h0Var.removeView(h0Var.f56597a);
            TextView textView = new TextView(h0Var.getContext());
            h0Var.f56597a = textView;
            textView.setTypeface(org.telegram.messenger.g0.o());
            h0Var.f56597a.setTextSize(1, 20.0f);
            r6.V(h0Var.f56597a, k6.G6, i0Var.I0);
            h0Var.f56597a.setGravity(17);
            h0Var.addView(h0Var.f56597a, indexOfChild3, ha.t(-2, -2, 1, 0, 22, 0, 0));
        }
        h0Var.removeView(h0Var.f56598b);
        TextView textView2 = new TextView(h0Var.getContext());
        h0Var.f56598b = textView2;
        textView2.setTextSize(1, 14.0f);
        TextView textView3 = h0Var.f56598b;
        textView3.setLineSpacing(textView3.getLineSpacingExtra(), h0Var.f56598b.getLineSpacingMultiplier() * 1.1f);
        h0Var.f56598b.setGravity(1);
        r6.V(h0Var.f56598b, k6.G6, i0Var.I0);
        h0Var.addView(h0Var.f56598b, indexOfChild, ha.t(-2, -2, 1, 24, -2, 24, 17));
        this.V1.f56597a.setText(m1());
        TextView textView4 = this.V1.f56598b;
        qp s12 = qp.s1(this.f28616a);
        boolean r12 = r1();
        int i22 = this.Z1;
        String str = null;
        if (i22 == 20) {
            if (r12) {
                i21 = 2131749419;
            } else {
                i21 = 2131752349;
            }
            str = id.a0(null, null, i21, Integer.valueOf(j1()));
        } else if (i22 == 24) {
            if (r12) {
                i20 = 2131749415;
            } else {
                i20 = 2131752346;
            }
            str = id.a0(null, null, i20, Integer.valueOf(j1()));
        } else if (i22 == 29) {
            str = id.a0(null, null, 2131749418, Integer.valueOf(s12.f24940x5));
        } else if (i22 == 30) {
            str = id.a0(null, null, 2131752343, Integer.valueOf(s12.f24958z4));
        } else if (i22 == 35) {
            str = id.a0(null, null, 2131752350, Integer.valueOf(s12.A4));
        } else if (i22 == 25) {
            if (r12) {
                i18 = 2131749416;
            } else {
                i18 = 2131752347;
            }
            if (r12) {
                i19 = s12.f24930w5;
            } else {
                i19 = s12.s5;
            }
            str = id.a0(null, null, i18, Integer.valueOf(i19));
        } else if (i22 == 26) {
            if (r12) {
                i16 = 2131749411;
            } else {
                i16 = 2131752341;
            }
            if (r12) {
                i17 = s12.f24930w5;
            } else {
                i17 = s12.s5;
            }
            str = id.a0(null, null, i16, Integer.valueOf(i17));
        } else if (i22 == 27) {
            if (r12) {
                i15 = 2131749413;
            } else {
                i15 = 2131752344;
            }
            str = id.a0(null, null, i15, Integer.valueOf(s12.f24875q5));
        } else if (i22 == 28) {
            if (r12) {
                i13 = 2131749414;
            } else {
                i13 = 2131752345;
            }
            if (r12) {
                i14 = s12.f24920v5;
            } else {
                i14 = s12.f24885r5;
            }
            str = id.a0(null, null, i13, Integer.valueOf(i14));
        } else if (i22 == 22) {
            if (r12) {
                i11 = 2131749412;
            } else {
                i11 = 2131752342;
            }
            if (r12) {
                i12 = s12.f24950y5;
            } else {
                i12 = s12.f24903t5;
            }
            str = id.a0(null, null, i11, Integer.valueOf(i12));
        } else if (i22 == 23) {
            if (r12) {
                i7 = 2131749417;
            } else {
                i7 = 2131752348;
            }
            if (r12) {
                i10 = s12.f24959z5;
            } else {
                i10 = s12.f24911u5;
            }
            str = id.a0(null, null, i7, Integer.valueOf(i10));
        }
        if (str == null) {
            str = l1(false);
        }
        textView4.setText(org.telegram.messenger.g0.X2(str));
        E1();
        kz kzVar = this.H2;
        kzVar.c(false);
        try {
            kzVar.performHapticFeedback(3);
        } catch (Exception unused) {
        }
        this.V1.f56599c.a(this.U1.f22177i, true);
        this.f36277k1.y0(0);
        if (i22 == 32) {
            this.V1.f56599c.setVisibility(8);
        }
        return true;
    }

    public final void x1(ArrayList arrayList) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getContext(), this.I0);
        String G = id.G(arrayList.size(), "RevokeLinks", new Object[0]);
        u1 u1Var = alertDialog$Builder.f27296a;
        u1Var.R = G;
        if (arrayList.size() == 1) {
            TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(0);
            if (this.f56616n2) {
                u1Var.T = org.telegram.messenger.g0.X2(id.a0("RevokeLinkAlertChannel", null, 2131746024, qp.s1(this.f28616a).U2 + "/" + t3.K(chat, false), chat.title));
            } else {
                u1Var.T = org.telegram.messenger.g0.X2(id.a0("RevokeLinkAlert", null, 2131746025, qp.s1(this.f28616a).U2 + "/" + t3.K(chat, false), chat.title));
            }
        } else if (this.f56616n2) {
            u1Var.T = org.telegram.messenger.g0.X2(id.a0("RevokeLinksAlertChannel", null, 2131746021, new Object[0]));
        } else {
            u1Var.T = org.telegram.messenger.g0.X2(id.a0("RevokeLinksAlert", null, 2131746022, new Object[0]));
        }
        alertDialog$Builder.h(id.M0(2131752589, null), null);
        alertDialog$Builder.k(id.M0(2131746027, null), new org.telegram.ui.web.a0(14, this, arrayList));
        u1Var.show();
        TextView textView = (TextView) u1Var.d(-1);
        if (textView != null) {
            r6.V(textView, k6.f28093q7, this.I0);
        }
    }

    public final void y1(HashMap hashMap) {
        String str;
        long longValue;
        ArrayList arrayList;
        HashMap hashMap2 = hashMap;
        if (!TextUtils.isEmpty(this.N2)) {
            str = this.N2;
        } else {
            TLRPC.ChatFull N0 = qp.s1(this.f28616a).N0(this.G2.f26956id);
            if (N0 == null) {
                dismiss();
                return;
            } else if (this.G2.username != null) {
                str = "@" + this.G2.username;
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
        HashSet hashSet = this.f56619q2;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            TLRPC.User user = (TLRPC.User) it.next();
            long N1 = qp.s1(this.f28616a).N1(user.f27105id);
            if (N1 <= 0) {
                N1 = m5.k(qp.s1(this.f28616a).J2(user.f27105id));
            }
            if (N1 >= 0) {
                arrayList = arrayList2;
            } else {
                arrayList = arrayList3;
            }
            arrayList.add(user);
        }
        int i7 = 0;
        boolean z9 = true;
        if (hashMap2 == null && !arrayList2.isEmpty()) {
            ArrayList arrayList4 = new ArrayList();
            int size = arrayList2.size();
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                arrayList4.add(Long.valueOf(((TLRPC.User) obj).f27105id));
            }
            v4.Z(this.f28616a, arrayList4, 1, new ii.c(this, 24));
            return;
        }
        Iterator it2 = hashSet.iterator();
        boolean z10 = false;
        while (it2.hasNext()) {
            TLRPC.User user2 = (TLRPC.User) it2.next();
            if (hashMap2 == null) {
                longValue = 0;
            } else {
                longValue = ((Long) hashMap2.get(Long.valueOf(user2.f27105id))).longValue();
            }
            boolean z11 = z9;
            Iterator it3 = it2;
            ez b10 = ez.b(str2, user2.f27105id, null, null, null, true, null, null, null, false, 0, 0, null, false);
            b10.Q = longValue;
            gz.C(this.f28616a).r0(b10);
            if (b10.Q > 0) {
                z10 = z11;
            }
            hashMap2 = hashMap;
            z9 = z11;
            it2 = it3;
        }
        if (!z10) {
            org.telegram.messenger.g0.h3(new v(this, 2));
        }
        dismiss();
    }

    public final void z1(TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, boolean z9) {
        this.T1 = tL_premium_boostsStatus;
        this.W1 = z9;
        G1();
    }
}
