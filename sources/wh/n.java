package wh;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import hg.p0;
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
import org.telegram.ui.ActionBar.v0;
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.kg0;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.sr0;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.xw0;
public abstract class n implements f5 {
    public final boolean f45061a;
    public boolean f45062b;
    public final n2 f45065g;
    public final FrameLayout h;
    public final MemberRequestsController f45066i;
    public final long f45067j;
    public final int f45068k;
    public final boolean f45069l;
    public FrameLayout f45070m;
    public xw0 f45071n;
    public xw0 f45072o;
    public ml0 f45073p;
    public u00 f45074q;
    public TLRPC.TL_chatInviteImporter f45075r;
    public m f45076s;
    public String f45077t;
    public e f45078u;
    public int v;
    public boolean f45079w;
    public boolean f45081y;
    public boolean f45082z;
    public final ArrayList f45063c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList e = new ArrayList();
    public final g f45064f = new g(this);
    public boolean f45080x = true;
    public boolean A = true;
    public boolean B = true;
    public final e C = new e(this, 0);
    public final kg0 D = new kg0(this, 14);

    public n(n2 n2Var, FrameLayout frameLayout, long j3, boolean z10) {
        this.f45065g = n2Var;
        this.h = frameLayout;
        this.f45067j = j3;
        int currentAccount = n2Var.getCurrentAccount();
        this.f45068k = currentAccount;
        this.f45061a = ChatObject.isChannelAndNotMegaGroup(j3, currentAccount);
        this.f45069l = z10;
        this.f45066i = MemberRequestsController.getInstance(currentAccount);
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

    public final xw0 a() {
        int i10;
        int i11;
        if (this.f45071n == null) {
            n2 n2Var = this.f45065g;
            xw0 xw0Var = new xw0(n2Var.getParentActivity(), null, 16, n2Var.getResourceProvider());
            this.f45071n = xw0Var;
            boolean z10 = this.f45061a;
            if (z10) {
                i10 = R.string.NoSubscribeRequests;
            } else {
                i10 = R.string.NoMemberRequests;
            }
            xw0Var.d.setText(LocaleController.getString(i10));
            d90 d90Var = this.f45071n.e;
            if (z10) {
                i11 = R.string.NoSubscribeRequestsDescription;
            } else {
                i11 = R.string.NoMemberRequestsDescription;
            }
            d90Var.setText(LocaleController.getString(i11));
            this.f45071n.setAnimateLayoutChange(true);
            this.f45071n.setVisibility(8);
        }
        return this.f45071n;
    }

    public final u00 b() {
        if (this.f45074q == null) {
            n2 n2Var = this.f45065g;
            u00 u00Var = new u00(n2Var.getParentActivity(), n2Var.getResourceProvider());
            this.f45074q = u00Var;
            u00Var.setAlpha(0.0f);
            if (this.B) {
                this.f45074q.setBackgroundColor(h6.v0(h6.f18789d6, n2Var.getResourceProvider()));
            }
            this.f45074q.f(h6.f18789d6, h6.f18733a7, -1);
            this.f45074q.setViewType(15);
            this.f45074q.setMemberRequestButton(this.f45061a);
        }
        return this.f45074q;
    }

    public final xw0 c() {
        if (this.f45072o == null) {
            n2 n2Var = this.f45065g;
            xw0 xw0Var = new xw0(n2Var.getParentActivity(), null, 1, n2Var.getResourceProvider());
            this.f45072o = xw0Var;
            if (this.B) {
                xw0Var.setBackgroundColor(h6.v0(h6.f18789d6, n2Var.getResourceProvider()));
            }
            this.f45072o.d.setText(LocaleController.getString(R.string.NoResult));
            this.f45072o.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            this.f45072o.setAnimateLayoutChange(true);
            this.f45072o.setVisibility(8);
        }
        return this.f45072o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z10;
        int i10 = this.f45068k;
        tL_messages_hideChatJoinRequest.peer = MessagesController.getInstance(i10).getInputPeer(-this.f45067j);
        tL_messages_hideChatJoinRequest.user_id = MessagesController.getInstance(i10).getInputUser(user);
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_hideChatJoinRequest, new p0(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        TLRPC.TL_messages_chatInviteImporters cachedImporters;
        boolean z10 = true;
        if (this.A && (cachedImporters = this.f45066i.getCachedImporters(this.f45067j)) != null) {
            this.f45082z = true;
            g(cachedImporters, null, true, true);
            z10 = false;
        }
        AndroidUtilities.runOnUIThread(new sr0(12, this, z10));
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
            xw0 xw0Var = this.f45071n;
            if (xw0Var != null) {
                if (z12) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                xw0Var.setVisibility(i11);
            }
            xw0 xw0Var2 = this.f45072o;
            if (xw0Var2 != null) {
                xw0Var2.setVisibility(4);
            }
        } else {
            if (this.f45063c.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            xw0 xw0Var3 = this.f45071n;
            if (xw0Var3 != null) {
                xw0Var3.setVisibility(4);
            }
            xw0 xw0Var4 = this.f45072o;
            if (xw0Var4 != null) {
                if (z12) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                xw0Var4.setVisibility(i10);
            }
        }
        k(this.f45073p, z12, true);
        if (arrayList.isEmpty()) {
            xw0 xw0Var5 = this.f45071n;
            if (xw0Var5 != null) {
                xw0Var5.setVisibility(0);
            }
            xw0 xw0Var6 = this.f45072o;
            if (xw0Var6 != null) {
                xw0Var6.setVisibility(4);
            }
            k(this.f45074q, false, false);
            if (this.f45081y && this.f45069l) {
                this.f45065g.getActionBar().n().j(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: wh.n.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j3;
        if (view instanceof g5) {
            if (this.f45081y) {
                AndroidUtilities.hideKeyboard(this.f45065g.getParentActivity().getCurrentFocus());
            }
            uh.i iVar = new uh.i(2, this, (g5) view);
            if (this.f45081y) {
                j3 = 100;
            } else {
                j3 = 0;
            }
            AndroidUtilities.runOnUIThread(iVar, j3);
        }
    }

    public final void i(boolean z10) {
        int i10;
        ml0 ml0Var = this.f45073p;
        if (ml0Var != null && (i10 = !this.f45064f.f45040c.B ? 1 : 0) >= 0 && i10 < ml0Var.getChildCount()) {
            this.f45073p.getChildAt(i10).setEnabled(z10);
        }
    }

    public final void j(String str) {
        if (this.f45078u != null) {
            Utilities.searchQueue.cancelRunnable(this.f45078u);
            this.f45078u = null;
        }
        int i10 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f45068k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f45077t = str;
        if (this.f45082z && this.e.isEmpty()) {
            k(this.f45074q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f45064f.E(this.e);
            k(this.f45073p, true, true);
            k(this.f45074q, false, false);
            xw0 xw0Var = this.f45072o;
            if (xw0Var != null) {
                xw0Var.setVisibility(4);
            }
            if (str == null && this.f45069l) {
                v0 k10 = this.f45065g.getActionBar().n().k(0);
                if (this.e.isEmpty()) {
                    i10 = 8;
                }
                k10.setVisibility(i10);
            }
        } else {
            this.f45064f.E(Collections.EMPTY_LIST);
            k(this.f45073p, false, false);
            k(this.f45074q, true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            e eVar = new e(this, 2);
            this.f45078u = eVar;
            dispatchQueue.postRunnable(eVar, 300L);
        }
        if (str != null) {
            xw0 xw0Var2 = this.f45071n;
            if (xw0Var2 != null) {
                xw0Var2.setVisibility(4);
            }
            xw0 xw0Var3 = this.f45072o;
            if (xw0Var3 != null) {
                xw0Var3.setVisibility(4);
            }
        }
    }
}
