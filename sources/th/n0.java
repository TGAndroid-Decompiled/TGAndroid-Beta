package th;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.ViewGroup;
import android.widget.TextView;
import hg.y1;
import java.util.ArrayList;
import mh.pa;
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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.d9;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rv0;
import org.telegram.ui.Components.z4;
import qh.ua;
public final class n0 implements uh.d {
    public final Context f48163a;
    public final g6 f48164b;
    public final qc f48165c;
    public final int d;
    public final long f48166e;
    public final TLRPC.Chat f48167f;
    public m0 h;
    public pa f48169i;
    public String f48171k;
    public int f48172l;
    public boolean f48173m;
    public boolean f48174n;
    public long f48175o;
    public int f48176p;
    public d2 f48177q;
    public int f48178r;
    public final a0.h f48168g = new a0.h();
    public ArrayList f48170j = new ArrayList();

    public n0(Context context, g6 g6Var, qc qcVar, int i10, long j10) {
        this.f48163a = context;
        this.f48164b = g6Var;
        this.f48165c = qcVar;
        this.d = i10;
        this.f48166e = j10;
        this.f48167f = MessagesController.getInstance(i10).getChat(Long.valueOf(j10));
        this.f48175o = MessagesController.getMainSettings(i10).getLong(android.support.v4.media.a.n(j10, "community_requests_last_view_time_"), 0L);
    }

    public final void a() {
        TL_communities.CommunityPeerRequest communityPeerRequest;
        this.f48176p = 0;
        ArrayList arrayList = this.f48170j;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (!this.f48168g.d(DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) this.f48170j.get(i10)).peer))) {
                    if (communityPeerRequest.date <= this.f48175o) {
                        return;
                    }
                    this.f48176p++;
                }
            }
        }
    }

    public final void b(i61 i61Var) {
        if (!this.f48173m && !this.f48174n && i61Var.U2.N0() + 10 > i61Var.V2.f32960x.size()) {
            d();
        }
    }

    public final void c(ArrayList arrayList) {
        boolean z4;
        ArrayList arrayList2 = this.f48170j;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            ArrayList arrayList3 = this.f48170j;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int size = arrayList3.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TL_communities.CommunityPeerRequest communityPeerRequest = (TL_communities.CommunityPeerRequest) arrayList3.get(i10);
                    long peerDialogId = DialogObject.getPeerDialogId(communityPeerRequest.peer);
                    a0.h hVar = this.f48168g;
                    if (hVar == null || !hVar.d(peerDialogId)) {
                        TLRPC.User user = MessagesController.getInstance(this.d).getUser(Long.valueOf(communityPeerRequest.requested_by));
                        boolean z10 = !communityPeerRequest.visible;
                        if (i10 < size - 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        int i11 = uh.f.f48810a;
                        j51 J = j51.J(uh.f.class);
                        J.G = new uh.e(peerDialogId, user, z10);
                        J.H = this;
                        J.f28012j = !z4;
                        arrayList.add(J);
                    }
                }
            }
            if (!this.f48174n) {
                arrayList.add(j51.n(29));
            }
        }
    }

    public final void d() {
        if (!this.f48173m && !this.f48174n && ChatObject.canUserDoAdminAction(this.f48167f, 27)) {
            this.f48173m = true;
            MessagesController.getInstance(this.d).fetchCommunityPendingJoinRequests(this.f48166e, this.f48171k, new l0(this, 1));
        }
    }

    public final void e() {
        int i10 = this.d;
        long currentTime = ConnectionsManager.getInstance(i10).getCurrentTime();
        this.f48175o = currentTime;
        MessagesController.getMainSettings(i10).edit().putLong("community_requests_last_view_time_" + this.f48166e, currentTime).apply();
        a();
    }

    public final void f(boolean z4, boolean z10) {
        int i10;
        String str;
        int i11;
        TextView textView;
        if (this.f48177q == null && this.f48178r == 0) {
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
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString(str, this.f48172l, new Object[0]));
                if (z4) {
                    i11 = R.string.Add;
                } else {
                    i11 = R.string.Decline;
                }
                d2 P = z4.P(this.f48163a, this.f48164b, string, replaceTags, LocaleController.getString(i11), new rv0(16, this, z4));
                P.show();
                if (!z4 && (textView = (TextView) P.d(-1)) != null) {
                    textView.setTextColor(k6.w0(null, k6.f21895q7, false));
                    return;
                }
                return;
            }
            pa paVar = this.f48169i;
            if (paVar != null) {
                paVar.run();
            }
            this.f48169i = null;
            d2 d2Var = new d2(this.f48163a, 3, this.f48164b);
            this.f48177q = d2Var;
            d2Var.setOnCancelListener(new ua(this, 3));
            this.f48177q.q(500L);
            this.f48178r = MessagesController.getInstance(this.d).resolveCommunityAllJoinPendingRequests(this.f48166e, !z4, new l0(this, 0));
        }
    }

    public final void g(long j10, boolean z4) {
        int i10;
        int i11;
        this.f48168g.k(null, j10);
        this.f48172l--;
        a();
        m0 m0Var = this.h;
        if (m0Var != null) {
            m0Var.e();
        }
        if (z4) {
            i10 = R.string.CommunityRequestApprovedToast;
        } else {
            i10 = R.string.CommunityRequestDeclinedToast;
        }
        int i12 = this.d;
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i10, DialogObject.getShortName(i12, j10)));
        pa paVar = this.f48169i;
        if (paVar != null) {
            paVar.run();
        }
        this.f48169i = new pa(this, j10, z4, 6);
        Context context = this.f48163a;
        g6 g6Var = this.f48164b;
        hc hcVar = new hc(context, g6Var, false);
        TLObject userOrChat = MessagesController.getInstance(i12).getUserOrChat(j10);
        d9 d9Var = hcVar.f27447a;
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
        g90 g90Var = hcVar.f27448b;
        g90Var.setSingleLine(false);
        g90Var.setMaxLines(2);
        g90Var.setTextSize(1, 14.0f);
        g90Var.setText(replaceTags);
        if (g90Var.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int dp = AndroidUtilities.dp(74 - ((3 - i11) * 12));
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) g90Var.getLayoutParams()).rightMargin = dp;
            } else {
                ((ViewGroup.MarginLayoutParams) g90Var.getLayoutParams()).leftMargin = dp;
            }
        }
        if (LocaleController.isRTL) {
            d9Var.setTranslationX(AndroidUtilities.dp(32 - ((i11 - 1) * 12)));
        }
        gc gcVar = new gc(context, g6Var, true, true);
        gcVar.e(LocaleController.getString(R.string.UndoNoCaps));
        gcVar.f27161a = new y1(this, j10, 29);
        gcVar.f27162b = this.f48169i;
        hcVar.setButton(gcVar);
        this.f48165c.b(hcVar, 5000).j();
    }
}
