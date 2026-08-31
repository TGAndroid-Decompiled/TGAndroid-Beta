package th;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import k7.c6;
import mh.pa;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.ax0;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.xn;
import org.telegram.ui.yh;
import qh.d4;
import qh.d6;
public final class q extends p2 implements xd.b {
    public final xd.a f48182a;
    public long f48183b;
    public FrameLayout f48184c;
    public i61 d;
    public xg.f f48185e;
    public LinearLayout f48186f;
    public qh.d h;
    public qh.d f48187n;
    public ax0 f48188r;
    public TLRPC.ChatFull f48189s;
    public n0 v;

    public q(Bundle bundle) {
        super(bundle);
        this.f48182a = new xd.a(0, this, pr.h, 320L, false);
    }

    public static void U(q qVar, j51 j51Var) {
        Object obj = j51Var.G;
        if (obj instanceof uh.e) {
            uh.e eVar = (uh.e) obj;
            long j10 = eVar.f48807a;
            TLRPC.Chat chat = MessagesController.getInstance(qVar.currentAccount).getChat(Long.valueOf(-j10));
            TLRPC.User user = MessagesController.getInstance(qVar.currentAccount).getUser(Long.valueOf(j10));
            if (user != null) {
                qVar.presentFragment(xn.R9(user.f20990id));
            } else if (!ChatObject.isPublic(chat) && !ChatObject.isInChat(chat)) {
                new vh.b(qVar.getParentActivity(), chat, new d6(20, qVar, eVar)).show();
            } else {
                qVar.presentFragment(xn.R9(-chat.f20843id));
            }
        }
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        int i11;
        float f12 = 1.0f - f10;
        this.f48186f.setAlpha(f12);
        LinearLayout linearLayout = this.f48186f;
        int i12 = 8;
        if (f12 > 0.0f) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        this.f48188r.setAlpha(f10);
        ax0 ax0Var = this.f48188r;
        if (f10 > 0.0f) {
            i12 = 0;
        }
        ax0Var.setVisibility(i12);
    }

    public final void V(int i10) {
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + i10);
        this.f48186f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f) + i10);
        this.f48188r.setTranslationY((this.d.getPaddingTop() - this.d.getPaddingBottom()) / 2.0f);
        this.f48185e.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + i10);
    }

    @Override
    public final View createView(Context context) {
        boolean z4 = true;
        setHasOwnBackground(true);
        n0 n0Var = new n0(getParentActivity(), this.resourceProvider, qc.a0(this), this.currentAccount, this.f48183b);
        this.v = n0Var;
        n0Var.h = new org.telegram.ui.web.e0(this, 13);
        n0Var.d();
        this.v.e();
        yh.z(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new e(this, 2));
        this.actionBar.setTitle(LocaleController.getString(R.string.CommunityPendingRequests));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f48184c = frameLayout;
        int i10 = k6.f21605a7;
        frameLayout.setBackgroundColor(k6.w0(null, i10, false));
        i61 i61Var = new i61(this, new d4(this, 14), new o(this), new o(this));
        this.d = i61Var;
        i61Var.setClipToPadding(false);
        i61 i61Var2 = this.d;
        i61Var2.V2.f32957r = false;
        i61Var2.p1();
        this.d.j(new nb0(this, 16));
        this.actionBar.setAdaptiveBackground(this.d);
        this.f48184c.addView(this.d, c6.c(-1.0f, -1));
        ?? view = new View(context);
        this.f48185e = view;
        view.setupColorKey(i10);
        this.f48185e.setFadeZoneBottom(AndroidUtilities.dp(72.0f));
        this.f48185e.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        this.f48184c.addView(this.f48185e, c6.g());
        this.f48184c.addView(this.actionBar, c6.e(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f48186f = linearLayout;
        linearLayout.setOrientation(0);
        this.f48186f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        qh.d dVar = new qh.d(context, this.resourceProvider, true);
        this.f48187n = dVar;
        dVar.d();
        this.f48187n.setColor(i0.a.d(0.125f, getThemedColor(k6.f21659d6), getThemedColor(k6.G6)));
        this.f48187n.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        this.f48187n.e();
        this.f48187n.setOnClickListener(new View.OnClickListener(this) {
            public final q f48181b;

            {
                this.f48181b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f48181b.v.f(false, true);
                        return;
                    default:
                        this.f48181b.v.f(true, true);
                        return;
                }
            }
        });
        this.f48186f.addView(this.f48187n, c6.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        qh.d dVar2 = new qh.d(context, this.resourceProvider, true);
        this.h = dVar2;
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        this.h.e();
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final q f48181b;

            {
                this.f48181b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f48181b.v.f(false, true);
                        return;
                    default:
                        this.f48181b.v.f(true, true);
                        return;
                }
            }
        });
        this.f48186f.addView(this.h, c6.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f48184c.addView(this.f48186f, c6.e(-1, -2, 80));
        ax0 ax0Var = new ax0(getParentActivity(), null, 16, this.resourceProvider);
        this.f48188r = ax0Var;
        ax0Var.d.setText(LocaleController.getString(R.string.NoCommunityJoinRequests));
        this.f48188r.f25364e.setText(LocaleController.getString(R.string.NoCommunityJoinRequestsDescription));
        this.f48188r.setAnimateLayoutChange(true);
        this.f48188r.setVisibility(8);
        this.f48184c.addView(this.f48188r, c6.e(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.f48189s;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z4 = false;
        }
        this.f48182a.a(z4, false);
        V(0);
        FrameLayout frameLayout2 = this.f48184c;
        o oVar = new o(this);
        WeakHashMap weakHashMap = r0.j0.f46438a;
        r0.b0.j(frameLayout2, oVar);
        setBulletinDelegate(new hg.w(16));
        FrameLayout frameLayout3 = this.f48184c;
        this.fragmentView = frameLayout3;
        return frameLayout3;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f48183b = this.arguments.getLong("community_id", 0L);
        getMessagesController().getChat(Long.valueOf(this.f48183b));
        this.f48189s = getMessagesController().getChatFull(this.f48183b);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        n0 n0Var = this.v;
        pa paVar = n0Var.f48169i;
        if (paVar != null) {
            paVar.run();
        }
        n0Var.f48169i = null;
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
