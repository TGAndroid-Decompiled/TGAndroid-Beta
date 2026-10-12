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
import tg.c1;
public abstract class l implements f5 {
    public final boolean f50657a;
    public boolean f50658b;
    public final m2 f50662g;
    public final FrameLayout h;
    public final MemberRequestsController f50663i;
    public final long f50664j;
    public final int f50665k;
    public final boolean f50666l;
    public FrameLayout f50667m;
    public gy0 f50668n;
    public gy0 f50669o;
    public wm0 f50670p;
    public m10 f50671q;
    public TLRPC.TL_chatInviteImporter f50672r;
    public k f50673s;
    public String f50674t;
    public e f50675u;
    public int v;
    public boolean f50676w;
    public boolean f50678y;
    public boolean f50679z;
    public final ArrayList f50659c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList f50660e = new ArrayList();
    public final g f50661f = new g(this);
    public boolean f50677x = true;
    public boolean A = true;
    public boolean B = true;
    public final e C = new e(this, 0);
    public final qh0 D = new qh0(this, 17);

    public l(m2 m2Var, FrameLayout frameLayout, long j3, boolean z10) {
        this.f50662g = m2Var;
        this.h = frameLayout;
        this.f50664j = j3;
        int currentAccount = m2Var.getCurrentAccount();
        this.f50665k = currentAccount;
        this.f50657a = ChatObject.isChannelAndNotMegaGroup(j3, currentAccount);
        this.f50666l = z10;
        this.f50663i = MemberRequestsController.getInstance(currentAccount);
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
        if (this.f50668n == null) {
            m2 m2Var = this.f50662g;
            gy0 gy0Var = new gy0(m2Var.getParentActivity(), null, 16, m2Var.getResourceProvider());
            this.f50668n = gy0Var;
            boolean z10 = this.f50657a;
            if (z10) {
                i10 = R.string.NoSubscribeRequests;
            } else {
                i10 = R.string.NoMemberRequests;
            }
            gy0Var.d.setText(LocaleController.getString(i10));
            ia0 ia0Var = this.f50668n.f26557e;
            if (z10) {
                i11 = R.string.NoSubscribeRequestsDescription;
            } else {
                i11 = R.string.NoMemberRequestsDescription;
            }
            ia0Var.setText(LocaleController.getString(i11));
            this.f50668n.setAnimateLayoutChange(true);
            this.f50668n.setVisibility(8);
        }
        return this.f50668n;
    }

    public final m10 b() {
        if (this.f50671q == null) {
            m2 m2Var = this.f50662g;
            m10 m10Var = new m10(m2Var.getParentActivity(), m2Var.getResourceProvider());
            this.f50671q = m10Var;
            m10Var.setAlpha(0.0f);
            if (this.B) {
                this.f50671q.setBackgroundColor(h6.w0(h6.f20559d6, m2Var.getResourceProvider()));
            }
            this.f50671q.f(h6.f20559d6, h6.f20503a7, -1);
            this.f50671q.setViewType(15);
            this.f50671q.setMemberRequestButton(this.f50657a);
        }
        return this.f50671q;
    }

    public final gy0 c() {
        if (this.f50669o == null) {
            m2 m2Var = this.f50662g;
            gy0 gy0Var = new gy0(m2Var.getParentActivity(), null, 1, m2Var.getResourceProvider());
            this.f50669o = gy0Var;
            if (this.B) {
                gy0Var.setBackgroundColor(h6.w0(h6.f20559d6, m2Var.getResourceProvider()));
            }
            this.f50669o.d.setText(LocaleController.getString(R.string.NoResult));
            this.f50669o.f26557e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            this.f50669o.setAnimateLayoutChange(true);
            this.f50669o.setVisibility(8);
        }
        return this.f50669o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z10;
        int i10 = this.f50665k;
        tL_messages_hideChatJoinRequest.peer = MessagesController.getInstance(i10).getInputPeer(-this.f50664j);
        tL_messages_hideChatJoinRequest.user_id = MessagesController.getInstance(i10).getInputUser(user);
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_hideChatJoinRequest, new o0(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        TLRPC.TL_messages_chatInviteImporters cachedImporters;
        boolean z10 = true;
        if (this.A && (cachedImporters = this.f50663i.getCachedImporters(this.f50664j)) != null) {
            this.f50679z = true;
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
        ArrayList arrayList = this.f50660e;
        if (isEmpty) {
            if (arrayList.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            gy0 gy0Var = this.f50668n;
            if (gy0Var != null) {
                if (z12) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                gy0Var.setVisibility(i11);
            }
            gy0 gy0Var2 = this.f50669o;
            if (gy0Var2 != null) {
                gy0Var2.setVisibility(4);
            }
        } else {
            if (this.f50659c.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            gy0 gy0Var3 = this.f50668n;
            if (gy0Var3 != null) {
                gy0Var3.setVisibility(4);
            }
            gy0 gy0Var4 = this.f50669o;
            if (gy0Var4 != null) {
                if (z12) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                gy0Var4.setVisibility(i10);
            }
        }
        k(this.f50670p, z12, true);
        if (arrayList.isEmpty()) {
            gy0 gy0Var5 = this.f50668n;
            if (gy0Var5 != null) {
                gy0Var5.setVisibility(0);
            }
            gy0 gy0Var6 = this.f50669o;
            if (gy0Var6 != null) {
                gy0Var6.setVisibility(4);
            }
            k(this.f50671q, false, false);
            if (this.f50678y && this.f50666l) {
                this.f50662g.getActionBar().p().j(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: wh.l.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j3;
        if (view instanceof g5) {
            if (this.f50678y) {
                AndroidUtilities.hideKeyboard(this.f50662g.getParentActivity().getCurrentFocus());
            }
            c1 c1Var = new c1(9, this, (g5) view);
            if (this.f50678y) {
                j3 = 100;
            } else {
                j3 = 0;
            }
            AndroidUtilities.runOnUIThread(c1Var, j3);
        }
    }

    public final void i(boolean z10) {
        int i10;
        wm0 wm0Var = this.f50670p;
        if (wm0Var != null && (i10 = !this.f50661f.f50639c.B ? 1 : 0) >= 0 && i10 < wm0Var.getChildCount()) {
            this.f50670p.getChildAt(i10).setEnabled(z10);
        }
    }

    public final void j(String str) {
        if (this.f50675u != null) {
            Utilities.searchQueue.cancelRunnable(this.f50675u);
            this.f50675u = null;
        }
        int i10 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f50665k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f50674t = str;
        if (this.f50679z && this.f50660e.isEmpty()) {
            k(this.f50671q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f50661f.E(this.f50660e);
            k(this.f50670p, true, true);
            k(this.f50671q, false, false);
            gy0 gy0Var = this.f50669o;
            if (gy0Var != null) {
                gy0Var.setVisibility(4);
            }
            if (str == null && this.f50666l) {
                u0 k10 = this.f50662g.getActionBar().p().k(0);
                if (this.f50660e.isEmpty()) {
                    i10 = 8;
                }
                k10.setVisibility(i10);
            }
        } else {
            this.f50661f.E(Collections.EMPTY_LIST);
            k(this.f50670p, false, false);
            k(this.f50671q, true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            e eVar = new e(this, 2);
            this.f50675u = eVar;
            dispatchQueue.postRunnable(eVar, 300L);
        }
        if (str != null) {
            gy0 gy0Var2 = this.f50668n;
            if (gy0Var2 != null) {
                gy0Var2.setVisibility(4);
            }
            gy0 gy0Var3 = this.f50669o;
            if (gy0Var3 != null) {
                gy0Var3.setVisibility(4);
            }
        }
    }
}
