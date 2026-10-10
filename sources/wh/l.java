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
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.v0;
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Cells.g5;
import org.telegram.ui.Components.by0;
import org.telegram.ui.Components.es0;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.nh0;
import org.telegram.ui.Components.rm0;
import u2.p0;
public abstract class l implements f5 {
    public final boolean f50472a;
    public boolean f50473b;
    public final n2 f50477g;
    public final FrameLayout h;
    public final MemberRequestsController f50478i;
    public final long f50479j;
    public final int f50480k;
    public final boolean f50481l;
    public FrameLayout f50482m;
    public by0 f50483n;
    public by0 f50484o;
    public rm0 f50485p;
    public k10 f50486q;
    public TLRPC.TL_chatInviteImporter f50487r;
    public k f50488s;
    public String f50489t;
    public e f50490u;
    public int v;
    public boolean f50491w;
    public boolean f50493y;
    public boolean f50494z;
    public final ArrayList f50474c = new ArrayList();
    public final LongSparseArray d = new LongSparseArray();
    public final ArrayList f50475e = new ArrayList();
    public final g f50476f = new g(this);
    public boolean f50492x = true;
    public boolean A = true;
    public boolean B = true;
    public final e C = new e(this, 0);
    public final nh0 D = new nh0(this, 17);

    public l(n2 n2Var, FrameLayout frameLayout, long j3, boolean z10) {
        this.f50477g = n2Var;
        this.h = frameLayout;
        this.f50479j = j3;
        int currentAccount = n2Var.getCurrentAccount();
        this.f50480k = currentAccount;
        this.f50472a = ChatObject.isChannelAndNotMegaGroup(j3, currentAccount);
        this.f50481l = z10;
        this.f50478i = MemberRequestsController.getInstance(currentAccount);
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

    public final by0 a() {
        int i10;
        int i11;
        if (this.f50483n == null) {
            n2 n2Var = this.f50477g;
            by0 by0Var = new by0(n2Var.getParentActivity(), null, 16, n2Var.getResourceProvider());
            this.f50483n = by0Var;
            boolean z10 = this.f50472a;
            if (z10) {
                i10 = R.string.NoSubscribeRequests;
            } else {
                i10 = R.string.NoMemberRequests;
            }
            by0Var.d.setText(LocaleController.getString(i10));
            fa0 fa0Var = this.f50483n.f25085e;
            if (z10) {
                i11 = R.string.NoSubscribeRequestsDescription;
            } else {
                i11 = R.string.NoMemberRequestsDescription;
            }
            fa0Var.setText(LocaleController.getString(i11));
            this.f50483n.setAnimateLayoutChange(true);
            this.f50483n.setVisibility(8);
        }
        return this.f50483n;
    }

    public final k10 b() {
        if (this.f50486q == null) {
            n2 n2Var = this.f50477g;
            k10 k10Var = new k10(n2Var.getParentActivity(), n2Var.getResourceProvider());
            this.f50486q = k10Var;
            k10Var.setAlpha(0.0f);
            if (this.B) {
                this.f50486q.setBackgroundColor(i6.w0(i6.f20801d6, n2Var.getResourceProvider()));
            }
            this.f50486q.f(i6.f20801d6, i6.f20745a7, -1);
            this.f50486q.setViewType(15);
            this.f50486q.setMemberRequestButton(this.f50472a);
        }
        return this.f50486q;
    }

    public final by0 c() {
        if (this.f50484o == null) {
            n2 n2Var = this.f50477g;
            by0 by0Var = new by0(n2Var.getParentActivity(), null, 1, n2Var.getResourceProvider());
            this.f50484o = by0Var;
            if (this.B) {
                by0Var.setBackgroundColor(i6.w0(i6.f20801d6, n2Var.getResourceProvider()));
            }
            this.f50484o.d.setText(LocaleController.getString(R.string.NoResult));
            this.f50484o.f25085e.setText(LocaleController.getString(R.string.SearchEmptyViewFilteredSubtitle2));
            this.f50484o.setAnimateLayoutChange(true);
            this.f50484o.setVisibility(8);
        }
        return this.f50484o;
    }

    public final void d(TLRPC.TL_chatInviteImporter tL_chatInviteImporter, boolean z10) {
        TLRPC.User user = (TLRPC.User) this.d.get(tL_chatInviteImporter.user_id);
        if (user == null) {
            return;
        }
        TLRPC.TL_messages_hideChatJoinRequest tL_messages_hideChatJoinRequest = new TLRPC.TL_messages_hideChatJoinRequest();
        tL_messages_hideChatJoinRequest.approved = z10;
        int i10 = this.f50480k;
        tL_messages_hideChatJoinRequest.peer = MessagesController.getInstance(i10).getInputPeer(-this.f50479j);
        tL_messages_hideChatJoinRequest.user_id = MessagesController.getInstance(i10).getInputUser(user);
        ConnectionsManager.getInstance(i10).sendRequest(tL_messages_hideChatJoinRequest, new o0(this, tL_chatInviteImporter, z10, user, tL_messages_hideChatJoinRequest));
    }

    public final void e() {
        TLRPC.TL_messages_chatInviteImporters cachedImporters;
        boolean z10 = true;
        if (this.A && (cachedImporters = this.f50478i.getCachedImporters(this.f50479j)) != null) {
            this.f50494z = true;
            g(cachedImporters, null, true, true);
            z10 = false;
        }
        AndroidUtilities.runOnUIThread(new es0(15, this, z10));
    }

    public void f(String str, boolean z10, boolean z11) {
        boolean z12;
        int i10;
        int i11;
        boolean isEmpty = TextUtils.isEmpty(str);
        ArrayList arrayList = this.f50475e;
        if (isEmpty) {
            if (arrayList.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            by0 by0Var = this.f50483n;
            if (by0Var != null) {
                if (z12) {
                    i11 = 4;
                } else {
                    i11 = 0;
                }
                by0Var.setVisibility(i11);
            }
            by0 by0Var2 = this.f50484o;
            if (by0Var2 != null) {
                by0Var2.setVisibility(4);
            }
        } else {
            if (this.f50474c.isEmpty() && !z10) {
                z12 = false;
            } else {
                z12 = true;
            }
            by0 by0Var3 = this.f50483n;
            if (by0Var3 != null) {
                by0Var3.setVisibility(4);
            }
            by0 by0Var4 = this.f50484o;
            if (by0Var4 != null) {
                if (z12) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                by0Var4.setVisibility(i10);
            }
        }
        k(this.f50485p, z12, true);
        if (arrayList.isEmpty()) {
            by0 by0Var5 = this.f50483n;
            if (by0Var5 != null) {
                by0Var5.setVisibility(0);
            }
            by0 by0Var6 = this.f50484o;
            if (by0Var6 != null) {
                by0Var6.setVisibility(4);
            }
            k(this.f50486q, false, false);
            if (this.f50493y && this.f50481l) {
                this.f50477g.getActionBar().o().j(true);
            }
        }
    }

    public final void g(org.telegram.tgnet.TLRPC.TL_messages_chatInviteImporters r18, java.lang.String r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: wh.l.g(org.telegram.tgnet.TLRPC$TL_messages_chatInviteImporters, java.lang.String, boolean, boolean):void");
    }

    public final void h(View view) {
        long j3;
        if (view instanceof g5) {
            if (this.f50493y) {
                AndroidUtilities.hideKeyboard(this.f50477g.getParentActivity().getCurrentFocus());
            }
            p0 p0Var = new p0(7, this, (g5) view);
            if (this.f50493y) {
                j3 = 100;
            } else {
                j3 = 0;
            }
            AndroidUtilities.runOnUIThread(p0Var, j3);
        }
    }

    public final void i(boolean z10) {
        int i10;
        rm0 rm0Var = this.f50485p;
        if (rm0Var != null && (i10 = !this.f50476f.f50454c.B ? 1 : 0) >= 0 && i10 < rm0Var.getChildCount()) {
            this.f50485p.getChildAt(i10).setEnabled(z10);
        }
    }

    public final void j(String str) {
        if (this.f50490u != null) {
            Utilities.searchQueue.cancelRunnable(this.f50490u);
            this.f50490u = null;
        }
        int i10 = 0;
        if (this.v != 0) {
            ConnectionsManager.getInstance(this.f50480k).cancelRequest(this.v, false);
            this.v = 0;
        }
        this.f50489t = str;
        if (this.f50494z && this.f50475e.isEmpty()) {
            k(this.f50486q, false, false);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.f50476f.E(this.f50475e);
            k(this.f50485p, true, true);
            k(this.f50486q, false, false);
            by0 by0Var = this.f50484o;
            if (by0Var != null) {
                by0Var.setVisibility(4);
            }
            if (str == null && this.f50481l) {
                v0 k10 = this.f50477g.getActionBar().o().k(0);
                if (this.f50475e.isEmpty()) {
                    i10 = 8;
                }
                k10.setVisibility(i10);
            }
        } else {
            this.f50476f.E(Collections.EMPTY_LIST);
            k(this.f50485p, false, false);
            k(this.f50486q, true, true);
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            e eVar = new e(this, 2);
            this.f50490u = eVar;
            dispatchQueue.postRunnable(eVar, 300L);
        }
        if (str != null) {
            by0 by0Var2 = this.f50483n;
            if (by0Var2 != null) {
                by0Var2.setVisibility(4);
            }
            by0 by0Var3 = this.f50484o;
            if (by0Var3 != null) {
                by0Var3.setVisibility(4);
            }
        }
    }
}
