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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.v0;
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.kb0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.sr0;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.yw0;
public abstract class n implements f5 {
    public final boolean f45107a;
    public boolean f45108b;
    public final n2 f45111g;
    public final FrameLayout h;
    public final MemberRequestsController f45112i;
    public final long f45113j;
    public final int f45114k;
    public final boolean f45115l;
    public FrameLayout f45116m;
    public yw0 f45117n;
    public yw0 f45118o;
    public ll0 f45119p;
    public t00 f45120q;
    public TLRPC.TL_chatInviteImporter f45121r;
    public m f45122s;
    public String f45123t;
    public e f45124u;
    public int v;
    public boolean f45125w;
    public boolean f45127y;
    public boolean f45128z;
    public final ArrayList f45109c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList e = new ArrayList();
    public final g f45110f = new g(this);
    public boolean f45126x = true;
    public boolean A = true;
    public boolean B = true;
    public final e C = new e(this, 0);
    public final kb0 D = new kb0(this, 15);

    public n(n2 n2Var, FrameLayout frameLayout, long j3, boolean z10) {
        this.f45111g = n2Var;
        this.h = frameLayout;
        this.f45113j = j3;
        int currentAccount = n2Var.getCurrentAccount();
        this.f45114k = currentAccount;
        this.f45107a = ChatObject.isChannelAndNotMegaGroup(j3, currentAccount);
        this.f45115l = z10;
        this.f45112i = MemberRequestsController.getInstance(currentAccount);
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

    public final yw0 a() {
        int i10;
        int i11;
        if (this.f45117n == null) {
            n2 n2Var = this.f45111g;
            yw0 yw0Var = new yw0(n2Var.getParentActivity(), null, 16, n2Var.getResourceProvider());
            this.f45117n = yw0Var;
            boolean z10 = this.f45107a;
            if (z10) {
                i10 = R.string.NoSubscribeRequests;
            } else {
                i10 = R.string.NoMemberRequests;
            }
            yw0Var.d.setText(LocaleController.getString(i10));
            c90 c90Var = this.f45117n.e;
            if (z10) {
                i11 = R.string.NoSubscribeRequestsDescription;
            } else {
                i11 = R.string.NoMemberRequestsDescription;
            }
            c90Var.setText(LocaleController.getString(i11));
            this.f45117n.setAnimateLayoutChange(true);
            this.f45117n.setVisibility(8);
        }
        return this.f45117n;
    }

    public final t00 b() {
        if (this.f45120q == null) {
            n2 n2Var = this.f45111g;
            t00 t00Var = new t00(n2Var.getParentActivity(), n2Var.getResourceProvider());
            this.f45120q = t00Var;
            t00Var.setAlpha(0.0f);
            if (this.B) {
                this.f45120q.setBackgroundColor(i6.v0(i6.f18834d6, n2Var.getResourceProvider()));
            }
            this.f45120q.f(i6.f18834d6, i6.f18778a7, -1);
            this.f45120q.setViewType(15);
            this.f45120q.setMemberRequestButton(this.f45107a);
        }
        return this.f45120q;
    }

    public final yw0 c() {
        if (this.f45118o == null) {
            n2 n2Var = this.f45111g;
            yw0 yw0Var = new yw0(n2Var.getParentActivity(), null, 1, n2Var.getResourceProvider());
            this.f45118o = yw0Var;
            if (this.B) {
                yw0Var.setBackgroundColor(i6.v0(i6.f18834d6, n2Var.getResourceProvider()));
            }
            this.f45118o.d.setText(LocaleController.getString(R.string.NoResult));
            this.f45118o.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            this.f45118o.setAnimateLayoutChange(true);
            this.f45118o.setVisibility(8);
        }
        return this.f45118o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z10;
        int i10 = this.f45114k;
        tL_messages_hideChatJoinRequest.peer = MessagesController.getInstance(i10).getInputPeer(-this.f45113j);
        tL_messages_hideChatJoinRequest.user_id = MessagesController.getInstance(i10).getInputUser(user);
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_hideChatJoinRequest, new p0(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        TLRPC.TL_messages_chatInviteImporters cachedImporters;
        boolean z10 = true;
        if (this.A && (cachedImporters = this.f45112i.getCachedImporters(this.f45113j)) != null) {
            this.f45128z = true;
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
            yw0 yw0Var = this.f45117n;
            if (yw0Var != null) {
                if (z12) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                yw0Var.setVisibility(i11);
            }
            yw0 yw0Var2 = this.f45118o;
            if (yw0Var2 != null) {
                yw0Var2.setVisibility(4);
            }
        } else {
            if (this.f45109c.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            yw0 yw0Var3 = this.f45117n;
            if (yw0Var3 != null) {
                yw0Var3.setVisibility(4);
            }
            yw0 yw0Var4 = this.f45118o;
            if (yw0Var4 != null) {
                if (z12) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                yw0Var4.setVisibility(i10);
            }
        }
        k(this.f45119p, z12, true);
        if (arrayList.isEmpty()) {
            yw0 yw0Var5 = this.f45117n;
            if (yw0Var5 != null) {
                yw0Var5.setVisibility(0);
            }
            yw0 yw0Var6 = this.f45118o;
            if (yw0Var6 != null) {
                yw0Var6.setVisibility(4);
            }
            k(this.f45120q, false, false);
            if (this.f45127y && this.f45115l) {
                this.f45111g.getActionBar().n().j(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: wh.n.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j3;
        if (view instanceof g5) {
            if (this.f45127y) {
                AndroidUtilities.hideKeyboard(this.f45111g.getParentActivity().getCurrentFocus());
            }
            uh.i iVar = new uh.i(2, this, (g5) view);
            if (this.f45127y) {
                j3 = 100;
            } else {
                j3 = 0;
            }
            AndroidUtilities.runOnUIThread(iVar, j3);
        }
    }

    public final void i(boolean z10) {
        int i10;
        ll0 ll0Var = this.f45119p;
        if (ll0Var != null && (i10 = !this.f45110f.f45086c.B ? 1 : 0) >= 0 && i10 < ll0Var.getChildCount()) {
            this.f45119p.getChildAt(i10).setEnabled(z10);
        }
    }

    public final void j(String str) {
        if (this.f45124u != null) {
            Utilities.searchQueue.cancelRunnable(this.f45124u);
            this.f45124u = null;
        }
        int i10 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f45114k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f45123t = str;
        if (this.f45128z && this.e.isEmpty()) {
            k(this.f45120q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f45110f.E(this.e);
            k(this.f45119p, true, true);
            k(this.f45120q, false, false);
            yw0 yw0Var = this.f45118o;
            if (yw0Var != null) {
                yw0Var.setVisibility(4);
            }
            if (str == null && this.f45115l) {
                v0 k10 = this.f45111g.getActionBar().n().k(0);
                if (this.e.isEmpty()) {
                    i10 = 8;
                }
                k10.setVisibility(i10);
            }
        } else {
            this.f45110f.E(Collections.EMPTY_LIST);
            k(this.f45119p, false, false);
            k(this.f45120q, true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            e eVar = new e(this, 2);
            this.f45124u = eVar;
            dispatchQueue.postRunnable(eVar, 300L);
        }
        if (str != null) {
            yw0 yw0Var2 = this.f45117n;
            if (yw0Var2 != null) {
                yw0Var2.setVisibility(4);
            }
            yw0 yw0Var3 = this.f45118o;
            if (yw0Var3 != null) {
                yw0Var3.setVisibility(4);
            }
        }
    }
}
