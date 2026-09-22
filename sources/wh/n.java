package wh;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import hg.o0;
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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.v0;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Cells.h5;
import org.telegram.ui.Components.as0;
import org.telegram.ui.Components.lx0;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.vb0;
import org.telegram.ui.Components.yl0;
import u2.j0;
public abstract class n implements g5 {
    public final boolean f45427a;
    public boolean f45428b;
    public final n2 f45431g;
    public final FrameLayout h;
    public final MemberRequestsController f45432i;
    public final long f45433j;
    public final int f45434k;
    public final boolean f45435l;
    public FrameLayout f45436m;
    public lx0 f45437n;
    public lx0 f45438o;
    public yl0 f45439p;
    public t00 f45440q;
    public TLRPC.TL_chatInviteImporter f45441r;
    public m f45442s;
    public String f45443t;
    public e f45444u;
    public int v;
    public boolean f45445w;
    public boolean f45447y;
    public boolean f45448z;
    public final ArrayList f45429c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList e = new ArrayList();
    public final g f45430f = new g(this);
    public boolean f45446x = true;
    public boolean A = true;
    public boolean B = true;
    public final e C = new e(this, 0);
    public final vb0 D = new vb0(this, 16);

    public n(n2 n2Var, FrameLayout frameLayout, long j3, boolean z10) {
        this.f45431g = n2Var;
        this.h = frameLayout;
        this.f45433j = j3;
        int currentAccount = n2Var.getCurrentAccount();
        this.f45434k = currentAccount;
        this.f45427a = ChatObject.isChannelAndNotMegaGroup(j3, currentAccount);
        this.f45435l = z10;
        this.f45432i = MemberRequestsController.getInstance(currentAccount);
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

    public final lx0 a() {
        int i10;
        int i11;
        if (this.f45437n == null) {
            n2 n2Var = this.f45431g;
            lx0 lx0Var = new lx0(n2Var.getParentActivity(), null, 16, n2Var.getResourceProvider());
            this.f45437n = lx0Var;
            boolean z10 = this.f45427a;
            if (z10) {
                i10 = R.string.NoSubscribeRequests;
            } else {
                i10 = R.string.NoMemberRequests;
            }
            lx0Var.d.setText(LocaleController.getString(i10));
            n90 n90Var = this.f45437n.e;
            if (z10) {
                i11 = R.string.NoSubscribeRequestsDescription;
            } else {
                i11 = R.string.NoMemberRequestsDescription;
            }
            n90Var.setText(LocaleController.getString(i11));
            this.f45437n.setAnimateLayoutChange(true);
            this.f45437n.setVisibility(8);
        }
        return this.f45437n;
    }

    public final t00 b() {
        if (this.f45440q == null) {
            n2 n2Var = this.f45431g;
            t00 t00Var = new t00(n2Var.getParentActivity(), n2Var.getResourceProvider());
            this.f45440q = t00Var;
            t00Var.setAlpha(0.0f);
            if (this.B) {
                this.f45440q.setBackgroundColor(j6.v0(j6.f19109d6, n2Var.getResourceProvider()));
            }
            this.f45440q.f(j6.f19109d6, j6.f19053a7, -1);
            this.f45440q.setViewType(15);
            this.f45440q.setMemberRequestButton(this.f45427a);
        }
        return this.f45440q;
    }

    public final lx0 c() {
        if (this.f45438o == null) {
            n2 n2Var = this.f45431g;
            lx0 lx0Var = new lx0(n2Var.getParentActivity(), null, 1, n2Var.getResourceProvider());
            this.f45438o = lx0Var;
            if (this.B) {
                lx0Var.setBackgroundColor(j6.v0(j6.f19109d6, n2Var.getResourceProvider()));
            }
            this.f45438o.d.setText(LocaleController.getString(R.string.NoResult));
            this.f45438o.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            this.f45438o.setAnimateLayoutChange(true);
            this.f45438o.setVisibility(8);
        }
        return this.f45438o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z10;
        int i10 = this.f45434k;
        tL_messages_hideChatJoinRequest.peer = MessagesController.getInstance(i10).getInputPeer(-this.f45433j);
        tL_messages_hideChatJoinRequest.user_id = MessagesController.getInstance(i10).getInputUser(user);
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_hideChatJoinRequest, new o0(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        TLRPC.TL_messages_chatInviteImporters cachedImporters;
        boolean z10 = true;
        if (this.A && (cachedImporters = this.f45432i.getCachedImporters(this.f45433j)) != null) {
            this.f45448z = true;
            g(cachedImporters, null, true, true);
            z10 = false;
        }
        AndroidUtilities.runOnUIThread(new as0(13, this, z10));
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
            lx0 lx0Var = this.f45437n;
            if (lx0Var != null) {
                if (z12) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                lx0Var.setVisibility(i11);
            }
            lx0 lx0Var2 = this.f45438o;
            if (lx0Var2 != null) {
                lx0Var2.setVisibility(4);
            }
        } else {
            if (this.f45429c.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            lx0 lx0Var3 = this.f45437n;
            if (lx0Var3 != null) {
                lx0Var3.setVisibility(4);
            }
            lx0 lx0Var4 = this.f45438o;
            if (lx0Var4 != null) {
                if (z12) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                lx0Var4.setVisibility(i10);
            }
        }
        k(this.f45439p, z12, true);
        if (arrayList.isEmpty()) {
            lx0 lx0Var5 = this.f45437n;
            if (lx0Var5 != null) {
                lx0Var5.setVisibility(0);
            }
            lx0 lx0Var6 = this.f45438o;
            if (lx0Var6 != null) {
                lx0Var6.setVisibility(4);
            }
            k(this.f45440q, false, false);
            if (this.f45447y && this.f45435l) {
                this.f45431g.getActionBar().n().j(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: wh.n.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j3;
        if (view instanceof h5) {
            if (this.f45447y) {
                AndroidUtilities.hideKeyboard(this.f45431g.getParentActivity().getCurrentFocus());
            }
            j0 j0Var = new j0(8, this, (h5) view);
            if (this.f45447y) {
                j3 = 100;
            } else {
                j3 = 0;
            }
            AndroidUtilities.runOnUIThread(j0Var, j3);
        }
    }

    public final void i(boolean z10) {
        int i10;
        yl0 yl0Var = this.f45439p;
        if (yl0Var != null && (i10 = !this.f45430f.f45406c.B ? 1 : 0) >= 0 && i10 < yl0Var.getChildCount()) {
            this.f45439p.getChildAt(i10).setEnabled(z10);
        }
    }

    public final void j(String str) {
        if (this.f45444u != null) {
            Utilities.searchQueue.cancelRunnable(this.f45444u);
            this.f45444u = null;
        }
        int i10 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f45434k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f45443t = str;
        if (this.f45448z && this.e.isEmpty()) {
            k(this.f45440q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f45430f.E(this.e);
            k(this.f45439p, true, true);
            k(this.f45440q, false, false);
            lx0 lx0Var = this.f45438o;
            if (lx0Var != null) {
                lx0Var.setVisibility(4);
            }
            if (str == null && this.f45435l) {
                v0 k10 = this.f45431g.getActionBar().n().k(0);
                if (this.e.isEmpty()) {
                    i10 = 8;
                }
                k10.setVisibility(i10);
            }
        } else {
            this.f45430f.E(Collections.EMPTY_LIST);
            k(this.f45439p, false, false);
            k(this.f45440q, true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            e eVar = new e(this, 2);
            this.f45444u = eVar;
            dispatchQueue.postRunnable(eVar, 300L);
        }
        if (str != null) {
            lx0 lx0Var2 = this.f45437n;
            if (lx0Var2 != null) {
                lx0Var2.setVisibility(4);
            }
            lx0 lx0Var3 = this.f45438o;
            if (lx0Var3 != null) {
                lx0Var3.setVisibility(4);
            }
        }
    }
}
