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
import org.telegram.ui.Components.bs0;
import org.telegram.ui.Components.lx0;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.w00;
import org.telegram.ui.Components.xg0;
import org.telegram.ui.Components.zl0;
public abstract class n implements f5 {
    public final boolean f45497a;
    public boolean f45498b;
    public final m2 f45501g;
    public final FrameLayout h;
    public final MemberRequestsController f45502i;
    public final long f45503j;
    public final int f45504k;
    public final boolean f45505l;
    public FrameLayout f45506m;
    public lx0 f45507n;
    public lx0 f45508o;
    public zl0 f45509p;
    public w00 f45510q;
    public TLRPC.TL_chatInviteImporter f45511r;
    public m f45512s;
    public String f45513t;
    public e f45514u;
    public int v;
    public boolean f45515w;
    public boolean f45517y;
    public boolean f45518z;
    public final ArrayList f45499c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList e = new ArrayList();
    public final g f45500f = new g(this);
    public boolean f45516x = true;
    public boolean A = true;
    public boolean B = true;
    public final e C = new e(this, 0);
    public final xg0 D = new xg0(this, 14);

    public n(m2 m2Var, FrameLayout frameLayout, long j3, boolean z10) {
        this.f45501g = m2Var;
        this.h = frameLayout;
        this.f45503j = j3;
        int currentAccount = m2Var.getCurrentAccount();
        this.f45504k = currentAccount;
        this.f45497a = ChatObject.isChannelAndNotMegaGroup(j3, currentAccount);
        this.f45505l = z10;
        this.f45502i = MemberRequestsController.getInstance(currentAccount);
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

    public final lx0 a() {
        int i10;
        int i11;
        if (this.f45507n == null) {
            m2 m2Var = this.f45501g;
            lx0 lx0Var = new lx0(m2Var.getParentActivity(), null, 16, m2Var.getResourceProvider());
            this.f45507n = lx0Var;
            boolean z10 = this.f45497a;
            if (z10) {
                i10 = R.string.NoSubscribeRequests;
            } else {
                i10 = R.string.NoMemberRequests;
            }
            lx0Var.d.setText(LocaleController.getString(i10));
            q90 q90Var = this.f45507n.e;
            if (z10) {
                i11 = R.string.NoSubscribeRequestsDescription;
            } else {
                i11 = R.string.NoMemberRequestsDescription;
            }
            q90Var.setText(LocaleController.getString(i11));
            this.f45507n.setAnimateLayoutChange(true);
            this.f45507n.setVisibility(8);
        }
        return this.f45507n;
    }

    public final w00 b() {
        if (this.f45510q == null) {
            m2 m2Var = this.f45501g;
            w00 w00Var = new w00(m2Var.getParentActivity(), m2Var.getResourceProvider());
            this.f45510q = w00Var;
            w00Var.setAlpha(0.0f);
            if (this.B) {
                this.f45510q.setBackgroundColor(h6.v0(h6.f19076d6, m2Var.getResourceProvider()));
            }
            this.f45510q.f(h6.f19076d6, h6.f19020a7, -1);
            this.f45510q.setViewType(15);
            this.f45510q.setMemberRequestButton(this.f45497a);
        }
        return this.f45510q;
    }

    public final lx0 c() {
        if (this.f45508o == null) {
            m2 m2Var = this.f45501g;
            lx0 lx0Var = new lx0(m2Var.getParentActivity(), null, 1, m2Var.getResourceProvider());
            this.f45508o = lx0Var;
            if (this.B) {
                lx0Var.setBackgroundColor(h6.v0(h6.f19076d6, m2Var.getResourceProvider()));
            }
            this.f45508o.d.setText(LocaleController.getString(R.string.NoResult));
            this.f45508o.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            this.f45508o.setAnimateLayoutChange(true);
            this.f45508o.setVisibility(8);
        }
        return this.f45508o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z10;
        int i10 = this.f45504k;
        tL_messages_hideChatJoinRequest.peer = MessagesController.getInstance(i10).getInputPeer(-this.f45503j);
        tL_messages_hideChatJoinRequest.user_id = MessagesController.getInstance(i10).getInputUser(user);
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_hideChatJoinRequest, new p0(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        TLRPC.TL_messages_chatInviteImporters cachedImporters;
        boolean z10 = true;
        if (this.A && (cachedImporters = this.f45502i.getCachedImporters(this.f45503j)) != null) {
            this.f45518z = true;
            g(cachedImporters, null, true, true);
            z10 = false;
        }
        AndroidUtilities.runOnUIThread(new bs0(13, this, z10));
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
            lx0 lx0Var = this.f45507n;
            if (lx0Var != null) {
                if (z12) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                lx0Var.setVisibility(i11);
            }
            lx0 lx0Var2 = this.f45508o;
            if (lx0Var2 != null) {
                lx0Var2.setVisibility(4);
            }
        } else {
            if (this.f45499c.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            lx0 lx0Var3 = this.f45507n;
            if (lx0Var3 != null) {
                lx0Var3.setVisibility(4);
            }
            lx0 lx0Var4 = this.f45508o;
            if (lx0Var4 != null) {
                if (z12) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                lx0Var4.setVisibility(i10);
            }
        }
        k(this.f45509p, z12, true);
        if (arrayList.isEmpty()) {
            lx0 lx0Var5 = this.f45507n;
            if (lx0Var5 != null) {
                lx0Var5.setVisibility(0);
            }
            lx0 lx0Var6 = this.f45508o;
            if (lx0Var6 != null) {
                lx0Var6.setVisibility(4);
            }
            k(this.f45510q, false, false);
            if (this.f45517y && this.f45505l) {
                this.f45501g.getActionBar().n().j(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: wh.n.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j3;
        if (view instanceof g5) {
            if (this.f45517y) {
                AndroidUtilities.hideKeyboard(this.f45501g.getParentActivity().getCurrentFocus());
            }
            u2.p0 p0Var = new u2.p0(7, this, (g5) view);
            if (this.f45517y) {
                j3 = 100;
            } else {
                j3 = 0;
            }
            AndroidUtilities.runOnUIThread(p0Var, j3);
        }
    }

    public final void i(boolean z10) {
        int i10;
        zl0 zl0Var = this.f45509p;
        if (zl0Var != null && (i10 = !this.f45500f.f45476c.B ? 1 : 0) >= 0 && i10 < zl0Var.getChildCount()) {
            this.f45509p.getChildAt(i10).setEnabled(z10);
        }
    }

    public final void j(String str) {
        if (this.f45514u != null) {
            Utilities.searchQueue.cancelRunnable(this.f45514u);
            this.f45514u = null;
        }
        int i10 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f45504k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f45513t = str;
        if (this.f45518z && this.e.isEmpty()) {
            k(this.f45510q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f45500f.E(this.e);
            k(this.f45509p, true, true);
            k(this.f45510q, false, false);
            lx0 lx0Var = this.f45508o;
            if (lx0Var != null) {
                lx0Var.setVisibility(4);
            }
            if (str == null && this.f45505l) {
                u0 k10 = this.f45501g.getActionBar().n().k(0);
                if (this.e.isEmpty()) {
                    i10 = 8;
                }
                k10.setVisibility(i10);
            }
        } else {
            this.f45500f.E(Collections.EMPTY_LIST);
            k(this.f45509p, false, false);
            k(this.f45510q, true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            e eVar = new e(this, 2);
            this.f45514u = eVar;
            dispatchQueue.postRunnable(eVar, 300L);
        }
        if (str != null) {
            lx0 lx0Var2 = this.f45507n;
            if (lx0Var2 != null) {
                lx0Var2.setVisibility(4);
            }
            lx0 lx0Var3 = this.f45508o;
            if (lx0Var3 != null) {
                lx0Var3.setVisibility(4);
            }
        }
    }
}
