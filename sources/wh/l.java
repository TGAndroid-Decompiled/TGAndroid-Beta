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
import org.telegram.ui.Components.by0;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.es0;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.rm0;
import tg.c1;
public abstract class l implements f5 {
    public final boolean f50550a;
    public boolean f50551b;
    public final m2 f50555g;
    public final FrameLayout h;
    public final MemberRequestsController f50556i;
    public final long f50557j;
    public final int f50558k;
    public final boolean f50559l;
    public FrameLayout f50560m;
    public by0 f50561n;
    public by0 f50562o;
    public rm0 f50563p;
    public k10 f50564q;
    public TLRPC.TL_chatInviteImporter f50565r;
    public k f50566s;
    public String f50567t;
    public e f50568u;
    public int v;
    public boolean f50569w;
    public boolean f50571y;
    public boolean f50572z;
    public final ArrayList f50552c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList f50553e = new ArrayList();
    public final g f50554f = new g(this);
    public boolean f50570x = true;
    public boolean A = true;
    public boolean B = true;
    public final e C = new e(this, 0);
    public final nh0 D = new nh0(this, 17);

    public l(m2 m2Var, FrameLayout frameLayout, long j3, boolean z10) {
        this.f50555g = m2Var;
        this.h = frameLayout;
        this.f50557j = j3;
        int currentAccount = m2Var.getCurrentAccount();
        this.f50558k = currentAccount;
        this.f50550a = ChatObject.isChannelAndNotMegaGroup(j3, currentAccount);
        this.f50559l = z10;
        this.f50556i = MemberRequestsController.getInstance(currentAccount);
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

    public final by0 a() {
        int i10;
        int i11;
        if (this.f50561n == null) {
            m2 m2Var = this.f50555g;
            by0 by0Var = new by0(m2Var.getParentActivity(), null, 16, m2Var.getResourceProvider());
            this.f50561n = by0Var;
            boolean z10 = this.f50550a;
            if (z10) {
                i10 = R.string.NoSubscribeRequests;
            } else {
                i10 = R.string.NoMemberRequests;
            }
            by0Var.d.setText(LocaleController.getString(i10));
            ea0 ea0Var = this.f50561n.f25123e;
            if (z10) {
                i11 = R.string.NoSubscribeRequestsDescription;
            } else {
                i11 = R.string.NoMemberRequestsDescription;
            }
            ea0Var.setText(LocaleController.getString(i11));
            this.f50561n.setAnimateLayoutChange(true);
            this.f50561n.setVisibility(8);
        }
        return this.f50561n;
    }

    public final k10 b() {
        if (this.f50564q == null) {
            m2 m2Var = this.f50555g;
            k10 k10Var = new k10(m2Var.getParentActivity(), m2Var.getResourceProvider());
            this.f50564q = k10Var;
            k10Var.setAlpha(0.0f);
            if (this.B) {
                this.f50564q.setBackgroundColor(h6.w0(h6.f20822d6, m2Var.getResourceProvider()));
            }
            this.f50564q.f(h6.f20822d6, h6.f20766a7, -1);
            this.f50564q.setViewType(15);
            this.f50564q.setMemberRequestButton(this.f50550a);
        }
        return this.f50564q;
    }

    public final by0 c() {
        if (this.f50562o == null) {
            m2 m2Var = this.f50555g;
            by0 by0Var = new by0(m2Var.getParentActivity(), null, 1, m2Var.getResourceProvider());
            this.f50562o = by0Var;
            if (this.B) {
                by0Var.setBackgroundColor(h6.w0(h6.f20822d6, m2Var.getResourceProvider()));
            }
            this.f50562o.d.setText(LocaleController.getString(R.string.NoResult));
            this.f50562o.f25123e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            this.f50562o.setAnimateLayoutChange(true);
            this.f50562o.setVisibility(8);
        }
        return this.f50562o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z10;
        int i10 = this.f50558k;
        tL_messages_hideChatJoinRequest.peer = MessagesController.getInstance(i10).getInputPeer(-this.f50557j);
        tL_messages_hideChatJoinRequest.user_id = MessagesController.getInstance(i10).getInputUser(user);
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_hideChatJoinRequest, new o0(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        TLRPC.TL_messages_chatInviteImporters cachedImporters;
        boolean z10 = true;
        if (this.A && (cachedImporters = this.f50556i.getCachedImporters(this.f50557j)) != null) {
            this.f50572z = true;
            g(cachedImporters, null, true, true);
            z10 = false;
        }
        AndroidUtilities.runOnUIThread(new es0(15, this, z10));
    }

    public void f(String str, boolean z10, boolean z11) {
        boolean z12;
        int i10;
        int i11;
        boolean isEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList = this.f50553e;
        if (isEmpty) {
            if (arrayList.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            by0 by0Var = this.f50561n;
            if (by0Var != null) {
                if (z12) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                by0Var.setVisibility(i11);
            }
            by0 by0Var2 = this.f50562o;
            if (by0Var2 != null) {
                by0Var2.setVisibility(4);
            }
        } else {
            if (this.f50552c.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            by0 by0Var3 = this.f50561n;
            if (by0Var3 != null) {
                by0Var3.setVisibility(4);
            }
            by0 by0Var4 = this.f50562o;
            if (by0Var4 != null) {
                if (z12) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                by0Var4.setVisibility(i10);
            }
        }
        k(this.f50563p, z12, true);
        if (arrayList.isEmpty()) {
            by0 by0Var5 = this.f50561n;
            if (by0Var5 != null) {
                by0Var5.setVisibility(0);
            }
            by0 by0Var6 = this.f50562o;
            if (by0Var6 != null) {
                by0Var6.setVisibility(4);
            }
            k(this.f50564q, false, false);
            if (this.f50571y && this.f50559l) {
                this.f50555g.getActionBar().o().j(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: wh.l.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j3;
        if (view instanceof g5) {
            if (this.f50571y) {
                AndroidUtilities.hideKeyboard(this.f50555g.getParentActivity().getCurrentFocus());
            }
            c1 c1Var = new c1(9, this, (g5) view);
            if (this.f50571y) {
                j3 = 100;
            } else {
                j3 = 0;
            }
            AndroidUtilities.runOnUIThread(c1Var, j3);
        }
    }

    public final void i(boolean z10) {
        int i10;
        rm0 rm0Var = this.f50563p;
        if (rm0Var != null && (i10 = !this.f50554f.f50532c.B ? 1 : 0) >= 0 && i10 < rm0Var.getChildCount()) {
            this.f50563p.getChildAt(i10).setEnabled(z10);
        }
    }

    public final void j(String str) {
        if (this.f50568u != null) {
            Utilities.searchQueue.cancelRunnable(this.f50568u);
            this.f50568u = null;
        }
        int i10 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f50558k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f50567t = str;
        if (this.f50572z && this.f50553e.isEmpty()) {
            k(this.f50564q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f50554f.E(this.f50553e);
            k(this.f50563p, true, true);
            k(this.f50564q, false, false);
            by0 by0Var = this.f50562o;
            if (by0Var != null) {
                by0Var.setVisibility(4);
            }
            if (str == null && this.f50559l) {
                u0 k10 = this.f50555g.getActionBar().o().k(0);
                if (this.f50553e.isEmpty()) {
                    i10 = 8;
                }
                k10.setVisibility(i10);
            }
        } else {
            this.f50554f.E(Collections.EMPTY_LIST);
            k(this.f50563p, false, false);
            k(this.f50564q, true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            e eVar = new e(this, 2);
            this.f50568u = eVar;
            dispatchQueue.postRunnable(eVar, 300L);
        }
        if (str != null) {
            by0 by0Var2 = this.f50561n;
            if (by0Var2 != null) {
                by0Var2.setVisibility(4);
            }
            by0 by0Var3 = this.f50562o;
            if (by0Var3 != null) {
                by0Var3.setVisibility(4);
            }
        }
    }
}
