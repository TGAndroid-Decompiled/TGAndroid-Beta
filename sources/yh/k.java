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
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.d60;
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.nm0;
import vi.k0;
public abstract class k implements j5 {
    public final boolean f52668a;
    public boolean f52669b;
    public final r2 f52672g;
    public final FrameLayout h;
    public final MemberRequestsController f52673i;
    public final long f52674j;
    public final int f52675k;
    public final boolean f52676l;
    public FrameLayout f52677m;
    public fy0 f52678n;
    public fy0 f52679o;
    public nm0 f52680p;
    public c10 f52681q;
    public TLRPC.TL_chatInviteImporter f52682r;
    public j f52683s;
    public String f52684t;
    public e f52685u;
    public int v;
    public boolean f52686w;
    public boolean f52688y;
    public boolean f52689z;
    public final ArrayList f52670c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList e = new ArrayList();
    public final f f52671f = new f(this);
    public boolean f52687x = true;
    public boolean A = true;
    public boolean B = true;
    public final e C = new e(this, 0);
    public final ml D = new ml(this, 27);

    public k(r2 r2Var, FrameLayout frameLayout, long j10, boolean z10) {
        this.f52672g = r2Var;
        this.h = frameLayout;
        this.f52674j = j10;
        int currentAccount = r2Var.getCurrentAccount();
        this.f52675k = currentAccount;
        this.f52668a = ChatObject.isChannelAndNotMegaGroup(j10, currentAccount);
        this.f52676l = z10;
        this.f52673i = MemberRequestsController.getInstance(currentAccount);
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

    public final fy0 a() {
        int i10;
        int i11;
        if (this.f52678n == null) {
            r2 r2Var = this.f52672g;
            fy0 fy0Var = new fy0(r2Var.getParentActivity(), null, 16, r2Var.getResourceProvider());
            this.f52678n = fy0Var;
            boolean z10 = this.f52668a;
            if (z10) {
                i10 = R.string.NoSubscribeRequests;
            } else {
                i10 = R.string.NoMemberRequests;
            }
            fy0Var.d.setText(LocaleController.getString(i10));
            aa0 aa0Var = this.f52678n.e;
            if (z10) {
                i11 = R.string.NoSubscribeRequestsDescription;
            } else {
                i11 = R.string.NoMemberRequestsDescription;
            }
            aa0Var.setText(LocaleController.getString(i11));
            this.f52678n.setAnimateLayoutChange(true);
            this.f52678n.setVisibility(8);
        }
        return this.f52678n;
    }

    public final c10 b() {
        if (this.f52681q == null) {
            r2 r2Var = this.f52672g;
            c10 c10Var = new c10(r2Var.getParentActivity(), r2Var.getResourceProvider());
            this.f52681q = c10Var;
            c10Var.setAlpha(0.0f);
            if (this.B) {
                f7.i(y6.f23357d6, this.f52681q, r2Var.getResourceProvider());
            }
            this.f52681q.e(y6.f23357d6, y6.f23300a7, -1);
            this.f52681q.setViewType(15);
            this.f52681q.setMemberRequestButton(this.f52668a);
        }
        return this.f52681q;
    }

    public final fy0 c() {
        if (this.f52679o == null) {
            r2 r2Var = this.f52672g;
            fy0 fy0Var = new fy0(r2Var.getParentActivity(), null, 1, r2Var.getResourceProvider());
            this.f52679o = fy0Var;
            if (this.B) {
                f7.i(y6.f23357d6, fy0Var, r2Var.getResourceProvider());
            }
            this.f52679o.d.setText(LocaleController.getString(R.string.NoResult));
            this.f52679o.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            this.f52679o.setAnimateLayoutChange(true);
            this.f52679o.setVisibility(8);
        }
        return this.f52679o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z10;
        int i10 = this.f52675k;
        tL_messages_hideChatJoinRequest.peer = MessagesController.getInstance(i10).getInputPeer(-this.f52674j);
        tL_messages_hideChatJoinRequest.user_id = MessagesController.getInstance(i10).getInputUser(user);
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_hideChatJoinRequest, new n0(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        TLRPC.TL_messages_chatInviteImporters cachedImporters;
        boolean z10 = true;
        if (this.A && (cachedImporters = this.f52673i.getCachedImporters(this.f52674j)) != null) {
            this.f52689z = true;
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
            fy0 fy0Var = this.f52678n;
            if (fy0Var != null) {
                if (z12) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                fy0Var.setVisibility(i11);
            }
            fy0 fy0Var2 = this.f52679o;
            if (fy0Var2 != null) {
                fy0Var2.setVisibility(4);
            }
        } else {
            if (this.f52670c.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            fy0 fy0Var3 = this.f52678n;
            if (fy0Var3 != null) {
                fy0Var3.setVisibility(4);
            }
            fy0 fy0Var4 = this.f52679o;
            if (fy0Var4 != null) {
                if (z12) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                fy0Var4.setVisibility(i10);
            }
        }
        k(this.f52680p, z12, true);
        if (arrayList.isEmpty()) {
            fy0 fy0Var5 = this.f52678n;
            if (fy0Var5 != null) {
                fy0Var5.setVisibility(0);
            }
            fy0 fy0Var6 = this.f52679o;
            if (fy0Var6 != null) {
                fy0Var6.setVisibility(4);
            }
            k(this.f52681q, false, false);
            if (this.f52688y && this.f52676l) {
                this.f52672g.getActionBar().l().i(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: yh.k.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j10;
        if (view instanceof k5) {
            if (this.f52688y) {
                AndroidUtilities.hideKeyboard(this.f52672g.getParentActivity().getCurrentFocus());
            }
            k0 k0Var = new k0(7, this, (k5) view);
            if (this.f52688y) {
                j10 = 100;
            } else {
                j10 = 0;
            }
            AndroidUtilities.runOnUIThread(k0Var, j10);
        }
    }

    public final void i(boolean z10) {
        int i10;
        nm0 nm0Var = this.f52680p;
        if (nm0Var != null && (i10 = !this.f52671f.f52652c.B ? 1 : 0) >= 0 && i10 < nm0Var.getChildCount()) {
            this.f52680p.getChildAt(i10).setEnabled(z10);
        }
    }

    public final void j(String str) {
        if (this.f52685u != null) {
            Utilities.searchQueue.cancelRunnable(this.f52685u);
            this.f52685u = null;
        }
        int i10 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f52675k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f52684t = str;
        if (this.f52689z && this.e.isEmpty()) {
            k(this.f52681q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f52671f.E(this.e);
            k(this.f52680p, true, true);
            k(this.f52681q, false, false);
            fy0 fy0Var = this.f52679o;
            if (fy0Var != null) {
                fy0Var.setVisibility(4);
            }
            if (str == null && this.f52676l) {
                w0 j10 = this.f52672g.getActionBar().l().j(0);
                if (this.e.isEmpty()) {
                    i10 = 8;
                }
                j10.setVisibility(i10);
            }
        } else {
            this.f52671f.E(Collections.EMPTY_LIST);
            k(this.f52680p, false, false);
            k(this.f52681q, true, true);
            DispatchQueue2 dispatchQueue2 = Utilities.searchQueue;
            e eVar = new e(this, 2);
            this.f52685u = eVar;
            dispatchQueue2.postRunnable(eVar, 300L);
        }
        if (str != null) {
            fy0 fy0Var2 = this.f52678n;
            if (fy0Var2 != null) {
                fy0Var2.setVisibility(4);
            }
            fy0 fy0Var3 = this.f52679o;
            if (fy0Var3 != null) {
                fy0Var3.setVisibility(4);
            }
        }
    }
}
