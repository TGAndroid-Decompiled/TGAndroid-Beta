package vh;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import gg.s0;
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
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.ActionBar.w0;
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.bs0;
import org.telegram.ui.Components.jx0;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.vl0;
import u2.k0;
public abstract class p implements f5 {
    public final boolean f43398a;
    public boolean f43399b;
    public final p2 f43402g;
    public final FrameLayout h;
    public final MemberRequestsController f43403i;
    public final long f43404j;
    public final int f43405k;
    public final boolean f43406l;
    public FrameLayout f43407m;
    public jx0 f43408n;
    public jx0 f43409o;
    public vl0 f43410p;
    public a10 f43411q;
    public TLRPC.TL_chatInviteImporter f43412r;
    public o f43413s;
    public String f43414t;
    public f f43415u;
    public int v;
    public boolean f43416w;
    public boolean f43418y;
    public boolean f43419z;
    public final ArrayList f43400c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList e = new ArrayList();
    public final i f43401f = new i(this);
    public boolean f43417x = true;
    public boolean A = true;
    public boolean B = true;
    public final f C = new f(this, 0);
    public final al0 D = new al0(this, 12);

    public p(p2 p2Var, FrameLayout frameLayout, long j3, boolean z10) {
        this.f43402g = p2Var;
        this.h = frameLayout;
        this.f43404j = j3;
        int currentAccount = p2Var.getCurrentAccount();
        this.f43405k = currentAccount;
        this.f43398a = ChatObject.isChannelAndNotMegaGroup(j3, currentAccount);
        this.f43406l = z10;
        this.f43403i = MemberRequestsController.getInstance(currentAccount);
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
        if (this.f43408n == null) {
            p2 p2Var = this.f43402g;
            jx0 jx0Var = new jx0(p2Var.getParentActivity(), null, 16, p2Var.getResourceProvider());
            this.f43408n = jx0Var;
            boolean z10 = this.f43398a;
            if (z10) {
                i10 = R.string.NoSubscribeRequests;
            } else {
                i10 = R.string.NoMemberRequests;
            }
            jx0Var.d.setText(LocaleController.getString(i10));
            m90 m90Var = this.f43408n.e;
            if (z10) {
                i11 = R.string.NoSubscribeRequestsDescription;
            } else {
                i11 = R.string.NoMemberRequestsDescription;
            }
            m90Var.setText(LocaleController.getString(i11));
            this.f43408n.setAnimateLayoutChange(true);
            this.f43408n.setVisibility(8);
        }
        return this.f43408n;
    }

    public final a10 b() {
        if (this.f43411q == null) {
            p2 p2Var = this.f43402g;
            a10 a10Var = new a10(p2Var.getParentActivity(), p2Var.getResourceProvider());
            this.f43411q = a10Var;
            a10Var.setAlpha(0.0f);
            if (this.B) {
                this.f43411q.setBackgroundColor(j6.v0(j6.f17928d6, p2Var.getResourceProvider()));
            }
            this.f43411q.f(j6.f17928d6, j6.f17872a7, -1);
            this.f43411q.setViewType(15);
            this.f43411q.setMemberRequestButton(this.f43398a);
        }
        return this.f43411q;
    }

    public final jx0 c() {
        if (this.f43409o == null) {
            p2 p2Var = this.f43402g;
            jx0 jx0Var = new jx0(p2Var.getParentActivity(), null, 1, p2Var.getResourceProvider());
            this.f43409o = jx0Var;
            if (this.B) {
                jx0Var.setBackgroundColor(j6.v0(j6.f17928d6, p2Var.getResourceProvider()));
            }
            this.f43409o.d.setText(LocaleController.getString(R.string.NoResult));
            this.f43409o.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            this.f43409o.setAnimateLayoutChange(true);
            this.f43409o.setVisibility(8);
        }
        return this.f43409o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z10;
        int i10 = this.f43405k;
        tL_messages_hideChatJoinRequest.peer = MessagesController.getInstance(i10).getInputPeer(-this.f43404j);
        tL_messages_hideChatJoinRequest.user_id = MessagesController.getInstance(i10).getInputUser(user);
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_hideChatJoinRequest, new s0(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        TLRPC.TL_messages_chatInviteImporters cachedImporters;
        boolean z10 = true;
        if (this.A && (cachedImporters = this.f43403i.getCachedImporters(this.f43404j)) != null) {
            this.f43419z = true;
            g(cachedImporters, null, true, true);
            z10 = false;
        }
        AndroidUtilities.runOnUIThread(new bs0(12, this, z10));
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
            jx0 jx0Var = this.f43408n;
            if (jx0Var != null) {
                if (z12) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                jx0Var.setVisibility(i11);
            }
            jx0 jx0Var2 = this.f43409o;
            if (jx0Var2 != null) {
                jx0Var2.setVisibility(4);
            }
        } else {
            if (this.f43400c.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            jx0 jx0Var3 = this.f43408n;
            if (jx0Var3 != null) {
                jx0Var3.setVisibility(4);
            }
            jx0 jx0Var4 = this.f43409o;
            if (jx0Var4 != null) {
                if (z12) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                jx0Var4.setVisibility(i10);
            }
        }
        k(this.f43410p, z12, true);
        if (arrayList.isEmpty()) {
            jx0 jx0Var5 = this.f43408n;
            if (jx0Var5 != null) {
                jx0Var5.setVisibility(0);
            }
            jx0 jx0Var6 = this.f43409o;
            if (jx0Var6 != null) {
                jx0Var6.setVisibility(4);
            }
            k(this.f43411q, false, false);
            if (this.f43418y && this.f43406l) {
                this.f43402g.getActionBar().n().j(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: vh.p.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j3;
        if (view instanceof g5) {
            if (this.f43418y) {
                AndroidUtilities.hideKeyboard(this.f43402g.getParentActivity().getCurrentFocus());
            }
            k0 k0Var = new k0(3, this, (g5) view);
            if (this.f43418y) {
                j3 = 100;
            } else {
                j3 = 0;
            }
            AndroidUtilities.runOnUIThread(k0Var, j3);
        }
    }

    public final void i(boolean z10) {
        int i10;
        vl0 vl0Var = this.f43410p;
        if (vl0Var != null && (i10 = !this.f43401f.f43377c.B ? 1 : 0) >= 0 && i10 < vl0Var.getChildCount()) {
            this.f43410p.getChildAt(i10).setEnabled(z10);
        }
    }

    public final void j(String str) {
        if (this.f43415u != null) {
            Utilities.searchQueue.cancelRunnable(this.f43415u);
            this.f43415u = null;
        }
        int i10 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f43405k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f43414t = str;
        if (this.f43419z && this.e.isEmpty()) {
            k(this.f43411q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f43401f.E(this.e);
            k(this.f43410p, true, true);
            k(this.f43411q, false, false);
            jx0 jx0Var = this.f43409o;
            if (jx0Var != null) {
                jx0Var.setVisibility(4);
            }
            if (str == null && this.f43406l) {
                w0 k10 = this.f43402g.getActionBar().n().k(0);
                if (this.e.isEmpty()) {
                    i10 = 8;
                }
                k10.setVisibility(i10);
            }
        } else {
            this.f43401f.E(Collections.EMPTY_LIST);
            k(this.f43410p, false, false);
            k(this.f43411q, true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            f fVar = new f(this, 2);
            this.f43415u = fVar;
            dispatchQueue.postRunnable(fVar, 300L);
        }
        if (str != null) {
            jx0 jx0Var2 = this.f43408n;
            if (jx0Var2 != null) {
                jx0Var2.setVisibility(4);
            }
            jx0 jx0Var3 = this.f43409o;
            if (jx0Var3 != null) {
                jx0Var3.setVisibility(4);
            }
        }
    }
}
