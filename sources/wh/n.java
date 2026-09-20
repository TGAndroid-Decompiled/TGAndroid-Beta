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
import org.telegram.ui.Components.ds0;
import org.telegram.ui.Components.jx0;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.sb0;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.vl0;
import u2.j0;
public abstract class n implements g5 {
    public final boolean f45406a;
    public boolean f45407b;
    public final n2 f45410g;
    public final FrameLayout h;
    public final MemberRequestsController f45411i;
    public final long f45412j;
    public final int f45413k;
    public final boolean f45414l;
    public FrameLayout f45415m;
    public jx0 f45416n;
    public jx0 f45417o;
    public vl0 f45418p;
    public t00 f45419q;
    public TLRPC.TL_chatInviteImporter f45420r;
    public m f45421s;
    public String f45422t;
    public e f45423u;
    public int v;
    public boolean f45424w;
    public boolean f45426y;
    public boolean f45427z;
    public final ArrayList f45408c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList e = new ArrayList();
    public final g f45409f = new g(this);
    public boolean f45425x = true;
    public boolean A = true;
    public boolean B = true;
    public final e C = new e(this, 0);
    public final sb0 D = new sb0(this, 16);

    public n(n2 n2Var, FrameLayout frameLayout, long j3, boolean z10) {
        this.f45410g = n2Var;
        this.h = frameLayout;
        this.f45412j = j3;
        int currentAccount = n2Var.getCurrentAccount();
        this.f45413k = currentAccount;
        this.f45406a = ChatObject.isChannelAndNotMegaGroup(j3, currentAccount);
        this.f45414l = z10;
        this.f45411i = MemberRequestsController.getInstance(currentAccount);
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

    public final jx0 a() {
        int i10;
        int i11;
        if (this.f45416n == null) {
            n2 n2Var = this.f45410g;
            jx0 jx0Var = new jx0(n2Var.getParentActivity(), null, 16, n2Var.getResourceProvider());
            this.f45416n = jx0Var;
            boolean z10 = this.f45406a;
            if (z10) {
                i10 = R.string.NoSubscribeRequests;
            } else {
                i10 = R.string.NoMemberRequests;
            }
            jx0Var.d.setText(LocaleController.getString(i10));
            k90 k90Var = this.f45416n.e;
            if (z10) {
                i11 = R.string.NoSubscribeRequestsDescription;
            } else {
                i11 = R.string.NoMemberRequestsDescription;
            }
            k90Var.setText(LocaleController.getString(i11));
            this.f45416n.setAnimateLayoutChange(true);
            this.f45416n.setVisibility(8);
        }
        return this.f45416n;
    }

    public final t00 b() {
        if (this.f45419q == null) {
            n2 n2Var = this.f45410g;
            t00 t00Var = new t00(n2Var.getParentActivity(), n2Var.getResourceProvider());
            this.f45419q = t00Var;
            t00Var.setAlpha(0.0f);
            if (this.B) {
                this.f45419q.setBackgroundColor(j6.v0(j6.f19094d6, n2Var.getResourceProvider()));
            }
            this.f45419q.f(j6.f19094d6, j6.f19038a7, -1);
            this.f45419q.setViewType(15);
            this.f45419q.setMemberRequestButton(this.f45406a);
        }
        return this.f45419q;
    }

    public final jx0 c() {
        if (this.f45417o == null) {
            n2 n2Var = this.f45410g;
            jx0 jx0Var = new jx0(n2Var.getParentActivity(), null, 1, n2Var.getResourceProvider());
            this.f45417o = jx0Var;
            if (this.B) {
                jx0Var.setBackgroundColor(j6.v0(j6.f19094d6, n2Var.getResourceProvider()));
            }
            this.f45417o.d.setText(LocaleController.getString(R.string.NoResult));
            this.f45417o.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            this.f45417o.setAnimateLayoutChange(true);
            this.f45417o.setVisibility(8);
        }
        return this.f45417o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z10;
        int i10 = this.f45413k;
        tL_messages_hideChatJoinRequest.peer = MessagesController.getInstance(i10).getInputPeer(-this.f45412j);
        tL_messages_hideChatJoinRequest.user_id = MessagesController.getInstance(i10).getInputUser(user);
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_hideChatJoinRequest, new o0(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        TLRPC.TL_messages_chatInviteImporters cachedImporters;
        boolean z10 = true;
        if (this.A && (cachedImporters = this.f45411i.getCachedImporters(this.f45412j)) != null) {
            this.f45427z = true;
            g(cachedImporters, null, true, true);
            z10 = false;
        }
        AndroidUtilities.runOnUIThread(new ds0(12, this, z10));
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
            jx0 jx0Var = this.f45416n;
            if (jx0Var != null) {
                if (z12) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                jx0Var.setVisibility(i11);
            }
            jx0 jx0Var2 = this.f45417o;
            if (jx0Var2 != null) {
                jx0Var2.setVisibility(4);
            }
        } else {
            if (this.f45408c.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            jx0 jx0Var3 = this.f45416n;
            if (jx0Var3 != null) {
                jx0Var3.setVisibility(4);
            }
            jx0 jx0Var4 = this.f45417o;
            if (jx0Var4 != null) {
                if (z12) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                jx0Var4.setVisibility(i10);
            }
        }
        k(this.f45418p, z12, true);
        if (arrayList.isEmpty()) {
            jx0 jx0Var5 = this.f45416n;
            if (jx0Var5 != null) {
                jx0Var5.setVisibility(0);
            }
            jx0 jx0Var6 = this.f45417o;
            if (jx0Var6 != null) {
                jx0Var6.setVisibility(4);
            }
            k(this.f45419q, false, false);
            if (this.f45426y && this.f45414l) {
                this.f45410g.getActionBar().n().j(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: wh.n.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j3;
        if (view instanceof h5) {
            if (this.f45426y) {
                AndroidUtilities.hideKeyboard(this.f45410g.getParentActivity().getCurrentFocus());
            }
            j0 j0Var = new j0(8, this, (h5) view);
            if (this.f45426y) {
                j3 = 100;
            } else {
                j3 = 0;
            }
            AndroidUtilities.runOnUIThread(j0Var, j3);
        }
    }

    public final void i(boolean z10) {
        int i10;
        vl0 vl0Var = this.f45418p;
        if (vl0Var != null && (i10 = !this.f45409f.f45385c.B ? 1 : 0) >= 0 && i10 < vl0Var.getChildCount()) {
            this.f45418p.getChildAt(i10).setEnabled(z10);
        }
    }

    public final void j(String str) {
        if (this.f45423u != null) {
            Utilities.searchQueue.cancelRunnable(this.f45423u);
            this.f45423u = null;
        }
        int i10 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f45413k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f45422t = str;
        if (this.f45427z && this.e.isEmpty()) {
            k(this.f45419q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f45409f.E(this.e);
            k(this.f45418p, true, true);
            k(this.f45419q, false, false);
            jx0 jx0Var = this.f45417o;
            if (jx0Var != null) {
                jx0Var.setVisibility(4);
            }
            if (str == null && this.f45414l) {
                v0 k10 = this.f45410g.getActionBar().n().k(0);
                if (this.e.isEmpty()) {
                    i10 = 8;
                }
                k10.setVisibility(i10);
            }
        } else {
            this.f45409f.E(Collections.EMPTY_LIST);
            k(this.f45418p, false, false);
            k(this.f45419q, true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            e eVar = new e(this, 2);
            this.f45423u = eVar;
            dispatchQueue.postRunnable(eVar, 300L);
        }
        if (str != null) {
            jx0 jx0Var2 = this.f45416n;
            if (jx0Var2 != null) {
                jx0Var2.setVisibility(4);
            }
            jx0 jx0Var3 = this.f45417o;
            if (jx0Var3 != null) {
                jx0Var3.setVisibility(4);
            }
        }
    }
}
