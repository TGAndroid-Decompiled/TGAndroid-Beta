package xh;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import ig.n0;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MemberRequestsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ActionBar.u0;
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.kc0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.sn0;
import org.telegram.ui.Components.wx0;
public abstract class l implements f5 {
    public final boolean f48475a;
    public boolean f48476b;
    public final m2 f48479g;
    public final FrameLayout h;
    public final MemberRequestsController f48480i;
    public final long f48481j;
    public final int f48482k;
    public final boolean f48483l;
    public FrameLayout f48484m;
    public wx0 f48485n;
    public wx0 f48486o;
    public mm0 f48487p;
    public f10 f48488q;
    public TLRPC.TL_chatInviteImporter f48489r;
    public k f48490s;
    public String f48491t;
    public e f48492u;
    public int v;
    public boolean f48493w;
    public boolean f48495y;
    public boolean f48496z;
    public final ArrayList f48477c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList e = new ArrayList();
    public final g f48478f = new g(this);
    public boolean f48494x = true;
    public boolean A = true;
    public boolean B = true;
    public final e C = new e(this, 0);
    public final kc0 D = new kc0(this, 18);

    public l(m2 m2Var, FrameLayout frameLayout, long j10, boolean z10) {
        this.f48479g = m2Var;
        this.h = frameLayout;
        this.f48481j = j10;
        int currentAccount = m2Var.getCurrentAccount();
        this.f48482k = currentAccount;
        this.f48475a = ChatObject.isChannelAndNotMegaGroup(j10, currentAccount);
        this.f48483l = z10;
        this.f48480i = MemberRequestsController.getInstance(currentAccount);
    }

    public static void k(View view, boolean z10, boolean z11) {
        boolean z12;
        float f7;
        if (view != null) {
            int i10 = 0;
            if (view.getVisibility() == 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            if (z10 == z12 && f7 == view.getAlpha()) {
                return;
            }
            if (z11) {
                if (z10) {
                    view.setAlpha(0.0f);
                }
                view.setVisibility(0);
                view.animate().alpha(f7).setDuration(150L).start();
                return;
            }
            if (!z10) {
                i10 = 4;
            }
            view.setVisibility(i10);
        }
    }

    public final wx0 a() {
        int i10;
        int i11;
        if (this.f48485n == null) {
            m2 m2Var = this.f48479g;
            wx0 wx0Var = new wx0(m2Var.getParentActivity(), null, 16, m2Var.getResourceProvider());
            this.f48485n = wx0Var;
            boolean z10 = this.f48475a;
            if (z10) {
                i10 = R.string.NoSubscribeRequests;
            } else {
                i10 = R.string.NoMemberRequests;
            }
            wx0Var.d.setText(LocaleController.getString(i10));
            da0 da0Var = this.f48485n.e;
            if (z10) {
                i11 = R.string.NoSubscribeRequestsDescription;
            } else {
                i11 = R.string.NoMemberRequestsDescription;
            }
            da0Var.setText(LocaleController.getString(i11));
            this.f48485n.setAnimateLayoutChange(true);
            this.f48485n.setVisibility(8);
        }
        return this.f48485n;
    }

    public final f10 b() {
        if (this.f48488q == null) {
            m2 m2Var = this.f48479g;
            f10 f10Var = new f10(m2Var.getParentActivity(), m2Var.getResourceProvider());
            this.f48488q = f10Var;
            f10Var.setAlpha(0.0f);
            if (this.B) {
                this.f48488q.setBackgroundColor(g6.w0(g6.f19901d6, m2Var.getResourceProvider()));
            }
            this.f48488q.f(g6.f19901d6, g6.f19843a7, -1);
            this.f48488q.setViewType(15);
            this.f48488q.setMemberRequestButton(this.f48475a);
        }
        return this.f48488q;
    }

    public final wx0 c() {
        if (this.f48486o == null) {
            m2 m2Var = this.f48479g;
            wx0 wx0Var = new wx0(m2Var.getParentActivity(), null, 1, m2Var.getResourceProvider());
            this.f48486o = wx0Var;
            if (this.B) {
                wx0Var.setBackgroundColor(g6.w0(g6.f19901d6, m2Var.getResourceProvider()));
            }
            this.f48486o.d.setText(LocaleController.getString(R.string.NoResult));
            this.f48486o.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            this.f48486o.setAnimateLayoutChange(true);
            this.f48486o.setVisibility(8);
        }
        return this.f48486o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z10;
        int i10 = this.f48482k;
        tL_messages_hideChatJoinRequest.peer = MessagesController.getInstance(i10).getInputPeer(-this.f48481j);
        tL_messages_hideChatJoinRequest.user_id = MessagesController.getInstance(i10).getInputUser(user);
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_hideChatJoinRequest, new n0(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        TLRPC.TL_messages_chatInviteImporters cachedImporters;
        boolean z10 = true;
        if (this.A && (cachedImporters = this.f48480i.getCachedImporters(this.f48481j)) != null) {
            this.f48496z = true;
            g(cachedImporters, null, true, true);
            z10 = false;
        }
        AndroidUtilities.runOnUIThread(new sn0(16, this, z10));
    }

    public void f(String str, boolean z10, boolean z11) {
        boolean z12;
        int i10;
        int i11;
        boolean isEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList = this.e;
        if (isEmpty) {
            if (arrayList.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            wx0 wx0Var = this.f48485n;
            if (wx0Var != null) {
                if (z12) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                wx0Var.setVisibility(i11);
            }
            wx0 wx0Var2 = this.f48486o;
            if (wx0Var2 != null) {
                wx0Var2.setVisibility(4);
            }
        } else {
            if (this.f48477c.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            wx0 wx0Var3 = this.f48485n;
            if (wx0Var3 != null) {
                wx0Var3.setVisibility(4);
            }
            wx0 wx0Var4 = this.f48486o;
            if (wx0Var4 != null) {
                if (z12) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                wx0Var4.setVisibility(i10);
            }
        }
        k(this.f48487p, z12, true);
        if (arrayList.isEmpty()) {
            wx0 wx0Var5 = this.f48485n;
            if (wx0Var5 != null) {
                wx0Var5.setVisibility(0);
            }
            wx0 wx0Var6 = this.f48486o;
            if (wx0Var6 != null) {
                wx0Var6.setVisibility(4);
            }
            k(this.f48488q, false, false);
            if (this.f48495y && this.f48483l) {
                this.f48479g.getActionBar().n().j(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: xh.l.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j10;
        if (view instanceof g5) {
            if (this.f48495y) {
                AndroidUtilities.hideKeyboard(this.f48479g.getParentActivity().getCurrentFocus());
            }
            s9.b bVar = new s9.b(23, this, (g5) view);
            if (this.f48495y) {
                j10 = 100;
            } else {
                j10 = 0;
            }
            AndroidUtilities.runOnUIThread(bVar, j10);
        }
    }

    public final void i(boolean z10) {
        int i10;
        mm0 mm0Var = this.f48487p;
        if (mm0Var != null && (i10 = !this.f48478f.f48459c.B ? 1 : 0) >= 0 && i10 < mm0Var.getChildCount()) {
            this.f48487p.getChildAt(i10).setEnabled(z10);
        }
    }

    public final void j(String str) {
        if (this.f48492u != null) {
            Utilities.searchQueue.cancelRunnable(this.f48492u);
            this.f48492u = null;
        }
        int i10 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f48482k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f48491t = str;
        if (this.f48496z && this.e.isEmpty()) {
            k(this.f48488q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f48478f.E(this.e);
            k(this.f48487p, true, true);
            k(this.f48488q, false, false);
            wx0 wx0Var = this.f48486o;
            if (wx0Var != null) {
                wx0Var.setVisibility(4);
            }
            if (str == null && this.f48483l) {
                u0 k10 = this.f48479g.getActionBar().n().k(0);
                if (this.e.isEmpty()) {
                    i10 = 8;
                }
                k10.setVisibility(i10);
            }
        } else {
            this.f48478f.E(Collections.EMPTY_LIST);
            k(this.f48487p, false, false);
            k(this.f48488q, true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            e eVar = new e(this, 2);
            this.f48492u = eVar;
            dispatchQueue.postRunnable(eVar, 300L);
        }
        if (str != null) {
            wx0 wx0Var2 = this.f48485n;
            if (wx0Var2 != null) {
                wx0Var2.setVisibility(4);
            }
            wx0 wx0Var3 = this.f48486o;
            if (wx0Var3 != null) {
                wx0Var3.setVisibility(4);
            }
        }
    }
}
