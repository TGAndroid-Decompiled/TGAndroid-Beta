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
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ActionBar.u0;
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Components.ix0;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.ug0;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.yr0;
public abstract class n implements f5 {
    public final boolean f45390a;
    public boolean f45391b;
    public final m2 f45394g;
    public final FrameLayout h;
    public final MemberRequestsController f45395i;
    public final long f45396j;
    public final int f45397k;
    public final boolean f45398l;
    public FrameLayout f45399m;
    public ix0 f45400n;
    public ix0 f45401o;
    public wl0 f45402p;
    public u00 f45403q;
    public TLRPC.TL_chatInviteImporter f45404r;
    public m f45405s;
    public String f45406t;
    public e f45407u;
    public int v;
    public boolean f45408w;
    public boolean f45410y;
    public boolean f45411z;
    public final ArrayList f45392c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList e = new ArrayList();
    public final g f45393f = new g(this);
    public boolean f45409x = true;
    public boolean A = true;
    public boolean B = true;
    public final e C = new e(this, 0);
    public final ug0 D = new ug0(this, 14);

    public n(m2 m2Var, FrameLayout frameLayout, long j3, boolean z10) {
        this.f45394g = m2Var;
        this.h = frameLayout;
        this.f45396j = j3;
        int currentAccount = m2Var.getCurrentAccount();
        this.f45397k = currentAccount;
        this.f45390a = ChatObject.isChannelAndNotMegaGroup(j3, currentAccount);
        this.f45398l = z10;
        this.f45395i = MemberRequestsController.getInstance(currentAccount);
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

    public final ix0 a() {
        int i10;
        int i11;
        if (this.f45400n == null) {
            m2 m2Var = this.f45394g;
            ix0 ix0Var = new ix0(m2Var.getParentActivity(), null, 16, m2Var.getResourceProvider());
            this.f45400n = ix0Var;
            boolean z10 = this.f45390a;
            if (z10) {
                i10 = R.string.NoSubscribeRequests;
            } else {
                i10 = R.string.NoMemberRequests;
            }
            ix0Var.d.setText(LocaleController.getString(i10));
            n90 n90Var = this.f45400n.e;
            if (z10) {
                i11 = R.string.NoSubscribeRequestsDescription;
            } else {
                i11 = R.string.NoMemberRequestsDescription;
            }
            n90Var.setText(LocaleController.getString(i11));
            this.f45400n.setAnimateLayoutChange(true);
            this.f45400n.setVisibility(8);
        }
        return this.f45400n;
    }

    public final u00 b() {
        if (this.f45403q == null) {
            m2 m2Var = this.f45394g;
            u00 u00Var = new u00(m2Var.getParentActivity(), m2Var.getResourceProvider());
            this.f45403q = u00Var;
            u00Var.setAlpha(0.0f);
            if (this.B) {
                this.f45403q.setBackgroundColor(h6.v0(h6.f19060d6, m2Var.getResourceProvider()));
            }
            this.f45403q.f(h6.f19060d6, h6.f19004a7, -1);
            this.f45403q.setViewType(15);
            this.f45403q.setMemberRequestButton(this.f45390a);
        }
        return this.f45403q;
    }

    public final ix0 c() {
        if (this.f45401o == null) {
            m2 m2Var = this.f45394g;
            ix0 ix0Var = new ix0(m2Var.getParentActivity(), null, 1, m2Var.getResourceProvider());
            this.f45401o = ix0Var;
            if (this.B) {
                ix0Var.setBackgroundColor(h6.v0(h6.f19060d6, m2Var.getResourceProvider()));
            }
            this.f45401o.d.setText(LocaleController.getString(R.string.NoResult));
            this.f45401o.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            this.f45401o.setAnimateLayoutChange(true);
            this.f45401o.setVisibility(8);
        }
        return this.f45401o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z10;
        int i10 = this.f45397k;
        tL_messages_hideChatJoinRequest.peer = MessagesController.getInstance(i10).getInputPeer(-this.f45396j);
        tL_messages_hideChatJoinRequest.user_id = MessagesController.getInstance(i10).getInputUser(user);
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_hideChatJoinRequest, new p0(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        TLRPC.TL_messages_chatInviteImporters cachedImporters;
        boolean z10 = true;
        if (this.A && (cachedImporters = this.f45395i.getCachedImporters(this.f45396j)) != null) {
            this.f45411z = true;
            g(cachedImporters, null, true, true);
            z10 = false;
        }
        AndroidUtilities.runOnUIThread(new yr0(13, this, z10));
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
            ix0 ix0Var = this.f45400n;
            if (ix0Var != null) {
                if (z12) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                ix0Var.setVisibility(i11);
            }
            ix0 ix0Var2 = this.f45401o;
            if (ix0Var2 != null) {
                ix0Var2.setVisibility(4);
            }
        } else {
            if (this.f45392c.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            ix0 ix0Var3 = this.f45400n;
            if (ix0Var3 != null) {
                ix0Var3.setVisibility(4);
            }
            ix0 ix0Var4 = this.f45401o;
            if (ix0Var4 != null) {
                if (z12) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                ix0Var4.setVisibility(i10);
            }
        }
        k(this.f45402p, z12, true);
        if (arrayList.isEmpty()) {
            ix0 ix0Var5 = this.f45400n;
            if (ix0Var5 != null) {
                ix0Var5.setVisibility(0);
            }
            ix0 ix0Var6 = this.f45401o;
            if (ix0Var6 != null) {
                ix0Var6.setVisibility(4);
            }
            k(this.f45403q, false, false);
            if (this.f45410y && this.f45398l) {
                this.f45394g.getActionBar().n().j(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: wh.n.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j3;
        if (view instanceof g5) {
            if (this.f45410y) {
                AndroidUtilities.hideKeyboard(this.f45394g.getParentActivity().getCurrentFocus());
            }
            u2.p0 p0Var = new u2.p0(7, this, (g5) view);
            if (this.f45410y) {
                j3 = 100;
            } else {
                j3 = 0;
            }
            AndroidUtilities.runOnUIThread(p0Var, j3);
        }
    }

    public final void i(boolean z10) {
        int i10;
        wl0 wl0Var = this.f45402p;
        if (wl0Var != null && (i10 = !this.f45393f.f45369c.B ? 1 : 0) >= 0 && i10 < wl0Var.getChildCount()) {
            this.f45402p.getChildAt(i10).setEnabled(z10);
        }
    }

    public final void j(String str) {
        if (this.f45407u != null) {
            Utilities.searchQueue.cancelRunnable(this.f45407u);
            this.f45407u = null;
        }
        int i10 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f45397k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f45406t = str;
        if (this.f45411z && this.e.isEmpty()) {
            k(this.f45403q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f45393f.E(this.e);
            k(this.f45402p, true, true);
            k(this.f45403q, false, false);
            ix0 ix0Var = this.f45401o;
            if (ix0Var != null) {
                ix0Var.setVisibility(4);
            }
            if (str == null && this.f45398l) {
                u0 k10 = this.f45394g.getActionBar().n().k(0);
                if (this.e.isEmpty()) {
                    i10 = 8;
                }
                k10.setVisibility(i10);
            }
        } else {
            this.f45393f.E(Collections.EMPTY_LIST);
            k(this.f45402p, false, false);
            k(this.f45403q, true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            e eVar = new e(this, 2);
            this.f45407u = eVar;
            dispatchQueue.postRunnable(eVar, 300L);
        }
        if (str != null) {
            ix0 ix0Var2 = this.f45400n;
            if (ix0Var2 != null) {
                ix0Var2.setVisibility(4);
            }
            ix0 ix0Var3 = this.f45401o;
            if (ix0Var3 != null) {
                ix0Var3.setVisibility(4);
            }
        }
    }
}
