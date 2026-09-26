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
import org.telegram.ui.Components.jx0;
import org.telegram.ui.Components.o90;
import org.telegram.ui.Components.v00;
import org.telegram.ui.Components.vg0;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.Components.zr0;
public abstract class n implements f5 {
    public final boolean f45388a;
    public boolean f45389b;
    public final m2 f45392g;
    public final FrameLayout h;
    public final MemberRequestsController f45393i;
    public final long f45394j;
    public final int f45395k;
    public final boolean f45396l;
    public FrameLayout f45397m;
    public jx0 f45398n;
    public jx0 f45399o;
    public xl0 f45400p;
    public v00 f45401q;
    public TLRPC.TL_chatInviteImporter f45402r;
    public m f45403s;
    public String f45404t;
    public e f45405u;
    public int v;
    public boolean f45406w;
    public boolean f45408y;
    public boolean f45409z;
    public final ArrayList f45390c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList e = new ArrayList();
    public final g f45391f = new g(this);
    public boolean f45407x = true;
    public boolean A = true;
    public boolean B = true;
    public final e C = new e(this, 0);
    public final vg0 D = new vg0(this, 14);

    public n(m2 m2Var, FrameLayout frameLayout, long j3, boolean z10) {
        this.f45392g = m2Var;
        this.h = frameLayout;
        this.f45394j = j3;
        int currentAccount = m2Var.getCurrentAccount();
        this.f45395k = currentAccount;
        this.f45388a = ChatObject.isChannelAndNotMegaGroup(j3, currentAccount);
        this.f45396l = z10;
        this.f45393i = MemberRequestsController.getInstance(currentAccount);
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
        if (this.f45398n == null) {
            m2 m2Var = this.f45392g;
            jx0 jx0Var = new jx0(m2Var.getParentActivity(), null, 16, m2Var.getResourceProvider());
            this.f45398n = jx0Var;
            boolean z10 = this.f45388a;
            if (z10) {
                i10 = R.string.NoSubscribeRequests;
            } else {
                i10 = R.string.NoMemberRequests;
            }
            jx0Var.d.setText(LocaleController.getString(i10));
            o90 o90Var = this.f45398n.e;
            if (z10) {
                i11 = R.string.NoSubscribeRequestsDescription;
            } else {
                i11 = R.string.NoMemberRequestsDescription;
            }
            o90Var.setText(LocaleController.getString(i11));
            this.f45398n.setAnimateLayoutChange(true);
            this.f45398n.setVisibility(8);
        }
        return this.f45398n;
    }

    public final v00 b() {
        if (this.f45401q == null) {
            m2 m2Var = this.f45392g;
            v00 v00Var = new v00(m2Var.getParentActivity(), m2Var.getResourceProvider());
            this.f45401q = v00Var;
            v00Var.setAlpha(0.0f);
            if (this.B) {
                this.f45401q.setBackgroundColor(h6.v0(h6.f19059d6, m2Var.getResourceProvider()));
            }
            this.f45401q.f(h6.f19059d6, h6.f19003a7, -1);
            this.f45401q.setViewType(15);
            this.f45401q.setMemberRequestButton(this.f45388a);
        }
        return this.f45401q;
    }

    public final jx0 c() {
        if (this.f45399o == null) {
            m2 m2Var = this.f45392g;
            jx0 jx0Var = new jx0(m2Var.getParentActivity(), null, 1, m2Var.getResourceProvider());
            this.f45399o = jx0Var;
            if (this.B) {
                jx0Var.setBackgroundColor(h6.v0(h6.f19059d6, m2Var.getResourceProvider()));
            }
            this.f45399o.d.setText(LocaleController.getString(R.string.NoResult));
            this.f45399o.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            this.f45399o.setAnimateLayoutChange(true);
            this.f45399o.setVisibility(8);
        }
        return this.f45399o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z10;
        int i10 = this.f45395k;
        tL_messages_hideChatJoinRequest.peer = MessagesController.getInstance(i10).getInputPeer(-this.f45394j);
        tL_messages_hideChatJoinRequest.user_id = MessagesController.getInstance(i10).getInputUser(user);
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_hideChatJoinRequest, new p0(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        TLRPC.TL_messages_chatInviteImporters cachedImporters;
        boolean z10 = true;
        if (this.A && (cachedImporters = this.f45393i.getCachedImporters(this.f45394j)) != null) {
            this.f45409z = true;
            g(cachedImporters, null, true, true);
            z10 = false;
        }
        AndroidUtilities.runOnUIThread(new zr0(13, this, z10));
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
            jx0 jx0Var = this.f45398n;
            if (jx0Var != null) {
                if (z12) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                jx0Var.setVisibility(i11);
            }
            jx0 jx0Var2 = this.f45399o;
            if (jx0Var2 != null) {
                jx0Var2.setVisibility(4);
            }
        } else {
            if (this.f45390c.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            jx0 jx0Var3 = this.f45398n;
            if (jx0Var3 != null) {
                jx0Var3.setVisibility(4);
            }
            jx0 jx0Var4 = this.f45399o;
            if (jx0Var4 != null) {
                if (z12) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                jx0Var4.setVisibility(i10);
            }
        }
        k(this.f45400p, z12, true);
        if (arrayList.isEmpty()) {
            jx0 jx0Var5 = this.f45398n;
            if (jx0Var5 != null) {
                jx0Var5.setVisibility(0);
            }
            jx0 jx0Var6 = this.f45399o;
            if (jx0Var6 != null) {
                jx0Var6.setVisibility(4);
            }
            k(this.f45401q, false, false);
            if (this.f45408y && this.f45396l) {
                this.f45392g.getActionBar().n().j(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: wh.n.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j3;
        if (view instanceof g5) {
            if (this.f45408y) {
                AndroidUtilities.hideKeyboard(this.f45392g.getParentActivity().getCurrentFocus());
            }
            u2.p0 p0Var = new u2.p0(7, this, (g5) view);
            if (this.f45408y) {
                j3 = 100;
            } else {
                j3 = 0;
            }
            AndroidUtilities.runOnUIThread(p0Var, j3);
        }
    }

    public final void i(boolean z10) {
        int i10;
        xl0 xl0Var = this.f45400p;
        if (xl0Var != null && (i10 = !this.f45391f.f45367c.B ? 1 : 0) >= 0 && i10 < xl0Var.getChildCount()) {
            this.f45400p.getChildAt(i10).setEnabled(z10);
        }
    }

    public final void j(String str) {
        if (this.f45405u != null) {
            Utilities.searchQueue.cancelRunnable(this.f45405u);
            this.f45405u = null;
        }
        int i10 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f45395k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f45404t = str;
        if (this.f45409z && this.e.isEmpty()) {
            k(this.f45401q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f45391f.E(this.e);
            k(this.f45400p, true, true);
            k(this.f45401q, false, false);
            jx0 jx0Var = this.f45399o;
            if (jx0Var != null) {
                jx0Var.setVisibility(4);
            }
            if (str == null && this.f45396l) {
                u0 k10 = this.f45392g.getActionBar().n().k(0);
                if (this.e.isEmpty()) {
                    i10 = 8;
                }
                k10.setVisibility(i10);
            }
        } else {
            this.f45391f.E(Collections.EMPTY_LIST);
            k(this.f45400p, false, false);
            k(this.f45401q, true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            e eVar = new e(this, 2);
            this.f45405u = eVar;
            dispatchQueue.postRunnable(eVar, 300L);
        }
        if (str != null) {
            jx0 jx0Var2 = this.f45398n;
            if (jx0Var2 != null) {
                jx0Var2.setVisibility(4);
            }
            jx0 jx0Var3 = this.f45399o;
            if (jx0Var3 != null) {
                jx0Var3.setVisibility(4);
            }
        }
    }
}
