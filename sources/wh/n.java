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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.v0;
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Components.es0;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.Components.w00;
import org.telegram.ui.Components.xb0;
import org.telegram.ui.Components.zl0;
import u2.i0;
public abstract class n implements f5 {
    public final boolean f49135a;
    public boolean f49136b;
    public final n2 f49140g;
    public final FrameLayout h;
    public final MemberRequestsController f49141i;
    public final long f49142j;
    public final int f49143k;
    public final boolean f49144l;
    public FrameLayout f49145m;
    public tx0 f49146n;
    public tx0 f49147o;
    public zl0 f49148p;
    public w00 f49149q;
    public TLRPC.TL_chatInviteImporter f49150r;
    public m f49151s;
    public String f49152t;
    public e f49153u;
    public int v;
    public boolean f49154w;
    public boolean f49156y;
    public boolean f49157z;
    public final ArrayList f49137c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList f49138e = new ArrayList();
    public final g f49139f = new g(this);
    public boolean f49155x = true;
    public boolean A = true;
    public boolean B = true;
    public final e C = new e(this, 0);
    public final xb0 D = new xb0(this, 16);

    public n(n2 n2Var, FrameLayout frameLayout, long j3, boolean z10) {
        this.f49140g = n2Var;
        this.h = frameLayout;
        this.f49142j = j3;
        int currentAccount = n2Var.getCurrentAccount();
        this.f49143k = currentAccount;
        this.f49135a = ChatObject.isChannelAndNotMegaGroup(j3, currentAccount);
        this.f49144l = z10;
        this.f49141i = MemberRequestsController.getInstance(currentAccount);
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
        if (this.f49146n == null) {
            n2 n2Var = this.f49140g;
            tx0 tx0Var = new tx0(n2Var.getParentActivity(), null, 16, n2Var.getResourceProvider());
            this.f49146n = tx0Var;
            boolean z10 = this.f49135a;
            if (z10) {
                i10 = R.string.NoSubscribeRequests;
            } else {
                i10 = R.string.NoMemberRequests;
            }
            tx0Var.d.setText(LocaleController.getString(i10));
            q90 q90Var = this.f49146n.f31195e;
            if (z10) {
                i11 = R.string.NoSubscribeRequestsDescription;
            } else {
                i11 = R.string.NoMemberRequestsDescription;
            }
            q90Var.setText(LocaleController.getString(i11));
            this.f49146n.setAnimateLayoutChange(true);
            this.f49146n.setVisibility(8);
        }
        return this.f49146n;
    }

    public final w00 b() {
        if (this.f49149q == null) {
            n2 n2Var = this.f49140g;
            w00 w00Var = new w00(n2Var.getParentActivity(), n2Var.getResourceProvider());
            this.f49149q = w00Var;
            w00Var.setAlpha(0.0f);
            if (this.B) {
                this.f49149q.setBackgroundColor(i6.v0(i6.f20818d6, n2Var.getResourceProvider()));
            }
            this.f49149q.f(i6.f20818d6, i6.f20762a7, -1);
            this.f49149q.setViewType(15);
            this.f49149q.setMemberRequestButton(this.f49135a);
        }
        return this.f49149q;
    }

    public final tx0 c() {
        if (this.f49147o == null) {
            n2 n2Var = this.f49140g;
            tx0 tx0Var = new tx0(n2Var.getParentActivity(), null, 1, n2Var.getResourceProvider());
            this.f49147o = tx0Var;
            if (this.B) {
                tx0Var.setBackgroundColor(i6.v0(i6.f20818d6, n2Var.getResourceProvider()));
            }
            this.f49147o.d.setText(LocaleController.getString(R.string.NoResult));
            this.f49147o.f31195e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            this.f49147o.setAnimateLayoutChange(true);
            this.f49147o.setVisibility(8);
        }
        return this.f49147o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z10;
        int i10 = this.f49143k;
        tL_messages_hideChatJoinRequest.peer = MessagesController.getInstance(i10).getInputPeer(-this.f49142j);
        tL_messages_hideChatJoinRequest.user_id = MessagesController.getInstance(i10).getInputUser(user);
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_hideChatJoinRequest, new o0(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        TLRPC.TL_messages_chatInviteImporters cachedImporters;
        boolean z10 = true;
        if (this.A && (cachedImporters = this.f49141i.getCachedImporters(this.f49142j)) != null) {
            this.f49157z = true;
            g(cachedImporters, null, true, true);
            z10 = false;
        }
        AndroidUtilities.runOnUIThread(new es0(13, this, z10));
    }

    public void f(String str, boolean z10, boolean z11) {
        boolean z12;
        int i10;
        int i11;
        boolean isEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList = this.f49138e;
        if (isEmpty) {
            if (arrayList.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            tx0 tx0Var = this.f49146n;
            if (tx0Var != null) {
                if (z12) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                tx0Var.setVisibility(i11);
            }
            tx0 tx0Var2 = this.f49147o;
            if (tx0Var2 != null) {
                tx0Var2.setVisibility(4);
            }
        } else {
            if (this.f49137c.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            tx0 tx0Var3 = this.f49146n;
            if (tx0Var3 != null) {
                tx0Var3.setVisibility(4);
            }
            tx0 tx0Var4 = this.f49147o;
            if (tx0Var4 != null) {
                if (z12) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                tx0Var4.setVisibility(i10);
            }
        }
        k(this.f49148p, z12, true);
        if (arrayList.isEmpty()) {
            tx0 tx0Var5 = this.f49146n;
            if (tx0Var5 != null) {
                tx0Var5.setVisibility(0);
            }
            tx0 tx0Var6 = this.f49147o;
            if (tx0Var6 != null) {
                tx0Var6.setVisibility(4);
            }
            k(this.f49149q, false, false);
            if (this.f49156y && this.f49144l) {
                this.f49140g.getActionBar().n().j(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: wh.n.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j3;
        if (view instanceof g5) {
            if (this.f49156y) {
                AndroidUtilities.hideKeyboard(this.f49140g.getParentActivity().getCurrentFocus());
            }
            i0 i0Var = new i0(8, this, (g5) view);
            if (this.f49156y) {
                j3 = 100;
            } else {
                j3 = 0;
            }
            AndroidUtilities.runOnUIThread(i0Var, j3);
        }
    }

    public final void i(boolean z10) {
        int i10;
        zl0 zl0Var = this.f49148p;
        if (zl0Var != null && (i10 = !this.f49139f.f49111c.B ? 1 : 0) >= 0 && i10 < zl0Var.getChildCount()) {
            this.f49148p.getChildAt(i10).setEnabled(z10);
        }
    }

    public final void j(String str) {
        if (this.f49153u != null) {
            Utilities.searchQueue.cancelRunnable(this.f49153u);
            this.f49153u = null;
        }
        int i10 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f49143k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f49152t = str;
        if (this.f49157z && this.f49138e.isEmpty()) {
            k(this.f49149q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f49139f.E(this.f49138e);
            k(this.f49148p, true, true);
            k(this.f49149q, false, false);
            tx0 tx0Var = this.f49147o;
            if (tx0Var != null) {
                tx0Var.setVisibility(4);
            }
            if (str == null && this.f49144l) {
                v0 k10 = this.f49140g.getActionBar().n().k(0);
                if (this.f49138e.isEmpty()) {
                    i10 = 8;
                }
                k10.setVisibility(i10);
            }
        } else {
            this.f49139f.E(Collections.EMPTY_LIST);
            k(this.f49148p, false, false);
            k(this.f49149q, true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            e eVar = new e(this, 2);
            this.f49153u = eVar;
            dispatchQueue.postRunnable(eVar, 300L);
        }
        if (str != null) {
            tx0 tx0Var2 = this.f49146n;
            if (tx0Var2 != null) {
                tx0Var2.setVisibility(4);
            }
            tx0 tx0Var3 = this.f49147o;
            if (tx0Var3 != null) {
                tx0Var3.setVisibility(4);
            }
        }
    }
}
