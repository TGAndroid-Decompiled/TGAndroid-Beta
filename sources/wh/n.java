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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.w0;
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Components.as0;
import org.telegram.ui.Components.hg0;
import org.telegram.ui.Components.kx0;
import org.telegram.ui.Components.p90;
import org.telegram.ui.Components.v00;
import org.telegram.ui.Components.yl0;
public abstract class n implements f5 {
    public final boolean f45435a;
    public boolean f45436b;
    public final o2 f45439g;
    public final FrameLayout h;
    public final MemberRequestsController f45440i;
    public final long f45441j;
    public final int f45442k;
    public final boolean f45443l;
    public FrameLayout f45444m;
    public kx0 f45445n;
    public kx0 f45446o;
    public yl0 f45447p;
    public v00 f45448q;
    public TLRPC.TL_chatInviteImporter f45449r;
    public m f45450s;
    public String f45451t;
    public e f45452u;
    public int v;
    public boolean f45453w;
    public boolean f45455y;
    public boolean f45456z;
    public final ArrayList f45437c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList e = new ArrayList();
    public final g f45438f = new g(this);
    public boolean f45454x = true;
    public boolean A = true;
    public boolean B = true;
    public final e C = new e(this, 0);
    public final hg0 D = new hg0(this, 15);

    public n(o2 o2Var, FrameLayout frameLayout, long j3, boolean z10) {
        this.f45439g = o2Var;
        this.h = frameLayout;
        this.f45441j = j3;
        int currentAccount = o2Var.getCurrentAccount();
        this.f45442k = currentAccount;
        this.f45435a = ChatObject.isChannelAndNotMegaGroup(j3, currentAccount);
        this.f45443l = z10;
        this.f45440i = MemberRequestsController.getInstance(currentAccount);
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
        if (this.f45445n == null) {
            o2 o2Var = this.f45439g;
            kx0 kx0Var = new kx0(o2Var.getParentActivity(), null, 16, o2Var.getResourceProvider());
            this.f45445n = kx0Var;
            boolean z10 = this.f45435a;
            if (z10) {
                i10 = R.string.NoSubscribeRequests;
            } else {
                i10 = R.string.NoMemberRequests;
            }
            kx0Var.d.setText(LocaleController.getString(i10));
            p90 p90Var = this.f45445n.e;
            if (z10) {
                i11 = R.string.NoSubscribeRequestsDescription;
            } else {
                i11 = R.string.NoMemberRequestsDescription;
            }
            p90Var.setText(LocaleController.getString(i11));
            this.f45445n.setAnimateLayoutChange(true);
            this.f45445n.setVisibility(8);
        }
        return this.f45445n;
    }

    public final v00 b() {
        if (this.f45448q == null) {
            o2 o2Var = this.f45439g;
            v00 v00Var = new v00(o2Var.getParentActivity(), o2Var.getResourceProvider());
            this.f45448q = v00Var;
            v00Var.setAlpha(0.0f);
            if (this.B) {
                this.f45448q.setBackgroundColor(i6.v0(i6.f19057d6, o2Var.getResourceProvider()));
            }
            this.f45448q.f(i6.f19057d6, i6.f19001a7, -1);
            this.f45448q.setViewType(15);
            this.f45448q.setMemberRequestButton(this.f45435a);
        }
        return this.f45448q;
    }

    public final kx0 c() {
        if (this.f45446o == null) {
            o2 o2Var = this.f45439g;
            kx0 kx0Var = new kx0(o2Var.getParentActivity(), null, 1, o2Var.getResourceProvider());
            this.f45446o = kx0Var;
            if (this.B) {
                kx0Var.setBackgroundColor(i6.v0(i6.f19057d6, o2Var.getResourceProvider()));
            }
            this.f45446o.d.setText(LocaleController.getString(R.string.NoResult));
            this.f45446o.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            this.f45446o.setAnimateLayoutChange(true);
            this.f45446o.setVisibility(8);
        }
        return this.f45446o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z10;
        int i10 = this.f45442k;
        tL_messages_hideChatJoinRequest.peer = MessagesController.getInstance(i10).getInputPeer(-this.f45441j);
        tL_messages_hideChatJoinRequest.user_id = MessagesController.getInstance(i10).getInputUser(user);
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_hideChatJoinRequest, new o0(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        TLRPC.TL_messages_chatInviteImporters cachedImporters;
        boolean z10 = true;
        if (this.A && (cachedImporters = this.f45440i.getCachedImporters(this.f45441j)) != null) {
            this.f45456z = true;
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
            kx0 kx0Var = this.f45445n;
            if (kx0Var != null) {
                if (z12) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                kx0Var.setVisibility(i11);
            }
            kx0 kx0Var2 = this.f45446o;
            if (kx0Var2 != null) {
                kx0Var2.setVisibility(4);
            }
        } else {
            if (this.f45437c.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            kx0 kx0Var3 = this.f45445n;
            if (kx0Var3 != null) {
                kx0Var3.setVisibility(4);
            }
            kx0 kx0Var4 = this.f45446o;
            if (kx0Var4 != null) {
                if (z12) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                kx0Var4.setVisibility(i10);
            }
        }
        k(this.f45447p, z12, true);
        if (arrayList.isEmpty()) {
            kx0 kx0Var5 = this.f45445n;
            if (kx0Var5 != null) {
                kx0Var5.setVisibility(0);
            }
            kx0 kx0Var6 = this.f45446o;
            if (kx0Var6 != null) {
                kx0Var6.setVisibility(4);
            }
            k(this.f45448q, false, false);
            if (this.f45455y && this.f45443l) {
                this.f45439g.getActionBar().o().j(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: wh.n.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j3;
        if (view instanceof g5) {
            if (this.f45455y) {
                AndroidUtilities.hideKeyboard(this.f45439g.getParentActivity().getCurrentFocus());
            }
            uf.b bVar = new uf.b(5, this, (g5) view);
            if (this.f45455y) {
                j3 = 100;
            } else {
                j3 = 0;
            }
            AndroidUtilities.runOnUIThread(bVar, j3);
        }
    }

    public final void i(boolean z10) {
        int i10;
        yl0 yl0Var = this.f45447p;
        if (yl0Var != null && (i10 = !this.f45438f.f45414c.B ? 1 : 0) >= 0 && i10 < yl0Var.getChildCount()) {
            this.f45447p.getChildAt(i10).setEnabled(z10);
        }
    }

    public final void j(String str) {
        if (this.f45452u != null) {
            Utilities.searchQueue.cancelRunnable(this.f45452u);
            this.f45452u = null;
        }
        int i10 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f45442k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f45451t = str;
        if (this.f45456z && this.e.isEmpty()) {
            k(this.f45448q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f45438f.E(this.e);
            k(this.f45447p, true, true);
            k(this.f45448q, false, false);
            kx0 kx0Var = this.f45446o;
            if (kx0Var != null) {
                kx0Var.setVisibility(4);
            }
            if (str == null && this.f45443l) {
                w0 k10 = this.f45439g.getActionBar().o().k(0);
                if (this.e.isEmpty()) {
                    i10 = 8;
                }
                k10.setVisibility(i10);
            }
        } else {
            this.f45438f.E(Collections.EMPTY_LIST);
            k(this.f45447p, false, false);
            k(this.f45448q, true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            e eVar = new e(this, 2);
            this.f45452u = eVar;
            dispatchQueue.postRunnable(eVar, 300L);
        }
        if (str != null) {
            kx0 kx0Var2 = this.f45445n;
            if (kx0Var2 != null) {
                kx0Var2.setVisibility(4);
            }
            kx0 kx0Var3 = this.f45446o;
            if (kx0Var3 != null) {
                kx0Var3.setVisibility(4);
            }
        }
    }
}
