package yh;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collections;
import jg.n0;
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
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.w0;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.j5;
import org.telegram.ui.Cells.k5;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.d60;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z90;
import vi.i0;
public abstract class k implements j5 {
    public final boolean f52610a;
    public boolean f52611b;
    public final r2 f52614g;
    public final FrameLayout h;
    public final MemberRequestsController f52615i;
    public final long f52616j;
    public final int f52617k;
    public final boolean f52618l;
    public FrameLayout f52619m;
    public ey0 f52620n;
    public ey0 f52621o;
    public mm0 f52622p;
    public c10 f52623q;
    public TLRPC.TL_chatInviteImporter f52624r;
    public j f52625s;
    public String f52626t;
    public e f52627u;
    public int v;
    public boolean f52628w;
    public boolean f52630y;
    public boolean f52631z;
    public final ArrayList f52612c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList e = new ArrayList();
    public final f f52613f = new f(this);
    public boolean f52629x = true;
    public boolean A = true;
    public boolean B = true;
    public final e C = new e(this, 0);
    public final ml D = new ml(this, 27);

    public k(r2 r2Var, FrameLayout frameLayout, long j10, boolean z10) {
        this.f52614g = r2Var;
        this.h = frameLayout;
        this.f52616j = j10;
        int currentAccount = r2Var.getCurrentAccount();
        this.f52617k = currentAccount;
        this.f52610a = ChatObject.isChannelAndNotMegaGroup(j10, currentAccount);
        this.f52618l = z10;
        this.f52615i = MemberRequestsController.getInstance(currentAccount);
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

    public final ey0 a() {
        int i10;
        int i11;
        if (this.f52620n == null) {
            r2 r2Var = this.f52614g;
            ey0 ey0Var = new ey0(r2Var.getParentActivity(), null, 16, r2Var.getResourceProvider());
            this.f52620n = ey0Var;
            boolean z10 = this.f52610a;
            if (z10) {
                i10 = R.string.NoSubscribeRequests;
            } else {
                i10 = R.string.NoMemberRequests;
            }
            ey0Var.d.setText(LocaleController.getString(i10));
            z90 z90Var = this.f52620n.e;
            if (z10) {
                i11 = R.string.NoSubscribeRequestsDescription;
            } else {
                i11 = R.string.NoMemberRequestsDescription;
            }
            z90Var.setText(LocaleController.getString(i11));
            this.f52620n.setAnimateLayoutChange(true);
            this.f52620n.setVisibility(8);
        }
        return this.f52620n;
    }

    public final c10 b() {
        if (this.f52623q == null) {
            r2 r2Var = this.f52614g;
            c10 c10Var = new c10(r2Var.getParentActivity(), r2Var.getResourceProvider());
            this.f52623q = c10Var;
            c10Var.setAlpha(0.0f);
            if (this.B) {
                f7.i(y6.f23356d6, this.f52623q, r2Var.getResourceProvider());
            }
            this.f52623q.e(y6.f23356d6, y6.f23299a7, -1);
            this.f52623q.setViewType(15);
            this.f52623q.setMemberRequestButton(this.f52610a);
        }
        return this.f52623q;
    }

    public final ey0 c() {
        if (this.f52621o == null) {
            r2 r2Var = this.f52614g;
            ey0 ey0Var = new ey0(r2Var.getParentActivity(), null, 1, r2Var.getResourceProvider());
            this.f52621o = ey0Var;
            if (this.B) {
                f7.i(y6.f23356d6, ey0Var, r2Var.getResourceProvider());
            }
            this.f52621o.d.setText(LocaleController.getString(R.string.NoResult));
            this.f52621o.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            this.f52621o.setAnimateLayoutChange(true);
            this.f52621o.setVisibility(8);
        }
        return this.f52621o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z10;
        int i10 = this.f52617k;
        tL_messages_hideChatJoinRequest.peer = MessagesController.getInstance(i10).getInputPeer(-this.f52616j);
        tL_messages_hideChatJoinRequest.user_id = MessagesController.getInstance(i10).getInputUser(user);
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_hideChatJoinRequest, new n0(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        TLRPC.TL_messages_chatInviteImporters cachedImporters;
        boolean z10 = true;
        if (this.A && (cachedImporters = this.f52615i.getCachedImporters(this.f52616j)) != null) {
            this.f52631z = true;
            g(cachedImporters, null, true, true);
            z10 = false;
        }
        AndroidUtilities.runOnUIThread(new d60(21, this, z10));
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
            ey0 ey0Var = this.f52620n;
            if (ey0Var != null) {
                if (z12) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                ey0Var.setVisibility(i11);
            }
            ey0 ey0Var2 = this.f52621o;
            if (ey0Var2 != null) {
                ey0Var2.setVisibility(4);
            }
        } else {
            if (this.f52612c.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            ey0 ey0Var3 = this.f52620n;
            if (ey0Var3 != null) {
                ey0Var3.setVisibility(4);
            }
            ey0 ey0Var4 = this.f52621o;
            if (ey0Var4 != null) {
                if (z12) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                ey0Var4.setVisibility(i10);
            }
        }
        k(this.f52622p, z12, true);
        if (arrayList.isEmpty()) {
            ey0 ey0Var5 = this.f52620n;
            if (ey0Var5 != null) {
                ey0Var5.setVisibility(0);
            }
            ey0 ey0Var6 = this.f52621o;
            if (ey0Var6 != null) {
                ey0Var6.setVisibility(4);
            }
            k(this.f52623q, false, false);
            if (this.f52630y && this.f52618l) {
                this.f52614g.getActionBar().l().i(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: yh.k.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j10;
        if (view instanceof k5) {
            if (this.f52630y) {
                AndroidUtilities.hideKeyboard(this.f52614g.getParentActivity().getCurrentFocus());
            }
            i0 i0Var = new i0(7, this, (k5) view);
            if (this.f52630y) {
                j10 = 100;
            } else {
                j10 = 0;
            }
            AndroidUtilities.runOnUIThread(i0Var, j10);
        }
    }

    public final void i(boolean z10) {
        int i10;
        mm0 mm0Var = this.f52622p;
        if (mm0Var != null && (i10 = !this.f52613f.f52594c.B ? 1 : 0) >= 0 && i10 < mm0Var.getChildCount()) {
            this.f52622p.getChildAt(i10).setEnabled(z10);
        }
    }

    public final void j(String str) {
        if (this.f52627u != null) {
            Utilities.searchQueue.cancelRunnable(this.f52627u);
            this.f52627u = null;
        }
        int i10 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f52617k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f52626t = str;
        if (this.f52631z && this.e.isEmpty()) {
            k(this.f52623q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f52613f.E(this.e);
            k(this.f52622p, true, true);
            k(this.f52623q, false, false);
            ey0 ey0Var = this.f52621o;
            if (ey0Var != null) {
                ey0Var.setVisibility(4);
            }
            if (str == null && this.f52618l) {
                w0 j10 = this.f52614g.getActionBar().l().j(0);
                if (this.e.isEmpty()) {
                    i10 = 8;
                }
                j10.setVisibility(i10);
            }
        } else {
            this.f52613f.E(Collections.EMPTY_LIST);
            k(this.f52622p, false, false);
            k(this.f52623q, true, true);
            DispatchQueue2 dispatchQueue2 = Utilities.searchQueue;
            e eVar = new e(this, 2);
            this.f52627u = eVar;
            dispatchQueue2.postRunnable(eVar, 300L);
        }
        if (str != null) {
            ey0 ey0Var2 = this.f52620n;
            if (ey0Var2 != null) {
                ey0Var2.setVisibility(4);
            }
            ey0 ey0Var3 = this.f52621o;
            if (ey0Var3 != null) {
                ey0Var3.setVisibility(4);
            }
        }
    }
}
