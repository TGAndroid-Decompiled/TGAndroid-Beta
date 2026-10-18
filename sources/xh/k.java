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
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.x90;
import u2.q0;
public abstract class k implements e5 {
    public final boolean f49857a;
    public boolean f49858b;
    public final n2 f49861g;
    public final FrameLayout h;
    public final MemberRequestsController f49862i;
    public final long f49863j;
    public final int f49864k;
    public final boolean f49865l;
    public FrameLayout f49866m;
    public rx0 f49867n;
    public rx0 f49868o;
    public im0 f49869p;
    public b10 f49870q;
    public TLRPC.TL_chatInviteImporter f49871r;
    public j f49872s;
    public String f49873t;
    public e f49874u;
    public int v;
    public boolean f49875w;
    public boolean f49877y;
    public boolean f49878z;
    public final ArrayList f49859c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList e = new ArrayList();
    public final f f49860f = new f(this);
    public boolean f49876x = true;
    public boolean A = true;
    public boolean B = true;
    public final e C = new e(this, 0);
    public final kv D = new kv(this, 22);

    public k(n2 n2Var, FrameLayout frameLayout, long j10, boolean z10) {
        this.f49861g = n2Var;
        this.h = frameLayout;
        this.f49863j = j10;
        int currentAccount = n2Var.getCurrentAccount();
        this.f49864k = currentAccount;
        this.f49857a = ChatObject.isChannelAndNotMegaGroup(j10, currentAccount);
        this.f49865l = z10;
        this.f49862i = MemberRequestsController.getInstance(currentAccount);
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

    public final rx0 a() {
        int i10;
        int i11;
        if (this.f49867n == null) {
            n2 n2Var = this.f49861g;
            rx0 rx0Var = new rx0(n2Var.getParentActivity(), null, 16, n2Var.getResourceProvider());
            this.f49867n = rx0Var;
            boolean z10 = this.f49857a;
            if (z10) {
                i10 = R.string.NoSubscribeRequests;
            } else {
                i10 = R.string.NoMemberRequests;
            }
            rx0Var.d.setText(LocaleController.getString(i10));
            x90 x90Var = this.f49867n.e;
            if (z10) {
                i11 = R.string.NoSubscribeRequestsDescription;
            } else {
                i11 = R.string.NoMemberRequestsDescription;
            }
            x90Var.setText(LocaleController.getString(i11));
            this.f49867n.setAnimateLayoutChange(true);
            this.f49867n.setVisibility(8);
        }
        return this.f49867n;
    }

    public final b10 b() {
        if (this.f49870q == null) {
            n2 n2Var = this.f49861g;
            b10 b10Var = new b10(n2Var.getParentActivity(), n2Var.getResourceProvider());
            this.f49870q = b10Var;
            b10Var.setAlpha(0.0f);
            if (this.B) {
                this.f49870q.setBackgroundColor(h6.w0(h6.f20986d6, n2Var.getResourceProvider()));
            }
            this.f49870q.f(h6.f20986d6, h6.f20928a7, -1);
            this.f49870q.setViewType(15);
            this.f49870q.setMemberRequestButton(this.f49857a);
        }
        return this.f49870q;
    }

    public final rx0 c() {
        if (this.f49868o == null) {
            n2 n2Var = this.f49861g;
            rx0 rx0Var = new rx0(n2Var.getParentActivity(), null, 1, n2Var.getResourceProvider());
            this.f49868o = rx0Var;
            if (this.B) {
                rx0Var.setBackgroundColor(h6.w0(h6.f20986d6, n2Var.getResourceProvider()));
            }
            this.f49868o.d.setText(LocaleController.getString(R.string.NoResult));
            this.f49868o.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            this.f49868o.setAnimateLayoutChange(true);
            this.f49868o.setVisibility(8);
        }
        return this.f49868o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z10;
        int i10 = this.f49864k;
        tL_messages_hideChatJoinRequest.peer = MessagesController.getInstance(i10).getInputPeer(-this.f49863j);
        tL_messages_hideChatJoinRequest.user_id = MessagesController.getInstance(i10).getInputUser(user);
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_hideChatJoinRequest, new o0(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        TLRPC.TL_messages_chatInviteImporters cachedImporters;
        boolean z10 = true;
        if (this.A && (cachedImporters = this.f49862i.getCachedImporters(this.f49863j)) != null) {
            this.f49878z = true;
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
            rx0 rx0Var = this.f49867n;
            if (rx0Var != null) {
                if (z12) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                rx0Var.setVisibility(i11);
            }
            rx0 rx0Var2 = this.f49868o;
            if (rx0Var2 != null) {
                rx0Var2.setVisibility(4);
            }
        } else {
            if (this.f49859c.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            rx0 rx0Var3 = this.f49867n;
            if (rx0Var3 != null) {
                rx0Var3.setVisibility(4);
            }
            rx0 rx0Var4 = this.f49868o;
            if (rx0Var4 != null) {
                if (z12) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                rx0Var4.setVisibility(i10);
            }
        }
        k(this.f49869p, z12, true);
        if (arrayList.isEmpty()) {
            rx0 rx0Var5 = this.f49867n;
            if (rx0Var5 != null) {
                rx0Var5.setVisibility(0);
            }
            rx0 rx0Var6 = this.f49868o;
            if (rx0Var6 != null) {
                rx0Var6.setVisibility(4);
            }
            k(this.f49870q, false, false);
            if (this.f49877y && this.f49865l) {
                this.f49861g.getActionBar().n().j(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: xh.k.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j10;
        if (view instanceof f5) {
            if (this.f49877y) {
                AndroidUtilities.hideKeyboard(this.f49861g.getParentActivity().getCurrentFocus());
            }
            q0 q0Var = new q0(15, this, (f5) view);
            if (this.f49877y) {
                j10 = 100;
            } else {
                j10 = 0;
            }
            AndroidUtilities.runOnUIThread(q0Var, j10);
        }
    }

    public final void i(boolean z10) {
        int i10;
        im0 im0Var = this.f49869p;
        if (im0Var != null && (i10 = !this.f49860f.f49841c.B ? 1 : 0) >= 0 && i10 < im0Var.getChildCount()) {
            this.f49869p.getChildAt(i10).setEnabled(z10);
        }
    }

    public final void j(String str) {
        if (this.f49874u != null) {
            Utilities.searchQueue.cancelRunnable(this.f49874u);
            this.f49874u = null;
        }
        int i10 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f49864k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f49873t = str;
        if (this.f49878z && this.e.isEmpty()) {
            k(this.f49870q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f49860f.E(this.e);
            k(this.f49869p, true, true);
            k(this.f49870q, false, false);
            rx0 rx0Var = this.f49868o;
            if (rx0Var != null) {
                rx0Var.setVisibility(4);
            }
            if (str == null && this.f49865l) {
                u0 k10 = this.f49861g.getActionBar().n().k(0);
                if (this.e.isEmpty()) {
                    i10 = 8;
                }
                k10.setVisibility(i10);
            }
        } else {
            this.f49860f.E(Collections.EMPTY_LIST);
            k(this.f49869p, false, false);
            k(this.f49870q, true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            e eVar = new e(this, 2);
            this.f49874u = eVar;
            dispatchQueue.postRunnable(eVar, 300L);
        }
        if (str != null) {
            rx0 rx0Var2 = this.f49867n;
            if (rx0Var2 != null) {
                rx0Var2.setVisibility(4);
            }
            rx0 rx0Var3 = this.f49868o;
            if (rx0Var3 != null) {
                rx0Var3.setVisibility(4);
            }
        }
    }
}
