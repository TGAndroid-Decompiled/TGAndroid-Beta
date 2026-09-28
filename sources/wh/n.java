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
import org.telegram.ui.Components.as0;
import org.telegram.ui.Components.kx0;
import org.telegram.ui.Components.p90;
import org.telegram.ui.Components.v00;
import org.telegram.ui.Components.wg0;
import org.telegram.ui.Components.yl0;
public abstract class n implements f5 {
    public final boolean f45389a;
    public boolean f45390b;
    public final m2 f45393g;
    public final FrameLayout h;
    public final MemberRequestsController f45394i;
    public final long f45395j;
    public final int f45396k;
    public final boolean f45397l;
    public FrameLayout f45398m;
    public kx0 f45399n;
    public kx0 f45400o;
    public yl0 f45401p;
    public v00 f45402q;
    public TLRPC.TL_chatInviteImporter f45403r;
    public m f45404s;
    public String f45405t;
    public e f45406u;
    public int v;
    public boolean f45407w;
    public boolean f45409y;
    public boolean f45410z;
    public final ArrayList f45391c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList e = new ArrayList();
    public final g f45392f = new g(this);
    public boolean f45408x = true;
    public boolean A = true;
    public boolean B = true;
    public final e C = new e(this, 0);
    public final wg0 D = new wg0(this, 14);

    public n(m2 m2Var, FrameLayout frameLayout, long j3, boolean z10) {
        this.f45393g = m2Var;
        this.h = frameLayout;
        this.f45395j = j3;
        int currentAccount = m2Var.getCurrentAccount();
        this.f45396k = currentAccount;
        this.f45389a = ChatObject.isChannelAndNotMegaGroup(j3, currentAccount);
        this.f45397l = z10;
        this.f45394i = MemberRequestsController.getInstance(currentAccount);
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

    public final kx0 a() {
        int i10;
        int i11;
        if (this.f45399n == null) {
            m2 m2Var = this.f45393g;
            kx0 kx0Var = new kx0(m2Var.getParentActivity(), null, 16, m2Var.getResourceProvider());
            this.f45399n = kx0Var;
            boolean z10 = this.f45389a;
            if (z10) {
                i10 = R.string.NoSubscribeRequests;
            } else {
                i10 = R.string.NoMemberRequests;
            }
            kx0Var.d.setText(LocaleController.getString(i10));
            p90 p90Var = this.f45399n.e;
            if (z10) {
                i11 = R.string.NoSubscribeRequestsDescription;
            } else {
                i11 = R.string.NoMemberRequestsDescription;
            }
            p90Var.setText(LocaleController.getString(i11));
            this.f45399n.setAnimateLayoutChange(true);
            this.f45399n.setVisibility(8);
        }
        return this.f45399n;
    }

    public final v00 b() {
        if (this.f45402q == null) {
            m2 m2Var = this.f45393g;
            v00 v00Var = new v00(m2Var.getParentActivity(), m2Var.getResourceProvider());
            this.f45402q = v00Var;
            v00Var.setAlpha(0.0f);
            if (this.B) {
                this.f45402q.setBackgroundColor(h6.v0(h6.f19059d6, m2Var.getResourceProvider()));
            }
            this.f45402q.f(h6.f19059d6, h6.f19003a7, -1);
            this.f45402q.setViewType(15);
            this.f45402q.setMemberRequestButton(this.f45389a);
        }
        return this.f45402q;
    }

    public final kx0 c() {
        if (this.f45400o == null) {
            m2 m2Var = this.f45393g;
            kx0 kx0Var = new kx0(m2Var.getParentActivity(), null, 1, m2Var.getResourceProvider());
            this.f45400o = kx0Var;
            if (this.B) {
                kx0Var.setBackgroundColor(h6.v0(h6.f19059d6, m2Var.getResourceProvider()));
            }
            this.f45400o.d.setText(LocaleController.getString(R.string.NoResult));
            this.f45400o.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            this.f45400o.setAnimateLayoutChange(true);
            this.f45400o.setVisibility(8);
        }
        return this.f45400o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z10;
        int i10 = this.f45396k;
        tL_messages_hideChatJoinRequest.peer = MessagesController.getInstance(i10).getInputPeer(-this.f45395j);
        tL_messages_hideChatJoinRequest.user_id = MessagesController.getInstance(i10).getInputUser(user);
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_hideChatJoinRequest, new p0(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        TLRPC.TL_messages_chatInviteImporters cachedImporters;
        boolean z10 = true;
        if (this.A && (cachedImporters = this.f45394i.getCachedImporters(this.f45395j)) != null) {
            this.f45410z = true;
            g(cachedImporters, null, true, true);
            z10 = false;
        }
        AndroidUtilities.runOnUIThread(new as0(13, this, z10));
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
            kx0 kx0Var = this.f45399n;
            if (kx0Var != null) {
                if (z12) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                kx0Var.setVisibility(i11);
            }
            kx0 kx0Var2 = this.f45400o;
            if (kx0Var2 != null) {
                kx0Var2.setVisibility(4);
            }
        } else {
            if (this.f45391c.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            kx0 kx0Var3 = this.f45399n;
            if (kx0Var3 != null) {
                kx0Var3.setVisibility(4);
            }
            kx0 kx0Var4 = this.f45400o;
            if (kx0Var4 != null) {
                if (z12) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                kx0Var4.setVisibility(i10);
            }
        }
        k(this.f45401p, z12, true);
        if (arrayList.isEmpty()) {
            kx0 kx0Var5 = this.f45399n;
            if (kx0Var5 != null) {
                kx0Var5.setVisibility(0);
            }
            kx0 kx0Var6 = this.f45400o;
            if (kx0Var6 != null) {
                kx0Var6.setVisibility(4);
            }
            k(this.f45402q, false, false);
            if (this.f45409y && this.f45397l) {
                this.f45393g.getActionBar().n().j(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: wh.n.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j3;
        if (view instanceof g5) {
            if (this.f45409y) {
                AndroidUtilities.hideKeyboard(this.f45393g.getParentActivity().getCurrentFocus());
            }
            u2.p0 p0Var = new u2.p0(7, this, (g5) view);
            if (this.f45409y) {
                j3 = 100;
            } else {
                j3 = 0;
            }
            AndroidUtilities.runOnUIThread(p0Var, j3);
        }
    }

    public final void i(boolean z10) {
        int i10;
        yl0 yl0Var = this.f45401p;
        if (yl0Var != null && (i10 = !this.f45392f.f45368c.B ? 1 : 0) >= 0 && i10 < yl0Var.getChildCount()) {
            this.f45401p.getChildAt(i10).setEnabled(z10);
        }
    }

    public final void j(String str) {
        if (this.f45406u != null) {
            Utilities.searchQueue.cancelRunnable(this.f45406u);
            this.f45406u = null;
        }
        int i10 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f45396k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f45405t = str;
        if (this.f45410z && this.e.isEmpty()) {
            k(this.f45402q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f45392f.E(this.e);
            k(this.f45401p, true, true);
            k(this.f45402q, false, false);
            kx0 kx0Var = this.f45400o;
            if (kx0Var != null) {
                kx0Var.setVisibility(4);
            }
            if (str == null && this.f45397l) {
                u0 k10 = this.f45393g.getActionBar().n().k(0);
                if (this.e.isEmpty()) {
                    i10 = 8;
                }
                k10.setVisibility(i10);
            }
        } else {
            this.f45392f.E(Collections.EMPTY_LIST);
            k(this.f45401p, false, false);
            k(this.f45402q, true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            e eVar = new e(this, 2);
            this.f45406u = eVar;
            dispatchQueue.postRunnable(eVar, 300L);
        }
        if (str != null) {
            kx0 kx0Var2 = this.f45399n;
            if (kx0Var2 != null) {
                kx0Var2.setVisibility(4);
            }
            kx0 kx0Var3 = this.f45400o;
            if (kx0Var3 != null) {
                kx0Var3.setVisibility(4);
            }
        }
    }
}
