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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.w0;
import org.telegram.ui.Cells.e5;
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.kb0;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.tr0;
import org.telegram.ui.Components.zw0;
public abstract class n implements e5 {
    public final boolean f45134a;
    public boolean f45135b;
    public final o2 f45138g;
    public final FrameLayout h;
    public final MemberRequestsController f45139i;
    public final long f45140j;
    public final int f45141k;
    public final boolean f45142l;
    public FrameLayout f45143m;
    public zw0 f45144n;
    public zw0 f45145o;
    public ml0 f45146p;
    public t00 f45147q;
    public TLRPC.TL_chatInviteImporter f45148r;
    public m f45149s;
    public String f45150t;
    public e f45151u;
    public int v;
    public boolean f45152w;
    public boolean f45154y;
    public boolean f45155z;
    public final ArrayList f45136c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList e = new ArrayList();
    public final g f45137f = new g(this);
    public boolean f45153x = true;
    public boolean A = true;
    public boolean B = true;
    public final e C = new e(this, 0);
    public final kb0 D = new kb0(this, 16);

    public n(o2 o2Var, FrameLayout frameLayout, long j3, boolean z10) {
        this.f45138g = o2Var;
        this.h = frameLayout;
        this.f45140j = j3;
        int currentAccount = o2Var.getCurrentAccount();
        this.f45141k = currentAccount;
        this.f45134a = ChatObject.isChannelAndNotMegaGroup(j3, currentAccount);
        this.f45142l = z10;
        this.f45139i = MemberRequestsController.getInstance(currentAccount);
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

    public final zw0 a() {
        int i10;
        int i11;
        if (this.f45144n == null) {
            o2 o2Var = this.f45138g;
            zw0 zw0Var = new zw0(o2Var.getParentActivity(), null, 16, o2Var.getResourceProvider());
            this.f45144n = zw0Var;
            boolean z10 = this.f45134a;
            if (z10) {
                i10 = R.string.NoSubscribeRequests;
            } else {
                i10 = R.string.NoMemberRequests;
            }
            zw0Var.d.setText(LocaleController.getString(i10));
            c90 c90Var = this.f45144n.e;
            if (z10) {
                i11 = R.string.NoSubscribeRequestsDescription;
            } else {
                i11 = R.string.NoMemberRequestsDescription;
            }
            c90Var.setText(LocaleController.getString(i11));
            this.f45144n.setAnimateLayoutChange(true);
            this.f45144n.setVisibility(8);
        }
        return this.f45144n;
    }

    public final t00 b() {
        if (this.f45147q == null) {
            o2 o2Var = this.f45138g;
            t00 t00Var = new t00(o2Var.getParentActivity(), o2Var.getResourceProvider());
            this.f45147q = t00Var;
            t00Var.setAlpha(0.0f);
            if (this.B) {
                this.f45147q.setBackgroundColor(j6.v0(j6.f18862d6, o2Var.getResourceProvider()));
            }
            this.f45147q.f(j6.f18862d6, j6.f18806a7, -1);
            this.f45147q.setViewType(15);
            this.f45147q.setMemberRequestButton(this.f45134a);
        }
        return this.f45147q;
    }

    public final zw0 c() {
        if (this.f45145o == null) {
            o2 o2Var = this.f45138g;
            zw0 zw0Var = new zw0(o2Var.getParentActivity(), null, 1, o2Var.getResourceProvider());
            this.f45145o = zw0Var;
            if (this.B) {
                zw0Var.setBackgroundColor(j6.v0(j6.f18862d6, o2Var.getResourceProvider()));
            }
            this.f45145o.d.setText(LocaleController.getString(R.string.NoResult));
            this.f45145o.e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            this.f45145o.setAnimateLayoutChange(true);
            this.f45145o.setVisibility(8);
        }
        return this.f45145o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z10;
        int i10 = this.f45141k;
        tL_messages_hideChatJoinRequest.peer = MessagesController.getInstance(i10).getInputPeer(-this.f45140j);
        tL_messages_hideChatJoinRequest.user_id = MessagesController.getInstance(i10).getInputUser(user);
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_hideChatJoinRequest, new o0(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        TLRPC.TL_messages_chatInviteImporters cachedImporters;
        boolean z10 = true;
        if (this.A && (cachedImporters = this.f45139i.getCachedImporters(this.f45140j)) != null) {
            this.f45155z = true;
            g(cachedImporters, null, true, true);
            z10 = false;
        }
        AndroidUtilities.runOnUIThread(new tr0(12, this, z10));
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
            zw0 zw0Var = this.f45144n;
            if (zw0Var != null) {
                if (z12) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                zw0Var.setVisibility(i11);
            }
            zw0 zw0Var2 = this.f45145o;
            if (zw0Var2 != null) {
                zw0Var2.setVisibility(4);
            }
        } else {
            if (this.f45136c.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            zw0 zw0Var3 = this.f45144n;
            if (zw0Var3 != null) {
                zw0Var3.setVisibility(4);
            }
            zw0 zw0Var4 = this.f45145o;
            if (zw0Var4 != null) {
                if (z12) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                zw0Var4.setVisibility(i10);
            }
        }
        k(this.f45146p, z12, true);
        if (arrayList.isEmpty()) {
            zw0 zw0Var5 = this.f45144n;
            if (zw0Var5 != null) {
                zw0Var5.setVisibility(0);
            }
            zw0 zw0Var6 = this.f45145o;
            if (zw0Var6 != null) {
                zw0Var6.setVisibility(4);
            }
            k(this.f45147q, false, false);
            if (this.f45154y && this.f45142l) {
                this.f45138g.getActionBar().n().j(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: wh.n.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j3;
        if (view instanceof f5) {
            if (this.f45154y) {
                AndroidUtilities.hideKeyboard(this.f45138g.getParentActivity().getCurrentFocus());
            }
            uh.i iVar = new uh.i(2, this, (f5) view);
            if (this.f45154y) {
                j3 = 100;
            } else {
                j3 = 0;
            }
            AndroidUtilities.runOnUIThread(iVar, j3);
        }
    }

    public final void i(boolean z10) {
        int i10;
        ml0 ml0Var = this.f45146p;
        if (ml0Var != null && (i10 = !this.f45137f.f45113c.B ? 1 : 0) >= 0 && i10 < ml0Var.getChildCount()) {
            this.f45146p.getChildAt(i10).setEnabled(z10);
        }
    }

    public final void j(String str) {
        if (this.f45151u != null) {
            Utilities.searchQueue.cancelRunnable(this.f45151u);
            this.f45151u = null;
        }
        int i10 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f45141k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f45150t = str;
        if (this.f45155z && this.e.isEmpty()) {
            k(this.f45147q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f45137f.E(this.e);
            k(this.f45146p, true, true);
            k(this.f45147q, false, false);
            zw0 zw0Var = this.f45145o;
            if (zw0Var != null) {
                zw0Var.setVisibility(4);
            }
            if (str == null && this.f45142l) {
                w0 k10 = this.f45138g.getActionBar().n().k(0);
                if (this.e.isEmpty()) {
                    i10 = 8;
                }
                k10.setVisibility(i10);
            }
        } else {
            this.f45137f.E(Collections.EMPTY_LIST);
            k(this.f45146p, false, false);
            k(this.f45147q, true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            e eVar = new e(this, 2);
            this.f45151u = eVar;
            dispatchQueue.postRunnable(eVar, 300L);
        }
        if (str != null) {
            zw0 zw0Var2 = this.f45144n;
            if (zw0Var2 != null) {
                zw0Var2.setVisibility(4);
            }
            zw0 zw0Var3 = this.f45145o;
            if (zw0Var3 != null) {
                zw0Var3.setVisibility(4);
            }
        }
    }
}
