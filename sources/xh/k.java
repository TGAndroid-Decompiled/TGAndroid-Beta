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
import org.telegram.messenger.DispatchQueue2;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MemberRequestsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.u0;
import org.telegram.ui.Cells.e5;
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Components.iv;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.vx0;
import org.telegram.ui.Components.w90;
import org.telegram.ui.Components.z00;
import org.telegram.ui.Components.z50;
import u2.k0;
public abstract class k implements e5 {
    public final boolean f50306a;
    public boolean f50307b;
    public final o2 f50310g;
    public final FrameLayout h;
    public final MemberRequestsController f50311i;
    public final long f50312j;
    public final int f50313k;
    public final boolean f50314l;
    public FrameLayout f50315m;
    public vx0 f50316n;
    public vx0 f50317o;
    public lm0 f50318p;
    public z00 f50319q;
    public TLRPC.TL_chatInviteImporter f50320r;
    public j f50321s;
    public String f50322t;
    public e f50323u;
    public int v;
    public boolean f50324w;
    public boolean f50326y;
    public boolean f50327z;
    public final ArrayList f50308c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList e = new ArrayList();
    public final f f50309f = new f(this);
    public boolean f50325x = true;
    public boolean A = true;
    public boolean B = true;
    public final e C = new e(this, 0);
    public final iv D = new iv(this, 22);

    public k(o2 o2Var, FrameLayout frameLayout, long j10, boolean z10) {
        this.f50310g = o2Var;
        this.h = frameLayout;
        this.f50312j = j10;
        int currentAccount = o2Var.getCurrentAccount();
        this.f50313k = currentAccount;
        this.f50306a = ChatObject.isChannelAndNotMegaGroup(j10, currentAccount);
        this.f50314l = z10;
        this.f50311i = MemberRequestsController.getInstance(currentAccount);
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

    public final vx0 a() {
        int i10;
        int i11;
        if (this.f50316n == null) {
            o2 o2Var = this.f50310g;
            vx0 vx0Var = new vx0(o2Var.getParentActivity(), null, 16, o2Var.getResourceProvider());
            this.f50316n = vx0Var;
            boolean z10 = this.f50306a;
            if (z10) {
                i10 = R.string.NoSubscribeRequests;
            } else {
                i10 = R.string.NoMemberRequests;
            }
            vx0Var.d.setText(LocaleController.getString(i10));
            w90 w90Var = this.f50316n.e;
            if (z10) {
                i11 = R.string.NoSubscribeRequestsDescription;
            } else {
                i11 = R.string.NoMemberRequestsDescription;
            }
            w90Var.setText(LocaleController.getString(i11));
            this.f50316n.setAnimateLayoutChange(true);
            this.f50316n.setVisibility(8);
        }
        return this.f50316n;
    }

    public final z00 b() {
        if (this.f50319q == null) {
            o2 o2Var = this.f50310g;
            z00 z00Var = new z00(o2Var.getParentActivity(), o2Var.getResourceProvider());
            this.f50319q = z00Var;
            z00Var.setAlpha(0.0f);
            if (this.B) {
                r6.i(k6.f21184d6, this.f50319q, o2Var.getResourceProvider());
            }
            this.f50319q.e(k6.f21184d6, k6.f21126a7, -1);
            this.f50319q.setViewType(15);
            this.f50319q.setMemberRequestButton(this.f50306a);
        }
        return this.f50319q;
    }

    public final vx0 c() {
        if (this.f50317o == null) {
            o2 o2Var = this.f50310g;
            vx0 vx0Var = new vx0(o2Var.getParentActivity(), null, 1, o2Var.getResourceProvider());
            this.f50317o = vx0Var;
            if (this.B) {
                r6.i(k6.f21184d6, vx0Var, o2Var.getResourceProvider());
            }
            this.f50317o.d.setText(LocaleController.getString(R.string.NoResult));
            this.f50317o.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            this.f50317o.setAnimateLayoutChange(true);
            this.f50317o.setVisibility(8);
        }
        return this.f50317o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z10;
        int i10 = this.f50313k;
        tL_messages_hideChatJoinRequest.peer = MessagesController.getInstance(i10).getInputPeer(-this.f50312j);
        tL_messages_hideChatJoinRequest.user_id = MessagesController.getInstance(i10).getInputUser(user);
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_hideChatJoinRequest, new n0(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        TLRPC.TL_messages_chatInviteImporters cachedImporters;
        boolean z10 = true;
        if (this.A && (cachedImporters = this.f50311i.getCachedImporters(this.f50312j)) != null) {
            this.f50327z = true;
            g(cachedImporters, null, true, true);
            z10 = false;
        }
        AndroidUtilities.runOnUIThread(new z50(20, this, z10));
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
            vx0 vx0Var = this.f50316n;
            if (vx0Var != null) {
                if (z12) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                vx0Var.setVisibility(i11);
            }
            vx0 vx0Var2 = this.f50317o;
            if (vx0Var2 != null) {
                vx0Var2.setVisibility(4);
            }
        } else {
            if (this.f50308c.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            vx0 vx0Var3 = this.f50316n;
            if (vx0Var3 != null) {
                vx0Var3.setVisibility(4);
            }
            vx0 vx0Var4 = this.f50317o;
            if (vx0Var4 != null) {
                if (z12) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                vx0Var4.setVisibility(i10);
            }
        }
        k(this.f50318p, z12, true);
        if (arrayList.isEmpty()) {
            vx0 vx0Var5 = this.f50316n;
            if (vx0Var5 != null) {
                vx0Var5.setVisibility(0);
            }
            vx0 vx0Var6 = this.f50317o;
            if (vx0Var6 != null) {
                vx0Var6.setVisibility(4);
            }
            k(this.f50319q, false, false);
            if (this.f50326y && this.f50314l) {
                this.f50310g.getActionBar().m().j(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: xh.k.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j10;
        if (view instanceof f5) {
            if (this.f50326y) {
                AndroidUtilities.hideKeyboard(this.f50310g.getParentActivity().getCurrentFocus());
            }
            k0 k0Var = new k0(16, this, (f5) view);
            if (this.f50326y) {
                j10 = 100;
            } else {
                j10 = 0;
            }
            AndroidUtilities.runOnUIThread(k0Var, j10);
        }
    }

    public final void i(boolean z10) {
        int i10;
        lm0 lm0Var = this.f50318p;
        if (lm0Var != null && (i10 = !this.f50309f.f50290c.B ? 1 : 0) >= 0 && i10 < lm0Var.getChildCount()) {
            this.f50318p.getChildAt(i10).setEnabled(z10);
        }
    }

    public final void j(String str) {
        if (this.f50323u != null) {
            Utilities.searchQueue.cancelRunnable(this.f50323u);
            this.f50323u = null;
        }
        int i10 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f50313k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f50322t = str;
        if (this.f50327z && this.e.isEmpty()) {
            k(this.f50319q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f50309f.E(this.e);
            k(this.f50318p, true, true);
            k(this.f50319q, false, false);
            vx0 vx0Var = this.f50317o;
            if (vx0Var != null) {
                vx0Var.setVisibility(4);
            }
            if (str == null && this.f50314l) {
                u0 k10 = this.f50310g.getActionBar().m().k(0);
                if (this.e.isEmpty()) {
                    i10 = 8;
                }
                k10.setVisibility(i10);
            }
        } else {
            this.f50309f.E(Collections.EMPTY_LIST);
            k(this.f50318p, false, false);
            k(this.f50319q, true, true);
            DispatchQueue2 dispatchQueue2 = Utilities.searchQueue;
            e eVar = new e(this, 2);
            this.f50323u = eVar;
            dispatchQueue2.postRunnable(eVar, 300L);
        }
        if (str != null) {
            vx0 vx0Var2 = this.f50316n;
            if (vx0Var2 != null) {
                vx0Var2.setVisibility(4);
            }
            vx0 vx0Var3 = this.f50317o;
            if (vx0Var3 != null) {
                vx0Var3.setVisibility(4);
            }
        }
    }
}
