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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.v0;
import org.telegram.ui.Cells.e5;
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.mr0;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.xw0;
import ug.r;
public abstract class n implements e5 {
    public final boolean f49443a;
    public boolean f49444b;
    public final n2 f49448g;
    public final FrameLayout h;
    public final MemberRequestsController f49449i;
    public final long f49450j;
    public final int f49451k;
    public final boolean f49452l;
    public FrameLayout f49453m;
    public xw0 f49454n;
    public xw0 f49455o;
    public ll0 f49456p;
    public t00 f49457q;
    public TLRPC.TL_chatInviteImporter f49458r;
    public m f49459s;
    public String f49460t;
    public e f49461u;
    public int v;
    public boolean f49462w;
    public boolean f49464y;
    public boolean f49465z;
    public final ArrayList f49445c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList f49446e = new ArrayList();
    public final g f49447f = new g(this);
    public boolean f49463x = true;
    public boolean A = true;
    public boolean B = true;
    public final e C = new e(this, 0);
    public final lb0 D = new lb0(this, 15);

    public n(n2 n2Var, FrameLayout frameLayout, long j3, boolean z10) {
        this.f49448g = n2Var;
        this.h = frameLayout;
        this.f49450j = j3;
        int currentAccount = n2Var.getCurrentAccount();
        this.f49451k = currentAccount;
        this.f49443a = ChatObject.isChannelAndNotMegaGroup(j3, currentAccount);
        this.f49452l = z10;
        this.f49449i = MemberRequestsController.getInstance(currentAccount);
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
        if (this.f49454n == null) {
            n2 n2Var = this.f49448g;
            xw0 xw0Var = new xw0(n2Var.getParentActivity(), null, 16, n2Var.getResourceProvider());
            this.f49454n = xw0Var;
            boolean z10 = this.f49443a;
            if (z10) {
                i10 = R.string.NoSubscribeRequests;
            } else {
                i10 = R.string.NoMemberRequests;
            }
            xw0Var.d.setText(LocaleController.getString(i10));
            d90 d90Var = this.f49454n.f32756e;
            if (z10) {
                i11 = R.string.NoSubscribeRequestsDescription;
            } else {
                i11 = R.string.NoMemberRequestsDescription;
            }
            d90Var.setText(LocaleController.getString(i11));
            this.f49454n.setAnimateLayoutChange(true);
            this.f49454n.setVisibility(8);
        }
        return this.f49454n;
    }

    public final t00 b() {
        if (this.f49457q == null) {
            n2 n2Var = this.f49448g;
            t00 t00Var = new t00(n2Var.getParentActivity(), n2Var.getResourceProvider());
            this.f49457q = t00Var;
            t00Var.setAlpha(0.0f);
            if (this.B) {
                this.f49457q.setBackgroundColor(j6.v0(j6.f20664d6, n2Var.getResourceProvider()));
            }
            this.f49457q.f(j6.f20664d6, j6.f20608a7, -1);
            this.f49457q.setViewType(15);
            this.f49457q.setMemberRequestButton(this.f49443a);
        }
        return this.f49457q;
    }

    public final xw0 c() {
        if (this.f49455o == null) {
            n2 n2Var = this.f49448g;
            xw0 xw0Var = new xw0(n2Var.getParentActivity(), null, 1, n2Var.getResourceProvider());
            this.f49455o = xw0Var;
            if (this.B) {
                xw0Var.setBackgroundColor(j6.v0(j6.f20664d6, n2Var.getResourceProvider()));
            }
            this.f49455o.d.setText(LocaleController.getString(R.string.NoResult));
            this.f49455o.f32756e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            this.f49455o.setAnimateLayoutChange(true);
            this.f49455o.setVisibility(8);
        }
        return this.f49455o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z10;
        int i10 = this.f49451k;
        tL_messages_hideChatJoinRequest.peer = MessagesController.getInstance(i10).getInputPeer(-this.f49450j);
        tL_messages_hideChatJoinRequest.user_id = MessagesController.getInstance(i10).getInputUser(user);
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_hideChatJoinRequest, new n0(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        TLRPC.TL_messages_chatInviteImporters cachedImporters;
        boolean z10 = true;
        if (this.A && (cachedImporters = this.f49449i.getCachedImporters(this.f49450j)) != null) {
            this.f49465z = true;
            g(cachedImporters, null, true, true);
            z10 = false;
        }
        AndroidUtilities.runOnUIThread(new mr0(13, this, z10));
    }

    public void f(String str, boolean z10, boolean z11) {
        boolean z12;
        int i10;
        int i11;
        boolean isEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList = this.f49446e;
        if (isEmpty) {
            if (arrayList.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            xw0 xw0Var = this.f49454n;
            if (xw0Var != null) {
                if (z12) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                xw0Var.setVisibility(i11);
            }
            xw0 xw0Var2 = this.f49455o;
            if (xw0Var2 != null) {
                xw0Var2.setVisibility(4);
            }
        } else {
            if (this.f49445c.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            xw0 xw0Var3 = this.f49454n;
            if (xw0Var3 != null) {
                xw0Var3.setVisibility(4);
            }
            xw0 xw0Var4 = this.f49455o;
            if (xw0Var4 != null) {
                if (z12) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                xw0Var4.setVisibility(i10);
            }
        }
        k(this.f49456p, z12, true);
        if (arrayList.isEmpty()) {
            xw0 xw0Var5 = this.f49454n;
            if (xw0Var5 != null) {
                xw0Var5.setVisibility(0);
            }
            xw0 xw0Var6 = this.f49455o;
            if (xw0Var6 != null) {
                xw0Var6.setVisibility(4);
            }
            k(this.f49457q, false, false);
            if (this.f49464y && this.f49452l) {
                this.f49448g.getActionBar().n().j(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: xh.n.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j3;
        if (view instanceof f5) {
            if (this.f49464y) {
                AndroidUtilities.hideKeyboard(this.f49448g.getParentActivity().getCurrentFocus());
            }
            r rVar = new r(8, this, (f5) view);
            if (this.f49464y) {
                j3 = 100;
            } else {
                j3 = 0;
            }
            AndroidUtilities.runOnUIThread(rVar, j3);
        }
    }

    public final void i(boolean z10) {
        int i10;
        ll0 ll0Var = this.f49456p;
        if (ll0Var != null && (i10 = !this.f49447f.f49419c.B ? 1 : 0) >= 0 && i10 < ll0Var.getChildCount()) {
            this.f49456p.getChildAt(i10).setEnabled(z10);
        }
    }

    public final void j(String str) {
        if (this.f49461u != null) {
            Utilities.searchQueue.cancelRunnable(this.f49461u);
            this.f49461u = null;
        }
        int i10 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f49451k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f49460t = str;
        if (this.f49465z && this.f49446e.isEmpty()) {
            k(this.f49457q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f49447f.E(this.f49446e);
            k(this.f49456p, true, true);
            k(this.f49457q, false, false);
            xw0 xw0Var = this.f49455o;
            if (xw0Var != null) {
                xw0Var.setVisibility(4);
            }
            if (str == null && this.f49452l) {
                v0 k10 = this.f49448g.getActionBar().n().k(0);
                if (this.f49446e.isEmpty()) {
                    i10 = 8;
                }
                k10.setVisibility(i10);
            }
        } else {
            this.f49447f.E(Collections.EMPTY_LIST);
            k(this.f49456p, false, false);
            k(this.f49457q, true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            e eVar = new e(this, 2);
            this.f49461u = eVar;
            dispatchQueue.postRunnable(eVar, 300L);
        }
        if (str != null) {
            xw0 xw0Var2 = this.f49454n;
            if (xw0Var2 != null) {
                xw0Var2.setVisibility(4);
            }
            xw0 xw0Var3 = this.f49455o;
            if (xw0Var3 != null) {
                xw0Var3.setVisibility(4);
            }
        }
    }
}
