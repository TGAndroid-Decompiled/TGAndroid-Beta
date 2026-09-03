package sh;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import k7.b6;
import lh.pa;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.mb0;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.zw0;
import org.telegram.ui.ai;
import org.telegram.ui.zn;
import ph.d4;
import ph.e6;
public final class q extends p2 implements xd.b {
    public final xd.a f44463a;
    public long f44464b;
    public FrameLayout f44465c;
    public g61 d;
    public wg.f e;
    public LinearLayout f44466f;
    public ph.d h;
    public ph.d f44467n;
    public zw0 f44468r;
    public TLRPC.ChatFull f44469s;
    public n0 v;

    public q(Bundle bundle) {
        super(bundle);
        this.f44463a = new xd.a(0, this, mr.h, 320L, false);
    }

    public static void U(q qVar, i51 i51Var) {
        Object obj = i51Var.G;
        if (obj instanceof th.e) {
            th.e eVar = (th.e) obj;
            long j10 = eVar.f45005a;
            TLRPC.Chat chat = MessagesController.getInstance(qVar.currentAccount).getChat(Long.valueOf(-j10));
            TLRPC.User user = MessagesController.getInstance(qVar.currentAccount).getUser(Long.valueOf(j10));
            if (user != null) {
                qVar.presentFragment(zn.R9(user.f19306id));
            } else if (!ChatObject.isPublic(chat) && !ChatObject.isInChat(chat)) {
                new uh.b(qVar.getParentActivity(), chat, new e6(20, qVar, eVar)).show();
            } else {
                qVar.presentFragment(zn.R9(-chat.f19159id));
            }
        }
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        int i11;
        float f12 = 1.0f - f10;
        this.f44466f.setAlpha(f12);
        LinearLayout linearLayout = this.f44466f;
        int i12 = 8;
        if (f12 > 0.0f) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        this.f44468r.setAlpha(f10);
        zw0 zw0Var = this.f44468r;
        if (f10 > 0.0f) {
            i12 = 0;
        }
        zw0Var.setVisibility(i12);
    }

    public final void V(int i10) {
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + i10);
        this.f44466f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f) + i10);
        this.f44468r.setTranslationY((this.d.getPaddingTop() - this.d.getPaddingBottom()) / 2.0f);
        this.e.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + i10);
    }

    @Override
    public final View createView(Context context) {
        boolean z4 = true;
        setHasOwnBackground(true);
        n0 n0Var = new n0(getParentActivity(), this.resourceProvider, qc.a0(this), this.currentAccount, this.f44464b);
        this.v = n0Var;
        n0Var.h = new tp0(this, 14);
        n0Var.d();
        this.v.e();
        ai.z(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new e(this, 2));
        this.actionBar.setTitle(LocaleController.getString(R.string.CommunityPendingRequests));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f44465c = frameLayout;
        int i10 = j6.f19827a7;
        frameLayout.setBackgroundColor(j6.w0(null, i10, false));
        g61 g61Var = new g61(this, new d4(this, 14), new o(this), new o(this));
        this.d = g61Var;
        g61Var.setClipToPadding(false);
        g61 g61Var2 = this.d;
        g61Var2.V2.f30148r = false;
        g61Var2.o1();
        this.d.j(new mb0(this, 16));
        this.actionBar.setAdaptiveBackground(this.d);
        this.f44465c.addView(this.d, b6.c(-1.0f, -1));
        ?? view = new View(context);
        this.e = view;
        view.setupColorKey(i10);
        this.e.setFadeZoneBottom(AndroidUtilities.dp(72.0f));
        this.e.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        this.f44465c.addView(this.e, b6.g());
        this.f44465c.addView(this.actionBar, b6.e(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f44466f = linearLayout;
        linearLayout.setOrientation(0);
        this.f44466f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        ph.d dVar = new ph.d(context, this.resourceProvider, true);
        this.f44467n = dVar;
        dVar.d();
        this.f44467n.setColor(i0.a.d(0.125f, getThemedColor(j6.f19881d6), getThemedColor(j6.G6)));
        this.f44467n.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        this.f44467n.e();
        this.f44467n.setOnClickListener(new View.OnClickListener(this) {
            public final q f44462b;

            {
                this.f44462b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f44462b.v.f(false, true);
                        return;
                    default:
                        this.f44462b.v.f(true, true);
                        return;
                }
            }
        });
        this.f44466f.addView(this.f44467n, b6.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        ph.d dVar2 = new ph.d(context, this.resourceProvider, true);
        this.h = dVar2;
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        this.h.e();
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final q f44462b;

            {
                this.f44462b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f44462b.v.f(false, true);
                        return;
                    default:
                        this.f44462b.v.f(true, true);
                        return;
                }
            }
        });
        this.f44466f.addView(this.h, b6.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f44465c.addView(this.f44466f, b6.e(-1, -2, 80));
        zw0 zw0Var = new zw0(getParentActivity(), null, 16, this.resourceProvider);
        this.f44468r = zw0Var;
        zw0Var.d.setText(LocaleController.getString(R.string.NoCommunityJoinRequests));
        this.f44468r.e.setText(LocaleController.getString(R.string.NoCommunityJoinRequestsDescription));
        this.f44468r.setAnimateLayoutChange(true);
        this.f44468r.setVisibility(8);
        this.f44465c.addView(this.f44468r, b6.e(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.f44469s;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z4 = false;
        }
        this.f44463a.a(z4, false);
        V(0);
        FrameLayout frameLayout2 = this.f44465c;
        o oVar = new o(this);
        WeakHashMap weakHashMap = r0.j0.f43142a;
        r0.b0.j(frameLayout2, oVar);
        setBulletinDelegate(new gg.w(16));
        FrameLayout frameLayout3 = this.f44465c;
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
        this.f44464b = this.arguments.getLong("community_id", 0L);
        getMessagesController().getChat(Long.valueOf(this.f44464b));
        this.f44469s = getMessagesController().getChatFull(this.f44464b);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        n0 n0Var = this.v;
        pa paVar = n0Var.f44450i;
        if (paVar != null) {
            paVar.run();
        }
        n0Var.f44450i = null;
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
