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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ActionBar.u0;
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.fs0;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.sm0;
import tg.c1;
public abstract class l implements f5 {
    public final boolean f50516a;
    public boolean f50517b;
    public final m2 f50521g;
    public final FrameLayout h;
    public final MemberRequestsController f50522i;
    public final long f50523j;
    public final int f50524k;
    public final boolean f50525l;
    public FrameLayout f50526m;
    public cy0 f50527n;
    public cy0 f50528o;
    public sm0 f50529p;
    public k10 f50530q;
    public TLRPC.TL_chatInviteImporter f50531r;
    public k f50532s;
    public String f50533t;
    public e f50534u;
    public int v;
    public boolean f50535w;
    public boolean f50537y;
    public boolean f50538z;
    public final ArrayList f50518c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList f50519e = new ArrayList();
    public final g f50520f = new g(this);
    public boolean f50536x = true;
    public boolean A = true;
    public boolean B = true;
    public final e C = new e(this, 0);
    public final oh0 D = new oh0(this, 17);

    public l(m2 m2Var, FrameLayout frameLayout, long j3, boolean z10) {
        this.f50521g = m2Var;
        this.h = frameLayout;
        this.f50523j = j3;
        int currentAccount = m2Var.getCurrentAccount();
        this.f50524k = currentAccount;
        this.f50516a = ChatObject.isChannelAndNotMegaGroup(j3, currentAccount);
        this.f50525l = z10;
        this.f50522i = MemberRequestsController.getInstance(currentAccount);
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

    public final cy0 a() {
        int i10;
        int i11;
        if (this.f50527n == null) {
            m2 m2Var = this.f50521g;
            cy0 cy0Var = new cy0(m2Var.getParentActivity(), null, 16, m2Var.getResourceProvider());
            this.f50527n = cy0Var;
            boolean z10 = this.f50516a;
            if (z10) {
                i10 = R.string.NoSubscribeRequests;
            } else {
                i10 = R.string.NoMemberRequests;
            }
            cy0Var.d.setText(LocaleController.getString(i10));
            fa0 fa0Var = this.f50527n.f25351e;
            if (z10) {
                i11 = R.string.NoSubscribeRequestsDescription;
            } else {
                i11 = R.string.NoMemberRequestsDescription;
            }
            fa0Var.setText(LocaleController.getString(i11));
            this.f50527n.setAnimateLayoutChange(true);
            this.f50527n.setVisibility(8);
        }
        return this.f50527n;
    }

    public final k10 b() {
        if (this.f50530q == null) {
            m2 m2Var = this.f50521g;
            k10 k10Var = new k10(m2Var.getParentActivity(), m2Var.getResourceProvider());
            this.f50530q = k10Var;
            k10Var.setAlpha(0.0f);
            if (this.B) {
                this.f50530q.setBackgroundColor(h6.w0(h6.f20786d6, m2Var.getResourceProvider()));
            }
            this.f50530q.f(h6.f20786d6, h6.f20730a7, -1);
            this.f50530q.setViewType(15);
            this.f50530q.setMemberRequestButton(this.f50516a);
        }
        return this.f50530q;
    }

    public final cy0 c() {
        if (this.f50528o == null) {
            m2 m2Var = this.f50521g;
            cy0 cy0Var = new cy0(m2Var.getParentActivity(), null, 1, m2Var.getResourceProvider());
            this.f50528o = cy0Var;
            if (this.B) {
                cy0Var.setBackgroundColor(h6.w0(h6.f20786d6, m2Var.getResourceProvider()));
            }
            this.f50528o.d.setText(LocaleController.getString(R.string.NoResult));
            this.f50528o.f25351e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            this.f50528o.setAnimateLayoutChange(true);
            this.f50528o.setVisibility(8);
        }
        return this.f50528o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z10;
        int i10 = this.f50524k;
        tL_messages_hideChatJoinRequest.peer = MessagesController.getInstance(i10).getInputPeer(-this.f50523j);
        tL_messages_hideChatJoinRequest.user_id = MessagesController.getInstance(i10).getInputUser(user);
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_hideChatJoinRequest, new o0(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        TLRPC.TL_messages_chatInviteImporters cachedImporters;
        boolean z10 = true;
        if (this.A && (cachedImporters = this.f50522i.getCachedImporters(this.f50523j)) != null) {
            this.f50538z = true;
            g(cachedImporters, null, true, true);
            z10 = false;
        }
        AndroidUtilities.runOnUIThread(new fs0(15, this, z10));
    }

    public void f(String str, boolean z10, boolean z11) {
        boolean z12;
        int i10;
        int i11;
        boolean isEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList = this.f50519e;
        if (isEmpty) {
            if (arrayList.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            cy0 cy0Var = this.f50527n;
            if (cy0Var != null) {
                if (z12) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                cy0Var.setVisibility(i11);
            }
            cy0 cy0Var2 = this.f50528o;
            if (cy0Var2 != null) {
                cy0Var2.setVisibility(4);
            }
        } else {
            if (this.f50518c.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            cy0 cy0Var3 = this.f50527n;
            if (cy0Var3 != null) {
                cy0Var3.setVisibility(4);
            }
            cy0 cy0Var4 = this.f50528o;
            if (cy0Var4 != null) {
                if (z12) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                cy0Var4.setVisibility(i10);
            }
        }
        k(this.f50529p, z12, true);
        if (arrayList.isEmpty()) {
            cy0 cy0Var5 = this.f50527n;
            if (cy0Var5 != null) {
                cy0Var5.setVisibility(0);
            }
            cy0 cy0Var6 = this.f50528o;
            if (cy0Var6 != null) {
                cy0Var6.setVisibility(4);
            }
            k(this.f50530q, false, false);
            if (this.f50537y && this.f50525l) {
                this.f50521g.getActionBar().o().j(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: wh.l.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j3;
        if (view instanceof g5) {
            if (this.f50537y) {
                AndroidUtilities.hideKeyboard(this.f50521g.getParentActivity().getCurrentFocus());
            }
            c1 c1Var = new c1(9, this, (g5) view);
            if (this.f50537y) {
                j3 = 100;
            } else {
                j3 = 0;
            }
            AndroidUtilities.runOnUIThread(c1Var, j3);
        }
    }

    public final void i(boolean z10) {
        int i10;
        sm0 sm0Var = this.f50529p;
        if (sm0Var != null && (i10 = !this.f50520f.f50498c.B ? 1 : 0) >= 0 && i10 < sm0Var.getChildCount()) {
            this.f50529p.getChildAt(i10).setEnabled(z10);
        }
    }

    public final void j(String str) {
        if (this.f50534u != null) {
            Utilities.searchQueue.cancelRunnable(this.f50534u);
            this.f50534u = null;
        }
        int i10 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f50524k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f50533t = str;
        if (this.f50538z && this.f50519e.isEmpty()) {
            k(this.f50530q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f50520f.E(this.f50519e);
            k(this.f50529p, true, true);
            k(this.f50530q, false, false);
            cy0 cy0Var = this.f50528o;
            if (cy0Var != null) {
                cy0Var.setVisibility(4);
            }
            if (str == null && this.f50525l) {
                u0 k10 = this.f50521g.getActionBar().o().k(0);
                if (this.f50519e.isEmpty()) {
                    i10 = 8;
                }
                k10.setVisibility(i10);
            }
        } else {
            this.f50520f.E(Collections.EMPTY_LIST);
            k(this.f50529p, false, false);
            k(this.f50530q, true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            e eVar = new e(this, 2);
            this.f50534u = eVar;
            dispatchQueue.postRunnable(eVar, 300L);
        }
        if (str != null) {
            cy0 cy0Var2 = this.f50527n;
            if (cy0Var2 != null) {
                cy0Var2.setVisibility(4);
            }
            cy0 cy0Var3 = this.f50528o;
            if (cy0Var3 != null) {
                cy0Var3.setVisibility(4);
            }
        }
    }
}
