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
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.u0;
import org.telegram.ui.Cells.e5;
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.b60;
import org.telegram.ui.Components.kv;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.wx0;
import org.telegram.ui.Components.y90;
import u2.k0;
public abstract class k implements e5 {
    public final boolean f50307a;
    public boolean f50308b;
    public final o2 f50311g;
    public final FrameLayout h;
    public final MemberRequestsController f50312i;
    public final long f50313j;
    public final int f50314k;
    public final boolean f50315l;
    public FrameLayout f50316m;
    public wx0 f50317n;
    public wx0 f50318o;
    public mm0 f50319p;
    public b10 f50320q;
    public TLRPC.TL_chatInviteImporter f50321r;
    public j f50322s;
    public String f50323t;
    public e f50324u;
    public int v;
    public boolean f50325w;
    public boolean f50327y;
    public boolean f50328z;
    public final ArrayList f50309c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList e = new ArrayList();
    public final f f50310f = new f(this);
    public boolean f50326x = true;
    public boolean A = true;
    public boolean B = true;
    public final e C = new e(this, 0);
    public final kv D = new kv(this, 22);

    public k(o2 o2Var, FrameLayout frameLayout, long j10, boolean z10) {
        this.f50311g = o2Var;
        this.h = frameLayout;
        this.f50313j = j10;
        int currentAccount = o2Var.getCurrentAccount();
        this.f50314k = currentAccount;
        this.f50307a = ChatObject.isChannelAndNotMegaGroup(j10, currentAccount);
        this.f50315l = z10;
        this.f50312i = MemberRequestsController.getInstance(currentAccount);
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

    public final wx0 a() {
        int i10;
        int i11;
        if (this.f50317n == null) {
            o2 o2Var = this.f50311g;
            wx0 wx0Var = new wx0(o2Var.getParentActivity(), null, 16, o2Var.getResourceProvider());
            this.f50317n = wx0Var;
            boolean z10 = this.f50307a;
            if (z10) {
                i10 = R.string.NoSubscribeRequests;
            } else {
                i10 = R.string.NoMemberRequests;
            }
            wx0Var.d.setText(LocaleController.getString(i10));
            y90 y90Var = this.f50317n.e;
            if (z10) {
                i11 = R.string.NoSubscribeRequestsDescription;
            } else {
                i11 = R.string.NoMemberRequestsDescription;
            }
            y90Var.setText(LocaleController.getString(i11));
            this.f50317n.setAnimateLayoutChange(true);
            this.f50317n.setVisibility(8);
        }
        return this.f50317n;
    }

    public final b10 b() {
        if (this.f50320q == null) {
            o2 o2Var = this.f50311g;
            b10 b10Var = new b10(o2Var.getParentActivity(), o2Var.getResourceProvider());
            this.f50320q = b10Var;
            b10Var.setAlpha(0.0f);
            if (this.B) {
                r6.i(k6.f21183d6, this.f50320q, o2Var.getResourceProvider());
            }
            this.f50320q.e(k6.f21183d6, k6.f21125a7, -1);
            this.f50320q.setViewType(15);
            this.f50320q.setMemberRequestButton(this.f50307a);
        }
        return this.f50320q;
    }

    public final wx0 c() {
        if (this.f50318o == null) {
            o2 o2Var = this.f50311g;
            wx0 wx0Var = new wx0(o2Var.getParentActivity(), null, 1, o2Var.getResourceProvider());
            this.f50318o = wx0Var;
            if (this.B) {
                r6.i(k6.f21183d6, wx0Var, o2Var.getResourceProvider());
            }
            this.f50318o.d.setText(LocaleController.getString(R.string.NoResult));
            this.f50318o.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            this.f50318o.setAnimateLayoutChange(true);
            this.f50318o.setVisibility(8);
        }
        return this.f50318o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z10;
        int i10 = this.f50314k;
        tL_messages_hideChatJoinRequest.peer = MessagesController.getInstance(i10).getInputPeer(-this.f50313j);
        tL_messages_hideChatJoinRequest.user_id = MessagesController.getInstance(i10).getInputUser(user);
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_hideChatJoinRequest, new n0(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        TLRPC.TL_messages_chatInviteImporters cachedImporters;
        boolean z10 = true;
        if (this.A && (cachedImporters = this.f50312i.getCachedImporters(this.f50313j)) != null) {
            this.f50328z = true;
            g(cachedImporters, null, true, true);
            z10 = false;
        }
        AndroidUtilities.runOnUIThread(new b60(19, this, z10));
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
            wx0 wx0Var = this.f50317n;
            if (wx0Var != null) {
                if (z12) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                wx0Var.setVisibility(i11);
            }
            wx0 wx0Var2 = this.f50318o;
            if (wx0Var2 != null) {
                wx0Var2.setVisibility(4);
            }
        } else {
            if (this.f50309c.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            wx0 wx0Var3 = this.f50317n;
            if (wx0Var3 != null) {
                wx0Var3.setVisibility(4);
            }
            wx0 wx0Var4 = this.f50318o;
            if (wx0Var4 != null) {
                if (z12) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                wx0Var4.setVisibility(i10);
            }
        }
        k(this.f50319p, z12, true);
        if (arrayList.isEmpty()) {
            wx0 wx0Var5 = this.f50317n;
            if (wx0Var5 != null) {
                wx0Var5.setVisibility(0);
            }
            wx0 wx0Var6 = this.f50318o;
            if (wx0Var6 != null) {
                wx0Var6.setVisibility(4);
            }
            k(this.f50320q, false, false);
            if (this.f50327y && this.f50315l) {
                this.f50311g.getActionBar().m().j(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: xh.k.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j10;
        if (view instanceof f5) {
            if (this.f50327y) {
                AndroidUtilities.hideKeyboard(this.f50311g.getParentActivity().getCurrentFocus());
            }
            k0 k0Var = new k0(16, this, (f5) view);
            if (this.f50327y) {
                j10 = 100;
            } else {
                j10 = 0;
            }
            AndroidUtilities.runOnUIThread(k0Var, j10);
        }
    }

    public final void i(boolean z10) {
        int i10;
        mm0 mm0Var = this.f50319p;
        if (mm0Var != null && (i10 = !this.f50310f.f50291c.B ? 1 : 0) >= 0 && i10 < mm0Var.getChildCount()) {
            this.f50319p.getChildAt(i10).setEnabled(z10);
        }
    }

    public final void j(String str) {
        if (this.f50324u != null) {
            Utilities.searchQueue.cancelRunnable(this.f50324u);
            this.f50324u = null;
        }
        int i10 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f50314k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f50323t = str;
        if (this.f50328z && this.e.isEmpty()) {
            k(this.f50320q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f50310f.E(this.e);
            k(this.f50319p, true, true);
            k(this.f50320q, false, false);
            wx0 wx0Var = this.f50318o;
            if (wx0Var != null) {
                wx0Var.setVisibility(4);
            }
            if (str == null && this.f50315l) {
                u0 k10 = this.f50311g.getActionBar().m().k(0);
                if (this.e.isEmpty()) {
                    i10 = 8;
                }
                k10.setVisibility(i10);
            }
        } else {
            this.f50310f.E(Collections.EMPTY_LIST);
            k(this.f50319p, false, false);
            k(this.f50320q, true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            e eVar = new e(this, 2);
            this.f50324u = eVar;
            dispatchQueue.postRunnable(eVar, 300L);
        }
        if (str != null) {
            wx0 wx0Var2 = this.f50317n;
            if (wx0Var2 != null) {
                wx0Var2.setVisibility(4);
            }
            wx0 wx0Var3 = this.f50318o;
            if (wx0Var3 != null) {
                wx0Var3.setVisibility(4);
            }
        }
    }
}
