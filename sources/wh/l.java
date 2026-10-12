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
import org.telegram.ui.Components.gy0;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.js0;
import org.telegram.ui.Components.m10;
import org.telegram.ui.Components.qh0;
import org.telegram.ui.Components.wm0;
import tg.y;
public abstract class l implements f5 {
    public final boolean f50665a;
    public boolean f50666b;
    public final m2 f50670g;
    public final FrameLayout h;
    public final MemberRequestsController f50671i;
    public final long f50672j;
    public final int f50673k;
    public final boolean f50674l;
    public FrameLayout f50675m;
    public gy0 f50676n;
    public gy0 f50677o;
    public wm0 f50678p;
    public m10 f50679q;
    public TLRPC.TL_chatInviteImporter f50680r;
    public k f50681s;
    public String f50682t;
    public e f50683u;
    public int v;
    public boolean f50684w;
    public boolean f50686y;
    public boolean f50687z;
    public final ArrayList f50667c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList f50668e = new ArrayList();
    public final g f50669f = new g(this);
    public boolean f50685x = true;
    public boolean A = true;
    public boolean B = true;
    public final e C = new e(this, 0);
    public final qh0 D = new qh0(this, 17);

    public l(m2 m2Var, FrameLayout frameLayout, long j3, boolean z10) {
        this.f50670g = m2Var;
        this.h = frameLayout;
        this.f50672j = j3;
        int currentAccount = m2Var.getCurrentAccount();
        this.f50673k = currentAccount;
        this.f50665a = ChatObject.isChannelAndNotMegaGroup(j3, currentAccount);
        this.f50674l = z10;
        this.f50671i = MemberRequestsController.getInstance(currentAccount);
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

    public final gy0 a() {
        int i10;
        int i11;
        if (this.f50676n == null) {
            m2 m2Var = this.f50670g;
            gy0 gy0Var = new gy0(m2Var.getParentActivity(), null, 16, m2Var.getResourceProvider());
            this.f50676n = gy0Var;
            boolean z10 = this.f50665a;
            if (z10) {
                i10 = R.string.NoSubscribeRequests;
            } else {
                i10 = R.string.NoMemberRequests;
            }
            gy0Var.d.setText(LocaleController.getString(i10));
            ia0 ia0Var = this.f50676n.f26561e;
            if (z10) {
                i11 = R.string.NoSubscribeRequestsDescription;
            } else {
                i11 = R.string.NoMemberRequestsDescription;
            }
            ia0Var.setText(LocaleController.getString(i11));
            this.f50676n.setAnimateLayoutChange(true);
            this.f50676n.setVisibility(8);
        }
        return this.f50676n;
    }

    public final m10 b() {
        if (this.f50679q == null) {
            m2 m2Var = this.f50670g;
            m10 m10Var = new m10(m2Var.getParentActivity(), m2Var.getResourceProvider());
            this.f50679q = m10Var;
            m10Var.setAlpha(0.0f);
            if (this.B) {
                this.f50679q.setBackgroundColor(h6.w0(h6.f20560d6, m2Var.getResourceProvider()));
            }
            this.f50679q.f(h6.f20560d6, h6.f20504a7, -1);
            this.f50679q.setViewType(15);
            this.f50679q.setMemberRequestButton(this.f50665a);
        }
        return this.f50679q;
    }

    public final gy0 c() {
        if (this.f50677o == null) {
            m2 m2Var = this.f50670g;
            gy0 gy0Var = new gy0(m2Var.getParentActivity(), null, 1, m2Var.getResourceProvider());
            this.f50677o = gy0Var;
            if (this.B) {
                gy0Var.setBackgroundColor(h6.w0(h6.f20560d6, m2Var.getResourceProvider()));
            }
            this.f50677o.d.setText(LocaleController.getString(R.string.NoResult));
            this.f50677o.f26561e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            this.f50677o.setAnimateLayoutChange(true);
            this.f50677o.setVisibility(8);
        }
        return this.f50677o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z10;
        int i10 = this.f50673k;
        tL_messages_hideChatJoinRequest.peer = MessagesController.getInstance(i10).getInputPeer(-this.f50672j);
        tL_messages_hideChatJoinRequest.user_id = MessagesController.getInstance(i10).getInputUser(user);
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_hideChatJoinRequest, new o0(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        TLRPC.TL_messages_chatInviteImporters cachedImporters;
        boolean z10 = true;
        if (this.A && (cachedImporters = this.f50671i.getCachedImporters(this.f50672j)) != null) {
            this.f50687z = true;
            g(cachedImporters, null, true, true);
            z10 = false;
        }
        AndroidUtilities.runOnUIThread(new js0(16, this, z10));
    }

    public void f(String str, boolean z10, boolean z11) {
        boolean z12;
        int i10;
        int i11;
        boolean isEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList = this.f50668e;
        if (isEmpty) {
            if (arrayList.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            gy0 gy0Var = this.f50676n;
            if (gy0Var != null) {
                if (z12) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                gy0Var.setVisibility(i11);
            }
            gy0 gy0Var2 = this.f50677o;
            if (gy0Var2 != null) {
                gy0Var2.setVisibility(4);
            }
        } else {
            if (this.f50667c.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            gy0 gy0Var3 = this.f50676n;
            if (gy0Var3 != null) {
                gy0Var3.setVisibility(4);
            }
            gy0 gy0Var4 = this.f50677o;
            if (gy0Var4 != null) {
                if (z12) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                gy0Var4.setVisibility(i10);
            }
        }
        k(this.f50678p, z12, true);
        if (arrayList.isEmpty()) {
            gy0 gy0Var5 = this.f50676n;
            if (gy0Var5 != null) {
                gy0Var5.setVisibility(0);
            }
            gy0 gy0Var6 = this.f50677o;
            if (gy0Var6 != null) {
                gy0Var6.setVisibility(4);
            }
            k(this.f50679q, false, false);
            if (this.f50686y && this.f50674l) {
                this.f50670g.getActionBar().p().j(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: wh.l.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j3;
        if (view instanceof g5) {
            if (this.f50686y) {
                AndroidUtilities.hideKeyboard(this.f50670g.getParentActivity().getCurrentFocus());
            }
            y yVar = new y(11, this, (g5) view);
            if (this.f50686y) {
                j3 = 100;
            } else {
                j3 = 0;
            }
            AndroidUtilities.runOnUIThread(yVar, j3);
        }
    }

    public final void i(boolean z10) {
        int i10;
        wm0 wm0Var = this.f50678p;
        if (wm0Var != null && (i10 = !this.f50669f.f50647c.B ? 1 : 0) >= 0 && i10 < wm0Var.getChildCount()) {
            this.f50678p.getChildAt(i10).setEnabled(z10);
        }
    }

    public final void j(String str) {
        if (this.f50683u != null) {
            Utilities.searchQueue.cancelRunnable(this.f50683u);
            this.f50683u = null;
        }
        int i10 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f50673k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f50682t = str;
        if (this.f50687z && this.f50668e.isEmpty()) {
            k(this.f50679q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f50669f.E(this.f50668e);
            k(this.f50678p, true, true);
            k(this.f50679q, false, false);
            gy0 gy0Var = this.f50677o;
            if (gy0Var != null) {
                gy0Var.setVisibility(4);
            }
            if (str == null && this.f50674l) {
                u0 k10 = this.f50670g.getActionBar().p().k(0);
                if (this.f50668e.isEmpty()) {
                    i10 = 8;
                }
                k10.setVisibility(i10);
            }
        } else {
            this.f50669f.E(Collections.EMPTY_LIST);
            k(this.f50678p, false, false);
            k(this.f50679q, true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            e eVar = new e(this, 2);
            this.f50683u = eVar;
            dispatchQueue.postRunnable(eVar, 300L);
        }
        if (str != null) {
            gy0 gy0Var2 = this.f50676n;
            if (gy0Var2 != null) {
                gy0Var2.setVisibility(4);
            }
            gy0 gy0Var3 = this.f50677o;
            if (gy0Var3 != null) {
                gy0Var3.setVisibility(4);
            }
        }
    }
}
