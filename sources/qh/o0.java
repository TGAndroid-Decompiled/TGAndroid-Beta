package qh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import jh.oa;
import nh.zb;
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
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.p90;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.y80;
public final class o0 implements rh.d {
    public final Context f46748a;
    public final c6 f46749b;
    public final tc f46750c;
    public final int d;
    public final long f46751e;
    public final TLRPC.Chat f46752f;
    public n0 h;
    public oa f46754i;
    public String f46756k;
    public int f46757l;
    public boolean f46758m;
    public boolean f46759n;
    public long f46760o;
    public int f46761p;
    public c2 f46762q;
    public int f46763r;
    public final a0.h f46753g = new a0.h();
    public ArrayList f46755j = new ArrayList();

    public o0(Context context, c6 c6Var, tc tcVar, int i10, long j10) {
        this.f46748a = context;
        this.f46749b = c6Var;
        this.f46750c = tcVar;
        this.d = i10;
        this.f46751e = j10;
        this.f46752f = MessagesController.getInstance(i10).getChat(Long.valueOf(j10));
        this.f46760o = MessagesController.getMainSettings(i10).getLong(a4.w.m(j10, "community_requests_last_view_time_"), 0L);
    }

    public final void a() {
        TL_communities.CommunityPeerRequest communityPeerRequest;
        this.f46761p = 0;
        ArrayList arrayList = this.f46755j;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!this.f46753g.d(DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) this.f46755j.get(i10)).peer))) {
                    if (communityPeerRequest.date <= this.f46760o) {
                        return;
                    }
                    this.f46761p++;
                }
            }
        }
    }

    public final void b(u51 u51Var) {
        if (!this.f46758m && !this.f46759n && u51Var.T2.N0() + 10 > u51Var.U2.f29942x.size()) {
            d();
        }
    }

    public final void c(ArrayList arrayList) {
        boolean z10;
        ArrayList arrayList2 = this.f46755j;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            ArrayList arrayList3 = this.f46755j;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int size = arrayList3.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TL_communities.CommunityPeerRequest communityPeerRequest = (TL_communities.CommunityPeerRequest) arrayList3.get(i10);
                    long peerDialogId = DialogObject.getPeerDialogId(communityPeerRequest.peer);
                    a0.h hVar = this.f46753g;
                    if (hVar == null || !hVar.d(peerDialogId)) {
                        TLRPC.User user = MessagesController.getInstance(this.d).getUser(Long.valueOf(communityPeerRequest.requested_by));
                        boolean z11 = !communityPeerRequest.visible;
                        if (i10 < size - 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i11 = rh.f.f47442a;
                        w41 J = w41.J(rh.f.class);
                        J.G = new rh.e(peerDialogId, user, z11);
                        J.H = this;
                        J.f34298j = !z10;
                        arrayList.add(J);
                    }
                }
            }
            if (!this.f46759n) {
                arrayList.add(w41.n(29));
            }
        }
    }

    public final void d() {
        if (!this.f46758m && !this.f46759n && ChatObject.canUserDoAdminAction(this.f46752f, 27)) {
            this.f46758m = true;
            MessagesController.getInstance(this.d).fetchCommunityPendingJoinRequests(this.f46751e, this.f46756k, new l0(this, 1));
        }
    }

    public final void e() {
        int i10 = this.d;
        long currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        this.f46760o = currentTime;
        MessagesController.getMainSettings(i10).edit().putLong("community_requests_last_view_time_" + this.f46751e, currentTime).apply();
        a();
    }

    public final void f(boolean z10, boolean z11) {
        int i10;
        String str;
        int i11;
        TextView textView;
        if (this.f46762q == null && this.f46763r == 0) {
            if (z11) {
                if (z10) {
                    i10 = R.string.CommunityAddAllChatsTitle;
                } else {
                    i10 = R.string.CommunityDeclineAllTitle;
                }
                String string = LocaleController.getString(i10);
                if (z10) {
                    str = "CommunityAddAllChatsMessage";
                } else {
                    str = "CommunityDeclineAllMessage";
                }
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, this.f46757l, new Object[0]));
                if (z10) {
                    i11 = R.string.Add;
                } else {
                    i11 = R.string.Decline;
                }
                c2 P = c5.P(this.f46748a, this.f46749b, string, replaceTags, LocaleController.getString(i11), new p90(16, this, z10));
                P.show();
                if (!z10 && (textView = (TextView) P.d(-1)) != null) {
                    textView.setTextColor(g6.w0(null, g6.f23295q7, false));
                    return;
                }
                return;
            }
            oa oaVar = this.f46754i;
            if (oaVar != null) {
                oaVar.run();
            }
            this.f46754i = null;
            c2 c2Var = new c2(this.f46748a, 3, this.f46749b);
            this.f46762q = c2Var;
            c2Var.setOnCancelListener(new zb(this, 3));
            this.f46762q.q(500L);
            this.f46763r = MessagesController.getInstance(this.d).resolveCommunityAllJoinPendingRequests(this.f46751e, !z10, new l0(this, 0));
        }
    }

    public final void g(long j10, boolean z10) {
        int i10;
        int i11;
        this.f46753g.k(null, j10);
        this.f46757l--;
        a();
        n0 n0Var = this.h;
        if (n0Var != null) {
            n0Var.k();
        }
        if (z10) {
            i10 = R.string.CommunityRequestApprovedToast;
        } else {
            i10 = R.string.CommunityRequestDeclinedToast;
        }
        int i12 = this.d;
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i10, DialogObject.getShortName(i12, j10)));
        oa oaVar = this.f46754i;
        if (oaVar != null) {
            oaVar.run();
        }
        this.f46754i = new oa(this, j10, z10, 6);
        Context context = this.f46748a;
        c6 c6Var = this.f46749b;
        lc lcVar = new lc(context, c6Var, false);
        TLObject userOrChat = MessagesController.getInstance(i12).getUserOrChat(j10);
        h9 h9Var = lcVar.f30284a;
        if (userOrChat != null) {
            h9Var.setCount(1);
            h9Var.b(0, userOrChat, UserConfig.selectedAccount);
            i11 = 1;
        } else {
            i11 = 0;
        }
        h9Var.setTranslationX(AndroidUtilities.dp(7.0f));
        h9Var.setScaleX(1.333f);
        h9Var.setScaleY(1.333f);
        h9Var.a(false);
        y80 y80Var = lcVar.f30285b;
        y80Var.setSingleLine(false);
        y80Var.setMaxLines(2);
        y80Var.setTextSize(1, 14.0f);
        y80Var.setText(replaceTags);
        if (y80Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int dp = AndroidUtilities.dp(74 - ((3 - i11) * 12));
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) y80Var.getLayoutParams()).rightMargin = dp;
            } else {
                ((ViewGroup.MarginLayoutParams) y80Var.getLayoutParams()).leftMargin = dp;
            }
        }
        if (LocaleController.isRTL) {
            h9Var.setTranslationX(AndroidUtilities.dp(32 - ((i11 - 1) * 12)));
        }
        kc kcVar = new kc(context, c6Var, true, true);
        kcVar.e(LocaleController.getString(R.string.UndoNoCaps));
        kcVar.f30007a = new m0(this, j10, 0);
        kcVar.f30008b = this.f46754i;
        lcVar.setButton(kcVar);
        this.f46750c.b(lcVar, 5000).j();
    }
}
