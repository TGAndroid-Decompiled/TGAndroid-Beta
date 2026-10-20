package xh;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import ig.o0;
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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.u0;
import org.telegram.ui.Cells.e5;
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.b60;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.kv;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.Components.x90;
import u2.j0;
public abstract class k implements e5 {
    public final boolean f49863a;
    public boolean f49864b;
    public final n2 f49867g;
    public final FrameLayout h;
    public final MemberRequestsController f49868i;
    public final long f49869j;
    public final int f49870k;
    public final boolean f49871l;
    public FrameLayout f49872m;
    public tx0 f49873n;
    public tx0 f49874o;
    public jm0 f49875p;
    public b10 f49876q;
    public TLRPC.TL_chatInviteImporter f49877r;
    public j f49878s;
    public String f49879t;
    public e f49880u;
    public int v;
    public boolean f49881w;
    public boolean f49883y;
    public boolean f49884z;
    public final ArrayList f49865c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList e = new ArrayList();
    public final f f49866f = new f(this);
    public boolean f49882x = true;
    public boolean A = true;
    public boolean B = true;
    public final e C = new e(this, 0);
    public final kv D = new kv(this, 22);

    public k(n2 n2Var, FrameLayout frameLayout, long j10, boolean z10) {
        this.f49867g = n2Var;
        this.h = frameLayout;
        this.f49869j = j10;
        int currentAccount = n2Var.getCurrentAccount();
        this.f49870k = currentAccount;
        this.f49863a = ChatObject.isChannelAndNotMegaGroup(j10, currentAccount);
        this.f49871l = z10;
        this.f49868i = MemberRequestsController.getInstance(currentAccount);
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

    public final tx0 a() {
        int i10;
        int i11;
        if (this.f49873n == null) {
            n2 n2Var = this.f49867g;
            tx0 tx0Var = new tx0(n2Var.getParentActivity(), null, 16, n2Var.getResourceProvider());
            this.f49873n = tx0Var;
            boolean z10 = this.f49863a;
            if (z10) {
                i10 = R.string.NoSubscribeRequests;
            } else {
                i10 = R.string.NoMemberRequests;
            }
            tx0Var.d.setText(LocaleController.getString(i10));
            x90 x90Var = this.f49873n.e;
            if (z10) {
                i11 = R.string.NoSubscribeRequestsDescription;
            } else {
                i11 = R.string.NoMemberRequestsDescription;
            }
            x90Var.setText(LocaleController.getString(i11));
            this.f49873n.setAnimateLayoutChange(true);
            this.f49873n.setVisibility(8);
        }
        return this.f49873n;
    }

    public final b10 b() {
        if (this.f49876q == null) {
            n2 n2Var = this.f49867g;
            b10 b10Var = new b10(n2Var.getParentActivity(), n2Var.getResourceProvider());
            this.f49876q = b10Var;
            b10Var.setAlpha(0.0f);
            if (this.B) {
                this.f49876q.setBackgroundColor(h6.w0(h6.f20990d6, n2Var.getResourceProvider()));
            }
            this.f49876q.f(h6.f20990d6, h6.f20932a7, -1);
            this.f49876q.setViewType(15);
            this.f49876q.setMemberRequestButton(this.f49863a);
        }
        return this.f49876q;
    }

    public final tx0 c() {
        if (this.f49874o == null) {
            n2 n2Var = this.f49867g;
            tx0 tx0Var = new tx0(n2Var.getParentActivity(), null, 1, n2Var.getResourceProvider());
            this.f49874o = tx0Var;
            if (this.B) {
                tx0Var.setBackgroundColor(h6.w0(h6.f20990d6, n2Var.getResourceProvider()));
            }
            this.f49874o.d.setText(LocaleController.getString(R.string.NoResult));
            this.f49874o.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            this.f49874o.setAnimateLayoutChange(true);
            this.f49874o.setVisibility(8);
        }
        return this.f49874o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z10;
        int i10 = this.f49870k;
        tL_messages_hideChatJoinRequest.peer = MessagesController.getInstance(i10).getInputPeer(-this.f49869j);
        tL_messages_hideChatJoinRequest.user_id = MessagesController.getInstance(i10).getInputUser(user);
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_hideChatJoinRequest, new o0(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        TLRPC.TL_messages_chatInviteImporters cachedImporters;
        boolean z10 = true;
        if (this.A && (cachedImporters = this.f49868i.getCachedImporters(this.f49869j)) != null) {
            this.f49884z = true;
            g(cachedImporters, null, true, true);
            z10 = false;
        }
        AndroidUtilities.runOnUIThread(new b60(19, this, z10));
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
            tx0 tx0Var = this.f49873n;
            if (tx0Var != null) {
                if (z12) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                tx0Var.setVisibility(i11);
            }
            tx0 tx0Var2 = this.f49874o;
            if (tx0Var2 != null) {
                tx0Var2.setVisibility(4);
            }
        } else {
            if (this.f49865c.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            tx0 tx0Var3 = this.f49873n;
            if (tx0Var3 != null) {
                tx0Var3.setVisibility(4);
            }
            tx0 tx0Var4 = this.f49874o;
            if (tx0Var4 != null) {
                if (z12) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                tx0Var4.setVisibility(i10);
            }
        }
        k(this.f49875p, z12, true);
        if (arrayList.isEmpty()) {
            tx0 tx0Var5 = this.f49873n;
            if (tx0Var5 != null) {
                tx0Var5.setVisibility(0);
            }
            tx0 tx0Var6 = this.f49874o;
            if (tx0Var6 != null) {
                tx0Var6.setVisibility(4);
            }
            k(this.f49876q, false, false);
            if (this.f49883y && this.f49871l) {
                this.f49867g.getActionBar().n().j(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: xh.k.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j10;
        if (view instanceof f5) {
            if (this.f49883y) {
                AndroidUtilities.hideKeyboard(this.f49867g.getParentActivity().getCurrentFocus());
            }
            j0 j0Var = new j0(16, this, (f5) view);
            if (this.f49883y) {
                j10 = 100;
            } else {
                j10 = 0;
            }
            AndroidUtilities.runOnUIThread(j0Var, j10);
        }
    }

    public final void i(boolean z10) {
        int i10;
        jm0 jm0Var = this.f49875p;
        if (jm0Var != null && (i10 = !this.f49866f.f49847c.B ? 1 : 0) >= 0 && i10 < jm0Var.getChildCount()) {
            this.f49875p.getChildAt(i10).setEnabled(z10);
        }
    }

    public final void j(String str) {
        if (this.f49880u != null) {
            Utilities.searchQueue.cancelRunnable(this.f49880u);
            this.f49880u = null;
        }
        int i10 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f49870k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f49879t = str;
        if (this.f49884z && this.e.isEmpty()) {
            k(this.f49876q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f49866f.E(this.e);
            k(this.f49875p, true, true);
            k(this.f49876q, false, false);
            tx0 tx0Var = this.f49874o;
            if (tx0Var != null) {
                tx0Var.setVisibility(4);
            }
            if (str == null && this.f49871l) {
                u0 k10 = this.f49867g.getActionBar().n().k(0);
                if (this.e.isEmpty()) {
                    i10 = 8;
                }
                k10.setVisibility(i10);
            }
        } else {
            this.f49866f.E(Collections.EMPTY_LIST);
            k(this.f49875p, false, false);
            k(this.f49876q, true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            e eVar = new e(this, 2);
            this.f49880u = eVar;
            dispatchQueue.postRunnable(eVar, 300L);
        }
        if (str != null) {
            tx0 tx0Var2 = this.f49873n;
            if (tx0Var2 != null) {
                tx0Var2.setVisibility(4);
            }
            tx0 tx0Var3 = this.f49874o;
            if (tx0Var3 != null) {
                tx0Var3.setVisibility(4);
            }
        }
    }
}
