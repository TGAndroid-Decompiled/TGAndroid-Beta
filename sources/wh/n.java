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
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Components.es0;
import org.telegram.ui.Components.kx0;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.tb0;
import org.telegram.ui.Components.wl0;
public abstract class n implements f5 {
    public final boolean f45362a;
    public boolean f45363b;
    public final n2 f45366g;
    public final FrameLayout h;
    public final MemberRequestsController f45367i;
    public final long f45368j;
    public final int f45369k;
    public final boolean f45370l;
    public FrameLayout f45371m;
    public kx0 f45372n;
    public kx0 f45373o;
    public wl0 f45374p;
    public t00 f45375q;
    public TLRPC.TL_chatInviteImporter f45376r;
    public m f45377s;
    public String f45378t;
    public e f45379u;
    public int v;
    public boolean f45380w;
    public boolean f45382y;
    public boolean f45383z;
    public final ArrayList f45364c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList e = new ArrayList();
    public final g f45365f = new g(this);
    public boolean f45381x = true;
    public boolean A = true;
    public boolean B = true;
    public final e C = new e(this, 0);
    public final tb0 D = new tb0(this, 16);

    public n(n2 n2Var, FrameLayout frameLayout, long j3, boolean z10) {
        this.f45366g = n2Var;
        this.h = frameLayout;
        this.f45368j = j3;
        int currentAccount = n2Var.getCurrentAccount();
        this.f45369k = currentAccount;
        this.f45362a = ChatObject.isChannelAndNotMegaGroup(j3, currentAccount);
        this.f45370l = z10;
        this.f45367i = MemberRequestsController.getInstance(currentAccount);
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

    public final kx0 a() {
        int i10;
        int i11;
        if (this.f45372n == null) {
            n2 n2Var = this.f45366g;
            kx0 kx0Var = new kx0(n2Var.getParentActivity(), null, 16, n2Var.getResourceProvider());
            this.f45372n = kx0Var;
            boolean z10 = this.f45362a;
            if (z10) {
                i10 = R.string.NoSubscribeRequests;
            } else {
                i10 = R.string.NoMemberRequests;
            }
            kx0Var.d.setText(LocaleController.getString(i10));
            l90 l90Var = this.f45372n.e;
            if (z10) {
                i11 = R.string.NoSubscribeRequestsDescription;
            } else {
                i11 = R.string.NoMemberRequestsDescription;
            }
            l90Var.setText(LocaleController.getString(i11));
            this.f45372n.setAnimateLayoutChange(true);
            this.f45372n.setVisibility(8);
        }
        return this.f45372n;
    }

    public final t00 b() {
        if (this.f45375q == null) {
            n2 n2Var = this.f45366g;
            t00 t00Var = new t00(n2Var.getParentActivity(), n2Var.getResourceProvider());
            this.f45375q = t00Var;
            t00Var.setAlpha(0.0f);
            if (this.B) {
                this.f45375q.setBackgroundColor(j6.v0(j6.f19062d6, n2Var.getResourceProvider()));
            }
            this.f45375q.f(j6.f19062d6, j6.f19006a7, -1);
            this.f45375q.setViewType(15);
            this.f45375q.setMemberRequestButton(this.f45362a);
        }
        return this.f45375q;
    }

    public final kx0 c() {
        if (this.f45373o == null) {
            n2 n2Var = this.f45366g;
            kx0 kx0Var = new kx0(n2Var.getParentActivity(), null, 1, n2Var.getResourceProvider());
            this.f45373o = kx0Var;
            if (this.B) {
                kx0Var.setBackgroundColor(j6.v0(j6.f19062d6, n2Var.getResourceProvider()));
            }
            this.f45373o.d.setText(LocaleController.getString(R.string.NoResult));
            this.f45373o.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            this.f45373o.setAnimateLayoutChange(true);
            this.f45373o.setVisibility(8);
        }
        return this.f45373o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z10;
        int i10 = this.f45369k;
        tL_messages_hideChatJoinRequest.peer = MessagesController.getInstance(i10).getInputPeer(-this.f45368j);
        tL_messages_hideChatJoinRequest.user_id = MessagesController.getInstance(i10).getInputUser(user);
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_hideChatJoinRequest, new o0(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        TLRPC.TL_messages_chatInviteImporters cachedImporters;
        boolean z10 = true;
        if (this.A && (cachedImporters = this.f45367i.getCachedImporters(this.f45368j)) != null) {
            this.f45383z = true;
            g(cachedImporters, null, true, true);
            z10 = false;
        }
        AndroidUtilities.runOnUIThread(new es0(12, this, z10));
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
            kx0 kx0Var = this.f45372n;
            if (kx0Var != null) {
                if (z12) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                kx0Var.setVisibility(i11);
            }
            kx0 kx0Var2 = this.f45373o;
            if (kx0Var2 != null) {
                kx0Var2.setVisibility(4);
            }
        } else {
            if (this.f45364c.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            kx0 kx0Var3 = this.f45372n;
            if (kx0Var3 != null) {
                kx0Var3.setVisibility(4);
            }
            kx0 kx0Var4 = this.f45373o;
            if (kx0Var4 != null) {
                if (z12) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                kx0Var4.setVisibility(i10);
            }
        }
        k(this.f45374p, z12, true);
        if (arrayList.isEmpty()) {
            kx0 kx0Var5 = this.f45372n;
            if (kx0Var5 != null) {
                kx0Var5.setVisibility(0);
            }
            kx0 kx0Var6 = this.f45373o;
            if (kx0Var6 != null) {
                kx0Var6.setVisibility(4);
            }
            k(this.f45375q, false, false);
            if (this.f45382y && this.f45370l) {
                this.f45366g.getActionBar().n().j(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: wh.n.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j3;
        if (view instanceof g5) {
            if (this.f45382y) {
                AndroidUtilities.hideKeyboard(this.f45366g.getParentActivity().getCurrentFocus());
            }
            uf.b bVar = new uf.b(6, this, (g5) view);
            if (this.f45382y) {
                j3 = 100;
            } else {
                j3 = 0;
            }
            AndroidUtilities.runOnUIThread(bVar, j3);
        }
    }

    public final void i(boolean z10) {
        int i10;
        wl0 wl0Var = this.f45374p;
        if (wl0Var != null && (i10 = !this.f45365f.f45341c.B ? 1 : 0) >= 0 && i10 < wl0Var.getChildCount()) {
            this.f45374p.getChildAt(i10).setEnabled(z10);
        }
    }

    public final void j(String str) {
        if (this.f45379u != null) {
            Utilities.searchQueue.cancelRunnable(this.f45379u);
            this.f45379u = null;
        }
        int i10 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f45369k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f45378t = str;
        if (this.f45383z && this.e.isEmpty()) {
            k(this.f45375q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f45365f.E(this.e);
            k(this.f45374p, true, true);
            k(this.f45375q, false, false);
            kx0 kx0Var = this.f45373o;
            if (kx0Var != null) {
                kx0Var.setVisibility(4);
            }
            if (str == null && this.f45370l) {
                v0 k10 = this.f45366g.getActionBar().n().k(0);
                if (this.e.isEmpty()) {
                    i10 = 8;
                }
                k10.setVisibility(i10);
            }
        } else {
            this.f45365f.E(Collections.EMPTY_LIST);
            k(this.f45374p, false, false);
            k(this.f45375q, true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            e eVar = new e(this, 2);
            this.f45379u = eVar;
            dispatchQueue.postRunnable(eVar, 300L);
        }
        if (str != null) {
            kx0 kx0Var2 = this.f45372n;
            if (kx0Var2 != null) {
                kx0Var2.setVisibility(4);
            }
            kx0 kx0Var3 = this.f45373o;
            if (kx0Var3 != null) {
                kx0Var3.setVisibility(4);
            }
        }
    }
}
