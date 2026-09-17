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
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MemberRequestsController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.v0;
import org.telegram.ui.Cells.e5;
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.mr0;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.xw0;
import ug.r;
public abstract class n implements e5 {
    public final boolean f49472a;
    public boolean f49473b;
    public final n2 f49477g;
    public final FrameLayout h;
    public final MemberRequestsController f49478i;
    public final long f49479j;
    public final int f49480k;
    public final boolean f49481l;
    public FrameLayout f49482m;
    public xw0 f49483n;
    public xw0 f49484o;
    public ll0 f49485p;
    public t00 f49486q;
    public TLRPC.TL_chatInviteImporter f49487r;
    public m f49488s;
    public String f49489t;
    public e f49490u;
    public int v;
    public boolean f49491w;
    public boolean f49493y;
    public boolean f49494z;
    public final ArrayList f49474c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList f49475e = new ArrayList();
    public final g f49476f = new g(this);
    public boolean f49492x = true;
    public boolean A = true;
    public boolean B = true;
    public final e C = new e(this, 0);
    public final lb0 D = new lb0(this, 15);

    public n(n2 n2Var, FrameLayout frameLayout, long j3, boolean z10) {
        this.f49477g = n2Var;
        this.h = frameLayout;
        this.f49479j = j3;
        int currentAccount = n2Var.getCurrentAccount();
        this.f49480k = currentAccount;
        this.f49472a = ChatObject.isChannelAndNotMegaGroup(j3, currentAccount);
        this.f49481l = z10;
        this.f49478i = MemberRequestsController.getInstance(currentAccount);
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

    public final xw0 a() {
        int i10;
        int i11;
        if (this.f49483n == null) {
            n2 n2Var = this.f49477g;
            xw0 xw0Var = new xw0(n2Var.getParentActivity(), null, 16, n2Var.getResourceProvider());
            this.f49483n = xw0Var;
            boolean z10 = this.f49472a;
            if (z10) {
                i10 = R.string.NoSubscribeRequests;
            } else {
                i10 = R.string.NoMemberRequests;
            }
            xw0Var.d.setText(LocaleController.getString(i10));
            d90 d90Var = this.f49483n.f32783e;
            if (z10) {
                i11 = R.string.NoSubscribeRequestsDescription;
            } else {
                i11 = R.string.NoMemberRequestsDescription;
            }
            d90Var.setText(LocaleController.getString(i11));
            this.f49483n.setAnimateLayoutChange(true);
            this.f49483n.setVisibility(8);
        }
        return this.f49483n;
    }

    public final t00 b() {
        if (this.f49486q == null) {
            n2 n2Var = this.f49477g;
            t00 t00Var = new t00(n2Var.getParentActivity(), n2Var.getResourceProvider());
            this.f49486q = t00Var;
            t00Var.setAlpha(0.0f);
            if (this.B) {
                this.f49486q.setBackgroundColor(j6.v0(j6.f20691d6, n2Var.getResourceProvider()));
            }
            this.f49486q.f(j6.f20691d6, j6.f20635a7, -1);
            this.f49486q.setViewType(15);
            this.f49486q.setMemberRequestButton(this.f49472a);
        }
        return this.f49486q;
    }

    public final xw0 c() {
        if (this.f49484o == null) {
            n2 n2Var = this.f49477g;
            xw0 xw0Var = new xw0(n2Var.getParentActivity(), null, 1, n2Var.getResourceProvider());
            this.f49484o = xw0Var;
            if (this.B) {
                xw0Var.setBackgroundColor(j6.v0(j6.f20691d6, n2Var.getResourceProvider()));
            }
            this.f49484o.d.setText(LocaleController.getString(R.string.NoResult));
            this.f49484o.f32783e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            this.f49484o.setAnimateLayoutChange(true);
            this.f49484o.setVisibility(8);
        }
        return this.f49484o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z10;
        int i10 = this.f49480k;
        tL_messages_hideChatJoinRequest.peer = MessagesController.getInstance(i10).getInputPeer(-this.f49479j);
        tL_messages_hideChatJoinRequest.user_id = MessagesController.getInstance(i10).getInputUser(user);
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_hideChatJoinRequest, new n0(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        TLRPC.TL_messages_chatInviteImporters cachedImporters;
        boolean z10 = true;
        if (this.A && (cachedImporters = this.f49478i.getCachedImporters(this.f49479j)) != null) {
            this.f49494z = true;
            g(cachedImporters, null, true, true);
            z10 = false;
        }
        AndroidUtilities.runOnUIThread(new mr0(13, this, z10));
    }

    public void f(String str, boolean z10, boolean z11) {
        boolean z12;
        int i10;
        int i11;
        boolean isEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList = this.f49475e;
        if (isEmpty) {
            if (arrayList.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            xw0 xw0Var = this.f49483n;
            if (xw0Var != null) {
                if (z12) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                xw0Var.setVisibility(i11);
            }
            xw0 xw0Var2 = this.f49484o;
            if (xw0Var2 != null) {
                xw0Var2.setVisibility(4);
            }
        } else {
            if (this.f49474c.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            xw0 xw0Var3 = this.f49483n;
            if (xw0Var3 != null) {
                xw0Var3.setVisibility(4);
            }
            xw0 xw0Var4 = this.f49484o;
            if (xw0Var4 != null) {
                if (z12) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                xw0Var4.setVisibility(i10);
            }
        }
        k(this.f49485p, z12, true);
        if (arrayList.isEmpty()) {
            xw0 xw0Var5 = this.f49483n;
            if (xw0Var5 != null) {
                xw0Var5.setVisibility(0);
            }
            xw0 xw0Var6 = this.f49484o;
            if (xw0Var6 != null) {
                xw0Var6.setVisibility(4);
            }
            k(this.f49486q, false, false);
            if (this.f49493y && this.f49481l) {
                this.f49477g.getActionBar().n().j(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: xh.n.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j3;
        if (view instanceof f5) {
            if (this.f49493y) {
                AndroidUtilities.hideKeyboard(this.f49477g.getParentActivity().getCurrentFocus());
            }
            r rVar = new r(8, this, (f5) view);
            if (this.f49493y) {
                j3 = 100;
            } else {
                j3 = 0;
            }
            AndroidUtilities.runOnUIThread(rVar, j3);
        }
    }

    public final void i(boolean z10) {
        int i10;
        ll0 ll0Var = this.f49485p;
        if (ll0Var != null && (i10 = !this.f49476f.f49448c.B ? 1 : 0) >= 0 && i10 < ll0Var.getChildCount()) {
            this.f49485p.getChildAt(i10).setEnabled(z10);
        }
    }

    public final void j(String str) {
        if (this.f49490u != null) {
            Utilities.searchQueue.cancelRunnable(this.f49490u);
            this.f49490u = null;
        }
        int i10 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f49480k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f49489t = str;
        if (this.f49494z && this.f49475e.isEmpty()) {
            k(this.f49486q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f49476f.E(this.f49475e);
            k(this.f49485p, true, true);
            k(this.f49486q, false, false);
            xw0 xw0Var = this.f49484o;
            if (xw0Var != null) {
                xw0Var.setVisibility(4);
            }
            if (str == null && this.f49481l) {
                v0 k10 = this.f49477g.getActionBar().n().k(0);
                if (this.f49475e.isEmpty()) {
                    i10 = 8;
                }
                k10.setVisibility(i10);
            }
        } else {
            this.f49476f.E(Collections.EMPTY_LIST);
            k(this.f49485p, false, false);
            k(this.f49486q, true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            e eVar = new e(this, 2);
            this.f49490u = eVar;
            dispatchQueue.postRunnable(eVar, 300L);
        }
        if (str != null) {
            xw0 xw0Var2 = this.f49483n;
            if (xw0Var2 != null) {
                xw0Var2.setVisibility(4);
            }
            xw0 xw0Var3 = this.f49484o;
            if (xw0Var3 != null) {
                xw0Var3.setVisibility(4);
            }
        }
    }
}
