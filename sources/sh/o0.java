package sh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import lh.pa;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d9;
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.z4;
import ph.wa;
public final class o0 implements th.d {
    public final Context f44384a;
    public final f6 f44385b;
    public final qc f44386c;
    public final int d;
    public final long e;
    public final TLRPC.Chat f44387f;
    public n0 h;
    public pa f44389i;
    public String f44391k;
    public int f44392l;
    public boolean f44393m;
    public boolean f44394n;
    public long f44395o;
    public int f44396p;
    public d2 f44397q;
    public int f44398r;
    public final a0.h f44388g = new a0.h();
    public ArrayList f44390j = new ArrayList();

    public o0(Context context, f6 f6Var, qc qcVar, int i10, long j10) {
        this.f44384a = context;
        this.f44385b = f6Var;
        this.f44386c = qcVar;
        this.d = i10;
        this.e = j10;
        this.f44387f = MessagesController.getInstance(i10).getChat(Long.valueOf(j10));
        this.f44395o = MessagesController.getMainSettings(i10).getLong(android.support.v4.media.a.n(j10, "community_requests_last_view_time_"), 0L);
    }

    public final void a() {
        TL_communities.CommunityPeerRequest communityPeerRequest;
        this.f44396p = 0;
        ArrayList arrayList = this.f44390j;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!this.f44388g.d(DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) this.f44390j.get(i10)).peer))) {
                    if (communityPeerRequest.date <= this.f44395o) {
                        return;
                    }
                    this.f44396p++;
                }
            }
        }
    }

    public final void b(g61 g61Var) {
        if (!this.f44393m && !this.f44394n && g61Var.U2.N0() + 10 > g61Var.V2.f30243x.size()) {
            d();
        }
    }

    public final void c(ArrayList arrayList) {
        boolean z4;
        ArrayList arrayList2 = this.f44390j;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            ArrayList arrayList3 = this.f44390j;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int size = arrayList3.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TL_communities.CommunityPeerRequest communityPeerRequest = (TL_communities.CommunityPeerRequest) arrayList3.get(i10);
                    long peerDialogId = DialogObject.getPeerDialogId(communityPeerRequest.peer);
                    a0.h hVar = this.f44388g;
                    if (hVar == null || !hVar.d(peerDialogId)) {
                        TLRPC.User user = MessagesController.getInstance(this.d).getUser(Long.valueOf(communityPeerRequest.requested_by));
                        boolean z10 = !communityPeerRequest.visible;
                        if (i10 < size - 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        int i11 = th.f.f44946a;
                        i51 J = i51.J(th.f.class);
                        J.G = new th.e(peerDialogId, user, z10);
                        J.H = this;
                        J.f25563j = !z4;
                        arrayList.add(J);
                    }
                }
            }
            if (!this.f44394n) {
                arrayList.add(i51.n(29));
            }
        }
    }

    public final void d() {
        if (!this.f44393m && !this.f44394n && ChatObject.canUserDoAdminAction(this.f44387f, 27)) {
            this.f44393m = true;
            MessagesController.getInstance(this.d).fetchCommunityPendingJoinRequests(this.e, this.f44391k, new l0(this, 1));
        }
    }

    public final void e() {
        int i10 = this.d;
        long currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        this.f44395o = currentTime;
        MessagesController.getMainSettings(i10).edit().putLong("community_requests_last_view_time_" + this.e, currentTime).apply();
        a();
    }

    public final void f(boolean z4, boolean z10) {
        int i10;
        String str;
        int i11;
        TextView textView;
        if (this.f44397q == null && this.f44398r == 0) {
            if (z10) {
                if (z4) {
                    i10 = R.string.CommunityAddAllChatsTitle;
                } else {
                    i10 = R.string.CommunityDeclineAllTitle;
                }
                String string = LocaleController.getString(i10);
                if (z4) {
                    str = "CommunityAddAllChatsMessage";
                } else {
                    str = "CommunityDeclineAllMessage";
                }
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, this.f44392l, new Object[0]));
                if (z4) {
                    i11 = R.string.Add;
                } else {
                    i11 = R.string.Decline;
                }
                d2 P = z4.P(this.f44384a, this.f44385b, string, replaceTags, LocaleController.getString(i11), new kv0(16, this, z4));
                P.show();
                if (!z4 && (textView = (TextView) P.d(-1)) != null) {
                    textView.setTextColor(j6.w0(null, j6.f20141q7, false));
                    return;
                }
                return;
            }
            pa paVar = this.f44389i;
            if (paVar != null) {
                paVar.run();
            }
            this.f44389i = null;
            d2 d2Var = new d2(this.f44384a, 3, this.f44385b);
            this.f44397q = d2Var;
            d2Var.setOnCancelListener(new wa(this, 3));
            this.f44397q.q(500L);
            this.f44398r = MessagesController.getInstance(this.d).resolveCommunityAllJoinPendingRequests(this.e, !z4, new l0(this, 0));
        }
    }

    public final void g(long j10, boolean z4) {
        int i10;
        int i11;
        this.f44388g.k(null, j10);
        this.f44392l--;
        a();
        n0 n0Var = this.h;
        if (n0Var != null) {
            n0Var.d();
        }
        if (z4) {
            i10 = R.string.CommunityRequestApprovedToast;
        } else {
            i10 = R.string.CommunityRequestDeclinedToast;
        }
        int i12 = this.d;
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i10, DialogObject.getShortName(i12, j10)));
        pa paVar = this.f44389i;
        if (paVar != null) {
            paVar.run();
        }
        this.f44389i = new pa(this, j10, z4, 6);
        Context context = this.f44384a;
        f6 f6Var = this.f44385b;
        hc hcVar = new hc(context, f6Var, false);
        TLObject userOrChat = MessagesController.getInstance(i12).getUserOrChat(j10);
        d9 d9Var = hcVar.f25386a;
        if (userOrChat != null) {
            d9Var.setCount(1);
            d9Var.b(0, userOrChat, UserConfig.selectedAccount);
            i11 = 1;
        } else {
            i11 = 0;
        }
        d9Var.setTranslationX(AndroidUtilities.dp(7.0f));
        d9Var.setScaleX(1.333f);
        d9Var.setScaleY(1.333f);
        d9Var.a(false);
        e90 e90Var = hcVar.f25387b;
        e90Var.setSingleLine(false);
        e90Var.setMaxLines(2);
        e90Var.setTextSize(1, 14.0f);
        e90Var.setText(replaceTags);
        if (e90Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int dp = AndroidUtilities.dp(74 - ((3 - i11) * 12));
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) e90Var.getLayoutParams()).rightMargin = dp;
            } else {
                ((ViewGroup.MarginLayoutParams) e90Var.getLayoutParams()).leftMargin = dp;
            }
        }
        if (LocaleController.isRTL) {
            d9Var.setTranslationX(AndroidUtilities.dp(32 - ((i11 - 1) * 12)));
        }
        gc gcVar = new gc(context, f6Var, true, true);
        gcVar.e(LocaleController.getString(R.string.UndoNoCaps));
        gcVar.f25097a = new m0(this, j10, 0);
        gcVar.f25098b = this.f44389i;
        hcVar.setButton(gcVar);
        this.f44386c.b(hcVar, 5000).j();
    }
}
