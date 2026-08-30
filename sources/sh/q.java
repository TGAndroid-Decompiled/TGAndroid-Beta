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
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.zw0;
import org.telegram.ui.xn;
import org.telegram.ui.yh;
import ph.d4;
import ph.f6;
public final class q extends p2 implements xd.b {
    public final xd.a f44401a;
    public long f44402b;
    public FrameLayout f44403c;
    public g61 d;
    public wg.f e;
    public LinearLayout f44404f;
    public ph.d h;
    public ph.d f44405n;
    public zw0 f44406r;
    public TLRPC.ChatFull f44407s;
    public o0 v;

    public q(Bundle bundle) {
        super(bundle);
        this.f44401a = new xd.a(0, this, nr.h, 320L, false);
    }

    public static void U(q qVar, i51 i51Var) {
        Object obj = i51Var.G;
        if (obj instanceof th.e) {
            th.e eVar = (th.e) obj;
            long j10 = eVar.f44943a;
            TLRPC.Chat chat = MessagesController.getInstance(qVar.currentAccount).getChat(Long.valueOf(-j10));
            TLRPC.User user = MessagesController.getInstance(qVar.currentAccount).getUser(Long.valueOf(j10));
            if (user != null) {
                qVar.presentFragment(xn.R9(user.f19331id));
            } else if (!ChatObject.isPublic(chat) && !ChatObject.isInChat(chat)) {
                new uh.b(qVar.getParentActivity(), chat, new f6(18, qVar, eVar)).show();
            } else {
                qVar.presentFragment(xn.R9(-chat.f19184id));
            }
        }
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        int i11;
        float f12 = 1.0f - f10;
        this.f44404f.setAlpha(f12);
        LinearLayout linearLayout = this.f44404f;
        int i12 = 8;
        if (f12 > 0.0f) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        linearLayout.setVisibility(i11);
        this.f44406r.setAlpha(f10);
        zw0 zw0Var = this.f44406r;
        if (f10 > 0.0f) {
            i12 = 0;
        }
        zw0Var.setVisibility(i12);
    }

    public final void V(int i10) {
        this.d.setPadding(0, 0, 0, AndroidUtilities.dp(60.0f) + i10);
        this.f44404f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f) + i10);
        this.f44406r.setTranslationY((this.d.getPaddingTop() - this.d.getPaddingBottom()) / 2.0f);
        this.e.setFadeZoneBottom(AndroidUtilities.dp(72.0f) + i10);
    }

    @Override
    public final View createView(Context context) {
        boolean z4 = true;
        setHasOwnBackground(true);
        o0 o0Var = new o0(getParentActivity(), this.resourceProvider, qc.a0(this), this.currentAccount, this.f44402b);
        this.v = o0Var;
        o0Var.h = new o2.o(this, 22);
        o0Var.d();
        this.v.e();
        yh.z(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setActionBarMenuOnItemClick(new e(this, 2));
        this.actionBar.setTitle(LocaleController.getString(R.string.CommunityPendingRequests));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f44403c = frameLayout;
        int i10 = j6.f19852a7;
        frameLayout.setBackgroundColor(j6.w0(null, i10, false));
        g61 g61Var = new g61(this, new d4(this, 14), new o(this), new o(this));
        this.d = g61Var;
        g61Var.setClipToPadding(false);
        g61 g61Var2 = this.d;
        g61Var2.V2.f30240r = false;
        g61Var2.p1();
        this.d.j(new lb0(this, 16));
        this.actionBar.setAdaptiveBackground(this.d);
        this.f44403c.addView(this.d, b6.c(-1.0f, -1));
        ?? view = new View(context);
        this.e = view;
        view.setupColorKey(i10);
        this.e.setFadeZoneBottom(AndroidUtilities.dp(72.0f));
        this.e.setFadeHeightBottom(AndroidUtilities.dp(24.0f));
        this.f44403c.addView(this.e, b6.g());
        this.f44403c.addView(this.actionBar, b6.e(-1, -2, 48));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f44404f = linearLayout;
        linearLayout.setOrientation(0);
        this.f44404f.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), AndroidUtilities.dp(12.0f));
        ph.d dVar = new ph.d(context, this.resourceProvider, true);
        this.f44405n = dVar;
        dVar.d();
        this.f44405n.setColor(i0.a.d(0.125f, getThemedColor(j6.f19906d6), getThemedColor(j6.G6)));
        this.f44405n.setText(LocaleController.getString(R.string.CommunityPendingRequestDeclineAll));
        this.f44405n.e();
        this.f44405n.setOnClickListener(new View.OnClickListener(this) {
            public final q f44400b;

            {
                this.f44400b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f44400b.v.f(false, true);
                        return;
                    default:
                        this.f44400b.v.f(true, true);
                        return;
                }
            }
        });
        this.f44404f.addView(this.f44405n, b6.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        ph.d dVar2 = new ph.d(context, this.resourceProvider, true);
        this.h = dVar2;
        dVar2.setText(LocaleController.getString(R.string.CommunityPendingRequestAddAll));
        this.h.e();
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final q f44400b;

            {
                this.f44400b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        this.f44400b.v.f(false, true);
                        return;
                    default:
                        this.f44400b.v.f(true, true);
                        return;
                }
            }
        });
        this.f44404f.addView(this.h, b6.p(0, 48, 1.0f, 0, 4, 0, 4, 0));
        this.f44403c.addView(this.f44404f, b6.e(-1, -2, 80));
        zw0 zw0Var = new zw0(getParentActivity(), null, 16, this.resourceProvider);
        this.f44406r = zw0Var;
        zw0Var.d.setText(LocaleController.getString(R.string.NoCommunityJoinRequests));
        this.f44406r.e.setText(LocaleController.getString(R.string.NoCommunityJoinRequestsDescription));
        this.f44406r.setAnimateLayoutChange(true);
        this.f44406r.setVisibility(8);
        this.f44403c.addView(this.f44406r, b6.e(-2, -2, 17));
        TLRPC.ChatFull chatFull = this.f44407s;
        if (chatFull != null && chatFull.requests_pending != 0) {
            z4 = false;
        }
        this.f44401a.a(z4, false);
        V(0);
        FrameLayout frameLayout2 = this.f44403c;
        o oVar = new o(this);
        WeakHashMap weakHashMap = r0.j0.f43118a;
        r0.b0.j(frameLayout2, oVar);
        setBulletinDelegate(new gg.w(16));
        FrameLayout frameLayout3 = this.f44403c;
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
        this.f44402b = this.arguments.getLong("community_id", 0L);
        getMessagesController().getChat(Long.valueOf(this.f44402b));
        this.f44407s = getMessagesController().getChatFull(this.f44402b);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        o0 o0Var = this.v;
        pa paVar = o0Var.f44389i;
        if (paVar != null) {
            paVar.run();
        }
        o0Var.f44389i = null;
    }

    @Override
    public final void z(float f10, int i10) {
    }
}
