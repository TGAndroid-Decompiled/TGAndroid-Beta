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
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.nb0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.zw0;
import org.telegram.ui.xn;
import org.telegram.ui.yh;
import qh.c4;
import qh.l6;
public final class q extends p2 implements xd.b {
    public final xd.a f48218a;
    public long f48219b;
    public FrameLayout f48220c;
    public h61 d;
    public xg.f f48221e;
    public LinearLayout f48222f;
    public qh.d h;
    public qh.d f48223n;
    public zw0 f48224r;
    public TLRPC.ChatFull f48225s;
    public n0 v;

    public q(Bundle bundle) {
        super(bundle);
        this.f48218a = new xd.a(0, this, pr.h, 320L, false);
    }

    public static void U(q qVar, h51 h51Var) {
        Object obj = h51Var.G;
        if (obj instanceof uh.e) {
            uh.e eVar = (uh.e) obj;
            long j10 = eVar.f48843a;
            TLRPC.Chat chat = MessagesController.getInstance(qVar.currentAccount).getChat(Long.valueOf(-j10));
            TLRPC.User user = MessagesController.getInstance(qVar.currentAccount).getUser(Long.valueOf(j10));
            if (user != null) {
                qVar.presentFragment(xn.R9(user.f20992id));
            } else if (!ChatObject.isPublic(chat) && !ChatObject.isInChat(chat)) {
                new vh.b(qVar.getParentActivity(), chat, new l6(19, qVar, eVar)).show();
            } else {
                qVar.presentFragment(xn.R9(-chat.f20845id));
            }
        }
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        int i11;
        float f12 = 1.0f - f10;
        this.f48222f.setAlpha(f12);
        LinearLayout linearLayout = this.f48222f;
        int i12 = 8;
        if (f12 > 0.0f) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        this.f48224r.setAlpha(f10);
        zw0 zw0Var = this.f48224r;
        if (f10 > 0.0f) {
            i12 = 0;
        }
        zw0Var.setVisibility(i12);
    }

    public final void V(int i10) {
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + i10);
        this.f48222f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f) + i10);
        this.f48224r.setTranslationY((this.d.getPaddingTop() - this.d.getPaddingBottom()) / 2.0f);
        this.f48221e.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + i10);
    }

    @Override
    public final View createView(Context context) {
        boolean z4 = true;
        setHasOwnBackground(true);
        n0 n0Var = new n0(getParentActivity(), this.resourceProvider, qc.a0(this), this.currentAccount, this.f48219b);
        this.v = n0Var;
        n0Var.h = new org.telegram.ui.web.e0(this, 13);
        n0Var.d();
        this.v.e();
        yh.z(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new e(this, 2));
        this.actionBar.setTitle(LocaleController.getString(R.string.CommunityPendingRequests));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f48220c = frameLayout;
        int i10 = k6.f21607a7;
        frameLayout.setBackgroundColor(k6.w0(null, i10, false));
        h61 h61Var = new h61(this, new c4(this, 14), new o(this), new o(this));
        this.d = h61Var;
        h61Var.setClipToPadding(false);
        h61 h61Var2 = this.d;
        h61Var2.V2.f32651r = false;
        h61Var2.o1();
        this.d.j(new nb0(this, 16));
        this.actionBar.setAdaptiveBackground(this.d);
        this.f48220c.addView(this.d, c6.c(-1.0f, -1));
        ?? view = new View(context);
        this.f48221e = view;
        view.setupColorKey(i10);
        this.f48221e.setFadeZoneBottom(AndroidUtilities.dp(72.0f));
        this.f48221e.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        this.f48220c.addView(this.f48221e, c6.g());
        this.f48220c.addView(this.actionBar, c6.e(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f48222f = linearLayout;
        linearLayout.setOrientation(0);
        this.f48222f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        qh.d dVar = new qh.d(context, this.resourceProvider, true);
        this.f48223n = dVar;
        dVar.d();
        this.f48223n.setColor(i0.a.d(0.125f, getThemedColor(k6.f21661d6), getThemedColor(k6.G6)));
        this.f48223n.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        this.f48223n.e();
        this.f48223n.setOnClickListener(new View.OnClickListener(this) {
            public final q f48217b;

            {
                this.f48217b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f48217b.v.f(false, true);
                        return;
                    default:
                        this.f48217b.v.f(true, true);
                        return;
                }
            }
        });
        this.f48222f.addView(this.f48223n, c6.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        qh.d dVar2 = new qh.d(context, this.resourceProvider, true);
        this.h = dVar2;
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        this.h.e();
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final q f48217b;

            {
                this.f48217b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f48217b.v.f(false, true);
                        return;
                    default:
                        this.f48217b.v.f(true, true);
                        return;
                }
            }
        });
        this.f48222f.addView(this.h, c6.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f48220c.addView(this.f48222f, c6.e(-1, -2, 80));
        zw0 zw0Var = new zw0(getParentActivity(), null, 16, this.resourceProvider);
        this.f48224r = zw0Var;
        zw0Var.d.setText(LocaleController.getString(R.string.NoCommunityJoinRequests));
        this.f48224r.f34033e.setText(LocaleController.getString(R.string.NoCommunityJoinRequestsDescription));
        this.f48224r.setAnimateLayoutChange(true);
        this.f48224r.setVisibility(8);
        this.f48220c.addView(this.f48224r, c6.e(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.f48225s;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z4 = false;
        }
        this.f48218a.a(z4, false);
        V(0);
        FrameLayout frameLayout2 = this.f48220c;
        o oVar = new o(this);
        WeakHashMap weakHashMap = r0.j0.f46469a;
        r0.b0.j(frameLayout2, oVar);
        setBulletinDelegate(new hg.w(16));
        FrameLayout frameLayout3 = this.f48220c;
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
        this.f48219b = this.arguments.getLong("community_id", 0L);
        getMessagesController().getChat(Long.valueOf(this.f48219b));
        this.f48225s = getMessagesController().getChatFull(this.f48219b);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        n0 n0Var = this.v;
        pa paVar = n0Var.f48205i;
        if (paVar != null) {
            paVar.run();
        }
        n0Var.f48205i = null;
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
