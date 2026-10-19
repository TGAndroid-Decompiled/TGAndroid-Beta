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
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.kv;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.x90;
public abstract class k implements e5 {
    public final boolean f49858a;
    public boolean f49859b;
    public final n2 f49862g;
    public final FrameLayout h;
    public final MemberRequestsController f49863i;
    public final long f49864j;
    public final int f49865k;
    public final boolean f49866l;
    public FrameLayout f49867m;
    public sx0 f49868n;
    public sx0 f49869o;
    public im0 f49870p;
    public b10 f49871q;
    public TLRPC.TL_chatInviteImporter f49872r;
    public j f49873s;
    public String f49874t;
    public e f49875u;
    public int v;
    public boolean f49876w;
    public boolean f49878y;
    public boolean f49879z;
    public final ArrayList f49860c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList e = new ArrayList();
    public final f f49861f = new f(this);
    public boolean f49877x = true;
    public boolean A = true;
    public boolean B = true;
    public final e C = new e(this, 0);
    public final kv D = new kv(this, 22);

    public k(n2 n2Var, FrameLayout frameLayout, long j10, boolean z10) {
        this.f49862g = n2Var;
        this.h = frameLayout;
        this.f49864j = j10;
        int currentAccount = n2Var.getCurrentAccount();
        this.f49865k = currentAccount;
        this.f49858a = ChatObject.isChannelAndNotMegaGroup(j10, currentAccount);
        this.f49866l = z10;
        this.f49863i = MemberRequestsController.getInstance(currentAccount);
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

    public final sx0 a() {
        int i10;
        int i11;
        if (this.f49868n == null) {
            n2 n2Var = this.f49862g;
            sx0 sx0Var = new sx0(n2Var.getParentActivity(), null, 16, n2Var.getResourceProvider());
            this.f49868n = sx0Var;
            boolean z10 = this.f49858a;
            if (z10) {
                i10 = R.string.NoSubscribeRequests;
            } else {
                i10 = R.string.NoMemberRequests;
            }
            sx0Var.d.setText(LocaleController.getString(i10));
            x90 x90Var = this.f49868n.e;
            if (z10) {
                i11 = R.string.NoSubscribeRequestsDescription;
            } else {
                i11 = R.string.NoMemberRequestsDescription;
            }
            x90Var.setText(LocaleController.getString(i11));
            this.f49868n.setAnimateLayoutChange(true);
            this.f49868n.setVisibility(8);
        }
        return this.f49868n;
    }

    public final b10 b() {
        if (this.f49871q == null) {
            n2 n2Var = this.f49862g;
            b10 b10Var = new b10(n2Var.getParentActivity(), n2Var.getResourceProvider());
            this.f49871q = b10Var;
            b10Var.setAlpha(0.0f);
            if (this.B) {
                this.f49871q.setBackgroundColor(h6.w0(h6.f20987d6, n2Var.getResourceProvider()));
            }
            this.f49871q.f(h6.f20987d6, h6.f20929a7, -1);
            this.f49871q.setViewType(15);
            this.f49871q.setMemberRequestButton(this.f49858a);
        }
        return this.f49871q;
    }

    public final sx0 c() {
        if (this.f49869o == null) {
            n2 n2Var = this.f49862g;
            sx0 sx0Var = new sx0(n2Var.getParentActivity(), null, 1, n2Var.getResourceProvider());
            this.f49869o = sx0Var;
            if (this.B) {
                sx0Var.setBackgroundColor(h6.w0(h6.f20987d6, n2Var.getResourceProvider()));
            }
            this.f49869o.d.setText(LocaleController.getString(R.string.NoResult));
            this.f49869o.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            this.f49869o.setAnimateLayoutChange(true);
            this.f49869o.setVisibility(8);
        }
        return this.f49869o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z10;
        int i10 = this.f49865k;
        tL_messages_hideChatJoinRequest.peer = MessagesController.getInstance(i10).getInputPeer(-this.f49864j);
        tL_messages_hideChatJoinRequest.user_id = MessagesController.getInstance(i10).getInputUser(user);
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_hideChatJoinRequest, new o0(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        TLRPC.TL_messages_chatInviteImporters cachedImporters;
        boolean z10 = true;
        if (this.A && (cachedImporters = this.f49863i.getCachedImporters(this.f49864j)) != null) {
            this.f49879z = true;
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
            sx0 sx0Var = this.f49868n;
            if (sx0Var != null) {
                if (z12) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                sx0Var.setVisibility(i11);
            }
            sx0 sx0Var2 = this.f49869o;
            if (sx0Var2 != null) {
                sx0Var2.setVisibility(4);
            }
        } else {
            if (this.f49860c.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            sx0 sx0Var3 = this.f49868n;
            if (sx0Var3 != null) {
                sx0Var3.setVisibility(4);
            }
            sx0 sx0Var4 = this.f49869o;
            if (sx0Var4 != null) {
                if (z12) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                sx0Var4.setVisibility(i10);
            }
        }
        k(this.f49870p, z12, true);
        if (arrayList.isEmpty()) {
            sx0 sx0Var5 = this.f49868n;
            if (sx0Var5 != null) {
                sx0Var5.setVisibility(0);
            }
            sx0 sx0Var6 = this.f49869o;
            if (sx0Var6 != null) {
                sx0Var6.setVisibility(4);
            }
            k(this.f49871q, false, false);
            if (this.f49878y && this.f49866l) {
                this.f49862g.getActionBar().n().j(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: xh.k.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j10;
        if (view instanceof f5) {
            if (this.f49878y) {
                AndroidUtilities.hideKeyboard(this.f49862g.getParentActivity().getCurrentFocus());
            }
            uf.c cVar = new uf.c(14, this, (f5) view);
            if (this.f49878y) {
                j10 = 100;
            } else {
                j10 = 0;
            }
            AndroidUtilities.runOnUIThread(cVar, j10);
        }
    }

    public final void i(boolean z10) {
        int i10;
        im0 im0Var = this.f49870p;
        if (im0Var != null && (i10 = !this.f49861f.f49842c.B ? 1 : 0) >= 0 && i10 < im0Var.getChildCount()) {
            this.f49870p.getChildAt(i10).setEnabled(z10);
        }
    }

    public final void j(String str) {
        if (this.f49875u != null) {
            Utilities.searchQueue.cancelRunnable(this.f49875u);
            this.f49875u = null;
        }
        int i10 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f49865k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f49874t = str;
        if (this.f49879z && this.e.isEmpty()) {
            k(this.f49871q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f49861f.E(this.e);
            k(this.f49870p, true, true);
            k(this.f49871q, false, false);
            sx0 sx0Var = this.f49869o;
            if (sx0Var != null) {
                sx0Var.setVisibility(4);
            }
            if (str == null && this.f49866l) {
                u0 k10 = this.f49862g.getActionBar().n().k(0);
                if (this.e.isEmpty()) {
                    i10 = 8;
                }
                k10.setVisibility(i10);
            }
        } else {
            this.f49861f.E(Collections.EMPTY_LIST);
            k(this.f49870p, false, false);
            k(this.f49871q, true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            e eVar = new e(this, 2);
            this.f49875u = eVar;
            dispatchQueue.postRunnable(eVar, 300L);
        }
        if (str != null) {
            sx0 sx0Var2 = this.f49868n;
            if (sx0Var2 != null) {
                sx0Var2.setVisibility(4);
            }
            sx0 sx0Var3 = this.f49869o;
            if (sx0Var3 != null) {
                sx0Var3.setVisibility(4);
            }
        }
    }
}
