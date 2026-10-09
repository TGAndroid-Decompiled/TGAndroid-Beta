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
import org.telegram.ui.Components.ay0;
import org.telegram.ui.Components.ds0;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.j10;
import org.telegram.ui.Components.mh0;
import org.telegram.ui.Components.qm0;
import u2.p0;
public abstract class l implements f5 {
    public final boolean f50426a;
    public boolean f50427b;
    public final n2 f50431g;
    public final FrameLayout h;
    public final MemberRequestsController f50432i;
    public final long f50433j;
    public final int f50434k;
    public final boolean f50435l;
    public FrameLayout f50436m;
    public ay0 f50437n;
    public ay0 f50438o;
    public qm0 f50439p;
    public j10 f50440q;
    public TLRPC.TL_chatInviteImporter f50441r;
    public k f50442s;
    public String f50443t;
    public e f50444u;
    public int v;
    public boolean f50445w;
    public boolean f50447y;
    public boolean f50448z;
    public final ArrayList f50428c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList f50429e = new ArrayList();
    public final g f50430f = new g(this);
    public boolean f50446x = true;
    public boolean A = true;
    public boolean B = true;
    public final e C = new e(this, 0);
    public final mh0 D = new mh0(this, 17);

    public l(n2 n2Var, FrameLayout frameLayout, long j3, boolean z10) {
        this.f50431g = n2Var;
        this.h = frameLayout;
        this.f50433j = j3;
        int currentAccount = n2Var.getCurrentAccount();
        this.f50434k = currentAccount;
        this.f50426a = ChatObject.isChannelAndNotMegaGroup(j3, currentAccount);
        this.f50435l = z10;
        this.f50432i = MemberRequestsController.getInstance(currentAccount);
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

    public final ay0 a() {
        int i10;
        int i11;
        if (this.f50437n == null) {
            n2 n2Var = this.f50431g;
            ay0 ay0Var = new ay0(n2Var.getParentActivity(), null, 16, n2Var.getResourceProvider());
            this.f50437n = ay0Var;
            boolean z10 = this.f50426a;
            if (z10) {
                i10 = R.string.NoSubscribeRequests;
            } else {
                i10 = R.string.NoMemberRequests;
            }
            ay0Var.d.setText(LocaleController.getString(i10));
            ea0 ea0Var = this.f50437n.f24802e;
            if (z10) {
                i11 = R.string.NoSubscribeRequestsDescription;
            } else {
                i11 = R.string.NoMemberRequestsDescription;
            }
            ea0Var.setText(LocaleController.getString(i11));
            this.f50437n.setAnimateLayoutChange(true);
            this.f50437n.setVisibility(8);
        }
        return this.f50437n;
    }

    public final j10 b() {
        if (this.f50440q == null) {
            n2 n2Var = this.f50431g;
            j10 j10Var = new j10(n2Var.getParentActivity(), n2Var.getResourceProvider());
            this.f50440q = j10Var;
            j10Var.setAlpha(0.0f);
            if (this.B) {
                this.f50440q.setBackgroundColor(i6.w0(i6.f20797d6, n2Var.getResourceProvider()));
            }
            this.f50440q.f(i6.f20797d6, i6.f20741a7, -1);
            this.f50440q.setViewType(15);
            this.f50440q.setMemberRequestButton(this.f50426a);
        }
        return this.f50440q;
    }

    public final ay0 c() {
        if (this.f50438o == null) {
            n2 n2Var = this.f50431g;
            ay0 ay0Var = new ay0(n2Var.getParentActivity(), null, 1, n2Var.getResourceProvider());
            this.f50438o = ay0Var;
            if (this.B) {
                ay0Var.setBackgroundColor(i6.w0(i6.f20797d6, n2Var.getResourceProvider()));
            }
            this.f50438o.d.setText(LocaleController.getString(R.string.NoResult));
            this.f50438o.f24802e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            this.f50438o.setAnimateLayoutChange(true);
            this.f50438o.setVisibility(8);
        }
        return this.f50438o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z10;
        int i10 = this.f50434k;
        tL_messages_hideChatJoinRequest.peer = MessagesController.getInstance(i10).getInputPeer(-this.f50433j);
        tL_messages_hideChatJoinRequest.user_id = MessagesController.getInstance(i10).getInputUser(user);
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_hideChatJoinRequest, new o0(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        TLRPC.TL_messages_chatInviteImporters cachedImporters;
        boolean z10 = true;
        if (this.A && (cachedImporters = this.f50432i.getCachedImporters(this.f50433j)) != null) {
            this.f50448z = true;
            g(cachedImporters, null, true, true);
            z10 = false;
        }
        AndroidUtilities.runOnUIThread(new ds0(15, this, z10));
    }

    public void f(String str, boolean z10, boolean z11) {
        boolean z12;
        int i10;
        int i11;
        boolean isEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList = this.f50429e;
        if (isEmpty) {
            if (arrayList.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            ay0 ay0Var = this.f50437n;
            if (ay0Var != null) {
                if (z12) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                ay0Var.setVisibility(i11);
            }
            ay0 ay0Var2 = this.f50438o;
            if (ay0Var2 != null) {
                ay0Var2.setVisibility(4);
            }
        } else {
            if (this.f50428c.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            ay0 ay0Var3 = this.f50437n;
            if (ay0Var3 != null) {
                ay0Var3.setVisibility(4);
            }
            ay0 ay0Var4 = this.f50438o;
            if (ay0Var4 != null) {
                if (z12) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                ay0Var4.setVisibility(i10);
            }
        }
        k(this.f50439p, z12, true);
        if (arrayList.isEmpty()) {
            ay0 ay0Var5 = this.f50437n;
            if (ay0Var5 != null) {
                ay0Var5.setVisibility(0);
            }
            ay0 ay0Var6 = this.f50438o;
            if (ay0Var6 != null) {
                ay0Var6.setVisibility(4);
            }
            k(this.f50440q, false, false);
            if (this.f50447y && this.f50435l) {
                this.f50431g.getActionBar().o().j(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: wh.l.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j3;
        if (view instanceof g5) {
            if (this.f50447y) {
                AndroidUtilities.hideKeyboard(this.f50431g.getParentActivity().getCurrentFocus());
            }
            p0 p0Var = new p0(7, this, (g5) view);
            if (this.f50447y) {
                j3 = 100;
            } else {
                j3 = 0;
            }
            AndroidUtilities.runOnUIThread(p0Var, j3);
        }
    }

    public final void i(boolean z10) {
        int i10;
        qm0 qm0Var = this.f50439p;
        if (qm0Var != null && (i10 = !this.f50430f.f50408c.B ? 1 : 0) >= 0 && i10 < qm0Var.getChildCount()) {
            this.f50439p.getChildAt(i10).setEnabled(z10);
        }
    }

    public final void j(String str) {
        if (this.f50444u != null) {
            Utilities.searchQueue.cancelRunnable(this.f50444u);
            this.f50444u = null;
        }
        int i10 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f50434k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f50443t = str;
        if (this.f50448z && this.f50429e.isEmpty()) {
            k(this.f50440q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f50430f.E(this.f50429e);
            k(this.f50439p, true, true);
            k(this.f50440q, false, false);
            ay0 ay0Var = this.f50438o;
            if (ay0Var != null) {
                ay0Var.setVisibility(4);
            }
            if (str == null && this.f50435l) {
                v0 k10 = this.f50431g.getActionBar().o().k(0);
                if (this.f50429e.isEmpty()) {
                    i10 = 8;
                }
                k10.setVisibility(i10);
            }
        } else {
            this.f50430f.E(Collections.EMPTY_LIST);
            k(this.f50439p, false, false);
            k(this.f50440q, true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            e eVar = new e(this, 2);
            this.f50444u = eVar;
            dispatchQueue.postRunnable(eVar, 300L);
        }
        if (str != null) {
            ay0 ay0Var2 = this.f50437n;
            if (ay0Var2 != null) {
                ay0Var2.setVisibility(4);
            }
            ay0 ay0Var3 = this.f50438o;
            if (ay0Var3 != null) {
                ay0Var3.setVisibility(4);
            }
        }
    }
}
