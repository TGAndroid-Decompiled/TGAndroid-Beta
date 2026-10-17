package xh;

import ai.j4;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
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
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.u0;
import org.telegram.ui.Cells.e5;
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.b60;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.kv;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.x90;
public abstract class k implements e5 {
    public final boolean f49879a;
    public boolean f49880b;
    public final n2 f49883g;
    public final FrameLayout h;
    public final MemberRequestsController f49884i;
    public final long f49885j;
    public final int f49886k;
    public final boolean f49887l;
    public FrameLayout f49888m;
    public rx0 f49889n;
    public rx0 f49890o;
    public im0 f49891p;
    public b10 f49892q;
    public TLRPC.TL_chatInviteImporter f49893r;
    public j f49894s;
    public String f49895t;
    public e f49896u;
    public int v;
    public boolean f49897w;
    public boolean f49899y;
    public boolean f49900z;
    public final ArrayList f49881c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList e = new ArrayList();
    public final f f49882f = new f(this);
    public boolean f49898x = true;
    public boolean A = true;
    public boolean B = true;
    public final e C = new e(this, 0);
    public final kv D = new kv(this, 22);

    public k(n2 n2Var, FrameLayout frameLayout, long j10, boolean z10) {
        this.f49883g = n2Var;
        this.h = frameLayout;
        this.f49885j = j10;
        int currentAccount = n2Var.getCurrentAccount();
        this.f49886k = currentAccount;
        this.f49879a = ChatObject.isChannelAndNotMegaGroup(j10, currentAccount);
        this.f49887l = z10;
        this.f49884i = MemberRequestsController.getInstance(currentAccount);
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

    public final rx0 a() {
        int i10;
        int i11;
        if (this.f49889n == null) {
            n2 n2Var = this.f49883g;
            rx0 rx0Var = new rx0(n2Var.getParentActivity(), null, 16, n2Var.getResourceProvider());
            this.f49889n = rx0Var;
            boolean z10 = this.f49879a;
            if (z10) {
                i10 = R.string.NoSubscribeRequests;
            } else {
                i10 = R.string.NoMemberRequests;
            }
            rx0Var.d.setText(LocaleController.getString(i10));
            x90 x90Var = this.f49889n.e;
            if (z10) {
                i11 = R.string.NoSubscribeRequestsDescription;
            } else {
                i11 = R.string.NoMemberRequestsDescription;
            }
            x90Var.setText(LocaleController.getString(i11));
            this.f49889n.setAnimateLayoutChange(true);
            this.f49889n.setVisibility(8);
        }
        return this.f49889n;
    }

    public final b10 b() {
        if (this.f49892q == null) {
            n2 n2Var = this.f49883g;
            b10 b10Var = new b10(n2Var.getParentActivity(), n2Var.getResourceProvider());
            this.f49892q = b10Var;
            b10Var.setAlpha(0.0f);
            if (this.B) {
                this.f49892q.setBackgroundColor(h6.w0(h6.f20986d6, n2Var.getResourceProvider()));
            }
            this.f49892q.f(h6.f20986d6, h6.f20928a7, -1);
            this.f49892q.setViewType(15);
            this.f49892q.setMemberRequestButton(this.f49879a);
        }
        return this.f49892q;
    }

    public final rx0 c() {
        if (this.f49890o == null) {
            n2 n2Var = this.f49883g;
            rx0 rx0Var = new rx0(n2Var.getParentActivity(), null, 1, n2Var.getResourceProvider());
            this.f49890o = rx0Var;
            if (this.B) {
                rx0Var.setBackgroundColor(h6.w0(h6.f20986d6, n2Var.getResourceProvider()));
            }
            this.f49890o.d.setText(LocaleController.getString(R.string.NoResult));
            this.f49890o.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            this.f49890o.setAnimateLayoutChange(true);
            this.f49890o.setVisibility(8);
        }
        return this.f49890o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z10;
        int i10 = this.f49886k;
        tL_messages_hideChatJoinRequest.peer = MessagesController.getInstance(i10).getInputPeer(-this.f49885j);
        tL_messages_hideChatJoinRequest.user_id = MessagesController.getInstance(i10).getInputUser(user);
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_hideChatJoinRequest, new j4(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        TLRPC.TL_messages_chatInviteImporters cachedImporters;
        boolean z10 = true;
        if (this.A && (cachedImporters = this.f49884i.getCachedImporters(this.f49885j)) != null) {
            this.f49900z = true;
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
            rx0 rx0Var = this.f49889n;
            if (rx0Var != null) {
                if (z12) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                rx0Var.setVisibility(i11);
            }
            rx0 rx0Var2 = this.f49890o;
            if (rx0Var2 != null) {
                rx0Var2.setVisibility(4);
            }
        } else {
            if (this.f49881c.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            rx0 rx0Var3 = this.f49889n;
            if (rx0Var3 != null) {
                rx0Var3.setVisibility(4);
            }
            rx0 rx0Var4 = this.f49890o;
            if (rx0Var4 != null) {
                if (z12) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                rx0Var4.setVisibility(i10);
            }
        }
        k(this.f49891p, z12, true);
        if (arrayList.isEmpty()) {
            rx0 rx0Var5 = this.f49889n;
            if (rx0Var5 != null) {
                rx0Var5.setVisibility(0);
            }
            rx0 rx0Var6 = this.f49890o;
            if (rx0Var6 != null) {
                rx0Var6.setVisibility(4);
            }
            k(this.f49892q, false, false);
            if (this.f49899y && this.f49887l) {
                this.f49883g.getActionBar().n().j(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: xh.k.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j10;
        if (view instanceof f5) {
            if (this.f49899y) {
                AndroidUtilities.hideKeyboard(this.f49883g.getParentActivity().getCurrentFocus());
            }
            uf.c cVar = new uf.c(14, this, (f5) view);
            if (this.f49899y) {
                j10 = 100;
            } else {
                j10 = 0;
            }
            AndroidUtilities.runOnUIThread(cVar, j10);
        }
    }

    public final void i(boolean z10) {
        int i10;
        im0 im0Var = this.f49891p;
        if (im0Var != null && (i10 = !this.f49882f.f49863c.B ? 1 : 0) >= 0 && i10 < im0Var.getChildCount()) {
            this.f49891p.getChildAt(i10).setEnabled(z10);
        }
    }

    public final void j(String str) {
        if (this.f49896u != null) {
            Utilities.searchQueue.cancelRunnable(this.f49896u);
            this.f49896u = null;
        }
        int i10 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f49886k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f49895t = str;
        if (this.f49900z && this.e.isEmpty()) {
            k(this.f49892q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f49882f.E(this.e);
            k(this.f49891p, true, true);
            k(this.f49892q, false, false);
            rx0 rx0Var = this.f49890o;
            if (rx0Var != null) {
                rx0Var.setVisibility(4);
            }
            if (str == null && this.f49887l) {
                u0 k10 = this.f49883g.getActionBar().n().k(0);
                if (this.e.isEmpty()) {
                    i10 = 8;
                }
                k10.setVisibility(i10);
            }
        } else {
            this.f49882f.E(Collections.EMPTY_LIST);
            k(this.f49891p, false, false);
            k(this.f49892q, true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            e eVar = new e(this, 2);
            this.f49896u = eVar;
            dispatchQueue.postRunnable(eVar, 300L);
        }
        if (str != null) {
            rx0 rx0Var2 = this.f49889n;
            if (rx0Var2 != null) {
                rx0Var2.setVisibility(4);
            }
            rx0 rx0Var3 = this.f49890o;
            if (rx0Var3 != null) {
                rx0Var3.setVisibility(4);
            }
        }
    }
}
