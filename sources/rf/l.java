package rf;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import f2.n1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import lh.b7;
import lh.s6;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Cells.f6;
import org.telegram.ui.Cells.k4;
import org.telegram.ui.Cells.l2;
import org.telegram.ui.Cells.m8;
import org.telegram.ui.Cells.p2;
import org.telegram.ui.Cells.s3;
import org.telegram.ui.Cells.sa;
import org.telegram.ui.Cells.v2;
import org.telegram.ui.Cells.x2;
import org.telegram.ui.Cells.x6;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.fn;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jq;
import org.telegram.ui.Components.k30;
import org.telegram.ui.Components.mx;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.u6;
import org.telegram.ui.ay;
import org.telegram.ui.ef0;
import org.telegram.ui.fy;
import org.telegram.ui.lx0;
import org.telegram.ui.n31;
import org.telegram.ui.th;
public class l extends il0 implements l2 {
    public static final boolean Y = BuildVars.DEBUG_PRIVATE_VERSION;
    public boolean A;
    public final int B;
    public boolean C;
    public boolean D;
    public long E;
    public boolean F;
    public jl0 G;
    public ei0 H;
    public Drawable K;
    public final i L;
    public boolean M;
    public final fy N;
    public boolean O;
    public final TLRPC.RequestPeerType P;
    public boolean Q;
    public final long R;
    public boolean V;
    public boolean W;
    public final Context f47294c;
    public ArrayList d;
    public boolean f47295e;
    public int f47296f;
    public int h;
    public boolean f47297n;
    public final int f47298r;
    public long f47299s;
    public int v;
    public final boolean f47300w;
    public final ArrayList f47301x;
    public boolean f47302y;
    public ArrayList I = new ArrayList();
    public ArrayList J = new ArrayList();
    public int S = 10;
    public final LongSparseIntArray T = new LongSparseIntArray();
    public final HashMap U = new HashMap();
    public int X = -1;

    public l(fy fyVar, Context context, int i10, int i11, boolean z10, ArrayList arrayList, int i12, TLRPC.RequestPeerType requestPeerType) {
        boolean z11;
        this.f47294c = context;
        this.N = fyVar;
        this.h = i10;
        this.f47298r = i11;
        this.f47300w = z10;
        if (i11 == 0 && i10 == 0 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f47302y = z11;
        this.f47301x = arrayList;
        this.B = i12;
        this.R = fyVar.T2;
        if (i11 == 0) {
            ?? obj = new Object();
            obj.f47250a = new HashSet();
            obj.f47251b = new HashSet();
            obj.f47252c = new HashSet();
            obj.d = new ArrayList();
            obj.f47253e = new ef0(obj, 16);
            this.L = obj;
        }
        this.P = requestPeerType;
    }

    @Override
    public final boolean D(n1 n1Var) {
        int i10 = n1Var.f6436f;
        if (i10 != 1 && i10 != 5 && i10 != 3 && i10 != 8 && i10 != 7 && i10 != 10 && i10 != 11 && i10 != 13 && i10 != 15 && i10 != 16 && i10 != 18 && i10 != 19 && i10 != 20) {
            return true;
        }
        return false;
    }

    public final int E() {
        int i10 = this.h;
        int i11 = this.f47298r;
        if (i10 != 7 && i10 != 8) {
            if (i11 == 1) {
                return 2;
            }
            if (this.d != null) {
                return 1;
            }
            return 0;
        } else if (MessagesController.getInstance(this.B).isDialogsEndReached(i11)) {
            return 2;
        } else {
            return 3;
        }
    }

    public final int F(long j10) {
        for (int i10 = 0; i10 < this.I.size(); i10++) {
            if (((j) this.I.get(i10)).f47264c != null && ((j) this.I.get(i10)).f47264c.f22396id == j10) {
                return i10;
            }
        }
        return -1;
    }

    public final int G(int i10) {
        if (this.A) {
            i10--;
        }
        if (this.f47302y) {
            i10 = th.e(2, i10, MessagesController.getInstance(this.B).hintDialogs);
        }
        if (this.f47297n && this.h == 3) {
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
        return MessagesController.getInstance(this.B).selectedDialogFilter[this.h - 7];
    }

    public final Object I(int i10) {
        if (i10 >= 0 && i10 < this.I.size()) {
            j jVar = (j) this.I.get(i10);
            String str = jVar.f47271l;
            TLRPC.TL_contact tL_contact = jVar.f47265e;
            if (str != null) {
                return str;
            }
            TLRPC.Chat chat = jVar.f47272m;
            if (chat != null) {
                return chat;
            }
            TLRPC.User user = jVar.f47273n;
            if (user != null) {
                return user;
            }
            TLRPC.Dialog dialog = jVar.f47264c;
            if (dialog != null) {
                return dialog;
            }
            if (tL_contact != null) {
                return MessagesController.getInstance(this.B).getUser(Long.valueOf(tL_contact.user_id));
            }
            TLRPC.RecentMeUrl recentMeUrl = jVar.d;
            if (recentMeUrl != null) {
                return recentMeUrl;
            }
        }
        return null;
    }

    public final void M(boolean z10) {
        this.f47297n = z10;
    }

    public final void N(ei0 ei0Var) {
        this.H = ei0Var;
    }

    public final void O(jl0 jl0Var, boolean z10) {
        this.F = z10;
        for (int i10 = 0; i10 < jl0Var.getChildCount(); i10++) {
            if (jl0Var.getChildAt(i10) instanceof p2) {
                ((p2) jl0Var.getChildAt(i10)).f24851f = z10;
            }
        }
        for (int i11 = 0; i11 < jl0Var.getCachedChildCount(); i11++) {
            if (jl0Var.P(i11) instanceof p2) {
                ((p2) jl0Var.P(i11)).f24851f = z10;
            }
        }
        for (int i12 = 0; i12 < jl0Var.getHiddenChildCount(); i12++) {
            if (jl0Var.V(i12) instanceof p2) {
                ((p2) jl0Var.V(i12)).f24851f = z10;
            }
        }
        for (int i13 = 0; i13 < jl0Var.getAttachedScrapChildCount(); i13++) {
            if (jl0Var.O(i13) instanceof p2) {
                ((p2) jl0Var.O(i13)).f24851f = z10;
            }
        }
    }

    public final void P(boolean z10) {
        this.M = z10;
    }

    public final void Q(long j10) {
        this.f47299s = j10;
    }

    public final void R(ay ayVar) {
        this.G = ayVar;
    }

    public boolean S() {
        return false;
    }

    public final void T(boolean z10) {
        int i10 = this.B;
        if (this.d != null) {
            if (!z10 || SystemClock.elapsedRealtime() - this.E >= 2000) {
                this.E = SystemClock.elapsedRealtime();
                try {
                    int currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
                    Collections.sort(this.d, new k30(MessagesController.getInstance(i10), currentTime, 2));
                    if (z10) {
                        l();
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        }
    }

    public final void U() {
        boolean z10;
        if (this.f47298r == 0 && this.h == 0 && !this.f47300w && !MessagesController.getInstance(this.B).hintDialogs.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f47302y = z10;
    }

    public final void V() {
        throw new UnsupportedOperationException("Method not decompiled: rf.l.V():void");
    }

    public final void W(Runnable runnable) {
        if (this.V) {
            this.W = true;
            return;
        }
        this.V = true;
        ArrayList arrayList = new ArrayList();
        this.J = arrayList;
        arrayList.addAll(this.I);
        V();
        ArrayList arrayList2 = new ArrayList(this.I);
        ArrayList arrayList3 = this.J;
        this.I = arrayList3;
        mx mxVar = new mx(this, arrayList2, 3);
        if (arrayList3.size() >= 50 && Y) {
            Utilities.searchQueue.postRunnable(new lx0(this, mxVar, runnable, arrayList2, 21));
            return;
        }
        f2.m c3 = f2.q.c(mxVar, true);
        this.V = false;
        if (runnable != null) {
            runnable.run();
        }
        this.I = arrayList2;
        c3.b(this);
    }

    @Override
    public final boolean b() {
        return this.f47301x.isEmpty();
    }

    @Override
    public final void c() {
        boolean z10;
        s6 storiesController = MessagesController.getInstance(this.B).getStoriesController();
        ArrayList arrayList = storiesController.h;
        if (arrayList.isEmpty()) {
            return;
        }
        if (storiesController.D(0, DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(0)).peer)) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i10)).peer);
            if (!z10 || storiesController.D(0, peerDialogId) != 0) {
                arrayList2.add(Long.valueOf(peerDialogId));
            }
        }
        this.N.getOrCreateStoryViewer().F(this.f47294c, null, arrayList2, 0, null, null, new b7(this.G, true), false);
    }

    @Override
    public final void e(p2 p2Var) {
        int i10 = this.B;
        MessagesController.getInstance(i10);
        if (MessagesController.getInstance(i10).getStoriesController().I(p2Var.getDialogId())) {
            fy fyVar = this.N;
            fyVar.getOrCreateStoryViewer().getClass();
            fyVar.getOrCreateStoryViewer().D(fyVar.getParentActivity(), p2Var.getDialogId(), b7.a((jl0) p2Var.getParent()));
        }
    }

    @Override
    public final void f(p2 p2Var) {
        this.N.H4(p2Var);
    }

    @Override
    public final int h() {
        int size = this.I.size();
        this.v = size;
        return size;
    }

    @Override
    public final long i(int i10) {
        return ((j) this.I.get(i10)).f47270k;
    }

    @Override
    public final int j(int i10) {
        return ((j) this.I.get(i10)).f50845a;
    }

    @Override
    public void l() {
        if (this.V) {
            this.I = new ArrayList();
        }
        this.V = false;
        V();
        super.l();
    }

    @Override
    public final void v(f2.n1 r28, int r29) {
        throw new UnsupportedOperationException("Method not decompiled: rf.l.v(f2.n1, int):void");
    }

    @Override
    public final n1 x(ViewGroup viewGroup, int i10) {
        ?? r22;
        int i11;
        int i12;
        int i13;
        long j10 = this.R;
        Context context = this.f47294c;
        switch (i10) {
            case 0:
            case 21:
                int i14 = this.h;
                if (i14 != 2 && i14 != 15) {
                    p2 p2Var = new p2(this.N, this.f47294c, false, this.B, null);
                    if (S()) {
                        nh.b0 b0Var = new nh.b0(this, 15);
                        p2Var.F1 = true;
                        p2Var.G1 = b0Var;
                    }
                    p2Var.setArchivedPullAnimation(this.H);
                    p2Var.setPreloader(this.L);
                    p2Var.setDialogCellDelegate(this);
                    p2Var.setIsTransitionSupport(this.O);
                    if (i10 == 21) {
                        org.telegram.ui.Cells.b7 b7Var = new org.telegram.ui.Cells.b7(p2Var.getContext(), p2Var, false, R.drawable.forward_to_stories, p2Var.B4);
                        p2Var = p2Var;
                        p2Var.C = b7Var;
                        p2Var.B = true;
                    }
                    if (j10 != 0) {
                        p2Var.K0 = true;
                    }
                    r22 = p2Var;
                } else {
                    r22 = new f6(context, null);
                }
                if (this.h == 15) {
                    r22.setBackgroundColor(g6.w0(null, g6.f23062d6, false));
                    break;
                }
                break;
            case 1:
            case 13:
                r22 = new p00(context, null);
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
                r22 = new k4(context);
                r22.setText(LocaleController.getString(R.string.RecentlyViewed));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 15.0f);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextColor(g6.w0(null, g6.L6, false));
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
                r22.addView(textView, i7.f6.d(-1, -1.0f, i15 | 48, 17.0f, 15.0f, 17.0f, 0.0f));
                textView.setOnClickListener(new mh.n(this, 19));
                break;
            case 3:
                r22 = new n31(context, 9);
                r22.setBackgroundColor(g6.w0(null, g6.f23009a7, false));
                View view = new View(context);
                view.setBackgroundDrawable(g6.V0(context, R.drawable.greydivider, g6.f23028b7));
                r22.addView(view, i7.f6.c(-1.0f, -1));
                break;
            case 4:
                r22 = new org.telegram.ui.Cells.a0(context);
                ImageReceiver imageReceiver = new ImageReceiver(r22);
                r22.h = imageReceiver;
                r22.f25052n = new e9((c6) null);
                r22.f25055w = AndroidUtilities.dp(40.0f);
                r22.B = AndroidUtilities.dp(10.0f);
                r22.D = UserConfig.selectedAccount;
                g6.R(context);
                imageReceiver.setRoundRadius(AndroidUtilities.dp(26.0f));
                break;
            case 5:
                r22 = new v2(context);
                break;
            case 6:
                r22 = new sa(context, 8, 0, false);
                break;
            case 7:
                r22 = new k4(context);
                fy fyVar = this.N;
                if (fyVar == null || !fyVar.J0) {
                    r22.setPadding(0, 0, 0, AndroidUtilities.dp(12.0f));
                    break;
                }
                break;
            case 8:
                r22 = new x6(context, (org.telegram.ui.b) null);
                jq jqVar = new jq(new ColorDrawable(g6.w0(null, g6.f23009a7, false)), g6.V0(context, R.drawable.greydivider, g6.f23028b7));
                jqVar.f29792w = true;
                r22.setBackgroundDrawable(jqVar);
                break;
            case 9:
            case 12:
            default:
                r22 = new m8(context);
                if (this.h == 15) {
                    r22.setBackgroundColor(g6.w0(null, g6.f23062d6, false));
                    break;
                }
                break;
            case 10:
                r22 = new k(this, context);
                break;
            case 11:
                r22 = new h(this, context);
                jq jqVar2 = new jq(new ColorDrawable(g6.w0(null, g6.f23009a7, false)), g6.V0(context, R.drawable.greydivider, g6.f23028b7));
                jqVar2.f29792w = true;
                r22.setBackgroundDrawable(jqVar2);
                break;
            case 14:
                k4 k4Var = new k4(this.f47294c, g6.f23100f7, 16, 0, false, null);
                k4Var.setHeight(32);
                k4Var.setClickable(false);
                r22 = k4Var;
                break;
            case 15:
                r22 = new LinearLayout(context);
                r22.f24808b = new ArrayList();
                r22.setOrientation(1);
                r22.setBackgroundColor(g6.w0(null, g6.f23009a7, false));
                break;
            case 16:
                r22 = new g(this, context);
                break;
            case 17:
                r22 = new x2(context);
                break;
            case 18:
                r22 = new fn(context, 29);
                break;
            case 19:
                r22 = new k(this, context);
                r22.addView(new u6(this.f47294c, this.B, null, new f(this, 1), null), i7.f6.d(-1, -1.0f, 17, 0.0f, -40.0f, 0.0f, 0.0f));
                break;
            case 20:
                r22 = new s3(context, null);
                break;
            case 22:
                r22 = new k4(context);
                break;
            case 23:
                p2 p2Var2 = new p2(this.N, this.f47294c, false, this.B, null);
                if (j10 != 0) {
                    p2Var2.K0 = true;
                    p2Var2.L0 = true;
                }
                r22 = p2Var2;
                break;
        }
        if (i10 != 5 && i10 != 19) {
            i13 = -2;
        } else {
            i13 = -1;
        }
        r22.setLayoutParams(new f2.x0(-1, i13));
        return new n1(r22);
    }

    @Override
    public final void y(n1 n1Var) {
        View view = n1Var.f6432a;
        if (view instanceof p2) {
            p2 p2Var = (p2) view;
            p2Var.T(this.D, false);
            p2Var.V(this.f47301x.contains(Long.valueOf(p2Var.getDialogId())), false);
        }
    }

    public void J() {
    }

    public void K() {
    }

    public void L(TLRPC.User user) {
    }

    public void a(p2 p2Var) {
    }

    public void d(p2 p2Var) {
    }
}
