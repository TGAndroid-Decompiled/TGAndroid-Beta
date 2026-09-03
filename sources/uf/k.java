package uf;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import k7.c6;
import oh.c7;
import oh.t6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.d7;
import org.telegram.ui.Cells.h6;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Cells.n2;
import org.telegram.ui.Cells.o8;
import org.telegram.ui.Cells.r2;
import org.telegram.ui.Cells.u3;
import org.telegram.ui.Cells.va;
import org.telegram.ui.Cells.x2;
import org.telegram.ui.Cells.z2;
import org.telegram.ui.Cells.z6;
import org.telegram.ui.Components.in;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.q30;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.z8;
import org.telegram.ui.dy0;
import org.telegram.ui.h51;
import org.telegram.ui.ly;
import org.telegram.ui.py;
import org.telegram.ui.sj0;
import org.telegram.ui.yh;
public class k extends rl0 implements n2 {
    public static final boolean Z = BuildVars.DEBUG_PRIVATE_VERSION;
    public boolean B;
    public final int C;
    public boolean D;
    public boolean E;
    public long F;
    public boolean G;
    public sl0 H;
    public ri0 I;
    public Drawable L;
    public final h M;
    public boolean N;
    public final py O;
    public boolean P;
    public final TLRPC.RequestPeerType Q;
    public boolean R;
    public final long S;
    public boolean W;
    public boolean X;
    public final Context f48644c;
    public ArrayList d;
    public boolean f48645e;
    public int f48646f;
    public int h;
    public boolean f48647n;
    public final int f48648r;
    public long f48649s;
    public int v;
    public final boolean f48650w;
    public final ArrayList f48651x;
    public boolean f48652y;
    public ArrayList J = new ArrayList();
    public ArrayList K = new ArrayList();
    public int T = 10;
    public final LongSparseIntArray U = new LongSparseIntArray();
    public final HashMap V = new HashMap();
    public int Y = -1;

    public k(py pyVar, Context context, int i10, int i11, boolean z4, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType) {
        boolean z10;
        this.f48644c = context;
        this.O = pyVar;
        this.h = i10;
        this.f48648r = i11;
        this.f48650w = z4;
        if (i11 == 0 && i10 == 0 && !z4) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f48652y = z10;
        this.f48651x = arrayList;
        this.C = i12;
        this.S = pyVar.U2;
        if (i11 == 0) {
            ?? obj = new Object();
            obj.f48613a = new HashSet();
            obj.f48614b = new HashSet();
            obj.f48615c = new HashSet();
            obj.d = new ArrayList();
            obj.f48616e = new sj0(obj, 18);
            this.M = obj;
        }
        this.Q = requestPeerType;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        int i10 = m1Var.f5879f;
        if (i10 != 1 && i10 != 5 && i10 != 3 && i10 != 8 && i10 != 7 && i10 != 10 && i10 != 11 && i10 != 13 && i10 != 15 && i10 != 16 && i10 != 18 && i10 != 19 && i10 != 20) {
            return true;
        }
        return false;
    }

    public final int E() {
        int i10 = this.h;
        int i11 = this.f48648r;
        if (i10 != 7 && i10 != 8) {
            if (i11 == 1) {
                return 2;
            }
            if (this.d != null) {
                return 1;
            }
            return 0;
        } else if (MessagesController.getInstance(this.C).isDialogsEndReached(i11)) {
            return 2;
        } else {
            return 3;
        }
    }

    public final int F(long j10) {
        for (int i10 = 0; i10 < this.J.size(); i10++) {
            if (((i) this.J.get(i10)).f48629c != null && ((i) this.J.get(i10)).f48629c.f20849id == j10) {
                return i10;
            }
        }
        return -1;
    }

    public final int G(int i10) {
        if (this.B) {
            i10--;
        }
        if (this.f48652y) {
            i10 = yh.e(2, i10, MessagesController.getInstance(this.C).hintDialogs);
        }
        if (this.f48647n && this.h == 3) {
            i10--;
        }
        int i11 = this.h;
        if (i11 != 11 && i11 != 13) {
            if (i11 == 12) {
                return i10 - 1;
            }
            return i10;
        }
        return i10 - 2;
    }

    public final MessagesController.DialogFilter H() {
        int i10 = this.h;
        if (i10 != 7 && i10 != 8) {
            return null;
        }
        return MessagesController.getInstance(this.C).selectedDialogFilter[this.h - 7];
    }

    public final Object I(int i10) {
        if (i10 >= 0 && i10 < this.J.size()) {
            i iVar = (i) this.J.get(i10);
            String str = iVar.f48636l;
            TLRPC.TL_contact tL_contact = iVar.f48630e;
            if (str != null) {
                return str;
            }
            TLRPC.Chat chat = iVar.f48637m;
            if (chat != null) {
                return chat;
            }
            TLRPC.User user = iVar.f48638n;
            if (user != null) {
                return user;
            }
            TLRPC.Dialog dialog = iVar.f48629c;
            if (dialog != null) {
                return dialog;
            }
            if (tL_contact != null) {
                return MessagesController.getInstance(this.C).getUser(Long.valueOf(tL_contact.user_id));
            }
            TLRPC.RecentMeUrl recentMeUrl = iVar.d;
            if (recentMeUrl != null) {
                return recentMeUrl;
            }
        }
        return null;
    }

    public final void M(boolean z4) {
        this.f48647n = z4;
    }

    public final void N(ri0 ri0Var) {
        this.I = ri0Var;
    }

    public final void O(sl0 sl0Var, boolean z4) {
        this.G = z4;
        for (int i10 = 0; i10 < sl0Var.getChildCount(); i10++) {
            if (sl0Var.getChildAt(i10) instanceof r2) {
                ((r2) sl0Var.getChildAt(i10)).f23436f = z4;
            }
        }
        for (int i11 = 0; i11 < sl0Var.getCachedChildCount(); i11++) {
            if (sl0Var.P(i11) instanceof r2) {
                ((r2) sl0Var.P(i11)).f23436f = z4;
            }
        }
        for (int i12 = 0; i12 < sl0Var.getHiddenChildCount(); i12++) {
            if (sl0Var.V(i12) instanceof r2) {
                ((r2) sl0Var.V(i12)).f23436f = z4;
            }
        }
        for (int i13 = 0; i13 < sl0Var.getAttachedScrapChildCount(); i13++) {
            if (sl0Var.O(i13) instanceof r2) {
                ((r2) sl0Var.O(i13)).f23436f = z4;
            }
        }
    }

    public final void P(boolean z4) {
        this.N = z4;
    }

    public final void Q(long j10) {
        this.f48649s = j10;
    }

    public final void R(ly lyVar) {
        this.H = lyVar;
    }

    public boolean S() {
        return false;
    }

    public final void T(boolean z4) {
        int i10 = this.C;
        if (this.d != null) {
            if (!z4 || SystemClock.elapsedRealtime() - this.F >= 2000) {
                this.F = SystemClock.elapsedRealtime();
                try {
                    int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
                    Collections.sort(this.d, new q30(MessagesController.getInstance(i10), currentTime, 2));
                    if (z4) {
                        l();
                    }
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            }
        }
    }

    public final void U() {
        boolean z4;
        if (this.f48648r == 0 && this.h == 0 && !this.f48650w && !MessagesController.getInstance(this.C).hintDialogs.isEmpty()) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f48652y = z4;
    }

    public final void V() {
        throw new UnsupportedOperationException("Method not decompiled: uf.k.V():void");
    }

    public final void W(Runnable runnable) {
        if (this.W) {
            this.X = true;
            return;
        }
        this.W = true;
        ArrayList arrayList = new ArrayList();
        this.K = arrayList;
        arrayList.addAll(this.J);
        V();
        ArrayList arrayList2 = new ArrayList(this.J);
        ArrayList arrayList3 = this.K;
        this.J = arrayList3;
        cg.a aVar = new cg.a(this, arrayList2, 4);
        if (arrayList3.size() >= 50 && Z) {
            Utilities.searchQueue.postRunnable(new dy0(this, aVar, runnable, arrayList2, 22));
            return;
        }
        f2.m c3 = f2.q.c(aVar, true);
        this.W = false;
        if (runnable != null) {
            runnable.run();
        }
        this.J = arrayList2;
        c3.b(this);
    }

    @Override
    public final boolean b() {
        return this.f48651x.isEmpty();
    }

    @Override
    public final void c() {
        boolean z4;
        t6 storiesController = MessagesController.getInstance(this.C).getStoriesController();
        ArrayList arrayList = storiesController.h;
        if (arrayList.isEmpty()) {
            return;
        }
        if (storiesController.D(0, DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(0)).peer)) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i10)).peer);
            if (!z4 || storiesController.D(0, peerDialogId) != 0) {
                arrayList2.add(Long.valueOf(peerDialogId));
            }
        }
        this.O.getOrCreateStoryViewer().F(this.f48644c, null, arrayList2, 0, null, null, new c7(this.H, true), false);
    }

    @Override
    public final void e(r2 r2Var) {
        int i10 = this.C;
        MessagesController.getInstance(i10);
        if (MessagesController.getInstance(i10).getStoriesController().I(r2Var.getDialogId())) {
            py pyVar = this.O;
            pyVar.getOrCreateStoryViewer().getClass();
            pyVar.getOrCreateStoryViewer().D(pyVar.getParentActivity(), r2Var.getDialogId(), c7.a((sl0) r2Var.getParent()));
        }
    }

    @Override
    public final void f(r2 r2Var) {
        this.O.H4(r2Var);
    }

    @Override
    public final int h() {
        int size = this.J.size();
        this.v = size;
        return size;
    }

    @Override
    public final long i(int i10) {
        return ((i) this.J.get(i10)).f48635k;
    }

    @Override
    public final int j(int i10) {
        return ((i) this.J.get(i10)).f2505a;
    }

    @Override
    public void l() {
        if (this.W) {
            this.J = new ArrayList();
        }
        this.W = false;
        V();
        super.l();
    }

    @Override
    public final void v(f2.m1 r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: uf.k.v(f2.m1, int):void");
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        ?? r22;
        int i11;
        int i12;
        int i13;
        long j10 = this.S;
        Context context = this.f48644c;
        switch (i10) {
            case 0:
            case 21:
                int i14 = this.h;
                if (i14 != 2 && i14 != 15) {
                    r2 r2Var = new r2(this.O, this.f48644c, false, this.C, null);
                    if (S()) {
                        org.telegram.ui.web.d1 d1Var = new org.telegram.ui.web.d1(this, 15);
                        r2Var.G1 = true;
                        r2Var.H1 = d1Var;
                    }
                    r2Var.setArchivedPullAnimation(this.I);
                    r2Var.setPreloader(this.M);
                    r2Var.setDialogCellDelegate(this);
                    r2Var.setIsTransitionSupport(this.P);
                    if (i10 == 21) {
                        d7 d7Var = new d7(r2Var.getContext(), r2Var, false, R.drawable.forward_to_stories, r2Var.C4);
                        r2Var = r2Var;
                        r2Var.D = d7Var;
                        r2Var.C = true;
                    }
                    if (j10 != 0) {
                        r2Var.L0 = true;
                    }
                    r22 = r2Var;
                } else {
                    r22 = new h6(context, null);
                }
                if (this.h == 15) {
                    r22.setBackgroundColor(k6.w0(null, k6.f21661d6, false));
                    break;
                }
                break;
            case 1:
            case 13:
                r22 = new u00(context, null);
                r22.setIsSingleCell(true);
                if (i10 == 13) {
                    i11 = 18;
                } else {
                    i11 = 7;
                }
                r22.setViewType(i11);
                if (i11 == 18) {
                    r22.setIgnoreHeightCheck(true);
                }
                if (i10 == 13) {
                    r22.setItemsCount((int) ((AndroidUtilities.displaySize.y * 0.5f) / AndroidUtilities.dp(64.0f)));
                    break;
                }
                break;
            case 2:
                r22 = new m4(context);
                r22.setText(LocaleController.getString(R.string.RecentlyViewed));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 15.0f);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextColor(k6.w0(null, k6.L6, false));
                textView.setText(LocaleController.getString(R.string.RecentlyViewedHide));
                int i15 = 3;
                if (LocaleController.isRTL) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                textView.setGravity(i12 | 16);
                if (!LocaleController.isRTL) {
                    i15 = 5;
                }
                r22.addView(textView, c6.d(-1, -1.0f, i15 | 48, 17.0f, 15.0f, 17.0f, 0.0f));
                textView.setOnClickListener(new org.telegram.ui.Components.voip.o(this, 19));
                break;
            case 3:
                r22 = new h51(context, 9);
                r22.setBackgroundColor(k6.w0(null, k6.f21607a7, false));
                View view = new View(context);
                view.setBackgroundDrawable(k6.V0(context, R.drawable.greydivider, k6.f21626b7));
                r22.addView(view, c6.c(-1.0f, -1));
                break;
            case 4:
                r22 = new org.telegram.ui.Cells.a0(context);
                ImageReceiver imageReceiver = new ImageReceiver(r22);
                r22.h = imageReceiver;
                r22.f23724n = new z8((g6) null);
                r22.f23727w = AndroidUtilities.dp(40.0f);
                r22.C = AndroidUtilities.dp(10.0f);
                r22.E = UserConfig.selectedAccount;
                k6.R(context);
                imageReceiver.setRoundRadius(AndroidUtilities.dp(26.0f));
                break;
            case 5:
                r22 = new x2(context);
                break;
            case 6:
                r22 = new va(context, 8, 0, false);
                break;
            case 7:
                r22 = new m4(context);
                py pyVar = this.O;
                if (pyVar == null || !pyVar.K0) {
                    r22.setPadding(0, 0, 0, AndroidUtilities.dp(12.0f));
                    break;
                }
                break;
            case 8:
                r22 = new z6(context, (org.telegram.ui.b) null);
                pq pqVar = new pq(new ColorDrawable(k6.w0(null, k6.f21607a7, false)), k6.V0(context, R.drawable.greydivider, k6.f21626b7));
                pqVar.f30166w = true;
                r22.setBackgroundDrawable(pqVar);
                break;
            case 9:
            case 12:
            default:
                r22 = new o8(context);
                if (this.h == 15) {
                    r22.setBackgroundColor(k6.w0(null, k6.f21661d6, false));
                    break;
                }
                break;
            case 10:
                r22 = new j(this, context);
                break;
            case 11:
                r22 = new g(this, context);
                pq pqVar2 = new pq(new ColorDrawable(k6.w0(null, k6.f21607a7, false)), k6.V0(context, R.drawable.greydivider, k6.f21626b7));
                pqVar2.f30166w = true;
                r22.setBackgroundDrawable(pqVar2);
                break;
            case 14:
                m4 m4Var = new m4(this.f48644c, k6.f21699f7, 16, 0, false, null);
                m4Var.setHeight(32);
                m4Var.setClickable(false);
                r22 = m4Var;
                break;
            case 15:
                r22 = new LinearLayout(context);
                r22.f23372b = new ArrayList();
                r22.setOrientation(1);
                r22.setBackgroundColor(k6.w0(null, k6.f21607a7, false));
                break;
            case 16:
                r22 = new f(this, context);
                break;
            case 17:
                r22 = new z2(context);
                break;
            case 18:
                r22 = new in(context, 29);
                break;
            case 19:
                r22 = new j(this, context);
                r22.addView(new q6(this.f48644c, this.C, null, new e(this, 1), null), c6.d(-1, -1.0f, 17, 0.0f, -40.0f, 0.0f, 0.0f));
                break;
            case 20:
                r22 = new u3(context, null);
                break;
            case 22:
                r22 = new m4(context);
                break;
            case 23:
                r2 r2Var2 = new r2(this.O, this.f48644c, false, this.C, null);
                if (j10 != 0) {
                    r2Var2.L0 = true;
                    r2Var2.M0 = true;
                }
                r22 = r2Var2;
                break;
        }
        if (i10 != 5 && i10 != 19) {
            i13 = -2;
        } else {
            i13 = -1;
        }
        r22.setLayoutParams(new f2.x0(-1, i13));
        return new f2.m1(r22);
    }

    @Override
    public final void y(f2.m1 m1Var) {
        View view = m1Var.f5875a;
        if (view instanceof r2) {
            r2 r2Var = (r2) view;
            r2Var.T(this.E, false);
            r2Var.V(this.f48651x.contains(Long.valueOf(r2Var.getDialogId())), false);
        }
    }

    public void J() {
    }

    public void K() {
    }

    public void L(TLRPC.User user) {
    }

    public void a(r2 r2Var) {
    }

    public void d(r2 r2Var) {
    }
}
